package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CancelaPagoDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.TcMovsPersonalDTO;
import gob.shcp.sireh.model.nomina.CambioMovimientosPersonalDTO;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.incidencias.GestionIncidenciasPersonalDTO;
import gob.shcp.sireh.model.nomina.incidencias.IncidenciaPersonalDTO;

import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesMovtoNominaDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;


import java.util.List;

import javax.ejb.Local;



@Local
public interface MovimientoNominaService extends BusinessService{
    
    CambioEmpleadoPensionesDTO getEmpleadoPensiones(String rfcEmpleado);
    
    TdEmpleadoDTO getEmpleado(String rfcEmpleado);
    
    CustomTdPensionDTO getPension(Integer idPension, String rfcEmpleado);
    
    void savePension(CustomTdPensionDTO customTdPensionDTO);
    
    void deletePensiones(Integer[] ids);
    
    CancelaPagoDTO getEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO);
    
    CambioMovimientosPersonalDTO getPlazaEmpleadosMovtosPersonal(Integer idPlaza, Integer idMovsPersonal);
    
    TcMovsPersonalDTO getMovimientoPersonalById(Integer id);
    
    void updateMovimientosPersonal(CambioMovimientosPersonalDTO cambioMovimientosPersonalDTO);
    
    
    
    void corrigeEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO);
    
    public CancelaPagoDTO getEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO);
    public QnaCapturaDTO getQuincenaCaptura();
    public void corrigeEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO);
    
    // 
     GestionIncidenciasPersonalDTO getIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO);
     
     void addIncidenciaPersonal( GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO );
     
     void deleteIncidenciasPersonal(List<IncidenciaPersonalDTO> listaIncidenciaSpERSONALDTO, String tipoIncidencia, Long[] ids);
     
     List<IncidenciaPersonalDTO> calcularIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO);
     
     void updateIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO);
     
     public List<String> plantillaVigente(String idGrupoPago);
     
     public List<String> movimientosA(ReportesMovtoNominaDTO reportesMovtoNominaDTO);
     
     public List<String> movimientosB(ReportesMovtoNominaDTO reportesMovtoNominaDTO);
     
     public List<String> movimientosM(ReportesMovtoNominaDTO reportesMovtoNominaDTO);
     
     public List<String> periodoLaborado(ReportesConstanciasDTO reportesConstanciasDTO);
     
     public List<String> padronSeguros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

     public List<String> credencializacionM(ReportesConstanciasDTO reportesConstanciasDTO);
     
     public List<String> credencializacionR(ReportesConstanciasDTO reportesConstanciasDTO);
     
     public List<String> credencializacionB(ReportesConstanciasDTO reportesConstanciasDTO);
     
     public String constanciasF(ReportesConstanciasDTO reportesConstanciasDTO);
     
     public List<String> defNomEjercicio(String ciclo);
     
}
