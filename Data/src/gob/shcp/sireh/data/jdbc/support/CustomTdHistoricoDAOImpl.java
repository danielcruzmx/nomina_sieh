package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sql.DataSource;

import oracle.jdbc.OracleTypes;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class CustomTdHistoricoDAOImpl extends JdbcDAO implements CustomTdHistoricoDAO {

    public void updateMeritoActualizaRfcHistorico(String td_nmh_rfc_unico, String rfc_unico) {
        super.executeByNamedQuery("updateMeritoActualizaRfcHistorico", td_nmh_rfc_unico, rfc_unico);
    }

    public void updateMeritoActualizaRfcProcesoNmHistorico(String td_nmh_rfc_unico, String rfc_unico) {
        super.executeByNamedQuery("updateMeritoActualizaRfcProcesoNmHistorico", td_nmh_rfc_unico, rfc_unico);
    }

    public Integer getHistoricoMaxPag(String rfcEmpleado, String qnaIni, String qnaFin) {
        String countHistoricoSQL = super.getQueryDefinition("countHistorico");
        return super.getJdbcTemplate().queryForInt(countHistoricoSQL, 
                                                   new Object[] { qnaIni, qnaIni, qnaIni, qnaIni, qnaIni, qnaIni, 
                                                                  qnaFin, qnaFin, qnaFin, qnaFin, qnaFin, qnaFin, 
                                                                  rfcEmpleado });
    }

    public String constanciasF(String rfc) {
        String sql = super.getQueryDefinition("constanciasF");
        String datos = null;
        try {
            datos = super.getJdbcTemplate().queryForObject(sql, String.class, rfc);
        } catch (EmptyResultDataAccessException e) {
            e.printStackTrace();
            e.getMessage();
            datos = null;
        }
        return datos;
    }

    /**
     * Metodo encargado de obtener las prestaciones trimestrales por grupo de pago
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param grupoPago String
     * @param tipo String
     * @return List<Map<Integer, Object>>
     */
    public List<Map<Integer, Object>> generaPrestTrimByGpoPago(Integer qnaIni, Integer qnaFin, String grupoPago, String tipo) {
        GeneraPrestacion gt = new GeneraPrestacion(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)gt.execute(qnaIni, qnaFin, grupoPago, tipo);
    }

    private class GeneraPrestacion extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_CXLC_AUTO_V3.CONSULTA_CURSOR";

        public GeneraPrestacion(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArchivoRM()));
            declareParameter(new SqlParameter("qnaIni", Types.VARCHAR));
            declareParameter(new SqlParameter("qnaFin", Types.VARCHAR));
            declareParameter(new SqlParameter("grupoPago", Types.VARCHAR));
            declareParameter(new SqlParameter("tipo", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer qnaIni, Integer qnaFin, String grupoPago, String tipo) {
            Map<String, Object> results = super.execute(String.valueOf(qnaIni), String.valueOf(qnaFin), grupoPago, tipo);
            return ((List)results.get(SPROC_NAME)).get(0);
        }

        class GeneraArchivoRM implements RowMapper<List<Map<Integer, Object>>> {
            public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
                List<Map<Integer, Object>> generarPrestacion = new ArrayList<Map<Integer, Object>>();
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                Map<Integer, Object> header = new HashMap<Integer, Object>();

                for (int i = 1; i <= columnsNumber; i++) {
                    header.put(i, rsmd.getColumnName(i));
                    logger.debug("columnName -> " + rsmd.getColumnName(i));
                }
                generarPrestacion.add(header);
                logger.debug("columnsNumber -> " + columnsNumber);

                do {
                    TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                    for (int i = 1; i <= columnsNumber; i++) {
                        mapa.put(i, rs.getObject(i));
                    }
                    generarPrestacion.add(mapa);
                } while (rs.next());
                return generarPrestacion;
            }
        }
    }
}
