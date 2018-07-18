package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.util.List;

public class RepComprobanteFiscalDTO implements java.io.Serializable, Model {
    private String  unidad;
    private String  qnaPago;
    private String  complemento;
    private String  tipoNomina;
    
    private String  unidadList;
    private String  qnaPagoList;
    private String  complementoList;
    private String  tipoNominaList;
    
    private Integer qnaCaptura;
    
    private boolean buscar;
    private boolean limpiar;
    private boolean muestraReporte;

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setUnidadList(String unidadList) {
        this.unidadList = unidadList;
    }

    public String getUnidadList() {
        return unidadList;
    }

    public void setQnaPagoList(String qnaPagoList) {
        this.qnaPagoList = qnaPagoList;
    }

    public String getQnaPagoList() {
        return qnaPagoList;
    }

    public void setComplementoList(String complementoList) {
        this.complementoList = complementoList;
    }

    public String getComplementoList() {
        return complementoList;
    }

    public void setTipoNominaList(String tipoNominaList) {
        this.tipoNominaList = tipoNominaList;
    }

    public String getTipoNominaList() {
        return tipoNominaList;
    }

    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }
}
