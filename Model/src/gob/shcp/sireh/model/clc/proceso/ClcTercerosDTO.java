package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ClcTercerosDTO implements java.io.Serializable, Model {

    // Verifica tipo nomina
    private String tipoClc;
    private boolean verificaTipoClc;
    private String beanNameTipoNomina;

    // Filtros
    private Integer ciclo;
    private String mes;
    private String quincena;
    private List<Integer> quincenasList;
    private String tipoNominaTerceros;
    private ArrayList<EtiquetaClaveValorEntero> mesesValores;

    // Parametros de control
    private String beanName;
    private boolean busquedaClc;
    private boolean cancel;
    private boolean muestraRegistros;

    // PagedList
    private List<String> guiasContablesList;
    private String cxlcCadena;
    private String[] cxlcGrupo;
    private HashMap relacionCxlcTerceros;

    // Procesar
    private ArrayList<EtiquetaClaveValorEntero> cicloValoresQnaPago;
    private String cicloCombo;
    private Integer qnaPago;
    private Integer complemento;
    private String reproceso;
    private String checkBoxReprocesa;

    // Errores    
    private boolean muestraErrores;

    public String getTipoClc() {
        return tipoClc;
    }

    public void setTipoClc(String tipoClc) {
        this.tipoClc = tipoClc;
    }

    public boolean isVerificaTipoClc() {
        return verificaTipoClc;
    }

    public void setVerificaTipoClc(boolean verificaTipoClc) {
        this.verificaTipoClc = verificaTipoClc;
    }

    public String getBeanNameTipoNomina() {
        return beanNameTipoNomina;
    }

    public void setBeanNameTipoNomina(String beanNameTipoNomina) {
        this.beanNameTipoNomina = beanNameTipoNomina;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public List<Integer> getQuincenasList() {
        return quincenasList;
    }

    public void setQuincenasList(List<Integer> quincenasList) {
        this.quincenasList = quincenasList;
    }

    public String getTipoNominaTerceros() {
        return tipoNominaTerceros;
    }

    public void setTipoNominaTerceros(String tipoNominaTerceros) {
        this.tipoNominaTerceros = tipoNominaTerceros;
    }

    public ArrayList<EtiquetaClaveValorEntero> getMesesValores() {
        return mesesValores;
    }

    public void setMesesValores(ArrayList<EtiquetaClaveValorEntero> mesesValores) {
        this.mesesValores = mesesValores;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public boolean isBusquedaClc() {
        return busquedaClc;
    }

    public void setBusquedaClc(boolean busquedaClc) {
        this.busquedaClc = busquedaClc;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public List<String> getGuiasContablesList() {
        return guiasContablesList;
    }

    public void setGuiasContablesList(List<String> guiasContablesList) {
        this.guiasContablesList = guiasContablesList;
    }

    public String getCxlcCadena() {
        return cxlcCadena;
    }

    public void setCxlcCadena(String cxlcCadena) {
        this.cxlcCadena = cxlcCadena;
    }

    public String[] getCxlcGrupo() {
        return cxlcGrupo;
    }

    public void setCxlcGrupo(String[] cxlcGrupo) {
        this.cxlcGrupo = cxlcGrupo;
    }

    public ArrayList<EtiquetaClaveValorEntero> getCicloValoresQnaPago() {
        return cicloValoresQnaPago;
    }

    public void setCicloValoresQnaPago(ArrayList<EtiquetaClaveValorEntero> cicloValoresQnaPago) {
        this.cicloValoresQnaPago = cicloValoresQnaPago;
    }

    public String getCicloCombo() {
        return cicloCombo;
    }

    public void setCicloCombo(String cicloCombo) {
        this.cicloCombo = cicloCombo;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public String getReproceso() {
        return reproceso;
    }

    public void setReproceso(String reproceso) {
        this.reproceso = reproceso;
    }

    public String getCheckBoxReprocesa() {
        return checkBoxReprocesa;
    }

    public void setCheckBoxReprocesa(String checkBoxReprocesa) {
        this.checkBoxReprocesa = checkBoxReprocesa;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }

    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }

    /* V A L I D A C I O N E S */

    @ValidationMethod(forProperty = "ciclo", errorCode = "error.generar.unselected")
    private boolean validateCiclo() {
        if (this.isBusquedaClc()) {
            return (this.getCiclo() != null && this.getCiclo() > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty = "quincena", errorCode = "error.generar.unselected")
    private boolean validateQuincena() {
        if (this.isBusquedaClc() && this.getTipoClc().equals("QUINCENAL")) {
            return (this.getQuincena() != null && !this.getQuincena().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "mes", errorCode = "error.generar.unselected")
    private boolean validateMes() {
        if (this.isBusquedaClc() && this.getTipoClc().equals("MENSUAL")) {
            return (this.getMes() != null && !this.getMes().equals(""));
        }
        return true;
    }

    @ValidationMethod(forProperty = "tipoNominaTerceros", errorCode = "error.generar.unselected")
    private boolean validateTipoNominaTerceros() {
        if (this.isBusquedaClc()) {
            return (this.getTipoNominaTerceros() != null && !this.getTipoNominaTerceros().equals(""));
        }
        return true;
    }
    
    public void setRelacionCxlcTerceros(HashMap relacionCxlcTerceros) {
        this.relacionCxlcTerceros = relacionCxlcTerceros;
    }

    public HashMap getRelacionCxlcTerceros() {
        return relacionCxlcTerceros;
    }
}
