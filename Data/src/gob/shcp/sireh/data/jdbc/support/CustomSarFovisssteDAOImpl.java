package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.sql.Types;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class CustomSarFovisssteDAOImpl extends JdbcDAO implements CustomSarFovisssteDAO {
    
    public void procesaSARFOV(String nominas, Integer bimestre) {
        SarFovissste sp = new SarFovissste(super.getJdbcTemplate().getDataSource());
        String out = (String) sp.execute(nominas, bimestre);
        logger.info("CustomSarFovisssteDAOImpl: " + out);
    }
    
    private class SarFovissste extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_SAR.FUNC_PROCESO_SAR";
        
        public SarFovissste(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, Types.VARCHAR));
            declareParameter(new SqlParameter("P_CONSEC_NUM", Types.VARCHAR));
            declareParameter(new SqlParameter("P_BIMESTRE", Types.INTEGER));
            compile();
        }

        public Object execute(String nominas, Integer bimestre) {
            Map<String, Object> results = super.execute(nominas, bimestre);
            return results.get(SPROC_NAME);
        }
    }
}
