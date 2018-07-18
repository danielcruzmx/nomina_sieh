package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.data.jdbc.support.CustomDoctosExpPersonal;
import gob.shcp.sireh.data.jdbc.support.CustomTnComprobante;

import gob.shcp.sireh.domain.CustomTdExpDoctosSinDatos;
import gob.shcp.sireh.domain.jdbc.CustomExpediente;
import gob.shcp.sireh.domain.jdbc.CustomTdDepEco;
import gob.shcp.sireh.domain.jdbc.CustomTdExpAntecedentesAcademicos;
import gob.shcp.sireh.domain.jdbc.CustomTdExpCapacitacion;
import gob.shcp.sireh.domain.jdbc.CustomTdExpLab;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPago;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.CustomTnMovtosEmpPla;

import gob.shcp.sireh.domain.jdbc.ExpedienteEliminaDocumentos;

import java.util.List;

public interface QueryExpedienteDAO extends TdEmpleadoDAO {
    
    @FindByNamedQuery(name="expediente", value=CustomExpediente.class)
    List<CustomExpediente> findExpediente(String rfcEmpleado);
    
    @FindByNamedQuery(name="dependientesEconomicos", value=CustomTdDepEco.class)
    List<CustomTdDepEco> findDependientesEco(String rfcEmpleado);
    
    @FindByNamedQuery(name="ov-expediente-antecedentesAcademicos", value=CustomTdExpAntecedentesAcademicos.class)
    List<CustomTdExpAntecedentesAcademicos> findAntAcademicos(String rfcEmpleado);
    
    @FindByNamedQuery(name="ov-expediente-Capacitacion", value=CustomTdExpCapacitacion.class)
    List<CustomTdExpCapacitacion> findCapacitacion(String rfcEmpleado);
    
    @FindByNamedQuery(name="ov-expediente-SPC", value=CustomTdExpDoctosSinDatos.class)
    List<CustomTdExpDoctosSinDatos> findSPC(String rfcEmpleado);    
    
    @FindByNamedQuery(name="experienciaLaboralExp", value=CustomTdExpLab.class)
    List<CustomTdExpLab> findExperienciaLaboral(String rfcEmpleado);
    
    @FindByNamedQuery(name="conceptosAdicionalesExp", value=CustomTnMovtoConceptoPago.class)
    List<CustomTnMovtoConceptoPago> findConceptosAdicionales(String rfcEmpleado, String sitCaptura1, String sitCaptura2, String tipoConcepto1, String tipoConcepto2, String tipoConcepto3, String concepto1,  String concepto2,  String concepto3,  String concepto4,  String concepto5,  String concepto6,  String concepto7,  String concepto8,  String concepto9,  String concepto10, String concepto11, String concepto12, String concepto13, String concepto14, String concepto15);
    
    @FindByNamedQuery(name="movimientosPersonalExp", value=CustomTnMovtosEmpPla.class)
    List<CustomTnMovtosEmpPla> findMovimientosEmpleado(String rfcEmpleado);
    
    @FindByNamedQuery(name="historicoPagoExp", value=CustomTnHistoricoPago.class)
    List<CustomTnHistoricoPago> findHistoricoPago(String rfcEmpleado);
    
    @FindByNamedQuery(name="comprobanteExp", value=CustomTnComprobante.class)
    List<CustomTnComprobante> findComprobante(String rfcEmpleado);
    
    @FindByNamedQuery(name="consultaExpDocumentos", value=CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> findDoctosExpPersonal(String rfcEmpleado, String rfcEmpleado2, String rfcEmpleado3, String rfcEmpleado4, String rfcEmpleado5, String rfcEmpleado6, String rfcEmpleado7, String rfcEmpleado8, String rfcEmpleado9, String rfcEmpleado10, String rfcEmpleado11, String rfcEmpleado12, String rfcEmpleado13, String rfcEmpleado14);
    
    @FindByNamedQuery(name="getExpDoctoFaltantesLaborales", value=CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoFaltantesLaborales(String rfcEmpleado1, 
                                                            String rfcEmpleado2, String rfcEmpleado3, 
                                                            String rfcEmpleado4, String rfcEmpleado5, String rfcEmpleado6);
    
    @FindByNamedQuery(name="getExpDoctoFaltantesObligatorios", value=CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoFaltantesObligatorios(String rfcEmpleado1, 
                                                            String rfcEmpleado2, String rfcEmpleado3, 
                                                            String rfcEmpleado4, String rfcEmpleado5, 
                                                            String rfcEmpleado6, String rfcEmpleado7,
                                                            String rfcEmpleado8, String rfcEmpleado9,
                                                            String rfcEmpleado10, String rfcEmpleado11,
                                                            String rfcEmpleado12, String rfcEmpleado13,
                                                            String rfcEmpleado14, String rfcEmpleado15,
                                                            String rfcEmpleado16, String rfcEmpleado17,
                                                            String rfcEmpleado18);
    
    @FindByNamedQuery(name="getExpDoctoActivos", value=CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoActivos(String rfcEmpleado, String rfcEmpleado1, 
                                                            String rfcEmpleado2, String rfcEmpleado3, 
                                                            String rfcEmpleado4, String rfcEmpleado5, 
                                                            String rfcEmpleado6, String rfcEmpleado7, 
                                                            String rfcEmpleado8, String rfcEmpleado9, 
                                                            String rfcEmpleado10, String rfcEmpleado11, 
                                                            String rfcEmpleado12, String rfcEmpleado13, 
                                                            String rfcEmpleado14, String rfcEmpleado15, String rfcEmpleado16,
                                                            String rfcEmpleado17, String rfcEmpleado18, String rfcEmpleado19,
                                                            String rfcEmpleado20, String rfcEmpleado21);
                                                                                                                    
    @FindByNamedQuery(name = "getExpDoctoHistoricoObligatorios", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoObligatorios(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoObligatoriosPorTipo", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoObligatoriosPorTipo(String idDocto, String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoActaNacimiento", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoActaNacimiento(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoComprobanteEstudios", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoComprobanteEstudios(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoCompDomicilio", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoCompDomicilio(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoBancario", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoBancario(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoCartilla", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoCartilla(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoFechasLaborales", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoFechasLaborales(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoCurp", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoCurp(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoRfc", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoRfc(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoHistoricoExperienciaLaboral", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoHistoricoExperienciaLaboral(String rfcEmpleado);
    
    /******************************************** Subgrid - Documentos Activos-Registrados ************************************************/
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosObligatoriosPorTipo", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosObligatoriosPorTipo(String idDocto, String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosCapacitacion", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosCapacitacion(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosComprobanteEstudios", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosComprobanteEstudios(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosFamiliares", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosFamiliares(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosDependientes", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosDependientes(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivosRegistradosExperienciaLaboral", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivosRegistradosExperienciaLaboral(String rfcEmpleado);
    
    /******************************************** Subgrid - Documentos Activos ************************************************/
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivoAvisoAccdidente", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivoAvisoAccdidente(String rfcEmpleado);
    
    @FindByNamedQuery(name = "getExpDoctoSubgridActivoDatosComplementarios", value = CustomDoctosExpPersonal.class)
    List<CustomDoctosExpPersonal> getExpDoctoSubgridActivoDatosComplementarios(String rfcEmpleado);
    
    /******************************************** Documentos ************************************************/
    
    @FindByNamedQuery(name = "getExpedienteTablasDatos", value = ExpedienteEliminaDocumentos.class)
    List<ExpedienteEliminaDocumentos> getTablasDatosExpediente();
    
    @FindByNamedQuery(name = "findNomEmpl", value = CustomExpediente.class)
    List<CustomExpediente> findNomEmpl(String rfc);
}
