package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;

import java.util.HashMap;
import java.util.List;


public interface CustomTnMovtosEmpPlaDAO extends DataService {

    public void updateObservacionesDeMovimientoEmpPla( Integer id, String observaciones );
    public void saveTnMovtosEmpPla(List<HashMap<String,Object>> listaMapasTnMovtosEmpPla, String usuario);
    public List<TnMovtosEmpPla> findBajasPlazasByUnidadFinContQna(String idGrupoPago, String usuario, Integer mepQnaCaptura, String mepfincont, List<String> listaUnidades, List<String> listaPlazasExcluidas);
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsUnidad( List<Long> listaTnMovtosEmpPla);
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsPuesto( List<Long> listaTnMovtosEmpPla);
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsZonaEconomica( List<Long> listaTnMovtosEmpPla);
    public List<TnMovtosEmpPla> findValidaAltaEventualMasivoVsEstado( List<Long> listaTnMovtosEmpPla);

}
