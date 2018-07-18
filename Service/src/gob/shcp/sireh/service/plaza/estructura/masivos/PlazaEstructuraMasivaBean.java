package gob.shcp.sireh.service.plaza.estructura.masivos;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;

@Stateless(name="PlazaEstructuraMasiva")
@Local({PlazaEstructuraMasivaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaEstructuraMasivaBean extends AbstractBean implements PlazaEstructuraMasivaService {

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasiva(creacionPlazaMasivaDTO);
    }
    
    public CreacionPlazaMasivaDTO processPMFileConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).processPMFileConversionReubicacion(creacionPlazaMasivaDTO);
    }

    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasiva(creacionPlazaMasivaDTO);
    }

    public CreacionPlazaMasivaDTO updatePMConversion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).updatePMConversion(creacionPlazaMasivaDTO);
    }
    
    public CreacionPlazaMasivaDTO updatePMReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).updatePMReubicacion(creacionPlazaMasivaDTO);
    }
    
//    public CreacionPlazaMasivaDTO updatePMConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
//        return super.getService(PlazaEstructuraMasivaService.class).updatePMConversionReubicacion(creacionPlazaMasivaDTO) ;
//    }

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasivaCancelacion(creacionPlazaMasivaDTO) ;
    }

    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasivaCancelacion(creacionPlazaMasivaDTO) ;
    }

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).processPMFilePlazaEstructuraMasivaTransferencia(creacionPlazaMasivaDTO) ;
    }

    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaEstructuraMasivaService.class).updatePMPlazaEstructuraMasivaTransferencia(creacionPlazaMasivaDTO) ;
    }


   
}
