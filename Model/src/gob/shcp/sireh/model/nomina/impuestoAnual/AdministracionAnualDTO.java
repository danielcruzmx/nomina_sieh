package gob.shcp.sireh.model.nomina.impuestoAnual;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class AdministracionAnualDTO  implements Serializable, Model {
    private Integer[] idGrupo;
    
    private String ciclo;
    private Integer quincena;
    private String tipoNomina;
    private String grupoPago;
    private String idEdoNom;
    
    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Acumulado Concentrado de P & G
    private String hpConsecNomina;
    
    private String origen;
    private String origenDep;
    private String unidad;
    private String rfcEmpleado;
    
    private String filtro;

    public void setIdGrupo(Integer[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer[] getIdGrupo() {
        return idGrupo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setQuincena(Integer quincena) {
        this.quincena = quincena;
    }

    public Integer getQuincena() {
        return quincena;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
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

    public void setHpConsecNomina(String hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public String getHpConsecNomina() {
        return hpConsecNomina;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setOrigenDep(String origenDep) {
        this.origenDep = origenDep;
    }

    public String getOrigenDep() {
        return origenDep;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getFiltro() {
        return filtro;
    }
}
