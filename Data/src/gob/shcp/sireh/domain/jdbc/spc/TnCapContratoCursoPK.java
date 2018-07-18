package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TnCapContratoCurso data.
 */
public class TnCapContratoCursoPK implements Serializable {

    private java.lang.Integer idContratoCurso;
    private java.lang.String idProveedor;

    /**
     * Constructor for TnCapContratoCursoPK class.
     */
    public TnCapContratoCursoPK() {
    }

    /**
     * Constructor for TnCapContratoCursoPK class.
     *
     * @param idContratoCurso java.lang.Integer
     * @param idProveedor java.lang.String
     */
    public TnCapContratoCursoPK(java.lang.Integer idContratoCurso, java.lang.String idProveedor) {
        this.idContratoCurso = idContratoCurso;
        this.idProveedor = idProveedor;

    }

    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
        return this.idContratoCurso;
    }

    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso) {
        this.idContratoCurso = idContratoCurso;
    }

    /**
     * Get idProveedor value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProveedor() {
        return this.idProveedor;
    }

    /**
     * Set idProveedor value.
     *
     * @param idProveedor java.lang.String
     */
    public void setIdProveedor(java.lang.String idProveedor) {
        this.idProveedor = idProveedor;
    }

}
