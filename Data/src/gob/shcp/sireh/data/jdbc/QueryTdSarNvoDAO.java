package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;

import java.util.List;

public interface QueryTdSarNvoDAO extends TdSarNvoDAO {

    @FindByNamedQuery(name = "funcAltasSarFOV", value = CustomOutputFile.class)
    List<CustomOutputFile> funcAltasSarFOV();
    
    @FindByNamedQuery(name = "funcBajasSarFOV", value = CustomOutputFile.class)
    List<CustomOutputFile> funcBajasSarFOV();
    
    @FindByNamedQuery(name = "funcCambiosSarFOV", value = CustomOutputFile.class)
    List<CustomOutputFile> funcCambiosSarFOV(Integer paso);
    
    @FindByNamedQuery(name = "funcAnexoSarFOV", value = CustomOutputFile.class)
    List<CustomOutputFile> funcAnexoSarFOV();

    @FindByNamedQuery(name = "funcDetalleSarFOV", value = CustomOutputFile.class)
    List<CustomOutputFile> funcDetalleSarFOV();

}
