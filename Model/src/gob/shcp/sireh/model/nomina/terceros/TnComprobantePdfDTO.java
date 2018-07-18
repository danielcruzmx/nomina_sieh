package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

import java.sql.Blob;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnComprobantePdf data.
 */
public class TnComprobantePdfDTO  implements java.io.Serializable, Model {    

    @NotNull
    private Integer cnDifFolio;
    @NotNull
    private Long cnFolio;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    private byte[] cnArchivoPdf;
    private java.lang.Integer cnConsecNomina;
    private java.lang.Integer cnEjercicio;
    @MaxLength(13)    
    private java.lang.String cnRfc;
    private Blob cnArchivoPdfBlob;

    /**
     * Constructor for TnComprobantePdfDTO class.
     */
    public TnComprobantePdfDTO() { }    

                                    
    /**
     * Constructor for TnComprobantePdfDTO class.
     *
     * @param cnDifFolio int
     * @param cnFolio long
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cnArchivoPdf java.sql.Blob
     * @param cnConsecNomina java.lang.Integer
     * @param cnEjercicio java.lang.Integer
     * @param cnRfc java.lang.String
     */
    public TnComprobantePdfDTO( Integer cnDifFolio, Long cnFolio, java.util.Date fecModifico, java.lang.String usuario, byte[] cnArchivoPdf, java.lang.Integer cnConsecNomina, java.lang.Integer cnEjercicio, java.lang.String cnRfc, Blob cnArchivoPdfBlob){    
        this.cnDifFolio = cnDifFolio;
        this.cnFolio = cnFolio;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cnArchivoPdf = cnArchivoPdf;
        this.cnConsecNomina = cnConsecNomina;
        this.cnEjercicio = cnEjercicio;
        this.cnRfc = cnRfc;
        this.cnArchivoPdfBlob = cnArchivoPdfBlob;
    }    

    
    /**
     * Set cnDifFolio value.
     *
     * @param cnDifFolio int
     */
    public void setCnDifFolio(Integer cnDifFolio){
        this.cnDifFolio = cnDifFolio;
    }
    
    /**
     * Get cnDifFolio value.
     *
     * @return int
     */
    public Integer getCnDifFolio() {
        return this.cnDifFolio;    
    }
    
    /**
     * Set cnFolio value.
     *
     * @param cnFolio long
     */
    public void setCnFolio(Long cnFolio){
        this.cnFolio = cnFolio;
    }
    
    /**
     * Get cnFolio value.
     *
     * @return long
     */
    public Long getCnFolio() {
        return this.cnFolio;    
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
     * Set cnArchivoPdf value.
     *
     * @param cnArchivoPdf java.sql.Blob
     */
    public void setCnArchivoPdf(byte[] cnArchivoPdf){
        this.cnArchivoPdf = cnArchivoPdf;
    }
    
    /**
     * Get cnArchivoPdf value.
     *
     * @return java.sql.Blob
     */
    public byte[] getCnArchivoPdf() {
        return this.cnArchivoPdf;    
    }
    
    /**
     * Set cnConsecNomina value.
     *
     * @param cnConsecNomina java.lang.Integer
     */
    public void setCnConsecNomina(java.lang.Integer cnConsecNomina){
        this.cnConsecNomina = cnConsecNomina;
    }
    
    /**
     * Get cnConsecNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnConsecNomina() {
        return this.cnConsecNomina;    
    }
    
    /**
     * Set cnEjercicio value.
     *
     * @param cnEjercicio java.lang.Integer
     */
    public void setCnEjercicio(java.lang.Integer cnEjercicio){
        this.cnEjercicio = cnEjercicio;
    }
    
    /**
     * Get cnEjercicio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnEjercicio() {
        return this.cnEjercicio;    
    }
    
    /**
     * Set cnRfc value.
     *
     * @param cnRfc java.lang.String
     */
    public void setCnRfc(java.lang.String cnRfc){
        this.cnRfc = cnRfc;
    }
    
    /**
     * Get cnRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnRfc() {
        return this.cnRfc;    
    }


    public void setCnArchivoPdfBlob(Blob cnArchivoPdfBlob) {
        this.cnArchivoPdfBlob = cnArchivoPdfBlob;
    }

    public Blob getCnArchivoPdfBlob() {
        return cnArchivoPdfBlob;
    }
}
