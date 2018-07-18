package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdCurriculoExpl data.
 */
public class TdCurriculoExpl implements Domain, Serializable {
                    @PrimaryKey
            private java.lang.String curriclRfc;
                private java.util.Date fecModifico;
                private java.lang.String usuario;
                private java.lang.String curriclArea1;
                private java.lang.String curriclArea2;
                private java.lang.String curriclArea3;
                private java.lang.String curriclFecFin1;
                private java.lang.String curriclFecFin2;
                private java.lang.String curriclFecFin3;
                private java.lang.String curriclFecIni1;
                private java.lang.String curriclFecIni2;
                private java.lang.String curriclFecIni3;
                private java.lang.String curriclFuncion1;
                private java.lang.String curriclFuncion2;
                private java.lang.String curriclFuncion3;
                private java.lang.String curriclLugar1;
                private java.lang.String curriclLugar2;
                private java.lang.String curriclLugar3;
                private java.lang.String curriclPuesto1;
                private java.lang.String curriclPuesto2;
                private java.lang.String curriclPuesto3;
                private java.lang.String curriclSector1;
                private java.lang.String curriclSector2;
                private java.lang.String curriclSector3;
    
    /**
     * Constructor for TdCurriculoExpl class.
     */
    public TdCurriculoExpl() { }
                                                                                                    
    /**
     * Constructor for TdCurriculoExpl class.
     *
     * @param curriclRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param curriclArea1 java.lang.String
     * @param curriclArea2 java.lang.String
     * @param curriclArea3 java.lang.String
     * @param curriclFecFin1 java.util.Date
     * @param curriclFecFin2 java.util.Date
     * @param curriclFecFin3 java.util.Date
     * @param curriclFecIni1 java.util.Date
     * @param curriclFecIni2 java.util.Date
     * @param curriclFecIni3 java.util.Date
     * @param curriclFuncion1 java.lang.String
     * @param curriclFuncion2 java.lang.String
     * @param curriclFuncion3 java.lang.String
     * @param curriclLugar1 java.lang.String
     * @param curriclLugar2 java.lang.String
     * @param curriclLugar3 java.lang.String
     * @param curriclPuesto1 java.lang.String
     * @param curriclPuesto2 java.lang.String
     * @param curriclPuesto3 java.lang.String
     * @param curriclSector1 java.lang.String
     * @param curriclSector2 java.lang.String
     * @param curriclSector3 java.lang.String
     */
    public TdCurriculoExpl( java.lang.String curriclRfc, java.util.Date fecModifico, java.lang.String usuario, java.lang.String curriclArea1, java.lang.String curriclArea2, java.lang.String curriclArea3, java.lang.String curriclFecFin1, java.lang.String curriclFecFin2, java.lang.String curriclFecFin3, java.lang.String curriclFecIni1, java.lang.String curriclFecIni2, java.lang.String curriclFecIni3, java.lang.String curriclFuncion1, java.lang.String curriclFuncion2, java.lang.String curriclFuncion3, java.lang.String curriclLugar1, java.lang.String curriclLugar2, java.lang.String curriclLugar3, java.lang.String curriclPuesto1, java.lang.String curriclPuesto2, java.lang.String curriclPuesto3, java.lang.String curriclSector1, java.lang.String curriclSector2, java.lang.String curriclSector3) {
            this.curriclRfc = curriclRfc;
            this.fecModifico = fecModifico;
            this.usuario = usuario;
            this.curriclArea1 = curriclArea1;
            this.curriclArea2 = curriclArea2;
            this.curriclArea3 = curriclArea3;
            this.curriclFecFin1 = curriclFecFin1;
            this.curriclFecFin2 = curriclFecFin2;
            this.curriclFecFin3 = curriclFecFin3;
            this.curriclFecIni1 = curriclFecIni1;
            this.curriclFecIni2 = curriclFecIni2;
            this.curriclFecIni3 = curriclFecIni3;
            this.curriclFuncion1 = curriclFuncion1;
            this.curriclFuncion2 = curriclFuncion2;
            this.curriclFuncion3 = curriclFuncion3;
            this.curriclLugar1 = curriclLugar1;
            this.curriclLugar2 = curriclLugar2;
            this.curriclLugar3 = curriclLugar3;
            this.curriclPuesto1 = curriclPuesto1;
            this.curriclPuesto2 = curriclPuesto2;
            this.curriclPuesto3 = curriclPuesto3;
            this.curriclSector1 = curriclSector1;
            this.curriclSector2 = curriclSector2;
            this.curriclSector3 = curriclSector3;
        }


    /**
     * Get curriclRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclRfc() {
            return this.curriclRfc;
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
     * Get curriclArea1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclArea1() {
            return this.curriclArea1;
        }

    /**
     * Get curriclArea2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclArea2() {
            return this.curriclArea2;
        }

    /**
     * Get curriclArea3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclArea3() {
            return this.curriclArea3;
        }

    /**
     * Get curriclFecFin1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecFin1() {
            return this.curriclFecFin1;
        }

    /**
     * Get curriclFecFin2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecFin2() {
            return this.curriclFecFin2;
        }

    /**
     * Get curriclFecFin3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecFin3() {
            return this.curriclFecFin3;
        }

    /**
     * Get curriclFecIni1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecIni1() {
            return this.curriclFecIni1;
        }

    /**
     * Get curriclFecIni2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecIni2() {
            return this.curriclFecIni2;
        }

    /**
     * Get curriclFecIni3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFecIni3() {
            return this.curriclFecIni3;
        }

    /**
     * Get curriclFuncion1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFuncion1() {
            return this.curriclFuncion1;
        }

    /**
     * Get curriclFuncion2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFuncion2() {
            return this.curriclFuncion2;
        }

    /**
     * Get curriclFuncion3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclFuncion3() {
            return this.curriclFuncion3;
        }

    /**
     * Get curriclLugar1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclLugar1() {
            return this.curriclLugar1;
        }

    /**
     * Get curriclLugar2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclLugar2() {
            return this.curriclLugar2;
        }

    /**
     * Get curriclLugar3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclLugar3() {
            return this.curriclLugar3;
        }

    /**
     * Get curriclPuesto1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclPuesto1() {
            return this.curriclPuesto1;
        }

    /**
     * Get curriclPuesto2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclPuesto2() {
            return this.curriclPuesto2;
        }

    /**
     * Get curriclPuesto3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclPuesto3() {
            return this.curriclPuesto3;
        }

    /**
     * Get curriclSector1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclSector1() {
            return this.curriclSector1;
        }

    /**
     * Get curriclSector2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclSector2() {
            return this.curriclSector2;
        }

    /**
     * Get curriclSector3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCurriclSector3() {
            return this.curriclSector3;
        }

    
    /**
     * Set curriclRfc value.
     *
     * @param curriclRfc java.lang.String
     */
    public void setCurriclRfc(java.lang.String curriclRfc) {
            this.curriclRfc = curriclRfc;
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
     * Set curriclArea1 value.
     *
     * @param curriclArea1 java.lang.String
     */
    public void setCurriclArea1(java.lang.String curriclArea1) {
            this.curriclArea1 = curriclArea1;
        }
    
    /**
     * Set curriclArea2 value.
     *
     * @param curriclArea2 java.lang.String
     */
    public void setCurriclArea2(java.lang.String curriclArea2) {
            this.curriclArea2 = curriclArea2;
        }
    
    /**
     * Set curriclArea3 value.
     *
     * @param curriclArea3 java.lang.String
     */
    public void setCurriclArea3(java.lang.String curriclArea3) {
            this.curriclArea3 = curriclArea3;
        }
    
    /**
     * Set curriclFecFin1 value.
     *
     * @param curriclFecFin1 java.lang.String
     */
    public void setCurriclFecFin1(java.lang.String curriclFecFin1) {
            this.curriclFecFin1 = curriclFecFin1;
        }
    
    /**
     * Set curriclFecFin2 value.
     *
     * @param curriclFecFin2 java.lang.String
     */
    public void setCurriclFecFin2(java.lang.String curriclFecFin2) {
            this.curriclFecFin2 = curriclFecFin2;
        }
    
    /**
     * Set curriclFecFin3 value.
     *
     * @param curriclFecFin3 java.lang.String
     */
    public void setCurriclFecFin3(java.lang.String curriclFecFin3) {
            this.curriclFecFin3 = curriclFecFin3;
        }
    
    /**
     * Set curriclFecIni1 value.
     *
     * @param curriclFecIni1 java.lang.String
     */
    public void setCurriclFecIni1(java.lang.String curriclFecIni1) {
            this.curriclFecIni1 = curriclFecIni1;
        }
    
    /**
     * Set curriclFecIni2 value.
     *
     * @param curriclFecIni2 java.lang.String
     */
    public void setCurriclFecIni2(java.lang.String curriclFecIni2) {
            this.curriclFecIni2 = curriclFecIni2;
        }
    
    /**
     * Set curriclFecIni3 value.
     *
     * @param curriclFecIni3 java.lang.String
     */
    public void setCurriclFecIni3(java.lang.String curriclFecIni3) {
            this.curriclFecIni3 = curriclFecIni3;
        }
    
    /**
     * Set curriclFuncion1 value.
     *
     * @param curriclFuncion1 java.lang.String
     */
    public void setCurriclFuncion1(java.lang.String curriclFuncion1) {
            this.curriclFuncion1 = curriclFuncion1;
        }
    
    /**
     * Set curriclFuncion2 value.
     *
     * @param curriclFuncion2 java.lang.String
     */
    public void setCurriclFuncion2(java.lang.String curriclFuncion2) {
            this.curriclFuncion2 = curriclFuncion2;
        }
    
    /**
     * Set curriclFuncion3 value.
     *
     * @param curriclFuncion3 java.lang.String
     */
    public void setCurriclFuncion3(java.lang.String curriclFuncion3) {
            this.curriclFuncion3 = curriclFuncion3;
        }
    
    /**
     * Set curriclLugar1 value.
     *
     * @param curriclLugar1 java.lang.String
     */
    public void setCurriclLugar1(java.lang.String curriclLugar1) {
            this.curriclLugar1 = curriclLugar1;
        }
    
    /**
     * Set curriclLugar2 value.
     *
     * @param curriclLugar2 java.lang.String
     */
    public void setCurriclLugar2(java.lang.String curriclLugar2) {
            this.curriclLugar2 = curriclLugar2;
        }
    
    /**
     * Set curriclLugar3 value.
     *
     * @param curriclLugar3 java.lang.String
     */
    public void setCurriclLugar3(java.lang.String curriclLugar3) {
            this.curriclLugar3 = curriclLugar3;
        }
    
    /**
     * Set curriclPuesto1 value.
     *
     * @param curriclPuesto1 java.lang.String
     */
    public void setCurriclPuesto1(java.lang.String curriclPuesto1) {
            this.curriclPuesto1 = curriclPuesto1;
        }
    
    /**
     * Set curriclPuesto2 value.
     *
     * @param curriclPuesto2 java.lang.String
     */
    public void setCurriclPuesto2(java.lang.String curriclPuesto2) {
            this.curriclPuesto2 = curriclPuesto2;
        }
    
    /**
     * Set curriclPuesto3 value.
     *
     * @param curriclPuesto3 java.lang.String
     */
    public void setCurriclPuesto3(java.lang.String curriclPuesto3) {
            this.curriclPuesto3 = curriclPuesto3;
        }
    
    /**
     * Set curriclSector1 value.
     *
     * @param curriclSector1 java.lang.String
     */
    public void setCurriclSector1(java.lang.String curriclSector1) {
            this.curriclSector1 = curriclSector1;
        }
    
    /**
     * Set curriclSector2 value.
     *
     * @param curriclSector2 java.lang.String
     */
    public void setCurriclSector2(java.lang.String curriclSector2) {
            this.curriclSector2 = curriclSector2;
        }
    
    /**
     * Set curriclSector3 value.
     *
     * @param curriclSector3 java.lang.String
     */
    public void setCurriclSector3(java.lang.String curriclSector3) {
            this.curriclSector3 = curriclSector3;
        }


    /**
     * Set identity value.
     *
     * @param curriclRfc Serializable
     */
    public void setIdentity(Serializable curriclRfc) {
        this.curriclRfc = ( java.lang.String ) curriclRfc;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.curriclRfc;
    }
}
