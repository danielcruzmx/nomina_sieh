package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcUnidad data.
 */
public class TcUnidad implements Domain, Serializable {
    private TcUnidadPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descUnidad;
    private java.lang.String descUnidadAbrev;
    private java.lang.String idUnidadSubse;
    private java.lang.String uniCentralForanea;

    /**
     * Constructor for TcUnidad class.
     */
    public TcUnidad() {
    }

    /**
     * Constructor for TcUnidad class.
     *
     * @param idUnidad java.lang.String
     * @param uniCiclo java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descUnidad java.lang.String
     * @param descUnidadAbrev java.lang.String
     * @param idUnidadSubse java.lang.String
     * @param uniCentralForanea java.lang.String
     */
    public TcUnidad(TcUnidadPK idComposite, java.util.Date fecModifico, 
                    java.lang.String usuario, java.lang.String descUnidad, 
                    java.lang.String descUnidadAbrev, 
                    java.lang.String idUnidadSubse, 
                    java.lang.String uniCentralForanea) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descUnidad = descUnidad;
        this.descUnidadAbrev = descUnidadAbrev;
        this.idUnidadSubse = idUnidadSubse;
        this.uniCentralForanea = uniCentralForanea;
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
     * Get uniCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getUniCiclo();
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
     * Get descUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescUnidad() {
        return this.descUnidad;
    }

    /**
     * Get descUnidadAbrev value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescUnidadAbrev() {
        return this.descUnidadAbrev;
    }

    /**
     * Get idUnidadSubse value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadSubse() {
        return this.idUnidadSubse;
    }

    /**
     * Get uniCentralForanea value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUniCentralForanea() {
        return this.uniCentralForanea;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        if (idComposite == null) {
            idComposite = new TcUnidadPK();
        }
        this.idComposite.setIdUnidad(idUnidad);
    }

    /**
     * Set uniCiclo value.
     *
     * @param uniCiclo java.lang.Integer
     */
    public void setUniCiclo(java.lang.Integer uniCiclo) {
        if (idComposite == null) {
            idComposite = new TcUnidadPK();
        }
        this.idComposite.setUniCiclo(uniCiclo);
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
     * Set descUnidad value.
     *
     * @param descUnidad java.lang.String
     */
    public void setDescUnidad(java.lang.String descUnidad) {
        this.descUnidad = descUnidad;
    }

    /**
     * Set descUnidadAbrev value.
     *
     * @param descUnidadAbrev java.lang.String
     */
    public void setDescUnidadAbrev(java.lang.String descUnidadAbrev) {
        this.descUnidadAbrev = descUnidadAbrev;
    }

    /**
     * Set idUnidadSubse value.
     *
     * @param idUnidadSubse java.lang.String
     */
    public void setIdUnidadSubse(java.lang.String idUnidadSubse) {
        this.idUnidadSubse = idUnidadSubse;
    }

    /**
     * Set uniCentralForanea value.
     *
     * @param uniCentralForanea java.lang.String
     */
    public void setUniCentralForanea(java.lang.String uniCentralForanea) {
        this.uniCentralForanea = uniCentralForanea;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcUnidadPK)idComposite;
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
