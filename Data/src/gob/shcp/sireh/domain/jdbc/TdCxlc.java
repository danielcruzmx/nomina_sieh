package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdCxlc data.
 */
public class TdCxlc implements Domain, Serializable {

    @PrimaryKey
    private TdCxlcPK idComposite;
    private java.lang.String idTipoNomina;
    private int cxlcComplemento;
    private double cxlcMonto;
    private int cxlcQnaPago;
    private int cxlcSiaff;
    private java.lang.String cxlcSituacion;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Long cxlcCompromiso;
    private java.lang.Integer cxlcConciliaSicop;
    private java.lang.Long cxlcDevengado;
    private java.lang.Double cxlcIva;
    private java.lang.Integer cxlcMaestroPto;
    private java.lang.String cxlcNota;
    private java.lang.Integer cxlcRectifica;
    private java.lang.String cxlcTipoProceso;
    private java.lang.String cxlcParametros;
    private java.lang.Integer cxlcOrigen;
    private java.lang.String nominaOrigen;

    /**
     * Constructor for TdCxlc class.
     */
    public TdCxlc() {
    }

    /**
     * Constructor for TdCxlc class.
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
     * @param cxlcParametros java.lang.String
     */
    public TdCxlc(TdCxlcPK idComposite, java.lang.String idTipoNomina, 
                  int cxlcComplemento, double cxlcMonto, int cxlcQnaPago, 
                  int cxlcSiaff, java.lang.String cxlcSituacion, 
                  java.util.Date fecModifico, java.lang.String usuario, 
                  java.lang.Long cxlcCompromiso, 
                  java.lang.Integer cxlcConciliaSicop, 
                  java.lang.Long cxlcDevengado, java.lang.Double cxlcIva, 
                  java.lang.Integer cxlcMaestroPto, java.lang.String cxlcNota, 
                  java.lang.Integer cxlcRectifica, 
                  java.lang.String cxlcTipoProceso, 
                  java.lang.String cxlcParametros, 
                  java.lang.Integer cxlcOrigen, 
                  java.lang.String nominaOrigen) {
        this.idComposite = idComposite;
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
     * Get cxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlc();
    }

    /**
     * Get cxlcCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlcCiclo();
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
     * Get cxlcComplemento value.
     *
     * @return int
     */
    public int getCxlcComplemento() {
        return this.cxlcComplemento;
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
     * Get cxlcQnaPago value.
     *
     * @return int
     */
    public int getCxlcQnaPago() {
        return this.cxlcQnaPago;
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
     * Get cxlcSituacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlcSituacion() {
        return this.cxlcSituacion;
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
     * Get cxlcCompromiso value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlcCompromiso() {
        return this.cxlcCompromiso;
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
     * Get cxlcDevengado value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlcDevengado() {
        return this.cxlcDevengado;
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
     * Get cxlcMaestroPto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcMaestroPto() {
        return this.cxlcMaestroPto;
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
     * Get cxlcRectifica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlcRectifica() {
        return this.cxlcRectifica;
    }

    /**
     * Get cxlcTipoProceso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlcTipoProceso() {
        return this.cxlcTipoProceso;
    }

    /**
     * Set cxlc value.
     *
     * @param cxlc java.lang.Integer
     */
    public void setCxlc(java.lang.Integer cxlc) {
        if (idComposite == null) {
            idComposite = new TdCxlcPK();
        }
        this.idComposite.setCxlc(cxlc);
    }

    /**
     * Set cxlcCiclo value.
     *
     * @param cxlcCiclo java.lang.Integer
     */
    public void setCxlcCiclo(java.lang.Integer cxlcCiclo) {
        if (idComposite == null) {
            idComposite = new TdCxlcPK();
        }
        this.idComposite.setCxlcCiclo(cxlcCiclo);
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
     * Set cxlcComplemento value.
     *
     * @param cxlcComplemento int
     */
    public void setCxlcComplemento(int cxlcComplemento) {
        this.cxlcComplemento = cxlcComplemento;
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
     * Set cxlcQnaPago value.
     *
     * @param cxlcQnaPago int
     */
    public void setCxlcQnaPago(int cxlcQnaPago) {
        this.cxlcQnaPago = cxlcQnaPago;
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
     * Set cxlcSituacion value.
     *
     * @param cxlcSituacion java.lang.String
     */
    public void setCxlcSituacion(java.lang.String cxlcSituacion) {
        this.cxlcSituacion = cxlcSituacion;
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
     * Set cxlcCompromiso value.
     *
     * @param cxlcCompromiso java.lang.Long
     */
    public void setCxlcCompromiso(java.lang.Long cxlcCompromiso) {
        this.cxlcCompromiso = cxlcCompromiso;
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
     * Set cxlcDevengado value.
     *
     * @param cxlcDevengado java.lang.Long
     */
    public void setCxlcDevengado(java.lang.Long cxlcDevengado) {
        this.cxlcDevengado = cxlcDevengado;
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
     * Set cxlcMaestroPto value.
     *
     * @param cxlcMaestroPto java.lang.Integer
     */
    public void setCxlcMaestroPto(java.lang.Integer cxlcMaestroPto) {
        this.cxlcMaestroPto = cxlcMaestroPto;
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
     * Set cxlcRectifica value.
     *
     * @param cxlcRectifica java.lang.Integer
     */
    public void setCxlcRectifica(java.lang.Integer cxlcRectifica) {
        this.cxlcRectifica = cxlcRectifica;
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
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdCxlcPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }

    public void setCxlcParametros(String cxlcParametros) {
        this.cxlcParametros = cxlcParametros;
    }

    public String getCxlcParametros() {
        return cxlcParametros;
    }

    /*public Integer getSecCxlcTerceros() {
        return secCxlcTerceros;
    }

    public void setSecCxlcTerceros(Integer secCxlcTerceros) {
        this.secCxlcTerceros = secCxlcTerceros;
    }

    public double getSecMonto() {
        return secMonto;
    }

    public void setSecMonto(double secMonto) {
        this.secMonto = secMonto;
    }*/

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
