package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdCxlc data.
 */
public class TdCxlcDTO implements java.io.Serializable, Model {

    private java.lang.Integer cxlc;
    private java.lang.Integer cxlcCiclo;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(8)
    private java.lang.String idTipoNomina;
    @NotNull
    private int cxlcComplemento;
    @NotNull
    private double cxlcMonto;
    @NotNull
    private int cxlcQnaPago;
    @NotNull
    private int cxlcSiaff;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(4)
    private java.lang.String cxlcSituacion;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.lang.Long cxlcCompromiso;
    private java.lang.Integer cxlcConciliaSicop;
    private java.lang.Long cxlcDevengado;
    private java.lang.Double cxlcIva;
    private java.lang.Integer cxlcMaestroPto;
    @MaxLength(2000)
    private java.lang.String cxlcNota;
    private java.lang.Integer cxlcRectifica;
    @MaxLength(80)
    private java.lang.String cxlcTipoProceso;
    private java.lang.String cxlcParametros;
    private java.lang.Integer cxlcOrigen;
    private java.lang.String nominaOrigen;

    /**
     * Constructor for TdCxlcDTO class.
     */
    public TdCxlcDTO() {
    }

    /**
     * Constructor for TdCxlcDTO class.
     *
     * @param cxlc java.lang.Integer
     * @param cxlcCiclo java.lang.Integer
     * @param idTipoNomina java.lang.String
     * @param cxlcComplemento int
     * @param cxlcMonto double
     * @param cxlcQnaPago int
     * @param cxlcSiaff int
     * @param cxlcSituacion java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cxlcCompromiso java.lang.Long
     * @param cxlcConciliaSicop java.lang.Integer
     * @param cxlcDevengado java.lang.Long
     * @param cxlcIva java.lang.Double
     * @param cxlcMaestroPto java.lang.Integer
     * @param cxlcNota java.lang.String
     * @param cxlcRectifica java.lang.Integer
     * @param cxlcTipoProceso java.lang.String
     */
    public TdCxlcDTO(java.lang.Integer cxlc, java.lang.Integer cxlcCiclo, java.lang.String idTipoNomina, 
                     int cxlcComplemento, double cxlcMonto, int cxlcQnaPago, int cxlcSiaff, 
                     java.lang.String cxlcSituacion, java.util.Date fecModifico, java.lang.String usuario, 
                     java.lang.Long cxlcCompromiso, java.lang.Integer cxlcConciliaSicop, java.lang.Long cxlcDevengado, 
                     java.lang.Double cxlcIva, java.lang.Integer cxlcMaestroPto, java.lang.String cxlcNota, 
                     java.lang.Integer cxlcRectifica, java.lang.String cxlcTipoProceso, String cxlcParametros, 
                     java.lang.Integer cxlcOrigen, java.lang.String nominaOrigen) {
        this.cxlc = cxlc;
        this.cxlcCiclo = cxlcCiclo;
        this.idTipoNomina = idTipoNomina;
        this.cxlcComplemento = cxlcComplemento;
        this.cxlcMonto = cxlcMonto;
        this.cxlcQnaPago = cxlcQnaPago;
        this.cxlcSiaff = cxlcSiaff;
        this.cxlcSituacion = cxlcSituacion;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cxlcCompromiso = cxlcCompromiso;
        this.cxlcConciliaSicop = cxlcConciliaSicop;
        this.cxlcDevengado = cxlcDevengado;
        this.cxlcIva = cxlcIva;
        this.cxlcMaestroPto = cxlcMaestroPto;
        this.cxlcNota = cxlcNota;
        this.cxlcRectifica = cxlcRectifica;
        this.cxlcTipoProceso = cxlcTipoProceso;
        this.cxlcParametros = cxlcParametros;
        this.cxlcOrigen = cxlcOrigen;
        this.nominaOrigen = nominaOrigen;
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
     * Set cxlcCiclo value.
     *
     * @param cxlcCiclo java.lang.Integer
     */
    public void setCxlcCiclo(java.lang.Integer cxlcCiclo) {
        this.cxlcCiclo = cxlcCiclo;
    }

    /**
     * Get cxlcCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcCiclo() {
        return this.cxlcCiclo;
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
     * Set cxlcComplemento value.
     *
     * @param cxlcComplemento int
     */
    public void setCxlcComplemento(int cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
    }

    /**
     * Get cxlcComplemento value.
     *
     * @return int
     */
    public int getCxlcComplemento() {
        return this.cxlcComplemento;
    }

    /**
     * Set cxlcMonto value.
     *
     * @param cxlcMonto double
     */
    public void setCxlcMonto(double cxlcMonto) {
        this.cxlcMonto = cxlcMonto;
    }

    /**
     * Get cxlcMonto value.
     *
     * @return double
     */
    public double getCxlcMonto() {
        return this.cxlcMonto;
    }

    /**
     * Set cxlcQnaPago value.
     *
     * @param cxlcQnaPago int
     */
    public void setCxlcQnaPago(int cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
    }

    /**
     * Get cxlcQnaPago value.
     *
     * @return int
     */
    public int getCxlcQnaPago() {
        return this.cxlcQnaPago;
    }

    /**
     * Set cxlcSiaff value.
     *
     * @param cxlcSiaff int
     */
    public void setCxlcSiaff(int cxlcSiaff) {
        this.cxlcSiaff = cxlcSiaff;
    }

    /**
     * Get cxlcSiaff value.
     *
     * @return int
     */
    public int getCxlcSiaff() {
        return this.cxlcSiaff;
    }

    /**
     * Set cxlcSituacion value.
     *
     * @param cxlcSituacion java.lang.String
     */
    public void setCxlcSituacion(java.lang.String cxlcSituacion) {
        this.cxlcSituacion = cxlcSituacion;
    }

    /**
     * Get cxlcSituacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlcSituacion() {
        return this.cxlcSituacion;
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
     * Set cxlcCompromiso value.
     *
     * @param cxlcCompromiso java.lang.Long
     */
    public void setCxlcCompromiso(java.lang.Long cxlcCompromiso) {
        this.cxlcCompromiso = cxlcCompromiso;
    }

    /**
     * Get cxlcCompromiso value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlcCompromiso() {
        return this.cxlcCompromiso;
    }

    /**
     * Set cxlcConciliaSicop value.
     *
     * @param cxlcConciliaSicop java.lang.Integer
     */
    public void setCxlcConciliaSicop(java.lang.Integer cxlcConciliaSicop) {
        this.cxlcConciliaSicop = cxlcConciliaSicop;
    }

    /**
     * Get cxlcConciliaSicop value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcConciliaSicop() {
        return this.cxlcConciliaSicop;
    }

    /**
     * Set cxlcDevengado value.
     *
     * @param cxlcDevengado java.lang.Long
     */
    public void setCxlcDevengado(java.lang.Long cxlcDevengado) {
        this.cxlcDevengado = cxlcDevengado;
    }

    /**
     * Get cxlcDevengado value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlcDevengado() {
        return this.cxlcDevengado;
    }

    /**
     * Set cxlcIva value.
     *
     * @param cxlcIva java.lang.Double
     */
    public void setCxlcIva(java.lang.Double cxlcIva) {
        this.cxlcIva = cxlcIva;
    }

    /**
     * Get cxlcIva value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCxlcIva() {
        return this.cxlcIva;
    }

    /**
     * Set cxlcMaestroPto value.
     *
     * @param cxlcMaestroPto java.lang.Integer
     */
    public void setCxlcMaestroPto(java.lang.Integer cxlcMaestroPto) {
        this.cxlcMaestroPto = cxlcMaestroPto;
    }

    /**
     * Get cxlcMaestroPto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcMaestroPto() {
        return this.cxlcMaestroPto;
    }

    /**
     * Set cxlcNota value.
     *
     * @param cxlcNota java.lang.String
     */
    public void setCxlcNota(java.lang.String cxlcNota) {
        this.cxlcNota = cxlcNota;
    }

    /**
     * Get cxlcNota value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlcNota() {
        return this.cxlcNota;
    }

    /**
     * Set cxlcRectifica value.
     *
     * @param cxlcRectifica java.lang.Integer
     */
    public void setCxlcRectifica(java.lang.Integer cxlcRectifica) {
        this.cxlcRectifica = cxlcRectifica;
    }

    /**
     * Get cxlcRectifica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcRectifica() {
        return this.cxlcRectifica;
    }

    /**
     * Set cxlcTipoProceso value.
     *
     * @param cxlcTipoProceso java.lang.String
     */
    public void setCxlcTipoProceso(java.lang.String cxlcTipoProceso) {
        this.cxlcTipoProceso = cxlcTipoProceso;
    }

    /**
     * Get cxlcTipoProceso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlcTipoProceso() {
        return this.cxlcTipoProceso;
    }

    public void setCxlcParametros(String cxlcParametros) {
        this.cxlcParametros = cxlcParametros;
    }

    public String getCxlcParametros() {
        return cxlcParametros;
    }

    public int get_cxlcQnaPago() {
        return cxlcQnaPago;
    }
    public Integer getCxlcOrigen() {
        return cxlcOrigen;
    }

    public void setCxlcOrigen(Integer cxlcOrigen) {
        this.cxlcOrigen = cxlcOrigen;
    }

    public String getNominaOrigen() {
        return nominaOrigen;
    }

    public void setNominaOrigen(String nominaOrigen) {
        this.nominaOrigen = nominaOrigen;
    }
}
