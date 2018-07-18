package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.CambioBancariosDTO;
import gob.shcp.sireh.model.nomina.CambioComplementariosDTO;
import gob.shcp.sireh.model.nomina.CambioDomicilioDTO;
import gob.shcp.sireh.model.nomina.CambioNombreCurpDTO;
import gob.shcp.sireh.model.nomina.CambioRfcDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Cambios de datos.
 */
@Stateless(name="CambioNomina")
@Local({CambioNominaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class CambioNominaBean extends AbstractBean implements CambioNominaService {
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioRfcDTO getEmpleadoPlaza(String rfcEmpleado) {
        return super.getService(CambioNominaService.class).getEmpleadoPlaza(rfcEmpleado);
    }
    
    /**
     * Metodo encargado de actualizar rfc del Empleado con base en el objeto CambioRfcDTO.
     * @param cambioRfc CambioRfcDTO
     * @param usuario String
     */
    public void updateEmpleadoPlazaRfc(CambioRfcDTO cambioRfc, String usuario) {
        super.getService(CambioNominaService.class).updateEmpleadoPlazaRfc(cambioRfc, usuario);
    }
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioNombreCurpDTO getEmpleadoCambioNombreCurp(String rfcEmpleado) {
        return super.getService(CambioNominaService.class).getEmpleadoCambioNombreCurp(rfcEmpleado);
    }
    
    /**
     * Metodo encargado de actualizar el CURP del Empleado con base en el objeto cambioNombreCurpDTO.
     * @param cambioNombreCurpDTO CambioNombreCurpDTO
     * @param usuario String
     */
    public void updateEmpleadoNombreCurp(CambioNombreCurpDTO cambioNombreCurpDTO, String usuario) {
        super.getService(CambioNominaService.class).updateEmpleadoNombreCurp(cambioNombreCurpDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioBancariosDTO getEmpleadoCambioBancarios(String rfcEmpleado) {
        return super.getService(CambioNominaService.class).getEmpleadoCambioBancarios(rfcEmpleado);
    }
     
    /**
     * Metodo encargado de actualizar los datos bancarios del Empleado con base en el objeto cambioBancariosDTO.
     * @param cambioBancariosDTO CambioBancariosDTO
     * @param usuario String
     */
    public void updateEmpleadoBancarios(CambioBancariosDTO cambioBancariosDTO, String usuario) {
        super.getService(CambioNominaService.class).updateEmpleadoBancarios(cambioBancariosDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioDomicilioDTO getEmpleadoCambioDomicilio(String rfcEmpleado) {
        return super.getService(CambioNominaService.class).getEmpleadoCambioDomicilio(rfcEmpleado);
    }
    
    /**
     * Metodo encargado de actualizar el domicilio del Empleado con base en el objeto cambioDomicilioDTO.
     * @param cambioDomicilioDTO CambioDomicilioDTO
     * @param usuario String
     */
    public void updateEmpleadoCambioDomicilio(CambioDomicilioDTO cambioDomicilioDTO, String usuario){
        super.getService(CambioNominaService.class).updateEmpleadoCambioDomicilio(cambioDomicilioDTO, usuario);
    }
    
    public CambioComplementariosDTO getEmpleadoCambioComplementarios(String rfcEmpleado){
        return super.getService(CambioNominaService.class).getEmpleadoCambioComplementarios(rfcEmpleado);
    }
    
   public void updateEmpleadoCambioComplementarios(CambioComplementariosDTO cambioComplementariosDTO, String usuario){
        super.getService(CambioNominaService.class).updateEmpleadoCambioComplementarios(cambioComplementariosDTO, usuario);
   }
    
}
