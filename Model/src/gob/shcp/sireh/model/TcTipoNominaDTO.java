package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcTipoNomina data.
 */
public class TcTipoNominaDTO implements java.io.Serializable, Model {

    @NotBlank(errorCode = "not.null")
    @MaxLength(12)
    private java.lang.String idTipoNomina;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    @MaxLength(480)
    private java.lang.String cptosNominaClc;
    @MaxLength(320)
    private java.lang.String descTipoNomina;
    @MaxLength(480)
    private java.lang.String guiaContableClc;
    @MaxLength(480)
    private java.lang.String parametrosClc;
    @MaxLength(40)
    private java.lang.String periodoClc;
    @MaxLength(40)
    private java.lang.String tipoClc;
    @MaxLength(8)
    private java.lang.String tipoNomAviFrAct;
    @MaxLength(8)
    private java.lang.String tipoNomAviFrAnt;
    @MaxLength(8)
    private java.lang.String tipoNomAviRei;
    @MaxLength(8)
    private java.lang.String tipoNomAviReiAnt;
    @MaxLength(8)
    private java.lang.String tipoNomCpto;
    @MaxLength(480)
    private java.lang.String tipoNomCptosCancela;
    @MaxLength(8)
    private java.lang.String tipoNomCxlc;
    @MaxLength(12)
    private java.lang.String tipoNomMovto;
    @MaxLength(8)
    private java.lang.String tipoNomOfiRec;
    @MaxLength(480)
    private java.lang.String tipoNomPresupuestal;
    @MaxLength(4)
    private java.lang.String tipoNomSnScan;

    /**
     * Constructor for TcTipoNominaDTO class.
     */
    public TcTipoNominaDTO() {
    }


    /**
     * Constructor for TcTipoNominaDTO class.
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
    public TcTipoNominaDTO(java.lang.String idTipoNomina, java.util.Date fecModifico, java.lang.String usuario, 
                           java.lang.String cptosNominaClc, java.lang.String descTipoNomina, 
                           java.lang.String guiaContableClc, java.lang.String parametrosClc, 
                           java.lang.String periodoClc, java.lang.String tipoClc, java.lang.String tipoNomAviFrAct, 
                           java.lang.String tipoNomAviFrAnt, java.lang.String tipoNomAviRei, 
                           java.lang.String tipoNomAviReiAnt, java.lang.String tipoNomCpto, 
                           java.lang.String tipoNomCptosCancela, java.lang.String tipoNomCxlc, 
                           java.lang.String tipoNomMovto, java.lang.String tipoNomOfiRec, 
                           java.lang.String tipoNomPresupuestal, java.lang.String tipoNomSnScan) {
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
     * Set cptosNominaClc value.
     *
     * @param cptosNominaClc java.lang.String
     */
    public void setCptosNominaClc(java.lang.String cptosNominaClc) {
        this.cptosNominaClc = cptosNominaClc;
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
     * Set descTipoNomina value.
     *
     * @param descTipoNomina java.lang.String
     */
    public void setDescTipoNomina(java.lang.String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
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
     * Set guiaContableClc value.
     *
     * @param guiaContableClc java.lang.String
     */
    public void setGuiaContableClc(java.lang.String guiaContableClc) {
        this.guiaContableClc = guiaContableClc;
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
     * Set parametrosClc value.
     *
     * @param parametrosClc java.lang.String
     */
    public void setParametrosClc(java.lang.String parametrosClc) {
        this.parametrosClc = parametrosClc;
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
     * Set periodoClc value.
     *
     * @param periodoClc java.lang.String
     */
    public void setPeriodoClc(java.lang.String periodoClc) {
        this.periodoClc = periodoClc;
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
     * Set tipoClc value.
     *
     * @param tipoClc java.lang.String
     */
    public void setTipoClc(java.lang.String tipoClc) {
        this.tipoClc = tipoClc;
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
     * Set tipoNomAviFrAct value.
     *
     * @param tipoNomAviFrAct java.lang.String
     */
    public void setTipoNomAviFrAct(java.lang.String tipoNomAviFrAct) {
        this.tipoNomAviFrAct = tipoNomAviFrAct;
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
     * Set tipoNomAviFrAnt value.
     *
     * @param tipoNomAviFrAnt java.lang.String
     */
    public void setTipoNomAviFrAnt(java.lang.String tipoNomAviFrAnt) {
        this.tipoNomAviFrAnt = tipoNomAviFrAnt;
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
     * Set tipoNomAviRei value.
     *
     * @param tipoNomAviRei java.lang.String
     */
    public void setTipoNomAviRei(java.lang.String tipoNomAviRei) {
        this.tipoNomAviRei = tipoNomAviRei;
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
     * Set tipoNomAviReiAnt value.
     *
     * @param tipoNomAviReiAnt java.lang.String
     */
    public void setTipoNomAviReiAnt(java.lang.String tipoNomAviReiAnt) {
        this.tipoNomAviReiAnt = tipoNomAviReiAnt;
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
     * Set tipoNomCpto value.
     *
     * @param tipoNomCpto java.lang.String
     */
    public void setTipoNomCpto(java.lang.String tipoNomCpto) {
        this.tipoNomCpto = tipoNomCpto;
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
     * Set tipoNomCptosCancela value.
     *
     * @param tipoNomCptosCancela java.lang.String
     */
    public void setTipoNomCptosCancela(java.lang.String tipoNomCptosCancela) {
        this.tipoNomCptosCancela = tipoNomCptosCancela;
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
     * Set tipoNomCxlc value.
     *
     * @param tipoNomCxlc java.lang.String
     */
    public void setTipoNomCxlc(java.lang.String tipoNomCxlc) {
        this.tipoNomCxlc = tipoNomCxlc;
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
     * Set tipoNomMovto value.
     *
     * @param tipoNomMovto java.lang.String
     */
    public void setTipoNomMovto(java.lang.String tipoNomMovto) {
        this.tipoNomMovto = tipoNomMovto;
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
     * Set tipoNomOfiRec value.
     *
     * @param tipoNomOfiRec java.lang.String
     */
    public void setTipoNomOfiRec(java.lang.String tipoNomOfiRec) {
        this.tipoNomOfiRec = tipoNomOfiRec;
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
     * Set tipoNomPresupuestal value.
     *
     * @param tipoNomPresupuestal java.lang.String
     */
    public void setTipoNomPresupuestal(java.lang.String tipoNomPresupuestal) {
        this.tipoNomPresupuestal = tipoNomPresupuestal;
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
     * Set tipoNomSnScan value.
     *
     * @param tipoNomSnScan java.lang.String
     */
    public void setTipoNomSnScan(java.lang.String tipoNomSnScan) {
        this.tipoNomSnScan = tipoNomSnScan;
    }

    /**
     * Get tipoNomSnScan value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTipoNomSnScan() {
        return this.tipoNomSnScan;
    }
}
