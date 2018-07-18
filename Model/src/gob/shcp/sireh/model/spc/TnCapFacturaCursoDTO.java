package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapFacturaCurso data.
 */
public class TnCapFacturaCursoDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(240)
    private java.lang.String facturaFolio;
    private java.lang.Integer idContratoCurso;
    private java.lang.Integer idCurso;
    @NotNull
    private java.util.Date facturaFecha;
    @NotNull
    private double facturaMonto;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idSituacionFactura;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.util.Date facturaAtentaNotaFecha;
    @MaxLength(240)
    private java.lang.String facturaAtentaNotaNumero;
    private java.lang.String facturaXml;
    private java.lang.String facturaXmlFirmado;

    /**
     * Constructor for TnCapFacturaCursoDTO class.
     */
    public TnCapFacturaCursoDTO() {
    }

    /**
     * Constructor for TnCapFacturaCursoDTO class.
     *
     * @param facturaFolio java.lang.String
     * @param idContratoCurso java.lang.Integer
     * @param idCurso java.lang.Integer
     * @param facturaFecha java.util.Date
     * @param facturaMonto double
     * @param fecModifico java.util.Date
     * @param idSituacionFactura int
     * @param usuario java.lang.String
     * @param facturaAtentaNotaFecha java.util.Date
     * @param facturaAtentaNotaNumero java.lang.String
     * @param facturaXml java.lang.String
     * @param facturaXmlFirmado java.lang.String
     */
    public TnCapFacturaCursoDTO(java.lang.String facturaFolio, java.lang.Integer idContratoCurso, 
                                java.lang.Integer idCurso, java.util.Date facturaFecha, double facturaMonto, 
                                java.util.Date fecModifico, int idSituacionFactura, java.lang.String usuario, 
                                java.util.Date facturaAtentaNotaFecha, java.lang.String facturaAtentaNotaNumero, 
                                java.lang.String facturaXml, java.lang.String facturaXmlFirmado) {
        this.facturaFolio = facturaFolio;
        this.idContratoCurso = idContratoCurso;
        this.idCurso = idCurso;
        this.facturaFecha = facturaFecha;
        this.facturaMonto = facturaMonto;
        this.fecModifico = fecModifico;
        this.idSituacionFactura = idSituacionFactura;
        this.usuario = usuario;
        this.facturaAtentaNotaFecha = facturaAtentaNotaFecha;
        this.facturaAtentaNotaNumero = facturaAtentaNotaNumero;
        this.facturaXml = facturaXml;
        this.facturaXmlFirmado = facturaXmlFirmado;
    }

    /**
     * Set facturaFolio value.
     *
     * @param facturaFolio java.lang.String
     */
    public void setFacturaFolio(java.lang.String facturaFolio) {
        this.facturaFolio = facturaFolio;
    }

    /**
     * Get facturaFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaFolio() {
        return this.facturaFolio;
    }

    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        return this.idContratoCurso;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set facturaFecha value.
     *
     * @param facturaFecha java.util.Date
     */
    public void setFacturaFecha(java.util.Date facturaFecha) {
        this.facturaFecha = facturaFecha;
    }

    /**
     * Get facturaFecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFacturaFecha() {
        return this.facturaFecha;
    }

    /**
     * Set facturaMonto value.
     *
     * @param facturaMonto double
     */
    public void setFacturaMonto(double facturaMonto) {
        this.facturaMonto = facturaMonto;
    }

    /**
     * Get facturaMonto value.
     *
     * @return double
     */
    public double getFacturaMonto() {
        return this.facturaMonto;
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
     * Set idSituacionFactura value.
     *
     * @param idSituacionFactura int
     */
    public void setIdSituacionFactura(int idSituacionFactura) {
        this.idSituacionFactura = idSituacionFactura;
    }

    /**
     * Get idSituacionFactura value.
     *
     * @return int
     */
    public int getIdSituacionFactura() {
        return this.idSituacionFactura;
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
     * Set facturaAtentaNotaFecha value.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     */
    public void setFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha) {
        this.facturaAtentaNotaFecha = facturaAtentaNotaFecha;
    }

    /**
     * Get facturaAtentaNotaFecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFacturaAtentaNotaFecha() {
        return this.facturaAtentaNotaFecha;
    }

    /**
     * Set facturaAtentaNotaNumero value.
     *
     * @param facturaAtentaNotaNumero java.lang.String
     */
    public void setFacturaAtentaNotaNumero(java.lang.String facturaAtentaNotaNumero) {
        this.facturaAtentaNotaNumero = facturaAtentaNotaNumero;
    }

    /**
     * Get facturaAtentaNotaNumero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaAtentaNotaNumero() {
        return this.facturaAtentaNotaNumero;
    }

    /**
     * Set facturaXml value.
     *
     * @param facturaXml java.lang.String
     */
    public void setFacturaXml(java.lang.String facturaXml) {
        this.facturaXml = facturaXml;
    }

    /**
     * Get facturaXml value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaXml() {
        return this.facturaXml;
    }

    /**
     * Set facturaXmlFirmado value.
     *
     * @param facturaXmlFirmado java.lang.String
     */
    public void setFacturaXmlFirmado(java.lang.String facturaXmlFirmado) {
        this.facturaXmlFirmado = facturaXmlFirmado;
    }

    /**
     * Get facturaXmlFirmado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaXmlFirmado() {
        return this.facturaXmlFirmado;
    }
}
