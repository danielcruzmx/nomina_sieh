package gob.shcp.sireh.service.nomina.impuestoAnual;

import gob.shcp.sireh.data.jdbc.ImpuestoAnualDAO;
import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.support.QueryImpuestoAnualDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.model.nomina.impuestoAnual.AdministracionAnualDTO;
import gob.shcp.sireh.model.nomina.impuestoAnual.NominaAnualDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ImpuestoAnualBS extends AbstractSirehService implements ImpuestoAnualService {
    
    public NominaAnualDTO getNomina(Integer id) {
        TnNomina tnNomina = null;
        try {   tnNomina = super.persistence().get(TnNominaDAO.class).getById(id);   } 
        catch (Exception e) {
            super.throwServiceException(e, "nomina.gestion.get.error", id);
            return null;
        }
        return super.transformation().map(tnNomina, NominaAnualDTO.class);
    }
    
    public void updateNomina(Long idNomina, Integer ciclo){
       super.persistence().get(ImpuestoAnualDAO.class).updateNomina(idNomina, ciclo);
    }
    
    public List<Map<Integer, Object>> getRegsAcumPerDedEjFis(AdministracionAnualDTO administracionAnualDTO){ //String ciclo, String origenDep, String origen, String rfcEmpleado, String unidad
        String filtro = null;
        Integer ciclo = new Integer(administracionAnualDTO.getCiclo());
        
        if(administracionAnualDTO.getOrigen().equalsIgnoreCase("r")){   filtro = "'" + administracionAnualDTO.getRfcEmpleado() + "'";  }
        else{   filtro = administracionAnualDTO.getUnidad();   }
        
        String origenDep = administracionAnualDTO.getOrigenDep().toUpperCase();
        String origen = administracionAnualDTO.getOrigen().toUpperCase();
        
        List<Map<Integer, Object>> lista =  super.persistence().get(ImpuestoAnualDAO.class).getAcumuladoPercepcionesDeducciones(ciclo, origenDep, origen, filtro);
        
        return lista;
        
    }
}