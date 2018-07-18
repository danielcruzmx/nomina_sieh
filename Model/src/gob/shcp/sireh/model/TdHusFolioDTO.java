package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdHusFolio data.
 */
public class TdHusFolioDTO  implements java.io.Serializable, Model {    

    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private java.util.Date husfolFecIng;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String husfolRfc;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(120)    
    private java.lang.String husfolCallePar;
    private java.lang.Integer husfolCodpostPar;
    @MaxLength(200)    
    private java.lang.String husfolColoniaPar;
    @MaxLength(72)    
    private java.lang.String husfolCurp;
    @MaxLength(160)    
    private java.lang.String husfolNombre;
    @MaxLength(32)    
    private java.lang.String husfolNumextPar;
    @MaxLength(32)    
    private java.lang.String husfolNumintPar;
    private java.lang.Boolean husfolNumQui;
    @MaxLength(120)    
    private java.lang.String husfolPoblacionPar;
    @MaxLength(160)    
    private java.lang.String husfolPrimerApellido;
    @MaxLength(160)    
    private java.lang.String husfolSegundoApellido;
    private java.lang.Integer idEdo;
    private java.lang.Integer idMunicipioPar;

    /**
     * Constructor for TdHusFolioDTO class.
     */
    public TdHusFolioDTO() { }    

                                                                        
    /**
     * Constructor for TdHusFolioDTO class.
     *
     * @param fecModifico java.util.Date
     * @param husfolFecIng java.util.Date
     * @param husfolRfc java.lang.String
     * @param usuario java.lang.String
     * @param husfolCallePar java.lang.String
     * @param husfolCodpostPar java.lang.Integer
     * @param husfolColoniaPar java.lang.String
     * @param husfolCurp java.lang.String
     * @param husfolNombre java.lang.String
     * @param husfolNumextPar java.lang.String
     * @param husfolNumintPar java.lang.String
     * @param husfolNumQui java.lang.Boolean
     * @param husfolPoblacionPar java.lang.String
     * @param husfolPrimerApellido java.lang.String
     * @param husfolSegundoApellido java.lang.String
     * @param idEdo java.lang.Integer
     * @param idMunicipioPar java.lang.Integer
     */
    public TdHusFolioDTO( java.util.Date fecModifico, java.util.Date husfolFecIng, java.lang.String husfolRfc, java.lang.String usuario, java.lang.String husfolCallePar, java.lang.Integer husfolCodpostPar, java.lang.String husfolColoniaPar, java.lang.String husfolCurp, java.lang.String husfolNombre, java.lang.String husfolNumextPar, java.lang.String husfolNumintPar, java.lang.Boolean husfolNumQui, java.lang.String husfolPoblacionPar, java.lang.String husfolPrimerApellido, java.lang.String husfolSegundoApellido, java.lang.Integer idEdo, java.lang.Integer idMunicipioPar){    
        this.fecModifico = fecModifico;
        this.husfolFecIng = husfolFecIng;
        this.husfolRfc = husfolRfc;
        this.usuario = usuario;
        this.husfolCallePar = husfolCallePar;
        this.husfolCodpostPar = husfolCodpostPar;
        this.husfolColoniaPar = husfolColoniaPar;
        this.husfolCurp = husfolCurp;
        this.husfolNombre = husfolNombre;
        this.husfolNumextPar = husfolNumextPar;
        this.husfolNumintPar = husfolNumintPar;
        this.husfolNumQui = husfolNumQui;
        this.husfolPoblacionPar = husfolPoblacionPar;
        this.husfolPrimerApellido = husfolPrimerApellido;
        this.husfolSegundoApellido = husfolSegundoApellido;
        this.idEdo = idEdo;
        this.idMunicipioPar = idMunicipioPar;
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
     * Set husfolFecIng value.
     *
     * @param husfolFecIng java.util.Date
     */
    public void setHusfolFecIng(java.util.Date husfolFecIng){
        this.husfolFecIng = husfolFecIng;
    }
    
    /**
     * Get husfolFecIng value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusfolFecIng() {
        return this.husfolFecIng;    
    }
    
    /**
     * Set husfolRfc value.
     *
     * @param husfolRfc java.lang.String
     */
    public void setHusfolRfc(java.lang.String husfolRfc){
        this.husfolRfc = husfolRfc;
    }
    
    /**
     * Get husfolRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolRfc() {
        return this.husfolRfc;    
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
     * Set husfolCallePar value.
     *
     * @param husfolCallePar java.lang.String
     */
    public void setHusfolCallePar(java.lang.String husfolCallePar){
        this.husfolCallePar = husfolCallePar;
    }
    
    /**
     * Get husfolCallePar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolCallePar() {
        return this.husfolCallePar;    
    }
    
    /**
     * Set husfolCodpostPar value.
     *
     * @param husfolCodpostPar java.lang.Integer
     */
    public void setHusfolCodpostPar(java.lang.Integer husfolCodpostPar){
        this.husfolCodpostPar = husfolCodpostPar;
    }
    
    /**
     * Get husfolCodpostPar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHusfolCodpostPar() {
        return this.husfolCodpostPar;    
    }
    
    /**
     * Set husfolColoniaPar value.
     *
     * @param husfolColoniaPar java.lang.String
     */
    public void setHusfolColoniaPar(java.lang.String husfolColoniaPar){
        this.husfolColoniaPar = husfolColoniaPar;
    }
    
    /**
     * Get husfolColoniaPar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolColoniaPar() {
        return this.husfolColoniaPar;    
    }
    
    /**
     * Set husfolCurp value.
     *
     * @param husfolCurp java.lang.String
     */
    public void setHusfolCurp(java.lang.String husfolCurp){
        this.husfolCurp = husfolCurp;
    }
    
    /**
     * Get husfolCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolCurp() {
        return this.husfolCurp;    
    }
    
    /**
     * Set husfolNombre value.
     *
     * @param husfolNombre java.lang.String
     */
    public void setHusfolNombre(java.lang.String husfolNombre){
        this.husfolNombre = husfolNombre;
    }
    
    /**
     * Get husfolNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolNombre() {
        return this.husfolNombre;    
    }
    
    /**
     * Set husfolNumextPar value.
     *
     * @param husfolNumextPar java.lang.String
     */
    public void setHusfolNumextPar(java.lang.String husfolNumextPar){
        this.husfolNumextPar = husfolNumextPar;
    }
    
    /**
     * Get husfolNumextPar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolNumextPar() {
        return this.husfolNumextPar;    
    }
    
    /**
     * Set husfolNumintPar value.
     *
     * @param husfolNumintPar java.lang.String
     */
    public void setHusfolNumintPar(java.lang.String husfolNumintPar){
        this.husfolNumintPar = husfolNumintPar;
    }
    
    /**
     * Get husfolNumintPar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolNumintPar() {
        return this.husfolNumintPar;    
    }
    
    /**
     * Set husfolNumQui value.
     *
     * @param husfolNumQui java.lang.Boolean
     */
    public void setHusfolNumQui(java.lang.Boolean husfolNumQui){
        this.husfolNumQui = husfolNumQui;
    }
    
    /**
     * Get husfolNumQui value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isHusfolNumQui() {
        return this.husfolNumQui;    
    }
    
    /**
     * Set husfolPoblacionPar value.
     *
     * @param husfolPoblacionPar java.lang.String
     */
    public void setHusfolPoblacionPar(java.lang.String husfolPoblacionPar){
        this.husfolPoblacionPar = husfolPoblacionPar;
    }
    
    /**
     * Get husfolPoblacionPar value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolPoblacionPar() {
        return this.husfolPoblacionPar;    
    }
    
    /**
     * Set husfolPrimerApellido value.
     *
     * @param husfolPrimerApellido java.lang.String
     */
    public void setHusfolPrimerApellido(java.lang.String husfolPrimerApellido){
        this.husfolPrimerApellido = husfolPrimerApellido;
    }
    
    /**
     * Get husfolPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolPrimerApellido() {
        return this.husfolPrimerApellido;    
    }
    
    /**
     * Set husfolSegundoApellido value.
     *
     * @param husfolSegundoApellido java.lang.String
     */
    public void setHusfolSegundoApellido(java.lang.String husfolSegundoApellido){
        this.husfolSegundoApellido = husfolSegundoApellido;
    }
    
    /**
     * Get husfolSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusfolSegundoApellido() {
        return this.husfolSegundoApellido;    
    }
    
    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo){
        this.idEdo = idEdo;
    }
    
    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;    
    }
    
    /**
     * Set idMunicipioPar value.
     *
     * @param idMunicipioPar java.lang.Integer
     */
    public void setIdMunicipioPar(java.lang.Integer idMunicipioPar){
        this.idMunicipioPar = idMunicipioPar;
    }
    
    /**
     * Get idMunicipioPar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMunicipioPar() {
        return this.idMunicipioPar;    
    }


}