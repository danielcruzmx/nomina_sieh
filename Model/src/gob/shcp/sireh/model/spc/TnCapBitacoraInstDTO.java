package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapBitacoraInstr data.
 */
public class TnCapBitacoraInstDTO implements java.io.Serializable, Model {

    private java.lang.Long idCapBitacInstr;
    private java.lang.Integer idMotivoDesasignaInstr;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.lang.Integer idCurso;
    private java.lang.Integer idInstrSup;
    private java.lang.Integer idInstrTit;

    /**
     * Constructor for TnCapBitacoraInstrDTO class.
     */
    public TnCapBitacoraInstDTO() {
    }
    
    /**
     * Constructor for TnCapBitacoraInstrDTO class.
     *
     * @param idCapBitacInstr java.lang.Long
     * @param idMotivoDesasignaInstr java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idCurso java.lang.Integer
     * @param idInstrSup java.lang.Integer
     * @param idInstrTit java.lang.Integer
     */
    public TnCapBitacoraInstDTO(java.lang.Long idCapBitacInstr, java.lang.Integer idMotivoDesasignaInstr, 
                                 java.util.Date fecModifico, java.lang.String usuario, java.lang.Integer idCurso, 
                                 java.lang.Integer idInstrSup, java.lang.Integer idInstrTit) {
        this.idCapBitacInstr = idCapBitacInstr;
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idCurso = idCurso;
        this.idInstrSup = idInstrSup;
        this.idInstrTit = idInstrTit;
    }
    
    /**
     * Set idCapBitacInstr value.
     *
     * @param idCapBitacInstr java.lang.Long
     */
    public void setIdCapBitacInstr(java.lang.Long idCapBitacInstr) {
        this.idCapBitacInstr = idCapBitacInstr;
    }

    /**
     * Get idCapBitacInstr value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdCapBitacInstr() {
        return this.idCapBitacInstr;
    }

    /**
     * Set idMotivoDesasignaInstr value.
     *
     * @param idMotivoDesasignaInstr java.lang.Integer
     */
    public void setIdMotivoDesasignaInstr(java.lang.Integer idMotivoDesasignaInstr) {
        this.idMotivoDesasignaInstr = idMotivoDesasignaInstr;
    }

    /**
     * Get idMotivoDesasignaInstr value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMotivoDesasignaInstr() {
        return this.idMotivoDesasignaInstr;
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
     * Set idInstrSup value.
     *
     * @param idInstrSup java.lang.Integer
     */
    public void setIdInstrSup(java.lang.Integer idInstrSup) {
        this.idInstrSup = idInstrSup;
    }

    /**
     * Get idInstrSup value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstrSup() {
        return this.idInstrSup;
    }

    /**
     * Set idInstrTit value.
     *
     * @param idInstrTit java.lang.Integer
     */
    public void setIdInstrTit(java.lang.Integer idInstrTit) {
        this.idInstrTit = idInstrTit;
    }

    /**
     * Get idInstrTit value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstrTit() {
        return this.idInstrTit;
    }
}
