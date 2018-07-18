package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.domain.jdbc.DatosConceptoEmpleado;

import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.actualizacion.ActualizaErarioFedDTO;
import gob.shcp.sireh.model.nomina.actualizacion.GestionFonacDTO;

import gob.shcp.sireh.model.nomina.conceptos.DatosConceptoEmpleadoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;

import gob.shcp.sireh.model.nomina.conceptos.MovtoConceptoPagoDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="ActualizacionNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class ActualizacionNominaBean extends AbstractBean implements ActualizacionNominaService {
public ActualizacionNominaBean() { 
    }
    
    public DatosEmpleadoCptoDTO buscarDatosEmpleadoCpto(java.lang.String rfcEmpleado){
        return super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
    }
    
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleado (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO) {
        return super.getService(ActualizacionNominaService.class).buscarDetalleConceptoEmpleado(datosConceptoEmpleadoDTO);
    }
    
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleadoBis (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO) {
        return super.getService(ActualizacionNominaService.class).buscarDetalleConceptoEmpleadoBis(datosConceptoEmpleadoDTO);
    }
    
    public DatosConceptoEmpleadoDTO detalleConceptoEmpleadoActualizacion (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO){
        return super.getService(ActualizacionNominaService.class).detalleConceptoEmpleadoActualizacion(datosConceptoEmpleadoDTO);
    }
    
    public DatosConceptoEmpleadoDTO detalleConceptosTipoO(String idTipoCpto, String idConcepto, String rfcEmpleado){
        return super.getService(ActualizacionNominaService.class).detalleConceptosTipoO(idTipoCpto, idConcepto, rfcEmpleado);
    }
    
    public void eliminaConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        super.getService(ActualizacionNominaService.class).eliminaConceptoEmpleado(datosEmpleadoCptoDTO);
    }
    
    public Map<String, Object> colsultaTcCptsPagoCaptOpcRdbuttons(String idTipoCpto, String idCptoPago){
        return super.getService(ActualizacionNominaService.class).colsultaTcCptsPagoCaptOpcRdbuttons(idTipoCpto, idCptoPago);
    }
    
    public List<Integer> getQnaInicial(){
        return super.getService(ActualizacionNominaService.class).getQnaInicial();
    }
    
    public void agregarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        super.getService(ActualizacionNominaService.class).agregarConceptoEmpleado(datosEmpleadoCptoDTO);
    }
    
    public void agregarConceptoEmpleadoPAX(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        super.getService(ActualizacionNominaService.class).agregarConceptoEmpleadoPAX(datosEmpleadoCptoDTO);
    }
    
    public void adeudoSaveConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        super.getService(ActualizacionNominaService.class).adeudoSaveConceptoEmpleado(datosEmpleadoCptoDTO);
    }
    
    public MovtoConceptoPagoDTO detalleConceptoDelEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        return super.getService(ActualizacionNominaService.class).detalleConceptoDelEmpleado(datosEmpleadoCptoDTO);
    }

    public GestionFonacDTO getFonac(String rfcEmpleado) {
        return super.getService(ActualizacionNominaService.class).getFonac(rfcEmpleado);
    }

    public void updateFonac(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, Boolean hasFonac) {
        super.getService(ActualizacionNominaService.class).updateFonac(movtoConceptoPagoDTO, hasFonac);
    }

    public ActualizaErarioFedDTO getErarioFed(String rfcEmpleado) {
        return super.getService(ActualizacionNominaService.class).getErarioFed(rfcEmpleado);
    }

    public void updateErarioFed(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, String rfcEmpleado, Boolean hasErario) {
        super.getService(ActualizacionNominaService.class).updateErarioFed(movtoConceptoPagoDTO, rfcEmpleado, hasErario);
    }
    public void actualizarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        super.getService(ActualizacionNominaService.class).actualizarConceptoEmpleado(datosEmpleadoCptoDTO);
    }
}
