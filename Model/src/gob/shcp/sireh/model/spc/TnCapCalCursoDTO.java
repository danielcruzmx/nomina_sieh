package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapCalendarioCurso data.
 */
public class TnCapCalCursoDTO implements java.io.Serializable, Model {

    private java.util.Date fecha;
    private java.lang.Integer idCurso;
    private java.lang.Integer idHorarioCursoFinal;
    private java.lang.Integer idHorarioCursoInicial;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;

    /**
     * Constructor for TnCapCalendarioCursoDTO class.
     */
    public TnCapCalCursoDTO() {
    }

    /**
     * Constructor for TnCapCalendarioCursoDTO class.
     *
     * @param fecha java.util.Date
     * @param idCurso java.lang.Integer
     * @param idHorarioCursoFinal java.lang.Integer
     * @param idHorarioCursoInicial java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapCalCursoDTO(java.util.Date fecha, java.lang.Integer idCurso, 
                                   java.lang.Integer idHorarioCursoFinal, java.lang.Integer idHorarioCursoInicial, 
                                   java.util.Date fecModifico, java.lang.String usuario) {
        this.fecha = fecha;
        this.idCurso = idCurso;
        this.idHorarioCursoFinal = idHorarioCursoFinal;
        this.idHorarioCursoInicial = idHorarioCursoInicial;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }
    
    /**
     * Set fecha value.
     *
     * @param fecha java.util.Date
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Get fecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecha() {
        return this.fecha;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set idHorarioCursoFinal value.
     *
     * @param idHorarioCursoFinal java.lang.Integer
     */
    public void setIdHorarioCursoFinal(java.lang.Integer idHorarioCursoFinal) {
        this.idHorarioCursoFinal = idHorarioCursoFinal;
    }

    /**
     * Get idHorarioCursoFinal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoFinal() {
        return this.idHorarioCursoFinal;
    }

    /**
     * Set idHorarioCursoInicial value.
     *
     * @param idHorarioCursoInicial java.lang.Integer
     */
    public void setIdHorarioCursoInicial(java.lang.Integer idHorarioCursoInicial) {
        this.idHorarioCursoInicial = idHorarioCursoInicial;
    }

    /**
     * Get idHorarioCursoInicial value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoInicial() {
        return this.idHorarioCursoInicial;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }
}
