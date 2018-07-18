package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdExpDatosNacimiento data.
 */
public class TdExpDatosNacimiento implements Domain, Serializable {
    private TdExpDatosNacimientoPK idComposite;
    private int idExpRechazo;
    private java.lang.String dnaDoctoRef;
    private java.util.Date dnaFecNacimiento;
    private java.lang.String dnaNombreEmpleado;
    private java.util.Date fecModifico;
    private int idEdo;
    private String idNacionalidad;
    private java.lang.String idPais;
    private java.lang.String idStatus;
    private java.lang.String usuario;
    private java.lang.String dnaExtranjerosFm3;
    private java.lang.String dnaPrimerApellido;
    private java.lang.String dnaSegundoApellido;

    /**
     * Constructor for TdExpDatosNacimiento class.
     */
    public TdExpDatosNacimiento() {
    }

    /**
     * Constructor for TdExpDatosNacimiento class.
     *
     * @param dnaSecuencia java.lang.Integer
     * @param idDocto java.lang.String
     * @param rfcEmpleado java.lang.String
     * @param idExpRechazo int
     * @param dnaDoctoRef java.lang.String
     * @param dnaFecNacimiento java.util.Date
     * @param dnaNombreEmpleado java.lang.String
     * @param fecModifico java.util.Date
     * @param idEdo int
     * @param idNacionalidad String
     * @param idPais java.lang.String
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     * @param dnaExtranjerosFm3 java.lang.String
     * @param dnaPrimerApellido java.lang.String
     * @param dnaSegundoApellido java.lang.String
     */
    public TdExpDatosNacimiento(TdExpDatosNacimientoPK idComposite, 
                                int idExpRechazo, java.lang.String dnaDoctoRef, 
                                java.util.Date dnaFecNacimiento, 
                                java.lang.String dnaNombreEmpleado, 
                                java.util.Date fecModifico, int idEdo, 
                                String idNacionalidad, java.lang.String idPais, 
                                java.lang.String idStatus, 
                                java.lang.String usuario, 
                                java.lang.String dnaExtranjerosFm3, 
                                java.lang.String dnaPrimerApellido, 
                                java.lang.String dnaSegundoApellido) {
        this.idComposite = idComposite;
        this.idExpRechazo = idExpRechazo;
        this.dnaDoctoRef = dnaDoctoRef;
        this.dnaFecNacimiento = dnaFecNacimiento;
        this.dnaNombreEmpleado = dnaNombreEmpleado;
        this.fecModifico = fecModifico;
        this.idEdo = idEdo;
        this.idNacionalidad = idNacionalidad;
        this.idPais = idPais;
        this.idStatus = idStatus;
        this.usuario = usuario;
        this.dnaExtranjerosFm3 = dnaExtranjerosFm3;
        this.dnaPrimerApellido = dnaPrimerApellido;
        this.dnaSegundoApellido = dnaSegundoApellido;
    }

    /**
     * Get dnaSecuencia value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getDnaSecuencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getDnaSecuencia();
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
     * Get dnaDoctoRef value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaDoctoRef() {
        return this.dnaDoctoRef;
    }

    /**
     * Get dnaFecNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getDnaFecNacimiento() {
        return this.dnaFecNacimiento;
    }

    /**
     * Get dnaNombreEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaNombreEmpleado() {
        return this.dnaNombreEmpleado;
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
     * Get idEdo value.
     *
     * @return int
     */
    public int getIdEdo() {
        return this.idEdo;
    }

    /**
     * Get idNacionalidad value.
     *
     * @return String
     */
    public String getIdNacionalidad() {
        return this.idNacionalidad;
    }

    /**
     * Get idPais value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPais() {
        return this.idPais;
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
     * Get dnaExtranjerosFm3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaExtranjerosFm3() {
        return this.dnaExtranjerosFm3;
    }

    /**
     * Get dnaPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaPrimerApellido() {
        return this.dnaPrimerApellido;
    }

    /**
     * Get dnaSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDnaSegundoApellido() {
        return this.dnaSegundoApellido;
    }

    /**
     * Set dnaSecuencia value.
     *
     * @param dnaSecuencia java.lang.Integer
     */
    public void setDnaSecuencia(java.lang.Integer dnaSecuencia) {
        if (idComposite == null) {
            idComposite = new TdExpDatosNacimientoPK();
        }
        this.idComposite.setDnaSecuencia(dnaSecuencia);
    }

    /**
     * Set idDocto value.
     *
     * @param idDocto java.lang.String
     */
    public void setIdDocto(java.lang.String idDocto) {
        if (idComposite == null) {
            idComposite = new TdExpDatosNacimientoPK();
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
            idComposite = new TdExpDatosNacimientoPK();
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
     * Set dnaDoctoRef value.
     *
     * @param dnaDoctoRef java.lang.String
     */
    public void setDnaDoctoRef(java.lang.String dnaDoctoRef) {
        this.dnaDoctoRef = dnaDoctoRef;
    }

    /**
     * Set dnaFecNacimiento value.
     *
     * @param dnaFecNacimiento java.util.Date
     */
    public void setDnaFecNacimiento(java.util.Date dnaFecNacimiento) {
        this.dnaFecNacimiento = dnaFecNacimiento;
    }

    /**
     * Set dnaNombreEmpleado value.
     *
     * @param dnaNombreEmpleado java.lang.String
     */
    public void setDnaNombreEmpleado(java.lang.String dnaNombreEmpleado) {
        this.dnaNombreEmpleado = dnaNombreEmpleado;
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
     * Set idEdo value.
     *
     * @param idEdo int
     */
    public void setIdEdo(int idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Set idNacionalidad value.
     *
     * @param idNacionalidad String
     */
    public void setIdNacionalidad(String idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    /**
     * Set idPais value.
     *
     * @param idPais java.lang.String
     */
    public void setIdPais(java.lang.String idPais) {
        this.idPais = idPais;
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
     * Set dnaExtranjerosFm3 value.
     *
     * @param dnaExtranjerosFm3 java.lang.String
     */
    public void setDnaExtranjerosFm3(java.lang.String dnaExtranjerosFm3) {
        this.dnaExtranjerosFm3 = dnaExtranjerosFm3;
    }

    /**
     * Set dnaPrimerApellido value.
     *
     * @param dnaPrimerApellido java.lang.String
     */
    public void setDnaPrimerApellido(java.lang.String dnaPrimerApellido) {
        this.dnaPrimerApellido = dnaPrimerApellido;
    }

    /**
     * Set dnaSegundoApellido value.
     *
     * @param dnaSegundoApellido java.lang.String
     */
    public void setDnaSegundoApellido(java.lang.String dnaSegundoApellido) {
        this.dnaSegundoApellido = dnaSegundoApellido;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdExpDatosNacimientoPK)idComposite;
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
