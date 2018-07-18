package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.DatosConceptoEmpleado;
import gob.shcp.sireh.domain.jdbc.DatosEmpleadoCpto;

import gob.shcp.sireh.domain.jdbc.MovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;

import java.util.Map;


public interface CustomTdCapturaConceptosEmpleadoDAO extends DataService {

    
    public DatosEmpleadoCpto buscarDatosEmpleadoCpto(java.lang.String rfcEmpleado, Map<String, Map<String, String>> dimensions, String operationalYear);
    
    public DatosConceptoEmpleado buscarDetalleConceptoEmpleado(DatosConceptoEmpleado datosConceptoEmpleado);
    
    public DatosConceptoEmpleado buscarDetalleConceptoEmpleadoBis(DatosConceptoEmpleado datosConceptoEmpleado);
        
    public DatosConceptoEmpleado detalleConceptoEmpleadoActualizacion(DatosConceptoEmpleado datosConceptoEmpleado);
    
    public DatosConceptoEmpleado detalleConceptosTipoO(String idTipoCpto, String idConcepto, String rfcEmpleado);
            
    public void eliminaConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto);
    
    public  Map<String, Object> colsultaTcCptsPagoCaptOpcRdbuttons(String idTipoCpto, String idCptoPago);
    
    public void agregarConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto);
    
    public void agregarConceptoEmpleadoPAX(DatosEmpleadoCpto datosEmpleadoCpto);
    
    public void actualizarConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto);
    
    public void adeudoSaveConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto);
    
    public MovtoConceptoPago detalleConceptoDelEmpleado(String idTipoCpto, String  idConcepto, String rfcEmpleado);
    
}
