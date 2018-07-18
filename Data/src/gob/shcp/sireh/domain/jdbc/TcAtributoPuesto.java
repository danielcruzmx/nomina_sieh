package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcAtributoPuesto data.
 */
public class TcAtributoPuesto implements Domain, Serializable {
    private TcAtributoPuestoPK idComposite;
    private java.lang.String idJerarquia;
    private java.lang.String idNombramiento;
    private java.lang.String apErarioFederal;
    private double apIncentivo;
    private java.util.Date apIni;
    private java.util.Date fecModifico;
    private java.lang.String idNivelPto;
    private java.lang.String usuario;

    /**
     * Constructor for TcAtributoPuesto class.
     */
    public TcAtributoPuesto() {
    }

    /**
     * Constructor for TcAtributoPuesto class.
     *
     * @param apFin java.util.Date
     * @param idAtributoPuesto java.lang.String
     * @param idJerarquia java.lang.String
     * @param idNombramiento java.lang.String
     * @param apErarioFederal java.lang.String
     * @param apIncentivo double
     * @param apIni java.util.Date
     * @param fecModifico java.util.Date
     * @param idNivelPto java.lang.String
     * @param usuario java.lang.String
     */
    public TcAtributoPuesto(TcAtributoPuestoPK idComposite, java.lang.String idJerarquia, 
                            java.lang.String idNombramiento, java.lang.String apErarioFederal, double apIncentivo, 
                            java.util.Date apIni, java.util.Date fecModifico, java.lang.String idNivelPto, 
                            java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idJerarquia = idJerarquia;
        this.idNombramiento = idNombramiento;
        this.apErarioFederal = apErarioFederal;
        this.apIncentivo = apIncentivo;
        this.apIni = apIni;
        this.fecModifico = fecModifico;
        this.idNivelPto = idNivelPto;
        this.usuario = usuario;
    }

    /**
     * Get apFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getApFin() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getApFin();
    }

    /**
     * Get idAtributoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdAtributoPuesto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdAtributoPuesto();
    }

    /**
     * Get idJerarquia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJerarquia() {
        return this.idJerarquia;
    }

    /**
     * Get idNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNombramiento() {
        return this.idNombramiento;
    }

    /**
     * Get apErarioFederal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getApErarioFederal() {
        return this.apErarioFederal;
    }

    /**
     * Get apIncentivo value.
     *
     * @return double
     */
    public double getApIncentivo() {
        return this.apIncentivo;
    }

    /**
     * Get apIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getApIni() {
        return this.apIni;
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
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
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
     * Set apFin value.
     *
     * @param apFin java.util.Date
     */
    public void setApFin(java.util.Date apFin) {
        if (idComposite == null) {
            idComposite = new TcAtributoPuestoPK();
        }
        this.idComposite.setApFin(apFin);
    }

    /**
     * Set idAtributoPuesto value.
     *
     * @param idAtributoPuesto java.lang.String
     */
    public void setIdAtributoPuesto(java.lang.String idAtributoPuesto) {
        if (idComposite == null) {
            idComposite = new TcAtributoPuestoPK();
        }
        this.idComposite.setIdAtributoPuesto(idAtributoPuesto);
    }

    /**
     * Set idJerarquia value.
     *
     * @param idJerarquia java.lang.String
     */
    public void setIdJerarquia(java.lang.String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    /**
     * Set idNombramiento value.
     *
     * @param idNombramiento java.lang.String
     */
    public void setIdNombramiento(java.lang.String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    /**
     * Set apErarioFederal value.
     *
     * @param apErarioFederal java.lang.String
     */
    public void setApErarioFederal(java.lang.String apErarioFederal) {
        this.apErarioFederal = apErarioFederal;
    }

    /**
     * Set apIncentivo value.
     *
     * @param apIncentivo double
     */
    public void setApIncentivo(double apIncentivo) {
        this.apIncentivo = apIncentivo;
    }

    /**
     * Set apIni value.
     *
     * @param apIni java.util.Date
     */
    public void setApIni(java.util.Date apIni) {
        this.apIni = apIni;
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
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto) {
        this.idNivelPto = idNivelPto;
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
        this.idComposite = (TcAtributoPuestoPK)idComposite;
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
