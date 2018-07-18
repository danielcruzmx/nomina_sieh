package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcIspt data.
 */
public class TcIspt implements Domain, Serializable {
    private TcIsptPK idComposite;
    private double isptCreditoSalario;
    private double isptCuotaFija;
    private double isptExcedente;
    private java.util.Date isptIni;
    private double isptLimInf1;
    private double isptLimInf2;
    private double isptLimSuperior;
    private float isptPorcentaje;
    private double isptSubsidio;
    private double isptSueldoAnual;
    private double isptSueldoBruto1;
    private double isptSueldoBruto2;
    private java.lang.String usuario;
    private java.lang.String idZonaGeo;
    private java.util.Date fecModifico;

    /**
     * Constructor for TcIspt class.
     */
    public TcIspt() {
    }

    /**
     * Constructor for TcIspt class.
     *
     * @param idTipoTabla java.lang.String
     * @param isptConsec java.lang.Integer
     * @param isptFin java.util.Date
     * @param fecModifico java.util.Date
     * @param isptCreditoSalario double
     * @param isptCuotaFija double
     * @param isptExcedente double
     * @param isptIni java.util.Date
     * @param isptLimInf1 double
     * @param isptLimInf2 double
     * @param isptLimSuperior double
     * @param isptPorcentaje float
     * @param isptSubsidio double
     * @param isptSueldoAnual double
     * @param isptSueldoBruto1 double
     * @param isptSueldoBruto2 double
     * @param usuario java.lang.String
     * @param idZonaGeo java.lang.String
     */
    public TcIspt(TcIsptPK idComposite, java.util.Date fecModifico, 
                  double isptCreditoSalario, double isptCuotaFija, 
                  double isptExcedente, java.util.Date isptIni, 
                  double isptLimInf1, double isptLimInf2, 
                  double isptLimSuperior, float isptPorcentaje, 
                  double isptSubsidio, double isptSueldoAnual, 
                  double isptSueldoBruto1, double isptSueldoBruto2, 
                  java.lang.String usuario, java.lang.String idZonaGeo) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.isptCreditoSalario = isptCreditoSalario;
        this.isptCuotaFija = isptCuotaFija;
        this.isptExcedente = isptExcedente;
        this.isptIni = isptIni;
        this.isptLimInf1 = isptLimInf1;
        this.isptLimInf2 = isptLimInf2;
        this.isptLimSuperior = isptLimSuperior;
        this.isptPorcentaje = isptPorcentaje;
        this.isptSubsidio = isptSubsidio;
        this.isptSueldoAnual = isptSueldoAnual;
        this.isptSueldoBruto1 = isptSueldoBruto1;
        this.isptSueldoBruto2 = isptSueldoBruto2;
        this.usuario = usuario;
        this.idZonaGeo = idZonaGeo;
    }

    /**
     * Get idTipoTabla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoTabla() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdTipoTabla();
    }

    /**
     * Get isptConsec value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIsptConsec() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIsptConsec();
    }

    /**
     * Get isptFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getIsptFin() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIsptFin();
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
     * Get isptCreditoSalario value.
     *
     * @return double
     */
    public double getIsptCreditoSalario() {
        return this.isptCreditoSalario;
    }

    /**
     * Get isptCuotaFija value.
     *
     * @return double
     */
    public double getIsptCuotaFija() {
        return this.isptCuotaFija;
    }

    /**
     * Get isptExcedente value.
     *
     * @return double
     */
    public double getIsptExcedente() {
        return this.isptExcedente;
    }

    /**
     * Get isptIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getIsptIni() {
        return this.isptIni;
    }

    /**
     * Get isptLimInf1 value.
     *
     * @return double
     */
    public double getIsptLimInf1() {
        return this.isptLimInf1;
    }

    /**
     * Get isptLimInf2 value.
     *
     * @return double
     */
    public double getIsptLimInf2() {
        return this.isptLimInf2;
    }

    /**
     * Get isptLimSuperior value.
     *
     * @return double
     */
    public double getIsptLimSuperior() {
        return this.isptLimSuperior;
    }

    /**
     * Get isptPorcentaje value.
     *
     * @return float
     */
    public float getIsptPorcentaje() {
        return this.isptPorcentaje;
    }

    /**
     * Get isptSubsidio value.
     *
     * @return double
     */
    public double getIsptSubsidio() {
        return this.isptSubsidio;
    }

    /**
     * Get isptSueldoAnual value.
     *
     * @return double
     */
    public double getIsptSueldoAnual() {
        return this.isptSueldoAnual;
    }

    /**
     * Get isptSueldoBruto1 value.
     *
     * @return double
     */
    public double getIsptSueldoBruto1() {
        return this.isptSueldoBruto1;
    }

    /**
     * Get isptSueldoBruto2 value.
     *
     * @return double
     */
    public double getIsptSueldoBruto2() {
        return this.isptSueldoBruto2;
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
     * Get idZonaGeo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdZonaGeo() {
        return this.idZonaGeo;
    }

    /**
     * Set idTipoTabla value.
     *
     * @param idTipoTabla java.lang.String
     */
    public void setIdTipoTabla(java.lang.String idTipoTabla) {
        if (idComposite == null) {
            idComposite = new TcIsptPK();
        }
        this.idComposite.setIdTipoTabla(idTipoTabla);
    }

    /**
     * Set isptConsec value.
     *
     * @param isptConsec java.lang.Integer
     */
    public void setIsptConsec(java.lang.Integer isptConsec) {
        if (idComposite == null) {
            idComposite = new TcIsptPK();
        }
        this.idComposite.setIsptConsec(isptConsec);
    }

    /**
     * Set isptFin value.
     *
     * @param isptFin java.util.Date
     */
    public void setIsptFin(java.util.Date isptFin) {
        if (idComposite == null) {
            idComposite = new TcIsptPK();
        }
        this.idComposite.setIsptFin(isptFin);
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
     * Set isptCreditoSalario value.
     *
     * @param isptCreditoSalario double
     */
    public void setIsptCreditoSalario(double isptCreditoSalario) {
        this.isptCreditoSalario = isptCreditoSalario;
    }

    /**
     * Set isptCuotaFija value.
     *
     * @param isptCuotaFija double
     */
    public void setIsptCuotaFija(double isptCuotaFija) {
        this.isptCuotaFija = isptCuotaFija;
    }

    /**
     * Set isptExcedente value.
     *
     * @param isptExcedente double
     */
    public void setIsptExcedente(double isptExcedente) {
        this.isptExcedente = isptExcedente;
    }

    /**
     * Set isptIni value.
     *
     * @param isptIni java.util.Date
     */
    public void setIsptIni(java.util.Date isptIni) {
        this.isptIni = isptIni;
    }

    /**
     * Set isptLimInf1 value.
     *
     * @param isptLimInf1 double
     */
    public void setIsptLimInf1(double isptLimInf1) {
        this.isptLimInf1 = isptLimInf1;
    }

    /**
     * Set isptLimInf2 value.
     *
     * @param isptLimInf2 double
     */
    public void setIsptLimInf2(double isptLimInf2) {
        this.isptLimInf2 = isptLimInf2;
    }

    /**
     * Set isptLimSuperior value.
     *
     * @param isptLimSuperior double
     */
    public void setIsptLimSuperior(double isptLimSuperior) {
        this.isptLimSuperior = isptLimSuperior;
    }

    /**
     * Set isptPorcentaje value.
     *
     * @param isptPorcentaje float
     */
    public void setIsptPorcentaje(float isptPorcentaje) {
        this.isptPorcentaje = isptPorcentaje;
    }

    /**
     * Set isptSubsidio value.
     *
     * @param isptSubsidio double
     */
    public void setIsptSubsidio(double isptSubsidio) {
        this.isptSubsidio = isptSubsidio;
    }

    /**
     * Set isptSueldoAnual value.
     *
     * @param isptSueldoAnual double
     */
    public void setIsptSueldoAnual(double isptSueldoAnual) {
        this.isptSueldoAnual = isptSueldoAnual;
    }

    /**
     * Set isptSueldoBruto1 value.
     *
     * @param isptSueldoBruto1 double
     */
    public void setIsptSueldoBruto1(double isptSueldoBruto1) {
        this.isptSueldoBruto1 = isptSueldoBruto1;
    }

    /**
     * Set isptSueldoBruto2 value.
     *
     * @param isptSueldoBruto2 double
     */
    public void setIsptSueldoBruto2(double isptSueldoBruto2) {
        this.isptSueldoBruto2 = isptSueldoBruto2;
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
     * Set idZonaGeo value.
     *
     * @param idZonaGeo java.lang.String
     */
    public void setIdZonaGeo(java.lang.String idZonaGeo) {
        this.idZonaGeo = idZonaGeo;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcIsptPK)idComposite;
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
