package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcBeneficiarioSicop data.
 */
public class TcBeneficiarioSicopDTO  implements java.io.Serializable, Model {

    @NotBlank(errorCode="not.null")
    @MaxLength(72)    
    private java.lang.String bsCtaBancaria;
    @NotBlank(errorCode="not.null")
    @MaxLength(4)    
    private java.lang.String bsLeyenda;
    @NotBlank(errorCode="not.null")
    @MaxLength(4)    
    private java.lang.String bsTipoPago;
    @NotBlank(errorCode="not.null")
    @MaxLength(24)    
    private java.lang.String idBeneSicop;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    private java.lang.Integer bsOrigenPpto;
    @MaxLength(160)    
    private java.lang.String bsRef1;
    @MaxLength(160)    
    private java.lang.String bsRef2;
    @MaxLength(52)    
    private java.lang.String bsRfc;
    private java.lang.Integer bsTipoErog;
    @MaxLength(12)    
    private java.lang.String bsTipoMoneda;
    @MaxLength(240)    
    private java.lang.String bsTipoNom;
    private java.lang.Integer bsTipoOper;
    @MaxLength(560)    
    private java.lang.String descBeneSicop;

    /**
     * Constructor for TcBeneficiarioSicopDTO class.
     */
    public TcBeneficiarioSicopDTO() { }    

                                                                
    /**
     * Constructor for TcBeneficiarioSicopDTO class.
     *
     * @param bsCtaBancaria java.lang.String
     * @param bsLeyenda java.lang.String
     * @param bsTipoPago java.lang.String
     * @param idBeneSicop java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param bsOrigenPpto java.lang.Integer
     * @param bsRef1 java.lang.String
     * @param bsRef2 java.lang.String
     * @param bsRfc java.lang.String
     * @param bsTipoErog java.lang.Integer
     * @param bsTipoMoneda java.lang.String
     * @param bsTipoNom java.lang.String
     * @param bsTipoOper java.lang.Integer
     * @param descBeneSicop java.lang.String
     */
    public TcBeneficiarioSicopDTO( java.lang.String bsCtaBancaria, java.lang.String bsLeyenda, java.lang.String bsTipoPago, java.lang.String idBeneSicop, java.util.Date fecModifico, java.lang.String usuario, java.lang.Integer bsOrigenPpto, java.lang.String bsRef1, java.lang.String bsRef2, java.lang.String bsRfc, java.lang.Integer bsTipoErog, java.lang.String bsTipoMoneda, java.lang.String bsTipoNom, java.lang.Integer bsTipoOper, java.lang.String descBeneSicop){    
        this.bsCtaBancaria = bsCtaBancaria;
        this.bsLeyenda = bsLeyenda;
        this.bsTipoPago = bsTipoPago;
        this.idBeneSicop = idBeneSicop;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.bsOrigenPpto = bsOrigenPpto;
        this.bsRef1 = bsRef1;
        this.bsRef2 = bsRef2;
        this.bsRfc = bsRfc;
        this.bsTipoErog = bsTipoErog;
        this.bsTipoMoneda = bsTipoMoneda;
        this.bsTipoNom = bsTipoNom;
        this.bsTipoOper = bsTipoOper;
        this.descBeneSicop = descBeneSicop;
    }    

    
    /**
     * Set bsCtaBancaria value.
     *
     * @param bsCtaBancaria java.lang.String
     */
    public void setBsCtaBancaria(java.lang.String bsCtaBancaria){
        this.bsCtaBancaria = bsCtaBancaria;
    }
    
    /**
     * Get bsCtaBancaria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsCtaBancaria() {
        return this.bsCtaBancaria;    
    }
    
    /**
     * Set bsLeyenda value.
     *
     * @param bsLeyenda java.lang.String
     */
    public void setBsLeyenda(java.lang.String bsLeyenda){
        this.bsLeyenda = bsLeyenda;
    }
    
    /**
     * Get bsLeyenda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsLeyenda() {
        return this.bsLeyenda;    
    }
    
    /**
     * Set bsTipoPago value.
     *
     * @param bsTipoPago java.lang.String
     */
    public void setBsTipoPago(java.lang.String bsTipoPago){
        this.bsTipoPago = bsTipoPago;
    }
    
    /**
     * Get bsTipoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoPago() {
        return this.bsTipoPago;    
    }
    
    /**
     * Set idBeneSicop value.
     *
     * @param idBeneSicop java.lang.String
     */
    public void setIdBeneSicop(java.lang.String idBeneSicop){
        this.idBeneSicop = idBeneSicop;
    }
    
    /**
     * Get idBeneSicop value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBeneSicop() {
        return this.idBeneSicop;    
    }
    
    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
    public void setUsuario(java.lang.String usuario){
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
     * Set bsOrigenPpto value.
     *
     * @param bsOrigenPpto java.lang.Integer
     */
    public void setBsOrigenPpto(java.lang.Integer bsOrigenPpto){
        this.bsOrigenPpto = bsOrigenPpto;
    }
    
    /**
     * Get bsOrigenPpto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsOrigenPpto() {
        return this.bsOrigenPpto;    
    }
    
    /**
     * Set bsRef1 value.
     *
     * @param bsRef1 java.lang.String
     */
    public void setBsRef1(java.lang.String bsRef1){
        this.bsRef1 = bsRef1;
    }
    
    /**
     * Get bsRef1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsRef1() {
        return this.bsRef1;    
    }
    
    /**
     * Set bsRef2 value.
     *
     * @param bsRef2 java.lang.String
     */
    public void setBsRef2(java.lang.String bsRef2){
        this.bsRef2 = bsRef2;
    }
    
    /**
     * Get bsRef2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsRef2() {
        return this.bsRef2;    
    }
    
    /**
     * Set bsRfc value.
     *
     * @param bsRfc java.lang.String
     */
    public void setBsRfc(java.lang.String bsRfc){
        this.bsRfc = bsRfc;
    }
    
    /**
     * Get bsRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsRfc() {
        return this.bsRfc;    
    }
    
    /**
     * Set bsTipoErog value.
     *
     * @param bsTipoErog java.lang.Integer
     */
    public void setBsTipoErog(java.lang.Integer bsTipoErog){
        this.bsTipoErog = bsTipoErog;
    }
    
    /**
     * Get bsTipoErog value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsTipoErog() {
        return this.bsTipoErog;    
    }
    
    /**
     * Set bsTipoMoneda value.
     *
     * @param bsTipoMoneda java.lang.String
     */
    public void setBsTipoMoneda(java.lang.String bsTipoMoneda){
        this.bsTipoMoneda = bsTipoMoneda;
    }
    
    /**
     * Get bsTipoMoneda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoMoneda() {
        return this.bsTipoMoneda;    
    }
    
    /**
     * Set bsTipoNom value.
     *
     * @param bsTipoNom java.lang.String
     */
    public void setBsTipoNom(java.lang.String bsTipoNom){
        this.bsTipoNom = bsTipoNom;
    }
    
    /**
     * Get bsTipoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoNom() {
        return this.bsTipoNom;    
    }
    
    /**
     * Set bsTipoOper value.
     *
     * @param bsTipoOper java.lang.Integer
     */
    public void setBsTipoOper(java.lang.Integer bsTipoOper){
        this.bsTipoOper = bsTipoOper;
    }
    
    /**
     * Get bsTipoOper value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsTipoOper() {
        return this.bsTipoOper;    
    }
    
    /**
     * Set descBeneSicop value.
     *
     * @param descBeneSicop java.lang.String
     */
    public void setDescBeneSicop(java.lang.String descBeneSicop){
        this.descBeneSicop = descBeneSicop;
    }
    
    /**
     * Get descBeneSicop value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescBeneSicop() {
        return this.descBeneSicop;    
    }
}
