package gob.shcp.sireh.domain.jdbc.rusp;

import java.io.Serializable;

/**
 * Composed primary object for TdRuspHijo data.
 */
public class TdRuspHijoPK implements Serializable {
        private java.lang.String trhCurp;
            private java.lang.String trhRfc;
                            
    /**
     * Constructor for TdRuspHijoPK class.
     */
    public TdRuspHijoPK() {
    }

                                        
    /**
     * Constructor for TdRuspHijoPK class.
     *
     * @param trhCurp java.lang.String
     * @param trhRfc java.lang.String
     */
    public TdRuspHijoPK ( java.lang.String trhCurp, java.lang.String trhRfc) {
        this.trhCurp = trhCurp;
        this.trhRfc = trhRfc;

    }
    
        
    /**
     * Get trhCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhCurp() {
        return this.trhCurp;
    }
    
    /**
     * Set trhCurp value.
     *
     * @param trhCurp java.lang.String
     */
    public void setTrhCurp(java.lang.String trhCurp) {
        this.trhCurp = trhCurp;
    }
            
    /**
     * Get trhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTrhRfc() {
        return this.trhRfc;
    }
    
    /**
     * Set trhRfc value.
     *
     * @param trhRfc java.lang.String
     */
    public void setTrhRfc(java.lang.String trhRfc) {
        this.trhRfc = trhRfc;
    }
                            
}
