package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.TnConceptoPagadoDTO;

import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;

/**
 * Model object for transporting TdPension data.
 */
public class TdPensionDTO implements java.io.Serializable, Model {

    private java.lang.Long idPension;

    private java.util.Date fecModifico;

    @MaxLength(120)
    private java.lang.String usuario;
    @RegExp("[[a-zA-Z] ·ÈÌÛ˙A…Õ”⁄—Ò]+")
    @NotBlank
    @NotNull
    @MaxLength(160)
    private java.lang.String beneficiariaPension;
    @MaxLength(72)
    private java.lang.String clabePension;
    @MaxLength(2000)
    private java.lang.String cptosPorcentaje;
    private java.lang.Integer idZonaDist;
    private java.lang.Double montoAdeudo;
    private java.lang.Double montoPension;
    private java.lang.Integer numPension;
    private java.lang.Float porcentajePension;
    private java.lang.Integer qnaAplicaAdeudo;
    private java.lang.Integer qnaCapturaAdeudo;
    private java.lang.Integer qnaCapturaPension;
    private java.lang.Integer qnaDescAdeudo;
    @NotBlank
    @NotNull
    @MaxLength(72)
    private java.lang.String referenciaPension;
    @MaxLength(80)
    private java.lang.String refAdeudoPension;
    @MaxLength(52)
    private java.lang.String rfcPension;
    @MaxLength(4)
    private java.lang.String statusPension;
    private java.lang.Integer ultQnaProcesaAdeudo;

    /**
     * Constructor for TdPensionDTO class.
     */
    public TdPensionDTO() {
    }

    /**
     * Constructor for TdPensionDTO class.
     *
     * @param idPension java.lang.Long
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param beneficiariaPension java.lang.String
     * @param clabePension java.lang.String
     * @param cptosPorcentaje java.lang.String
     * @param idZonaDist java.lang.Integer
     * @param montoAdeudo java.lang.Double
     * @param montoPension java.lang.Double
     * @param numPension java.lang.Integer
     * @param porcentajePension java.lang.Float
     * @param qnaAplicaAdeudo java.lang.Integer
     * @param qnaCapturaAdeudo java.lang.Integer
     * @param qnaCapturaPension java.lang.Integer
     * @param qnaDescAdeudo java.lang.Integer
     * @param referenciaPension java.lang.String
     * @param refAdeudoPension java.lang.String
     * @param rfcPension java.lang.String
     * @param statusPension java.lang.String
     * @param ultQnaProcesaAdeudo java.lang.Integer
     */
    public TdPensionDTO(java.lang.Long idPension, java.util.Date fecModifico, java.lang.String usuario, 
                        java.lang.String beneficiariaPension, java.lang.String clabePension, 
                        java.lang.String cptosPorcentaje, java.lang.Integer idZonaDist, java.lang.Double montoAdeudo, 
                        java.lang.Double montoPension, java.lang.Integer numPension, java.lang.Float porcentajePension, 
                        java.lang.Integer qnaAplicaAdeudo, java.lang.Integer qnaCapturaAdeudo, 
                        java.lang.Integer qnaCapturaPension, java.lang.Integer qnaDescAdeudo, 
                        java.lang.String referenciaPension, java.lang.String refAdeudoPension, 
                        java.lang.String rfcPension, java.lang.String statusPension, 
                        java.lang.Integer ultQnaProcesaAdeudo) {
        this.idPension = idPension;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.beneficiariaPension = beneficiariaPension;
        this.clabePension = clabePension;
        this.cptosPorcentaje = cptosPorcentaje;
        this.idZonaDist = idZonaDist;
        this.montoAdeudo = montoAdeudo;
        this.montoPension = montoPension;
        this.numPension = numPension;
        this.porcentajePension = porcentajePension;
        this.qnaAplicaAdeudo = qnaAplicaAdeudo;
        this.qnaCapturaAdeudo = qnaCapturaAdeudo;
        this.qnaCapturaPension = qnaCapturaPension;
        this.qnaDescAdeudo = qnaDescAdeudo;
        this.referenciaPension = referenciaPension;
        this.refAdeudoPension = refAdeudoPension;
        this.rfcPension = rfcPension;
        this.statusPension = statusPension;
        this.ultQnaProcesaAdeudo = ultQnaProcesaAdeudo;
    }

    /**
     * Set idPension value.
     *
     * @param idPension java.lang.Long
     */
    public void setIdPension(java.lang.Long idPension) {
        this.idPension = idPension;
    }

    /**
     * Get idPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Long getIdPension() {
        return this.idPension;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Set beneficiariaPension value.
     *
     * @param beneficiariaPension java.lang.String
     */
    public void setBeneficiariaPension(java.lang.String beneficiariaPension) {
        this.beneficiariaPension = beneficiariaPension;
    }

    /**
     * Get beneficiariaPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBeneficiariaPension() {
        return this.beneficiariaPension;
    }

    /**
     * Set clabePension value.
     *
     * @param clabePension java.lang.String
     */
    public void setClabePension(java.lang.String clabePension) {
        this.clabePension = clabePension;
    }

    /**
     * Get clabePension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getClabePension() {
        return this.clabePension;
    }

    /**
     * Set cptosPorcentaje value.
     *
     * @param cptosPorcentaje java.lang.String
     */
    public void setCptosPorcentaje(java.lang.String cptosPorcentaje) {
        this.cptosPorcentaje = cptosPorcentaje;
    }

    /**
     * Get cptosPorcentaje value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCptosPorcentaje() {
        return this.cptosPorcentaje;
    }

    /**
     * Set idZonaDist value.
     *
     * @param idZonaDist java.lang.Integer
     */
    public void setIdZonaDist(java.lang.Integer idZonaDist) {
        this.idZonaDist = idZonaDist;
    }

    /**
     * Get idZonaDist value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaDist() {
        return this.idZonaDist;
    }

    /**
     * Set montoAdeudo value.
     *
     * @param montoAdeudo java.lang.Double
     */
    public void setMontoAdeudo(java.lang.Double montoAdeudo) {
        this.montoAdeudo = montoAdeudo;
    }

    /**
     * Get montoAdeudo value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMontoAdeudo() {
        return this.montoAdeudo;
    }

    /**
     * Set montoPension value.
     *
     * @param montoPension java.lang.Double
     */
    public void setMontoPension(java.lang.Double montoPension) {
        this.montoPension = montoPension;
    }

    /**
     * Get montoPension value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMontoPension() {
        return this.montoPension;
    }

    /**
     * Set numPension value.
     *
     * @param numPension java.lang.Integer
     */
    public void setNumPension(java.lang.Integer numPension) {
        this.numPension = numPension;
    }

    /**
     * Get numPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNumPension() {
        return this.numPension;
    }

    /**
     * Set porcentajePension value.
     *
     * @param porcentajePension java.lang.Float
     */
    public void setPorcentajePension(java.lang.Float porcentajePension) {
        this.porcentajePension = porcentajePension;
    }

    /**
     * Get porcentajePension value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getPorcentajePension() {
        return this.porcentajePension;
    }

    /**
     * Set qnaAplicaAdeudo value.
     *
     * @param qnaAplicaAdeudo java.lang.Integer
     */
    public void setQnaAplicaAdeudo(java.lang.Integer qnaAplicaAdeudo) {
        this.qnaAplicaAdeudo = qnaAplicaAdeudo;
    }

    /**
     * Get qnaAplicaAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaAplicaAdeudo() {
        return this.qnaAplicaAdeudo;
    }

    /**
     * Set qnaCapturaAdeudo value.
     *
     * @param qnaCapturaAdeudo java.lang.Integer
     */
    public void setQnaCapturaAdeudo(java.lang.Integer qnaCapturaAdeudo) {
        this.qnaCapturaAdeudo = qnaCapturaAdeudo;
    }

    /**
     * Get qnaCapturaAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaCapturaAdeudo() {
        return this.qnaCapturaAdeudo;
    }

    /**
     * Set qnaCapturaPension value.
     *
     * @param qnaCapturaPension java.lang.Integer
     */
    public void setQnaCapturaPension(java.lang.Integer qnaCapturaPension) {
        this.qnaCapturaPension = qnaCapturaPension;
    }

    /**
     * Get qnaCapturaPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaCapturaPension() {
        return this.qnaCapturaPension;
    }

    /**
     * Set qnaDescAdeudo value.
     *
     * @param qnaDescAdeudo java.lang.Integer
     */
    public void setQnaDescAdeudo(java.lang.Integer qnaDescAdeudo) {
        this.qnaDescAdeudo = qnaDescAdeudo;
    }

    /**
     * Get qnaDescAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaDescAdeudo() {
        return this.qnaDescAdeudo;
    }

    /**
     * Set referenciaPension value.
     *
     * @param referenciaPension java.lang.String
     */
    public void setReferenciaPension(java.lang.String referenciaPension) {
        this.referenciaPension = referenciaPension;
    }

    /**
     * Get referenciaPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getReferenciaPension() {
        return this.referenciaPension;
    }

    /**
     * Set refAdeudoPension value.
     *
     * @param refAdeudoPension java.lang.String
     */
    public void setRefAdeudoPension(java.lang.String refAdeudoPension) {
        this.refAdeudoPension = refAdeudoPension;
    }

    /**
     * Get refAdeudoPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRefAdeudoPension() {
        return this.refAdeudoPension;
    }

    /**
     * Set rfcPension value.
     *
     * @param rfcPension java.lang.String
     */
    public void setRfcPension(java.lang.String rfcPension) {
        this.rfcPension = rfcPension;
    }

    /**
     * Get rfcPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcPension() {
        return this.rfcPension;
    }

    /**
     * Set statusPension value.
     *
     * @param statusPension java.lang.String
     */
    public void setStatusPension(java.lang.String statusPension) {
        this.statusPension = statusPension;
    }

    /**
     * Get statusPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getStatusPension() {
        return this.statusPension;
    }

    /**
     * Set ultQnaProcesaAdeudo value.
     *
     * @param ultQnaProcesaAdeudo java.lang.Integer
     */
    public void setUltQnaProcesaAdeudo(java.lang.Integer ultQnaProcesaAdeudo) {
        this.ultQnaProcesaAdeudo = ultQnaProcesaAdeudo;
    }

    /**
     * Get ultQnaProcesaAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUltQnaProcesaAdeudo() {
        return this.ultQnaProcesaAdeudo;
    }

    public double calculaMonto(List<TnConceptoPagadoDTO> cptosPagados) {
        Double acumulado = 0.0;
        String cpto = null;
        String cptosPension = null;
        // ajustes para conceptos compuestos
        if (this.cptosPorcentaje.contains("P32")) {
            cptosPension = this.cptosPorcentaje + "PPV" + "P5E" + "P4E" + "P3G";
        } else {
            cptosPension = this.cptosPorcentaje;
        }
        if (this.montoPension > 0.0 && this.porcentajePension == 0)
            return this.montoPension;
        for (TnConceptoPagadoDTO c: cptosPagados) {
            cpto = c.getIdTipoCpto().trim() + c.getIdCptoPago().trim();
            if (cptosPension.contains(cpto)) {
                if (c.getIdTipoCpto().trim().equals("P")) {
                    acumulado = acumulado + c.getCpMonto();
                }
                if (c.getIdTipoCpto().trim().equals("D")) {
                    acumulado = acumulado - c.getCpMonto();
                }
            }
        }
        return (acumulado * this.porcentajePension / 100.00) + (this.getMontoAdeudo() == null || this.getQnaDescAdeudo() == null || this.getQnaDescAdeudo().intValue() == 0 || this.getQnaDescAdeudo() <= this.getQnaAplicaAdeudo() ? 0 : (this.getMontoAdeudo() / this.getQnaDescAdeudo()));
        //return (acumulado * this.porcentajePension / 100.00);
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
