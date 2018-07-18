package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TdCxlcError data.
 */
public class TdCxlcErrorPK implements Serializable {
    private java.lang.Integer ceCiclo;
    private java.lang.String ceComplemento;
    private java.lang.Integer ceQnaPago;
    private java.lang.Integer idCxlcError;
    private java.lang.Long idFolio;
    private java.lang.String idTipoNomina;

    /**
     * Constructor for TdCxlcErrorPK class.
     */
    public TdCxlcErrorPK() {
    }

    /**
     * Constructor for TdCxlcErrorPK class.
     *
     * @param ceCiclo java.lang.Integer
     * @param ceComplemento java.lang.String
     * @param ceQnaPago java.lang.Integer
     * @param idCxlcError java.lang.Integer
     * @param idFolio java.lang.Long
     * @param idTipoNomina java.lang.String
     */
    public TdCxlcErrorPK(java.lang.Integer ceCiclo, 
                         java.lang.String ceComplemento, 
                         java.lang.Integer ceQnaPago, 
                         java.lang.Integer idCxlcError, java.lang.Long idFolio, 
                         java.lang.String idTipoNomina) {
        this.ceCiclo = ceCiclo;
        this.ceComplemento = ceComplemento;
        this.ceQnaPago = ceQnaPago;
        this.idCxlcError = idCxlcError;
        this.idFolio = idFolio;
        this.idTipoNomina = idTipoNomina;
    }

    /**
     * Get ceCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeCiclo() {
        return this.ceCiclo;
    }

    /**
     * Set ceCiclo value.
     *
     * @param ceCiclo java.lang.Integer
     */
    public void setCeCiclo(java.lang.Integer ceCiclo) {
        this.ceCiclo = ceCiclo;
    }

    /**
     * Get ceComplemento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCeComplemento() {
        return this.ceComplemento;
    }

    /**
     * Set ceComplemento value.
     *
     * @param ceComplemento java.lang.String
     */
    public void setCeComplemento(java.lang.String ceComplemento) {
        this.ceComplemento = ceComplemento;
    }

    /**
     * Get ceQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeQnaPago() {
        return this.ceQnaPago;
    }

    /**
     * Set ceQnaPago value.
     *
     * @param ceQnaPago java.lang.Integer
     */
    public void setCeQnaPago(java.lang.Integer ceQnaPago) {
        this.ceQnaPago = ceQnaPago;
    }

    /**
     * Get idCxlcError value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCxlcError() {
        return this.idCxlcError;
    }

    /**
     * Set idCxlcError value.
     *
     * @param idCxlcError java.lang.Integer
     */
    public void setIdCxlcError(java.lang.Integer idCxlcError) {
        this.idCxlcError = idCxlcError;
    }

    /**
     * Get idFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdFolio() {
        return this.idFolio;
    }

    /**
     * Set idFolio value.
     *
     * @param idFolio java.lang.Long
     */
    public void setIdFolio(java.lang.Long idFolio) {
        this.idFolio = idFolio;
    }

    /**
     * Get idTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNomina() {
        return this.idTipoNomina;
    }

    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

}
