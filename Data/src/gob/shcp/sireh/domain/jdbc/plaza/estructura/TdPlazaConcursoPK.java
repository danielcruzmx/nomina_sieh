package gob.shcp.sireh.domain.jdbc.plaza.estructura;

import java.io.Serializable;

/**
 * Composed primary object for TdPlazaConcurso data.
 */
public class TdPlazaConcursoPK implements Serializable {
        private java.lang.Integer idEstatus;
            private java.lang.Integer idPlaza;
                
    /**
     * Constructor for TdPlazaConcursoPK class.
     */
    public TdPlazaConcursoPK() {
    }

                            
    /**
     * Constructor for TdPlazaConcursoPK class.
     *
     * @param idEstatus java.lang.Integer
     * @param idPlaza java.lang.Integer
     */
    public TdPlazaConcursoPK ( java.lang.Integer idEstatus, java.lang.Integer idPlaza) {
        this.idEstatus = idEstatus;
        this.idPlaza = idPlaza;

    }
    
        
    /**
     * Get idEstatus value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEstatus() {
        return this.idEstatus;
    }
    
    /**
     * Set idEstatus value.
     *
     * @param idEstatus java.lang.Integer
     */
    public void setIdEstatus(java.lang.Integer idEstatus) {
        this.idEstatus = idEstatus;
    }
            
    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
    }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }
                
}
