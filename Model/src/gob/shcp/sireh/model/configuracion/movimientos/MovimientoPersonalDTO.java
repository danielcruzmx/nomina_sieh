package gob.shcp.sireh.model.configuracion.movimientos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.service.factory.holder.ApplicationResourcesHolder;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;



public class MovimientoPersonalDTO implements Serializable, Model  {
    private ApplicationResourcesHolder holder;
    private Integer idMovsPersonal;
    private String descMovsPersonal;
    
    private String constancia;
    
    private String mpTipoMovMenu;
    
    private String idSitPlaAnt;
    
    private String idSitPlaNva;
    
    private String mpGrupoPago;
    private String mpJerarquia;
    private String mpNombramiento;
    private String urlOrigen;
    private String urlDestino;
    private String urlNuevo;
    private ArrayList<EtiquetaClaveValor> constanciaValores;
    private ArrayList<EtiquetaClaveValor> tipoMovimientoMenuValores;
    private List<String> idsGrupoPago;
    private List<String> idsJerarquia;
    private List<String> idsNombramiento;
    
    public void inicializaListas() {
        setConstanciaValores(new ArrayList());
        getConstanciaValores().add(new EtiquetaClaveValor("S","Si"));
        getConstanciaValores().add(new EtiquetaClaveValor("N","No"));
        setTipoMovimientoMenuValores(new ArrayList());
        getTipoMovimientoMenuValores().add(new EtiquetaClaveValor("ALTAS","Altas"));
        getTipoMovimientoMenuValores().add(new EtiquetaClaveValor("PROMOCIONES","Promociones"));
        getTipoMovimientoMenuValores().add(new EtiquetaClaveValor("BAJAS","Bajas"));
        getTipoMovimientoMenuValores().add(new EtiquetaClaveValor("LICENCIAS","Licencias"));
        getTipoMovimientoMenuValores().add(new EtiquetaClaveValor("PRORROGAS","Prorrogas"));
    }

    public Integer getIdMovsPersonal() {
        return idMovsPersonal;
    }

    public void setIdMovsPersonal(Integer idMovsPersonal) {
        this.idMovsPersonal = idMovsPersonal;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
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

    public String getConstancia() {
        return constancia;
    }

    public void setConstancia(String constancia) {
        this.constancia = constancia;
    }

    public String getMpTipoMovMenu() {
        return mpTipoMovMenu;
    }

    public void setMpTipoMovMenu(String mpTipoMovMenu) {
        this.mpTipoMovMenu = mpTipoMovMenu;
    }

    public ArrayList<MovimientoPersonalDTO.EtiquetaClaveValor> getConstanciaValores() {
        return constanciaValores;
    }

    public void setConstanciaValores(ArrayList<MovimientoPersonalDTO.EtiquetaClaveValor> constanciaValores) {
        this.constanciaValores = constanciaValores;
    }

    public ArrayList<MovimientoPersonalDTO.EtiquetaClaveValor> getTipoMovimientoMenuValores() {
        return tipoMovimientoMenuValores;
    }

    public void setTipoMovimientoMenuValores(ArrayList<MovimientoPersonalDTO.EtiquetaClaveValor> tipoMovimientoMenuValores) {
        this.tipoMovimientoMenuValores = tipoMovimientoMenuValores;
    }

    public ApplicationResourcesHolder getHolder() {
        return holder;
    }

    public void setHolder(ApplicationResourcesHolder holder) {
        this.holder = holder;
    }

    public String getUrlNuevo() {
        return urlNuevo;
    }

    public void setUrlNuevo(String urlNuevo) {
        this.urlNuevo = urlNuevo;
    }

    public String getIdSitPlaAnt() {
        return idSitPlaAnt;
    }

    public void setIdSitPlaAnt(String idSitPlaAnt) {
        this.idSitPlaAnt = idSitPlaAnt;
    }

    public String getIdSitPlaNva() {
        return idSitPlaNva;
    }

    public void setIdSitPlaNva(String idSitPlaNva) {
        this.idSitPlaNva = idSitPlaNva;
    }

    public String getMpGrupoPago() {
        return mpGrupoPago;
    }

    public void setMpGrupoPago(String mpGrupoPago) {
        this.mpGrupoPago = mpGrupoPago;
    }

    public String getMpJerarquia() {
        return mpJerarquia;
    }

    public void setMpJerarquia(String mpJerarquia) {
        this.mpJerarquia = mpJerarquia;
    }

    public String getMpNombramiento() {
        return mpNombramiento;
    }

    public void setMpNombramiento(String mpNombramiento) {
        this.mpNombramiento = mpNombramiento;
    }

    public List<String> getIdsGrupoPago() {
        return idsGrupoPago;
    }

    public void setIdsGrupoPago(List<String> idsGrupoPago) {
        this.idsGrupoPago = idsGrupoPago;
    }

    public List<String> getIdsJerarquia() {
        return idsJerarquia;
    }

    public void setIdsJerarquia(List<String> idsJerarquia) {
        this.idsJerarquia = idsJerarquia;
    }

    public List<String> getIdsNombramiento() {
        return idsNombramiento;
    }

    public void setIdsNombramiento(List<String> idsNombramiento) {
        this.idsNombramiento = idsNombramiento;
    }


    public class EtiquetaClaveValor {
        private String clave;
        private String valor;
        public EtiquetaClaveValor(String clave, String valor) {
            this.setClave(clave);
            this.setValor(valor);
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }
}
