package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcPartida data.
 */
public class TcPartida implements Domain, Serializable {
    private java.lang.String idPartida;
    private java.lang.String descPartida;
    private java.util.Date fecModifico;
    private java.lang.String ptdaInfoCpto;
    private java.lang.String usuario;

    /**
     * Constructor for TcPartida class.
     */
    public TcPartida() {
    }

    /**
     * Constructor for TcPartida class.
     *
     * @param idPartida java.lang.String
     * @param descPartida java.lang.String
     * @param fecModifico java.util.Date
     * @param ptdaInfoCpto java.lang.String
     * @param usuario java.lang.String
     */
    public TcPartida(java.lang.String idPartida, java.lang.String descPartida, 
                     java.util.Date fecModifico, java.lang.String ptdaInfoCpto, 
                     java.lang.String usuario) {
        this.idPartida = idPartida;
        this.descPartida = descPartida;
        this.fecModifico = fecModifico;
        this.ptdaInfoCpto = ptdaInfoCpto;
        this.usuario = usuario;
    }


    /**
     * Get idPartida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPartida() {
        return this.idPartida;
    }

    /**
     * Get descPartida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescPartida() {
        return this.descPartida;
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
     * Get ptdaInfoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPtdaInfoCpto() {
        return this.ptdaInfoCpto;
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
     * Set idPartida value.
     *
     * @param idPartida java.lang.String
     */
    public void setIdPartida(java.lang.String idPartida) {
        this.idPartida = idPartida;
    }

    /**
     * Set descPartida value.
     *
     * @param descPartida java.lang.String
     */
    public void setDescPartida(java.lang.String descPartida) {
        this.descPartida = descPartida;
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
     * Set ptdaInfoCpto value.
     *
     * @param ptdaInfoCpto java.lang.String
     */
    public void setPtdaInfoCpto(java.lang.String ptdaInfoCpto) {
        this.ptdaInfoCpto = ptdaInfoCpto;
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
     * @param idPartida Serializable
     */
    public void setIdentity(Serializable idPartida) {
        this.idPartida = (java.lang.String)idPartida;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idPartida;
    }
}
