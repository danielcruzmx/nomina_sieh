package gob.shcp.sireh.model.spc.seguimiento;

import gob.shcp.fsn.model.Model;

import java.util.Date;

public class TcCapSituacionParticipanteDTO implements Model, java.io.Serializable {
    private Integer idSituacionParticipante;
    private String  descSituacionParticipante;
    private String  usuario;
    private Date    fecModifico;
    
    public TcCapSituacionParticipanteDTO() {
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
}
