package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCaptura;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCapturaPK;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomConceptoPagoCapturaDAOImpl extends JdbcDAO implements CustomConceptoPagoCapturaDAO {

    public TcConceptoPagoCaptura getConceptoPago(TcConceptoPagoCapturaPK pk) {
        String query = " SELECT * FROM TC_CONCEPTO_PAGO_CAPTURA" + " WHERE ID_TIPO_CPTO = ?" + " AND ID_CPTO_PAGO = ?";
        return super.getJdbcTemplate().queryForObject(query, new ConceptoPagoCapturaRM(), new Object[] { pk.getIdTipoCpto(), pk.getIdCptoPago() });
    }

    public void save(TcConceptoPagoCaptura conceptoPago) {
        String query = 
            " INSERT INTO TC_CONCEPTO_PAGO_CAPTURA( ID_TIPO_CPTO,ID_CPTO_PAGO,CPC_TIPO_CAPTURA,CPC_TIPO_CALCULO,CPC_NIVELES_PTO,CPC_NOMBRAMIENTO,CPC_PERMANENTE" + 
            " ,CPC_BLOQUE,CPC_OPCION1,CPC_OPCION2,CPC_OPCION3,CPC_OPCION4,CPC_OPCION5,CPC_OPCION6,CPC_OPCION7,CPC_OPCION8,CPC_OPCION9,CPC_OPCION0" + 
            " ,CPC_VALOR1,CPC_VALOR2,CPC_VALOR3,CPC_VALOR4,CPC_VALOR5,CPC_VALOR6,CPC_VALOR7,CPC_VALOR8,CPC_VALOR9,CPC_VALOR0,CPC_MENSAJE,CPC_SUBTIPO" + 
            " ,USUARIO,FEC_MODIFICO ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";
        super.getJdbcTemplate().update(query, 
                                       new Object[] { conceptoPago.getIdTipoCpto(), conceptoPago.getIdCptoPago(), 
                                                      conceptoPago.getCpcTipoCaptura(), 
                                                      conceptoPago.getCpcTipoCalculo(), 
                                                      conceptoPago.getCpcNivelesPto(), 
                                                      conceptoPago.getCpcNombramiento(), 
                                                      conceptoPago.getCpcPermanente(), conceptoPago.getCpcBloque(), 
                                                      conceptoPago.getCpcOpcion1(), conceptoPago.getCpcOpcion2(), 
                                                      conceptoPago.getCpcOpcion3(), conceptoPago.getCpcOpcion4(), 
                                                      conceptoPago.getCpcOpcion5(), conceptoPago.getCpcOpcion6(), 
                                                      conceptoPago.getCpcOpcion7(), conceptoPago.getCpcOpcion8(), 
                                                      conceptoPago.getCpcOpcion9(), conceptoPago.getCpcOpcion0(), 
                                                      conceptoPago.getCpcValor1(), conceptoPago.getCpcValor2(), 
                                                      conceptoPago.getCpcValor3(), conceptoPago.getCpcValor4(), 
                                                      conceptoPago.getCpcValor5(), conceptoPago.getCpcValor6(), 
                                                      conceptoPago.getCpcValor7(), conceptoPago.getCpcValor8(), 
                                                      conceptoPago.getCpcValor9(), conceptoPago.getCpcValor0(), 
                                                      conceptoPago.getCpcMensaje(), conceptoPago.getCpcSubtipo(), 
                                                      conceptoPago.getUsuario() });
    }

    public void update(TcConceptoPagoCaptura conceptoPago) {
        String query = 
            " UPDATE TC_CONCEPTO_PAGO_CAPTURA" + " SET CPC_TIPO_CAPTURA = ?," + " CPC_TIPO_CALCULO = ?," + " CPC_NIVELES_PTO = ?," + 
            " CPC_NOMBRAMIENTO = ?," + " CPC_PERMANENTE = ?," + " CPC_BLOQUE = ?," + " CPC_OPCION1 = ?," + 
            " CPC_OPCION2 = ?," + " CPC_OPCION3 = ?," + " CPC_OPCION4 = ?," + " CPC_OPCION5 = ?," + 
            " CPC_OPCION6 = ?," + " CPC_OPCION7 = ?," + " CPC_OPCION8 = ?," + " CPC_OPCION9 = ?," + 
            " CPC_OPCION0 = ?," + " CPC_VALOR1 = ?," + " CPC_VALOR2 = ?," + " CPC_VALOR3 = ?," + " CPC_VALOR4 = ?," + 
            " CPC_VALOR5 = ?," + " CPC_VALOR6 = ?," + " CPC_VALOR7 = ?," + " CPC_VALOR8 = ?," + " CPC_VALOR9 = ?," + 
            " CPC_VALOR0 = ?," + " CPC_MENSAJE = ?," + " CPC_SUBTIPO = ?," + " USUARIO = ?," + 
            " FEC_MODIFICO = sysdate" + " WHERE ID_TIPO_CPTO = ?" + " AND ID_CPTO_PAGO = ?";
        super.getJdbcTemplate().update(query, 
                                       new Object[] { conceptoPago.getCpcTipoCaptura(), conceptoPago.getCpcTipoCalculo(), 
                                                      conceptoPago.getCpcNivelesPto(), 
                                                      conceptoPago.getCpcNombramiento(), 
                                                      conceptoPago.getCpcPermanente(), conceptoPago.getCpcBloque(), 
                                                      conceptoPago.getCpcOpcion1(), conceptoPago.getCpcOpcion2(), 
                                                      conceptoPago.getCpcOpcion3(), conceptoPago.getCpcOpcion4(), 
                                                      conceptoPago.getCpcOpcion5(), conceptoPago.getCpcOpcion6(), 
                                                      conceptoPago.getCpcOpcion7(), conceptoPago.getCpcOpcion8(), 
                                                      conceptoPago.getCpcOpcion9(), conceptoPago.getCpcOpcion0(), 
                                                      conceptoPago.getCpcValor1(), conceptoPago.getCpcValor2(), 
                                                      conceptoPago.getCpcValor3(), conceptoPago.getCpcValor4(), 
                                                      conceptoPago.getCpcValor5(), conceptoPago.getCpcValor6(), 
                                                      conceptoPago.getCpcValor7(), conceptoPago.getCpcValor8(), 
                                                      conceptoPago.getCpcValor9(), conceptoPago.getCpcValor0(), 
                                                      conceptoPago.getCpcMensaje(), conceptoPago.getCpcSubtipo(), 
                                                      conceptoPago.getUsuario(), conceptoPago.getIdTipoCpto(), 
                                                      conceptoPago.getIdCptoPago() });
    }

    class ConceptoPagoCapturaRM implements RowMapper<TcConceptoPagoCaptura> {
        public TcConceptoPagoCaptura mapRow(ResultSet rs, int rowNum) throws SQLException {
            TcConceptoPagoCaptura conceptoPago = new TcConceptoPagoCaptura();
            conceptoPago.setIdTipoCpto(rs.getString("ID_TIPO_CPTO"));
            conceptoPago.setIdCptoPago(rs.getString("ID_CPTO_PAGO"));
            conceptoPago.setCpcTipoCaptura(rs.getString("CPC_TIPO_CAPTURA"));
            conceptoPago.setCpcTipoCalculo(rs.getString("CPC_TIPO_CALCULO"));
            conceptoPago.setCpcNivelesPto(rs.getString("CPC_NIVELES_PTO"));
            conceptoPago.setCpcNombramiento(rs.getString("CPC_NOMBRAMIENTO"));
            conceptoPago.setCpcPermanente(rs.getString("CPC_PERMANENTE"));
            conceptoPago.setCpcBloque(rs.getString("CPC_BLOQUE"));
            conceptoPago.setCpcOpcion1(rs.getString("CPC_OPCION1"));
            conceptoPago.setCpcOpcion2(rs.getString("CPC_OPCION2"));
            conceptoPago.setCpcOpcion3(rs.getString("CPC_OPCION3"));
            conceptoPago.setCpcOpcion4(rs.getString("CPC_OPCION4"));
            conceptoPago.setCpcOpcion5(rs.getString("CPC_OPCION5"));
            conceptoPago.setCpcOpcion6(rs.getString("CPC_OPCION6"));
            conceptoPago.setCpcOpcion7(rs.getString("CPC_OPCION7"));
            conceptoPago.setCpcOpcion8(rs.getString("CPC_OPCION8"));
            conceptoPago.setCpcOpcion9(rs.getString("CPC_OPCION9"));
            conceptoPago.setCpcOpcion0(rs.getString("CPC_OPCION0"));
            conceptoPago.setCpcValor1(rs.getDouble("CPC_VALOR1"));
            conceptoPago.setCpcValor2(rs.getDouble("CPC_VALOR2"));
            conceptoPago.setCpcValor3(rs.getDouble("CPC_VALOR3"));
            conceptoPago.setCpcValor4(rs.getDouble("CPC_VALOR4"));
            conceptoPago.setCpcValor5(rs.getDouble("CPC_VALOR5"));
            conceptoPago.setCpcValor6(rs.getDouble("CPC_VALOR6"));
            conceptoPago.setCpcValor7(rs.getDouble("CPC_VALOR7"));
            conceptoPago.setCpcValor8(rs.getDouble("CPC_VALOR8"));
            conceptoPago.setCpcValor9(rs.getDouble("CPC_VALOR9"));
            conceptoPago.setCpcValor0(rs.getDouble("CPC_VALOR0"));
            conceptoPago.setCpcMensaje(rs.getString("CPC_MENSAJE"));
            conceptoPago.setCpcSubtipo(rs.getString("CPC_SUBTIPO"));
            return conceptoPago;
        }
    }
    
    public void betarInstructor(Integer idInstructor, String idProveedor){
        super.executeByNamedQuery("spc_cap_asignarInstructor_betarInstructor", new Object[]{idInstructor ,idProveedor});
    }
}
