package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcNmCausal data.
 */
public class TcNmCausal implements Domain, Serializable {
    private java.lang.Integer idNmCausal;
    private java.lang.String descNmCausal;
    private java.lang.String descNmCausalBase;
    private java.lang.String descNmCausalConf;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcNmCausal class.
     */
    public TcNmCausal() {
    }

    /**
     * Constructor for TcNmCausal class.
     *
     * @param idNmCausal java.lang.Integer
     * @param descNmCausal java.lang.String
     * @param descNmCausalBase java.lang.String
     * @param descNmCausalConf java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcNmCausal(java.lang.Integer idNmCausal, 
                      java.lang.String descNmCausal, 
                      java.lang.String descNmCausalBase, 
                      java.lang.String descNmCausalConf, 
                      java.util.Date fecModifico, java.lang.String usuario) {
        this.idNmCausal = idNmCausal;
        this.descNmCausal = descNmCausal;
        this.descNmCausalBase = descNmCausalBase;
        this.descNmCausalConf = descNmCausalConf;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idNmCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNmCausal() {
        return this.idNmCausal;
    }

    /**
     * Get descNmCausal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausal() {
        return this.descNmCausal;
    }

    /**
     * Get descNmCausalBase value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausalBase() {
        return this.descNmCausalBase;
    }

    /**
     * Get descNmCausalConf value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNmCausalConf() {
        return this.descNmCausalConf;
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
     * Set idNmCausal value.
     *
     * @param idNmCausal java.lang.Integer
     */
    public void setIdNmCausal(java.lang.Integer idNmCausal) {
        this.idNmCausal = idNmCausal;
    }

    /**
     * Set descNmCausal value.
     *
     * @param descNmCausal java.lang.String
     */
    public void setDescNmCausal(java.lang.String descNmCausal) {
        this.descNmCausal = descNmCausal;
    }

    /**
     * Set descNmCausalBase value.
     *
     * @param descNmCausalBase java.lang.String
     */
    public void setDescNmCausalBase(java.lang.String descNmCausalBase) {
        this.descNmCausalBase = descNmCausalBase;
    }

    /**
     * Set descNmCausalConf value.
     *
     * @param descNmCausalConf java.lang.String
     */
    public void setDescNmCausalConf(java.lang.String descNmCausalConf) {
        this.descNmCausalConf = descNmCausalConf;
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
     * @param idNmCausal Serializable
     */
    public void setIdentity(Serializable idNmCausal) {
        this.idNmCausal = (java.lang.Integer)idNmCausal;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idNmCausal;
    }
}
