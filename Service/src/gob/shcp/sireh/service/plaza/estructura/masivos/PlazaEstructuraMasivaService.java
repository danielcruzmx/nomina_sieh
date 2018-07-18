package gob.shcp.sireh.service.plaza.estructura.masivos;


import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;

import javax.ejb.Local;

@Local
public interface PlazaEstructuraMasivaService extends BusinessService {

    CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

    CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

    CreacionPlazaMasivaDTO updatePMConversion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

    CreacionPlazaMasivaDTO updatePMReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    CreacionPlazaMasivaDTO processPMFileConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

//    CreacionPlazaMasivaDTO updatePMConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

    CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
    
    CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);

    CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO);
}
