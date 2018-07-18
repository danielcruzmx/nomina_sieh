package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnPaquete data.
 */
public class TnPaquete implements Domain, Serializable {
    private java.lang.Integer idPaquete;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Integer idEstatus;
    private java.lang.Boolean paqConError;
    private java.lang.Long paqConErrores;
    private java.lang.String paqDescrip;
    private java.util.Date paqFecCarga;
    private java.util.Date paqFecModifica;
    private java.util.Date paqFecProceso;
    private java.util.Date paqFecTimbrado;
    private java.lang.String paqFolio;
    private java.lang.Long paqProcesados;
    private java.lang.Long paqSinErrores;
    private java.lang.String paqTipoCarga;
    private java.lang.String paqUsuario;
    private java.sql.Clob xmlCancelacion;

    /**
     * Constructor for TnPaquete class.
     */
    public TnPaquete() {
    }

    /**
     * Constructor for TnPaquete class.
     *
     * @param idPaquete java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idEstatus java.lang.Integer
     * @param paqConError java.lang.Boolean
     * @param paqConErrores java.lang.Long
     * @param paqDescrip java.lang.String
     * @param paqFecCarga java.util.Date
     * @param paqFecModifica java.util.Date
     * @param paqFecProceso java.util.Date
     * @param paqFecTimbrado java.util.Date
     * @param paqFolio java.lang.String
     * @param paqProcesados java.lang.Long
     * @param paqSinErrores java.lang.Long
     * @param paqTipoCarga java.lang.String
     * @param paqUsuario java.lang.String
     * @param xmlCancelacion java.sql.Clob
     */
    public TnPaquete(java.lang.Integer idPaquete, java.util.Date fecModifico, 
                     java.lang.String usuario, java.lang.Integer idEstatus, 
                     java.lang.Boolean paqConError, 
                     java.lang.Long paqConErrores, java.lang.String paqDescrip, 
                     java.util.Date paqFecCarga, java.util.Date paqFecModifica, 
                     java.util.Date paqFecProceso, 
                     java.util.Date paqFecTimbrado, java.lang.String paqFolio, 
                     java.lang.Long paqProcesados, 
                     java.lang.Long paqSinErrores, 
                     java.lang.String paqTipoCarga, 
                     java.lang.String paqUsuario, 
                     java.sql.Clob xmlCancelacion) {
        this.idPaquete = idPaquete;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEstatus = idEstatus;
        this.paqConError = paqConError;
        this.paqConErrores = paqConErrores;
        this.paqDescrip = paqDescrip;
        this.paqFecCarga = paqFecCarga;
        this.paqFecModifica = paqFecModifica;
        this.paqFecProceso = paqFecProceso;
        this.paqFecTimbrado = paqFecTimbrado;
        this.paqFolio = paqFolio;
        this.paqProcesados = paqProcesados;
        this.paqSinErrores = paqSinErrores;
        this.paqTipoCarga = paqTipoCarga;
        this.paqUsuario = paqUsuario;
        this.xmlCancelacion = xmlCancelacion;
    }

    /**
     * Get idPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPaquete() {
        return this.idPaquete;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get idEstatus value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEstatus() {
        return this.idEstatus;
    }

    /**
     * Get paqConError value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isPaqConError() {
        return this.paqConError;
    }

    /**
     * Get paqConErrores value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getPaqConErrores() {
        return this.paqConErrores;
    }

    /**
     * Get paqDescrip value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPaqDescrip() {
        return this.paqDescrip;
    }

    /**
     * Get paqFecCarga value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPaqFecCarga() {
        return this.paqFecCarga;
    }

    /**
     * Get paqFecModifica value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPaqFecModifica() {
        return this.paqFecModifica;
    }

    /**
     * Get paqFecProceso value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPaqFecProceso() {
        return this.paqFecProceso;
    }

    /**
     * Get paqFecTimbrado value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPaqFecTimbrado() {
        return this.paqFecTimbrado;
    }

    /**
     * Get paqFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPaqFolio() {
        return this.paqFolio;
    }

    /**
     * Get paqProcesados value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getPaqProcesados() {
        return this.paqProcesados;
    }

    /**
     * Get paqSinErrores value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getPaqSinErrores() {
        return this.paqSinErrores;
    }

    /**
     * Get paqTipoCarga value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPaqTipoCarga() {
        return this.paqTipoCarga;
    }

    /**
     * Get paqUsuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPaqUsuario() {
        return this.paqUsuario;
    }

    /**
     * Get xmlCancelacion value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlCancelacion() {
        return this.xmlCancelacion;
    }


    /**
     * Set idPaquete value.
     *
     * @param idPaquete java.lang.Integer
     */
    public void setIdPaquete(java.lang.Integer idPaquete) {
        this.idPaquete = idPaquete;
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set idEstatus value.
     *
     * @param idEstatus java.lang.Integer
     */
    public void setIdEstatus(java.lang.Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     * Set paqConError value.
     *
     * @param paqConError java.lang.Boolean
     */
    public void setPaqConError(java.lang.Boolean paqConError) {
        this.paqConError = paqConError;
    }

    /**
     * Set paqConErrores value.
     *
     * @param paqConErrores java.lang.Long
     */
    public void setPaqConErrores(java.lang.Long paqConErrores) {
        this.paqConErrores = paqConErrores;
    }

    /**
     * Set paqDescrip value.
     *
     * @param paqDescrip java.lang.String
     */
    public void setPaqDescrip(java.lang.String paqDescrip) {
        this.paqDescrip = paqDescrip;
    }

    /**
     * Set paqFecCarga value.
     *
     * @param paqFecCarga java.util.Date
     */
    public void setPaqFecCarga(java.util.Date paqFecCarga) {
        this.paqFecCarga = paqFecCarga;
    }

    /**
     * Set paqFecModifica value.
     *
     * @param paqFecModifica java.util.Date
     */
    public void setPaqFecModifica(java.util.Date paqFecModifica) {
        this.paqFecModifica = paqFecModifica;
    }

    /**
     * Set paqFecProceso value.
     *
     * @param paqFecProceso java.util.Date
     */
    public void setPaqFecProceso(java.util.Date paqFecProceso) {
        this.paqFecProceso = paqFecProceso;
    }

    /**
     * Set paqFecTimbrado value.
     *
     * @param paqFecTimbrado java.util.Date
     */
    public void setPaqFecTimbrado(java.util.Date paqFecTimbrado) {
        this.paqFecTimbrado = paqFecTimbrado;
    }

    /**
     * Set paqFolio value.
     *
     * @param paqFolio java.lang.String
     */
    public void setPaqFolio(java.lang.String paqFolio) {
        this.paqFolio = paqFolio;
    }

    /**
     * Set paqProcesados value.
     *
     * @param paqProcesados java.lang.Long
     */
    public void setPaqProcesados(java.lang.Long paqProcesados) {
        this.paqProcesados = paqProcesados;
    }

    /**
     * Set paqSinErrores value.
     *
     * @param paqSinErrores java.lang.Long
     */
    public void setPaqSinErrores(java.lang.Long paqSinErrores) {
        this.paqSinErrores = paqSinErrores;
    }

    /**
     * Set paqTipoCarga value.
     *
     * @param paqTipoCarga java.lang.String
     */
    public void setPaqTipoCarga(java.lang.String paqTipoCarga) {
        this.paqTipoCarga = paqTipoCarga;
    }

    /**
     * Set paqUsuario value.
     *
     * @param paqUsuario java.lang.String
     */
    public void setPaqUsuario(java.lang.String paqUsuario) {
        this.paqUsuario = paqUsuario;
    }

    /**
     * Set xmlCancelacion value.
     *
     * @param xmlCancelacion java.sql.Clob
     */
    public void setXmlCancelacion(java.sql.Clob xmlCancelacion) {
        this.xmlCancelacion = xmlCancelacion;
    }

    /**
     * Set identity value.
     *
     * @param idPaquete Serializable
     */
    public void setIdentity(Serializable idPaquete) {
        this.idPaquete = (java.lang.Integer)idPaquete;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idPaquete;
    }
}
