package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

import gob.shcp.sireh.domain.jdbc.CustomTnComprobanteDig;


import gob.shcp.sireh.domain.jdbc.TnComprobanteDig;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.domain.jdbc.nomina.terceros.TnComprobanteDigCorreo;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.List;



import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;


public class CustoTnComprobanteDigDAOImpl extends JdbcDAO implements CustoTnComprobanteDigDAO {

    public void insertTnComprobanteDig(final List<CustomTnComprobanteDig> list) {
        final LobHandler lobHandler = new DefaultLobHandler();
                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("insertTnComprobanteDig"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setLong(1, list.get(i).getCnFolio());
                        ps.setInt(2, list.get(i).getCnDifFolio());
                        ps.setInt(3, list.get(i).getCnConsecNomina());
                        ps.setInt(4, list.get(i).getCnEjercicio());
                        ps.setInt(5, list.get(i).getCnPaquete());
                        ps.setString(6, list.get(i).getCnRfc());
                        ps.setString(7, list.get(i).getCnSituacion());
                        lobHandler.getLobCreator().setClobAsString(ps, 8, list.get(i).getCnXmlGenerado());
                        ps.setDate(9, list.get(i).getCnFechaGenerado() != null ? new java.sql.Date(list.get(i).getCnFechaGenerado().getTime() ) : null);
                        ps.setDate(10, list.get(i).getCnFecEnvio() != null ? new java.sql.Date(list.get(i).getCnFecEnvio().getTime()) : null);
                        ps.setDate(11, list.get(i).getCnFecRespuesta() != null ? new java.sql.Date(list.get(i).getCnFecRespuesta().getTime()) : null);
                        ps.setString(12, list.get(i).getCnFolioRecibo());
                        ps.setString(13, list.get(i).getCnFolioFiscal());
                        ps.setDate(14, list.get(i).getCnFecEnvCanc()!= null ? new java.sql.Date(list.get(i).getCnFecEnvCanc().getTime()) : null );
                        ps.setDate(15, list.get(i).getCnFecCanc() != null ? new java.sql.Date(list.get(i).getCnFecCanc().getTime()) : null );
                        ps.setDate(16, list.get(i).getCnFecFirmaRec() != null ?  new java.sql.Date(list.get(i).getCnFecFirmaRec().getTime()) : null);
                        ps.setString(17, list.get(i).getCnCadenaOriginal());
                        ps.setString(18, list.get(i).getUsuario());
                        ps.setDate(19, list.get(i).getFecModifico() != null ? new java.sql.Date(list.get(i).getFecModifico().getTime() ) : null);
                    }

                    public int getBatchSize() {
                        return list.size();
                    }
                });
    }
    
    public void updateTimbradoTnComprobanteDig(final List<CustomTnComprobanteDig> list) {
        final LobHandler lobHandler = new DefaultLobHandler();
                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTimbradoTnComprobanteDig"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, list.get(i).getCnSituacion());
                        lobHandler.getLobCreator().setClobAsString(ps, 2, list.get(i).getCnXmlTimbrado());
                        ps.setString(3, list.get(i).getCnFolioRecibo());
                        ps.setString(4, list.get(i).getCnFolioFiscal());
                        ps.setDate(5, list.get(i).getCnFecRespuesta() != null ? new java.sql.Date(list.get(i).getCnFecRespuesta().getTime()) : null);
                        ps.setString(6, list.get(i).getUsuario());
                        ps.setDate(7, list.get(i).getFecModifico() != null ? new java.sql.Date(list.get(i).getFecModifico().getTime() ) : null);
                        
                        ps.setLong(8, list.get(i).getCnFolio());
                        ps.setInt(9, list.get(i).getCnDifFolio());
                        ps.setInt(10, list.get(i).getCnPaquete());
                    }

                    public int getBatchSize() {
                        return list.size();
                    }
                });
    }
    
    public void updateTnComprobanteDig(final CustomTnComprobanteDig customTnComprobanteDig) {
        final LobHandler lobHandler = new DefaultLobHandler();
                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateTnComprobanteDig"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, customTnComprobanteDig.getCnConsecNomina() != null ? customTnComprobanteDig.getCnConsecNomina() : 0);
                        ps.setBytes(2, customTnComprobanteDig.getCnArchCreacion()) ;
                        ps.setDate(3, customTnComprobanteDig.getCnFechaGenerado() != null ? new java.sql.Date(customTnComprobanteDig.getCnFechaGenerado().getTime()) : null);
                        ps.setString(4, customTnComprobanteDig.getCnIncidencia() );
                        lobHandler.getLobCreator().setClobAsString(ps, 5, customTnComprobanteDig.getCnXmlCancelado());
                        ps.setDate(6, customTnComprobanteDig.getCnFecEnvio() != null ? new java.sql.Date(customTnComprobanteDig.getCnFecEnvio().getTime()) : null);
                        ps.setString(7, customTnComprobanteDig.getCnIdPaqueteSat());
                        ps.setDate(8, customTnComprobanteDig.getCnFecRespuesta() != null ? new java.sql.Date(customTnComprobanteDig.getCnFecRespuesta().getTime()) : null);
                        ps.setString(9, customTnComprobanteDig.getUsuario());
                        ps.setString(10, customTnComprobanteDig.getCnCadenaOriginal());
                        ps.setInt(11, customTnComprobanteDig.getCnEjercicio() != null ? customTnComprobanteDig.getCnEjercicio() : 0);
                        ps.setBytes(12, customTnComprobanteDig.getCnArchACancelar() ) ;
                        ps.setDate(13, customTnComprobanteDig.getFecModifico() != null ? new java.sql.Date(customTnComprobanteDig.getFecModifico().getTime() ) : null);
                        ps.setBytes( 14, customTnComprobanteDig.getCnArchTimbrado() );
                        ps.setString(15, customTnComprobanteDig.getCnUriblobCanc());
                        lobHandler.getLobCreator().setClobAsString(ps, 16, customTnComprobanteDig.getCnXmlGenerado());
                        ps.setInt(17, customTnComprobanteDig.getCnEnviadoInst() != null ? customTnComprobanteDig.getCnEnviadoInst() : 0 );
                        ps.setDate(18, customTnComprobanteDig.getCnFecEnvCanc() != null ? new java.sql.Date(customTnComprobanteDig.getCnFecEnvCanc().getTime()) : null);
                        ps.setString(19, customTnComprobanteDig.getCnRfc() );
                        ps.setInt(20, customTnComprobanteDig.getCnPaquete() != null ? customTnComprobanteDig.getCnPaquete() : 0 );
                        ps.setString(21, customTnComprobanteDig.getCnRefTimbrado() );
                        ps.setInt(22, customTnComprobanteDig.getCnPaqueteRv() != null ? customTnComprobanteDig.getCnPaqueteRv() : 0 );
                        lobHandler.getLobCreator().setClobAsString(ps, 23, customTnComprobanteDig.getCnXmlTimbrado());
                        ps.setInt(24, customTnComprobanteDig.getCnEnviadoPers() != null ? customTnComprobanteDig.getCnEnviadoPers() : 0 );
                        ps.setString(25, customTnComprobanteDig.getCnUriblobTimb() );
                        ps.setString(26, customTnComprobanteDig.getCnSituacion() );
                        ps.setString(27, customTnComprobanteDig.getCnCadenaSello());
                        ps.setDate(28, customTnComprobanteDig.getCnFecCanc() != null ? new java.sql.Date(customTnComprobanteDig.getCnFecCanc().getTime() ) : null);
                        ps.setBytes(29, customTnComprobanteDig.getCnArchAnexo20() ) ;
                        ps.setString(30, customTnComprobanteDig.getCnFolioFiscal());
                        ps.setInt(31, customTnComprobanteDig.getCnDifFolio() != null ? customTnComprobanteDig.getCnDifFolio() : 0 );
                        ps.setDate(32, customTnComprobanteDig.getCnFecFirmaRec() != null ? new java.sql.Date(customTnComprobanteDig.getCnFecFirmaRec().getTime() ) : null);
                        ps.setString(33, customTnComprobanteDig.getCnFolioRecibo());
                        ps.setLong(34, customTnComprobanteDig.getCnFolio());
                        ps.setInt(35, customTnComprobanteDig.getCnDifFolio() != null ? customTnComprobanteDig.getCnDifFolio() : 0);
                        ps.setLong(36, customTnComprobanteDig.getCnFolio());
                        ps.setInt(37, customTnComprobanteDig.getCnPaquete() != null ? customTnComprobanteDig.getCnPaquete() : 0);
                    }


                    public int getBatchSize() {
                        return 1;
                    }
                });
    }
    
    public void updateXmlGeneradoTnComprobanteDig(final List<CustomTnComprobanteDig> list){
        final LobHandler lobHandler = new DefaultLobHandler();
                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateXmlGeneradoTnComprobanteDig"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, list.get(i).getCnSituacion());
                        lobHandler.getLobCreator().setClobAsString(ps, 2, list.get(i).getCnXmlGenerado());
                        ps.setString(3, list.get(i).getUsuario());
                        ps.setDate(4, list.get(i).getFecModifico() != null ? new java.sql.Date(list.get(i).getFecModifico().getTime() ) : null);
                        
                        ps.setLong(5, list.get(i).getCnFolio());
                        ps.setInt(6, list.get(i).getCnDifFolio());
                    }

                    public int getBatchSize() {
                        return list.size();
                    }
                });
    }
    
    public void updateSituacionTnComprobanteDig(final List<TnComprobanteDig> list, final String estatusActual){

                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateSituacionTnComprobanteDig"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, estatusActual);
                        ps.setString(2, list.get(i).getUsuario());
                        ps.setDate(3, list.get(i).getFecModifico() != null ? new java.sql.Date(list.get(i).getFecModifico().getTime() ) : null);
                        ps.setString(4, list.get(i).getCnRefTimbrado() );
                        ps.setString(5, list.get(i).getCnIncidencia() );
                        ps.setLong(6, list.get(i).getCnFolio());
                        ps.setInt(7, list.get(i).getCnDifFolio());
                        ps.setInt(8, list.get(i).getCnPaquete());
                    }

                    public int getBatchSize() {
                        return list.size();
                    }
                });
    }
    
    public void updateSituacionAndPaqueteRv(final List<TnComprobanteDig> list, final String estatusActual){

                super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateSituacionAndPaqueteRv"), new BatchPreparedStatementSetter(){

                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, estatusActual);
                        ps.setString(2, list.get(i).getUsuario());
                        ps.setDate(3, list.get(i).getFecModifico() != null ? new java.sql.Date(list.get(i).getFecModifico().getTime() ) : null);
                        ps.setString(4, list.get(i).getCnRefTimbrado() );
                        ps.setInt(5, list.get(i).getCnPaqueteRv() );
                        ps.setString(6, list.get(i).getCnIncidencia());
                        ps.setLong(7, list.get(i).getCnFolio());
                        ps.setInt(8, list.get(i).getCnDifFolio());
                        ps.setInt(9, list.get(i).getCnPaquete());
                        
                    }

                    public int getBatchSize() {
                        return list.size();
                    }
                });
    }
    
    
    public void updateEnviadoTnComprobanteDig(final List<TnComprobanteDig> list) {
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateEnviadoTnComprobanteDig"), new BatchPreparedStatementSetter(){

            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setInt(1, list.get(i).getCnEnviadoInst() );
                ps.setInt(2, list.get(i).getCnEnviadoPers() );
                ps.setLong(3, list.get(i).getCnFolio());
                ps.setInt(4, list.get(i).getCnDifFolio());
                ps.setInt(5, list.get(i).getCnPaquete());
                
            }

            public int getBatchSize() {
                return list.size();
            }
        });
    }


    public void updateSelloTnComprobanteDig(final int idNomina, final List<TnComprobanteDig> list) {
        super.getJdbcTemplate().batchUpdate(super.getQueryDefinition("updateSelloTnComprobanteDig"), new BatchPreparedStatementSetter(){

            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, list.get(i).getCnCadenaSello()  );
                ps.setLong(2, list.get(i).getCnFolio());
                ps.setInt(3, list.get(i).getCnDifFolio());
                ps.setInt(4, idNomina);
            }

            public int getBatchSize() {
                return list.size();
            }
        });
    }

    public List<TnComprobanteDig> getTnComprobanteDigByUuid(String uuid, int cnPaquete) {
        String queryGetTnComprobanteDigByUuid = super.getQueryDefinition("queryGetTnComprobanteDigByUuid");
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("cnFolioFiscal", uuid).addValue("cnPaquete", cnPaquete) ;
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnComprobanteDig> listaPlazas = namedTemplate.query(queryGetTnComprobanteDigByUuid, namedParameters, new TnComprobanteDigRM());
        return listaPlazas;
    }

 public List<TnComprobanteDigCorreo> getComprobantesByIdNomina(Integer idNomina) {
     String queryGetTnComprobanteDigByUuid = super.getQueryDefinition("queryGetComprobantesByIdNomina");
     SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("idNomina", idNomina);
     DataSource ds = super.getJdbcTemplate().getDataSource();
     NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

     List<TnComprobanteDigCorreo> listaTnComprobanteDig = namedTemplate.query(queryGetTnComprobanteDigByUuid, namedParameters, new TnComprobanteDigCorreoRM());
     return listaTnComprobanteDig;
 }
    public List<TnComprobanteDig> getCadenaOriginalByIdNomina(Integer idNomina) {
        String queryGetCadenaOriginalByIdNomina = super.getQueryDefinition("queryGetCadenaOriginalByIdNomina");
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("idNomina", idNomina);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnComprobanteDig> listaTnComprobanteDig = namedTemplate.query(queryGetCadenaOriginalByIdNomina, namedParameters, new TnComprobanteDigCadenaRM());
        return listaTnComprobanteDig;
    }
    
    public List<TnComprobanteDig> getXmlSelloByIdNomina(Integer idNomina) {
        String queryGetCadenaOriginalByIdNomina = super.getQueryDefinition("queryGetXmlSelloByIdNomina");
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("idNomina", idNomina);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnComprobanteDig> listaTnComprobanteDig = namedTemplate.query(queryGetCadenaOriginalByIdNomina, namedParameters, new TnComprobanteDigXmlSelloRM());
        return listaTnComprobanteDig;
    }
    
    public List<TnComprobanteDig> getFoliosByIdNomina(Integer idNomina) {
        String queryGetCadenaOriginalByIdNomina = super.getQueryDefinition("queryFoliosByIdNomina");
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("idNomina", idNomina);
        DataSource ds = super.getJdbcTemplate().getDataSource();
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(ds);

        List<TnComprobanteDig> listaTnComprobanteDig = namedTemplate.query(queryGetCadenaOriginalByIdNomina, namedParameters, new TnComprobanteFoliosRM());
        return listaTnComprobanteDig;
    }
    
    public TnComprobanteDig getTnComprobanteDigById(int cnFolio, int cnDifFolio, int cnPaquete) {
        String query = super.getQueryDefinition("getTnComprobanteDigById");
        return super.getJdbcTemplate().queryForObject(query, new TnComprobanteDigRM(), cnFolio, cnDifFolio, cnPaquete);
    }
    
    private class TnComprobanteDigRM implements RowMapper<TnComprobanteDig>{
        public TnComprobanteDig mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
            tnComprobanteDig.setCnFolio(rs.getLong("CN_FOLIO") );
            tnComprobanteDig.setCnDifFolio(rs.getInt ("CN_DIF_FOLIO") );
            tnComprobanteDig.setCnConsecNomina(rs.getInt("CN_CONSEC_NOMINA"));
            tnComprobanteDig.setCnEjercicio(rs.getInt("CN_EJERCICIO"));
            tnComprobanteDig.setCnPaquete(rs.getInt("CN_PAQUETE"));
            tnComprobanteDig.setCnRfc(rs.getString("CN_RFC"));
            tnComprobanteDig.setCnSituacion(rs.getString("CN_SITUACION"));
            tnComprobanteDig.setCnXmlGenerado(rs.getClob("CN_XML_GENERADO"));
            tnComprobanteDig.setCnFechaGenerado(rs.getDate("CN_FECHA_GENERADO"));
            tnComprobanteDig.setCnXmlTimbrado(rs.getClob("CN_XML_TIMBRADO"));
            tnComprobanteDig.setCnFecEnvio(rs.getDate("CN_FEC_ENVIO"));
            tnComprobanteDig.setCnFecRespuesta(rs.getDate("CN_FEC_RESPUESTA"));
            tnComprobanteDig.setCnFolioRecibo(rs.getString("CN_FOLIO_RECIBO"));
            tnComprobanteDig.setCnFolioFiscal(rs.getString("CN_FOLIO_FISCAL"));
            tnComprobanteDig.setCnFecEnvCanc(rs.getDate("CN_FEC_ENV_CANC"));
            tnComprobanteDig.setCnFecCanc(rs.getDate("CN_FEC_CANC"));
            tnComprobanteDig.setCnFecFirmaRec(rs.getDate("CN_FEC_FIRMA_REC"));
            tnComprobanteDig.setCnCadenaOriginal(rs.getString("CN_CADENA_ORIGINAL"));
            tnComprobanteDig.setCnCadenaSello(rs.getString("CN_CADENA_SELLO"));
            tnComprobanteDig.setCnArchCreacion(rs.getBlob("CN_ARCH_CREACION") != null ? blobToByteArray(rs.getBlob("CN_ARCH_CREACION")) : null);
            tnComprobanteDig.setCnArchAnexo20(rs.getBlob("CN_ARCH_ANEXO20") != null ? blobToByteArray(rs.getBlob("CN_ARCH_ANEXO20")) : null);
            tnComprobanteDig.setCnArchTimbrado(rs.getBlob("CN_ARCH_TIMBRADO") != null ? blobToByteArray(rs.getBlob("CN_ARCH_TIMBRADO")) : null);
            tnComprobanteDig.setCnArchACancelar(rs.getBlob("CN_ARCH_A_CANCELAR") != null ? blobToByteArray(rs.getBlob("CN_ARCH_A_CANCELAR")) : null);
            tnComprobanteDig.setCnXmlCancelado(rs.getClob("CN_XML_CANCELADO"));
            tnComprobanteDig.setCnIncidencia(rs.getString("CN_INCIDENCIA"));
            tnComprobanteDig.setCnRefTimbrado(rs.getString("CN_REF_TIMBRADO"));
            tnComprobanteDig.setCnPaqueteRv(rs.getInt("CN_PAQUETE_RV"));
            tnComprobanteDig.setCnIdPaqueteSat(rs.getString("CN_ID_PAQUETE_SAT"));
            tnComprobanteDig.setCnUriblobTimb(rs.getString("CN_URIBLOB_TIMB"));
            tnComprobanteDig.setCnUriblobCanc(rs.getString("CN_URIBLOB_CANC"));
            tnComprobanteDig.setCnEnviadoInst(rs.getInt ("CN_ENVIADO_INST") );
            tnComprobanteDig.setCnEnviadoPers(rs.getInt ("CN_ENVIADO_PERS") );
            tnComprobanteDig.setUsuario(rs.getString("USUARIO"));
            tnComprobanteDig.setFecModifico(rs.getDate("FEC_MODIFICO"));
            return tnComprobanteDig;
        }
    }

    private class TnComprobanteDigCorreoRM implements RowMapper<TnComprobanteDigCorreo>{
        public TnComprobanteDigCorreo mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobanteDigCorreo tnComprobanteDigCorreo = new TnComprobanteDigCorreo();
            tnComprobanteDigCorreo.setCnFolio(rs.getLong("CN_FOLIO") );
            tnComprobanteDigCorreo.setCnDifFolio(rs.getInt ("CN_DIF_FOLIO") );
            tnComprobanteDigCorreo.setCnPaquete(rs.getInt("CN_PAQUETE"));
            tnComprobanteDigCorreo.setCnRfc(rs.getString("CN_RFC"));
            tnComprobanteDigCorreo.setCnXmlTimbrado(rs.getClob("CN_XML_TIMBRADO"));
            tnComprobanteDigCorreo.setCnEnviadoInst(rs.getInt ("CN_ENVIADO_INST") );
            tnComprobanteDigCorreo.setCnEnviadoPers(rs.getInt ("CN_ENVIADO_PERS") );
            tnComprobanteDigCorreo.setEMailOficial(rs.getString("E_MAIL_OFICIAL"));
            tnComprobanteDigCorreo.setEMailPersonal(rs.getString("E_MAIL_PERSONAL"));
            return tnComprobanteDigCorreo;
        }
    }
    
    private class TnComprobanteDigCadenaRM implements RowMapper<TnComprobanteDig>{
        public TnComprobanteDig mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
            tnComprobanteDig.setCnFolio(rs.getLong("CN_FOLIO") );
            tnComprobanteDig.setCnCadenaOriginal(rs.getString("CN_CADENA_ORIGINAL"));
            return tnComprobanteDig;
        }
    }

    private class TnComprobanteDigXmlSelloRM implements RowMapper<TnComprobanteDig>{
        public TnComprobanteDig mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
            tnComprobanteDig.setCnFolio(rs.getLong("CN_FOLIO") );
            tnComprobanteDig.setCnCadenaSello(rs.getString("CN_CADENA_SELLO"));
            tnComprobanteDig.setCnXmlGenerado(rs.getClob("CN_XML_GENERADO") );
            return tnComprobanteDig;
        }
    }
    
    private class TnComprobanteFoliosRM implements RowMapper<TnComprobanteDig>{
        public TnComprobanteDig mapRow(ResultSet rs, int rowNum) throws SQLException {
            TnComprobanteDig tnComprobanteDig = new TnComprobanteDig();
            tnComprobanteDig.setCnFolio(rs.getLong("CN_FOLIO") );
            tnComprobanteDig.setCnDifFolio(rs.getInt("CN_DIF_FOLIO"));
            return tnComprobanteDig;
        }
    }
    
    public void deleteByCnConsecNomina(int idNomina, int cnPaquete) {
        super.executeByNamedQuery("deleteByCnConsecNomina", idNomina, cnPaquete);
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
