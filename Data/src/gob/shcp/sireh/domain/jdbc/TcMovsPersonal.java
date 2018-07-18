package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcMovsPersonal data.
 */
public class TcMovsPersonal implements Domain, Serializable {
    @PrimaryKey
    private java.lang.Integer idMovsPersonal;
    private java.lang.String idSitPlaNva;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String descMovsPersonal;
    private java.lang.String idSitPlaAnt;
    private java.lang.String mpConstancia;
    private java.lang.String mpGrupoPago;
    private java.lang.String mpJerarquia;
    private java.lang.String mpNombramiento;
    private java.lang.String mpTipoMovMenu;

    /**
     * Constructor for TcMovsPersonal class.
     */
    public TcMovsPersonal() {
    }

    /**
     * Constructor for TcMovsPersonal class.
     *
     * @param idMovsPersonal java.lang.Integer
     * @param idSitPlaNva java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descMovsPersonal java.lang.String
     * @param idSitPlaAnt java.lang.String
     * @param mpConstancia java.lang.String
     * @param mpGrupoPago java.lang.String
     * @param mpJerarquia java.lang.String
     * @param mpNombramiento java.lang.String
     * @param mpTipoMovMenu java.lang.String
     */
    public TcMovsPersonal(java.lang.Integer idMovsPersonal, 
                          java.lang.String idSitPlaNva, 
                          java.util.Date fecModifico, java.lang.String usuario, 
                          java.lang.String descMovsPersonal, 
                          java.lang.String idSitPlaAnt, 
                          java.lang.String mpConstancia, 
                          java.lang.String mpGrupoPago, 
                          java.lang.String mpJerarquia, 
                          java.lang.String mpNombramiento, 
                          java.lang.String mpTipoMovMenu) {
        this.idMovsPersonal = idMovsPersonal;
        this.idSitPlaNva = idSitPlaNva;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descMovsPersonal = descMovsPersonal;
        this.idSitPlaAnt = idSitPlaAnt;
        this.mpConstancia = mpConstancia;
        this.mpGrupoPago = mpGrupoPago;
        this.mpJerarquia = mpJerarquia;
        this.mpNombramiento = mpNombramiento;
        this.mpTipoMovMenu = mpTipoMovMenu;
    }

    /**
     * Get idMovsPersonal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovsPersonal() {
        return this.idMovsPersonal;
    }

    /**
     * Get idSitPlaNva value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaNva() {
        return this.idSitPlaNva;
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
     * Get descMovsPersonal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescMovsPersonal() {
        return this.descMovsPersonal;
    }

    /**
     * Get idSitPlaAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaAnt() {
        return this.idSitPlaAnt;
    }

    /**
     * Get mpConstancia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpConstancia() {
        return this.mpConstancia;
    }

    /**
     * Get mpGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpGrupoPago() {
        return this.mpGrupoPago;
    }

    /**
     * Get mpJerarquia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpJerarquia() {
        return this.mpJerarquia;
    }

    /**
     * Get mpNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpNombramiento() {
        return this.mpNombramiento;
    }

    /**
     * Get mpTipoMovMenu value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMpTipoMovMenu() {
        return this.mpTipoMovMenu;
    }

    /**
     * Set idMovsPersonal value.
     *
     * @param idMovsPersonal java.lang.Integer
     */
    public void setIdMovsPersonal(java.lang.Integer idMovsPersonal) {
        this.idMovsPersonal = idMovsPersonal;
    }

    /**
     * Set idSitPlaNva value.
     *
     * @param idSitPlaNva java.lang.String
     */
    public void setIdSitPlaNva(java.lang.String idSitPlaNva) {
        this.idSitPlaNva = idSitPlaNva;
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
     * Set descMovsPersonal value.
     *
     * @param descMovsPersonal java.lang.String
     */
    public void setDescMovsPersonal(java.lang.String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    /**
     * Set idSitPlaAnt value.
     *
     * @param idSitPlaAnt java.lang.String
     */
    public void setIdSitPlaAnt(java.lang.String idSitPlaAnt) {
        this.idSitPlaAnt = idSitPlaAnt;
    }

    /**
     * Set mpConstancia value.
     *
     * @param mpConstancia java.lang.String
     */
    public void setMpConstancia(java.lang.String mpConstancia) {
        this.mpConstancia = mpConstancia;
    }

    /**
     * Set mpGrupoPago value.
     *
     * @param mpGrupoPago java.lang.String
     */
    public void setMpGrupoPago(java.lang.String mpGrupoPago) {
        this.mpGrupoPago = mpGrupoPago;
    }

    /**
     * Set mpJerarquia value.
     *
     * @param mpJerarquia java.lang.String
     */
    public void setMpJerarquia(java.lang.String mpJerarquia) {
        this.mpJerarquia = mpJerarquia;
    }

    /**
     * Set mpNombramiento value.
     *
     * @param mpNombramiento java.lang.String
     */
    public void setMpNombramiento(java.lang.String mpNombramiento) {
        this.mpNombramiento = mpNombramiento;
    }

    /**
     * Set mpTipoMovMenu value.
     *
     * @param mpTipoMovMenu java.lang.String
     */
    public void setMpTipoMovMenu(java.lang.String mpTipoMovMenu) {
        this.mpTipoMovMenu = mpTipoMovMenu;
    }

    /**
     * Set identity value.
     *
     * @param idMovsPersonal Serializable
     */
    public void setIdentity(Serializable idMovsPersonal) {
        this.idMovsPersonal = (java.lang.Integer)idMovsPersonal;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idMovsPersonal;
    }
}
