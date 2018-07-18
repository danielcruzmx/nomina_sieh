package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

import java.sql.Date;

public class ConsultaMovtosPersonalDTO implements java.io.Serializable, Model {

    //Filtros
    private String rfcf;
    private Integer idPlazaf;
    private String uniCiclo;
    private String idCiclo;

    //Datos
    private String movPersonal;
    private Integer idPlaza;
    private String idPuestoNom;
    private Integer idRangoNom;
    private String nombramiento;
    private String mepRfc;
    private String mepCurp;
    private String nombreEmp;
    private Integer mepQnaCaptura;
    private Date mepIniCont;
    private Date mepFinCont;
    private Double mepImporteHonorario;
    private String usuario;
    private Date fecModifico;
    private String idUnidadNom;
    private Integer idZonaEcoNom;
    private String grupoPago;
    private String servPub;
    private Long idMovtosEmpPla;
    private String mepObserva;
    private String mepObservaInternas;

    //Etiquetas
    private String importeHonorarioLabel;

    //Propiedades default
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;

    public void setRfcf(String rfcf) {
        this.rfcf = rfcf;
    }

    public String getRfcf() {
        return rfcf;
    }

    public void setIdPlazaf(Integer idPlazaf) {
        this.idPlazaf = idPlazaf;
    }

    public Integer getIdPlazaf() {
        return idPlazaf;
    }

    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getIdCiclo() {
        return idCiclo;
    }

    public void setMovPersonal(String movPersonal) {
        this.movPersonal = movPersonal;
    }

    public String getMovPersonal() {
        return movPersonal;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdRangoNom(Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public Integer getIdRangoNom() {
        return idRangoNom;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    public void setMepRfc(String mepRfc) {
        this.mepRfc = mepRfc;
    }

    public String getMepRfc() {
        return mepRfc;
    }

    public void setMepCurp(String mepCurp) {
        this.mepCurp = mepCurp;
    }

    public String getMepCurp() {
        return mepCurp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setMepQnaCaptura(Integer mepQnaCaptura) {
        this.mepQnaCaptura = mepQnaCaptura;
    }

    public Integer getMepQnaCaptura() {
        return mepQnaCaptura;
    }

    public void setMepIniCont(Date mepIniCont) {
        this.mepIniCont = mepIniCont;
    }

    public Date getMepIniCont() {
        return mepIniCont;
    }

    public void setMepFinCont(Date mepFinCont) {
        this.mepFinCont = mepFinCont;
    }

    public Date getMepFinCont() {
        return mepFinCont;
    }

    public void setMepImporteHonorario(Double mepImporteHonorario) {
        this.mepImporteHonorario = mepImporteHonorario;
    }

    public Double getMepImporteHonorario() {
        return mepImporteHonorario;
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

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setServPub(String servPub) {
        this.servPub = servPub;
    }

    public String getServPub() {
        return servPub;
    }

    public void setIdMovtosEmpPla(Long idMovtosEmpPla) {
        this.idMovtosEmpPla = idMovtosEmpPla;
    }

    public Long getIdMovtosEmpPla() {
        return idMovtosEmpPla;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }

    public void setMepObservaInternas(String mepObservaInternas) {
        this.mepObservaInternas = mepObservaInternas;
    }

    public String getMepObservaInternas() {
        return mepObservaInternas;
    }

    public void setImporteHonorarioLabel(String importeHonorarioLabel) {
        this.importeHonorarioLabel = importeHonorarioLabel;
    }

    public String getImporteHonorarioLabel() {
        return importeHonorarioLabel;
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
    
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
