package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

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

public class CustomDocExpedienteDAOImpl extends JdbcDAO implements CustomDocExpedienteDAO {

    /**
     * Actualiza registros activos a historico - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteRfc(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaRfc", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Designacion - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDepBenef(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaDepBenef", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDependientes(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaDependientes", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCurp(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaCurp", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param idDocto String
     */
    public void updateActivosToHistoricoExpedienteDoctosSinDato(String rfcEmpleado, String idDocto) {
        super.executeByNamedQuery("updateActivosToHistorico-altaDocumentosSinCaptura", rfcEmpleado, idDocto);
    }

    /**
     * Actualiza registros activos a historico - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDomicilio(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaDomicilio", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteExperienciaLaboral(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-experienciaLaboral", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de datos de nacimiento
     * @author Armando Z
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDatosNacimiento(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaDatosNacimiento", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de Capacitacion y cursso
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCapacitacionCursos(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaCapacitacionCursos", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Fechas Laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteFechasLaborales(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaFechasLaborales", rfcEmpleado);
    }

    /**
     * Actualiza registros activos a historico - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param rfcEmpleado
     */
    public void updateActivosToHistoricoExpedienteAntecedentesAcademicos(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaAntecedentesAcademicos", rfcEmpleado);
    }

    public void updateActivosToHistoricoExpedienteCuentasBancarias(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaCuentasBancarias", rfcEmpleado);
    }

    /**
     * Actualiza - Alta de cartilla militar
     * @author Ricardo León.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCartillaMilitar(String rfcEmpleado) {
        super.executeByNamedQuery("updateActivosToHistorico-altaCartillaMilitar", rfcEmpleado);
    }
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idUnidad String
     * @return String
     */
    public List<Map<Integer, Object>> getInformeFaltantesObligatorios(String rfcEmpleado, String idUnidad) {
        ExpFaltantesObligatorios sp = new ExpFaltantesObligatorios(super.getJdbcTemplate().getDataSource());
        return (List<Map<Integer, Object>>)sp.execute(rfcEmpleado, idUnidad);
    }
    
    /**
     * Clase anidada encargada de ejecutar la consulta a PKG_EXPEDIENTE.faltantesObligatorios
     * @author Oscar S.
     */
    private class ExpFaltantesObligatorios extends StoredProcedure {
        private static final String SPROC_NAME = "PKG_EXPEDIENTE.faltantesObligatorios";

        public ExpFaltantesObligatorios(DataSource datasource) {
            setDataSource(datasource);
            setFunction(true);
            setSql(SPROC_NAME);
            declareParameter(new SqlOutParameter(SPROC_NAME, OracleTypes.CURSOR, new ExpFaltantesObligatoriosRM()));
            declareParameter(new SqlParameter("rfcEmpleado_in", Types.VARCHAR));
            declareParameter(new SqlParameter("idUnidad_in", Types.VARCHAR));
            compile();
        }

        public Object execute(String rfcEmpleado, String idUnidad) {
            Map<String, Object> results = super.execute(rfcEmpleado, idUnidad);
            return ((List)results.get(SPROC_NAME)).get(0);
        }
    }
    
    /**
     * RowMapper para la consulta a PKG_EXPEDIENTE.faltantesObligatorios
     * @author Oscar S.
     */
    class ExpFaltantesObligatoriosRM implements RowMapper<List<Map<Integer, Object>>> {
        public List<Map<Integer, Object>> mapRow(ResultSet rs, int rowNum) throws SQLException {
            List<Map<Integer, Object>> listaFaltantes = new ArrayList<Map<Integer, Object>>();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            TreeMap<Integer, Object> header = new TreeMap<Integer, Object>();
            
            for (int i = 1; i <= columnsNumber; i++) {
                header.put(i, rsmd.getColumnName(i));
            }
            listaFaltantes.add(header);
            logger.debug("columnsNumber -> " + columnsNumber);

            do {
                TreeMap<Integer, Object> mapa = new TreeMap<Integer, Object>();
                for (int i = 1; i <= columnsNumber; i++) {
                    mapa.put(i, rs.getObject(i));
                }
                listaFaltantes.add(mapa);
            } while (rs.next());
            return listaFaltantes;
        }
    }
    
    /******************************************************************************************************************************************************************************/
    
     /**
      * Metodo encargado de actualizr la descripcion de los documentos sin captura de datos de manera masiva
      * @author Gualberto G
      * @param descripcionDebeDecir
      * @param descripcionDice
      */
     public void updateTdExpDoctosSinDatosDescrip(String descripcionDebeDecir, String descripcionDice){
         super.executeByNamedQuery("updateTdExpDoctosSinDatos-modDescripMasiva", descripcionDebeDecir, descripcionDice);
     }
}
