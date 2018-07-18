package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpDatosComplementario data.
 */
public class TdExpDatosComplementarios implements Domain, Serializable {
    @PrimaryKey
    private java.lang.String rfcEmpleado;
    private java.util.Date fecModifico;
    private java.lang.String idGenero;
    private java.lang.String usuario;
    private java.lang.String comCelPart;
    private java.lang.String comEmailPart;
    private java.lang.String comEsPadreMadre;
    private java.lang.Integer comNumRusp;
    private java.lang.String comNumSegSoc;
    private java.lang.String comTelPart;
    private java.lang.String idDiscapacidad;
    private java.lang.Integer idDominioIdioma;
    private java.lang.String idEdoCivil;
    private java.lang.Integer idEspProtCivil;
    private java.lang.Integer idIdioma;
    private java.lang.Integer idInstProtCiv;
    private java.lang.String idTipoSangre;

    /**
     * Constructor for TdExpDatosComplementario class.
     */
    public TdExpDatosComplementarios() {
    }

    /**
     * Constructor for TdExpDatosComplementario class.
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
    public TdExpDatosComplementarios(java.lang.String rfcEmpleado, 
                                     java.util.Date fecModifico, 
                                     java.lang.String idGenero, 
                                     java.lang.String usuario, 
                                     java.lang.String comCelPart, 
                                     java.lang.String comEmailPart, 
                                     java.lang.String comEsPadreMadre, 
                                     java.lang.Integer comNumRusp, 
                                     java.lang.String comNumSegSoc, 
                                     java.lang.String comTelPart, 
                                     java.lang.String idDiscapacidad, 
                                     java.lang.Integer idDominioIdioma, 
                                     java.lang.String idEdoCivil, 
                                     java.lang.Integer idEspProtCivil, 
                                     java.lang.Integer idIdioma, 
                                     java.lang.Integer idInstProtCiv, 
                                     java.lang.String idTipoSangre) {
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
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        return this.rfcEmpleado;
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
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
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
     * Get comCelPart value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComCelPart() {
        return this.comCelPart;
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
     * Get comEsPadreMadre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComEsPadreMadre() {
        return this.comEsPadreMadre;
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
     * Get comNumSegSoc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getComNumSegSoc() {
        return this.comNumSegSoc;
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
     * Get idDiscapacidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDiscapacidad() {
        return this.idDiscapacidad;
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
     * Get idIdioma value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdIdioma() {
        return this.idIdioma;
    }

    /**
     * Get idTipoSangre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoSangre() {
        return this.idTipoSangre;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
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
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
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
     * Set comCelPart value.
     *
     * @param comCelPart java.lang.String
     */
    public void setComCelPart(java.lang.String comCelPart) {
        this.comCelPart = comCelPart;
    }

    /**
     * Set comEmailPart value.
     *
     * @param comEmailPart java.lang.String
     */
    public void setComEmailPart(java.lang.String comEmailPart) {
        this.comEmailPart = comEmailPart;
    }

    /**
     * Set comEsPadreMadre value.
     *
     * @param comEsPadreMadre java.lang.String
     */
    public void setComEsPadreMadre(java.lang.String comEsPadreMadre) {
        this.comEsPadreMadre = comEsPadreMadre;
    }

    /**
     * Set comNumRusp value.
     *
     * @param comNumRusp java.lang.Integer
     */
    public void setComNumRusp(java.lang.Integer comNumRusp) {
        this.comNumRusp = comNumRusp;
    }

    /**
     * Set comNumSegSoc value.
     *
     * @param comNumSegSoc java.lang.String
     */
    public void setComNumSegSoc(java.lang.String comNumSegSoc) {
        this.comNumSegSoc = comNumSegSoc;
    }

    /**
     * Set comTelPart value.
     *
     * @param comTelPart java.lang.String
     */
    public void setComTelPart(java.lang.String comTelPart) {
        this.comTelPart = comTelPart;
    }

    /**
     * Set idDiscapacidad value.
     *
     * @param idDiscapacidad java.lang.String
     */
    public void setIdDiscapacidad(java.lang.String idDiscapacidad) {
        this.idDiscapacidad = idDiscapacidad;
    }

    /**
     * Set idEdoCivil value.
     *
     * @param idEdoCivil java.lang.String
     */
    public void setIdEdoCivil(java.lang.String idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    /**
     * Set idIdioma value.
     *
     * @param idIdioma java.lang.Integer
     */
    public void setIdIdioma(java.lang.Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    /**
     * Set idTipoSangre value.
     *
     * @param idTipoSangre java.lang.String
     */
    public void setIdTipoSangre(java.lang.String idTipoSangre) {
        this.idTipoSangre = idTipoSangre;
    }

    /**
     * Set identity value.
     *
     * @param rfcEmpleado Serializable
     */
    public void setIdentity(Serializable rfcEmpleado) {
        this.rfcEmpleado = (java.lang.String)rfcEmpleado;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.rfcEmpleado;
    }

    public void setIdDominioIdioma(Integer idDominioIdioma) {
        this.idDominioIdioma = idDominioIdioma;
    }

    public Integer getIdDominioIdioma() {
        return idDominioIdioma;
    }

    public void setIdEspProtCivil(Integer idEspProtCivil) {
        this.idEspProtCivil = idEspProtCivil;
    }

    public Integer getIdEspProtCivil() {
        return idEspProtCivil;
    }

    public void setIdInstProtCiv(Integer idInstProtCiv) {
        this.idInstProtCiv = idInstProtCiv;
    }

    public Integer getIdInstProtCiv() {
        return idInstProtCiv;
    }
}
