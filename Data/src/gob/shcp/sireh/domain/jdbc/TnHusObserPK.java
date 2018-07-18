package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TnHusObser data.
 */
public class TnHusObserPK implements Serializable {
    private java.lang.Integer husobsReg;
    private java.lang.String husobsRfc;
    private java.lang.String husobsTexto;

    /**
     * Constructor for TnHusObserPK class.
     */
    public TnHusObserPK() {
    }

    /**
     * Constructor for TnHusObserPK class.
     *
     * @param husobsReg java.lang.Integer
     * @param husobsRfc java.lang.String
     * @param husobsTexto java.lang.String
     */
    public TnHusObserPK(java.lang.Integer husobsReg, 
                        java.lang.String husobsRfc, 
                        java.lang.String husobsTexto) {
        this.husobsReg = husobsReg;
        this.husobsRfc = husobsRfc;
        this.husobsTexto = husobsTexto;
    }

    /**
     * Get husobsReg value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHusobsReg() {
        return this.husobsReg;
    }

    /**
     * Set husobsReg value.
     *
     * @param husobsReg java.lang.Integer
     */
    public void setHusobsReg(java.lang.Integer husobsReg) {
        this.husobsReg = husobsReg;
    }

    /**
     * Get husobsRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsRfc() {
        return this.husobsRfc;
    }

    /**
     * Set husobsRfc value.
     *
     * @param husobsRfc java.lang.String
     */
    public void setHusobsRfc(java.lang.String husobsRfc) {
        this.husobsRfc = husobsRfc;
    }

    /**
     * Get husobsTexto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusobsTexto() {
        return this.husobsTexto;
    }

    /**
     * Set husobsTexto value.
     *
     * @param husobsTexto java.lang.String
     */
    public void setHusobsTexto(java.lang.String husobsTexto) {
        this.husobsTexto = husobsTexto;
    }

}
