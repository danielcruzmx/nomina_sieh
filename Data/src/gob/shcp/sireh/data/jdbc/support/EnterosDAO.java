package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.Enteros;
import gob.shcp.sireh.domain.jdbc.Pago;

import java.util.List;
import java.util.Map;

public interface EnterosDAO extends DataService{
    public List<Map> procesoEnteros(String qnaPago, List<String> listaCompl,  List<String> listaDeduccion, List<String> listaPercepcion);
    public List<Enteros> getEnterosReg(String qnaPago, List<String> listaCompl,  List<String> listaDeduccion, List<String> listaPercepcion);
    public List<Enteros> getEnterosTotalDeduccion(String qnaPago, List<String> listaCompl,  List<String> listaDeduccion);
    public List<Enteros>  getEnterosTotalPercepcion(String qnaPago, List<String> listaCompl,  List<String> listaPercepcion);
}
