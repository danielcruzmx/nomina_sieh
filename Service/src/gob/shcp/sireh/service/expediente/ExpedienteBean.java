package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.model.expediente.CurricPubDTO;
import gob.shcp.sireh.model.expediente.CustomDoctosExpPersonalDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;
import gob.shcp.sireh.service.expediente.ExpedienteService;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "Expediente")
@Local( { ExpedienteService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ExpedienteBean extends AbstractBean implements ExpedienteService {

    /**
     * Metodo encargado de obtener los datos del expediente con base a su rfc.
     * @param rfcEmpleado
     * @return ExpedienteDTO
     */
    public ExpedienteDTO getExpediente(String rfcEmpleado) {
        return super.getService(ExpedienteService.class).getExpediente(rfcEmpleado);
    }
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Oscar S.
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param idPaquete Integer
     * @return TnComprobanteDTO
     */
    public TnComprobanteDTO getExpedienteComprobante(Integer idComprobante, String rfcEmpleado, Integer idPaquete) {
        return super.getService(ExpedienteService.class).getExpedienteComprobante(idComprobante, rfcEmpleado, idPaquete);
    }
    
    /**
     * Metodo encargado de cambiar el estado del comprobante a "FIRMADO".
     * @author Oscar S.
     * @param comprobante TnComprobanteDTO
     */
    public void firmarComprobante(TnComprobanteDTO comprobante) {
        super.getService(ExpedienteService.class).firmarComprobante(comprobante);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos activos con base en el rfc del empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoActivos(String rfcEmpleado, String tipo) {
        return super.getService(ExpedienteService.class).getExpDoctoActivos(rfcEmpleado, tipo);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos historicos con base en el rfc del empleado y el tipo de documento.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idDocto String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoHistoricos(String rfcEmpleado, String idDocto) {
        return super.getService(ExpedienteService.class).getExpDoctoHistoricos(rfcEmpleado, idDocto);
    }
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos activos-registrados con base en el rfc del empleado y el id de documento.
     * @author Oscar S.
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoSubgridActivosRegistrados(String rfcEmpleado, String idDocto) {
        return super.getService(ExpedienteService.class).getExpDoctoSubgridActivosRegistrados(rfcEmpleado, idDocto);
    }
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Martin C
     */
    public TnComprobanteDigDTO getExpedienteComprobanteV33(Integer cnFolio, String rfcEmpleado, Integer cnDifFolio){
        return super.getService(ExpedienteService.class).getExpedienteComprobanteV33(cnFolio, rfcEmpleado, cnDifFolio);
    }

    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CurricPubDTO getCurriculumPublico(String rfcEmpleado) {
        return super.getService(ExpedienteService.class).getCurriculumPublico(rfcEmpleado);
    }
    
    /**
     * Metodo encargado de actualizar la informacion del curriculum del Empleado con base en el objeto curricPubDTO.
     * @param curricPubDTO CurricPubDTO
     * @param usuario String
     */
    public void updateCurriculumPublico(CurricPubDTO curricPubDTO, String usuario){
        super.getService(ExpedienteService.class).updateCurriculumPublico(curricPubDTO, usuario);
    }


}
