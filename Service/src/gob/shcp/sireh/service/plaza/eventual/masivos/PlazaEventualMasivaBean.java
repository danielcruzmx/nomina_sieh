package gob.shcp.sireh.service.plaza.eventual.masivos;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaEventualMasivaDTO;

import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.eventual.PromocionMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaMasivaDTO;

import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="PlazaEventualMasiva")
@Local({PlazaEventualMasivaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaEventualMasivaBean extends AbstractBean implements PlazaEventualMasivaService{


    public void validarFilePromocion(PromocionMasivaDTO promocionMasivaDTO) {
        super.getService(PlazaEventualMasivaService.class).validarFilePromocion(promocionMasivaDTO);
    }

    public void updateNMPromocion(PromocionMasivaDTO promocionMasivaDTO) {
        super.getService(PlazaEventualMasivaService.class).updateNMPromocion(promocionMasivaDTO);
    }

    public void processBaja(PlazaEventualMasivaDTO plazaEventualMasivaDTO) {
        super.getService(PlazaEventualMasivaService.class).processBaja(plazaEventualMasivaDTO);
    }

    public PlazaEventualMasivaDTO updateNMBaja(PlazaEventualMasivaDTO plazaEventualMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).updateNMBaja(plazaEventualMasivaDTO);
    }

    public CreacionPlazaMasivaDTO validarFileCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).validarFileCreacion(creacionPlazaMasivaDTO) ;
    }

    public CreacionPlazaMasivaDTO updateNMCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).updateNMCreacion(creacionPlazaMasivaDTO);
    }

    public void processAlta(AltaMasivaDTO altaMasivaDTO) {
        super.getService(PlazaEventualMasivaService.class).processAlta(altaMasivaDTO);
    }

    public AltaMasivaDTO updateNMAlta(AltaMasivaDTO altaMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).updateNMAlta(altaMasivaDTO) ;
    }

    public ProrrogaMasivaDTO updateNMProrroga(ProrrogaMasivaDTO prorrogaMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).updateNMProrroga(prorrogaMasivaDTO) ;
    }
    
    public ReduccionContratoMasivaDTO updateNMReduccion(ReduccionContratoMasivaDTO reduccionContratoMasivaDTO) {
        return super.getService(PlazaEventualMasivaService.class).updateNMReduccion(reduccionContratoMasivaDTO);
    }
    
    public void processCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO) {
        super.getService(PlazaEventualMasivaService.class).processCambioAdscripcion(cambioAdscripcionMasivoDTO);
    }

    public void updateNMCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO) {
        super.getService(PlazaEventualMasivaService.class).updateNMCambioAdscripcion(cambioAdscripcionMasivoDTO);
    }



}
