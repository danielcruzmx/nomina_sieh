package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcIspt data.
 */
public class TcIsptDTO  implements java.io.Serializable, Model {    

    private java.lang.Long isptConsec;
    @NotBlank(errorCode="not.null")
    @MaxLength(4)    
    private java.lang.String idTipoTabla;
    private java.util.Date isptFin;
    @NotNull
    private double isptCreditoSalario;
    @NotNull
    private double isptCuotaFija;
    @NotNull
    private double isptExcedente;
    @NotNull
    private java.util.Date isptIni;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private double isptLimInf1;
    @NotNull
    private double isptLimInf2;
    @NotNull
    private double isptLimSuperior;
    @NotNull
    private float isptPorcentaje;
    @NotNull
    private double isptSubsidio;
    @NotNull
    private double isptSueldoAnual;
    @NotNull
    private double isptSueldoBruto1;
    @NotNull
    private double isptSueldoBruto2;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String usuario;
    @MaxLength(2)    
    private java.lang.String idZonaGeo;

    /**
     * Constructor for TcIsptDTO class.
     */
    public TcIsptDTO() { }    

                                                                            
    /**
     * Constructor for TcIsptDTO class.
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
    public TcIsptDTO( java.lang.String idTipoTabla, java.lang.Long isptConsec, java.util.Date isptFin, java.util.Date fecModifico, double isptCreditoSalario, double isptCuotaFija, double isptExcedente, java.util.Date isptIni, double isptLimInf1, double isptLimInf2, double isptLimSuperior, float isptPorcentaje, double isptSubsidio, double isptSueldoAnual, double isptSueldoBruto1, double isptSueldoBruto2, java.lang.String usuario, java.lang.String idZonaGeo){    
        this.idTipoTabla = idTipoTabla;
        this.isptConsec = isptConsec;
        this.isptFin = isptFin;
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


    public void setIsptConsec(Long isptConsec) {
        this.isptConsec = isptConsec;
    }

    public Long getIsptConsec() {
        return isptConsec;
    }

    public void setIdTipoTabla(String idTipoTabla) {
        this.idTipoTabla = idTipoTabla;
    }

    public String getIdTipoTabla() {
        return idTipoTabla;
    }

    public void setIsptFin(Date isptFin) {
        this.isptFin = isptFin;
    }

    public Date getIsptFin() {
        return isptFin;
    }

    public void setIsptCreditoSalario(double isptCreditoSalario) {
        this.isptCreditoSalario = isptCreditoSalario;
    }

    public double getIsptCreditoSalario() {
        return isptCreditoSalario;
    }

    public void setIsptCuotaFija(double isptCuotaFija) {
        this.isptCuotaFija = isptCuotaFija;
    }

    public double getIsptCuotaFija() {
        return isptCuotaFija;
    }

    public void setIsptExcedente(double isptExcedente) {
        this.isptExcedente = isptExcedente;
    }

    public double getIsptExcedente() {
        return isptExcedente;
    }

    public void setIsptIni(Date isptIni) {
        this.isptIni = isptIni;
    }

    public Date getIsptIni() {
        return isptIni;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setIsptLimInf1(double isptLimInf1) {
        this.isptLimInf1 = isptLimInf1;
    }

    public double getIsptLimInf1() {
        return isptLimInf1;
    }

    public void setIsptLimInf2(double isptLimInf2) {
        this.isptLimInf2 = isptLimInf2;
    }

    public double getIsptLimInf2() {
        return isptLimInf2;
    }

    public void setIsptLimSuperior(double isptLimSuperior) {
        this.isptLimSuperior = isptLimSuperior;
    }

    public double getIsptLimSuperior() {
        return isptLimSuperior;
    }

    public void setIsptPorcentaje(float isptPorcentaje) {
        this.isptPorcentaje = isptPorcentaje;
    }

    public float getIsptPorcentaje() {
        return isptPorcentaje;
    }

    public void setIsptSubsidio(double isptSubsidio) {
        this.isptSubsidio = isptSubsidio;
    }

    public double getIsptSubsidio() {
        return isptSubsidio;
    }

    public void setIsptSueldoAnual(double isptSueldoAnual) {
        this.isptSueldoAnual = isptSueldoAnual;
    }

    public double getIsptSueldoAnual() {
        return isptSueldoAnual;
    }

    public void setIsptSueldoBruto1(double isptSueldoBruto1) {
        this.isptSueldoBruto1 = isptSueldoBruto1;
    }

    public double getIsptSueldoBruto1() {
        return isptSueldoBruto1;
    }

    public void setIsptSueldoBruto2(double isptSueldoBruto2) {
        this.isptSueldoBruto2 = isptSueldoBruto2;
    }

    public double getIsptSueldoBruto2() {
        return isptSueldoBruto2;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setIdZonaGeo(String idZonaGeo) {
        this.idZonaGeo = idZonaGeo;
    }

    public String getIdZonaGeo() {
        return idZonaGeo;
    }
}
