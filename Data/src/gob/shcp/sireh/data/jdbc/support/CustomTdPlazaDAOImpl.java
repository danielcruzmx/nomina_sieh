package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTdPlaza;
import gob.shcp.sireh.domain.jdbc.TdPlaza;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomTdPlazaDAOImpl extends JdbcDAO implements CustomTdPlazaDAO {

    public void saveTdPlaza(List<HashMap<String, Object>> listaMapasPlazas, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlazas) {
            parameters.add(new Object[] { mapaPago.get("idPlaza"), mapaPago.get("idSitPlaza"), 
                                          mapaPago.get("plazaRfc"), mapaPago.get("plazaCiclo"), 
                                          mapaPago.get("plazaRespaldo"), mapaPago.get("idGrupoPago"), 
                                          mapaPago.get("idUnidadPre"), mapaPago.get("idPuestoPre"), 
                                          mapaPago.get("idEdoPre"), mapaPago.get("idZonaEconPre"), 
                                          mapaPago.get("idRangoPre"), mapaPago.get("idProyReducePre"), 
                                          mapaPago.get("idProyAmpliaPre"), mapaPago.get("idUnidadNom"), 
                                          mapaPago.get("idPuestoNom"), mapaPago.get("idEdoNom"), 
                                          mapaPago.get("idMuniNom"), mapaPago.get("idZonEcoNom"), 
                                          mapaPago.get("idRangoNom"), mapaPago.get("idZonaDistNom"), 
                                          mapaPago.get("importeHonorario"), mapaPago.get("idMovtoPersona"), 
                                          mapaPago.get("plazaUltimoMovto"), mapaPago.get("plazaIniCont"), 
                                          mapaPago.get("plazaFinCont"), mapaPago.get("plazaIniLic"), 
                                          mapaPago.get("plazaFinLic"), mapaPago.get("plazaReferencia"), 
                                          mapaPago.get("plazaQnaCaptura"), mapaPago.get("idTipoPlaza"), 
                                          mapaPago.get("idServPub"), mapaPago.get("idPtoEstrategico"), 
                                          mapaPago.get("idNodo"), mapaPago.get("idInmueble"), 
                                          mapaPago.get("plazaEdif"), mapaPago.get("plazaPiso"), 
                                          mapaPago.get("plazaAla"), mapaPago.get("plazaOfna"), 
                                          mapaPago.get("plazaTelOf1"), mapaPago.get("plazaTelOf2"), 
                                          mapaPago.get("plazaConMut"), mapaPago.get("plazaExt1"), 
                                          mapaPago.get("plazaExt2"), mapaPago.get("usuario"), 
                                          mapaPago.get("fecModifico") });

        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertTdPlazaMasiva"), parameters);
    }

    public void updateTdPlazaCompleta(List<HashMap<String, Object>> listaMapasPlazas, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlazas) {
            parameters.add(new Object[] { mapaPago.get("idSitPlaza"), mapaPago.get("plazaRfc"), 
                                          mapaPago.get("plazaCiclo"), mapaPago.get("plazaRespaldo"), 
                                          mapaPago.get("idGrupoPago"), mapaPago.get("idUnidadPre"), 
                                          mapaPago.get("idPuestoPre"), mapaPago.get("idEdoPre"), 
                                          mapaPago.get("idZonaEconPre"), mapaPago.get("idRangoPre"), 
                                          mapaPago.get("idProyReducePre"), mapaPago.get("idProyAmpliaPre"), 
                                          mapaPago.get("idUnidadNom"), mapaPago.get("idPuestoNom"), 
                                          mapaPago.get("idEdoNom"), mapaPago.get("idMuniNom"), 
                                          mapaPago.get("idZonEcoNom"), mapaPago.get("idRangoNom"), 
                                          mapaPago.get("idZonaDistNom"), mapaPago.get("importeHonorario"), 
                                          mapaPago.get("idMovtoPersona"), mapaPago.get("plazaUltimoMovto"), 
                                          mapaPago.get("plazaIniCont"), mapaPago.get("plazaFinCont"), 
                                          mapaPago.get("plazaIniLic"), mapaPago.get("plazaFinLic"), 
                                          mapaPago.get("plazaReferencia"), mapaPago.get("plazaQnaCaptura"), 
                                          mapaPago.get("idTipoPlaza"), mapaPago.get("idServPub"), 
                                          mapaPago.get("idPtoEstrategico"), mapaPago.get("idNodo"), 
                                          mapaPago.get("idInmueble"), mapaPago.get("plazaEdif"), 
                                          mapaPago.get("plazaPiso"), mapaPago.get("plazaAla"), 
                                          mapaPago.get("plazaOfna"), mapaPago.get("plazaTelOf1"), 
                                          mapaPago.get("plazaTelOf2"), mapaPago.get("plazaConMut"), 
                                          mapaPago.get("plazaExt1"), mapaPago.get("plazaExt2"), 
                                          mapaPago.get("usuario"), mapaPago.get("fecModifico"), 
                                          mapaPago.get("idPlaza") });

        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTdPlazaMasivaCompleta"), parameters);
    }

    public void updateTdPlaza(List<HashMap<String, Object>> listaMapasPlazas, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlazas) {
            parameters.add(new Object[] { mapaPago.get("idUnidadPre"), mapaPago.get("idPuestoPre"), 
                                          mapaPago.get("idEdoPre"), mapaPago.get("idZonaEconPre"), 
                                          mapaPago.get("idPlaza") });
        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTdPlazaMasiva"), parameters);
    }

    public void updateTdPlazaReubicacion(List<HashMap<String, Object>> listaMapasPlazas, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlazas) {
            parameters.add(new Object[] { mapaPago.get("idUnidadPre"), mapaPago.get("idEdoPre"), 
                                          mapaPago.get("idZonaEconPre"), mapaPago.get("idPlaza") });
        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTdPlazaMasivaReubicacion"), parameters);
    }


    public void updateTdPlazaACancelar(List<HashMap<String, Object>> listaMapasPlazas, String usuario) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaPago: listaMapasPlazas) {
            parameters.add(new Object[] { mapaPago.get("idSitPlaza"), mapaPago.get("usuario"), 
                                          mapaPago.get("fecModifico"), mapaPago.get("idPlaza") });
        }

        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTdPlazaMasivaReubicacion"), parameters);
    }
    
    public void updateTdPlazaMasivaBajaHonorarios(List<HashMap<String, Object>> listaMapasPlazas) {
        List<Object[]> parameters = new ArrayList<Object[]>();

        for (HashMap<String, Object> mapaTdPlaza: listaMapasPlazas) {
            parameters.add(new Object[] { mapaTdPlaza.get("idSitPlaza"), mapaTdPlaza.get("plazaRfc"), 
                                          mapaTdPlaza.get("idMovtoPersona"), mapaTdPlaza.get("plazaUltimoMovto"), 
                                          mapaTdPlaza.get("plazaIniCont"), mapaTdPlaza.get("plazaQnaCaptura"), 
                                          mapaTdPlaza.get("usuario"), mapaTdPlaza.get("fecModifico"), 
                                          mapaTdPlaza.get("idPlaza") });
        }
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTdPlazaMasivaBajaHonorarios"), parameters);
    }
    
    public List<CustomTdPlaza> getPlazasConEstatusCancelada(List<Integer> listaPlazas) {
        String pagoByRFCs = super.getQueryDefinition("plazaConEstatusCancelada");
        SqlParameterSource namedParameters = new MapSqlParameterSource("listaPlazas", listaPlazas);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        super.getJdbcTemplate().setFetchSize(200);
        List<CustomTdPlaza> plazas = namedTemplate.query(pagoByRFCs, namedParameters, new PlazaRSExt());
        return plazas;
    }

    public List<CustomTdPlaza> getPlazasConEstatusTransferenia(List<Integer> listaPlazas) {
        String pagoByRFCs = super.getQueryDefinition("plazaConEstatusTransferencia");
        SqlParameterSource namedParameters = new MapSqlParameterSource("listaPlazas", listaPlazas);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        super.getJdbcTemplate().setFetchSize(200);
        List<CustomTdPlaza> plazas = namedTemplate.query(pagoByRFCs, namedParameters, new PlazaRSExt());
        return plazas;
    }


    class PlazaRSExt implements ResultSetExtractor<List<CustomTdPlaza>> {
        public List<CustomTdPlaza> extractData(ResultSet rs) throws SQLException {
            List<CustomTdPlaza> listaPlazas = new ArrayList<CustomTdPlaza>();
            while (rs.next()) {
                gob.shcp.sireh.domain.jdbc.CustomTdPlaza plaza = new gob.shcp.sireh.domain.jdbc.CustomTdPlaza();
                plaza.setIdPlaza(rs.getInt("ID_PLAZA"));
                listaPlazas.add(plaza);
            }
            return listaPlazas;
        }
    }
    
    public List<TdPlaza> findBajasPlazasByUnidad(String grupoPago, List<String> listaUnidades, Date plazaFinCont, List<String> listaPlazasExcluidas) {
        String queryBajasPlazasByUnidad = super.getQueryDefinition("queryBajasPlazasByUnidad");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("grupoPago", grupoPago).addValue("listaUnidades", listaUnidades).addValue("plazaFinCont", plazaFinCont).addValue("listaPlazasExcluidas", listaPlazasExcluidas);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TdPlaza> listaPlazas = namedTemplate.query(queryBajasPlazasByUnidad, namedParameters, new TdPlazaRM());
        return listaPlazas;
    }

    class TdPlazaRM implements RowMapper {
        public TdPlaza mapRow(ResultSet rs, int rowNum) throws SQLException {
            TdPlaza tdPlaza = new TdPlaza();
            tdPlaza.setIdPlaza(rs.getInt("ID_PLAZA"));
            tdPlaza.setIdSitPlaza(rs.getString("ID_SIT_PLAZA"));
            tdPlaza.setPlazaRfc(rs.getString("PLAZA_RFC"));
            tdPlaza.setPlazaCiclo(rs.getInt("PLAZA_CICLO"));
            tdPlaza.setPlazaRespaldo(rs.getInt("PLAZA_RESPALDO"));
            tdPlaza.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            tdPlaza.setIdUnidadPre(rs.getString("ID_UNIDAD_PRE"));
            tdPlaza.setIdPuestoPre(rs.getString("ID_PUESTO_PRE"));
            tdPlaza.setIdEdoPre(rs.getInt("ID_EDO_PRE"));
            tdPlaza.setIdZonaEcoPre(rs.getInt("ID_ZONA_ECO_PRE"));
            tdPlaza.setIdRangoPre(rs.getInt("ID_RANGO_PRE"));
            tdPlaza.setIdProyReducePre(rs.getString("ID_PROY_REDUCE_PRE"));
            tdPlaza.setIdProyAmpliaPre(rs.getString("ID_PROY_AMPLIA_PRE"));
            tdPlaza.setIdUnidadNom(rs.getString("ID_UNIDAD_NOM"));
            tdPlaza.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
            tdPlaza.setIdEdoNom(rs.getInt("ID_EDO_NOM"));
            tdPlaza.setIdMuniNom(rs.getInt("ID_MUNI_NOM"));
            tdPlaza.setIdZonaEcoNom(rs.getInt("ID_ZONA_ECO_NOM"));
            tdPlaza.setIdRangoNom(rs.getInt("ID_RANGO_NOM"));
            tdPlaza.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            tdPlaza.setPlazaImpHono(rs.getDouble("PLAZA_IMP_HONO"));
            tdPlaza.setIdMovtoPersona(rs.getInt("ID_MOVTO_PERSONA"));
            tdPlaza.setPlazaUltimoMovto(rs.getDate("PLAZA_ULTIMO_MOVTO"));
            tdPlaza.setPlazaIniCont(rs.getDate("PLAZA_INI_CONT"));
            tdPlaza.setPlazaFinCont(rs.getDate("PLAZA_FIN_CONT"));
            tdPlaza.setPlazaIniLic(rs.getDate("PLAZA_INI_LIC"));
            tdPlaza.setPlazaFinLic(rs.getDate("PLAZA_FIN_LIC"));
            tdPlaza.setPlazaReferencia(rs.getString("PLAZA_REFERENCIA"));
            tdPlaza.setPlazaQnaCaptura(rs.getInt("PLAZA_QNA_CAPTURA"));
            tdPlaza.setIdTipoPlaza(rs.getString("ID_TIPO_PLAZA"));
            tdPlaza.setIdServPub(rs.getString("ID_SERV_PUB"));
            tdPlaza.setIdPtoEstrategico(rs.getString("ID_PTO_ESTRATEGICO"));
            tdPlaza.setIdNodo(rs.getString("ID_NODO"));
            tdPlaza.setIdInmueble(rs.getInt("ID_INMUEBLE"));
            tdPlaza.setPlazaEdif(rs.getString("PLAZA_EDIF"));
            tdPlaza.setPlazaPiso(rs.getString("PLAZA_PISO"));
            tdPlaza.setPlazaAla(rs.getString("PLAZA_ALA"));
            tdPlaza.setPlazaOfna(rs.getString("PLAZA_OFNA"));
            tdPlaza.setPlazaTelOf1(rs.getString("PLAZA_TEL_OF1"));
            tdPlaza.setPlazaTelOf2(rs.getString("PLAZA_TEL_OF2"));
            tdPlaza.setPlazaConmut(rs.getString("PLAZA_CONMUT"));
            tdPlaza.setPlazaExt1(rs.getString("PLAZA_EXT1"));
            tdPlaza.setPlazaExt2(rs.getString("PLAZA_EXT2"));
            tdPlaza.setUsuario(rs.getString("USUARIO"));
            tdPlaza.setFecModifico(rs.getDate("FEC_MODIFICO"));
            return tdPlaza;
        }
    }
    
    public List<CustomOutputFile> findTiposNominaHistPagoByUnidadPruaba(List<String> unidades){
        String queryTipoNominasByUnidad = super.getQueryDefinition("reporte-terceros-sat-cfdi-cancelados-tiposnom");
        
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("unidades",unidades);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        List<CustomOutputFile> unidadesList = namedTemplate.query(queryTipoNominasByUnidad, namedParameters, new CustomOutputFileRM());
        return unidadesList;
    }
    
    class CustomOutputFileRM implements RowMapper {
        public CustomOutputFile mapRow(ResultSet rs, int rowNum) throws SQLException {
            CustomOutputFile customOutputFile = new CustomOutputFile();
            customOutputFile.setRegistro(rs.getString("REGISTRO"));
            return customOutputFile;
        }
    }
    
    public List<CustomOutputFile> findComplementosByUnidadQnaPago(List<String> quincenas, List<String> unidades, List<String> tipoNomina){
        String queryComplementos = super.getQueryDefinition("reporte-terceros-sat-cfdi-cancelados-complementos");
        
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("quincenas",quincenas).addValue("unidades", unidades).addValue("tipoNomina",tipoNomina) ;
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);
        List<CustomOutputFile> complementosList = namedTemplate.query(queryComplementos, namedParameters, new CustomOutputFileRM());
        return complementosList;
    }
}

