package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;

import javax.ejb.Local;

@Local
public interface MovimientoPersonalService extends BusinessService{
    MovimientoPersonalDTO getMovimientoPersonal(Integer idMovsPersonal);
    void updateMovimientoPersonal(MovimientoPersonalDTO movimientoPersonal, String usuario);
}
