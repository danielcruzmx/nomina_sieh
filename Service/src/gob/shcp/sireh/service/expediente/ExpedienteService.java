package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.model.expediente.CurricPubDTO;
import gob.shcp.sireh.model.expediente.CustomDoctosExpPersonalDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDTO;


import java.util.List;

import javax.ejb.Local;

@Local
public interface ExpedienteService extends BusinessService {

    /**
     * @param rfcEmpleado
     * @return
     */
    ExpedienteDTO getExpediente(String rfcEmpleado);
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Oscar S.
     * @param idComprobante RequestParam
     * @param rfcEmpleado RequestParam
     * @param idPaquete Integer
     * @return TnComprobanteDTO
     */
    TnComprobanteDTO getExpedienteComprobante(Integer idComprobante, String rfcEmpleado, Integer idPaquete);
    
    /**
     * Metodo encargado de cambiar el estado del comprobante a "FIRMADO".
     * @author Oscar S.
     * @param comprobante TnComprobanteDTO
     */
    void firmarComprobante(TnComprobanteDTO comprobante);
    
    /**
     * Metodo encargado de obtener el listado de dcoumentos activos con base en el rfc del empleado.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param tipo String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoActivos(String rfcEmpleado, String tipo);

    /**
     * Metodo encargado de obtener el listado de dcoumentos historicos con base en el rfc del empleado y el id de documento.
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param idDocto String
     * @return List&lt;CustomDoctosExpPersonalDTO&gt;
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoHistoricos(String rfcEmpleado, String idDocto);

    /**
     * Metodo encargado de obtener el listado de dcoumentos activos-registrados con base en el rfc del empleado y el id de documento.
     * @author Oscar S.
     */
    public List<CustomDoctosExpPersonalDTO> getExpDoctoSubgridActivosRegistrados(String rfcEmpleado, String idDocto);
    
    /**
     * Metodo encargado de obtener el comprobante de pago.
     * @author Martin C
     */
    public TnComprobanteDigDTO getExpedienteComprobanteV33(Integer cnFolio, String rfcEmpleado, Integer cnDifFolio);
    
    /**
     * Metodo encargado de obtener informacion de empleado
     */
    CurricPubDTO getCurriculumPublico(String rfcEmpleado);
    
    /**
     * Metodo encargado de obtener actualizar informacion del curriculum
     */
    void updateCurriculumPublico(CurricPubDTO curricPubDTO, String usuario);

}
