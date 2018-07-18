package gob.shcp.sireh.control.spc.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ComprobanteCurso {
    
    private java.lang.Integer idCurso;
    private java.lang.String idCursoPrincipal;
    private java.lang.String descCursoPrincipal;
    private java.lang.String idUnidad;
    private java.lang.String descUnidad;
    private java.lang.String idSede;
    private java.lang.String descSede;
    private java.util.Date cursoFecIni;
    private java.util.Date cursoFecFin;
    private java.lang.Float cursoDuracion;
    private java.lang.String idAula;
    private java.lang.String descAula;
    private java.lang.String rfcEmpleado;
    private java.lang.String participanteNombre;
    private java.lang.String participantePrimerApellido;
    private java.lang.String participanteSegundoApellido;
    
    @XmlElement
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }
    
    @XmlElement
    public void setIdCursoPrincipal(String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
    }

    public String getIdCursoPrincipal() {
        return idCursoPrincipal;
    }
    
    @XmlElement
    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }
    
    @XmlElement
    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdUnidad() {
        return idUnidad;
    }
    
    @XmlElement
    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }
    
    @XmlElement
    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getIdSede() {
        return idSede;
    }
    
    @XmlElement
    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }

    public String getDescSede() {
        return descSede;
    }
    
    @XmlElement
    public void setCursoFecIni(Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    public Date getCursoFecIni() {
        return cursoFecIni;
    }
    
    @XmlElement
    public void setCursoFecFin(Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    public Date getCursoFecFin() {
        return cursoFecFin;
    }
    
    @XmlElement
    public void setCursoDuracion(java.lang.Float cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
    }

    public java.lang.Float getCursoDuracion() {
        return cursoDuracion;
    }
    
    @XmlElement
    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public String getIdAula() {
        return idAula;
    }
    
    @XmlElement
    public void setDescAula(String descAula) {
        this.descAula = descAula;
    }

    public String getDescAula() {
        return descAula;
    }
    
    @XmlElement
    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }
    
    @XmlElement
    public void setParticipanteNombre(String participanteNombre) {
        this.participanteNombre = participanteNombre;
    }

    public String getParticipanteNombre() {
        return participanteNombre;
    }
    
    @XmlElement
    public void setParticipantePrimerApellido(String participantePrimerApellido) {
        this.participantePrimerApellido = participantePrimerApellido;
    }

    public String getParticipantePrimerApellido() {
        return participantePrimerApellido;
    }
    
    @XmlElement
    public void setParticipanteSegundoApellido(String participanteSegundoApellido) {
        this.participanteSegundoApellido = participanteSegundoApellido;
    }

    public String getParticipanteSegundoApellido() {
        return participanteSegundoApellido;
    }
}
