package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdCaptCptoErr data.
 */
public class TdCaptCptoErrDTO  implements java.io.Serializable, Model {    

    private java.lang.Long idCaptCptoErr;
    @MaxLength(4)    
    private java.lang.String idDepEnv;
    @MaxLength(4)    
    private java.lang.String idTipoCpto;
    private java.lang.Double cceMonto;
    @MaxLength(240)    
    private java.lang.String cceNombre;
    private java.lang.Float ccePorcen;
    private java.lang.Integer cceQnaCapt;
    private java.lang.Integer cceQnaFin;
    private java.lang.Integer cceQnaIni;
    @MaxLength(72)    
    private java.lang.String cceReferen;
    @MaxLength(52)    
    private java.lang.String cceRfc;
    private java.util.Date fecModifico;
    @MaxLength(8)    
    private java.lang.String idConcepto;
    private java.lang.Integer idError;
    @MaxLength(52)    
    private java.lang.String usuario;

    /**
     * Constructor for TdCaptCptoErrDTO class.
     */
    public TdCaptCptoErrDTO() { }    

                                                                
    /**
     * Constructor for TdCaptCptoErrDTO class.
     *
     * @param idCaptCptoErr java.lang.Integer
     * @param idDepEnv java.lang.String
     * @param idTipoCpto java.lang.String
     * @param cceMonto java.lang.Double
     * @param cceNombre java.lang.String
     * @param ccePorcen java.lang.Float
     * @param cceQnaCapt java.lang.Integer
     * @param cceQnaFin java.lang.Integer
     * @param cceQnaIni java.lang.Integer
     * @param cceReferen java.lang.String
     * @param cceRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param idConcepto java.lang.String
     * @param idError java.lang.Integer
     * @param usuario java.lang.String
     */
    public TdCaptCptoErrDTO( java.lang.Long idCaptCptoErr, java.lang.String idDepEnv, java.lang.String idTipoCpto, java.lang.Double cceMonto, java.lang.String cceNombre, java.lang.Float ccePorcen, java.lang.Integer cceQnaCapt, java.lang.Integer cceQnaFin, java.lang.Integer cceQnaIni, java.lang.String cceReferen, java.lang.String cceRfc, java.util.Date fecModifico, java.lang.String idConcepto, java.lang.Integer idError, java.lang.String usuario){    
        this.idCaptCptoErr = idCaptCptoErr;
        this.idDepEnv = idDepEnv;
        this.idTipoCpto = idTipoCpto;
        this.cceMonto = cceMonto;
        this.cceNombre = cceNombre;
        this.ccePorcen = ccePorcen;
        this.cceQnaCapt = cceQnaCapt;
        this.cceQnaFin = cceQnaFin;
        this.cceQnaIni = cceQnaIni;
        this.cceReferen = cceReferen;
        this.cceRfc = cceRfc;
        this.fecModifico = fecModifico;
        this.idConcepto = idConcepto;
        this.idError = idError;
        this.usuario = usuario;
    }    

    
    /**
     * Set idCaptCptoErr value.
     *
     * @param idCaptCptoErr java.lang.Integer
     */
    public void setIdCaptCptoErr(java.lang.Long idCaptCptoErr){
        this.idCaptCptoErr = idCaptCptoErr;
    }
    
    /**
     * Get idCaptCptoErr value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Long getIdCaptCptoErr() {
        return this.idCaptCptoErr;    
    }
    
    /**
     * Set idDepEnv value.
     *
     * @param idDepEnv java.lang.String
     */
    public void setIdDepEnv(java.lang.String idDepEnv){
        this.idDepEnv = idDepEnv;
    }
    
    /**
     * Get idDepEnv value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDepEnv() {
        return this.idDepEnv;    
    }
    
    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto){
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
     * Set cceMonto value.
     *
     * @param cceMonto java.lang.Double
     */
    public void setCceMonto(java.lang.Double cceMonto){
        this.cceMonto = cceMonto;
    }
    
    /**
     * Get cceMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCceMonto() {
        return this.cceMonto;    
    }
    
    /**
     * Set cceNombre value.
     *
     * @param cceNombre java.lang.String
     */
    public void setCceNombre(java.lang.String cceNombre){
        this.cceNombre = cceNombre;
    }
    
    /**
     * Get cceNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCceNombre() {
        return this.cceNombre;    
    }
    
    /**
     * Set ccePorcen value.
     *
     * @param ccePorcen java.lang.Float
     */
    public void setCcePorcen(java.lang.Float ccePorcen){
        this.ccePorcen = ccePorcen;
    }
    
    /**
     * Get ccePorcen value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getCcePorcen() {
        return this.ccePorcen;    
    }
    
    /**
     * Set cceQnaCapt value.
     *
     * @param cceQnaCapt java.lang.Integer
     */
    public void setCceQnaCapt(java.lang.Integer cceQnaCapt){
        this.cceQnaCapt = cceQnaCapt;
    }
    
    /**
     * Get cceQnaCapt value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCceQnaCapt() {
        return this.cceQnaCapt;    
    }
    
    /**
     * Set cceQnaFin value.
     *
     * @param cceQnaFin java.lang.Integer
     */
    public void setCceQnaFin(java.lang.Integer cceQnaFin){
        this.cceQnaFin = cceQnaFin;
    }
    
    /**
     * Get cceQnaFin value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCceQnaFin() {
        return this.cceQnaFin;    
    }
    
    /**
     * Set cceQnaIni value.
     *
     * @param cceQnaIni java.lang.Integer
     */
    public void setCceQnaIni(java.lang.Integer cceQnaIni){
        this.cceQnaIni = cceQnaIni;
    }
    
    /**
     * Get cceQnaIni value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCceQnaIni() {
        return this.cceQnaIni;    
    }
    
    /**
     * Set cceReferen value.
     *
     * @param cceReferen java.lang.String
     */
    public void setCceReferen(java.lang.String cceReferen){
        this.cceReferen = cceReferen;
    }
    
    /**
     * Get cceReferen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCceReferen() {
        return this.cceReferen;    
    }
    
    /**
     * Set cceRfc value.
     *
     * @param cceRfc java.lang.String
     */
    public void setCceRfc(java.lang.String cceRfc){
        this.cceRfc = cceRfc;
    }
    
    /**
     * Get cceRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCceRfc() {
        return this.cceRfc;    
    }
    
    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
     * Set idConcepto value.
     *
     * @param idConcepto java.lang.String
     */
    public void setIdConcepto(java.lang.String idConcepto){
        this.idConcepto = idConcepto;
    }
    
    /**
     * Get idConcepto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdConcepto() {
        return this.idConcepto;    
    }
    
    /**
     * Set idError value.
     *
     * @param idError java.lang.Integer
     */
    public void setIdError(java.lang.Integer idError){
        this.idError = idError;
    }
    
    /**
     * Get idError value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdError() {
        return this.idError;    
    }
    
    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario){
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


}