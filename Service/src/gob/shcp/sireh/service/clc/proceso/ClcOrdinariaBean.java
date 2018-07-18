package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.clc.proceso.ClcOrdinariaDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a CLC Ordinarias.
 */
@Stateless(name="ClcOrdinaria")
@Local({ ClcOrdinariaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcOrdinariaBean extends AbstractBean implements ClcOrdinariaService {
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcOrdinariaDTO clcOrdinariaDTO) {
        return super.getService(ClcOrdinariaService.class).executeProcedureExisteError(clcOrdinariaDTO);
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     */
    public void marcaRevisadoExisteError(ClcOrdinariaDTO clcOrdinariaDTO) {
        super.getService(ClcOrdinariaService.class).marcaRevisadoExisteError(clcOrdinariaDTO);
    }
    
    /**
     * Metodo encargado de Procesar CLC Ordinarias con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @param usuario String
     */
    public Integer executeProcedureClcOrdinaria(ClcOrdinariaDTO clcOrdinariaDTO, String usuario) {
        return super.getService(ClcOrdinariaService.class).executeProcedureClcOrdinaria(clcOrdinariaDTO, usuario);
    }
}
