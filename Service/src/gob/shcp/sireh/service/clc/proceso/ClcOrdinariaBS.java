package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcErrorDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;

import gob.shcp.sireh.model.clc.proceso.ClcOrdinariaDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.lang.Integer;

/**
 * Business Service encargado de atender solicitudes correspondientes a CLC Ordinarias.
 */
public class ClcOrdinariaBS extends AbstractSirehService implements ClcOrdinariaService {

    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcOrdinariaDTO clcOrdinariaDTO) {
        Integer existeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPExisteError(
                                        clcOrdinariaDTO.getCicloUnidad(), 
                                        clcOrdinariaDTO.getQnaPago(), 
                                        clcOrdinariaDTO.getTipoNomina(), 
                                        clcOrdinariaDTO.getNumComplem());
        return existeError;
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     */
    public void marcaRevisadoExisteError(ClcOrdinariaDTO clcOrdinariaDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcOrdinariaDTO.getCicloUnidad(),
                                clcOrdinariaDTO.getQnaPago(), 
                                clcOrdinariaDTO.getTipoNomina(), 
                                clcOrdinariaDTO.getNumComplem());
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para Procesar CLC Ordinarias.
     * @author Oscar S.
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedureClcOrdinaria(ClcOrdinariaDTO clcOrdinariaDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcOrdinaria(
                                        clcOrdinariaDTO.getCicloUnidad(), 
                                        clcOrdinariaDTO.getQnaPago(), 
                                        clcOrdinariaDTO.getTipoNomina(), 
                                        clcOrdinariaDTO.getNumComplem(),
                                        usuario);
        return executeError;
    }
}
