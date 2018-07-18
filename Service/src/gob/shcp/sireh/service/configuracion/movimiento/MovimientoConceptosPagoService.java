package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoConceptoPagoDTO;

import javax.ejb.Local;

@Local
public interface MovimientoConceptosPagoService
    extends BusinessService{
    
    public MovimientoConceptoPagoDTO getMovimientoConceptosPago(String idTipoCpto, String idCptoPago );
    public void updateMovimientoConceptosPago( MovimientoConceptoPagoDTO movimientoConceptoPagoDTO, String usuario, boolean isNew );
    
}
