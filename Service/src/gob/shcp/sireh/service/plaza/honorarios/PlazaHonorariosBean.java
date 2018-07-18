package gob.shcp.sireh.service.plaza.honorarios;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.plaza.honorarios.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.CreacionPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.honorarios.ModificaImporteDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaContratoDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Plazas de tipo Honorarios.
 */
@Stateless(name="PlazaHonorarios")
@Local({PlazaHonorariosService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaHonorariosBean extends AbstractBean implements PlazaHonorariosService {

    /** 
    * Metodo encargado de Crear Plazas.
    * @author Oscar S.
    * @param creacionPlazaDTO CreacionPlazaDTO
    * @param usuario String
    * @return nuevoIdPlaza String
    */
    public String createPlaza(CreacionPlazaDTO creacionPlazaDTO, String usuario) {
        return super.getService(PlazaHonorariosService.class).createPlaza(creacionPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener los datos de la Plaza a liberar con base en su id.
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    public LiberaPlazaDTO getLiberaPlaza(Integer idPlaza) {
        return super.getService(PlazaHonorariosService.class).getLiberaPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    public void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario) {
        super.getService(PlazaHonorariosService.class).updateLiberaPlaza(liberaPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Situación.
     * @param idPlaza Integer
     * @return cambioSitPlazaDTO CambioSitPlazaDTO
     */
    public CambioSitPlazaDTO getCambioSitPlaza(Integer idPlaza) {
        return super.getService(PlazaHonorariosService.class).getCambioSitPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @param usuario String
     */
    public void updateCambioSitPlazaPlaza(CambioSitPlazaDTO cambioSitPlazaDTO, String usuario) {
        super.getService(PlazaHonorariosService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de eliminar Plazas de Tipo Honorarios.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     * @param observaciones String
     */
    public void depuraPlazas(Integer[] idPlazas, String usuario, String observaciones) {
        super.getService(PlazaHonorariosService.class).depuraPlazas(idPlazas, usuario, observaciones);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga de Contrato.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaContratoDTO ProrrogaContratoDTO
     */
    public ProrrogaContratoDTO getProrrogaContrato(Integer idPlaza) {
        return super.getService(PlazaHonorariosService.class).getProrrogaContrato(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la Prorroga de Contrato de la Plaza con base en el objeto ProrrogaContratoDTO.
     * @author Oscar S.
     * @param prorrogaContratoDTO ProrrogaContratoDTO
     * @param usuario String
     */
    public void updateProrrogaContrato(ProrrogaContratoDTO prorrogaContratoDTO, String usuario) {
        super.getService(PlazaHonorariosService.class).updateProrrogaContrato(prorrogaContratoDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Modificación de Importe.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaImporteDTO ModificaImporteDTO
     */
    public ModificaImporteDTO getModificaImporte(Integer idPlaza) {
        return super.getService(PlazaHonorariosService.class).getModificaImporte(idPlaza);
    }
    
    /**
     * Metodo encargado de Modificar el Importe Honorarios de la Plaza con base en el objeto modificaImporteDTO.
     * @author Oscar S.
     * @param modificaImporteDTO ModificaImporteDTO
     * @param usuario String
     */
    public void updateModificaImporte(ModificaImporteDTO modificaImporteDTO, String usuario) {
        super.getService(PlazaHonorariosService.class).updateModificaImporte(modificaImporteDTO, usuario);
    }
}
