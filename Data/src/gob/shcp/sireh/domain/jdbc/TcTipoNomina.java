package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcTipoNomina data.
 */
public class TcTipoNomina implements Domain, Serializable {

    @PrimaryKey
    private java.lang.String idTipoNomina;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String cptosNominaClc;
    private java.lang.String descTipoNomina;
    private java.lang.String guiaContableClc;
    private java.lang.String parametrosClc;
    private java.lang.String periodoClc;
    private java.lang.String tipoClc;
    private java.lang.String tipoNomAviFrAct;
    private java.lang.String tipoNomAviFrAnt;
    private java.lang.String tipoNomAviRei;
    private java.lang.String tipoNomAviReiAnt;
    private java.lang.String tipoNomCpto;
    private java.lang.String tipoNomCptosCancela;
    private java.lang.String tipoNomCxlc;
    private java.lang.String tipoNomMovto;
    private java.lang.String tipoNomOfiRec;
    private java.lang.String tipoNomPresupuestal;
    private java.lang.String tipoNomSnScan;

    /**
     * Constructor for TcTipoNomina class.
     */
    public TcTipoNomina() {
    }

    /**
     * Constructor for TcTipoNomina class.
     *
     * @param idTipoNomina java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cptosNominaClc java.lang.String
     * @param descTipoNomina java.lang.String
     * @param guiaContableClc java.lang.String
     * @param parametrosClc java.lang.String
     * @param periodoClc java.lang.String
     * @param tipoClc java.lang.String
     * @param tipoNomAviFrAct java.lang.String
     * @param tipoNomAviFrAnt java.lang.String
     * @param tipoNomAviRei java.lang.String
     * @param tipoNomAviReiAnt java.lang.String
     * @param tipoNomCpto java.lang.String
     * @param tipoNomCptosCancela java.lang.String
     * @param tipoNomCxlc java.lang.String
     * @param tipoNomMovto java.lang.String
     * @param tipoNomOfiRec java.lang.String
     * @param tipoNomPresupuestal java.lang.String
     * @param tipoNomSnScan java.lang.String
     */
    public TcTipoNomina(java.lang.String idTipoNomina, 
                        java.util.Date fecModifico, java.lang.String usuario, 
                        java.lang.String cptosNominaClc, 
                        java.lang.String descTipoNomina, 
                        java.lang.String guiaContableClc, 
                        java.lang.String parametrosClc, 
                        java.lang.String periodoClc, java.lang.String tipoClc, 
                        java.lang.String tipoNomAviFrAct, 
                        java.lang.String tipoNomAviFrAnt, 
                        java.lang.String tipoNomAviRei, 
                        java.lang.String tipoNomAviReiAnt, 
                        java.lang.String tipoNomCpto, 
                        java.lang.String tipoNomCptosCancela, 
                        java.lang.String tipoNomCxlc, 
                        java.lang.String tipoNomMovto, 
                        java.lang.String tipoNomOfiRec, 
                        java.lang.String tipoNomPresupuestal, 
                        java.lang.String tipoNomSnScan) {
        this.idTipoNomina = idTipoNomina;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cptosNominaClc = cptosNominaClc;
        this.descTipoNomina = descTipoNomina;
        this.guiaContableClc = guiaContableClc;
        this.parametrosClc = parametrosClc;
        this.periodoClc = periodoClc;
        this.tipoClc = tipoClc;
        this.tipoNomAviFrAct = tipoNomAviFrAct;
        this.tipoNomAviFrAnt = tipoNomAviFrAnt;
        this.tipoNomAviRei = tipoNomAviRei;
        this.tipoNomAviReiAnt = tipoNomAviReiAnt;
        this.tipoNomCpto = tipoNomCpto;
        this.tipoNomCptosCancela = tipoNomCptosCancela;
        this.tipoNomCxlc = tipoNomCxlc;
        this.tipoNomMovto = tipoNomMovto;
        this.tipoNomOfiRec = tipoNomOfiRec;
        this.tipoNomPresupuestal = tipoNomPresupuestal;
        this.tipoNomSnScan = tipoNomSnScan;
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
     * Get cptosNominaClc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCptosNominaClc() {
        return this.cptosNominaClc;
    }

    /**
     * Get descTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescTipoNomina() {
        return this.descTipoNomina;
    }

    /**
     * Get guiaContableClc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getGuiaContableClc() {
        return this.guiaContableClc;
    }

    /**
     * Get parametrosClc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getParametrosClc() {
        return this.parametrosClc;
    }

    /**
     * Get periodoClc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPeriodoClc() {
        return this.periodoClc;
    }

    /**
     * Get tipoClc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoClc() {
        return this.tipoClc;
    }

    /**
     * Get tipoNomAviFrAct value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomAviFrAct() {
        return this.tipoNomAviFrAct;
    }

    /**
     * Get tipoNomAviFrAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomAviFrAnt() {
        return this.tipoNomAviFrAnt;
    }

    /**
     * Get tipoNomAviRei value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomAviRei() {
        return this.tipoNomAviRei;
    }

    /**
     * Get tipoNomAviReiAnt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomAviReiAnt() {
        return this.tipoNomAviReiAnt;
    }

    /**
     * Get tipoNomCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomCpto() {
        return this.tipoNomCpto;
    }

    /**
     * Get tipoNomCptosCancela value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomCptosCancela() {
        return this.tipoNomCptosCancela;
    }

    /**
     * Get tipoNomCxlc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomCxlc() {
        return this.tipoNomCxlc;
    }

    /**
     * Get tipoNomMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomMovto() {
        return this.tipoNomMovto;
    }

    /**
     * Get tipoNomOfiRec value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomOfiRec() {
        return this.tipoNomOfiRec;
    }

    /**
     * Get tipoNomPresupuestal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomPresupuestal() {
        return this.tipoNomPresupuestal;
    }

    /**
     * Get tipoNomSnScan value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomSnScan() {
        return this.tipoNomSnScan;
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
     * Set cptosNominaClc value.
     *
     * @param cptosNominaClc java.lang.String
     */
    public void setCptosNominaClc(java.lang.String cptosNominaClc) {
        this.cptosNominaClc = cptosNominaClc;
    }

    /**
     * Set descTipoNomina value.
     *
     * @param descTipoNomina java.lang.String
     */
    public void setDescTipoNomina(java.lang.String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }

    /**
     * Set guiaContableClc value.
     *
     * @param guiaContableClc java.lang.String
     */
    public void setGuiaContableClc(java.lang.String guiaContableClc) {
        this.guiaContableClc = guiaContableClc;
    }

    /**
     * Set parametrosClc value.
     *
     * @param parametrosClc java.lang.String
     */
    public void setParametrosClc(java.lang.String parametrosClc) {
        this.parametrosClc = parametrosClc;
    }

    /**
     * Set periodoClc value.
     *
     * @param periodoClc java.lang.String
     */
    public void setPeriodoClc(java.lang.String periodoClc) {
        this.periodoClc = periodoClc;
    }

    /**
     * Set tipoClc value.
     *
     * @param tipoClc java.lang.String
     */
    public void setTipoClc(java.lang.String tipoClc) {
        this.tipoClc = tipoClc;
    }

    /**
     * Set tipoNomAviFrAct value.
     *
     * @param tipoNomAviFrAct java.lang.String
     */
    public void setTipoNomAviFrAct(java.lang.String tipoNomAviFrAct) {
        this.tipoNomAviFrAct = tipoNomAviFrAct;
    }

    /**
     * Set tipoNomAviFrAnt value.
     *
     * @param tipoNomAviFrAnt java.lang.String
     */
    public void setTipoNomAviFrAnt(java.lang.String tipoNomAviFrAnt) {
        this.tipoNomAviFrAnt = tipoNomAviFrAnt;
    }

    /**
     * Set tipoNomAviRei value.
     *
     * @param tipoNomAviRei java.lang.String
     */
    public void setTipoNomAviRei(java.lang.String tipoNomAviRei) {
        this.tipoNomAviRei = tipoNomAviRei;
    }

    /**
     * Set tipoNomAviReiAnt value.
     *
     * @param tipoNomAviReiAnt java.lang.String
     */
    public void setTipoNomAviReiAnt(java.lang.String tipoNomAviReiAnt) {
        this.tipoNomAviReiAnt = tipoNomAviReiAnt;
    }

    /**
     * Set tipoNomCpto value.
     *
     * @param tipoNomCpto java.lang.String
     */
    public void setTipoNomCpto(java.lang.String tipoNomCpto) {
        this.tipoNomCpto = tipoNomCpto;
    }

    /**
     * Set tipoNomCptosCancela value.
     *
     * @param tipoNomCptosCancela java.lang.String
     */
    public void setTipoNomCptosCancela(java.lang.String tipoNomCptosCancela) {
        this.tipoNomCptosCancela = tipoNomCptosCancela;
    }

    /**
     * Set tipoNomCxlc value.
     *
     * @param tipoNomCxlc java.lang.String
     */
    public void setTipoNomCxlc(java.lang.String tipoNomCxlc) {
        this.tipoNomCxlc = tipoNomCxlc;
    }

    /**
     * Set tipoNomMovto value.
     *
     * @param tipoNomMovto java.lang.String
     */
    public void setTipoNomMovto(java.lang.String tipoNomMovto) {
        this.tipoNomMovto = tipoNomMovto;
    }

    /**
     * Set tipoNomOfiRec value.
     *
     * @param tipoNomOfiRec java.lang.String
     */
    public void setTipoNomOfiRec(java.lang.String tipoNomOfiRec) {
        this.tipoNomOfiRec = tipoNomOfiRec;
    }

    /**
     * Set tipoNomPresupuestal value.
     *
     * @param tipoNomPresupuestal java.lang.String
     */
    public void setTipoNomPresupuestal(java.lang.String tipoNomPresupuestal) {
        this.tipoNomPresupuestal = tipoNomPresupuestal;
    }

    /**
     * Set tipoNomSnScan value.
     *
     * @param tipoNomSnScan java.lang.String
     */
    public void setTipoNomSnScan(java.lang.String tipoNomSnScan) {
        this.tipoNomSnScan = tipoNomSnScan;
    }

    /**
     * Set identity value.
     *
     * @param idTipoNomina Serializable
     */
    public void setIdentity(Serializable idTipoNomina) {
        this.idTipoNomina = (java.lang.String)idTipoNomina;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idTipoNomina;
    }

}
