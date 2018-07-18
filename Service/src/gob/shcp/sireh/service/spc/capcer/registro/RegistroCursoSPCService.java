package gob.shcp.sireh.service.spc.capcer.registro;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.TcAtributoPuestoDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import gob.shcp.sireh.model.spc.TcCapAulaDTO;
import gob.shcp.sireh.model.spc.TcCapCursoPrincpDTO;
import gob.shcp.sireh.model.spc.TcCapNotifCursoDTO;
import gob.shcp.sireh.model.spc.TcCapProveedorDTO;
import gob.shcp.sireh.model.spc.TnCapContratoCurDTO;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;
import gob.shcp.sireh.model.spc.TnCapFacturaCursoDTO;
import gob.shcp.sireh.model.spc.TnCapParticipanteDTO;
import gob.shcp.sireh.model.spc.TnCapCalCursoDTO;
import gob.shcp.sireh.model.spc.TnCapBitacoraInstDTO;

import gob.shcp.sireh.model.spc.registro.AsignarInstructorDTO;
import gob.shcp.sireh.model.spc.registro.AsignarParticipanteDTO;
import gob.shcp.sireh.model.spc.registro.CustomAltaContratoDTO;
import gob.shcp.sireh.model.spc.registro.CustomCursosFacturasDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesCandidatosDTO;
import gob.shcp.sireh.model.spc.registro.CustomParticipantesInscritosDTO;
import gob.shcp.sireh.model.spc.registro.CustomRegistroCursoDTO;
import gob.shcp.sireh.model.spc.registro.RegistroCalendarioDTO;
import gob.shcp.sireh.model.spc.registro.CustomAsignarContratoDTO;

import gob.shcp.sireh.model.spc.registro.CustomTnCapCalendarioCursoDTO;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface RegistroCursoSPCService extends BusinessService {
    
    /**
     * Metodo encargado de obtener datos del curso con base en su clave de curso.
     * @author Oscar S.
     * @param cicloEjeTematico Integer
     * @param cursoClave String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TnCapCursoDTO getCursoByClave(Integer cicloEjeTematico, String cursoClave);
    
    /**
     * Metodo encargado de obtener los datos del Curso con base en su id.
     * @author Oscar S.
     * @param idCurso Integer
     * @return customRegistroCursoDTO CustomRegistroCursoDTO
     */
    public CustomRegistroCursoDTO getCursoRegistro(Integer idCurso);

    /**
     * Metodo que Registra el curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     */
    public void saveRegistroCurso(TnCapCursoDTO tnCapCursoDTO);

    /**
     * Metodo que Elimina el curso con base en el objeto idCursos
     * @author Oscar S.
     * @param idCursos Integer[]
     */
    public void deleteRegistroCurso(Integer[] idCursos);

    /**
     * Metodo que Actualiza el curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     */
    public void updateRegistroCurso(TnCapCursoDTO tnCapCursoDTO, int idMovimiento);
    
    /**
     * Metodo que Actualiza el curso y reinicia el calendario con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     */
    public void reiniciarCalendario(TnCapCursoDTO tnCapCursoDTO, int idMovimiento);
    
    /**
     * Metodo encargado de obtener los datos de la Curso principal con base en su id.
     * @author Oscar S.
     * @param cicloEjeTematico Integer
     * @param idCursoPrincipal String
     * @param idEjeTematico String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public TcCapCursoPrincpDTO getCursoPrincipalRegistro(Integer cicloEjeTematico, String idCursoPrincipal, String idEjeTematico);

    /**
     * Metodo encargado de obtener el consecutivo actual
     * @author Oscar S.
     * @param idCursoPrincipal String
     * @param idEjeTematico String
     * @param cicloEjeTematico Integer
     * @param idTipoCurso String
     * @param idSubprograma String
     * @return tnCapCursoDTO TnCapCursoDTO
     */
    public List<TnCapCursoDTO> getConsecutivoClaveCursoCallback(String idCursoPrincipal, String idEjeTematico, Integer cicloEjeTematico, String idTipoCurso, String idSubprograma);

    /**
     * Solicitud asincrona para obtener el catalogo de ejes tematicos
     * @author Gualberto G.
     * @param idTipoCurso String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getEjeTematicoCallback(String idTipoCurso);

    /**
     * Solicitud asincrona para obtener el catalogo de modalidades
     * @author Gualberto G.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getModalidadCallback(String idEjeTematico, String idCursoPrincipal);

    /**
     * Solicitud asincrona para obtener el catalogo de finalidades
     * @author Gualberto G.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getFinalidadCallback(String idEjeTematico, String idCursoPrincipal);
    
    /**
     * Solicitud asincrona para obtener el catalogo de capacidades de certificacion.
     * @author Oscar S.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCapacidadCertCallback(String idEjeTematico, String idCursoPrincipal);
    
    /**
     * Solicitud asincrona para obtener el catalogo de caracteres
     * @author Gualberto G.
     * @param idEjeTematico String
     * @param idCursoPrincipal String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCaracterCallback(String idEjeTematico, String idCursoPrincipal);

    /**
     * Solicitud asincrona para obtener el catalogo de cursos
     * @author Gualberto G.
     * @param idEjeTematico String
     * @return listaItemDTO List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getCursoPrincipalCallback(String idEjeTematico);
    
    /**
     * Metodo encargado de obtener los datos del Proveedor con base en su id.
     * @author Oscar S.
     * @param idProveedor String
     * @return tcCapProveedorDTO TcCapProveedorDTO
     * @deprecated
     */
    public TcCapProveedorDTO getProveedorCurso(String idProveedor);

    /******************************************************************************************************************************************************************************/

    /**
     * Metodo que obtiene los datos del curso para mostrarlos en la pantalla de asignar calendario
     * @author Gualberto G.
     * @param idCurso
     * @return RegistroCalendarioDTO
     */
    public RegistroCalendarioDTO getRegistroCalendario(java.lang.Integer idCurso);

    /**
     * Metodo encargado de guardar los datos de calendarizacion ingresados en la pantalla por el usuario
     * @author Gualberto G.
     * @param registroCalendarioDTO
     */
    public void saveRegistroCalendario(RegistroCalendarioDTO registroCalendarioDTO); 
    
    /**
     * Metodo que consulta los datos de la tabla TC_CAP_AULA por idAula
     * @author Gualberto G.
     * @param idAula
     * @return TcCapAulaDTO
     */
    public TcCapAulaDTO getDatosAula(String idAula);
    

    /**
     * Obtiene los datos de la tabla TN_CAP_CAL_CURSO para un aula determinada
     * @author Gualberto G
     * @param idAula
     * @return List&ltCustomTnCapCalendarioCursoDTO&gt
     */
    public List<CustomTnCapCalendarioCursoDTO> getCalendarioByAula(String idAula);
    
    /** Obtiene los cursos que existen en el calendario en los horarios enviados como parametro
     * @author Gualberto G     
     * @param idCurso
     * @param cursoFecIni
     * @param cursoFecFin
     * @param horarioInicialLunes
     * @param horarioFinalLunes
     * @param horarioInicialMartes
     * @param horarioFinalMartes
     * @param horarioInicialMiercoles
     * @param horarioFinalMiercoles
     * @param horarioInicialJueves
     * @param horarioFinalJueves
     * @param horarioInicialViernes
     * @param horarioFinalViernes
     * @param horarioInicialSabado
     * @param horarioFinalSabado
     * @param horarioInicialDomingo
     * @param horarioFinalDomingo
     * @return List&ltCustomTnCapCalendarioCursoDTO&gt
     */
    public List<TnCapCalCursoDTO> getCalendarioCursoByDiasYHora(Integer idCurso, java.util.Date cursoFecIni, java.util.Date cursoFecFin, String idAula,
                                                                       Integer horarioInicialLunes, Integer horarioFinalLunes, 
                                                                       Integer horarioInicialMartes, Integer horarioFinalMartes, 
                                                                       Integer horarioInicialMiercoles, Integer horarioFinalMiercoles,
                                                                       Integer horarioInicialJueves, Integer horarioFinalJueves, 
                                                                       Integer horarioInicialViernes, Integer horarioFinalViernes, 
                                                                       Integer horarioInicialSabado, Integer horarioFinalSabado, 
                                                                       Integer horarioInicialDomingo, Integer horarioFinalDomingo);
                                                                             
    /******************************************************************************************************************************************************************************/

    /**
     * Metodo que obtiene los datos del curso para mostrarlos en la pantalla Asignar participante
     * @author Oscar S.
     * @param idCurso Integer
     * @return asignarParticipanteDTO AsignarParticipanteDTO
     */
    public AsignarParticipanteDTO getAsignarParticipante(Integer idCurso);

    /**
     * Metodo que obtiene el listado de participantes candidatos
     * @author Oscar S.
     * @param ciclo Integer
     * @param idCurso Integer
     * @return customParticipantesCandidatosDTO CustomParticipantesCandidatosDTO
     */
    public List<CustomParticipantesCandidatosDTO> getParticipantesCandidatos(Integer ciclo, Integer idCurso);

    /**
     * Metodo que Registra el participante con base en el objeto tnCapParticipanteDTO
     * @author Oscar S.
     * @param tnCapParticipanteDTO TnCapParticipanteDTO
     */
    public void saveInscribirParticipante(TnCapCursoDTO tnCapCursoDTO, TnCapParticipanteDTO tnCapParticipanteDTO);

    /**
     * Metodo que obtiene los datos del empleado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return tdEmpleadoDTO TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado);

    /**
     * Metodo que obtiene los datos de la plaza
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public TdPlazaDTO getPlaza(Integer idPlaza);
    
    /**
     * Metodo que obtiene los datos del atributo puesto
     * @author Oscar S.
     * @param idPuesto String
     * @return tcAtributoPuestoDTO TcAtributoPuestoDTO
     */
    public TcAtributoPuestoDTO getAtributoPuestoConEspacios(String idPuesto);
    
    /**
     * Metodo que obtiene el listado de participantes inscritos
     * @author Oscar S.
     * @param ciclo Integer
     * @param idCurso Integer
     * @return customParticipantesInscritosDTO CustomParticipantesInscritosDTO
     */
    public List<CustomParticipantesInscritosDTO> getParticipantesInscritos(Integer ciclo, Integer idCurso);

    /**
     * Metodo que desasigna al participante del curso
     * @author Oscar S.
     * @param rfcEmpleado String
     * @param asignarParticipanteDTO AsignarParticipanteDTO
     */
    public void saveCancelarParticipante(String rfcEmpleado, AsignarParticipanteDTO asignarParticipanteDTO);
    
    /**
     * Obtiene un objeto java.sql.Connection
     * @author Gualberto G.
     * @return Connection
     */
    public java.sql.Connection getConnection();
    
    /**
     * Metodo encargado de consultar los datos de la tabla TN_CAP_NOTIFICACION_CURSO por modalidad
     * @author Gualberto G.
     * @param capNotifCursoCiclo Integer
     * @param idModalidad Integer
     * @return tcCapNotifCursoDTO TcCapNotifCursoDTO
     */
    public TcCapNotifCursoDTO getTcCapNotifCurso(Integer capNotifCursoCiclo, Integer idModalidad);
    
    /**
     * Metodo encargado del envio de notificaciones por correo electronico 
     * @author Gualberto G.
     * @param operationalYear Integer
     * @param idCurso Integer
     * @param idModalidad Integer
     * @param listaMapas List&lt;Map&lt;String, Object&gt;&gt;
     */
    public void enviarMensajesCorreo(Integer operationalYear, Integer idCurso, Integer idModalidad, List<Map<String, Object>> listaMapas, String rfcSesion, String usuario);
    
    /******************************************************************************************************************************************************************************/

    /**
     * Metodo que Registra el contrato con base en el objeto tnCapContratoCursoDTO
     * @author Oscar S.
     * @param tnCapContratoCursoDTO TnCapContratoCursoDTO
     */
    public void saveContrato(TnCapContratoCurDTO tnCapContratoCursoDTO);
    
    /**
     * Metodo que obtiene los datos del contrato
     * @author Oscar S.
     * @param idContrato Integer
     * @return tnCapContratoCursoDTO TnCapContratoCursoDTO
     */
    public TnCapContratoCurDTO getContrato(Integer idContrato);
    
    /**
     * Metodo que obtiene los datos del contrato
     * @author Oscar S.
     * @param idContrato Integer
     * @return customAltaContratoDTO CustomAltaContratoDTO
     */
    public CustomAltaContratoDTO getContratoCustom(Integer idContrato);
    
    /**
     * Metodo que Actualiza los datos del contrato del curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapContratoCursoDTO TnCapContratoCursoDTO
     * @param idMovimiento int
     */
    public void updateContrato(TnCapContratoCurDTO tnCapContratoCursoDTO, int idMovimiento);

    /**
     * Solicitud asincrona para validar si un número de contrato está duplicado.
     * @author Oscar S.
     * @param numeroContrato String
     * @param ciclo Integer
     * @return boolean
     */
    public boolean getContratoCursoNumero(String numeroContrato, Integer ciclo);
    
    /**
     * Metodo que Elimina contratos con base en el objeto contratos
     * @author Oscar S.
     * @param contratos Integer[]
     */
    public void deleteContrato(Integer[] contratos);
    
    /**
     * Metodo que Actualiza los datos del contrato del curso con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     */
    public void saveAsignarContrato(TnCapCursoDTO tnCapCursoDTO);
    
    /**
     * Metodo encargado de obtener información del contrato con base en su idCurso
     * @author Oscar S.
     * @param idCurso int
     * @return customAsignarContratoDTO CustomAsignarContratoDTO
     */
    public CustomAsignarContratoDTO getAsignarContrato(int idCurso);
    
    /** 
     * Metodo encargado de obtener facturas por curso
     * @author Oscar S.
     * @param ciclo Integer
     * @param contrato Integer
     * @param fechaContrato String
     * @param cursoFacturaContrato boolean
     * @return List&lt;CustomCursosFacturasDTO&gt;
     */
    public List<CustomCursosFacturasDTO> getCursosFacturas(Integer ciclo, Integer contrato, String fechaContrato, boolean cursoFacturaContrato);
    
    /** 
     * Metodo encargado de desasignar cursos afectados por cambio en la fecha del contrato
     * @author Oscar S.
     * @param cursosAfectados List&lt;CustomCursosFacturasDTO&gt;
     */
    public void desasignaCursosPorCambioFecha(List<CustomCursosFacturasDTO> cursosAfectados);
    
    /**
     * Metodo que Asigna/Desasigna cursos al contrato con base en el objeto tnCapCursoDTO
     * @author Oscar S.
     * @param tnCapCursoDTO TnCapCursoDTO
     * @param idMovimiento int
     * @param desasignar boolean
     */
    public void saveAsignarCursoContrato(TnCapCursoDTO tnCapCursoDTO, Integer idContratoCurso, int idMovimiento, boolean desasignar);
    
    /**
     * Metodo que Asigna/Desasigna facturas al contrato con base en el objeto tnCapFacturaCursoDTO
     * @author Oscar S.
     * @param tnCapFacturaCursoDTO TnCapFacturaCursoDTO
     * @param idContratoCurso Integer
     * @param idMovimiento int
     * @param desasignar boolean
     */
    public void saveAsignarFacturaContrato(TnCapFacturaCursoDTO tnCapFacturaCursoDTO, Integer idContratoCurso, int idMovimiento, boolean desasignar);
    
    /**
     * Alta contrato - Metodo encargado de obtener el listado de situaciones validas de facturas por curso.
     * @author Oscar S.
     * @param idCurso Integer
     * @param idContratoCurso Integer
     * @param facturaFolio String
     * @param administrador boolean
     * @return estatusFacturasList List&lt;ItemDTO&gt;
     */
    public List<ItemDTO> getDynamicEstatusFacturas(Integer idCurso, Integer idContratoCurso, String facturaFolio, boolean administrador);
    
    /******************************************************************************************************************************************************************************/
    
     /**
      * Metodo que Obtiene los datos para la pantalla de Asignar Instructor
      * @author Martin C.
      * @param claveCurso String
      * @return asignarInstructorDTO AsignarInstructorDTO
      */
     public AsignarInstructorDTO getAsignarInstructor(String claveCurso);
     
     /**
      * Asigna el instructor al curso
      * @author Martin C.
      * @param asignarInstructorDTO AsignarInstructorDTO
      */
     public void saveAsignarInstructor(AsignarInstructorDTO asignarInstructorDTO);
     
     /**
      * Obtiene el instructor por su id
      * @Autor Martin C.
      * @param idInstructor Integer
      * @return String
      */
     public String getInstructor(Integer idInstructor);
     
     /**
      * Obtiene el ultimo instructor que fue desasignado
      * @Autor Martin C.
      * @return TnCapBitacoraInstrDTO
      */
     public TnCapBitacoraInstDTO getDesasignado(Integer idCurso);

    /******************************************************************************************************************************************************************************/
}
