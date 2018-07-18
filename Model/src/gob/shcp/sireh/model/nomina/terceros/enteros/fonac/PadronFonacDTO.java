package gob.shcp.sireh.model.nomina.terceros.enteros.fonac;

import gob.shcp.fsn.model.Model;

public class PadronFonacDTO implements java.io.Serializable, Model {
    
    private String periodo;
    private String importe;
    private String referencia;
    private Integer numRegistros;
    private Integer anio;
    private Integer qna;
    private String qnaInicio;
    private String qnaFinal;
    private String rfcUnico;
    private String registro;
    private String tipo;
    private String qnaCaptura;
    private String qnaInicioCiclo;
    private String usuario;
    
    private boolean captura;
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

    public void setCaptura(boolean captura) {
        this.captura = captura;
    }

    public boolean isCaptura() {
        return captura;
    }

    public void setQnaInicio(String qnaInicio) {
        this.qnaInicio = qnaInicio;
    }

    public String getQnaInicio() {
        return qnaInicio;
    }

    public void setQnaFinal(String qnaFinal) {
        this.qnaFinal = qnaFinal;
    }

    public String getQnaFinal() {
        return qnaFinal;
    }

    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    public String getRfcUnico() {
        return rfcUnico;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
