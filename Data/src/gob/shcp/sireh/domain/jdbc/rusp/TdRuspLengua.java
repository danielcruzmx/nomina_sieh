package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdRuspLengua data.
 */
public class TdRuspLengua implements Domain, Serializable {
    private TdRuspLenguaPK idComposite;
                                        private java.util.Date fecModifico;
                        private java.lang.String trlRfcUnico;
                        private java.lang.String trlTipo;
                        private java.lang.String usuario;
            
    /**
     * Constructor for TdRuspLengua class.
     */
    public TdRuspLengua() { }
                                                                                                            
    /**
     * Constructor for TdRuspLengua class.
     *
     * @param trlLengua java.lang.Integer
     * @param trlRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param trlRfcUnico java.lang.String
     * @param trlTipo java.lang.String
     * @param usuario java.lang.String
     */
    public TdRuspLengua( TdRuspLenguaPK idComposite, java.util.Date fecModifico, java.lang.String trlRfcUnico, java.lang.String trlTipo, java.lang.String usuario) {
        this.idComposite = idComposite;
                                            this.fecModifico = fecModifico;
                            this.trlRfcUnico = trlRfcUnico;
                            this.trlTipo = trlTipo;
                            this.usuario = usuario;
                }


    /**
     * Get trlLengua value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTrlLengua() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getTrlLengua();
        }

    /**
     * Get trlRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlRfc() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getTrlRfc();
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
     * Get trlRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlRfcUnico() {
            return this.trlRfcUnico;
        }

    /**
     * Get trlTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlTipo() {
            return this.trlTipo;
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
     * Set trlLengua value.
     *
     * @param trlLengua java.lang.Integer
     */
    public void setTrlLengua(java.lang.Integer trlLengua) {
            if(idComposite == null) {
            idComposite = new TdRuspLenguaPK();
        }
        this.idComposite.setTrlLengua(trlLengua);
        }
    
    /**
     * Set trlRfc value.
     *
     * @param trlRfc java.lang.String
     */
    public void setTrlRfc(java.lang.String trlRfc) {
            if(idComposite == null) {
            idComposite = new TdRuspLenguaPK();
        }
        this.idComposite.setTrlRfc(trlRfc);
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
     * Set trlRfcUnico value.
     *
     * @param trlRfcUnico java.lang.String
     */
    public void setTrlRfcUnico(java.lang.String trlRfcUnico) {
            this.trlRfcUnico = trlRfcUnico;
        }
    
    /**
     * Set trlTipo value.
     *
     * @param trlTipo java.lang.String
     */
    public void setTrlTipo(java.lang.String trlTipo) {
            this.trlTipo = trlTipo;
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
        this.idComposite = (TdRuspLenguaPK ) idComposite;
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
