package gob.shcp.sireh.domain.jdbc.plaza.estructura;

import java.io.Serializable;

/**
 * Composed primary object for TdHistoriaDesierta data.
 */
public class TdHistoriaDesiertaPK implements Serializable {
    private java.util.Date fechaDesierta;
    private java.lang.Integer idPlaza;
    private java.lang.Integer idEstatus;        
            
    /**
     * Constructor for TdHistoriaDesiertaPK class.
     */
    public TdHistoriaDesiertaPK() {
    }

                        
    /**
     * Constructor for TdHistoriaDesiertaPK class.
     *
     * @param fechaDesierta java.util.Date
     * @param idPlaza java.lang.Integer
     */
    public TdHistoriaDesiertaPK ( java.util.Date fechaDesierta, java.lang.Integer idPlaza, java.lang.Integer idEstatus) {
        this.fechaDesierta = fechaDesierta;
        this.idPlaza = idPlaza;
        this.idEstatus = idEstatus;

    }
    
        
    /**
     * Get fechaDesierta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFechaDesierta() {
        return this.fechaDesierta;
    }
    
    /**
     * Set fechaDesierta value.
     *
     * @param fechaDesierta java.util.Date
     */
    public void setFechaDesierta(java.util.Date fechaDesierta) {
        this.fechaDesierta = fechaDesierta;
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

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }
}
