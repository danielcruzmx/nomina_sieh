package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.Date;

public class CustomExpediente extends TdEmpleado implements Domain, 
                                                            Serializable {

    //Parametros
    private String uniCiclo;
    private String rfcParm;

    //campos de JSP    
    private Integer edad;
    private Integer idPlaza;
    private String nombreEmp;
    private String bancoSar;
    private String bancoEmp;
    private String domicilio;
    private String telefono;
    private String edoNac;
    private String genero;
    private String nacionalidad;
    private String nivelEscolar;
    private String carrera;
    private String institucionEducativa;
    private String instProtCivil;
    private String espProtCivil;
    private String emailp;
    private String numIssste;
    private String estudiaSiNo;

    private String edoCivil;
    private String descSitPlaza;
    private String descGrupoPago;
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
    private String descJeraquiaNom;
    private String descMovsPersonal;
    private Date plazaUltimoMovto;
    private Date plazaIniCont;
    private Date plazaFinCont;
    private Date plazaIniLic;
    private Date plazaFinLic;
    private Integer plazaQnaCaptura;
    private String descTipoPlaza;
    private String descTipoServPub;
    private String idPtoEstrategico;
    private String idNodo;
    private String codigoPuesto;
    private String nombrePuesto;
    private Integer idInmueble;
    private String descInmueble;
    private Integer plazaJefe;
    private String codigoPuestoJefe;
    private String nombrePuestoJefe;
    private String plazaRfcJefe;
    private String uniDescNomJefe;
    private Integer idInmuebleJefe;
    private String nombreJefe;
    private String descInmuebleJefe;
    private String descMovsPersonalEmp;
    private Date fecUltimoMovto;
    private String labelIngresoGobFed;
    private String labelIngresoDependencia;
    private String labelFecIngSpc;
    private String labelFecIniDeclPatr;
    private String labelFecNacimiento;
    private String labelPlazaUltimoMovto;
    private String labelPlazaIniCont;
    private String labelPlazaFinCont;
    private String labelPlazaIniLic;
    private String labelPlazaFinLic;
    private String labelPeriodo;
    private String labelContrato;

    private Double sueldoNom;
    private Double compensacionNom;

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

    public void setRfcParm(String rfcParm) {
        this.rfcParm = rfcParm;
    }

    public String getRfcParm() {
        return rfcParm;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setBancoSar(String bancoSar) {
        this.bancoSar = bancoSar;
    }

    public String getBancoSar() {
        return bancoSar;
    }

    public void setBancoEmp(String bancoEmp) {
        this.bancoEmp = bancoEmp;
    }

    public String getBancoEmp() {
        return bancoEmp;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdoNac(String edoNac) {
        this.edoNac = edoNac;
    }

    public String getEdoNac() {
        return edoNac;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setInstitucionEducativa(String institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public String getInstitucionEducativa() {
        return institucionEducativa;
    }

    public void setInstProtCivil(String instProtCivil) {
        this.instProtCivil = instProtCivil;
    }

    public String getInstProtCivil() {
        return instProtCivil;
    }

    public void setEspProtCivil(String espProtCivil) {
        this.espProtCivil = espProtCivil;
    }

    public String getEspProtCivil() {
        return espProtCivil;
    }

    public void setEmailp(String emailp) {
        this.emailp = emailp;
    }

    public String getEmailp() {
        return emailp;
    }

    public void setNumIssste(String numIssste) {
        this.numIssste = numIssste;
    }

    public String getNumIssste() {
        return numIssste;
    }

    public String get_estudiaSiNo() {
        return estudiaSiNo;
    }

    public void setEdoCivil(String edoCivil) {
        this.edoCivil = edoCivil;
    }

    public String getEdoCivil() {
        return edoCivil;
    }

    public void setDescSitPlaza(String descSitPlaza) {
        this.descSitPlaza = descSitPlaza;
    }

    public String getDescSitPlaza() {
        return descSitPlaza;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setUniDescNom(String uniDescNom) {
        this.uniDescNom = uniDescNom;
    }

    public String getUniDescNom() {
        return uniDescNom;
    }

    public void setUniDescAbrNom(String uniDescAbrNom) {
        this.uniDescAbrNom = uniDescAbrNom;
    }

    public String getUniDescAbrNom() {
        return uniDescAbrNom;
    }

    public void setDescPuestoNom(String descPuestoNom) {
        this.descPuestoNom = descPuestoNom;
    }

    public String getDescPuestoNom() {
        return descPuestoNom;
    }

    public void setDescEstadoNom(String descEstadoNom) {
        this.descEstadoNom = descEstadoNom;
    }

    public String getDescEstadoNom() {
        return descEstadoNom;
    }

    public void setDescMunicipioNom(String descMunicipioNom) {
        this.descMunicipioNom = descMunicipioNom;
    }

    public String getDescMunicipioNom() {
        return descMunicipioNom;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setIdRangoNom(Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public Integer getIdRangoNom() {
        return idRangoNom;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setImporteHonorario(Double importeHonorario) {
        this.importeHonorario = importeHonorario;
    }

    public Double getImporteHonorario() {
        return importeHonorario;
    }

    public void setIdNivelPtoNom(String idNivelPtoNom) {
        this.idNivelPtoNom = idNivelPtoNom;
    }

    public String getIdNivelPtoNom() {
        return idNivelPtoNom;
    }

    public void setDescNombramientoNom(String descNombramientoNom) {
        this.descNombramientoNom = descNombramientoNom;
    }

    public String getDescNombramientoNom() {
        return descNombramientoNom;
    }

    public void setDescJeraquiaNom(String descJeraquiaNom) {
        this.descJeraquiaNom = descJeraquiaNom;
    }

    public String getDescJeraquiaNom() {
        return descJeraquiaNom;
    }

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setPlazaUltimoMovto(Date plazaUltimoMovto) {
        this.plazaUltimoMovto = plazaUltimoMovto;
    }

    public Date getPlazaUltimoMovto() {
        return plazaUltimoMovto;
    }

    public void setPlazaIniCont(Date plazaIniCont) {
        this.plazaIniCont = plazaIniCont;
    }

    public Date getPlazaIniCont() {
        return plazaIniCont;
    }

    public void setPlazaFinCont(Date plazaFinCont) {
        this.plazaFinCont = plazaFinCont;
    }

    public Date getPlazaFinCont() {
        return plazaFinCont;
    }

    public void setPlazaIniLic(Date plazaIniLic) {
        this.plazaIniLic = plazaIniLic;
    }

    public Date getPlazaIniLic() {
        return plazaIniLic;
    }

    public void setPlazaFinLic(Date plazaFinLic) {
        this.plazaFinLic = plazaFinLic;
    }

    public Date getPlazaFinLic() {
        return plazaFinLic;
    }

    public void setPlazaQnaCaptura(Integer plazaQnaCaptura) {
        this.plazaQnaCaptura = plazaQnaCaptura;
    }

    public Integer getPlazaQnaCaptura() {
        return plazaQnaCaptura;
    }

    public void setDescTipoPlaza(String descTipoPlaza) {
        this.descTipoPlaza = descTipoPlaza;
    }

    public String getDescTipoPlaza() {
        return descTipoPlaza;
    }

    public void setDescTipoServPub(String descTipoServPub) {
        this.descTipoServPub = descTipoServPub;
    }

    public String getDescTipoServPub() {
        return descTipoServPub;
    }

    public void setIdPtoEstrategico(String idPtoEstrategico) {
        this.idPtoEstrategico = idPtoEstrategico;
    }

    public String getIdPtoEstrategico() {
        return idPtoEstrategico;
    }

    public void setIdNodo(String idNodo) {
        this.idNodo = idNodo;
    }

    public String getIdNodo() {
        return idNodo;
    }

    public void setCodigoPuesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public String getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setIdInmueble(Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Integer getIdInmueble() {
        return idInmueble;
    }

    public void setDescInmueble(String descInmueble) {
        this.descInmueble = descInmueble;
    }

    public String getDescInmueble() {
        return descInmueble;
    }

    public void setPlazaJefe(Integer plazaJefe) {
        this.plazaJefe = plazaJefe;
    }

    public Integer getPlazaJefe() {
        return plazaJefe;
    }

    public void setCodigoPuestoJefe(String codigoPuestoJefe) {
        this.codigoPuestoJefe = codigoPuestoJefe;
    }

    public String getCodigoPuestoJefe() {
        return codigoPuestoJefe;
    }

    public void setNombrePuestoJefe(String nombrePuestoJefe) {
        this.nombrePuestoJefe = nombrePuestoJefe;
    }

    public String getNombrePuestoJefe() {
        return nombrePuestoJefe;
    }

    public void setPlazaRfcJefe(String plazaRfcJefe) {
        this.plazaRfcJefe = plazaRfcJefe;
    }

    public String getPlazaRfcJefe() {
        return plazaRfcJefe;
    }

    public void setUniDescNomJefe(String uniDescNomJefe) {
        this.uniDescNomJefe = uniDescNomJefe;
    }

    public String getUniDescNomJefe() {
        return uniDescNomJefe;
    }

    public void setIdInmuebleJefe(Integer idInmuebleJefe) {
        this.idInmuebleJefe = idInmuebleJefe;
    }

    public Integer getIdInmuebleJefe() {
        return idInmuebleJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public String getNombreJefe() {
        return nombreJefe;
    }

    public void setDescInmuebleJefe(String descInmuebleJefe) {
        this.descInmuebleJefe = descInmuebleJefe;
    }

    public String getDescInmuebleJefe() {
        return descInmuebleJefe;
    }

    public void setDescMovsPersonalEmp(String descMovsPersonalEmp) {
        this.descMovsPersonalEmp = descMovsPersonalEmp;
    }

    public String getDescMovsPersonalEmp() {
        return descMovsPersonalEmp;
    }

    public Date get_fecUltimoMovto() {
        return fecUltimoMovto;
    }

    public void setSueldoNom(Double sueldoNom) {
        this.sueldoNom = sueldoNom;
    }

    public Double getSueldoNom() {
        return sueldoNom;
    }

    public void setCompensacionNom(Double compensacionNom) {
        this.compensacionNom = compensacionNom;
    }

    public Double getCompensacionNom() {
        return compensacionNom;
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

    public void setLabelIngresoGobFed(String labelIngresoGobFed) {
        this.labelIngresoGobFed = labelIngresoGobFed;
    }

    public String getLabelIngresoGobFed() {
        return labelIngresoGobFed;
    }

    public void setLabelIngresoDependencia(String labelIngresoDependencia) {
        this.labelIngresoDependencia = labelIngresoDependencia;
    }

    public String getLabelIngresoDependencia() {
        return labelIngresoDependencia;
    }

    public void setLabelFecIngSpc(String labelFecIngSpc) {
        this.labelFecIngSpc = labelFecIngSpc;
    }

    public String getLabelFecIngSpc() {
        return labelFecIngSpc;
    }

    public void setLabelFecIniDeclPatr(String labelFecIniDeclPatr) {
        this.labelFecIniDeclPatr = labelFecIniDeclPatr;
    }

    public String getLabelFecIniDeclPatr() {
        return labelFecIniDeclPatr;
    }

    public void setLabelFecNacimiento(String labelFecNacimiento) {
        this.labelFecNacimiento = labelFecNacimiento;
    }

    public String getLabelFecNacimiento() {
        return labelFecNacimiento;
    }

    public void setLabelPlazaUltimoMovto(String labelPlazaUltimoMovto) {
        this.labelPlazaUltimoMovto = labelPlazaUltimoMovto;
    }

    public String getLabelPlazaUltimoMovto() {
        return labelPlazaUltimoMovto;
    }

    public void setLabelPlazaIniCont(String labelPlazaIniCont) {
        this.labelPlazaIniCont = labelPlazaIniCont;
    }

    public String getLabelPlazaIniCont() {
        return labelPlazaIniCont;
    }

    public void setLabelPlazaFinCont(String labelPlazaFinCont) {
        this.labelPlazaFinCont = labelPlazaFinCont;
    }

    public String getLabelPlazaFinCont() {
        return labelPlazaFinCont;
    }

    public void setLabelPlazaIniLic(String labelPlazaIniLic) {
        this.labelPlazaIniLic = labelPlazaIniLic;
    }

    public String getLabelPlazaIniLic() {
        return labelPlazaIniLic;
    }

    public void setLabelPlazaFinLic(String labelPlazaFinLic) {
        this.labelPlazaFinLic = labelPlazaFinLic;
    }

    public String getLabelPlazaFinLic() {
        return labelPlazaFinLic;
    }

    public void setLabelPeriodo(String labelPeriodo) {
        this.labelPeriodo = labelPeriodo;
    }

    public String getLabelPeriodo() {
        return labelPeriodo;
    }

    public void setLabelContrato(String labelContrato) {
        this.labelContrato = labelContrato;
    }

    public String getLabelContrato() {
        return labelContrato;
    }
}
