package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnHusObser data.
 */
public class TnHusObser implements Domain, Serializable {
    private TnHusObserPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TnHusObser class.
     */
    public TnHusObser() {
    }

    /**
     * Constructor for TnHusObser class.
     *
     * @param husobsReg java.lang.Integer
     * @param husobsRfc java.lang.String
     * @param husobsTexto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnHusObser(TnHusObserPK idComposite, java.util.Date fecModifico, 
                      java.lang.String usuario) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get husobsReg value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHusobsReg() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusobsReg();
    }

    /**
     * Get husobsRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusobsRfc();
    }

    /**
     * Get husobsTexto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsTexto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusobsTexto();
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
     * Set husobsReg value.
     *
     * @param husobsReg java.lang.Integer
     */
    public void setHusobsReg(java.lang.Integer husobsReg) {
        if (idComposite == null) {
            idComposite = new TnHusObserPK();
        }
        this.idComposite.setHusobsReg(husobsReg);
    }

    /**
     * Set husobsRfc value.
     *
     * @param husobsRfc java.lang.String
     */
    public void setHusobsRfc(java.lang.String husobsRfc) {
        if (idComposite == null) {
            idComposite = new TnHusObserPK();
        }
        this.idComposite.setHusobsRfc(husobsRfc);
    }

    /**
     * Set husobsTexto value.
     *
     * @param husobsTexto java.lang.String
     */
    public void setHusobsTexto(java.lang.String husobsTexto) {
        if (idComposite == null) {
            idComposite = new TnHusObserPK();
        }
        this.idComposite.setHusobsTexto(husobsTexto);
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnHusObserPK)idComposite;
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
