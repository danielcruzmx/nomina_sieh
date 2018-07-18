package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;



import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobantePdfBlob;


import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.List;


import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomTnComprobantePdfDAOImpl extends JdbcDAO implements CustomTnComprobantePdfDAO {

    public List<TnComprobantePdfBlob> getTnComprobantePdfById(List<Integer> listFolios, Integer cnDifFolio) {
        String queryTnComprobantePdfById = super.getQueryDefinition("queryTnComprobantePdfById");
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listFolios",listFolios).addValue("cnDifFolio", cnDifFolio);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        List<TnComprobantePdfBlob> lista = namedTemplate.query(queryTnComprobantePdfById, namedParameters, new TnComprobantePdfRM());
        
        
        return lista;
    }
    
    private class TnComprobantePdfRM implements RowMapper {
        public TnComprobantePdfBlob mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobantePdfBlob tnComprobantePdf = new TnComprobantePdfBlob();

            tnComprobantePdf.setCnDifFolio( rs.getInt("CN_DIF_FOLIO"));
            tnComprobantePdf.setCnFolio(rs.getLong("CN_FOLIO"));
            tnComprobantePdf.setCnArchivoPdf( rs.getBytes("CN_ARCHIVO_PDF"));
            tnComprobantePdf.setCnArchivoPdfBlob(rs.getBlob("CN_ARCHIVO_PDF"));
            tnComprobantePdf.setCnConsecNomina( rs.getInt("CN_CONSEC_NOMINA"));
            tnComprobantePdf.setCnEjercicio(rs.getInt("CN_EJERCICIO"));
            tnComprobantePdf.setUsuario( rs.getString("USUARIO"));
            tnComprobantePdf.setFecModifico(rs.getDate("FEC_MODIFICO"));
            return tnComprobantePdf;
        }
    }
}
