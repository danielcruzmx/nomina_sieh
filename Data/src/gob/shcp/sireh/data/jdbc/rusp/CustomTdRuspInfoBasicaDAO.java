package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.rusp.Rusp;

public interface CustomTdRuspInfoBasicaDAO extends DataService {
    public void procesarBajasRusp(Rusp rusp);
    public void procesarInformacionBasicaRusp(Rusp rusp);
    public void procesarDatosPersonalesRusp(Rusp rusp);
}
