package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TcCapCursoPrincipal data.
 */
public class TcCapCursoPrincplPK implements Serializable {
    private java.lang.Integer cicloEjeTematico;
    private java.lang.String idCursoPrincipal;
    private java.lang.String idEjeTematico;

    /**
     * Constructor for TcCapCursoPrincipalPK class.
     */
    public TcCapCursoPrincplPK() {
    }

    /**
     * Constructor for TcCapCursoPrincipalPK class.
     *
     * @param cicloEjeTematico java.lang.Integer
     * @param idCursoPrincipal java.lang.String
     * @param idEjeTematico java.lang.String
     */
    public TcCapCursoPrincplPK(java.lang.Integer cicloEjeTematico, java.lang.String idCursoPrincipal, 
                               java.lang.String idEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
        this.idCursoPrincipal = idCursoPrincipal;
        this.idEjeTematico = idEjeTematico;
    }

    /**
     * Get cicloEjeTematico value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCicloEjeTematico() {
        return this.cicloEjeTematico;
    }

    /**
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico) {
        this.cicloEjeTematico = cicloEjeTematico;
    }

    /**
     * Get idCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCursoPrincipal() {
        return this.idCursoPrincipal;
    }

    /**
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal) {
        this.idCursoPrincipal = idCursoPrincipal;
    }

    /**
     * Get idEjeTematico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEjeTematico() {
        return this.idEjeTematico;
    }

    /**
     * Set idEjeTematico value.
     *
     * @param idEjeTematico java.lang.String
     */
    public void setIdEjeTematico(java.lang.String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

}
