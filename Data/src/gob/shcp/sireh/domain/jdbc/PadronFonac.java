package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class PadronFonac implements Domain, Serializable{
    private String periodo;
    private String importe;
    private String referencia;
    private Integer numRegistros;
    private Integer anio;
    private Integer qna;
    private String qnaCaptura;
    private String qnaInicioCiclo;
    private String usuario;
    
    private boolean cancel;
    private boolean aceptar;
    private boolean procesar;
    
    private String cicloEmision;
    private String cicloRemesa;
    private String remesa;

    private String mensaje;
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getImporte() {
        return importe;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setNumRegistros(Integer numRegistros) {
        this.numRegistros = numRegistros;
    }

    public Integer getNumRegistros() {
        return numRegistros;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setQna(Integer qna) {
        this.qna = qna;
    }

    public Integer getQna() {
        return qna;
    }

    public void setQnaCaptura(String qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public String getQnaCaptura() {
        return qnaCaptura;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setQnaInicioCiclo(String qnaInicioCiclo) {
        this.qnaInicioCiclo = qnaInicioCiclo;
    }

    public String getQnaInicioCiclo() {
        return qnaInicioCiclo;
    }

    public void setCicloEmision(String cicloEmision) {
        this.cicloEmision = cicloEmision;
    }

    public String getCicloEmision() {
        return cicloEmision;
    }

    public void setCicloRemesa(String cicloRemesa) {
        this.cicloRemesa = cicloRemesa;
    }

    public String getCicloRemesa() {
        return cicloRemesa;
    }

    public void setRemesa(String remesa) {
        this.remesa = remesa;
    }

    public String getRemesa() {
        return remesa;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }
}
