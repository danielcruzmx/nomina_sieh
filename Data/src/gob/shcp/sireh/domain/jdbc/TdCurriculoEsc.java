package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdCurriculoEsc data.
 */
public class TdCurriculoEsc implements Domain, Serializable {
                    @PrimaryKey
            private java.lang.String curriceRfc;
                private java.util.Date fecModifico;
                private java.lang.String usuario;
                private java.lang.String curriceDocto;
                private java.lang.String curriceEscolaridad;
                private java.lang.String curriceGradoAvance;
                private java.lang.String curriceInstEduc;
                private java.lang.String curriceCarrera;
    
    /**
     * Constructor for TdCurriculoEsc class.
     */
    public TdCurriculoEsc() { }
                                
    /**
     * Constructor for TdCurriculoEsc class.
     *
     * @param curriceRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param curriceDocto java.lang.String
     * @param curriceEscolaridad java.lang.String
     * @param curriceGradoAvance java.lang.String
     * @param curriceInstEduc java.lang.String
     */
    public TdCurriculoEsc( java.lang.String curriceRfc, java.util.Date fecModifico, java.lang.String usuario, java.lang.String curriceDocto, java.lang.String curriceEscolaridad, java.lang.String curriceGradoAvance, java.lang.String curriceInstEduc, java.lang.String curriceCarrera) {
            this.curriceRfc = curriceRfc;
            this.fecModifico = fecModifico;
            this.usuario = usuario;
            this.curriceDocto = curriceDocto;
            this.curriceEscolaridad = curriceEscolaridad;
            this.curriceGradoAvance = curriceGradoAvance;
            this.curriceInstEduc = curriceInstEduc;
            this.curriceCarrera = curriceCarrera;
        }


    /**
     * Get curriceRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceRfc() {
            return this.curriceRfc;
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
     * Get curriceDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceDocto() {
            return this.curriceDocto;
        }

    /**
     * Get curriceEscolaridad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceEscolaridad() {
            return this.curriceEscolaridad;
        }

    /**
     * Get curriceGradoAvance value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceGradoAvance() {
            return this.curriceGradoAvance;
        }

    /**
     * Get curriceInstEduc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceInstEduc() {
            return this.curriceInstEduc;
        }

    /**
     * Get curriceCarrera value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriceCarrera() {
            return this.curriceCarrera;
        }

    
    /**
     * Set curriceRfc value.
     *
     * @param curriceRfc java.lang.String
     */
    public void setCurriceRfc(java.lang.String curriceRfc) {
            this.curriceRfc = curriceRfc;
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
     * Set curriceDocto value.
     *
     * @param curriceDocto java.lang.String
     */
    public void setCurriceDocto(java.lang.String curriceDocto) {
            this.curriceDocto = curriceDocto;
        }
    
    /**
     * Set curriceEscolaridad value.
     *
     * @param curriceEscolaridad java.lang.String
     */
    public void setCurriceEscolaridad(java.lang.String curriceEscolaridad) {
            this.curriceEscolaridad = curriceEscolaridad;
        }
    
    /**
     * Set curriceGradoAvance value.
     *
     * @param curriceGradoAvance java.lang.String
     */
    public void setCurriceGradoAvance(java.lang.String curriceGradoAvance) {
            this.curriceGradoAvance = curriceGradoAvance;
        }
    
    /**
     * Set curriceInstEduc value.
     *
     * @param curriceInstEduc java.lang.String
     */
    public void setCurriceInstEduc(java.lang.String curriceInstEduc) {
            this.curriceInstEduc = curriceInstEduc;
        }

    /**
     * Set curriceCarrera value.
     *
     * @param curriceCarrera java.lang.String
     */
    public void setCurriceCarrera(java.lang.String curriceCarrera) {
            this.curriceCarrera = curriceCarrera;
        }


    /**
     * Set identity value.
     *
     * @param curriceRfc Serializable
     */
    public void setIdentity(Serializable curriceRfc) {
        this.curriceRfc = ( java.lang.String ) curriceRfc;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.curriceRfc;
    }
}
