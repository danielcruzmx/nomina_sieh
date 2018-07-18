package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.sireh.data.jdbc.TnCxlcCanceladosDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcErrorDAO;

import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TnCxlcCanceladoPK;
import gob.shcp.sireh.domain.jdbc.TnCxlcCancelados;

import gob.shcp.sireh.model.clc.proceso.ClcPatronalesAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesDTO;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Business Service encargado de atender solicitudes correspondientes a CLC de Terceros Patronales.
 */
public class ClcPatronalesBS extends AbstractSirehService implements ClcPatronalesService {
    
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
        List<TdCxlc> listaCxlc = super.persistence().get(CustomTdCxlcDAO.class).existeCLCProcesadaTerceros(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento);
        return !listaCxlc.isEmpty() ? true : false;
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteError(ClcPatronalesDTO clcPatronalesDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcPatronalesDTO.getCiclo(), 
                                        clcPatronalesDTO.getQnaPago(), 
                                        clcPatronalesDTO.getTipoNominaPatronales(), 
                                        String.valueOf(clcPatronalesDTO.getComplemento()));
        return existeError;
    }
    
    /**
     * Patronales - Metodo encargado de ejecutar el stored procedure para generar clc patronales
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @param usuario String
     * @return executeError Integer
     */
    public Integer executeProcedurePatronales(ClcPatronalesDTO clcPatronalesDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcPatronales(
                                        clcPatronalesDTO.getCiclo(), 
                                        clcPatronalesDTO.getNominasCadena(),
                                        clcPatronalesDTO.getQnaPago(), 
                                        clcPatronalesDTO.getTipoNominaPatronales(), 
                                        clcPatronalesDTO.getComplemento(),
                                        clcPatronalesDTO.getEstado(),
                                        clcPatronalesDTO.getReproceso(),
                                        usuario);
        return executeError;
    }
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param clcPatronalesDTO ClcPatronalesDTO
     */
    public void marcaRevisadoExisteError(ClcPatronalesDTO clcPatronalesDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcPatronalesDTO.getCiclo(),
                                clcPatronalesDTO.getQnaPago(), 
                                clcPatronalesDTO.getTipoNominaPatronales(), 
                                String.valueOf(clcPatronalesDTO.getComplemento()));
    }
    
    /**
     * Patronales - Metodo encargado de obtener la(s) guia(s) contable(s) con base en el idTipoNomina.
     * @author Oscar S.
     * @param idTipoNomina String
     * @return guiaContable String
     */
    public String guiaContableByTipoNominaPatronales(String idTipoNomina) {
        List<String> guiaContable = super.persistence().get(CustomTdCxlcDAO.class).guiaContableByTipoNominaTerceros(idTipoNomina);
        return guiaContable.size() > 0 ? guiaContable.get(0) : "";
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
        List<TdCxlc> cxlcReproceso = super.persistence().get(CustomTdCxlcDAO.class).getClcPatronalReproceso(ciclo, qnaPago, tipoNomina, complemento);
        return cxlcReproceso.size() > 0 ? cxlcReproceso.get(0).getCxlc() : 0;
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcPatronalesAjustesDTO.getCiclo(), 
                                        clcPatronalesAjustesDTO.getQuincena(), 
                                        clcPatronalesAjustesDTO.getTipoNominaPatronales(), 
                                        String.valueOf(clcPatronalesAjustesDTO.getComplemento()));
        return existeError;
    }
    
    /**
     * Patronales - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @param usuario String
     * @return existeError Integer
     */
    public Integer executeProcedurePatronalesAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcTercerosAjustes(
                                        clcPatronalesAjustesDTO.getCiclo(), 
                                        clcPatronalesAjustesDTO.getSigno(),
                                        clcPatronalesAjustesDTO.getImporteAjuste(),
                                        clcPatronalesAjustesDTO.getClcAjuste(),
                                        clcPatronalesAjustesDTO.getClcCompensada(),
                                        usuario);
        return executeError;
    }
    
    /**
     * Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     */
    public void marcaRevisadoExisteErrorAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcPatronalesAjustesDTO.getCiclo(),
                                clcPatronalesAjustesDTO.getQuincena(), 
                                clcPatronalesAjustesDTO.getTipoNominaPatronales(), 
                                String.valueOf(clcPatronalesAjustesDTO.getComplemento()));
    }
    
    /**
     * Patronales  - Metodo encargado de verificar si existen errores en las clc con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return existeError Integer
     */
    public Integer executeProcedureExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        Integer existeError = super.persistence()
                                   .get(CustomTdCxlcDAO.class)
                                   .executeSPExisteError(
                                        clcPatronalesCanceladosDTO.getCiclo(), 
                                        clcPatronalesCanceladosDTO.getQnaCancelacion(), 
                                        clcPatronalesCanceladosDTO.getTipoNominaPatronales(), 
                                        String.valueOf(clcPatronalesCanceladosDTO.getComplemento()));
        return existeError;
    }

    public boolean existeTnCxlcCancelado(Integer cxclCancelacion, Integer ciclo, Integer difFolio, Long folio, Integer guiaContable, String idCptoPago, String idTipoCpto) {
        TnCxlcCanceladoPK pk  = new TnCxlcCanceladoPK();
        pk.setCxlc(cxclCancelacion);
        pk.setCxlccCiclo(ciclo);
        pk.setCxlccDifFolio(difFolio);
        pk.setCxlccFolio(folio);
        pk.setCxlccGuiaCont(guiaContable);
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

    public void saveAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        TnCxlcCancelados tnCxlcCancelado  = null;
        
        for(TnCxlcCanceladoDTO tnCxlcCanceladosDTO : cancelados) {
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

    public Integer executeProcedurePatronalesCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO, String usuario) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPClcTercerosCancelados(
                                        clcPatronalesCanceladosDTO.getCiclo(), 
                                        clcPatronalesCanceladosDTO.getClcCancelacion(),
                                        usuario);
        return executeError;
    }

    public void marcaRevisadoExisteErrorCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        super.persistence().get(CustomTdCxlcErrorDAO.class)
                           .marcaRevisadoExisteError(
                                clcPatronalesCanceladosDTO.getCiclo(),
                                clcPatronalesCanceladosDTO.getQnaCancelacion(), 
                                clcPatronalesCanceladosDTO.getTipoNominaPatronales(), 
                                String.valueOf(clcPatronalesCanceladosDTO.getComplemento()));
    }

    public void deleteAplicaCancelados(Set<TnCxlcCanceladoDTO> cancelados, String usuario) {
        for (TnCxlcCanceladoDTO tnCxlcCanceladosDTO: cancelados) {
            super.persistence().get(TnCxlcCanceladosDAO.class).delete(super.transformation().map(tnCxlcCanceladosDTO, TnCxlcCancelados.class));
        }
    }
}
