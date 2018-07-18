package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcUnidadEdo data.
 */
public class TcUnidadEdo implements Domain, Serializable {
    private TcUnidadEdoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcUnidadEdo class.
     */
    public TcUnidadEdo() {
    }

    /**
     * Constructor for TcUnidadEdo class.
     *
     * @param idEdo java.lang.Integer
     * @param idUnidad java.lang.String
     * @param uniEdoCiclo java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcUnidadEdo(TcUnidadEdoPK idComposite, java.util.Date fecModifico, 
                       java.lang.String usuario) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdEdo();
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdUnidad();
    }

    /**
     * Get uniEdoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniEdoCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getUniEdoCiclo();
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
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        if (idComposite == null) {
            idComposite = new TcUnidadEdoPK();
        }
        this.idComposite.setIdEdo(idEdo);
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        if (idComposite == null) {
            idComposite = new TcUnidadEdoPK();
        }
        this.idComposite.setIdUnidad(idUnidad);
    }

    /**
     * Set uniEdoCiclo value.
     *
     * @param uniEdoCiclo java.lang.Integer
     */
    public void setUniEdoCiclo(java.lang.Integer uniEdoCiclo) {
        if (idComposite == null) {
            idComposite = new TcUnidadEdoPK();
        }
        this.idComposite.setUniEdoCiclo(uniEdoCiclo);
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
        this.idComposite = (TcUnidadEdoPK)idComposite;
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
