package gob.shcp.sireh.service.nomina.impuestoAnual;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.impuestoAnual.AdministracionAnualDTO;
import gob.shcp.sireh.model.nomina.impuestoAnual.NominaAnualDTO;

import java.util.List;

import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name="ImpuestoAnual")
@Local({ImpuestoAnualService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ImpuestoAnualBean extends AbstractBean implements ImpuestoAnualService {
    public NominaAnualDTO getNomina(Integer id) {   return super.getService(ImpuestoAnualService.class).getNomina(id);   }
    public void updateNomina(Long idNomina, Integer ciclo){  super.getService(ImpuestoAnualService.class).updateNomina(idNomina, ciclo);   }
    public List<Map<Integer, Object>> getRegsAcumPerDedEjFis(AdministracionAnualDTO administracionAnualDTO){
        return super.getService(ImpuestoAnualService.class).getRegsAcumPerDedEjFis(administracionAnualDTO);
    }
}