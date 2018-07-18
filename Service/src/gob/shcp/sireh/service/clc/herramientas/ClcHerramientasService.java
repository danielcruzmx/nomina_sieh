package gob.shcp.sireh.service.clc.herramientas;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.herramientas.BorraClcDTO;
import gob.shcp.sireh.model.clc.reportes.CustomPrestacionesTriOutputFileDTO;
import gob.shcp.sireh.model.clc.reportes.ReportesCxlcDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface ClcHerramientasService extends BusinessService {
    
    /**
     * Metodo encargado de obtener el objeto TdCxlc con base en su TdCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param cxlcCiclo Integer
     * @return TdCxlcDTO
     */
    public TdCxlcDTO getTdCxlc(Integer cxlc, Integer cxlcCiclo);
    
    /**
     * Metodo encargado de obtener el objeto TdSecCxlcDTO con base en su TdSecCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param secCxlc Integer
     * @param secCxlcCiclo Integer
     * @return TdSecCxlc
     */
    public TdSecCxlcDTO getTdSecCxlc(Integer cxlc, Integer secCxlc, Integer secCxlcCiclo);
    
    /**
     * Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlcDTO>
     */
    List<TdCxlcDTO> getCxlcComprometidas(Integer cxlcCiclo, List<Integer> cxlcCompromiso);
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de verificar si el numero de compromiso ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCompromiso String
     * @return boolean
     */
    boolean existeCompromiso(Integer secCxlcCiclo, String secCompromiso);
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de verificar si el numero de devengado ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secDevengado Long
     * @return boolean
     */
    boolean existeDevengado(Integer secCxlcCiclo, Long secDevengado);
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcInvolucradas List<Integer>
     */    
    void updateCxlcCompromiso(Integer cxlcCiclo, String cxlcCompromiso, List<Integer> cxlcInvolucradas, Integer secQnaApli);
    
    /**
     * Metodo encargado de obtener las solicitudes de pago con base en el ciclo y devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado List<Integer>
     * @return cxlcDevengado List<TdCxlcDTO>
     */
    List<TdCxlcDTO> getSolicitudesPagoComprometidas(Integer cxlcCiclo, List<Integer> cxlcDevengado);
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado Long
     * @param cxlcInvolucradas List<Integer>
     */    
    void updateCxlcSolicitudPago(Integer cxlcCiclo, Long cxlcDevengado, List<Integer> cxlcInvolucradas);
    
    /**
     * Metodo encargado de actualizar cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlc Integer
     * @param cxlcSIAFF Integer
     */ 
    void updateRegistraCLC(Integer cxlcCiclo, Integer cxlc, Integer cxlcSIAFF);

    /**
     * Metodo encargado de Borrar CLC con base en el objeto borraCLCDTO.
     * @author Oscar S.
     * @param borraCLCDTO borraCLCDTO
     * @return executeError Integer
     */
    Integer executeProcedureClcOrdinaria(BorraClcDTO borraCLCDTO);
    
    /**
     * Metodo encargado de actualizar el listado de cxlc a conciliar.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcConciliacionSicop Integer
     * @return cxlcConciliar List<Integer>
     */
    void updateCxlcConciliar(Integer cxlcCiclo, Integer cxlcConciliacionSicop, List<Integer> cxlcConciliar);
    
    /**
     * Metodo encargado de actualizar datos adicionales de la cxlc.
     * @author Oscar S.
     * @param reportesCxlcDTO ReportesCxlcDTO
     */ 
    void updateDatosAdicionalesCLC(ReportesCxlcDTO reportesCxlcDTO);
    
    /**
     * Metodo encargado de obtener el resumen de prestaciones trimestrales
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @return List<CustomPrestacionesTriOutputFileDTO> 
     */ 
    public List<CustomPrestacionesTriOutputFileDTO> generaExcelTrimestre(Integer qnaIni, Integer qnaFin);
    
    /**
     * Metodo encargado de obtener las prestaciones trimestrales por grupo de pago
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param grupoPago String
     * @param tipo String
     * @return List<Map<Integer, Object>>
     */ 
    public List<Map<Integer, Object>> generaPrestTrimByGpoPago(Integer qnaIni, Integer qnaFin, String grupoPago, String tipo);
    
}
