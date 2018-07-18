package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdExpDatosComplementario data.
 */
public class TdExpDatosComplementariosDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String rfcEmpleado;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String idGenero;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(60)    
    private java.lang.String comCelPart;
    @MaxLength(240)    
    private java.lang.String comEmailPart;
    @MaxLength(4)    
    private java.lang.String comEsPadreMadre;
    private java.lang.Integer comNumRusp;
    @MaxLength(44)    
    private java.lang.String comNumSegSoc;
    @MaxLength(60)    
    private java.lang.String comTelPart;
    @MaxLength(4)    
    private java.lang.String idDiscapacidad;
    private java.lang.Integer idDominioIdioma;
    @MaxLength(4)    
    private java.lang.String idEdoCivil;
    private java.lang.Integer idEspProtCivil;
    private java.lang.Integer idIdioma;
    private java.lang.Integer idInstProtCiv;
    @MaxLength(20)    
    private java.lang.String idTipoSangre;
    
   
    /**
     * Constructor for TdExpDatosComplementarioDTO class.
     */
    public TdExpDatosComplementariosDTO() { }    

                                                                        
    /**
     * Constructor for TdExpDatosComplementarioDTO class.
     *
     * @param rfcEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idGenero java.lang.String
     * @param usuario java.lang.String
     * @param comCelPart java.lang.String
     * @param comEmailPart java.lang.String
     * @param comEsPadreMadre java.lang.String
     * @param comNumRusp java.lang.Integer
     * @param comNumSegSoc java.lang.String
     * @param comTelPart java.lang.String
     * @param idDiscapacidad java.lang.String
     * @param idDominioIdioma java.lang.Integer
     * @param idEdoCivil java.lang.String
     * @param idEspProtCivil java.lang.Integer
     * @param idIdioma java.lang.Integer
     * @param idInstProtCiv java.lang.Integer
     * @param idTipoSangre java.lang.String
     */
    public TdExpDatosComplementariosDTO( java.lang.String rfcEmpleado, java.util.Date fecModifico, java.lang.String idGenero, java.lang.String usuario, java.lang.String comCelPart, java.lang.String comEmailPart, java.lang.String comEsPadreMadre, java.lang.Integer comNumRusp, java.lang.String comNumSegSoc, java.lang.String comTelPart, java.lang.String idDiscapacidad, java.lang.Integer idDominioIdioma, java.lang.String idEdoCivil, java.lang.Integer idEspProtCivil, java.lang.Integer idIdioma, java.lang.Integer idInstProtCiv, java.lang.String idTipoSangre){    
        this.rfcEmpleado = rfcEmpleado;
        this.fecModifico = fecModifico;
        this.idGenero = idGenero;
        this.usuario = usuario;
        this.comCelPart = comCelPart;
        this.comEmailPart = comEmailPart;
        this.comEsPadreMadre = comEsPadreMadre;
        this.comNumRusp = comNumRusp;
        this.comNumSegSoc = comNumSegSoc;
        this.comTelPart = comTelPart;
        this.idDiscapacidad = idDiscapacidad;
        this.idDominioIdioma = idDominioIdioma;
        this.idEdoCivil = idEdoCivil;
        this.idEspProtCivil = idEspProtCivil;
        this.idIdioma = idIdioma;
        this.idInstProtCiv = idInstProtCiv;
        this.idTipoSangre = idTipoSangre;
    }    

    
    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado){
        this.rfcEmpleado = rfcEmpleado;
    }
    
    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;    
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
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero){
        this.idGenero = idGenero;
    }
    
    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;    
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
     * Set comCelPart value.
     *
     * @param comCelPart java.lang.String
     */
    public void setComCelPart(java.lang.String comCelPart){
        this.comCelPart = comCelPart;
    }
    
    /**
     * Get comCelPart value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComCelPart() {
        return this.comCelPart;    
    }
    
    /**
     * Set comEmailPart value.
     *
     * @param comEmailPart java.lang.String
     */
    public void setComEmailPart(java.lang.String comEmailPart){
        this.comEmailPart = comEmailPart;
    }
    
    /**
     * Get comEmailPart value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComEmailPart() {
        return this.comEmailPart;    
    }
    
    /**
     * Set comEsPadreMadre value.
     *
     * @param comEsPadreMadre java.lang.String
     */
    public void setComEsPadreMadre(java.lang.String comEsPadreMadre){
        this.comEsPadreMadre = comEsPadreMadre;
    }
    
    /**
     * Get comEsPadreMadre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComEsPadreMadre() {
        return this.comEsPadreMadre;    
    }
    
    /**
     * Set comNumRusp value.
     *
     * @param comNumRusp java.lang.Integer
     */
    public void setComNumRusp(java.lang.Integer comNumRusp){
        this.comNumRusp = comNumRusp;
    }
    
    /**
     * Get comNumRusp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getComNumRusp() {
        return this.comNumRusp;    
    }
    
    /**
     * Set comNumSegSoc value.
     *
     * @param comNumSegSoc java.lang.String
     */
    public void setComNumSegSoc(java.lang.String comNumSegSoc){
        this.comNumSegSoc = comNumSegSoc;
    }
    
    /**
     * Get comNumSegSoc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComNumSegSoc() {
        return this.comNumSegSoc;    
    }
    
    /**
     * Set comTelPart value.
     *
     * @param comTelPart java.lang.String
     */
    public void setComTelPart(java.lang.String comTelPart){
        this.comTelPart = comTelPart;
    }
    
    /**
     * Get comTelPart value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComTelPart() {
        return this.comTelPart;    
    }
    
    /**
     * Set idDiscapacidad value.
     *
     * @param idDiscapacidad java.lang.String
     */
    public void setIdDiscapacidad(java.lang.String idDiscapacidad){
        this.idDiscapacidad = idDiscapacidad;
    }
    
    /**
     * Get idDiscapacidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDiscapacidad() {
        return this.idDiscapacidad;    
    }
    
    /**
     * Set idDominioIdioma value.
     *
     * @param idDominioIdioma java.lang.Integer
     */
    public void setIdDominioIdioma(java.lang.Integer idDominioIdioma){
        this.idDominioIdioma = idDominioIdioma;
    }
    
    /**
     * Get idDominioIdioma value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdDominioIdioma() {
        return this.idDominioIdioma;    
    }
    
    /**
     * Set idEdoCivil value.
     *
     * @param idEdoCivil java.lang.String
     */
    public void setIdEdoCivil(java.lang.String idEdoCivil){
        this.idEdoCivil = idEdoCivil;
    }
    
    /**
     * Get idEdoCivil value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoCivil() {
        return this.idEdoCivil;    
    }
    
    /**
     * Set idEspProtCivil value.
     *
     * @param idEspProtCivil java.lang.Integer
     */
    public void setIdEspProtCivil(java.lang.Integer idEspProtCivil){
        this.idEspProtCivil = idEspProtCivil;
    }
    
    /**
     * Get idEspProtCivil value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEspProtCivil() {
        return this.idEspProtCivil;    
    }
    
    /**
     * Set idIdioma value.
     *
     * @param idIdioma java.lang.Integer
     */
    public void setIdIdioma(java.lang.Integer idIdioma){
        this.idIdioma = idIdioma;
    }
    
    /**
     * Get idIdioma value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdIdioma() {
        return this.idIdioma;    
    }
    
    /**
     * Set idInstProtCiv value.
     *
     * @param idInstProtCiv java.lang.Integer
     */
    public void setIdInstProtCiv(java.lang.Integer idInstProtCiv){
        this.idInstProtCiv = idInstProtCiv;
    }
    
    /**
     * Get idInstProtCiv value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInstProtCiv() {
        return this.idInstProtCiv;    
    }
    
    /**
     * Set idTipoSangre value.
     *
     * @param idTipoSangre java.lang.String
     */
    public void setIdTipoSangre(java.lang.String idTipoSangre){
        this.idTipoSangre = idTipoSangre;
    }
    
    /**
     * Get idTipoSangre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoSangre() {
        return this.idTipoSangre;    
    }

}
