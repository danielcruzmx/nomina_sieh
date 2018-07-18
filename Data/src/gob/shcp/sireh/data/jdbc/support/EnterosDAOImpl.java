package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.Enteros;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;

public class EnterosDAOImpl extends JdbcDAO  implements EnterosDAO {
    public EnterosDAOImpl() {
    }

    public  List<Map> procesoEnteros(String qnaPago, List<String> listaCompl,  List<String> listaDeduccion, List<String> listaPercepcion) {
        String enterosQuery =  super.getQueryDefinition("selectEnteros");
     
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaDeduccion", listaDeduccion).addValue("listaPercepcion", listaPercepcion).addValue("qnaPago", qnaPago).addValue("listaCompl", listaCompl);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        List<Map> listaEnteros = namedTemplate.query(enterosQuery,namedParameters,new EnterosRM());
        return listaEnteros;
    }

    public List<Enteros> getEnterosReg(String qnaPago, List<String> listaCompl,List<String> listaDeduccion, List<String> listaPercepcion) {
        String enterosQuery =  super.getQueryDefinition("selectEnterosReg");
        
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaDeduccion", listaDeduccion).addValue("listaPercepcion", listaPercepcion).addValue("qnaPago", qnaPago).addValue("listaCompl", listaCompl);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        List<Enteros> listaEnteros = namedTemplate.query(enterosQuery,namedParameters,new EnterosRegRM());
        return listaEnteros;
    }

    public List<Enteros> getEnterosTotalDeduccion(String qnaPago, List<String> listaCompl, List<String> listaDeduccion) {
        String enterosQuery =  super.getQueryDefinition("selectEnterosTotalD");
        
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaDeduccion", listaDeduccion).addValue("qnaPago", qnaPago).addValue("listaCompl", listaCompl);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        List<Enteros> listaEnteros = namedTemplate.query(enterosQuery,namedParameters,new EnterosTotalRM());
        return listaEnteros;
    }

    public List<Enteros> getEnterosTotalPercepcion(String qnaPago, List<String> listaCompl,  List<String> listaPercepcion) {
        String enterosQuery =  super.getQueryDefinition("selectEnterosTotalP");
        
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaPercepcion", listaPercepcion).addValue("qnaPago", qnaPago).addValue("listaCompl", listaCompl);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        
        List<Enteros> listaEnteros = namedTemplate.query(enterosQuery,namedParameters,new EnterosTotalRM());
        return listaEnteros;
    }
   
    class EnterosRM  implements RowMapper{
        public Map mapRow(ResultSet rs, int rowNum) throws SQLException {
            Map mapa  = new HashMap(); 
            mapa.put("rfc",rs.getString("HP_RFC")); 
            mapa.put("primerApellido",rs.getString("PRIMER_APELLIDO"));
            mapa.put("segundoApellido",rs.getString("SEGUNDO_APELLIDO"));
            mapa.put("nombre",rs.getString("NOMBRE"));
            mapa.put("nombreCompleto",rs.getString("PRIMER_APELLIDO")+" "+rs.getString("SEGUNDO_APELLIDO")+" "+rs.getString("NOMBRE"));
            mapa.put("idUnidad",rs.getString("ID_UNIDAD_NOM"));
            mapa.put("idNivel",rs.getString("ID_NIVEL_PTO"));
            mapa.put("curp",rs.getString("CURP_EMPLEADO"));
            mapa.put("imssIssste",rs.getString("IMSS_ISSSTE"));
            mapa.put("idPlaza",rs.getString("ID_PLAZA"));
            mapa.put("folio",rs.getString("HP_FOLIO"));
            mapa.put("qnaPago",rs.getString("HP_QNA_PAGO"));
            mapa.put("idNombramiento",rs.getString("ID_NOMBRAMIENTO"));
            mapa.put("idGrupo",rs.getString("ID_GRUPOPAGO_NOM"));
            mapa.put("sistemaReparto",rs.getString("SISTEMA_REPARTO"));
            mapa.put("inicioPago",rs.getString("INICIO_PAGO"));
            mapa.put("finalPago",rs.getString("FINAL_PAGO"));
            mapa.put("importe",rs.getString("DEDUCCIONES"));
            mapa.put("percepciones",rs.getString("PERCEPCIONES"));
            return mapa;
        }
    }
    
    class EnterosRegRM  implements RowMapper{
        public Enteros mapRow(ResultSet rs, int rowNum) throws SQLException {
            Enteros enteros  = new Enteros(); 
            enteros.setHpRfc(rs.getString("HP_RFC")); 
            enteros.setPrimerApellido(rs.getString("PRIMER_APELLIDO"));
            enteros.setSegundoApellido(rs.getString("SEGUNDO_APELLIDO"));
            enteros.setNombre(rs.getString("NOMBRE"));
            enteros.setDeducciones(rs.getDouble("DEDUCCIONES"));
            enteros.setPercepciones(rs.getDouble("PERCEPCIONES"));
            return enteros;
        }
    }
    class EnterosTotalRM  implements RowMapper{
        public Enteros mapRow(ResultSet rs, int rowNum) throws SQLException {
            Enteros enteros  = new Enteros(); 
            enteros.setDeducciones(rs.getDouble("TOTAL"));
            enteros.setPercepciones(rs.getDouble("MONTO"));
            return enteros;
        }
    }
}
