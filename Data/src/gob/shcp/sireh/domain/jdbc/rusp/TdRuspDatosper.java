package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdRuspDatosper data.
 */
public class TdRuspDatosper implements Domain, Serializable {
    
    private TdRuspDatosperPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String idUnidad;
    private java.lang.String rdCurp;
    private java.lang.String rdNombre;
    private java.lang.String rdPrimerApellido;
    private java.lang.Integer rdRamo;
    private java.lang.String rdSegundoApellido;
    private java.lang.String rdSpAa;
    private java.lang.String rdSpCalle;
    private java.lang.String rdSpColonia;
    private java.lang.Integer rdSpCp;
    private java.lang.String rdSpEntfed;
    private java.lang.String rdSpMuDel;
    private java.lang.String rdSpNumEmp;
    private java.lang.Integer rdSpPais;

    /**
     * Constructor for TdRuspDatosper class.
     */
    public TdRuspDatosper() {
    }

    /**
     * Constructor for TdRuspDatosper class.
     *
     * @param rdQnaPago java.lang.Integer
     * @param rdRfcSp java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idUnidad java.lang.String
     * @param rdCurp java.lang.String
     * @param rdNombre java.lang.String
     * @param rdPrimerApellido java.lang.String
     * @param rdRamo java.lang.Integer
     * @param rdSegundoApellido java.lang.String
     * @param rdSpAa java.lang.String
     * @param rdSpCalle java.lang.String
     * @param rdSpColonia java.lang.String
     * @param rdSpCp java.lang.Integer
     * @param rdSpEntfed java.lang.String
     * @param rdSpMuDel java.lang.String
     * @param rdSpNumEmp java.lang.String
     * @param rdSpPais java.lang.Integer
     */
    public TdRuspDatosper(TdRuspDatosperPK idComposite, java.util.Date fecModifico, java.lang.String usuario, 
                          java.lang.String idUnidad, java.lang.String rdCurp, java.lang.String rdNombre, 
                          java.lang.String rdPrimerApellido, java.lang.Integer rdRamo, 
                          java.lang.String rdSegundoApellido, java.lang.String rdSpAa, java.lang.String rdSpCalle, 
                          java.lang.String rdSpColonia, java.lang.Integer rdSpCp, java.lang.String rdSpEntfed, 
                          java.lang.String rdSpMuDel, java.lang.String rdSpNumEmp, java.lang.Integer rdSpPais) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idUnidad = idUnidad;
        this.rdCurp = rdCurp;
        this.rdNombre = rdNombre;
        this.rdPrimerApellido = rdPrimerApellido;
        this.rdRamo = rdRamo;
        this.rdSegundoApellido = rdSegundoApellido;
        this.rdSpAa = rdSpAa;
        this.rdSpCalle = rdSpCalle;
        this.rdSpColonia = rdSpColonia;
        this.rdSpCp = rdSpCp;
        this.rdSpEntfed = rdSpEntfed;
        this.rdSpMuDel = rdSpMuDel;
        this.rdSpNumEmp = rdSpNumEmp;
        this.rdSpPais = rdSpPais;
    }
    
    /**
     * Get rdQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdQnaPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRdQnaPago();
    }

    /**
     * Get rdRfcSp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdRfcSp() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRdRfcSp();
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
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
    }

    /**
     * Get rdCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdCurp() {
        return this.rdCurp;
    }

    /**
     * Get rdNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdNombre() {
        return this.rdNombre;
    }

    /**
     * Get rdPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdPrimerApellido() {
        return this.rdPrimerApellido;
    }

    /**
     * Get rdRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdRamo() {
        return this.rdRamo;
    }

    /**
     * Get rdSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSegundoApellido() {
        return this.rdSegundoApellido;
    }

    /**
     * Get rdSpAa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpAa() {
        return this.rdSpAa;
    }

    /**
     * Get rdSpCalle value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpCalle() {
        return this.rdSpCalle;
    }

    /**
     * Get rdSpColonia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpColonia() {
        return this.rdSpColonia;
    }

    /**
     * Get rdSpCp value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdSpCp() {
        return this.rdSpCp;
    }

    /**
     * Get rdSpEntfed value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpEntfed() {
        return this.rdSpEntfed;
    }

    /**
     * Get rdSpMuDel value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpMuDel() {
        return this.rdSpMuDel;
    }

    /**
     * Get rdSpNumEmp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRdSpNumEmp() {
        return this.rdSpNumEmp;
    }

    /**
     * Get rdSpPais value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRdSpPais() {
        return this.rdSpPais;
    }


    /**
     * Set rdQnaPago value.
     *
     * @param rdQnaPago java.lang.Integer
     */
    public void setRdQnaPago(java.lang.Integer rdQnaPago) {
        if (idComposite == null) {
            idComposite = new TdRuspDatosperPK();
        }
        this.idComposite.setRdQnaPago(rdQnaPago);
    }

    /**
     * Set rdRfcSp value.
     *
     * @param rdRfcSp java.lang.String
     */
    public void setRdRfcSp(java.lang.String rdRfcSp) {
        if (idComposite == null) {
            idComposite = new TdRuspDatosperPK();
        }
        this.idComposite.setRdRfcSp(rdRfcSp);
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
    }

    /**
     * Set rdCurp value.
     *
     * @param rdCurp java.lang.String
     */
    public void setRdCurp(java.lang.String rdCurp) {
        this.rdCurp = rdCurp;
    }

    /**
     * Set rdNombre value.
     *
     * @param rdNombre java.lang.String
     */
    public void setRdNombre(java.lang.String rdNombre) {
        this.rdNombre = rdNombre;
    }

    /**
     * Set rdPrimerApellido value.
     *
     * @param rdPrimerApellido java.lang.String
     */
    public void setRdPrimerApellido(java.lang.String rdPrimerApellido) {
        this.rdPrimerApellido = rdPrimerApellido;
    }

    /**
     * Set rdRamo value.
     *
     * @param rdRamo java.lang.Integer
     */
    public void setRdRamo(java.lang.Integer rdRamo) {
        this.rdRamo = rdRamo;
    }

    /**
     * Set rdSegundoApellido value.
     *
     * @param rdSegundoApellido java.lang.String
     */
    public void setRdSegundoApellido(java.lang.String rdSegundoApellido) {
        this.rdSegundoApellido = rdSegundoApellido;
    }

    /**
     * Set rdSpAa value.
     *
     * @param rdSpAa java.lang.String
     */
    public void setRdSpAa(java.lang.String rdSpAa) {
        this.rdSpAa = rdSpAa;
    }

    /**
     * Set rdSpCalle value.
     *
     * @param rdSpCalle java.lang.String
     */
    public void setRdSpCalle(java.lang.String rdSpCalle) {
        this.rdSpCalle = rdSpCalle;
    }

    /**
     * Set rdSpColonia value.
     *
     * @param rdSpColonia java.lang.String
     */
    public void setRdSpColonia(java.lang.String rdSpColonia) {
        this.rdSpColonia = rdSpColonia;
    }

    /**
     * Set rdSpCp value.
     *
     * @param rdSpCp java.lang.Integer
     */
    public void setRdSpCp(java.lang.Integer rdSpCp) {
        this.rdSpCp = rdSpCp;
    }

    /**
     * Set rdSpEntfed value.
     *
     * @param rdSpEntfed java.lang.String
     */
    public void setRdSpEntfed(java.lang.String rdSpEntfed) {
        this.rdSpEntfed = rdSpEntfed;
    }

    /**
     * Set rdSpMuDel value.
     *
     * @param rdSpMuDel java.lang.String
     */
    public void setRdSpMuDel(java.lang.String rdSpMuDel) {
        this.rdSpMuDel = rdSpMuDel;
    }

    /**
     * Set rdSpNumEmp value.
     *
     * @param rdSpNumEmp java.lang.String
     */
    public void setRdSpNumEmp(java.lang.String rdSpNumEmp) {
        this.rdSpNumEmp = rdSpNumEmp;
    }

    /**
     * Set rdSpPais value.
     *
     * @param rdSpPais java.lang.Integer
     */
    public void setRdSpPais(java.lang.Integer rdSpPais) {
        this.rdSpPais = rdSpPais;
    }
    
    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdRuspDatosperPK)idComposite;
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
