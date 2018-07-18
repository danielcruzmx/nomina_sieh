package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdRuspHijo data.
 */
public class TdRuspHijo implements Domain, Serializable {
    private TdRuspHijoPK idComposite;
                                        private java.util.Date fecModifico;
                        private java.lang.String trhRfcUnico;
                        private java.lang.String usuario;
                        private java.lang.String trhNombre;
                        private java.lang.String trhPrimer;
                        private java.lang.String trhSegundo;
            
    /**
     * Constructor for TdRuspHijo class.
     */
    public TdRuspHijo() { }
                                                                                                                                                    
    /**
     * Constructor for TdRuspHijo class.
     *
     * @param trhCurp java.lang.String
     * @param trhRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param trhRfcUnico java.lang.String
     * @param usuario java.lang.String
     * @param trhNombre java.lang.String
     * @param trhPrimer java.lang.String
     * @param trhSegundo java.lang.String
     */
    public TdRuspHijo( TdRuspHijoPK idComposite, java.util.Date fecModifico, java.lang.String trhRfcUnico, java.lang.String usuario, java.lang.String trhNombre, java.lang.String trhPrimer, java.lang.String trhSegundo) {
        this.idComposite = idComposite;
                                            this.fecModifico = fecModifico;
                            this.trhRfcUnico = trhRfcUnico;
                            this.usuario = usuario;
                            this.trhNombre = trhNombre;
                            this.trhPrimer = trhPrimer;
                            this.trhSegundo = trhSegundo;
                }


    /**
     * Get trhCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhCurp() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getTrhCurp();
        }

    /**
     * Get trhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhRfc() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getTrhRfc();
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
     * Get trhRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhRfcUnico() {
            return this.trhRfcUnico;
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
     * Get trhNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhNombre() {
            return this.trhNombre;
        }

    /**
     * Get trhPrimer value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhPrimer() {
            return this.trhPrimer;
        }

    /**
     * Get trhSegundo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhSegundo() {
            return this.trhSegundo;
        }

    
    /**
     * Set trhCurp value.
     *
     * @param trhCurp java.lang.String
     */
    public void setTrhCurp(java.lang.String trhCurp) {
            if(idComposite == null) {
            idComposite = new TdRuspHijoPK();
        }
        this.idComposite.setTrhCurp(trhCurp);
        }
    
    /**
     * Set trhRfc value.
     *
     * @param trhRfc java.lang.String
     */
    public void setTrhRfc(java.lang.String trhRfc) {
            if(idComposite == null) {
            idComposite = new TdRuspHijoPK();
        }
        this.idComposite.setTrhRfc(trhRfc);
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
     * Set trhRfcUnico value.
     *
     * @param trhRfcUnico java.lang.String
     */
    public void setTrhRfcUnico(java.lang.String trhRfcUnico) {
            this.trhRfcUnico = trhRfcUnico;
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
     * Set trhNombre value.
     *
     * @param trhNombre java.lang.String
     */
    public void setTrhNombre(java.lang.String trhNombre) {
            this.trhNombre = trhNombre;
        }
    
    /**
     * Set trhPrimer value.
     *
     * @param trhPrimer java.lang.String
     */
    public void setTrhPrimer(java.lang.String trhPrimer) {
            this.trhPrimer = trhPrimer;
        }
    
    /**
     * Set trhSegundo value.
     *
     * @param trhSegundo java.lang.String
     */
    public void setTrhSegundo(java.lang.String trhSegundo) {
            this.trhSegundo = trhSegundo;
        }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdRuspHijoPK ) idComposite;
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
