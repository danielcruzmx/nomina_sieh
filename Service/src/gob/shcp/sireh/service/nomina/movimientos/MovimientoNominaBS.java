package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.data.jdbc.QueryTcTabuladorDAO;
import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdPensionDAO;
import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TcAtributoPuestoDAO;
import gob.shcp.sireh.data.jdbc.TcConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TcMovsPersonalDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPensionDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;

import gob.shcp.sireh.data.jdbc.support.CustomTdHistoricoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnHistoricoPagoDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTdEmpleadoPlazaPuesto;
import gob.shcp.sireh.domain.jdbc.CustomTdPlazaEmpleadoMovtos;
import gob.shcp.sireh.domain.jdbc.CustomTnHistPago;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtoConceptoPagoSitCaptura;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuestoPK;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoPK;
import gob.shcp.sireh.domain.jdbc.TcMovsPersonal;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPension;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;
import gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import gob.shcp.sireh.model.TcMovsPersonalDTO;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CambioMovimientosPersonalDTO;
import gob.shcp.sireh.model.nomina.CancelaPagoDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.incidencias.GestionIncidenciasPersonalDTO;
import gob.shcp.sireh.model.nomina.incidencias.IncidenciaPersonalDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesMovtoNominaDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;


public class MovimientoNominaBS extends AbstractSirehService implements MovimientoNominaService{

    /**
     * Default constructor
     */
    public MovimientoNominaBS() {
    }

    /**
     * Metodo encargado de consultar las pensiones de un empleado por su rfc
     * @param rfcEmpleado String
     * @return CambioEmpleadoPensionesDTO
     */
    public CambioEmpleadoPensionesDTO getEmpleadoPensiones(String rfcEmpleado) {

        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        CambioEmpleadoPensionesDTO cambioPensionesDTO = super.transformation().map(empleado, CambioEmpleadoPensionesDTO.class);

        return cambioPensionesDTO;
    }
    
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        TdEmpleadoDTO empleadoDTO = super.transformation().map(empleado, TdEmpleadoDTO.class);
        return empleadoDTO;
    }
    
    /**
     * Metodo encargado de consultar los datos de una pension por su idPension y rfc
     * @param idPension String
     * @param rfcEmpleado String
     * @return CustomTdPensionDTO
     */
    public CustomTdPensionDTO getPension(Integer idPension, String rfcEmpleado) {
        // Si idPension = 0, es una nueva pension 
        TdPension pension = null;
        if (idPension == 0) {
            List<TdPension> listaPensionesMax = super.persistence().get(QueryTdPensionDAO.class).getMaxPension(rfcEmpleado);
            if (listaPensionesMax != null && !listaPensionesMax.isEmpty()) {
                pension = listaPensionesMax.get(0);
                pension.setNumPension(pension.getNumPension() + 1);
                pension.setQnaAplicaAdeudo(Integer.valueOf(0));
                pension.setUltQnaProcesaAdeudo(0);
                pension.setCptosPorcentaje(super.configuration().getString("pensiones", "VALORES_INICIALES_CPTOS_PORCENTAJE"));
            }
        } else {
            pension = super.persistence().get(TdPensionDAO.class).getById(idPension);
        }

        pension.setRfcPension(rfcEmpleado);
        CustomTdPensionDTO customTdPensionDTO = super.transformation().map(pension, CustomTdPensionDTO.class);

        // DETERMINA SI SE TRATA DE UN PORCENTAJE O UNA CUOTA FIJA
        if (customTdPensionDTO.getPorcentajePension() != null && 
            customTdPensionDTO.getMontoPension() != null && 
            customTdPensionDTO.getMontoPension() == 0 && 
            customTdPensionDTO.getPorcentajePension() != 0) {
            customTdPensionDTO.setCuotaPorcentaje( super.configuration().getString("pensiones", "RADIO_BUTTON_VALUE_PORCENTAJE"));
            customTdPensionDTO.setMontoPension(customTdPensionDTO.getPorcentajePension().doubleValue());
        } else {
            customTdPensionDTO.setCuotaPorcentaje(super.configuration().getString("pensiones", "RADIO_BUTTON_VALUE_CUOTA_FIJA"));
        }
        
        // LLENADO DE LAS LISTAS DE CONCEPTOS PORCENTAJE
        if (customTdPensionDTO.getCptosPorcentaje() != null && 
            customTdPensionDTO.getCptosPorcentaje().length() > 0) {
            String ptosPorcentaje = customTdPensionDTO.getCptosPorcentaje();

            String ptosPorcentajeArray[] = ptosPorcentaje.split("\\|");
            List<String> ptosPorcentajePercepciones = new ArrayList<String>();
            List<String> ptosPorcentajeDeducciones = new ArrayList<String>();

            for (int i = 0; i < ptosPorcentajeArray.length; i++) {
                if (ptosPorcentajeArray[i].startsWith(super.configuration().getString("pensiones", "ID_TIPO_CONCEPTO_PERCEPCION"))) {
                    ptosPorcentajePercepciones.add(ptosPorcentajeArray[i]);
                } else if (ptosPorcentajeArray[i].startsWith(super.configuration().getString("pensiones", "ID_TIPO_CONCEPTO_DEDUCCION"))) {
                    ptosPorcentajeDeducciones.add(ptosPorcentajeArray[i]);
                }
            }
            customTdPensionDTO.setIdsConceptosPorcentajePercepciones(ptosPorcentajePercepciones);
            customTdPensionDTO.setIdsConceptosPorcentajeDeducciones(ptosPorcentajeDeducciones);
        }

        return customTdPensionDTO;
    }

    /**
     * Metodo encargado de actualizar o agregar una pension
     * @param customPensionDTO CustomTdPensionDTO
     */
    public void savePension(CustomTdPensionDTO customPensionDTO) {
        QnaCapturaDTO qnaCapturaDTO = super.getQuincenaCaptura();
        if(customPensionDTO.getCuotaPorcentaje() != null && customPensionDTO.getCuotaPorcentaje().equals(super.configuration().getString("pensiones", "RADIO_BUTTON_VALUE_PORCENTAJE")) ){
            customPensionDTO.setPorcentajePension( customPensionDTO.getMontoPension().floatValue() );
            customPensionDTO.setMontoPension( Double.valueOf(0) );
        }else{
            customPensionDTO.setPorcentajePension( Float.valueOf(0) );
        }
        
        customPensionDTO.setBeneficiariaPension(customPensionDTO.getBeneficiariaPension().toUpperCase());
        customPensionDTO.setStatusPension(super.configuration().getString("pensiones", "STATUS_PENSION_VIGENTE"));
        StringBuffer cptosPorcentaje = new StringBuffer();
        if(customPensionDTO.getIdsConceptosPorcentajePercepciones() != null && !customPensionDTO.getIdsConceptosPorcentajePercepciones().isEmpty()){
            for(String concepto : customPensionDTO.getIdsConceptosPorcentajePercepciones()){
                cptosPorcentaje.append(concepto).append(super.configuration().getString("pensiones", "SEPARADOR_PIPE"));
            }
        }
        if(customPensionDTO.getIdsConceptosPorcentajeDeducciones() != null && !customPensionDTO.getIdsConceptosPorcentajeDeducciones().isEmpty()){
                for(String concepto : customPensionDTO.getIdsConceptosPorcentajeDeducciones()){
                    cptosPorcentaje.append(concepto).append(super.configuration().getString("pensiones", "SEPARADOR_PIPE"));
            }
        }        
        
        customPensionDTO.setCptosPorcentaje(cptosPorcentaje != null ? cptosPorcentaje.toString() : null);
        TdPension pension = super.transformation().map(customPensionDTO, TdPension.class);
        
        pension.setQnaCapturaPension(qnaCapturaDTO.intValue() );
        pension.setQnaCapturaAdeudo(qnaCapturaDTO.intValue());
        
        if (pension.getIdPension() != null) {
            // Pension existente
            TdPension pensionBase = super.persistence().get(TdPensionDAO.class).getById(pension.getIdPension().intValue());
            if (!pensionBase.isEquivalente(pension)) {
                List<TdPension> listaPensionesMax = super.persistence().get(QueryTdPensionDAO.class).getMaxPension(pension.getRfcPension());
                if (listaPensionesMax != null && !listaPensionesMax.isEmpty()) {
                    pension.setNumPension(listaPensionesMax.get(0).getNumPension() + 1);
                }

                pensionBase.setStatusPension(super.configuration().getString("pensiones", "STATUS_PENSION_CAMBIO"));
                super.persistence().get(TdPensionDAO.class).save(pensionBase);

                pension.setIdPension(null);
                pension.setStatusPension(super.configuration().getString("pensiones", "STATUS_PENSION_VIGENTE"));

                super.persistence().get(TdPensionDAO.class).save(pension);
            }
        } else {
            super.persistence().get(TdPensionDAO.class).save(pension);
        }


    }

    /**
     * Metodo encargado de eliminar las pensiones seleccionadas
     * @param ids Integer[]
     */
    public void deletePensiones(Integer[] ids) {
        final TdPensionDAO pensionDAO = super.persistence().get(TdPensionDAO.class);
        
        for(Integer id : ids){
            TdPension pension = pensionDAO.getById( id );
            pension.setStatusPension(super.configuration().getString("pensiones", "STATUS_PENSION_BAJA"));
            pensionDAO.save(pension);
        }
        
    }
    
    public CancelaPagoDTO getEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO){
        CustomTnHistPago customTnHistPago = super.persistence().get(CustomTnHistoricoPagoDAO.class).findById(new TnHistoricoPagoPK(cancelaPagoDTO.getHpDifFolio(), cancelaPagoDTO.getHpFolio()));
        if(customTnHistPago != null){
            CancelaPagoDTO cancelaPagoDTODB = super.transformation().map(customTnHistPago, CancelaPagoDTO.class);
            return cancelaPagoDTODB;
        } else return null;
    }
    
    public void corrigeEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO){
        Integer qnaCaptura = getQuincenaCaptura().intValue();
        super.persistence().get(CustomTnHistoricoPagoDAO.class).corrigeEmpleadoCancelaPagoById(cancelaPagoDTO.getHpFolio(), cancelaPagoDTO.getHpDifFolio(), cancelaPagoDTO.getIdMotivoCancela(), cancelaPagoDTO.getCpcReferencia(), cancelaPagoDTO.getCpcQnaAplica(), qnaCaptura, null, null, super.identity().get().getUserID());
        
    }
    
   

    public void updateHistoricoPagoById(CancelaPagoDTO cancelaPagoDTO) {
    }
    public CancelaPagoDTO getEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO){
        CustomTnHistPago customTnHistPago = super.persistence().get(CustomTnHistoricoPagoDAO.class).findEmplBloqueoDeposById(new TnHistoricoPagoPK(cancelaPagoDTO.getHpDifFolio(), cancelaPagoDTO.getHpFolio()));
        if(customTnHistPago != null){
            CancelaPagoDTO cancelaPagoDTODTODB = super.transformation().map(customTnHistPago, CancelaPagoDTO.class);
            return cancelaPagoDTODTODB;
        } else{
            return null;
        }
    }
        
    public void corrigeEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO){
        super.persistence().get(CustomTnHistoricoPagoDAO.class).corrigeEmpleadoBloqueoDepositoById(cancelaPagoDTO.getHpFolio(), cancelaPagoDTO.getHpDifFolio(), cancelaPagoDTO.getHpClabe(), cancelaPagoDTO.getHpDepositoSN());
    }
    

    /**
     * Metodo encargado de consultar los datos de la plaza seleccionada
     * @param idPlaza Integer
     * @param idMovsPersonal Integer
     * @return CambioMovimientosPersonalDTO
     */
    public CambioMovimientosPersonalDTO getPlazaEmpleadosMovtosPersonal(Integer idPlaza, Integer idMovsPersonal) {
        List<CustomTdPlazaEmpleadoMovtos> listaTdPlazaEmpleadoMovtos = super.persistence().get(QueryTdPlazaDAO.class).findPlazasEmpleadosMovtosPersonal(idPlaza);
        CustomTdPlazaEmpleadoMovtos customTdPlazaEmpleadoMovtos = null;
        if(listaTdPlazaEmpleadoMovtos != null && !listaTdPlazaEmpleadoMovtos.isEmpty() && listaTdPlazaEmpleadoMovtos.get(0) != null){
            customTdPlazaEmpleadoMovtos = listaTdPlazaEmpleadoMovtos.get(0);
        }
        CambioMovimientosPersonalDTO cambioMovimientosPersonalDTO = super.transformation().map(customTdPlazaEmpleadoMovtos, CambioMovimientosPersonalDTO.class);
        cambioMovimientosPersonalDTO.setClabeEmpleado1(cambioMovimientosPersonalDTO.getClabeEmpleado() != null && cambioMovimientosPersonalDTO.getClabeEmpleado().length() == 18 ? cambioMovimientosPersonalDTO.getClabeEmpleado().substring(0, 3) : "");
        cambioMovimientosPersonalDTO.setClabeEmpleado2(cambioMovimientosPersonalDTO.getClabeEmpleado() != null && cambioMovimientosPersonalDTO.getClabeEmpleado().length() == 18 ? cambioMovimientosPersonalDTO.getClabeEmpleado().substring(3) : "");
        cambioMovimientosPersonalDTO.setIdBanco(cambioMovimientosPersonalDTO.getClabeEmpleado() != null && cambioMovimientosPersonalDTO.getClabeEmpleado().length() == 18 ? cambioMovimientosPersonalDTO.getClabeEmpleado().substring(0, 3) : "0");
        
        TcMovsPersonal movsPersonal = super.persistence().get(TcMovsPersonalDAO.class).getById(idMovsPersonal);
        cambioMovimientosPersonalDTO.setAlta(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setAltaPorReingreso(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setPromocion(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setBaja(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setLicencia(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setPreventiva(Boolean.FALSE);
        cambioMovimientosPersonalDTO.setProrroga(Boolean.FALSE);
        if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getDescMovsPersonal() != null &&  movsPersonal.getMpTipoMovMenu().equals("ALTAS") && movsPersonal.getDescMovsPersonal().equals("Alta por nuevo ingreso") ){
            cambioMovimientosPersonalDTO.setAlta(Boolean.TRUE);
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Altas y reingresos - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
        }else if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getMpTipoMovMenu().equals("ALTAS") && !movsPersonal.getDescMovsPersonal().equals("Alta por nuevo ingreso")){
            cambioMovimientosPersonalDTO.setAltaPorReingreso(Boolean.TRUE);
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Altas y reingresos - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
        }else if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getMpTipoMovMenu().equals("PROMOCIONES")){
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Promociones - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
            cambioMovimientosPersonalDTO.setPromocion(Boolean.TRUE);
        }else if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getMpTipoMovMenu().equals("BAJAS")){
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Bajas - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
            cambioMovimientosPersonalDTO.setBaja(Boolean.TRUE);
        }else if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getMpTipoMovMenu().equals("LICENCIAS") ){
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Licencias y preventivas - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
            if(movsPersonal.getDescMovsPersonal() != null && movsPersonal.getDescMovsPersonal().equals("Preventiva de pago") ){
                cambioMovimientosPersonalDTO.setPreventiva(Boolean.TRUE);
            }else{
                cambioMovimientosPersonalDTO.setLicencia(Boolean.TRUE);    
            }
        }else if(movsPersonal.getMpGrupoPago() != null && movsPersonal.getMpTipoMovMenu().equals("PRORROGAS") ){
            cambioMovimientosPersonalDTO.setHeader("Movimientos nómina - Movimientos de personal - Prórrogas - " + movsPersonal.getDescMovsPersonal().substring(0,1) + movsPersonal.getDescMovsPersonal().toLowerCase().substring(1) );
            cambioMovimientosPersonalDTO.setProrroga(Boolean.TRUE);
        }
        QnaCapturaDTO qnaCaptura = getQuincenaCaptura();
        cambioMovimientosPersonalDTO.setInicioQuincenaCaptura(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.intValue(), 'I'), Calendar.DATE));
        cambioMovimientosPersonalDTO.setFinQuincenaCaptura(DateUtils.truncate(SirehUtils.getQuincenaCapturaAsDate(qnaCaptura.intValue(), 'F'), Calendar.DATE));
        
        super.transformation().map(movsPersonal, cambioMovimientosPersonalDTO);
        return cambioMovimientosPersonalDTO;
    }
    
    /**
     * Metodo encargado de consultar los datos del movimiento por su id en la tabla TC_MOVS_PERSONAL
     * @param id Integer
     * @return TcMovsPersonalDTO
     */
    public TcMovsPersonalDTO getMovimientoPersonalById(Integer id) {
        TcMovsPersonal movsPersonal = super.persistence().get(TcMovsPersonalDAO.class).getById(id);
        TcMovsPersonalDTO tcMovsPersonalDTO = super.transformation().map(movsPersonal, TcMovsPersonalDTO.class);
        return tcMovsPersonalDTO;
    }

    /**
     * Metodo que se encarga de actualizar el movimiento de personal seleccionado en pantalla
     * @param cambioMovimientosPersonalDTO CambioMovimientosPersonalDTO
     */
    public void updateMovimientosPersonal(CambioMovimientosPersonalDTO cambioMovimientosPersonalDTO) {
        
        // TRAIGO LOS DATOS DE EMPLEADO (para cuando no es un alta nuevo ingreso)
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioMovimientosPersonalDTO.getRfcEmpleado());
        QnaCapturaDTO qnaCaptura = getQuincenaCaptura();

        if (empleado == null && cambioMovimientosPersonalDTO.getAlta() != null && cambioMovimientosPersonalDTO.getAlta()) {
            empleado = new TdEmpleado();
        }
        super.transformation().map(cambioMovimientosPersonalDTO, empleado);
        
        TdPlaza plazaPromocion = cambioMovimientosPersonalDTO.getPromocion() ? this.persistence().get(TdPlazaDAO.class).getById(cambioMovimientosPersonalDTO.getIdPlazaPromo()) : null;
        
        TdPlaza plaza = this.persistence().get(TdPlazaDAO.class).getById(cambioMovimientosPersonalDTO.getIdPlaza());


        // se obtiene el usuario 
        String usuario = super.identity().get().getUserID();

        // Fecha infinita
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        if (cambioMovimientosPersonalDTO.isCheckFechaTermino()) {
            Date fechaInfinita = new Date();
            try {
                fechaInfinita = formatoDelTexto.parse(getApFin());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            cambioMovimientosPersonalDTO.setFechaFinal(fechaInfinita);
        }

        // INICIA UPDATE EN PLAZA PARA TODOS LOS MOVIMIENTOS

         plaza.setIdZonaDistNom(cambioMovimientosPersonalDTO.getIdZonaDistNom());
         plaza.setPlazaImpHono(cambioMovimientosPersonalDTO.getPlazaImpHono());
         plaza.setIdMovtoPersona(cambioMovimientosPersonalDTO.getIdMovsPersonal());
         plaza.setPlazaUltimoMovto(cambioMovimientosPersonalDTO.getFechaInicial());
         
        if (cambioMovimientosPersonalDTO.getPromocion()) {
            // SI SE TRATA DE UNA PROMOCION LA PLAZA ACTUAL DEJA DE TENER LOS DATOS DEL EMPLEADO
            plaza.setIdSitPlaza(cambioMovimientosPersonalDTO.getIdSitPlaNva());
            plaza.setPlazaRfc(null);
            plaza.setPlazaIniLic(cambioMovimientosPersonalDTO.getFechaInicial());
            plaza.setPlazaFinLic(cambioMovimientosPersonalDTO.getFechaInicial());
            plaza.setIdZonaDistNom(cambioMovimientosPersonalDTO.getIdZonaDistNom());
            // LA PLAZA PROMOCION SE ACTUALIZA CON LOS DATOS DEL EMPLEADO
            plazaPromocion.setPlazaRfc(cambioMovimientosPersonalDTO.getRfcEmpleado());
            plazaPromocion.setIdSitPlaza("O");
            plazaPromocion.setIdMovtoPersona(cambioMovimientosPersonalDTO.getIdMovsPersonal());
            plazaPromocion.setPlazaUltimoMovto(cambioMovimientosPersonalDTO.getFechaInicial());
            plazaPromocion.setPlazaQnaCaptura(qnaCaptura.intValue());
            plazaPromocion.setIdZonaDistNom(cambioMovimientosPersonalDTO.getIdZonaDistNomPromo());
        } else {
            // PARA CUANDO NO ES PROMOCION SE SIGUE LOGICA DESCRITA EL EL DOCUMENTO EXCEL tablas_por_movimiento_personal.xls
            plaza.setPlazaRfc((cambioMovimientosPersonalDTO.getIdSitPlaNva() != null && cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("C")) || 
                              cambioMovimientosPersonalDTO.getPromocion() ? null : cambioMovimientosPersonalDTO.getRfcEmpleado());
            plaza.setIdSitPlaza(cambioMovimientosPersonalDTO.getIdSitPlaNva());
            plaza.setPlazaIniLic(cambioMovimientosPersonalDTO.getIdSitPlaNva() != null && (cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("C") || 
                                  cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("P") || cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("L")) ? 
                                 cambioMovimientosPersonalDTO.getFechaInicial() : 
                                 plaza.getPlazaIniLic());
            plaza.setPlazaFinLic(cambioMovimientosPersonalDTO.getIdSitPlaNva() != null && (cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("C") || 
                                  cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("P") || cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("L")) ? 
                                 cambioMovimientosPersonalDTO.getFechaFinal() : plaza.getPlazaFinLic());
        }
        plaza.setPlazaQnaCaptura(qnaCaptura.intValue());
        plaza.setFecModifico(new Date());
        plaza.setUsuario(usuario);  



        // se completan los datos de EMPLEADO
        if(cambioMovimientosPersonalDTO.getAlta()){
            empleado.setRfcEmpleado(cambioMovimientosPersonalDTO.getRfcEmpleado());
            empleado.setRfcUnico(cambioMovimientosPersonalDTO.getRfcEmpleado());
            
            // Obtener fecha con base en el curp ingresado
            String anioNacimiento = "19" + cambioMovimientosPersonalDTO.getCurpEmpleado().substring(4, 6);
            String mesNacimiento = cambioMovimientosPersonalDTO.getCurpEmpleado().substring(6, 8);
            String diaNacimiento = cambioMovimientosPersonalDTO.getCurpEmpleado().substring(8, 10);
            
            Calendar fechaNacimiento = Calendar.getInstance();
            fechaNacimiento.set(Integer.parseInt(anioNacimiento), Integer.parseInt(mesNacimiento) - 1, Integer.parseInt(diaNacimiento));
            
            empleado.setFecNacimiento(fechaNacimiento.getTime());
            
            // Obtencion genero
            String generoCurp = cambioMovimientosPersonalDTO.getCurpEmpleado().substring(10, 11);
            empleado.setIdGenero(generoCurp.equals("H") ? "M" : "F" );

            // Arma la clabe
            if (empleado.getIdTipoPago() != null) {
                if (empleado.getIdTipoPago().equals("CH")) {
                    empleado.setClabeEmpleado("000000000000000000");
                } else if (cambioMovimientosPersonalDTO.getClabeEmpleado1() != null && cambioMovimientosPersonalDTO.getClabeEmpleado2() != null) {
                    empleado.setClabeEmpleado(cambioMovimientosPersonalDTO.getClabeEmpleado1() + cambioMovimientosPersonalDTO.getClabeEmpleado2());
                }
            }
        }

         empleado.setIdUltimoMovto(cambioMovimientosPersonalDTO.getIdMovsPersonal());
         empleado.setCasoMuestra("S");
         empleado.setFecUltimoMovto(cambioMovimientosPersonalDTO.getFechaInicial());
         empleado.setIdPlazaVigente(cambioMovimientosPersonalDTO.getPromocion() ? cambioMovimientosPersonalDTO.getIdPlazaPromo() : cambioMovimientosPersonalDTO.getIdPlaza() );
         empleado.setEmpQnaCaptura(qnaCaptura.intValue());
         empleado.setReferenciaOficio(cambioMovimientosPersonalDTO.getPlazaReferencia());
         empleado.setUsuario(usuario);
         empleado.setFecModifico(new Date());
         
        // FIN COMPLETA DATOS EMPLEADO



        // currentPlaza CONTIENE LOS DATOS QUE SE VA A ENVIAR A LA TABLA TN_MOVOTS_EMP_PLA, SI ES PROMOCION, SE LLENA CON LOS DATOS DE LA PLAZA NUEVA, PARA TODOS LOS DEMAS MOVIMIENTOS, SE ENVIA LA PLAZA ACTUAL
        TdPlaza currentPlaza = cambioMovimientosPersonalDTO.getPromocion() ? plazaPromocion : plaza;
        
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, currentPlaza, cambioMovimientosPersonalDTO.getIdMovsPersonal(), qnaCaptura.intValue(), usuario, new Date(), super.getAtributoPuesto(currentPlaza.getIdPuestoPre()));
        TnMovtosEmpPla tnMovtosEmpPlaActual = SirehUtils.transformToTnMovtosEmpPla(empleado, currentPlaza, cambioMovimientosPersonalDTO.getIdMovsPersonal(), qnaCaptura.intValue(), usuario, new Date(), super.getAtributoPuesto(currentPlaza.getIdPuestoPre()));
        
        // se completan los datos a insertar en TN_MOVTOS_EMP_PLA
        TcAtributoPuestoPK tcAtributoPuestoPK = new TcAtributoPuestoPK();
        Date ap_fin = new Date();
        try {
            ap_fin = formatoDelTexto.parse(getApFin());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        tcAtributoPuestoPK.setApFin(ap_fin);
        tcAtributoPuestoPK.setIdAtributoPuesto(plaza.getIdPuestoNom());

        TcAtributoPuesto tcAtributoPuesto = super.persistence().get(TcAtributoPuestoDAO.class).getById(tcAtributoPuestoPK);
        tnMovtosEmpPla.setMepRfc(cambioMovimientosPersonalDTO.getRfcEmpleado());
        tnMovtosEmpPla.setIdNivelPtoNom(tcAtributoPuesto.getIdNivelPto());
        tnMovtosEmpPla.setIdJerarquiaNom(tcAtributoPuesto.getIdJerarquia());
        tnMovtosEmpPla.setMepUltimoMovto(cambioMovimientosPersonalDTO.getFechaInicial());
        tnMovtosEmpPla.setMepIniCont(cambioMovimientosPersonalDTO.getFechaInicial());
        tnMovtosEmpPla.setMepFinCont(cambioMovimientosPersonalDTO.getFechaFinal());
        tnMovtosEmpPla.setMepIniLic(cambioMovimientosPersonalDTO.getIdSitPlaNva() != null && (cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("C") ||
                                    cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("P") || cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("L")) ? 
                                    cambioMovimientosPersonalDTO.getFechaInicial() : plaza.getPlazaIniLic());
        tnMovtosEmpPla.setMepFinLic(cambioMovimientosPersonalDTO.getIdSitPlaNva() != null && (cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("C") || 
                                     cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("P") || cambioMovimientosPersonalDTO.getIdSitPlaNva().equals("L")) ? 
                                    cambioMovimientosPersonalDTO.getFechaFinal() : plaza.getPlazaFinLic());
        tnMovtosEmpPla.setMepReferenciaOficio(cambioMovimientosPersonalDTO.getPlazaReferencia());
        // fin de competado de datos de plaza

        
        
        // SI ES PROMOCION SE GUARDAN SUS DATOS
        if (cambioMovimientosPersonalDTO.getPromocion()) {
            tnMovtosEmpPla.setIdSituacionPlaza("O");
            tnMovtosEmpPla.setMepIniLic(null);
            tnMovtosEmpPla.setMepFinLic(null);
            tnMovtosEmpPla.setIdZonaDistNom(cambioMovimientosPersonalDTO.getIdZonaDistNomPromo());
            tnMovtosEmpPla.setIdNombramientoNom(cambioMovimientosPersonalDTO.getIdNombramientoPromo());
            tnMovtosEmpPla.setIdNivelPtoNom(cambioMovimientosPersonalDTO.getIdNivelPtoPromo());
            tnMovtosEmpPla.setIdJerarquiaNom(cambioMovimientosPersonalDTO.getIdJerarquiaPromo());

            tnMovtosEmpPla.setIdUnidadNomAnt(cambioMovimientosPersonalDTO.getIdUnidadNom());
            tnMovtosEmpPla.setIdPuestoNomAnt(cambioMovimientosPersonalDTO.getIdPuestoNom());
            tnMovtosEmpPla.setIdEdoNomAnt(cambioMovimientosPersonalDTO.getIdEdo());
            tnMovtosEmpPla.setIdMuniNomAnt(cambioMovimientosPersonalDTO.getIdMunicipio());
            /*tnMovtosEmpPla.setIdZonaEcoNomAnt(cambioMovimientosPersonalDTO.getIdZonaEcoNom() != null && 
                                              cambioMovimientosPersonalDTO.getIdZonaEcoNom().equals(Integer.valueOf(1)) ? true : false);*/
            tnMovtosEmpPla.setIdZonaEcoNomAnt(cambioMovimientosPersonalDTO.getIdZonaEcoNom());
            tnMovtosEmpPla.setIdRangoNomAnt(cambioMovimientosPersonalDTO.getIdRangoNom());
            tnMovtosEmpPla.setMepPlazaAnt(cambioMovimientosPersonalDTO.getIdPlaza());
            tnMovtosEmpPla.setIdNivelPtoAnt(cambioMovimientosPersonalDTO.getIdNivelPto());
            tnMovtosEmpPla.setIdJerarquiaAnt(tcAtributoPuesto.getIdJerarquia());
        }

        super.persistence().get(TdPlazaDAO.class).save(plaza);
        
        if(cambioMovimientosPersonalDTO.getPromocion()){
            super.persistence().get(TdPlazaDAO.class).save(plazaPromocion);
        }
        // FIN UPDATE EN PLAZA PARA TODOS LOS MOVIMIENTOS

        // INICIO INSERT O UPDATE DE EMPLEADO        
        if (cambioMovimientosPersonalDTO.getAlta() != null && 
            cambioMovimientosPersonalDTO.getAlta()) {
            TdEmpleado tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioMovimientosPersonalDTO.getRfcEmpleado());
            if (tdEmpleado != null && tdEmpleado.getRfcEmpleado() != null) {
                throw new ServiceException("EL empleado con RFC " + cambioMovimientosPersonalDTO.getRfcEmpleado() + " existe en el sistema.\nFavor de seleccionar Alta por reingreso");
            }
        }

        super.persistence().get(TdEmpleadoDAO.class).save(empleado);
        
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }

    /**
     * Metodo encargado de consultar las incidencias de personal de un empleado
     * @param gestionIncidenciasPersonalDTO GestionIncidenciasPersonalDTO
     * @return GestionIncidenciasPersonalDTO
     */
    public GestionIncidenciasPersonalDTO getIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoDeFecha2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoDeFecha3 = new SimpleDateFormat("dd MM yyyy");
        
        Calendar fechaInferior = Calendar.getInstance();
        Calendar fechaSuperior = Calendar.getInstance();
        
        
        StringBuffer sinSueldoRegexp = new StringBuffer("");
        StringBuffer medioSueldoRegexp = new StringBuffer("");
        StringBuffer faltasRegexp = new StringBuffer("");
        StringBuffer diasEconomicosRegexp = new StringBuffer("");
        StringBuffer fechasDisabledRegExp = new StringBuffer("");
        
        sinSueldoRegexp.append("^");
        medioSueldoRegexp.append("^");
        faltasRegexp.append("^");
        diasEconomicosRegexp.append("^");
                
        List<CustomTdEmpleadoPlazaPuesto> listaEmpleadoPlazaPuesto = super.persistence().get(QueryTdEmpleadoDAO.class).getEmpleadoPlazaPuestoById(gestionIncidenciasPersonalDTO.getRfcEmpleado());
        List<CustomTnMovtoConceptoPagoSitCaptura> conceptosPago = null;
        List<CustomTnMovtoConceptoPagoSitCaptura> conceptosPagoLicencias = null;
        List<CustomTnMovtoConceptoPagoSitCaptura> conceptosPagoFaltas = null;
        
        fechaInferior.setTime(DateUtils.truncate(new Date(), Calendar.DATE));
        fechaSuperior.setTime(DateUtils.truncate(new Date(), Calendar.DATE));
        // Se definen los límites inferior y superior según el Tipo de incidencia
        if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")) {
            fechaSuperior.add(Calendar.YEAR, 1000);
            fechaInferior.add(Calendar.YEAR, -1);
            conceptosPago = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoSitCapturaByRfc("T", "V", "D", "LS", "LM", null, null, null, fechaInferior.getTime(), fechaSuperior.getTime() , gestionIncidenciasPersonalDTO.getRfcEmpleado());
        } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("F")) {
            fechaInferior.add(Calendar.MONTH, -12);
            conceptosPago = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoSitCapturaByRfc("T", "V", "U", "OE", "OS", "FA", "OV", "TV", fechaInferior.getTime(), fechaSuperior.getTime(), gestionIncidenciasPersonalDTO.getRfcEmpleado());
        } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("D")) {
            fechaInferior.add(Calendar.YEAR, -1);
            conceptosPago = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoSitCapturaByRfc("T", "V", "U", "67", null, null, null, null, fechaInferior.getTime(), fechaSuperior.getTime(), gestionIncidenciasPersonalDTO.getRfcEmpleado());
            conceptosPagoLicencias = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoSitCapturaByRfc("T", "V", "D", "LS", "LM", null, null, null, fechaInferior.getTime(), fechaSuperior.getTime(), gestionIncidenciasPersonalDTO.getRfcEmpleado());
            conceptosPagoFaltas = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoSitCapturaByRfc("T", "V", "U", "OE", "OS", "FA", "OV", "TV", fechaInferior.getTime(), fechaSuperior.getTime(), gestionIncidenciasPersonalDTO.getRfcEmpleado());
            fechasDisabledRegExp.append( "* * * 0,6|");
            if (conceptosPagoLicencias != null && !conceptosPagoLicencias.isEmpty()) {
                for (CustomTnMovtoConceptoPagoSitCaptura customTnMovtoConceptoPagoSitCaptura : conceptosPagoLicencias) {
                    fechasDisabledRegExp.append(formatoDeFecha3.format( customTnMovtoConceptoPagoSitCaptura.getMcpFecIncidencia()));
                    fechasDisabledRegExp.append("|");
                }
            }

            if (conceptosPagoFaltas != null && !conceptosPagoFaltas.isEmpty()) {
                for (CustomTnMovtoConceptoPagoSitCaptura customTnMovtoConceptoPagoSitCaptura : conceptosPagoFaltas) {
                    fechasDisabledRegExp.append(formatoDeFecha3.format( customTnMovtoConceptoPagoSitCaptura.getMcpFecIncidencia()));
                    fechasDisabledRegExp.append("|");
                }
            }
        }
        
        
        List<IncidenciaPersonalDTO> listaIncidenciasPersonalPantallaDTO = gestionIncidenciasPersonalDTO.getListaIncidenciasPersonal();
        
        List<IncidenciaPersonalDTO> incidenciasPersonalCapturadasDTO = null;
        if(listaIncidenciasPersonalPantallaDTO != null && !listaIncidenciasPersonalPantallaDTO.isEmpty() ){
            incidenciasPersonalCapturadasDTO = new ArrayList<IncidenciaPersonalDTO>();
            for(IncidenciaPersonalDTO incidenciaPersonalPantallaDTO : listaIncidenciasPersonalPantallaDTO){
                if(incidenciaPersonalPantallaDTO.getIdSitCaptura() != null && incidenciaPersonalPantallaDTO.getIdSitCaptura().equals("C") ){
                    incidenciasPersonalCapturadasDTO.add(incidenciaPersonalPantallaDTO);
                }
            }
        }
        
        
        Date fechaIncidenciaSeleccionada = gestionIncidenciasPersonalDTO.getFechaIncidenciaSeleccionada();
        String startDate = gestionIncidenciasPersonalDTO.getStartDate();
        String tipoLicencia = gestionIncidenciasPersonalDTO.getTipoLicencia();
        String tipoIncidencia = gestionIncidenciasPersonalDTO.getTipoIncidencia();
        // SE ASIGNAN LOS DATOS DEL EMPLEADO        
        if(listaEmpleadoPlazaPuesto != null && !listaEmpleadoPlazaPuesto.isEmpty()){
            gestionIncidenciasPersonalDTO = super.transformation().map(listaEmpleadoPlazaPuesto.get(0), GestionIncidenciasPersonalDTO.class);
        }
        gestionIncidenciasPersonalDTO.setMostrarEliminar(Boolean.FALSE);
        gestionIncidenciasPersonalDTO.setMostrarCalcular(Boolean.FALSE);
        gestionIncidenciasPersonalDTO.setMostrarAceptar(Boolean.FALSE);

        
        gestionIncidenciasPersonalDTO.setStartDate(startDate);
        gestionIncidenciasPersonalDTO.setTipoIncidencia(tipoIncidencia);
        gestionIncidenciasPersonalDTO.setTipoLicencia(tipoLicencia != null && !tipoLicencia.equals("") ? tipoLicencia : "sinSueldo");
        gestionIncidenciasPersonalDTO.setIdTipoCptoFilter("D");
        gestionIncidenciasPersonalDTO.setIdConceptoFilter(Arrays.asList("OE", "OS", "FA", "OV", "TV"));

        List<IncidenciaPersonalDTO> listaIncidenciasPersonalDTO = super.transformation().map(conceptosPago, IncidenciaPersonalDTO.class);
        
        if(incidenciasPersonalCapturadasDTO != null && !incidenciasPersonalCapturadasDTO.isEmpty() ){
            for(IncidenciaPersonalDTO incidenciaPersonalDTO : incidenciasPersonalCapturadasDTO){ 
                listaIncidenciasPersonalDTO.add(incidenciaPersonalDTO);
            }
        }
        if (listaIncidenciasPersonalDTO != null && !listaIncidenciasPersonalDTO.isEmpty()) {
            boolean existeMontoCero= false;
            boolean existeCapturadas= false;
            gestionIncidenciasPersonalDTO.setMcpMonto( listaIncidenciasPersonalDTO.get(0).getMcpMonto() != null ? listaIncidenciasPersonalDTO.get(0).getMcpMonto().toString() : null );
            for (IncidenciaPersonalDTO incidenciaPersonalDTO: listaIncidenciasPersonalDTO) {
                if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L") && incidenciaPersonalDTO.getIdSitCaptura().equals("C") && incidenciaPersonalDTO.getMcpMonto() != null && 
                    incidenciaPersonalDTO.getMcpMonto().equals(Double.valueOf(0))) {
                    existeMontoCero = true;
                }
                if (incidenciaPersonalDTO.getIdSitCaptura() != null && 
                    incidenciaPersonalDTO.getIdSitCaptura().equals("C")) {
                    existeCapturadas = true;
                }
                if (incidenciaPersonalDTO.getIdSitCaptura() != null && 
                    incidenciaPersonalDTO.getIdSitCaptura().equals("T")) {
                    fechaInferior.setTime(incidenciaPersonalDTO.getMcpFecIncidencia().after(fechaInferior.getTime()) ? 
                                          incidenciaPersonalDTO.getMcpFecIncidencia() : 
                                          fechaInferior.getTime());
                }
                TcConceptoPagoPK tcConceptoPagoPK = new TcConceptoPagoPK();
                tcConceptoPagoPK.setIdTipoCpto("U");
                
                if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")) {
                    tcConceptoPagoPK.setIdTipoCpto("D");
                    if (incidenciaPersonalDTO.getIdConcepto().equals("LS")) {
                        sinSueldoRegexp.append(formatoDeFecha.format(incidenciaPersonalDTO.getMcpFecIncidencia()));
                        sinSueldoRegexp.append("|");
                    } else if (incidenciaPersonalDTO.getIdConcepto().equals("LM")) {
                        medioSueldoRegexp.append(formatoDeFecha.format(incidenciaPersonalDTO.getMcpFecIncidencia()));
                        medioSueldoRegexp.append("|");
                    }
                } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("F")) {
                    faltasRegexp.append(formatoDeFecha.format(incidenciaPersonalDTO.getMcpFecIncidencia()));
                    faltasRegexp.append("|");
                } else if (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("D")) {
                        diasEconomicosRegexp.append(formatoDeFecha.format(incidenciaPersonalDTO.getMcpFecIncidencia()));
                        diasEconomicosRegexp.append("|");
                }

                tcConceptoPagoPK.setIdConcepto(incidenciaPersonalDTO.getIdConcepto());
                TcConceptoPago conceptoPago = super.persistence().get(TcConceptoPagoDAO.class).getById(tcConceptoPagoPK);
                incidenciaPersonalDTO.setDescConcepto(conceptoPago.getDescConPag());
                
                gestionIncidenciasPersonalDTO.setMostrarCalcular(incidenciaPersonalDTO.getIdSitCaptura() != null && incidenciaPersonalDTO.getIdSitCaptura().equals("C") ? Boolean.TRUE : 
                                                                 gestionIncidenciasPersonalDTO.getMostrarCalcular());
            }


            gestionIncidenciasPersonalDTO.setMostrarEliminar(Boolean.TRUE);
            if(gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")){
                gestionIncidenciasPersonalDTO.setMostrarAceptar(existeCapturadas && !existeMontoCero);
            }else{
                gestionIncidenciasPersonalDTO.setMostrarAceptar(existeCapturadas);
            }
            gestionIncidenciasPersonalDTO.setMostrarCalcular(existeMontoCero);
        }


        gestionIncidenciasPersonalDTO.setListaIncidenciasPersonal(listaIncidenciasPersonalDTO);        
        gestionIncidenciasPersonalDTO.setFechasSinSueldoRegexp(sinSueldoRegexp.indexOf("|") != -1 ? sinSueldoRegexp.substring(0, sinSueldoRegexp.length() - 1) + "$" : "^0000-00-00$");
        gestionIncidenciasPersonalDTO.setFechasMedioSueldoRegexp(medioSueldoRegexp.indexOf("|") != -1 ? medioSueldoRegexp.substring(0, medioSueldoRegexp.length() - 1) + "$" : "^0000-00-00$");
        gestionIncidenciasPersonalDTO.setFechasFaltaRegexp(faltasRegexp.indexOf("|") != -1 ? faltasRegexp.substring(0, faltasRegexp.length() - 1) + "$" : "^0000-00-00$");
        gestionIncidenciasPersonalDTO.setFechasDiasEconomicosRegexp(diasEconomicosRegexp.indexOf("|") != -1 ? diasEconomicosRegexp.substring(0, diasEconomicosRegexp.length() - 1) + "$" : "^0000-00-00$");
        gestionIncidenciasPersonalDTO.setFechasDisabled(fechasDisabledRegExp.indexOf("|") != -1 ? fechasDisabledRegExp.substring(0, fechasDisabledRegExp.length() - 1) : "00 00 0000");
        
        gestionIncidenciasPersonalDTO.setFechaLimiteInferior(formatoDeFecha2.format(fechaInferior.getTime()) );
        gestionIncidenciasPersonalDTO.setFechaLimiteSuperior(formatoDeFecha2.format(fechaSuperior.getTime()));
        
        gestionIncidenciasPersonalDTO.setStartDate(fechaIncidenciaSeleccionada != null ? formatoDeFecha2.format(fechaIncidenciaSeleccionada) : (gestionIncidenciasPersonalDTO.getStartDate() != null && !gestionIncidenciasPersonalDTO.getStartDate().equals("") ?  gestionIncidenciasPersonalDTO.getStartDate() : formatoDeFecha2.format(new Date()))  );

        
        return gestionIncidenciasPersonalDTO;
    }

    /**
     * Metodo encargado de agregar una incidencia de personal a un empleado en memoria
     * @param gestionIncidenciasPersonalDTO GestionIncidenciasPersonalDTO
     */
    public void addIncidenciaPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        IncidenciaPersonalDTO incidenciaPersonalDTO = new IncidenciaPersonalDTO ();
        incidenciaPersonalDTO.setIdMovtoConceptoPago( (long) gestionIncidenciasPersonalDTO.getFechaIncidenciaSeleccionada().getTime() );
        incidenciaPersonalDTO.setMcpFecIncidencia(gestionIncidenciasPersonalDTO.getFechaIncidenciaSeleccionada());
        if(gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")){
            incidenciaPersonalDTO.setIdConcepto(gestionIncidenciasPersonalDTO.getTipoLicencia().equals("sinSueldo") ? "LS" : "LM" );
            incidenciaPersonalDTO.setMcpMonto(Double.valueOf(0));
        } else if(gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("D") ){
            incidenciaPersonalDTO.setIdConcepto("67");
        } else{
             incidenciaPersonalDTO.setIdConcepto(gestionIncidenciasPersonalDTO.getIdConcepto());
         }
        incidenciaPersonalDTO.setIdSitCaptura("C");
        incidenciaPersonalDTO.setDescSitCaptura("Capturada");
        gestionIncidenciasPersonalDTO.getListaIncidenciasPersonal().add(incidenciaPersonalDTO);
    }

    /**
     * Metodo encargado de eliminar las incidencias de personal seleccionadas en pantalla
     * @param listaIncidenciasPersonalDTO List
     * @param tipoIncidencia String
     * @param ids Long[]
     */
    public void deleteIncidenciasPersonal(List<IncidenciaPersonalDTO> listaIncidenciasPersonalDTO, String tipoIncidencia, Long[] ids) {
    
        if(listaIncidenciasPersonalDTO != null && 
            !listaIncidenciasPersonalDTO.isEmpty()) {

            for (Long id: ids) {
                for (int i = 0; i < listaIncidenciasPersonalDTO.size(); i++) {
                    if (id.equals(listaIncidenciasPersonalDTO.get(i).getIdMovtoConceptoPago())) {
                        if (listaIncidenciasPersonalDTO.get(i).getIdSitCaptura() != null && listaIncidenciasPersonalDTO.get(i).getIdSitCaptura().equals("C")) {
                            listaIncidenciasPersonalDTO.remove(i);
                        } else if (listaIncidenciasPersonalDTO.get(i).getIdSitCaptura() != null && listaIncidenciasPersonalDTO.get(i).getIdSitCaptura().equals("V")) {
                            TnMovtoConceptoPago movtoConceptoPago = super.persistence().get(TnMovtoConceptoPagoDAO.class).getById(id);
                            if (tipoIncidencia != null && (tipoIncidencia.equals("L") || tipoIncidencia.equals("D"))) {
                                movtoConceptoPago.setIdSitCaptura("B");
                            } else if (tipoIncidencia != null && tipoIncidencia.equals("F")) {
                                movtoConceptoPago.setIdSitCaptura("C");
                            }
                            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPago);
                        }
                    }
                }
            }
        }
    }

    /**
     * Metodo encargado de calcular el importe de la licencia economica de un empleado de acuerdo a la fecha de la incidencia
     * @param gestionIncidenciasPersonalDTO GestionIncidenciasPersonalDTO
     * @return List
     */
    public List<IncidenciaPersonalDTO> calcularIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        QnaCapturaDTO qnaCaptura= getQuincenaCaptura();
        SimpleDateFormat formatoDeFecha2 = new SimpleDateFormat("dd/MM/yyyy");
        List<IncidenciaPersonalDTO> listaIncidenciaPersonal = gestionIncidenciasPersonalDTO.getListaIncidenciasPersonal();
        List<String> listaErrores = new ArrayList<String>();
        boolean existenErrores = false;
        for (IncidenciaPersonalDTO incidenciaPersonalDTO: listaIncidenciaPersonal) {
            if (incidenciaPersonalDTO.getIdSitCaptura() != null && incidenciaPersonalDTO.getIdSitCaptura().equals("C") && incidenciaPersonalDTO.getMcpMonto().equals(Double.valueOf(0))) {
                String idPuestoNom = null;
                Integer idZonaEcoNom = null;
                Integer idRangoNom = null;
                if (SirehUtils.getQuincenaCapturaAsInteger(incidenciaPersonalDTO.getMcpFecIncidencia()).intValue() >= qnaCaptura.intValue()) {
                    // Obtenemos puesto, zona económica y rango para la quincena actual
                    idPuestoNom = gestionIncidenciasPersonalDTO.getIdPuestoNom();
                    idZonaEcoNom = gestionIncidenciasPersonalDTO.getIdZonaEcoNom();
                    idRangoNom = gestionIncidenciasPersonalDTO.getIdRangoNom();
                } else {
                    // Nos vamos al histórico a obtener puesto, zona económica y rango para esa quincena
                    List<TnHistoricoPago> listHistoricoPago = 
                        super.persistence().get(QueryTnHistoricoPagoDAO.class).findByRfcFecha("P07", 
                                                                                              "P02", 
                                                                                              gestionIncidenciasPersonalDTO.getRfcEmpleado(), 
                                                                                              "C", 
                                                                                              incidenciaPersonalDTO.getMcpFecIncidencia(), 
                                                                                              incidenciaPersonalDTO.getMcpFecIncidencia());
                    if (listHistoricoPago != null && !listHistoricoPago.isEmpty()) {
                        TnHistoricoPago historicoPago = listHistoricoPago.get(0);
                        idPuestoNom = historicoPago.getIdPuestoNom();
                        idZonaEcoNom = historicoPago.getIdZonaEcoNom();
                        idRangoNom = historicoPago.getIdRangoNom();
                    } else {
                        // Enviar error
                        listaErrores.add("No existen datos en el histórico para la incidencia con fecha " + formatoDeFecha2.format(incidenciaPersonalDTO.getMcpFecIncidencia()));
                        StringBuffer errores = new StringBuffer("");
                        for(String error : listaErrores){
                            errores.append(error).append("\n");
                        }
                        throw new ServiceException("" + errores);
                    }
                }
                // Se realiza el cálculo
                 List<TcTabulador> listaTabulador =  super.persistence().get(QueryTcTabuladorDAO.class).findByNivelRango(incidenciaPersonalDTO.getMcpFecIncidencia(), 
                                                                                         idPuestoNom, 
                                                                                         incidenciaPersonalDTO.getMcpFecIncidencia(), 
                                                                                         idPuestoNom, 
                                                                                         incidenciaPersonalDTO.getMcpFecIncidencia(), 
                                                                                         idZonaEcoNom, 
                                                                                         idRangoNom);

                 if (listaTabulador != null && !listaTabulador.isEmpty()) {
                     incidenciaPersonalDTO.setMcpMonto(incidenciaPersonalDTO.getIdConcepto().equals("LS") ? 
                                                  ( (listaTabulador.get(0).getTabSueldo() + listaTabulador.get(0).getTabCompensacion()) /  15.0) / 2 : 
                                                  ( (listaTabulador.get(0).getTabSueldo() + listaTabulador.get(0).getTabCompensacion()) / 15 * 0.5 ) / 2);
                 }
                
            }
        }
        return listaIncidenciaPersonal;
    }


    /**
     * Metodo encargado de actualizar las incidencias de un empleado
     * @param gestionIncidenciasPersonalDTO GestionIncidenciasPersonalDTO
     */
    public void updateIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        List<TnMovtoConceptoPago> listaIncidenciasPersonal = super.transformation().map(gestionIncidenciasPersonalDTO.getListaIncidenciasPersonal(), TnMovtoConceptoPago.class);
        QnaCapturaDTO qnaCaptura= getQuincenaCaptura();
        for(TnMovtoConceptoPago movtoConceptoPago : listaIncidenciasPersonal){
            if(movtoConceptoPago.getIdSitCaptura() != null && movtoConceptoPago.getIdSitCaptura().equals("C")){
                movtoConceptoPago.setIdMovtoConceptoPago(null);
                movtoConceptoPago.setIdTercero("H");
                if(gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("L")){
                    movtoConceptoPago.setIdTipoCpto("D");
                }
                else if(gestionIncidenciasPersonalDTO.getTipoIncidencia() != null && (gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("F") || gestionIncidenciasPersonalDTO.getTipoIncidencia().equals("D"))){
                    movtoConceptoPago.setIdTipoCpto("U");
                }
                movtoConceptoPago.setMcpHorasDias(new Integer(0));
                movtoConceptoPago.setMcpPorcentaje(Float.valueOf(0));;                
                movtoConceptoPago.setMcpQnaIni(qnaCaptura.intValue());
                movtoConceptoPago.setMcpQnaFin(qnaCaptura.intValue());
                movtoConceptoPago.setMcpQnaAplicadas(new Integer(0));
                movtoConceptoPago.setMcpQnaADescontar(new Integer(0));
                movtoConceptoPago.setMcpQnasAdeudo(new Integer(0));
                movtoConceptoPago.setMcpRfc(gestionIncidenciasPersonalDTO.getRfcEmpleado());
                movtoConceptoPago.setIdSitCaptura("V");
                movtoConceptoPago.setMcpQnaCaptura(qnaCaptura.intValue());
                movtoConceptoPago.setUsuario(super.identity().get().getUserID());
                movtoConceptoPago.setFecModifico(new Date());
                if(movtoConceptoPago.getMcpMonto() == null){
                    movtoConceptoPago.setMcpMonto( Double.valueOf(0) );
                }
                super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPago);
            }
        }
        gestionIncidenciasPersonalDTO.setListaIncidenciasPersonal(null);
    }

    public List<String> plantillaVigente(String idGrupoPago){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByPlantilla(idGrupoPago); 
        listaString.add("UNIDAD FISICA,DESCRIPCION UNIDAD,RFC,CURP,PRIMER APELLIDO,SEGUNDO APELLIDO,NOMBRE EMPLEADO,GENERO,ESTADO CIVIL,NACIONALIDAD,SEGURIDAD SOCIAL,ID RUSP,TIPO MOVIMIENTO,DESCRIPCION MOVIMIENTO,PLAZA,PUESTO FUNCIONAL,NIVEL PUESTO,HERRAMIENTA,CODIGO PUESTO,NOMBRE PUESTO,DIVICION ESCENARIO,TIPO CONTRATACION,TIPO NOMBRAMIENTO,ZONA PAGO,UNIDAD PRESUPUESTAL,PUESTO PRESUPUESTAL,QUINCENA CAPTURA,IN DEPENDENCIA,IN GOBIERNO FEDERAL,IN SPC,INICIO CONTRATACION,FIN CONTRATACION,DOMICILIO OFICIAL,CORREO OFICIAL,TELEFONO OFICIAL,FEC MODIFICACION");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;
    }
    
    public List<String> movimientosA(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByMovimientosA(reportesMovtoNominaDTO.getQnaIni(), reportesMovtoNominaDTO.getQnaFin(), reportesMovtoNominaDTO.getUnidades());
            listaString.add("UNIDAD FISICA,DESCRIPCION UNIDAD,RFC,CURP,PRIMER APELLIDO,SEGUNDO APELLIDO,NOMBRE EMPLEADO,GENERO,SEGURIDAD SOCIAL,ID RUSP,TIPO MOVIMIENTO,DESCRIPCION MOVIMIENTO,PLAZA,PUESTO FUNCIONAL,NIVEL PUESTO,NOMBRE PUESTO,TIPO CONTRATACION,TIPO NOMBRAMIENTO,ZONA PAGO,UNIDAD PRESUPUESTAL,PUESTO PRESUPUESTAL,QUINCENA CAPTURA,IN GOBIERNO FEDERAL,IN DEPENDENCIA,IN SPC,INICIO CONTRATACION,FIN CONTRATACION,DOMICILIO OFICIAL,CORREO OFICIAL,TELEFONO OFICIAL,FEC MODIFICACION");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            {
            listaString = null;
            }
            return listaString;
        }

    public List<String> movimientosB(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByMovimientosB(reportesMovtoNominaDTO.getQnaIni(), reportesMovtoNominaDTO.getQnaFin(), reportesMovtoNominaDTO.getUnidades());
            listaString.add("UNIDAD FISICA,DESCRIPCION UNIDAD,RFC,CURP,PRIMER APELLIDO,SEGUNDO APELLIDO,NOMBRE EMPLEADO,GENERO,SEGURIDAD SOCIAL,ID RUSP,TIPO MOVIMIENTO,DESCRIPCION MOVIMIENTO,PLAZA,PUESTO FUNCIONAL,NIVEL PUESTO,NOMBRE PUESTO,TIPO CONTRATACION,TIPO NOMBRAMIENTO,ZONA PAGO,UNIDAD PRESUPUESTAL,PUESTO PRESUPUESTAL,QUINCENA CAPTURA,IN GOBIERNO FEDERAL,IN DEPENDENCIA,IN SPC,INICIO CONTRATACION,FIN CONTRATACION,DOMICILIO OFICIAL,CORREO OFICIAL,TELEFONO OFICIAL,FEC MODIFICACION");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            {
            listaString = null;
            }
            return listaString;
        }

    public List<String> movimientosM(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByMovimientosM(reportesMovtoNominaDTO.getQnaIni(), reportesMovtoNominaDTO.getQnaFin(), reportesMovtoNominaDTO.getUnidades());
        listaString.add("UNIDAD FISICA,DESCRIPCION UNIDAD,RFC,CURP,PRIMER APELLIDO,SEGUNDO APELLIDO,NOMBRE EMPLEADO,GENERO,SEGURIDAD SOCIAL,ID RUSP,TIPO MOVIMIENTO,DESCRIPCION MOVIMIENTO,PLAZA,PUESTO FUNCIONAL,NIVEL PUESTO,NOMBRE PUESTO,TIPO CONTRATACION,TIPO NOMBRAMIENTO,ZONA PAGO,UNIDAD PRESUPUESTAL,PUESTO PRESUPUESTAL,PLAZA ANTERIOR,PUESTO FUN ANT,NOM PLAZA ANTERIOR,QUINCENA CAPTURA,IN GOBIERNO FEDERAL,IN DEPENDENCIA,IN SPC,INICIO CONTRATACION,FIN CONTRATACION,DOMICILIO OFICIAL,CORREO OFICIAL,TELEFONO OFICIAL,FEC MODIFICACION");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    }
    
    public List<String> periodoLaborado(ReportesConstanciasDTO reportesConstanciasDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByPeriodoLaborado(reportesConstanciasDTO.getCiclo());
        listaString.add("RFC, Nombre, Fecha inicial, Fecha final, Días periodo, Días no Lab., Días pagar, Plaza, Grupo, Puesto, Unidad, Nivel, Zona, Herramienta, Sueldo, Compensación, Salario mínimo, Aguinaldo, Gratificación, Excento, Vigente, Gravable mes, ISR mes, P 24, P 1E, D IA,  P 24 G, P 1E G, D IA G, Pensión, Pensión 2, Pension 3, Faltas AA, Licencias AA LS, Licencias AA LM, Licencias AA AP, Faltas, Licencias LS, Licencias LM, Licencias AP");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {   listaString.add(row.getRegistro());   }
        } else{  listaString = null; }
        return listaString;
    }

    public List<String> padronSeguros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByPadronSeguros(generaArchivosTercerosDTO.getQnaIni());
        listaString.add("RFC,NOMBRE,NIVEL,UNIDAD FISICA,ESTADO,CURP,TIPO CONTRATACION");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    }

    public List<String> credencializacionM(ReportesConstanciasDTO reportesConstanciasDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByCredencializacionM(reportesConstanciasDTO.getQnaIni());
        listaString.add("Nombre(s),ApellidoPaterno,ApellidoMaterno,FechaNacimiento,EstadoNacimiento,Sexo,EstadoCivil,CURP,RFC,IMSS_ISSSTE,Nacionalidad,DocumentoMigratorio,CorreoElectronico,ClavePuesto,NombrePuesto,UnidadFisica,FechaIngreso SHCP,FechaIngresoGOBFED,TipoAutenticacion,EsAccesoHabilitado,Contrasenia,NumeroTarjeta,TIPO_NOMBRAMIENTO,ZONA_PAGO,GrupoPago,Cve_Inmueble,Nivel,EsPadre,FechaInicio Exencion,FechaFin Exencion,Fecha Baja,EstatusEmpleado,ERRORES,MOVIMIENTO");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    }
    public List<String> credencializacionR(ReportesConstanciasDTO reportesConstanciasDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByCredencializacionR(reportesConstanciasDTO.getRfcEmpleado());
        listaString.add("Nombre(s),ApellidoPaterno,ApellidoMaterno,FechaNacimiento,EstadoNacimiento,Sexo,EstadoCivil,CURP,RFC,IMSS_ISSSTE,Nacionalidad,DocumentoMigratorio,CorreoElectronico,ClavePuesto,NombrePuesto,UnidadFisica,FechaIngreso SHCP,FechaIngresoGOBFED,TipoAutenticacion,EsAccesoHabilitado,Contrasenia,NumeroTarjeta,TIPO_NOMBRAMIENTO,ZONA_PAGO,GrupoPago,Cve_Inmueble,Nivel,EsPadre,FechaInicio Exencion,FechaFin Exencion,Fecha Baja,EstatusEmpleado,ERRORES,MOVIMIENTO");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    }

    public List<String> credencializacionB(ReportesConstanciasDTO reportesConstanciasDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findByCredencializacionB(reportesConstanciasDTO.getQnaFin());
        listaString.add("Nombre(s),ApellidoPaterno,ApellidoMaterno,FechaNacimiento,EstadoNacimiento,Sexo,EstadoCivil,CURP,RFC,IMSS_ISSSTE,Nacionalidad,DocumentoMigratorio,CorreoElectronico,ClavePuesto,NombrePuesto,UnidadFisica,FechaIngreso SHCP,FechaIngresoGOBFED,TipoAutenticacion,EsAccesoHabilitado,Contrasenia,NumeroTarjeta,TIPO_NOMBRAMIENTO,ZONA_PAGO,GrupoPago,Cve_Inmueble,Nivel,EsPadre,FechaInicio Exencion,FechaFin Exencion,Fecha Baja,EstatusEmpleado,ERRORES,MOVIMIENTO");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    }

    
    public String constanciasF(ReportesConstanciasDTO reportesConstanciasDTO){
        String datos = super.persistence().get(CustomTdHistoricoDAO.class).constanciasF(reportesConstanciasDTO.getRfcEmpleado2());
        return datos;
    }
    
    public List<String> defNomEjercicio(String ciclo){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).defNomEjercicio(ciclo);
        listaString.add("Qna. pago,Número nómina,Inicio,Final,Pago,Deposito,Identificador,Complemento,Nómina,Tipo de nómina,Tipo de contratación,Estatus de la nómina,Fecha creación,Fecha creación Anexo 20,Fecha timbrado,Referencia de timbrado,Fecha cancelación SiReH,Fecha cancelación timbrado,Referencia de cancelación,Casos,Trabajadores,Pensionadas,Importe percepciones,Importe deducciones,Importe Liquido,Importe percepciones gravables,Importe percepciones excentas,Importe deducciones gravables,Importe deducciones excentas,Subtotal SAT,Descuentos,Total SAT,ISR SAT");
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {   listaString.add(row.getRegistro());   }
        } else{  listaString = null; }
        return listaString;
    }
    
}
