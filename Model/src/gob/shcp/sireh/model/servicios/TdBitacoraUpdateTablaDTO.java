package gob.shcp.sireh.model.servicios;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdBitacoraUpdateTabla data.
 */
public class TdBitacoraUpdateTablaDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idBitacora;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4000)    
    private java.lang.String debeDecir;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4000)    
    private java.lang.String dice;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(3000)    
    private java.lang.String encabezadoTabla;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(50)    
    private java.lang.String ipOrigen;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(1000)    
    private java.lang.String motivoModifica;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String tablaModificada;

    /**
     * Constructor for TdBitacoraUpdateTablaDTO class.
     */
    public TdBitacoraUpdateTablaDTO() { }    

                                
    /**
     * Constructor for TdBitacoraUpdateTablaDTO class.
     *
     * @param idBitacora java.lang.Integer
     * @param debeDecir java.lang.String
     * @param dice java.lang.String
     * @param encabezadoTabla java.lang.String
     * @param ipOrigen java.lang.String
     * @param motivoModifica java.lang.String
     * @param tablaModificada java.lang.String
     */
    public TdBitacoraUpdateTablaDTO( java.lang.Integer idBitacora, java.lang.String debeDecir, java.lang.String dice, java.lang.String encabezadoTabla, java.lang.String ipOrigen, java.lang.String motivoModifica, java.lang.String tablaModificada){    
        this.idBitacora = idBitacora;
        this.debeDecir = debeDecir;
        this.dice = dice;
        this.encabezadoTabla = encabezadoTabla;
        this.ipOrigen = ipOrigen;
        this.motivoModifica = motivoModifica;
        this.tablaModificada = tablaModificada;
    }    

    
    /**
     * Set idBitacora value.
     *
     * @param idBitacora java.lang.Integer
     */
    public void setIdBitacora(java.lang.Integer idBitacora){
        this.idBitacora = idBitacora;
    }
    
    /**
     * Get idBitacora value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdBitacora() {
        return this.idBitacora;    
    }
    
    /**
     * Set debeDecir value.
     *
     * @param debeDecir java.lang.String
     */
    public void setDebeDecir(java.lang.String debeDecir){
        this.debeDecir = debeDecir;
    }
    
    /**
     * Get debeDecir value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDebeDecir() {
        return this.debeDecir;    
    }
    
    /**
     * Set dice value.
     *
     * @param dice java.lang.String
     */
    public void setDice(java.lang.String dice){
        this.dice = dice;
    }
    
    /**
     * Get dice value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDice() {
        return this.dice;    
    }
    
    /**
     * Set encabezadoTabla value.
     *
     * @param encabezadoTabla java.lang.String
     */
    public void setEncabezadoTabla(java.lang.String encabezadoTabla){
        this.encabezadoTabla = encabezadoTabla;
    }
    
    /**
     * Get encabezadoTabla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getEncabezadoTabla() {
        return this.encabezadoTabla;    
    }
    
    /**
     * Set ipOrigen value.
     *
     * @param ipOrigen java.lang.String
     */
    public void setIpOrigen(java.lang.String ipOrigen){
        this.ipOrigen = ipOrigen;
    }
    
    /**
     * Get ipOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIpOrigen() {
        return this.ipOrigen;    
    }
    
    /**
     * Set motivoModifica value.
     *
     * @param motivoModifica java.lang.String
     */
    public void setMotivoModifica(java.lang.String motivoModifica){
        this.motivoModifica = motivoModifica;
    }
    
    /**
     * Get motivoModifica value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMotivoModifica() {
        return this.motivoModifica;    
    }
    
    /**
     * Set tablaModificada value.
     *
     * @param tablaModificada java.lang.String
     */
    public void setTablaModificada(java.lang.String tablaModificada){
        this.tablaModificada = tablaModificada;
    }
    
    /**
     * Get tablaModificada value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTablaModificada() {
        return this.tablaModificada;    
    }


}