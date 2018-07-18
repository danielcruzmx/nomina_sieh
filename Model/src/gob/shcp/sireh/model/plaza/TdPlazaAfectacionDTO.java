package gob.shcp.sireh.model.plaza;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdPlazaAfectacion data.
 */
public class TdPlazaAfectacionDTO  implements java.io.Serializable, Model {    

    private java.lang.Long idOficioAfecta;
    @NotBlank(errorCode="not.null")
    @MaxLength(2)    
    private java.lang.String idOperacion;
    private java.lang.Integer idPlaza;
    private java.lang.Integer plafCiclo;
    @MaxLength(1)    
    private java.lang.String idGrupoPago;
    @MaxLength(3)    
    private java.lang.String idUnidad;
    private java.util.Date fecModifico;
    private java.lang.Integer idEdo;
    @MaxLength(2)    
    private java.lang.String idJustificacion;
    @MaxLength(7)    
    private java.lang.String idPuesto;
    @MaxLength(1)    
    private java.lang.String idRegularizable;
    private java.lang.Boolean idZonaEcon;
    private java.lang.Integer plafDiasAguinaldo;
    private java.lang.Integer plafDiasPrima;
    private java.util.Date plafFinal;
    private java.util.Date plafInicio;
    @MaxLength(6)    
    private java.lang.String plafProyAmplia;
    @MaxLength(6)    
    private java.lang.String plafProyReduce;
    @MaxLength(13)    
    private java.lang.String usuario;

    /**
     * Constructor for TdPlazaAfectacionDTO class.
     */
    public TdPlazaAfectacionDTO() { }    

                                                                                
    /**
     * Constructor for TdPlazaAfectacionDTO class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param idOperacion java.lang.String
     * @param idPlaza java.lang.Integer
     * @param plafCiclo java.lang.Integer
     * @param idGrupoPago java.lang.String
     * @param idUnidad java.lang.String
     * @param fecModifico java.util.Date
     * @param idEdo java.lang.Integer
     * @param idJustificacion java.lang.String
     * @param idPuesto java.lang.String
     * @param idRegularizable java.lang.String
     * @param idZonaEcon java.lang.Boolean
     * @param plafDiasAguinaldo java.lang.Integer
     * @param plafDiasPrima java.lang.Integer
     * @param plafFinal java.util.Date
     * @param plafInicio java.util.Date
     * @param plafProyAmplia java.lang.String
     * @param plafProyReduce java.lang.String
     * @param usuario java.lang.String
     */
    public TdPlazaAfectacionDTO( java.lang.Long idOficioAfecta, java.lang.String idOperacion, java.lang.Integer idPlaza, java.lang.Integer plafCiclo, java.lang.String idGrupoPago, java.lang.String idUnidad, java.util.Date fecModifico, java.lang.Integer idEdo, java.lang.String idJustificacion, java.lang.String idPuesto, java.lang.String idRegularizable, java.lang.Boolean idZonaEcon, java.lang.Integer plafDiasAguinaldo, java.lang.Integer plafDiasPrima, java.util.Date plafFinal, java.util.Date plafInicio, java.lang.String plafProyAmplia, java.lang.String plafProyReduce, java.lang.String usuario){    
        this.idOficioAfecta = idOficioAfecta;
        this.idOperacion = idOperacion;
        this.idPlaza = idPlaza;
        this.plafCiclo = plafCiclo;
        this.idGrupoPago = idGrupoPago;
        this.idUnidad = idUnidad;
        this.fecModifico = fecModifico;
        this.idEdo = idEdo;
        this.idJustificacion = idJustificacion;
        this.idPuesto = idPuesto;
        this.idRegularizable = idRegularizable;
        this.idZonaEcon = idZonaEcon;
        this.plafDiasAguinaldo = plafDiasAguinaldo;
        this.plafDiasPrima = plafDiasPrima;
        this.plafFinal = plafFinal;
        this.plafInicio = plafInicio;
        this.plafProyAmplia = plafProyAmplia;
        this.plafProyReduce = plafProyReduce;
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
     * Set idOperacion value.
     *
     * @param idOperacion java.lang.String
     */
    public void setIdOperacion(java.lang.String idOperacion){
        this.idOperacion = idOperacion;
    }
    
    /**
     * Get idOperacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdOperacion() {
        return this.idOperacion;    
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
     * Set plafCiclo value.
     *
     * @param plafCiclo java.lang.Integer
     */
    public void setPlafCiclo(java.lang.Integer plafCiclo){
        this.plafCiclo = plafCiclo;
    }
    
    /**
     * Get plafCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafCiclo() {
        return this.plafCiclo;    
    }
    
    /**
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago){
        this.idGrupoPago = idGrupoPago;
    }
    
    /**
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;    
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
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo){
        this.idEdo = idEdo;
    }
    
    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;    
    }
    
    /**
     * Set idJustificacion value.
     *
     * @param idJustificacion java.lang.String
     */
    public void setIdJustificacion(java.lang.String idJustificacion){
        this.idJustificacion = idJustificacion;
    }
    
    /**
     * Get idJustificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJustificacion() {
        return this.idJustificacion;    
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
     * Set idRegularizable value.
     *
     * @param idRegularizable java.lang.String
     */
    public void setIdRegularizable(java.lang.String idRegularizable){
        this.idRegularizable = idRegularizable;
    }
    
    /**
     * Get idRegularizable value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdRegularizable() {
        return this.idRegularizable;    
    }
    
    /**
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Boolean
     */
    public void setIdZonaEcon(java.lang.Boolean idZonaEcon){
        this.idZonaEcon = idZonaEcon;
    }
    
    /**
     * Get idZonaEcon value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdZonaEcon() {
        return this.idZonaEcon;    
    }
    
    /**
     * Set plafDiasAguinaldo value.
     *
     * @param plafDiasAguinaldo java.lang.Integer
     */
    public void setPlafDiasAguinaldo(java.lang.Integer plafDiasAguinaldo){
        this.plafDiasAguinaldo = plafDiasAguinaldo;
    }
    
    /**
     * Get plafDiasAguinaldo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafDiasAguinaldo() {
        return this.plafDiasAguinaldo;    
    }
    
    /**
     * Set plafDiasPrima value.
     *
     * @param plafDiasPrima java.lang.Integer
     */
    public void setPlafDiasPrima(java.lang.Integer plafDiasPrima){
        this.plafDiasPrima = plafDiasPrima;
    }
    
    /**
     * Get plafDiasPrima value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafDiasPrima() {
        return this.plafDiasPrima;    
    }
    
    /**
     * Set plafFinal value.
     *
     * @param plafFinal java.util.Date
     */
    public void setPlafFinal(java.util.Date plafFinal){
        this.plafFinal = plafFinal;
    }
    
    /**
     * Get plafFinal value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlafFinal() {
        return this.plafFinal;    
    }
    
    /**
     * Set plafInicio value.
     *
     * @param plafInicio java.util.Date
     */
    public void setPlafInicio(java.util.Date plafInicio){
        this.plafInicio = plafInicio;
    }
    
    /**
     * Get plafInicio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlafInicio() {
        return this.plafInicio;    
    }
    
    /**
     * Set plafProyAmplia value.
     *
     * @param plafProyAmplia java.lang.String
     */
    public void setPlafProyAmplia(java.lang.String plafProyAmplia){
        this.plafProyAmplia = plafProyAmplia;
    }
    
    /**
     * Get plafProyAmplia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlafProyAmplia() {
        return this.plafProyAmplia;    
    }
    
    /**
     * Set plafProyReduce value.
     *
     * @param plafProyReduce java.lang.String
     */
    public void setPlafProyReduce(java.lang.String plafProyReduce){
        this.plafProyReduce = plafProyReduce;
    }
    
    /**
     * Get plafProyReduce value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlafProyReduce() {
        return this.plafProyReduce;    
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