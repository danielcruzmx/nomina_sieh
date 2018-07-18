package gob.shcp.sireh.model.plaza.gestion;

import gob.shcp.fsn.model.Model;

public class ConsultaGeneralDTO implements java.io.Serializable, Model{

    //Filtros
    private String uniCiclo;
    private String idCiclo;
    
    //Plaza    
    private Integer idPlaza;
    private String  plazaRfc;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private String  nombreEmp;
    private String  idSitPlaza;
    private String  descSitPlaza;
    private String  idGrupoPago;
    private String  descGrupoPago;
    private Integer idVacancia;
  
    //Presupuesto
    private String  idUnidadPre;
    private String  idPuestoPre;
    private String  idNivelPtoPre;
    private String  idNivelPtoPreFil;
    private String  idNombPre;
    
    private String  idNombPreFil;
 
    //Nomina   
    private String  idUnidadNom;
    private String  idPuestoNom;
    private String  idNivelPtoNom;
    private String  idNivelPtoNomFil;
    private String  idNombNom;
    
    private String  idNombNomFil;

    //Contrato
    private String idMovtoPersona;

    //Escenario
    private String  idTipoPlaza;
    private String  descTipoPlaza;
    private String  idServPub;
    private String  codigoPuesto;
    
    //Propiedades default
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    private String beanNameSituacion;


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

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setPlazaRfc(String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    public String getPlazaRfc() {
        return plazaRfc;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setIdSitPlaza(String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public String getIdSitPlaza() {
        return idSitPlaza;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setIdUnidadPre(String idUnidadPre) {
        this.idUnidadPre = idUnidadPre;
    }

    public String getIdUnidadPre() {
        return idUnidadPre;
    }

    public void setIdPuestoPre(String idPuestoPre) {
        this.idPuestoPre = idPuestoPre;
    }

    public String getIdPuestoPre() {
        return idPuestoPre;
    }

    public void setIdNivelPtoPre(String idNivelPtoPre) {
        this.idNivelPtoPre = idNivelPtoPre;
    }

    public String getIdNivelPtoPre() {
        return idNivelPtoPre;
    }

    public void setIdNivelPtoPreFil(String idNivelPtoPreFil) {
        this.idNivelPtoPreFil = idNivelPtoPreFil;
    }

    public String getIdNivelPtoPreFil() {
        return idNivelPtoPreFil;
    }

    public void setIdNombPre(String idNombPre) {
        this.idNombPre = idNombPre;
    }

    public String getIdNombPre() {
        return idNombPre;
    }

    public void setIdNombPreFil(String idNombPreFil) {
        this.idNombPreFil = idNombPreFil;
    }

    public String getIdNombPreFil() {
        return idNombPreFil;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPtoNom(String idNivelPtoNom) {
        this.idNivelPtoNom = idNivelPtoNom;
    }

    public String getIdNivelPtoNom() {
        return idNivelPtoNom;
    }

    public void setIdNivelPtoNomFil(String idNivelPtoNomFil) {
        this.idNivelPtoNomFil = idNivelPtoNomFil;
    }

    public String getIdNivelPtoNomFil() {
        return idNivelPtoNomFil;
    }

    public void setIdNombNom(String idNombNom) {
        this.idNombNom = idNombNom;
    }

    public String getIdNombNom() {
        return idNombNom;
    }

    public void setIdNombNomFil(String idNombNomFil) {
        this.idNombNomFil = idNombNomFil;
    }

    public String getIdNombNomFil() {
        return idNombNomFil;
    }

    public void setIdMovtoPersona(String idMovtoPersona) {
        this.idMovtoPersona = idMovtoPersona;
    }

    public String getIdMovtoPersona() {
        return idMovtoPersona;
    }

    public void setIdTipoPlaza(String idTipoPlaza) {
        this.idTipoPlaza = idTipoPlaza;
    }

    public String getIdTipoPlaza() {
        return idTipoPlaza;
    }

    public void setDescTipoPlaza(String descTipoPlaza) {
        this.descTipoPlaza = descTipoPlaza;
    }

    public String getDescTipoPlaza() {
        return descTipoPlaza;
    }

    public void setIdServPub(String idServPub) {
        this.idServPub = idServPub;
    }

    public String getIdServPub() {
        return idServPub;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
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

    public void setBeanNameSituacion(String beanNameSituacion) {
        this.beanNameSituacion = beanNameSituacion;
    }

    public String getBeanNameSituacion() {
        return beanNameSituacion;
    }


    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setIdVacancia(Integer idVacancia) {
        this.idVacancia = idVacancia;
    }

    public Integer getIdVacancia() {
        return idVacancia;
    }
}
