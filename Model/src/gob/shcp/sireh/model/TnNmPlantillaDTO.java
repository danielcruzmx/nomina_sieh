package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnNmPlantilla data.
 */
public class TnNmPlantillaDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(200)    
    private java.lang.String tnNmpId;
    @MaxLength(80)    
    private java.lang.String tnNmpCurso;
    @MaxLength(200)    
    private java.lang.String tnNmpDenominacion;
    private java.lang.Integer tnNmpDuracion;
    @MaxLength(40)    
    private java.lang.String tnNmpEstatus;
    private java.util.Date tnNmpFechaCarga;
    @MaxLength(40)    
    private java.lang.String tnNmpGenero;
    private java.util.Date tnNmpInicio;
    @MaxLength(40)    
    private java.lang.String tnNmpMes;
    @MaxLength(16)    
    private java.lang.String tnNmpNivel;
    @MaxLength(200)    
    private java.lang.String tnNmpNombre;
    private java.lang.Integer tnNmpPlaza;
    @MaxLength(40)    
    private java.lang.String tnNmpPuesto;
    @MaxLength(52)    
    private java.lang.String tnNmpRfc;
    private java.util.Date tnNmpTermino;
    @MaxLength(8)    
    private java.lang.String tnNmpTipoCarga;
    @MaxLength(8)    
    private java.lang.String tnNmpTipoPuesto;
    @MaxLength(12)    
    private java.lang.String tnNmpUnidad;

    /**
     * Constructor for TnNmPlantillaDTO class.
     */
    public TnNmPlantillaDTO() { }    

                                                                            
    /**
     * Constructor for TnNmPlantillaDTO class.
     *
     * @param tnNmpId java.lang.String
     * @param tnNmpCurso java.lang.String
     * @param tnNmpDenominacion java.lang.String
     * @param tnNmpDuracion java.lang.Integer
     * @param tnNmpEstatus java.lang.String
     * @param tnNmpFechaCarga java.util.Date
     * @param tnNmpGenero java.lang.String
     * @param tnNmpInicio java.util.Date
     * @param tnNmpMes java.lang.String
     * @param tnNmpNivel java.lang.String
     * @param tnNmpNombre java.lang.String
     * @param tnNmpPlaza java.lang.Integer
     * @param tnNmpPuesto java.lang.String
     * @param tnNmpRfc java.lang.String
     * @param tnNmpTermino java.util.Date
     * @param tnNmpTipoCarga java.lang.String
     * @param tnNmpTipoPuesto java.lang.String
     * @param tnNmpUnidad java.lang.String
     */
    public TnNmPlantillaDTO( java.lang.String tnNmpId, java.lang.String tnNmpCurso, java.lang.String tnNmpDenominacion, java.lang.Integer tnNmpDuracion, java.lang.String tnNmpEstatus, java.util.Date tnNmpFechaCarga, java.lang.String tnNmpGenero, java.util.Date tnNmpInicio, java.lang.String tnNmpMes, java.lang.String tnNmpNivel, java.lang.String tnNmpNombre, java.lang.Integer tnNmpPlaza, java.lang.String tnNmpPuesto, java.lang.String tnNmpRfc, java.util.Date tnNmpTermino, java.lang.String tnNmpTipoCarga, java.lang.String tnNmpTipoPuesto, java.lang.String tnNmpUnidad){    
        this.tnNmpId = tnNmpId;
        this.tnNmpCurso = tnNmpCurso;
        this.tnNmpDenominacion = tnNmpDenominacion;
        this.tnNmpDuracion = tnNmpDuracion;
        this.tnNmpEstatus = tnNmpEstatus;
        this.tnNmpFechaCarga = tnNmpFechaCarga;
        this.tnNmpGenero = tnNmpGenero;
        this.tnNmpInicio = tnNmpInicio;
        this.tnNmpMes = tnNmpMes;
        this.tnNmpNivel = tnNmpNivel;
        this.tnNmpNombre = tnNmpNombre;
        this.tnNmpPlaza = tnNmpPlaza;
        this.tnNmpPuesto = tnNmpPuesto;
        this.tnNmpRfc = tnNmpRfc;
        this.tnNmpTermino = tnNmpTermino;
        this.tnNmpTipoCarga = tnNmpTipoCarga;
        this.tnNmpTipoPuesto = tnNmpTipoPuesto;
        this.tnNmpUnidad = tnNmpUnidad;
    }    

    
    /**
     * Set tnNmpId value.
     *
     * @param tnNmpId java.lang.String
     */
    public void setTnNmpId(java.lang.String tnNmpId){
        this.tnNmpId = tnNmpId;
    }
    
    /**
     * Get tnNmpId value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpId() {
        return this.tnNmpId;    
    }
    
    /**
     * Set tnNmpCurso value.
     *
     * @param tnNmpCurso java.lang.String
     */
    public void setTnNmpCurso(java.lang.String tnNmpCurso){
        this.tnNmpCurso = tnNmpCurso;
    }
    
    /**
     * Get tnNmpCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpCurso() {
        return this.tnNmpCurso;    
    }
    
    /**
     * Set tnNmpDenominacion value.
     *
     * @param tnNmpDenominacion java.lang.String
     */
    public void setTnNmpDenominacion(java.lang.String tnNmpDenominacion){
        this.tnNmpDenominacion = tnNmpDenominacion;
    }
    
    /**
     * Get tnNmpDenominacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpDenominacion() {
        return this.tnNmpDenominacion;    
    }
    
    /**
     * Set tnNmpDuracion value.
     *
     * @param tnNmpDuracion java.lang.Integer
     */
    public void setTnNmpDuracion(java.lang.Integer tnNmpDuracion){
        this.tnNmpDuracion = tnNmpDuracion;
    }
    
    /**
     * Get tnNmpDuracion value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTnNmpDuracion() {
        return this.tnNmpDuracion;    
    }
    
    /**
     * Set tnNmpEstatus value.
     *
     * @param tnNmpEstatus java.lang.String
     */
    public void setTnNmpEstatus(java.lang.String tnNmpEstatus){
        this.tnNmpEstatus = tnNmpEstatus;
    }
    
    /**
     * Get tnNmpEstatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpEstatus() {
        return this.tnNmpEstatus;    
    }
    
    /**
     * Set tnNmpFechaCarga value.
     *
     * @param tnNmpFechaCarga java.util.Date
     */
    public void setTnNmpFechaCarga(java.util.Date tnNmpFechaCarga){
        this.tnNmpFechaCarga = tnNmpFechaCarga;
    }
    
    /**
     * Get tnNmpFechaCarga value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpFechaCarga() {
        return this.tnNmpFechaCarga;    
    }
    
    /**
     * Set tnNmpGenero value.
     *
     * @param tnNmpGenero java.lang.String
     */
    public void setTnNmpGenero(java.lang.String tnNmpGenero){
        this.tnNmpGenero = tnNmpGenero;
    }
    
    /**
     * Get tnNmpGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpGenero() {
        return this.tnNmpGenero;    
    }
    
    /**
     * Set tnNmpInicio value.
     *
     * @param tnNmpInicio java.util.Date
     */
    public void setTnNmpInicio(java.util.Date tnNmpInicio){
        this.tnNmpInicio = tnNmpInicio;
    }
    
    /**
     * Get tnNmpInicio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpInicio() {
        return this.tnNmpInicio;    
    }
    
    /**
     * Set tnNmpMes value.
     *
     * @param tnNmpMes java.lang.String
     */
    public void setTnNmpMes(java.lang.String tnNmpMes){
        this.tnNmpMes = tnNmpMes;
    }
    
    /**
     * Get tnNmpMes value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpMes() {
        return this.tnNmpMes;    
    }
    
    /**
     * Set tnNmpNivel value.
     *
     * @param tnNmpNivel java.lang.String
     */
    public void setTnNmpNivel(java.lang.String tnNmpNivel){
        this.tnNmpNivel = tnNmpNivel;
    }
    
    /**
     * Get tnNmpNivel value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpNivel() {
        return this.tnNmpNivel;    
    }
    
    /**
     * Set tnNmpNombre value.
     *
     * @param tnNmpNombre java.lang.String
     */
    public void setTnNmpNombre(java.lang.String tnNmpNombre){
        this.tnNmpNombre = tnNmpNombre;
    }
    
    /**
     * Get tnNmpNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpNombre() {
        return this.tnNmpNombre;    
    }
    
    /**
     * Set tnNmpPlaza value.
     *
     * @param tnNmpPlaza java.lang.Integer
     */
    public void setTnNmpPlaza(java.lang.Integer tnNmpPlaza){
        this.tnNmpPlaza = tnNmpPlaza;
    }
    
    /**
     * Get tnNmpPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTnNmpPlaza() {
        return this.tnNmpPlaza;    
    }
    
    /**
     * Set tnNmpPuesto value.
     *
     * @param tnNmpPuesto java.lang.String
     */
    public void setTnNmpPuesto(java.lang.String tnNmpPuesto){
        this.tnNmpPuesto = tnNmpPuesto;
    }
    
    /**
     * Get tnNmpPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpPuesto() {
        return this.tnNmpPuesto;    
    }
    
    /**
     * Set tnNmpRfc value.
     *
     * @param tnNmpRfc java.lang.String
     */
    public void setTnNmpRfc(java.lang.String tnNmpRfc){
        this.tnNmpRfc = tnNmpRfc;
    }
    
    /**
     * Get tnNmpRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpRfc() {
        return this.tnNmpRfc;    
    }
    
    /**
     * Set tnNmpTermino value.
     *
     * @param tnNmpTermino java.util.Date
     */
    public void setTnNmpTermino(java.util.Date tnNmpTermino){
        this.tnNmpTermino = tnNmpTermino;
    }
    
    /**
     * Get tnNmpTermino value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpTermino() {
        return this.tnNmpTermino;    
    }
    
    /**
     * Set tnNmpTipoCarga value.
     *
     * @param tnNmpTipoCarga java.lang.String
     */
    public void setTnNmpTipoCarga(java.lang.String tnNmpTipoCarga){
        this.tnNmpTipoCarga = tnNmpTipoCarga;
    }
    
    /**
     * Get tnNmpTipoCarga value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpTipoCarga() {
        return this.tnNmpTipoCarga;    
    }
    
    /**
     * Set tnNmpTipoPuesto value.
     *
     * @param tnNmpTipoPuesto java.lang.String
     */
    public void setTnNmpTipoPuesto(java.lang.String tnNmpTipoPuesto){
        this.tnNmpTipoPuesto = tnNmpTipoPuesto;
    }
    
    /**
     * Get tnNmpTipoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpTipoPuesto() {
        return this.tnNmpTipoPuesto;    
    }
    
    /**
     * Set tnNmpUnidad value.
     *
     * @param tnNmpUnidad java.lang.String
     */
    public void setTnNmpUnidad(java.lang.String tnNmpUnidad){
        this.tnNmpUnidad = tnNmpUnidad;
    }
    
    /**
     * Get tnNmpUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpUnidad() {
        return this.tnNmpUnidad;    
    }


}