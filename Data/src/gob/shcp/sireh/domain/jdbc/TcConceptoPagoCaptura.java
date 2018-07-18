package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TcConceptoPagoCaptura data.
 */
public class TcConceptoPagoCaptura implements Domain, Serializable {
    private TcConceptoPagoCapturaPK idComposite;
    private java.lang.String cpcBloque;
    private java.lang.String cpcNombramiento;
    private java.lang.String cpcPermanente;
    private java.lang.String cpcTipoCalculo;
    private java.lang.String cpcTipoCaptura;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String cpcMensaje;
    private java.lang.String cpcNivelesPto;
    private java.lang.String cpcOpcion0;
    private java.lang.String cpcOpcion1;
    private java.lang.String cpcOpcion2;
    private java.lang.String cpcOpcion3;
    private java.lang.String cpcOpcion4;
    private java.lang.String cpcOpcion5;
    private java.lang.String cpcOpcion6;
    private java.lang.String cpcOpcion7;
    private java.lang.String cpcOpcion8;
    private java.lang.String cpcOpcion9;
    private java.lang.String cpcSubtipo;
    private java.lang.Double cpcValor0;
    private java.lang.Double cpcValor1;
    private java.lang.Double cpcValor2;
    private java.lang.Double cpcValor3;
    private java.lang.Double cpcValor4;
    private java.lang.Double cpcValor5;
    private java.lang.Double cpcValor6;
    private java.lang.Double cpcValor7;
    private java.lang.Double cpcValor8;
    private java.lang.Double cpcValor9;

    /**
     * Constructor for TcConceptoPagoCaptura class.
     */
    public TcConceptoPagoCaptura() {
    }

    /**
     * Constructor for TcConceptoPagoCaptura class.
     *
     * @param idCptoPago java.lang.String
     * @param idTipoCpto java.lang.String
     * @param cpcBloque java.lang.String
     * @param cpcNombramiento java.lang.String
     * @param cpcPermanente java.lang.String
     * @param cpcTipoCalculo java.lang.String
     * @param cpcTipoCaptura java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cpcMensaje java.lang.String
     * @param cpcNivelesPto java.lang.String
     * @param cpcOpcion0 java.lang.String
     * @param cpcOpcion1 java.lang.String
     * @param cpcOpcion2 java.lang.String
     * @param cpcOpcion3 java.lang.String
     * @param cpcOpcion4 java.lang.String
     * @param cpcOpcion5 java.lang.String
     * @param cpcOpcion6 java.lang.String
     * @param cpcOpcion7 java.lang.String
     * @param cpcOpcion8 java.lang.String
     * @param cpcOpcion9 java.lang.String
     * @param cpcSubtipo java.lang.String
     * @param cpcValor0 java.lang.Double
     * @param cpcValor1 java.lang.Double
     * @param cpcValor2 java.lang.Double
     * @param cpcValor3 java.lang.Double
     * @param cpcValor4 java.lang.Double
     * @param cpcValor5 java.lang.Double
     * @param cpcValor6 java.lang.Double
     * @param cpcValor7 java.lang.Double
     * @param cpcValor8 java.lang.Double
     * @param cpcValor9 java.lang.Double
     */
    public TcConceptoPagoCaptura(TcConceptoPagoCapturaPK idComposite, 
                                 java.lang.String cpcBloque, 
                                 java.lang.String cpcNombramiento, 
                                 java.lang.String cpcPermanente, 
                                 java.lang.String cpcTipoCalculo, 
                                 java.lang.String cpcTipoCaptura, 
                                 java.util.Date fecModifico, 
                                 java.lang.String usuario, 
                                 java.lang.String cpcMensaje, 
                                 java.lang.String cpcNivelesPto, 
                                 java.lang.String cpcOpcion0, 
                                 java.lang.String cpcOpcion1, 
                                 java.lang.String cpcOpcion2, 
                                 java.lang.String cpcOpcion3, 
                                 java.lang.String cpcOpcion4, 
                                 java.lang.String cpcOpcion5, 
                                 java.lang.String cpcOpcion6, 
                                 java.lang.String cpcOpcion7, 
                                 java.lang.String cpcOpcion8, 
                                 java.lang.String cpcOpcion9, 
                                 java.lang.String cpcSubtipo, 
                                 java.lang.Double cpcValor0, 
                                 java.lang.Double cpcValor1, 
                                 java.lang.Double cpcValor2, 
                                 java.lang.Double cpcValor3, 
                                 java.lang.Double cpcValor4, 
                                 java.lang.Double cpcValor5, 
                                 java.lang.Double cpcValor6, 
                                 java.lang.Double cpcValor7, 
                                 java.lang.Double cpcValor8, 
                                 java.lang.Double cpcValor9) {
        this.idComposite = idComposite;
        this.cpcBloque = cpcBloque;
        this.cpcNombramiento = cpcNombramiento;
        this.cpcPermanente = cpcPermanente;
        this.cpcTipoCalculo = cpcTipoCalculo;
        this.cpcTipoCaptura = cpcTipoCaptura;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cpcMensaje = cpcMensaje;
        this.cpcNivelesPto = cpcNivelesPto;
        this.cpcOpcion0 = cpcOpcion0;
        this.cpcOpcion1 = cpcOpcion1;
        this.cpcOpcion2 = cpcOpcion2;
        this.cpcOpcion3 = cpcOpcion3;
        this.cpcOpcion4 = cpcOpcion4;
        this.cpcOpcion5 = cpcOpcion5;
        this.cpcOpcion6 = cpcOpcion6;
        this.cpcOpcion7 = cpcOpcion7;
        this.cpcOpcion8 = cpcOpcion8;
        this.cpcOpcion9 = cpcOpcion9;
        this.cpcSubtipo = cpcSubtipo;
        this.cpcValor0 = cpcValor0;
        this.cpcValor1 = cpcValor1;
        this.cpcValor2 = cpcValor2;
        this.cpcValor3 = cpcValor3;
        this.cpcValor4 = cpcValor4;
        this.cpcValor5 = cpcValor5;
        this.cpcValor6 = cpcValor6;
        this.cpcValor7 = cpcValor7;
        this.cpcValor8 = cpcValor8;
        this.cpcValor9 = cpcValor9;
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
     * Get cpcBloque value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcBloque() {
        return this.cpcBloque;
    }

    /**
     * Get cpcNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcNombramiento() {
        return this.cpcNombramiento;
    }

    /**
     * Get cpcPermanente value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcPermanente() {
        return this.cpcPermanente;
    }

    /**
     * Get cpcTipoCalculo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcTipoCalculo() {
        return this.cpcTipoCalculo;
    }

    /**
     * Get cpcTipoCaptura value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcTipoCaptura() {
        return this.cpcTipoCaptura;
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
     * Get cpcMensaje value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcMensaje() {
        return this.cpcMensaje;
    }

    /**
     * Get cpcNivelesPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcNivelesPto() {
        return this.cpcNivelesPto;
    }

    /**
     * Get cpcOpcion0 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion0() {
        return this.cpcOpcion0;
    }

    /**
     * Get cpcOpcion1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion1() {
        return this.cpcOpcion1;
    }

    /**
     * Get cpcOpcion2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion2() {
        return this.cpcOpcion2;
    }

    /**
     * Get cpcOpcion3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion3() {
        return this.cpcOpcion3;
    }

    /**
     * Get cpcOpcion4 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion4() {
        return this.cpcOpcion4;
    }

    /**
     * Get cpcOpcion5 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion5() {
        return this.cpcOpcion5;
    }

    /**
     * Get cpcOpcion6 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion6() {
        return this.cpcOpcion6;
    }

    /**
     * Get cpcOpcion7 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion7() {
        return this.cpcOpcion7;
    }

    /**
     * Get cpcOpcion8 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion8() {
        return this.cpcOpcion8;
    }

    /**
     * Get cpcOpcion9 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcOpcion9() {
        return this.cpcOpcion9;
    }

    /**
     * Get cpcSubtipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCpcSubtipo() {
        return this.cpcSubtipo;
    }

    /**
     * Get cpcValor0 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor0() {
        return this.cpcValor0;
    }

    /**
     * Get cpcValor1 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor1() {
        return this.cpcValor1;
    }

    /**
     * Get cpcValor2 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor2() {
        return this.cpcValor2;
    }

    /**
     * Get cpcValor3 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor3() {
        return this.cpcValor3;
    }

    /**
     * Get cpcValor4 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor4() {
        return this.cpcValor4;
    }

    /**
     * Get cpcValor5 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor5() {
        return this.cpcValor5;
    }

    /**
     * Get cpcValor6 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor6() {
        return this.cpcValor6;
    }

    /**
     * Get cpcValor7 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor7() {
        return this.cpcValor7;
    }

    /**
     * Get cpcValor8 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor8() {
        return this.cpcValor8;
    }

    /**
     * Get cpcValor9 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getCpcValor9() {
        return this.cpcValor9;
    }

    /**
     * Set idCptoPago value.
     *
     * @param idCptoPago java.lang.String
     */
    public void setIdCptoPago(java.lang.String idCptoPago) {
        if (idComposite == null) {
            idComposite = new TcConceptoPagoCapturaPK();
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
            idComposite = new TcConceptoPagoCapturaPK();
        }
        this.idComposite.setIdTipoCpto(idTipoCpto);
    }

    /**
     * Set cpcBloque value.
     *
     * @param cpcBloque java.lang.String
     */
    public void setCpcBloque(java.lang.String cpcBloque) {
        this.cpcBloque = cpcBloque;
    }

    /**
     * Set cpcNombramiento value.
     *
     * @param cpcNombramiento java.lang.String
     */
    public void setCpcNombramiento(java.lang.String cpcNombramiento) {
        this.cpcNombramiento = cpcNombramiento;
    }

    /**
     * Set cpcPermanente value.
     *
     * @param cpcPermanente java.lang.String
     */
    public void setCpcPermanente(java.lang.String cpcPermanente) {
        this.cpcPermanente = cpcPermanente;
    }

    /**
     * Set cpcTipoCalculo value.
     *
     * @param cpcTipoCalculo java.lang.String
     */
    public void setCpcTipoCalculo(java.lang.String cpcTipoCalculo) {
        this.cpcTipoCalculo = cpcTipoCalculo;
    }

    /**
     * Set cpcTipoCaptura value.
     *
     * @param cpcTipoCaptura java.lang.String
     */
    public void setCpcTipoCaptura(java.lang.String cpcTipoCaptura) {
        this.cpcTipoCaptura = cpcTipoCaptura;
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
     * Set cpcMensaje value.
     *
     * @param cpcMensaje java.lang.String
     */
    public void setCpcMensaje(java.lang.String cpcMensaje) {
        this.cpcMensaje = cpcMensaje;
    }

    /**
     * Set cpcNivelesPto value.
     *
     * @param cpcNivelesPto java.lang.String
     */
    public void setCpcNivelesPto(java.lang.String cpcNivelesPto) {
        this.cpcNivelesPto = cpcNivelesPto;
    }

    /**
     * Set cpcOpcion0 value.
     *
     * @param cpcOpcion0 java.lang.String
     */
    public void setCpcOpcion0(java.lang.String cpcOpcion0) {
        this.cpcOpcion0 = cpcOpcion0;
    }

    /**
     * Set cpcOpcion1 value.
     *
     * @param cpcOpcion1 java.lang.String
     */
    public void setCpcOpcion1(java.lang.String cpcOpcion1) {
        this.cpcOpcion1 = cpcOpcion1;
    }

    /**
     * Set cpcOpcion2 value.
     *
     * @param cpcOpcion2 java.lang.String
     */
    public void setCpcOpcion2(java.lang.String cpcOpcion2) {
        this.cpcOpcion2 = cpcOpcion2;
    }

    /**
     * Set cpcOpcion3 value.
     *
     * @param cpcOpcion3 java.lang.String
     */
    public void setCpcOpcion3(java.lang.String cpcOpcion3) {
        this.cpcOpcion3 = cpcOpcion3;
    }

    /**
     * Set cpcOpcion4 value.
     *
     * @param cpcOpcion4 java.lang.String
     */
    public void setCpcOpcion4(java.lang.String cpcOpcion4) {
        this.cpcOpcion4 = cpcOpcion4;
    }

    /**
     * Set cpcOpcion5 value.
     *
     * @param cpcOpcion5 java.lang.String
     */
    public void setCpcOpcion5(java.lang.String cpcOpcion5) {
        this.cpcOpcion5 = cpcOpcion5;
    }

    /**
     * Set cpcOpcion6 value.
     *
     * @param cpcOpcion6 java.lang.String
     */
    public void setCpcOpcion6(java.lang.String cpcOpcion6) {
        this.cpcOpcion6 = cpcOpcion6;
    }

    /**
     * Set cpcOpcion7 value.
     *
     * @param cpcOpcion7 java.lang.String
     */
    public void setCpcOpcion7(java.lang.String cpcOpcion7) {
        this.cpcOpcion7 = cpcOpcion7;
    }

    /**
     * Set cpcOpcion8 value.
     *
     * @param cpcOpcion8 java.lang.String
     */
    public void setCpcOpcion8(java.lang.String cpcOpcion8) {
        this.cpcOpcion8 = cpcOpcion8;
    }

    /**
     * Set cpcOpcion9 value.
     *
     * @param cpcOpcion9 java.lang.String
     */
    public void setCpcOpcion9(java.lang.String cpcOpcion9) {
        this.cpcOpcion9 = cpcOpcion9;
    }

    /**
     * Set cpcSubtipo value.
     *
     * @param cpcSubtipo java.lang.String
     */
    public void setCpcSubtipo(java.lang.String cpcSubtipo) {
        this.cpcSubtipo = cpcSubtipo;
    }

    /**
     * Set cpcValor0 value.
     *
     * @param cpcValor0 java.lang.Double
     */
    public void setCpcValor0(java.lang.Double cpcValor0) {
        this.cpcValor0 = cpcValor0;
    }

    /**
     * Set cpcValor1 value.
     *
     * @param cpcValor1 java.lang.Double
     */
    public void setCpcValor1(java.lang.Double cpcValor1) {
        this.cpcValor1 = cpcValor1;
    }

    /**
     * Set cpcValor2 value.
     *
     * @param cpcValor2 java.lang.Double
     */
    public void setCpcValor2(java.lang.Double cpcValor2) {
        this.cpcValor2 = cpcValor2;
    }

    /**
     * Set cpcValor3 value.
     *
     * @param cpcValor3 java.lang.Double
     */
    public void setCpcValor3(java.lang.Double cpcValor3) {
        this.cpcValor3 = cpcValor3;
    }

    /**
     * Set cpcValor4 value.
     *
     * @param cpcValor4 java.lang.Double
     */
    public void setCpcValor4(java.lang.Double cpcValor4) {
        this.cpcValor4 = cpcValor4;
    }

    /**
     * Set cpcValor5 value.
     *
     * @param cpcValor5 java.lang.Double
     */
    public void setCpcValor5(java.lang.Double cpcValor5) {
        this.cpcValor5 = cpcValor5;
    }

    /**
     * Set cpcValor6 value.
     *
     * @param cpcValor6 java.lang.Double
     */
    public void setCpcValor6(java.lang.Double cpcValor6) {
        this.cpcValor6 = cpcValor6;
    }

    /**
     * Set cpcValor7 value.
     *
     * @param cpcValor7 java.lang.Double
     */
    public void setCpcValor7(java.lang.Double cpcValor7) {
        this.cpcValor7 = cpcValor7;
    }

    /**
     * Set cpcValor8 value.
     *
     * @param cpcValor8 java.lang.Double
     */
    public void setCpcValor8(java.lang.Double cpcValor8) {
        this.cpcValor8 = cpcValor8;
    }

    /**
     * Set cpcValor9 value.
     *
     * @param cpcValor9 java.lang.Double
     */
    public void setCpcValor9(java.lang.Double cpcValor9) {
        this.cpcValor9 = cpcValor9;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TcConceptoPagoCapturaPK)idComposite;
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
