package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpLab data.
 */
public class TdExpLab implements Domain, Serializable {
    private TdExpLabPK idComposite;
    private java.util.Date elFecFin;
    private java.util.Date elFecIng;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TdExpLab class.
     */
    public TdExpLab() {
    }

    /**
     * Constructor for TdExpLab class.
     *
     * @param elActPrin java.lang.String
     * @param elEmpresa java.lang.String
     * @param elNivelCargo java.lang.String
     * @param idTdExpLab java.lang.String
     * @param elFecFin java.util.Date
     * @param elFecIng java.util.Date
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TdExpLab(TdExpLabPK idComposite, java.util.Date elFecFin, 
                    java.util.Date elFecIng, java.util.Date fecModifico, 
                    java.lang.String usuario) {
        this.idComposite = idComposite;
        this.elFecFin = elFecFin;
        this.elFecIng = elFecIng;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get elActPrin value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElActPrin() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getElActPrin();
    }

    /**
     * Get elEmpresa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElEmpresa() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getElEmpresa();
    }

    /**
     * Get elNivelCargo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElNivelCargo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getElNivelCargo();
    }

    /**
     * Get idTdExpLab value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTdExpLab() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdTdExpLab();
    }

    /**
     * Get elFecFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getElFecFin() {
        return this.elFecFin;
    }

    /**
     * Get elFecIng value.
     *
     * @return java.util.Date
     */
    public java.util.Date getElFecIng() {
        return this.elFecIng;
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
     * Set elActPrin value.
     *
     * @param elActPrin java.lang.String
     */
    public void setElActPrin(java.lang.String elActPrin) {
        if (idComposite == null) {
            idComposite = new TdExpLabPK();
        }
        this.idComposite.setElActPrin(elActPrin);
    }

    /**
     * Set elEmpresa value.
     *
     * @param elEmpresa java.lang.String
     */
    public void setElEmpresa(java.lang.String elEmpresa) {
        if (idComposite == null) {
            idComposite = new TdExpLabPK();
        }
        this.idComposite.setElEmpresa(elEmpresa);
    }

    /**
     * Set elNivelCargo value.
     *
     * @param elNivelCargo java.lang.String
     */
    public void setElNivelCargo(java.lang.String elNivelCargo) {
        if (idComposite == null) {
            idComposite = new TdExpLabPK();
        }
        this.idComposite.setElNivelCargo(elNivelCargo);
    }

    /**
     * Set idTdExpLab value.
     *
     * @param idTdExpLab java.lang.String
     */
    public void setIdTdExpLab(java.lang.String idTdExpLab) {
        if (idComposite == null) {
            idComposite = new TdExpLabPK();
        }
        this.idComposite.setIdTdExpLab(idTdExpLab);
    }

    /**
     * Set elFecFin value.
     *
     * @param elFecFin java.util.Date
     */
    public void setElFecFin(java.util.Date elFecFin) {
        this.elFecFin = elFecFin;
    }

    /**
     * Set elFecIng value.
     *
     * @param elFecIng java.util.Date
     */
    public void setElFecIng(java.util.Date elFecIng) {
        this.elFecIng = elFecIng;
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
        this.idComposite = (TdExpLabPK)idComposite;
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
