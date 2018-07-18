package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnPlantillaPlazaEstructura data.
 */
public class TnPlantillaPlazaEstructuraDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idPpeSec;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String usuario;
    @MaxLength(16)    
    private java.lang.String idNivel;
    private java.lang.Integer idPlaza;
    @MaxLength(28)    
    private java.lang.String idPuesto;
    @MaxLength(20)    
    private java.lang.String idServPub;
    @MaxLength(12)    
    private java.lang.String idUnidad;
    private java.lang.Boolean idZona;
    @MaxLength(40)    
    private java.lang.String ppeAdecuacionActual;
    @MaxLength(40)    
    private java.lang.String ppeAdecuacionAnterior;
    @MaxLength(200)    
    private java.lang.String ppeCancelada;
    private java.lang.Integer ppeCasos;
    private java.lang.Integer ppeEntidadFederativa;
    @MaxLength(200)    
    private java.lang.String ppeEstauts;
    private java.util.Date ppeFinVigencia;
    private java.lang.Double ppeImpHono;
    private java.util.Date ppeInicioVigencia;
    @MaxLength(200)    
    private java.lang.String ppeRegularizable;
    @MaxLength(200)    
    private java.lang.String ppeTipo;
    @MaxLength(200)    
    private java.lang.String ppeTipoMov;
    @MaxLength(200)    
    private java.lang.String ppeTipoPersonal;

    /**
     * Constructor for TnPlantillaPlazaEstructuraDTO class.
     */
    public TnPlantillaPlazaEstructuraDTO() { }    

                                                                                            
    /**
     * Constructor for TnPlantillaPlazaEstructuraDTO class.
     *
     * @param idPpeSec java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idNivel java.lang.String
     * @param idPlaza java.lang.Integer
     * @param idPuesto java.lang.String
     * @param idServPub java.lang.String
     * @param idUnidad java.lang.String
     * @param idZona java.lang.Boolean
     * @param ppeAdecuacionActual java.lang.String
     * @param ppeAdecuacionAnterior java.lang.String
     * @param ppeCancelada java.lang.String
     * @param ppeCasos java.lang.Integer
     * @param ppeEntidadFederativa java.lang.Integer
     * @param ppeEstauts java.lang.String
     * @param ppeFinVigencia java.util.Date
     * @param ppeImpHono java.lang.Double
     * @param ppeInicioVigencia java.util.Date
     * @param ppeRegularizable java.lang.String
     * @param ppeTipo java.lang.String
     * @param ppeTipoMov java.lang.String
     * @param ppeTipoPersonal java.lang.String
     */
    public TnPlantillaPlazaEstructuraDTO( java.lang.Integer idPpeSec, java.util.Date fecModifico, java.lang.String usuario, java.lang.String idNivel, java.lang.Integer idPlaza, java.lang.String idPuesto, java.lang.String idServPub, java.lang.String idUnidad, java.lang.Boolean idZona, java.lang.String ppeAdecuacionActual, java.lang.String ppeAdecuacionAnterior, java.lang.String ppeCancelada, java.lang.Integer ppeCasos, java.lang.Integer ppeEntidadFederativa, java.lang.String ppeEstauts, java.util.Date ppeFinVigencia, java.lang.Double ppeImpHono, java.util.Date ppeInicioVigencia, java.lang.String ppeRegularizable, java.lang.String ppeTipo, java.lang.String ppeTipoMov, java.lang.String ppeTipoPersonal){    
        this.idPpeSec = idPpeSec;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idNivel = idNivel;
        this.idPlaza = idPlaza;
        this.idPuesto = idPuesto;
        this.idServPub = idServPub;
        this.idUnidad = idUnidad;
        this.idZona = idZona;
        this.ppeAdecuacionActual = ppeAdecuacionActual;
        this.ppeAdecuacionAnterior = ppeAdecuacionAnterior;
        this.ppeCancelada = ppeCancelada;
        this.ppeCasos = ppeCasos;
        this.ppeEntidadFederativa = ppeEntidadFederativa;
        this.ppeEstauts = ppeEstauts;
        this.ppeFinVigencia = ppeFinVigencia;
        this.ppeImpHono = ppeImpHono;
        this.ppeInicioVigencia = ppeInicioVigencia;
        this.ppeRegularizable = ppeRegularizable;
        this.ppeTipo = ppeTipo;
        this.ppeTipoMov = ppeTipoMov;
        this.ppeTipoPersonal = ppeTipoPersonal;
    }    

    
    /**
     * Set idPpeSec value.
     *
     * @param idPpeSec java.lang.Integer
     */
    public void setIdPpeSec(java.lang.Integer idPpeSec){
        this.idPpeSec = idPpeSec;
    }
    
    /**
     * Get idPpeSec value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPpeSec() {
        return this.idPpeSec;    
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
     * Set idNivel value.
     *
     * @param idNivel java.lang.String
     */
    public void setIdNivel(java.lang.String idNivel){
        this.idNivel = idNivel;
    }
    
    /**
     * Get idNivel value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivel() {
        return this.idNivel;    
    }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza){
        this.idPlaza = idPlaza;
    }
    
    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;    
    }
    
    /**
     * Set idPuesto value.
     *
     * @param idPuesto java.lang.String
     */
    public void setIdPuesto(java.lang.String idPuesto){
        this.idPuesto = idPuesto;
    }
    
    /**
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;    
    }
    
    /**
     * Set idServPub value.
     *
     * @param idServPub java.lang.String
     */
    public void setIdServPub(java.lang.String idServPub){
        this.idServPub = idServPub;
    }
    
    /**
     * Get idServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdServPub() {
        return this.idServPub;    
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
     * Set idZona value.
     *
     * @param idZona java.lang.Boolean
     */
    public void setIdZona(java.lang.Boolean idZona){
        this.idZona = idZona;
    }
    
    /**
     * Get idZona value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdZona() {
        return this.idZona;    
    }
    
    /**
     * Set ppeAdecuacionActual value.
     *
     * @param ppeAdecuacionActual java.lang.String
     */
    public void setPpeAdecuacionActual(java.lang.String ppeAdecuacionActual){
        this.ppeAdecuacionActual = ppeAdecuacionActual;
    }
    
    /**
     * Get ppeAdecuacionActual value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeAdecuacionActual() {
        return this.ppeAdecuacionActual;    
    }
    
    /**
     * Set ppeAdecuacionAnterior value.
     *
     * @param ppeAdecuacionAnterior java.lang.String
     */
    public void setPpeAdecuacionAnterior(java.lang.String ppeAdecuacionAnterior){
        this.ppeAdecuacionAnterior = ppeAdecuacionAnterior;
    }
    
    /**
     * Get ppeAdecuacionAnterior value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeAdecuacionAnterior() {
        return this.ppeAdecuacionAnterior;    
    }
    
    /**
     * Set ppeCancelada value.
     *
     * @param ppeCancelada java.lang.String
     */
    public void setPpeCancelada(java.lang.String ppeCancelada){
        this.ppeCancelada = ppeCancelada;
    }
    
    /**
     * Get ppeCancelada value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeCancelada() {
        return this.ppeCancelada;    
    }
    
    /**
     * Set ppeCasos value.
     *
     * @param ppeCasos java.lang.Integer
     */
    public void setPpeCasos(java.lang.Integer ppeCasos){
        this.ppeCasos = ppeCasos;
    }
    
    /**
     * Get ppeCasos value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPpeCasos() {
        return this.ppeCasos;    
    }
    
    /**
     * Set ppeEntidadFederativa value.
     *
     * @param ppeEntidadFederativa java.lang.Integer
     */
    public void setPpeEntidadFederativa(java.lang.Integer ppeEntidadFederativa){
        this.ppeEntidadFederativa = ppeEntidadFederativa;
    }
    
    /**
     * Get ppeEntidadFederativa value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPpeEntidadFederativa() {
        return this.ppeEntidadFederativa;    
    }
    
    /**
     * Set ppeEstauts value.
     *
     * @param ppeEstauts java.lang.String
     */
    public void setPpeEstauts(java.lang.String ppeEstauts){
        this.ppeEstauts = ppeEstauts;
    }
    
    /**
     * Get ppeEstauts value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeEstauts() {
        return this.ppeEstauts;    
    }
    
    /**
     * Set ppeFinVigencia value.
     *
     * @param ppeFinVigencia java.util.Date
     */
    public void setPpeFinVigencia(java.util.Date ppeFinVigencia){
        this.ppeFinVigencia = ppeFinVigencia;
    }
    
    /**
     * Get ppeFinVigencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPpeFinVigencia() {
        return this.ppeFinVigencia;    
    }
    
    /**
     * Set ppeImpHono value.
     *
     * @param ppeImpHono java.lang.Double
     */
    public void setPpeImpHono(java.lang.Double ppeImpHono){
        this.ppeImpHono = ppeImpHono;
    }
    
    /**
     * Get ppeImpHono value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getPpeImpHono() {
        return this.ppeImpHono;    
    }
    
    /**
     * Set ppeInicioVigencia value.
     *
     * @param ppeInicioVigencia java.util.Date
     */
    public void setPpeInicioVigencia(java.util.Date ppeInicioVigencia){
        this.ppeInicioVigencia = ppeInicioVigencia;
    }
    
    /**
     * Get ppeInicioVigencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPpeInicioVigencia() {
        return this.ppeInicioVigencia;    
    }
    
    /**
     * Set ppeRegularizable value.
     *
     * @param ppeRegularizable java.lang.String
     */
    public void setPpeRegularizable(java.lang.String ppeRegularizable){
        this.ppeRegularizable = ppeRegularizable;
    }
    
    /**
     * Get ppeRegularizable value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeRegularizable() {
        return this.ppeRegularizable;    
    }
    
    /**
     * Set ppeTipo value.
     *
     * @param ppeTipo java.lang.String
     */
    public void setPpeTipo(java.lang.String ppeTipo){
        this.ppeTipo = ppeTipo;
    }
    
    /**
     * Get ppeTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeTipo() {
        return this.ppeTipo;    
    }
    
    /**
     * Set ppeTipoMov value.
     *
     * @param ppeTipoMov java.lang.String
     */
    public void setPpeTipoMov(java.lang.String ppeTipoMov){
        this.ppeTipoMov = ppeTipoMov;
    }
    
    /**
     * Get ppeTipoMov value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeTipoMov() {
        return this.ppeTipoMov;    
    }
    
    /**
     * Set ppeTipoPersonal value.
     *
     * @param ppeTipoPersonal java.lang.String
     */
    public void setPpeTipoPersonal(java.lang.String ppeTipoPersonal){
        this.ppeTipoPersonal = ppeTipoPersonal;
    }
    
    /**
     * Get ppeTipoPersonal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPpeTipoPersonal() {
        return this.ppeTipoPersonal;    
    }


}