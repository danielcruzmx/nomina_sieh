package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcTabulador data.
 */
public class TcTabulador implements Domain, Serializable {
    private TcTabuladorPK idComposite;
    private java.util.Date fecModifico;
    private double tabCompensacion;
    private java.util.Date tabIni;
    private double tabSueldo;
    private java.lang.String usuario;

    /**
     * Constructor for TcTabulador class.
     */
    public TcTabulador() {
    }

    /**
     * Constructor for TcTabulador class.
     *
     * @param idNivelPto java.lang.String
     * @param idRango java.lang.Integer
     * @param idZonaEcon java.lang.Integer
     * @param tabFin java.util.Date
     * @param fecModifico java.util.Date
     * @param tabCompensacion double
     * @param tabIni java.util.Date
     * @param tabSueldo double
     * @param usuario java.lang.String
     */
    public TcTabulador(TcTabuladorPK idComposite, java.util.Date fecModifico, 
                       double tabCompensacion, java.util.Date tabIni, 
                       double tabSueldo, java.lang.String usuario) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.tabCompensacion = tabCompensacion;
        this.tabIni = tabIni;
        this.tabSueldo = tabSueldo;
        this.usuario = usuario;
    }

    /**
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdNivelPto();
    }

    /**
     * Get idRango value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRango() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdRango();
    }

    /**
     * Get idZonaEcon value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcon() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdZonaEcon();
    }

    /**
     * Get tabFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTabFin() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getTabFin();
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
     * Get tabCompensacion value.
     *
     * @return double
     */
    public double getTabCompensacion() {
        return this.tabCompensacion;
    }

    /**
     * Get tabIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTabIni() {
        return this.tabIni;
    }

    /**
     * Get tabSueldo value.
     *
     * @return double
     */
    public double getTabSueldo() {
        return this.tabSueldo;
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
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto) {
        if (idComposite == null) {
            idComposite = new TcTabuladorPK();
        }
        this.idComposite.setIdNivelPto(idNivelPto);
    }

    /**
     * Set idRango value.
     *
     * @param idRango java.lang.Integer
     */
    public void setIdRango(java.lang.Integer idRango) {
        if (idComposite == null) {
            idComposite = new TcTabuladorPK();
        }
        this.idComposite.setIdRango(idRango);
    }

    /**
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Integer
     */
    public void setIdZonaEcon(java.lang.Integer idZonaEcon) {
        if (idComposite == null) {
            idComposite = new TcTabuladorPK();
        }
        this.idComposite.setIdZonaEcon(idZonaEcon);
    }

    /**
     * Set tabFin value.
     *
     * @param tabFin java.util.Date
     */
    public void setTabFin(java.util.Date tabFin) {
        if (idComposite == null) {
            idComposite = new TcTabuladorPK();
        }
        this.idComposite.setTabFin(tabFin);
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
     * Set tabCompensacion value.
     *
     * @param tabCompensacion double
     */
    public void setTabCompensacion(double tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    /**
     * Set tabIni value.
     *
     * @param tabIni java.util.Date
     */
    public void setTabIni(java.util.Date tabIni) {
        this.tabIni = tabIni;
    }

    /**
     * Set tabSueldo value.
     *
     * @param tabSueldo double
     */
    public void setTabSueldo(double tabSueldo) {
        this.tabSueldo = tabSueldo;
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
        this.idComposite = (TcTabuladorPK)idComposite;
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
