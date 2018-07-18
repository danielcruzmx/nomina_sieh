package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpDatosComplementario data.
 */
public class TdExpDatosComplementario implements Domain, Serializable {
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
    private java.lang.Boolean idDominioIdioma;
    private java.lang.String idEdoCivil;
    private java.lang.Boolean idEspProtCivil;
    private java.lang.Integer idIdioma;
    private java.lang.Boolean idInstProtCiv;
    private java.lang.String idTipoSangre;

    /**
     * Constructor for TdExpDatosComplementario class.
     */
    public TdExpDatosComplementario() {
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
     * @param idDominioIdioma java.lang.Boolean
     * @param idEdoCivil java.lang.String
     * @param idEspProtCivil java.lang.Boolean
     * @param idIdioma java.lang.Integer
     * @param idInstProtCiv java.lang.Boolean
     * @param idTipoSangre java.lang.String
     */
    public TdExpDatosComplementario(java.lang.String rfcEmpleado, 
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
                                    java.lang.Boolean idDominioIdioma, 
                                    java.lang.String idEdoCivil, 
                                    java.lang.Boolean idEspProtCivil, 
                                    java.lang.Integer idIdioma, 
                                    java.lang.Boolean idInstProtCiv, 
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
     * Get idDominioIdioma value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdDominioIdioma() {
        return this.idDominioIdioma;
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
     * Get idEspProtCivil value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdEspProtCivil() {
        return this.idEspProtCivil;
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
     * Get idInstProtCiv value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdInstProtCiv() {
        return this.idInstProtCiv;
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
     * Set idDominioIdioma value.
     *
     * @param idDominioIdioma java.lang.Boolean
     */
    public void setIdDominioIdioma(java.lang.Boolean idDominioIdioma) {
        this.idDominioIdioma = idDominioIdioma;
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
     * Set idEspProtCivil value.
     *
     * @param idEspProtCivil java.lang.Boolean
     */
    public void setIdEspProtCivil(java.lang.Boolean idEspProtCivil) {
        this.idEspProtCivil = idEspProtCivil;
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
     * Set idInstProtCiv value.
     *
     * @param idInstProtCiv java.lang.Boolean
     */
    public void setIdInstProtCiv(java.lang.Boolean idInstProtCiv) {
        this.idInstProtCiv = idInstProtCiv;
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
}
