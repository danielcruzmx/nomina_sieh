package gob.shcp.sireh.service.clc.herramientas;

import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.TdCxlcDAO;
import gob.shcp.sireh.data.jdbc.TdSecCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;

import gob.shcp.sireh.data.jdbc.support.CustomTdHistoricoDAO;
import gob.shcp.sireh.domain.jdbc.CustomPrestacionesTriOutputFile;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdCxlcPK;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlcPK;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.herramientas.BorraClcDTO;
import gob.shcp.sireh.model.clc.reportes.CustomPrestacionesTriOutputFileDTO;
import gob.shcp.sireh.model.clc.reportes.ReportesCxlcDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Business Service encargado de atender solicitudes correspondientes aL Modulo Herramientas.
 */
public class ClcHerramientasBS extends AbstractSirehService implements ClcHerramientasService {
    
    /**
     * Metodo encargado de obtener el objeto TdCxlc con base en su TdCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param cxlcCiclo Integer
     * @return TdCxlc
     */
    public TdCxlcDTO getTdCxlc(Integer cxlc, Integer cxlcCiclo) {
        TdCxlc tdCxlc = super.persistence().get(TdCxlcDAO.class).getById(new TdCxlcPK(cxlc, cxlcCiclo));
        return super.transformation().map(tdCxlc, TdCxlcDTO.class);
    }
    
    /**
     * Metodo encargado de obtener el objeto TdSecCxlcDTO con base en su TdSecCxlcPK.
     * @author Oscar S.
     * @param cxlc Integer
     * @param secCxlc Integer
     * @param secCxlcCiclo Integer
     * @return TdSecCxlcDTO
     */
    public TdSecCxlcDTO getTdSecCxlc(Integer cxlc, Integer secCxlc, Integer secCxlcCiclo) {
        TdSecCxlc tdSecCxlc =  super.persistence().get(TdSecCxlcDAO.class).getById(new TdSecCxlcPK(cxlc, secCxlc, secCxlcCiclo));
        return super.transformation().map(tdSecCxlc, TdSecCxlcDTO.class);
    }
    
    /**
     * Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlc>
     */
    public List<TdCxlcDTO> getCxlcComprometidas(Integer cxlcCiclo, List<Integer> cxlcCompromiso) {        
        List<TdCxlc> cxlcInvolucradas = super.persistence().get(CustomTdCxlcDAO.class).getCxlcComprometidasList(cxlcCiclo, cxlcCompromiso);
        return super.transformation().map(cxlcInvolucradas, TdCxlcDTO.class);
    }
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de verificar si el numero de compromiso ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCompromiso String
     * @return boolean
     */
    public boolean existeCompromiso(Integer secCxlcCiclo, String secCompromiso) {
        List<TdSecCxlc> listaSecCxlc =  super.persistence().get(CustomTdCxlcDAO.class).existeCompromiso(secCxlcCiclo, secCompromiso);
        return !listaSecCxlc.isEmpty() ? true : false;
    }
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de verificar si el numero de devengado ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secDevengado Long
     * @return boolean
     */
    public boolean existeDevengado(Integer secCxlcCiclo, Long secDevengado) {
        List<TdSecCxlc> listaSecCxlc =  super.persistence().get(CustomTdCxlcDAO.class).existeDevengado(secCxlcCiclo, secDevengado);
        return !listaSecCxlc.isEmpty() ? true : false;
    }
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcInvolucradas List<Integer>
     */
    public void updateCxlcCompromiso(Integer cxlcCiclo, String cxlcCompromiso, List<Integer> cxlcInvolucradas, Integer secQnaApli) {
        super.persistence().get(CustomTdCxlcDAO.class).updateCxlcCompromiso(cxlcCiclo, cxlcCompromiso, cxlcInvolucradas, super.security().getUserName(), secQnaApli);
    }
    
    /**
     * Metodo encargado de obtener las solicitudes de pago con base en el ciclo y devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado List<Integer>
     * @return cxlcDevengado List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> getSolicitudesPagoComprometidas(Integer cxlcCiclo, List<Integer> cxlcDevengado) {
        List<TdCxlc> cxlcInvolucradas = super.persistence().get(CustomTdCxlcDAO.class).getCxlcSolicitudPagoList(cxlcCiclo, cxlcDevengado);
        return super.transformation().map(cxlcInvolucradas, TdCxlcDTO.class);
    }
    
    /**
     * Metodo encargado de actualizar las cxlc involucradas con base en un nuevo devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado Long
     * @param cxlcInvolucradas List<Integer>
     */ 
    public void updateCxlcSolicitudPago(Integer cxlcCiclo, Long cxlcDevengado, List<Integer> cxlcInvolucradas) {
        super.persistence().get(CustomTdCxlcDAO.class).updateCxlcSolicitudPago(cxlcCiclo, cxlcDevengado, cxlcInvolucradas, super.security().getUserName());
    }
    
    /**
     * Metodo encargado de actualizar cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlc Integer
     * @param cxlcSIAFF Integer
     */ 
    public void updateRegistraCLC(Integer cxlcCiclo, Integer cxlc, Integer cxlcSIAFF) {
        // TdCxlc
        TdCxlc tdCxlc = super.persistence().get(TdCxlcDAO.class).getById(new TdCxlcPK(cxlc, cxlcCiclo));
        tdCxlc.setCxlcCiclo(cxlcCiclo);
        tdCxlc.setCxlc(cxlc);
        tdCxlc.setCxlcSiaff(cxlcSIAFF);
        tdCxlc.setUsuario(super.security().getUserName());
        tdCxlc.setFecModifico(new Date());
        super.persistence().get(TdCxlcDAO.class).save(tdCxlc);
        
        // TdSecCxlc
        super.persistence().get(CustomTdCxlcDAO.class).updateRegistraCLC(cxlcCiclo, cxlcSIAFF, cxlc, super.security().getUserName());
    }
    
    /**
     * Metodo encargado de Borrar CLC con base en el objeto borraCLCDTO.
     * @author Oscar S.
     * @param borraCLCDTO borraCLCDTO
     * @return executeError Integer
     */
    public Integer executeProcedureClcOrdinaria(BorraClcDTO borraCLCDTO) {
        Integer executeError = super.persistence()
                                    .get(CustomTdCxlcDAO.class)
                                    .executeSPBorraCLC(
                                        borraCLCDTO.getCicloUnidad(), 
                                        borraCLCDTO.getQnaPago(), 
                                        borraCLCDTO.getTipoNomina(), 
                                        borraCLCDTO.getNumComplem(),
                                        borraCLCDTO.getSituacion());
        return executeError;
    }
    
    /**
     * Metodo encargado de actualizar el listado de cxlc a conciliar.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcConciliacionSicop Integer
     * @return cxlcConciliar List<Integer>
     */
    public void updateCxlcConciliar(Integer cxlcCiclo, Integer cxlcConciliacionSicop, List<Integer> cxlcConciliar) {
        super.persistence().get(CustomTdCxlcDAO.class).updateCxlcConciliar(cxlcCiclo, cxlcConciliacionSicop, cxlcConciliar, super.security().getUserName());
    }
    
    /**
     * Metodo encargado de actualizar datos adicionales de la cxlc.
     * @author Oscar S.
     * @param reportesCxlcDTO ReportesCxlcDTO
     */ 
    public void updateDatosAdicionalesCLC(ReportesCxlcDTO reportesCxlcDTO) {
        TdCxlcPK pk = new TdCxlcPK();
        pk.setCxlc(new Integer(reportesCxlcDTO.getClc()));
        pk.setCxlcCiclo(new Integer(reportesCxlcDTO.getUniCiclo()));
        TdCxlc cxlc = super.persistence().get(TdCxlcDAO.class).getById(pk);
        
        // Datos Adicionales
        StringBuffer cxlcParametros = new StringBuffer();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        cxlcParametros.append(reportesCxlcDTO.getSuficienciaPresupuestaria() != null ? reportesCxlcDTO.getSuficienciaPresupuestaria() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getDocumento() != null ? reportesCxlcDTO.getDocumento() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getMes() != null ? reportesCxlcDTO.getMes() : "").append("|");
        
        cxlcParametros.append(reportesCxlcDTO.getFechaDepositoBanco() != null ? sdf.format(reportesCxlcDTO.getFechaDepositoBanco()) : null).append("|");
        cxlcParametros.append(reportesCxlcDTO.getFechaPagoPersonal() != null ? sdf.format(reportesCxlcDTO.getFechaPagoPersonal()) : null).append("|");
        
        cxlcParametros.append(reportesCxlcDTO.getPagoUnidad() != null ? reportesCxlcDTO.getPagoUnidad() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getPeriodo() != null ? reportesCxlcDTO.getPeriodo() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getCorreoElectronico() != null ? reportesCxlcDTO.getCorreoElectronico() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getNota() != null ? reportesCxlcDTO.getNota() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getResponsable() != null ? reportesCxlcDTO.getResponsable() : "").append("|");
        cxlcParametros.append(reportesCxlcDTO.getPuestoCargo() != null ? reportesCxlcDTO.getPuestoCargo() : "");
        
        cxlc.setCxlcParametros(cxlcParametros.toString());
        super.persistence().get(TdCxlcDAO.class).save(cxlc);
    }
    
    /**
     * Metodo encargado de obtener el resumen de prestaciones trimestrales
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @return List<CustomPrestacionesTriOutputFileDTO> 
     */ 
    public List<CustomPrestacionesTriOutputFileDTO> generaExcelTrimestre(Integer qnaIni, Integer qnaFin) {
        List<CustomPrestacionesTriOutputFile> items = super.persistence().get(QueryTnHistoricoPagoDAO.class).generaExcelTrimestre(qnaIni, qnaFin);
        
        List<CustomPrestacionesTriOutputFileDTO> itemsDTO = super.transformation().map(items, CustomPrestacionesTriOutputFileDTO.class);
        
        return itemsDTO;
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
        return super.persistence().get(CustomTdHistoricoDAO.class).generaPrestTrimByGpoPago(qnaIni, qnaFin, grupoPago, tipo);
    }
}
