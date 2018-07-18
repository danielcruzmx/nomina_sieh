package gob.shcp.sireh.service.nomina.terceros.aportaciones;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.terceros.aportaciones.CargaPlantillaSARTercerosDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes al proceso SAR-FOVISSSTE.
 */
@Stateless(name="SarFovissste")
@Local( { SarFovisssteService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class SarFovisssteBean extends AbstractBean implements SarFovisssteService {

    /**
     * Metodo encargado de procesar el periodo SAR-FOVISSSTE.
     * @author Oscar S.
     * @param nominas String
     * @param bimestre Integer
     */
    public void procesaSARFOV(String nominas, Integer bimestre) {
        super.getService(SarFovisssteService.class).procesaSARFOV(nominas, bimestre);
    }
    
    /**
     * Metodo encargado de obtener String para generar el archivo de intercambio del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> generaArchivoIntercambio(String tipoArchivo) {
        return super.getService(SarFovisssteService.class).generaArchivoIntercambio(tipoArchivo);
    }
    
    public String procesarArchivo(CargaPlantillaSARTercerosDTO cargaPlantillaSARTercerosDTO){
        return super.getService(SarFovisssteService.class).procesarArchivo(cargaPlantillaSARTercerosDTO);
    }
}
