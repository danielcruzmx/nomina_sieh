package gob.shcp.sireh.domain.jdbc.rusp;

import java.io.Serializable;

/**
 * Composed primary object for TdRuspLengua data.
 */
public class TdRuspLenguaPK implements Serializable {
        private java.lang.Integer trlLengua;
            private java.lang.String trlRfc;
                    
    /**
     * Constructor for TdRuspLenguaPK class.
     */
    public TdRuspLenguaPK() {
    }

                                
    /**
     * Constructor for TdRuspLenguaPK class.
     *
     * @param trlLengua java.lang.Integer
     * @param trlRfc java.lang.String
     */
    public TdRuspLenguaPK ( java.lang.Integer trlLengua, java.lang.String trlRfc) {
        this.trlLengua = trlLengua;
        this.trlRfc = trlRfc;

    }
    
        
    /**
     * Get trlLengua value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getTrlLengua() {
        return this.trlLengua;
    }
    
    /**
     * Set trlLengua value.
     *
     * @param trlLengua java.lang.Integer
     */
    public void setTrlLengua(java.lang.Integer trlLengua) {
        this.trlLengua = trlLengua;
    }
            
    /**
     * Get trlRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrlRfc() {
        return this.trlRfc;
    }
    
    /**
     * Set trlRfc value.
     *
     * @param trlRfc java.lang.String
     */
    public void setTrlRfc(java.lang.String trlRfc) {
        this.trlRfc = trlRfc;
    }
                    
}
