package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdRuspBaja data.
 */
public class TdRuspBajaDTO implements java.io.Serializable, Model {

    private java.lang.Integer rbCiclo;
    private java.lang.Integer rbQnaPago;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rbRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(12)
    private java.lang.String idUnidad;
    @MaxLength(72)
    private java.lang.String rbCurp;
    private java.util.Date rbFechaBaja;
    private java.lang.Integer rbMotivoBaja;
    @MaxLength(360)
    private java.lang.String rbNombre;
    @MaxLength(52)
    private java.lang.String rbNumEmpleado;
    @MaxLength(360)
    private java.lang.String rbPrimerApellido;
    private java.lang.Integer rbRamo;
    @MaxLength(360)
    private java.lang.String rbSegundoApellido;

    /**
     * Constructor for TdRuspBajaDTO class.
     */
    public TdRuspBajaDTO() {
    }
    
    /**
     * Constructor for TdRuspBajaDTO class.
     *
     * @param rbCiclo java.lang.Integer
     * @param rbQnaPago java.lang.Integer
     * @param rbRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idUnidad java.lang.String
     * @param rbCurp java.lang.String
     * @param rbFechaBaja java.util.Date
     * @param rbMotivoBaja java.lang.Integer
     * @param rbNombre java.lang.String
     * @param rbNumEmpleado java.lang.String
     * @param rbPrimerApellido java.lang.String
     * @param rbRamo java.lang.Integer
     * @param rbSegundoApellido java.lang.String
     */
    public TdRuspBajaDTO(java.lang.Integer rbCiclo, java.lang.Integer rbQnaPago, java.lang.String rbRfc, 
                         java.util.Date fecModifico, java.lang.String usuario, java.lang.String idUnidad, 
                         java.lang.String rbCurp, java.util.Date rbFechaBaja, java.lang.Integer rbMotivoBaja, 
                         java.lang.String rbNombre, java.lang.String rbNumEmpleado, java.lang.String rbPrimerApellido, 
                         java.lang.Integer rbRamo, java.lang.String rbSegundoApellido) {
        this.rbCiclo = rbCiclo;
        this.rbQnaPago = rbQnaPago;
        this.rbRfc = rbRfc;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idUnidad = idUnidad;
        this.rbCurp = rbCurp;
        this.rbFechaBaja = rbFechaBaja;
        this.rbMotivoBaja = rbMotivoBaja;
        this.rbNombre = rbNombre;
        this.rbNumEmpleado = rbNumEmpleado;
        this.rbPrimerApellido = rbPrimerApellido;
        this.rbRamo = rbRamo;
        this.rbSegundoApellido = rbSegundoApellido;
    }
    
    /**
     * Set rbCiclo value.
     *
     * @param rbCiclo java.lang.Integer
     */
    public void setRbCiclo(java.lang.Integer rbCiclo) {
        this.rbCiclo = rbCiclo;
    }

    /**
     * Get rbCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbCiclo() {
        return this.rbCiclo;
    }

    /**
     * Set rbQnaPago value.
     *
     * @param rbQnaPago java.lang.Integer
     */
    public void setRbQnaPago(java.lang.Integer rbQnaPago) {
        this.rbQnaPago = rbQnaPago;
    }

    /**
     * Get rbQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbQnaPago() {
        return this.rbQnaPago;
    }

    /**
     * Set rbRfc value.
     *
     * @param rbRfc java.lang.String
     */
    public void setRbRfc(java.lang.String rbRfc) {
        this.rbRfc = rbRfc;
    }

    /**
     * Get rbRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbRfc() {
        return this.rbRfc;
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Set rbCurp value.
     *
     * @param rbCurp java.lang.String
     */
    public void setRbCurp(java.lang.String rbCurp) {
        this.rbCurp = rbCurp;
    }

    /**
     * Get rbCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbCurp() {
        return this.rbCurp;
    }

    /**
     * Set rbFechaBaja value.
     *
     * @param rbFechaBaja java.util.Date
     */
    public void setRbFechaBaja(java.util.Date rbFechaBaja) {
        this.rbFechaBaja = rbFechaBaja;
    }

    /**
     * Get rbFechaBaja value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRbFechaBaja() {
        return this.rbFechaBaja;
    }

    /**
     * Set rbMotivoBaja value.
     *
     * @param rbMotivoBaja java.lang.Integer
     */
    public void setRbMotivoBaja(java.lang.Integer rbMotivoBaja) {
        this.rbMotivoBaja = rbMotivoBaja;
    }

    /**
     * Get rbMotivoBaja value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbMotivoBaja() {
        return this.rbMotivoBaja;
    }

    /**
     * Set rbNombre value.
     *
     * @param rbNombre java.lang.String
     */
    public void setRbNombre(java.lang.String rbNombre) {
        this.rbNombre = rbNombre;
    }

    /**
     * Get rbNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbNombre() {
        return this.rbNombre;
    }

    /**
     * Set rbNumEmpleado value.
     *
     * @param rbNumEmpleado java.lang.String
     */
    public void setRbNumEmpleado(java.lang.String rbNumEmpleado) {
        this.rbNumEmpleado = rbNumEmpleado;
    }

    /**
     * Get rbNumEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbNumEmpleado() {
        return this.rbNumEmpleado;
    }

    /**
     * Set rbPrimerApellido value.
     *
     * @param rbPrimerApellido java.lang.String
     */
    public void setRbPrimerApellido(java.lang.String rbPrimerApellido) {
        this.rbPrimerApellido = rbPrimerApellido;
    }

    /**
     * Get rbPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbPrimerApellido() {
        return this.rbPrimerApellido;
    }

    /**
     * Set rbRamo value.
     *
     * @param rbRamo java.lang.Integer
     */
    public void setRbRamo(java.lang.Integer rbRamo) {
        this.rbRamo = rbRamo;
    }

    /**
     * Get rbRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbRamo() {
        return this.rbRamo;
    }

    /**
     * Set rbSegundoApellido value.
     *
     * @param rbSegundoApellido java.lang.String
     */
    public void setRbSegundoApellido(java.lang.String rbSegundoApellido) {
        this.rbSegundoApellido = rbSegundoApellido;
    }

    /**
     * Get rbSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbSegundoApellido() {
        return this.rbSegundoApellido;
    }
}
