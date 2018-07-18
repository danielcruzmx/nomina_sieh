package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcPuestoVacancia data.
 */
public class TcPuestoVacanciaPK implements Serializable {
        private java.lang.String idPtoDestino;
            private java.lang.String idPtoOrigen;
            
    /**
     * Constructor for TcPuestoVacanciaPK class.
     */
    public TcPuestoVacanciaPK() {
    }

                        
    /**
     * Constructor for TcPuestoVacanciaPK class.
     *
     * @param idPtoDestino java.lang.String
     * @param idPtoOrigen java.lang.String
     */
    public TcPuestoVacanciaPK ( java.lang.String idPtoDestino, java.lang.String idPtoOrigen) {
        this.idPtoDestino = idPtoDestino;
        this.idPtoOrigen = idPtoOrigen;

    }
    
        
    /**
     * Get idPtoDestino value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoDestino() {
        return this.idPtoDestino;
    }
    
    /**
     * Set idPtoDestino value.
     *
     * @param idPtoDestino java.lang.String
     */
    public void setIdPtoDestino(java.lang.String idPtoDestino) {
        this.idPtoDestino = idPtoDestino;
    }
            
    /**
     * Get idPtoOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoOrigen() {
        return this.idPtoOrigen;
    }
    
    /**
     * Set idPtoOrigen value.
     *
     * @param idPtoOrigen java.lang.String
     */
    public void setIdPtoOrigen(java.lang.String idPtoOrigen) {
        this.idPtoOrigen = idPtoOrigen;
    }
            
}
