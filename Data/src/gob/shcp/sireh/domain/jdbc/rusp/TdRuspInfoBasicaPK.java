package gob.shcp.sireh.domain.jdbc.rusp;

import java.io.Serializable;

/**
 * Composed primary object for TdRuspInfoBasica data.
 */
public class TdRuspInfoBasicaPK implements Serializable {
    
    private java.lang.Integer ribCiclo;
    private java.lang.Integer ribPlaza;
    private java.lang.Integer ribQnaPago;

    /**
     * Constructor for TdRuspInfoBasicaPK class.
     */
    public TdRuspInfoBasicaPK() {
    }
    
    /**
     * Constructor for TdRuspInfoBasicaPK class.
     *
     * @param ribCiclo java.lang.Integer
     * @param ribPlaza java.lang.Integer
     * @param ribQnaPago java.lang.Integer
     */
    public TdRuspInfoBasicaPK(java.lang.Integer ribCiclo, java.lang.Integer ribPlaza, java.lang.Integer ribQnaPago) {
        this.ribCiclo = ribCiclo;
        this.ribPlaza = ribPlaza;
        this.ribQnaPago = ribQnaPago;
    }
    
    /**
     * Get ribCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibCiclo() {
        return this.ribCiclo;
    }

    /**
     * Set ribCiclo value.
     *
     * @param ribCiclo java.lang.Integer
     */
    public void setRibCiclo(java.lang.Integer ribCiclo) {
        this.ribCiclo = ribCiclo;
    }

    /**
     * Get ribPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPlaza() {
        return this.ribPlaza;
    }

    /**
     * Set ribPlaza value.
     *
     * @param ribPlaza java.lang.Integer
     */
    public void setRibPlaza(java.lang.Integer ribPlaza) {
        this.ribPlaza = ribPlaza;
    }

    /**
     * Get ribQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibQnaPago() {
        return this.ribQnaPago;
    }

    /**
     * Set ribQnaPago value.
     *
     * @param ribQnaPago java.lang.Integer
     */
    public void setRibQnaPago(java.lang.Integer ribQnaPago) {
        this.ribQnaPago = ribQnaPago;
    }
}
