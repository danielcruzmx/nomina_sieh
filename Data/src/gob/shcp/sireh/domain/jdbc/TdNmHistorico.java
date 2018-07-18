package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdNmHistorico data.
 */
public class TdNmHistorico implements Domain, Serializable {
    private TdNmHistoricoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String idUnidad;
    private java.lang.String usuario;
    private java.lang.String idGenero;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    private java.lang.String idPuesto;
    private java.lang.Integer nmhCicloPago;
    private java.util.Date nmhFechaAgre;
    private java.util.Date nmhFechaReg;
    private java.lang.String nmhMesCurso;
    private java.lang.String nmhOp;
    private java.lang.Integer nmhQnaPagoValidar;
    private java.lang.String nmhTipoPlaza;

    /**
     * Constructor for TdNmHistorico class.
     */
    public TdNmHistorico() {
    }

    /**
     * Constructor for TdNmHistorico class.
     *
     * @param nmhCausal java.lang.Integer
     * @param nmhCiclo java.lang.Integer
     * @param nmhNumDocto java.lang.String
     * @param nmhRfc java.lang.String
     * @param nmhRfcUnico java.lang.String
     * @param fecModifico java.util.Date
     * @param idUnidad java.lang.String
     * @param usuario java.lang.String
     * @param idGenero java.lang.String
     * @param idNivelPto java.lang.String
     * @param idPlaza java.lang.Integer
     * @param idPuesto java.lang.String
     * @param nmhCicloPago java.lang.Integer
     * @param nmhFechaAgre java.util.Date
     * @param nmhFechaReg java.util.Date
     * @param nmhMesCurso java.lang.String
     * @param nmhOp java.lang.String
     * @param nmhQnaPagoValidar java.lang.Integer
     * @param nmhTipoPlaza java.lang.String
     */
    public TdNmHistorico(TdNmHistoricoPK idComposite, 
                         java.util.Date fecModifico, java.lang.String idUnidad, 
                         java.lang.String usuario, java.lang.String idGenero, 
                         java.lang.String idNivelPto, 
                         java.lang.Integer idPlaza, java.lang.String idPuesto, 
                         java.lang.Integer nmhCicloPago, 
                         java.util.Date nmhFechaAgre, 
                         java.util.Date nmhFechaReg, 
                         java.lang.String nmhMesCurso, java.lang.String nmhOp, 
                         java.lang.Integer nmhQnaPagoValidar, 
                         java.lang.String nmhTipoPlaza) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.idUnidad = idUnidad;
        this.usuario = usuario;
        this.idGenero = idGenero;
        this.idNivelPto = idNivelPto;
        this.idPlaza = idPlaza;
        this.idPuesto = idPuesto;
        this.nmhCicloPago = nmhCicloPago;
        this.nmhFechaAgre = nmhFechaAgre;
        this.nmhFechaReg = nmhFechaReg;
        this.nmhMesCurso = nmhMesCurso;
        this.nmhOp = nmhOp;
        this.nmhQnaPagoValidar = nmhQnaPagoValidar;
        this.nmhTipoPlaza = nmhTipoPlaza;
    }

    /**
     * Get nmhCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCausal() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmhCausal();
    }

    /**
     * Get nmhCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmhCiclo();
    }

    /**
     * Get nmhNumDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhNumDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmhNumDocto();
    }

    /**
     * Get nmhRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmhRfc();
    }

    /**
     * Get nmhRfcUnico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhRfcUnico() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmhRfcUnico();
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
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
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
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
    }

    /**
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;
    }

    /**
     * Get nmhCicloPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhCicloPago() {
        return this.nmhCicloPago;
    }

    /**
     * Get nmhFechaAgre value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmhFechaAgre() {
        return this.nmhFechaAgre;
    }

    /**
     * Get nmhFechaReg value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmhFechaReg() {
        return this.nmhFechaReg;
    }

    /**
     * Get nmhMesCurso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhMesCurso() {
        return this.nmhMesCurso;
    }

    /**
     * Get nmhOp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhOp() {
        return this.nmhOp;
    }

    /**
     * Get nmhQnaPagoValidar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmhQnaPagoValidar() {
        return this.nmhQnaPagoValidar;
    }

    /**
     * Get nmhTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmhTipoPlaza() {
        return this.nmhTipoPlaza;
    }

    /**
     * Set nmhCausal value.
     *
     * @param nmhCausal java.lang.Integer
     */
    public void setNmhCausal(java.lang.Integer nmhCausal) {
        if (idComposite == null) {
            idComposite = new TdNmHistoricoPK();
        }
        this.idComposite.setNmhCausal(nmhCausal);
    }

    /**
     * Set nmhCiclo value.
     *
     * @param nmhCiclo java.lang.Integer
     */
    public void setNmhCiclo(java.lang.Integer nmhCiclo) {
        if (idComposite == null) {
            idComposite = new TdNmHistoricoPK();
        }
        this.idComposite.setNmhCiclo(nmhCiclo);
    }

    /**
     * Set nmhNumDocto value.
     *
     * @param nmhNumDocto java.lang.String
     */
    public void setNmhNumDocto(java.lang.String nmhNumDocto) {
        if (idComposite == null) {
            idComposite = new TdNmHistoricoPK();
        }
        this.idComposite.setNmhNumDocto(nmhNumDocto);
    }

    /**
     * Set nmhRfc value.
     *
     * @param nmhRfc java.lang.String
     */
    public void setNmhRfc(java.lang.String nmhRfc) {
        if (idComposite == null) {
            idComposite = new TdNmHistoricoPK();
        }
        this.idComposite.setNmhRfc(nmhRfc);
    }

    /**
     * Set nmhRfcUnico value.
     *
     * @param nmhRfcUnico java.lang.String
     */
    public void setNmhRfcUnico(java.lang.String nmhRfcUnico) {
        if (idComposite == null) {
            idComposite = new TdNmHistoricoPK();
        }
        this.idComposite.setNmhRfcUnico(nmhRfcUnico);
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
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
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    /**
     * Set idPuesto value.
     *
     * @param idPuesto java.lang.String
     */
    public void setIdPuesto(java.lang.String idPuesto) {
        this.idPuesto = idPuesto;
    }

    /**
     * Set nmhCicloPago value.
     *
     * @param nmhCicloPago java.lang.Integer
     */
    public void setNmhCicloPago(java.lang.Integer nmhCicloPago) {
        this.nmhCicloPago = nmhCicloPago;
    }

    /**
     * Set nmhFechaAgre value.
     *
     * @param nmhFechaAgre java.util.Date
     */
    public void setNmhFechaAgre(java.util.Date nmhFechaAgre) {
        this.nmhFechaAgre = nmhFechaAgre;
    }

    /**
     * Set nmhFechaReg value.
     *
     * @param nmhFechaReg java.util.Date
     */
    public void setNmhFechaReg(java.util.Date nmhFechaReg) {
        this.nmhFechaReg = nmhFechaReg;
    }

    /**
     * Set nmhMesCurso value.
     *
     * @param nmhMesCurso java.lang.String
     */
    public void setNmhMesCurso(java.lang.String nmhMesCurso) {
        this.nmhMesCurso = nmhMesCurso;
    }

    /**
     * Set nmhOp value.
     *
     * @param nmhOp java.lang.String
     */
    public void setNmhOp(java.lang.String nmhOp) {
        this.nmhOp = nmhOp;
    }

    /**
     * Set nmhQnaPagoValidar value.
     *
     * @param nmhQnaPagoValidar java.lang.Integer
     */
    public void setNmhQnaPagoValidar(java.lang.Integer nmhQnaPagoValidar) {
        this.nmhQnaPagoValidar = nmhQnaPagoValidar;
    }

    /**
     * Set nmhTipoPlaza value.
     *
     * @param nmhTipoPlaza java.lang.String
     */
    public void setNmhTipoPlaza(java.lang.String nmhTipoPlaza) {
        this.nmhTipoPlaza = nmhTipoPlaza;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdNmHistoricoPK)idComposite;
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
