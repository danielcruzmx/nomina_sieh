package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdSecCxlc data.
 */
public class TdSecCxlcDTO implements java.io.Serializable, Model {

    private java.lang.Integer cxlc;
    private java.lang.Integer secCxlc;
    private java.lang.Integer secCxlcCiclo;
    @MaxLength(12)
    private java.lang.String idActInsti;
    @MaxLength(12)
    private java.lang.String idActInstiEsp;
    @MaxLength(16)
    private java.lang.String idActPriorita;
    private java.lang.Integer idEdo;
    @MaxLength(16)
    private java.lang.String idFuncion;
    @MaxLength(8)
    private java.lang.String idPrograma;
    @MaxLength(12)
    private java.lang.String idUnidad;
    @MaxLength(8)
    private java.lang.String idUnidadEjecuto;
    private java.lang.Integer secGuiaContableEjer;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.lang.Integer idFuenteFinan;
    @MaxLength(4)
    private java.lang.String idGrupopago;
    @MaxLength(20)
    private java.lang.String idPartida;
    private java.lang.Integer idSindicato;
    private java.lang.Integer idTipoGasto;
    @MaxLength(4)
    private java.lang.String secClaveMov;
    @MaxLength(24)
    private java.lang.String secCompromiso;
    @MaxLength(12)
    private java.lang.String secCptoMovto;
    @MaxLength(4)
    private java.lang.String secCtaClabe;
    private java.lang.Long secCxlcSiaff;
    private java.lang.Integer secCxlcTerceros;
    private java.lang.Long secDevengado;
    private java.util.Date secFecExtraSicop;
    private java.lang.Double secMonto;
    private java.lang.Integer secQnaApli;
    private java.lang.Integer secSiaff;
    private java.lang.Integer secTerceros;
    @MaxLength(8)
    private java.lang.String secTipoCpto;
    
    /**
     * Constructor for TdSecCxlcDTO class.
     */
    public TdSecCxlcDTO() {
    }

    /**
     * Constructor for TdSecCxlcDTO class.
     *
     * @param cxlc java.lang.Integer
     * @param secCxlc java.lang.Integer
     * @param secCxlcCiclo java.lang.Integer
     * @param idActInsti java.lang.String
     * @param idActInstiEsp java.lang.String
     * @param idActPriorita java.lang.String
     * @param idEdo java.lang.Integer
     * @param idFuncion java.lang.String
     * @param idPrograma java.lang.String
     * @param idUnidad java.lang.String
     * @param idUnidadEjecuto java.lang.String
     * @param secGuiaContableEjer java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idFuenteFinan java.lang.Integer
     * @param idGrupopago java.lang.String
     * @param idPartida java.lang.String
     * @param idSindicato java.lang.Integer
     * @param idTipoGasto java.lang.Integer
     * @param secClaveMov java.lang.String
     * @param secCompromiso java.lang.String
     * @param secCptoMovto java.lang.String
     * @param secCtaClabe java.lang.String
     * @param secCxlcSiaff java.lang.Long
     * @param secCxlcTerceros java.lang.Integer
     * @param secDevengado java.lang.Long
     * @param secFecExtraSicop java.util.Date
     * @param secMonto java.lang.Double
     * @param secQnaApli java.lang.Integer
     * @param secSiaff java.lang.Integer
     * @param secTerceros java.lang.Integer
     * @param secTipoCpto java.lang.String
     */
    public TdSecCxlcDTO(java.lang.Integer cxlc, 
                        java.lang.Integer secCxlc, 
                        java.lang.Integer secCxlcCiclo, 
                        java.lang.String idActInsti, 
                        java.lang.String idActInstiEsp, 
                        java.lang.String idActPriorita, 
                        java.lang.Integer idEdo, 
                        java.lang.String idFuncion, 
                        java.lang.String idPrograma, 
                        java.lang.String idUnidad, 
                        java.lang.String idUnidadEjecuto, 
                        java.lang.Integer secGuiaContableEjer, 
                        java.util.Date fecModifico, 
                        java.lang.String usuario, 
                        java.lang.Integer idFuenteFinan, 
                        java.lang.String idGrupopago, 
                        java.lang.String idPartida, 
                        java.lang.Integer idSindicato, 
                        java.lang.Integer idTipoGasto, 
                        java.lang.String secClaveMov, 
                        java.lang.String secCompromiso, 
                        java.lang.String secCptoMovto, 
                        java.lang.String secCtaClabe, 
                        java.lang.Long secCxlcSiaff, 
                        java.lang.Integer secCxlcTerceros, 
                        java.lang.Long secDevengado, 
                        java.util.Date secFecExtraSicop, 
                        java.lang.Double secMonto, 
                        java.lang.Integer secQnaApli, 
                        java.lang.Integer secSiaff, 
                        java.lang.Integer secTerceros, 
                        java.lang.String secTipoCpto) {
        this.cxlc = cxlc;
        this.secCxlc = secCxlc;
        this.secCxlcCiclo = secCxlcCiclo;
        this.idActInsti = idActInsti;
        this.idActInstiEsp = idActInstiEsp;
        this.idActPriorita = idActPriorita;
        this.idEdo = idEdo;
        this.idFuncion = idFuncion;
        this.idPrograma = idPrograma;
        this.idUnidad = idUnidad;
        this.idUnidadEjecuto = idUnidadEjecuto;
        this.secGuiaContableEjer = secGuiaContableEjer;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idFuenteFinan = idFuenteFinan;
        this.idGrupopago = idGrupopago;
        this.idPartida = idPartida;
        this.idSindicato = idSindicato;
        this.idTipoGasto = idTipoGasto;
        this.secClaveMov = secClaveMov;
        this.secCompromiso = secCompromiso;
        this.secCptoMovto = secCptoMovto;
        this.secCtaClabe = secCtaClabe;
        this.secCxlcSiaff = secCxlcSiaff;
        this.secCxlcTerceros = secCxlcTerceros;
        this.secDevengado = secDevengado;
        this.secFecExtraSicop = secFecExtraSicop;
        this.secMonto = secMonto;
        this.secQnaApli = secQnaApli;
        this.secSiaff = secSiaff;
        this.secTerceros = secTerceros;
        this.secTipoCpto = secTipoCpto;
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
     * Set secCxlc value.
     *
     * @param secCxlc java.lang.Integer
     */
    public void setSecCxlc(java.lang.Integer secCxlc) {
        this.secCxlc = secCxlc;
    }

    /**
     * Get secCxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecCxlc() {
        return this.secCxlc;
    }

    /**
     * Set secCxlcCiclo value.
     *
     * @param secCxlcCiclo java.lang.Integer
     */
    public void setSecCxlcCiclo(java.lang.Integer secCxlcCiclo) {
        this.secCxlcCiclo = secCxlcCiclo;
    }

    /**
     * Get secCxlcCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecCxlcCiclo() {
        return this.secCxlcCiclo;
    }

    /**
     * Set idActInsti value.
     *
     * @param idActInsti java.lang.String
     */
    public void setIdActInsti(java.lang.String idActInsti) {
        this.idActInsti = idActInsti;
    }

    /**
     * Get idActInsti value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdActInsti() {
        return this.idActInsti;
    }

    /**
     * Set idActInstiEsp value.
     *
     * @param idActInstiEsp java.lang.String
     */
    public void setIdActInstiEsp(java.lang.String idActInstiEsp) {
        this.idActInstiEsp = idActInstiEsp;
    }

    /**
     * Get idActInstiEsp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdActInstiEsp() {
        return this.idActInstiEsp;
    }

    /**
     * Set idActPriorita value.
     *
     * @param idActPriorita java.lang.String
     */
    public void setIdActPriorita(java.lang.String idActPriorita) {
        this.idActPriorita = idActPriorita;
    }

    /**
     * Get idActPriorita value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdActPriorita() {
        return this.idActPriorita;
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
     * Set idFuncion value.
     *
     * @param idFuncion java.lang.String
     */
    public void setIdFuncion(java.lang.String idFuncion) {
        this.idFuncion = idFuncion;
    }

    /**
     * Get idFuncion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdFuncion() {
        return this.idFuncion;
    }

    /**
     * Set idPrograma value.
     *
     * @param idPrograma java.lang.String
     */
    public void setIdPrograma(java.lang.String idPrograma) {
        this.idPrograma = idPrograma;
    }

    /**
     * Get idPrograma value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPrograma() {
        return this.idPrograma;
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

    /**
     * Set idUnidadEjecuto value.
     *
     * @param idUnidadEjecuto java.lang.String
     */
    public void setIdUnidadEjecuto(java.lang.String idUnidadEjecuto) {
        this.idUnidadEjecuto = idUnidadEjecuto;
    }

    /**
     * Get idUnidadEjecuto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadEjecuto() {
        return this.idUnidadEjecuto;
    }

    /**
     * Set secGuiaContableEjer value.
     *
     * @param secGuiaContableEjer java.lang.Integer
     */
    public void setSecGuiaContableEjer(java.lang.Integer secGuiaContableEjer) {
        this.secGuiaContableEjer = secGuiaContableEjer;
    }

    /**
     * Get secGuiaContableEjer value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecGuiaContableEjer() {
        return this.secGuiaContableEjer;
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
     * Set idFuenteFinan value.
     *
     * @param idFuenteFinan java.lang.Integer
     */
    public void setIdFuenteFinan(java.lang.Integer idFuenteFinan) {
        this.idFuenteFinan = idFuenteFinan;
    }

    /**
     * Get idFuenteFinan value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdFuenteFinan() {
        return this.idFuenteFinan;
    }

    /**
     * Set idGrupopago value.
     *
     * @param idGrupopago java.lang.String
     */
    public void setIdGrupopago(java.lang.String idGrupopago) {
        this.idGrupopago = idGrupopago;
    }

    /**
     * Get idGrupopago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupopago() {
        return this.idGrupopago;
    }

    /**
     * Set idPartida value.
     *
     * @param idPartida java.lang.String
     */
    public void setIdPartida(java.lang.String idPartida) {
        this.idPartida = idPartida;
    }

    /**
     * Get idPartida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPartida() {
        return this.idPartida;
    }

    /**
     * Set idSindicato value.
     *
     * @param idSindicato java.lang.Integer
     */
    public void setIdSindicato(java.lang.Integer idSindicato) {
        this.idSindicato = idSindicato;
    }

    /**
     * Get idSindicato value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdSindicato() {
        return this.idSindicato;
    }

    /**
     * Set idTipoGasto value.
     *
     * @param idTipoGasto java.lang.Integer
     */
    public void setIdTipoGasto(java.lang.Integer idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }

    /**
     * Get idTipoGasto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdTipoGasto() {
        return this.idTipoGasto;
    }

    /**
     * Set secClaveMov value.
     *
     * @param secClaveMov java.lang.String
     */
    public void setSecClaveMov(java.lang.String secClaveMov) {
        this.secClaveMov = secClaveMov;
    }

    /**
     * Get secClaveMov value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSecClaveMov() {
        return this.secClaveMov;
    }

    /**
     * Set secCompromiso value.
     *
     * @param secCompromiso java.lang.String
     */
    public void setSecCompromiso(java.lang.String secCompromiso) {
        this.secCompromiso = secCompromiso;
    }

    /**
     * Get secCompromiso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSecCompromiso() {
        return this.secCompromiso;
    }

    /**
     * Set secCptoMovto value.
     *
     * @param secCptoMovto java.lang.String
     */
    public void setSecCptoMovto(java.lang.String secCptoMovto) {
        this.secCptoMovto = secCptoMovto;
    }

    /**
     * Get secCptoMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSecCptoMovto() {
        return this.secCptoMovto;
    }

    /**
     * Set secCtaClabe value.
     *
     * @param secCtaClabe java.lang.String
     */
    public void setSecCtaClabe(java.lang.String secCtaClabe) {
        this.secCtaClabe = secCtaClabe;
    }

    /**
     * Get secCtaClabe value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSecCtaClabe() {
        return this.secCtaClabe;
    }

    /**
     * Set secCxlcSiaff value.
     *
     * @param secCxlcSiaff java.lang.Long
     */
    public void setSecCxlcSiaff(java.lang.Long secCxlcSiaff) {
        this.secCxlcSiaff = secCxlcSiaff;
    }

    /**
     * Get secCxlcSiaff value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getSecCxlcSiaff() {
        return this.secCxlcSiaff;
    }

    /**
     * Set secCxlcTerceros value.
     *
     * @param secCxlcTerceros java.lang.Integer
     */
    public void setSecCxlcTerceros(java.lang.Integer secCxlcTerceros) {
        this.secCxlcTerceros = secCxlcTerceros;
    }

    /**
     * Get secCxlcTerceros value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecCxlcTerceros() {
        return this.secCxlcTerceros;
    }

    /**
     * Set secDevengado value.
     *
     * @param secDevengado java.lang.Long
     */
    public void setSecDevengado(java.lang.Long secDevengado) {
        this.secDevengado = secDevengado;
    }

    /**
     * Get secDevengado value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getSecDevengado() {
        return this.secDevengado;
    }

    /**
     * Set secFecExtraSicop value.
     *
     * @param secFecExtraSicop java.util.Date
     */
    public void setSecFecExtraSicop(java.util.Date secFecExtraSicop) {
        this.secFecExtraSicop = secFecExtraSicop;
    }

    /**
     * Get secFecExtraSicop value.
     *
     * @return java.util.Date
     */
    public java.util.Date getSecFecExtraSicop() {
        return this.secFecExtraSicop;
    }

    /**
     * Set secMonto value.
     *
     * @param secMonto java.lang.Double
     */
    public void setSecMonto(java.lang.Double secMonto) {
        this.secMonto = secMonto;
    }

    /**
     * Get secMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getSecMonto() {
        return this.secMonto;
    }

    /**
     * Set secQnaApli value.
     *
     * @param secQnaApli java.lang.Integer
     */
    public void setSecQnaApli(java.lang.Integer secQnaApli) {
        this.secQnaApli = secQnaApli;
    }

    /**
     * Get secQnaApli value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecQnaApli() {
        return this.secQnaApli;
    }

    /**
     * Set secSiaff value.
     *
     * @param secSiaff java.lang.Integer
     */
    public void setSecSiaff(java.lang.Integer secSiaff) {
        this.secSiaff = secSiaff;
    }

    /**
     * Get secSiaff value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecSiaff() {
        return this.secSiaff;
    }

    /**
     * Set secTerceros value.
     *
     * @param secTerceros java.lang.Integer
     */
    public void setSecTerceros(java.lang.Integer secTerceros) {
        this.secTerceros = secTerceros;
    }

    /**
     * Get secTerceros value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getSecTerceros() {
        return this.secTerceros;
    }

    /**
     * Set secTipoCpto value.
     *
     * @param secTipoCpto java.lang.String
     */
    public void setSecTipoCpto(java.lang.String secTipoCpto) {
        this.secTipoCpto = secTipoCpto;
    }

    /**
     * Get secTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSecTipoCpto() {
        return this.secTipoCpto;
    }
}
