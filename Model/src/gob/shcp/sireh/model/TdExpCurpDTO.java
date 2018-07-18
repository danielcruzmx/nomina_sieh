package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpCurp data.
 */
public class TdExpCurpDTO implements java.io.Serializable, Model {

    private java.lang.Integer curpSecuencia;
    @NotBlank(errorCode = "not.null")
    @MaxLength(20)
    private java.lang.String idDocto;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rfcEmpleado;
    @NotNull
    private int idExpRechazo;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(72)
    private java.lang.String curpCve;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(400)
    private java.lang.String curpDoctoRef;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(80)
    private java.lang.String curpFolio;

    /**
     * Constructor for TdExpCurpDTO class.
     */
    public TdExpCurpDTO() {
    }


    /**
     * Constructor for TdExpCurpDTO class.
     *
     * @param curpSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param curpCve java.lang.String
     * @param curpDoctoRef java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param curpFolio java.lang.String
     */
    public TdExpCurpDTO(java.lang.Integer curpSecuencia, java.lang.String idDocto, java.lang.String rfcEmpleado, 
                        int idExpRechazo, java.lang.String curpCve, java.lang.String curpDoctoRef, 
                        java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario, 
                        java.lang.String curpFolio) {
        this.curpSecuencia = curpSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.curpCve = curpCve;
        this.curpDoctoRef = curpDoctoRef;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.curpFolio = curpFolio;
    }

    /**
     * Set curpSecuencia value.
     *
     * @param curpSecuencia java.lang.Integer
     */
    public void setCurpSecuencia(java.lang.Integer curpSecuencia) {
        this.curpSecuencia = curpSecuencia;
    }

    /**
     * Get curpSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCurpSecuencia() {
        return this.curpSecuencia;
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        this.idDocto = idDocto;
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        return this.idDocto;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
    }

    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;
    }

    /**
     * Set curpCve value.
     *
     * @param curpCve java.lang.String
     */
    public void setCurpCve(java.lang.String curpCve) {
        this.curpCve = curpCve;
    }

    /**
     * Get curpCve value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpCve() {
        return this.curpCve;
    }

    /**
     * Set curpDoctoRef value.
     *
     * @param curpDoctoRef java.lang.String
     */
    public void setCurpDoctoRef(java.lang.String curpDoctoRef) {
        this.curpDoctoRef = curpDoctoRef;
    }

    /**
     * Get curpDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpDoctoRef() {
        return this.curpDoctoRef;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
    }

    /**
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Set curpFolio value.
     *
     * @param curpFolio java.lang.String
     */
    public void setCurpFolio(java.lang.String curpFolio) {
        this.curpFolio = curpFolio;
    }

    /**
     * Get curpFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurpFolio() {
        return this.curpFolio;
    }

}
