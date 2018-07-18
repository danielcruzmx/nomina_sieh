package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.jdbc.expression.AbstractCondition;
import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.domain.jdbc.ConceptoPago;
import gob.shcp.sireh.domain.jdbc.HistoricoPago;
import gob.shcp.sireh.domain.jdbc.Pago;
import gob.shcp.sireh.domain.jdbc.Quincena;
import gob.shcp.sireh.domain.jdbc.TdPension;
import gob.shcp.sireh.domain.jdbc.TnRegControl;

import java.io.FileInputStream;

import java.math.BigDecimal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.object.StoredProcedure;

public class CustomCalculoDAOImpl extends JdbcDAO implements CustomCalculoDAO {

    public Map<String, Object> getNominaById(int idQna) {
        String listaNominasQnaPorQna = super.getQueryDefinition("queryNominasQnaPorQna");
        return super.getJdbcTemplate().queryForObject(listaNominasQnaPorQna, new NominaRM(), idQna);
    }

    public Map<String, Object> getNominaByIdExtraordinaria(int idQna) {
        String listaNominasQnaPorQna = super.getQueryDefinition("queryNominasQnaPorQnaExtraordinaria");
        return super.getJdbcTemplate().queryForObject(listaNominasQnaPorQna, new NominaRM(), idQna);
    }

    public Map<String, Object> getNominaByIdIncentivo(int idQna) {
        String listaNominasQnaPorQna = super.getQueryDefinition("queryNominasQnaPorQnaIncentivo");
        return super.getJdbcTemplate().queryForObject(listaNominasQnaPorQna, new NominaRM(), idQna);
    }

    public Map<String, Object> getDatosNominaById(int idQna) {
        String listaNominasQnaPorQna = super.getQueryDefinition("nominaById");
        return super.getJdbcTemplate().queryForObject(listaNominasQnaPorQna, new NominaRM(), idQna);
    }

    /**
     * Metodo encargado de calcular datos de nómina con base en el rfc del empleado.
     * @author
     * @param rfc String
     * @param dimensions Map<String, Map<String, String>>
     * @param operationalYear String
     * @return pago Pago
     */
    public Pago getPagoByRFC(String rfc, Map<String, Map<String, String>> dimensions, String operationalYear) {
        final List pagoByRfcValues = new ArrayList();
        final List conceptosPagoByRfcValues = new ArrayList();
        final List pensionesByRfcValues = new ArrayList();

        String pagoByRfc = parseQuery("pagoByRfc", operationalYear, dimensions, null, new Object[] { rfc }, pagoByRfcValues);
        String ConceptosPagoByRfc = parseQuery("ConceptosPagoByRfc", operationalYear, dimensions, null, new Object[] { rfc }, conceptosPagoByRfcValues);
        String pensionesByRfc = parseQuery("pensionesByRfc", operationalYear, dimensions, null, new Object[] { rfc }, pensionesByRfcValues);

        Pago pago = null;
        try {
            pago = super.getJdbcTemplate().queryForObject(pagoByRfc, new PagoByRFC(), pagoByRfcValues.toArray(new Object[] { }));
            pago.setConceptos(super.getJdbcTemplate().query(ConceptosPagoByRfc, new ConceptoPagoRM(), conceptosPagoByRfcValues.toArray(new Object[] { })));
            pago.setPensiones(super.getJdbcTemplate().query(pensionesByRfc, new PensionRM(), pensionesByRfcValues.toArray(new Object[] { })));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pago;
    }

    /**
     * Metodo encargado de calcular datos de nómina con base en el id de la plaza.
     * @author
     * @param idPlaza String
     * @return pago Pago
     */
    public Pago getPagoByPlaza(String idPlaza) {
        String pagoByPlaza = super.getQueryDefinition("pagoByPlaza");
        Pago pago = null;

        try {
            pago = super.getJdbcTemplate().queryForObject(pagoByPlaza, new PagoByPlazaRM(), idPlaza);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pago;
    }

    /**
     * Metodo encargado de calcular datos de nómina con base en el id de la plaza.
     * @author
     * @param idPlaza String
     * @return pago Pago
     */
    public Pago getPagoByPlaza(String idPlaza, String rfcEmpleado) {
        String pagoByPlaza = super.getQueryDefinition("pagoByPlaza");
        Pago pago = null;
        String delimiter = "[|]";
        String[] tokens = null;

        try {
            pago = super.getJdbcTemplate().queryForObject(pagoByPlaza, new PagoByPlazaRM(), idPlaza);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return pago;
    }

    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author
     * @param idGrupoPago String
     * @return pagos List<Pago>
     */
    public List<Pago> getPagosByGpoPago( String operationalYear, Map<String, Map<String, String>> dimensions, String nomFuenteDatos, String idGrupoPago) {

        String pagoByGpoPago = super.getQueryDefinition("pagoByGpoPago");
        List outValues = new ArrayList();
        String parsedPagoByGpoPago =  super.parseQuery("pagoByGpoPago", operationalYear, dimensions,  new ArrayList<AbstractCondition>(),  new Object[]{nomFuenteDatos, idGrupoPago},  outValues);
        logger.warn("parsedPagoByGpoPago " + parsedPagoByGpoPago);
        String conceptosPagoByGpoPago = super.getQueryDefinition("conceptosPagoByGpoPago");
        String pensionesByGpoPago = super.getQueryDefinition("pensionesByGpoPago");

        super.getJdbcTemplate().setFetchSize(100);
//        Map<String, String> dimensiones = dimensions.get("sirehunidad");
//        List<String> lista = new ArrayList<String>();
//        for(Map.Entry<String, String> entry : dimensiones.entrySet()){
//            lista.add(entry.getKey());
//        }

//        List<Pago> pagos = super.getJdbcTemplate().query(parsedPagoByGpoPago, new Object[] { outValues.toArray(new Object[] { })  }, new int[] { Types.VARCHAR }, new PagoRSExt());
        List<Map<String, Object>> rs =  super.getJdbcTemplate().queryForList(parsedPagoByGpoPago, outValues.toArray(new Object[] { }) );
        logger.warn(rs);
        List<Pago> pagos = extractData(rs);
        super.getJdbcTemplate().setFetchSize(1000);
        List<ConceptoPago> conceptos = super.getJdbcTemplate().query(conceptosPagoByGpoPago, new ConceptoPagoRM(), new Object[] { idGrupoPago });

        super.getJdbcTemplate().setFetchSize(100);
        List<TdPension> pensiones = super.getJdbcTemplate().query(pensionesByGpoPago, new PensionRM(), new Object[] { idGrupoPago });

        setConceptosPensiones(pagos, conceptos, pensiones);

        return pagos;
    }
    
    public List<Pago> extractData(List<Map<String, Object>> rs)  {
        List<Pago> listaPagos = new ArrayList<Pago>();
        for(Map<String, Object> map : rs){
            gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();    
            
            pago.setRfcEmpleado(map.get("RFC_EMPLEADO") != null ? map.get("RFC_EMPLEADO").toString() : null);
            pago.setCurpEmpleado(map.get("CURP_EMPLEADO") != null ? map.get("CURP_EMPLEADO").toString() : null);
            pago.setNssEmpleado(map.get("IMSS_ISSSTE") != null ? map.get("IMSS_ISSSTE").toString(): null);
            pago.setNumPension( map.get("NUM_PENSION") != null ? map.get("NUM_PENSION").toString(): null);
            pago.setNombreEmpleado(map.get("NOMBRE_EMPLEADO") != null ? map.get("NOMBRE_EMPLEADO").toString() : null );
            pago.setPrimerApellido(map.get("PRIMER_APELLIDO") != null ? map.get("PRIMER_APELLIDO").toString() : null );
            pago.setSegundoApellido(map.get("SEGUNDO_APELLIDO") != null ? map.get("SEGUNDO_APELLIDO").toString() : null );
            pago.setCotiza(map.get("COMPAT_EMPLEO") != null ? map.get("COMPAT_EMPLEO").toString() : null );
            pago.setIdPlaza(map.get("ID_PLAZA") != null ? Integer.valueOf( map.get("ID_PLAZA").toString()): null);
            pago.setIdPuestoNom(map.get("ID_PUESTO_NOM") != null ? map.get("ID_PUESTO_NOM").toString() : null);
            pago.setDescPuestoNom(map.get("DESC_PUESTO") != null ?  map.get("DESC_PUESTO").toString() : null);
            pago.setIdUnidadNomb(map.get("ID_UNIDAD_NOM") != null ? map.get("ID_UNIDAD_NOM").toString() : null);
            pago.setDescUnidadNomb(map.get("DESC_UNIDAD") != null ? map.get("DESC_UNIDAD").toString(): null);
            pago.setIdGrupoPago(map.get("ID_GRUPO_PAGO") != null ? map.get("ID_GRUPO_PAGO").toString() : null);
            pago.setIdZonaDistNom(map.get("ID_ZONA_DIST_NOM") != null ? Integer.valueOf( map.get("ID_ZONA_DIST_NOM").toString()) : null);
            pago.setImpHonorario(map.get("PLAZA_IMP_HONO") != null ? (Double.valueOf( map.get("PLAZA_IMP_HONO").toString())) : null);

            pago.setQuincenaMovimiento(map.get("PLAZA_QNA_CAPTURA") != null ? Integer.valueOf( map.get("PLAZA_QNA_CAPTURA").toString()): null);
            pago.setFecUltimoMovto(map.get("PLAZA_ULTIMO_MOVTO") != null ? (Date) map.get("PLAZA_ULTIMO_MOVTO") : null);
            pago.setMovimiento(map.get("ID_MOVTO_PERSONA") != null ? Integer.valueOf( map.get("ID_MOVTO_PERSONA").toString()) : null);
            // Retroactivo
            pago.setQuincena(getQuincenaVigente());
            pago.setIncentivo( map.get("AP_INCENTIVO") != null ? Double.valueOf( map.get("AP_INCENTIVO").toString()) : null);

            pago.setDescGrupoPago(map.get("DESC_GRUPO_PAGO") != null ? map.get("DESC_GRUPO_PAGO").toString() : null);
            pago.setIdNivelPto(map.get("ID_NIVEL_PTO") != null ? map.get("ID_NIVEL_PTO").toString() : null);
            pago.setIdNivelPtoPre(map.get("ID_NIVEL_PRE") != null ? map.get("ID_NIVEL_PRE").toString() : null );
            pago.setIdNombramiento(map.get("ID_NOMBRAMIENTO") != null ? map.get("ID_NOMBRAMIENTO").toString() : null );
            pago.setIdJerarquia(map.get("ID_JERARQUIA") != null ? map.get("ID_JERARQUIA").toString() : null);
            pago.setErario( map.get("AP_ERARIO_FEDERAL") != null ? map.get("AP_ERARIO_FEDERAL").toString() : null );
            pago.setDescNombramiento(map.get("DESC_NOMBRAMIENTO") != null ? map.get("DESC_NOMBRAMIENTO").toString() : null );
            pago.setDescJerarquia(map.get("DESC_JERARQUIA") != null ? map.get("DESC_JERARQUIA").toString() : null );
            pago.setTabSueldo(map.get("TAB_SUELDO") != null ? Double.valueOf(  map.get("TAB_SUELDO").toString()) : null );
            pago.setTabCompensacion( map.get("TAB_COMPENSACION") != null ? Double.valueOf( map.get("TAB_COMPENSACION").toString()) : null );
            pago.setTabSueldoPre(map.get("TAB_SUELDO_PRE") != null ? Double.valueOf( map.get("TAB_SUELDO_PRE").toString()) : null);
            pago.setDescTipoPago(map.get("DESC_TIPO_PAGO") != null ? map.get("DESC_TIPO_PAGO").toString() : null );

            listaPagos.add(pago);
        }
            return listaPagos;
        }
        

    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo del incentivo por grupo de pago.
     * @author
     * @param idGrupoPago String
     * @return pagos List<Pago>
     */
    public List<Pago> getPagosNoOrdinarioByGpoPago(String idGrupoPago, Date fechaInicial, Date fechaFinal) {
        String pagoIncentivoByGpoPago = super.getQueryDefinition("pagoNoOrdinarioByGpoPago");
        String conceptosPagoByGpoPago = super.getQueryDefinition("conceptosPagoByGpoPagoIncentivo");
        String pensionesByGpoPago = super.getQueryDefinition("pensionesByGpoPagoIncentivo");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String strFechaInicial = df.format(fechaInicial);
        String strFechaFinal = df.format(fechaFinal);

        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("grupoPago", idGrupoPago);
        mapValues.put("fechaInicial", strFechaInicial);
        mapValues.put("fechaFinal", strFechaFinal);

        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        List<Pago> pagos = namedTemplate.query(pagoIncentivoByGpoPago, namedParameters, new PagoNoOrdinario());

        super.getJdbcTemplate().setFetchSize(10000);
        List<ConceptoPago> conceptos = super.getJdbcTemplate().query(conceptosPagoByGpoPago, new ConceptoPagoRM());

        super.getJdbcTemplate().setFetchSize(100);
        List<TdPension> pensiones = super.getJdbcTemplate().query(pensionesByGpoPago, new PensionRM());

        setConceptosPensiones(pagos, conceptos, pensiones);

        return pagos;
    }

    /**
     * Metodo encargado de verificar y calcular si a un empleado se le aplica retroactivo consultando el historico de pagos
     * @author Daniel Cruz
     * @param rfc String
     * @param fechaMovimiento Date
     * @return historicoPago List<HistoricoPago>
     */
    public List<HistoricoPago> getHistoricoPagoByRfc(String rfc, Date fechaMovimiento, List<Integer> listIdNominas) {
        String historicoPagoByRfc = super.getQueryDefinition("historicoPagoByRfc");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String strFechaMovimiento = df.format(fechaMovimiento);

        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("rfc", rfc);
        mapValues.put("fechaMovimiento", strFechaMovimiento);
        mapValues.put("listIdNominas", listIdNominas);

        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(historicoPagoByRfc, namedParameters, new HistoricoPagoByRFC());
    }

    private void setConceptosPensiones(List<Pago> pagos, List<ConceptoPago> conceptos, List<TdPension> pensiones) {
        Hashtable<String, Pago> hashPagos = new Hashtable<String, Pago>();

        for (Pago pago: pagos) {
            if (pago != null && pago.getRfcEmpleado() != null) {
                hashPagos.put(pago.getRfcEmpleado(), pago);
            }
        }

        List<ConceptoPago> listaConceptos;
        String rfc = "";
        Pago pago;

        for (ConceptoPago conceptoPago: conceptos) {
            if (conceptoPago != null && conceptoPago.getRfc() != null) {
                rfc = conceptoPago.getRfc();
                pago = hashPagos.get(rfc);
                if (pago != null) {
                    listaConceptos = pago.getConceptos();
                    if (listaConceptos != null)
                        listaConceptos.add(conceptoPago);
                }
            }
        }

        List<TdPension> listaPensiones;
        for (TdPension pension: pensiones) {
            if (pension != null && pension.getRfcPension() != null) {
                rfc = pension.getRfcPension();
                pago = hashPagos.get(rfc);
                if (pago != null) {
                    listaPensiones = pago.getPensiones();
                    if (listaPensiones != null)
                        listaPensiones.add(pension);
                }
            }
        }
    }

    /**
     * Casos de muestra.
     * @author
     * @param listaRFCs List<String>
     * @return pagos List<Pago>
     * @deprecated
     */
    public List<Pago> getPagosByRFCs(List<String> listaRFCs) {
        String pagoByRFCs = super.getQueryDefinition("pagoByRFCs");
        String conceptosPagoByRFCs = super.getQueryDefinition("conceptosPagoByRFCs");
        String pensionesByRFCs = super.getQueryDefinition("pensionesByRFCs");

        SqlParameterSource namedParameters = new MapSqlParameterSource("listaRFCs", listaRFCs);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        List<Pago> pagos = namedTemplate.query(pagoByRFCs, namedParameters, new PagoRSExt());
        super.getJdbcTemplate().setFetchSize(1000);
        List<ConceptoPago> conceptos = namedTemplate.query(conceptosPagoByRFCs, namedParameters, new ConceptoPagoRM());
        super.getJdbcTemplate().setFetchSize(100);
        List<TdPension> pensiones = namedTemplate.query(pensionesByRFCs, namedParameters, new PensionRM());

        setConceptosPensiones(pagos, conceptos, pensiones);

        return pagos;
    }

    /**
     * Ccasos de muestra.
     * @author
     * @param idGrupoPago String
     * @param idQna int
     * @return listaRFCsCasosMuestra List<StrinG>
     * @deprecated
     */
    public List<String> getRFCsCasosMuestra(String idGrupoPago, int idQna) {
        List<String> listaRFCsCasosMuestra = new ArrayList<String>();
        String rfcsCasosMuestra = super.getQueryDefinition("rfcsCasosMuestra");
        List<Map<String, Object>> listaRfcs = super.getJdbcTemplate().queryForList(rfcsCasosMuestra, new Object[] { idGrupoPago, idQna });
        String rfc;

        for (Map<String, Object> map: listaRfcs) {
            rfc = (String)map.get("RFC_EMPLEADO");
            if (rfc != null && !rfc.equals("")) {
                listaRFCsCasosMuestra.add(rfc);
            }
        }
        return listaRFCsCasosMuestra;
    }

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List<String>
     * @deprecated
     */
    public void updateAndSetCasosMuestra(List<String> casosMuestra) {
        super.getJdbcTemplate().update(super.getQueryDefinition("updateAndSetCasosMuestra"), Collections.singletonMap("listRfcs", casosMuestra));
    }

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List<String>
     * @deprecated
     */
    public void updateAndUnsetCasosMuestra(List<String> casosMuestra) {
        super.getJdbcTemplate().update(super.getQueryDefinition("updateAndUnsetCasosMuestra"), Collections.singletonMap("listRfcs", casosMuestra));
    }

    /**
     * Metodo encargado de actualizar el status de vigente en la quincena seleccionada.
     * @author
     * @param idQna int
     */
    public void updateStatusNominaQna(int idQna) {
        super.executeByNamedQuery("updateStatusNominaQna", idQna);
    }

    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @author Oscar S.
     * @param idQna int
     */
    public void updateStatusProcesandoNominaQna(int idQna) {
        super.executeByNamedQuery("updateStatusProcesandoNominaQna", idQna);
    }

    public void updateStatusSinProcesoNominaQna(int idQna) {
        super.executeByNamedQuery("updateStatusSinProcesoNominaQna", idQna);
    }

    /**
     * Metodo encargado de ejecutar el borrado de la tabla de paso.
     * @author Oscar S.
     * @param idQna int
     */
    public void deleteCalculoNominaQna(int idQna) {
        super.executeByNamedQuery("deleteCalculoNominaQna", idQna);
    }

    /**
     * Metodo encargado de ejecutar la insercion en la tabla de paso.
     * @author Oscar S.
     * @param listaMapasPago List<HashMap<String, Object>>
     * @param usuario String
     */
    public void saveCalculoNominaQna(List<HashMap<String, Object>> listaMapasPago, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPago) {
            parameters.add(new Object[] { mapaPago.get("idPlaza"), mapaPago.get("idQna"), mapaPago.get("rfc"), 
                                          mapaPago.get("cnqIniPago"), mapaPago.get("cnqFinPago"), 
                                          mapaPago.get("liquido"), mapaPago.get("cadenaConceptosPago"), 
                                          mapaPago.get("folio"), usuario });
        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertCalculoNominaQna"), parameters);
    }

    public void updateCalculoNominaQna(HashMap<String, Object> mapaPago) {
        super.getJdbcTemplate().update(super.getQueryDefinition("updateCalculoNominaQna"), mapaPago);
    }

    /**
     * Metodo encargado de ejecutar el SP para el calculo de la nomina.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public int postInsercionNomina(int idQna, int idPlaza, String idRfc) {
        PostNomina sp = new PostNomina(super.getJdbcTemplate().getDataSource());
        Integer out = (Integer)sp.execute(idQna, idPlaza, idRfc);

        logger.info("Nomina de la quincena: " + idQna);
        logger.info("de la plaza: " + idPlaza);
        logger.info("con el rfc: " + idRfc);
        logger.info("Registros procesados: " + out);
        return out;
    }
    
    /**
     * Metodo encargado de ejecutar el SP para el calculo de la nomina.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public int postInsercionNominaDinamico(String procedure, int[] types, String[] params, String[] args) {
        PostNominaDinamico sp = new PostNominaDinamico(procedure, types,  params, super.getJdbcTemplate().getDataSource());
        Integer out = (Integer)sp.execute(procedure, args);
        return out;
    }
    

    public void cierreNomina(int idQna) {
        CierreNomina sp = new CierreNomina(super.getJdbcTemplate().getDataSource());
        sp.execute(idQna);
    }

    /**
     * Metodo encargado de obtener la quincena de captura vigente.
     * @author Oscar S.
     * @return rcQnaCaptura Integer
     */
    public Integer getQuincenaVigente() {
        String queryDefinition = super.getQueryDefinition("quincenaVigente");

        Map<String, Object> mapValues = new HashMap<String, Object>();

        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        List<TnRegControl> listaQuincenas = namedTemplate.query(queryDefinition, namedParameters, new QuincenaVigenteAux());
        TnRegControl quincena = listaQuincenas.get(0);
        return quincena.getRcQnaCaptura();
    }

    public List<ConceptoPago> getConceptosByRfc(String rfc, Map<String, Map<String, String>> dimensions, String operationalYear) {
        final List conceptosPagoByRfcValues = new ArrayList();
        String ConceptosPagoByRfc = parseQuery("ConceptosPagoByRfc", operationalYear, dimensions, null, new Object[] { rfc }, conceptosPagoByRfcValues);
        return super.getJdbcTemplate().query(ConceptosPagoByRfc, new ConceptoPagoRM(), conceptosPagoByRfcValues.toArray(new Object[] { }));
    }

    public List<TdPension> getPensionesByRfc(String rfc, Map<String, Map<String, String>> dimensions, String operationalYear) {
        final List pensionesByRfcValues = new ArrayList();
        String pensionesByRfc = parseQuery("pensionesByRfc", operationalYear, dimensions, null, new Object[] { rfc }, pensionesByRfcValues);
        return super.getJdbcTemplate().query(pensionesByRfc, new PensionRM(), pensionesByRfcValues.toArray(new Object[] { }));
    }

    public void obtienePeriodoLaboradoIS(String letra, String fecIni, String fecFin, Integer qnaProceso, 
                                         Integer qnaIni, Integer qnaFin, String tabAnt, String tabNvo, 
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, 
                                         BigDecimal serviciosAnt, BigDecimal transporteAnt, BigDecimal compensacionNva, 
                                         BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, 
                                         BigDecimal transporteNva) {
        ObtienePeriodoLaboradoIS sp = new ObtienePeriodoLaboradoIS(super.getJdbcTemplate().getDataSource());
        sp.execute(letra, fecIni, fecFin, qnaProceso, qnaIni, qnaFin, tabAnt, tabNvo, compensacionAnt, despensaAnt, 
        previsionAnt, serviciosAnt, transporteAnt, compensacionNva, despensaNva, previsionNva, serviciosNva, transporteNva);
    }

    public void obtienePeriodoLaboradomIS(String letra, String fecIni, String fecFin, Integer qnaProceso, 
                                         Integer qnaIni, Integer qnaFin, String tabAnt, String tabNvo, 
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, 
                                         BigDecimal serviciosAnt, BigDecimal transporteAnt, BigDecimal compensacionNva, 
                                         BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, 
                                         BigDecimal transporteNva) {
        ObtienePeriodoLaboradomIS sp = new ObtienePeriodoLaboradomIS(super.getJdbcTemplate().getDataSource());
        sp.execute(letra, fecIni, fecFin, qnaProceso, qnaIni, qnaFin, tabAnt, tabNvo, compensacionAnt, despensaAnt, 
        previsionAnt, serviciosAnt, transporteAnt, compensacionNva, despensaNva, previsionNva, serviciosNva, transporteNva);
    }
    public void generarNominaValesFinAnio(String fecIni, String fecFin, Integer qnaProceso, BigDecimal monto) {
        GenerarNominaValesFinAnio sp = new GenerarNominaValesFinAnio(super.getJdbcTemplate().getDataSource());
        sp.execute(fecIni, fecFin, qnaProceso, monto);
    }

    public void generarNominaValesDiaHacendario(String fecIni, String fecFin, Integer qnaProceso, BigDecimal monto) {
        GenerarNominaValesDiaHacendario sp = new GenerarNominaValesDiaHacendario(super.getJdbcTemplate().getDataSource());
        sp.execute(fecIni, fecFin, qnaProceso, monto);
    }

    public void generarNominaPerseverancia(String fecIni, String fecFin, Integer qnaProceso) {
        GenerarNominaPerseverancia sp = new GenerarNominaPerseverancia(super.getJdbcTemplate().getDataSource());
        sp.execute(fecIni, fecFin, qnaProceso);
    }

    public void generarNominaAguinaldo(Integer idNomina) {
        GenerarNominaAguinaldo sp = new GenerarNominaAguinaldo(super.getJdbcTemplate().getDataSource());
        Integer out = (Integer)sp.execute(idNomina);
        logger.info("Nomina con id: " + idNomina);
        logger.info("Registros procesados: " + out);
    }

    /**
     * Metodo encargado de procesar faltas y licencias para el incentivo.
     * @author Oscar S.
     * @param idNomina Integer
     */
    public void previoIncentivo(Integer idNomina) {
        PrevioIncentivo sp = new PrevioIncentivo(super.getJdbcTemplate().getDataSource());
        sp.execute(idNomina);
        logger.info("Nomina con id: " + idNomina);
    }
    
    public void generarNominaFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha) {
        if(rfc == null){
            GenerarNominaFonac sp = new GenerarNominaFonac(super.getJdbcTemplate().getDataSource());    
            sp.execute(idNomina, qnaIni, qnaFin, qnaNom, usuario, fecha);
        }else{
            GenerarNominaFonacAnticipada sp = new GenerarNominaFonacAnticipada(super.getJdbcTemplate().getDataSource());    
            sp.execute(idNomina, qnaIni, qnaFin, qnaNom, rfc, usuario, fecha);
        }
    }

    

    /**
     * Clase anidada para procesar faltas y licencias para el incentivo.
     * @author Oscar S.
     */
    private class PrevioIncentivo extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_PREVIO_INCENTIVO.Previo";

        private PrevioIncentivo(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("nomina_in", Types.INTEGER));
            compile();
        }

        public Object execute(int idNomina) {
            Map<String, Object> results = super.execute(idNomina);
            return results.get(SPROC_NAME);
        }
    }

    private class GenerarNominaAguinaldo extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_AGUINALDO.obt_nomina";

        private GenerarNominaAguinaldo(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, Types.INTEGER));
            declareParameter(new SqlParameter("p_id_nomina", Types.INTEGER));
            compile();
        }

        public Object execute(int idNomina) {
            Map<String, Object> results = super.execute(idNomina);
            Integer resultado = (Integer)results.get(SPROC_NAME);
            return resultado;
        }
    }

    private class PostNomina extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_POST_NOMINA_BIS.InsertaHistorico";

        public PostNomina(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, Types.INTEGER));
            declareParameter(new SqlParameter("nomina_in", Types.INTEGER));
            declareParameter(new SqlParameter("plaza_in", Types.INTEGER));
            declareParameter(new SqlParameter("rfc_in", Types.VARCHAR));
            compile();
        }

        public Object execute(int idQna, int idPlaza, String idRfc) {
            Map<String, Object> results = super.execute(idQna, idPlaza, idRfc);
            return results.get(SPROC_NAME);
        }
    }
    
    private class PostNominaDinamico extends StoredProcedure {
//        private static final String SPROC_NAME = "PKG_POST_NOMINA_BIS.InsertaHistorico";
 
        public PostNominaDinamico(String SPROC_NAME, int[] types, String[] params, DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, Types.INTEGER));
            for(int i = 0; i < params.length; i++){
                declareParameter(new SqlParameter(params[i],  types[i]));
            }
            //declareParameter(new SqlParameter("nomina_in", Types.VARCHAR));
            //declareParameter(new SqlParameter("plaza_in", Types.VARCHAR));
            //declareParameter(new SqlParameter("rfc_in", Types.VARCHAR));
            compile();
        }

        public Object execute(String SPROC_NAME, String[] args) {
            Map<String, Object> results = super.execute(args);
            return results.get(SPROC_NAME);
        }
    }

    private class CierreNomina extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_ACTUALIZA_CONCEPTOS.ActualizaQuincena";

        public CierreNomina(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);
            //declareParameter(new SqlOutParameter(SPROC_NAME, Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_procesada", Types.INTEGER));
            compile();
        }

        public Object execute(int idQna) {
            Map<String, Object> results = super.execute(idQna);
            return results.get(SPROC_NAME);
        }
    }

    private class ObtienePeriodoLaboradoIS extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_NOMINA_EXTRA.nomina";

        public ObtienePeriodoLaboradoIS(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("letra", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_ini", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_fin", Types.VARCHAR));
            declareParameter(new SqlParameter("p_qna_proceso", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_ini", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_fin", Types.INTEGER));

            declareParameter(new SqlParameter("p_tab_ant", Types.VARCHAR));
            declareParameter(new SqlParameter("p_tab_nvo", Types.VARCHAR));

            declareParameter(new SqlParameter("p_compensacion_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_despensa_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_prevision_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_servicios_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_transporte_ant", Types.NUMERIC));

            declareParameter(new SqlParameter("p_compensacion_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_despensa_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_prevision_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_servicios_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_transporte_nvo", Types.NUMERIC));
            compile();
        }

        public Object execute(int idQna) {
            Map<String, Object> results = super.execute(idQna);
            return results.get(SPROC_NAME);
        }
    }

    private class ObtienePeriodoLaboradomIS extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_NOMINA_EXTRA_MANDOS.nomina";

        public ObtienePeriodoLaboradomIS(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("letra", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_ini", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_fin", Types.VARCHAR));
            declareParameter(new SqlParameter("p_qna_proceso", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_ini", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_fin", Types.INTEGER));

            declareParameter(new SqlParameter("p_tab_ant", Types.VARCHAR));
            declareParameter(new SqlParameter("p_tab_nvo", Types.VARCHAR));

            declareParameter(new SqlParameter("p_compensacion_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_despensa_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_prevision_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_servicios_ant", Types.NUMERIC));
            declareParameter(new SqlParameter("p_transporte_ant", Types.NUMERIC));

            declareParameter(new SqlParameter("p_compensacion_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_despensa_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_prevision_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_servicios_nva", Types.NUMERIC));
            declareParameter(new SqlParameter("p_transporte_nvo", Types.NUMERIC));
            compile();
        }

        public Object execute(int idQna) {
            Map<String, Object> results = super.execute(idQna);
            return results.get(SPROC_NAME);
        }
    }
    
    private class GenerarNominaValesFinAnio extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_NOMINA_EXTRA.fin_anio";

        public GenerarNominaValesFinAnio(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("p_fec_ini", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_fin", Types.VARCHAR));
            declareParameter(new SqlParameter("p_qna_proceso", Types.INTEGER));
            declareParameter(new SqlParameter("p_monto", Types.NUMERIC));
            compile();
        }

        public Object execute() {
            Map<String, Object> results = super.execute();
            return results.get(SPROC_NAME);
        }
    }

    private class GenerarNominaValesDiaHacendario extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_NOMINA_EXTRA.dia_hacendario";

        public GenerarNominaValesDiaHacendario(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("p_fec_ini", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_fin", Types.VARCHAR));
            declareParameter(new SqlParameter("p_qna_proceso", Types.INTEGER));
            declareParameter(new SqlParameter("p_monto", Types.NUMERIC));
            compile();
        }

        public Object execute() {
            Map<String, Object> results = super.execute();
            return results.get(SPROC_NAME);
        }
    }

    private class GenerarNominaPerseverancia extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_NOMINA_EXTRA.perseverancia";

        public GenerarNominaPerseverancia(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);

            declareParameter(new SqlParameter("p_fec_ini", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fec_fin", Types.VARCHAR));
            declareParameter(new SqlParameter("p_qna_proceso", Types.INTEGER));
            compile();
        }

        public Object execute() {
            Map<String, Object> results = super.execute();
            return results.get(SPROC_NAME);
        }
    }
    
    private class GenerarNominaFonac extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_FONAC.padron_liquidacion";

        public GenerarNominaFonac(DataSource datasource) {
            setDataSource(datasource);
            setFunction(false);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("p_id_nomina", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_ini", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_fin", Types.INTEGER));
            declareParameter(new SqlParameter("p_qna_nom", Types.INTEGER));
            declareParameter(new SqlParameter("p_usuario", Types.VARCHAR));
            declareParameter(new SqlParameter("p_fecha", Types.VARCHAR));

            compile();
        }
            public Object execute() {
                Map<String, Object> results = super.execute();
                return results.get(SPROC_NAME);
            }
        }
        
    private class GenerarNominaFonacAnticipada extends StoredProcedure {
            private static final String SPROC_NAME = "PKG_FONAC.PADRON_LIQUIDACION_ANT";

            public GenerarNominaFonacAnticipada(DataSource datasource) {
                setDataSource(datasource);
                setFunction(false);
                setSql(SPROC_NAME);

                declareParameter(new SqlParameter("p_id_nomina", Types.INTEGER));
                declareParameter(new SqlParameter("p_qna_ini", Types.INTEGER));
                declareParameter(new SqlParameter("p_qna_fin", Types.INTEGER));
                declareParameter(new SqlParameter("p_qna_nom", Types.INTEGER));
                declareParameter(new SqlParameter("p_rfc", Types.VARCHAR));
                declareParameter(new SqlParameter("p_usuario", Types.VARCHAR));
                declareParameter(new SqlParameter("p_fecha", Types.VARCHAR));

                compile();
            }
            public Object execute() {
                Map<String, Object> results = super.execute();
                return results.get(SPROC_NAME);
            }
        }

    private class PagoByRFC implements RowMapper<Pago> {
        public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
            gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();
            pago.setRfcEmpleado(rs.getString("RFC_EMPLEADO"));
            pago.setNombreEmpleado(rs.getString("NOMBRE_EMPLEADO"));
            pago.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
            pago.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
            pago.setCotiza(rs.getString("COMPAT_EMPLEO"));
            pago.setIdPlaza(rs.getInt("ID_PLAZA"));
            pago.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
            pago.setDescPuestoNom(rs.getString("DESC_PUESTO"));
            pago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
            pago.setDescUnidadNomb(rs.getString("DESC_UNIDAD"));
            pago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            pago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            pago.setImpHonorario(rs.getDouble("PLAZA_IMP_HONO"));

            pago.setQuincenaMovimiento(rs.getInt("PLAZA_QNA_CAPTURA"));
            pago.setFecUltimoMovto(rs.getDate("PLAZA_ULTIMO_MOVTO"));
            pago.setMovimiento(rs.getInt("ID_MOVTO_PERSONA"));
            // Retroactivo
            pago.setQuincena(getQuincenaVigente());
            pago.setIncentivo(rs.getDouble("AP_INCENTIVO"));

            pago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
            pago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
            pago.setIdNivelPtoPre(rs.getString("ID_NIVEL_PRE"));
            pago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
            pago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
            pago.setErario(rs.getString("AP_ERARIO_FEDERAL"));
            pago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
            pago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
            pago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
            pago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
            pago.setTabSueldoPre(rs.getDouble("TAB_SUELDO_PRE"));
            pago.setDescTipoPago(rs.getString("DESC_TIPO_PAGO"));

            pago.setCurpEmpleado(rs.getString("CURP_EMPLEADO"));
            pago.setNssEmpleado(rs.getString("IMSS_ISSSTE"));
            pago.setNumPension(rs.getString("NUM_PENSION"));
            return pago;
        }
    }

    private class HistoricoPagoByRFC implements RowMapper<HistoricoPago> {
        public HistoricoPago mapRow(ResultSet rs, int rowNum) throws SQLException {
            gob.shcp.sireh.domain.jdbc.HistoricoPago historicoPago = new gob.shcp.sireh.domain.jdbc.HistoricoPago();

            historicoPago.setFecIniPago(rs.getDate("HP_INI_PAGO"));
            historicoPago.setFecFinPago(rs.getDate("HP_FIN_PAGO"));
            historicoPago.setRfcEmpleado(rs.getString("RFC_EMPLEADO"));

            historicoPago.setCompatEmpleo("COMPAT_EMPLEO");
            historicoPago.setIdPlaza(rs.getInt("ID_PLAZA"));
            historicoPago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
            historicoPago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            historicoPago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            historicoPago.setQuincenaPago(rs.getInt("HP_QNA_PAGO"));

            historicoPago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
            historicoPago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
            historicoPago.setIdNivelPre(rs.getString("ID_NIVEL_PRE"));
            historicoPago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
            historicoPago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
            historicoPago.setErario(rs.getString("AP_ERARIO_FEDERAL"));
            historicoPago.setIncentivo(rs.getDouble("AP_INCENTIVO"));

            historicoPago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
            historicoPago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
            historicoPago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
            historicoPago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
            historicoPago.setTabSueldoPre(rs.getDouble("TAB_SUELDO_PRE"));
            historicoPago.setDescTipoPago(rs.getString("DESC_TIPO_PAGO"));

            return historicoPago;
        }
    }

    private class PagoRM implements RowMapper<Pago> {
        public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
            gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();
            pago.setRfcEmpleado(rs.getString("RFC_EMPLEADO"));
            pago.setCurpEmpleado(rs.getString("CURP_EMPLEADO"));
            pago.setNssEmpleado(rs.getString("IMSS_ISSSTE"));
            pago.setNumPension(rs.getString("NUM_PENSION"));
            pago.setNombreEmpleado(rs.getString("NOMBRE_EMPLEADO"));
            pago.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
            pago.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
            pago.setIdPlaza(rs.getInt("ID_PLAZA"));
            pago.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
            pago.setDescPuestoNom(rs.getString("DESC_PUESTO"));
            pago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
            pago.setDescUnidadNomb(rs.getString("DESC_UNIDAD"));
            pago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            pago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            pago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
            pago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
            pago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
            pago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
            pago.setErario(rs.getString("AP_ERARIO_FEDERAL"));
            pago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
            pago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
            pago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
            pago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
            pago.setDescTipoPago(rs.getString("DESC_TIPO_PAGO"));
            pago.setIdZonaEcoNom(rs.getInt("ID_ZONA_ECO_NOM"));
            return pago;
        }
    }

    private class PagoByPlazaRM implements RowMapper<Pago> {
        public Pago mapRow(ResultSet rs, int rowNum) throws SQLException {
            gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();
            pago.setIdPlaza(rs.getInt("ID_PLAZA"));
            pago.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
            pago.setDescPuestoNom(rs.getString("DESC_PUESTO"));
            pago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
            pago.setDescUnidadNomb(rs.getString("DESC_UNIDAD"));
            pago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            pago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            pago.setImpHonorario(rs.getDouble("PLAZA_IMP_HONO"));

            pago.setQuincenaMovimiento(rs.getInt("PLAZA_QNA_CAPTURA"));
            pago.setFecUltimoMovto(rs.getDate("PLAZA_ULTIMO_MOVTO"));
            pago.setMovimiento(rs.getInt("ID_MOVTO_PERSONA"));
            // Retroactivo
            pago.setQuincena(getQuincenaVigente());
            pago.setIncentivo(rs.getDouble("AP_INCENTIVO"));

            pago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
            pago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
            pago.setIdNivelPtoPre(rs.getString("ID_NIVEL_PRE"));

            pago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
            pago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
            pago.setErario(rs.getString("AP_ERARIO_FEDERAL"));

            pago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
            pago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));

            pago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
            pago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
            pago.setTabSueldoPre(rs.getDouble("TAB_SUELDO_PRE"));
            return pago;
        }
    }

    private class ConceptoPagoRM implements RowMapper<ConceptoPago> {
        public ConceptoPago mapRow(ResultSet rs, int rowNum) throws SQLException {
            ConceptoPago conceptoPago = new ConceptoPago();
            conceptoPago.setRfc(rs.getString("MCP_RFC"));
            conceptoPago.setIdMovtoConceptoPago(rs.getInt("ID_MOVTO_CONCEPTO_PAGO"));
            conceptoPago.setIdTipoCpto(rs.getString("ID_TIPO_CPTO"));
            conceptoPago.setIdConcepto(rs.getString("ID_CONCEPTO"));
            conceptoPago.setMonto(rs.getDouble("MCP_MONTO"));
            conceptoPago.setPorcentaje(rs.getFloat("MCP_PORCENTAJE"));
            conceptoPago.setFecIncidencia(rs.getDate("MCP_FEC_INCIDENCIA"));
            conceptoPago.setQnaIni(rs.getBigDecimal("MCP_QNA_INI"));
            conceptoPago.setQnaFin(rs.getBigDecimal("MCP_QNA_FIN"));
            conceptoPago.setQnaAplicadas(rs.getBigDecimal("MCP_QNA_APLICADAS"));
            conceptoPago.setQnaADescontar(rs.getBigDecimal("MCP_QNA_A_DESCONTAR"));
            conceptoPago.setMontoAdeudo(rs.getDouble("MCP_MONTO_ADEUDO"));
            conceptoPago.setQnasAdeudo(rs.getBigDecimal("MCP_QNAS_ADEUDO"));
            return conceptoPago;
        }
    }

    private class PensionRM implements RowMapper<TdPension> {
        public TdPension mapRow(ResultSet rs, int rowNum) throws SQLException {
            TdPension tdPension = new TdPension();
            tdPension.setRfcPension(rs.getString("RFC_PENSION"));
            tdPension.setNumPension(rs.getInt("NUM_PENSION"));
            tdPension.setBeneficiariaPension(rs.getString("BENEFICIARIA_PENSION"));
            tdPension.setMontoPension(rs.getDouble("MONTO_PENSION"));
            tdPension.setPorcentajePension(rs.getFloat("PORCENTAJE_PENSION"));
            tdPension.setMontoAdeudo(rs.getDouble("MONTO_ADEUDO"));
            tdPension.setQnaAplicaAdeudo(rs.getInt("QNA_APLICA_ADEUDO"));
            tdPension.setQnaDescAdeudo(rs.getInt("QNA_DESC_ADEUDO"));
            tdPension.setCptosPorcentaje(rs.getString("CPTOS_PORCENTAJE"));
            return tdPension;
        }
    }

    private class PagoRSExt implements ResultSetExtractor<List<Pago>> {
        public List<Pago> extractData(ResultSet rs) throws SQLException {
            List<Pago> listaPagos = new ArrayList<Pago>();
            while (rs.next()) {
                gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();

                pago.setRfcEmpleado(rs.getString("RFC_EMPLEADO"));
                pago.setCurpEmpleado(rs.getString("CURP_EMPLEADO"));
                pago.setNssEmpleado(rs.getString("IMSS_ISSSTE"));
                pago.setNumPension(rs.getString("NUM_PENSION"));
                pago.setNombreEmpleado(rs.getString("NOMBRE_EMPLEADO"));
                pago.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
                pago.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
                pago.setCotiza(rs.getString("COMPAT_EMPLEO"));
                pago.setIdPlaza(rs.getInt("ID_PLAZA"));
                pago.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
                pago.setDescPuestoNom(rs.getString("DESC_PUESTO"));
                pago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
                pago.setDescUnidadNomb(rs.getString("DESC_UNIDAD"));
                pago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
                pago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
                pago.setImpHonorario(rs.getDouble("PLAZA_IMP_HONO"));

                pago.setQuincenaMovimiento(rs.getInt("PLAZA_QNA_CAPTURA"));
                pago.setFecUltimoMovto(rs.getDate("PLAZA_ULTIMO_MOVTO"));
                pago.setMovimiento(rs.getInt("ID_MOVTO_PERSONA"));
                // Retroactivo
                pago.setQuincena(getQuincenaVigente());
                pago.setIncentivo(rs.getDouble("AP_INCENTIVO"));

                pago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
                pago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
                pago.setIdNivelPtoPre(rs.getString("ID_NIVEL_PRE"));
                pago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
                pago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
                pago.setErario(rs.getString("AP_ERARIO_FEDERAL"));
                pago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
                pago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
                pago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
                pago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
                pago.setTabSueldoPre(rs.getDouble("TAB_SUELDO_PRE"));
                pago.setDescTipoPago(rs.getString("DESC_TIPO_PAGO"));

                listaPagos.add(pago);
            }
            return listaPagos;
        }
    }

    private class PagoNoOrdinario implements ResultSetExtractor<List<Pago>> {
        public List<Pago> extractData(ResultSet rs) throws SQLException {
            List<Pago> listaPagos = new ArrayList<Pago>();
            while (rs.next()) {
                gob.shcp.sireh.domain.jdbc.Pago pago = new gob.shcp.sireh.domain.jdbc.Pago();

                pago.setRfcEmpleado(rs.getString("RFC_EMPLEADO"));
                pago.setCurpEmpleado(rs.getString("CURP_EMPLEADO"));
                pago.setNssEmpleado(rs.getString("IMSS_ISSSTE"));
                //pago.setNumPension(rs.getString("NUM_PENSION"));
                pago.setNombreEmpleado(rs.getString("NOMBRE_EMPLEADO"));
                pago.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
                pago.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
                pago.setCotiza(rs.getString("COMPAT_EMPLEO"));
                pago.setIdPlaza(rs.getInt("ID_PLAZA"));
                pago.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
                //pago.setDescPuestoNom(rs.getString("DESC_PUESTO"));
                pago.setIdUnidadNomb(rs.getString("ID_UNIDAD_NOM"));
                //pago.setDescUnidadNomb(rs.getString("DESC_UNIDAD"));
                pago.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
                pago.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
                //pago.setImpHonorario(rs.getDouble("PLAZA_IMP_HONO"));

                //pago.setQuincenaMovimiento(rs.getInt("PLAZA_QNA_CAPTURA"));
                pago.setFecUltimoMovto(rs.getDate("FEC_INI_PAGO"));
                pago.setMovimiento(0);
                // 
                Quincena qna = new Quincena(rs.getDate("FEC_FIN_PAGO"));
                pago.setQuincena(qna.getQuincena());
                pago.setIncentivo(rs.getDouble("AP_INCENTIVO"));
                pago.setFecFinPago(rs.getDate("FEC_FIN_PAGO"));
                pago.setRetroactivo(false);
                //pago.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
                pago.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
                pago.setIdNivelPtoPre(rs.getString("ID_NIVEL_PRE"));
                pago.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
                pago.setIdJerarquia(rs.getString("ID_JERARQUIA"));
                pago.setErario(rs.getString("AP_ERARIO_FEDERAL"));
                pago.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
                pago.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
                pago.setTabSueldo(rs.getDouble("TAB_SUELDO"));
                pago.setTabCompensacion(rs.getDouble("TAB_COMPENSACION"));
                pago.setTabSueldoPre(rs.getDouble("TAB_SUELDO_PRE"));
                pago.setDescTipoPago(rs.getString("DESC_TIPO_PAGO"));

                listaPagos.add(pago);
            }
            return listaPagos;
        }
    }

    private class NominaRM implements RowMapper<Map<String, Object>> {
        public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
            Map<String, Object> nominaDetalle = new HashMap<String, Object>();
            nominaDetalle.put("idNomina", rs.getLong("idNomina"));
            nominaDetalle.put("idTipoNomina", rs.getString("idTipoNomina"));
            nominaDetalle.put("nomQnaCaptura", rs.getInt("nomQnaCaptura"));
            nominaDetalle.put("nomNumComplem", rs.getString("nomNumComplem"));
            nominaDetalle.put("idTipoNomina", rs.getString("idTipoNomina"));
            nominaDetalle.put("nomDescripcion", rs.getString("nomDescripcion"));
            nominaDetalle.put("nomDescTipoNomina", rs.getString("nomDescTipoNomina"));
            nominaDetalle.put("nomDescGrupoPago", rs.getString("nomDescGrupoPago"));

            nominaDetalle.put("nomIniPago", rs.getDate("nomIniPago"));
            nominaDetalle.put("nomFinPago", rs.getDate("nomFinPago"));

            nominaDetalle.put("nomFecApertura", rs.getDate("nomFecApertura"));
            nominaDetalle.put("nomFecCierre", rs.getDate("nomFecCierre"));

            nominaDetalle.put("status", rs.getString("status"));
            return nominaDetalle;
        }
    }

    private class QuincenaVigenteAux implements ResultSetExtractor<List<TnRegControl>> {
        public List<TnRegControl> extractData(ResultSet rs) throws SQLException {
            List<TnRegControl> listaQuincenas = new ArrayList<TnRegControl>();
            while (rs.next()) {
                TnRegControl quincenaVigente = new TnRegControl();

                quincenaVigente.setRcQnaCaptura(rs.getInt("QUINCENA_VIGENTE"));

                listaQuincenas.add(quincenaVigente);
            }
            return listaQuincenas;
        }
    }
}
