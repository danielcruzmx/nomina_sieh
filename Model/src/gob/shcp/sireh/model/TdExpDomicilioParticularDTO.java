package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpDomicilioParticular data.
 */
public class TdExpDomicilioParticularDTO implements java.io.Serializable, Model {

    private java.lang.Integer domSecuencia;
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
    @MaxLength(320)
    private java.lang.String domCalle;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(400)
    private java.lang.String domDoctoRef;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idPais;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(200)
    private java.lang.String domColonia;
    @MaxLength(80)
    private java.lang.String domNumExt;
    @MaxLength(80)
    private java.lang.String domNumInt;
    @MaxLength(20)
    private java.lang.String idCodPost;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMun;

    /**
     * Constructor for TdExpDomicilioParticularDTO class.
     */
    public TdExpDomicilioParticularDTO() {
    }


    /**
     * Constructor for TdExpDomicilioParticularDTO class.
     *
     * @param domSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param domCalle java.lang.String
     * @param domDoctoRef java.lang.String
     * @param fecModifico java.util.Date
     * @param idPais java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param domColonia java.lang.String
     * @param domNumExt java.lang.String
     * @param domNumInt java.lang.String
     * @param idCodPost java.lang.String
     * @param idEdo java.lang.Integer
     * @param idMun java.lang.Integer
     */
    public TdExpDomicilioParticularDTO(java.lang.Integer domSecuencia, java.lang.String idDocto, 
                                       java.lang.String rfcEmpleado, int idExpRechazo, java.lang.String domCalle, 
                                       java.lang.String domDoctoRef, java.util.Date fecModifico, 
                                       java.lang.String idPais, java.lang.String idStatus, java.lang.String usuario, 
                                       java.lang.String domColonia, java.lang.String domNumExt, 
                                       java.lang.String domNumInt, java.lang.String idCodPost, java.lang.Integer idEdo, 
                                       java.lang.Integer idMun) {
        this.domSecuencia = domSecuencia;
        this.idDocto = idDocto;
        this.rfcEmpleado = rfcEmpleado;
        this.idExpRechazo = idExpRechazo;
        this.domCalle = domCalle;
        this.domDoctoRef = domDoctoRef;
        this.fecModifico = fecModifico;
        this.idPais = idPais;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.domColonia = domColonia;
        this.domNumExt = domNumExt;
        this.domNumInt = domNumInt;
        this.idCodPost = idCodPost;
        this.idEdo = idEdo;
        this.idMun = idMun;
    }
    
    /**
     * Set domSecuencia value.
     *
     * @param domSecuencia java.lang.Integer
     */
    public void setDomSecuencia(java.lang.Integer domSecuencia) {
        this.domSecuencia = domSecuencia;
    }

    /**
     * Get domSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDomSecuencia() {
        return this.domSecuencia;
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
     * Set domCalle value.
     *
     * @param domCalle java.lang.String
     */
    public void setDomCalle(java.lang.String domCalle) {
        this.domCalle = domCalle;
    }

    /**
     * Get domCalle value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomCalle() {
        return this.domCalle;
    }

    /**
     * Set domDoctoRef value.
     *
     * @param domDoctoRef java.lang.String
     */
    public void setDomDoctoRef(java.lang.String domDoctoRef) {
        this.domDoctoRef = domDoctoRef;
    }

    /**
     * Get domDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomDoctoRef() {
        return this.domDoctoRef;
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
     * Set idPais value.
     *
     * @param idPais java.lang.String
     */
    public void setIdPais(java.lang.String idPais) {
        this.idPais = idPais;
    }

    /**
     * Get idPais value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPais() {
        return this.idPais;
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
     * Set domColonia value.
     *
     * @param domColonia java.lang.String
     */
    public void setDomColonia(java.lang.String domColonia) {
        this.domColonia = domColonia;
    }

    /**
     * Get domColonia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomColonia() {
        return this.domColonia;
    }

    /**
     * Set domNumExt value.
     *
     * @param domNumExt java.lang.String
     */
    public void setDomNumExt(java.lang.String domNumExt) {
        this.domNumExt = domNumExt;
    }

    /**
     * Get domNumExt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomNumExt() {
        return this.domNumExt;
    }

    /**
     * Set domNumInt value.
     *
     * @param domNumInt java.lang.String
     */
    public void setDomNumInt(java.lang.String domNumInt) {
        this.domNumInt = domNumInt;
    }

    /**
     * Get domNumInt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomNumInt() {
        return this.domNumInt;
    }

    /**
     * Set idCodPost value.
     *
     * @param idCodPost java.lang.String
     */
    public void setIdCodPost(java.lang.String idCodPost) {
        this.idCodPost = idCodPost;
    }

    /**
     * Get idCodPost value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCodPost() {
        return this.idCodPost;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Set idMun value.
     *
     * @param idMun java.lang.Integer
     */
    public void setIdMun(java.lang.Integer idMun) {
        this.idMun = idMun;
    }

    /**
     * Get idMun value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMun() {
        return this.idMun;
    }
}
