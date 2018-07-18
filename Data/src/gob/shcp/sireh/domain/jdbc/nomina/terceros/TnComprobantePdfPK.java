package gob.shcp.sireh.domain.jdbc.nomina.terceros;

import java.io.Serializable;

/**
 * Composed primary object for TnComprobanteDig data.
 */
public class TnComprobantePdfPK implements Serializable {
        private Integer cnDifFolio;
        private java.lang.Long cnFolio;
                                                                            
    /**
     * Constructor for TnComprobantePdfPK class.
     */
    public TnComprobantePdfPK() {
    }

                                                                                        
    /**
     * Constructor for TnComprobantePdfPK class.
     *
     * @param cnDifFolio java.lang.Integer
     * @param cnFolio java.lang.Long
     */
    public TnComprobantePdfPK ( java.lang.Integer cnDifFolio, java.lang.Long cnFolio) {
        this.cnDifFolio = cnDifFolio;
        this.cnFolio = cnFolio;

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
                                                                            
}
