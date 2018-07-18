package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnCxlcCancelado data.
 */
public class TnCxlcCancelados implements Domain, Serializable {
    private TnCxlcCanceladoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String aplicado;
    private java.lang.Integer cxlccEdoAplica;
    private java.lang.Double cxlccMonto;
    private java.lang.String cxlccTipoProceso;
    private java.lang.String cxlccUniAplica;
    private java.lang.Integer idEdo;
    private java.lang.String idGrupoPago;
    private java.lang.String idTipoNomina;
    private java.lang.String idUnidad;

    /**
     * Constructor for TnCxlcCancelado class.
     */
    public TnCxlcCancelados() {
    }

    /**
     * Constructor for TnCxlcCancelado class.
     *
     * @param cxlc java.lang.Integer
     * @param cxlccCiclo java.lang.Integer
     * @param cxlccDifFolio java.lang.Integer
     * @param cxlccFolio java.lang.Long
     * @param cxlccGuiaCont java.lang.Integer
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param aplicado java.lang.String
     * @param cxlccEdoAplica java.lang.Integer
     * @param cxlccMonto java.lang.Double
     * @param cxlccTipoProceso java.lang.String
     * @param cxlccUniAplica java.lang.String
     * @param idEdo java.lang.Integer
     * @param idGrupoPago java.lang.String
     * @param idTipoNomina java.lang.String
     * @param idUnidad java.lang.String
     */
    public TnCxlcCancelados(TnCxlcCanceladoPK idComposite, 
                            java.util.Date fecModifico, 
                            java.lang.String usuario, 
                            java.lang.String aplicado, 
                            java.lang.Integer cxlccEdoAplica, 
                            java.lang.Double cxlccMonto, 
                            java.lang.String cxlccTipoProceso, 
                            java.lang.String cxlccUniAplica, 
                            java.lang.Integer idEdo, 
                            java.lang.String idGrupoPago, 
                            java.lang.String idTipoNomina, 
                            java.lang.String idUnidad) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.aplicado = aplicado;
        this.cxlccEdoAplica = cxlccEdoAplica;
        this.cxlccMonto = cxlccMonto;
        this.cxlccTipoProceso = cxlccTipoProceso;
        this.cxlccUniAplica = cxlccUniAplica;
        this.idEdo = idEdo;
        this.idGrupoPago = idGrupoPago;
        this.idTipoNomina = idTipoNomina;
        this.idUnidad = idUnidad;
    }

    /**
     * Get cxlc value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlc();
    }

    /**
     * Get cxlccCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlccCiclo();
    }

    /**
     * Get cxlccDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccDifFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlccDifFolio();
    }

    /**
     * Get cxlccFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCxlccFolio() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlccFolio();
    }

    /**
     * Get cxlccGuiaCont value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccGuiaCont() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCxlccGuiaCont();
    }

    /**
     * Get idCptoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCptoPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCptoPago();
    }

    /**
     * Get idTipoCpto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoCpto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdTipoCpto();
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
     * Get aplicado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAplicado() {
        return this.aplicado;
    }

    /**
     * Get cxlccEdoAplica value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCxlccEdoAplica() {
        return this.cxlccEdoAplica;
    }

    /**
     * Get cxlccMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCxlccMonto() {
        return this.cxlccMonto;
    }

    /**
     * Get cxlccTipoProceso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlccTipoProceso() {
        return this.cxlccTipoProceso;
    }

    /**
     * Get cxlccUniAplica value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCxlccUniAplica() {
        return this.cxlccUniAplica;
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
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
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
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }


    /**
     * Set cxlc value.
     *
     * @param cxlc java.lang.Integer
     */
    public void setCxlc(java.lang.Integer cxlc) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setCxlc(cxlc);
    }

    /**
     * Set cxlccCiclo value.
     *
     * @param cxlccCiclo java.lang.Integer
     */
    public void setCxlccCiclo(java.lang.Integer cxlccCiclo) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setCxlccCiclo(cxlccCiclo);
    }

    /**
     * Set cxlccDifFolio value.
     *
     * @param cxlccDifFolio java.lang.Integer
     */
    public void setCxlccDifFolio(java.lang.Integer cxlccDifFolio) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setCxlccDifFolio(cxlccDifFolio);
    }

    /**
     * Set cxlccFolio value.
     *
     * @param cxlccFolio java.lang.Long
     */
    public void setCxlccFolio(java.lang.Long cxlccFolio) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setCxlccFolio(cxlccFolio);
    }

    /**
     * Set cxlccGuiaCont value.
     *
     * @param cxlccGuiaCont java.lang.Integer
     */
    public void setCxlccGuiaCont(java.lang.Integer cxlccGuiaCont) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setCxlccGuiaCont(cxlccGuiaCont);
    }

    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setIdCptoPago(idCptoPago);
    }

    /**
     * Set idTipoCpto value.
     *
     * @param idTipoCpto java.lang.String
     */
    public void setIdTipoCpto(java.lang.String idTipoCpto) {
        if (idComposite == null) {
            idComposite = new TnCxlcCanceladoPK();
        }
        this.idComposite.setIdTipoCpto(idTipoCpto);
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
     * Set aplicado value.
     *
     * @param aplicado java.lang.String
     */
    public void setAplicado(java.lang.String aplicado) {
        this.aplicado = aplicado;
    }

    /**
     * Set cxlccEdoAplica value.
     *
     * @param cxlccEdoAplica java.lang.Integer
     */
    public void setCxlccEdoAplica(java.lang.Integer cxlccEdoAplica) {
        this.cxlccEdoAplica = cxlccEdoAplica;
    }

    /**
     * Set cxlccMonto value.
     *
     * @param cxlccMonto java.lang.Double
     */
    public void setCxlccMonto(java.lang.Double cxlccMonto) {
        this.cxlccMonto = cxlccMonto;
    }

    /**
     * Set cxlccTipoProceso value.
     *
     * @param cxlccTipoProceso java.lang.String
     */
    public void setCxlccTipoProceso(java.lang.String cxlccTipoProceso) {
        this.cxlccTipoProceso = cxlccTipoProceso;
    }

    /**
     * Set cxlccUniAplica value.
     *
     * @param cxlccUniAplica java.lang.String
     */
    public void setCxlccUniAplica(java.lang.String cxlccUniAplica) {
        this.cxlccUniAplica = cxlccUniAplica;
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
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCxlcCanceladoPK)idComposite;
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
