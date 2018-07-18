package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosDTO;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

import javax.ejb.Local;

@Local
public interface ClcTercerosService extends BusinessService {

    /**
     * Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago List<Integer>
     * @param idTipoNomina String
     * @param secGuiaContableEjer List<Integer>
     * @return listaCxlc List<TdCxlcDTO>
     */
    List<TdCxlcDTO> consultaTdCxlcProcesoTerceros(Integer cxlcCiclo, List<Integer> cxlcQnaPago, String idTipoNomina, List<Integer> secGuiaContableEjer);

    /**
     * Metodo encargado de obtener el monto total de las clc seleccionadas con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcTerceros List<Integer>
     * @param tipoNominaTerceros String
     * @return montoTotal BigDecimal
     */
    BigDecimal calculaMontoTotalTerceros(Integer ciclo, List<Integer> cxlcTerceros, String tipoNominaTerceros);

    /**
     * Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    String guiaContableByTipoNominaTerceros(String idTipoNomina);

    /**
     * Metodo encargado de ejecutar el stored procedure para generar clc de terceros.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @param usuario String
     * @return executeError Integer
     */
    Integer executeProcedureTerceros(ClcTercerosDTO clcTercerosDTO, String usuario);

    /**
     * Metodo encargado de verificar si existe un clc procesada.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @return boolean
     */
    Boolean existeCLCProcesadaTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento);

    /**
     * Metodo encargado de obtener el numero de clc terceros con base en las clc seleccionadas.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param tipoNominaTerceros String
     * @param cxlcTerceros List<Integer>
     * @return clcTerceros Integer
     */
    Integer getClcTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String tipoNominaTerceros, List<Integer> cxlcTerceros);

    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteError(ClcTercerosDTO clcTercerosDTO);

    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     */
    void marcaRevisadoExisteError(ClcTercerosDTO clcTercerosDTO);

    /**
     * Metodo encargado de ejecutar el stored procedure para cancelación de clc de terceros.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @param usuario String
     * @return executeError Integer
     */
    Integer executeProcedureTercerosCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO, String usuario);

    /**
     * Metodo encargado de insertar los folios seleccionados del grid en la tabla tn_cxlc_cancelados.
     * @author Oscar S.
     * @param cancelados List<TnCxlcCanceladoDTO> 
     * @param usuario String
     */
    void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario);
    void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario);
    
    Boolean existeTnCxlcCancelado(Integer cxlc, Integer cxlccCiclo, Integer cxlccDifFolio, Long cxlccFolio, Integer cxlccGuiaCont, String idCptoPago, String idTipoCpto);

    void insertTnCxlcCancelado(TnCxlcCanceladoDTO cancelado, String usuario);

    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO);

    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     */
    void marcaRevisadoExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO);

    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    Integer executeProcedureTercerosAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO, String usuario);
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return existeError Integer
     */
    Integer executeProcedureExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO);
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     */
    void marcaRevisadoExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO);
}
