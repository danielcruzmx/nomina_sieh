package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sql.DataSource;

import oracle.jdbc.OracleTypes;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

/**
 * Implementación DAO para la generacion de archivos con informacion de nomina y conceptos con o sin pago
 * @author Roberto Muñoz
 * @param consecNomina,  tipoarchivo
 * @return Lista con datos
 */
public class CustomHistoricoRevisionDAOImpl extends JdbcDAO implements CustomHistoricoRevisionDAO {

    public List<Map<Integer, Object>> getSelectHistoricoRevisionOP1(Integer consecNomina, String tipoarchivo) throws Exception {
        logger.debug("--> getSelectHistoricoRevisionOP1 --->" + consecNomina + " - " + tipoarchivo);
        HistoricoRevision sp = new HistoricoRevision(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)sp.execute(consecNomina, tipoarchivo);
    }

    private class HistoricoRevision extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_HISTORICO_NOMINA.HistoricoRevision";

        public HistoricoRevision(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new HistoricoRevisionRM()));
            declareParameter(new SqlParameter("nomina_in", Types.INTEGER));
            declareParameter(new SqlParameter("tipoarchivo", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer consecNomina, String tipoarchivo) {
            Map<String, Object> results = super.execute(consecNomina, tipoarchivo);
            return results.size() == 0 ? new ArrayList<Map<Integer, Object>>() : ((List)results.get(SPROC_NAME)).get(0);
        }
    }

    class HistoricoRevisionRM implements RowMapper<List<Map<Integer, Object>>> {
        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Map<Integer, Object>> listaHistorico = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            TreeMap<Integer, Object> header = new TreeMap<Integer, Object>();
            for (int i = 1; i <= columnsNumber; i++) {
                header.put(i, rsmd.getColumnName(i));
            }
            listaHistorico.add(header);

            logger.debug("columnsNumber -> " + columnsNumber);

            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                listaHistorico.add(mapa);
            } while (rs.next());
            return listaHistorico;
        }
    }

    public List<Map<Integer, Object>> getSelectHistoricoAcumuladoOP1(Integer qnaini, Integer qnafin, String rfc, String rfcb, String estatus, String tipopro) throws Exception {
        HistoricoAcumulado sp = new HistoricoAcumulado(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)sp.execute(qnaini, qnafin, rfc, rfcb, estatus, tipopro);
    }

    private class HistoricoAcumulado extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_HISTORICO_NOMINA.HistoricoAcumulado";

        public HistoricoAcumulado(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new HistoricoAcumuladoRM()));
            declareParameter(new SqlParameter("qnaini", Types.INTEGER));
            declareParameter(new SqlParameter("qnafin", Types.INTEGER));            
            declareParameter(new SqlParameter("rfc", Types.VARCHAR));
            declareParameter(new SqlParameter("rfcb", Types.VARCHAR));
            declareParameter(new SqlParameter("estatus", Types.VARCHAR));
            declareParameter(new SqlParameter("tipopro", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer qnaini, Integer qnafin, String rfc, String rfcb, String estatus, String tipopro) {
            Map<String, Object> results = super.execute(qnaini, qnafin, rfc, rfcb, estatus, tipopro);
            return results.size() == 0 ? new ArrayList<Map<Integer, Object>>() : ((List)results.get(SPROC_NAME)).get(0);
        }
    }

    class HistoricoAcumuladoRM implements RowMapper<List<Map<Integer, Object>>> {
        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Map<Integer, Object>> listaHistorico = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            TreeMap<Integer, Object> header = new TreeMap<Integer, Object>();
            for (int i = 1; i <= columnsNumber; i++) {
                header.put(i, rsmd.getColumnName(i));
            }
            listaHistorico.add(header);

            logger.debug("columnsNumber -> " + columnsNumber);

            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                listaHistorico.add(mapa);
            } while (rs.next());
            return listaHistorico;
        }
    }
}
