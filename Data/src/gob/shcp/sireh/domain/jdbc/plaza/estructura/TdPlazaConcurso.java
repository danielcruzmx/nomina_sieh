package gob.shcp.sireh.domain.jdbc.plaza.estructura;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

import java.util.Date;

/**
 * Domain object for persistent TdPlazaConcurso data.
 */
public class TdPlazaConcurso implements Domain, Serializable {
    private TdPlazaConcursoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.util.Date fechaDesierta;
    private java.util.Date fechaEtapa;
    private java.lang.Integer idEtapa;
            
    /**
     * Constructor for TdPlazaConcurso class.
     */
    public TdPlazaConcurso() { }
                                                                                        
    /**
     * Constructor for TdPlazaConcurso class.
     *
     * @param idEstatus java.lang.Integer
     * @param idPlaza java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param fechaDesierta java.util.Date
     */
    public TdPlazaConcurso( TdPlazaConcursoPK idComposite, java.lang.Integer idEtapa, java.util.Date fecModifico, java.lang.String usuario, java.util.Date fechaDesierta, java.util.Date fechaEtapa) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.fechaDesierta = fechaDesierta;
        this.idEtapa = idEtapa;
        this.fechaEtapa = fechaEtapa;
    }

    

    /**
     * Get idEstatus value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEstatus() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getIdEstatus();
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
     * Get fechaDesierta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFechaDesierta() {
            return this.fechaDesierta;
        }

    
    /**
     * Set idEstatus value.
     *
     * @param idEstatus java.lang.Integer
     */
    public void setIdEstatus(java.lang.Integer idEstatus) {
            if(idComposite == null) {
            idComposite = new TdPlazaConcursoPK();
        }
        this.idComposite.setIdEstatus(idEstatus);
        }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
            if(idComposite == null) {
            idComposite = new TdPlazaConcursoPK();
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
     * Set fechaDesierta value.
     *
     * @param fechaDesierta java.util.Date
     */
    public void setFechaDesierta(java.util.Date fechaDesierta) {
            this.fechaDesierta = fechaDesierta;
        }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdPlazaConcursoPK ) idComposite;
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

    public void setFechaEtapa(Date fechaEtapa) {
        this.fechaEtapa = fechaEtapa;
    }

    public Date getFechaEtapa() {
        return fechaEtapa;
    }
}
