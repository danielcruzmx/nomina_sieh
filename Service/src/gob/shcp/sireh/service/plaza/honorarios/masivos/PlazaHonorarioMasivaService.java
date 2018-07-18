package gob.shcp.sireh.service.plaza.honorarios.masivos;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaHonorarioMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;

public interface PlazaHonorarioMasivaService  extends BusinessService{

    void processCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO);
    
    void updateNMCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO);

    ProrrogaMasivaDTO updateNMProrroga(ProrrogaMasivaDTO prorrogaMasivaDTO);
    
    ReduccionContratoMasivaDTO updateNMReduccion(ReduccionContratoMasivaDTO reduccionContratoMasivaDTO);

    void processBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO);   

    PlazaHonorarioMasivaDTO updateNMBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO);
    
    CreacionPlazaMasivaDTO validarPMFileCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    CreacionPlazaMasivaDTO updateNMCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    void processAlta(AltaMasivaDTO altaMasivaDTO);   
    
    AltaMasivaDTO updateNMAlta(AltaMasivaDTO altaMasivaDTO);
    
    
}
