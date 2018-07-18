package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcConceptoPago data.
 */
public class TcConceptoPago implements Domain, Serializable {
    private TcConceptoPagoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Boolean cpActivo;
    private java.lang.String cpConPension;
    private java.lang.String cpIsr;
    private java.lang.String cpPrioridad;
    private java.lang.String descConPag;

    /**
     * Constructor for TcConceptoPago class.
     */
    public TcConceptoPago() {
    }

    /**
     * Constructor for TcConceptoPago class.
     *
     * @param idConcepto java.lang.String
     * @param idTipoCpto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cpActivo java.lang.Boolean
     * @param cpConPension java.lang.String
     * @param cpIsr java.lang.String
     * @param cpPrioridad java.lang.String
     * @param descConPag java.lang.String
     */
    public TcConceptoPago(TcConceptoPagoPK idComposite, 
                          java.util.Date fecModifico, java.lang.String usuario, 
                          java.lang.Boolean cpActivo, 
                          java.lang.String cpConPension, 
                          java.lang.String cpIsr, java.lang.String cpPrioridad, 
                          java.lang.String descConPag) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cpActivo = cpActivo;
        this.cpConPension = cpConPension;
        this.cpIsr = cpIsr;
        this.cpPrioridad = cpPrioridad;
        this.descConPag = descConPag;
    }

    /**
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdConcepto();
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdTipoCpto();
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
     * Get cpActivo value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isCpActivo() {
        return this.cpActivo;
    }

    /**
     * Get cpConPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpConPension() {
        return this.cpConPension;
    }

    /**
     * Get cpIsr value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpIsr() {
        return this.cpIsr;
    }

    /**
     * Get cpPrioridad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpPrioridad() {
        return this.cpPrioridad;
    }

    /**
     * Get descConPag value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescConPag() {
        return this.descConPag;
    }

    /**
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto) {
        if (idComposite == null) {
            idComposite = new TcConceptoPagoPK();
        }
        this.idComposite.setIdConcepto(idConcepto);
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        if (idComposite == null) {
            idComposite = new TcConceptoPagoPK();
        }
        this.idComposite.setIdTipoCpto(idTipoCpto);
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
     * Set cpActivo value.
     *
     * @param cpActivo java.lang.Boolean
     */
    public void setCpActivo(java.lang.Boolean cpActivo) {
        this.cpActivo = cpActivo;
    }

    /**
     * Set cpConPension value.
     *
     * @param cpConPension java.lang.String
     */
    public void setCpConPension(java.lang.String cpConPension) {
        this.cpConPension = cpConPension;
    }

    /**
     * Set cpIsr value.
     *
     * @param cpIsr java.lang.String
     */
    public void setCpIsr(java.lang.String cpIsr) {
        this.cpIsr = cpIsr;
    }

    /**
     * Set cpPrioridad value.
     *
     * @param cpPrioridad java.lang.String
     */
    public void setCpPrioridad(java.lang.String cpPrioridad) {
        this.cpPrioridad = cpPrioridad;
    }

    /**
     * Set descConPag value.
     *
     * @param descConPag java.lang.String
     */
    public void setDescConPag(java.lang.String descConPag) {
        this.descConPag = descConPag;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcConceptoPagoPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
