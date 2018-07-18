package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcSituacionOk data.
 */
public class TcSituacionOk implements Domain, Serializable {
    private TcSituacionOkPK idComposite;
    private java.lang.Integer idMovtoPersona;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcSituacionOk class.
     */
    public TcSituacionOk() {
    }

    /**
     * Constructor for TcSituacionOk class.
     *
     * @param idSitPlazaDestino java.lang.String
     * @param idSitPlazaOrigen java.lang.String
     * @param idMovtoPersona java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcSituacionOk(TcSituacionOkPK idComposite, 
                         java.lang.Integer idMovtoPersona, 
                         java.util.Date fecModifico, 
                         java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idMovtoPersona = idMovtoPersona;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idSitPlazaDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaDestino() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdSitPlazaDestino();
    }

    /**
     * Get idSitPlazaOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlazaOrigen() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdSitPlazaOrigen();
    }

    /**
     * Get idMovtoPersona value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovtoPersona() {
        return this.idMovtoPersona;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Set idSitPlazaDestino value.
     *
     * @param idSitPlazaDestino java.lang.String
     */
    public void setIdSitPlazaDestino(java.lang.String idSitPlazaDestino) {
        if (idComposite == null) {
            idComposite = new TcSituacionOkPK();
        }
        this.idComposite.setIdSitPlazaDestino(idSitPlazaDestino);
    }

    /**
     * Set idSitPlazaOrigen value.
     *
     * @param idSitPlazaOrigen java.lang.String
     */
    public void setIdSitPlazaOrigen(java.lang.String idSitPlazaOrigen) {
        if (idComposite == null) {
            idComposite = new TcSituacionOkPK();
        }
        this.idComposite.setIdSitPlazaOrigen(idSitPlazaOrigen);
    }

    /**
     * Set idMovtoPersona value.
     *
     * @param idMovtoPersona java.lang.Integer
     */
    public void setIdMovtoPersona(java.lang.Integer idMovtoPersona) {
        this.idMovtoPersona = idMovtoPersona;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcSituacionOkPK)idComposite;
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
