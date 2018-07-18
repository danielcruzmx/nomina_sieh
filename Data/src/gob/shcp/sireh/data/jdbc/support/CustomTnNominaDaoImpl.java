package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnNomina;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.StringWriter;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;

import org.springframework.jdbc.core.RowMapper;

public class CustomTnNominaDaoImpl extends JdbcDAO implements CustomTnNominaDao {

    public int getNextComplemento(TnNomina tnNomina) {
        String sqlCad = " select NVL(MAX(NOM_NUM_COMPLEM)+1,0)" + " from TN_NOMINA" + " where NOM_QNA_CAPTURA = ?" + " AND ID_TIPO_NOMINA = ?";
        return super.getJdbcTemplate().queryForInt(sqlCad, new Object[] { tnNomina.getNomQnaCaptura(), tnNomina.getIdTipoNomina() });
    }

    public int updateNominaTimbrado() {
        return 0;
    }

    /**
     * Metodo que consulta los campos de tipo BLOB de la tabla TN_NOMINA
     * @auth Gualberto G.
     * @param idNomina
     * @return Map<String, Object>
     */
    public Map<String, Object> getTnNominaBlobById(int idNomina) {
        String blobsTnNominaById = super.getQueryDefinition("queryBlobsByIdNomina");
        return super.getJdbcTemplate().queryForObject(blobsTnNominaById, new TnNominaRM(), idNomina);
    }

    public TnNomina getById(int idNomina) {
        String blobsTnNominaById = super.getQueryDefinition("getNominaById");
        return super.getJdbcTemplate().queryForObject(blobsTnNominaById, new TnNominaRowM(), idNomina);
    }

    private class TnNominaRM implements RowMapper<Map<String, Object>> {
        public Map<String, Object> mapRow(ResultSet rs, int rowNum) throws SQLException {
            Map<String, Object> tnNomina = new HashMap<String, Object>();
            tnNomina.put("nomArchCreacion", rs.getBlob("nomArchCreacion"));
            tnNomina.put("nomArchAnexo20", rs.getBlob("nomArchAnexo20"));
            tnNomina.put("nomArchTimbrado", rs.getBlob("nomArchTimbrado"));
            tnNomina.put("nomArchCanc", rs.getBlob("nomArchCanc"));
            return tnNomina;
        }
    }

    private class TnNominaRowM implements RowMapper<TnNomina> {
        public TnNomina mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnNomina tnNomina = new TnNomina();
            tnNomina.setIdNomina(rs.getLong("ID_NOMINA") );
            tnNomina.setIdEdoNom(rs.getString("ID_EDO_NOM"));
            tnNomina.setNomQnaCaptura(rs.getInt("NOM_QNA_CAPTURA")); 
            tnNomina.setNomNumComplem(rs.getString("NOM_NUM_COMPLEM"));
            tnNomina.setIdTipoNomina(rs.getString("ID_TIPO_NOMINA"));
            tnNomina.setDescNomina(rs.getString("DESC_NOMINA") );
            tnNomina.setNomLeyenda(rs.getString("NOM_LEYENDA"));
            tnNomina.setNomReglaCalculo(rs.getString("NOM_REGLA_CALCULO"));
            tnNomina.setNomFuenteDatos(rs.getString("NOM_FUENTE_DATOS"));
            tnNomina.setNomIniPago(rs.getDate("NOM_INI_PAGO"));
            tnNomina.setNomFinPago(rs.getDate("NOM_FIN_PAGO"));
            tnNomina.setNomFecPago(rs.getDate("NOM_FEC_PAGO"));
            tnNomina.setNomFecDeposito(rs.getDate("NOM_FEC_DEPOSITO"));
            tnNomina.setIdGrupoPagoNom(rs.getString("ID_GRUPO_PAGO_NOM"));
            tnNomina.setNomFecApertura(rs.getDate("NOM_FEC_APERTURA"));
            tnNomina.setNomFecCierre(rs.getDate("NOM_FEC_CIERRE"));
            tnNomina.setNomCerrada(rs.getString("NOM_CERRADA"));
            tnNomina.setNomDiasPagar(rs.getInt("NOM_DIAS_PAGAR"));
            tnNomina.setNomAplicarExentos(rs.getString("NOM_APLICAR_EXENTOS"));
            tnNomina.setNomVigente(rs.getString("NOM_VIGENTE"));
            tnNomina.setNomGratifAgui(rs.getString("NOM_GRATIF_AGUI"));
            tnNomina.setNomCompletarPeriodo(rs.getString("NOM_COMPLETAR_PERIODO"));
            tnNomina.setNomFecCreacion(rs.getDate("NOM_FEC_CREACION"));
            tnNomina.setNomArchCreacion(rs.getBlob("NOM_ARCH_CREACION") != null ? blobToByteArray(rs.getBlob("NOM_ARCH_CREACION")) : null);
            tnNomina.setNomFecAnexo20(rs.getDate("NOM_FEC_ANEXO20"));
            tnNomina.setNomArchAnexo20(rs.getBlob("NOM_ARCH_ANEXO20") != null ? blobToByteArray(rs.getBlob("NOM_ARCH_ANEXO20")) : null);
            tnNomina.setNomFecTimbrado(rs.getDate("NOM_FEC_TIMBRADO"));
            tnNomina.setNomArchTimbrado(rs.getBlob("NOM_ARCH_TIMBRADO") != null ? blobToByteArray(rs.getBlob("NOM_ARCH_TIMBRADO")) : null);
            tnNomina.setNomRefTimbrado(rs.getString("NOM_REF_TIMBRADO"));
            tnNomina.setNomFecCancSireh(rs.getDate("NOM_FEC_CANC_SIREH"));
            tnNomina.setNomArchCanc(rs.getBlob("NOM_ARCH_CANC") != null ? blobToByteArray(rs.getBlob("NOM_ARCH_CANC")) : null);
            tnNomina.setNomFecCancSat(rs.getDate("NOM_FEC_CANC_SAT"));
            tnNomina.setNomRefSat(rs.getString("NOM_REF_SAT"));
            tnNomina.setNomFecCancA20(rs.getDate("NOM_FEC_CANC_A20"));
            tnNomina.setNomGobFed1(rs.getBigDecimal("NOM_GOB_FED1"));
            tnNomina.setNomGobFed2(rs.getBigDecimal("NOM_GOB_FED2"));
            tnNomina.setNomGobFed3(rs.getBigDecimal("NOM_GOB_FED3"));
            tnNomina.setNomGobFed4(rs.getBigDecimal("NOM_GOB_FED4"));
            tnNomina.setNomFacRen1(rs.getBigDecimal("NOM_FAC_REN1"));
            tnNomina.setNomFacRen2(rs.getBigDecimal("NOM_FAC_REN2"));
            tnNomina.setNomImpSin1(rs.getBigDecimal("NOM_IMP_SIN1"));
            tnNomina.setNomImpSin2(rs.getBigDecimal("NOM_IMP_SIN2"));
            tnNomina.setNomCicloFon(rs.getInt("NOM_CICLO_FON"));
            tnNomina.setNomRemesa(rs.getString("NOM_REMESA"));
            tnNomina.setNomIdPaqueteSat(rs.getString("NOM_ID_PAQUETE_SAT"));
            tnNomina.setCnPaquete(rs.getInt("CN_PAQUETE"));
            tnNomina.setNomUriblobTimb(rs.getString("NOM_URIBLOB_TIMB"));
            tnNomina.setNomUriblobCanc(rs.getString("NOM_URIBLOB_CANC"));
            tnNomina.setUsuario(rs.getString("USUARIO"));
            tnNomina.setFecModifico(rs.getDate("FEC_MODIFICO"));
            return tnNomina;
        }
    }

    /**
     * Obtiene el numero de registros de la tabla por idRechazo
     * @auth Martin C.
     * @param nomTabla String
     * @param idRechazo Integer
     * @return Integer
     */
    public Integer getNumDoctosByTableExpediente(String nomTabla, Integer idRechazo){
        String sql = "SELECT  COUNT(*) FROM " + nomTabla + " WHERE ID_EXP_RECHAZO = ?";
        return super.getJdbcTemplate().queryForInt(sql, new Object[]{idRechazo});
    }
    
    /**
     * Obtiene loa registros de la tabla por idRechazo
     * @auth Martin C.
     * @param nomTabla String
     * @param idRechazo Integer
     * @return Integer
     */
    public List<Map<String, Object>> getDoctosByTableExpediente(String nomTabla, Integer idRechazo){
        String doctoRef = "SELECT column_name as doctoRef FROM all_tab_columns where table_name = '" + nomTabla + "' and column_name like '%_DOCTO_REF'";
        String doctoSec = "SELECT column_name as doctoRef FROM all_tab_columns where table_name = '" + nomTabla + "' and column_name like '%_SECUENCIA'";
        
        String referencia = super.getJdbcTemplate().queryForObject(doctoRef, String.class);
        String secuencia  = super.getJdbcTemplate().queryForObject(doctoSec, String.class);
        
        String sql = "SELECT RFC_EMPLEADO as rfcEmpleado, ID_DOCTO as idDocto, " + referencia + " as referencia, " +  secuencia  + " as secuencia FROM " + nomTabla + " WHERE ID_EXP_RECHAZO = ?";
        
        return super.getJdbcTemplate().queryForList(sql, new Object[]{idRechazo});
    }
    
    

    private byte[] blobToByteArray(java.sql.Blob blob) {
        byte[] buffer = new byte[4096];
        if (blob != null) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            InputStream in = null;
            try {
                in = blob.getBinaryStream();
                int n = 0;

                while ((n = in.read(buffer)) > 0) {
                    baos.write(buffer, 0, n);
                }
                in.close();
                baos.close();
                return baos.toByteArray();
            } catch (SQLException e) {

            } catch (IOException e) {

            }
        }
        return null;
    }

}
