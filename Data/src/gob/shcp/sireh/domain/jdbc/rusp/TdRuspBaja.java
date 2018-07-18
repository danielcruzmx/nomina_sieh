package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdRuspBaja data.
 */
public class TdRuspBaja implements Domain, Serializable {
    
    private TdRuspBajaPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String idUnidad;
    private java.lang.String rbCurp;
    private java.util.Date rbFechaBaja;
    private java.lang.Integer rbMotivoBaja;
    private java.lang.String rbNombre;
    private java.lang.String rbNumEmpleado;
    private java.lang.String rbPrimerApellido;
    private java.lang.Integer rbRamo;
    private java.lang.String rbSegundoApellido;

    /**
     * Constructor for TdRuspBaja class.
     */
    public TdRuspBaja() {
    }

    /**
     * Constructor for TdRuspBaja class.
     *
     * @param rbCiclo java.lang.Integer
     * @param rbQnaPago java.lang.Integer
     * @param rbRfc java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idUnidad java.lang.String
     * @param rbCurp java.lang.String
     * @param rbFechaBaja java.util.Date
     * @param rbMotivoBaja java.lang.Integer
     * @param rbNombre java.lang.String
     * @param rbNumEmpleado java.lang.String
     * @param rbPrimerApellido java.lang.String
     * @param rbRamo java.lang.Integer
     * @param rbSegundoApellido java.lang.String
     */
    public TdRuspBaja(TdRuspBajaPK idComposite, java.util.Date fecModifico, java.lang.String usuario, 
                      java.lang.String idUnidad, java.lang.String rbCurp, java.util.Date rbFechaBaja, 
                      java.lang.Integer rbMotivoBaja, java.lang.String rbNombre, java.lang.String rbNumEmpleado, 
                      java.lang.String rbPrimerApellido, java.lang.Integer rbRamo, 
                      java.lang.String rbSegundoApellido) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idUnidad = idUnidad;
        this.rbCurp = rbCurp;
        this.rbFechaBaja = rbFechaBaja;
        this.rbMotivoBaja = rbMotivoBaja;
        this.rbNombre = rbNombre;
        this.rbNumEmpleado = rbNumEmpleado;
        this.rbPrimerApellido = rbPrimerApellido;
        this.rbRamo = rbRamo;
        this.rbSegundoApellido = rbSegundoApellido;
    }
    
    /**
     * Get rbCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRbCiclo();
    }

    /**
     * Get rbQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbQnaPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRbQnaPago();
    }

    /**
     * Get rbRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRbRfc();
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
     * Get rbCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbCurp() {
        return this.rbCurp;
    }

    /**
     * Get rbFechaBaja value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRbFechaBaja() {
        return this.rbFechaBaja;
    }

    /**
     * Get rbMotivoBaja value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbMotivoBaja() {
        return this.rbMotivoBaja;
    }

    /**
     * Get rbNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbNombre() {
        return this.rbNombre;
    }

    /**
     * Get rbNumEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbNumEmpleado() {
        return this.rbNumEmpleado;
    }

    /**
     * Get rbPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbPrimerApellido() {
        return this.rbPrimerApellido;
    }

    /**
     * Get rbRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRbRamo() {
        return this.rbRamo;
    }

    /**
     * Get rbSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRbSegundoApellido() {
        return this.rbSegundoApellido;
    }


    /**
     * Set rbCiclo value.
     *
     * @param rbCiclo java.lang.Integer
     */
    public void setRbCiclo(java.lang.Integer rbCiclo) {
        if (idComposite == null) {
            idComposite = new TdRuspBajaPK();
        }
        this.idComposite.setRbCiclo(rbCiclo);
    }

    /**
     * Set rbQnaPago value.
     *
     * @param rbQnaPago java.lang.Integer
     */
    public void setRbQnaPago(java.lang.Integer rbQnaPago) {
        if (idComposite == null) {
            idComposite = new TdRuspBajaPK();
        }
        this.idComposite.setRbQnaPago(rbQnaPago);
    }

    /**
     * Set rbRfc value.
     *
     * @param rbRfc java.lang.String
     */
    public void setRbRfc(java.lang.String rbRfc) {
        if (idComposite == null) {
            idComposite = new TdRuspBajaPK();
        }
        this.idComposite.setRbRfc(rbRfc);
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
     * Set rbCurp value.
     *
     * @param rbCurp java.lang.String
     */
    public void setRbCurp(java.lang.String rbCurp) {
        this.rbCurp = rbCurp;
    }

    /**
     * Set rbFechaBaja value.
     *
     * @param rbFechaBaja java.util.Date
     */
    public void setRbFechaBaja(java.util.Date rbFechaBaja) {
        this.rbFechaBaja = rbFechaBaja;
    }

    /**
     * Set rbMotivoBaja value.
     *
     * @param rbMotivoBaja java.lang.Integer
     */
    public void setRbMotivoBaja(java.lang.Integer rbMotivoBaja) {
        this.rbMotivoBaja = rbMotivoBaja;
    }

    /**
     * Set rbNombre value.
     *
     * @param rbNombre java.lang.String
     */
    public void setRbNombre(java.lang.String rbNombre) {
        this.rbNombre = rbNombre;
    }

    /**
     * Set rbNumEmpleado value.
     *
     * @param rbNumEmpleado java.lang.String
     */
    public void setRbNumEmpleado(java.lang.String rbNumEmpleado) {
        this.rbNumEmpleado = rbNumEmpleado;
    }

    /**
     * Set rbPrimerApellido value.
     *
     * @param rbPrimerApellido java.lang.String
     */
    public void setRbPrimerApellido(java.lang.String rbPrimerApellido) {
        this.rbPrimerApellido = rbPrimerApellido;
    }

    /**
     * Set rbRamo value.
     *
     * @param rbRamo java.lang.Integer
     */
    public void setRbRamo(java.lang.Integer rbRamo) {
        this.rbRamo = rbRamo;
    }

    /**
     * Set rbSegundoApellido value.
     *
     * @param rbSegundoApellido java.lang.String
     */
    public void setRbSegundoApellido(java.lang.String rbSegundoApellido) {
        this.rbSegundoApellido = rbSegundoApellido;
    }
    
    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdRuspBajaPK)idComposite;
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
