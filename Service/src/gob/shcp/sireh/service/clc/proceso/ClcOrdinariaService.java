package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.proceso.ClcOrdinariaDTO;

import javax.ejb.Local;

@Local
public interface ClcOrdinariaService extends BusinessService {
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteError(ClcOrdinariaDTO clcOrdinariaDTO);
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     */
    void marcaRevisadoExisteError(ClcOrdinariaDTO clcOrdinariaDTO);
    
    /**
     * Metodo encargado de Procesar CLC Ordinarias con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @param usuario String
     * @return Integer
     */
    Integer executeProcedureClcOrdinaria(ClcOrdinariaDTO clcOrdinariaDTO, String usuario);
}