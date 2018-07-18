package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdExpLab data.
 */
public class TdExpLabPK implements Serializable {
    private java.lang.String elActPrin;
    private java.lang.String elEmpresa;
    private java.lang.String elNivelCargo;
    private java.lang.String idTdExpLab;

    /**
     * Constructor for TdExpLabPK class.
     */
    public TdExpLabPK() {
    }

    /**
     * Constructor for TdExpLabPK class.
     *
     * @param elActPrin java.lang.String
     * @param elEmpresa java.lang.String
     * @param elNivelCargo java.lang.String
     * @param idTdExpLab java.lang.String
     */
    public TdExpLabPK(java.lang.String elActPrin, java.lang.String elEmpresa, 
                      java.lang.String elNivelCargo, 
                      java.lang.String idTdExpLab) {
        this.elActPrin = elActPrin;
        this.elEmpresa = elEmpresa;
        this.elNivelCargo = elNivelCargo;
        this.idTdExpLab = idTdExpLab;
    }

    /**
     * Get elActPrin value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElActPrin() {
        return this.elActPrin;
    }

    /**
     * Set elActPrin value.
     *
     * @param elActPrin java.lang.String
     */
    public void setElActPrin(java.lang.String elActPrin) {
        this.elActPrin = elActPrin;
    }

    /**
     * Get elEmpresa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElEmpresa() {
        return this.elEmpresa;
    }

    /**
     * Set elEmpresa value.
     *
     * @param elEmpresa java.lang.String
     */
    public void setElEmpresa(java.lang.String elEmpresa) {
        this.elEmpresa = elEmpresa;
    }

    /**
     * Get elNivelCargo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getElNivelCargo() {
        return this.elNivelCargo;
    }

    /**
     * Set elNivelCargo value.
     *
     * @param elNivelCargo java.lang.String
     */
    public void setElNivelCargo(java.lang.String elNivelCargo) {
        this.elNivelCargo = elNivelCargo;
    }

    /**
     * Get idTdExpLab value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTdExpLab() {
        return this.idTdExpLab;
    }

    /**
     * Set idTdExpLab value.
     *
     * @param idTdExpLab java.lang.String
     */
    public void setIdTdExpLab(java.lang.String idTdExpLab) {
        this.idTdExpLab = idTdExpLab;
    }

}
