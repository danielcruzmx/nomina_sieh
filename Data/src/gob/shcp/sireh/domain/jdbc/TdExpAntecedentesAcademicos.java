package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpAntecedentesAcademico data.
 */
public class TdExpAntecedentesAcademicos implements Domain, Serializable {
    private TdExpAntecedentesAcademicoPK idComposite;
    private int idExpRechazo;
    private java.lang.String aacDoctoRef;
    private java.lang.String aacEstConcluidos;
    private java.util.Date fecModifico;
    private int idInstEducat;
    private int idNivelEscolar;
    private float idProfCarrera;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.Integer aacCedProfesional;
    private java.lang.Float aacPromedio;

    /**
     * Constructor for TdExpAntecedentesAcademico class.
     */
    public TdExpAntecedentesAcademicos() {
    }

    /**
     * Constructor for TdExpAntecedentesAcademico class.
     *
     * @param aacSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param aacDoctoRef java.lang.String
     * @param aacEstConcluidos java.lang.String
     * @param fecModifico java.util.Date
     * @param idInstEducat int
     * @param idNivelEscolar int
     * @param idProfCarrera float
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param aacCedProfesional java.lang.Integer
     * @param aacPromedio java.lang.Float
     */
    public TdExpAntecedentesAcademicos(TdExpAntecedentesAcademicoPK idComposite, 
                                       int idExpRechazo, 
                                       java.lang.String aacDoctoRef, 
                                       java.lang.String aacEstConcluidos, 
                                       java.util.Date fecModifico, 
                                       int idInstEducat, int idNivelEscolar, 
                                       float idProfCarrera, 
                                       java.lang.String idStatus, 
                                       java.lang.String usuario, 
                                       java.lang.Integer aacCedProfesional, 
                                       java.lang.Float aacPromedio) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.aacDoctoRef = aacDoctoRef;
        this.aacEstConcluidos = aacEstConcluidos;
        this.fecModifico = fecModifico;
        this.idInstEducat = idInstEducat;
        this.idNivelEscolar = idNivelEscolar;
        this.idProfCarrera = idProfCarrera;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.aacCedProfesional = aacCedProfesional;
        this.aacPromedio = aacPromedio;
    }

    /**
     * Get aacSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getAacSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getAacSecuencia();
    }

    /**
     * Get idDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdDocto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdDocto();
    }

    /**
     * Get rfcEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRfcEmpleado() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRfcEmpleado();
    }

    /**
     * Get idExpRechazo value.
     *
     * @return int
     */
    public int getIdExpRechazo() {
        return this.idExpRechazo;
    }

    /**
     * Get aacDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAacDoctoRef() {
        return this.aacDoctoRef;
    }

    /**
     * Get aacEstConcluidos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getAacEstConcluidos() {
        return this.aacEstConcluidos;
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
     * Get idInstEducat value.
     *
     * @return int
     */
    public int getIdInstEducat() {
        return this.idInstEducat;
    }

    /**
     * Get idNivelEscolar value.
     *
     * @return int
     */
    public int getIdNivelEscolar() {
        return this.idNivelEscolar;
    }

    /**
     * Get idProfCarrera value.
     *
     * @return float
     */
    public float getIdProfCarrera() {
        return this.idProfCarrera;
    }

    /**
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
        return this.idStatus;
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
     * Get aacCedProfesional value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getAacCedProfesional() {
        return this.aacCedProfesional;
    }

    /**
     * Get aacPromedio value.
     *
     * @return java.lang.Float
     */
    public java.lang.Float getAacPromedio() {
        return this.aacPromedio;
    }


    /**
     * Set aacSecuencia value.
     *
     * @param aacSecuencia java.lang.Integer
     */
    public void setAacSecuencia(java.lang.Integer aacSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpAntecedentesAcademicoPK();
        }
        this.idComposite.setAacSecuencia(aacSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpAntecedentesAcademicoPK();
        }
        this.idComposite.setIdDocto(idDocto);
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(java.lang.String rfcEmpleado) {
        if (idComposite == null) {
            idComposite = new TdExpAntecedentesAcademicoPK();
        }
        this.idComposite.setRfcEmpleado(rfcEmpleado);
    }

    /**
     * Set idExpRechazo value.
     *
     * @param idExpRechazo int
     */
    public void setIdExpRechazo(int idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    /**
     * Set aacDoctoRef value.
     *
     * @param aacDoctoRef java.lang.String
     */
    public void setAacDoctoRef(java.lang.String aacDoctoRef) {
        this.aacDoctoRef = aacDoctoRef;
    }

    /**
     * Set aacEstConcluidos value.
     *
     * @param aacEstConcluidos java.lang.String
     */
    public void setAacEstConcluidos(java.lang.String aacEstConcluidos) {
        this.aacEstConcluidos = aacEstConcluidos;
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
     * Set idInstEducat value.
     *
     * @param idInstEducat int
     */
    public void setIdInstEducat(int idInstEducat) {
        this.idInstEducat = idInstEducat;
    }

    /**
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar int
     */
    public void setIdNivelEscolar(int idNivelEscolar) {
        this.idNivelEscolar = idNivelEscolar;
    }

    /**
     * Set idProfCarrera value.
     *
     * @param idProfCarrera float
     */
    public void setIdProfCarrera(float idProfCarrera) {
        this.idProfCarrera = idProfCarrera;
    }

    /**
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
        this.idStatus = idStatus;
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
     * Set aacCedProfesional value.
     *
     * @param aacCedProfesional java.lang.Integer
     */
    public void setAacCedProfesional(java.lang.Integer aacCedProfesional) {
        this.aacCedProfesional = aacCedProfesional;
    }

    /**
     * Set aacPromedio value.
     *
     * @param aacPromedio java.lang.Float
     */
    public void setAacPromedio(java.lang.Float aacPromedio) {
        this.aacPromedio = aacPromedio;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpAntecedentesAcademicoPK)idComposite;
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
