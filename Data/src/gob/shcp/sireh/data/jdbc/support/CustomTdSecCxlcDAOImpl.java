package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.domain.jdbc.CustomTdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomTdSecCxlcDAOImpl extends JdbcDAO implements CustomTdSecCxlcDAO {

    /**
     * Metodo encargado de obtener las cxlc a comprometer con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc Set<Integer>
     * @return cxlcComprometer List<CustomTdSecCxlc>
     */
    public List<CustomTdSecCxlc> getDetalleCxlcSolicitudCompromiso(Integer secCxlcCiclo, Set<Integer> secCxlc) {
        String detalleSolicitudCompromiso = super.getQueryDefinition("detalleSolicitudCompromiso");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("secCxlc", secCxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(detalleSolicitudCompromiso, namedParameters, new CustomTdSecCxlcAux());
    }
    
    /**
     * Metodo encargado de obtener las cxlc a pagar con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc Set<Integer>
     * @return cxlcComprometer List<CustomTdSecCxlc>
     */
    public List<CustomTdSecCxlc> getDetalleCxlcSolicitudPago(Integer secCxlcCiclo, Set<Integer> secCxlc) {
        String detalleSolicitudPago = super.getQueryDefinition("detalleSolicitudPago");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("secCxlc", secCxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(detalleSolicitudPago, namedParameters, new CustomTdSecCxlcAuxPago());
    }
    
    /**
     * Metodo encargado de obtener las cxlc con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc Set<Integer>
     * @return cxlcComprometer List<CustomTdSecCxlc>
     */
    public List<CustomTdSecCxlc> getDetalleCxlcSolicitudCLC(Integer secCxlcCiclo, Set<Integer> secCxlc) {
        String detalleSolicitudCLC = super.getQueryDefinition("detalleSolicitudCLC");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("secCxlcCiclo", secCxlcCiclo);
        mapValues.put("cxlcCiclo", secCxlcCiclo);
        mapValues.put("secCxlc", secCxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(detalleSolicitudCLC, namedParameters, new CustomTdSecCxlcAuxCLC());
    }
    
    /**
     * Interfaz SICOP - Solicitud de CLC - Metodo encargado de obtener el compromiso y complemento actual
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlc Set<Integer>
     * @return tdCxlc List<TdCxlc>
     */
    public List<TdCxlc> getCxlcCompromisoComplementoActual(Integer cxlcCiclo, Set<Integer> cxlc) {
        String cxlcCompromisoActual = super.getQueryDefinition("cxlcCompromisoActual");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        mapValues.put("cxlc", cxlc);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(cxlcCompromisoActual, namedParameters, new TdCxlcAux());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener el numero maximo de sec_cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return tdSecCxlc List<TdSecCxlc>
     */
    public List<TdSecCxlc> getMaxSecCxlcManuales(Integer cxlcCiclo) {
        String getMaxSecCxlcManuales = super.getQueryDefinition("getMaxSecCxlcManuales");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("cxlcCiclo", cxlcCiclo);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(getMaxSecCxlcManuales, namedParameters, new TdSecCxlcMaxManualAux());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener la sec_cxlc con base a parametros obtenidos del archivo de cxlc manual.
     * @author Oscar S.
     * @param ciclo Integer
     * @param unidad String
     * @param partida String
     * @param estado String
     * @return tdSecCxlc List<TdSecCxlc>
     */
    public List<TdSecCxlc> getSecCxlcManualArchivo(Integer ciclo, String unidad, String partida, String estado) {
        String getSecCxlcManualArchivo = super.getQueryDefinition("getSecCxlcManualArchivo");
        
        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("ciclo", ciclo);
        mapValues.put("unidad", unidad);
        mapValues.put("partida", partida);
        mapValues.put("estado", estado);
        
        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        super.getJdbcTemplate().setFetchSize(100);
        
        return namedTemplate.query(getSecCxlcManualArchivo, namedParameters, new TdSecCxlcManualArchivoAux());
    }
    
    class TdSecCxlcManualArchivoAux implements ResultSetExtractor<List<TdSecCxlc>> {
        public List<TdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdSecCxlc> listaCxlc = new ArrayList<TdSecCxlc>();
            while (rs.next()) {
                TdSecCxlc currentCxlc = new TdSecCxlc();                
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
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class TdSecCxlcMaxManualAux implements ResultSetExtractor<List<TdSecCxlc>> {
        public List<TdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<TdSecCxlc> listaCxlc = new ArrayList<TdSecCxlc>();
            while (rs.next()) {
                TdSecCxlc currentCxlc = new TdSecCxlc();
                currentCxlc.setSecCxlc(rs.getInt("SEC_CXLC"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }

    class CustomTdSecCxlcAux implements ResultSetExtractor<List<CustomTdSecCxlc>> {
        public List<CustomTdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<CustomTdSecCxlc> listaCxlc = new ArrayList<CustomTdSecCxlc>();
            while (rs.next()) {
                CustomTdSecCxlc currentCxlc = new CustomTdSecCxlc();
                currentCxlc.setSecCxlcCiclo(rs.getInt("SEC_CXLC_CICLO"));
                currentCxlc.setIdUnidad(rs.getString("ID_UNIDAD"));
                currentCxlc.setIdFuncion(rs.getString("ID_FUNCION"));
                currentCxlc.setIdUnidadEjecuto(rs.getString("ID_UNIDAD_EJECUTO"));
                currentCxlc.setIdPrograma(rs.getString("ID_PROGRAMA"));
                currentCxlc.setIdActInsti(rs.getString("ID_ACT_INSTI"));
                currentCxlc.setIdActPriorita(rs.getString("ID_ACT_PRIORITA"));
                currentCxlc.setIdPartida(rs.getString("ID_PARTIDA"));
                currentCxlc.setIdTipoGasto(rs.getInt("ID_TIPO_GASTO"));
                currentCxlc.setIdFuenteFinan(rs.getInt("ID_FUENTE_FINAN"));
                currentCxlc.setIdEdo(rs.getInt("ID_EDO"));
                currentCxlc.setIdActInstiEsp(rs.getString("ID_ACT_INSTI_ESP"));
                currentCxlc.setMonto(rs.getDouble("MONTO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class CustomTdSecCxlcAuxPago implements ResultSetExtractor<List<CustomTdSecCxlc>> {
        public List<CustomTdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<CustomTdSecCxlc> listaCxlc = new ArrayList<CustomTdSecCxlc>();
            while (rs.next()) {
                CustomTdSecCxlc currentCxlc = new CustomTdSecCxlc();
                currentCxlc.setSecCxlcCiclo(rs.getInt("SEC_CXLC_CICLO"));
                currentCxlc.setIdUnidad(rs.getString("ID_UNIDAD"));
                currentCxlc.setIdFuncion(rs.getString("ID_FUNCION"));
                currentCxlc.setIdUnidadEjecuto(rs.getString("ID_UNIDAD_EJECUTO"));
                currentCxlc.setIdPrograma(rs.getString("ID_PROGRAMA"));
                currentCxlc.setIdActInsti(rs.getString("ID_ACT_INSTI"));
                currentCxlc.setIdActPriorita(rs.getString("ID_ACT_PRIORITA"));
                currentCxlc.setIdPartida(rs.getString("ID_PARTIDA"));
                currentCxlc.setIdTipoGasto(rs.getInt("ID_TIPO_GASTO"));
                currentCxlc.setIdFuenteFinan(rs.getInt("ID_FUENTE_FINAN"));
                currentCxlc.setIdEdo(rs.getInt("ID_EDO"));
                currentCxlc.setIdActInstiEsp(rs.getString("ID_ACT_INSTI_ESP"));
                currentCxlc.setMonto(rs.getDouble("MONTO"));
                currentCxlc.setSecCompromiso(rs.getString("SEC_COMPROMISO"));
                currentCxlc.setSecTipoCpto(rs.getString("SEC_TIPO_CPTO"));
                currentCxlc.setSecCptoMovto(rs.getString("SEC_CPTO_MOVTO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
    
    class CustomTdSecCxlcAuxCLC implements ResultSetExtractor<List<CustomTdSecCxlc>> {
        public List<CustomTdSecCxlc> extractData(ResultSet rs) throws SQLException {
            List<CustomTdSecCxlc> listaCxlc = new ArrayList<CustomTdSecCxlc>();
            while (rs.next()) {
                CustomTdSecCxlc currentCxlc = new CustomTdSecCxlc();
                currentCxlc.setSecCxlcCiclo(rs.getInt("SEC_CXLC_CICLO"));
                currentCxlc.setIdUnidad(rs.getString("ID_UNIDAD"));
                currentCxlc.setIdFuncion(rs.getString("ID_FUNCION"));
                currentCxlc.setIdUnidadEjecuto(rs.getString("ID_UNIDAD_EJECUTO"));
                currentCxlc.setIdPrograma(rs.getString("ID_PROGRAMA"));
                currentCxlc.setIdActInsti(rs.getString("ID_ACT_INSTI"));
                currentCxlc.setIdActPriorita(rs.getString("ID_ACT_PRIORITA"));
                currentCxlc.setIdPartida(rs.getString("ID_PARTIDA"));
                currentCxlc.setIdTipoGasto(rs.getInt("ID_TIPO_GASTO"));
                currentCxlc.setIdFuenteFinan(rs.getInt("ID_FUENTE_FINAN"));
                currentCxlc.setIdEdo(rs.getInt("ID_EDO"));
                currentCxlc.setIdActInstiEsp(rs.getString("ID_ACT_INSTI_ESP"));
                currentCxlc.setMonto(rs.getDouble("MONTO"));
                currentCxlc.setSecCompromiso(rs.getString("SEC_COMPROMISO"));
                currentCxlc.setSecTipoCpto(rs.getString("SEC_TIPO_CPTO"));
                currentCxlc.setSecCptoMovto(rs.getString("SEC_CPTO_MOVTO"));
                currentCxlc.setSecDevengado(rs.getLong("SEC_DEVENGADO"));
                currentCxlc.setDevengado(rs.getInt("CXLC_DEVENGADO"));
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
                currentCxlc.setCxlcCompromiso(rs.getLong("CXLC_COMPROMISO"));
                currentCxlc.setCxlcComplemento(rs.getInt("CXLC_COMPLEMENTO"));
                listaCxlc.add(currentCxlc);
            }
            return listaCxlc;
        }
    }
}
