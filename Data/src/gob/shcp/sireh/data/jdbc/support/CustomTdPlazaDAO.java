package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTdPlaza;
import gob.shcp.sireh.domain.jdbc.TdPlaza;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


public interface CustomTdPlazaDAO  extends  DataService {
    public void saveTdPlaza(List<HashMap<String,Object>> listaMapasPlazas, String usuario);
    public void updateTdPlazaCompleta(List<HashMap<String, Object>> listaMapasPlazas, String usuario);
    void updateTdPlaza(List<HashMap<String, Object>> listaMapasPlazas, String usuario);
    public void updateTdPlazaMasivaBajaHonorarios(List<HashMap<String, Object>> listaMapasPlazas);
    void updateTdPlazaACancelar(List<HashMap<String, Object>> listaMapasPlazas, String usuario);
    void updateTdPlazaReubicacion(List<HashMap<String, Object>> listaMapasPlazas, String usuario);
    public List<CustomTdPlaza> getPlazasConEstatusCancelada( List<Integer> listaPlazas);
    public List<CustomTdPlaza> getPlazasConEstatusTransferenia( List<Integer> listaPlazas);
    public List<TdPlaza> findBajasPlazasByUnidad(String grupoPago, List<String> listaUnidades, Date plazaFinCont, List<String> listaPlazasExcluidas);
    public List<CustomOutputFile> findTiposNominaHistPagoByUnidadPruaba(List<String> unidades);
    public List<CustomOutputFile> findComplementosByUnidadQnaPago(List<String> unidades, List<String> qnas, List<String> nominas);
}
