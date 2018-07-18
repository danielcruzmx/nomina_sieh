package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.sireh.data.jdbc.QueryTnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnMovtosEmpPlaDAO;
import gob.shcp.sireh.domain.jdbc.CustomAltasBajasSFP;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.model.nomina.reportes.CustomAltasBajasSFPDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import java.util.List;


public class MovimientosNominaBS extends AbstractSirehService implements MovimientosNominaService {

    public String getObservacionesDeMovimientoEmpPla(Integer id) {
        TnMovtosEmpPla tnMovtosEmpPla = super.persistence().get(TnMovtosEmpPlaDAO.class).getById(id);
        return tnMovtosEmpPla.getMepObserva();
    }
    
    public void updateObservacionesDeMovimientoEmpPla( Integer id, String observaciones ) {
        super.persistence().get(CustomTnMovtosEmpPlaDAO.class).updateObservacionesDeMovimientoEmpPla(id,observaciones);
    }
    
    public List<CustomAltasBajasSFPDTO> getAltasBajasSFP(String quincena) {
        List<CustomAltasBajasSFP> customAltasBajasSFPList = super.persistence().get(QueryTnMovtosEmpPlaDAO.class).getAltasBajasSFP(quincena);
        logger.debug("AltasBajasSFPBS -> getAltasBajasSFP -> customAltasBajasSFPList.size() -> " + customAltasBajasSFPList.size());
        return super.transformation().map(customAltasBajasSFPList, CustomAltasBajasSFPDTO.class);
    }
}
