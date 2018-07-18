package gob.shcp.sireh.model.spc.seguimiento;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ConsultaBitacoraDTO implements java.io.Serializable, Model {

    private String tipoBitacora;
    
    // Filtros
    private Integer idCapMovto;
    private java.util.Date cursoFecIni;
    private java.util.Date cursoFecFin;
    private String usuario;
    private Date fecModifico;

    // Configuracion inicial
    private String beanName; // beanName del PagedList

    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    
    private Integer[] idMovtos;
    
    // Metodos de acceso
    public void setTipoBitacora(String tipoBitacora) {
        this.tipoBitacora = tipoBitacora;
    }

    public String getTipoBitacora() {
        return tipoBitacora;
    }

    public void setIdCapMovto(Integer idCapMovto) {
        this.idCapMovto = idCapMovto;
    }

    public Integer getIdCapMovto() {
        return idCapMovto;
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

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

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

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }
    
    public void setCursoFecIni(Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    public Date getCursoFecIni() {
        return cursoFecIni;
    }

    public void setCursoFecFin(Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    public Date getCursoFecFin() {
        return cursoFecFin;
    }
    
    public void setIdMovtos(Integer[] idMovtos) {
        this.idMovtos = idMovtos;
    }

    public Integer[] getIdMovtos() {
        return idMovtos;
    }
    
    // Validaciones
    @ValidationMethod(forProperty = "tipoBitacora", errorCode = "not.null")
    private boolean validateTipoBitacora() {
        if (this.isMuestraRegistros()) {
            return (this.getTipoBitacora() != null && !this.getTipoBitacora().equals(""));
        }
        return true;
    }
}
