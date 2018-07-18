package gob.shcp.sireh.service.plaza.eventual;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.plaza.eventual.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaContratoDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Plazas de tipo Eventual.
 */
@Stateless(name="PlazaEventual")
@Local({PlazaEventualService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaEventualBean extends AbstractBean implements PlazaEventualService {
    
    /** 
    * Metodo encargado de Crear Plazas.
    * @author Oscar S.
    * @param creacionPlazaDTO CreacionPlazaDTO
    * @param usuario String
    * @return nuevoIdPlaza String
    */
    public String createPlaza(CreacionPlazaDTO creacionPlazaDTO, String usuario) {
        return super.getService(PlazaEventualService.class).createPlaza(creacionPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener los datos de la Plaza a liberar con base en su id.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    public LiberaPlazaDTO getLiberaPlaza(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getLiberaPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @author Oscar S.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    public void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateLiberaPlaza(liberaPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Situación.
     * @param idPlaza Integer
     * @return cambioSitPlazaDTO CambioSitPlazaDTO
     */
    public CambioSitPlazaDTO getCambioSitPlaza(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getCambioSitPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @author Oscar S.
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @param usuario String
     */
    public void updateCambioSitPlazaPlaza(CambioSitPlazaDTO cambioSitPlazaDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Puesto Fisico.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     */
    public CambioPtoFisicoPlazaDTO getCambioPtoFisicoPlaza(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getCambioPtoFisicoPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar el Pusto Fisico de la Plaza con base en el objeto CambioPtoFisicoPlazaDTO.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @param usuario String
     */
    public void updateCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return boolean
     */
    public boolean verificaCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO) {
        return super.getService(PlazaEventualService.class).verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     */
    public CambioURFisicaPlazaDTO getCambioURFisicaPlaza(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getCambioURFisicaPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto CambioURFisicaPlazaDTO.
     * @author Oscar S.
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @param usuario String
     */
    public void updateCambioURFisicaPlaza(CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateCambioURFisicaPlaza(cambioURFisicaPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de eliminar Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    public void depuraPlazas(Integer[] idPlazas, String usuario) {
        super.getService(PlazaEventualService.class).depuraPlazas(idPlazas, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga de Contrato.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaContratoDTO ProrrogaContratoDTO
     */
    public ProrrogaContratoDTO getProrrogaContrato(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getProrrogaContrato(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la Prorroga de Contrato de la Plaza con base en el objeto ProrrogaContratoDTO.
     * @author Oscar S.
     * @param prorrogaContratoDTO ProrrogaContratoDTO
     * @param usuario String
     */
    public void updateProrrogaContrato(ProrrogaContratoDTO prorrogaContratoDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateProrrogaContrato(prorrogaContratoDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar el Tipo de SP.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaTipoSPDTO ModificaTipoSPDTO
     */
    public ModificaTipoSPDTO getModificaTipoSP(Integer idPlaza) {
        return super.getService(PlazaEventualService.class).getModificaTipoSP(idPlaza);
    }
    
    /**
     * Metodo encargado de modificar el Tipo de SP de la Plaza con base en el objeto modificaTipoSPDTO.
     * @author Oscar S.
     * @param modificaTipoSPDTO ModificaTipoSPDTO
     * @param usuario String
     */
    public void updateModificaTipoSP(ModificaTipoSPDTO modificaTipoSPDTO, String usuario) {
        super.getService(PlazaEventualService.class).updateModificaTipoSP(modificaTipoSPDTO, usuario);
    }
}
