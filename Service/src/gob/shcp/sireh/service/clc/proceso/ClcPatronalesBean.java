package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.clc.proceso.ClcPatronalesAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesDTO;

import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import java.util.List;

import java.util.Set;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a CLC de Patronales.
 */
@Stateless(name = "ClcPatronales")
@Local( { ClcPatronalesService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcPatronalesBean extends AbstractBean implements ClcPatronalesService {
    /**
     * Patronales - Metodo encargado de verificar si existe un clc procesada.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @return boolean
     */
    public Boolean existeCLCProcesadaPatronales(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento) {
        return super.getService(ClcPatronalesService.class).existeCLCProcesadaPatronales(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento);
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcPatronalesDTO clcPatronalesDTO) {
        return super.getService(ClcPatronalesService.class).executeProcedureExisteError(clcPatronalesDTO);
    }
    
    /**
     * Patronales - Metodo encargado de ejecutar el stored procedure para generar clc patronales.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedurePatronales(ClcPatronalesDTO clcPatronalesDTO, String usuario) {
        return super.getService(ClcPatronalesService.class).executeProcedurePatronales(clcPatronalesDTO, usuario);
    }
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     */
    public void marcaRevisadoExisteError(ClcPatronalesDTO clcPatronalesDTO) {
        super.getService(ClcPatronalesService.class).marcaRevisadoExisteError(clcPatronalesDTO);
    }
    
    /**
     * Patronales - Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    public String guiaContableByTipoNominaPatronales(String idTipoNomina) {
        return super.getService(ClcPatronalesService.class).guiaContableByTipoNominaPatronales(idTipoNomina);
    }
    
    /**
     * Procesa Patronales - Metodo encargado de obtener la clc a reprocesar.
     * @author Oscar S.
     * @param ciclo Integer
     * @param qnaPago Integer
     * @param tipoNomina String
     * @param complemento Integer
     * @return Integer
     */
    public Integer getClcPatronalReproceso(Integer ciclo, Integer qnaPago, String tipoNomina, Integer complemento) {
        return super.getService(ClcPatronalesService.class).getClcPatronalReproceso(ciclo, qnaPago, tipoNomina, complemento);
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        return super.getService(ClcPatronalesService.class).executeProcedureExisteErrorAjustes(clcPatronalesAjustesDTO);
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    public Integer executeProcedurePatronalesAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO, String usuario) {
        return super.getService(ClcPatronalesService.class).executeProcedurePatronalesAjustes(clcPatronalesAjustesDTO, usuario);
    }
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     */
    public void marcaRevisadoExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        super.getService(ClcPatronalesService.class).marcaRevisadoExisteErrorAjustes(clcPatronalesAjustesDTO);
    }
    
    /**
     * Patronales  - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        return super.getService(ClcPatronalesService.class).executeProcedureExisteErrorCancelados(clcPatronalesCanceladosDTO);
    }

    public boolean existeTnCxlcCancelado(Integer cxclCancelacion, Integer ciclo, Integer difFolio, Long folio, Integer guiaContable, String idCptoPago, String idTipoCpto) {
        return super.getService(ClcPatronalesService.class).existeTnCxlcCancelado(cxclCancelacion, ciclo, difFolio, folio, guiaContable, idCptoPago, idTipoCpto);
    }

    public void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        super.getService(ClcPatronalesService.class).saveAplicaCancelados(cancelados, usuario);
    }
    
    public void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        super.getService(ClcPatronalesService.class).deleteAplicaCancelados(cancelados, usuario);
    }

    public Integer executeProcedurePatronalesCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO, String usuario) {
        return super.getService(ClcPatronalesService.class).executeProcedurePatronalesCancelados(clcPatronalesCanceladosDTO, usuario);
    }

    public void marcaRevisadoExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        super.getService(ClcPatronalesService.class).marcaRevisadoExisteErrorCancelados(clcPatronalesCanceladosDTO);
    }
}
