package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcCapCursoPrincipal data.
 */
public class TcCapCursoPrincpDTO implements java.io.Serializable, Model {

    private java.lang.Integer cicloEjeTematico;
    @NotBlank(errorCode = "not.null")
    @MaxLength(80)
    private java.lang.String idCursoPrincipal;
    @NotBlank(errorCode = "not.null")
    @MaxLength(16)
    private java.lang.String idEjeTematico;
    @NotNull
    private int idCaracter;
    @NotNull
    private int idFinalidad;
    @NotNull
    private int idModalidad;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(480)
    private java.lang.String descCursoPrincipal;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.util.List<TnCapCursoDTO> tnCapCursos;

    /**
     * Constructor for TcCapCursoPrincipalDTO class.
     */
    public TcCapCursoPrincpDTO() {
    }

    /**
     * Constructor for TcCapCursoPrincipalDTO class.
     *
     * @param cicloEjeTematico java.lang.Integer
     * @param idCursoPrincipal java.lang.String
     * @param idEjeTematico java.lang.String
     * @param idCaracter int
     * @param idFinalidad int
     * @param idModalidad int
     * @param descCursoPrincipal java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcCapCursoPrincpDTO(java.lang.Integer cicloEjeTematico, java.lang.String idCursoPrincipal, 
                               java.lang.String idEjeTematico, int idCaracter, int idFinalidad, int idModalidad, 
                               java.lang.String descCursoPrincipal, java.util.Date fecModifico, 
                               java.lang.String usuario, java.util.List<TnCapCursoDTO> tnCapCursos) {
        this.cicloEjeTematico = cicloEjeTematico;
        this.idCursoPrincipal = idCursoPrincipal;
        this.idEjeTematico = idEjeTematico;
        this.idCaracter = idCaracter;
        this.idFinalidad = idFinalidad;
        this.idModalidad = idModalidad;
        this.descCursoPrincipal = descCursoPrincipal;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.tnCapCursos = tnCapCursos;
    }

    /**
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
    }

    /**
     * Get cicloEjeTematico value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCicloEjeTematico() {
        return this.cicloEjeTematico;
    }

    /**
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
    }

    /**
     * Get idCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCursoPrincipal() {
        return this.idCursoPrincipal;
    }

    /**
     * Set idEjeTematico value.
     *
     * @param idEjeTematico java.lang.String
     */
    public void setIdEjeTematico(java.lang.String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

    /**
     * Get idEjeTematico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEjeTematico() {
        return this.idEjeTematico;
    }

    /**
     * Set idCaracter value.
     *
     * @param idCaracter int
     */
    public void setIdCaracter(int idCaracter) {
        this.idCaracter = idCaracter;
    }

    /**
     * Get idCaracter value.
     *
     * @return int
     */
    public int getIdCaracter() {
        return this.idCaracter;
    }

    /**
     * Set idFinalidad value.
     *
     * @param idFinalidad int
     */
    public void setIdFinalidad(int idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    /**
     * Get idFinalidad value.
     *
     * @return int
     */
    public int getIdFinalidad() {
        return this.idFinalidad;
    }

    /**
     * Set idModalidad value.
     *
     * @param idModalidad int
     */
    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    /**
     * Get idModalidad value.
     *
     * @return int
     */
    public int getIdModalidad() {
        return this.idModalidad;
    }

    /**
     * Set descCursoPrincipal value.
     *
     * @param descCursoPrincipal java.lang.String
     */
    public void setDescCursoPrincipal(java.lang.String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    /**
     * Get descCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescCursoPrincipal() {
        return this.descCursoPrincipal;
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
