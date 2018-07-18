package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;


import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapProveedor data.
 */
public class TcCapProveedorDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(24)
    private java.lang.String idProveedor;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(12)
    private java.lang.String idTipoInstEducat;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(480)
    private java.lang.String coordinadorProveedor;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(480)
    private java.lang.String descProveedor;
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
    private java.util.List<TnCapContratoCurDTO> tnCapContratoCursos;

    /**
     * Constructor for TcCapProveedorDTO class.
     */
    public TcCapProveedorDTO() {
    }
    
    /**
     * Constructor for TcCapProveedorDTO class.
     *
     * @param idProveedor java.lang.String
     * @param idTipoInstEducat java.lang.String
     * @param coordinadorProveedor java.lang.String
     * @param descProveedor java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapProveedorDTO(java.lang.String idProveedor, java.lang.String idTipoInstEducat, 
                             java.lang.String coordinadorProveedor, java.lang.String descProveedor, 
                             java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario, 
                             java.util.List<TnCapCursoDTO> tnCapCursos, 
                             java.util.List<TnCapContratoCurDTO> tnCapContratoCursos) {
        this.idProveedor = idProveedor;
        this.idTipoInstEducat = idTipoInstEducat;
        this.coordinadorProveedor = coordinadorProveedor;
        this.descProveedor = descProveedor;
        this.fecModifico = fecModifico;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.tnCapCursos = tnCapCursos;
        this.tnCapContratoCursos = tnCapContratoCursos;
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
     * Get idProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProveedor() {
        return this.idProveedor;
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
     * Get idTipoInstEducat value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoInstEducat() {
        return this.idTipoInstEducat;
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
     * Get coordinadorProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCoordinadorProveedor() {
        return this.coordinadorProveedor;
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
     * Get descProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescProveedor() {
        return this.descProveedor;
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

    /**
     * Set tnCapContratoCursos value.
     *
     * @param tnCapContratoCursos java.util.List
     */
    public void setTnCapContratoCursos(java.util.List<TnCapContratoCurDTO> tnCapContratoCursos) {
        this.tnCapContratoCursos = tnCapContratoCursos;
    }

    /**
     * Get tnCapContratoCursos value.
     *
     * @return java.util.List
     */
    public java.util.List getTnCapContratoCursos() {
        return this.tnCapContratoCursos;
    }
}
