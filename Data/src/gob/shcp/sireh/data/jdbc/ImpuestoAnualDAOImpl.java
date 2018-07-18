package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.data.jdbc.support.CustomArmaArchivoTercerosDAOImpl;

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

public class ImpuestoAnualDAOImpl extends JdbcDAO implements ImpuestoAnualDAO {
    
    public void updateNomina(Long idNomina, Integer ciclo){   super.executeByNamedQuery("updateNominaEjercicioFiascal", ciclo, idNomina);   }
    
    public List<Map<Integer, Object>> getAcumuladoPercepcionesDeducciones(Integer ciclo, String tipoConcepto, String origen, String filtro){
        GetAcumuladoPercepcionesDeducciones gapd = new GetAcumuladoPercepcionesDeducciones(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)gapd.execute(ciclo, tipoConcepto, origen, filtro);
    }
    
    public class GetAcumuladoPercepcionesDeducciones extends StoredProcedure {
        private static final String SPROC_NAME = "pkg_acumulado_impuesto_v1.ACUMULADO_IMPUESTO_CUR";
        public GetAcumuladoPercepcionesDeducciones(DataSource datasource){
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArcAcumuladoPercepDeducRM()));
            declareParameter(new SqlParameter("Ciclo_in",           Types.INTEGER));
            declareParameter(new SqlParameter("Tipo_Concepto_in",   Types.VARCHAR));
            declareParameter(new SqlParameter("Origen_in",          Types.VARCHAR));
            declareParameter(new SqlParameter("Filtro_in",          Types.VARCHAR));
            compile();
        }
        
        public Object execute(Integer ciclo, String tipoConcepto, String origen, String filtro) {
            Object objeto = new Object();
            
            try {
                Map<String, Object> results = super.execute(ciclo, tipoConcepto, origen, filtro);
                objeto = ((List)results.get(SPROC_NAME)).get(0);
            }
            catch(IndexOutOfBoundsException b){ objeto = null;  }
            catch (Exception e) {  objeto = null;  }
            return objeto;
        }
    }
    
    public class GeneraArcAcumuladoPercepDeducRM  implements RowMapper<List<Map<Integer, Object>>> {
        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Map<Integer, Object>> acumulado = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            TreeMap<Integer, Object> header = new TreeMap<Integer, Object>();
            
            for (int i = 1; i <= columnsNumber; i++) {   
                header.put(i, rsmd.getColumnName(i));   
            }
            
            acumulado.add(header);
            logger.debug("columnsNumber -> " + columnsNumber);
            
            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                acumulado.add(mapa);
            } while (rs.next());
            return acumulado;
        }
    }
}
