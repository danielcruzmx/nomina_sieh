package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcBeneficiarioSicop data.
 */
public class TcBeneficiarioSicopPK implements Serializable {
    private java.lang.String bsCtaBancaria;
    private java.lang.String bsLeyenda;
    private java.lang.String bsTipoPago;
    private java.lang.String idBeneSicop;

    /**
     * Constructor for TcBeneficiarioSicopPK class.
     */
    public TcBeneficiarioSicopPK() {
    }

    /**
     * Constructor for TcBeneficiarioSicopPK class.
     *
     * @param bsCtaBancaria java.lang.String
     * @param bsLeyenda java.lang.String
     * @param bsTipoPago java.lang.String
     * @param idBeneSicop java.lang.String
     */
    public TcBeneficiarioSicopPK(java.lang.String bsCtaBancaria, 
                                 java.lang.String bsLeyenda, 
                                 java.lang.String bsTipoPago, 
                                 java.lang.String idBeneSicop) {
        this.bsCtaBancaria = bsCtaBancaria;
        this.bsLeyenda = bsLeyenda;
        this.bsTipoPago = bsTipoPago;
        this.idBeneSicop = idBeneSicop;

    }

    /**
     * Get bsCtaBancaria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsCtaBancaria() {
        return this.bsCtaBancaria;
    }

    /**
     * Set bsCtaBancaria value.
     *
     * @param bsCtaBancaria java.lang.String
     */
    public void setBsCtaBancaria(java.lang.String bsCtaBancaria) {
        this.bsCtaBancaria = bsCtaBancaria;
    }

    /**
     * Get bsLeyenda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsLeyenda() {
        return this.bsLeyenda;
    }

    /**
     * Set bsLeyenda value.
     *
     * @param bsLeyenda java.lang.String
     */
    public void setBsLeyenda(java.lang.String bsLeyenda) {
        this.bsLeyenda = bsLeyenda;
    }

    /**
     * Get bsTipoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBsTipoPago() {
        return this.bsTipoPago;
    }

    /**
     * Set bsTipoPago value.
     *
     * @param bsTipoPago java.lang.String
     */
    public void setBsTipoPago(java.lang.String bsTipoPago) {
        this.bsTipoPago = bsTipoPago;
    }

    /**
     * Get idBeneSicop value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdBeneSicop() {
        return this.idBeneSicop;
    }

    /**
     * Set idBeneSicop value.
     *
     * @param idBeneSicop java.lang.String
     */
    public void setIdBeneSicop(java.lang.String idBeneSicop) {
        this.idBeneSicop = idBeneSicop;
    }

}
