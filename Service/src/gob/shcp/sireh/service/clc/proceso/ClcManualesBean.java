package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesArchivoDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesCapturaDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a CLC Manuales.
 */
@Stateless(name = "ClcManuales")
@Local( { ClcManualesService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcManualesBean extends AbstractBean implements ClcManualesService {
    
    /**
     * Procesa Manuales - Metodo encargado de obtener la clave presupuestal con base en el tipo de nomina
     * @author Oscar S.
     * @param idTipoNomina String
     * @return String
     */
    public String getClavePresupuestalByTipoNomina(String idTipoNomina) {
        return super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(idTipoNomina);
    }
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de clc en el rango de las 5000
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    public Integer getMaxCxlcManuales(Integer cxlcCiclo) {
        return super.getService(ClcManualesService.class).getMaxCxlcManuales(cxlcCiclo);
    }
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de secuencia
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    public Integer getMaxSecCxlcManuales(Integer cxlcCiclo) {
        return super.getService(ClcManualesService.class).getMaxSecCxlcManuales(cxlcCiclo);
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar la cxlc
     * @author Oscar S.
     * @param clcManualesCapturaDTO clcManualesDTO
     * @param clavePresupuestal String
     * @param usuario String
     */
    public void createClcManuales(ClcManualesCapturaDTO clcManualesCapturaDTO, String clavePresupuestal, String usuario) {
        super.getService(ClcManualesService.class).createClcManuales(clcManualesCapturaDTO, clavePresupuestal, usuario);
    }
    
    /**
     * Procesa Manual - Metodo encargado de procesar el archivo de la cxlc manual vs plantilla
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @return clcManualesArchivoDTO ClcManualesArchivoDTO
     */
    public ClcManualesArchivoDTO processFileClcManual(ClcManualesArchivoDTO clcManualesArchivoDTO) {
        return super.getService(ClcManualesService.class).processFileClcManual(clcManualesArchivoDTO);
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar cabecera y secuencias de la cxlc manual
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @param usuario String
     */
    public void createClcManualesArchivo(ClcManualesArchivoDTO clcManualesArchivoDTO, String usuario) {
        super.getService(ClcManualesService.class).createClcManualesArchivo(clcManualesArchivoDTO, usuario);
    }

    public TdSecCxlcDTO getClavePresupuestal(Integer ciclo, String unidad, String partida, String estado) {
        return super.getService(ClcManualesService.class).getClavePresupuestal(ciclo, unidad, partida, estado);
    }
}
