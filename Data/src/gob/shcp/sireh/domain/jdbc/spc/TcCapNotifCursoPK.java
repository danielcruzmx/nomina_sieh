package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TcCapNotifCurso data.
 */
public class TcCapNotifCursoPK implements Serializable {
        private java.lang.Integer capNotifCursoCiclo;
            private java.lang.Integer idModalidad;
                        
    /**
     * Constructor for TcCapNotifCursoPK class.
     */
    public TcCapNotifCursoPK() {
    }

                                    
    /**
     * Constructor for TcCapNotifCursoPK class.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     * @param idModalidad java.lang.Integer
     */
    public TcCapNotifCursoPK ( java.lang.Integer capNotifCursoCiclo, java.lang.Integer idModalidad) {
        this.capNotifCursoCiclo = capNotifCursoCiclo;
        this.idModalidad = idModalidad;

    }
    
        
    /**
     * Get capNotifCursoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapNotifCursoCiclo() {
        return this.capNotifCursoCiclo;
    }
    
    /**
     * Set capNotifCursoCiclo value.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     */
    public void setCapNotifCursoCiclo(java.lang.Integer capNotifCursoCiclo) {
        this.capNotifCursoCiclo = capNotifCursoCiclo;
    }
            
    /**
     * Get idModalidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdModalidad() {
        return this.idModalidad;
    }
    
    /**
     * Set idModalidad value.
     *
     * @param idModalidad java.lang.Integer
     */
    public void setIdModalidad(java.lang.Integer idModalidad) {
        this.idModalidad = idModalidad;
    }
                        
}
