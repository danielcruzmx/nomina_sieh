package gob.shcp.sireh.service.plaza.honorarios.masivos;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaHonorarioMasivaDTO;


import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaMasivaDTO;

import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;


import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name="PlazaHonorarioMasiva")
@Local({PlazaHonorarioMasivaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaHonorarioMasivaBean  extends AbstractBean implements PlazaHonorarioMasivaService{

    public void processCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        super.getService(PlazaHonorarioMasivaService.class).processCambioAdscripcion(cambioAdscripcionMasivoDTO);
    }

    public void updateNMCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        super.getService(PlazaHonorarioMasivaService.class).updateNMCambioAdscripcion(cambioAdscripcionMasivoDTO);
    }

    public void processBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO) {
        super.getService(PlazaHonorarioMasivaService.class).processBaja(plazaHonorarioMasivaDTO);
    }

    public PlazaHonorarioMasivaDTO updateNMBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class).updateNMBaja(plazaHonorarioMasivaDTO);
    }

    public CreacionPlazaMasivaDTO validarPMFileCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class ).validarPMFileCreacion(creacionPlazaMasivaDTO);
    }

    public CreacionPlazaMasivaDTO updateNMCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class).updateNMCreacion(creacionPlazaMasivaDTO) ;
    }

    public void processAlta(AltaMasivaDTO altaMasivaDTO) {
        super.getService(PlazaHonorarioMasivaService.class).processAlta(altaMasivaDTO);
    }

    public AltaMasivaDTO updateNMAlta(AltaMasivaDTO altaMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class).updateNMAlta(altaMasivaDTO);
    }

    public ProrrogaMasivaDTO updateNMProrroga(ProrrogaMasivaDTO prorrogaMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class).updateNMProrroga(prorrogaMasivaDTO);
    }

    public ReduccionContratoMasivaDTO updateNMReduccion(ReduccionContratoMasivaDTO reduccionContratoMasivaDTO) {
        return super.getService(PlazaHonorarioMasivaService.class).updateNMReduccion(reduccionContratoMasivaDTO);
    }
}
