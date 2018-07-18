package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.domain.jdbc.TcConceptoPago;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

public class CustomConceptoPagoDAOImpl extends JdbcDAO implements CustomConceptoPagoDAO {

    public Long getSnVersion() {
        Long snVersion = null;
        snVersion = super.getSequenceValue("SD_SAR_VERSION");
        return snVersion;
    }

    public List<TcConceptoPago> getConceptosPago() {
        String conceptosPago = super.getQueryDefinition("conceptosPago");
        return super.getJdbcTemplate().query(conceptosPago, new ConceptoPagoRM());
    }

    class ConceptoPagoRM implements RowMapper<TcConceptoPago> {
        public TcConceptoPago mapRow(ResultSet rs, int rowNum) throws SQLException {
            gob.shcp.sireh.domain.jdbc.TcConceptoPago conceptoPago = new gob.shcp.sireh.domain.jdbc.TcConceptoPago();
            conceptoPago.setIdTipoCpto(rs.getString("tipo"));
            conceptoPago.setIdConcepto(rs.getString("concepto"));
            conceptoPago.setDescConPag(rs.getString("descripcion"));
            return conceptoPago;
        }
    }
}
