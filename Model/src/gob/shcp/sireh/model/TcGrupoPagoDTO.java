package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TcGrupoPago data.
 */
public class TcGrupoPagoDTO  implements java.io.Serializable, Model {    

    @NotBlank(errorCode="not.null")
    @MaxLength(1)    
    private java.lang.String idGrupoPago;
    @MaxLength(25)    
    private java.lang.String descGrupoPago;
    private java.util.Date fecModifico;
    @MaxLength(13)    
    private java.lang.String usuario;
    private java.util.List <TnNominaDTO> tnNominas;

    /**
     * Constructor for TcGrupoPagoDTO class.
     */
    public TcGrupoPagoDTO() { }    

                    
    /**
     * Constructor for TcGrupoPagoDTO class.
     *
     * @param idGrupoPago java.lang.String
     * @param descGrupoPago java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcGrupoPagoDTO( java.lang.String idGrupoPago, java.lang.String descGrupoPago, java.util.Date fecModifico, java.lang.String usuario, java.util.List <TnNominaDTO> tnNominas){    
        this.idGrupoPago = idGrupoPago;
        this.descGrupoPago = descGrupoPago;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.tnNominas = tnNominas;
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
     * Set descGrupoPago value.
     *
     * @param descGrupoPago java.lang.String
     */
    public void setDescGrupoPago(java.lang.String descGrupoPago){
        this.descGrupoPago = descGrupoPago;
    }
    
    /**
     * Get descGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescGrupoPago() {
        return this.descGrupoPago;    
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
     * Set tnNominas value.
     *
     * @param tnNominas java.util.List
     */
    public void setTnNominas(java.util.List <TnNominaDTO> tnNominas ){
        this.tnNominas = tnNominas;
    }
    
    /**
     * Get tnNominas value.
     *
     * @return java.util.List
     */
    public java.util.List getTnNominas() {    
        return this.tnNominas;
    }


}