package gob.shcp.sireh.service.nomina.calculo;


import gob.shcp.fsn.springmodules.rules.drools54.AbstractStatelessRulesService;

import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnNominaDAO;
import gob.shcp.sireh.data.jdbc.TcGrupoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.TnRegControlDAO;
import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.support.QueryTcIsptDAO;

import gob.shcp.sireh.domain.jdbc.ConceptoPago;
import gob.shcp.sireh.domain.jdbc.CustomTdCecoban;
import gob.shcp.sireh.domain.jdbc.FinContrato;
import gob.shcp.sireh.domain.jdbc.HistoricoPago;
import gob.shcp.sireh.domain.jdbc.Pago;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;
import gob.shcp.sireh.domain.jdbc.TcGrupoPago;
import gob.shcp.sireh.domain.jdbc.TcIspt;
import gob.shcp.sireh.domain.jdbc.TdPension;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.domain.jdbc.TnRegControl;

import gob.shcp.sireh.model.SelectIntegerStringDTO;
import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TcGrupoPagoDTO;
import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.TdPensionDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.GeneracionCecobanDTO;
import gob.shcp.sireh.model.nomina.calculo.HistoricoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.calculo.QuincenaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.plaza.FinContratoDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.utils.CalculoIspt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.math.BigDecimal;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;

import org.drools.command.Command;
import org.drools.command.CommandFactory;



public class CalculoNominaBS extends AbstractStatelessRulesService implements CalculoNominaService {

    private static String formatoFecha = "ddMMyyyy";
    private static String formatoFechaFile = "yyyyMMdd";
    private static String formatoDecimal = "#,###.##";

    // CONSTANTES CECOBAN
    private static final String NUMERO_SECUENCIA = "0000001";
    private static final String TIPO_REGISTRO_ENCABEZADO = "01";
    private static final String OFICINA_OR = "001";
    private static final String OFICINA_FO = "180";
    private static final String OFICINA_G00 = "259";
    private static final String CODIGO_OPERACION = "60";
    private static final String CLABE_INSTITUCION = "167";
    private static final String SENTIDO = "E";
    private static final String SERVICIO = "2";
    private static final String CODIGO_DIVISA = "01";
    private static final String CAUSA_RECHAZO_BLOQUE = "00";
    private static final String MODALIDAD_PROGRAMADOS = "2";
    private static final String TIPO_REGISTRO = "09";
    private static final String EXTENSION_FILE_DAT = ".DAT";
    private static final String FILE_CECOBAN = "06";
    private static final String SEPARATOR_GUION_BAJO = "_";
    private static final String FIN_DE_LINEA = "\r\n";
    private static final Integer INICIO_SECUENCIA = 1;
    private static final String ID_TP_NOMINA_FONAC = "FO";
    private static final String ID_UNIDAD_RECURSOS_FINANCIEROS = "710";
    private static final String ID_UNIDAD_RECURSOS_HUMANOS = "711";
    private long lastUpdated;

    public NominaDTO getNominaById(int idQna) {
        Map<String, Object> nomina = super.persistence().get(CustomCalculoDAO.class).getNominaById(new Integer(idQna));
        NominaDTO nominaDTO = new NominaDTO();
        nominaDTO.setIdNomina((Long)nomina.get("idNomina"));
        nominaDTO.setNomQnaCaptura((Integer)nomina.get("nomQnaCaptura"));
        nominaDTO.setNomNumComplem((String)nomina.get("nomNumComplem"));
        nominaDTO.setDescNomina((String)nomina.get("nomDescripcion"));
        nominaDTO.setNomDescTipoNomina((String)nomina.get("nomDescTipoNomina"));
        nominaDTO.setNomDescGrupoPago((String)nomina.get("nomDescGrupoPago"));

        nominaDTO.setNomIniPago((Date)nomina.get("nomIniPago"));
        nominaDTO.setNomFinPago((Date)nomina.get("nomFinPago"));

        nominaDTO.setNomFecApertura((Date)nomina.get("nomFecApertura"));
        nominaDTO.setNomFecCierre((Date)nomina.get("nomFecCierre"));

        nominaDTO.setIdEdoNom((String)nomina.get("status"));
        return nominaDTO;
    }
    
    public NominaDTO getNominaByIdExtraordinaria(int idQna) {
        Map<String, Object> nomina = super.persistence().get(CustomCalculoDAO.class).getNominaByIdExtraordinaria(new Integer(idQna));
        NominaDTO nominaDTO = new NominaDTO();
        nominaDTO.setIdNomina((Long)nomina.get("idNomina"));
        nominaDTO.setIdTipoNomina((String)nomina.get("idTipoNomina"));
        nominaDTO.setNomQnaCaptura((Integer)nomina.get("nomQnaCaptura"));
        nominaDTO.setNomNumComplem((String)nomina.get("nomNumComplem"));
        nominaDTO.setDescNomina((String)nomina.get("nomDescripcion"));
        nominaDTO.setNomDescTipoNomina((String)nomina.get("nomDescTipoNomina"));
        nominaDTO.setNomDescGrupoPago((String)nomina.get("nomDescGrupoPago"));

        nominaDTO.setNomIniPago((Date)nomina.get("nomIniPago"));
        nominaDTO.setNomFinPago((Date)nomina.get("nomFinPago"));

        nominaDTO.setNomFecApertura((Date)nomina.get("nomFecApertura"));
        nominaDTO.setNomFecCierre((Date)nomina.get("nomFecCierre"));

        nominaDTO.setIdEdoNom((String)nomina.get("status"));
        return nominaDTO;
    }

    public NominaDTO getNominaByIdIncentivo(int idQna) {
        Map<String, Object> nomina = super.persistence().get(CustomCalculoDAO.class).getNominaByIdIncentivo(new Integer(idQna));
        NominaDTO nominaDTO = new NominaDTO();
        nominaDTO.setIdNomina((Long)nomina.get("idNomina"));
        nominaDTO.setNomQnaCaptura((Integer)nomina.get("nomQnaCaptura"));
        nominaDTO.setNomNumComplem((String)nomina.get("nomNumComplem"));
        nominaDTO.setDescNomina((String)nomina.get("nomDescripcion"));
        nominaDTO.setNomDescTipoNomina((String)nomina.get("nomDescTipoNomina"));
        nominaDTO.setNomDescGrupoPago((String)nomina.get("nomDescGrupoPago"));

        nominaDTO.setNomIniPago((Date)nomina.get("nomIniPago"));
        nominaDTO.setNomFinPago((Date)nomina.get("nomFinPago"));

        nominaDTO.setNomFecApertura((Date)nomina.get("nomFecApertura"));
        nominaDTO.setNomFecCierre((Date)nomina.get("nomFecCierre"));

        nominaDTO.setIdEdoNom((String)nomina.get("status"));
        return nominaDTO;
    }

    public NominaDTO getDatosNominaById(int idQna) {
        Map<String, Object> nomina = super.persistence().get(CustomCalculoDAO.class).getDatosNominaById(new Integer(idQna));
        NominaDTO nominaDTO = new NominaDTO();
        nominaDTO.setIdNomina((Long)nomina.get("idNomina"));
        nominaDTO.setNomQnaCaptura((Integer)nomina.get("nomQnaCaptura"));
        nominaDTO.setNomNumComplem((String)nomina.get("nomNumComplem"));
        nominaDTO.setDescNomina((String)nomina.get("nomDescripcion"));
        nominaDTO.setNomDescTipoNomina((String)nomina.get("nomDescTipoNomina"));
        nominaDTO.setNomDescGrupoPago((String)nomina.get("nomDescGrupoPago"));
        nominaDTO.setIdTipoNomina((String)nomina.get("idTipoNomina"));

        nominaDTO.setNomIniPago((Date)nomina.get("nomIniPago"));
        nominaDTO.setNomFinPago((Date)nomina.get("nomFinPago"));

        nominaDTO.setNomFecApertura((Date)nomina.get("nomFecApertura"));
        nominaDTO.setNomFecCierre((Date)nomina.get("nomFecCierre"));

        nominaDTO.setIdEdoNom((String)nomina.get("status"));
        return nominaDTO;
    }

    /**
     * Metodo encargado de calcular datos de nómina con base en el rfc del empleado.
     * @author
     * @param rfc String
     * @return pagoDTO PagoDTO
     */
    public PagoDTO getByRFC(String rfc) {
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByRFC(rfc, super.security().getDimensions(), super.security().getOperationYear());

        if (pago == null) {
            return null;
        }

        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setConceptos(super.transformation().map(pago.getConceptos(), ConceptoPagoDTO.class));
        pagoDTO.setPensiones(super.transformation().map(pago.getPensiones(), TdPensionDTO.class));
        return pagoDTO;
    }

    /**
     * Metodo encargado de calcular individualmente datos de nómina con base en el rfc del empleado.
     * @author
     * @param rfc String
     * @return pagoDTO DTO
     */
    public PagoDTO calcByRFC(String rfc) {
        PagoDTO pagoDTO = rfc != null ? getByRFC(rfc) : new PagoDTO();
        pagoDTO.setQuincena(super.persistence().get(CustomCalculoDAO.class).getQuincenaVigente());

        List<TnNomina> listTnNominas = super.persistence().get(QueryTnNominaDAO.class).findByQnaCapturaSinTipoNomina(pagoDTO.getQuincena(), "OR");
        List<Integer> nominasExcluidas = null;
        
        if (listTnNominas != null && !listTnNominas.isEmpty()) {
            nominasExcluidas = new ArrayList<Integer>();
            for (TnNomina tnNomina: listTnNominas) {
                if (tnNomina.getIdNomina() != null) {
                    nominasExcluidas.add(tnNomina.getIdNomina().intValue());
                }
            }
        }
        pagoDTO.setIdTipoNomina("OR");

        if (pagoDTO.isRetroactivo()) {
            retroactivo(pagoDTO, super.persistence().get(CustomCalculoDAO.class).getQuincenaVigente(), nominasExcluidas);
        }

        CalculoNomina(pagoDTO);
        return pagoDTO;
    }

    /**
     * Metodo encargado de calcular datos de nómina con base en el id de la plaza.
     * @author
     * @param idPlaza String
     * @return pagoDTO PagoDTO
     */
    public PagoDTO getByPlaza(String idPlaza) {
        Pago pago = super.persistence().get(CustomCalculoDAO.class).getPagoByPlaza(idPlaza, null);

        if (pago == null) {
            return null;
        }
        
        PagoDTO pagoDTO = super.transformation().map(pago, PagoDTO.class);
        pagoDTO.setConceptos(new ArrayList());
        pagoDTO.setPensiones(new ArrayList());
        return pagoDTO;
    }

    /**
     * Metodo encargado de calcular individualmente datos de nómina con base en el id de la plaza.
     * @author
     * @param idPlaza String
     * @return pagoDTO PagoDTO
     */
    public PagoDTO calcByPlaza(String idPlaza) {
        PagoDTO pagoDTO = getByPlaza(idPlaza);
        pagoDTO.setIdTipoNomina("OR");
        CalculoNomina(pagoDTO);
        return pagoDTO;
    }

    /**
     * Metodo encargado de calcular individualmente datos de nómina con base en el objeto pagoDTO
     * @author Oscar S.
     * @param pagoDTO PagoDTO
     */
    private void CalculoNomina(PagoDTO pagoDTO) {
        CalculoIspt ispt = new CalculoIspt();
        List<TcIspt> listIspt = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("80");
        List<TcIspt> listBtos = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("REVA");
        ispt.setTablaBrutos(listBtos);
        ispt.setTablaIspt(listIspt);

        // Ejecucion de reglas de drools
        List<Command> commands = new ArrayList<Command>();
        List<PagoDTO> listaPagoDTO = new ArrayList<PagoDTO>();
        listaPagoDTO.add(pagoDTO);

        for (PagoDTO par: listaPagoDTO) {
            commands.add(CommandFactory.newInsert(par));
        }
        super.getRulesService().executeStatelessBatchRules(commands);
    }

    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author Oscar S.
     * @param idGrupoPago String
     * @return listaPagoDTO List PagoDTO
     */
    public List<PagoDTO> calcByGpoPago(String idGrupoPago, int idNomina, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones) {

        CalculoIspt ispt = new CalculoIspt();
        NominaDTO nominaDTO = getDatosNominaById(idNomina);
        List<Pago> listaPago = null;

        // Ejecuta por tipo de nomina
        if ((nominaDTO.getIdTipoNomina().contains("OR")) || (nominaDTO.getIdTipoNomina().contains("CJ"))) {
            listaPago = super.persistence().get(CustomCalculoDAO.class).getPagosByGpoPago( operationalYear, dimensiones, nomFuenteDatos, idGrupoPago);
        } else if (nominaDTO.getIdTipoNomina().contains("IN")) {
            // Llamada al procedimiento PKG_PREVIO_INCENTIVO.Previo(id_nomina)
            super.persistence().get(CustomCalculoDAO.class).previoIncentivo(idNomina);
            logger.debug("Llamada a StoredProcedure -> PKG_PREVIO_INCENTIVO.Previo(" + idNomina + ")");
            
            listaPago = super.persistence().get(CustomCalculoDAO.class).getPagosNoOrdinarioByGpoPago(idGrupoPago, nominaDTO.getNomIniPago(), nominaDTO.getNomFinPago());
        }

        List<TcIspt> listIspt = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("80");
        List<TcIspt> listBtos = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("REVA");
        ispt.setTablaBrutos(listBtos);
        ispt.setTablaIspt(listIspt);

        // Insercion de objeto pagoDTO en reglas de drools
        List<PagoDTO> listaPagoDTO = insertFact(listaPago, nominaDTO.getIdTipoNomina(), idNomina);

        // Ejecucion de reglas de drools
        List<Command> commands = new ArrayList<Command>();

        for (PagoDTO par: listaPagoDTO) {
            commands.add(CommandFactory.newInsert(par));
        }

        super.getRulesService().executeStatelessBatchRules(commands);
        logger.debug("\n\n--------------------> EJECUTA LAS REGLAS: ");
        return listaPagoDTO;
    }

    /**
     * Metodo encargado de generar listas de objetos de tipo Pago a PagoDTO
     * @author Daniel Cruz
     * @param listaPago List<Pago>
     * @return pagoDTOList List<PagoDTO>
     */
    private List<PagoDTO> insertFact(List<Pago> listaPago, String tipoNomina, int idNomina) {
        List<PagoDTO> pagoDTOList = new ArrayList<PagoDTO>();

        for (Pago pago: listaPago) {
            logger.debug("\n\n--------------------> TRABAJADOR: " + pago.getRfcEmpleado());
            PagoDTO pagoDTO = new PagoDTO();
            pagoDTO.setIdGrupoPago(pago.getIdGrupoPago());
            pagoDTO.setIdJerarquia(pago.getIdJerarquia());
            pagoDTO.setIdNivelPto(pago.getIdNivelPto());
            pagoDTO.setIdNombramiento(pago.getIdNombramiento());
            pagoDTO.setIdPlaza(pago.getIdPlaza());
            pagoDTO.setIdUnidadNomb(pago.getIdUnidadNomb());
            pagoDTO.setRfcEmpleado(pago.getRfcEmpleado());
            pagoDTO.setTabCompensacion(pago.getTabCompensacion());
            pagoDTO.setTabSueldo(pago.getTabSueldo());
            pagoDTO.setErario(pago.getErario());
            pagoDTO.setImpHonorario(pago.getImpHonorario());
            pagoDTO.setCotiza(pago.getCotiza());
            pagoDTO.setTabSueldoPre(pago.getTabSueldoPre());
            pagoDTO.setQuincenaMovimiento(pago.getQuincenaMovimiento());
            pagoDTO.setFecUltimoMovto(pago.getFecUltimoMovto());
            pagoDTO.setFecFinPago(pago.getFecFinPago());
            pagoDTO.setMovimiento(pago.getMovimiento());
            pagoDTO.setIncentivo(pago.getIncentivo());
            pagoDTO.setQuincena(pago.getQuincena());
            pagoDTO.setIdTipoNomina(tipoNomina);

            if (tipoNomina.contains("IN")) {
                pagoDTO.obtFactor();
            }

            ArrayList<ConceptoPagoDTO> conceptos = new ArrayList<ConceptoPagoDTO>();
            for (ConceptoPago conceptoPago: pago.getConceptos()) {
                conceptos.add(mapConceptoPagoToDTO(conceptoPago));
            }
            pagoDTO.setConceptos(conceptos);

            ArrayList<TdPensionDTO> pensiones = new ArrayList<TdPensionDTO>();
            for (TdPension pension: pago.getPensiones()) {
                pensiones.add(mapPensionToDTO(pension));
            }
            pagoDTO.setPensiones(pensiones);

            if (pagoDTO.isRetroactivo()) {
                logger.debug("\n\n--------------------> RETROACTIVO: " + pagoDTO.getRfcEmpleado());
                List<Integer> listIdNominas = new ArrayList<Integer>();
                listIdNominas.add(idNomina);
                retroactivo(pagoDTO, pago.getQuincena(), listIdNominas);
            }
            pagoDTOList.add(pagoDTO);
        } // CICLO POR CADA PAGO
        return pagoDTOList;
    }

    /**
     * Metodo encargado de verificar y calcular si a un empleado se le aplica retroactivo
     * @author Daniel Cruz
     * @param quincena int
     * @param pagoDTO PagoDTO
     */
    private void retroactivo(PagoDTO pagoDTO, int quincena, List<Integer> listIdNominas) {
        /************* CREA EL ARREGLO DONDE SE GUARDARAN LOS CALCULOS RETROACTIVOS **********************/
        pagoDTO.setConceptosReatroactivo(new ArrayList<TnConceptoPagadoDTO>());

        /************* VA AL HISTORICO POR LOS PAGOS ***********/
        List<HistoricoPago> historicoPago = super.persistence().get(CustomCalculoDAO.class).getHistoricoPagoByRfc(pagoDTO.getRfcEmpleado(), pagoDTO.getFecUltimoMovto(), listIdNominas);
        List<HistoricoPagoDTO> historicoPagos = super.transformation().map(historicoPago, HistoricoPagoDTO.class);

        /************* TIENE PAGOS ***********************/
        if (historicoPagos.size() > 0) {
            /************* CONSTRUYE VECTOR DE PAGOS POR QUINCENA DEL RETROACTIVO SEGUN FECHA DEL MOVIMIENTO **************/
            List<PagoDTO> pagosAnteriores = new ArrayList<PagoDTO>();
            QuincenaDTO qIni = new QuincenaDTO(pagoDTO.getFecUltimoMovto());
            QuincenaDTO qFin = new QuincenaDTO(quincena).sumaQuincenas(-1);
            QuincenaDTO base = new QuincenaDTO(qFin.getQuincena());
            List<QuincenaDTO> listaQnasPago = new ArrayList<QuincenaDTO>(base.listaDesde(qIni));

            for (QuincenaDTO q: listaQnasPago) {
                PagoDTO pagoAnterior = new PagoDTO();
                pagoAnterior.setQuincena(q.getQuincena());
                pagosAnteriores.add(pagoAnterior);
            }

            /************* CONSTRUYE VECTOR DE PAGOS HISTORICO POR QUINCENA SEGUN FECHAS DEL PAGO *******************/
            for (HistoricoPagoDTO h: historicoPagos) {
                QuincenaDTO qnaFin = new QuincenaDTO(h.getFecFinPago());
                QuincenaDTO qnaIni = new QuincenaDTO(h.getFecIniPago());
                QuincenaDTO bq = new QuincenaDTO(qnaFin.getQuincena());
                List<QuincenaDTO> qs = new ArrayList<QuincenaDTO>(bq.listaDesde(qnaIni));

                /********* PARA CADA PAGO QUINCENAL DEL RETROACTIVO BUSCA SU PAGO DEL HISTORICO ********************/
                for (PagoDTO pagoAnt: pagosAnteriores) {
                    for (QuincenaDTO q: qs) {
                        if (pagoAnt.getQuincena() == q.getQuincena()) {
                            pagoAnt.setRetroactivo(false);
                            pagoAnt.setFactor(1.0);
                            //..
                            pagoAnt.setRfcEmpleado(h.getRfcEmpleado());
                            pagoAnt.setCotiza(pagoDTO.getCotiza());
                            pagoAnt.setErario(pagoDTO.getErario());
                            pagoAnt.setIdGrupoPago(h.getIdGrupoPago());
                            pagoAnt.setIdJerarquia(h.getIdJerarquia());
                            pagoAnt.setIdNivelPto(h.getIdNivelPto());
                            pagoAnt.setIdNombramiento(h.getIdNombramiento());
                            pagoAnt.setIdPlaza(h.getIdPlaza());
                            pagoAnt.setIdUnidadNomb(String.valueOf(h.getIdUnidadNomb()));
                            pagoAnt.setImpHonorario(pagoDTO.getImpHonorario());
                            pagoAnt.setIncentivo(pagoDTO.getIncentivo());
                            pagoAnt.setPension(false);
                            pagoAnt.setTabCompensacion(h.getTabCompensacion());
                            pagoAnt.setTabSueldo(h.getTabSueldo());
                            pagoAnt.setIdTipoNomina("OR");
                            // TERMINA DE ASIGNAR
                            pagoAnt.setConceptos(pagoDTO.getConceptos());
                            // CALCULA
                            if (calculaObjeto(pagoAnt) == true) {
                                //calcula diferencias
                                List<TnConceptoPagadoDTO> cptos = pagoAnt.getConceptosPagados();
                                for (TnConceptoPagadoDTO c: cptos) {
                                    if (pagoDTO.tieneConceptoRetroactivo(c.getIdTipoCpto(), c.getIdCptoPago())) {
                                        String cpto = c.getIdTipoCpto().trim() + c.getIdCptoPago().trim();
                                        pagoDTO.acumulaMontoConceptoRetroactivo(cpto, c.getCpMonto());
                                    } else {
                                        pagoDTO.setAgregaConceptoRetroactivo(1, c.getIdTipoCpto(), c.getIdCptoPago(), c.getCpMonto());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } // NO TIENE PAGOS
    }

    /**
     * Metodo encargado del calculo individual con base en el objeto PagoDTO
     * @author Daniel Cruz
     * @param p PagoDTO
     * @return boolean
     */
    private boolean calculaObjeto(PagoDTO p) {
        CalculoIspt ispt = new CalculoIspt();

        List<TcIspt> listIspt = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("80");
        List<TcIspt> listBtos = super.persistence().get(QueryTcIsptDAO.class).getCatalogoByTipo("REVA");
        ispt.setTablaBrutos(listBtos);
        ispt.setTablaIspt(listIspt);

        p.setConceptosPagados(new ArrayList<TnConceptoPagadoDTO>());
        super.getRulesService().executeStatelessRules(p);
        return true;
    }


    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author
     * @param listaPagos List PagoDTO
     * @param idQna int
     * @param user String
     */
    public void saveNominaCompleta(List<PagoDTO> listaPagos, int idQna, String user) {
        // se actualiza el status de vigente en la quincena seleccionada.
        updateStatusNominaQna(idQna);

        // se borra la tabla de paso.
        deleteCalculoNominaQna(idQna);

        // se realiza la insercion.
        saveCalculoNominaQna(listaPagos, idQna, user);
    }

    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author Oscar S.
     * @param listaPagos List PagoDTO
     * @param idQna int
     * @param user String
     */
    public void saveNominaCompletaGpoPago(List<PagoDTO> listaPagos, int idQna, String user) {
        // se borra la tabla de paso.
        deleteCalculoNominaQna(idQna);

        // se realiza la insercion.
        saveCalculoNominaQna(listaPagos, idQna, user);
    }

    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @param idQna int
     * @author Oscar S.
     */
    public void updateStatusProcesandoNominaQna(int idQna) {
        super.persistence().get(CustomCalculoDAO.class).updateStatusProcesandoNominaQna(idQna);
    }

    public void saveNominaRFC(PagoDTO pago, int idQna, int idPlaza, String rfc, String user) {
        updateCalculoNominaQna(pago, idQna, idPlaza, user);
    }

    /**
     * Metodo encargado de actualizar el status de vigente en la quincena seleccionada.
     * @author Oscar S.
     * @param idQna int
     */
    private void updateStatusNominaQna(int idQna) {
        super.persistence().get(CustomCalculoDAO.class).updateStatusNominaQna(idQna);
    }

    /**
     * Metodo encargado de ejecutar el borrado de la tabla de paso.
     * @author Oscar S.
     * @param idQna int
     */
    private void deleteCalculoNominaQna(int idQna) {
        super.persistence().get(CustomCalculoDAO.class).deleteCalculoNominaQna(idQna);
    }

    /**
     * Metodo encargado de ejecutar la insercion en la tabla de paso.
     * @author Oscar S.
     * @param listaPagos List<PagoDTO>
     * @param idQna int
     * @param username String
     */
    private void saveCalculoNominaQna(List<PagoDTO> listaPagos, int idQna, String username) {
        List<HashMap<String, Object>> listaMapasPago = new ArrayList<HashMap<String, Object>>();

        HashMap<String, Object> mapaPago;
        StringBuffer cadenaConceptosPago;
        int qna = super.persistence().get(CustomCalculoDAO.class).getQuincenaVigente();
        QuincenaDTO qnaProceso = new QuincenaDTO(qna);

        for (PagoDTO pagoDTO: listaPagos) {
            pagoDTO.calculaLiquido();
            mapaPago = new HashMap<String, Object>();
            mapaPago.put("idPlaza", pagoDTO.getIdPlaza());
            mapaPago.put("idQna", new Integer(idQna));
            mapaPago.put("rfc", pagoDTO.getRfcEmpleado());
            mapaPago.put("folio", 0);
            
            if (pagoDTO.isRetroactivo()) {
                mapaPago.put("cnqIniPago", pagoDTO.getFecUltimoMovto());
                mapaPago.put("cnqFinPago", qnaProceso.getFechaFinal());
            } else if (pagoDTO.getIdTipoNomina().contains("IN")) {
                mapaPago.put("cnqIniPago", pagoDTO.getFecUltimoMovto());
                mapaPago.put("cnqFinPago", pagoDTO.getFecFinPago());
            } else {
                mapaPago.put("cnqIniPago", qnaProceso.getFechaInicial());
                mapaPago.put("cnqFinPago", qnaProceso.getFechaFinal());
            }
            mapaPago.put("liquido", new Double(pagoDTO.getLiquido()));
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

    private void updateCalculoNominaQna(PagoDTO pagoDTO, int idQna, int idPlaza, String user) {
        pagoDTO.calculaLiquido();
        HashMap<String, Object> mapaPago = new HashMap<String, Object>();
        mapaPago.put("idPlaza", pagoDTO.getIdPlaza());
        mapaPago.put("idQna", idQna);
        mapaPago.put("rfc", pagoDTO.getRfcEmpleado());
        mapaPago.put("liquido", pagoDTO.getLiquido());
        mapaPago.put("usuario", user);

        StringBuffer cadenaConceptosPago = new StringBuffer();
        for (TnConceptoPagadoDTO conceptoPagado: pagoDTO.getConceptosPagados()) {
            cadenaConceptosPago.append(conceptoPagado.getCpNumConcepto()).append(";").append(conceptoPagado.getIdTipoCpto()).append(";").append(conceptoPagado.getIdCptoPago()).append(";").append(conceptoPagado.getCpMonto()).append("|");
        }
        if (cadenaConceptosPago.length() > 0) {
            cadenaConceptosPago.delete(cadenaConceptosPago.length() - 1, cadenaConceptosPago.length());
        }

        mapaPago.put("cadenaConceptosPago", cadenaConceptosPago.toString());
        super.persistence().get(CustomCalculoDAO.class).updateCalculoNominaQna(mapaPago);
    }

    public TcGrupoPagoDTO getGrupoPago(String idGrupoPago) {
        TcGrupoPago tcGrupoPago = super.persistence().get(TcGrupoPagoDAO.class).getById(idGrupoPago);
        return super.transformation().map(tcGrupoPago, TcGrupoPagoDTO.class);
    }

    /**
     * Casos muestra
     * @author 
     * @param idGrupoPago String
     * @param idQna int
     */
     public List<String> getRFCsCasosMuestra(String idGrupoPago, int idQna) {
        return super.persistence().get(CustomCalculoDAO.class).getRFCsCasosMuestra(idGrupoPago, idQna);
    }

    public List<TcConceptoPagoDTO> getDescripcionesConceptosPago() {
        List<TcConceptoPagoDTO> listaPagosDTO = new ArrayList<TcConceptoPagoDTO>();
        List<TcConceptoPago> listaConceptosPago = super.persistence().get(CustomConceptoPagoDAO.class).getConceptosPago();
        TcConceptoPagoDTO conceptoPago;
        
        for (TcConceptoPago pago: listaConceptosPago) {
            conceptoPago = new TcConceptoPagoDTO();
            conceptoPago.setIdTipoCpto(pago.getIdTipoCpto());
            conceptoPago.setIdConcepto(pago.getIdConcepto());
            conceptoPago.setDescConPag(pago.getDescConPag());
            listaPagosDTO.add(conceptoPago);
        }
        return listaPagosDTO;
    }

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List String
     */
    public void updateAndSetCasosMuestra(List<String> casosMuestra) {
        super.persistence().get(CustomCalculoDAO.class).updateAndSetCasosMuestra(casosMuestra);
    }

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List String
     */
    public void updateAndUnsetCasosMuestra(List<String> casosMuestra) {
        super.persistence().get(CustomCalculoDAO.class).updateAndUnsetCasosMuestra(casosMuestra);
    }

    private ConceptoPagoDTO mapConceptoPagoToDTO(ConceptoPago conceptoPago) {
        ConceptoPagoDTO conceptoPagoDTO = new ConceptoPagoDTO();
        conceptoPagoDTO.setIdMovtoConceptoPago(conceptoPago.getIdMovtoConceptoPago());
        conceptoPagoDTO.setIdTipoCpto(conceptoPago.getIdTipoCpto());
        conceptoPagoDTO.setIdConcepto(conceptoPago.getIdConcepto());
        conceptoPagoDTO.setMonto(conceptoPago.getMonto());
        conceptoPagoDTO.setPorcentaje(conceptoPago.getPorcentaje());
        conceptoPagoDTO.setFecIncidencia(conceptoPago.getFecIncidencia());
        conceptoPagoDTO.setQnaFin(conceptoPago.getQnaFin());
        conceptoPagoDTO.setQnaIni(conceptoPago.getQnaIni());
        conceptoPagoDTO.setQnaAplicadas(conceptoPago.getQnaAplicadas());
        conceptoPagoDTO.setQnaADescontar(conceptoPago.getQnaADescontar());
        conceptoPagoDTO.setMontoAdeudo(conceptoPago.getMontoAdeudo());
        conceptoPagoDTO.setQnasAdeudo(conceptoPago.getQnasAdeudo());
        return conceptoPagoDTO;
    }

    private TdPensionDTO mapPensionToDTO(TdPension pension) {
        TdPensionDTO tdPensionDTO = new TdPensionDTO();
        tdPensionDTO.setIdPension(pension.getIdPension());
        tdPensionDTO.setNumPension(pension.getNumPension());
        tdPensionDTO.setBeneficiariaPension(pension.getBeneficiariaPension());
        tdPensionDTO.setClabePension(pension.getClabePension());
        tdPensionDTO.setCptosPorcentaje(pension.getCptosPorcentaje());
        tdPensionDTO.setFecModifico(pension.getFecModifico());
        tdPensionDTO.setIdZonaDist(pension.getIdZonaDist());
        tdPensionDTO.setMontoAdeudo(pension.getMontoAdeudo());
        tdPensionDTO.setMontoPension(pension.getMontoPension());
        tdPensionDTO.setPorcentajePension(pension.getPorcentajePension());
        tdPensionDTO.setQnaAplicaAdeudo(pension.getQnaAplicaAdeudo());
        tdPensionDTO.setQnaCapturaAdeudo(pension.getQnaCapturaAdeudo());
        tdPensionDTO.setQnaCapturaPension(pension.getQnaCapturaPension());
        tdPensionDTO.setQnaDescAdeudo(pension.getQnaDescAdeudo());
        tdPensionDTO.setReferenciaPension(pension.getReferenciaPension());
        tdPensionDTO.setRefAdeudoPension(pension.getRefAdeudoPension());
        tdPensionDTO.setRfcPension(pension.getRfcPension());
        tdPensionDTO.setStatusPension(pension.getStatusPension());
        tdPensionDTO.setUltQnaProcesaAdeudo(pension.getUltQnaProcesaAdeudo());
        tdPensionDTO.setUsuario(pension.getUsuario());
        return tdPensionDTO;
    }

    public GeneracionCecobanDTO preparaGeneracionCecoban() {
        GeneracionCecobanDTO generacionCecobanDTO = new GeneracionCecobanDTO();
        Integer quincenaCaptura = getQuincenaCaptura().getRcQnaCaptura();
        List<SelectIntegerStringDTO> listaNumArchivo = new ArrayList<SelectIntegerStringDTO>();

        for (int i = 1; i <= 50; i++) {
            listaNumArchivo.add(new SelectIntegerStringDTO(i, String.valueOf(i)));
        }

        generacionCecobanDTO.setListaNumArchivo(listaNumArchivo);
        generacionCecobanDTO.setFilterRcQnaCaptura(quincenaCaptura);
        generacionCecobanDTO.setListaQuincenas(generaListaQuincenas(SirehUtils.substractQuincena(quincenaCaptura, 24), SirehUtils.substractQuincena(quincenaCaptura, 1)));
        generacionCecobanDTO.setIsGenerar(Boolean.TRUE);

        return generacionCecobanDTO;
    }

    public GeneracionCecobanDTO generarArchivoCecoban(GeneracionCecobanDTO generacionCecobanDTO) {
        // Llamada al stored prodecure
        SimpleDateFormat formato = new SimpleDateFormat(formatoFecha);
        SimpleDateFormat formatoFechaArchivo = new SimpleDateFormat(formatoFechaFile);
        String pQuincena = generacionCecobanDTO.getRcQnaCaptura() != null ? generacionCecobanDTO.getRcQnaCaptura().toString() : "";
        String pComplemento = generacionCecobanDTO.getHpNumComplem();
        String pTipo = generacionCecobanDTO.getIdTipoNomina();
        String pFechaPr = formato.format(generacionCecobanDTO.getFecPresentacion());
        String pFechaPa = formato.format(generacionCecobanDTO.getFecTransferencia());
        Integer pNumArch = generacionCecobanDTO.getNumArchivo();
        Date pFechaJuliano = generacionCecobanDTO.getFecPresentacion();
        TnRegControl tnRegControl = getQuincenaCaptura();
        Integer pMaximo = tnRegControl.getRcConsecEmp();

        // Si el campo RC_CONSEC_EMP de la quincena vigente es nulo, se envia un error
        if(pMaximo == null){
            super.throwServiceException("Imposible obtener el consecutivo del campo RC_CONSEC_EMP de la tabla TN_REG_CONTROL");
        }
        
        
        
        List<CustomTdCecoban> listaCustomTdCecoban = 
            super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpArchivoCecoban(pQuincena, pComplemento, 
                                                                                          pTipo, pFechaPr, pFechaPa, 
                                                                                          pNumArch, INICIO_SECUENCIA, 
                                                                                          pFechaJuliano, pMaximo);
                                                                                   
        List<TnNomina> tnNomina = super.persistence().get(QueryTnNominaDAO.class).findByQnaCapturaComplementoTipo(Integer.valueOf(pQuincena), pComplemento, pTipo);

        Calendar cal_fecha_presentacion = Calendar.getInstance();
        cal_fecha_presentacion.setTime(generacionCecobanDTO.getFecPresentacion());

        String dia = cal_fecha_presentacion.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + 
                     cal_fecha_presentacion.get(Calendar.DAY_OF_MONTH) : "" + 
                     cal_fecha_presentacion.get(Calendar.DAY_OF_MONTH);

        String oficina = "";
        if(tnNomina != null && !tnNomina.isEmpty() && tnNomina.size() == 1 && tnNomina.get(0).getNomFuenteDatos() != null && tnNomina.get(0).getNomFuenteDatos().equals("O") ){
            oficina = OFICINA_G00;
        } else {
           oficina = pTipo != null && pTipo.equals(ID_TP_NOMINA_FONAC) ? OFICINA_FO : OFICINA_OR;
        }

        String consecutivo = generacionCecobanDTO.getNumArchivo() < 10 ? "0" + generacionCecobanDTO.getNumArchivo() : 
                                        generacionCecobanDTO.getNumArchivo().toString(); 
        StringBuffer contenidoArchivo = new StringBuffer("");

        String header = 
            TIPO_REGISTRO_ENCABEZADO + NUMERO_SECUENCIA + CODIGO_OPERACION + CLABE_INSTITUCION + SENTIDO + SERVICIO + 
            dia + oficina + consecutivo + formatoFechaArchivo.format(generacionCecobanDTO.getFecPresentacion()) + CODIGO_DIVISA + 
            CAUSA_RECHAZO_BLOQUE + MODALIDAD_PROGRAMADOS + 
            "                                                                                                                                                                                                                                                                                                                                                                                                  ";
        contenidoArchivo.append(header).append(FIN_DE_LINEA);
        BigDecimal monto = BigDecimal.valueOf(0);

        if (listaCustomTdCecoban != null && !listaCustomTdCecoban.isEmpty()) {
            for (CustomTdCecoban customTdCecoban: listaCustomTdCecoban) {
                String importeEntero = customTdCecoban.getPUno().substring(27, 40);
                String importeDecimal = customTdCecoban.getPUno().substring(40, 42);
                monto = monto.add(BigDecimal.valueOf(Double.valueOf(importeEntero + "." + importeDecimal).doubleValue()));
                contenidoArchivo.append(customTdCecoban.getPUno()).append(customTdCecoban.getPDos()).append(FIN_DE_LINEA);
            }
        }
        generacionCecobanDTO.setNumeroCasos(listaCustomTdCecoban.size());
        DecimalFormat df = new DecimalFormat(formatoDecimal);
        generacionCecobanDTO.setMonto(df.format(monto));

        String numeroSecuenciaSumario = StringUtils.leftPad("" + (listaCustomTdCecoban.size() + 2), 7, '0');
        String numOperaciones = StringUtils.leftPad("" + (listaCustomTdCecoban.size()), 7, '0');
        String importeTotal = StringUtils.leftPad("" + monto.intValue(), 16, '0') + 
                              StringUtils.leftPad("" + monto.subtract(BigDecimal.valueOf(monto.intValue())).multiply(BigDecimal.valueOf(100)).intValue(), 2, '0');

        String sumario = TIPO_REGISTRO + numeroSecuenciaSumario + CODIGO_OPERACION + dia + oficina + consecutivo + numOperaciones + importeTotal + 
            "                                                                                                                                                                                                                                                                                                                                                                                           " + 
            FIN_DE_LINEA;
        contenidoArchivo.append(sumario);
        
        byte[] data = contenidoArchivo.toString().getBytes();
        String nameFileDat = UUID.randomUUID().toString() + EXTENSION_FILE_DAT;
        String nombreArchivoUser = FILE_CECOBAN + SEPARATOR_GUION_BAJO + (pTipo != null && pTipo.equals(ID_TP_NOMINA_FONAC) ? ID_UNIDAD_RECURSOS_HUMANOS : ID_UNIDAD_RECURSOS_FINANCIEROS) + SEPARATOR_GUION_BAJO + generacionCecobanDTO.getIdTipoNomina() + 
                                   SEPARATOR_GUION_BAJO + generacionCecobanDTO.getRcQnaCaptura() + generacionCecobanDTO.getHpNumComplem() + 
                                   formatoFechaArchivo.format(new Date()) + SEPARATOR_GUION_BAJO + generacionCecobanDTO.getNumArchivo() + 
                                   EXTENSION_FILE_DAT;
        try {
            String rutaArchivo = super.configuration().getString("local.temp.dir");
            File file = new File(rutaArchivo + File.separator + nameFileDat);
            FileOutputStream fos;

            fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();

            generacionCecobanDTO.setNombreArchivo(nameFileDat);
            generacionCecobanDTO.setRutaArchivo(rutaArchivo);
            generacionCecobanDTO.setNombreArchivoUser(nombreArchivoUser);
            generacionCecobanDTO.setIsGenerar(Boolean.FALSE);
        } catch (FileNotFoundException e) {
            logger.debug("Exception: " + e.toString());
        } catch (IOException e) {
            logger.debug("Exception: " + e.toString());
        }
        tnRegControl.setRcConsecEmp(pMaximo + generacionCecobanDTO.getNumeroCasos());
        super.persistence().get(TnRegControlDAO.class).save(tnRegControl);
        return generacionCecobanDTO;
    }

    public List<SelectIntegerStringDTO> generaListaQuincenas(Integer quincenaOrigen, Integer quincenaDestino) {
        List<SelectIntegerStringDTO> listaQuincenas = new ArrayList<SelectIntegerStringDTO>();
        Integer qnaOrigen = Integer.parseInt(quincenaOrigen.toString().substring(4));
        Integer qnaDestino = Integer.parseInt(quincenaDestino.toString().substring(4));
        Integer anioOrigen = Integer.parseInt(quincenaOrigen.toString().substring(0, 4));
        Integer anioDestino = Integer.parseInt(quincenaDestino.toString().substring(0, 4));

        do {
            listaQuincenas.add(new SelectIntegerStringDTO(Integer.parseInt("" + anioOrigen + "" + 
                                                                          (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)), "" + 
                                                                          anioOrigen + "" + 
                                                                          (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)));
            qnaOrigen++;
            if (qnaOrigen == 29) {
                qnaOrigen = 1;
                anioOrigen++;
            }
        } while (qnaOrigen < qnaDestino || anioOrigen < anioDestino);
        listaQuincenas.add(new SelectIntegerStringDTO(Integer.parseInt("" + anioOrigen + "" + 
                                                                      (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)), "" + 
                                                                      anioOrigen + "" + 
                                                                      (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)));

        return listaQuincenas;
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

    public Object execute(Object fact) {
        return null;
    }

    public Integer getQuincenaCapturaasInteger() {
        return getQuincenaCaptura().getRcQnaCaptura();
    }

    public void cierreNomina(int idQna) {
        super.persistence().get(CustomCalculoDAO.class).cierreNomina(idQna);
    }

    public Boolean validaCierreNomina(int idQna) {
        List<TnNomina> nominas = super.persistence().get(TnNominaDAO.class).findByNomQnaCaptura(idQna);
        Boolean valida = null;
        for (TnNomina nom: nominas) {
            if (nom.getIdEdoNom().equals("N") || nom.getIdEdoNom().equals("P")) {
                valida = false;
            } else {
                valida = true;
            }
        }
        return valida;
    }

    public void obtienePeriodoLaboradoIS(String letra, String fecIni, String fecFin, Integer qnaProceso, 
                                         Integer qnaIni, Integer qnaFin, String tabAnt, String tabNvo, 
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, 
                                         BigDecimal serviciosAnt, BigDecimal transporteAnt, BigDecimal compensacionNva, 
                                         BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, 
                                         BigDecimal transporteNva) {
        super.persistence().get(CustomCalculoDAO.class).obtienePeriodoLaboradoIS(letra, fecIni, fecFin, qnaProceso, 
                                                                                 qnaIni, qnaFin, tabAnt, tabNvo, 
                                                                                 compensacionAnt, despensaAnt, 
                                                                                 previsionAnt, serviciosAnt, 
                                                                                 transporteAnt, compensacionNva, 
                                                                                 despensaNva, previsionNva, 
                                                                                 serviciosNva, transporteNva);
    }
    
    public void obtienePeriodoLaboradomIS(String letra, String fecIni, String fecFin, Integer qnaProceso, 
                                         Integer qnaIni, Integer qnaFin, String tabAnt, String tabNvo, 
                                         BigDecimal compensacionAnt1, BigDecimal despensaAnt, BigDecimal previsionAnt1, 
                                         BigDecimal serviciosAnt1, BigDecimal transporteAnt1, BigDecimal compensacionNva1, 
                                         BigDecimal despensaNva, BigDecimal previsionNva1, BigDecimal serviciosNva1, 
                                         BigDecimal transporteNva1) {
        super.persistence().get(CustomCalculoDAO.class).obtienePeriodoLaboradomIS(letra, fecIni, fecFin, qnaProceso, 
                                                                                 qnaIni, qnaFin, tabAnt, tabNvo, 
                                                                                 compensacionAnt1, despensaAnt, 
                                                                                 previsionAnt1, serviciosAnt1, 
                                                                                 transporteAnt1, compensacionNva1, 
                                                                                 despensaNva, previsionNva1, 
                                                                                 serviciosNva1, transporteNva1);
    }

    public List<FinContratoDTO> finContrato(String qnaFinContrato) {
        Integer ANIO_qnaFinCto = new Integer(qnaFinContrato.substring(0, 4));
        Integer QNA_qnaFinCto = new Integer(qnaFinContrato.substring(4));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Integer MES_qnaFinCto = null;
        Integer DIA_qnaFinCto = null;
        Date fFinContrato = null;

        if ((QNA_qnaFinCto % 2) == 0) {
            MES_qnaFinCto = QNA_qnaFinCto / 2;
            Calendar gCalendar = new GregorianCalendar();
            gCalendar.set(Calendar.YEAR, ANIO_qnaFinCto.intValue());
            gCalendar.set(Calendar.MONTH, MES_qnaFinCto.intValue() - 1);
            //calendario.set(ANIO_qnaFinCto.intValue(),MES_qnaFinCto.intValue());
            DIA_qnaFinCto = gCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            logger.debug("*************");
        } else {
            if (QNA_qnaFinCto == 1) {
                MES_qnaFinCto = 1;
            } else {
                MES_qnaFinCto = Math.abs(QNA_qnaFinCto / 2) + 1;
            }
            DIA_qnaFinCto = new Integer(15);
        }

        String sfFinContrato = ANIO_qnaFinCto + "-" + MES_qnaFinCto + "-" + DIA_qnaFinCto;

        try {
            fFinContrato = sdf.parse(sfFinContrato);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<FinContrato> dPlazas = super.persistence().get(QueryTnHistoricoPagoDAO.class).finContratos(fFinContrato);

        return super.transformation().map(dPlazas, FinContratoDTO.class);

    }
}
