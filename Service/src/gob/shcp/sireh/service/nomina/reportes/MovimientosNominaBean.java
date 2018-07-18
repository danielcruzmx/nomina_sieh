package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.reportes.CustomAltasBajasSFPDTO;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name="MovimientosNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class MovimientosNominaBean extends AbstractBean implements MovimientosNominaService {

    public String getObservacionesDeMovimientoEmpPla(Integer id) {
        return super.getService(MovimientosNominaService.class).getObservacionesDeMovimientoEmpPla(id);
    }
    
    public void updateObservacionesDeMovimientoEmpPla( Integer id, String observaciones ) {
        super.getService(MovimientosNominaService.class).updateObservacionesDeMovimientoEmpPla(id,observaciones);
    }
    
    public List<CustomAltasBajasSFPDTO> getAltasBajasSFP(String quincena) {
        return super.getService(MovimientosNominaService.class).getAltasBajasSFP(quincena);
    }
}
