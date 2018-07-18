package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

import java.math.RoundingMode;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;


/**
 * Model object for transporting TnConceptoPagado data.
 */
public class TnConceptoPagadoBigDTO implements java.io.Serializable, Model, Comparable<TnConceptoPagadoBigDTO> { 

    private java.lang.Integer cpDifFolio;
    private java.lang.Integer cpFolio;
    private java.lang.Integer cpNumConcepto;
    private BigDecimal cpMonto;
    @MaxLength(2)
    private java.lang.String idCptoPago;
    @MaxLength(1)
    private java.lang.String idTipoCpto;

    private String descConPag;

    /**
     * Constructor for TnConceptoPagadoDTO class.
     */
    public TnConceptoPagadoBigDTO() {
    }

    /**
     * Constructor for TnConceptoPagadoDTO class.
     *
     * @param cpDifFolio java.lang.Integer
     * @param cpFolio java.lang.Long
     * @param cpNumConcepto java.lang.Integer
     * @param cpMonto java.lang.Double
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     */
    public TnConceptoPagadoBigDTO(java.lang.Integer cpDifFolio, java.lang.Integer cpFolio, 
                               java.lang.Integer cpNumConcepto, BigDecimal cpMonto, java.lang.String idCptoPago, 
                               java.lang.String idTipoCpto) {
        this.cpDifFolio = cpDifFolio;
        this.cpFolio = cpFolio;
        this.cpNumConcepto = cpNumConcepto;
        this.cpMonto = cpMonto;
        this.idCptoPago = idCptoPago;
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Set cpDifFolio value.
     *
     * @param cpDifFolio java.lang.Integer
     */
    public void setCpDifFolio(java.lang.Integer cpDifFolio) {
        this.cpDifFolio = cpDifFolio;
    }

    /**
     * Get cpDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpDifFolio() {
        return this.cpDifFolio;
    }

    /**
     * Set cpFolio value.
     *
     * @param cpFolio java.lang.Long
     */
    public void setCpFolio(java.lang.Integer cpFolio) {
        this.cpFolio = cpFolio;
    }

    /**
     * Get cpFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Integer getCpFolio() {
        return this.cpFolio;
    }

    /**
     * Set cpNumConcepto value.
     *
     * @param cpNumConcepto java.lang.Integer
     */
    public void setCpNumConcepto(java.lang.Integer cpNumConcepto) {
        this.cpNumConcepto = cpNumConcepto;
    }

    /**
     * Get cpNumConcepto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCpNumConcepto() {
        return this.cpNumConcepto;
    }

    /**
     * Set cpMonto value.
     *
     * @param cpMonto BigDecimal
     */
    public void setCpMonto(BigDecimal cpMonto) {
        this.cpMonto = cpMonto;
    }

    /**
     * Get cpMonto value.
     *
     * @return BigDecimal
     */
    public BigDecimal getCpMonto() {
        return redondear(this.cpMonto);
    }
    
    private static BigDecimal redondear(BigDecimal base) {
        //valor = Math.rint(base * 100) / 100;
        return base.setScale(2, RoundingMode.FLOOR);
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
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        return this.idCptoPago;
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    /**
     * @param compareConcepto
     * @return
     */
    public int compareTo(TnConceptoPagadoBigDTO compareConcepto) {
        BigDecimal compareQuantity = (compareConcepto).getCpMonto();

        BigDecimal deci1 = compareQuantity;
        BigDecimal deci2 = this.cpMonto;
        deci1 = deci1.setScale(2, BigDecimal.ROUND_CEILING);
        deci2 = deci2.setScale(2, BigDecimal.ROUND_CEILING);
        BigDecimal resultado = deci1.subtract(deci2);
        return resultado.intValue();
    }
}
