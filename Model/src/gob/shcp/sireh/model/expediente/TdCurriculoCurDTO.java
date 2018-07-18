package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdCurriculoCur data.
 */
public class TdCurriculoCurDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(13)    
    private java.lang.String curriccRfc;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    @MaxLength(150)    
    private java.lang.String curriccCurso1;
    @MaxLength(150)    
    private java.lang.String curriccCurso2;
    @MaxLength(150)    
    private java.lang.String curriccCurso3;
    @MaxLength(20)    
    private java.lang.String curriccDocto1;
    @MaxLength(20)    
    private java.lang.String curriccDocto2;
    @MaxLength(20)    
    private java.lang.String curriccDocto3;
    @MaxLength(25)    
    private java.lang.String curriccDuracion1;
    @MaxLength(25)    
    private java.lang.String curriccDuracion2;
    @MaxLength(25)    
    private java.lang.String curriccDuracion3;
    @MaxLength(25)    
    private java.lang.String curriccGradoa1;
    @MaxLength(25)    
    private java.lang.String curriccGradoa2;
    @MaxLength(25)    
    private java.lang.String curriccGradoa3;
    @MaxLength(100)    
    private java.lang.String curriccInstituto1;
    @MaxLength(100)    
    private java.lang.String curriccInstituto2;
    @MaxLength(100)    
    private java.lang.String curriccInstituto3;

    /**
     * Constructor for TdCurriculoCurDTO class.
     */
    public TdCurriculoCurDTO() { }    

                                                                            
    /**
     * Constructor for TdCurriculoCurDTO class.
     *
     * @param curriccRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param curriccCurso1 java.lang.String
     * @param curriccCurso2 java.lang.String
     * @param curriccCurso3 java.lang.String
     * @param curriccDocto1 java.lang.String
     * @param curriccDocto2 java.lang.String
     * @param curriccDocto3 java.lang.String
     * @param curriccDuracion1 java.lang.String
     * @param curriccDuracion2 java.lang.String
     * @param curriccDuracion3 java.lang.String
     * @param curriccGradoa1 java.lang.String
     * @param curriccGradoa2 java.lang.String
     * @param curriccGradoa3 java.lang.String
     * @param curriccInstituto1 java.lang.String
     * @param curriccInstituto2 java.lang.String
     * @param curriccInstituto3 java.lang.String
     */
    public TdCurriculoCurDTO( java.lang.String curriccRfc, java.util.Date fecModifico, java.lang.String usuario, java.lang.String curriccCurso1, java.lang.String curriccCurso2, java.lang.String curriccCurso3, java.lang.String curriccDocto1, java.lang.String curriccDocto2, java.lang.String curriccDocto3, java.lang.String curriccDuracion1, java.lang.String curriccDuracion2, java.lang.String curriccDuracion3, java.lang.String curriccGradoa1, java.lang.String curriccGradoa2, java.lang.String curriccGradoa3, java.lang.String curriccInstituto1, java.lang.String curriccInstituto2, java.lang.String curriccInstituto3){    
        this.curriccRfc = curriccRfc;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.curriccCurso1 = curriccCurso1;
        this.curriccCurso2 = curriccCurso2;
        this.curriccCurso3 = curriccCurso3;
        this.curriccDocto1 = curriccDocto1;
        this.curriccDocto2 = curriccDocto2;
        this.curriccDocto3 = curriccDocto3;
        this.curriccDuracion1 = curriccDuracion1;
        this.curriccDuracion2 = curriccDuracion2;
        this.curriccDuracion3 = curriccDuracion3;
        this.curriccGradoa1 = curriccGradoa1;
        this.curriccGradoa2 = curriccGradoa2;
        this.curriccGradoa3 = curriccGradoa3;
        this.curriccInstituto1 = curriccInstituto1;
        this.curriccInstituto2 = curriccInstituto2;
        this.curriccInstituto3 = curriccInstituto3;
    }    

    
    /**
     * Set curriccRfc value.
     *
     * @param curriccRfc java.lang.String
     */
    public void setCurriccRfc(java.lang.String curriccRfc){
        this.curriccRfc = curriccRfc;
    }
    
    /**
     * Get curriccRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccRfc() {
        return this.curriccRfc;    
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
     * Set curriccCurso1 value.
     *
     * @param curriccCurso1 java.lang.String
     */
    public void setCurriccCurso1(java.lang.String curriccCurso1){
        this.curriccCurso1 = curriccCurso1;
    }
    
    /**
     * Get curriccCurso1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccCurso1() {
        return this.curriccCurso1;    
    }
    
    /**
     * Set curriccCurso2 value.
     *
     * @param curriccCurso2 java.lang.String
     */
    public void setCurriccCurso2(java.lang.String curriccCurso2){
        this.curriccCurso2 = curriccCurso2;
    }
    
    /**
     * Get curriccCurso2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccCurso2() {
        return this.curriccCurso2;    
    }
    
    /**
     * Set curriccCurso3 value.
     *
     * @param curriccCurso3 java.lang.String
     */
    public void setCurriccCurso3(java.lang.String curriccCurso3){
        this.curriccCurso3 = curriccCurso3;
    }
    
    /**
     * Get curriccCurso3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccCurso3() {
        return this.curriccCurso3;    
    }
    
    /**
     * Set curriccDocto1 value.
     *
     * @param curriccDocto1 java.lang.String
     */
    public void setCurriccDocto1(java.lang.String curriccDocto1){
        this.curriccDocto1 = curriccDocto1;
    }
    
    /**
     * Get curriccDocto1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDocto1() {
        return this.curriccDocto1;    
    }
    
    /**
     * Set curriccDocto2 value.
     *
     * @param curriccDocto2 java.lang.String
     */
    public void setCurriccDocto2(java.lang.String curriccDocto2){
        this.curriccDocto2 = curriccDocto2;
    }
    
    /**
     * Get curriccDocto2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDocto2() {
        return this.curriccDocto2;    
    }
    
    /**
     * Set curriccDocto3 value.
     *
     * @param curriccDocto3 java.lang.String
     */
    public void setCurriccDocto3(java.lang.String curriccDocto3){
        this.curriccDocto3 = curriccDocto3;
    }
    
    /**
     * Get curriccDocto3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDocto3() {
        return this.curriccDocto3;    
    }
    
    /**
     * Set curriccDuracion1 value.
     *
     * @param curriccDuracion1 java.lang.String
     */
    public void setCurriccDuracion1(java.lang.String curriccDuracion1){
        this.curriccDuracion1 = curriccDuracion1;
    }
    
    /**
     * Get curriccDuracion1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDuracion1() {
        return this.curriccDuracion1;    
    }
    
    /**
     * Set curriccDuracion2 value.
     *
     * @param curriccDuracion2 java.lang.String
     */
    public void setCurriccDuracion2(java.lang.String curriccDuracion2){
        this.curriccDuracion2 = curriccDuracion2;
    }
    
    /**
     * Get curriccDuracion2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDuracion2() {
        return this.curriccDuracion2;    
    }
    
    /**
     * Set curriccDuracion3 value.
     *
     * @param curriccDuracion3 java.lang.String
     */
    public void setCurriccDuracion3(java.lang.String curriccDuracion3){
        this.curriccDuracion3 = curriccDuracion3;
    }
    
    /**
     * Get curriccDuracion3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccDuracion3() {
        return this.curriccDuracion3;    
    }
    
    /**
     * Set curriccGradoa1 value.
     *
     * @param curriccGradoa1 java.lang.String
     */
    public void setCurriccGradoa1(java.lang.String curriccGradoa1){
        this.curriccGradoa1 = curriccGradoa1;
    }
    
    /**
     * Get curriccGradoa1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccGradoa1() {
        return this.curriccGradoa1;    
    }
    
    /**
     * Set curriccGradoa2 value.
     *
     * @param curriccGradoa2 java.lang.String
     */
    public void setCurriccGradoa2(java.lang.String curriccGradoa2){
        this.curriccGradoa2 = curriccGradoa2;
    }
    
    /**
     * Get curriccGradoa2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccGradoa2() {
        return this.curriccGradoa2;    
    }
    
    /**
     * Set curriccGradoa3 value.
     *
     * @param curriccGradoa3 java.lang.String
     */
    public void setCurriccGradoa3(java.lang.String curriccGradoa3){
        this.curriccGradoa3 = curriccGradoa3;
    }
    
    /**
     * Get curriccGradoa3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccGradoa3() {
        return this.curriccGradoa3;    
    }
    
    /**
     * Set curriccInstituto1 value.
     *
     * @param curriccInstituto1 java.lang.String
     */
    public void setCurriccInstituto1(java.lang.String curriccInstituto1){
        this.curriccInstituto1 = curriccInstituto1;
    }
    
    /**
     * Get curriccInstituto1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccInstituto1() {
        return this.curriccInstituto1;    
    }
    
    /**
     * Set curriccInstituto2 value.
     *
     * @param curriccInstituto2 java.lang.String
     */
    public void setCurriccInstituto2(java.lang.String curriccInstituto2){
        this.curriccInstituto2 = curriccInstituto2;
    }
    
    /**
     * Get curriccInstituto2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccInstituto2() {
        return this.curriccInstituto2;    
    }
    
    /**
     * Set curriccInstituto3 value.
     *
     * @param curriccInstituto3 java.lang.String
     */
    public void setCurriccInstituto3(java.lang.String curriccInstituto3){
        this.curriccInstituto3 = curriccInstituto3;
    }
    
    /**
     * Get curriccInstituto3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriccInstituto3() {
        return this.curriccInstituto3;    
    }


}