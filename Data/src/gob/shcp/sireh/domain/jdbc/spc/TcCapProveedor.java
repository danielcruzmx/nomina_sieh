package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcCapProveedor data.
 */
public class TcCapProveedor implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idProveedor;
    private java.lang.String idTipoInstEducat;
    private java.lang.String coordinadorProveedor;
    private java.lang.String descProveedor;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;

    /**
     * Constructor for TcCapProveedor class.
     */
    public TcCapProveedor() {
    }

    /**
     * Constructor for TcCapProveedor class.
     *
     * @param idProveedor java.lang.String
     * @param idTipoInstEducat java.lang.String
     * @param coordinadorProveedor java.lang.String
     * @param descProveedor java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapProveedor(java.lang.String idProveedor, java.lang.String idTipoInstEducat, 
                          java.lang.String coordinadorProveedor, java.lang.String descProveedor, 
                          java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario) {
        this.idProveedor = idProveedor;
        this.idTipoInstEducat = idTipoInstEducat;
        this.coordinadorProveedor = coordinadorProveedor;
        this.descProveedor = descProveedor;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
    }


    /**
     * Get idProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProveedor() {
        return this.idProveedor;
    }

    /**
     * Get idTipoInstEducat value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoInstEducat() {
        return this.idTipoInstEducat;
    }

    /**
     * Get coordinadorProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCoordinadorProveedor() {
        return this.coordinadorProveedor;
    }

    /**
     * Get descProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescProveedor() {
        return this.descProveedor;
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
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Set idTipoInstEducat value.
     *
     * @param idTipoInstEducat java.lang.String
     */
    public void setIdTipoInstEducat(java.lang.String idTipoInstEducat) {
        this.idTipoInstEducat = idTipoInstEducat;
    }

    /**
     * Set coordinadorProveedor value.
     *
     * @param coordinadorProveedor java.lang.String
     */
    public void setCoordinadorProveedor(java.lang.String coordinadorProveedor) {
        this.coordinadorProveedor = coordinadorProveedor;
    }

    /**
     * Set descProveedor value.
     *
     * @param descProveedor java.lang.String
     */
    public void setDescProveedor(java.lang.String descProveedor) {
        this.descProveedor = descProveedor;
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
     * Set identity value.
     *
     * @param idProveedor Serializable
     */
    public void setIdentity(Serializable idProveedor) {
        this.idProveedor = (java.lang.String)idProveedor;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idProveedor;
    }
}
