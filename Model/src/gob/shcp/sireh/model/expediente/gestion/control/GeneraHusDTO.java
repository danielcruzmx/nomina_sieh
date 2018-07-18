package gob.shcp.sireh.model.expediente.gestion.control;

import gob.shcp.fsn.model.Model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GeneraHusDTO implements java.io.Serializable, Model {

    // Datos de la CXLC
    private String rfc;
    private String complemento;
    private Integer qnaaplica;
    private String titulo;
    private Integer hojad;
    private Integer hojah;
    private String rfcEmpleado;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    private boolean muestraRegistros; 
    private boolean cancel;
    
    //Validaciones
    private java.lang.Boolean rfcRequired;
    private java.lang.Boolean complementoRequired;
    private java.lang.Boolean hojadRequired;
    private java.lang.Boolean hojahRequired;

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setQnaaplica(Integer qnaaplica) {
        this.qnaaplica = qnaaplica;
    }

    public Integer getQnaaplica() {
        return qnaaplica;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
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

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setRfcRequired(Boolean rfcRequired) {
        this.rfcRequired = rfcRequired;
    }

    public Boolean getRfcRequired() {
        return rfcRequired;
    }
    
    @ValidationMethod(forProperty = "rfcEmpleado", errorCode = "not.null")
    public boolean validateRfc() {
        if (this.getRfcRequired() != null && this.getRfcRequired() && 
            !this.isCancel()) {
            if (this.getRfcEmpleado() != null && 
                !this.getRfcEmpleado().equals("")) {
                Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}[A-Z0-9]*{3}");
                Matcher mat = pat.matcher(this.getRfcEmpleado());
                if (mat.matches()) {
                    //muestraReporte = true;
                    return true;
                } else {
                    //muestraReporte = false;
                    rfcEmpleado = null;
                    return false;
                }
            } else {
                //muestraReporte = false;
                return false;
            }
        }
        return true;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setHojad(Integer hojad) {
        this.hojad = hojad;
    }

    public Integer getHojad() {
        return hojad;
    }

    public void setHojah(Integer hojah) {
        this.hojah = hojah;
    }

    public Integer getHojah() {
        return hojah;
    }

    public void setComplementoRequired(Boolean complementoRequired) {
        this.complementoRequired = complementoRequired;
    }

    public Boolean getComplementoRequired() {
        return complementoRequired;
    }

    public void setHojadRequired(Boolean hojadRequired) {
        this.hojadRequired = hojadRequired;
    }

    public Boolean getHojadRequired() {
        return hojadRequired;
    }

    public void setHojahRequired(Boolean hojahRequired) {
        this.hojahRequired = hojahRequired;
    }

    public Boolean getHojahRequired() {
        return hojahRequired;
    }

    @ValidationMethod(forProperty = "complemento", errorCode = "error.select.unspecified")
    public boolean validateComplemento() {
        if (this.getComplementoRequired() != null && this.getComplementoRequired() && !this.isCancel()) {
            if (this.getComplemento() != null && !this.getComplemento().equals("") && !this.getComplemento().equals("0")) {
                muestraRegistros = true;
                return true;
            } else {
                muestraRegistros = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "hojad", errorCode = "error.select.unspecified")
    public boolean validateHojad() {
        if (this.getHojadRequired() != null && this.getHojadRequired() && !this.isCancel()) {
            if (this.getHojad() != null && !this.getHojad().equals("") && !this.getHojad().equals(0)) {
                muestraRegistros = true;
                return true;
            } else {
                muestraRegistros = false;
                return false;
            }
        }
        return true;
    }

    @ValidationMethod(forProperty = "hojah", errorCode = "error.select.unspecified")
    public boolean validateHojah() {
        if (this.getHojahRequired() != null && this.getHojahRequired() && !this.isCancel()) {
            if (this.getHojah() != null && !this.getHojah().equals("") && !this.getHojah().equals(0)) {
                muestraRegistros = true;
                return true;
            } else {
                muestraRegistros = false;
                return false;
            }
        }
        return true;
    }

}
