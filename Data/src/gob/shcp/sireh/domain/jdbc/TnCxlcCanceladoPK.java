package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnCxlcCancelado data.
 */
public class TnCxlcCanceladoPK implements Serializable {
    private java.lang.Integer cxlc;
    private java.lang.Integer cxlccCiclo;
    private java.lang.Integer cxlccDifFolio;
    private java.lang.Long cxlccFolio;
    private java.lang.Integer cxlccGuiaCont;
    private java.lang.String idCptoPago;
    private java.lang.String idTipoCpto;

    /**
     * Constructor for TnCxlcCanceladoPK class.
     */
    public TnCxlcCanceladoPK() {
    }

    /**
     * Constructor for TnCxlcCanceladoPK class.
     *
     * @param cxlc java.lang.Integer
     * @param cxlccCiclo java.lang.Integer
     * @param cxlccDifFolio java.lang.Integer
     * @param cxlccFolio java.lang.Long
     * @param cxlccGuiaCont java.lang.Integer
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     */
    public TnCxlcCanceladoPK(java.lang.Integer cxlc, 
                             java.lang.Integer cxlccCiclo, 
                             java.lang.Integer cxlccDifFolio, 
                             java.lang.Long cxlccFolio, 
                             java.lang.Integer cxlccGuiaCont, 
                             java.lang.String idCptoPago, 
                             java.lang.String idTipoCpto) {
        this.cxlc = cxlc;
        this.cxlccCiclo = cxlccCiclo;
        this.cxlccDifFolio = cxlccDifFolio;
        this.cxlccFolio = cxlccFolio;
        this.cxlccGuiaCont = cxlccGuiaCont;
        this.idCptoPago = idCptoPago;
        this.idTipoCpto = idTipoCpto;

    }

    /**
     * Get cxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlc() {
        return this.cxlc;
    }

    /**
     * Set cxlc value.
     *
     * @param cxlc java.lang.Integer
     */
    public void setCxlc(java.lang.Integer cxlc) {
        this.cxlc = cxlc;
    }

    /**
     * Get cxlccCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccCiclo() {
        return this.cxlccCiclo;
    }

    /**
     * Set cxlccCiclo value.
     *
     * @param cxlccCiclo java.lang.Integer
     */
    public void setCxlccCiclo(java.lang.Integer cxlccCiclo) {
        this.cxlccCiclo = cxlccCiclo;
    }

    /**
     * Get cxlccDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccDifFolio() {
        return this.cxlccDifFolio;
    }

    /**
     * Set cxlccDifFolio value.
     *
     * @param cxlccDifFolio java.lang.Integer
     */
    public void setCxlccDifFolio(java.lang.Integer cxlccDifFolio) {
        this.cxlccDifFolio = cxlccDifFolio;
    }

    /**
     * Get cxlccFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlccFolio() {
        return this.cxlccFolio;
    }

    /**
     * Set cxlccFolio value.
     *
     * @param cxlccFolio java.lang.Long
     */
    public void setCxlccFolio(java.lang.Long cxlccFolio) {
        this.cxlccFolio = cxlccFolio;
    }

    /**
     * Get cxlccGuiaCont value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccGuiaCont() {
        return this.cxlccGuiaCont;
    }

    /**
     * Set cxlccGuiaCont value.
     *
     * @param cxlccGuiaCont java.lang.Integer
     */
    public void setCxlccGuiaCont(java.lang.Integer cxlccGuiaCont) {
        this.cxlccGuiaCont = cxlccGuiaCont;
    }

    /**
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        return this.idCptoPago;
    }

    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

}
