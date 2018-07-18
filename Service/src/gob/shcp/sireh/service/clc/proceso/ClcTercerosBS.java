package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.sireh.data.jdbc.TnCxlcCanceladosDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcErrorDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;

import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TnCxlcCancelados;
import gob.shcp.sireh.domain.jdbc.TnCxlcCanceladoPK;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Business Service encargado de atender solicitudes correspondientes a CLC de Terceros.
 */
public class ClcTercerosBS extends AbstractSirehService implements ClcTercerosService {
    
    /**
     * Metodo encargado de obtener el monto total de las clc seleccionadas con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcTerceros List<Integer>
     * @param tipoNominaTerceros String
     * @return montoTotal BigDecimal
     */
    public BigDecimal calculaMontoTotalTerceros(Integer ciclo, List<Integer> cxlcTerceros, String tipoNominaTerceros) {
        List<BigDecimal> montos = super.persistence().get(CustomTdCxlcDAO.class).calculaMontoTotalTerceros(ciclo, cxlcTerceros, tipoNominaTerceros);
        return montos.get(0);
    }
    
    /**
     * Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    public String guiaContableByTipoNominaTerceros(String idTipoNomina) {
        List<String> guiaContable = super.persistence().get(CustomTdCxlcDAO.class).guiaContableByTipoNominaTerceros(idTipoNomina);
        return guiaContable.size() > 0 ? guiaContable.get(0) : "";
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para procesar clc de terceros.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedureTerceros(ClcTercerosDTO clcTercerosDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcTerceros(
                                        clcTercerosDTO.getCiclo(), 
                                        clcTercerosDTO.getCxlcCadena(),
                                        clcTercerosDTO.getQnaPago(), 
                                        clcTercerosDTO.getTipoNominaTerceros(), 
                                        clcTercerosDTO.getComplemento(),
                                        clcTercerosDTO.getReproceso(),
                                        usuario);
        return executeError;
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
        List<TdCxlc> listaCxlc = super.persistence().get(CustomTdCxlcDAO.class).existeCLCProcesadaTerceros(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento);
        return !listaCxlc.isEmpty() ? true : false;
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
        List<Integer> clcTerceros = super.persistence().get(CustomTdCxlcDAO.class).getClcTerceros(cxlcCiclo, cxlcQnaPago, tipoNominaTerceros, cxlcTerceros);
        return clcTerceros.get(0);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcTercerosDTO clcTercerosDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcTercerosDTO.getCiclo(), 
                                        clcTercerosDTO.getQnaPago(), 
                                        clcTercerosDTO.getTipoNominaTerceros(), 
                                        String.valueOf(clcTercerosDTO.getComplemento()));
        return existeError;
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     */
    public void marcaRevisadoExisteError(ClcTercerosDTO clcTercerosDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcTercerosDTO.getCiclo(),
                                clcTercerosDTO.getQnaPago(), 
                                clcTercerosDTO.getTipoNominaTerceros(), 
                                String.valueOf(clcTercerosDTO.getComplemento()));
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
        List<TdCxlc> tdCxlc = super.persistence().get(CustomTdCxlcDAO.class).consultaTdCxlcProcesoTerceros(cxlcCiclo, cxlcQnaPago, idTipoNomina, secGuiaContableEjer);
        
        return super.transformation().map(tdCxlc, TdCxlcDTO.class);
    }
    
    /**
     * Metodo encargado de ejecutar el stored procedure para cancelación de clc de terceros.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedureTercerosCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcTercerosCancelados(
                                        clcTercerosCanceladosDTO.getCiclo(), 
                                        clcTercerosCanceladosDTO.getClcCancelacion(),
                                        usuario);
        return executeError;
    }
    
    /**
     * Metodo encargado de insertar los folios seleccionados del grid en la tabla tn_cxlc_cancelados.
     * @author Oscar S.
     * @param cancelados Set<TnCxlcCanceladoDTO> 
     * @param usuario String
     */
    public void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        TnCxlcCancelados tnCxlcCancelado  = null;
        
        for (TnCxlcCanceladoDTO tnCxlcCanceladosDTO : cancelados) {
            tnCxlcCancelado = new TnCxlcCancelados();
            
            tnCxlcCancelado.setCxlccCiclo(tnCxlcCanceladosDTO.getCxlccCiclo());
            tnCxlcCancelado.setCxlc(tnCxlcCanceladosDTO.getCxlc());
            tnCxlcCancelado.setCxlccFolio(tnCxlcCanceladosDTO.getCxlccFolio());
            tnCxlcCancelado.setCxlccDifFolio(tnCxlcCanceladosDTO.getCxlccDifFolio());
            tnCxlcCancelado.setIdTipoCpto(tnCxlcCanceladosDTO.getIdTipoCpto());
            tnCxlcCancelado.setIdCptoPago(tnCxlcCanceladosDTO.getIdCptoPago());
            tnCxlcCancelado.setCxlccGuiaCont(tnCxlcCanceladosDTO.getCxlccGuiaCont());
            tnCxlcCancelado.setCxlccMonto(tnCxlcCanceladosDTO.getCxlccMonto());
            tnCxlcCancelado.setCxlccTipoProceso(tnCxlcCanceladosDTO.getCxlccTipoProceso());
            tnCxlcCancelado.setIdUnidad(tnCxlcCanceladosDTO.getIdUnidad());
            tnCxlcCancelado.setCxlccUniAplica(tnCxlcCanceladosDTO.getCxlccUniAplica());
            tnCxlcCancelado.setIdGrupoPago(tnCxlcCanceladosDTO.getIdGrupoPago());
            tnCxlcCancelado.setIdEdo(tnCxlcCanceladosDTO.getIdEdo());
            tnCxlcCancelado.setCxlccEdoAplica(tnCxlcCanceladosDTO.getIdEdo());
            tnCxlcCancelado.setIdTipoNomina(tnCxlcCanceladosDTO.getIdTipoNomina());
            tnCxlcCancelado.setAplicado(tnCxlcCanceladosDTO.getAplicado());
            tnCxlcCancelado.setUsuario(usuario);
            tnCxlcCancelado.setFecModifico(new Date());
            
            super.persistence().get(TnCxlcCanceladosDAO.class).save(tnCxlcCancelado);
        }
    }
    public void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        for (TnCxlcCanceladoDTO tnCxlcCanceladosDTO: cancelados) {
            super.persistence().get(TnCxlcCanceladosDAO.class).delete(super.transformation().map(tnCxlcCanceladosDTO, TnCxlcCancelados.class));
        }
    }

    public Boolean existeTnCxlcCancelado(Integer cxlc, Integer cxlccCiclo, Integer cxlccDifFolio, Long cxlccFolio, Integer cxlccGuiaCont, String idCptoPago, String idTipoCpto) {
        TnCxlcCanceladoPK pk  = new TnCxlcCanceladoPK();
        pk.setCxlc(cxlc);
        pk.setCxlccCiclo(cxlccCiclo);
        pk.setCxlccDifFolio(cxlccDifFolio);
        pk.setCxlccFolio(cxlccFolio);
        pk.setCxlccGuiaCont(cxlccGuiaCont);
        pk.setIdCptoPago(idCptoPago);
        pk.setIdTipoCpto(idTipoCpto);
        
        TnCxlcCancelados tnCxlcCancelado = null;
        try {
            tnCxlcCancelado = super.persistence().get(TnCxlcCanceladosDAO.class).getById(pk);
            
            if (tnCxlcCancelado != null) {
                return true;
            }
        } catch( Exception e) {
            return false;
        }
        return false;
    }

    public void insertTnCxlcCancelado(TnCxlcCanceladoDTO tnCxlcCanceladosDTO, String usuario) {
        TnCxlcCancelados tnCxlcCancelado = new TnCxlcCancelados();
        
        tnCxlcCancelado.setCxlccCiclo(tnCxlcCanceladosDTO.getCxlccCiclo());
        tnCxlcCancelado.setCxlc(tnCxlcCanceladosDTO.getCxlc());
        tnCxlcCancelado.setCxlccFolio(tnCxlcCanceladosDTO.getCxlccFolio());
        tnCxlcCancelado.setCxlccDifFolio(tnCxlcCanceladosDTO.getCxlccDifFolio());
        tnCxlcCancelado.setIdTipoCpto(tnCxlcCanceladosDTO.getIdTipoCpto());
        tnCxlcCancelado.setIdCptoPago(tnCxlcCanceladosDTO.getIdCptoPago());
        tnCxlcCancelado.setCxlccGuiaCont(tnCxlcCanceladosDTO.getCxlccGuiaCont());
        tnCxlcCancelado.setCxlccMonto(tnCxlcCanceladosDTO.getCxlccMonto());
        tnCxlcCancelado.setCxlccTipoProceso(tnCxlcCanceladosDTO.getCxlccTipoProceso());
        tnCxlcCancelado.setIdUnidad(tnCxlcCanceladosDTO.getIdUnidad());
        tnCxlcCancelado.setCxlccUniAplica(tnCxlcCanceladosDTO.getCxlccUniAplica());
        tnCxlcCancelado.setIdGrupoPago(tnCxlcCanceladosDTO.getIdGrupoPago());
        tnCxlcCancelado.setIdEdo(tnCxlcCanceladosDTO.getIdEdo());
        tnCxlcCancelado.setCxlccEdoAplica(tnCxlcCanceladosDTO.getIdEdo());
        tnCxlcCancelado.setIdTipoNomina(tnCxlcCanceladosDTO.getIdTipoNomina());
        tnCxlcCancelado.setAplicado(tnCxlcCanceladosDTO.getAplicado());
        tnCxlcCancelado.setUsuario(usuario);
        tnCxlcCancelado.setFecModifico(new Date());
        
        super.persistence().get(TnCxlcCanceladosDAO.class).save(tnCxlcCancelado);
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcTercerosCanceladosDTO.getCiclo(), 
                                        clcTercerosCanceladosDTO.getQnaCancelacion(), 
                                        clcTercerosCanceladosDTO.getTipoNominaTerceros(), 
                                        String.valueOf(clcTercerosCanceladosDTO.getComplemento()));
        return existeError;
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     */
    public void marcaRevisadoExisteErrorCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcTercerosCanceladosDTO.getCiclo(),
                                clcTercerosCanceladosDTO.getQnaCancelacion(), 
                                clcTercerosCanceladosDTO.getTipoNominaTerceros(), 
                                String.valueOf(clcTercerosCanceladosDTO.getComplemento()));
    }
    
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    public Integer executeProcedureTercerosAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcTercerosAjustes(
                                        clcTercerosAjustesDTO.getCiclo(), 
                                        clcTercerosAjustesDTO.getSigno(),
                                        clcTercerosAjustesDTO.getImporteAjuste(),
                                        clcTercerosAjustesDTO.getClcAjuste(),
                                        clcTercerosAjustesDTO.getClcCompensada(),
                                        usuario);
        return executeError;
    }
    
    /**
     * Metodo encargado de verificar si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcTercerosAjustesDTO.getCiclo(), 
                                        clcTercerosAjustesDTO.getQuincena(), 
                                        clcTercerosAjustesDTO.getTipoNominaTerceros(), 
                                        String.valueOf(clcTercerosAjustesDTO.getComplemento()));
        return existeError;
    }
    
    /**
     * Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     */
    public void marcaRevisadoExisteErrorAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcTercerosAjustesDTO.getCiclo(),
                                clcTercerosAjustesDTO.getQuincena(), 
                                clcTercerosAjustesDTO.getTipoNominaTerceros(), 
                                String.valueOf(clcTercerosAjustesDTO.getComplemento()));
    }
}
