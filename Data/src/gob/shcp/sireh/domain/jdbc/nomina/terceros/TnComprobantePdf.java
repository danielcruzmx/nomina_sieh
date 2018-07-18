package gob.shcp.sireh.domain.jdbc.nomina.terceros;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import gob.shcp.sireh.domain.jdbc.TnComprobanteDigPK;

import java.io.Serializable;

import java.sql.Blob;

/**
 * Domain object for persistent TnComprobantePdf data.
 */
public class TnComprobantePdf implements Domain, Serializable {
    private TnComprobantePdfPK idComposite;
                        private java.util.Date fecModifico;
                        private java.lang.String usuario;
                        private  byte[] cnArchivoPdf;
                        private java.lang.Integer cnConsecNomina;
                        private java.lang.Integer cnEjercicio;
                        private java.lang.String cnRfc;
                        
            
    /**
     * Constructor for TnComprobantePdf class.
     */
    public TnComprobantePdf() { }
                                                                                                                                                                    
    /**
     * Constructor for TnComprobantePdf class.
     *
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cnArchivoPdf java.sql.Blob
     * @param cnConsecNomina java.lang.Integer
     * @param cnEjercicio java.lang.Integer
     * @param cnRfc java.lang.String
     */
    public TnComprobantePdf( TnComprobantePdfPK idComposite, java.util.Date fecModifico, java.lang.String usuario,  byte[] cnArchivoPdf, java.lang.Integer cnConsecNomina, java.lang.Integer cnEjercicio, java.lang.String cnRfc) {
        this.idComposite = idComposite;
                            this.fecModifico = fecModifico;
                            this.usuario = usuario;
                            this.cnArchivoPdf = cnArchivoPdf;
                            this.cnConsecNomina = cnConsecNomina;
                            this.cnEjercicio = cnEjercicio;
                            this.cnRfc = cnRfc;
                }


    /**
     * Get cnDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnDifFolio() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getCnDifFolio();
        }

    /**
     * Get cnFolio value.
     *
     * @return java.lang.Long
     */
    public Long getCnFolio() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getCnFolio();
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
            return this.usuario;
        }

    /**
     * Get cnArchivoPdf value.
     *
     * @return java.sql.Blob
     */
    public  byte[] getCnArchivoPdf() {
            return this.cnArchivoPdf;
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
     * Get cnEjercicio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnEjercicio() {
            return this.cnEjercicio;
        }

    /**
     * Get cnRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnRfc() {
            return this.cnRfc;
        }

    
    /**
     * Set cnDifFolio value.
     *
     * @param cnDifFolio java.lang.Integer
     */
    public void setCnDifFolio(java.lang.Integer cnDifFolio) {
            if(idComposite == null) {
            idComposite = new TnComprobantePdfPK();
        }
        this.idComposite.setCnDifFolio(cnDifFolio);
        }
    
    /**
     * Set cnFolio value.
     *
     * @param cnFolio java.lang.Long
     */
    public void setCnFolio(Long cnFolio) {
            if(idComposite == null) {
            idComposite = new TnComprobantePdfPK();
        }
        this.idComposite.setCnFolio(cnFolio);
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
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
            this.usuario = usuario;
        }
    
    /**
     * Set cnArchivoPdf value.
     *
     * @param cnArchivoPdf java.sql.Blob
     */
    public void setCnArchivoPdf( byte[] cnArchivoPdf) {
            this.cnArchivoPdf = cnArchivoPdf;
        }
    
    /**
     * Set cnConsecNomina value.
     *
     * @param cnConsecNomina java.lang.Integer
     */
    public void setCnConsecNomina(java.lang.Integer cnConsecNomina) {
            this.cnConsecNomina = cnConsecNomina;
        }
    
    /**
     * Set cnEjercicio value.
     *
     * @param cnEjercicio java.lang.Integer
     */
    public void setCnEjercicio(java.lang.Integer cnEjercicio) {
            this.cnEjercicio = cnEjercicio;
        }
    
    /**
     * Set cnRfc value.
     *
     * @param cnRfc java.lang.String
     */
    public void setCnRfc(java.lang.String cnRfc) {
            this.cnRfc = cnRfc;
        }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = ( TnComprobantePdfPK ) idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }


}
