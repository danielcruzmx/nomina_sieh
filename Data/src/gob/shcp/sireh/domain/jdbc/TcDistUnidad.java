package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcDistUnidad data.
 */
public class TcDistUnidad implements Domain, Serializable {
    private TcDistUnidadPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcDistUnidad class.
     */
    public TcDistUnidad() {
    }

    /**
     * Constructor for TcDistUnidad class.
     *
     * @param idDistUnidad java.lang.Integer
     * @param idUnidad java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcDistUnidad(TcDistUnidadPK idComposite, java.util.Date fecModifico, 
                        java.lang.String usuario) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idDistUnidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdDistUnidad() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDistUnidad();
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
     * Set idDistUnidad value.
     *
     * @param idDistUnidad java.lang.Integer
     */
    public void setIdDistUnidad(java.lang.Integer idDistUnidad) {
        if (idComposite == null) {
            idComposite = new TcDistUnidadPK();
        }
        this.idComposite.setIdDistUnidad(idDistUnidad);
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        if (idComposite == null) {
            idComposite = new TcDistUnidadPK();
        }
        this.idComposite.setIdUnidad(idUnidad);
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
        this.idComposite = (TcDistUnidadPK)idComposite;
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
