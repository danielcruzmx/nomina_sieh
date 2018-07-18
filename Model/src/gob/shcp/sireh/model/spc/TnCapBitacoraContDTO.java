package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapBitacoraContrato data.
 */
public class TnCapBitacoraContDTO implements java.io.Serializable, Model {

    private java.lang.Long idCapBitacoraContrato;
    @NotNull
    private int idCapMovto;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(240)
    private java.lang.String contratoCursoAdministrador;
    @NotNull
    private int contratoCursoCiclo;
    @NotNull
    private java.util.Date contratoCursoFecha;
    @NotNull
    private double contratoCursoMonto;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String contratoCursoNumero;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(240)
    private java.lang.String contratoCursoRepresentante;
    @NotNull
    private java.util.Date facturaFecha;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(240)
    private java.lang.String facturaFolio;
    @NotNull
    private double facturaMonto;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private int idContratoCurso;
    @NotNull
    private int idCurso;
    @NotNull
    private int idSituacionContrato;
    @NotNull
    private int idSituacionFactura;
    @NotNull
    private int idTipoContratacion;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(80)
    private java.lang.String usuario;
    private java.util.Date facturaAtentaNotaFecha;
    @MaxLength(240)
    private java.lang.String facturaAtentaNotaNumero;

    /**
     * Constructor for TnCapBitacoraContratoDTO class.
     */
    public TnCapBitacoraContDTO() {
    }

    /**
     * Constructor for TnCapBitacoraContratoDTO class.
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
    public TnCapBitacoraContDTO(java.lang.Long idCapBitacoraContrato, int idCapMovto, 
                                    java.lang.String contratoCursoAdministrador, int contratoCursoCiclo, 
                                    java.util.Date contratoCursoFecha, double contratoCursoMonto, 
                                    java.lang.String contratoCursoNumero, java.lang.String contratoCursoRepresentante, 
                                    java.util.Date facturaFecha, java.lang.String facturaFolio, double facturaMonto, 
                                    java.util.Date fecModifico, int idContratoCurso, int idCurso, 
                                    int idSituacionContrato, int idSituacionFactura, int idTipoContratacion, 
                                    java.lang.String usuario, java.util.Date facturaAtentaNotaFecha, 
                                    java.lang.String facturaAtentaNotaNumero) {
        this.idCapBitacoraContrato = idCapBitacoraContrato;
        this.idCapMovto = idCapMovto;
        this.contratoCursoAdministrador = contratoCursoAdministrador;
        this.contratoCursoCiclo = contratoCursoCiclo;
        this.contratoCursoFecha = contratoCursoFecha;
        this.contratoCursoMonto = contratoCursoMonto;
        this.contratoCursoNumero = contratoCursoNumero;
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
     * Set idCapBitacoraContrato value.
     *
     * @param idCapBitacoraContrato java.lang.Long
     */
    public void setIdCapBitacoraContrato(java.lang.Long idCapBitacoraContrato) {
        this.idCapBitacoraContrato = idCapBitacoraContrato;
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
     * Set idCapMovto value.
     *
     * @param idCapMovto int
     */
    public void setIdCapMovto(int idCapMovto) {
        this.idCapMovto = idCapMovto;
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
     * Set contratoCursoAdministrador value.
     *
     * @param contratoCursoAdministrador java.lang.String
     */
    public void setContratoCursoAdministrador(java.lang.String contratoCursoAdministrador) {
        this.contratoCursoAdministrador = contratoCursoAdministrador;
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
     * Set contratoCursoCiclo value.
     *
     * @param contratoCursoCiclo int
     */
    public void setContratoCursoCiclo(int contratoCursoCiclo) {
        this.contratoCursoCiclo = contratoCursoCiclo;
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
     * Set contratoCursoFecha value.
     *
     * @param contratoCursoFecha java.util.Date
     */
    public void setContratoCursoFecha(java.util.Date contratoCursoFecha) {
        this.contratoCursoFecha = contratoCursoFecha;
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
     * Set contratoCursoMonto value.
     *
     * @param contratoCursoMonto double
     */
    public void setContratoCursoMonto(double contratoCursoMonto) {
        this.contratoCursoMonto = contratoCursoMonto;
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
     * Set contratoCursoNumero value.
     *
     * @param contratoCursoNumero java.lang.String
     */
    public void setContratoCursoNumero(java.lang.String contratoCursoNumero) {
        this.contratoCursoNumero = contratoCursoNumero;
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
     * Set contratoCursoRepresentante value.
     *
     * @param contratoCursoRepresentante java.lang.String
     */
    public void setContratoCursoRepresentante(java.lang.String contratoCursoRepresentante) {
        this.contratoCursoRepresentante = contratoCursoRepresentante;
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
     * Set idContratoCurso value.
     *
     * @param idContratoCurso int
     */
    public void setIdContratoCurso(int idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
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
     * Set idCurso value.
     *
     * @param idCurso int
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
     * Set idSituacionContrato value.
     *
     * @param idSituacionContrato int
     */
    public void setIdSituacionContrato(int idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
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
     * Set idTipoContratacion value.
     *
     * @param idTipoContratacion int
     */
    public void setIdTipoContratacion(int idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
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
}
