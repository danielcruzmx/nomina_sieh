package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.TcMovsPersonalDTO;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CancelaPagoDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.CambioMovimientosPersonalDTO;

import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.incidencias.GestionIncidenciasPersonalDTO;

import gob.shcp.sireh.model.nomina.incidencias.IncidenciaPersonalDTO;

import gob.shcp.sireh.model.nomina.reportes.ReportesConstanciasDTO;
import gob.shcp.sireh.model.nomina.reportes.ReportesMovtoNominaDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;


import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="MovimientoNomina")
@Local({MovimientoNominaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class MovimientoNominaBean extends AbstractBean implements MovimientoNominaService{
    public MovimientoNominaBean() {
    }

    public CambioEmpleadoPensionesDTO getEmpleadoPensiones(String rfcEmpleado) {
        return super.getService(MovimientoNominaService.class).getEmpleadoPensiones(rfcEmpleado);
    }
    
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        return super.getService(MovimientoNominaService.class).getEmpleado(rfcEmpleado);
    }

    public CustomTdPensionDTO getPension(Integer idPension, String rfcEmpleado){
        return super.getService(MovimientoNominaService.class).getPension(idPension, rfcEmpleado);
    }

    public void savePension(CustomTdPensionDTO customTdPensionDTO) {
        super.getService(MovimientoNominaService.class).savePension(customTdPensionDTO);
    }

    public void deletePensiones(Integer[] ids) {
        super.getService(MovimientoNominaService.class).deletePensiones(ids);
    }   
    
    public CancelaPagoDTO getEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO ){
        return super.getService(MovimientoNominaService.class).getEmpleadoCancelaPago(cancelaPagoDTO);
    }
    
    public void corrigeEmpleadoCancelaPago(CancelaPagoDTO cancelaPagoDTO){
        super.getService(MovimientoNominaService.class).corrigeEmpleadoCancelaPago(cancelaPagoDTO);
    }
    
    public CancelaPagoDTO getEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO){
        return super.getService(MovimientoNominaService.class).getEmpleadoBloqueoDeposito(cancelaPagoDTO);
    }
        
     public void corrigeEmpleadoBloqueoDeposito(CancelaPagoDTO cancelaPagoDTO){
        super.getService(MovimientoNominaService.class).corrigeEmpleadoBloqueoDeposito(cancelaPagoDTO);
     }

    public QnaCapturaDTO getQuincenaCaptura( ) {
        return super.getService(MovimientoNominaService.class).getQuincenaCaptura();
    }

    public void updateHistoricoPagoById(CancelaPagoDTO cancelaPagoDTO) {
    }


    public CambioMovimientosPersonalDTO getPlazaEmpleadosMovtosPersonal(Integer idPlaza, Integer idMovsPersonal){
        return super.getService(MovimientoNominaService.class).getPlazaEmpleadosMovtosPersonal(idPlaza, idMovsPersonal);
    }

    public TcMovsPersonalDTO getMovimientoPersonalById(Integer id) {
        return super.getService(MovimientoNominaService.class).getMovimientoPersonalById(id);
    }

    public void updateMovimientosPersonal(CambioMovimientosPersonalDTO cambioMovimientosPersonalDTO) {
        super.getService(MovimientoNominaService.class).updateMovimientosPersonal(cambioMovimientosPersonalDTO);
    }

    public GestionIncidenciasPersonalDTO getIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        return super.getService(MovimientoNominaService.class).getIncidenciasPersonal(gestionIncidenciasPersonalDTO);
    }

    public void addIncidenciaPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        super.getService(MovimientoNominaService.class).addIncidenciaPersonal(gestionIncidenciasPersonalDTO);
    }

    public void deleteIncidenciasPersonal(List<IncidenciaPersonalDTO> listaIncidenciasPersonalDTO, String tipoIncidencia, Long[] ids) {
        super.getService(MovimientoNominaService.class).deleteIncidenciasPersonal(listaIncidenciasPersonalDTO, tipoIncidencia, ids);
    }

    public List<IncidenciaPersonalDTO> calcularIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        return super.getService(MovimientoNominaService.class).calcularIncidenciasPersonal(gestionIncidenciasPersonalDTO);
    }

    public void updateIncidenciasPersonal(GestionIncidenciasPersonalDTO gestionIncidenciasPersonalDTO) {
        super.getService(MovimientoNominaService.class).updateIncidenciasPersonal(gestionIncidenciasPersonalDTO);
    }

    public List<String> plantillaVigente(String idGrupoPago){
        return super.getService(MovimientoNominaService.class).plantillaVigente(idGrupoPago);
    }
    
    public List<String> movimientosA(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        return super.getService(MovimientoNominaService.class).movimientosA(reportesMovtoNominaDTO);    
    }
    public List<String> movimientosB(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        return super.getService(MovimientoNominaService.class).movimientosB(reportesMovtoNominaDTO);    
    }
    public List<String> movimientosM(ReportesMovtoNominaDTO reportesMovtoNominaDTO){
        return super.getService(MovimientoNominaService.class).movimientosM(reportesMovtoNominaDTO);    
    }
    
    public List<String> periodoLaborado(ReportesConstanciasDTO reportesConstanciasDTO){
        return super.getService(MovimientoNominaService.class).periodoLaborado(reportesConstanciasDTO);
    }
    
    public List<String> padronSeguros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        return super.getService(MovimientoNominaService.class).padronSeguros(generaArchivosTercerosDTO);    
    }
    
    public List<String> credencializacionM(ReportesConstanciasDTO reportesConstanciasDTO){
        return super.getService(MovimientoNominaService.class).credencializacionM(reportesConstanciasDTO);    
    }
    
    public List<String> credencializacionR(ReportesConstanciasDTO reportesConstanciasDTO){
        return super.getService(MovimientoNominaService.class).credencializacionR(reportesConstanciasDTO);    
    }

    public List<String> credencializacionB(ReportesConstanciasDTO reportesConstanciasDTO){
        return super.getService(MovimientoNominaService.class).credencializacionB(reportesConstanciasDTO);    
    }
    
    public String constanciasF(ReportesConstanciasDTO reportesConstanciasDTO){
        return super.getService(MovimientoNominaService.class).constanciasF(reportesConstanciasDTO);    
    }
    
    public List<String> defNomEjercicio(String ciclo){
        return super.getService(MovimientoNominaService.class).defNomEjercicio(ciclo);
    }
}

