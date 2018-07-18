package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnComprobante data.
 */
public class TnComprobante implements Domain, Serializable {

    private TnComprobantePK idComposite;
    private java.lang.Integer idEdoComprobante;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.util.Date compFechaCancela;
    private java.util.Date compFechaEmision;
    private java.lang.String compFolioCancelado;
    private java.lang.String compFolioFiscal;
    private java.lang.String compFolioRecibo;
    private java.lang.Integer idPaqueteCancelado;
    private java.sql.Clob xmlCancelado;
    private java.sql.Clob xmlGenerado;
    private java.sql.Clob xmlTimbrado;

    /**
     * Constructor for TnComprobante class.
     */
    public TnComprobante() {
    }

    /**
     * Constructor for TnComprobante class.
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
    public TnComprobante(TnComprobantePK idComposite, 
                         java.lang.Integer idEdoComprobante, 
                         java.util.Date fecModifico, java.lang.String usuario, 
                         java.util.Date compFechaCancela, 
                         java.util.Date compFechaEmision, 
                         java.lang.String compFolioCancelado, 
                         java.lang.String compFolioFiscal, 
                         java.lang.String compFolioRecibo, 
                         java.lang.Integer idPaqueteCancelado, 
                         java.sql.Clob xmlCancelado, java.sql.Clob xmlGenerado, 
                         java.sql.Clob xmlTimbrado) {
        this.idComposite = idComposite;
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
     * Get compRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCompRfc();
    }

    /**
     * Get idComprobante value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdComprobante() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdComprobante();
    }

    /**
     * Get idPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPaquete() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdPaquete();
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
     * Get compFechaCancela value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCompFechaCancela() {
        return this.compFechaCancela;
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
     * Get compFolioCancelado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompFolioCancelado() {
        return this.compFolioCancelado;
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
     * Get compFolioRecibo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCompFolioRecibo() {
        return this.compFolioRecibo;
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
     * Get xmlCancelado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlCancelado() {
        return this.xmlCancelado;
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
     * Get xmlTimbrado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getXmlTimbrado() {
        return this.xmlTimbrado;
    }

    /**
     * Set compRfc value.
     *
     * @param compRfc java.lang.String
     */
    public void setCompRfc(java.lang.String compRfc) {
        if (idComposite == null) {
            idComposite = new TnComprobantePK();
        }
        this.idComposite.setCompRfc(compRfc);
    }

    /**
     * Set idComprobante value.
     *
     * @param idComprobante java.lang.Long
     */
    public void setIdComprobante(java.lang.Long idComprobante) {
        if (idComposite == null) {
            idComposite = new TnComprobantePK();
        }
        this.idComposite.setIdComprobante(idComprobante);
    }

    /**
     * Set idPaquete value.
     *
     * @param idPaquete java.lang.Integer
     */
    public void setIdPaquete(java.lang.Integer idPaquete) {
        if (idComposite == null) {
            idComposite = new TnComprobantePK();
        }
        this.idComposite.setIdPaquete(idPaquete);
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
     * Set compFechaCancela value.
     *
     * @param compFechaCancela java.util.Date
     */
    public void setCompFechaCancela(java.util.Date compFechaCancela) {
        this.compFechaCancela = compFechaCancela;
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
     * Set compFolioCancelado value.
     *
     * @param compFolioCancelado java.lang.String
     */
    public void setCompFolioCancelado(java.lang.String compFolioCancelado) {
        this.compFolioCancelado = compFolioCancelado;
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
     * Set compFolioRecibo value.
     *
     * @param compFolioRecibo java.lang.String
     */
    public void setCompFolioRecibo(java.lang.String compFolioRecibo) {
        this.compFolioRecibo = compFolioRecibo;
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
     * Set xmlCancelado value.
     *
     * @param xmlCancelado java.sql.Clob
     */
    public void setXmlCancelado(java.sql.Clob xmlCancelado) {
        this.xmlCancelado = xmlCancelado;
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
     * Set xmlTimbrado value.
     *
     * @param xmlTimbrado java.sql.Clob
     */
    public void setXmlTimbrado(java.sql.Clob xmlTimbrado) {
        this.xmlTimbrado = xmlTimbrado;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnComprobantePK)idComposite;
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
