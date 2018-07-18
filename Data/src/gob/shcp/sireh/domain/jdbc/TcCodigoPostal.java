package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class TcCodigoPostal implements Domain, Serializable {
    private String  idCodPost;
    private String  colonia;
    private Integer idEdo;
    private Integer idMun;
    private String idStatus;
    private String  usuario;
    private Date    fecModifico;
    
    public TcCodigoPostal() {
    }

    public void setIdCodPost(String idCodPost) {
        this.idCodPost = idCodPost;
    }

    public String getIdCodPost() {
        return idCodPost;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setIdEdo(Integer idEdo) {
        this.idEdo = idEdo;
    }

    public Integer getIdEdo() {
        return idEdo;
    }

    public void setIdMun(Integer idMun) {
        this.idMun = idMun;
    }

    public Integer getIdMun() {
        return idMun;
    }

    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    public String getIdStatus() {
        return idStatus;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
}
