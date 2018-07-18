package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapFacturaCurso data.
 */
public class TnCapFacturaCurso implements Domain, Serializable {
    private TnCapFacturaCursoPK idComposite;
    private java.util.Date facturaFecha;
    private double facturaMonto;
    private java.util.Date fecModifico;
    private int idSituacionFactura;
    private java.lang.String usuario;
    private java.util.Date facturaAtentaNotaFecha;
    private java.lang.String facturaAtentaNotaNumero;
    private java.sql.Clob facturaXml;
    private java.sql.Clob facturaXmlFirmado;

    /**
     * Constructor for TnCapFacturaCurso class.
     */
    public TnCapFacturaCurso() {
    }

    /**
     * Constructor for TnCapFacturaCurso class.
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
     * @param facturaXml java.sql.Clob
     * @param facturaXmlFirmado java.sql.Clob
     */
    public TnCapFacturaCurso(TnCapFacturaCursoPK idComposite, java.util.Date facturaFecha, double facturaMonto, 
                             java.util.Date fecModifico, int idSituacionFactura, java.lang.String usuario, 
                             java.util.Date facturaAtentaNotaFecha, java.lang.String facturaAtentaNotaNumero, 
                             java.sql.Clob facturaXml, java.sql.Clob facturaXmlFirmado) {
        this.idComposite = idComposite;
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
     * Get facturaFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getFacturaFolio();
    }

    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdContratoCurso();
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCurso();
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
     * Get facturaMonto value.
     *
     * @return double
     */
    public double getFacturaMonto() {
        return this.facturaMonto;
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
     * Get idSituacionFactura value.
     *
     * @return int
     */
    public int getIdSituacionFactura() {
        return this.idSituacionFactura;
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
     * Get facturaAtentaNotaFecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFacturaAtentaNotaFecha() {
        return this.facturaAtentaNotaFecha;
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
     * Get facturaXml value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getFacturaXml() {
        return this.facturaXml;
    }

    /**
     * Get facturaXmlFirmado value.
     *
     * @return java.sql.Clob
     */
    public java.sql.Clob getFacturaXmlFirmado() {
        return this.facturaXmlFirmado;
    }


    /**
     * Set facturaFolio value.
     *
     * @param facturaFolio java.lang.String
     */
    public void setFacturaFolio(java.lang.String facturaFolio) {
        if (idComposite == null) {
            idComposite = new TnCapFacturaCursoPK();
        }
        this.idComposite.setFacturaFolio(facturaFolio);
    }

    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso) {
        if (idComposite == null) {
            idComposite = new TnCapFacturaCursoPK();
        }
        this.idComposite.setIdContratoCurso(idContratoCurso);
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        if (idComposite == null) {
            idComposite = new TnCapFacturaCursoPK();
        }
        this.idComposite.setIdCurso(idCurso);
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
     * Set facturaMonto value.
     *
     * @param facturaMonto double
     */
    public void setFacturaMonto(double facturaMonto) {
        this.facturaMonto = facturaMonto;
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
     * Set idSituacionFactura value.
     *
     * @param idSituacionFactura int
     */
    public void setIdSituacionFactura(int idSituacionFactura) {
        this.idSituacionFactura = idSituacionFactura;
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
     * Set facturaAtentaNotaFecha value.
     *
     * @param facturaAtentaNotaFecha java.util.Date
     */
    public void setFacturaAtentaNotaFecha(java.util.Date facturaAtentaNotaFecha) {
        this.facturaAtentaNotaFecha = facturaAtentaNotaFecha;
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
     * Set facturaXml value.
     *
     * @param facturaXml java.sql.Clob
     */
    public void setFacturaXml(java.sql.Clob facturaXml) {
        this.facturaXml = facturaXml;
    }

    /**
     * Set facturaXmlFirmado value.
     *
     * @param facturaXmlFirmado java.sql.Clob
     */
    public void setFacturaXmlFirmado(java.sql.Clob facturaXmlFirmado) {
        this.facturaXmlFirmado = facturaXmlFirmado;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCapFacturaCursoPK)idComposite;
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
