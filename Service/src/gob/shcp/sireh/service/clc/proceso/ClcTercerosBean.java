package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosDTO;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a CLC de Terceros.
 */
@Stateless(name = "ClcTerceros")
@Local( { ClcTercerosService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcTercerosBean extends AbstractBean implements ClcTercerosService {

    /**
     * Metodo encargado de obtener el monto total de las clc seleccionadas con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcTerceros List<Integer>
     * @param tipoNominaTerceros String
     * @return montoTotal BigDecimal
     */
    public BigDecimal calculaMontoTotalTerceros(Integer ciclo, List<Integer> cxlcTerceros, String tipoNominaTerceros) {
        return super.getService(ClcTercerosService.class).calculaMontoTotalTerceros(ciclo, cxlcTerceros, tipoNominaTerceros);
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para procesar clc de terceros.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedureTerceros(ClcTercerosDTO clcTercerosDTO, String usuario) {
        return super.getService(ClcTercerosService.class).executeProcedureTerceros(clcTercerosDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    public String guiaContableByTipoNominaTerceros(String idTipoNomina) {
        return super.getService(ClcTercerosService.class).guiaContableByTipoNominaTerceros(idTipoNomina);
    }
    
    /**
     * Metodo encargado de verificar si existe un clc procesada.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @return boolean
     */
    public Boolean existeCLCProcesadaTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento) {
        return super.getService(ClcTercerosService.class).existeCLCProcesadaTerceros(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento);
    }
    
    /**
     * Metodo encargado de obtener el numero de clc terceros con base en las clc seleccionadas.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param tipoNominaTerceros String
     * @param cxlcTerceros List<Integer>
     * @return clcTerceros Integer
     */
    public Integer getClcTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String tipoNominaTerceros, List<Integer> cxlcTerceros) {
        return super.getService(ClcTercerosService.class).getClcTerceros(cxlcCiclo, cxlcQnaPago, tipoNominaTerceros, cxlcTerceros);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcTercerosDTO clcTercerosDTO) {
        return super.getService(ClcTercerosService.class).executeProcedureExisteError(clcTercerosDTO);
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     */
    public void marcaRevisadoExisteError(ClcTercerosDTO clcTercerosDTO) {
        super.getService(ClcTercerosService.class).marcaRevisadoExisteError(clcTercerosDTO);
    }
    
    /**
     * Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago List<Integer>
     * @param idTipoNomina String
     * @param secGuiaContableEjer List<Integer>
     * @return listaCxlc List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> consultaTdCxlcProcesoTerceros(Integer cxlcCiclo, List<Integer> cxlcQnaPago, String idTipoNomina, List<Integer> secGuiaContableEjer) {
        return super.getService(ClcTercerosService.class).consultaTdCxlcProcesoTerceros(cxlcCiclo, cxlcQnaPago, idTipoNomina, secGuiaContableEjer);
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para cancelación de clc de terceros.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedureTercerosCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO, String usuario) {
        return super.getService(ClcTercerosService.class).executeProcedureTercerosCancelados(clcTercerosCanceladosDTO, usuario);
    }
    
    /**
     * Metodo encargado de insertar los folios seleccionados del grid en la tabla tn_cxlc_cancelados.
     * @author Oscar S.
     * @param cancelados Set<TnCxlcCanceladoDTO> 
     * @param usuario String
     */
    public void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        super.getService(ClcTercerosService.class).saveAplicaCancelados(cancelados, usuario);
    }
    public void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        super.getService(ClcTercerosService.class).deleteAplicaCancelados(cancelados, usuario);
    }

    public Boolean existeTnCxlcCancelado(Integer cxlc, Integer cxlccCiclo, Integer cxlccDifFolio, Long cxlccFolio, Integer cxlccGuiaCont, String idCptoPago, String idTipoCpto) {
        return super.getService(ClcTercerosService.class).existeTnCxlcCancelado(cxlc, cxlccCiclo, cxlccDifFolio, cxlccFolio, cxlccGuiaCont, idCptoPago, idTipoCpto);
    }

    public void insertTnCxlcCancelado(TnCxlcCanceladoDTO cancelado, String usuario) {
        super.getService(ClcTercerosService.class).insertTnCxlcCancelado(cancelado, usuario);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        return super.getService(ClcTercerosService.class).executeProcedureExisteErrorCancelados(clcTercerosCanceladosDTO);
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     */
    public void marcaRevisadoExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        super.getService(ClcTercerosService.class).marcaRevisadoExisteErrorCancelados(clcTercerosCanceladosDTO);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    public Integer executeProcedureTercerosAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO, String usuario) {
        return super.getService(ClcTercerosService.class).executeProcedureTercerosAjustes(clcTercerosAjustesDTO, usuario);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        return super.getService(ClcTercerosService.class).executeProcedureExisteErrorAjustes(clcTercerosAjustesDTO);
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     */
    public void marcaRevisadoExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        super.getService(ClcTercerosService.class).marcaRevisadoExisteErrorAjustes(clcTercerosAjustesDTO);
    }
}
