package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdDepEco data.
 */
public class TdDepEco implements Domain, Serializable {
    private java.lang.Integer idDepEco;
    private java.lang.String deAgrupador;
    private java.lang.String deApeMaterno;
    private java.lang.String deApePaterno;
    private java.lang.String deCertificado;
    private java.lang.Integer deCiclo;
    private java.util.Date deFecIngGmm;
    private java.util.Date deFecNac;
    private java.lang.Integer deGmm;
    private java.lang.String deNombre;
    private java.lang.Float dePromEsc;
    private java.lang.String deRfc;
    private java.lang.String deStatus;
    private java.util.Date fecModifico;
    private java.lang.String idGenero;
    private java.lang.Integer idNivEscolar;
    private java.lang.Boolean idParentesco;
    private java.lang.String usuario;

    /**
     * Constructor for TdDepEco class.
     */
    public TdDepEco() {
    }

    /**
     * Constructor for TdDepEco class.
     *
     * @param idDepEco java.lang.Integer
     * @param deAgrupador java.lang.String
     * @param deApeMaterno java.lang.String
     * @param deApePaterno java.lang.String
     * @param deCertificado java.lang.String
     * @param deCiclo java.lang.Integer
     * @param deFecIngGmm java.util.Date
     * @param deFecNac java.util.Date
     * @param deGmm java.lang.Integer
     * @param deNombre java.lang.String
     * @param dePromEsc java.lang.Float
     * @param deRfc java.lang.String
     * @param deStatus java.lang.String
     * @param fecModifico java.util.Date
     * @param idGenero java.lang.String
     * @param idNivEscolar java.lang.Integer
     * @param idParentesco java.lang.Boolean
     * @param usuario java.lang.String
     */
    public TdDepEco(java.lang.Integer idDepEco, java.lang.String deAgrupador, 
                    java.lang.String deApeMaterno, 
                    java.lang.String deApePaterno, 
                    java.lang.String deCertificado, java.lang.Integer deCiclo, 
                    java.util.Date deFecIngGmm, java.util.Date deFecNac, 
                    java.lang.Integer deGmm, java.lang.String deNombre, 
                    java.lang.Float dePromEsc, java.lang.String deRfc, 
                    java.lang.String deStatus, java.util.Date fecModifico, 
                    java.lang.String idGenero, java.lang.Integer idNivEscolar, 
                    java.lang.Boolean idParentesco, java.lang.String usuario) {
        this.idDepEco = idDepEco;
        this.deAgrupador = deAgrupador;
        this.deApeMaterno = deApeMaterno;
        this.deApePaterno = deApePaterno;
        this.deCertificado = deCertificado;
        this.deCiclo = deCiclo;
        this.deFecIngGmm = deFecIngGmm;
        this.deFecNac = deFecNac;
        this.deGmm = deGmm;
        this.deNombre = deNombre;
        this.dePromEsc = dePromEsc;
        this.deRfc = deRfc;
        this.deStatus = deStatus;
        this.fecModifico = fecModifico;
        this.idGenero = idGenero;
        this.idNivEscolar = idNivEscolar;
        this.idParentesco = idParentesco;
        this.usuario = usuario;
    }

    /**
     * Get idDepEco value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdDepEco() {
        return this.idDepEco;
    }

    /**
     * Get deAgrupador value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeAgrupador() {
        return this.deAgrupador;
    }

    /**
     * Get deApeMaterno value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeApeMaterno() {
        return this.deApeMaterno;
    }

    /**
     * Get deApePaterno value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeApePaterno() {
        return this.deApePaterno;
    }

    /**
     * Get deCertificado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeCertificado() {
        return this.deCertificado;
    }

    /**
     * Get deCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDeCiclo() {
        return this.deCiclo;
    }

    /**
     * Get deFecIngGmm value.
     *
     * @return java.util.Date
     */
    public java.util.Date getDeFecIngGmm() {
        return this.deFecIngGmm;
    }

    /**
     * Get deFecNac value.
     *
     * @return java.util.Date
     */
    public java.util.Date getDeFecNac() {
        return this.deFecNac;
    }

    /**
     * Get deGmm value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDeGmm() {
        return this.deGmm;
    }

    /**
     * Get deNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeNombre() {
        return this.deNombre;
    }

    /**
     * Get dePromEsc value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getDePromEsc() {
        return this.dePromEsc;
    }

    /**
     * Get deRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeRfc() {
        return this.deRfc;
    }

    /**
     * Get deStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDeStatus() {
        return this.deStatus;
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
     * Get idNivEscolar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNivEscolar() {
        return this.idNivEscolar;
    }

    /**
     * Get idParentesco value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdParentesco() {
        return this.idParentesco;
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
     * Set idDepEco value.
     *
     * @param idDepEco java.lang.Integer
     */
    public void setIdDepEco(java.lang.Integer idDepEco) {
        this.idDepEco = idDepEco;
    }

    /**
     * Set deAgrupador value.
     *
     * @param deAgrupador java.lang.String
     */
    public void setDeAgrupador(java.lang.String deAgrupador) {
        this.deAgrupador = deAgrupador;
    }

    /**
     * Set deApeMaterno value.
     *
     * @param deApeMaterno java.lang.String
     */
    public void setDeApeMaterno(java.lang.String deApeMaterno) {
        this.deApeMaterno = deApeMaterno;
    }

    /**
     * Set deApePaterno value.
     *
     * @param deApePaterno java.lang.String
     */
    public void setDeApePaterno(java.lang.String deApePaterno) {
        this.deApePaterno = deApePaterno;
    }

    /**
     * Set deCertificado value.
     *
     * @param deCertificado java.lang.String
     */
    public void setDeCertificado(java.lang.String deCertificado) {
        this.deCertificado = deCertificado;
    }

    /**
     * Set deCiclo value.
     *
     * @param deCiclo java.lang.Integer
     */
    public void setDeCiclo(java.lang.Integer deCiclo) {
        this.deCiclo = deCiclo;
    }

    /**
     * Set deFecIngGmm value.
     *
     * @param deFecIngGmm java.util.Date
     */
    public void setDeFecIngGmm(java.util.Date deFecIngGmm) {
        this.deFecIngGmm = deFecIngGmm;
    }

    /**
     * Set deFecNac value.
     *
     * @param deFecNac java.util.Date
     */
    public void setDeFecNac(java.util.Date deFecNac) {
        this.deFecNac = deFecNac;
    }

    /**
     * Set deGmm value.
     *
     * @param deGmm java.lang.Integer
     */
    public void setDeGmm(java.lang.Integer deGmm) {
        this.deGmm = deGmm;
    }

    /**
     * Set deNombre value.
     *
     * @param deNombre java.lang.String
     */
    public void setDeNombre(java.lang.String deNombre) {
        this.deNombre = deNombre;
    }

    /**
     * Set dePromEsc value.
     *
     * @param dePromEsc java.lang.Float
     */
    public void setDePromEsc(java.lang.Float dePromEsc) {
        this.dePromEsc = dePromEsc;
    }

    /**
     * Set deRfc value.
     *
     * @param deRfc java.lang.String
     */
    public void setDeRfc(java.lang.String deRfc) {
        this.deRfc = deRfc;
    }

    /**
     * Set deStatus value.
     *
     * @param deStatus java.lang.String
     */
    public void setDeStatus(java.lang.String deStatus) {
        this.deStatus = deStatus;
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
     * Set idNivEscolar value.
     *
     * @param idNivEscolar java.lang.Integer
     */
    public void setIdNivEscolar(java.lang.Integer idNivEscolar) {
        this.idNivEscolar = idNivEscolar;
    }

    /**
     * Set idParentesco value.
     *
     * @param idParentesco java.lang.Boolean
     */
    public void setIdParentesco(java.lang.Boolean idParentesco) {
        this.idParentesco = idParentesco;
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
     * Set identity value.
     *
     * @param idDepEco Serializable
     */
    public void setIdentity(Serializable idDepEco) {
        this.idDepEco = (java.lang.Integer)idDepEco;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idDepEco;
    }
}
