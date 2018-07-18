package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Movimiento de Personal.
 */
@Stateless(name="MovimientoPersonal")
@Local({MovimientoPersonalService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class MovimientoPersonalServiceBean  extends AbstractBean implements  MovimientoPersonalService {
   

    public MovimientoPersonalDTO getMovimientoPersonal(Integer idMovsPersonal) {
        return super.getService(MovimientoPersonalService.class).getMovimientoPersonal(idMovsPersonal);
    }

    public void updateMovimientoPersonal(MovimientoPersonalDTO movimientoPersonal, 
                                         String usuario) {
            super.getService(MovimientoPersonalService.class).updateMovimientoPersonal(movimientoPersonal, usuario);
    }
}
