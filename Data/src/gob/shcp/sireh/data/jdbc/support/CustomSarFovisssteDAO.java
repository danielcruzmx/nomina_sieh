package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

public interface CustomSarFovisssteDAO  extends DataService {

    public void procesaSARFOV(String nominas, Integer bimestre);
}
