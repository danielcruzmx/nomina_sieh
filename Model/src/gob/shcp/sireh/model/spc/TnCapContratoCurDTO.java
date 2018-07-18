package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnCapContratoCur data.
 */
public class TnCapContratoCurDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idContratoCurso;
    @NotNull
    private int idSituacionContrato;
    @NotNull
    private int idTipoContratacion;
    @NotNull
    private int contratoCursoCiclo;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(600)    
    private java.lang.String contratoCursoDesc;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(80)    
    private java.lang.String contratoCursoNumero;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(240)    
    private java.lang.String contratoCursoRep1;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(240)    
    private java.lang.String contratoCursoAdministrador;
    private java.util.Date contratoCursoFechaAdjud;
    private java.util.Date contratoCursoFechaContr;
    private java.lang.Double contratoCursoMonto;
    @MaxLength(240)    
    private java.lang.String contratoCursoRep2;
    @MaxLength(240)    
    private java.lang.String contratoCursoRep3;

    /**
     * Constructor for TnCapContratoCurDTO class.
     */
    public TnCapContratoCurDTO() { }    

                                                                
    /**
     * Constructor for TnCapContratoCurDTO class.
     *
     * @param idContratoCurso java.lang.Integer
     * @param idSituacionContrato int
     * @param idTipoContratacion int
     * @param contratoCursoCiclo int
     * @param contratoCursoDesc java.lang.String
     * @param contratoCursoNumero java.lang.String
     * @param contratoCursoRep1 java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param contratoCursoAdministrador java.lang.String
     * @param contratoCursoFechaAdjud java.util.Date
     * @param contratoCursoFechaContr java.util.Date
     * @param contratoCursoMonto java.lang.Double
     * @param contratoCursoRep2 java.lang.String
     * @param contratoCursoRep3 java.lang.String
     */
    public TnCapContratoCurDTO( java.lang.Integer idContratoCurso, int idSituacionContrato, int idTipoContratacion, int contratoCursoCiclo, java.lang.String contratoCursoDesc, java.lang.String contratoCursoNumero, java.lang.String contratoCursoRep1, java.util.Date fecModifico, java.lang.String usuario, java.lang.String contratoCursoAdministrador, java.util.Date contratoCursoFechaAdjud, java.util.Date contratoCursoFechaContr, java.lang.Double contratoCursoMonto, java.lang.String contratoCursoRep2, java.lang.String contratoCursoRep3){    
        this.idContratoCurso = idContratoCurso;
        this.idSituacionContrato = idSituacionContrato;
        this.idTipoContratacion = idTipoContratacion;
        this.contratoCursoCiclo = contratoCursoCiclo;
        this.contratoCursoDesc = contratoCursoDesc;
        this.contratoCursoNumero = contratoCursoNumero;
        this.contratoCursoRep1 = contratoCursoRep1;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.contratoCursoAdministrador = contratoCursoAdministrador;
        this.contratoCursoFechaAdjud = contratoCursoFechaAdjud;
        this.contratoCursoFechaContr = contratoCursoFechaContr;
        this.contratoCursoMonto = contratoCursoMonto;
        this.contratoCursoRep2 = contratoCursoRep2;
        this.contratoCursoRep3 = contratoCursoRep3;
    }    

    
    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso){
        this.idContratoCurso = idContratoCurso;
    }
    
    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        return this.idContratoCurso;    
    }
    
    /**
     * Set idSituacionContrato value.
     *
     * @param idSituacionContrato int
     */
    public void setIdSituacionContrato(int idSituacionContrato){
        this.idSituacionContrato = idSituacionContrato;
    }
    
    /**
     * Get idSituacionContrato value.
     *
     * @return int
     */
    public int getIdSituacionContrato() {
        return this.idSituacionContrato;    
    }
    
    /**
     * Set idTipoContratacion value.
     *
     * @param idTipoContratacion int
     */
    public void setIdTipoContratacion(int idTipoContratacion){
        this.idTipoContratacion = idTipoContratacion;
    }
    
    /**
     * Get idTipoContratacion value.
     *
     * @return int
     */
    public int getIdTipoContratacion() {
        return this.idTipoContratacion;    
    }
    
    /**
     * Set contratoCursoCiclo value.
     *
     * @param contratoCursoCiclo int
     */
    public void setContratoCursoCiclo(int contratoCursoCiclo){
        this.contratoCursoCiclo = contratoCursoCiclo;
    }
    
    /**
     * Get contratoCursoCiclo value.
     *
     * @return int
     */
    public int getContratoCursoCiclo() {
        return this.contratoCursoCiclo;    
    }
    
    /**
     * Set contratoCursoDesc value.
     *
     * @param contratoCursoDesc java.lang.String
     */
    public void setContratoCursoDesc(java.lang.String contratoCursoDesc){
        this.contratoCursoDesc = contratoCursoDesc;
    }
    
    /**
     * Get contratoCursoDesc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoDesc() {
        return this.contratoCursoDesc;    
    }
    
    /**
     * Set contratoCursoNumero value.
     *
     * @param contratoCursoNumero java.lang.String
     */
    public void setContratoCursoNumero(java.lang.String contratoCursoNumero){
        this.contratoCursoNumero = contratoCursoNumero;
    }
    
    /**
     * Get contratoCursoNumero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoNumero() {
        return this.contratoCursoNumero;    
    }
    
    /**
     * Set contratoCursoRep1 value.
     *
     * @param contratoCursoRep1 java.lang.String
     */
    public void setContratoCursoRep1(java.lang.String contratoCursoRep1){
        this.contratoCursoRep1 = contratoCursoRep1;
    }
    
    /**
     * Get contratoCursoRep1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep1() {
        return this.contratoCursoRep1;    
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
     * Set contratoCursoAdministrador value.
     *
     * @param contratoCursoAdministrador java.lang.String
     */
    public void setContratoCursoAdministrador(java.lang.String contratoCursoAdministrador){
        this.contratoCursoAdministrador = contratoCursoAdministrador;
    }
    
    /**
     * Get contratoCursoAdministrador value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoAdministrador() {
        return this.contratoCursoAdministrador;    
    }
    
    /**
     * Set contratoCursoFechaAdjud value.
     *
     * @param contratoCursoFechaAdjud java.util.Date
     */
    public void setContratoCursoFechaAdjud(java.util.Date contratoCursoFechaAdjud){
        this.contratoCursoFechaAdjud = contratoCursoFechaAdjud;
    }
    
    /**
     * Get contratoCursoFechaAdjud value.
     *
     * @return java.util.Date
     */
    public java.util.Date getContratoCursoFechaAdjud() {
        return this.contratoCursoFechaAdjud;    
    }
    
    /**
     * Set contratoCursoFechaContr value.
     *
     * @param contratoCursoFechaContr java.util.Date
     */
    public void setContratoCursoFechaContr(java.util.Date contratoCursoFechaContr){
        this.contratoCursoFechaContr = contratoCursoFechaContr;
    }
    
    /**
     * Get contratoCursoFechaContr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getContratoCursoFechaContr() {
        return this.contratoCursoFechaContr;    
    }
    
    /**
     * Set contratoCursoMonto value.
     *
     * @param contratoCursoMonto java.lang.Double
     */
    public void setContratoCursoMonto(java.lang.Double contratoCursoMonto){
        this.contratoCursoMonto = contratoCursoMonto;
    }
    
    /**
     * Get contratoCursoMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getContratoCursoMonto() {
        return this.contratoCursoMonto;    
    }
    
    /**
     * Set contratoCursoRep2 value.
     *
     * @param contratoCursoRep2 java.lang.String
     */
    public void setContratoCursoRep2(java.lang.String contratoCursoRep2){
        this.contratoCursoRep2 = contratoCursoRep2;
    }
    
    /**
     * Get contratoCursoRep2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep2() {
        return this.contratoCursoRep2;    
    }
    
    /**
     * Set contratoCursoRep3 value.
     *
     * @param contratoCursoRep3 java.lang.String
     */
    public void setContratoCursoRep3(java.lang.String contratoCursoRep3){
        this.contratoCursoRep3 = contratoCursoRep3;
    }
    
    /**
     * Get contratoCursoRep3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep3() {
        return this.contratoCursoRep3;    
    }


}