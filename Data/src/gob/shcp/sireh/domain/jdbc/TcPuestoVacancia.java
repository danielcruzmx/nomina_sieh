package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcPuestoVacancia data.
 */
public class TcPuestoVacancia implements Domain, Serializable {
    private TcPuestoVacanciaPK idComposite;
                                        private java.util.Date fecModifico;
                        private java.lang.String usuario;
            
    /**
     * Constructor for TcPuestoVacancia class.
     */
    public TcPuestoVacancia() { }
                                                                    
    /**
     * Constructor for TcPuestoVacancia class.
     *
     * @param idPtoDestino java.lang.String
     * @param idPtoOrigen java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcPuestoVacancia( TcPuestoVacanciaPK idComposite, java.util.Date fecModifico, java.lang.String usuario) {
        this.idComposite = idComposite;
                                            this.fecModifico = fecModifico;
                            this.usuario = usuario;
                }


    /**
     * Get idPtoDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoDestino() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getIdPtoDestino();
        }

    /**
     * Get idPtoOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoOrigen() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getIdPtoOrigen();
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
     * Set idPtoDestino value.
     *
     * @param idPtoDestino java.lang.String
     */
    public void setIdPtoDestino(java.lang.String idPtoDestino) {
            if(idComposite == null) {
            idComposite = new TcPuestoVacanciaPK();
        }
        this.idComposite.setIdPtoDestino(idPtoDestino);
        }
    
    /**
     * Set idPtoOrigen value.
     *
     * @param idPtoOrigen java.lang.String
     */
    public void setIdPtoOrigen(java.lang.String idPtoOrigen) {
            if(idComposite == null) {
            idComposite = new TcPuestoVacanciaPK();
        }
        this.idComposite.setIdPtoOrigen(idPtoOrigen);
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
        this.idComposite = (TcPuestoVacanciaPK ) idComposite;
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
