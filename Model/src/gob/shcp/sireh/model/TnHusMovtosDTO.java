package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnHusMovtos data.
 */
public class TnHusMovtosDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(8)    
    private java.lang.String husmovMovto;
    @NotBlank(errorCode="not.null")
    @MaxLength(28)    
    private java.lang.String husmovPuesto;
    @NotBlank(errorCode="not.null")
    @MaxLength(52)    
    private java.lang.String husmovRfc;
    private java.util.Date husmovVigencia;
    @NotNull
    private java.util.Date fecModifico;
    @NotNull
    private float husmovComp;
    @NotNull
    private int husmovMotivo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(16)    
    private java.lang.String husmovNivPto;
    @NotNull
    private boolean husmovNivTab;
    @NotNull
    private float husmovOtrasPer;
    @NotNull
    private int husmovPtda;
    @NotNull
    private float husmovQuinq;
    @NotNull
    private float husmovSalMin;
    @NotNull
    private float husmovSobresdo;
    @NotNull
    private float husmovSueldo;
    @NotNull
    private int husmovZona;
    @NotNull
    private boolean husmovZonaEco;
    @NotNull
    private int idEdo;
    @NotNull
    private int idMunicipio;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(12)    
    private java.lang.String idUnidad;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(4)    
    private java.lang.String husmovCategoria;
    @MaxLength(180)    
    private java.lang.String husmovDescripPt;
    private java.util.Date husmovHasta;
    @MaxLength(8)    
    private java.lang.String husmovMensaje;
    @MaxLength(4)    
    private java.lang.String husmovSupMedAp;
    @MaxLength(4)    
    private java.lang.String husmovTipo;

    /**
     * Constructor for TnHusMovtosDTO class.
     */
    public TnHusMovtosDTO() { }    

                                                                                                                
    /**
     * Constructor for TnHusMovtosDTO class.
     *
     * @param husmovMovto java.lang.String
     * @param husmovPuesto java.lang.String
     * @param husmovRfc java.lang.String
     * @param husmovVigencia java.util.Date
     * @param fecModifico java.util.Date
     * @param husmovComp float
     * @param husmovMotivo int
     * @param husmovNivPto java.lang.String
     * @param husmovNivTab boolean
     * @param husmovOtrasPer float
     * @param husmovPtda int
     * @param husmovQuinq float
     * @param husmovSalMin float
     * @param husmovSobresdo float
     * @param husmovSueldo float
     * @param husmovZona int
     * @param husmovZonaEco boolean
     * @param idEdo int
     * @param idMunicipio int
     * @param idUnidad java.lang.String
     * @param usuario java.lang.String
     * @param husmovCategoria java.lang.String
     * @param husmovDescripPt java.lang.String
     * @param husmovHasta java.util.Date
     * @param husmovMensaje java.lang.String
     * @param husmovSupMedAp java.lang.String
     * @param husmovTipo java.lang.String
     */
    public TnHusMovtosDTO( java.lang.String husmovMovto, java.lang.String husmovPuesto, java.lang.String husmovRfc, java.util.Date husmovVigencia, java.util.Date fecModifico, float husmovComp, int husmovMotivo, java.lang.String husmovNivPto, boolean husmovNivTab, float husmovOtrasPer, int husmovPtda, float husmovQuinq, float husmovSalMin, float husmovSobresdo, float husmovSueldo, int husmovZona, boolean husmovZonaEco, int idEdo, int idMunicipio, java.lang.String idUnidad, java.lang.String usuario, java.lang.String husmovCategoria, java.lang.String husmovDescripPt, java.util.Date husmovHasta, java.lang.String husmovMensaje, java.lang.String husmovSupMedAp, java.lang.String husmovTipo){    
        this.husmovMovto = husmovMovto;
        this.husmovPuesto = husmovPuesto;
        this.husmovRfc = husmovRfc;
        this.husmovVigencia = husmovVigencia;
        this.fecModifico = fecModifico;
        this.husmovComp = husmovComp;
        this.husmovMotivo = husmovMotivo;
        this.husmovNivPto = husmovNivPto;
        this.husmovNivTab = husmovNivTab;
        this.husmovOtrasPer = husmovOtrasPer;
        this.husmovPtda = husmovPtda;
        this.husmovQuinq = husmovQuinq;
        this.husmovSalMin = husmovSalMin;
        this.husmovSobresdo = husmovSobresdo;
        this.husmovSueldo = husmovSueldo;
        this.husmovZona = husmovZona;
        this.husmovZonaEco = husmovZonaEco;
        this.idEdo = idEdo;
        this.idMunicipio = idMunicipio;
        this.idUnidad = idUnidad;
        this.usuario = usuario;
        this.husmovCategoria = husmovCategoria;
        this.husmovDescripPt = husmovDescripPt;
        this.husmovHasta = husmovHasta;
        this.husmovMensaje = husmovMensaje;
        this.husmovSupMedAp = husmovSupMedAp;
        this.husmovTipo = husmovTipo;
    }    

    
    /**
     * Set husmovMovto value.
     *
     * @param husmovMovto java.lang.String
     */
    public void setHusmovMovto(java.lang.String husmovMovto){
        this.husmovMovto = husmovMovto;
    }
    
    /**
     * Get husmovMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovMovto() {
        return this.husmovMovto;    
    }
    
    /**
     * Set husmovPuesto value.
     *
     * @param husmovPuesto java.lang.String
     */
    public void setHusmovPuesto(java.lang.String husmovPuesto){
        this.husmovPuesto = husmovPuesto;
    }
    
    /**
     * Get husmovPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovPuesto() {
        return this.husmovPuesto;    
    }
    
    /**
     * Set husmovRfc value.
     *
     * @param husmovRfc java.lang.String
     */
    public void setHusmovRfc(java.lang.String husmovRfc){
        this.husmovRfc = husmovRfc;
    }
    
    /**
     * Get husmovRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovRfc() {
        return this.husmovRfc;    
    }
    
    /**
     * Set husmovVigencia value.
     *
     * @param husmovVigencia java.util.Date
     */
    public void setHusmovVigencia(java.util.Date husmovVigencia){
        this.husmovVigencia = husmovVigencia;
    }
    
    /**
     * Get husmovVigencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusmovVigencia() {
        return this.husmovVigencia;    
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
     * Set husmovComp value.
     *
     * @param husmovComp float
     */
    public void setHusmovComp(float husmovComp){
        this.husmovComp = husmovComp;
    }
    
    /**
     * Get husmovComp value.
     *
     * @return float
     */
    public float getHusmovComp() {
        return this.husmovComp;    
    }
    
    /**
     * Set husmovMotivo value.
     *
     * @param husmovMotivo int
     */
    public void setHusmovMotivo(int husmovMotivo){
        this.husmovMotivo = husmovMotivo;
    }
    
    /**
     * Get husmovMotivo value.
     *
     * @return int
     */
    public int getHusmovMotivo() {
        return this.husmovMotivo;    
    }
    
    /**
     * Set husmovNivPto value.
     *
     * @param husmovNivPto java.lang.String
     */
    public void setHusmovNivPto(java.lang.String husmovNivPto){
        this.husmovNivPto = husmovNivPto;
    }
    
    /**
     * Get husmovNivPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovNivPto() {
        return this.husmovNivPto;    
    }
    
    /**
     * Set husmovNivTab value.
     *
     * @param husmovNivTab boolean
     */
    public void setHusmovNivTab(boolean husmovNivTab){
        this.husmovNivTab = husmovNivTab;
    }
    
    /**
     * Get husmovNivTab value.
     *
     * @return boolean
     */
    public boolean isHusmovNivTab() {
        return this.husmovNivTab;    
    }
    
    /**
     * Set husmovOtrasPer value.
     *
     * @param husmovOtrasPer float
     */
    public void setHusmovOtrasPer(float husmovOtrasPer){
        this.husmovOtrasPer = husmovOtrasPer;
    }
    
    /**
     * Get husmovOtrasPer value.
     *
     * @return float
     */
    public float getHusmovOtrasPer() {
        return this.husmovOtrasPer;    
    }
    
    /**
     * Set husmovPtda value.
     *
     * @param husmovPtda int
     */
    public void setHusmovPtda(int husmovPtda){
        this.husmovPtda = husmovPtda;
    }
    
    /**
     * Get husmovPtda value.
     *
     * @return int
     */
    public int getHusmovPtda() {
        return this.husmovPtda;    
    }
    
    /**
     * Set husmovQuinq value.
     *
     * @param husmovQuinq float
     */
    public void setHusmovQuinq(float husmovQuinq){
        this.husmovQuinq = husmovQuinq;
    }
    
    /**
     * Get husmovQuinq value.
     *
     * @return float
     */
    public float getHusmovQuinq() {
        return this.husmovQuinq;    
    }
    
    /**
     * Set husmovSalMin value.
     *
     * @param husmovSalMin float
     */
    public void setHusmovSalMin(float husmovSalMin){
        this.husmovSalMin = husmovSalMin;
    }
    
    /**
     * Get husmovSalMin value.
     *
     * @return float
     */
    public float getHusmovSalMin() {
        return this.husmovSalMin;    
    }
    
    /**
     * Set husmovSobresdo value.
     *
     * @param husmovSobresdo float
     */
    public void setHusmovSobresdo(float husmovSobresdo){
        this.husmovSobresdo = husmovSobresdo;
    }
    
    /**
     * Get husmovSobresdo value.
     *
     * @return float
     */
    public float getHusmovSobresdo() {
        return this.husmovSobresdo;    
    }
    
    /**
     * Set husmovSueldo value.
     *
     * @param husmovSueldo float
     */
    public void setHusmovSueldo(float husmovSueldo){
        this.husmovSueldo = husmovSueldo;
    }
    
    /**
     * Get husmovSueldo value.
     *
     * @return float
     */
    public float getHusmovSueldo() {
        return this.husmovSueldo;    
    }
    
    /**
     * Set husmovZona value.
     *
     * @param husmovZona int
     */
    public void setHusmovZona(int husmovZona){
        this.husmovZona = husmovZona;
    }
    
    /**
     * Get husmovZona value.
     *
     * @return int
     */
    public int getHusmovZona() {
        return this.husmovZona;    
    }
    
    /**
     * Set husmovZonaEco value.
     *
     * @param husmovZonaEco boolean
     */
    public void setHusmovZonaEco(boolean husmovZonaEco){
        this.husmovZonaEco = husmovZonaEco;
    }
    
    /**
     * Get husmovZonaEco value.
     *
     * @return boolean
     */
    public boolean isHusmovZonaEco() {
        return this.husmovZonaEco;    
    }
    
    /**
     * Set idEdo value.
     *
     * @param idEdo int
     */
    public void setIdEdo(int idEdo){
        this.idEdo = idEdo;
    }
    
    /**
     * Get idEdo value.
     *
     * @return int
     */
    public int getIdEdo() {
        return this.idEdo;    
    }
    
    /**
     * Set idMunicipio value.
     *
     * @param idMunicipio int
     */
    public void setIdMunicipio(int idMunicipio){
        this.idMunicipio = idMunicipio;
    }
    
    /**
     * Get idMunicipio value.
     *
     * @return int
     */
    public int getIdMunicipio() {
        return this.idMunicipio;    
    }
    
    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad){
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
    
    /**
     * Set husmovCategoria value.
     *
     * @param husmovCategoria java.lang.String
     */
    public void setHusmovCategoria(java.lang.String husmovCategoria){
        this.husmovCategoria = husmovCategoria;
    }
    
    /**
     * Get husmovCategoria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovCategoria() {
        return this.husmovCategoria;    
    }
    
    /**
     * Set husmovDescripPt value.
     *
     * @param husmovDescripPt java.lang.String
     */
    public void setHusmovDescripPt(java.lang.String husmovDescripPt){
        this.husmovDescripPt = husmovDescripPt;
    }
    
    /**
     * Get husmovDescripPt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovDescripPt() {
        return this.husmovDescripPt;    
    }
    
    /**
     * Set husmovHasta value.
     *
     * @param husmovHasta java.util.Date
     */
    public void setHusmovHasta(java.util.Date husmovHasta){
        this.husmovHasta = husmovHasta;
    }
    
    /**
     * Get husmovHasta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusmovHasta() {
        return this.husmovHasta;    
    }
    
    /**
     * Set husmovMensaje value.
     *
     * @param husmovMensaje java.lang.String
     */
    public void setHusmovMensaje(java.lang.String husmovMensaje){
        this.husmovMensaje = husmovMensaje;
    }
    
    /**
     * Get husmovMensaje value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovMensaje() {
        return this.husmovMensaje;    
    }
    
    /**
     * Set husmovSupMedAp value.
     *
     * @param husmovSupMedAp java.lang.String
     */
    public void setHusmovSupMedAp(java.lang.String husmovSupMedAp){
        this.husmovSupMedAp = husmovSupMedAp;
    }
    
    /**
     * Get husmovSupMedAp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovSupMedAp() {
        return this.husmovSupMedAp;    
    }
    
    /**
     * Set husmovTipo value.
     *
     * @param husmovTipo java.lang.String
     */
    public void setHusmovTipo(java.lang.String husmovTipo){
        this.husmovTipo = husmovTipo;
    }
    
    /**
     * Get husmovTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovTipo() {
        return this.husmovTipo;    
    }


}