package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesArchivoDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesCapturaDTO;

/**
 * Business Service encargado de atender solicitudes correspondientes a CLC Manuales.
 */
public interface ClcManualesService extends BusinessService {
    
    /**
     * Procesa Manuales - Metodo encargado de obtener la clave presupuestal con base en el tipo de nomina
     * @author Oscar S.
     * @param idTipoNomina String
     * @return String
     */
    String getClavePresupuestalByTipoNomina(String idTipoNomina);
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de clc en el rango de las 5000
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    Integer getMaxCxlcManuales(Integer cxlcCiclo);
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de secuencia
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    Integer getMaxSecCxlcManuales(Integer cxlcCiclo);
    
    /**
     * Procesa Manual - Metodo encargado de guardar la cxlc
     * @author Oscar S.
     * @param clcManualesCapturaDTO clcManualesDTO
     * @param clavePresupuestal String
     * @param usuario String
     */
    void createClcManuales(ClcManualesCapturaDTO clcManualesCapturaDTO, String clavePresupuestal, String usuario);
    
    /**
     * Procesa Manual - Metodo encargado de procesar el archivo de la cxlc manual vs plantilla
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @return clcManualesArchivoDTO ClcManualesArchivoDTO
     */
    ClcManualesArchivoDTO processFileClcManual(ClcManualesArchivoDTO clcManualesArchivoDTO);
    
    /**
     * Procesa Manual - Metodo encargado de guardar cabecera y secuencias de la cxlc manual
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @param usuario String
     */
    void createClcManualesArchivo(ClcManualesArchivoDTO clcManualesArchivoDTO, String usuario);
    
    TdSecCxlcDTO getClavePresupuestal(Integer ciclo, String unidad, String partida, String estado);
}
