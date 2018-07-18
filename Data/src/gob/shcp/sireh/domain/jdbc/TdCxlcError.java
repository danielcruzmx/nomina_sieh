package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdCxlcError data.
 */
public class TdCxlcError implements Domain, Serializable {
    private TdCxlcErrorPK idComposite;
    private java.lang.String idCptoPago;
    private java.lang.Integer idEdo;
    private java.lang.String idTipoCpto;
    private java.lang.String idUnidadNom;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Double ceMonto;
    private java.lang.Boolean ceRevisado;

    /**
     * Constructor for TdCxlcError class.
     */
    public TdCxlcError() {
    }

    /**
     * Constructor for TdCxlcError class.
     *
     * @param ceCiclo java.lang.Integer
     * @param ceComplemento java.lang.String
     * @param ceQnaPago java.lang.Integer
     * @param idCxlcError java.lang.Integer
     * @param idFolio java.lang.Long
     * @param idTipoNomina java.lang.String
     * @param idCptoPago java.lang.String
     * @param idEdo java.lang.Integer
     * @param idTipoCpto java.lang.String
     * @param idUnidadNom java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param ceMonto java.lang.Double
     * @param ceRevisado java.lang.Boolean
     */
    public TdCxlcError(TdCxlcErrorPK idComposite, java.lang.String idCptoPago, 
                       java.lang.Integer idEdo, java.lang.String idTipoCpto, 
                       java.lang.String idUnidadNom, 
                       java.util.Date fecModifico, java.lang.String usuario, 
                       java.lang.Double ceMonto, 
                       java.lang.Boolean ceRevisado) {
        this.idComposite = idComposite;
        this.idCptoPago = idCptoPago;
        this.idEdo = idEdo;
        this.idTipoCpto = idTipoCpto;
        this.idUnidadNom = idUnidadNom;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.ceMonto = ceMonto;
        this.ceRevisado = ceRevisado;
    }

    /**
     * Get ceCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCeCiclo();
    }

    /**
     * Get ceComplemento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCeComplemento() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCeComplemento();
    }

    /**
     * Get ceQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCeQnaPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCeQnaPago();
    }

    /**
     * Get idCxlcError value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCxlcError() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCxlcError();
    }

    /**
     * Get idFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdFolio();
    }

    /**
     * Get idTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNomina() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdTipoNomina();
    }

    /**
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        return this.idCptoPago;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        return this.idTipoCpto;
    }

    /**
     * Get idUnidadNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadNom() {
        return this.idUnidadNom;
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Get ceMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCeMonto() {
        return this.ceMonto;
    }

    /**
     * Get ceRevisado value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isCeRevisado() {
        return this.ceRevisado;
    }


    /**
     * Set ceCiclo value.
     *
     * @param ceCiclo java.lang.Integer
     */
    public void setCeCiclo(java.lang.Integer ceCiclo) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setCeCiclo(ceCiclo);
    }

    /**
     * Set ceComplemento value.
     *
     * @param ceComplemento java.lang.String
     */
    public void setCeComplemento(java.lang.String ceComplemento) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setCeComplemento(ceComplemento);
    }

    /**
     * Set ceQnaPago value.
     *
     * @param ceQnaPago java.lang.Integer
     */
    public void setCeQnaPago(java.lang.Integer ceQnaPago) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setCeQnaPago(ceQnaPago);
    }

    /**
     * Set idCxlcError value.
     *
     * @param idCxlcError java.lang.Integer
     */
    public void setIdCxlcError(java.lang.Integer idCxlcError) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setIdCxlcError(idCxlcError);
    }

    /**
     * Set idFolio value.
     *
     * @param idFolio java.lang.Long
     */
    public void setIdFolio(java.lang.Long idFolio) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setIdFolio(idFolio);
    }

    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina) {
        if (idComposite == null) {
            idComposite = new TdCxlcErrorPK();
        }
        this.idComposite.setIdTipoNomina(idTipoNomina);
    }

    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    /**
     * Set idUnidadNom value.
     *
     * @param idUnidadNom java.lang.String
     */
    public void setIdUnidadNom(java.lang.String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    /**
     * Set ceMonto value.
     *
     * @param ceMonto java.lang.Double
     */
    public void setCeMonto(java.lang.Double ceMonto) {
        this.ceMonto = ceMonto;
    }

    /**
     * Set ceRevisado value.
     *
     * @param ceRevisado java.lang.Boolean
     */
    public void setCeRevisado(java.lang.Boolean ceRevisado) {
        this.ceRevisado = ceRevisado;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdCxlcErrorPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
