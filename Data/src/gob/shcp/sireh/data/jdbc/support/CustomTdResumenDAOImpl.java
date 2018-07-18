package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public class CustomTdResumenDAOImpl extends JdbcDAO implements CustomTdResumenDAO {
    // PKG_Notas_Merito.
    private static final String CALL_NM_CALCULO_CONSE_SQL = "begin ? := PKG_Notas_Merito.NM_CALCULO_CONSE( ?, ?, ?, ?); end;";

    public void updateRemesaInternaPagoMerito(String td_nmr_remesa_interna, Integer td_nmr_ciclo_pago, String td_nmr_op, Integer td_nmr_cve_causal, Integer td_nmr_ciclo_final, Integer td_nmr_ciclo_inicial) {
        super.executeByNamedQuery("updateRemesaInternaPagoMerito", td_nmr_remesa_interna, td_nmr_ciclo_pago, td_nmr_op, td_nmr_cve_causal, td_nmr_ciclo_final, td_nmr_ciclo_inicial);
    }

    public int updateProcesoNm(Integer td_nmr_ciclo_pago, String td_nmr_op, Integer td_nmr_cve_causal, String usuario) {
        CallableStatement nmCalculoConseSqlStatement = null;
        int regreso = 0;
        try {
            nmCalculoConseSqlStatement = super.getJdbcTemplate().getDataSource().getConnection().prepareCall(CALL_NM_CALCULO_CONSE_SQL);
            nmCalculoConseSqlStatement.registerOutParameter(1, Types.INTEGER);
            nmCalculoConseSqlStatement.setInt(2, td_nmr_ciclo_pago);
            nmCalculoConseSqlStatement.setInt(3, td_nmr_cve_causal);
            nmCalculoConseSqlStatement.setString(4, td_nmr_op);
            nmCalculoConseSqlStatement.setString(5, usuario);
            nmCalculoConseSqlStatement.executeUpdate();
            regreso = nmCalculoConseSqlStatement.getInt(1);

        } catch (SQLException e) {
            logger.warn("Exception CustomTdResumenDAOImpl[updateProcesoNm] " + CALL_NM_CALCULO_CONSE_SQL);
            logger.warn("Mensaje: " + e.getMessage());
            return regreso;
        }
        return regreso;
    }

    public void updateMeritoActualizaRfcResumen(String td_nmr_rfc_actualizar, String td_nmr_rfc) {
        super.executeByNamedQuery("updateMeritoActualizaRfcResumen", td_nmr_rfc_actualizar, td_nmr_rfc);
    }

    public void updateMeritoActualizaRfcProcesoNmResumen(String td_nmr_rfc_actualizar, String td_nmr_rfc) {
        super.executeByNamedQuery("updateMeritoActualizaRfcProcesoNmResumen", td_nmr_rfc_actualizar, td_nmr_rfc);
    }
}
