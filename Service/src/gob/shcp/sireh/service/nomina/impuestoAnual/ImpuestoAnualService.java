package gob.shcp.sireh.service.nomina.impuestoAnual;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.impuestoAnual.AdministracionAnualDTO;
import gob.shcp.sireh.model.nomina.impuestoAnual.NominaAnualDTO;

import java.util.List;

import java.util.Map;

import javax.ejb.Local;

@Local
public interface ImpuestoAnualService extends BusinessService {
    public NominaAnualDTO getNomina( Integer id );
    public void updateNomina(Long idNomina, Integer ciclo);
    public List<Map<Integer, Object>> getRegsAcumPerDedEjFis(AdministracionAnualDTO administracionAnualDTO);
}