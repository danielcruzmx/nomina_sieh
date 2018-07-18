package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTnNmPlantilla;
import gob.shcp.sireh.domain.jdbc.TnNmPlantilla;

import java.util.List;

public interface QueryTdNmPlantillaDAO extends TnNmPlantillaDAO {
    @FindByNamedQuery(name="selectMeritoActualizaRfcContrArchivo",  value=CustomTnNmPlantilla.class)
    List<CustomTnNmPlantilla> findNotaMeritoRfcaActualizar();
    
    @FindByNamedQuery(name="selectPlantillaMerito",  value=CustomTnNmPlantilla.class)
    List<CustomTnNmPlantilla> findPlantillaMerito(String tn_nmp_id);
}
