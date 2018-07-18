package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.reportes.CustomAltasBajasSFPDTO;

import java.util.List;

import javax.ejb.Local;


@Local
public interface MovimientosNominaService extends BusinessService {

    public String getObservacionesDeMovimientoEmpPla( Integer id );
    public void updateObservacionesDeMovimientoEmpPla( Integer id, String observaciones );
    
    public List<CustomAltasBajasSFPDTO> getAltasBajasSFP(String quincena);
}
