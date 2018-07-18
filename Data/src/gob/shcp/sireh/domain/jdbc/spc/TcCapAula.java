package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcCapAula data.
 */
public class TcCapAula implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String idAula;
    private java.lang.String idSede;
    private int cupoMaximoAula;
    private java.lang.String descAula;
    private java.util.Date fecModifico;
    private java.lang.String idStatus;
    private java.lang.String usuario;

    /**
     * Constructor for TcCapAula class.
     */
    public TcCapAula() {
    }

    /**
     * Constructor for TcCapAula class.
     *
     * @param idAula java.lang.String
     * @param idSede java.lang.String
     * @param cupoMaximoAula int
     * @param descAula java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapAula(java.lang.String idAula, java.lang.String idSede, int cupoMaximoAula, java.lang.String descAula, 
                     java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario) {
        this.idAula = idAula;
        this.idSede = idSede;
        this.cupoMaximoAula = cupoMaximoAula;
        this.descAula = descAula;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
    }
    
    /**
     * Get idAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAula() {
        return this.idAula;
    }

    /**
     * Get idSede value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSede() {
        return this.idSede;
    }

    /**
     * Get cupoMaximoAula value.
     *
     * @return int
     */
    public int getCupoMaximoAula() {
        return this.cupoMaximoAula;
    }

    /**
     * Get descAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescAula() {
        return this.descAula;
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
     * Set idAula value.
     *
     * @param idAula java.lang.String
     */
    public void setIdAula(java.lang.String idAula) {
        this.idAula = idAula;
    }

    /**
     * Set idSede value.
     *
     * @param idSede java.lang.String
     */
    public void setIdSede(java.lang.String idSede) {
        this.idSede = idSede;
    }

    /**
     * Set cupoMaximoAula value.
     *
     * @param cupoMaximoAula int
     */
    public void setCupoMaximoAula(int cupoMaximoAula) {
        this.cupoMaximoAula = cupoMaximoAula;
    }

    /**
     * Set descAula value.
     *
     * @param descAula java.lang.String
     */
    public void setDescAula(java.lang.String descAula) {
        this.descAula = descAula;
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
     * @param idAula Serializable
     */
    public void setIdentity(Serializable idAula) {
        this.idAula = (java.lang.String)idAula;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idAula;
    }
}
