package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Domain object for persistent TdPension data.
 */
public class TdPension implements Domain, Serializable {
    @PrimaryKey(sequenceName = "SD_PENSION")
    private java.lang.Long idPension;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String beneficiariaPension;
    private java.lang.String clabePension;
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
    private java.lang.String referenciaPension;
    private java.lang.String refAdeudoPension;
    private java.lang.String rfcPension;
    private java.lang.String statusPension;
    private java.lang.Integer ultQnaProcesaAdeudo;

    /**
     * Constructor for TdPension class.
     */
    public TdPension() {
    }

    /**
     * Constructor for TdPension class.
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
    public TdPension(java.lang.Long idPension, java.util.Date fecModifico, 
                     java.lang.String usuario, 
                     java.lang.String beneficiariaPension, 
                     java.lang.String clabePension, 
                     java.lang.String cptosPorcentaje, 
                     java.lang.Integer idZonaDist, 
                     java.lang.Double montoAdeudo, 
                     java.lang.Double montoPension, 
                     java.lang.Integer numPension, 
                     java.lang.Float porcentajePension, 
                     java.lang.Integer qnaAplicaAdeudo, 
                     java.lang.Integer qnaCapturaAdeudo, 
                     java.lang.Integer qnaCapturaPension, 
                     java.lang.Integer qnaDescAdeudo, 
                     java.lang.String referenciaPension, 
                     java.lang.String refAdeudoPension, 
                     java.lang.String rfcPension, 
                     java.lang.String statusPension, 
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
     * Get idPension value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdPension() {
        return this.idPension;
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
     * Get beneficiariaPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getBeneficiariaPension() {
        return this.beneficiariaPension;
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
     * Get cptosPorcentaje value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCptosPorcentaje() {
        return this.cptosPorcentaje;
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
     * Get montoAdeudo value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getMontoAdeudo() {
        return this.montoAdeudo;
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
     * Get numPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNumPension() {
        return this.numPension;
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
     * Get qnaAplicaAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaAplicaAdeudo() {
        return this.qnaAplicaAdeudo;
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
     * Get qnaCapturaPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getQnaCapturaPension() {
        return this.qnaCapturaPension;
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
     * Get referenciaPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getReferenciaPension() {
        return this.referenciaPension;
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
     * Get rfcPension value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcPension() {
        return this.rfcPension;
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
     * Get ultQnaProcesaAdeudo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUltQnaProcesaAdeudo() {
        return this.ultQnaProcesaAdeudo;
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
     * Set beneficiariaPension value.
     *
     * @param beneficiariaPension java.lang.String
     */
    public void setBeneficiariaPension(java.lang.String beneficiariaPension) {
        this.beneficiariaPension = beneficiariaPension;
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
     * Set cptosPorcentaje value.
     *
     * @param cptosPorcentaje java.lang.String
     */
    public void setCptosPorcentaje(java.lang.String cptosPorcentaje) {
        this.cptosPorcentaje = cptosPorcentaje;
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
     * Set montoAdeudo value.
     *
     * @param montoAdeudo java.lang.Double
     */
    public void setMontoAdeudo(java.lang.Double montoAdeudo) {
        this.montoAdeudo = montoAdeudo;
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
     * Set numPension value.
     *
     * @param numPension java.lang.Integer
     */
    public void setNumPension(java.lang.Integer numPension) {
        this.numPension = numPension;
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
     * Set qnaAplicaAdeudo value.
     *
     * @param qnaAplicaAdeudo java.lang.Integer
     */
    public void setQnaAplicaAdeudo(java.lang.Integer qnaAplicaAdeudo) {
        this.qnaAplicaAdeudo = qnaAplicaAdeudo;
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
     * Set qnaCapturaPension value.
     *
     * @param qnaCapturaPension java.lang.Integer
     */
    public void setQnaCapturaPension(java.lang.Integer qnaCapturaPension) {
        this.qnaCapturaPension = qnaCapturaPension;
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
     * Set referenciaPension value.
     *
     * @param referenciaPension java.lang.String
     */
    public void setReferenciaPension(java.lang.String referenciaPension) {
        this.referenciaPension = referenciaPension;
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
     * Set rfcPension value.
     *
     * @param rfcPension java.lang.String
     */
    public void setRfcPension(java.lang.String rfcPension) {
        this.rfcPension = rfcPension;
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
     * Set ultQnaProcesaAdeudo value.
     *
     * @param ultQnaProcesaAdeudo java.lang.Integer
     */
    public void setUltQnaProcesaAdeudo(java.lang.Integer ultQnaProcesaAdeudo) {
        this.ultQnaProcesaAdeudo = ultQnaProcesaAdeudo;
    }

    /**
     * Set identity value.
     *
     * @param idPension Serializable
     */
    public void setIdentity(Serializable idPension) {
        this.idPension = (java.lang.Long)idPension;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idPension;
    }

    public boolean isEquivalente(TdPension tdPension) {

        if (this.getNumPension() != tdPension.getNumPension()) {
            return false;
        }

        if (!((this.getBeneficiariaPension() == null && 
               tdPension.getBeneficiariaPension() == null) || 
              (this.getBeneficiariaPension() != null && 
               tdPension.getBeneficiariaPension() != null && 
               this.getBeneficiariaPension().equals(tdPension.getBeneficiariaPension())) || 
              (this.getBeneficiariaPension() != null && 
               this.getBeneficiariaPension().equals("") && 
               tdPension.getBeneficiariaPension() == null) || 
              (this.getBeneficiariaPension() == null && 
               tdPension.getBeneficiariaPension() != null && 
               tdPension.getBeneficiariaPension().equals("")))) {
            return false;
        }

        if (!((this.getReferenciaPension() == null && 
               tdPension.getReferenciaPension() == null) || 
              (this.getReferenciaPension() != null && 
               tdPension.getReferenciaPension() != null && 
               this.getReferenciaPension().equals(tdPension.getReferenciaPension())) || 
              (this.getReferenciaPension() != null && 
               this.getReferenciaPension().equals("") && 
               tdPension.getReferenciaPension() == null) || 
              (this.getReferenciaPension() == null && 
               tdPension.getReferenciaPension() != null && 
               tdPension.getReferenciaPension().equals("")))) {
            return false;
        }

        if (!((this.getIdZonaDist() == null && 
               tdPension.getIdZonaDist() == null) || 
              (this.getIdZonaDist() != null && 
               tdPension.getIdZonaDist() != null && 
               this.getIdZonaDist().equals(tdPension.getIdZonaDist())) || 
              (this.getIdZonaDist() != null && 
               this.getIdZonaDist().equals(0) && 
               tdPension.getIdZonaDist() == null) || 
              (this.getIdZonaDist() == null && 
               tdPension.getIdZonaDist() != null && 
               tdPension.getIdZonaDist().equals(0)))) {
            return false;
        }

        if (!((this.getMontoAdeudo() == null && 
               tdPension.getMontoAdeudo() == null) || 
              (this.getMontoAdeudo() != null && 
               tdPension.getMontoAdeudo() != null && 
               this.getMontoAdeudo().equals(tdPension.getMontoAdeudo())) || 
              (this.getMontoAdeudo() != null && 
               this.getMontoAdeudo().equals(0) && 
               tdPension.getMontoAdeudo() == null) || 
              (this.getMontoAdeudo() == null && 
               tdPension.getMontoAdeudo() != null && 
               tdPension.getMontoAdeudo().equals(0)))) {
            return false;
        }

        if (!((this.getMontoPension() == null && 
               tdPension.getMontoPension() == null) || 
              (this.getMontoPension() != null && 
               tdPension.getMontoPension() != null && 
               this.getMontoPension().equals(tdPension.getMontoPension())) || 
              (this.getMontoPension() != null && 
               this.getMontoPension().equals(0) && 
               tdPension.getMontoPension() == null) || 
              (this.getMontoPension() == null && 
               tdPension.getMontoPension() != null && 
               tdPension.getMontoPension().equals(0)))) {
            return false;
        }

        if (!((this.getPorcentajePension() == null && 
               tdPension.getPorcentajePension() == null) || 
              (this.getPorcentajePension() != null && 
               tdPension.getPorcentajePension() != null && 
               this.getPorcentajePension().equals(tdPension.getPorcentajePension())) || 
              (this.getPorcentajePension() != null && 
               this.getPorcentajePension().equals(0) && 
               tdPension.getPorcentajePension() == null) || 
              (this.getPorcentajePension() == null && 
               tdPension.getPorcentajePension() != null && 
               tdPension.getPorcentajePension().equals(0)))) {
            return false;
        }

        if (!((this.getQnaDescAdeudo() == null && 
               tdPension.getQnaDescAdeudo() == null) || 
              (this.getQnaDescAdeudo() != null && 
               tdPension.getQnaDescAdeudo() != null && 
               this.getQnaDescAdeudo().equals(tdPension.getQnaDescAdeudo())) || 
              (this.getQnaDescAdeudo() != null && 
               this.getQnaDescAdeudo().equals(0) && 
               tdPension.getQnaDescAdeudo() == null) || 
              (this.getQnaDescAdeudo() == null && 
               tdPension.getQnaDescAdeudo() != null && 
               tdPension.getQnaDescAdeudo().equals(0)))) {
            return false;
        }

        if (!((this.getRefAdeudoPension() == null && 
               tdPension.getRefAdeudoPension() == null) || 
              (this.getRefAdeudoPension() != null && 
               tdPension.getRefAdeudoPension() != null && 
               this.getRefAdeudoPension().equals(tdPension.getRefAdeudoPension())) || 
              (this.getRefAdeudoPension() != null && 
               this.getRefAdeudoPension().equals("") && 
               tdPension.getRefAdeudoPension() == null) || 
              (this.getRefAdeudoPension() == null && 
               tdPension.getRefAdeudoPension() != null && 
               tdPension.getRefAdeudoPension().equals("")))) {
            return false;
        }

        if (!((this.getQnaCapturaAdeudo() == null && 
               tdPension.getQnaCapturaAdeudo() == null) || 
              (this.getQnaCapturaAdeudo() != null && 
               tdPension.getQnaCapturaAdeudo() != null && 
               this.getQnaCapturaAdeudo().equals(tdPension.getQnaCapturaAdeudo())) || 
              (this.getQnaCapturaAdeudo() != null && 
               this.getQnaCapturaAdeudo().equals(0) && 
               tdPension.getQnaCapturaAdeudo() == null) || 
              (this.getQnaCapturaAdeudo() == null && 
               tdPension.getQnaCapturaAdeudo() != null && 
               tdPension.getQnaCapturaAdeudo().equals(0)))) {
            return false;
        }

        if (!((this.getCptosPorcentaje() == null && 
               tdPension.getCptosPorcentaje() == null) || 
              (this.getCptosPorcentaje() != null && 
               tdPension.getCptosPorcentaje() != null && 
               this.getCptosPorcentaje().equals(tdPension.getCptosPorcentaje())) || 
              (this.getCptosPorcentaje() != null && 
               this.getCptosPorcentaje().equals("") && 
               tdPension.getCptosPorcentaje() == null) || 
              (this.getCptosPorcentaje() == null && 
               tdPension.getCptosPorcentaje() != null && 
               tdPension.getCptosPorcentaje().equals("")) || 
              (this.getCptosPorcentaje() != null && 
               tdPension.getCptosPorcentaje() != null && 
               cptosPorcentajeEquivalentes(this.getCptosPorcentaje(), 
                                           tdPension.getCptosPorcentaje())))) {
            return false;
        }

        return true;
    }

    private boolean cptosPorcentajeEquivalentes(String thisCptosPorcentaje, 
                                                String objCptosPorcentaje) {

        List<String> thisListaCptosPorcentaje = 
            Arrays.asList(thisCptosPorcentaje.split("\\|"));
        List<String> objectListaCptosPorcentaje = 
            Arrays.asList(objCptosPorcentaje.split("\\|"));

        Collections.sort(thisListaCptosPorcentaje);
        Collections.sort(objectListaCptosPorcentaje);

        return thisListaCptosPorcentaje.equals(objectListaCptosPorcentaje);
    }

    public double calculaMonto(List<TnConceptoPagado> cptosPagados) {
        Double acumulado = 0.0;

        if (this.montoPension > 0.0 && this.porcentajePension == 0)
            return this.montoPension;

        String cpto = null;

        for (TnConceptoPagado c: cptosPagados) {
            cpto = c.getIdTipoCpto().trim() + c.getIdTipoCpto().trim();
            if (this.cptosPorcentaje.contains(cpto)) {
                if (c.getIdTipoCpto().trim().equals("P")) {
                    acumulado = acumulado + c.getCpMonto();
                }

                if (c.getIdTipoCpto().trim().equals("D")) {
                    acumulado = acumulado - c.getCpMonto();
                }
            }
        }
        return acumulado * this.porcentajePension / 100.00;
    }
}
