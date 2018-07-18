package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpDomicilioParticular data.
 */
public class TdExpDomicilioParticular implements Domain, Serializable {
    private TdExpDomicilioParticularPK idComposite;
    private int idExpRechazo;
    private java.lang.String domCalle;
    private java.lang.String domDoctoRef;
    private java.util.Date fecModifico;
    private java.lang.String idPais;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String domColonia;
    private java.lang.String domNumExt;
    private java.lang.String domNumInt;
    private java.lang.String idCodPost;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMun;

    /**
     * Constructor for TdExpDomicilioParticular class.
     */
    public TdExpDomicilioParticular() {
    }

    /**
     * Constructor for TdExpDomicilioParticular class.
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
    public TdExpDomicilioParticular(TdExpDomicilioParticularPK idComposite, 
                                    int idExpRechazo, 
                                    java.lang.String domCalle, 
                                    java.lang.String domDoctoRef, 
                                    java.util.Date fecModifico, 
                                    java.lang.String idPais, 
                                    java.lang.String idStatus, 
                                    java.lang.String usuario, 
                                    java.lang.String domColonia, 
                                    java.lang.String domNumExt, 
                                    java.lang.String domNumInt, 
                                    java.lang.String idCodPost, 
                                    java.lang.Integer idEdo, 
                                    java.lang.Integer idMun) {
        this.idComposite = idComposite;
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
     * Get domSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDomSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getDomSecuencia();
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDocto();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
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
     * Get domCalle value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomCalle() {
        return this.domCalle;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Get domColonia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomColonia() {
        return this.domColonia;
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
     * Get domNumInt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDomNumInt() {
        return this.domNumInt;
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
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Get idMun value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMun() {
        return this.idMun;
    }

    /**
     * Set domSecuencia value.
     *
     * @param domSecuencia java.lang.Integer
     */
    public void setDomSecuencia(java.lang.Integer domSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpDomicilioParticularPK();
        }
        this.idComposite.setDomSecuencia(domSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpDomicilioParticularPK();
        }
        this.idComposite.setIdDocto(idDocto);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TdExpDomicilioParticularPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
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
     * Set domCalle value.
     *
     * @param domCalle java.lang.String
     */
    public void setDomCalle(java.lang.String domCalle) {
        this.domCalle = domCalle;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set domColonia value.
     *
     * @param domColonia java.lang.String
     */
    public void setDomColonia(java.lang.String domColonia) {
        this.domColonia = domColonia;
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
     * Set domNumInt value.
     *
     * @param domNumInt java.lang.String
     */
    public void setDomNumInt(java.lang.String domNumInt) {
        this.domNumInt = domNumInt;
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
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpDomicilioParticularPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
