package gob.shcp.sireh.service.configuracion.mantenimiento;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.DatosPlantillaDTO;

import java.io.File;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.w3c.dom.Document;

@Stateless(name="MantenimientoPlantillas")
@Local({MantenimientoPlantillasService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class MantenimientoPlantillasBean  extends AbstractBean  implements MantenimientoPlantillasService {

    public List<SelectStringDTO> getListaPlantillas() {
        return super.getService(MantenimientoPlantillasService.class).getListaPlantillas();
    }
    
    public DatosPlantillaDTO getDatosPlantilla(String plantilla) {
        return super.getService(MantenimientoPlantillasService.class).getDatosPlantilla(plantilla);
    }

    public List<SelectStringDTO> getListaTipos() {
        return super.getService(MantenimientoPlantillasService.class).getListaTipos();
    }

    public void update(DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).update(datosPlantillaDTO);
    }

    public void save(File file ,Document paramDoc) {
        super.getService(MantenimientoPlantillasService.class).save(file,paramDoc);
    }

    public void delete(DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).delete(datosPlantillaDTO);
    }

    public void create(DatosPlantillaDTO datosPlantillaDTO) {
        super.getService(MantenimientoPlantillasService.class).create(datosPlantillaDTO);
    }
}
