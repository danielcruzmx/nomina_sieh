package gob.shcp.sireh.service.plaza.estructura;

import gob.shcp.fsn.service.BusinessService;


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

@Local
public interface PlazaEstructuraService extends BusinessService {
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Liberación
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
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Puesto Fisico.
     * @param idPlaza Integer
     * @return cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     */
    CambioPtoFisicoPlazaDTO getCambioPtoFisicoPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar el Puesto Fisico de la Plaza con base en el objeto CambioPtoFisicoPlazaDTO.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @param usuario String
     */
    void updateCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de verificar si un Código de puesto está sobrevaluado.
     * @param cambioPtoFisicoPlazaDTO CambioPtoFisicoPlazaDTO
     * @return boolean
     */
    boolean verificaCambioPtoFisicoPlaza(CambioPtoFisicoPlazaDTO cambioPtoFisicoPlazaDTO);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para su Cambio de Unidad Responsable.
     * @param idPlaza Integer
     * @return cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     */
    CambioURFisicaPlazaDTO getCambioURFisicaPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de cambiar la Unidad Responsable de la Plaza con base en el objeto CambioURFisicaPlazaDTO.
     * @param cambioURFisicaPlazaDTO CambioURFisicaPlazaDTO
     * @param usuario String
     */
    void updateCambioURFisicaPlaza(CambioURFisicaPlazaDTO cambioURFisicaPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Asignar Plaza Soporte.
     * @param idPlaza Integer
     * @return asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     */
    AsignaPlazaSoporteDTO getAsignaPlazaSoporte(Integer idPlaza);
    
    /**
     * Metodo encargado de Asignar Plaza Soporte a una Plaza Eventual con base en el objeto asignaPlazaSoporteDTO.
     * @author Oscar S.
     * @param asignaPlazaSoporteDTO AsignaPlazaSoporteDTO
     * @param usuario String
     */
    void updateAsignaPlazaSoporte(AsignaPlazaSoporteDTO asignaPlazaSoporteDTO, String usuario);
    
    /**
     * Metodo encargado de eliminar Plaza Soporte a Plazas de Tipo Eventual.
     * @author Oscar S.
     * @param idPlazas Integer[]
     * @param usuario String
     */
    void eliminaPlazaSoporte(Integer[] idPlazas, String usuario);
    
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
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar Denominación Funcional.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return denominacionFuncionalDTO DenominacionFuncionalDTO
     */
    DenominacionFuncionalDTO getModificaDenominacionFuncional(Integer idPlaza);
    
    /**
     * Metodo encargado de modificar Denominación Funcional de la Plaza con base en el objeto denominacionFuncionalDTO.
     * @author Oscar S.
     * @param denominacionFuncionalDTO DenominacionFuncionalDTO
     * @param usuario String
     */
    void updateModificaDenominacionFuncional(DenominacionFuncionalDTO denominacionFuncionalDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para modificar Observaciones.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return observacionesPlazaDTO ObservacionesPlazaDTO
     */
    ObservacionesPlazaDTO getModificaObservacionesPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de modificar Observaciones de la Plaza con base en el objeto observacionesPlazaDTO.
     * @author Oscar S.
     * @param observacionesPlazaDTO ObservacionesPlazaDTO
     * @param usuario String
     */
    void updateObservacionesPlaza(ObservacionesPlazaDTO observacionesPlazaDTO, String usuario);
    
    /**
     * Metodo encargado de obtener el id de la Plaza para Prorroga Art.34.
     * @author Oscar S.
     * @param idPlaza Integer
     * @return prorrogaArt34DTO ProrrogaArt34DTO
     */
    ProrrogaArt34DTO getProrrogaArt34(Integer idPlaza);
    
    /**
     * Metodo encargado de modificar Prorroga Art.34 de la Plaza con base en el objeto prorrogaArt34DTO.
     * @author Oscar S.
     * @param prorrogaArt34DTO ProrrogaArt34DTO
     * @param usuario String
     */
    void updateProrrogaArt34(ProrrogaArt34DTO prorrogaArt34DTO, String usuario);
    
    /**
     * Metodo encargado de Intercambiar Datos Presupuestales de dos Plazas con base en el objeto modificaDatosPresupuestalesDTO.
     * @author Oscar S.
     * @param modificaDatosPresupuestalesDTO ModificaDatosPresupuestalesDTO
     * @param usuario String
     */
    void updateIntercambioDatosPresupuestales(ModificaDatosPresupuestalesDTO modificaDatosPresupuestalesDTO, String usuario);
    
    /**
     * Metodo encargado de Intercambiar Datos Nomina de dos Plaza con base en el objeto promocionPermutaDTO.
     * @author Oscar S.
     * @param promocionPermutaDTO PromocionPermutaDTO
     * @param usuario String
     */
    void updatePromocionPermuta(PromocionPermutaDTO promocionPermutaDTO, String usuario);
    
    List<ItemDTO> findPuestoVacanciaByIdPtoOrigenPtoExcepcion(String idPtoOrigen, Integer ptoExcepcion);
    
    String getTcVacanciaById(Integer idVacancia);
    
    PlazaEnConcursoDTO getPlazaEnConsurso(Integer idPlaza);
    
    void updatePlazaEnConcurso(PlazaEnConcursoDTO plazaEnConcursoDTO, String movimiento);
    
    public PlazaEnConcursoDTO findPlazaConcursoById(PlazaEnConcursoDTO plazaEnConcursoDTO);
}
