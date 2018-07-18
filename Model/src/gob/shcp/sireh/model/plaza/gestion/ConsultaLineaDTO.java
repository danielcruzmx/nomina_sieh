package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;


public class ConsultaLineaDTO extends TdPlazaDTO implements java.io.Serializable, Model {

    private Integer idPlaza;
    private String descSitPlaza;
    private String plazaRfc;
    private java.lang.String nombreEmp;
    private String curpEmpleado;
    private Integer plazaCiclo;
    private Integer plazaRespaldo;
    private String descGrupoPago;
    private String uniDescPre;
    private String uniDescAbrPre;
    private String descPuestoPre;
    private String descEstadoPre;
    private Integer idZonaEcoPre;
    private Integer idRangoPre;
    private String idProyReducePre;
    private String idProyAmpliaPre;
    private String nivelPtoPre;
    private String nombramientoPre;
    private String descJerarquiaPre;
    private Double tabSueldoPre;
    private Double tabCompensacionPre;
    private String uniDescNom;
    private String uniDescAbrNom;
    private String descPuestoNom;
    private String descEstadoNom;
    private String descMunicipioNom;
    private Integer idZonaEcoNom;
    private Integer idRangoNom;
    private Integer idZonaDistNom;
    private Double importeHonorario;
    private String idNivelPtoNom;
    private String descNombramientoNom;
    private String descNombramientoPre;
    private String descJerarquiaNom;
    private Double tabSueldoNom;
    private Double tabCompensacionNom;
    private String descMovsPersonal;
    private Date plazaUltimoMovto;
    //private Date plazaIniCont;
    //private Date plazaFinCont;
    //private Date plazaIniLic;
    //private Date plazaFinLic;
    private String plazaReferencia;
    private Integer plazaQnaCaptura;
    private String usuario;
    private Date fecModifico;
    private String descTipoPlaza;
    private String descTipoServPub;
    private String idPtoEstrategico;
    private String idNodo;
    private String nombrePuesto;
    private String plazaEdif;
    private String plazaPiso;
    private String plazaAla;
    private String plazaOfna;
    private String plazaTelOf1;
    private String plazaTelOf2;
    private String plazaConmut;
    private String plazaExt1;
    private String plazaExt2;
    private String descVacancia;

    // Datos Inmueble
    private Integer idInmueble;
    private String inmuebleCalle;
    private String inmuebleNumExt;
    private String inmuebleNumInt;
    private String inmuebleColonia;
    private String descInmueble;
    private String inmueble2;

    // Etiquetas
    private String sueldoPreLabel;
    private String compensacionPreLabel;
    private String sueldoNomLabel;
    private String compensacionNomLabel;
    private String sueldoHonLabel;

    // Propiedades default
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private String urlRegreso;

    // Configuracion inicial
    private String seccion;
    private String beanName;
    private String beanNameSituacion;

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getUniDescPre() {
        return uniDescPre;
    }

    public void setUniDescPre(String uniDescPre) {
        this.uniDescPre = uniDescPre;
    }

    public String getUniDescAbrPre() {
        return uniDescAbrPre;
    }

    public void setUniDescAbrPre(String uniDescAbrPre) {
        this.uniDescAbrPre = uniDescAbrPre;
    }

    public String getDescPuestoPre() {
        return descPuestoPre;
    }

    public void setDescPuestoPre(String descPuestoPre) {
        this.descPuestoPre = descPuestoPre;
    }

    public String getDescEstadoPre() {
        return descEstadoPre;
    }

    public void setDescEstadoPre(String descEstadoPre) {
        this.descEstadoPre = descEstadoPre;
    }

    public String getNivelPtoPre() {
        return nivelPtoPre;
    }

    public void setNivelPtoPre(String nivelPtoPre) {
        this.nivelPtoPre = nivelPtoPre;
    }

    public String getNombramientoPre() {
        return nombramientoPre;
    }

    public void setNombramientoPre(String nombramientoPre) {
        this.nombramientoPre = nombramientoPre;
    }

    public String getDescJerarquiaPre() {
        return descJerarquiaPre;
    }

    public void setDescJerarquiaPre(String descJerarquiaPre) {
        this.descJerarquiaPre = descJerarquiaPre;
    }

    public Double getTabSueldoPre() {
        return tabSueldoPre;
    }

    public void setTabSueldoPre(Double tabSueldoPre) {
        this.tabSueldoPre = tabSueldoPre;
    }

    public Double getTabCompensacionPre() {
        return tabCompensacionPre;
    }

    public void setTabCompensacionPre(Double tabCompensacionPre) {
        this.tabCompensacionPre = tabCompensacionPre;
    }

    public String getUniDescNom() {
        return uniDescNom;
    }

    public void setUniDescNom(String uniDescNom) {
        this.uniDescNom = uniDescNom;
    }

    public String getUniDescAbrNom() {
        return uniDescAbrNom;
    }

    public void setUniDescAbrNom(String uniDescAbrNom) {
        this.uniDescAbrNom = uniDescAbrNom;
    }

    public String getDescPuestoNom() {
        return descPuestoNom;
    }

    public void setDescPuestoNom(String descPuestoNom) {
        this.descPuestoNom = descPuestoNom;
    }

    public String getDescEstadoNom() {
        return descEstadoNom;
    }

    public void setDescEstadoNom(String descEstadoNom) {
        this.descEstadoNom = descEstadoNom;
    }

    public String getDescMunicipioNom() {
        return descMunicipioNom;
    }

    public void setDescMunicipioNom(String descMunicipioNom) {
        this.descMunicipioNom = descMunicipioNom;
    }

    public String getIdNivelPtoNom() {
        return idNivelPtoNom;
    }

    public void setIdNivelPtoNom(String idNivelPtoNom) {
        this.idNivelPtoNom = idNivelPtoNom;
    }

    public String getDescNombramientoNom() {
        return descNombramientoNom;
    }

    public void setDescNombramientoNom(String descNombramientoNom) {
        this.descNombramientoNom = descNombramientoNom;
    }

    public String getDescNombramientoPre() {
        return descNombramientoPre;
    }

    public void setDescNombramientoPre(String descNombramientoPre) {
        this.descNombramientoPre = descNombramientoPre;
    }

    public String getDescJerarquiaNom() {
        return descJerarquiaNom;
    }

    public void setDescJerarquiaNom(String descJerarquiaNom) {
        this.descJerarquiaNom = descJerarquiaNom;
    }

    public Double getTabSueldoNom() {
        return tabSueldoNom;
    }

    public void setTabSueldoNom(Double tabSueldoNom) {
        this.tabSueldoNom = tabSueldoNom;
    }

    public Double getTabCompensacionNom() {
        return tabCompensacionNom;
    }

    public void setTabCompensacionNom(Double tabCompensacionNom) {
        this.tabCompensacionNom = tabCompensacionNom;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    public Date getPlazaUltimoMovto() {
        return plazaUltimoMovto;
    }

    public void setPlazaUltimoMovto(Date plazaUltimoMovto) {
        this.plazaUltimoMovto = plazaUltimoMovto;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public String getDescTipoPlaza() {
        return descTipoPlaza;
    }

    public void setDescTipoPlaza(String descTipoPlaza) {
        this.descTipoPlaza = descTipoPlaza;
    }

    public String getDescTipoServPub() {
        return descTipoServPub;
    }

    public void setDescTipoServPub(String descTipoServPub) {
        this.descTipoServPub = descTipoServPub;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getInmuebleCalle() {
        return inmuebleCalle;
    }

    public void setInmuebleCalle(String inmuebleCalle) {
        this.inmuebleCalle = inmuebleCalle;
    }

    public String getInmuebleNumExt() {
        return inmuebleNumExt;
    }

    public void setInmuebleNumExt(String inmuebleNumExt) {
        this.inmuebleNumExt = inmuebleNumExt;
    }

    public String getInmuebleNumInt() {
        return inmuebleNumInt;
    }

    public void setInmuebleNumInt(String inmuebleNumInt) {
        this.inmuebleNumInt = inmuebleNumInt;
    }

    public String getInmuebleColonia() {
        return inmuebleColonia;
    }

    public void setInmuebleColonia(String inmuebleColonia) {
        this.inmuebleColonia = inmuebleColonia;
    }

    public String getDescInmueble() {
        return descInmueble;
    }

    public void setDescInmueble(String descInmueble) {
        this.descInmueble = descInmueble;
    }

    public String getInmueble2() {
        return inmueble2;
    }

    public void setInmueble2(String inmueble2) {
        this.inmueble2 = inmueble2;
    }

    public String getSueldoPreLabel() {
        return sueldoPreLabel;
    }

    public void setSueldoPreLabel(String sueldoPreLabel) {
        this.sueldoPreLabel = sueldoPreLabel;
    }

    public String getCompensacionPreLabel() {
        return compensacionPreLabel;
    }

    public void setCompensacionPreLabel(String compensacionPreLabel) {
        this.compensacionPreLabel = compensacionPreLabel;
    }

    public String getSueldoNomLabel() {
        return sueldoNomLabel;
    }

    public void setSueldoNomLabel(String sueldoNomLabel) {
        this.sueldoNomLabel = sueldoNomLabel;
    }

    public String getCompensacionNomLabel() {
        return compensacionNomLabel;
    }

    public void setCompensacionNomLabel(String compensacionNomLabel) {
        this.compensacionNomLabel = compensacionNomLabel;
    }

    public String getSueldoHonLabel() {
        return sueldoHonLabel;
    }

    public void setSueldoHonLabel(String sueldoHonLabel) {
        this.sueldoHonLabel = sueldoHonLabel;
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

    public String getUrlRegreso() {
        return urlRegreso;
    }

    public void setUrlRegreso(String urlRegreso) {
        this.urlRegreso = urlRegreso;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanNameSituacion() {
        return beanNameSituacion;
    }

    public void setBeanNameSituacion(String beanNameSituacion) {
        this.beanNameSituacion = beanNameSituacion;
    }

    public void setDescVacancia(String descVacancia) {
        this.descVacancia = descVacancia;
    }

    public String getDescVacancia() {
        return descVacancia;
    }
}
