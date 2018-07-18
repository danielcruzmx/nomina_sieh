package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.fsn.springmodules.rules.drools54.AbstractStatefulRulesService;

import gob.shcp.sireh.data.jdbc.QueryTncalculoNominaQnaDAO;
import gob.shcp.sireh.data.jdbc.TcAtributoPuestoDAO;
import gob.shcp.sireh.data.jdbc.TcGrupoPagoDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnCalculoNominaQnaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.TnRegControlDAO;
import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConceptosNominaExtraDAO;
import gob.shcp.sireh.data.jdbc.support.QueryTcIsptDAO;

import gob.shcp.sireh.domain.jdbc.ConceptoPago;
import gob.shcp.sireh.domain.jdbc.ConceptosPagNomExtra;
import gob.shcp.sireh.domain.jdbc.Pago;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuestoPK;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;
import gob.shcp.sireh.domain.jdbc.TcGrupoPago;
import gob.shcp.sireh.domain.jdbc.TcIspt;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPension;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnCalculoNominaQna;
import gob.shcp.sireh.domain.jdbc.TnCalculoNominaQnaPK;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.domain.jdbc.TnRegControl;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TcGrupoPagoDTO;
import gob.shcp.sireh.model.TnCalculoNominaQnaDTO;
import gob.shcp.sireh.model.TnConceptoPagadoBeneficiarioDTO;
import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.TdPensionDTO;
import gob.shcp.sireh.model.nomina.calculo.AsociaPlazaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptosPagNomExtraDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.utils.CalculoIspt;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

public class CalculoNominaExtraBS extends AbstractStatefulRulesService implements CalculoNominaExtraService {

    private static final String AP_FIN = "2099-01-01";
    private static final String dateFormat = "dd/MM/yyyy";
    private long lastUpdated;

    private static final String idTpNominaExtraordinaria = "EX";
    private static final String idTpNominaOrdinaria = "OR";

    /**
     * Metodo encargado de calcular datos de nómina con base en el id de la plaza.
     * @author Jorge.
     * @param idPlaza String
     * @return pagoDTO PagoDTO
     */
    public List<PagoDTO> getByPlaza(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByPlaza(asociaPlazaEmpleadoDTO.getIdPlaza() != null ? asociaPlazaEmpleadoDTO.getIdPlaza().toString() : null);

        if (pago == null) {
            return null;
        }

        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setConceptos(new ArrayList());
        pagoDTO.setPensiones(new ArrayList());

        List<PagoDTO> pagoDTOList = new ArrayList<PagoDTO>();
        pagoDTO.setRfcEmpleado(asociaPlazaEmpleadoDTO.getRfcEmpleado());

        // Insercion de objeto pagoDTO en reglas de drools
        super.getRulesService().insertStatefullFact(pagoDTO);

        pagoDTOList.add(pagoDTO);

        return pagoDTOList;
    }

    public void getQuincenaCaptura(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        TnRegControl qnaCaptura = getQuincenaCaptura();
        asociaPlazaEmpleadoDTO.setInicioQuincenaCaptura(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.getRcQnaCaptura(), 'I'), Calendar.DATE));
        asociaPlazaEmpleadoDTO.setFinQuincenaCaptura(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.getRcQnaCaptura(), 'F'), Calendar.DATE));
        asociaPlazaEmpleadoDTO.setFinSiguienteQuincenaCaptura(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(SirehUtils.addQuincena(qnaCaptura.getRcQnaCaptura(), 1), 'F'), Calendar.DATE));
    }

    /**
     * Metodo encargado de calcular y agregar un empleado a la nomina extraordinaria
     * @author Gualberto G.
     * @param asociaPlazaEmpleadoDTO
     * @return PagoDTO
     */
    public PagoDTO updateCalculaAgregaEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        if (asociaPlazaEmpleadoDTO.isCheckRfcEmpleado()) {
            this.saveOrUpdateEmpleado(asociaPlazaEmpleadoDTO);
        }

        if (asociaPlazaEmpleadoDTO.getIdTipoPago() != null && asociaPlazaEmpleadoDTO.getIdTipoPago().equals("CH")) {
            modificarCuentaBancaria(asociaPlazaEmpleadoDTO);
        }

        // Se obtienen los pagos a partir de la plaza seleccionada
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByPlaza(asociaPlazaEmpleadoDTO.getIdPlaza() != null ? asociaPlazaEmpleadoDTO.getIdPlaza().toString() : null);

        if (pago == null) {
            pago = new Pago();
            pago.setIdPlaza(asociaPlazaEmpleadoDTO.getIdPlaza());
        }

        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setIdTipoNomina(asociaPlazaEmpleadoDTO.getIdTipoNomina() != null && asociaPlazaEmpleadoDTO.getIdTipoNomina().equals(idTpNominaExtraordinaria) ? idTpNominaOrdinaria : asociaPlazaEmpleadoDTO.getIdTipoNomina());
        
        // Se completa el objeto pago con los datos del empleado de la pantalla
        pagoDTO.setRfcEmpleado(asociaPlazaEmpleadoDTO.getRfcEmpleado());
        pagoDTO.setNombreEmpleado(asociaPlazaEmpleadoDTO.getNombreEmpleado());
        pagoDTO.setPrimerApellido(asociaPlazaEmpleadoDTO.getPrimerApellido());
        pagoDTO.setSegundoApellido(asociaPlazaEmpleadoDTO.getSegundoApellido());
        pagoDTO.setCurpEmpleado(asociaPlazaEmpleadoDTO.getCurpEmpleado());
        pagoDTO.setNssEmpleado(asociaPlazaEmpleadoDTO.getImssIssste());
        pagoDTO.setDescGrupoPago(getGrupoPago(asociaPlazaEmpleadoDTO.getIdGrupoPago()).getDescGrupoPago().trim());
        pagoDTO.setIdQna(asociaPlazaEmpleadoDTO.getIdNomina());
        pagoDTO.setStatus("N");

        // Se obtienen los conceptos a partir del RFC
        List<ConceptoPago> listaConceptos = super.persistence().get(CustomCalculoDAO.class).getConceptosByRfc(asociaPlazaEmpleadoDTO.getRfcEmpleado(), super.security().getDimensions(), super.security().getOperationYear());

        // Se obtienen las pensiones a partir del RFC
        List<TdPension> listaPensiones = super.persistence().get(CustomCalculoDAO.class).getPensionesByRfc(asociaPlazaEmpleadoDTO.getRfcEmpleado(), super.security().getDimensions(), super.security().getOperationYear());

        // Se asignan los conceptos y las pensiones obtenidas al objeto pagoDTO
        pagoDTO.setConceptos(listaConceptos != null && !listaConceptos.isEmpty() ? super.transformation().map(listaConceptos, ConceptoPagoDTO.class) : new ArrayList<ConceptoPagoDTO>());
        pagoDTO.setPensiones(listaPensiones != null && !listaPensiones.isEmpty() ? super.transformation().map(listaPensiones, TdPensionDTO.class) : new ArrayList<TdPensionDTO>());

        // Se ejecutan las reglas de drools
        CalculoNomina(pagoDTO);

        // Se eliminan los conceptos de control
        List<TnConceptoPagadoDTO> listaConceptosPagadosSinControl = new ArrayList<TnConceptoPagadoDTO>();
        TnConceptoPagadoDTO tnConceptoPagadoDTO = null;
        
        if (pagoDTO != null && pagoDTO.getConceptosPagados() != null && !pagoDTO.getConceptosPagados().isEmpty()) {
            for (int i = 0; i < pagoDTO.getConceptosPagados().size(); i++) {
                tnConceptoPagadoDTO = pagoDTO.getConceptosPagados().get(i);
                if (tnConceptoPagadoDTO != null && tnConceptoPagadoDTO.getIdTipoCpto() != null && !tnConceptoPagadoDTO.getIdTipoCpto().equals("C")) {
                    listaConceptosPagadosSinControl.add(tnConceptoPagadoDTO);
                }
            }
            pagoDTO.setConceptosPagados(listaConceptosPagadosSinControl);
        }

        // Se eliminan los conceptos para las nominas de tipo AC
        if (asociaPlazaEmpleadoDTO.getIdTipoNomina() != null && 
            asociaPlazaEmpleadoDTO.getIdTipoNomina().equals("AC")) {
            pagoDTO.setConceptosPagados(new ArrayList<TnConceptoPagadoDTO>());
        }

        // Se inserta en la tabla de paso tn_calculo_nomina_qna
        List<PagoDTO> listaPagos = new ArrayList<PagoDTO>();
        listaPagos.add(pagoDTO);

        // Arma la clabe y guarda TipoPago y Clabe
        TdEmpleado tdEmpleadoBase = this.persistence().get(TdEmpleadoDAO.class).getById(asociaPlazaEmpleadoDTO.getRfcEmpleado());
        if (asociaPlazaEmpleadoDTO.getIdTipoPago() != null && asociaPlazaEmpleadoDTO.getIdTipoPago().equals("CH")) {
            asociaPlazaEmpleadoDTO.setClabeEmpleado2("000000000000000");
        }
        tdEmpleadoBase.setClabeEmpleado(asociaPlazaEmpleadoDTO.getClabeEmpleado1() + asociaPlazaEmpleadoDTO.getClabeEmpleado2());
        tdEmpleadoBase.setIdTipoPago(asociaPlazaEmpleadoDTO.getIdTipoPago());

        //this.persistence().get(TdEmpleadoDAO.class).save(tdEmpleadoBase);

        saveCalculoNominaQna(listaPagos, asociaPlazaEmpleadoDTO.getIdNomina(), super.identity().get().getUserID(), asociaPlazaEmpleadoDTO.getFechaInicial(), asociaPlazaEmpleadoDTO.getFechaFinal(), asociaPlazaEmpleadoDTO.getCnqFolio());
        return pagoDTO;
    }

    /**
     * Define si se ha modificado el tipo de pago o cuenta bancaria, de ser así, inserta un concepto en la tabla tn_movto_concepto_pago
     * @author Gualberto G.
     * @param asociaPlazaEmpleadoDTO
     */
    private void modificarCuentaBancaria(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        boolean isTipoDePagoEquivalente = true;
        TdEmpleado tdEmpleadoBase = this.persistence().get(TdEmpleadoDAO.class).getById(asociaPlazaEmpleadoDTO.getRfcEmpleado());
        TdEmpleado tdEmpleadoAsociacion = this.transformation().map(asociaPlazaEmpleadoDTO, TdEmpleado.class);
        isTipoDePagoEquivalente = tdEmpleadoBase.isTipoPagoEquivalente(tdEmpleadoAsociacion);

        if (!isTipoDePagoEquivalente) {
            TnMovtoConceptoPago tnMovtoConceptoPago = new TnMovtoConceptoPago();
            Integer quincenaCaptura = getQuincenaCaptura().getRcQnaCaptura().intValue();
            tnMovtoConceptoPago.setIdSitCaptura("V");
            tnMovtoConceptoPago.setMcpRfc(asociaPlazaEmpleadoDTO.getRfcEmpleado());
            tnMovtoConceptoPago.setIdTercero("H");
            tnMovtoConceptoPago.setIdTipoCpto("U");
            tnMovtoConceptoPago.setIdConcepto("NC");
            tnMovtoConceptoPago.setMcpRefCaptura("NOMINA EXTRA");
            tnMovtoConceptoPago.setMcpQnaCaptura(quincenaCaptura);
            tnMovtoConceptoPago.setMcpFecIncidencia(new Date());
            tnMovtoConceptoPago.setMcpHorasDias(Integer.valueOf(0));
            tnMovtoConceptoPago.setMcpMonto(Double.valueOf(0));
            tnMovtoConceptoPago.setMcpPorcentaje(Float.valueOf(0));
            tnMovtoConceptoPago.setMcpQnaIni(quincenaCaptura);
            tnMovtoConceptoPago.setMcpQnaFin(quincenaCaptura);
            tnMovtoConceptoPago.setMcpQnaAplicadas(Integer.valueOf(0));
            tnMovtoConceptoPago.setMcpQnaADescontar(Integer.valueOf(0));
            tnMovtoConceptoPago.setMcpQnaCancelo(Integer.valueOf(0));
            tnMovtoConceptoPago.setMcpMontoAdeudo(Double.valueOf(0));
            tnMovtoConceptoPago.setMcpQnasAdeudo(Integer.valueOf(0));
            tnMovtoConceptoPago.setUsuario(super.security().getUserName());
            tnMovtoConceptoPago.setFecModifico(new Date());

            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(tnMovtoConceptoPago);
        }
    }
    
    /**
     * Metodo encargado de ejecutar la insercion en la tabla de paso.
     * @author Gualberto G.
     * @param listaPagos List<PagoDTO>
     * @param idQna int
     * @param username String
     */
    private void saveCalculoNominaQna(List<PagoDTO> listaPagos, int idQna, String username, java.util.Date cnqIniPago, java.util.Date cnqFinPago, java.lang.Integer cnqFolio) {
        List<HashMap<String, Object>> listaMapasPago = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> mapaPago;
        StringBuffer cadenaConceptosPago;

        for (PagoDTO pagoDTO: listaPagos) {
            pagoDTO.calculaLiquido();
            mapaPago = new HashMap<String, Object>();
            mapaPago.put("idPlaza", pagoDTO.getIdPlaza());
            mapaPago.put("idQna", idQna);
            mapaPago.put("rfc", pagoDTO.getRfcEmpleado());
            mapaPago.put("cnqIniPago", cnqIniPago);
            mapaPago.put("cnqFinPago", cnqFinPago);
            mapaPago.put("liquido", pagoDTO.getLiquido());
            mapaPago.put("folio", cnqFolio != null ? cnqFolio : 0);

            cadenaConceptosPago = new StringBuffer();

            for (TnConceptoPagadoDTO conceptoPagado: pagoDTO.getConceptosPagados()) {
                cadenaConceptosPago.append(conceptoPagado.getCpNumConcepto()).append(";").append(conceptoPagado.getIdTipoCpto()).append(";").append(conceptoPagado.getIdCptoPago()).append(";").append(conceptoPagado.getCpMonto()).append("|");
            }
            if (cadenaConceptosPago.length() > 0) {
                cadenaConceptosPago.delete(cadenaConceptosPago.length() - 1, cadenaConceptosPago.length());
            }

            mapaPago.put("cadenaConceptosPago", cadenaConceptosPago.toString());
            listaMapasPago.add(mapaPago);
        }
        super.persistence().get(CustomCalculoDAO.class).saveCalculoNominaQna(listaMapasPago, username);
    }

    private TcGrupoPagoDTO getGrupoPago(String idGrupoPago) {
        TcGrupoPago tcGrupoPago = super.persistence().get(TcGrupoPagoDAO.class).getById(idGrupoPago);
        return super.transformation().map(tcGrupoPago, TcGrupoPagoDTO.class);
    }

    /**
     * Metodo encargado de guardar en empleado en TD_EMPLEADO
     * @author Gualberto G.
     * @param asociaPlazaEmpleadoDTO
     */
    public void saveOrUpdateEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        TdEmpleado empleado = null;
        Integer idMovimiento = null;
        Integer quincenaCaptura = getQuincenaCaptura().getRcQnaCaptura().intValue();

        TdEmpleado tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(asociaPlazaEmpleadoDTO.getRfcEmpleado());
        if (tdEmpleado != null && tdEmpleado.getRfcEmpleado() != null) {
            throw new ServiceException("EL empleado con RFC " + asociaPlazaEmpleadoDTO.getRfcEmpleado() + " existe en el sistema.\nFavor de seleccionar Alta por reingreso");
        }

        // SE GUARDA EL EMPLEADO EN TABLA TD_EMPLEADO
        empleado = new TdEmpleado();
        idMovimiento = super.configuration().getNumber("movCode", "ALTA_POR_NUEVO_INGRESO").intValue();
        TdPlaza plaza = this.persistence().get(TdPlazaDAO.class).getById(asociaPlazaEmpleadoDTO.getIdPlaza());
        
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, idMovimiento, quincenaCaptura, super.identity().get().getUserID(), new Date(), getAtributoPuesto(plaza.getIdPuestoPre()));

        // Fecha infinita

        super.transformation().map(asociaPlazaEmpleadoDTO, empleado);
        empleado.setRfcEmpleado(asociaPlazaEmpleadoDTO.getRfcEmpleadoNuevo());
        empleado.setRfcUnico(asociaPlazaEmpleadoDTO.getRfcEmpleadoNuevo());
        // Se arma la clabe bancaria
         if(asociaPlazaEmpleadoDTO.getIdTipoPago() != null && asociaPlazaEmpleadoDTO.getIdTipoPago().equals( "CH")){
             asociaPlazaEmpleadoDTO.setClabeEmpleado2("000000000000000");
         }
         empleado.setClabeEmpleado(asociaPlazaEmpleadoDTO.getClabeEmpleado1() + asociaPlazaEmpleadoDTO.getClabeEmpleado2());
        // Obtener fecha con base en el curp ingresado
        String anioNacimiento = "19" + asociaPlazaEmpleadoDTO.getCurpEmpleado().substring(4, 6);
        String mesNacimiento = asociaPlazaEmpleadoDTO.getCurpEmpleado().substring(6, 8);
        String diaNacimiento = asociaPlazaEmpleadoDTO.getCurpEmpleado().substring(8, 10);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(Integer.parseInt(anioNacimiento), Integer.parseInt(mesNacimiento) - 1, Integer.parseInt(diaNacimiento));
        empleado.setFecNacimiento(fechaNacimiento.getTime());

        // Obtencion genero
        String generoCurp = asociaPlazaEmpleadoDTO.getCurpEmpleado().substring(10, 11);
        empleado.setIdGenero(generoCurp.equals("H") ? "M" : "F");

        empleado.setIdUltimoMovto(idMovimiento);
        empleado.setCasoMuestra("S");
        empleado.setFecUltimoMovto(asociaPlazaEmpleadoDTO.getFechaInicial());

        empleado.setEmpQnaCaptura(quincenaCaptura);
        empleado.setUsuario(super.identity().get().getUserID());
        empleado.setFecModifico(new Date());

        asociaPlazaEmpleadoDTO.setRfcEmpleado(asociaPlazaEmpleadoDTO.getRfcEmpleadoNuevo());

        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
        super.persistence().get(TdEmpleadoDAO.class).save(empleado);
    }

    /**
     * Metodo encargado de obtener AtributoPuesto.
     * @author Oscar S.
     * @return tcAtributoPuesto TcAtributoPuesto
     */
    public TcAtributoPuesto getAtributoPuesto(String puesto) {
        TcAtributoPuesto tcAtributoPuesto = null;
        TcAtributoPuestoPK tcAtributoPuestoPK = new TcAtributoPuestoPK();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date ap_fin = new Date();
        
        try {
            ap_fin = formatoDelTexto.parse(getApFin());
            tcAtributoPuestoPK.setApFin(ap_fin);
            tcAtributoPuestoPK.setIdAtributoPuesto(puesto);
            tcAtributoPuesto = super.persistence().get(TcAtributoPuestoDAO.class).getById(tcAtributoPuestoPK);
        } catch (Exception e) {
            super.throwServiceException(e.getCause(), "sireh.error.atributopuesto");
        }
        return tcAtributoPuesto;
    }

    public String getApFin() {
        return super.configuration().getString("AP_FIN");
    }

    public TnRegControl getQuincenaCaptura() {
        TnRegControl tnRegControl = null;
        
        if (lastUpdated == 0 || (System.currentTimeMillis() - super.configuration().getNumber("UPDATE_QNA").longValue()) > lastUpdated) {
            List<TnRegControl> listaRegControl = super.persistence().get(TnRegControlDAO.class).findByRcVigente(super.configuration().getString("pensiones", "RC_VIGENTE_S"));
            if (listaRegControl != null && !listaRegControl.isEmpty()) {
                tnRegControl = listaRegControl.get(0);
            }
            lastUpdated = System.currentTimeMillis();
        }
        return tnRegControl;
    }
    
    private void CalculoNomina(PagoDTO pagoDTO) {
        CalculoIspt ispt = new CalculoIspt();
        List<TcIspt> listIspt = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("80");
        List<TcIspt> listBtos = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("REVA");
        ispt.setTablaBrutos(listBtos);
        ispt.setTablaIspt(listIspt);

        super.getRulesService().insertStatefullFact(pagoDTO);
        super.getRulesService().executeStatefulRules();
    }

    private boolean calculaObjeto(PagoDTO p) {
        //p.setConceptos(new CapConceptoService().RFCfind(p.getRfcEmpleado()));
        CalculoIspt ispt = new CalculoIspt();

        List<TcIspt> listIspt = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("80");
        List<TcIspt> listBtos = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("REVA");

        ispt.setTablaBrutos(listBtos);
        ispt.setTablaIspt(listIspt);

        p.setConceptosPagados(new ArrayList<TnConceptoPagadoDTO>());

        super.getRulesService().insertStatefullFact(p);
        super.getRulesService().executeStatefulRules();
        return true;
    }

    /**
     * Metodo encargado de eliminar registros de la tabla TN_CALCULO_NOMINA_QNA
     * @author Gualberto G.
     * @param ids
     * @param idNomina
     */
    public void deleteEmpleados(String[] ids, java.lang.Integer idNomina) {
        final TnCalculoNominaQnaDAO tnCalculoNominaQnaDAO = super.persistence().get(TnCalculoNominaQnaDAO.class);
        SimpleDateFormat df = new SimpleDateFormat(dateFormat);
        TnCalculoNominaQnaPK tnCalculoNominaQnaPK = null;
        String[] arrego = null;
        
        for (String id: ids) {
            tnCalculoNominaQnaPK = new TnCalculoNominaQnaPK();
            tnCalculoNominaQnaPK.setIdNomina(idNomina);
            arrego = id.split("\\|");
            tnCalculoNominaQnaPK.setCnqRfc(arrego != null && arrego.length >= 1 && arrego[0] != null ? arrego[0] : null);
            tnCalculoNominaQnaPK.setIdPlaza(arrego != null && arrego.length >= 2 && arrego[1] != null ? Integer.valueOf(arrego[1]) : null);
            
            try {
                tnCalculoNominaQnaPK.setCnqIniPago(arrego != null && arrego.length >= 3 && arrego[2] != null ? df.parse(arrego[2]) : null);
            } catch (ParseException e) {
            }
            
            TnCalculoNominaQna tnCalculoNominaQna = tnCalculoNominaQnaDAO.getById(tnCalculoNominaQnaPK);
            tnCalculoNominaQnaDAO.delete(tnCalculoNominaQna);
            //super.persistence().get(CustomCalculoDAO.class).deleteCalculoNominaQna(arrego != null && arrego.length >= 3 && arrego[2] != null ? arrego[2] : null, tnCalculoNominaQnaPK.getCnqRfc(), tnCalculoNominaQnaPK.getIdNomina(), tnCalculoNominaQnaPK.getIdPlaza());
            //    customCalculoDAO.deleteCalculoNominaQna(arrego != null && arrego.length >= 3 && arrego[2] != null ? arrego[2] : null, tnCalculoNominaQnaPK.getCnqRfc(), tnCalculoNominaQnaPK.getIdNomina(), tnCalculoNominaQnaPK.getIdPlaza());
        }
    }

    /**
     * Metodo encargado de obtener los datos de nómina con base en el id de la plaza.
     * @author  Martin Cano.
     * @param idPlaza String
     * @return pagoDTO PagoDTO
     */
    public PagoDTO getByPlaza(String idPlaza) {
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByPlaza(idPlaza);
        if (pago == null) {
            return null;
        }
        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setConceptos(new ArrayList<ConceptoPagoDTO>());
        pagoDTO.setPensiones(new ArrayList<TdPensionDTO>());
        return pagoDTO;
    }

    /**
     * Metodo encargado de obtener los datos de nómina con base en el id de la plaza.
     * @author  Martin Cano.
     * @param idPlaza String
     * @return pagoDTO PagoDTO
     */
    public PagoDTO getByPlaza(String idPlaza, String rfcEmpleado) {
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByPlaza(idPlaza, rfcEmpleado);
        if (pago == null) {
            return null;
        }
        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setConceptos(new ArrayList<ConceptoPagoDTO>());
        pagoDTO.setPensiones(new ArrayList<TdPensionDTO>());
        return pagoDTO;
    }

    //********* R E F A C T O R
    public TnCalculoNominaQnaDTO getByIdCalculoNominaQna(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO) {
        TnCalculoNominaQnaDTO retorno;
        TnCalculoNominaQna tnCalculoNominaQna = super.transformation().map(tnCalculoNominaQnaDTO, TnCalculoNominaQna.class);
        TnCalculoNominaQnaPK tnCalculoNominaQnaPK = new TnCalculoNominaQnaPK(tnCalculoNominaQna.getCnqIniPago(), tnCalculoNominaQna.getCnqRfc(), tnCalculoNominaQna.getIdNomina(), tnCalculoNominaQna.getIdPlaza());

        try {
            tnCalculoNominaQna = super.persistence().get(TnCalculoNominaQnaDAO.class).getById(tnCalculoNominaQnaPK);
        } catch (Exception e) {
            retorno = null;
        }
        retorno = super.transformation().map(tnCalculoNominaQna, TnCalculoNominaQnaDTO.class);
        return retorno;
    }

    public ConceptosPagNomExtraDTO getConceptosNominaExtra(String rfcEmpleado) {
        ConceptosPagNomExtra conceptosPagNomExtra = super.persistence().get(CustomConceptosNominaExtraDAO.class).getConceptosNominaExtra(rfcEmpleado);
        if (conceptosPagNomExtra == null) {
            return null;
        }

        ConceptosPagNomExtraDTO conceptosPagNomExtraDTO = super.transformation().map(conceptosPagNomExtra, ConceptosPagNomExtraDTO.class);
        conceptosPagNomExtraDTO.setConceptosPagados(new ArrayList<TnConceptoPagadoBeneficiarioDTO>());
        conceptosPagNomExtraDTO.setConceptosPago(new ArrayList<ConceptoPagoDTO>());
        return conceptosPagNomExtraDTO;
    }

    public ConceptosPagNomExtraDTO getDatosPlazaByGpoPagoRfc(Integer idPlaza, String rfcEmpleado) {
        ConceptosPagNomExtra conceptosPagNomExtra = super.persistence().get(CustomConceptosNominaExtraDAO.class).getDatosPlazaByGpoPagoRfc(idPlaza, rfcEmpleado);
        if (conceptosPagNomExtra == null) {
            return null;
        }

        ConceptosPagNomExtraDTO conceptosPagNomExtraDTO = super.transformation().map(conceptosPagNomExtra, ConceptosPagNomExtraDTO.class);
        conceptosPagNomExtraDTO.setConceptosPagados(new ArrayList<TnConceptoPagadoBeneficiarioDTO>());
        conceptosPagNomExtraDTO.setConceptosPago(new ArrayList<ConceptoPagoDTO>());
        return conceptosPagNomExtraDTO;
    }

    public List<String> getConceptosNominaExtraOrd(String rfcEmpleado) {
        List<String> lConceptos = super.persistence().get(CustomConceptosNominaExtraDAO.class).getConceptosNominaExtraOrd(rfcEmpleado);
        return lConceptos;
    }

    public void saveConceptosNominaExtraOrdinaria(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO) {
        TnCalculoNominaQna tnCalculoNominaQna = super.transformation().map(tnCalculoNominaQnaDTO, TnCalculoNominaQna.class);
        super.persistence().get(TnCalculoNominaQnaDAO.class).save(tnCalculoNominaQna);
    }

    public NominaDTO getNominaDTO(Integer idNomina) {
        TnNomina tnNomina = super.persistence().get(TnNominaDAO.class).getById(idNomina);
        NominaDTO nominaDTO = super.transformation().map(tnNomina, NominaDTO.class);
        return nominaDTO;
    }

    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @param idQna int
     * @author Oscar S.
     */
    public void updateStatusProcesandoNominaQna(int idQna) {
        super.persistence().get(CustomCalculoDAO.class).updateStatusProcesandoNominaQna(idQna);
    }

    public List<TcConceptoPagoDTO> getConceptosNominaExtraOrdByTipoConcepto(String tipoConcepto) {
        List<TcConceptoPago> lConceptos = super.persistence().get(CustomConceptosNominaExtraDAO.class).getConceptosNominaExtraOrdByTipoConcepto(tipoConcepto);
        return super.transformation().map(lConceptos, TcConceptoPagoDTO.class);
    }

    public List<TcConceptoPagoDTO> getConceptosNominaExtraSARFOV() {
        List<TcConceptoPago> lConceptos = super.persistence().get(CustomConceptosNominaExtraDAO.class).getConceptosNominaExtraSARFOV();
        return super.transformation().map(lConceptos, TcConceptoPagoDTO.class);
    }

    public void processNominaAguinaldo(Integer idNomina) {
        super.persistence().get(CustomCalculoDAO.class).generarNominaAguinaldo(idNomina);
    }

    /**
     * Servicio que invoca al stored para generar las nominas de perseverancia y lealtad e insertar los candidatos
     */
    public void processPMCandidatosPerseverancia() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat(dateFormat);
        TnRegControl qnaCaptura = getQuincenaCaptura();
        String fecIni = formatoFecha.format(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.getRcQnaCaptura(), 'I'));
        String fecFin = formatoFecha.format(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.getRcQnaCaptura(), 'F'));
        Integer qnaProceso = qnaCaptura.getRcQnaCaptura();
        super.persistence().get(CustomCalculoDAO.class).generarNominaPerseverancia(fecIni, fecFin, qnaProceso);
    }
    
    public List<TnCalculoNominaQnaDTO> getNominasByIdNomina(Integer idNomina){
        List<TnCalculoNominaQna> listaTnCalculoNominaQna = super.persistence().get(QueryTncalculoNominaQnaDAO.class).findByidNomina(idNomina);
        List<TnCalculoNominaQnaDTO> listaTnCalculoNominaQnaDTO = super.transformation().map(listaTnCalculoNominaQna, TnCalculoNominaQnaDTO.class);
        return listaTnCalculoNominaQnaDTO;
    }
}
