package gob.shcp.sireh.service.clc.herramientas;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.herramientas.BorraClcDTO;
import gob.shcp.sireh.model.clc.reportes.CustomPrestacionesTriOutputFileDTO;
import gob.shcp.sireh.model.clc.reportes.ReportesCxlcDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes al modulo Herramientas.
 */
@Stateless(name="ClcHerramientas")
@Local({ClcHerramientasService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcHerramientasBean extends AbstractBean implements ClcHerramientasService {

    /**
     * Metodo encargado de obtener el objeto TdCxlc con base en su TdCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param cxlcCiclo Integer
     * @return TdCxlcDTO
     */
    public TdCxlcDTO getTdCxlc(Integer cxlc, Integer cxlcCiclo) {
        return super.getService(ClcHerramientasService.class).getTdCxlc(cxlc, cxlcCiclo);
    }
    
    /**
     * Metodo encargado de obtener el objeto TdSecCxlcDTO con base en su TdSecCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param secCxlc Integer
     * @param secCxlcCiclo Integer
     * @return TdSecCxlc
     */
    public TdSecCxlcDTO getTdSecCxlc(Integer cxlc, Integer secCxlc, Integer secCxlcCiclo) {
        return super.getService(ClcHerramientasService.class).getTdSecCxlc(cxlc,  secCxlc, secCxlcCiclo);
    }
    
    /**
     * Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> getCxlcComprometidas(Integer cxlcCiclo, List<Integer> cxlcCompromiso) {
        return super.getService(ClcHerramientasService.class).getCxlcComprometidas(cxlcCiclo, cxlcCompromiso);
    }
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de verificar si el numero de compromiso ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCompromiso String
     * @return boolean
     */
    public boolean existeCompromiso(Integer secCxlcCiclo, String secCompromiso) {
        return super.getService(ClcHerramientasService.class).existeCompromiso(secCxlcCiclo, secCompromiso);
    }
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de verificar si el numero de devengado ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secDevengado Long
     * @return boolean
     */
    public boolean existeDevengado(Integer secCxlcCiclo, Long secDevengado) {
        return super.getService(ClcHerramientasService.class).existeDevengado(secCxlcCiclo, secDevengado);
    }
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcInvolucradas List<Integer>
     */ 
    public void updateCxlcCompromiso(Integer cxlcCiclo, String cxlcCompromiso, List<Integer> cxlcInvolucradas, Integer secQnaApli) {
        super.getService(ClcHerramientasService.class).updateCxlcCompromiso(cxlcCiclo, cxlcCompromiso, cxlcInvolucradas, secQnaApli);
    }
    
    /**
     * Metodo encargado de obtener las solicitudes de pago con base en el ciclo y devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado List<Integer>
     * @return cxlcDevengado List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> getSolicitudesPagoComprometidas(Integer cxlcCiclo, List<Integer> cxlcDevengado) {
        return super.getService(ClcHerramientasService.class).getSolicitudesPagoComprometidas(cxlcCiclo, cxlcDevengado);
    }
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado Long
     * @param cxlcInvolucradas List<Integer>
     */ 
    public void updateCxlcSolicitudPago(Integer cxlcCiclo, Long cxlcDevengado, List<Integer> cxlcInvolucradas) {
        super.getService(ClcHerramientasService.class).updateCxlcSolicitudPago(cxlcCiclo, cxlcDevengado, cxlcInvolucradas);
    }
    
    /**
     * Metodo encargado de actualizar cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlc Integer
     * @param cxlcSIAFF Integer
     */ 
    public void updateRegistraCLC(Integer cxlcCiclo, Integer cxlc, Integer cxlcSIAFF) {
        super.getService(ClcHerramientasService.class).updateRegistraCLC(cxlcCiclo, cxlc, cxlcSIAFF);
    }
    
    /**
     * Metodo encargado de Borrar CLC con base en el objeto borraCLCDTO.
     * @author Oscar S.
     * @param borraCLCDTO borraCLCDTO
     * @return executeError Integer
     */
    public Integer executeProcedureClcOrdinaria(BorraClcDTO borraCLCDTO) {
        return super.getService(ClcHerramientasService.class).executeProcedureClcOrdinaria(borraCLCDTO);
    }
    
    /**
     * Metodo encargado de actualizar el listado de cxlc a conciliar.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcConciliacionSicop Integer
     * @return cxlcConciliar List<Integer>
     */
    public void updateCxlcConciliar(Integer cxlcCiclo, Integer cxlcConciliacionSicop, List<Integer> cxlcConciliar) {
        super.getService(ClcHerramientasService.class).updateCxlcConciliar(cxlcCiclo, cxlcConciliacionSicop, cxlcConciliar);
    }
    
    /**
     * Metodo encargado de actualizar datos adicionales de la cxlc.
     * @author Oscar S.
     * @param reportesCxlcDTO ReportesCxlcDTO
     */ 
    public void updateDatosAdicionalesCLC(ReportesCxlcDTO reportesCxlcDTO) {
        super.getService(ClcHerramientasService.class).updateDatosAdicionalesCLC(reportesCxlcDTO);
    }
    
    /**
     * Metodo encargado de obtener el resumen de prestaciones trimestrales
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @return List<CustomPrestacionesTriOutputFileDTO> 
     */ 
    public List<CustomPrestacionesTriOutputFileDTO> generaExcelTrimestre(Integer qnaIni, Integer qnaFin) {
        return super.getService(ClcHerramientasService.class).generaExcelTrimestre(qnaIni, qnaFin);
    }
    
    /**
     * Metodo encargado de obtener las prestaciones trimestrales por grupo de pago
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param grupoPago String
     * @param tipo String
     * @return List<Map<Integer, Object>>
     */
    public List<Map<Integer, Object>> generaPrestTrimByGpoPago(Integer qnaIni, Integer qnaFin, String grupoPago, String tipo) {
        return super.getService(ClcHerramientasService.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, grupoPago, tipo);
    }
}
