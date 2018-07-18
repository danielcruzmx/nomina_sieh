package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnComprobante data.
 */
public class TnComprobanteDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(52)
    private java.lang.String compRfc;
    private java.lang.Long idComprobante;
    private java.lang.Integer idPaquete;
    private java.lang.Integer idEdoComprobante;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.util.Date compFechaCancela;
    private java.util.Date compFechaEmision;
    @MaxLength(200)
    private java.lang.String compFolioCancelado;
    @MaxLength(200)
    private java.lang.String compFolioFiscal;
    @MaxLength(140)
    private java.lang.String compFolioRecibo;
    private java.lang.Integer idPaqueteCancelado;
    private java.sql.Clob xmlCancelado;
    private java.sql.Clob xmlGenerado;
    private java.sql.Clob xmlTimbrado;

    /**
     * Constructor for TnComprobanteDTO class.
     */
    public TnComprobanteDTO() {
    }


    /**
     * Constructor for TnComprobanteDTO class.
     *
     * @param compRfc java.lang.String
     * @param idComprobante java.lang.Long
     * @param idPaquete java.lang.Integer
     * @param idEdoComprobante java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param compFechaCancela java.util.Date
     * @param compFechaEmision java.util.Date
     * @param compFolioCancelado java.lang.String
     * @param compFolioFiscal java.lang.String
     * @param compFolioRecibo java.lang.String
     * @param idPaqueteCancelado java.lang.Integer
     * @param xmlCancelado java.sql.Clob
     * @param xmlGenerado java.sql.Clob
     * @param xmlTimbrado java.sql.Clob
     */
    public TnComprobanteDTO(java.lang.String compRfc, java.lang.Long idComprobante, java.lang.Integer idPaquete, 
                            java.lang.Integer idEdoComprobante, java.util.Date fecModifico, java.lang.String usuario, 
                            java.util.Date compFechaCancela, java.util.Date compFechaEmision, 
                            java.lang.String compFolioCancelado, java.lang.String compFolioFiscal, 
                            java.lang.String compFolioRecibo, java.lang.Integer idPaqueteCancelado, 
                            java.sql.Clob xmlCancelado, 
                            java.sql.Clob xmlGenerado, 
                            java.sql.Clob xmlTimbrado) {
        this.compRfc = compRfc;
        this.idComprobante = idComprobante;
        this.idPaquete = idPaquete;
        this.idEdoComprobante = idEdoComprobante;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.compFechaCancela = compFechaCancela;
        this.compFechaEmision = compFechaEmision;
        this.compFolioCancelado = compFolioCancelado;
        this.compFolioFiscal = compFolioFiscal;
        this.compFolioRecibo = compFolioRecibo;
        this.idPaqueteCancelado = idPaqueteCancelado;
        this.xmlCancelado = xmlCancelado;
        this.xmlGenerado = xmlGenerado;
        this.xmlTimbrado = xmlTimbrado;
    }


    /**
     * Set compRfc value.
     *
     * @param compRfc java.lang.String
     */
    public void setCompRfc(java.lang.String compRfc) {
        this.compRfc = compRfc;
    }

    /**
     * Get compRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompRfc() {
        return this.compRfc;
    }

    /**
     * Set idComprobante value.
     *
     * @param idComprobante java.lang.Long
     */
    public void setIdComprobante(java.lang.Long idComprobante) {
        this.idComprobante = idComprobante;
    }

    /**
     * Get idComprobante value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdComprobante() {
        return this.idComprobante;
    }

    /**
     * Set idPaquete value.
     *
     * @param idPaquete java.lang.Integer
     */
    public void setIdPaquete(java.lang.Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    /**
     * Get idPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPaquete() {
        return this.idPaquete;
    }

    /**
     * Set idEdoComprobante value.
     *
     * @param idEdoComprobante java.lang.Integer
     */
    public void setIdEdoComprobante(java.lang.Integer idEdoComprobante) {
        this.idEdoComprobante = idEdoComprobante;
    }

    /**
     * Get idEdoComprobante value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoComprobante() {
        return this.idEdoComprobante;
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
     * Set compFechaCancela value.
     *
     * @param compFechaCancela java.util.Date
     */
    public void setCompFechaCancela(java.util.Date compFechaCancela) {
        this.compFechaCancela = compFechaCancela;
    }

    /**
     * Get compFechaCancela value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCompFechaCancela() {
        return this.compFechaCancela;
    }

    /**
     * Set compFechaEmision value.
     *
     * @param compFechaEmision java.util.Date
     */
    public void setCompFechaEmision(java.util.Date compFechaEmision) {
        this.compFechaEmision = compFechaEmision;
    }

    /**
     * Get compFechaEmision value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCompFechaEmision() {
        return this.compFechaEmision;
    }

    /**
     * Set compFolioCancelado value.
     *
     * @param compFolioCancelado java.lang.String
     */
    public void setCompFolioCancelado(java.lang.String compFolioCancelado) {
        this.compFolioCancelado = compFolioCancelado;
    }

    /**
     * Get compFolioCancelado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompFolioCancelado() {
        return this.compFolioCancelado;
    }

    /**
     * Set compFolioFiscal value.
     *
     * @param compFolioFiscal java.lang.String
     */
    public void setCompFolioFiscal(java.lang.String compFolioFiscal) {
        this.compFolioFiscal = compFolioFiscal;
    }

    /**
     * Get compFolioFiscal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompFolioFiscal() {
        return this.compFolioFiscal;
    }

    /**
     * Set compFolioRecibo value.
     *
     * @param compFolioRecibo java.lang.String
     */
    public void setCompFolioRecibo(java.lang.String compFolioRecibo) {
        this.compFolioRecibo = compFolioRecibo;
    }

    /**
     * Get compFolioRecibo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompFolioRecibo() {
        return this.compFolioRecibo;
    }

    /**
     * Set idPaqueteCancelado value.
     *
     * @param idPaqueteCancelado java.lang.Integer
     */
    public void setIdPaqueteCancelado(java.lang.Integer idPaqueteCancelado) {
        this.idPaqueteCancelado = idPaqueteCancelado;
    }

    /**
     * Get idPaqueteCancelado value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPaqueteCancelado() {
        return this.idPaqueteCancelado;
    }

    /**
     * Set xmlCancelado value.
     *
     * @param xmlCancelado java.sql.Clob
     */
    public void setXmlCancelado(java.sql.Clob xmlCancelado) {
        this.xmlCancelado = xmlCancelado;
    }

    /**
     * Get xmlCancelado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlCancelado() {
        return this.xmlCancelado;
    }

    /**
     * Set xmlGenerado value.
     *
     * @param xmlGenerado java.sql.Clob
     */
    public void setXmlGenerado(java.sql.Clob xmlGenerado) {
        this.xmlGenerado = xmlGenerado;
    }

    /**
     * Get xmlGenerado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlGenerado() {
        return this.xmlGenerado;
    }

    /**
     * Set xmlTimbrado value.
     *
     * @param xmlTimbrado java.sql.Clob
     */
    public void setXmlTimbrado(java.sql.Clob xmlTimbrado) {
        this.xmlTimbrado = xmlTimbrado;
    }

    /**
     * Get xmlTimbrado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlTimbrado() {
        return this.xmlTimbrado;
    }
}
