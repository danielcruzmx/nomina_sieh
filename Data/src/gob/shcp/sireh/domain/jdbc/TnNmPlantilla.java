package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnNmPlantilla data.
 */
public class TnNmPlantilla implements Domain, Serializable {
    private java.lang.String tnNmpId;
    private java.lang.String tnNmpCurso;
    private java.lang.String tnNmpDenominacion;
    private java.lang.Integer tnNmpDuracion;
    private java.lang.String tnNmpEstatus;
    private java.util.Date tnNmpFechaCarga;
    private java.lang.String tnNmpGenero;
    private java.util.Date tnNmpInicio;
    private java.lang.String tnNmpMes;
    private java.lang.String tnNmpNivel;
    private java.lang.String tnNmpNombre;
    private java.lang.Integer tnNmpPlaza;
    private java.lang.String tnNmpPuesto;
    private java.lang.String tnNmpRfc;
    private java.util.Date tnNmpTermino;
    private java.lang.String tnNmpTipoCarga;
    private java.lang.String tnNmpTipoPuesto;
    private java.lang.String tnNmpUnidad;
    private java.lang.String tnNmpOp;

    /**
     * Constructor for TnNmPlantilla class.
     */
    public TnNmPlantilla() {
    }

    /**
     * Constructor for TnNmPlantilla class.
     *
     * @param tnNmpId java.lang.String
     * @param tnNmpCurso java.lang.String
     * @param tnNmpDenominacion java.lang.String
     * @param tnNmpDuracion java.lang.Integer
     * @param tnNmpEstatus java.lang.String
     * @param tnNmpFechaCarga java.util.Date
     * @param tnNmpGenero java.lang.String
     * @param tnNmpInicio java.util.Date
     * @param tnNmpMes java.lang.String
     * @param tnNmpNivel java.lang.String
     * @param tnNmpNombre java.lang.String
     * @param tnNmpPlaza java.lang.Integer
     * @param tnNmpPuesto java.lang.String
     * @param tnNmpRfc java.lang.String
     * @param tnNmpTermino java.util.Date
     * @param tnNmpTipoCarga java.lang.String
     * @param tnNmpTipoPuesto java.lang.String
     * @param tnNmpUnidad java.lang.String
     */
    public TnNmPlantilla(java.lang.String tnNmpId, java.lang.String tnNmpCurso, 
                         java.lang.String tnNmpDenominacion, 
                         java.lang.Integer tnNmpDuracion, 
                         java.lang.String tnNmpEstatus, 
                         java.util.Date tnNmpFechaCarga, 
                         java.lang.String tnNmpGenero, 
                         java.util.Date tnNmpInicio, java.lang.String tnNmpMes, 
                         java.lang.String tnNmpNivel, 
                         java.lang.String tnNmpNombre, 
                         java.lang.Integer tnNmpPlaza, 
                         java.lang.String tnNmpPuesto, 
                         java.lang.String tnNmpRfc, 
                         java.util.Date tnNmpTermino, 
                         java.lang.String tnNmpTipoCarga, 
                         java.lang.String tnNmpTipoPuesto, 
                         java.lang.String tnNmpUnidad, 
                         java.lang.String tnNmpOp) {
        this.tnNmpId = tnNmpId;
        this.tnNmpCurso = tnNmpCurso;
        this.tnNmpDenominacion = tnNmpDenominacion;
        this.tnNmpDuracion = tnNmpDuracion;
        this.tnNmpEstatus = tnNmpEstatus;
        this.tnNmpFechaCarga = tnNmpFechaCarga;
        this.tnNmpGenero = tnNmpGenero;
        this.tnNmpInicio = tnNmpInicio;
        this.tnNmpMes = tnNmpMes;
        this.tnNmpNivel = tnNmpNivel;
        this.tnNmpNombre = tnNmpNombre;
        this.tnNmpPlaza = tnNmpPlaza;
        this.tnNmpPuesto = tnNmpPuesto;
        this.tnNmpRfc = tnNmpRfc;
        this.tnNmpTermino = tnNmpTermino;
        this.tnNmpTipoCarga = tnNmpTipoCarga;
        this.tnNmpTipoPuesto = tnNmpTipoPuesto;
        this.tnNmpUnidad = tnNmpUnidad;
        this.tnNmpOp = tnNmpOp;
    }

    /**
     * Get tnNmpId value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpId() {
        return this.tnNmpId;
    }

    /**
     * Get tnNmpCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpCurso() {
        return this.tnNmpCurso;
    }

    /**
     * Get tnNmpDenominacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpDenominacion() {
        return this.tnNmpDenominacion;
    }

    /**
     * Get tnNmpDuracion value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTnNmpDuracion() {
        return this.tnNmpDuracion;
    }

    /**
     * Get tnNmpEstatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpEstatus() {
        return this.tnNmpEstatus;
    }

    /**
     * Get tnNmpFechaCarga value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpFechaCarga() {
        return this.tnNmpFechaCarga;
    }

    /**
     * Get tnNmpGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpGenero() {
        return this.tnNmpGenero;
    }

    /**
     * Get tnNmpInicio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpInicio() {
        return this.tnNmpInicio;
    }

    /**
     * Get tnNmpMes value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpMes() {
        return this.tnNmpMes;
    }

    /**
     * Get tnNmpNivel value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpNivel() {
        return this.tnNmpNivel;
    }

    /**
     * Get tnNmpNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpNombre() {
        return this.tnNmpNombre;
    }

    /**
     * Get tnNmpPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTnNmpPlaza() {
        return this.tnNmpPlaza;
    }

    /**
     * Get tnNmpPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpPuesto() {
        return this.tnNmpPuesto;
    }

    /**
     * Get tnNmpRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpRfc() {
        return this.tnNmpRfc;
    }

    /**
     * Get tnNmpTermino value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTnNmpTermino() {
        return this.tnNmpTermino;
    }

    /**
     * Get tnNmpTipoCarga value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpTipoCarga() {
        return this.tnNmpTipoCarga;
    }

    /**
     * Get tnNmpTipoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpTipoPuesto() {
        return this.tnNmpTipoPuesto;
    }

    /**
     * Get tnNmpUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTnNmpUnidad() {
        return this.tnNmpUnidad;
    }

    /**
     * Set tnNmpId value.
     *
     * @param tnNmpId java.lang.String
     */
    public void setTnNmpId(java.lang.String tnNmpId) {
        this.tnNmpId = tnNmpId;
    }

    /**
     * Set tnNmpCurso value.
     *
     * @param tnNmpCurso java.lang.String
     */
    public void setTnNmpCurso(java.lang.String tnNmpCurso) {
        this.tnNmpCurso = tnNmpCurso;
    }

    /**
     * Set tnNmpDenominacion value.
     *
     * @param tnNmpDenominacion java.lang.String
     */
    public void setTnNmpDenominacion(java.lang.String tnNmpDenominacion) {
        this.tnNmpDenominacion = tnNmpDenominacion;
    }

    /**
     * Set tnNmpDuracion value.
     *
     * @param tnNmpDuracion java.lang.Integer
     */
    public void setTnNmpDuracion(java.lang.Integer tnNmpDuracion) {
        this.tnNmpDuracion = tnNmpDuracion;
    }

    /**
     * Set tnNmpEstatus value.
     *
     * @param tnNmpEstatus java.lang.String
     */
    public void setTnNmpEstatus(java.lang.String tnNmpEstatus) {
        this.tnNmpEstatus = tnNmpEstatus;
    }

    /**
     * Set tnNmpFechaCarga value.
     *
     * @param tnNmpFechaCarga java.util.Date
     */
    public void setTnNmpFechaCarga(java.util.Date tnNmpFechaCarga) {
        this.tnNmpFechaCarga = tnNmpFechaCarga;
    }

    /**
     * Set tnNmpGenero value.
     *
     * @param tnNmpGenero java.lang.String
     */
    public void setTnNmpGenero(java.lang.String tnNmpGenero) {
        this.tnNmpGenero = tnNmpGenero;
    }

    /**
     * Set tnNmpInicio value.
     *
     * @param tnNmpInicio java.util.Date
     */
    public void setTnNmpInicio(java.util.Date tnNmpInicio) {
        this.tnNmpInicio = tnNmpInicio;
    }

    /**
     * Set tnNmpMes value.
     *
     * @param tnNmpMes java.lang.String
     */
    public void setTnNmpMes(java.lang.String tnNmpMes) {
        this.tnNmpMes = tnNmpMes;
    }

    /**
     * Set tnNmpNivel value.
     *
     * @param tnNmpNivel java.lang.String
     */
    public void setTnNmpNivel(java.lang.String tnNmpNivel) {
        this.tnNmpNivel = tnNmpNivel;
    }

    /**
     * Set tnNmpNombre value.
     *
     * @param tnNmpNombre java.lang.String
     */
    public void setTnNmpNombre(java.lang.String tnNmpNombre) {
        this.tnNmpNombre = tnNmpNombre;
    }

    /**
     * Set tnNmpPlaza value.
     *
     * @param tnNmpPlaza java.lang.Integer
     */
    public void setTnNmpPlaza(java.lang.Integer tnNmpPlaza) {
        this.tnNmpPlaza = tnNmpPlaza;
    }

    /**
     * Set tnNmpPuesto value.
     *
     * @param tnNmpPuesto java.lang.String
     */
    public void setTnNmpPuesto(java.lang.String tnNmpPuesto) {
        this.tnNmpPuesto = tnNmpPuesto;
    }

    /**
     * Set tnNmpRfc value.
     *
     * @param tnNmpRfc java.lang.String
     */
    public void setTnNmpRfc(java.lang.String tnNmpRfc) {
        this.tnNmpRfc = tnNmpRfc;
    }

    /**
     * Set tnNmpTermino value.
     *
     * @param tnNmpTermino java.util.Date
     */
    public void setTnNmpTermino(java.util.Date tnNmpTermino) {
        this.tnNmpTermino = tnNmpTermino;
    }

    /**
     * Set tnNmpTipoCarga value.
     *
     * @param tnNmpTipoCarga java.lang.String
     */
    public void setTnNmpTipoCarga(java.lang.String tnNmpTipoCarga) {
        this.tnNmpTipoCarga = tnNmpTipoCarga;
    }

    /**
     * Set tnNmpTipoPuesto value.
     *
     * @param tnNmpTipoPuesto java.lang.String
     */
    public void setTnNmpTipoPuesto(java.lang.String tnNmpTipoPuesto) {
        this.tnNmpTipoPuesto = tnNmpTipoPuesto;
    }

    /**
     * Set tnNmpUnidad value.
     *
     * @param tnNmpUnidad java.lang.String
     */
    public void setTnNmpUnidad(java.lang.String tnNmpUnidad) {
        this.tnNmpUnidad = tnNmpUnidad;
    }

    /**
     * Set identity value.
     *
     * @param tnNmpId Serializable
     */
    public void setIdentity(Serializable tnNmpId) {
        this.tnNmpId = (java.lang.String)tnNmpId;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.tnNmpId;
    }

    public String getTnNmpOp() {
        return tnNmpOp;
    }

    public void setTnNmpOp(String tnNmpOp) {
        this.tnNmpOp = tnNmpOp;
    }
}
