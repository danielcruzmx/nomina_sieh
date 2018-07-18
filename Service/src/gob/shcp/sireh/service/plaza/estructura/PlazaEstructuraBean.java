package gob.shcp.sireh.service.plaza.estructura;

import gob.shcp.fsn.service.AbstractBean;


import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.plaza.estructura.AsignaPlazaSoporteDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioPtoFisicoPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioSitPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.CambioURFisicaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.DenominacionFuncionalDTO;
import gob.shcp.sireh.model.plaza.estructura.LiberaPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaDatosPresupuestalesDTO;
import gob.shcp.sireh.model.plaza.estructura.ModificaTipoSPDTO;
import gob.shcp.sireh.model.plaza.estructura.ObservacionesPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.PlazaEnConcursoDTO;
import gob.shcp.sireh.model.plaza.estructura.PromocionPermutaDTO;
import gob.shcp.sireh.model.plaza.estructura.ProrrogaArt34DTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Plazas de tipo Estructura.
 */
@Stateless(name="PlazaEstructura")
@Local({PlazaEstructuraService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaEstructuraBean extends AbstractBean implements PlazaEstructuraService {
    
    /**
     * Metodo encargado de obtener los datos de la Plaza a liberar con base en su id.
     * @param idPlaza Integer
     * @return liberaPlazaDTO LiberaPlazaDTO
     */
    public LiberaPlazaDTO getLiberaPlaza(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getLiberaPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de liberar una Plaza con base en el objeto liberaPlazaDTO.
     * @param liberaPlazaDTO LiberaPlazaDTO
     * @param usuario String
     */
    public void updateLiberaPlaza(LiberaPlazaDTO liberaPlazaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateLiberaPlaza(liberaPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Situación.
     * @param idPlaza Integer
     * @return cambioSitPlazaDTO CambioSitPlazaDTO
     */
    public CambioSitPlazaDTO getCambioSitPlaza(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getCambioSitPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la situación de la Plaza con base en el objeto CambioSitPlazaDTO.
     * @param cambioSitPlazaDTO CambioSitPlazaDTO
     * @param usuario String
     */
    public void updateCambioSitPlazaPlaza(CambioSitPlazaDTO cambioSitPlazaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateCambioSitPlazaPlaza(cambioSitPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id e la Plaza para su Cambio de Puesto Fisico.
     * @param idPlaza Integer
     * @return cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     */
    public CambioPtoFisicoPlazaDTO getCambioPtoFisicoPlaza(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getCambioPtoFisicoPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar el Pusto Fisico de la Plaza con base en el objeto CambioPtoFisicoPlazaDTO.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @param usuario String
     */
    public void updateCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return boolean
     */
    public boolean verificaCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO) {
        return super.getService(PlazaEstructuraService.class).verificaCambioPtoFisicoPlaza(cambioPtoFisicoPlazaDTO);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @param idPlaza Integer
     * @return cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     */
    public CambioURFisicaPlazaDTO getCambioURFisicaPlaza(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getCambioURFisicaPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto CambioURFisicaPlazaDTO.
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @param usuario String
     */
    public void updateCambioURFisicaPlaza(CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateCambioURFisicaPlaza(cambioURFisicaPlazaDTO, usuario);
    }
    /**
     * Metodo encargado de obtener el id de la Plaza para Asignar Plaza Soporte.
     * @param idPlaza Integer
     * @return asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     */
    public AsignaPlazaSoporteDTO getAsignaPlazaSoporte(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getAsignaPlazaSoporte(idPlaza);
    }
    
    /**
     * Metodo encargado de Asignar Plaza Soporte a una Plaza Eventual con base en el objeto asignaPlazaSoporteDTO.
     * @author Oscar S.
     * @param asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     * @param usuario String
     */
    public void updateAsignaPlazaSoporte(AsignaPlazaSoporteDTO asignaPlazaSoporteDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateAsignaPlazaSoporte(asignaPlazaSoporteDTO, usuario);
    }
    
    /**
     * Metodo encargado de eliminar Plaza Soporte a Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    public void eliminaPlazaSoporte(Integer[] idPlazas, String usuario) {
        super.getService(PlazaEstructuraService.class).eliminaPlazaSoporte(idPlazas, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar el Tipo de SP.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return modificaTipoSPDTO ModificaTipoSPDTO
     */
    public ModificaTipoSPDTO getModificaTipoSP(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getModificaTipoSP(idPlaza);
    }
    
    /**
     * Metodo encargado de modificar el Tipo de SP de la Plaza con base en el objeto modificaTipoSPDTO.
     * @author Oscar S.
     * @param modificaTipoSPDTO ModificaTipoSPDTO
     * @param usuario String
     */
    public void updateModificaTipoSP(ModificaTipoSPDTO modificaTipoSPDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateModificaTipoSP(modificaTipoSPDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar Denominación Funcional.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return denominacionFuncionalDTO DenominacionFuncionalDTO
     */
    public DenominacionFuncionalDTO getModificaDenominacionFuncional(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getModificaDenominacionFuncional(idPlaza);
    }
    
    /**
     * Metodo encargado de modificar Denominación Funcional de la Plaza con base en el objeto denominacionFuncionalDTO.
     * @author Oscar S.
     * @param denominacionFuncionalDTO DenominacionFuncionalDTO
     * @param usuario String
     */
    public void updateModificaDenominacionFuncional(DenominacionFuncionalDTO denominacionFuncionalDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateModificaDenominacionFuncional(denominacionFuncionalDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar Observaciones.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return observacionesPlazaDTO ObservacionesPlazaDTO
     */
    public ObservacionesPlazaDTO getModificaObservacionesPlaza(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getModificaObservacionesPlaza(idPlaza);
    }
    
    /**
     * Metodo encargado de modificar Observaciones de la Plaza con base en el objeto observacionesPlazaDTO.
     * @author Oscar S.
     * @param observacionesPlazaDTO ObservacionesPlazaDTO
     * @param usuario String
     */
    public void updateObservacionesPlaza(ObservacionesPlazaDTO observacionesPlazaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateObservacionesPlaza(observacionesPlazaDTO, usuario);
    }
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga Art.34.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaArt34DTO ProrrogaArt34DTO
     */
    public ProrrogaArt34DTO getProrrogaArt34(Integer idPlaza) {
        return super.getService(PlazaEstructuraService.class).getProrrogaArt34(idPlaza);
    }
    
    /**
     * Metodo encargado de modificar Prorroga Art.34 de la Plaza con base en el objeto prorrogaArt34DTO.
     * @author Oscar S.
     * @param prorrogaArt34DTO ProrrogaArt34DTO
     * @param usuario String
     */
    public void updateProrrogaArt34(ProrrogaArt34DTO prorrogaArt34DTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateProrrogaArt34(prorrogaArt34DTO, usuario);
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Presupuestales de dos Plaza con base en el objeto modificaDatosPresupuestalesDTO.
     * @author Oscar S.
     * @param modificaDatosPresupuestalesDTO ModificaDatosPresupuestalesDTO
     * @param usuario String
     */
    public void updateIntercambioDatosPresupuestales(ModificaDatosPresupuestalesDTO modificaDatosPresupuestalesDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updateIntercambioDatosPresupuestales(modificaDatosPresupuestalesDTO, usuario);
    }
    
    /**
     * Metodo encargado de Intercambiar Datos Nomina de dos Plaza con base en el objeto promocionPermutaDTO.
     * @author Oscar S.
     * @param promocionPermutaDTO PromocionPermutaDTO
     * @param usuario String
     */
    public void updatePromocionPermuta(PromocionPermutaDTO promocionPermutaDTO, String usuario) {
        super.getService(PlazaEstructuraService.class).updatePromocionPermuta(promocionPermutaDTO, usuario);
    }

    public List<ItemDTO> findPuestoVacanciaByIdPtoOrigenPtoExcepcion(String idPtoOrigen, Integer ptoExcepcion) {
        return super.getService(PlazaEstructuraService.class).findPuestoVacanciaByIdPtoOrigenPtoExcepcion(idPtoOrigen, ptoExcepcion);
    }
    public String getTcVacanciaById(Integer idVacancia){
        return super.getService(PlazaEstructuraService.class).getTcVacanciaById(idVacancia);
    }
    
    public PlazaEnConcursoDTO getPlazaEnConsurso(Integer idPlaza){
        return super.getService(PlazaEstructuraService.class).getPlazaEnConsurso(idPlaza);
    }
    
    public void updatePlazaEnConcurso(PlazaEnConcursoDTO plazaEnConcursoDTO, String movimiento){
        super.getService(PlazaEstructuraService.class).updatePlazaEnConcurso(plazaEnConcursoDTO, movimiento);
    }
    
    public PlazaEnConcursoDTO findPlazaConcursoById(PlazaEnConcursoDTO plazaEnConcursoDTO){
        return super.getService(PlazaEstructuraService.class).findPlazaConcursoById(plazaEnConcursoDTO);
    }
}
