package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TnCapFacturaCurso data.
 */
public class TnCapFacturaCursoPK implements Serializable {
    private java.lang.String facturaFolio;
    private java.lang.Integer idContratoCurso;
    private java.lang.Integer idCurso;

    /**
     * Constructor for TnCapFacturaCursoPK class.
     */
    public TnCapFacturaCursoPK() {
    }

    /**
     * Constructor for TnCapFacturaCursoPK class.
     *
     * @param facturaFolio java.lang.String
     * @param idContratoCurso java.lang.Integer
     * @param idCurso java.lang.Integer
     */
    public TnCapFacturaCursoPK(java.lang.String facturaFolio, java.lang.Integer idContratoCurso, 
                               java.lang.Integer idCurso) {
        this.facturaFolio = facturaFolio;
        this.idContratoCurso = idContratoCurso;
        this.idCurso = idCurso;
    }
    
    /**
     * Get facturaFolio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getFacturaFolio() {
        return this.facturaFolio;
    }

    /**
     * Set facturaFolio value.
     *
     * @param facturaFolio java.lang.String
     */
    public void setFacturaFolio(java.lang.String facturaFolio) {
        this.facturaFolio = facturaFolio;
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
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }
}
