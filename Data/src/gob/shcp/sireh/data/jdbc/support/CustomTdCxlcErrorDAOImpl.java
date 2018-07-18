package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;

public class CustomTdCxlcErrorDAOImpl extends JdbcDAO implements CustomTdCxlcErrorDAO {
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     */
    public void marcaRevisadoExisteError(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento) {
        super.executeByNamedQuery("marcaRevisadoExisteError", cicloUnidad, quincenaPago, tipoNomina, complemento); 
    }
}
