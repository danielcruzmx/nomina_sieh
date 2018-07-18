package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.domain.jdbc.TcTipoNomina;
import gob.shcp.sireh.domain.jdbc.TcUnidadEdo;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.object.StoredProcedure;

public class CustomTdCxlcDAOImpl extends JdbcDAO implements CustomTdCxlcDAO {
    
    // CXLC Borrar - FUNCTION
    private static final String F_BORRA_CXLC = "begin ? := PKG_CXLC_AUTO_V3.BORRA_CXLC(?, ?, ?, ?, ?); end;";
    
    // CXLC Quincenal - SP
    private static final String SP_GENERA_CXLC_QUINCENAL = "PKG_CXLC_AUTO_V3.GENERA_CXLC";
    
    // CXLC Ordinaria - FUNCTION
    private static final String F_GENERA_CXLC_QUINCENAL = "begin ? := PKG_CXLC_AUTO_V3.GENERA_CXLC(?, ?, ?, ?, ?); end;";
    
    // CXLC Ordinaria - FUNCTION
    private static final String F_EXISTE_ERROR = "begin ? := PKG_CXLC_AUTO_V3.EXISTE_ERROR(?, ?, ?, ?); end;";
    
    // CXLC Terceros - FUNCTION
    private static final String F_GENERA_CXLC_TERCEROS = "begin ? := PKG_CXLC_AUTO_V3.GENERA_CXLC_TERCERO(?, ?, ?, ?, ?, ?, ?); end;";
    private static final String F_CANCELADOS_CXLC_TERCEROS = "begin ? := PKG_CXLC_AUTO_V3.CANCELADOS_CXLC_TERCERO(?, ?, ?); end;";
    private static final String F_AJUSTES_CXLC_TERCEROS = "begin ? := PKG_CXLC_AUTO_V3.AJUSTE_TERCEROS(?, ?, ?, ?, ?, ?); end;";
    
    // CXLC Patronales - FUNCTION
    private static final String F_GENERA_CXLC_TER_APORTA = "begin ? := PKG_CXLC_AUTO_V3.GENERA_CXLC_TER_APORTA(?, ?, ?, ?, ?, ?, ?, ?); end;";
    
    /**
     * Procesa Ordinaria - Metodo encargado de ejecutar el procedure para Procesar CLC Ordinarias.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @param usuario String
     * @return executeError Integer
     */
     public Integer executeSPClcOrdinaria(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento, String usuario) {
          CallableStatement clcOrdinariaSqlStatement = null; 
          int executeError = 1;
          
          try {
              clcOrdinariaSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_GENERA_CXLC_QUINCENAL);
              clcOrdinariaSqlStatement.registerOutParameter(1, Types.INTEGER);
              clcOrdinariaSqlStatement.setInt(2, cicloUnidad);
              clcOrdinariaSqlStatement.setInt(3, quincenaPago);
              clcOrdinariaSqlStatement.setString(4, tipoNomina);
              clcOrdinariaSqlStatement.setString(5, complemento);
              clcOrdinariaSqlStatement.setString(6, usuario);
              clcOrdinariaSqlStatement.executeUpdate();
              
              executeError = clcOrdinariaSqlStatement.getInt(1);
          } catch (SQLException e) {                
              logger.warn("Exception CustomTdCxlcDAOImpl[executeSPClcOrdinaria] " + F_GENERA_CXLC_QUINCENAL);
              logger.warn("Mensaje: " + e.getMessage());
              return executeError;
          } 
          return executeError;
     }
     
    /**
     * Procesa - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @return existeError Integer
     */
    public Integer executeSPExisteError(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento) {
        CallableStatement clcOrdinariaSqlStatement = null; 
        int existeError = 0;
        
        try {
            clcOrdinariaSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_EXISTE_ERROR);
            clcOrdinariaSqlStatement.registerOutParameter(1, Types.INTEGER);
            clcOrdinariaSqlStatement.setInt(2, cicloUnidad);
            clcOrdinariaSqlStatement.setInt(3, quincenaPago);
            clcOrdinariaSqlStatement.setString(4, tipoNomina);
            clcOrdinariaSqlStatement.setString(5, complemento);
            clcOrdinariaSqlStatement.executeUpdate();
            
            existeError = clcOrdinariaSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomTdCxlcDAOImpl[executeSPExisteError] " + F_EXISTE_ERROR);
            logger.warn("Mensaje: " + e.getMessage());
            return existeError;
        } 
        return existeError;
    }
    
    /**
     * Procesa Terceros - Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago List<Integer>
     * @param idTipoNomina String
     * @param secGuiaContableEjer List<Integer>
     * @return listaCxlc List<TdCxlc>
     */
    public List<TdCxlc> consultaTdCxlcProcesoTerceros(Integer cxlcCiclo, List<Integer> cxlcQnaPago, String idTipoNomina, List<Integer> secGuiaContableEjer) {
        String queryDefinition = "";
        
        if (idTipoNomina.equals("FO")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_FONAC";
        } else if (idTipoNomina.equals("SD")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_SINDICATO";
        } else if (idTipoNomina.equals("AH")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_CAJA_DE_AHORRO_SINDICAL";
        } else if (idTipoNomina.equals("FS")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_FSTSE";
        } else if (idTipoNomina.equals("PA")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_PENSION_ALIMENTICIA";
        } else if (idTipoNomina.equals("RI")) {
            queryDefinition = "consultaTdCxlcProcesoTerceros_IMPUESTOS";
        }  else {
            queryDefinition = "consultaTdCxlcProcesoTerceros_OTROS";
        }
        
        String consultaTdCxlcProcesoTerceros = super.getQueryDefinition(queryDefinition);
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcQnaPago", cxlcQnaPago);
        mapValues.put("secGuiaContableEjer", secGuiaContableEjer);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(consultaTdCxlcProcesoTerceros, namedParameters, new TdCxlcProcesaTercerosAux());
    }
    
    /**
     * Procesa Terceros - Metodo encargado de obtener el monto total de las cxlc seleccionadas con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcTerceros List<BigDecimal>
     * @param tipoNominaTerceros String
     */
    public List<BigDecimal> calculaMontoTotalTerceros(Integer ciclo, List<Integer> cxlcTerceros, String tipoNominaTerceros) {
        String queryDefinition = "";
        
        if (tipoNominaTerceros.equals("FO")) {
            queryDefinition = "calculaMontoTotalTerceros_FONAC";
        } else if (tipoNominaTerceros.equals("SD")) {
            queryDefinition = "calculaMontoTotalTerceros_SINDICATO";
        } else if (tipoNominaTerceros.equals("AH")) {
            queryDefinition = "calculaMontoTotalTerceros_CAJA_DE_AHORRO_SINDICAL";
        } else if (tipoNominaTerceros.equals("FS")) {
            queryDefinition = "calculaMontoTotalTerceros_FSTSE";
        } else if (tipoNominaTerceros.equals("PA")) {
            queryDefinition = "calculaMontoTotalTerceros_PENSION_ALIMENTICIA";
        } else if (tipoNominaTerceros.equals("RI")) {
            queryDefinition = "calculaMontoTotalTerceros_IMPUESTOS";
        }  else {
            queryDefinition = "calculaMontoTotalTerceros_OTROS";
        }
        
        String calculaMontoTotalTerceros = super.getQueryDefinition(queryDefinition);
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", ciclo);
        mapValues.put("cxlcTerceros", cxlcTerceros);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(calculaMontoTotalTerceros, namedParameters, new MontoTotalAux());
    }
    
    /**
     * Procesa Terceros - Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return listaGuiaContable List<String>
     */
    public List<String> guiaContableByTipoNominaTerceros(String idTipoNomina) {
        String guiaContableByTipoNominaTerceros = super.getQueryDefinition("guiaContableByTipoNominaTerceros");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("idTipoNomina", idTipoNomina);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(guiaContableByTipoNominaTerceros, namedParameters, new GuiaContableAux());
    }
    
    /**
     * Procesa Terceros - Metodo encargado de verificar si existe un clc procesada.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @return listaCxlc List<TdCxlc>
     */
    public List<TdCxlc> existeCLCProcesadaTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento) {
        String existeCLCProcesadaTerceros = super.getQueryDefinition("existeCLCProcesadaTerceros");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcQnaPago", cxlcQnaPago);
        mapValues.put("idTipoNomina", idTipoNomina);
        mapValues.put("cxlcComplemento", cxlcComplemento);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(existeCLCProcesadaTerceros, namedParameters, new TdCxlcAux());
    }
    
    /**
     * Procesa Terceros - Metodo encargado de obtener el numero de clc terceros con base en las clc seleccionadas.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param tipoNominaTerceros String
     * @param cxlcTerceros List<Integer>
     * @return clcTerceros Integer
     */
    public List<Integer> getClcTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String tipoNominaTerceros, List<Integer> cxlcTerceros) {
        String queryDefinition = "";
        
        if (tipoNominaTerceros.equals("FO")) {
            queryDefinition = "numeroClcTerceros_FONAC";
        } else if (tipoNominaTerceros.equals("SD")) {
            queryDefinition = "numeroClcTerceros_SINDICATO";
        } else if (tipoNominaTerceros.equals("AH")) {
            queryDefinition = "numeroClcTerceros_CAJA_DE_AHORRO_SINDICAL";
        } else if (tipoNominaTerceros.equals("FS")) {
            queryDefinition = "numeroClcTerceros_FSTSE";
        } else if (tipoNominaTerceros.equals("PA")) {
            queryDefinition = "numeroClcTerceros_PENSION_ALIMENTICIA";
        } else if (tipoNominaTerceros.equals("RI")) {
            queryDefinition = "numeroClcTerceros_IMPUESTOS";
        }  else {
            queryDefinition = "numeroClcTerceros_OTROS";
        }
        String getClcTerceros = super.getQueryDefinition(queryDefinition);
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcQnaPago", cxlcQnaPago);
        mapValues.put("cxlcTerceros", cxlcTerceros);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(getClcTerceros, namedParameters, new ClcTercerosAux());
    }
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para Procesar CLC Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcCadena String
     * @param qnaPago Integer
     * @param tipoNominaTeceros String
     * @param complemento String
     * @param reproceso String
     * @param usuario String
     * @return Integer
     */
    public Integer executeSPClcTerceros(Integer ciclo, String cxlcCadena, Integer qnaPago, String tipoNominaTeceros, Integer complemento, String reproceso, String usuario) {
        CallableStatement clcTercerosSqlStatement = null; 
        int executeError = 1;
        
        try {
            clcTercerosSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_GENERA_CXLC_TERCEROS);
            clcTercerosSqlStatement.registerOutParameter(1, Types.INTEGER);
            clcTercerosSqlStatement.setInt(2, ciclo);
            clcTercerosSqlStatement.setString(3, cxlcCadena);
            clcTercerosSqlStatement.setInt(4, qnaPago);
            clcTercerosSqlStatement.setString(5, tipoNominaTeceros);
            clcTercerosSqlStatement.setInt(6, complemento);
            clcTercerosSqlStatement.setString(7, reproceso);
            clcTercerosSqlStatement.setString(8, usuario);
            clcTercerosSqlStatement.executeUpdate();
            
            executeError = clcTercerosSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomTdCxlcDAOImpl[executeSPClcTerceros " + F_GENERA_CXLC_TERCEROS);
            logger.warn("Mensaje: " + e.getMessage());
            return executeError;
        } 
        return executeError;
    }
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para procesar la cancelación de CLC de Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlc Integer
     * @param usuario String
     * @return Integer
     */
    public Integer executeSPClcTercerosCancelados(Integer ciclo, Integer cxlc, String usuario) {
        CallableStatement clcTercerosSqlStatement = null; 
        int executeError = 1;
        
        try {
            clcTercerosSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_CANCELADOS_CXLC_TERCEROS);
            clcTercerosSqlStatement.registerOutParameter(1, Types.INTEGER);
            clcTercerosSqlStatement.setInt(2, ciclo);
            clcTercerosSqlStatement.setInt(3, cxlc);
            clcTercerosSqlStatement.setString(4, usuario);
            clcTercerosSqlStatement.executeUpdate();
            
            executeError = clcTercerosSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomTdCxlcDAOImpl[executeSPClcTercerosCancelados " + F_CANCELADOS_CXLC_TERCEROS);
            logger.warn("Mensaje: " + e.getMessage());
            return executeError;
        } 
        return executeError;
    }
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para Ajustar CLC Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param signo String
     * @param importeAjuste double
     * @param clcAjuste Integer
     * @param clcCompensada Integer
     * @param usuario String
     * @return Integer
     */
    public Integer executeSPClcTercerosAjustes(Integer ciclo, String signo, double importeAjuste, Integer clcAjuste, Integer clcCompensada, String usuario) {
        CallableStatement clcTercerosSqlStatement = null; 
        int executeError = 1;
        
        try {
            clcTercerosSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_AJUSTES_CXLC_TERCEROS);
            clcTercerosSqlStatement.registerOutParameter(1, Types.INTEGER);
            clcTercerosSqlStatement.setInt(2, ciclo);
            clcTercerosSqlStatement.setInt(3, clcAjuste);
            clcTercerosSqlStatement.setString(4, signo);
            //¿clcTercerosSqlStatement.setInt(5, new Integer(10));
            clcTercerosSqlStatement.setDouble(5, importeAjuste);
            clcTercerosSqlStatement.setInt(6, clcCompensada);
            clcTercerosSqlStatement.setString(7, usuario);
            clcTercerosSqlStatement.executeUpdate();
            
            executeError = clcTercerosSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomTdCxlcDAOImpl[executeSPClcTercerosAjustes " + F_AJUSTES_CXLC_TERCEROS);
            logger.warn("Mensaje: " + e.getMessage());
            return executeError;
        } 
        return executeError;
    }
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlc>
     */
    public List<TdCxlc> getCxlcComprometidasList(Integer cxlcCiclo, List<Integer> cxlcCompromiso) {
        String cxlcComprometidas = super.getQueryDefinition("cxlcComprometidas");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcCompromiso", cxlcCompromiso);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(cxlcComprometidas, namedParameters, new TdCxlcAux());
    }
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de verificar si el numero de compromiso ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCompromiso String
     * @return tdSecCxlc List<TdSecCxlc>
     */
    public List<TdSecCxlc> existeCompromiso(Integer secCxlcCiclo, String secCompromiso) {
        String existeCompromiso = super.getQueryDefinition("existeCompromiso");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("secCompromiso", secCompromiso);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(existeCompromiso, namedParameters, new TdSecCxlcRegistroAux());
    }
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de verificar si el numero de devengado ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secDevengado Long
     * @return tdSecCxlc List<TdSecCxlc>
     */
    public List<TdSecCxlc> existeDevengado(Integer secCxlcCiclo, Long secDevengado) {
        String existeDevengado = super.getQueryDefinition("existeDevengado");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("secDevengado", secDevengado);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(existeDevengado, namedParameters, new TdSecCxlcRegistroAux());
    }
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de actualizar las cxlc involucradas con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcInvolucradas List<Integer>
     */
    public void updateCxlcCompromiso(Integer cxlcCiclo, String cxlcCompromiso, List<Integer> cxlcInvolucradas, String usuario, Integer secQnaApli) {
        String updateCxlcInvolucradas = super.getQueryDefinition("updateCxlcInvolucradas");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcCompromiso", cxlcCompromiso);
        mapValues.put("cxlcInvolucradas", cxlcInvolucradas);
        mapValues.put("usuario", usuario);
        mapValues.put("secQnaApli", secQnaApli);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        namedTemplate.update(updateCxlcInvolucradas, namedParameters);
    }
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlc>
     */
    public List<TdCxlc> getCxlcSolicitudPagoList(Integer cxlcCiclo, List<Integer> cxlcCompromiso) {
        String cxlcComprometidasSolPago = super.getQueryDefinition("cxlcComprometidasSolPago");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        //mapValues.put("cxlcDevengado", cxlcDevengado);
        mapValues.put("cxlcCompromiso", cxlcCompromiso);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(cxlcComprometidasSolPago, namedParameters, new TdCxlcAux());
    }
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las cxlc involucradas con base en el ciclo y numero de sec_compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param secCompromiso Set<String>
     * @return cxlcInvolucradas List<TdCxlc>
     */
    public List<TdCxlc> getCxlcInvolucradasSolicitudPagoList(Integer cxlcCiclo, Set<String> secCompromiso) {
        String cxlcInvolucradasSolicitudPagoList = super.getQueryDefinition("cxlcInvolucradasSolicitudPagoList");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("secCompromiso", secCompromiso);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(cxlcInvolucradasSolicitudPagoList, namedParameters, new TdCxlcAux());
    }
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de actualizar las cxlc involucradas con base en un nuevo devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado Long
     * @param cxlcInvolucradas List<Integer>
     */ 
    public void updateCxlcSolicitudPago(Integer cxlcCiclo, Long cxlcDevengado, List<Integer> cxlcInvolucradas, String usuario) {
        String updateCxlcInvolucradas = super.getQueryDefinition("updateCxlcInvolucradasSolPago");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcDevengado", cxlcDevengado);
        //mapValues.put("cxlcCompromiso", cxlcCompromiso);
        mapValues.put("cxlcInvolucradas", cxlcInvolucradas);
        mapValues.put("usuario", usuario);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        namedTemplate.update(updateCxlcInvolucradas, namedParameters);
    }
    
    /**
     * Interfaz SICOP - Metodo encargado de actualizar cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcSIAFF Integer
     * @param cxlc Integer
     * @param usuario String
     */
    public void updateRegistraCLC(Integer cxlcCiclo, Integer cxlcSIAFF, Integer cxlc, String usuario) {
        String updateRegistraCLC = super.getQueryDefinition("updateRegistraCLC");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcSIAFF", cxlcSIAFF);
        mapValues.put("cxlc", cxlc);
        mapValues.put("usuario", usuario);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        namedTemplate.update(updateRegistraCLC, namedParameters);
    }
    
    /**
     *
     * Interfaz SICOP - Metodo encargado de actualizar las cxlc a comprometer con base en un nuevo numero de compromiso - Interfaz SICOP.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcComprometer Set<Integer>
     */
    public void updateCxlcComprometer(Integer cxlcCiclo, Long cxlcCompromiso, Set<Integer> cxlcComprometer, String usuario) {
        String updateCxlcComprometer = super.getQueryDefinition("updateCxlcComprometer");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcCompromiso", cxlcCompromiso);
        mapValues.put("cxlcComprometer", cxlcComprometer);
        mapValues.put("usuario", usuario);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        namedTemplate.update(updateCxlcComprometer, namedParameters);
    }
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las nominas validas para el Usuario comodin.
     * @author Oscar S.
     * @return nominasValidasBenefComodin List<TcTipoNomina>
     */
    public List<TcTipoNomina> getNominasValidasBenefComodin() {
        String nominasValidasBenefComodin = super.getQueryDefinition("nominasValidasBenefComodin");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(nominasValidasBenefComodin, namedParameters, new TcTipoNominasValidasBenefComodinAux());
    }
    
    /**
     * Herramientas - Concilia CLC - Metodo encargado de actualizar el listado de cxlc a conciliar.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcConciliacionSicop Integer
     * @return cxlcConciliar List<Integer>
     * @param usuario String
     */
    public void updateCxlcConciliar(Integer cxlcCiclo, Integer cxlcConciliacionSicop, List<Integer> cxlcConciliar, String usuario) {
        String updateCxlcComprometer = super.getQueryDefinition("updateCxlcConciliar");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcConciliacionSicop", cxlcConciliacionSicop);
        mapValues.put("cxlcConciliar", cxlcConciliar);
        mapValues.put("usuario", usuario);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        namedTemplate.update(updateCxlcComprometer, namedParameters);
    }
    
    /**
     * Herramientas - Borra CLC - Metodo encargado de ejecutar el stored procedure para Borrar CLC.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @param situacion String
     * @return Integer
     */
    public Integer executeSPBorraCLC(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento, String situacion) {
        CallableStatement borraCLCSqlStatement = null; 
        int executeError = 1;
        
        try {
            borraCLCSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_BORRA_CXLC);
            borraCLCSqlStatement.registerOutParameter(1, Types.INTEGER);
            borraCLCSqlStatement.setInt(2, cicloUnidad);
            borraCLCSqlStatement.setInt(3, quincenaPago);
            borraCLCSqlStatement.setString(4, tipoNomina);
            borraCLCSqlStatement.setString(5, complemento);
            borraCLCSqlStatement.setString(6, situacion);
            borraCLCSqlStatement.executeUpdate();
            
            executeError = borraCLCSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomtdCxlcDAOImpl[executeSPBorraCLC] " + F_BORRA_CXLC);
            logger.warn("Mensaje: " + e.getMessage());
            return executeError;
        } 
        return executeError;
    }
    
    /**
     * Consultas Registro Cxlc - Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdCxlc>
     */
    public List<TdCxlc> consultasRegistraTdCxlc(String cxlcCiclo, String cxlcQnaPago, String idTipoNomina, String cxlcComplemento, String cxlc) {
        String consultasRegistraTdCxlc = super.getQueryDefinition("consultasRegistraTdCxlc");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlcQnaPago", cxlcQnaPago);
        mapValues.put("idTipoNomina", idTipoNomina);
        mapValues.put("cxlcComplemento", cxlcComplemento);
        mapValues.put("cxlc", cxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(consultasRegistraTdCxlc, namedParameters, new TdCxlcRegistroAux());
    }
    
    /**
     * Consultas Registro Cxlc - Metodo encargado de obtener sec_cxlc
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdSecCxlc>
     */
    public List<TdSecCxlc> consultasRegistraTdSecCxlc(Integer secCxlcCiclo, Integer cxlc) {
        String consultasRegistraTdSecCxlc = super.getQueryDefinition("consultasRegistraTdSecCxlc");
        
        logger.debug("consultasRegistraTdSecCxlc -> secCxlcCiclo -----------------> " + secCxlcCiclo);
        logger.debug("consultasRegistraTdSecCxlc -> cxlc -------------------------> " + cxlc);
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("cxlc", cxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(consultasRegistraTdSecCxlc, namedParameters, new TdSecCxlcRegistroAux());
    }
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maxicmo de clc en el rnago de las 5000
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    public List<TdCxlc> getMaxCxlcManuales(Integer cxlcCiclo) {
        String getMaxCxlcManuales = super.getQueryDefinition("getMaxCxlcManuales");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(getMaxCxlcManuales, namedParameters, new TdCxlcMaxManualAux());
    }

    public List<String> getListaUnidades(Integer ciclo) {
        String getListaUnidades = super.getQueryDefinition("getListaUnidades");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("ciclo", ciclo);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        List<String> unidades = new ArrayList<String>();
        List<TcUnidadEdo> listaUnidades = namedTemplate.query(getListaUnidades, namedParameters, new TcUnidadEdoAux());
        for (TcUnidadEdo unidadEdo : listaUnidades ) {
            unidades.add(unidadEdo.getIdUnidad());
        }
        return unidades;
    }

    public List<String> getListaEstados(String unidad, Integer ciclo) {
        String getListaEstados = super.getQueryDefinition("getListaEstados");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("unidad", unidad);
        mapValues.put("ciclo", ciclo);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        List<String> estados = new ArrayList<String>();
        List<TcUnidadEdo> listaEstados = namedTemplate.query(getListaEstados, namedParameters, new TcUnidadEdoAux());
        for (TcUnidadEdo unidadEdo : listaEstados ) {
            estados.add(String.valueOf(unidadEdo.getIdEdo()));
        }
        return estados;
    }
    
    /**
     * Procesa Patronales - Metodo encargado de ejecutar el stored procedure para Procesar CLC Patronales.
     * @author Oscar S.
     * @param ciclo Integer
     * @param nominasCadena String
     * @param qnaPago Integer
     * @param tipoNominaPatronales String
     * @param complemento Integer
     * @param estado Integer
     * @param reproceso String
     * @param usuario String
     * @return Integer
     */
    public Integer executeSPClcPatronales(Integer ciclo, 
                                          String nominasCadena, 
                                          Integer qnaPago, 
                                          String tipoNominaPatronales, 
                                          Integer complemento, 
                                          Integer estado, 
                                          String reproceso, 
                                          String usuario) {
        CallableStatement clcTercerosSqlStatement = null; 
        int executeError = 1;
        
        try {
            clcTercerosSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(F_GENERA_CXLC_TER_APORTA);
            clcTercerosSqlStatement.registerOutParameter(1, Types.INTEGER);
            clcTercerosSqlStatement.setInt(2, ciclo);
            clcTercerosSqlStatement.setString(3, nominasCadena);
            clcTercerosSqlStatement.setInt(4, qnaPago);
            clcTercerosSqlStatement.setString(5, tipoNominaPatronales);
            clcTercerosSqlStatement.setInt(6, complemento);
            clcTercerosSqlStatement.setInt(7, estado);
            clcTercerosSqlStatement.setString(8, reproceso);
            clcTercerosSqlStatement.setString(9, usuario);
            clcTercerosSqlStatement.executeUpdate();
            
            executeError = clcTercerosSqlStatement.getInt(1);
        } catch (SQLException e) {                
            logger.warn("Exception CustomTdCxlcDAOImpl[executeSPClcPatronales " + F_GENERA_CXLC_TER_APORTA);
            logger.warn("Mensaje: " + e.getMessage());
            return executeError;
        } 
        return executeError;
    }
    
    /**
     * Procesa Patronales - Metodo encargado de obtener la clc a reprocesar.
     * @author Oscar S.
     * @param ciclo Integer
     * @param qnaPago Integer
     * @param tipoNomina String
     * @param complemento Integer
     * @return List<TdCxlc>
     */
    public List<TdCxlc> getClcPatronalReproceso(Integer ciclo, Integer qnaPago, String tipoNomina, Integer complemento) {
        String getClcPatronalReproceso = super.getQueryDefinition("getClcPatronalReproceso");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("ciclo", ciclo);
        mapValues.put("qnaPago", qnaPago);
        mapValues.put("tipoNomina", tipoNomina);
        mapValues.put("complemento", complemento);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(getClcPatronalReproceso, namedParameters, new TdCxlcAux());
    }

    class TcTipoNominasValidasBenefComodinAux implements ResultSetExtractor<List<TcTipoNomina>> {
        public List<TcTipoNomina> extractData(ResultSet rs) throws SQLException {
            List<TcTipoNomina> listaNominas = new ArrayList<TcTipoNomina>();
            while (rs.next()) {
                TcTipoNomina nomina = new TcTipoNomina();
                nomina.setIdTipoNomina(rs.getString("ID_TIPO_NOMINA"));
                listaNominas.add(nomina);
            }
            return listaNominas;
        }
    }

    class TdCxlcMaxManualAux implements ResultSetExtractor<List<TdCxlc>> {
        public List<TdCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdCxlc> listaCxlc = new ArrayList<TdCxlc>();
            while (rs.next()) {
                TdCxlc currentCxlc = new TdCxlc();
                currentCxlc.setCxlc(rs.getInt("CXLC"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class TdCxlcAux implements ResultSetExtractor<List<TdCxlc>> {
        public List<TdCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdCxlc> listaCxlc = new ArrayList<TdCxlc>();
            while (rs.next()) {
                TdCxlc currentCxlc = new TdCxlc();
                currentCxlc.setCxlcCiclo(rs.getInt("CXLC_CICLO"));
                currentCxlc.setCxlc(rs.getInt("CXLC"));
                currentCxlc.setIdTipoNomina(rs.getString("ID_TIPO_NOMINA"));
                currentCxlc.setCxlcQnaPago(rs.getInt("CXLC_QNA_PAGO"));
                currentCxlc.setCxlcComplemento(rs.getInt("CXLC_COMPLEMENTO"));
                currentCxlc.setCxlcCompromiso(rs.getLong("CXLC_COMPROMISO"));
                currentCxlc.setCxlcDevengado(rs.getLong("CXLC_DEVENGADO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class MontoTotalAux implements ResultSetExtractor<List<BigDecimal>> {
        public List<BigDecimal> extractData(ResultSet rs) throws SQLException {
            List<BigDecimal> listaCxlc = new ArrayList<BigDecimal>();
            while (rs.next()) {
                listaCxlc.add(rs.getBigDecimal("TOTAL"));
                logger.debug("CustomtdCxlcDAOImpl -> MontoTotalAux -----------------> " + rs.getBigDecimal("TOTAL"));
            }
            return listaCxlc;
        }
    }
    
    class GuiaContableAux implements ResultSetExtractor<List<String>> {
        public List<String> extractData(ResultSet rs) throws SQLException {
            
            List<String> listaGuiaContable = new ArrayList<String>();
            while (rs.next()) {
                listaGuiaContable.add(rs.getString("GUIA_CONTABLE_CLC"));
                logger.debug("CustomtdCxlcDAOImpl -> GuiaContableAux -----------------> " + rs.getString("GUIA_CONTABLE_CLC"));
            }
            return listaGuiaContable;
        }
    }
    
    class ClcTercerosAux implements ResultSetExtractor<List<Integer>> {
        public List<Integer> extractData(ResultSet rs) throws SQLException {
            List<Integer> listaCxlc = new ArrayList<Integer>();
            while (rs.next()) {
                listaCxlc.add(rs.getInt("SEC_CXLC_TERCEROS"));
                logger.debug("CustomtdCxlcDAOImpl -> ClcTerceros -----------------> " + rs.getInt("SEC_CXLC_TERCEROS"));
            }
            return listaCxlc;
        }
    }
    
    class TdCxlcRegistroAux implements ResultSetExtractor<List<TdCxlc>> {
        public List<TdCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdCxlc> listaCxlc = new ArrayList<TdCxlc>();
            while (rs.next()) {
                TdCxlc currentCxlc = new TdCxlc();
                currentCxlc.setCxlcCiclo(rs.getInt("CXLC_CICLO"));
                currentCxlc.setCxlc(rs.getInt("CXLC"));
                currentCxlc.setIdTipoNomina(rs.getString("ID_TIPO_NOMINA"));
                currentCxlc.setCxlcQnaPago(rs.getInt("CXLC_QNA_PAGO"));
                currentCxlc.setCxlcComplemento(rs.getInt("CXLC_COMPLEMENTO"));
                currentCxlc.setCxlcMonto(rs.getDouble("CXLC_MONTO"));
                currentCxlc.setCxlcSituacion(rs.getString("CXLC_SITUACION"));
                currentCxlc.setCxlcRectifica(rs.getInt("CXLC_RECTIFICA"));
                currentCxlc.setCxlcTipoProceso(rs.getString("CXLC_TIPO_PROCESO"));
                currentCxlc.setCxlcMaestroPto(rs.getInt("CXLC_MAESTRO_PTO"));
                currentCxlc.setCxlcConciliaSicop(rs.getInt("CXLC_CONCILIA_SICOP"));
                currentCxlc.setCxlcNota(rs.getString("CXLC_NOTA"));
                currentCxlc.setCxlcCompromiso(rs.getLong("CXLC_COMPROMISO"));
                currentCxlc.setCxlcDevengado(rs.getLong("CXLC_DEVENGADO"));
                currentCxlc.setCxlcSiaff(rs.getInt("CXLC_SIAFF"));
                currentCxlc.setCxlcIva(rs.getDouble("CXLC_IVA"));
                currentCxlc.setCxlcParametros(rs.getString("CXLC_PARAMETROS"));
                currentCxlc.setCxlcOrigen(rs.getInt("CXLC_ORIGEN"));
                currentCxlc.setNominaOrigen(rs.getString("NOMINA_ORIGEN"));
                currentCxlc.setUsuario(rs.getString("USUARIO"));
                currentCxlc.setFecModifico(rs.getDate("FEC_MODIFICO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class TdSecCxlcRegistroAux implements ResultSetExtractor<List<TdSecCxlc>> {
        public List<TdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdSecCxlc> listaCxlc = new ArrayList<TdSecCxlc>();
            while (rs.next()) {
                TdSecCxlc currentCxlc = new TdSecCxlc();
                currentCxlc.setSecCxlcCiclo(rs.getInt("SEC_CXLC_CICLO"));
                currentCxlc.setCxlc(rs.getInt("CXLC"));
                currentCxlc.setSecCxlc(rs.getInt("SEC_CXLC"));
                currentCxlc.setIdUnidad(rs.getString("ID_UNIDAD"));
                currentCxlc.setIdUnidadEjecuto(rs.getString("ID_UNIDAD_EJECUTO"));
                currentCxlc.setIdEdo(rs.getInt("ID_EDO"));
                currentCxlc.setIdFuncion(rs.getString("ID_FUNCION"));
                currentCxlc.setIdPrograma(rs.getString("ID_PROGRAMA"));
                currentCxlc.setIdActInsti(rs.getString("ID_ACT_INSTI"));
                currentCxlc.setIdActPriorita(rs.getString("ID_ACT_PRIORITA"));
                currentCxlc.setIdActInstiEsp(rs.getString("ID_ACT_INSTI_ESP"));
                currentCxlc.setIdPartida(rs.getString("ID_PARTIDA"));
                
                currentCxlc.setIdTipoGasto(rs.getInt("ID_TIPO_GASTO"));
                currentCxlc.setIdFuenteFinan(rs.getInt("ID_FUENTE_FINAN"));
                
                currentCxlc.setSecGuiaContableEjer(rs.getInt("SEC_GUIA_CONTABLE_EJER"));
                currentCxlc.setSecMonto(rs.getDouble("SEC_MONTO"));
                currentCxlc.setSecClaveMov(rs.getString("SEC_CLAVE_MOV"));
                currentCxlc.setIdSindicato(rs.getInt("ID_SINDICATO"));
                currentCxlc.setSecFecExtraSicop(rs.getDate("SEC_FEC_EXTRA_SICOP"));
                currentCxlc.setSecCxlcTerceros(rs.getInt("SEC_CXLC_TERCEROS"));
                currentCxlc.setSecTerceros(rs.getInt("SEC_TERCEROS"));
                currentCxlc.setIdGrupopago(rs.getString("ID_GRUPOPAGO"));
                currentCxlc.setSecCtaClabe(rs.getString("SEC_CTA_CLABE"));
                currentCxlc.setSecCompromiso(rs.getString("SEC_COMPROMISO"));
                currentCxlc.setSecDevengado(rs.getLong("SEC_DEVENGADO"));
                currentCxlc.setSecCxlcSiaff(rs.getLong("SEC_CXLC_SIAFF"));
                currentCxlc.setSecSiaff(rs.getInt("SEC_SIAFF"));
                currentCxlc.setSecQnaApli(rs.getInt("SEC_QNA_APLI"));
                currentCxlc.setSecTipoCpto(rs.getString("SEC_TIPO_CPTO"));
                currentCxlc.setSecCptoMovto(rs.getString("SEC_CPTO_MOVTO"));
                currentCxlc.setUsuario(rs.getString("USUARIO"));
                currentCxlc.setFecModifico(rs.getDate("FEC_MODIFICO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    private class SelectCXLCQuincenalSP extends StoredProcedure {
        /**
         * Constructor - Declaracion de Variables IN/OUT
         * @author Oscar S.
         * @param dataSource DataSource
         */
        public SelectCXLCQuincenalSP(DataSource dataSource) {
            super(dataSource, SP_GENERA_CXLC_QUINCENAL);
            
            declareParameter(new SqlParameter("CICLO_IN", Types.INTEGER)); // 4
            declareParameter(new SqlParameter("HP_QNA_PAGO_IN", Types.INTEGER)); //8
            declareParameter(new SqlParameter("ID_TIPO_NOMINA_IN", Types.VARCHAR)); // 12
            declareParameter(new SqlParameter("HP_NUM_COMPLE_IN", Types.VARCHAR)); //12
            declareParameter(new SqlParameter("USUARIO_IN", Types.VARCHAR)); //12
            
            declareParameter(new SqlOutParameter("RET_VAL_OUT", Types.INTEGER)); //2
            compile();
        }
        
        /**
         * Metodo encargado de ejecutar el procedure.
         * @author Oscar S.
         * @@param cicloUnidad Integer
         * @param quincenaPago Integer
         * @param tipoNomina String
         * @param complemento String
         * @param usuario String
         * @return executeError Integer
         */
        public Integer execute(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento, String usuario) {
            int executeError = 0;
            
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("CICLO_IN", cicloUnidad);
            map.put("HP_QNA_PAGO_IN", quincenaPago);
            map.put("ID_TIPO_NOMINA_IN", tipoNomina);
            map.put("HP_NUM_COMPLE_IN", complemento);
            map.put("USUARIO_IN", usuario);
            
            Map<String, Object> result = super.execute(map);
            executeError = new Integer(result.get("RET_VAL_OUT").toString());
            
            return executeError;
        }
    }
    
    class TdCxlcProcesaTercerosAux implements ResultSetExtractor<List<TdCxlc>> {
        public List<TdCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdCxlc> listaCxlc = new ArrayList<TdCxlc>();
            while (rs.next()) {
                TdCxlc currentCxlc = new TdCxlc();
                currentCxlc.setCxlc(rs.getInt("CXLC"));
                currentCxlc.setCxlcQnaPago(rs.getInt("CXLC_QNA_PAGO"));
                currentCxlc.setIdTipoNomina(rs.getString("ID_TIPO_NOMINA"));
                currentCxlc.setCxlcComplemento(rs.getInt("CXLC_COMPLEMENTO"));
                //currentCxlc.setSecCxlcTerceros(rs.getInt("SEC_CXLC_TERCEROS"));
                currentCxlc.setCxlcCompromiso(rs.getLong("CXLC_COMPROMISO"));
                currentCxlc.setCxlcDevengado(rs.getLong("CXLC_DEVENGADO"));
                //currentCxlc.setSecMonto(rs.getDouble("MONTO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class TcUnidadEdoAux implements ResultSetExtractor<List<TcUnidadEdo>> {
        public List<TcUnidadEdo> extractData(ResultSet rs) throws SQLException {
            List<TcUnidadEdo> listaUnidades = new ArrayList<TcUnidadEdo>();
            while (rs.next()) {
                TcUnidadEdo currentUnidad = new TcUnidadEdo();
                currentUnidad.setUniEdoCiclo(rs.getInt("UNI_EDO_CICLO"));
                currentUnidad.setIdUnidad(rs.getString("ID_UNIDAD"));
                currentUnidad.setIdEdo(rs.getInt("ID_EDO"));
                currentUnidad.setUsuario(rs.getString("USUARIO"));
                currentUnidad.setFecModifico(rs.getDate("FEC_MODIFICO"));
                listaUnidades.add(currentUnidad);
            }
            return listaUnidades;
        }
    }
}
