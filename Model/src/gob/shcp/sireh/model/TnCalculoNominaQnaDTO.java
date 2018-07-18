package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCalculoNominaQna data.
 */
public class TnCalculoNominaQnaDTO implements java.io.Serializable, Model {

    private java.util.Date cnqIniPago;
    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String cnqRfc;
    private java.lang.Integer idNomina;
    private java.lang.Integer idPlaza;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(4000)
    private java.lang.String cnqCptos;
    private java.util.Date cnqFinPago;
    private java.lang.Double cnqLiquido;

    /**
     * Constructor for TnCalculoNominaQnaDTO class.
     */
    public TnCalculoNominaQnaDTO() {
    }
    
    /**
     * Constructor for TnCalculoNominaQnaDTO class.
     *
     * @param cnqIniPago java.util.Date
     * @param cnqRfc java.lang.String
     * @param idNomina java.lang.Integer
     * @param idPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cnqCptos java.lang.String
     * @param cnqFinPago java.util.Date
     * @param cnqLiquido java.lang.Double
     */
    public TnCalculoNominaQnaDTO(java.util.Date cnqIniPago, java.lang.String cnqRfc, java.lang.Integer idNomina, 
                                 java.lang.Integer idPlaza, java.util.Date fecModifico, java.lang.String usuario, 
                                 java.lang.String cnqCptos, java.util.Date cnqFinPago, java.lang.Double cnqLiquido) {
        this.cnqIniPago = cnqIniPago;
        this.cnqRfc = cnqRfc;
        this.idNomina = idNomina;
        this.idPlaza = idPlaza;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cnqCptos = cnqCptos;
        this.cnqFinPago = cnqFinPago;
        this.cnqLiquido = cnqLiquido;
    }
    
    /**
     * Set cnqIniPago value.
     *
     * @param cnqIniPago java.util.Date
     */
    public void setCnqIniPago(java.util.Date cnqIniPago) {
        this.cnqIniPago = cnqIniPago;
    }

    /**
     * Get cnqIniPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnqIniPago() {
        return this.cnqIniPago;
    }

    /**
     * Set cnqRfc value.
     *
     * @param cnqRfc java.lang.String
     */
    public void setCnqRfc(java.lang.String cnqRfc) {
        this.cnqRfc = cnqRfc;
    }

    /**
     * Get cnqRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnqRfc() {
        return this.cnqRfc;
    }

    /**
     * Set idNomina value.
     *
     * @param idNomina java.lang.Integer
     */
    public void setIdNomina(java.lang.Integer idNomina) {
        this.idNomina = idNomina;
    }

    /**
     * Get idNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNomina() {
        return this.idNomina;
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
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
     * Set cnqCptos value.
     *
     * @param cnqCptos java.lang.String
     */
    public void setCnqCptos(java.lang.String cnqCptos) {
        this.cnqCptos = cnqCptos;
    }

    /**
     * Get cnqCptos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnqCptos() {
        return this.cnqCptos;
    }

    /**
     * Set cnqFinPago value.
     *
     * @param cnqFinPago java.util.Date
     */
    public void setCnqFinPago(java.util.Date cnqFinPago) {
        this.cnqFinPago = cnqFinPago;
    }

    /**
     * Get cnqFinPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnqFinPago() {
        return this.cnqFinPago;
    }

    /**
     * Set cnqLiquido value.
     *
     * @param cnqLiquido java.lang.Double
     */
    public void setCnqLiquido(java.lang.Double cnqLiquido) {
        this.cnqLiquido = cnqLiquido;
    }

    /**
     * Get cnqLiquido value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCnqLiquido() {
        return this.cnqLiquido;
    }

}
