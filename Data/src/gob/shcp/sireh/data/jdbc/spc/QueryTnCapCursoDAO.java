package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.spc.AsignarInstructor;
import gob.shcp.sireh.domain.jdbc.spc.CargarConstancia;
import gob.shcp.sireh.domain.jdbc.spc.CustomAsignarContrato;
import gob.shcp.sireh.domain.jdbc.spc.CustomCalendario;
import gob.shcp.sireh.domain.jdbc.spc.CustomCursosFacturas;
import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroCurso;
import gob.shcp.sireh.domain.jdbc.spc.CustomRegistroParticipante;
import gob.shcp.sireh.domain.jdbc.spc.LayoutRhnet;
import gob.shcp.sireh.domain.jdbc.spc.SecuenciaEmpleado;
import gob.shcp.sireh.domain.jdbc.spc.SecuenciaInstructor;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

import java.util.List;

public interface QueryTnCapCursoDAO extends TnCapCursoDAO {

    @FindByNamedQuery(name = "sequence-TnCapCurso", value = TnCapCurso.class)
    public List<TnCapCurso> getSequenceTnCapCurso();

    @FindByNamedQuery(name = "getCursoByClave-TnCapCurso", value = TnCapCurso.class)
    public List<TnCapCurso> getCursoByClave(String cursoClave);

    @FindByNamedQuery(name = "getConsecutivoClaveCursoCallback-TnCapCurso", value = TnCapCurso.class)
    public List<TnCapCurso> getConsecutivoClaveCursoCallback(String idCursoPrincipal, String idEjeTematico, Integer cicloEjeTematico, String idTipoCurso, String idSubprograma);

    @FindByNamedQuery(name = "tnCapCurso-registrarCurso", value = CustomRegistroCurso.class)
    public List<CustomRegistroCurso> getDatosRegistroCurso(Integer id);

    @FindByNamedQuery(name = "tcCapEjeTematico-registrarCurso", value = Item.class)
    public List<Item> getEjeTematicoCallback(Integer cicloEjeTematico, String idTipoCurso);

    @FindByNamedQuery(name = "tcCapCursoPrincipal-registrarCurso", value = Item.class)
    public List<Item> getCursoPrincipalCallback(Integer cicloEjeTematico, String idEjeTematico);

    @FindByNamedQuery(name = "tcCapModalidadCursoPrincipal-registrarCurso", value = Item.class)
    public List<Item> getModalidadCallback(Integer cicloEjeTematico, String idEjeTematico, Integer idModalidad);

    @FindByNamedQuery(name = "tcCapFinalidadCursoPrincipal-registrarCurso", value = Item.class)
    public List<Item> getFinalidadCallback(Integer cicloEjeTematico, String idEjeTematico, Integer idFinalidad);
    
    @FindByNamedQuery(name = "tcCapCapacidadCertCursoPrincipal-registrarCurso", value = Item.class)
    public List<Item> getCapacidadCertCallback(Integer cicloEjeTematico, String idEjeTematico, String idCapacidadCert);
    
    @FindByNamedQuery(name = "tcCapCaracterCursoPrincipal-registrarCurso", value = Item.class)
    public List<Item> getCaracterCallback(Integer cicloEjeTematico, String idEjeTematico, Integer idCaracter);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name = "tcCapCursoCustom-asignarParticipante", value = CustomRegistroParticipante.class)
    public List<CustomRegistroParticipante> getDatosCursoParticipante(Integer id);

    @FindByNamedQuery(name = "tcCapCursoCustomParticipantesCandidatos-asignarParticipante", value = CustomParticipantesCandidatos.class)
    public List<CustomParticipantesCandidatos> getParticipantesCandidatos(Integer ciclo, Integer idCurso, Integer idCurso2);

    @FindByNamedQuery(name = "tcCapCursoCustomParticipantesInscritos-asignarParticipante", value = CustomParticipantesInscritos.class)
    public List<CustomParticipantesInscritos> getParticipantesInscritos(Integer ciclo, Integer idCurso);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name = "tnCapCurso-asignarContrato", value = CustomAsignarContrato.class)
    public List<CustomAsignarContrato> getAsignarContrato(Integer idCurso);

    @FindByNamedQuery(name = "tnCapCurso-asignarContrato-asignarCursos", value = CustomCursosFacturas.class)
    public List<CustomCursosFacturas> getCursosContrato(Integer ciclo, Integer ciclo2, Integer contrato, String fechaContrato, Integer ciclo3, Integer ciclo4, String fechaContrato2);

    @FindByNamedQuery(name = "tnCapCurso-asignarContrato-asignarFacturas", value = CustomCursosFacturas.class)
    public List<CustomCursosFacturas> getFacturasContrato(Integer ciclo, Integer ciclo2, Integer contrato);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name = "tnCapCurso-registro-AsignatInstructor-formulario", value = AsignarInstructor.class)
    public List<AsignarInstructor> getAsignarInstructor(String claveCurso);

    @FindByNamedQuery(name = "tcCapInstructor-registro-asignarInstructor-nombreInstr", value = AsignarInstructor.class)
    public List<AsignarInstructor> getNombreInstructorById(Integer idInstructor);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name = "tnCapCurso-SeguimientoYcontrol-CargaConstancia-Formulario", value = CargarConstancia.class)
    public List<CargarConstancia> cargarConstancia(String idCurso);
    
    /******************************************************************************************************************************************************************************/
    
    @FindByNamedQuery(name = "tnCapCurso-consulta-getConsultaPAC", value = CustomPAC.class)
    public List<CustomPAC> getConsultaPAC(Integer ciclo, String fechaIni, String fechaFin);
    
    @FindByNamedQuery(name = "tnCapCurso-consulta-getConsultaPresupuesto", value = CustomPresupuestoDAO.class)
    public List<CustomPresupuestoDAO> getConsultaPresupuesto(Integer ciclo, String fechaIni, String fechaFin);
    
    @FindByNamedQuery(name = "tnCapCurso-consulta-getConsultaCalendario", value = CustomCalendario.class)
    public List<CustomCalendario> getConsultaCalendario(Integer ciclo, String fechaIni, String fechaFin);
    
    @FindByNamedQuery(name = "tnCapCurso-consulta-getLayoutRhnet", value = LayoutRhnet.class)
    public List<LayoutRhnet> getLayoutRhnet(Integer ciclo, String fechaIni, String fechaFin);

    @FindByNamedQuery(name = "consulta-getReporteRhnet", value = CustomOutputFile.class)
    public List<CustomOutputFile> getReporteRhnet(Integer ciclo, Integer trimestre);

    /******************************************************************************************************************************************************************************/
     
     @FindByNamedQuery(name="tcCapCursoCustomParticipantesInscritos-evaluacionReaccion", value=CustomParticipantesInscritos.class)
     public List<CustomParticipantesInscritos> getParticipantesInscritosEvaluacionReacion(Integer ciclo, Integer idCurso);

    
    @FindByNamedQuery(name="SPC-capcer-consultas-secEmpl-getNombreEmpleado", value=CustomParticipantesInscritos.class)
    public List<CustomParticipantesInscritos> getNombreEmpleado(String rfcEmpleado);
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-cursosByEmpleadoDetalle", value=SecuenciaEmpleado.class)
    public List<SecuenciaEmpleado> secuenciaEmpleadoCursoDetalle(Integer idCurso, String rfcEmpleado);
    
    
    
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-instructoresByCurso", value=SecuenciaEmpleado.class)
    public List<SecuenciaEmpleado> getInstructoresByCurso(Integer IdCurso);
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-instrByCursoBitacora", value=SecuenciaEmpleado.class)
    public List<SecuenciaEmpleado> getInstrByCursoBitacora(Integer idCurso);



    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-cursoByInstructorDetalle", value=SecuenciaInstructor.class)
    public List<SecuenciaInstructor> detallesCursoByInstructor(Integer idCurso);
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-instructoresByCursoInstr", value=SecuenciaInstructor.class)
    public List<SecuenciaInstructor> getInstructoresByCursoInstr(Integer IdCurso);
       
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-instrByCursoBitacoraInstr", value=SecuenciaInstructor.class)
    public List<SecuenciaInstructor> getInstrByCursoBitacoraInstr(Integer idCurso);
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-estadisticaByInstructor", value=SecuenciaInstructor.class)
    public List<SecuenciaInstructor> getEstadisticasByInstructor(Integer idCurso);
    
    @FindByNamedQuery(name="spc-capcer-consultas-secuenciaEmpleados-getTipoInstructor", value=SecuenciaInstructor.class)
    public List<SecuenciaInstructor> getTipoInstructor(Long idInstructor, Long idInstructor1, Long idInstructor2, Long idInstructor3);
}
