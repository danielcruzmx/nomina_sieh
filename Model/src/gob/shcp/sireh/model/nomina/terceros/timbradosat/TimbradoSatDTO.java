package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

public class TimbradoSatDTO implements java.io.Serializable, Model {
    public TimbradoSatDTO() {
    }
    
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private Integer nomQnaCaptura;

    // Configuracion inicial
    private String beanName;
    private boolean cancel;
    private boolean generar;
    private boolean muestraRegistros;
    private boolean update;
    
    private boolean accionCancelar;
    private boolean accionProcesar;



    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setNomQnaCaptura(Integer nomQnaCaptura) {
        this.nomQnaCaptura = nomQnaCaptura;
    }

    public Integer getNomQnaCaptura() {
        return nomQnaCaptura;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setGenerar(boolean generar) {
        this.generar = generar;
    }

    public boolean isGenerar() {
        return generar;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setAccionCancelar(boolean accionCancelar) {
        this.accionCancelar = accionCancelar;
    }

    public boolean isAccionCancelar() {
        return accionCancelar;
    }

    public void setAccionProcesar(boolean accionProcesar) {
        this.accionProcesar = accionProcesar;
    }

    public boolean isAccionProcesar() {
        return accionProcesar;
    }
}
