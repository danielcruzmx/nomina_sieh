package gob.shcp.sireh.data.jdbc.spc;

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

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class ConsultaSPCDAOImpl extends JdbcDAO implements ConsultaSPCDAO {

    /**
     * Metodo encargado de obtener Acuerdos CAPCER
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosUnidad(Integer ciclo, String fechaIni, String fechaFin) {
        GeneraAcuerdoUR ga = new GeneraAcuerdoUR(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)ga.execute(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo encargado de obtener Acuerdos CAPCER Modalidad
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosModalidad(Integer ciclo, String fechaIni, String fechaFin) {
        GeneraAcuerdoModalidad ga = new GeneraAcuerdoModalidad(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)ga.execute(ciclo, fechaIni, fechaFin);
    }

    /**
     * Metodo encargado de obtener Acuerdos CAPCER Insti Educa
     * @author Armando Zuñiga.
     * @param ciclo Integer
     * @param fechaIni String
     * @param fechaFin String
     * @return List&lt;Map&lt;Integer, Object&gt;&gt;
     */
    public List<Map<Integer, Object>> generaAcuerdosInsEdu(Integer ciclo, String fechaIni, String fechaFin) {
        GeneraAcuerdoInstiEducat ga = new GeneraAcuerdoInstiEducat(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)ga.execute(ciclo, fechaIni, fechaFin);
    }

    /**
     * Clase anidada encargada de llamar a la funcion ACUERDO_UR_ADM
     */
    public class GeneraAcuerdoUR extends StoredProcedure {

        private static final String SPROC_NAME = "PKG_CAPCER_CONSULTAS.ACUERDO_UR_ADM";

        public GeneraAcuerdoUR(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArchivoRM()));

            declareParameter(new SqlParameter("Ciclo", Types.INTEGER));
            declareParameter(new SqlParameter("Fecha_Ini", Types.VARCHAR));
            declareParameter(new SqlParameter("Fecha_Fin", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer ciclo, String fechaIni, String fechaFin) {
            Object objeto = new Object();

            try {
                Map<String, Object> results = super.execute(ciclo, fechaIni, fechaFin);
                objeto = ((List)results.get(SPROC_NAME)).get(0);
            } catch (IndexOutOfBoundsException b) {
                objeto = null;
            } catch (Exception e) {
                objeto = null;
            }
            return objeto;
        }
    }

    /**
     * Clase anidada encargada de llamar a la funcion ACUERDO_MODALIDAD
     */
    public class GeneraAcuerdoModalidad extends StoredProcedure {

        private static final String SPROC_NAME = "PKG_CAPCER_CONSULTAS.ACUERDO_MODALIDAD";

        public GeneraAcuerdoModalidad(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArchivoRM()));

            declareParameter(new SqlParameter("Ciclo", Types.INTEGER));
            declareParameter(new SqlParameter("Fecha_Ini", Types.VARCHAR));
            declareParameter(new SqlParameter("Fecha_Fin", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer ciclo, String fechaIni, String fechaFin) {
            Object objeto = new Object();

            try {
                Map<String, Object> results = super.execute(ciclo, fechaIni, fechaFin);
                objeto = ((List)results.get(SPROC_NAME)).get(0);
            } catch (IndexOutOfBoundsException b) {
                objeto = null;
            } catch (Exception e) {
                objeto = null;
            }
            return objeto;
        }
    }

    /**
     * Clase anidada encargada de llamar a la funcion ACUERDO_INSTI_EDUC
     */
    public class GeneraAcuerdoInstiEducat extends StoredProcedure {

        private static final String SPROC_NAME = "PKG_CAPCER_CONSULTAS.ACUERDO_INSTI_EDUC";

        public GeneraAcuerdoInstiEducat(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArchivoRM()));

            declareParameter(new SqlParameter("Ciclo", Types.INTEGER));
            declareParameter(new SqlParameter("Fecha_Ini", Types.VARCHAR));
            declareParameter(new SqlParameter("Fecha_Fin", Types.VARCHAR));
            compile();
        }

        public Object execute(Integer ciclo, String fechaIni, String fechaFin) {
            Object objeto = new Object();

            try {
                Map<String, Object> results = super.execute(ciclo, fechaIni, fechaFin);
                objeto = ((List)results.get(SPROC_NAME)).get(0);
            } catch (IndexOutOfBoundsException b) {
                objeto = null;
            } catch (Exception e) {
                objeto = null;
            }
            return objeto;
        }
    }

    /**
     * Clase anidada encargada de implementar el RowMapper del objeto ResultSet.
     */
    public class GeneraArchivoRM implements RowMapper<List<Map<Integer, Object>>> {

        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {

            List<Map<Integer, Object>> generarAcuerdo = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();

            int columnsNumber = rsmd.getColumnCount();
            Map<Integer, Object> header = new HashMap<Integer, Object>();

            for (int i = 1; i <= columnsNumber; i++) {
                header.put(i, rsmd.getColumnName(i));
                logger.debug("columnName -> " + rsmd.getColumnName(i));
            }
            generarAcuerdo.add(header);
            logger.debug("columnsNumber -> " + columnsNumber);

            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                generarAcuerdo.add(mapa);
            } while (rs.next());
            return generarAcuerdo;
        }
    }
}
