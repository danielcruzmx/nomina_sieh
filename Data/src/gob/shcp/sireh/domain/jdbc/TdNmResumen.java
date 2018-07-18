package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdNmResumen data.
 */
public class TdNmResumen implements Domain, Serializable {
    private TdNmResumenPK idComposite;
    private java.util.Date fecModifico;
    private int nmrCicloFinal;
    private int nmrCicloInicial;
    private java.lang.String usuario;
    private java.lang.Integer nmrCausalDes;
    private java.lang.Boolean nmrCausalOri;
    private java.lang.Integer nmrDiasPagados;
    private java.util.Date nmrFecDeposito;
    private java.util.Date nmrFecEnvio;
    private java.lang.Double nmrImpteBruto;
    private java.lang.Double nmrImpteIsr;
    private java.lang.Double nmrImpteNeto;
    private java.lang.Double nmrImptePension;
    private java.lang.String nmrOficEnvio;
    private java.lang.String nmrOp;
    private java.lang.String nmrReferencia;
    private java.lang.String nmrRemesaInterna;

    /**
     * Constructor for TdNmResumen class.
     */
    public TdNmResumen() {
    }

    /**
     * Constructor for TdNmResumen class.
     *
     * @param nmrCausal java.lang.Integer
     * @param nmrCicloPago java.lang.Integer
     * @param nmrRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param nmrCicloFinal int
     * @param nmrCicloInicial int
     * @param usuario java.lang.String
     * @param nmrCausalDes java.lang.Integer
     * @param nmrCausalOri java.lang.Boolean
     * @param nmrDiasPagados java.lang.Integer
     * @param nmrFecDeposito java.util.Date
     * @param nmrFecEnvio java.util.Date
     * @param nmrImpteBruto java.lang.Double
     * @param nmrImpteIsr java.lang.Double
     * @param nmrImpteNeto java.lang.Double
     * @param nmrImptePension java.lang.Double
     * @param nmrOficEnvio java.lang.String
     * @param nmrOp java.lang.String
     * @param nmrReferencia java.lang.String
     * @param nmrRemesaInterna java.lang.String
     */
    public TdNmResumen(TdNmResumenPK idComposite, java.util.Date fecModifico, 
                       int nmrCicloFinal, int nmrCicloInicial, 
                       java.lang.String usuario, 
                       java.lang.Integer nmrCausalDes, 
                       java.lang.Boolean nmrCausalOri, 
                       java.lang.Integer nmrDiasPagados, 
                       java.util.Date nmrFecDeposito, 
                       java.util.Date nmrFecEnvio, 
                       java.lang.Double nmrImpteBruto, 
                       java.lang.Double nmrImpteIsr, 
                       java.lang.Double nmrImpteNeto, 
                       java.lang.Double nmrImptePension, 
                       java.lang.String nmrOficEnvio, java.lang.String nmrOp, 
                       java.lang.String nmrReferencia, 
                       java.lang.String nmrRemesaInterna) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.nmrCicloFinal = nmrCicloFinal;
        this.nmrCicloInicial = nmrCicloInicial;
        this.usuario = usuario;
        this.nmrCausalDes = nmrCausalDes;
        this.nmrCausalOri = nmrCausalOri;
        this.nmrDiasPagados = nmrDiasPagados;
        this.nmrFecDeposito = nmrFecDeposito;
        this.nmrFecEnvio = nmrFecEnvio;
        this.nmrImpteBruto = nmrImpteBruto;
        this.nmrImpteIsr = nmrImpteIsr;
        this.nmrImpteNeto = nmrImpteNeto;
        this.nmrImptePension = nmrImptePension;
        this.nmrOficEnvio = nmrOficEnvio;
        this.nmrOp = nmrOp;
        this.nmrReferencia = nmrReferencia;
        this.nmrRemesaInterna = nmrRemesaInterna;
    }

    /**
     * Get nmrCausal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCausal() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmrCausal();
    }

    /**
     * Get nmrCicloPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCicloPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmrCicloPago();
    }

    /**
     * Get nmrRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getNmrRfc();
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
     * Get nmrCicloFinal value.
     *
     * @return int
     */
    public int getNmrCicloFinal() {
        return this.nmrCicloFinal;
    }

    /**
     * Get nmrCicloInicial value.
     *
     * @return int
     */
    public int getNmrCicloInicial() {
        return this.nmrCicloInicial;
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
     * Get nmrCausalDes value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrCausalDes() {
        return this.nmrCausalDes;
    }

    /**
     * Get nmrCausalOri value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isNmrCausalOri() {
        return this.nmrCausalOri;
    }

    /**
     * Get nmrDiasPagados value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNmrDiasPagados() {
        return this.nmrDiasPagados;
    }

    /**
     * Get nmrFecDeposito value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmrFecDeposito() {
        return this.nmrFecDeposito;
    }

    /**
     * Get nmrFecEnvio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNmrFecEnvio() {
        return this.nmrFecEnvio;
    }

    /**
     * Get nmrImpteBruto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteBruto() {
        return this.nmrImpteBruto;
    }

    /**
     * Get nmrImpteIsr value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteIsr() {
        return this.nmrImpteIsr;
    }

    /**
     * Get nmrImpteNeto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImpteNeto() {
        return this.nmrImpteNeto;
    }

    /**
     * Get nmrImptePension value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNmrImptePension() {
        return this.nmrImptePension;
    }

    /**
     * Get nmrOficEnvio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrOficEnvio() {
        return this.nmrOficEnvio;
    }

    /**
     * Get nmrOp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrOp() {
        return this.nmrOp;
    }

    /**
     * Get nmrReferencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrReferencia() {
        return this.nmrReferencia;
    }

    /**
     * Get nmrRemesaInterna value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNmrRemesaInterna() {
        return this.nmrRemesaInterna;
    }

    /**
     * Set nmrCausal value.
     *
     * @param nmrCausal java.lang.Integer
     */
    public void setNmrCausal(java.lang.Integer nmrCausal) {
        if (idComposite == null) {
            idComposite = new TdNmResumenPK();
        }
        this.idComposite.setNmrCausal(nmrCausal);
    }

    /**
     * Set nmrCicloPago value.
     *
     * @param nmrCicloPago java.lang.Integer
     */
    public void setNmrCicloPago(java.lang.Integer nmrCicloPago) {
        if (idComposite == null) {
            idComposite = new TdNmResumenPK();
        }
        this.idComposite.setNmrCicloPago(nmrCicloPago);
    }

    /**
     * Set nmrRfc value.
     *
     * @param nmrRfc java.lang.String
     */
    public void setNmrRfc(java.lang.String nmrRfc) {
        if (idComposite == null) {
            idComposite = new TdNmResumenPK();
        }
        this.idComposite.setNmrRfc(nmrRfc);
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
     * Set nmrCicloFinal value.
     *
     * @param nmrCicloFinal int
     */
    public void setNmrCicloFinal(int nmrCicloFinal) {
        this.nmrCicloFinal = nmrCicloFinal;
    }

    /**
     * Set nmrCicloInicial value.
     *
     * @param nmrCicloInicial int
     */
    public void setNmrCicloInicial(int nmrCicloInicial) {
        this.nmrCicloInicial = nmrCicloInicial;
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
     * Set nmrCausalDes value.
     *
     * @param nmrCausalDes java.lang.Integer
     */
    public void setNmrCausalDes(java.lang.Integer nmrCausalDes) {
        this.nmrCausalDes = nmrCausalDes;
    }

    /**
     * Set nmrCausalOri value.
     *
     * @param nmrCausalOri java.lang.Boolean
     */
    public void setNmrCausalOri(java.lang.Boolean nmrCausalOri) {
        this.nmrCausalOri = nmrCausalOri;
    }

    /**
     * Set nmrDiasPagados value.
     *
     * @param nmrDiasPagados java.lang.Integer
     */
    public void setNmrDiasPagados(java.lang.Integer nmrDiasPagados) {
        this.nmrDiasPagados = nmrDiasPagados;
    }

    /**
     * Set nmrFecDeposito value.
     *
     * @param nmrFecDeposito java.util.Date
     */
    public void setNmrFecDeposito(java.util.Date nmrFecDeposito) {
        this.nmrFecDeposito = nmrFecDeposito;
    }

    /**
     * Set nmrFecEnvio value.
     *
     * @param nmrFecEnvio java.util.Date
     */
    public void setNmrFecEnvio(java.util.Date nmrFecEnvio) {
        this.nmrFecEnvio = nmrFecEnvio;
    }

    /**
     * Set nmrImpteBruto value.
     *
     * @param nmrImpteBruto java.lang.Double
     */
    public void setNmrImpteBruto(java.lang.Double nmrImpteBruto) {
        this.nmrImpteBruto = nmrImpteBruto;
    }

    /**
     * Set nmrImpteIsr value.
     *
     * @param nmrImpteIsr java.lang.Double
     */
    public void setNmrImpteIsr(java.lang.Double nmrImpteIsr) {
        this.nmrImpteIsr = nmrImpteIsr;
    }

    /**
     * Set nmrImpteNeto value.
     *
     * @param nmrImpteNeto java.lang.Double
     */
    public void setNmrImpteNeto(java.lang.Double nmrImpteNeto) {
        this.nmrImpteNeto = nmrImpteNeto;
    }

    /**
     * Set nmrImptePension value.
     *
     * @param nmrImptePension java.lang.Double
     */
    public void setNmrImptePension(java.lang.Double nmrImptePension) {
        this.nmrImptePension = nmrImptePension;
    }

    /**
     * Set nmrOficEnvio value.
     *
     * @param nmrOficEnvio java.lang.String
     */
    public void setNmrOficEnvio(java.lang.String nmrOficEnvio) {
        this.nmrOficEnvio = nmrOficEnvio;
    }

    /**
     * Set nmrOp value.
     *
     * @param nmrOp java.lang.String
     */
    public void setNmrOp(java.lang.String nmrOp) {
        this.nmrOp = nmrOp;
    }

    /**
     * Set nmrReferencia value.
     *
     * @param nmrReferencia java.lang.String
     */
    public void setNmrReferencia(java.lang.String nmrReferencia) {
        this.nmrReferencia = nmrReferencia;
    }

    /**
     * Set nmrRemesaInterna value.
     *
     * @param nmrRemesaInterna java.lang.String
     */
    public void setNmrRemesaInterna(java.lang.String nmrRemesaInterna) {
        this.nmrRemesaInterna = nmrRemesaInterna;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdNmResumenPK)idComposite;
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
