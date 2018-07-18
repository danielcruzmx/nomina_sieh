package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomTnMovtosEmpPlaDAOImpl extends JdbcDAO implements CustomTnMovtosEmpPlaDAO{

    public void updateObservacionesDeMovimientoEmpPla( Integer id, String observaciones ) {
        super.getJdbcTemplate().update( super.getQueryDefinition("updateTnMovtosEmpPlaObservaciones"), new Object[]{observaciones,id} );
    }

    public void saveTnMovtosEmpPla(List<HashMap<String, Object>> listaMapasTnMovtosEmpPla, String usuario) {
                                   
        List<Object[]> parameters = new ArrayList<Object[]>();
        
        for (HashMap<String, Object> mapaPago: listaMapasTnMovtosEmpPla) {
            parameters.add(new Object[] { mapaPago.get("idMovtosEmpPla"), 
                                          mapaPago.get("idMovtoPersona"), 
                                          mapaPago.get("idPlaza"), 
                                          mapaPago.get("idSituacionPlaza"), 
                                          mapaPago.get("mepRfc"), 
                                          mapaPago.get("mepPlazaRespaldo"), 
                                          mapaPago.get("idGrupoPago"), 
                                          mapaPago.get("idUnidadPre"), 
                                          mapaPago.get("idPuestoPre"), 
                                          mapaPago.get("idEdoPre"), 
                                          mapaPago.get("idZonaEcoPre"), 
                                          mapaPago.get("idRangoPre"), 
                                          mapaPago.get("idUnidadNom"), 
                                          mapaPago.get("idPuestoNom"), 
                                          mapaPago.get("idNivelPtoNom"), 
                                          mapaPago.get("idNombramientoNom"), 
                                          mapaPago.get("idJerarquiaNom"), 
                                          mapaPago.get("idEdoNom"), 
                                          mapaPago.get("idMuniNom"), 
                                          mapaPago.get("idZonaEcoNom"), 
                                          mapaPago.get("idRangoNom"), 
                                          mapaPago.get("idZonaDistNom"), 
                                          mapaPago.get("mepImporteHonorario"), 
                                          mapaPago.get("mepUltimoMovto"), 
                                          mapaPago.get("mepIniCont"), 
                                          mapaPago.get("mepFinCont"), 
                                          mapaPago.get("mepIniLic"), 
                                          mapaPago.get("mepFinLic"), 
                                          mapaPago.get("mepQnaCaptura"), 
                                          mapaPago.get("idTipoPlaza"), 
                                          mapaPago.get("idServPub"), 
                                          mapaPago.get("idPtoEstrategico"), 
                                          mapaPago.get("idInmueble"), 
                                          mapaPago.get("mepEdif"), 
                                          mapaPago.get("mepPiso"), 
                                          mapaPago.get("mepAla"), 
                                          mapaPago.get("mepOfna"), 
                                          mapaPago.get("mepTelOf1"), 
                                          mapaPago.get("mepTelOf2"), 
                                          mapaPago.get("mepConmut"), 
                                          mapaPago.get("mepExt1"), 
                                          mapaPago.get("mepExt2"), 
                                          mapaPago.get("mepRfcUnico"), 
                                          mapaPago.get("idBancoSar"), 
                                          mapaPago.get("idTipoPago"), 
                                          mapaPago.get("mepImssIssste"), 
                                          mapaPago.get("mepSistemaReparto"), 
                                          mapaPago.get("mepCurp"), 
                                          mapaPago.get("mepNombre"), 
                                          mapaPago.get("mepPrimerApellido"), 
                                          mapaPago.get("mepSegundoApellido"), 
                                          mapaPago.get("mepFecNacimiento"), 
                                          mapaPago.get("mepClabe"), 
                                          mapaPago.get("mepReferenciaOficio"), 
                                          mapaPago.get("mepIngresoGobFed"), 
                                          mapaPago.get("mepIngresoDependencia"), 
                                          mapaPago.get("mepCasoMuestra"), 
                                          mapaPago.get("mepCalleParticular"), 
                                          mapaPago.get("mepColoniaParticular"), 
                                          mapaPago.get("mepCveMuniParticular"), 
                                          mapaPago.get("mepCveEdoParticular"), 
                                          mapaPago.get("mepCodpostParticular"), 
                                          mapaPago.get("mepTelParticular"), 
                                          mapaPago.get("idEdoCivil"), 
                                          mapaPago.get("mepEMailOficial"), 
                                          mapaPago.get("mepEMailPersonal"), 
                                          mapaPago.get("mepCveEdoNac"), 
                                          mapaPago.get("idGenero"), 
                                          mapaPago.get("idNacionalidad"), 
                                          mapaPago.get("mepDiscapacidad"), 
                                          mapaPago.get("idNivelEscolar"), 
                                          mapaPago.get("idProfnCarrera"), 
                                          mapaPago.get("idInstEducativa"), 
                                          mapaPago.get("idInstProtcivil"), 
                                          mapaPago.get("idEspProtcivil"), 
                                          mapaPago.get("mepEstudiaSiNo"), 
                                          mapaPago.get("mepPadreMadre"), 
                                          mapaPago.get("mepTerminoCargoSind"), 
                                          mapaPago.get("mepCompatEmpleo"), 
                                          mapaPago.get("idRusp"), 
                                          mapaPago.get("mepFecNotDecPatr"), 
                                          mapaPago.get("mepFecIniDeclPatr"), 
                                          mapaPago.get("mepFecIngSpc"), 
                                          mapaPago.get("mepSpcAnioAnt"), 
                                          mapaPago.get("idUnidadNomAnt"), 
                                          mapaPago.get("idPuestoNomAnt"), 
                                          mapaPago.get("idEdoNomAnt"), 
                                          mapaPago.get("idMuniNomAnt"), 
                                          mapaPago.get("idZonaEcoNomAnt"), 
                                          mapaPago.get("idRangoNomAnt"), 
                                          mapaPago.get("idNombramientoAnt"), 
                                          mapaPago.get("mepPlazaAnt"), 
                                          mapaPago.get("idNivelPtoAnt"), 
                                          mapaPago.get("idJerarquiaAnt"), 
                                          mapaPago.get("mepObserva"), 
                                          mapaPago.get("mepObservaInternas"), 
                                          mapaPago.get("mepQnaCancela"), 
                                          mapaPago.get("mepUsrCancela"), 
                                          mapaPago.get("mepFechaCancela"), 
                                          mapaPago.get("usuario"), 
                                          mapaPago.get("fecModifico") });

        }

        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertTnMovtosEmpPla"), 
                                                  parameters);
    }
    
    class TdMovtosEmpPlaRM implements RowMapper {
        public TnMovtosEmpPla mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnMovtosEmpPla tnMovtosEmpPla = new TnMovtosEmpPla();
            tnMovtosEmpPla.setIdMovtosEmpPla(rs.getLong("ID_MOVTOS_EMP_PLA"));
            tnMovtosEmpPla.setIdMovtoPersona(rs.getInt("ID_MOVTO_PERSONA"));
            tnMovtosEmpPla.setIdPlaza(rs.getInt("ID_PLAZA"));
            tnMovtosEmpPla.setIdSituacionPlaza(rs.getString("ID_SITUACION_PLAZA"));
            tnMovtosEmpPla.setMepRfc(rs.getString("MEP_RFC"));
            tnMovtosEmpPla.setMepPlazaRespaldo(rs.getInt("MEP_PLAZA_RESPALDO"));
            tnMovtosEmpPla.setIdGrupoPago(rs.getString("ID_GRUPO_PAGO"));
            tnMovtosEmpPla.setIdUnidadPre(rs.getString("ID_UNIDAD_PRE"));
            tnMovtosEmpPla.setIdPuestoPre(rs.getString("ID_PUESTO_PRE"));
            tnMovtosEmpPla.setIdEdoPre(rs.getInt("ID_EDO_PRE"));
            tnMovtosEmpPla.setIdZonaEcoPre(rs.getInt("ID_ZONA_ECO_PRE"));
            tnMovtosEmpPla.setIdRangoPre(rs.getInt("ID_RANGO_PRE"));
            tnMovtosEmpPla.setIdUnidadNom(rs.getString("ID_UNIDAD_NOM"));
            tnMovtosEmpPla.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));
            tnMovtosEmpPla.setIdNivelPtoNom(rs.getString("ID_NIVEL_PTO_NOM"));
            tnMovtosEmpPla.setIdNombramientoNom(rs.getString("ID_NOMBRAMIENTO_NOM"));
            tnMovtosEmpPla.setIdJerarquiaNom(rs.getString("ID_JERARQUIA_NOM"));
            tnMovtosEmpPla.setIdEdoNom(rs.getInt("ID_EDO_NOM"));
            tnMovtosEmpPla.setIdMuniNom(rs.getInt("ID_MUNI_NOM"));
            tnMovtosEmpPla.setIdZonaEcoNom(rs.getInt("ID_ZONA_ECO_NOM"));
            tnMovtosEmpPla.setIdRangoNom(rs.getInt("ID_RANGO_NOM"));
            tnMovtosEmpPla.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            tnMovtosEmpPla.setMepImporteHonorario(rs.getDouble("MEP_IMPORTE_HONORARIO"));
            tnMovtosEmpPla.setMepUltimoMovto(rs.getDate("MEP_ULTIMO_MOVTO"));
            tnMovtosEmpPla.setMepIniCont(rs.getDate("MEP_INI_CONT"));
            tnMovtosEmpPla.setMepFinCont(rs.getDate("MEP_FIN_CONT"));
            tnMovtosEmpPla.setMepIniLic(rs.getDate("MEP_INI_LIC"));
            tnMovtosEmpPla.setMepFinLic(rs.getDate("MEP_FIN_LIC"));
            
            tnMovtosEmpPla.setMepQnaCaptura(rs.getInt("MEP_QNA_CAPTURA"));
            
            tnMovtosEmpPla.setIdTipoPlaza(rs.getString("ID_TIPO_PLAZA"));
            tnMovtosEmpPla.setIdServPub(rs.getString("ID_SERV_PUB"));
            tnMovtosEmpPla.setIdPtoEstrategico(rs.getString("ID_PTO_ESTRATEGICO"));
            tnMovtosEmpPla.setIdInmueble(rs.getInt("ID_INMUEBLE"));
            
            tnMovtosEmpPla.setMepEdif(rs.getString("MEP_EDIF"));
            tnMovtosEmpPla.setMepPiso(rs.getString("MEP_PISO"));
            tnMovtosEmpPla.setMepAla(rs.getString("MEP_ALA"));
            tnMovtosEmpPla.setMepOfna(rs.getString("MEP_OFNA"));
            tnMovtosEmpPla.setMepTelOf1(rs.getString("MEP_TEL_OF1"));
            tnMovtosEmpPla.setMepTelOf2(rs.getString("MEP_TEL_OF2"));
            tnMovtosEmpPla.setMepConmut(rs.getString("MEP_CONMUT"));
            tnMovtosEmpPla.setMepExt1(rs.getString("MEP_EXT1"));
            tnMovtosEmpPla.setMepExt2(rs.getString("MEP_EXT2"));
            tnMovtosEmpPla.setMepRfcUnico(rs.getString("MEP_RFC_UNICO"));
            
            tnMovtosEmpPla.setIdBancoSar(rs.getString("ID_BANCO_SAR"));
            tnMovtosEmpPla.setIdTipoPago(rs.getString("ID_TIPO_PAGO"));
            tnMovtosEmpPla.setMepImssIssste(rs.getString("MEP_IMSS_ISSSTE"));
            tnMovtosEmpPla.setMepSistemaReparto(rs.getString("MEP_SISTEMA_REPARTO"));
            
            tnMovtosEmpPla.setMepCurp(rs.getString("MEP_CURP"));
            tnMovtosEmpPla.setMepNombre(rs.getString("MEP_NOMBRE"));
            tnMovtosEmpPla.setMepPrimerApellido(rs.getString("MEP_PRIMER_APELLIDO"));
            tnMovtosEmpPla.setMepSegundoApellido(rs.getString("MEP_SEGUNDO_APELLIDO"));
            
            tnMovtosEmpPla.setMepFecNacimiento(rs.getDate("MEP_FEC_NACIMIENTO"));
            tnMovtosEmpPla.setMepClabe(rs.getString("MEP_CLABE"));
            tnMovtosEmpPla.setMepReferenciaOficio(rs.getString("MEP_REFERENCIA_OFICIO"));
            tnMovtosEmpPla.setMepIngresoGobFed(rs.getDate("MEP_INGRESO_GOB_FED"));
            tnMovtosEmpPla.setMepIngresoDependencia(rs.getDate("MEP_INGRESO_DEPENDENCIA"));
            
            return tnMovtosEmpPla;
        }
    }
    
    public List<TnMovtosEmpPla> findBajasPlazasByUnidadFinContQna(String idGrupoPago, String usuario, Integer mepQnaCaptura, String mepFinCont, List<String> listaUnidades, List<String> listaPlazasExcluidas) {
        String queryBajasPlazasByUnidadFinContQna = super.getQueryDefinition("queryBajasPlazasByUnidadFinContQna");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("idGrupoPago", idGrupoPago).addValue("usuario", usuario).addValue("mepQnaCaptura", mepQnaCaptura).addValue("mepFinCont", mepFinCont).addValue("idUnidadNom", listaUnidades).addValue("listaPlazasExcluidas", listaPlazasExcluidas);
        
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnMovtosEmpPla> listaTnMovtosEmpPla = namedTemplate.query(queryBajasPlazasByUnidadFinContQna, namedParameters, new TdMovtosEmpPlaRM());
        return listaTnMovtosEmpPla;
    }
    
    
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsUnidad( List<Long> listaTnMovtosEmpPla) {
        String queryBajasPlazasByUnidadFinContQna = super.getQueryDefinition("queryValidaAltaEventualMasivoVsUnidad");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaTnMovtosEmpPla", listaTnMovtosEmpPla);
        
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnMovtosEmpPla> listaTnMovtosEmpPlaInvalidos = namedTemplate.query(queryBajasPlazasByUnidadFinContQna, namedParameters, new TdMovtosEmpPlaRM());
        return listaTnMovtosEmpPlaInvalidos;
    }
    
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsPuesto( List<Long> listaTnMovtosEmpPla) {
        String queryValidaAltaEventualMasivoVsPuesto = super.getQueryDefinition("queryValidaAltaEventualMasivoVsPuesto");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaTnMovtosEmpPla", listaTnMovtosEmpPla);
            
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnMovtosEmpPla> listaTnMovtosEmpPlaInvalidos = namedTemplate.query(queryValidaAltaEventualMasivoVsPuesto, namedParameters, new TdMovtosEmpPlaRM());
        return listaTnMovtosEmpPlaInvalidos;
    }
    
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsZonaEconomica(List<Long> listaTnMovtosEmpPla) {
        String queryValidaAltaEventualMasivoVsZonaEconomica = super.getQueryDefinition("queryValidaAltaEventualMasivoVsZonaEconomica");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaTnMovtosEmpPla", listaTnMovtosEmpPla);
            
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnMovtosEmpPla> listaTnMovtosEmpPlaInvalidos = namedTemplate.query(queryValidaAltaEventualMasivoVsZonaEconomica, namedParameters, new TdMovtosEmpPlaRM());
        return listaTnMovtosEmpPlaInvalidos;
    }
    
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsEstado(List<Long> listaTnMovtosEmpPla) {
        String queryValidaAltaEventualMasivoVsEstado = super.getQueryDefinition("queryValidaAltaEventualMasivoVsEstado");

        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("listaTnMovtosEmpPla", listaTnMovtosEmpPla);
            
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnMovtosEmpPla> listaTnMovtosEmpPlaInvalidos = namedTemplate.query(queryValidaAltaEventualMasivoVsEstado, namedParameters, new TdMovtosEmpPlaRM());
        return listaTnMovtosEmpPlaInvalidos;
    }
}
