package gob.shcp.sireh.service.nomina.terceros.aportaciones;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.terceros.aportaciones.CargaPlantillaSARTercerosDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface SarFovisssteService extends BusinessService {
    
    /**
     * Metodo encargado de procesar el periodo SAR-FOVISSSTE.
     * @author Oscar S.
     * @param nominas String
     * @param bimestre Integer
     */
    public void procesaSARFOV(String nominas, Integer bimestre);
    
    /**
     * Metodo encargado de obtener String para generar el archivo de intercambio del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> generaArchivoIntercambio(String tipoArchivo);
    
    public String procesarArchivo(CargaPlantillaSARTercerosDTO cargaPlantillaSARTercerosDTO);
}
