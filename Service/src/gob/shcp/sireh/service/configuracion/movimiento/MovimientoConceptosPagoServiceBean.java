package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoConceptoPagoDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="MovimientoConceptosPago")
@Local({MovimientoConceptosPagoService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class MovimientoConceptosPagoServiceBean  extends AbstractBean implements  MovimientoConceptosPagoService {
   
    public MovimientoConceptoPagoDTO getMovimientoConceptosPago( String idTipoCpto, String idCptoPago ) {
        return super.getService(MovimientoConceptosPagoService.class).getMovimientoConceptosPago(idTipoCpto,idCptoPago);
    }

    public void updateMovimientoConceptosPago(MovimientoConceptoPagoDTO movimientoConceptoPagoDTO, 
                                              String usuario, boolean isNew) {
        super.getService(MovimientoConceptosPagoService.class)
            .updateMovimientoConceptosPago( movimientoConceptoPagoDTO, usuario, isNew );
    }
}

