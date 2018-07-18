package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.configuracion.movimientos.ConceptoPagoDTO;

import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;

import javax.ejb.Local;


@Local
public interface ConceptoPagoService
    extends BusinessService{
    
    ConceptoPagoDTO getConceptoPago( String idTipoCpto, String idCptoPago );
}
