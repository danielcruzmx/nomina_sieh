package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.proceso.ClcPatronalesAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesDTO;

import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import java.util.List;
import java.util.Set;

public interface ClcPatronalesService extends BusinessService {
    
    /**
     * Patronales - Metodo encargado de verificar si existe un clc procesada.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @return boolean
     */
    Boolean existeCLCProcesadaPatronales(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento);
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteError(ClcPatronalesDTO clcPatronalesDTO);
    
    /**
     * Patronales - Metodo encargado de ejecutar el stored procedure para generar clc patronales.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @param usuario String
     * @return executeError Integer
     */
    Integer executeProcedurePatronales(ClcPatronalesDTO clcPatronalesDTO, String usuario);
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     */
    void marcaRevisadoExisteError(ClcPatronalesDTO clcPatronalesDTO);
    
    /**
     * Patronales - Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    String guiaContableByTipoNominaPatronales(String idTipoNomina);
    
    /**
     * Procesa Patronales - Metodo encargado de obtener la clc a reprocesar.
     * @author Oscar S.
     * @param ciclo Integer
     * @param qnaPago Integer
     * @param tipoNomina String
     * @param complemento Integer
     * @return Integer
     */
    Integer getClcPatronalReproceso(Integer ciclo, Integer qnaPago, String tipoNomina, Integer complemento);
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO);
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    Integer executeProcedurePatronalesAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO, String usuario);
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     */
    void marcaRevisadoExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO);
    
    /**
     * Patronales  - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO);

    boolean existeTnCxlcCancelado(Integer cxclCancelacion, Integer ciclo, Integer difFolio, Long folio, Integer guiaContable, String idCptoPago, String idTipoCpto);

    void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario);
    void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario);
    
    Integer executeProcedurePatronalesCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO, String usuario);

    void marcaRevisadoExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO);

}
