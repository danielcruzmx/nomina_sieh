package gob.shcp.sireh.domain.jdbc.plaza.estructura;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

import java.util.Date;

/**
 * Domain object for persistent TdHistoriaDesierta data.
 */
public class TdHistoriaDesierta implements Domain, Serializable {
    private TdHistoriaDesiertaPK idComposite;
        private java.lang.Integer idEstatus;
        private java.util.Date fecModifico;
        private java.lang.String usuario;
        private java.lang.Integer idEtapa;
        private java.util.Date fechaEtapa;
            
    /**
     * Constructor for TdHistoriaDesierta class.
     */
    public TdHistoriaDesierta() { }
                                                                    
    /**
     * Constructor for TdHistoriaDesierta class.
     *
     * @param fechaDesierta java.util.Date
     * @param idPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TdHistoriaDesierta( TdHistoriaDesiertaPK idComposite, java.util.Date fecModifico, java.lang.String usuario, java.lang.Integer idEtapa, java.lang.Integer idEstatus, java.util.Date fechaEtapa) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEtapa = idEtapa;
        this.fechaEtapa = fechaEtapa;
        this.idEstatus = idEstatus;
    }


    /**
     * Get fechaDesierta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFechaDesierta() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getFechaDesierta();
        }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
            if(idComposite == null) {
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
     * Set fechaDesierta value.
     *
     * @param fechaDesierta java.util.Date
     */
    public void setFechaDesierta(java.util.Date fechaDesierta) {
            if(idComposite == null) {
            idComposite = new TdHistoriaDesiertaPK();
        }
        this.idComposite.setFechaDesierta(fechaDesierta);
        }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
            if(idComposite == null) {
            idComposite = new TdHistoriaDesiertaPK();
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdHistoriaDesiertaPK ) idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }

    public void setIdEtapa(Integer idEtapa) {
        this.idEtapa = idEtapa;
    }

    public Integer getIdEtapa() {
        return idEtapa;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setFechaEtapa(Date fechaEtapa) {
        this.fechaEtapa = fechaEtapa;
    }

    public Date getFechaEtapa() {
        return fechaEtapa;
    }
}
