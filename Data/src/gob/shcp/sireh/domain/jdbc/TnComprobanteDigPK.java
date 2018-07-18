package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnComprobanteDig data.
 */
public class TnComprobanteDigPK implements Serializable {
        private java.lang.Integer cnDifFolio;
            private java.lang.Long cnFolio;
            private java.lang.Integer cnPaquete;
                                                                            
    /**
     * Constructor for TnComprobanteDigPK class.
     */
    public TnComprobanteDigPK() {
    }

                                                                                                
    /**
     * Constructor for TnComprobanteDigPK class.
     *
     * @param cnDifFolio java.lang.Integer
     * @param cnFolio java.lang.Long
     * @param cnPaquete java.lang.Integer
     */
    public TnComprobanteDigPK ( java.lang.Integer cnDifFolio, java.lang.Long cnFolio, java.lang.Integer cnPaquete) {
        this.cnDifFolio = cnDifFolio;
        this.cnFolio = cnFolio;
        this.cnPaquete = cnPaquete;

    }
    
        
    /**
     * Get cnDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnDifFolio() {
        return this.cnDifFolio;
    }
    
    /**
     * Set cnDifFolio value.
     *
     * @param cnDifFolio java.lang.Integer
     */
    public void setCnDifFolio(java.lang.Integer cnDifFolio) {
        this.cnDifFolio = cnDifFolio;
    }
            
    /**
     * Get cnFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCnFolio() {
        return this.cnFolio;
    }
    
    /**
     * Set cnFolio value.
     *
     * @param cnFolio java.lang.Long
     */
    public void setCnFolio(java.lang.Long cnFolio) {
        this.cnFolio = cnFolio;
    }
            
    /**
     * Get cnPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnPaquete() {
        return this.cnPaquete;
    }
    
    /**
     * Set cnPaquete value.
     *
     * @param cnPaquete java.lang.Integer
     */
    public void setCnPaquete(java.lang.Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }
                                                                            
}
