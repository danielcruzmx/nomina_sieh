package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.TcMovsPersonalDAO;
import gob.shcp.sireh.domain.jdbc.TcMovsPersonal;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;

import java.util.Date;

public class MovimientoPersonalBS  extends AbstractService implements MovimientoPersonalService{

    public MovimientoPersonalDTO getMovimientoPersonal(Integer idMovsPersonal) {
        TcMovsPersonal tcMovsPersonal =  super.persistence().get(TcMovsPersonalDAO.class).getById(idMovsPersonal);
        final MovimientoPersonalDTO movimientoPersonalDTO = super.transformation().map(tcMovsPersonal,MovimientoPersonalDTO.class );
        return movimientoPersonalDTO;
    }

    public void updateMovimientoPersonal(MovimientoPersonalDTO movimientoPersonalDTO, String usuario) {
        TcMovsPersonal tcMovsPersonal = transformToTcMovsPersonal(movimientoPersonalDTO, usuario, new Date());                             
        super.persistence().get(TcMovsPersonalDAO.class).save(tcMovsPersonal);
    }
    
    private TcMovsPersonal transformToTcMovsPersonal(MovimientoPersonalDTO movimientoPersonal, String usuario, Date fecModifico) {
        TcMovsPersonal tcMovsPersonal = new TcMovsPersonal();
        tcMovsPersonal.setIdMovsPersonal(movimientoPersonal.getIdMovsPersonal());
        tcMovsPersonal.setDescMovsPersonal(movimientoPersonal.getDescMovsPersonal());
        tcMovsPersonal.setMpConstancia(movimientoPersonal.getConstancia());
        tcMovsPersonal.setMpTipoMovMenu(movimientoPersonal.getMpTipoMovMenu());
        tcMovsPersonal.setIdSitPlaAnt(movimientoPersonal.getIdSitPlaAnt());
        tcMovsPersonal.setIdSitPlaNva(movimientoPersonal.getIdSitPlaNva());
        tcMovsPersonal.setMpGrupoPago(movimientoPersonal.getMpGrupoPago());
        tcMovsPersonal.setMpJerarquia(movimientoPersonal.getMpJerarquia());
        tcMovsPersonal.setMpNombramiento(movimientoPersonal.getMpNombramiento());
        tcMovsPersonal.setUsuario(usuario);
        tcMovsPersonal.setFecModifico(fecModifico);
        return tcMovsPersonal;
    }
}
