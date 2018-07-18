package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.List;
import java.util.Map;

public interface CustomDocExpedienteDAO extends DataService {

    /**
     * Actualiza registros activos a historico - Alta de registro federal de contribuyentes
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteRfc(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Designacion - Búsqueda de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDepBenef(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta y/o modificación de familiares, dependientes o beneficiarios
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDependientes(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de clave única de registro de población
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCurp(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de documentos sin captura de datos
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     * @param idDocto String
     */
    public void updateActivosToHistoricoExpedienteDoctosSinDato(String rfcEmpleado, String idDocto);

    /**
     * Actualiza registros activos a historico - Alta de domicilio particular
     * @author Oscar S.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDomicilio(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de experiencia laboral
     * @author Gualberto G.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteExperienciaLaboral(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de Datos de Naciemiento
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteDatosNacimiento(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Fechas laborales
     * @author Carolina H.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteFechasLaborales(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de Capacitacion y cursso
     * @author Armando Zuñiga
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCapacitacionCursos(String rfcEmpleado);

    /**
     * Actualiza registros activos a historico - Alta de antecedentes academicos
     * @author Gualberto G.
     * @param rfcEmpleado
     */
    public void updateActivosToHistoricoExpedienteAntecedentesAcademicos(String rfcEmpleado);

    public void updateActivosToHistoricoExpedienteCuentasBancarias(String rfcEmpleado);

    /**
     * Actualiza - Alta de cartilla militar
     * @author Ricardo León.
     * @param rfcEmpleado String
     */
    public void updateActivosToHistoricoExpedienteCartillaMilitar(String rfcEmpleado);
    
    /******************************************************************************************************************************************************************************/
    
    /**
     * Búsqueda de empleados con documentos faltantes obligatorios - Informe
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idUnidad String
     * @return String
     */
    public List<Map<Integer, Object>> getInformeFaltantesObligatorios(String rfcEmpleado, String idUnidad);
    
    /**
     * Metodo encargado de actualizr la descripcion de los documentos sin captura de datos de manera masiva
     * @author Gualberto G
     * @param descripcionDebeDecir
     * @param descripcionDice
     */
    public void updateTdExpDoctosSinDatosDescrip(String descripcionDebeDecir, String descripcionDice);
}

