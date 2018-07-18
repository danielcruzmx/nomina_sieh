package gob.shcp.sireh.model.nomina.gestion;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.List;

public class ConsultaNominaDTO  implements Serializable, Model {

    private Integer[] idGrupo;
    
    private Integer quincena;
    private String tipoNomina;
    private List<String> listIdTipoNomina;
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
    
    
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
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

    public Integer getQuincena() {
        return quincena;
    }

    public void setQuincena(Integer quincena) {
        this.quincena = quincena;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
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

    public void setIdGrupo(Integer[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer[] getIdGrupo() {
        return idGrupo;
    }

    public void setHpConsecNomina(String hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public String getHpConsecNomina() {
        return hpConsecNomina;
    }

    public void setListIdTipoNomina(List<String> listIdTipoNomina) {
        this.listIdTipoNomina = listIdTipoNomina;
    }

    public List<String> getListIdTipoNomina() {
        return listIdTipoNomina;
    }
}
