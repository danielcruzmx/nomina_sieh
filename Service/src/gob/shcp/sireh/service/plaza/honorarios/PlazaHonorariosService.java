package gob.shcp.sireh.service.plaza.honorarios;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.plaza.honorarios.ModificaImporteDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaContratoDTO;
import gob.shcp.sireh.model.plaza.honorarios.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.LiberaPlazaDTO;

import javax.ejb.Local;

@Local
public interface PlazaHonorariosService  extends BusinessService {

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
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    LiberaPlazaDTO getLiberaPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Situación.
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
     * Metodo encargado de eliminar Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     * @param observaciones String
     */
    void depuraPlazas(Integer[] idPlazas, String usuario, String observaciones);
    
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
     * Metodo encargado de obtener el id de la Plaza para Modificación de Importe.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaImporteDTO ModificaImporteDTO
     */
    ModificaImporteDTO getModificaImporte(Integer idPlaza);
    
    /**
     * Metodo encargado de Modificar el Importe Honorarios de la Plaza con base en el objeto modificaImporteDTO.
     * @author Oscar S.
     * @param modificaImporteDTO ModificaImporteDTO
     * @param usuario String
     */
    void updateModificaImporte(ModificaImporteDTO modificaImporteDTO, String usuario);
}
