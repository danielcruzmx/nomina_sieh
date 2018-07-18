package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

public interface CustomTdCxlcErrorDAO extends DataService {
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     */
    void marcaRevisadoExisteError(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento);
}
