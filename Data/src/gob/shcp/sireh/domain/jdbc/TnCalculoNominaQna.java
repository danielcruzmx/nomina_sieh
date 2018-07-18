package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnCalculoNominaQna data.
 */
public class TnCalculoNominaQna implements Domain, Serializable {
    private TnCalculoNominaQnaPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String cnqCptos;
    private java.util.Date cnqFinPago;
    private java.lang.Double cnqLiquido;

    /**
     * Constructor for TnCalculoNominaQna class.
     */
    public TnCalculoNominaQna() {
    }

    /**
     * Constructor for TnCalculoNominaQna class.
     *
     * @param cnqIniPago java.util.Date
     * @param cnqRfc java.lang.String
     * @param idNomina java.lang.Integer
     * @param idPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cnqCptos java.lang.String
     * @param cnqFinPago java.util.Date
     * @param cnqLiquido java.lang.Double
     */
    public TnCalculoNominaQna(TnCalculoNominaQnaPK idComposite, 
                              java.util.Date fecModifico, 
                              java.lang.String usuario, 
                              java.lang.String cnqCptos, 
                              java.util.Date cnqFinPago, 
                              java.lang.Double cnqLiquido) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cnqCptos = cnqCptos;
        this.cnqFinPago = cnqFinPago;
        this.cnqLiquido = cnqLiquido;
    }

    /**
     * Get cnqIniPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnqIniPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCnqIniPago();
    }

    /**
     * Get cnqRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnqRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCnqRfc();
    }

    /**
     * Get idNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNomina() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdNomina();
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdPlaza();
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
     * Get cnqCptos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnqCptos() {
        return this.cnqCptos;
    }

    /**
     * Get cnqFinPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnqFinPago() {
        return this.cnqFinPago;
    }

    /**
     * Get cnqLiquido value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCnqLiquido() {
        return this.cnqLiquido;
    }

    /**
     * Set cnqIniPago value.
     *
     * @param cnqIniPago java.util.Date
     */
    public void setCnqIniPago(java.util.Date cnqIniPago) {
        if (idComposite == null) {
            idComposite = new TnCalculoNominaQnaPK();
        }
        this.idComposite.setCnqIniPago(cnqIniPago);
    }

    /**
     * Set cnqRfc value.
     *
     * @param cnqRfc java.lang.String
     */
    public void setCnqRfc(java.lang.String cnqRfc) {
        if (idComposite == null) {
            idComposite = new TnCalculoNominaQnaPK();
        }
        this.idComposite.setCnqRfc(cnqRfc);
    }

    /**
     * Set idNomina value.
     *
     * @param idNomina java.lang.Integer
     */
    public void setIdNomina(java.lang.Integer idNomina) {
        if (idComposite == null) {
            idComposite = new TnCalculoNominaQnaPK();
        }
        this.idComposite.setIdNomina(idNomina);
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        if (idComposite == null) {
            idComposite = new TnCalculoNominaQnaPK();
        }
        this.idComposite.setIdPlaza(idPlaza);
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
     * Set cnqCptos value.
     *
     * @param cnqCptos java.lang.String
     */
    public void setCnqCptos(java.lang.String cnqCptos) {
        this.cnqCptos = cnqCptos;
    }

    /**
     * Set cnqFinPago value.
     *
     * @param cnqFinPago java.util.Date
     */
    public void setCnqFinPago(java.util.Date cnqFinPago) {
        this.cnqFinPago = cnqFinPago;
    }

    /**
     * Set cnqLiquido value.
     *
     * @param cnqLiquido java.lang.Double
     */
    public void setCnqLiquido(java.lang.Double cnqLiquido) {
        this.cnqLiquido = cnqLiquido;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCalculoNominaQnaPK)idComposite;
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
