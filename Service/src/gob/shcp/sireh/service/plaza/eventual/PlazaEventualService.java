package gob.shcp.sireh.service.plaza.eventual;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.plaza.eventual.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.eventual.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaContratoDTO;

import javax.ejb.Local;

@Local
public interface PlazaEventualService extends BusinessService {

    /** 
    * Metodo encargado de Crear Plazas.
    * @author Oscar S.
    * @param creacionPlazaDTO CreacionPlazaDTO
    * @param usuario String
    * @return nuevoIdPlaza String
    */
    String createPlaza(CreacionPlazaDTO creacionPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener los datos de la Plaza a liberar con base en su id.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    LiberaPlazaDTO getLiberaPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @author Oscar S.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Situación.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioSitPlazaDTO CambioSitPlazaDTO
     */
    CambioSitPlazaDTO getCambioSitPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar la situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @param usuario String
     */
    void updateCambioSitPlazaPlaza(CambioSitPlazaDTO cambioSitPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Puesto Fisico.
     * @param idPlaza Integer
     * @return cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     */
    CambioPtoFisicoPlazaDTO getCambioPtoFisicoPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar el Puesto Fisico de la Plaza con base en el objeto CambioPtoFisicoPlazaDTO.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @param usuario String
     */
    void updateCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @author Oscar S.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return boolean
     */
    boolean verificaCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     */
    CambioURFisicaPlazaDTO getCambioURFisicaPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto CambioURFisicaPlazaDTO.
     * @author Oscar S.
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @param usuario String
     */
    void updateCambioURFisicaPlaza(CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de eliminar Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    void depuraPlazas(Integer[] idPlazas, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga de Contrato.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaContratoDTO ProrrogaContratoDTO
     */
    ProrrogaContratoDTO getProrrogaContrato(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar la Prorroga de Contrato de la Plaza con base en el objeto ProrrogaContratoDTO.
     * @author Oscar S.
     * @param prorrogaContratoDTO ProrrogaContratoDTO
     * @param usuario String
     */
    void updateProrrogaContrato(ProrrogaContratoDTO prorrogaContratoDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar el Tipo de SP.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaTipoSPDTO ModificaTipoSPDTO
     */
    ModificaTipoSPDTO getModificaTipoSP(Integer idPlaza);
    
    /**
     * Metodo encargado de modificar el Tipo de SP de la Plaza con base en el objeto modificaTipoSPDTO.
     * @author Oscar S.
     * @param modificaTipoSPDTO ModificaTipoSPDTO
     * @param usuario String
     */
    void updateModificaTipoSP(ModificaTipoSPDTO modificaTipoSPDTO, String usuario);
}
