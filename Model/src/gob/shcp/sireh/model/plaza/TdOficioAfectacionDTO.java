package gob.shcp.sireh.model.plaza;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdOficioAfectacion data.
 */
public class TdOficioAfectacionDTO  implements java.io.Serializable, Model {    

    private java.lang.Long idOficioAfecta;
    private java.lang.Integer ofacCiclo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String idSitAfectaci;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String idTipoDocto;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(8)    
    private java.lang.String ofacTipoAfectaci;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(4)    
    private java.lang.String ofacAplicaOficio;
    @NotNull
    private java.util.Date ofacFecAprobacion;
    @NotNull
    private java.util.Date ofacFecModAprob;
    @NotNull
    private java.util.Date ofacFecOfic;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(800)    
    private java.lang.String ofacLeyendaJustif;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(36)    
    private java.lang.String ofacNumAutoriza;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(24)    
    private java.lang.String ofacProyRegulA;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(24)    
    private java.lang.String ofacProyRegulR;
    @NotNull
    private double ofacTotalAmpliacion;
    @NotNull
    private double ofacTotalReduccion;
    @NotNull
    private boolean ofacTotalSecuencia;
    @NotNull
    private boolean ofacTotalSecSiaff;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String ofacUsrAprobacion;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(52)    
    private java.lang.String usuario;

    /**
     * Constructor for TdOficioAfectacionDTO class.
     */
    public TdOficioAfectacionDTO() { }    

                                                                                    
    /**
     * Constructor for TdOficioAfectacionDTO class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param ofacCiclo java.lang.Integer
     * @param idSitAfectaci java.lang.String
     * @param idTipoDocto java.lang.String
     * @param ofacTipoAfectaci java.lang.String
     * @param fecModifico java.util.Date
     * @param ofacAplicaOficio java.lang.String
     * @param ofacFecAprobacion java.util.Date
     * @param ofacFecModAprob java.util.Date
     * @param ofacFecOfic java.util.Date
     * @param ofacLeyendaJustif java.lang.String
     * @param ofacNumAutoriza java.lang.String
     * @param ofacProyRegulA java.lang.String
     * @param ofacProyRegulR java.lang.String
     * @param ofacTotalAmpliacion double
     * @param ofacTotalReduccion double
     * @param ofacTotalSecuencia boolean
     * @param ofacTotalSecSiaff boolean
     * @param ofacUsrAprobacion java.lang.String
     * @param usuario java.lang.String
     */
    public TdOficioAfectacionDTO( java.lang.Long idOficioAfecta, java.lang.Integer ofacCiclo, java.lang.String idSitAfectaci, java.lang.String idTipoDocto, java.lang.String ofacTipoAfectaci, java.util.Date fecModifico, java.lang.String ofacAplicaOficio, java.util.Date ofacFecAprobacion, java.util.Date ofacFecModAprob, java.util.Date ofacFecOfic, java.lang.String ofacLeyendaJustif, java.lang.String ofacNumAutoriza, java.lang.String ofacProyRegulA, java.lang.String ofacProyRegulR, double ofacTotalAmpliacion, double ofacTotalReduccion, boolean ofacTotalSecuencia, boolean ofacTotalSecSiaff, java.lang.String ofacUsrAprobacion, java.lang.String usuario){    
        this.idOficioAfecta = idOficioAfecta;
        this.ofacCiclo = ofacCiclo;
        this.idSitAfectaci = idSitAfectaci;
        this.idTipoDocto = idTipoDocto;
        this.ofacTipoAfectaci = ofacTipoAfectaci;
        this.fecModifico = fecModifico;
        this.ofacAplicaOficio = ofacAplicaOficio;
        this.ofacFecAprobacion = ofacFecAprobacion;
        this.ofacFecModAprob = ofacFecModAprob;
        this.ofacFecOfic = ofacFecOfic;
        this.ofacLeyendaJustif = ofacLeyendaJustif;
        this.ofacNumAutoriza = ofacNumAutoriza;
        this.ofacProyRegulA = ofacProyRegulA;
        this.ofacProyRegulR = ofacProyRegulR;
        this.ofacTotalAmpliacion = ofacTotalAmpliacion;
        this.ofacTotalReduccion = ofacTotalReduccion;
        this.ofacTotalSecuencia = ofacTotalSecuencia;
        this.ofacTotalSecSiaff = ofacTotalSecSiaff;
        this.ofacUsrAprobacion = ofacUsrAprobacion;
        this.usuario = usuario;
    }    

    
    /**
     * Set idOficioAfecta value.
     *
     * @param idOficioAfecta java.lang.Long
     */
    public void setIdOficioAfecta(java.lang.Long idOficioAfecta){
        this.idOficioAfecta = idOficioAfecta;
    }
    
    /**
     * Get idOficioAfecta value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdOficioAfecta() {
        return this.idOficioAfecta;    
    }
    
    /**
     * Set ofacCiclo value.
     *
     * @param ofacCiclo java.lang.Integer
     */
    public void setOfacCiclo(java.lang.Integer ofacCiclo){
        this.ofacCiclo = ofacCiclo;
    }
    
    /**
     * Get ofacCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getOfacCiclo() {
        return this.ofacCiclo;    
    }
    
    /**
     * Set idSitAfectaci value.
     *
     * @param idSitAfectaci java.lang.String
     */
    public void setIdSitAfectaci(java.lang.String idSitAfectaci){
        this.idSitAfectaci = idSitAfectaci;
    }
    
    /**
     * Get idSitAfectaci value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitAfectaci() {
        return this.idSitAfectaci;    
    }
    
    /**
     * Set idTipoDocto value.
     *
     * @param idTipoDocto java.lang.String
     */
    public void setIdTipoDocto(java.lang.String idTipoDocto){
        this.idTipoDocto = idTipoDocto;
    }
    
    /**
     * Get idTipoDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoDocto() {
        return this.idTipoDocto;    
    }
    
    /**
     * Set ofacTipoAfectaci value.
     *
     * @param ofacTipoAfectaci java.lang.String
     */
    public void setOfacTipoAfectaci(java.lang.String ofacTipoAfectaci){
        this.ofacTipoAfectaci = ofacTipoAfectaci;
    }
    
    /**
     * Get ofacTipoAfectaci value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacTipoAfectaci() {
        return this.ofacTipoAfectaci;    
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
     * Set ofacAplicaOficio value.
     *
     * @param ofacAplicaOficio java.lang.String
     */
    public void setOfacAplicaOficio(java.lang.String ofacAplicaOficio){
        this.ofacAplicaOficio = ofacAplicaOficio;
    }
    
    /**
     * Get ofacAplicaOficio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacAplicaOficio() {
        return this.ofacAplicaOficio;    
    }
    
    /**
     * Set ofacFecAprobacion value.
     *
     * @param ofacFecAprobacion java.util.Date
     */
    public void setOfacFecAprobacion(java.util.Date ofacFecAprobacion){
        this.ofacFecAprobacion = ofacFecAprobacion;
    }
    
    /**
     * Get ofacFecAprobacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecAprobacion() {
        return this.ofacFecAprobacion;    
    }
    
    /**
     * Set ofacFecModAprob value.
     *
     * @param ofacFecModAprob java.util.Date
     */
    public void setOfacFecModAprob(java.util.Date ofacFecModAprob){
        this.ofacFecModAprob = ofacFecModAprob;
    }
    
    /**
     * Get ofacFecModAprob value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecModAprob() {
        return this.ofacFecModAprob;    
    }
    
    /**
     * Set ofacFecOfic value.
     *
     * @param ofacFecOfic java.util.Date
     */
    public void setOfacFecOfic(java.util.Date ofacFecOfic){
        this.ofacFecOfic = ofacFecOfic;
    }
    
    /**
     * Get ofacFecOfic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecOfic() {
        return this.ofacFecOfic;    
    }
    
    /**
     * Set ofacLeyendaJustif value.
     *
     * @param ofacLeyendaJustif java.lang.String
     */
    public void setOfacLeyendaJustif(java.lang.String ofacLeyendaJustif){
        this.ofacLeyendaJustif = ofacLeyendaJustif;
    }
    
    /**
     * Get ofacLeyendaJustif value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacLeyendaJustif() {
        return this.ofacLeyendaJustif;    
    }
    
    /**
     * Set ofacNumAutoriza value.
     *
     * @param ofacNumAutoriza java.lang.String
     */
    public void setOfacNumAutoriza(java.lang.String ofacNumAutoriza){
        this.ofacNumAutoriza = ofacNumAutoriza;
    }
    
    /**
     * Get ofacNumAutoriza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacNumAutoriza() {
        return this.ofacNumAutoriza;    
    }
    
    /**
     * Set ofacProyRegulA value.
     *
     * @param ofacProyRegulA java.lang.String
     */
    public void setOfacProyRegulA(java.lang.String ofacProyRegulA){
        this.ofacProyRegulA = ofacProyRegulA;
    }
    
    /**
     * Get ofacProyRegulA value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacProyRegulA() {
        return this.ofacProyRegulA;    
    }
    
    /**
     * Set ofacProyRegulR value.
     *
     * @param ofacProyRegulR java.lang.String
     */
    public void setOfacProyRegulR(java.lang.String ofacProyRegulR){
        this.ofacProyRegulR = ofacProyRegulR;
    }
    
    /**
     * Get ofacProyRegulR value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacProyRegulR() {
        return this.ofacProyRegulR;    
    }
    
    /**
     * Set ofacTotalAmpliacion value.
     *
     * @param ofacTotalAmpliacion double
     */
    public void setOfacTotalAmpliacion(double ofacTotalAmpliacion){
        this.ofacTotalAmpliacion = ofacTotalAmpliacion;
    }
    
    /**
     * Get ofacTotalAmpliacion value.
     *
     * @return double
     */
    public double getOfacTotalAmpliacion() {
        return this.ofacTotalAmpliacion;    
    }
    
    /**
     * Set ofacTotalReduccion value.
     *
     * @param ofacTotalReduccion double
     */
    public void setOfacTotalReduccion(double ofacTotalReduccion){
        this.ofacTotalReduccion = ofacTotalReduccion;
    }
    
    /**
     * Get ofacTotalReduccion value.
     *
     * @return double
     */
    public double getOfacTotalReduccion() {
        return this.ofacTotalReduccion;    
    }
    
    /**
     * Set ofacTotalSecuencia value.
     *
     * @param ofacTotalSecuencia boolean
     */
    public void setOfacTotalSecuencia(boolean ofacTotalSecuencia){
        this.ofacTotalSecuencia = ofacTotalSecuencia;
    }
    
    /**
     * Get ofacTotalSecuencia value.
     *
     * @return boolean
     */
    public boolean isOfacTotalSecuencia() {
        return this.ofacTotalSecuencia;    
    }
    
    /**
     * Set ofacTotalSecSiaff value.
     *
     * @param ofacTotalSecSiaff boolean
     */
    public void setOfacTotalSecSiaff(boolean ofacTotalSecSiaff){
        this.ofacTotalSecSiaff = ofacTotalSecSiaff;
    }
    
    /**
     * Get ofacTotalSecSiaff value.
     *
     * @return boolean
     */
    public boolean isOfacTotalSecSiaff() {
        return this.ofacTotalSecSiaff;    
    }
    
    /**
     * Set ofacUsrAprobacion value.
     *
     * @param ofacUsrAprobacion java.lang.String
     */
    public void setOfacUsrAprobacion(java.lang.String ofacUsrAprobacion){
        this.ofacUsrAprobacion = ofacUsrAprobacion;
    }
    
    /**
     * Get ofacUsrAprobacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacUsrAprobacion() {
        return this.ofacUsrAprobacion;    
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