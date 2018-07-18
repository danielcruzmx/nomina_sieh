package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClcPatronalesAjustesDTO implements java.io.Serializable, Model {
    
    // Filtros
    private String nominaOrigen;
     
    private Integer ciclo;
    private Integer quincena;
    private List<Integer> quincenasList;
    private String tipoNominaPatronales;

    // Parametros de control
    private String beanName;
    private boolean busquedaClc;
    private boolean cancel;
    private boolean muestraRegistros;

    // PagedList
    private List<String> guiasContablesList;
    private String cxlcCadena;
    private String[] cxlcGrupo;
    private String[] cxlcGrupoArrayValores;
    private HashMap relacionCxlcTerceros;
    
    private String[] ajusteGrupo;
    private String[] compensadaGrupo;
    private String[] ajusteGrupoArrayValores;
    private String[] compensadaGrupoArrayValores;

    // Procesar
    private ArrayList<EtiquetaClaveValorEntero> cicloValoresQnaPago;
    private String cicloCombo;
    private Integer qnaPago;
    private Integer complemento;
    private String signo;
    private double ImporteAjuste;
    private Integer clcAjuste;
    private Integer clcCompensada;
    
    // Errores    
    private boolean muestraErrores;
    
    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setQuincena(Integer quincena) {
        this.quincena = quincena;
    }

    public Integer getQuincena() {
        return quincena;
    }

    public void setQuincenasList(List<Integer> quincenasList) {
        this.quincenasList = quincenasList;
    }

    public List<Integer> getQuincenasList() {
        return quincenasList;
    }

    public void setTipoNominaPatronales(String tipoNominaPatronales) {
        this.tipoNominaPatronales = tipoNominaPatronales;
    }

    public String getTipoNominaPatronales() {
        return tipoNominaPatronales;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBusquedaClc(boolean busquedaClc) {
        this.busquedaClc = busquedaClc;
    }

    public boolean isBusquedaClc() {
        return busquedaClc;
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

    public void setGuiasContablesList(List<String> guiasContablesList) {
        this.guiasContablesList = guiasContablesList;
    }

    public List<String> getGuiasContablesList() {
        return guiasContablesList;
    }

    public void setCxlcCadena(String cxlcCadena) {
        this.cxlcCadena = cxlcCadena;
    }

    public String getCxlcCadena() {
        return cxlcCadena;
    }

    public void setCxlcGrupo(String[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }

    public String[] getCxlcGrupo() {
        return cxlcGrupo;
    }

    public void setRelacionCxlcTerceros(HashMap relacionCxlcTerceros) {
        this.relacionCxlcTerceros = relacionCxlcTerceros;
    }

    public HashMap getRelacionCxlcTerceros() {
        return relacionCxlcTerceros;
    }

    public void setCicloValoresQnaPago(ArrayList<EtiquetaClaveValorEntero> cicloValoresQnaPago) {
        this.cicloValoresQnaPago = cicloValoresQnaPago;
    }

    public ArrayList<EtiquetaClaveValorEntero> getCicloValoresQnaPago() {
        return cicloValoresQnaPago;
    }

    public void setCicloCombo(String cicloCombo) {
        this.cicloCombo = cicloCombo;
    }

    public String getCicloCombo() {
        return cicloCombo;
    }

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }
    
    public void setClcAjuste(Integer clcAjuste) {
        this.clcAjuste = clcAjuste;
    }

    public Integer getClcAjuste() {
        return clcAjuste;
    }

    public void setClcCompensada(Integer clcCompensada) {
        this.clcCompensada = clcCompensada;
    }

    public Integer getClcCompensada() {
        return clcCompensada;
    }

    public void setCxlcGrupoArrayValores(String[] cxlcGrupoArrayValores) {
        this.cxlcGrupoArrayValores = cxlcGrupoArrayValores;
    }

    public String[] getCxlcGrupoArrayValores() {
        return cxlcGrupoArrayValores;
    }
    
    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setImporteAjuste(double importeAjuste) {
        this.ImporteAjuste = importeAjuste;
    }

    public double getImporteAjuste() {
        return ImporteAjuste;
    }
    
    public void setAjusteGrupo(String[] ajusteGrupo) {
        this.ajusteGrupo = ajusteGrupo;
    }

    public String[] getAjusteGrupo() {
        return ajusteGrupo;
    }

    public void setCompensadaGrupo(String[] compensadaGrupo) {
        this.compensadaGrupo = compensadaGrupo;
    }

    public String[] getCompensadaGrupo() {
        return compensadaGrupo;
    }

    public void setAjusteGrupoArrayValores(String[] ajusteGrupoArrayValores) {
        this.ajusteGrupoArrayValores = ajusteGrupoArrayValores;
    }

    public String[] getAjusteGrupoArrayValores() {
        return ajusteGrupoArrayValores;
    }

    public void setCompensadaGrupoArrayValores(String[] compensadaGrupoArrayValores) {
        this.compensadaGrupoArrayValores = compensadaGrupoArrayValores;
    }

    public String[] getCompensadaGrupoArrayValores() {
        return compensadaGrupoArrayValores;
    }
    
    public String getNominaOrigen() {
        return nominaOrigen;
    }

    public void setNominaOrigen(String nominaOrigen) {
        this.nominaOrigen = nominaOrigen;
    }
}
