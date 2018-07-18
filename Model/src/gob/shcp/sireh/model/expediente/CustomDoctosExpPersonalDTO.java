package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;

public class CustomDoctosExpPersonalDTO implements java.io.Serializable, Model {
    
    private Integer ordenDocto;
    private String  idDocto;
    private String  descDocto;
    private Integer secuencia;
    private String  doctoRef;
    private String  idStatus;
    private String  descStatus;
    private Integer idExpRechazo;
    private String  descRechazo;
    private String  requerido;

    public void setOrdenDocto(Integer ordenDocto) {
        this.ordenDocto = ordenDocto;
    }

    public Integer getOrdenDocto() {
        return ordenDocto;
    }

    public void setIdDocto(String idDocto) {
        this.idDocto = idDocto;
    }

    public String getIdDocto() {
        return idDocto;
    }

    public void setDescDocto(String descDocto) {
        this.descDocto = descDocto;
    }

    public String getDescDocto() {
        return descDocto;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setDoctoRef(String doctoRef) {
        this.doctoRef = doctoRef;
    }

    public String getDoctoRef() {
        return doctoRef;
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

    public void setIdExpRechazo(Integer idExpRechazo) {
        this.idExpRechazo = idExpRechazo;
    }

    public Integer getIdExpRechazo() {
        return idExpRechazo;
    }

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void setRequerido(String requerido) {
        this.requerido = requerido;
    }

    public String getRequerido() {
        return requerido;
    }
}
