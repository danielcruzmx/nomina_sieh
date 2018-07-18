package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcProyRegulariza data.
 */
public class TcProyRegulariza implements Domain, Serializable {
    private TcProyRegularizaPK idComposite;
    private java.lang.String descProyRegul;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcProyRegulariza class.
     */
    public TcProyRegulariza() {
    }

    /**
     * Constructor for TcProyRegulariza class.
     *
     * @param idProyRegul java.lang.String
     * @param prCiclo java.lang.Integer
     * @param descProyRegul java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcProyRegulariza(TcProyRegularizaPK idComposite, 
                            java.lang.String descProyRegul, 
                            java.util.Date fecModifico, 
                            java.lang.String usuario) {
        this.idComposite = idComposite;
        this.descProyRegul = descProyRegul;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get idProyRegul value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProyRegul() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdProyRegul();
    }

    /**
     * Get prCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPrCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getPrCiclo();
    }

    /**
     * Get descProyRegul value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescProyRegul() {
        return this.descProyRegul;
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
     * Set idProyRegul value.
     *
     * @param idProyRegul java.lang.String
     */
    public void setIdProyRegul(java.lang.String idProyRegul) {
        if (idComposite == null) {
            idComposite = new TcProyRegularizaPK();
        }
        this.idComposite.setIdProyRegul(idProyRegul);
    }

    /**
     * Set prCiclo value.
     *
     * @param prCiclo java.lang.Integer
     */
    public void setPrCiclo(java.lang.Integer prCiclo) {
        if (idComposite == null) {
            idComposite = new TcProyRegularizaPK();
        }
        this.idComposite.setPrCiclo(prCiclo);
    }

    /**
     * Set descProyRegul value.
     *
     * @param descProyRegul java.lang.String
     */
    public void setDescProyRegul(java.lang.String descProyRegul) {
        this.descProyRegul = descProyRegul;
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
        this.idComposite = (TcProyRegularizaPK)idComposite;
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
