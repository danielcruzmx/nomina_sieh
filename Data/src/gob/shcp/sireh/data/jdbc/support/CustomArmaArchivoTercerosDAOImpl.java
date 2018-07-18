package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.PadronFonac;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sql.DataSource;

import oracle.jdbc.OracleTypes;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;


/**
 * Implementacion DAO para obtener la informacion de nómina para armar el archivo de terceros
 * @author Roberto Muñoz
 * @param idTercero, datTipoCpto, datConcepto, hpQnaPago, hpConsecNomina 
 * @return Lista, Datos del archivo
 */
public class CustomArmaArchivoTercerosDAOImpl extends JdbcDAO implements CustomArmaArchivoTercerosDAO {

    public List<Map<Integer, Object>> getDatosTerceros(String idTercero, String datTipoCpto, String datConcepto, Integer hpQnaPago, Integer hpQnaPagoFin, String hpConsecNomina, String agrupaVerEmp, String estadoPago) throws Exception {
        logger.debug("--> getDatosTerceros --->" + idTercero + " - " + datTipoCpto + " - " + datConcepto + " - " + hpQnaPago + " - " + hpQnaPagoFin + " - " + hpConsecNomina + " - " + agrupaVerEmp);
        if (datTipoCpto.equals("M")) {
            GeneraArcTercerosConMovimientos gt = new GeneraArcTercerosConMovimientos(super.getJdbcTemplate().getDataSource());
            return (List<Map<Integer, Object>>)gt.execute(idTercero, datTipoCpto, datConcepto, hpQnaPago, hpQnaPagoFin, hpConsecNomina, agrupaVerEmp, estadoPago);
        } else {
            GeneraArcTercerosConPago gt = new GeneraArcTercerosConPago(super.getJdbcTemplate().getDataSource());
            return (List<Map<Integer, Object>>)gt.execute(idTercero, datTipoCpto, datConcepto, hpQnaPago, hpQnaPagoFin, hpConsecNomina, agrupaVerEmp, estadoPago);
        }
    }

    /********************* METODO PARA TERCEROS CON BASE EN EL PAGO */
    private class GeneraArcTercerosConPago extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_GENERA_TERCEROS.GeneraTercerosConPago";

        public GeneraArcTercerosConPago(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArcTercerosRM()));
            declareParameter(new SqlParameter("idTercero",      Types.VARCHAR));
            declareParameter(new SqlParameter("datTipoCpto",    Types.VARCHAR));
            declareParameter(new SqlParameter("datConcepto",    Types.VARCHAR));
            declareParameter(new SqlParameter("hpQnaPago",      Types.INTEGER));
            declareParameter(new SqlParameter("hpQnaPagoFin",   Types.INTEGER));
            declareParameter(new SqlParameter("hpConsecNomina", Types.VARCHAR));
            declareParameter(new SqlParameter("agrupaVerEmp",   Types.VARCHAR));
            declareParameter(new SqlParameter("estadoPago",     Types.VARCHAR));
            compile();
        }

        public Object execute(String idTercero, String datTipoCpto, String datConcepto, Integer hpQnaPago, Integer hpQnaPagoFin, String hpConsecNomina, String agrupaVerEmp, String estadoPago) {
            Map<String, Object> results = super.execute(idTercero, datTipoCpto, datConcepto, hpQnaPago, hpQnaPagoFin, hpConsecNomina, agrupaVerEmp, estadoPago);
            return ((List)results.get(SPROC_NAME)).get(0);
        }
    }

    /******************** METODO PARA TERCEROS CON BASE EN MOVIMIENTOS DE PERSONAL */
    private class GeneraArcTercerosConMovimientos extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_GENERA_TERCEROS.GeneraTercerosConMovimientos";

        public GeneraArcTercerosConMovimientos(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new GeneraArcTercerosRM()));
            declareParameter(new SqlParameter("idTercero",      Types.VARCHAR));
            declareParameter(new SqlParameter("datTipoCpto",    Types.VARCHAR));
            declareParameter(new SqlParameter("datConcepto",    Types.VARCHAR));
            declareParameter(new SqlParameter("hpQnaPago",      Types.INTEGER));
            declareParameter(new SqlParameter("hpQnaPagoFin",   Types.INTEGER));
            declareParameter(new SqlParameter("hpConsecNomina", Types.VARCHAR));
            declareParameter(new SqlParameter("agrupaVerEmp",   Types.VARCHAR));
            declareParameter(new SqlParameter("estadoPago",     Types.VARCHAR));
            compile();
        }

        public Object execute(String idTercero, String datTipoCpto, String datConcepto, Integer hpQnaPago, Integer hpQnaPagoFin, String hpConsecNomina, String agrupaVerEmp, String estadoPago) {
            Map<String, Object> results = super.execute(idTercero, datTipoCpto, datConcepto, hpQnaPago, hpQnaPagoFin, hpConsecNomina, agrupaVerEmp, estadoPago);
            return ((List)results.get(SPROC_NAME)).get(0);
        }
    }

    /******************** METODO PARA CUALQUIER TERCERO */
    class GeneraArcTercerosRM implements RowMapper<List<Map<Integer, Object>>> {
        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Map<Integer, Object>> generaTercero = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            TreeMap<Integer, Object> header = new TreeMap<Integer, Object>();
            
            for (int i = 1; i <= columnsNumber; i++) {
                header.put(i, rsmd.getColumnName(i));
            }
            generaTercero.add(header);
            logger.debug("columnsNumber -> " + columnsNumber);

            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                generaTercero.add(mapa);
            } while (rs.next());
            return generaTercero;
        }
    }

    public void exeSpTerceroFonacot(Integer qnaIni, Integer qnaFin, Integer ciclo, Integer mes){
        GeneraArcTercerosFonacot tf = new GeneraArcTercerosFonacot(super.getJdbcTemplate().getDataSource());
        tf.execute(qnaIni, qnaFin, ciclo, mes);
    }
    
    private class GeneraArcTercerosFonacot extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_ENTERO_FONACOT.ACT_IMPORTE";
        
        public GeneraArcTercerosFonacot(DataSource datasource){
            setDataSource(datasource);
            //setFunction(true);
            setSql(SPROC_NAME);
            //declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR));
            declareParameter(new SqlParameter("QNA_IN", Types.INTEGER));
            declareParameter(new SqlParameter("QNA_FIN", Types.INTEGER));
            declareParameter(new SqlParameter("CICLO_IN", Types.INTEGER));
            declareParameter(new SqlParameter("MES_IN", Types.INTEGER));
            compile();
        }
        
        public void execute(Integer qnaIni, Integer qnaFin, Integer ciclo, Integer mes) {
            super.execute(qnaIni, qnaFin, ciclo, mes);
        }
    }
    
    public void exeSpAcumConcentrPercepDeduc(Integer idNomina){
        AcumuladoConcentradoPercepDeduc acpd = new AcumuladoConcentradoPercepDeduc(super.getJdbcTemplate().getDataSource());
        acpd.execute(idNomina);
    }
    
    private class AcumuladoConcentradoPercepDeduc extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_ACUMULA_NOMINA.acumula";
        
        public AcumuladoConcentradoPercepDeduc(DataSource datasource){
            setDataSource(datasource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("idNomina", Types.INTEGER));
            compile();
        }
        
        public void execute(Integer idNomina) {
            super.execute(idNomina);
        }
    }
    
    /**
     * BAJA DEL PADRON EN EL FONAC
     * @param padronFonac
     * PKG_FONAC.BAJA_PADRON('O');
     */
    public void bajaPadronFonac(PadronFonac padronFonac){
        ExeBajaPadronFonac exeBajaPadronFonac = new ExeBajaPadronFonac(super.getJdbcTemplate().getDataSource());
        exeBajaPadronFonac.execute(padronFonac.getPeriodo());
    }
    private class ExeBajaPadronFonac extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_FONAC.BAJA_PADRON";
        public ExeBajaPadronFonac(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("TIPO", Types.VARCHAR));
            compile();  }
        public void execute(String periodo){
            super.execute(periodo);  }  }
    
    /**
     * ACTUALIZA EL PADRON ORDINARIO DEL FONAC
     * @param padronFonac
     * PKG_FONAC.PADRON_ORDINARIO(201413,500,'prueba','cesar');
     */
    public void padronFonacOrdinario(PadronFonac padronFonac){
        Double importe = new Double(padronFonac.getImporte());
        ExeFonacOrdinario exeExeFonacOrdinario = new ExeFonacOrdinario(super.getJdbcTemplate().getDataSource());
        exeExeFonacOrdinario.execute(new Integer(padronFonac.getQnaCaptura()), importe, padronFonac.getReferencia() ,padronFonac.getUsuario());   }

    private class ExeFonacOrdinario extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_FONAC.PADRON_ORDINARIO";
        public ExeFonacOrdinario(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            declareParameter(new SqlParameter("IMPORTE", Types.NUMERIC));
            declareParameter(new SqlParameter("REFERENCIA", Types.VARCHAR));
            declareParameter(new SqlParameter("USUARIO", Types.VARCHAR));
            compile();  }
        public void execute(Integer qnaCaptura, Double importe, String referencia, String usuario){
        super.execute(qnaCaptura, importe, referencia, usuario);   } }
    
    /**
     * ACTUALIZA EL PADRON EXTRAORDINARIO DEL FONAC
     * @param padronFonac
     * PKG_FONAC.PADRON_EXTRAORDINARIO(201401,201313,500,'prueba','cesar');
     */
    public void padronFonacExtraOrdinario(PadronFonac padronFonac){
        Double importe = new Double(padronFonac.getImporte());
        logger.debug("IMPORTE: " + importe);
        ExeFonacExtraOrdinario exeFonacExtraOrdinario = new ExeFonacExtraOrdinario(super.getJdbcTemplate().getDataSource());
        exeFonacExtraOrdinario.execute(new Integer(padronFonac.getQnaCaptura()), new Integer(padronFonac.getQnaInicioCiclo()), importe, padronFonac.getReferencia(), padronFonac.getUsuario() );   
        logger.debug("--");
        }
        
    private class ExeFonacExtraOrdinario extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_FONAC.PADRON_EXTRAORDINARIO";
        public ExeFonacExtraOrdinario(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("QNA_INI", Types.INTEGER));
            declareParameter(new SqlParameter("QNA_PRO", Types.INTEGER));
            declareParameter(new SqlParameter("IMPORTE", Types.NUMERIC));
            declareParameter(new SqlParameter("REFERENCIA", Types.VARCHAR));
            declareParameter(new SqlParameter("P_USUARIO", Types.VARCHAR));
            compile();   }
        public void execute(Integer qnaCaptura, Integer qnaInicioCiclo, Double importe, String referencia, String usuario){
        super.execute(qnaCaptura, qnaInicioCiclo, importe, referencia, usuario);   }  }
        
}