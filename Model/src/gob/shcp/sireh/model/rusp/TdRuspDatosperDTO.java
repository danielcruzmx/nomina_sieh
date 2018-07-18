package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdRuspDatosper data.
 */
public class TdRuspDatosperDTO implements java.io.Serializable, Model {

    private java.lang.Integer rdQnaPago;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String rdRfcSp;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(12)
    private java.lang.String idUnidad;
    @MaxLength(72)
    private java.lang.String rdCurp;
    @MaxLength(200)
    private java.lang.String rdNombre;
    @MaxLength(200)
    private java.lang.String rdPrimerApellido;
    private java.lang.Integer rdRamo;
    @MaxLength(200)
    private java.lang.String rdSegundoApellido;
    @MaxLength(4)
    private java.lang.String rdSpAa;
    @MaxLength(1000)
    private java.lang.String rdSpCalle;
    @MaxLength(400)
    private java.lang.String rdSpColonia;
    private java.lang.Integer rdSpCp;
    @MaxLength(8)
    private java.lang.String rdSpEntfed;
    @MaxLength(20)
    private java.lang.String rdSpMuDel;
    @MaxLength(200)
    private java.lang.String rdSpNumEmp;
    private java.lang.Integer rdSpPais;

    /**
     * Constructor for TdRuspDatosperDTO class.
     */
    public TdRuspDatosperDTO() {
    }
    
    /**
     * Constructor for TdRuspDatosperDTO class.
     *
     * @param rdQnaPago java.lang.Integer
     * @param rdRfcSp java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idUnidad java.lang.String
     * @param rdCurp java.lang.String
     * @param rdNombre java.lang.String
     * @param rdPrimerApellido java.lang.String
     * @param rdRamo java.lang.Integer
     * @param rdSegundoApellido java.lang.String
     * @param rdSpAa java.lang.String
     * @param rdSpCalle java.lang.String
     * @param rdSpColonia java.lang.String
     * @param rdSpCp java.lang.Integer
     * @param rdSpEntfed java.lang.String
     * @param rdSpMuDel java.lang.String
     * @param rdSpNumEmp java.lang.String
     * @param rdSpPais java.lang.Integer
     */
    public TdRuspDatosperDTO(java.lang.Integer rdQnaPago, java.lang.String rdRfcSp, java.util.Date fecModifico, 
                             java.lang.String usuario, java.lang.String idUnidad, java.lang.String rdCurp, 
                             java.lang.String rdNombre, java.lang.String rdPrimerApellido, java.lang.Integer rdRamo, 
                             java.lang.String rdSegundoApellido, java.lang.String rdSpAa, java.lang.String rdSpCalle, 
                             java.lang.String rdSpColonia, java.lang.Integer rdSpCp, java.lang.String rdSpEntfed, 
                             java.lang.String rdSpMuDel, java.lang.String rdSpNumEmp, java.lang.Integer rdSpPais) {
        this.rdQnaPago = rdQnaPago;
        this.rdRfcSp = rdRfcSp;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idUnidad = idUnidad;
        this.rdCurp = rdCurp;
        this.rdNombre = rdNombre;
        this.rdPrimerApellido = rdPrimerApellido;
        this.rdRamo = rdRamo;
        this.rdSegundoApellido = rdSegundoApellido;
        this.rdSpAa = rdSpAa;
        this.rdSpCalle = rdSpCalle;
        this.rdSpColonia = rdSpColonia;
        this.rdSpCp = rdSpCp;
        this.rdSpEntfed = rdSpEntfed;
        this.rdSpMuDel = rdSpMuDel;
        this.rdSpNumEmp = rdSpNumEmp;
        this.rdSpPais = rdSpPais;
    }
    
    /**
     * Set rdQnaPago value.
     *
     * @param rdQnaPago java.lang.Integer
     */
    public void setRdQnaPago(java.lang.Integer rdQnaPago) {
        this.rdQnaPago = rdQnaPago;
    }

    /**
     * Get rdQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdQnaPago() {
        return this.rdQnaPago;
    }

    /**
     * Set rdRfcSp value.
     *
     * @param rdRfcSp java.lang.String
     */
    public void setRdRfcSp(java.lang.String rdRfcSp) {
        this.rdRfcSp = rdRfcSp;
    }

    /**
     * Get rdRfcSp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdRfcSp() {
        return this.rdRfcSp;
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
     * Set rdCurp value.
     *
     * @param rdCurp java.lang.String
     */
    public void setRdCurp(java.lang.String rdCurp) {
        this.rdCurp = rdCurp;
    }

    /**
     * Get rdCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdCurp() {
        return this.rdCurp;
    }

    /**
     * Set rdNombre value.
     *
     * @param rdNombre java.lang.String
     */
    public void setRdNombre(java.lang.String rdNombre) {
        this.rdNombre = rdNombre;
    }

    /**
     * Get rdNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdNombre() {
        return this.rdNombre;
    }

    /**
     * Set rdPrimerApellido value.
     *
     * @param rdPrimerApellido java.lang.String
     */
    public void setRdPrimerApellido(java.lang.String rdPrimerApellido) {
        this.rdPrimerApellido = rdPrimerApellido;
    }

    /**
     * Get rdPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdPrimerApellido() {
        return this.rdPrimerApellido;
    }

    /**
     * Set rdRamo value.
     *
     * @param rdRamo java.lang.Integer
     */
    public void setRdRamo(java.lang.Integer rdRamo) {
        this.rdRamo = rdRamo;
    }

    /**
     * Get rdRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdRamo() {
        return this.rdRamo;
    }

    /**
     * Set rdSegundoApellido value.
     *
     * @param rdSegundoApellido java.lang.String
     */
    public void setRdSegundoApellido(java.lang.String rdSegundoApellido) {
        this.rdSegundoApellido = rdSegundoApellido;
    }

    /**
     * Get rdSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSegundoApellido() {
        return this.rdSegundoApellido;
    }

    /**
     * Set rdSpAa value.
     *
     * @param rdSpAa java.lang.String
     */
    public void setRdSpAa(java.lang.String rdSpAa) {
        this.rdSpAa = rdSpAa;
    }

    /**
     * Get rdSpAa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpAa() {
        return this.rdSpAa;
    }

    /**
     * Set rdSpCalle value.
     *
     * @param rdSpCalle java.lang.String
     */
    public void setRdSpCalle(java.lang.String rdSpCalle) {
        this.rdSpCalle = rdSpCalle;
    }

    /**
     * Get rdSpCalle value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpCalle() {
        return this.rdSpCalle;
    }

    /**
     * Set rdSpColonia value.
     *
     * @param rdSpColonia java.lang.String
     */
    public void setRdSpColonia(java.lang.String rdSpColonia) {
        this.rdSpColonia = rdSpColonia;
    }

    /**
     * Get rdSpColonia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpColonia() {
        return this.rdSpColonia;
    }

    /**
     * Set rdSpCp value.
     *
     * @param rdSpCp java.lang.Integer
     */
    public void setRdSpCp(java.lang.Integer rdSpCp) {
        this.rdSpCp = rdSpCp;
    }

    /**
     * Get rdSpCp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdSpCp() {
        return this.rdSpCp;
    }

    /**
     * Set rdSpEntfed value.
     *
     * @param rdSpEntfed java.lang.String
     */
    public void setRdSpEntfed(java.lang.String rdSpEntfed) {
        this.rdSpEntfed = rdSpEntfed;
    }

    /**
     * Get rdSpEntfed value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpEntfed() {
        return this.rdSpEntfed;
    }

    /**
     * Set rdSpMuDel value.
     *
     * @param rdSpMuDel java.lang.String
     */
    public void setRdSpMuDel(java.lang.String rdSpMuDel) {
        this.rdSpMuDel = rdSpMuDel;
    }

    /**
     * Get rdSpMuDel value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpMuDel() {
        return this.rdSpMuDel;
    }

    /**
     * Set rdSpNumEmp value.
     *
     * @param rdSpNumEmp java.lang.String
     */
    public void setRdSpNumEmp(java.lang.String rdSpNumEmp) {
        this.rdSpNumEmp = rdSpNumEmp;
    }

    /**
     * Get rdSpNumEmp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpNumEmp() {
        return this.rdSpNumEmp;
    }

    /**
     * Set rdSpPais value.
     *
     * @param rdSpPais java.lang.Integer
     */
    public void setRdSpPais(java.lang.Integer rdSpPais) {
        this.rdSpPais = rdSpPais;
    }

    /**
     * Get rdSpPais value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdSpPais() {
        return this.rdSpPais;
    }
}
