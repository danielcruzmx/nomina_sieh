package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.nomina.actualizacion.ActualizaErarioFedDTO;
import gob.shcp.sireh.model.nomina.actualizacion.GestionFonacDTO;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosConceptoEmpleadoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;

import gob.shcp.sireh.model.nomina.conceptos.MovtoConceptoPagoDTO;

import java.util.List;

import java.util.Map;

import javax.ejb.Local;
@Local
public interface ActualizacionNominaService extends BusinessService {

    public DatosEmpleadoCptoDTO buscarDatosEmpleadoCpto(java.lang.String rfcEmpleado);
    
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleado(DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO);
    
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleadoBis(DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO);
        
    public DatosConceptoEmpleadoDTO detalleConceptoEmpleadoActualizacion (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO);
    
    public DatosConceptoEmpleadoDTO detalleConceptosTipoO(String idTipoCpto, String idConcepto, String rfcEmpleado);
        
    public void eliminaConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    public Map<String, Object> colsultaTcCptsPagoCaptOpcRdbuttons(String idTipoCpto, String idCptoPago);
    
    public List<Integer> getQnaInicial();
    
    public void agregarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    public void agregarConceptoEmpleadoPAX(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    public void actualizarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    public void adeudoSaveConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    public MovtoConceptoPagoDTO detalleConceptoDelEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO);
    
    GestionFonacDTO getFonac(String rfcEmpleado);
    
    void updateFonac(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, Boolean hasFonac);
    
    ActualizaErarioFedDTO getErarioFed(String rfcEmpleado);
    
    void updateErarioFed(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, String rfcEmpleado, Boolean hasErario);
   
}
