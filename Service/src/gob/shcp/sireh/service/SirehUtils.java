package gob.shcp.sireh.service;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCur;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraCont;
import gob.shcp.sireh.domain.jdbc.spc.TnCapContratoCur;
import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapFacturaCurso;
import gob.shcp.sireh.domain.jdbc.spc.TnCapParticipante;

import java.sql.Clob;

import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sql.rowset.serial.SerialException;

import org.apache.commons.lang.time.DateUtils;

import org.springframework.beans.BeanUtils;

public class SirehUtils {
    private static int flag;
    public static int numero;
    public static String importe_parcial;
    public static String num;
    public static String num_letra;
    public static String num_letras;
    public static String num_letram;
    public static String num_letradm;
    public static String num_letracm;
    public static String num_letramm;
    public static String num_letradmm;
    
    public static final String RETROACTIVO_PAGO = "RETROACTIVO_PAGO";
    public static final String RETROACTIVO_CONTRATACION = "RETROACTIVO_CONTRATACION";
    public static final int RETROACTIVO_PAGO_DEFAULT = 90;
    public static final int RETROACTIVO_CONTRATACION_DEFAULT = 300;

    /**
     * Metodo encargado de agregar dias a la Fecha correspondiente.
     * @author Oscar S.
     * @param  fecha Date
     * @param  dias int
     * @return Date
     */
    public static Date agregarDias(Date fecha, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setLenient(false);
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_MONTH, dias);
        return new Date(cal.getTimeInMillis());
    }

    /**
     * Metodo encargado de comparar la Fecha límite en curso respecto a la Fecha ingresada.
     * @author Oscar S.
     * @param  fechaIni Date
     * @param  fechaFin Date
     * @param  dias int
     * @return boolean
     */
    public static boolean validaFechaFinalConSuma(Date fechaIni, Date fechaFin, String dias) {
        Integer diasRetro = null;
        try {
            diasRetro = new Integer(dias);
        } catch (Exception e) {

            diasRetro = new Integer(RETROACTIVO_CONTRATACION_DEFAULT); //default
        }
        
        Date retroactivoContratacion = agregarDias(fechaIni, diasRetro);
        if (fechaFin.compareTo(retroactivoContratacion) <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de comparar la Fecha límite en curso respecto a la Fecha ingresada.
     * @author Oscar S.
     * @param  mepQnaCaptura String
     * @param  fechaFinal Date
     * @return boolean
     */
    public static boolean validaFechaFinal(String mepQnaCaptura, Date fechaFinal) {
        // Año en curso
        String qnaCapturaAnio = mepQnaCaptura.substring(0, 4);

        // Genera fecha
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = qnaCapturaAnio + "-12-31";
        Date fecLimite = new Date();
        try {
            fecLimite = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        // Compara Fechas
        if (fechaFinal.compareTo(fecLimite) <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de comparar la quincena de captura respecto a la Fecha de aplicación.
     * @author Oscar S.
     * @param  mepQnaCaptura String
     * @param  fechaAplicacion Date
     * @return boolean
     */
    public static boolean comparaQuincenaCaptura(Integer mepQnaCaptura, Date fechaAplicacion) {
        Date finQnaCaptura = getQuincenaCapturaAsDate(mepQnaCaptura, 'F');
        if (DateUtils.truncate(fechaAplicacion, Calendar.DATE).after(DateUtils.truncate(finQnaCaptura, Calendar.DATE))) {
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de comparar la quincena de captura respecto a la Fecha de aplicación y al Retroactivo de 45 días.
     * @author Oscar S.
     * @param  mepQnaCaptura String
     * @param  fechaAplicacion Date
     * @return boolean
     */
    public static boolean comparaQuincenaCapturaRetroactivo(Integer mepQnaCaptura, Date fechaAplicacion, String dias) {
        Integer diasRetro = null;
        try {
            diasRetro = new Integer(dias);
        } catch (Exception e) {
            diasRetro = new Integer(RETROACTIVO_PAGO_DEFAULT); //default
        }
        Date finQnaCaptura = getQuincenaCapturaAsDate(mepQnaCaptura, 'F');

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(finQnaCaptura);
        c.add(Calendar.DATE, diasRetro);

        Date retroactivo = new Date(c.getTimeInMillis());
        if (fechaAplicacion.compareTo(retroactivo) <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de verificar si la fecha de liberacion esta dentro del rango retroactivo de 45 días.
     * @author Oscar S.
     * @param  fechaliberacion Date
     * @return boolean
     */
    public static boolean comparaFechaLiberacionRetroactivo(Date fechaliberacion, String dias) {
        Integer diasRetro = null;
        try {
            diasRetro = new Integer(dias);
        } catch (Exception e) {
            diasRetro = new Integer(RETROACTIVO_PAGO_DEFAULT); //default
        }

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, -diasRetro);

        Date retroactivo = new Date(c.getTimeInMillis());
        if (fechaliberacion.compareTo(retroactivo) > 0) {
            return true;
        }
        return false;
    }

    /**
     * Metodo encargado de crear un objeto de tipo TnMovtosEmpPla con base en los datos del Empleado y la Plaza.
     * @author Gualberto G.
     * @param empleado TdEmpleado
     * @param plaza TdPlaza
     * @param idMovtoPersona Integer
     * @param mepQnaCaptura Integer
     * @param usuario String
     * @param fecModifico Date
     * @return TnMovtosEmpPla
     */
    public static TnMovtosEmpPla transformToTnMovtosEmpPla(TdEmpleado empleado, TdPlaza plaza, Integer idMovtoPersona, Integer mepQnaCaptura, String usuario, Date fecModifico, TcAtributoPuesto tcAtributoPuesto) {
        TnMovtosEmpPla tnMovtosEmpPla = new TnMovtosEmpPla();

        //tnMovtosEmpPla.setIdMovtosEmpPla(null);
        tnMovtosEmpPla.setIdMovtoPersona(idMovtoPersona);
        tnMovtosEmpPla.setIdPlaza(plaza.getIdPlaza());
        tnMovtosEmpPla.setIdSituacionPlaza(plaza.getIdSitPlaza() != null ? plaza.getIdSitPlaza().toString() : null);
        tnMovtosEmpPla.setMepRfc(plaza.getPlazaRfc());
        tnMovtosEmpPla.setMepPlazaRespaldo(plaza.getPlazaRespaldo());
        tnMovtosEmpPla.setIdGrupoPago(plaza.getIdGrupoPago());
        tnMovtosEmpPla.setIdUnidadPre(plaza.getIdUnidadPre());
        tnMovtosEmpPla.setIdPuestoPre(plaza.getIdPuestoPre());
        tnMovtosEmpPla.setIdEdoPre(plaza.getIdEdoPre());
        tnMovtosEmpPla.setIdZonaEcoPre(plaza.getIdZonaEcoPre());
        tnMovtosEmpPla.setIdRangoPre(plaza.getIdRangoPre());
        tnMovtosEmpPla.setIdUnidadNom(plaza.getIdUnidadNom());
        tnMovtosEmpPla.setIdPuestoNom(plaza.getIdPuestoNom());

        // Obtener el Nivel Fisico
        if (plaza.getIdPuestoNom() != null) {
            tnMovtosEmpPla.setIdNivelPtoNom(tcAtributoPuesto.getIdNivelPto());
            tnMovtosEmpPla.setIdNombramientoNom(tcAtributoPuesto.getIdNombramiento());
            tnMovtosEmpPla.setIdJerarquiaNom(tcAtributoPuesto.getIdJerarquia());
        } else {
            tnMovtosEmpPla.setIdNivelPtoNom(null);
            tnMovtosEmpPla.setIdNombramientoNom(null);
            tnMovtosEmpPla.setIdJerarquiaNom(null);
        }

        tnMovtosEmpPla.setIdEdoNom(plaza.getIdEdoNom());
        tnMovtosEmpPla.setIdMuniNom(plaza.getIdMuniNom());
        tnMovtosEmpPla.setIdZonaEcoNom(plaza.getIdZonaEcoNom());
        tnMovtosEmpPla.setIdRangoNom(plaza.getIdRangoNom());
        tnMovtosEmpPla.setIdZonaDistNom(plaza.getIdZonaDistNom());
        tnMovtosEmpPla.setMepImporteHonorario(plaza.getPlazaImpHono());
        tnMovtosEmpPla.setMepUltimoMovto(plaza.getPlazaIniCont() != null ? DateUtils.truncate(plaza.getPlazaIniCont(), Calendar.DATE) : null);
        tnMovtosEmpPla.setMepIniCont(plaza.getPlazaIniCont());
        tnMovtosEmpPla.setMepFinCont(plaza.getPlazaFinCont());
        tnMovtosEmpPla.setMepIniLic(plaza.getPlazaIniLic());
        tnMovtosEmpPla.setMepFinLic(plaza.getPlazaFinLic());
        tnMovtosEmpPla.setMepQnaCaptura(mepQnaCaptura);
        tnMovtosEmpPla.setIdTipoPlaza(plaza.getIdTipoPlaza());
        tnMovtosEmpPla.setIdServPub(plaza.getIdServPub());
        tnMovtosEmpPla.setIdPtoEstrategico(plaza.getIdPtoEstrategico());
        tnMovtosEmpPla.setIdInmueble(plaza.getIdInmueble());
        tnMovtosEmpPla.setMepEdif(plaza.getPlazaEdif());
        tnMovtosEmpPla.setMepPiso(plaza.getPlazaPiso());
        tnMovtosEmpPla.setMepAla(plaza.getPlazaAla());
        tnMovtosEmpPla.setMepOfna(plaza.getPlazaOfna());
        tnMovtosEmpPla.setMepTelOf1(plaza.getPlazaTelOf1());
        tnMovtosEmpPla.setMepTelOf2(plaza.getPlazaTelOf2());
        tnMovtosEmpPla.setMepConmut(plaza.getPlazaConmut());
        tnMovtosEmpPla.setMepExt1(plaza.getPlazaExt1());
        tnMovtosEmpPla.setMepExt2(plaza.getPlazaExt2());
        tnMovtosEmpPla.setMepRfcUnico(empleado.getRfcUnico()); // nuevo rfc
        tnMovtosEmpPla.setIdBancoSar(empleado.getIdBancoSar());
        tnMovtosEmpPla.setIdTipoPago(empleado.getIdTipoPago());
        tnMovtosEmpPla.setMepImssIssste(empleado.getImssIssste());
        tnMovtosEmpPla.setMepSistemaReparto(empleado.getSistemaReparto());
        tnMovtosEmpPla.setMepCurp(empleado.getCurpEmpleado());
        tnMovtosEmpPla.setMepNombre(empleado.getNombreEmpleado());
        tnMovtosEmpPla.setMepPrimerApellido(empleado.getPrimerApellido());
        tnMovtosEmpPla.setMepSegundoApellido(empleado.getSegundoApellido());
        tnMovtosEmpPla.setMepFecNacimiento(empleado.getFecNacimiento());
        tnMovtosEmpPla.setMepClabe(empleado.getClabeEmpleado());
        tnMovtosEmpPla.setMepReferenciaOficio(null);
        tnMovtosEmpPla.setMepIngresoGobFed(empleado.getIngresoGobFed());
        tnMovtosEmpPla.setMepIngresoDependencia(empleado.getIngresoDependencia());
        tnMovtosEmpPla.setMepCasoMuestra(empleado.getCasoMuestra());
        tnMovtosEmpPla.setMepCalleParticular(empleado.getCalleParticular());
        tnMovtosEmpPla.setMepColoniaParticular(empleado.getColoniaParticular());
        //tnMovtosEmpPla.setMepCveMuniParticular(empleado.getIdMuniParticular());
        tnMovtosEmpPla.setIdMuniParticular(empleado.getIdMuniParticular());
        //tnMovtosEmpPla.setMepCveEdoParticular(empleado.getIdEdoParticular());
        tnMovtosEmpPla.setIdEdoParticular(empleado.getIdEdoParticular());
        tnMovtosEmpPla.setMepCodpostParticular(empleado.getCodpostParticular());
        tnMovtosEmpPla.setMepTelParticular(empleado.getTelParticular());
        tnMovtosEmpPla.setIdEdoCivil(empleado.getIdEdoCivil());
        tnMovtosEmpPla.setMepEMailOficial(empleado.getEMailOficial());
        tnMovtosEmpPla.setMepEMailPersonal(empleado.getEMailPersonal());
        //tnMovtosEmpPla.setMepCveEdoNac(empleado.getIdEdoNac());
        tnMovtosEmpPla.setIdEdoNac(empleado.getIdEdoNac());
        tnMovtosEmpPla.setIdGenero(empleado.getIdGenero());
        tnMovtosEmpPla.setIdNacionalidad(empleado.getIdNacionalidad());
        tnMovtosEmpPla.setMepDiscapacidad(empleado.getDiscapacidad());
        tnMovtosEmpPla.setIdNivelEscolar(empleado.getIdNivelEscolar());
        tnMovtosEmpPla.setIdProfnCarrera(empleado.getIdProfnCarrera());
        tnMovtosEmpPla.setIdInstEducativa(empleado.getIdInstEducativa());
        tnMovtosEmpPla.setIdInstProtcivil(empleado.getIdInstProtcivil());
        tnMovtosEmpPla.setIdEspProtcivil(empleado.getIdEspProtCivil());
        tnMovtosEmpPla.setMepEstudiaSiNo(empleado.getEstudiaSiNo());
        tnMovtosEmpPla.setMepPadreMadre(empleado.getPadreMadre());
        tnMovtosEmpPla.setMepTerminoCargoSind(empleado.getTerminoCargoSind());
        tnMovtosEmpPla.setMepCompatEmpleo(empleado.getCompatEmpleo());
        tnMovtosEmpPla.setIdRusp(empleado.getIdRusp());
        tnMovtosEmpPla.setMepFecNotDecPatr(empleado.getFecNotDecPatr());
        tnMovtosEmpPla.setMepFecIniDeclPatr(empleado.getFecIniDeclPatr());
        tnMovtosEmpPla.setMepFecIngSpc(empleado.getFecIngSpc());

        tnMovtosEmpPla.setMepSpcAnioAnt(null);
        tnMovtosEmpPla.setIdUnidadNomAnt(null);
        tnMovtosEmpPla.setIdPuestoNomAnt(null);
        tnMovtosEmpPla.setIdEdoNomAnt(null);
        tnMovtosEmpPla.setIdMuniNomAnt(null);
        tnMovtosEmpPla.setIdZonaEcoNomAnt(null);
        tnMovtosEmpPla.setIdRangoNomAnt(null);
        tnMovtosEmpPla.setIdNombramientoAnt(null);
        tnMovtosEmpPla.setMepPlazaAnt(null);
        tnMovtosEmpPla.setIdNivelPtoAnt(null);
        tnMovtosEmpPla.setIdJerarquiaAnt(null);
        tnMovtosEmpPla.setUsuario(usuario);
        tnMovtosEmpPla.setFecModifico(fecModifico);

        return tnMovtosEmpPla;
    }
    
    /**
     * Metodo encargado de crear un objeto de tipo TnCapBitacoraCurso con base en los datos del curso y participante.
     * @author Oscar S.
     * @param curso TnCapCurso
     * @param participante TnCapParticipante
     * @param usuario String
     * @param fecModifico Date
     * @return tnCapBitacora TnCapBitacoraCurso
     */
    public static TnCapBitacoraCur transformToTnCapBitacora(TnCapCurso curso, TnCapParticipante participante, String usuario, Date fecModifico) {
        TnCapBitacoraCur tnCapBitacora = new TnCapBitacoraCur();
        
        // Datos del curso
        tnCapBitacora.setIdCurso(curso.getIdCurso() != null ? curso.getIdCurso() : 0);
        tnCapBitacora.setIdEjeTematico(curso.getIdEjeTematico() != null ? curso.getIdEjeTematico() : "");
        tnCapBitacora.setIdTipoCurso(curso.getIdTipoCurso() != null ? curso.getIdTipoCurso() : "");
        tnCapBitacora.setCicloEjeTematico(curso.getCicloEjeTematico() != null ? curso.getCicloEjeTematico() : 0);
        tnCapBitacora.setIdCoordinacion(curso.getIdCoordinacion() != null ? curso.getIdCoordinacion() : "");
        tnCapBitacora.setIdCursoPrincipal(curso.getIdCursoPrincipal() != null ? curso.getIdCursoPrincipal() : "");
        tnCapBitacora.setCursoClave(curso.getCursoClave() != null ? curso.getCursoClave() : "");
        tnCapBitacora.setIdNivelCurso(curso.getIdNivelCurso() != null ? curso.getIdNivelCurso() : 0);
        tnCapBitacora.setIdSubprograma(curso.getIdSubprograma() != null ? curso.getIdSubprograma() : "");
        tnCapBitacora.setIdSituacionCurso(curso.getIdSituacionCurso() != null ? curso.getIdSituacionCurso() : "");
        tnCapBitacora.setCursoFecIni(curso.getCursoFecIni());
        tnCapBitacora.setCursoFecFin(curso.getCursoFecFin());
        //tnCapBitacora.setIdHorarioCurso(curso.getIdHorarioCurso() != null ? curso.getIdHorarioCurso() : "");
        //tnCapBitacora.setCursoHorarioObser(curso.getCursoHorarioObser() != null ? curso.getCursoHorarioObser() : "");
        tnCapBitacora.setCursoDuracion(curso.getCursoDuracion() != null ? curso.getCursoDuracion() : 0);
        tnCapBitacora.setCursoPresupuesto(curso.getCursoPresupuesto() > 0 ? curso.getCursoPresupuesto() : 0);
        tnCapBitacora.setIdSede(curso.getIdSede() != null ? curso.getIdSede() : "");
        tnCapBitacora.setIdAula(curso.getIdAula() != null ? curso.getIdAula() : "");
        tnCapBitacora.setIdTipoCapacidad(curso.getIdTipoCapacidad() != null ? curso.getIdTipoCapacidad() : "");
        tnCapBitacora.setCursoClaveCertificacion(curso.getCursoClaveCertificacion() != null ? curso.getCursoClaveCertificacion() : "");
        tnCapBitacora.setCursoParticipantes(curso.getCursoParticipantes() != null ? curso.getCursoParticipantes() : 0);
        tnCapBitacora.setCursoMinimoParticipantes(curso.getCursoMinimoParticipantes() != null ? curso.getCursoMinimoParticipantes() : 0);
        tnCapBitacora.setIdProveedor(curso.getIdProveedor() != null ? curso.getIdProveedor() : "");
        tnCapBitacora.setIdSituacionProveedor(curso.getIdSituacionProveedor() != null ? curso.getIdSituacionProveedor() : 0);
        tnCapBitacora.setIdInstructorTitular(curso.getIdInstructorTitular() != null ? curso.getIdInstructorTitular() : 0);
        tnCapBitacora.setIdInstructorSuplente(curso.getIdInstructorSuplente() != null ? curso.getIdInstructorSuplente() : 0);
        tnCapBitacora.setIdContratoCurso(curso.getIdContratoCurso() != null ? curso.getIdContratoCurso() : 0);
        tnCapBitacora.setCursoSupervisorInst(curso.getCursoSupervisorInst() != null ? curso.getCursoSupervisorInst() : "");
        tnCapBitacora.setRfcOperDgrh(curso.getRfcOperDgrh() != null ? curso.getRfcOperDgrh() : "");
        tnCapBitacora.setIdControlCurso(curso.getIdControlCurso() != null ? curso.getIdControlCurso() : "");
        
        // Datos del participante
        tnCapBitacora.setRfcEmpleado(participante.getRfcEmpleado() != null ? participante.getRfcEmpleado() : "");
        tnCapBitacora.setParticipanteNombre(participante.getParticipanteNombre() != null ? participante.getParticipanteNombre() : "");
        tnCapBitacora.setParticipantePrimerApellido(participante.getParticipantePrimerApellido() != null ? participante.getParticipantePrimerApellido() : "");
        tnCapBitacora.setParticipanteSegundoApellido(participante.getParticipanteSegundoApellido() != null ? participante.getParticipanteSegundoApellido() : "");
        tnCapBitacora.setIdUnidad(participante.getIdUnidad() != null ? participante.getIdUnidad() : "");
        tnCapBitacora.setIdPuestoNom(participante.getIdPuestoNom() != null ? participante.getIdPuestoNom() : "");
        tnCapBitacora.setIdNivelPto(participante.getIdNivelPto() != null ? participante.getIdNivelPto() : "");
        tnCapBitacora.setIdGenero(participante.getIdGenero() != null ? participante.getIdGenero() : "");
        tnCapBitacora.setParticipanteAsistencia(participante.getParticipanteAsistencia());
        tnCapBitacora.setParticipanteCalificacionIni(participante.getParticipanteCalificacionIni());
        tnCapBitacora.setParticipanteCalificacionFin(participante.getParticipanteCalificacionFin());
        tnCapBitacora.setParticipanteNotificacion(participante.getParticipanteNotificacion());
        tnCapBitacora.setParticipanteEmail(participante.getParticipanteEmail() != null ? participante.getParticipanteEmail() : "");
        tnCapBitacora.setParticipanteObservaciones(participante.getParticipanteObservaciones() != null ? participante.getParticipanteObservaciones() : "");
        tnCapBitacora.setParticipanteIdRusp(participante.getParticipanteIdRusp() != null ? participante.getParticipanteIdRusp() : "");
        tnCapBitacora.setParticipanteCurp(participante.getParticipanteCurp() != null ? participante.getParticipanteCurp() : "");
        tnCapBitacora.setParticipanteUrRepoOm(participante.getParticipanteUrRepoOm() != null ? participante.getParticipanteUrRepoOm() : 0);
        tnCapBitacora.setParticipanteDg(participante.getParticipanteDg() != null ? participante.getParticipanteDg() : 0);
        tnCapBitacora.setParticipanteCategoriaRusp(participante.getParticipanteCategoriaRusp() != null ? participante.getParticipanteCategoriaRusp() : "");
        tnCapBitacora.setParticipanteClasifRusp(participante.getParticipanteClasifRusp() != null ? participante.getParticipanteClasifRusp() : "");
        tnCapBitacora.setParticipanteCerEvaFecha1(participante.getParticipanteCerEvaFecha1());
        tnCapBitacora.setParticipanteCerEvaFecha2(participante.getParticipanteCerEvaFecha2());
        tnCapBitacora.setParticipanteCerEvaCalif1(participante.getParticipanteCerEvaCalif1());
        tnCapBitacora.setParticipanteCerEvaCalif2(participante.getParticipanteCerEvaCalif2());
        tnCapBitacora.setIdSituacionParticipante(participante.getIdSituacionParticipante());
        
        tnCapBitacora.setUsuario(usuario);
        tnCapBitacora.setFecModifico(fecModifico); 
        
        return tnCapBitacora;
    }
    
    /**
     * Metodo encargado de crear un objeto de tipo TnCapBitacoraContrato con base en los datos del contrato y factura
     * @author Oscar S.
     * @param tnCapContratoCurso TnCapContratoCurso
     * @param tnCapFacturaCurso TnCapFacturaCurso
     * @param usuario String
     * @param fecModifico Date
     * @return tnCapBitacoraContrato TnCapBitacoraContrato
     */
    public static TnCapBitacoraCont transformToTnCapBitacoraContrato(TnCapContratoCur tnCapContratoCurso, TnCapFacturaCurso tnCapFacturaCurso, String usuario, Date fecModifico) {
        TnCapBitacoraCont tnCapBitacoraContrato = new TnCapBitacoraCont();
        
        // Datos del contrato
        tnCapBitacoraContrato.setIdContratoCurso(tnCapContratoCurso.getIdContratoCurso() != null ? tnCapContratoCurso.getIdContratoCurso() : 0);
        tnCapBitacoraContrato.setIdTipoContratacion(tnCapContratoCurso.getIdTipoContratacion());
        tnCapBitacoraContrato.setContratoCursoCiclo(tnCapContratoCurso.getContratoCursoCiclo());
        tnCapBitacoraContrato.setContratoCursoNumero(tnCapContratoCurso.getContratoCursoNumero() != null ? tnCapContratoCurso.getContratoCursoNumero() : "");
        tnCapBitacoraContrato.setContratoCursoDesc(tnCapContratoCurso.getContratoCursoDesc() != null ? tnCapContratoCurso.getContratoCursoDesc() : "");
        tnCapBitacoraContrato.setContratoCursoRepresentante(tnCapContratoCurso.getContratoCursoRep1() != null ? tnCapContratoCurso.getContratoCursoRep1() : "");
        tnCapBitacoraContrato.setContratoCursoAdministrador(tnCapContratoCurso.getContratoCursoAdministrador() != null ? tnCapContratoCurso.getContratoCursoAdministrador() : "");
        tnCapBitacoraContrato.setContratoCursoMonto(tnCapContratoCurso.getContratoCursoMonto() != null ? tnCapContratoCurso.getContratoCursoMonto() : 0.0);
        tnCapBitacoraContrato.setContratoCursoFecha(tnCapContratoCurso.getContratoCursoFechaAdjud());
        tnCapBitacoraContrato.setIdSituacionContrato(tnCapContratoCurso.getIdSituacionContrato());
        
        // Datos de la factura
        tnCapBitacoraContrato.setIdCurso(tnCapFacturaCurso.getIdCurso() != null ? tnCapFacturaCurso.getIdCurso() : 0);
        tnCapBitacoraContrato.setFacturaFolio(tnCapFacturaCurso.getFacturaFolio() != null ? tnCapFacturaCurso.getFacturaFolio() : "");
        tnCapBitacoraContrato.setFacturaMonto(tnCapFacturaCurso.getFacturaMonto());
        tnCapBitacoraContrato.setFacturaFecha(tnCapFacturaCurso.getFacturaFecha());
        tnCapBitacoraContrato.setFacturaAtentaNotaNumero(tnCapFacturaCurso.getFacturaAtentaNotaNumero() != null ? tnCapFacturaCurso.getFacturaAtentaNotaNumero() : "");
        tnCapBitacoraContrato.setFacturaAtentaNotaFecha(tnCapFacturaCurso.getFacturaAtentaNotaFecha());
        tnCapBitacoraContrato.setIdSituacionFactura(tnCapFacturaCurso.getIdSituacionFactura());
        
        tnCapBitacoraContrato.setUsuario(usuario);
        tnCapBitacoraContrato.setFecModifico(fecModifico);
        
        return tnCapBitacoraContrato;
    }

    /**
     * Metodo encargado de obtener la quincena de captura como Date
     * @author Gualberto G.
     * @param quincenaCaptura
     * @param tipo char
     * @return  Date
     */
    public static Date getQuincenaCapturaAsDate(Integer quincenaCaptura, char tipo) {
        if (quincenaCaptura == null || quincenaCaptura.toString().length() != 6 && (tipo == 'I' || tipo == 'F')) {
            return null;
        }
        Integer anio = Integer.parseInt(quincenaCaptura.toString().substring(0, 4));
        Integer quincena = Integer.parseInt(quincenaCaptura.toString().substring(4));
        Calendar anioMesdiaQuincena = Calendar.getInstance();
        anioMesdiaQuincena.set(anio, (quincena - 1) / 2, 1);
        anioMesdiaQuincena.set(anio, tipo == 'I' ? (quincena - 1) / 2 : (quincena - 1) / 2, quincena % 2 == 1 ? (tipo == 'I' ? 1 : 15) : (tipo == 'I' ? 16 : anioMesdiaQuincena.getActualMaximum(Calendar.DAY_OF_MONTH)));
        return anioMesdiaQuincena.getTime();
    }
    
    /**
     * Obtiene el anio a partir de una fecha
     * @param date
     * @return int
     */
    public static int getYearFromDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int anio = (int)calendar.get(Calendar.YEAR);
        return anio;
    }

    /**
     * Metodo encargado de obtener la quincena de captura como Integer a partir de un Date
     * @author Gualberto G.
     * @param fechaQuincena
     * @return Integer
     */
    public static Integer getQuincenaCapturaAsInteger(Date fechaQuincena) {
        if (fechaQuincena == null) {
            return null;
        }

        Calendar fechaQuincenaCalendar = Calendar.getInstance();
        fechaQuincenaCalendar.setTime(fechaQuincena);
        int anio = fechaQuincenaCalendar.get(Calendar.YEAR);
        int mes = fechaQuincenaCalendar.get(Calendar.MONTH) + 1;
        int dia = fechaQuincenaCalendar.get(Calendar.DAY_OF_MONTH);
        int quincena;
        if (dia >= 1 && dia <= 15) {
            quincena = (mes * 2) - 1;
        } else {
            quincena = (mes * 2);
        }

        return Integer.valueOf(anio * 100 + quincena);
    }

    public static void copyProperties(Object destino, Object fuente) {
        BeanUtils.copyProperties(fuente, destino);
    }

    public static Integer getCurrentYear() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        Integer anio = new Integer((int)c.get(Calendar.YEAR));
        return anio;
    }

    public static Integer substractQuincena(Integer quincenaCaptura, Integer subtrahend) {
        String quincenaCapturaString = quincenaCaptura.toString();
        int ciclo = Integer.parseInt(quincenaCapturaString.substring(0, 4));
        int quincena = Integer.parseInt(quincenaCapturaString.substring(4));
        int aniosSub = subtrahend / 24;
        int quincenasSub = subtrahend % 24;
        int cicloresultado = ciclo - aniosSub;
        int quincenaResultado = quincena - quincenasSub;
        
        if (quincenaResultado <= 0) {
            cicloresultado -= 1;
            quincenaResultado = 24 - (quincenaResultado * -1);
        }

        if (quincenaResultado < 10) {
            return Integer.parseInt(cicloresultado + "0" + quincenaResultado);
        }
        return Integer.parseInt(cicloresultado + "" + quincenaResultado);
    }
    
    public static Integer addQuincena(Integer quincenaCaptura, Integer addend) {
        String quincenaCapturaString = quincenaCaptura.toString();
        int ciclo = Integer.parseInt(quincenaCapturaString.substring(0, 4));
        int quincena = Integer.parseInt(quincenaCapturaString.substring(4));
        int aniosAdded = addend / 24;
        int quincenasAdded = addend % 24;
        int cicloresultado = ciclo + aniosAdded;
        int quincenaResultado = quincena + quincenasAdded;
        
        if (quincenaResultado > 24) {
            cicloresultado += 1;
            quincenaResultado -= 24;
        }
        if (quincenaResultado < 10) {
            return Integer.parseInt(cicloresultado + "0" + quincenaResultado);
        }
        return Integer.parseInt(cicloresultado + "" + quincenaResultado);
    }
    
    public static String convertirLetras(int numero) {
        num_letras = decmillon(numero);
        return num_letras;
    }

    private static String unidad(int numero) {

        switch (numero) {
        case 9:
            num = "nueve";
            break;
        case 8:
            num = "ocho";
            break;
        case 7:
            num = "siete";
            break;
        case 6:
            num = "seis";
            break;
        case 5:
            num = "cinco";
            break;
        case 4:
            num = "cuatro";
            break;
        case 3:
            num = "tres";
            break;
        case 2:
            num = "dos";
            break;
        case 1:
            if (flag == 0)
                num = "uno";
            else
                num = "un";
            break;
        case 0:
            num = "";
            break;
        }
        return num;
    }

    private static String decena(int numero) {

        if (numero >= 90 && numero <= 99) {
            num_letra = "noventa ";
            if (numero > 90)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 90));
        } else if (numero >= 80 && numero <= 89) {
            num_letra = "ochenta ";
            if (numero > 80)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 80));
        } else if (numero >= 70 && numero <= 79) {
            num_letra = "setenta ";
            if (numero > 70)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 70));
        } else if (numero >= 60 && numero <= 69) {
            num_letra = "sesenta ";
            if (numero > 60)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 60));
        } else if (numero >= 50 && numero <= 59) {
            num_letra = "cincuenta ";
            if (numero > 50)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 50));
        } else if (numero >= 40 && numero <= 49) {
            num_letra = "cuarenta ";
            if (numero > 40)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 40));
        } else if (numero >= 30 && numero <= 39) {
            num_letra = "treinta ";
            if (numero > 30)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 30));
        } else if (numero >= 20 && numero <= 29) {
            if (numero == 20)
                num_letra = "veinte ";
            else
                num_letra = "veinti".concat(unidad(numero - 20));
        } else if (numero >= 10 && numero <= 19) {
            switch (numero) {
            case 10:
                num_letra = "diez ";
                break;
            case 11:
                num_letra = "once ";
                break;
            case 12:
                num_letra = "doce ";
                break;
            case 13:
                num_letra = "trece ";
                break;
            case 14:
                num_letra = "catorce ";
                break;
            case 15:
                num_letra = "quince ";
                break;
            case 16:
                num_letra = "dieciseis ";
                break;
            case 17:
                num_letra = "diecisiete ";
                break;
            case 18:
                num_letra = "dieciocho ";
                break;
            case 19:
                num_letra = "diecinueve ";
                break;
            }
        } else
            num_letra = unidad(numero);

        return num_letra;
    }

    private static String centena(int numero) {
        if (numero >= 100) {
            if (numero >= 900 && numero <= 999) {
                num_letra = "novecientos ";
                if (numero > 900)
                    num_letra = num_letra.concat(decena(numero - 900));
            } else if (numero >= 800 && numero <= 899) {
                num_letra = "ochocientos ";
                if (numero > 800)
                    num_letra = num_letra.concat(decena(numero - 800));
            } else if (numero >= 700 && numero <= 799) {
                num_letra = "setecientos ";
                if (numero > 700)
                    num_letra = num_letra.concat(decena(numero - 700));
            } else if (numero >= 600 && numero <= 699) {
                num_letra = "seiscientos ";
                if (numero > 600)
                    num_letra = num_letra.concat(decena(numero - 600));
            } else if (numero >= 500 && numero <= 599) {
                num_letra = "quinientos ";
                if (numero > 500)
                    num_letra = num_letra.concat(decena(numero - 500));
            } else if (numero >= 400 && numero <= 499) {
                num_letra = "cuatrocientos ";
                if (numero > 400)
                    num_letra = num_letra.concat(decena(numero - 400));
            } else if (numero >= 300 && numero <= 399) {
                num_letra = "trescientos ";
                if (numero > 300)
                    num_letra = num_letra.concat(decena(numero - 300));
            } else if (numero >= 200 && numero <= 299) {
                num_letra = "doscientos ";
                if (numero > 200)
                    num_letra = num_letra.concat(decena(numero - 200));
            } else if (numero >= 100 && numero <= 199) {
                if (numero == 100)
                    num_letra = "cien ";
                else
                    num_letra = "ciento ".concat(decena(numero - 100));
            }
        } else
            num_letra = decena(numero);

        return num_letra;
    }

    private static String miles(int numero) {
        if (numero >= 1000 && numero < 2000) {
            num_letram = ("mil ").concat(centena(numero % 1000));
        }
        if (numero >= 2000 && numero < 10000) {
            flag = 1;
            num_letram = unidad(numero / 1000).concat(" mil ").concat(centena(numero % 1000));
        }
        if (numero < 1000)
            num_letram = centena(numero);

        return num_letram;
    }

    private static String decmiles(int numero) {
        if (numero == 10000)
            num_letradm = "diez mil";
        if (numero > 10000 && numero < 20000) {
            flag = 1;
            num_letradm = decena(numero / 1000).concat("mil ").concat(centena(numero % 1000));
        }
        if (numero >= 20000 && numero < 100000) {
            flag = 1;
            num_letradm = decena(numero / 1000).concat(" mil ").concat(miles(numero % 1000));
        }
        if (numero < 10000)
            num_letradm = miles(numero);

        return num_letradm;
    }

    private static String cienmiles(int numero) {
        if (numero == 100000)
            num_letracm = "cien mil";
        if (numero >= 100000 && numero < 1000000) {
            flag = 1;
            num_letracm = centena(numero / 1000).concat(" mil ").concat(centena(numero % 1000));
        }
        if (numero < 100000)
            num_letracm = decmiles(numero);
        return num_letracm;
    }

    private static String millon(int numero) {
        if (numero >= 1000000 && numero < 2000000) {
            flag = 1;
            num_letramm = ("Un millon ").concat(cienmiles(numero % 1000000));
        }
        if (numero >= 2000000 && numero < 10000000) {
            flag = 1;
            num_letramm = unidad(numero / 1000000).concat(" millones ").concat(cienmiles(numero % 1000000));
        }
        if (numero < 1000000)
            num_letramm = cienmiles(numero);

        return num_letramm;
    }

    private static String decmillon(int numero) {
        if (numero == 10000000)
            num_letradmm = "diez millones";
        if (numero > 10000000 && numero < 20000000) {
            flag = 1;
            num_letradmm = decena(numero / 1000000).concat("millones ").concat(cienmiles(numero % 1000000));
        }
        if (numero >= 20000000 && numero < 100000000) {
            flag = 1;
            num_letradmm = decena(numero / 1000000).concat(" milllones ").concat(millon(numero % 1000000));
        }
        if (numero < 10000000)
            num_letradmm = millon(numero);

        return num_letradmm;
    }

    public static String getElementFromPattern(String pattern, List<String> lista) {
        
        Pattern patern = Pattern.compile(pattern);
        for (String cadena: lista) {
            Matcher mat = patern.matcher(cadena);
            if (mat.find()) {
                return cadena;
            }
        }
        return null;
    }
    
    public static Clob stringToClob(String cadena){
    Clob myClob;
        try {
            myClob = new javax.sql.rowset.serial.SerialClob(cadena.toCharArray());
        } catch (SerialException e) {
             throw new ServiceException("Error: " + e.getMessage());
        } catch (SQLException e) {
             throw new ServiceException("Error: " + e.getMessage());
        }
        return (Clob) myClob;
    }
}
