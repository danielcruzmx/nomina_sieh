package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapAula data.
 */
public class TcCapAulaDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(40)
    private java.lang.String idAula;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(16)
    private java.lang.String idSede;
    @NotNull
    private int cupoMaximoAula;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(400)
    private java.lang.String descAula;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idStatus;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.util.List<TnCapCursoDTO> tnCapCursos;

    /**
     * Constructor for TcCapAulaDTO class.
     */
    public TcCapAulaDTO() {
    }
    
    /**
     * Constructor for TcCapAulaDTO class.
     *
     * @param idAula java.lang.String
     * @param idSede java.lang.String
     * @param cupoMaximoAula int
     * @param descAula java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapAulaDTO(java.lang.String idAula, java.lang.String idSede, int cupoMaximoAula, 
                        java.lang.String descAula, java.util.Date fecModifico, java.lang.String idStatus, 
                        java.lang.String usuario, java.util.List<TnCapCursoDTO> tnCapCursos) {
        this.idAula = idAula;
        this.idSede = idSede;
        this.cupoMaximoAula = cupoMaximoAula;
        this.descAula = descAula;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.tnCapCursos = tnCapCursos;
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
     * Get idAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAula() {
        return this.idAula;
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
     * Get idSede value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSede() {
        return this.idSede;
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
     * Get cupoMaximoAula value.
     *
     * @return int
     */
    public int getCupoMaximoAula() {
        return this.cupoMaximoAula;
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
     * Get descAula value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescAula() {
        return this.descAula;
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
     * Set tnCapCursos value.
     *
     * @param tnCapCursos java.util.List
     */
    public void setTnCapCursos(java.util.List<TnCapCursoDTO> tnCapCursos) {
        this.tnCapCursos = tnCapCursos;
    }

    /**
     * Get tnCapCursos value.
     *
     * @return java.util.List
     */
    public java.util.List getTnCapCursos() {
        return this.tnCapCursos;
    }
}
