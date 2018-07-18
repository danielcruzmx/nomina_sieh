package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class CustomTdDepEco extends TdDepEco implements Domain, Serializable {

    private Integer deEdad;
    private String deParentesco;
    private String deNombreCompleto;
    private String deGenero;
    private String deNivelEscolar;
    
    // Expediente
    private String rfcEmpleado;
    private Long fdbSecuencia;
    private String idDocto;
    private String nombreDependiente;
    private String fdbPrimerApellido;
    private String fdbSegundoApellido;
    private Date fdbFechaNacimiento;
    private String descGenero;
    private Long idParentezco;
    private String descParentesco;
    private Long idNivelEscolar;
    private String descNivelEscolar;
    private Long fdbPromedio;
    private String fdbDoctoRef;
    private String descRechazo;
    private String idStatus;
    private String descStatus;
    private Date fecModifico;

    public void setDeEdad(Integer deEdad) {
        this.deEdad = deEdad;
    }

    public Integer getDeEdad() {
        return deEdad;
    }

    public void setDeParentesco(String deParentesco) {
        this.deParentesco = deParentesco;
    }

    public String getDeParentesco() {
        return deParentesco;
    }

    public void setDeNombreCompleto(String deNombreCompleto) {
        this.deNombreCompleto = deNombreCompleto;
    }

    public String getDeNombreCompleto() {
        return deNombreCompleto;
    }

    public void setDeGenero(String deGenero) {
        this.deGenero = deGenero;
    }

    public String getDeGenero() {
        return deGenero;
    }

    public void setDeNivelEscolar(String deNivelEscolar) {
        this.deNivelEscolar = deNivelEscolar;
    }

    public String getDeNivelEscolar() {
        return deNivelEscolar;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setFdbSecuencia(Long fdbSecuencia) {
        this.fdbSecuencia = fdbSecuencia;
    }

    public Long getFdbSecuencia() {
        return fdbSecuencia;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
    }

    public void setNombreDependiente(String nombreDependiente) {
        this.nombreDependiente = nombreDependiente;
    }

    public String getNombreDependiente() {
        return nombreDependiente;
    }

    public void setFdbFechaNacimiento(Date fdbFechaNacimiento) {
        this.fdbFechaNacimiento = fdbFechaNacimiento;
    }

    public Date getFdbFechaNacimiento() {
        return fdbFechaNacimiento;
    }
    
    public void setDescGenero(String descGenero) {
        this.descGenero = descGenero;
    }

    public String getDescGenero() {
        return descGenero;
    }

    public void setIdNivelEscolar(Long idNivelEscolar) {
        this.idNivelEscolar = idNivelEscolar;
    }

    public Long getIdNivelEscolar() {
        return idNivelEscolar;
    }

    public void setDescNivelEscolar(String descNivelEscolar) {
        this.descNivelEscolar = descNivelEscolar;
    }

    public String getDescNivelEscolar() {
        return descNivelEscolar;
    }

    public void setFdbPromedio(Long fdbPromedio) {
        this.fdbPromedio = fdbPromedio;
    }

    public Long getFdbPromedio() {
        return fdbPromedio;
    }

    public void setFdbDoctoRef(String fdbDoctoRef) {
        this.fdbDoctoRef = fdbDoctoRef;
    }

    public String getFdbDoctoRef() {
        return fdbDoctoRef;
    }

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setDescStatus(String descStatus) {
        this.descStatus = descStatus;
    }

    public String getDescStatus() {
        return descStatus;
    }

    public Date get_fecModifico() {
        return fecModifico;
    }

    public void setIdParentezco(Long idParentezco) {
        this.idParentezco = idParentezco;
    }

    public Long getIdParentezco() {
        return idParentezco;
    }

    public void setFdbPrimerApellido(String fdbPrimerApellido) {
        this.fdbPrimerApellido = fdbPrimerApellido;
    }

    public String getFdbPrimerApellido() {
        return fdbPrimerApellido;
    }

    public void setFdbSegundoApellido(String fdbSegundoApellido) {
        this.fdbSegundoApellido = fdbSegundoApellido;
    }

    public String getFdbSegundoApellido() {
        return fdbSegundoApellido;
    }

    public void setDescParentesco(String descParentesco) {
        this.descParentesco = descParentesco;
    }

    public String getDescParentesco() {
        return descParentesco;
    }
}
