package gob.shcp.sireh.service.plaza.eventual.masivos;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaEventualMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.eventual.PromocionMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ProrrogaMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;


public interface PlazaEventualMasivaService extends BusinessService {
    
    void validarFilePromocion(PromocionMasivaDTO promocionMasivaDTO);
    
    void updateNMPromocion(PromocionMasivaDTO promocionMasivaDTO);
    
    void processCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO);
    
    void updateNMCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO);
    
    ProrrogaMasivaDTO updateNMProrroga(ProrrogaMasivaDTO prorrogaMasivaDTO );
    
    ReduccionContratoMasivaDTO updateNMReduccion(ReduccionContratoMasivaDTO reduccionContratoMasivaDTO);
    
    void processAlta(AltaMasivaDTO altaMasivaDTO);
    
    AltaMasivaDTO updateNMAlta(AltaMasivaDTO altaMasivaDTO);   
    
    void processBaja(PlazaEventualMasivaDTO plazaEventualMasivaDTO);   
    
    PlazaEventualMasivaDTO updateNMBaja(PlazaEventualMasivaDTO plazaEventualMasivaDTO);   
    
    CreacionPlazaMasivaDTO validarFileCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    CreacionPlazaMasivaDTO updateNMCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    
    
}
