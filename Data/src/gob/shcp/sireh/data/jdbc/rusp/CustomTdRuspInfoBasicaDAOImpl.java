package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.rusp.Rusp;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class CustomTdRuspInfoBasicaDAOImpl extends JdbcDAO implements CustomTdRuspInfoBasicaDAO {

    public void procesarBajasRusp(Rusp rusp){
        ExeProcesarBajasRuspBorrar exeProcesarBajasRuspBajas = new ExeProcesarBajasRuspBorrar(super.getJdbcTemplate().getDataSource()); 
        exeProcesarBajasRuspBajas.execute(rusp.getQuincena());
        
        ExeProcesarBajasRuspUpdate exeProcesarBajasRuspUpdate = new ExeProcesarBajasRuspUpdate(super.getJdbcTemplate().getDataSource()); 
        exeProcesarBajasRuspUpdate.execute(rusp.getCiclo(), rusp.getQuincena(), rusp.getUsuario());
    }
    
    private class ExeProcesarBajasRuspBorrar extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.BORRABAJAS";
        
        public ExeProcesarBajasRuspBorrar(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            compile();  
        }
        public void execute(Integer quincena){
            super.execute(quincena);  
        }
    }
    
    private class ExeProcesarBajasRuspUpdate extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.RUSPBAJAS";
        
        public ExeProcesarBajasRuspUpdate(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("CICLO", Types.INTEGER));
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            declareParameter(new SqlParameter("USUARIOIN", Types.VARCHAR));
            compile();  
        }
        public void execute(Integer ciclo, Integer quincena, String usuario){
            super.execute(ciclo, quincena, usuario);  
        }
    }
  
  //********************************************************************************  
    public void procesarInformacionBasicaRusp(Rusp rusp){
        ExeProcesarInformacionRuspBasicaB exeProcesarInformacionRuspBasicaB = new ExeProcesarInformacionRuspBasicaB(super.getJdbcTemplate().getDataSource()); 
        exeProcesarInformacionRuspBasicaB.execute(rusp.getIQuincena());
        
        ExeProcesarInformacionRuspBasicaUpdate exeProcesarInformacionRuspBasicaUpdate = new ExeProcesarInformacionRuspBasicaUpdate(super.getJdbcTemplate().getDataSource()); 
        exeProcesarInformacionRuspBasicaUpdate.execute(rusp.getICiclo(), rusp.getIQuincena(), rusp.getQuincenaAnterior(), rusp.getEmail(), rusp.getUsuario(), rusp.getListNominas(), rusp.getEscenario());    
    }

    private class ExeProcesarInformacionRuspBasicaB extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.BORRAINFOBASICA";
        
        public ExeProcesarInformacionRuspBasicaB(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            compile();  
        }
        public void execute(Integer quincena){
            super.execute(quincena);  
        }
    }

    private class ExeProcesarInformacionRuspBasicaUpdate extends StoredProcedure{
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.RUSPINFOBASICA";
        
        public ExeProcesarInformacionRuspBasicaUpdate(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("CICLO", Types.INTEGER));
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            declareParameter(new SqlParameter("QNAANT", Types.INTEGER));
            declareParameter(new SqlParameter("CORREO", Types.VARCHAR));
            declareParameter(new SqlParameter("USUARIOIN", Types.VARCHAR));
            declareParameter(new SqlParameter("NOMINA", Types.VARCHAR));
            declareParameter(new SqlParameter("ESCENARIO", Types.VARCHAR));
        }
        public void execute(Integer ciclo, Integer qna, Integer qnaant, String correo, String usuario, String nomina, String escenario){
            super.execute(ciclo,qna, qnaant, correo, usuario, nomina,escenario);  
        }        
    }

  //***********************************************************************************
   public void procesarDatosPersonalesRusp(Rusp rusp){
       ExeProcesarDatosPersonalesRusp exeProcesarDatosPersonalesRusp = new ExeProcesarDatosPersonalesRusp(super.getJdbcTemplate().getDataSource()); 
       exeProcesarDatosPersonalesRusp.execute(rusp.getIQuincena());
       
       ExeProcesarDatosPersonalesRuspUpdate exeProcesarDatosPersonalesRuspUpdate = new ExeProcesarDatosPersonalesRuspUpdate(super.getJdbcTemplate().getDataSource()); 
       exeProcesarDatosPersonalesRuspUpdate.execute(rusp.getICiclo()-1, rusp.getIQuincena(), rusp.getUsuario());    
   }
    private class ExeProcesarDatosPersonalesRusp extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.BORRADATOSPER";
        
        public ExeProcesarDatosPersonalesRusp(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("QNA", Types.INTEGER));
            compile();  
        }
        public void execute(Integer quincena){
            super.execute(quincena);  
        }
    }
    
    private class ExeProcesarDatosPersonalesRuspUpdate extends StoredProcedure{
        private static final String SPROC_NAME = "PKG_RUSP_PROCESO.DATOS_PER";
        
        public ExeProcesarDatosPersonalesRuspUpdate(DataSource dataSource){
            setDataSource(dataSource);
            setSql(SPROC_NAME);
            declareParameter(new SqlParameter("CICLO_P", Types.INTEGER));
            declareParameter(new SqlParameter("QNA_PAGO", Types.INTEGER));
            declareParameter(new SqlParameter("USUARIO", Types.VARCHAR));
        }
        public void execute(Integer ciclo, Integer qna, String usuario){
            super.execute(ciclo, qna, usuario);  
        }
    }
}
