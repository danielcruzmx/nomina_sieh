package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.domain.jdbc.CustomAltasBajasSFP;

import java.util.List;

public interface QueryTnMovtosEmpPlaDAO extends TnMovtosEmpPlaDAO {

    @FindByNamedQuery(name = "altasBajasSFP", value = CustomAltasBajasSFP.class)
    public List<CustomAltasBajasSFP> getAltasBajasSFP(String quincena);
    
}
