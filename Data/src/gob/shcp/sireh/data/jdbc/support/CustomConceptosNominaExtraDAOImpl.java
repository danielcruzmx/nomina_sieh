package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.ConceptosPagNomExtra;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class CustomConceptosNominaExtraDAOImpl extends JdbcDAO implements CustomConceptosNominaExtraDAO {

    public CustomConceptosNominaExtraDAOImpl() {
    }

    public ConceptosPagNomExtra getConceptosNominaExtra(String rfcEmpleado) {
        String datosEmpleadoNomExt = super.getQueryDefinition("datosEmpleadoNomExt");
        String datosEmpleado;
        ConceptosPagNomExtra conceptosPagNomExtra = new ConceptosPagNomExtra();
        String delimiter = "[|]";
        String[] tokens = null;

        try {
            datosEmpleado = super.getJdbcTemplate().queryForObject(datosEmpleadoNomExt, String.class, rfcEmpleado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        tokens = datosEmpleado.trim().split(delimiter);
        conceptosPagNomExtra.setRfcEmpleado(tokens[0].toString());
        conceptosPagNomExtra.setNombreEmpleado(tokens[1].toString());
        conceptosPagNomExtra.setPrimerApellido(tokens[2].toString());
        conceptosPagNomExtra.setSegundoApellido(tokens[3].toString());

        return conceptosPagNomExtra;
    }

    public ConceptosPagNomExtra getDatosPlazaByGpoPagoRfc(Integer idPlaza, String rfcEmpleado) {
        String datosPlazaByGpoPagoRfcSql = super.getQueryDefinition("datosPlazaByGpoPagoRfc");
        String descTipoPagoNomExtraOrdinariaSQL = super.getQueryDefinition("descTipoPagoNomExtraOrdinaria");
        String descTipoPagoNomEtraOrdinaria;

        ConceptosPagNomExtra conceptosPagNomExtra = super.getJdbcTemplate().queryForObject(datosPlazaByGpoPagoRfcSql, new ConceptosPagNomExtraRM(), new Object[] { idPlaza });

        descTipoPagoNomEtraOrdinaria = super.getJdbcTemplate().queryForObject(descTipoPagoNomExtraOrdinariaSQL, String.class, rfcEmpleado);
        conceptosPagNomExtra.setDescTipoPago(descTipoPagoNomEtraOrdinaria);
        return conceptosPagNomExtra;
    }

    public List<TcConceptoPago> getConceptosNominaExtraOrdByTipoConcepto(String tipoConcepto) {
        String conceptosSQL = super.getQueryDefinition("conceptosNominaExtraOrdByTipoConcepto");

        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("tipoConcepto", tipoConcepto);

        SqlParameterSource namedParameters = new MapSqlParameterSource(mapValues);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(conceptosSQL, namedParameters, new ConceptosNomExtAux());
    }

    public List<TcConceptoPago> getConceptosNominaExtraSARFOV() {
        String conceptosSQL = super.getQueryDefinition("conceptosNominaExtraSARFOV");

        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        super.getJdbcTemplate().setFetchSize(100);
        return namedTemplate.query(conceptosSQL, new ConceptosNomExtAux());
    }

    private class ConceptosNomExtAux implements RowMapper<TcConceptoPago> {
        public TcConceptoPago mapRow(ResultSet rs, int rowNum) throws SQLException {
            TcConceptoPago concepto = new TcConceptoPago();
            concepto.setIdConcepto(rs.getString("ID_CONCEPTO"));
            concepto.setDescConPag(rs.getString("DESC_CON_PAG"));
            return concepto;
        }
    }

    private class ConceptosPagNomExtraRM implements RowMapper<ConceptosPagNomExtra> {
        public ConceptosPagNomExtra mapRow(ResultSet rs, int rowNum) throws SQLException {
            ConceptosPagNomExtra conceptosPagNomExtra = new ConceptosPagNomExtra();
            conceptosPagNomExtra.setIdNivelPto(rs.getString("ID_NIVEL_PTO"));
            conceptosPagNomExtra.setDescGrupoPago(rs.getString("DESC_GRUPO_PAGO"));
            conceptosPagNomExtra.setDescJerarquia(rs.getString("DESC_JERARQUIA"));
            conceptosPagNomExtra.setIdNombramiento(rs.getString("ID_NOMBRAMIENTO"));
            conceptosPagNomExtra.setDescNombramiento(rs.getString("DESC_NOMBRAMIENTO"));
            conceptosPagNomExtra.setIdPlaza(rs.getInt("ID_PLAZA"));
            conceptosPagNomExtra.setIdZonaDistNom(rs.getInt("ID_ZONA_DIST_NOM"));
            conceptosPagNomExtra.setIdPuestoNom(rs.getString("ID_PUESTO_NOM"));

            return conceptosPagNomExtra;
        }
    }

    public List<String> getConceptosNominaExtraOrd(String rfcEmpleado) {
        String conceptosSQL = super.getQueryDefinition("conceptosPagoNominaEtraOrdinaria");
        List<String> lConceptos = new ArrayList<String>();

        try {
            //lConceptos = super.getJdbcTemplate().queryForList(conceptosSQL, String.class, new Object[]{rfcEmpleado});
            lConceptos = super.getJdbcTemplate().queryForList(conceptosSQL, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return lConceptos;
    }

}

