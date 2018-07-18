package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnCalculoNominaQna data.
 */
public class TnCalculoNominaQnaPK implements Serializable {
    private java.util.Date cnqIniPago;
    private java.lang.String cnqRfc;
    private java.lang.Integer idNomina;
    private java.lang.Integer idPlaza;

    /**
     * Constructor for TnCalculoNominaQnaPK class.
     */
    public TnCalculoNominaQnaPK() {
    }

    /**
     * Constructor for TnCalculoNominaQnaPK class.
     *
     * @param cnqIniPago java.util.Date
     * @param cnqRfc java.lang.String
     * @param idNomina java.lang.Integer
     * @param idPlaza java.lang.Integer
     */
    public TnCalculoNominaQnaPK(java.util.Date cnqIniPago, 
                                java.lang.String cnqRfc, 
                                java.lang.Integer idNomina, 
                                java.lang.Integer idPlaza) {
        this.cnqIniPago = cnqIniPago;
        this.cnqRfc = cnqRfc;
        this.idNomina = idNomina;
        this.idPlaza = idPlaza;
    }

    /**
     * Get cnqIniPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnqIniPago() {
        return this.cnqIniPago;
    }

    /**
     * Set cnqIniPago value.
     *
     * @param cnqIniPago java.util.Date
     */
    public void setCnqIniPago(java.util.Date cnqIniPago) {
        this.cnqIniPago = cnqIniPago;
    }

    /**
     * Get cnqRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnqRfc() {
        return this.cnqRfc;
    }

    /**
     * Set cnqRfc value.
     *
     * @param cnqRfc java.lang.String
     */
    public void setCnqRfc(java.lang.String cnqRfc) {
        this.cnqRfc = cnqRfc;
    }

    /**
     * Get idNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNomina() {
        return this.idNomina;
    }

    /**
     * Set idNomina value.
     *
     * @param idNomina java.lang.Integer
     */
    public void setIdNomina(java.lang.Integer idNomina) {
        this.idNomina = idNomina;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

}
