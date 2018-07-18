package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapBitacoraContrato data.
 */
public class TnCapBitacoraCont implements Domain, Serializable {

    @PrimaryKey(sequenceName = "SN_CAP_BITACORA_CONTRATO_SEC")
    private java.lang.Long idCapBitacoraContrato;
    private int idCapMovto;
    private java.lang.String contratoCursoAdministrador;
    private int contratoCursoCiclo;
    private java.util.Date contratoCursoFecha;
    private double contratoCursoMonto;
    private java.lang.String contratoCursoNumero;
    private java.lang.String contratoCursoDesc;
    private java.lang.String contratoCursoRepresentante;
    private java.util.Date facturaFecha;
    private java.lang.String facturaFolio;
    private double facturaMonto;
    private java.util.Date fecModifico;
    private int idContratoCurso;
    private int idCurso;
    private int idSituacionContrato;
    private int idSituacionFactura;
    private int idTipoContratacion;
    private java.lang.String usuario;
    private java.util.Date facturaAtentaNotaFecha;
    private java.lang.String facturaAtentaNotaNumero;

    /**
     * Constructor for TnCapBitacoraContrato class.
     */
    public TnCapBitacoraCont() {
    }

    /**
     * Constructor for TnCapBitacoraContrato class.
     *
     * @param idCapBitacoraContrato java.lang.Long
     * @param idCapMovto int
     * @param contratoCursoAdministrador java.lang.String
     * @param contratoCursoCiclo int
     * @param contratoCursoFecha java.util.Date
     * @param contratoCursoMonto double
     * @param contratoCursoNumero java.lang.String
     * @param contratoCursoRepresentante java.lang.String
     * @param facturaFecha java.util.Date
     * @param facturaFolio java.lang.String
     * @param facturaMonto double
     * @param fecModifico java.util.Date
     * @param idContratoCurso int
     * @param idCurso int
     * @param idSituacionContrato int
     * @param idSituacionFactura int
     * @param idTipoContratacion int
     * @param usuario java.lang.String
     * @param facturaAtentaNotaFecha java.util.Date
     * @param facturaAtentaNotaNumero java.lang.String
     */
    public TnCapBitacoraCont(java.lang.Long idCapBitacoraContrato, int idCapMovto, 
                             java.lang.String contratoCursoAdministrador, int contratoCursoCiclo, 
                             java.util.Date contratoCursoFecha, double contratoCursoMonto, 
                             java.lang.String contratoCursoNumero, java.lang.String contratoCursoDesc, 
                             java.lang.String contratoCursoRepresentante, java.util.Date facturaFecha, 
                             java.lang.String facturaFolio, double facturaMonto, java.util.Date fecModifico, 
                             int idContratoCurso, int idCurso, int idSituacionContrato, int idSituacionFactura, 
                             int idTipoContratacion, java.lang.String usuario, java.util.Date facturaAtentaNotaFecha, 
                             java.lang.String facturaAtentaNotaNumero) {
        this.idCapBitacoraContrato = idCapBitacoraContrato;
        this.idCapMovto = idCapMovto;
        this.contratoCursoAdministrador = contratoCursoAdministrador;
        this.contratoCursoCiclo = contratoCursoCiclo;
        this.contratoCursoFecha = contratoCursoFecha;
        this.contratoCursoMonto = contratoCursoMonto;
        this.contratoCursoNumero = contratoCursoNumero;
        this.contratoCursoDesc = contratoCursoDesc;
        this.contratoCursoRepresentante = contratoCursoRepresentante;
        this.facturaFecha = facturaFecha;
        this.facturaFolio = facturaFolio;
        this.facturaMonto = facturaMonto;
        this.fecModifico = fecModifico;
        this.idContratoCurso = idContratoCurso;
        this.idCurso = idCurso;
        this.idSituacionContrato = idSituacionContrato;
        this.idSituacionFactura = idSituacionFactura;
        this.idTipoContratacion = idTipoContratacion;
        this.usuario = usuario;
        this.facturaAtentaNotaFecha = facturaAtentaNotaFecha;
        this.facturaAtentaNotaNumero = facturaAtentaNotaNumero;
    }
    
    /**
     * Get idCapBitacoraContrato value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdCapBitacoraContrato() {
        return this.idCapBitacoraContrato;
    }

    /**
     * Get idCapMovto value.
     *
     * @return int
     */
    public int getIdCapMovto() {
        return this.idCapMovto;
    }

    /**
     * Get contratoCursoAdministrador value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoAdministrador() {
        return this.contratoCursoAdministrador;
    }

    /**
     * Get contratoCursoCiclo value.
     *
     * @return int
     */
    public int getContratoCursoCiclo() {
        return this.contratoCursoCiclo;
    }

    /**
     * Get contratoCursoFecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getContratoCursoFecha() {
        return this.contratoCursoFecha;
    }

    /**
     * Get contratoCursoMonto value.
     *
     * @return double
     */
    public double getContratoCursoMonto() {
        return this.contratoCursoMonto;
    }

    /**
     * Get contratoCursoNumero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoNumero() {
        return this.contratoCursoNumero;
    }

    /**
     * Get contratoCursoRepresentante value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRepresentante() {
        return this.contratoCursoRepresentante;
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
     * Get facturaFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaFolio() {
        return this.facturaFolio;
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
     * Get idContratoCurso value.
     *
     * @return int
     */
    public int getIdContratoCurso() {
        return this.idContratoCurso;
    }

    /**
     * Get idCurso value.
     *
     * @return int
     */
    public int getIdCurso() {
        return this.idCurso;
    }

    /**
     * Get idSituacionContrato value.
     *
     * @return int
     */
    public int getIdSituacionContrato() {
        return this.idSituacionContrato;
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
     * Get idTipoContratacion value.
     *
     * @return int
     */
    public int getIdTipoContratacion() {
        return this.idTipoContratacion;
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
     * Set idCapBitacoraContrato value.
     *
     * @param idCapBitacoraContrato java.lang.Long
     */
    public void setIdCapBitacoraContrato(java.lang.Long idCapBitacoraContrato) {
        this.idCapBitacoraContrato = idCapBitacoraContrato;
    }

    /**
     * Set idCapMovto value.
     *
     * @param idCapMovto int
     */
    public void setIdCapMovto(int idCapMovto) {
        this.idCapMovto = idCapMovto;
    }

    /**
     * Set contratoCursoAdministrador value.
     *
     * @param contratoCursoAdministrador java.lang.String
     */
    public void setContratoCursoAdministrador(java.lang.String contratoCursoAdministrador) {
        this.contratoCursoAdministrador = contratoCursoAdministrador;
    }

    /**
     * Set contratoCursoCiclo value.
     *
     * @param contratoCursoCiclo int
     */
    public void setContratoCursoCiclo(int contratoCursoCiclo) {
        this.contratoCursoCiclo = contratoCursoCiclo;
    }

    /**
     * Set contratoCursoFecha value.
     *
     * @param contratoCursoFecha java.util.Date
     */
    public void setContratoCursoFecha(java.util.Date contratoCursoFecha) {
        this.contratoCursoFecha = contratoCursoFecha;
    }

    /**
     * Set contratoCursoMonto value.
     *
     * @param contratoCursoMonto double
     */
    public void setContratoCursoMonto(double contratoCursoMonto) {
        this.contratoCursoMonto = contratoCursoMonto;
    }

    /**
     * Set contratoCursoNumero value.
     *
     * @param contratoCursoNumero java.lang.String
     */
    public void setContratoCursoNumero(java.lang.String contratoCursoNumero) {
        this.contratoCursoNumero = contratoCursoNumero;
    }

    /**
     * Set contratoCursoRepresentante value.
     *
     * @param contratoCursoRepresentante java.lang.String
     */
    public void setContratoCursoRepresentante(java.lang.String contratoCursoRepresentante) {
        this.contratoCursoRepresentante = contratoCursoRepresentante;
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
     * Set facturaFolio value.
     *
     * @param facturaFolio java.lang.String
     */
    public void setFacturaFolio(java.lang.String facturaFolio) {
        this.facturaFolio = facturaFolio;
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
     * Set idContratoCurso value.
     *
     * @param idContratoCurso int
     */
    public void setIdContratoCurso(int idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso int
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Set idSituacionContrato value.
     *
     * @param idSituacionContrato int
     */
    public void setIdSituacionContrato(int idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
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
     * Set idTipoContratacion value.
     *
     * @param idTipoContratacion int
     */
    public void setIdTipoContratacion(int idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
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
     * Set identity value.
     *
     * @param idCapBitacoraContrato Serializable
     */
    public void setIdentity(Serializable idCapBitacoraContrato) {
        this.idCapBitacoraContrato = (java.lang.Long)idCapBitacoraContrato;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idCapBitacoraContrato;
    }

    public void setContratoCursoDesc(String contratoCursoDesc) {
        this.contratoCursoDesc = contratoCursoDesc;
    }

    public String getContratoCursoDesc() {
        return contratoCursoDesc;
    }
}
