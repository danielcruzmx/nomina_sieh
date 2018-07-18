package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcBeneficiarioSicop data.
 */
public class TcBeneficiarioSicop implements Domain, Serializable {
    private TcBeneficiarioSicopPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Integer bsOrigenPpto;
    private java.lang.String bs_ref_1;
    private java.lang.String bs_ref_2;
    private java.lang.String bsRfc;
    private java.lang.Integer bsTipoErog;
    private java.lang.String bsTipoMoneda;
    private java.lang.String bsTipoNom;
    private java.lang.Integer bsTipoOper;
    private java.lang.String descBeneSicop;

    /**
     * Constructor for TcBeneficiarioSicop class.
     */
    public TcBeneficiarioSicop() {
    }

    /**
     * Constructor for TcBeneficiarioSicop class.
     *
     * @param bsCtaBancaria java.lang.String
     * @param bsLeyenda java.lang.String
     * @param bsTipoPago java.lang.String
     * @param idBeneSicop java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param bsOrigenPpto java.lang.Integer
     * @param bsRef_1 java.lang.String
     * @param bsRef_2 java.lang.String
     * @param bsRfc java.lang.String
     * @param bsTipoErog java.lang.Integer
     * @param bsTipoMoneda java.lang.String
     * @param bsTipoNom java.lang.String
     * @param bsTipoOper java.lang.Integer
     * @param descBeneSicop java.lang.String
     */
    public TcBeneficiarioSicop(TcBeneficiarioSicopPK idComposite, 
                               java.util.Date fecModifico, 
                               java.lang.String usuario, 
                               java.lang.Integer bsOrigenPpto, 
                               java.lang.String bs_ref_1, 
                               java.lang.String bs_ref_2, 
                               java.lang.String bsRfc, 
                               java.lang.Integer bsTipoErog, 
                               java.lang.String bsTipoMoneda, 
                               java.lang.String bsTipoNom, 
                               java.lang.Integer bsTipoOper, 
                               java.lang.String descBeneSicop) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.bsOrigenPpto = bsOrigenPpto;
        this.bs_ref_1 = bs_ref_1;
        this.bs_ref_2 = bs_ref_2;
        this.bsRfc = bsRfc;
        this.bsTipoErog = bsTipoErog;
        this.bsTipoMoneda = bsTipoMoneda;
        this.bsTipoNom = bsTipoNom;
        this.bsTipoOper = bsTipoOper;
        this.descBeneSicop = descBeneSicop;
    }

    /**
     * Get bsCtaBancaria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsCtaBancaria() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getBsCtaBancaria();
    }

    /**
     * Get bsLeyenda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsLeyenda() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getBsLeyenda();
    }

    /**
     * Get bsTipoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getBsTipoPago();
    }

    /**
     * Get idBeneSicop value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBeneSicop() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdBeneSicop();
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
     * Get bsOrigenPpto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsOrigenPpto() {
        return this.bsOrigenPpto;
    }

    /**
     * Get bsRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsRfc() {
        return this.bsRfc;
    }

    /**
     * Get bsTipoErog value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsTipoErog() {
        return this.bsTipoErog;
    }

    /**
     * Get bsTipoMoneda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoMoneda() {
        return this.bsTipoMoneda;
    }

    /**
     * Get bsTipoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoNom() {
        return this.bsTipoNom;
    }

    /**
     * Get bsTipoOper value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getBsTipoOper() {
        return this.bsTipoOper;
    }

    /**
     * Get descBeneSicop value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescBeneSicop() {
        return this.descBeneSicop;
    }

    /**
     * Set bsCtaBancaria value.
     *
     * @param bsCtaBancaria java.lang.String
     */
    public void setBsCtaBancaria(java.lang.String bsCtaBancaria) {
        if (idComposite == null) {
            idComposite = new TcBeneficiarioSicopPK();
        }
        this.idComposite.setBsCtaBancaria(bsCtaBancaria);
    }

    /**
     * Set bsLeyenda value.
     *
     * @param bsLeyenda java.lang.String
     */
    public void setBsLeyenda(java.lang.String bsLeyenda) {
        if (idComposite == null) {
            idComposite = new TcBeneficiarioSicopPK();
        }
        this.idComposite.setBsLeyenda(bsLeyenda);
    }

    /**
     * Set bsTipoPago value.
     *
     * @param bsTipoPago java.lang.String
     */
    public void setBsTipoPago(java.lang.String bsTipoPago) {
        if (idComposite == null) {
            idComposite = new TcBeneficiarioSicopPK();
        }
        this.idComposite.setBsTipoPago(bsTipoPago);
    }

    /**
     * Set idBeneSicop value.
     *
     * @param idBeneSicop java.lang.String
     */
    public void setIdBeneSicop(java.lang.String idBeneSicop) {
        if (idComposite == null) {
            idComposite = new TcBeneficiarioSicopPK();
        }
        this.idComposite.setIdBeneSicop(idBeneSicop);
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
     * Set bsOrigenPpto value.
     *
     * @param bsOrigenPpto java.lang.Integer
     */
    public void setBsOrigenPpto(java.lang.Integer bsOrigenPpto) {
        this.bsOrigenPpto = bsOrigenPpto;
    }

    /**
     * Set bsRfc value.
     *
     * @param bsRfc java.lang.String
     */
    public void setBsRfc(java.lang.String bsRfc) {
        this.bsRfc = bsRfc;
    }

    /**
     * Set bsTipoErog value.
     *
     * @param bsTipoErog java.lang.Integer
     */
    public void setBsTipoErog(java.lang.Integer bsTipoErog) {
        this.bsTipoErog = bsTipoErog;
    }

    /**
     * Set bsTipoMoneda value.
     *
     * @param bsTipoMoneda java.lang.String
     */
    public void setBsTipoMoneda(java.lang.String bsTipoMoneda) {
        this.bsTipoMoneda = bsTipoMoneda;
    }

    /**
     * Set bsTipoNom value.
     *
     * @param bsTipoNom java.lang.String
     */
    public void setBsTipoNom(java.lang.String bsTipoNom) {
        this.bsTipoNom = bsTipoNom;
    }

    /**
     * Set bsTipoOper value.
     *
     * @param bsTipoOper java.lang.Integer
     */
    public void setBsTipoOper(java.lang.Integer bsTipoOper) {
        this.bsTipoOper = bsTipoOper;
    }

    /**
     * Set descBeneSicop value.
     *
     * @param descBeneSicop java.lang.String
     */
    public void setDescBeneSicop(java.lang.String descBeneSicop) {
        this.descBeneSicop = descBeneSicop;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcBeneficiarioSicopPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }

    public String getBs_ref_1() {
        return bs_ref_1;
    }

    public void setBs_ref_1(String bs_ref_1) {
        this.bs_ref_1 = bs_ref_1;
    }

    public String getBs_ref_2() {
        return bs_ref_2;
    }

    public void setBs_ref_2(String bs_ref_2) {
        this.bs_ref_2 = bs_ref_2;
    }
}
