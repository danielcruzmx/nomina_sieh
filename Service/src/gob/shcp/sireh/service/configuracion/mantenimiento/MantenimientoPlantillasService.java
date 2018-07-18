package gob.shcp.sireh.service.configuracion.mantenimiento;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.configuracion.mantenimiento.plantillas.DatosPlantillaDTO;

import java.io.File;

import java.util.List;

import javax.ejb.Local;

import org.w3c.dom.Document;

@Local
public interface MantenimientoPlantillasService extends BusinessService {

    public List<SelectStringDTO> getListaPlantillas();

    public DatosPlantillaDTO getDatosPlantilla(String plantilla);

    public List<SelectStringDTO> getListaTipos();

    public void update(DatosPlantillaDTO datosPlantillaDTO);

    public void save(File file, Document paramDoc);

    public void delete(DatosPlantillaDTO datosPlantillaDTO);

    public void create(DatosPlantillaDTO datosPlantillaDTO);
}
