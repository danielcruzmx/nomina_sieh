package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnRegControl data.
 */
public class TnRegControl implements Domain, Serializable {
    @PrimaryKey
    private TnRegControlPK idComposite;
    private java.util.Date fecModifico;
    private int idRegControl;
    private java.lang.String usuario;
    private java.lang.String descRegControl;
    private java.lang.String rcCapturaPermitida;
    private java.lang.Integer rcConsecEmp;
    private java.util.Date rcFecBaja;
    private java.util.Date rcFecLimCanc1;
    private java.util.Date rcFecLimCanc2;
    private java.util.Date rcFecLimEnter;
    private java.util.Date rcFecPago;
    private java.util.Date rcFecPagoDep;
    private java.util.Date rcFecRetiro;
    private java.util.Date rcFin;
    private java.util.Date rcIni;
    private java.lang.String rcLeyenda;
    private java.lang.String rcLeyendaEsp;
    private java.util.Date rcReinTesofeDel;
    private java.util.Date rcReinTesofeOfc;
    private java.lang.Double rcTipoCambio;
    private java.lang.String rcTipoNomina;
    private java.lang.String rcVigente;

    /**
     * Constructor for TnRegControl class.
     */
    public TnRegControl() {
    }

    /**
     * Constructor for TnRegControl class.
     *
     * @param rcCveTipoNom java.lang.String
     * @param rcNumComplemento java.lang.String
     * @param rcQnaCaptura java.lang.Integer
     * @param fecModifico java.util.Date
     * @param idRegControl int
     * @param usuario java.lang.String
     * @param descRegControl java.lang.String
     * @param rcCapturaPermitida java.lang.String
     * @param rcConsecEmp java.lang.Integer
     * @param rcFecBaja java.util.Date
     * @param rcFecLimCanc1 java.util.Date
     * @param rcFecLimCanc2 java.util.Date
     * @param rcFecLimEnter java.util.Date
     * @param rcFecPago java.util.Date
     * @param rcFecPagoDep java.util.Date
     * @param rcFecRetiro java.util.Date
     * @param rcFin java.util.Date
     * @param rcIni java.util.Date
     * @param rcLeyenda java.lang.String
     * @param rcLeyendaEsp java.lang.String
     * @param rcReinTesofeDel java.util.Date
     * @param rcReinTesofeOfc java.util.Date
     * @param rcTipoCambio java.lang.Double
     * @param rcTipoNomina java.lang.String
     * @param rcVigente java.lang.String
     */
    public TnRegControl(TnRegControlPK idComposite, java.util.Date fecModifico, 
                        int idRegControl, java.lang.String usuario, 
                        java.lang.String descRegControl, 
                        java.lang.String rcCapturaPermitida, 
                        java.lang.Integer rcConsecEmp, 
                        java.util.Date rcFecBaja, java.util.Date rcFecLimCanc1, 
                        java.util.Date rcFecLimCanc2, 
                        java.util.Date rcFecLimEnter, java.util.Date rcFecPago, 
                        java.util.Date rcFecPagoDep, 
                        java.util.Date rcFecRetiro, java.util.Date rcFin, 
                        java.util.Date rcIni, java.lang.String rcLeyenda, 
                        java.lang.String rcLeyendaEsp, 
                        java.util.Date rcReinTesofeDel, 
                        java.util.Date rcReinTesofeOfc, 
                        java.lang.Double rcTipoCambio, 
                        java.lang.String rcTipoNomina, 
                        java.lang.String rcVigente) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.idRegControl = idRegControl;
        this.usuario = usuario;
        this.descRegControl = descRegControl;
        this.rcCapturaPermitida = rcCapturaPermitida;
        this.rcConsecEmp = rcConsecEmp;
        this.rcFecBaja = rcFecBaja;
        this.rcFecLimCanc1 = rcFecLimCanc1;
        this.rcFecLimCanc2 = rcFecLimCanc2;
        this.rcFecLimEnter = rcFecLimEnter;
        this.rcFecPago = rcFecPago;
        this.rcFecPagoDep = rcFecPagoDep;
        this.rcFecRetiro = rcFecRetiro;
        this.rcFin = rcFin;
        this.rcIni = rcIni;
        this.rcLeyenda = rcLeyenda;
        this.rcLeyendaEsp = rcLeyendaEsp;
        this.rcReinTesofeDel = rcReinTesofeDel;
        this.rcReinTesofeOfc = rcReinTesofeOfc;
        this.rcTipoCambio = rcTipoCambio;
        this.rcTipoNomina = rcTipoNomina;
        this.rcVigente = rcVigente;
    }

    /**
     * Get rcCveTipoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcCveTipoNom() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRcCveTipoNom();
    }

    /**
     * Get rcNumComplemento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcNumComplemento() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRcNumComplemento();
    }

    /**
     * Get rcQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRcQnaCaptura() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRcQnaCaptura();
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
     * Get idRegControl value.
     *
     * @return int
     */
    public int getIdRegControl() {
        return this.idRegControl;
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
     * Get descRegControl value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescRegControl() {
        return this.descRegControl;
    }

    /**
     * Get rcCapturaPermitida value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcCapturaPermitida() {
        return this.rcCapturaPermitida;
    }

    /**
     * Get rcConsecEmp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRcConsecEmp() {
        return this.rcConsecEmp;
    }

    /**
     * Get rcFecBaja value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecBaja() {
        return this.rcFecBaja;
    }

    /**
     * Get rcFecLimCanc1 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecLimCanc1() {
        return this.rcFecLimCanc1;
    }

    /**
     * Get rcFecLimCanc2 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecLimCanc2() {
        return this.rcFecLimCanc2;
    }

    /**
     * Get rcFecLimEnter value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecLimEnter() {
        return this.rcFecLimEnter;
    }

    /**
     * Get rcFecPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecPago() {
        return this.rcFecPago;
    }

    /**
     * Get rcFecPagoDep value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecPagoDep() {
        return this.rcFecPagoDep;
    }

    /**
     * Get rcFecRetiro value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFecRetiro() {
        return this.rcFecRetiro;
    }

    /**
     * Get rcFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcFin() {
        return this.rcFin;
    }

    /**
     * Get rcIni value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcIni() {
        return this.rcIni;
    }

    /**
     * Get rcLeyenda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcLeyenda() {
        return this.rcLeyenda;
    }

    /**
     * Get rcLeyendaEsp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcLeyendaEsp() {
        return this.rcLeyendaEsp;
    }

    /**
     * Get rcReinTesofeDel value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcReinTesofeDel() {
        return this.rcReinTesofeDel;
    }

    /**
     * Get rcReinTesofeOfc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRcReinTesofeOfc() {
        return this.rcReinTesofeOfc;
    }

    /**
     * Get rcTipoCambio value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getRcTipoCambio() {
        return this.rcTipoCambio;
    }

    /**
     * Get rcTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcTipoNomina() {
        return this.rcTipoNomina;
    }

    /**
     * Get rcVigente value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRcVigente() {
        return this.rcVigente;
    }

    /**
     * Set rcCveTipoNom value.
     *
     * @param rcCveTipoNom java.lang.String
     */
    public void setRcCveTipoNom(java.lang.String rcCveTipoNom) {
        if (idComposite == null) {
            idComposite = new TnRegControlPK();
        }
        this.idComposite.setRcCveTipoNom(rcCveTipoNom);
    }

    /**
     * Set rcNumComplemento value.
     *
     * @param rcNumComplemento java.lang.String
     */
    public void setRcNumComplemento(java.lang.String rcNumComplemento) {
        if (idComposite == null) {
            idComposite = new TnRegControlPK();
        }
        this.idComposite.setRcNumComplemento(rcNumComplemento);
    }

    /**
     * Set rcQnaCaptura value.
     *
     * @param rcQnaCaptura java.lang.Integer
     */
    public void setRcQnaCaptura(java.lang.Integer rcQnaCaptura) {
        if (idComposite == null) {
            idComposite = new TnRegControlPK();
        }
        this.idComposite.setRcQnaCaptura(rcQnaCaptura);
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
     * Set idRegControl value.
     *
     * @param idRegControl int
     */
    public void setIdRegControl(int idRegControl) {
        this.idRegControl = idRegControl;
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
     * Set descRegControl value.
     *
     * @param descRegControl java.lang.String
     */
    public void setDescRegControl(java.lang.String descRegControl) {
        this.descRegControl = descRegControl;
    }

    /**
     * Set rcCapturaPermitida value.
     *
     * @param rcCapturaPermitida java.lang.String
     */
    public void setRcCapturaPermitida(java.lang.String rcCapturaPermitida) {
        this.rcCapturaPermitida = rcCapturaPermitida;
    }

    /**
     * Set rcConsecEmp value.
     *
     * @param rcConsecEmp java.lang.Integer
     */
    public void setRcConsecEmp(java.lang.Integer rcConsecEmp) {
        this.rcConsecEmp = rcConsecEmp;
    }

    /**
     * Set rcFecBaja value.
     *
     * @param rcFecBaja java.util.Date
     */
    public void setRcFecBaja(java.util.Date rcFecBaja) {
        this.rcFecBaja = rcFecBaja;
    }

    /**
     * Set rcFecLimCanc1 value.
     *
     * @param rcFecLimCanc1 java.util.Date
     */
    public void setRcFecLimCanc1(java.util.Date rcFecLimCanc1) {
        this.rcFecLimCanc1 = rcFecLimCanc1;
    }

    /**
     * Set rcFecLimCanc2 value.
     *
     * @param rcFecLimCanc2 java.util.Date
     */
    public void setRcFecLimCanc2(java.util.Date rcFecLimCanc2) {
        this.rcFecLimCanc2 = rcFecLimCanc2;
    }

    /**
     * Set rcFecLimEnter value.
     *
     * @param rcFecLimEnter java.util.Date
     */
    public void setRcFecLimEnter(java.util.Date rcFecLimEnter) {
        this.rcFecLimEnter = rcFecLimEnter;
    }

    /**
     * Set rcFecPago value.
     *
     * @param rcFecPago java.util.Date
     */
    public void setRcFecPago(java.util.Date rcFecPago) {
        this.rcFecPago = rcFecPago;
    }

    /**
     * Set rcFecPagoDep value.
     *
     * @param rcFecPagoDep java.util.Date
     */
    public void setRcFecPagoDep(java.util.Date rcFecPagoDep) {
        this.rcFecPagoDep = rcFecPagoDep;
    }

    /**
     * Set rcFecRetiro value.
     *
     * @param rcFecRetiro java.util.Date
     */
    public void setRcFecRetiro(java.util.Date rcFecRetiro) {
        this.rcFecRetiro = rcFecRetiro;
    }

    /**
     * Set rcFin value.
     *
     * @param rcFin java.util.Date
     */
    public void setRcFin(java.util.Date rcFin) {
        this.rcFin = rcFin;
    }

    /**
     * Set rcIni value.
     *
     * @param rcIni java.util.Date
     */
    public void setRcIni(java.util.Date rcIni) {
        this.rcIni = rcIni;
    }

    /**
     * Set rcLeyenda value.
     *
     * @param rcLeyenda java.lang.String
     */
    public void setRcLeyenda(java.lang.String rcLeyenda) {
        this.rcLeyenda = rcLeyenda;
    }

    /**
     * Set rcLeyendaEsp value.
     *
     * @param rcLeyendaEsp java.lang.String
     */
    public void setRcLeyendaEsp(java.lang.String rcLeyendaEsp) {
        this.rcLeyendaEsp = rcLeyendaEsp;
    }

    /**
     * Set rcReinTesofeDel value.
     *
     * @param rcReinTesofeDel java.util.Date
     */
    public void setRcReinTesofeDel(java.util.Date rcReinTesofeDel) {
        this.rcReinTesofeDel = rcReinTesofeDel;
    }

    /**
     * Set rcReinTesofeOfc value.
     *
     * @param rcReinTesofeOfc java.util.Date
     */
    public void setRcReinTesofeOfc(java.util.Date rcReinTesofeOfc) {
        this.rcReinTesofeOfc = rcReinTesofeOfc;
    }

    /**
     * Set rcTipoCambio value.
     *
     * @param rcTipoCambio java.lang.Double
     */
    public void setRcTipoCambio(java.lang.Double rcTipoCambio) {
        this.rcTipoCambio = rcTipoCambio;
    }

    /**
     * Set rcTipoNomina value.
     *
     * @param rcTipoNomina java.lang.String
     */
    public void setRcTipoNomina(java.lang.String rcTipoNomina) {
        this.rcTipoNomina = rcTipoNomina;
    }

    /**
     * Set rcVigente value.
     *
     * @param rcVigente java.lang.String
     */
    public void setRcVigente(java.lang.String rcVigente) {
        this.rcVigente = rcVigente;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnRegControlPK)idComposite;
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
