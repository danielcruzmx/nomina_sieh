package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapEvaluacionCurso data.
 */
public class TnCapEvaluaCursoDTO implements java.io.Serializable, Model {

    private java.lang.Integer idCurso;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.lang.Float evaluacionCursoP1;
    private java.lang.Float evaluacionCursoP10;
    private java.lang.Float evaluacionCursoP2;
    private java.lang.Float evaluacionCursoP3;
    private java.lang.Float evaluacionCursoP4;
    private java.lang.Float evaluacionCursoP5;
    private java.lang.Float evaluacionCursoP6;
    private java.lang.Float evaluacionCursoP7;
    private java.lang.Float evaluacionCursoP8;
    private java.lang.Float evaluacionCursoP9;

    /**
     * Constructor for TnCapEvaluacionCursoDTO class.
     */
    public TnCapEvaluaCursoDTO() {
    }

    /**
     * Constructor for TnCapEvaluacionCursoDTO class.
     *
     * @param idCurso java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param evaluacionCursoP1 java.lang.Float
     * @param evaluacionCursoP10 java.lang.Float
     * @param evaluacionCursoP2 java.lang.Float
     * @param evaluacionCursoP3 java.lang.Float
     * @param evaluacionCursoP4 java.lang.Float
     * @param evaluacionCursoP5 java.lang.Float
     * @param evaluacionCursoP6 java.lang.Float
     * @param evaluacionCursoP7 java.lang.Float
     * @param evaluacionCursoP8 java.lang.Float
     * @param evaluacionCursoP9 java.lang.Float
     */
    public TnCapEvaluaCursoDTO(java.lang.Integer idCurso, java.util.Date fecModifico, java.lang.String usuario, 
                                   java.lang.Float evaluacionCursoP1, java.lang.Float evaluacionCursoP10, 
                                   java.lang.Float evaluacionCursoP2, java.lang.Float evaluacionCursoP3, 
                                   java.lang.Float evaluacionCursoP4, java.lang.Float evaluacionCursoP5, 
                                   java.lang.Float evaluacionCursoP6, java.lang.Float evaluacionCursoP7, 
                                   java.lang.Float evaluacionCursoP8, java.lang.Float evaluacionCursoP9) {
        this.idCurso = idCurso;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.evaluacionCursoP1 = evaluacionCursoP1;
        this.evaluacionCursoP10 = evaluacionCursoP10;
        this.evaluacionCursoP2 = evaluacionCursoP2;
        this.evaluacionCursoP3 = evaluacionCursoP3;
        this.evaluacionCursoP4 = evaluacionCursoP4;
        this.evaluacionCursoP5 = evaluacionCursoP5;
        this.evaluacionCursoP6 = evaluacionCursoP6;
        this.evaluacionCursoP7 = evaluacionCursoP7;
        this.evaluacionCursoP8 = evaluacionCursoP8;
        this.evaluacionCursoP9 = evaluacionCursoP9;
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

    /**
     * Set evaluacionCursoP1 value.
     *
     * @param evaluacionCursoP1 java.lang.Float
     */
    public void setEvaluacionCursoP1(java.lang.Float evaluacionCursoP1) {
        this.evaluacionCursoP1 = evaluacionCursoP1;
    }

    /**
     * Get evaluacionCursoP1 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP1() {
        return this.evaluacionCursoP1;
    }

    /**
     * Set evaluacionCursoP10 value.
     *
     * @param evaluacionCursoP10 java.lang.Float
     */
    public void setEvaluacionCursoP10(java.lang.Float evaluacionCursoP10) {
        this.evaluacionCursoP10 = evaluacionCursoP10;
    }

    /**
     * Get evaluacionCursoP10 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP10() {
        return this.evaluacionCursoP10;
    }

    /**
     * Set evaluacionCursoP2 value.
     *
     * @param evaluacionCursoP2 java.lang.Float
     */
    public void setEvaluacionCursoP2(java.lang.Float evaluacionCursoP2) {
        this.evaluacionCursoP2 = evaluacionCursoP2;
    }

    /**
     * Get evaluacionCursoP2 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP2() {
        return this.evaluacionCursoP2;
    }

    /**
     * Set evaluacionCursoP3 value.
     *
     * @param evaluacionCursoP3 java.lang.Float
     */
    public void setEvaluacionCursoP3(java.lang.Float evaluacionCursoP3) {
        this.evaluacionCursoP3 = evaluacionCursoP3;
    }

    /**
     * Get evaluacionCursoP3 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP3() {
        return this.evaluacionCursoP3;
    }

    /**
     * Set evaluacionCursoP4 value.
     *
     * @param evaluacionCursoP4 java.lang.Float
     */
    public void setEvaluacionCursoP4(java.lang.Float evaluacionCursoP4) {
        this.evaluacionCursoP4 = evaluacionCursoP4;
    }

    /**
     * Get evaluacionCursoP4 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP4() {
        return this.evaluacionCursoP4;
    }

    /**
     * Set evaluacionCursoP5 value.
     *
     * @param evaluacionCursoP5 java.lang.Float
     */
    public void setEvaluacionCursoP5(java.lang.Float evaluacionCursoP5) {
        this.evaluacionCursoP5 = evaluacionCursoP5;
    }

    /**
     * Get evaluacionCursoP5 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP5() {
        return this.evaluacionCursoP5;
    }

    /**
     * Set evaluacionCursoP6 value.
     *
     * @param evaluacionCursoP6 java.lang.Float
     */
    public void setEvaluacionCursoP6(java.lang.Float evaluacionCursoP6) {
        this.evaluacionCursoP6 = evaluacionCursoP6;
    }

    /**
     * Get evaluacionCursoP6 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP6() {
        return this.evaluacionCursoP6;
    }

    /**
     * Set evaluacionCursoP7 value.
     *
     * @param evaluacionCursoP7 java.lang.Float
     */
    public void setEvaluacionCursoP7(java.lang.Float evaluacionCursoP7) {
        this.evaluacionCursoP7 = evaluacionCursoP7;
    }

    /**
     * Get evaluacionCursoP7 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP7() {
        return this.evaluacionCursoP7;
    }

    /**
     * Set evaluacionCursoP8 value.
     *
     * @param evaluacionCursoP8 java.lang.Float
     */
    public void setEvaluacionCursoP8(java.lang.Float evaluacionCursoP8) {
        this.evaluacionCursoP8 = evaluacionCursoP8;
    }

    /**
     * Get evaluacionCursoP8 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP8() {
        return this.evaluacionCursoP8;
    }

    /**
     * Set evaluacionCursoP9 value.
     *
     * @param evaluacionCursoP9 java.lang.Float
     */
    public void setEvaluacionCursoP9(java.lang.Float evaluacionCursoP9) {
        this.evaluacionCursoP9 = evaluacionCursoP9;
    }

    /**
     * Get evaluacionCursoP9 value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getEvaluacionCursoP9() {
        return this.evaluacionCursoP9;
    }
}
