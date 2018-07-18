package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCxlcCancelado data.
 */
public class TnCxlcCanceladoDTO implements java.io.Serializable, Model {

    private java.lang.Integer cxlc;
    private java.lang.Integer cxlccCiclo;
    private java.lang.Integer cxlccDifFolio;
    private java.lang.Long cxlccFolio;
    private java.lang.Integer cxlccGuiaCont;
    @NotBlank(errorCode = "not.null")
    @MaxLength(8)
    private java.lang.String idCptoPago;
    @NotBlank(errorCode = "not.null")
    @MaxLength(4)
    private java.lang.String idTipoCpto;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(4)
    private java.lang.String aplicado;
    private java.lang.Integer cxlccEdoAplica;
    private java.lang.Double cxlccMonto;
    @MaxLength(12)
    private java.lang.String cxlccTipoProceso;
    @MaxLength(12)
    private java.lang.String cxlccUniAplica;
    private java.lang.Integer idEdo;
    @MaxLength(4)
    private java.lang.String idGrupoPago;
    @MaxLength(8)
    private java.lang.String idTipoNomina;
    @MaxLength(12)
    private java.lang.String idUnidad;

    /**
     * Constructor for TnCxlcCanceladoDTO class.
     */
    public TnCxlcCanceladoDTO() {
    }


    /**
     * Constructor for TnCxlcCanceladoDTO class.
     *
     * @param cxlc java.lang.Integer
     * @param cxlccCiclo java.lang.Integer
     * @param cxlccDifFolio java.lang.Integer
     * @param cxlccFolio java.lang.Long
     * @param cxlccGuiaCont java.lang.Integer
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param aplicado java.lang.String
     * @param cxlccEdoAplica java.lang.Integer
     * @param cxlccMonto java.lang.Double
     * @param cxlccTipoProceso java.lang.String
     * @param cxlccUniAplica java.lang.String
     * @param idEdo java.lang.Integer
     * @param idGrupoPago java.lang.String
     * @param idTipoNomina java.lang.String
     * @param idUnidad java.lang.String
     */
    public TnCxlcCanceladoDTO(java.lang.Integer cxlc, java.lang.Integer cxlccCiclo, java.lang.Integer cxlccDifFolio, 
                              java.lang.Long cxlccFolio, java.lang.Integer cxlccGuiaCont, java.lang.String idCptoPago, 
                              java.lang.String idTipoCpto, java.util.Date fecModifico, java.lang.String usuario, 
                              java.lang.String aplicado, java.lang.Integer cxlccEdoAplica, java.lang.Double cxlccMonto, 
                              java.lang.String cxlccTipoProceso, java.lang.String cxlccUniAplica, 
                              java.lang.Integer idEdo, java.lang.String idGrupoPago, java.lang.String idTipoNomina, 
                              java.lang.String idUnidad) {
        this.cxlc = cxlc;
        this.cxlccCiclo = cxlccCiclo;
        this.cxlccDifFolio = cxlccDifFolio;
        this.cxlccFolio = cxlccFolio;
        this.cxlccGuiaCont = cxlccGuiaCont;
        this.idCptoPago = idCptoPago;
        this.idTipoCpto = idTipoCpto;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.aplicado = aplicado;
        this.cxlccEdoAplica = cxlccEdoAplica;
        this.cxlccMonto = cxlccMonto;
        this.cxlccTipoProceso = cxlccTipoProceso;
        this.cxlccUniAplica = cxlccUniAplica;
        this.idEdo = idEdo;
        this.idGrupoPago = idGrupoPago;
        this.idTipoNomina = idTipoNomina;
        this.idUnidad = idUnidad;
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
     * Get cxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlc() {
        return this.cxlc;
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
     * Get cxlccCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccCiclo() {
        return this.cxlccCiclo;
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
     * Get cxlccDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccDifFolio() {
        return this.cxlccDifFolio;
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
     * Get cxlccFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlccFolio() {
        return this.cxlccFolio;
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
     * Get cxlccGuiaCont value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccGuiaCont() {
        return this.cxlccGuiaCont;
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
     * Set aplicado value.
     *
     * @param aplicado java.lang.String
     */
    public void setAplicado(java.lang.String aplicado) {
        this.aplicado = aplicado;
    }

    /**
     * Get aplicado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAplicado() {
        return this.aplicado;
    }

    /**
     * Set cxlccEdoAplica value.
     *
     * @param cxlccEdoAplica java.lang.Integer
     */
    public void setCxlccEdoAplica(java.lang.Integer cxlccEdoAplica) {
        this.cxlccEdoAplica = cxlccEdoAplica;
    }

    /**
     * Get cxlccEdoAplica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccEdoAplica() {
        return this.cxlccEdoAplica;
    }

    /**
     * Set cxlccMonto value.
     *
     * @param cxlccMonto java.lang.Double
     */
    public void setCxlccMonto(java.lang.Double cxlccMonto) {
        this.cxlccMonto = cxlccMonto;
    }

    /**
     * Get cxlccMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCxlccMonto() {
        return this.cxlccMonto;
    }

    /**
     * Set cxlccTipoProceso value.
     *
     * @param cxlccTipoProceso java.lang.String
     */
    public void setCxlccTipoProceso(java.lang.String cxlccTipoProceso) {
        this.cxlccTipoProceso = cxlccTipoProceso;
    }

    /**
     * Get cxlccTipoProceso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlccTipoProceso() {
        return this.cxlccTipoProceso;
    }

    /**
     * Set cxlccUniAplica value.
     *
     * @param cxlccUniAplica java.lang.String
     */
    public void setCxlccUniAplica(java.lang.String cxlccUniAplica) {
        this.cxlccUniAplica = cxlccUniAplica;
    }

    /**
     * Get cxlccUniAplica value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlccUniAplica() {
        return this.cxlccUniAplica;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    /**
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
    }

    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    /**
     * Get idTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNomina() {
        return this.idTipoNomina;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }
    
}
