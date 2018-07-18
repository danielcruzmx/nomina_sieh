package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcUnidad data.
 */
public class TcUnidadDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(12)    
    private java.lang.String idUnidad;
    private java.lang.Integer uniCiclo;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(480)    
    private java.lang.String descUnidad;
    @MaxLength(180)    
    private java.lang.String descUnidadAbrev;
    @MaxLength(12)    
    private java.lang.String idUnidadSubse;
    @MaxLength(4)    
    private java.lang.String uniCentralForanea;
    private java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom;
    private java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre;
    private java.util.List <TdPlazaDTO> tdPlazas;

    /**
     * Constructor for TcUnidadDTO class.
     */
    public TcUnidadDTO() { }    

                                    
    /**
     * Constructor for TcUnidadDTO class.
     *
     * @param idUnidad java.lang.String
     * @param uniCiclo java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descUnidad java.lang.String
     * @param descUnidadAbrev java.lang.String
     * @param idUnidadSubse java.lang.String
     * @param uniCentralForanea java.lang.String
     */
    public TcUnidadDTO( java.lang.String idUnidad, java.lang.Integer uniCiclo, java.util.Date fecModifico, java.lang.String usuario, java.lang.String descUnidad, java.lang.String descUnidadAbrev, java.lang.String idUnidadSubse, java.lang.String uniCentralForanea, java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom, java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre, java.util.List <TdPlazaDTO> tdPlazas){    
        this.idUnidad = idUnidad;
        this.uniCiclo = uniCiclo;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descUnidad = descUnidad;
        this.descUnidadAbrev = descUnidadAbrev;
        this.idUnidadSubse = idUnidadSubse;
        this.uniCentralForanea = uniCentralForanea;
        this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom = tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom;
        this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre = tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre;
        this.tdPlazas = tdPlazas;
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
     * Set uniCiclo value.
     *
     * @param uniCiclo java.lang.Integer
     */
    public void setUniCiclo(java.lang.Integer uniCiclo){
        this.uniCiclo = uniCiclo;
    }
    
    /**
     * Get uniCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getUniCiclo() {
        return this.uniCiclo;    
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
     * Set descUnidad value.
     *
     * @param descUnidad java.lang.String
     */
    public void setDescUnidad(java.lang.String descUnidad){
        this.descUnidad = descUnidad;
    }
    
    /**
     * Get descUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescUnidad() {
        return this.descUnidad;    
    }
    
    /**
     * Set descUnidadAbrev value.
     *
     * @param descUnidadAbrev java.lang.String
     */
    public void setDescUnidadAbrev(java.lang.String descUnidadAbrev){
        this.descUnidadAbrev = descUnidadAbrev;
    }
    
    /**
     * Get descUnidadAbrev value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescUnidadAbrev() {
        return this.descUnidadAbrev;    
    }
    
    /**
     * Set idUnidadSubse value.
     *
     * @param idUnidadSubse java.lang.String
     */
    public void setIdUnidadSubse(java.lang.String idUnidadSubse){
        this.idUnidadSubse = idUnidadSubse;
    }
    
    /**
     * Get idUnidadSubse value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadSubse() {
        return this.idUnidadSubse;    
    }
    
    /**
     * Set uniCentralForanea value.
     *
     * @param uniCentralForanea java.lang.String
     */
    public void setUniCentralForanea(java.lang.String uniCentralForanea){
        this.uniCentralForanea = uniCentralForanea;
    }
    
    /**
     * Get uniCentralForanea value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUniCentralForanea() {
        return this.uniCentralForanea;    
    }
    /**
     * Set tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom value.
     *
     * @param tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom java.util.List
     */
    public void setTnHistoricoPagosByHpCicloUnidadAndIdUnidadNom(java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom ){
        this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom = tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom;
    }
    
    /**
     * Get tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom value.
     *
     * @return java.util.List
     */
    public java.util.List getTnHistoricoPagosByHpCicloUnidadAndIdUnidadNom() {    
        return this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadNom;
    }
    /**
     * Set tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre value.
     *
     * @param tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre java.util.List
     */
    public void setTnHistoricoPagosByHpCicloUnidadAndIdUnidadPre(java.util.List <TnHistoricoPagoDTO> tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre ){
        this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre = tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre;
    }
    
    /**
     * Get tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre value.
     *
     * @return java.util.List
     */
    public java.util.List getTnHistoricoPagosByHpCicloUnidadAndIdUnidadPre() {    
        return this.tnHistoricoPagosByHpCicloUnidadAndIdUnidadPre;
    }
    /**
     * Set tdPlazas value.
     *
     * @param tdPlazas java.util.List
     */
    public void setTdPlazas(java.util.List <TdPlazaDTO> tdPlazas ){
        this.tdPlazas = tdPlazas;
    }
    
    /**
     * Get tdPlazas value.
     *
     * @return java.util.List
     */
    public java.util.List getTdPlazas() {    
        return this.tdPlazas;
    }


}