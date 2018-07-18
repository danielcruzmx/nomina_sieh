package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcIspt data.
 */
public class TcIsptPK implements Serializable {
    private java.lang.String idTipoTabla;
    private java.lang.Integer isptConsec;
    private java.util.Date isptFin;

    /**
     * Constructor for TcIsptPK class.
     */
    public TcIsptPK() {
    }

    /**
     * Constructor for TcIsptPK class.
     *
     * @param idTipoTabla java.lang.String
     * @param isptConsec java.lang.Integer
     * @param isptFin java.util.Date
     */
    public TcIsptPK(java.lang.String idTipoTabla, java.lang.Integer isptConsec, 
                    java.util.Date isptFin) {
        this.idTipoTabla = idTipoTabla;
        this.isptConsec = isptConsec;
        this.isptFin = isptFin;
    }

    /**
     * Get idTipoTabla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoTabla() {
        return this.idTipoTabla;
    }

    /**
     * Set idTipoTabla value.
     *
     * @param idTipoTabla java.lang.String
     */
    public void setIdTipoTabla(java.lang.String idTipoTabla) {
        this.idTipoTabla = idTipoTabla;
    }

    /**
     * Get isptConsec value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIsptConsec() {
        return this.isptConsec;
    }

    /**
     * Set isptConsec value.
     *
     * @param isptConsec java.lang.Integer
     */
    public void setIsptConsec(java.lang.Integer isptConsec) {
        this.isptConsec = isptConsec;
    }

    /**
     * Get isptFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getIsptFin() {
        return this.isptFin;
    }

    /**
     * Set isptFin value.
     *
     * @param isptFin java.util.Date
     */
    public void setIsptFin(java.util.Date isptFin) {
        this.isptFin = isptFin;
    }

}
