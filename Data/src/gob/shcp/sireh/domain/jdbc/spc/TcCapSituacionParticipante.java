package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class TcCapSituacionParticipante implements Domain, Serializable {
    private Integer idSituacionParticipante;
    private String descSituacionParticipante;
    private String usuario;
    private Date fecModifico;

    public TcCapSituacionParticipante() {
    }

    public void setIdSituacionParticipante(Integer idSituacionParticipante) {
        this.idSituacionParticipante = idSituacionParticipante;
    }

    public Integer getIdSituacionParticipante() {
        return idSituacionParticipante;
    }

    public void setDescSituacionParticipante(String descSituacionParticipante) {
        this.descSituacionParticipante = descSituacionParticipante;
    }

    public String getDescSituacionParticipante() {
        return descSituacionParticipante;
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
