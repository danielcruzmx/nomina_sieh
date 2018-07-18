
package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.CustomTdExpCapacitacionDTO;
import gob.shcp.sireh.model.CustomTdExpDoctosSinDatosDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpedienteDTO extends TdEmpleadoDTO implements java.io.Serializable, Model{

    //Parametros
    private String uniCiclo;
    private String rfcParm;
    
    //campos de JSP    
     private Integer edad;
     private Integer idPlaza;
     private String  nombreEmp;
     private String  bancoSar;
     private String  bancoEmp;
     private String  domicilio; 
     private String  telefono; 
     private String  edoNac; 
     private String  genero; 
     private String  nacionalidad; 
     private String  nivelEscolar; 
     private String  carrera;
     private String  institucionEducativa;
     private String  instProtCivil;
     private String  espProtCivil;
     private String  emailp;
     private String  numIssste;
     private String  estudiaSiNo;
     
     private String  edoCivil;
     private String  descSitPlaza;
     private String  descGrupoPago;
     private String  uniDescNom;
     private String  uniDescAbrNom;  
     private String  descPuestoNom;
     private String  descEstadoNom;   
     private String  descMunicipioNom;
     private Integer idZonaEcoNom; 
     private Integer idRangoNom; 
     private Integer idZonaDistNom;
     private Double  importeHonorario; 
     private String  idNivelPtoNom;
     private String  descNombramientoNom; 
     private String  descJeraquiaNom;
     private String  descMovsPersonal; 
     private Date    plazaUltimoMovto;
     private Date    plazaIniCont; 
     private Date    plazaFinCont; 
     private Date    plazaIniLic; 
     private Date    plazaFinLic; 
     private Integer plazaQnaCaptura;
     private String  descTipoPlaza; 
     private String  descTipoServPub;
     private String  idPtoEstrategico; 
     private String  idNodo;
     private String  codigoPuesto;
     private String  nombrePuesto;
     private Integer idInmueble; 
     private String  descInmueble;
     private Integer plazaJefe; 
     private String  codigoPuestoJefe;  
     private String  nombrePuestoJefe;
     private String  plazaRfcJefe; 
     private String  uniDescNomJefe;
     private Integer  idInmuebleJefe;
     private String  nombreJefe;     
     private String  descInmuebleJefe;
     private String  descMovsPersonalEmp;
     private Date    fecUltimoMovto; 
     private Double sueldoNom;
     private Double compensacionNom;
     
    private String leyendaConstruccion="En proceso de construcción";
          
    // Dependientes Eco 
    private List<CustomTdDepEcoDTO> listaDependientesDTO = new ArrayList<CustomTdDepEcoDTO>();
    private String jsonDependientes;
    private String jsonDependientesSubGrid;
    private Integer locdep;
    private Integer desdep;
    private Double vendep;
    
    // Antecedentes academicos
    private List<CustomTdExpAntecedentesAcademicosDTO> listaAntAcademicosDTO = new ArrayList<CustomTdExpAntecedentesAcademicosDTO>();
    private String jsonAntAcademicos;
    private Integer locAnAc;
    private Integer descAnAc;
    private Double venAnAc;
    
    // Experiencia Laboral 
    private List<CustomTdExpLabDTO> listaExperienciaLaboralDTO = new ArrayList<CustomTdExpLabDTO>();
    private String jsonEL;
    private Integer locel;
    private Integer desel;
    private Double venel;

    // Conceptos adicionnales de nomina 
    private List<CustomTnMovtoConceptoPagoDTO> listaConceptosAdicionalesDTO = new ArrayList<CustomTnMovtoConceptoPagoDTO>();
    private String jsonCA;
    private Integer locca;
    private Integer desca;
    private Double venca;

    private String jsonCAH;
    private Integer loccah;
    private Integer descah;
    private Double vencah;
    
    // Movimientos de personal 
    private List<CustomTnMovtosEmpPlaDTO> listaMovimientosEmpleadoDTO = new ArrayList<CustomTnMovtosEmpPlaDTO>();
    private String jsonTL;
    private Integer loctl;
    private Integer destl;
    private Double ventl;    
    
    // Historico de Pagos
    private List<CustomTnHistoricoPagoDTO> listaHistoricoPagoDTO = new ArrayList<CustomTnHistoricoPagoDTO>();
    private String jsonPN;
    private Integer locpn;
    private Integer despn;
    private Double venpn;    
   
    // Incidencias de personal (Faltas, licencias y dís economícos
    private List<CustomTnMovtoConceptoPagoDTO> listaIncidenciasDTO = new ArrayList<CustomTnMovtoConceptoPagoDTO>();
    private String jsonIP;
    private Integer locip;
    private Integer desip;
    private Double venip;
    
    // Timbrado
    private List<CustomTnComprobanteDTO> listaComprobanteDTO = new ArrayList<CustomTnComprobanteDTO>();
    private String jsonTimbrado;
    private Integer locTimbrado;
    private Integer desTimbrado;
    private Double venTimbrado; 

    // Documentos en el expediente de personal
    private List<CustomDoctosExpPersonalDTO> listaDoctosExpPersonalDTO = new ArrayList<CustomDoctosExpPersonalDTO>();
    private String jsonDDEP;
    private Integer locddep;
    private Integer desddep;
    private Double venddep;
    
    // Cursos
    private List<CustomTdExpCapacitacionDTO> listaCursosDTO = new ArrayList<CustomTdExpCapacitacionDTO>();
    private String jsonCursos;
    private Integer locCursos;
    private Integer desCursos;
    private Double venCursos;
    
    // Servico Profesional de Carrera
    private List<CustomTdExpDoctosSinDatosDTO> listaSPCDTO = new ArrayList<CustomTdExpDoctosSinDatosDTO>();
    private String jsonSPC;
    private Integer locSPC;
    private Integer desSPC;
    private Double venSPC;

    private ResumenMeritoDTO resumenMeritoDTO;
    
    //Etiquetas
    private String sueldoNomLabel;
    private String compensacionNomLabel;
    private String sueldoHonLabel;
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

   //Propiedades default
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private boolean muestraRegistros;
    private String colormarco;
    private String colorfondo;
    private String gruesolinea;
    private String gruesoletra;
    
    // Configuracion inicial
    private String seccion;
    private String beanName;
    private String beanNameSituacion;
    private boolean userComprobante;
    
    //Propiedad para ocultar o mostrar el boton
    private boolean filtradoPorRfc;
    
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

    public void setListaDependientesDTO(List<CustomTdDepEcoDTO> listaDependientesDTO) {
        this.listaDependientesDTO = listaDependientesDTO;
    }

    public List<CustomTdDepEcoDTO> getListaDependientesDTO() {
        return listaDependientesDTO;
    }

    public void setListaExperienciaLaboralDTO(List<CustomTdExpLabDTO> listaExperienciaLaboralDTO) {
        this.listaExperienciaLaboralDTO = listaExperienciaLaboralDTO;
    }

    public List<CustomTdExpLabDTO> getListaExperienciaLaboralDTO() {
        return listaExperienciaLaboralDTO;
    }

    public void setListaConceptosAdicionalesDTO(List<CustomTnMovtoConceptoPagoDTO> listaConceptosAdicionalesDTO) {
        this.listaConceptosAdicionalesDTO = listaConceptosAdicionalesDTO;
    }

    public List<CustomTnMovtoConceptoPagoDTO> getListaConceptosAdicionalesDTO() {
        return listaConceptosAdicionalesDTO;
    }

    public void setListaMovimientosEmpleadoDTO(List<CustomTnMovtosEmpPlaDTO> listaMovimientosEmpleadoDTO) {
        this.listaMovimientosEmpleadoDTO = listaMovimientosEmpleadoDTO;
    }

    public List<CustomTnMovtosEmpPlaDTO> getListaMovimientosEmpleadoDTO() {
        return listaMovimientosEmpleadoDTO;
    }

    public void setListaHistoricoPagoDTO(List<CustomTnHistoricoPagoDTO> listaHistoricoPagoDTO) {
        this.listaHistoricoPagoDTO = listaHistoricoPagoDTO;
    }

    public List<CustomTnHistoricoPagoDTO> getListaHistoricoPagoDTO() {
        return listaHistoricoPagoDTO;
    }

    public void setSueldoNomLabel(String sueldoNomLabel) {
        this.sueldoNomLabel = sueldoNomLabel;
    }

    public String getSueldoNomLabel() {
        return sueldoNomLabel;
    }

    public void setCompensacionNomLabel(String compensacionNomLabel) {
        this.compensacionNomLabel = compensacionNomLabel;
    }

    public String getCompensacionNomLabel() {
        return compensacionNomLabel;
    }

    public void setSueldoHonLabel(String sueldoHonLabel) {
        this.sueldoHonLabel = sueldoHonLabel;
    }

    public String getSueldoHonLabel() {
        return sueldoHonLabel;
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

    public void setColormarco(String colormarco) {
        this.colormarco = colormarco;
    }

    public String getColormarco() {
        return colormarco;
    }

    public void setColorfondo(String colorfondo) {
        this.colorfondo = colorfondo;
    }

    public String getColorfondo() {
        return colorfondo;
    }

    public void setGruesolinea(String gruesolinea) {
        this.gruesolinea = gruesolinea;
    }

    public String getGruesolinea() {
        return gruesolinea;
    }

    public void setGruesoletra(String gruesoletra) {
        this.gruesoletra = gruesoletra;
    }

    public String getGruesoletra() {
        return gruesoletra;
    }
    
    public void setListaIncidenciasDTO(List<CustomTnMovtoConceptoPagoDTO> listaIncidenciasDTO) {
        this.listaIncidenciasDTO = listaIncidenciasDTO;
    }

    public List<CustomTnMovtoConceptoPagoDTO> getListaIncidenciasDTO() {
        return listaIncidenciasDTO;
    }

    public void setResumenMeritoDTO(ResumenMeritoDTO resumenMeritoDTO) {
        this.resumenMeritoDTO = resumenMeritoDTO;
    }

    public ResumenMeritoDTO getResumenMeritoDTO() {
        return resumenMeritoDTO;
    }
    
    
    /* JSON */
    public void setJsonDependientes(String jsonDependientes) {
        this.jsonDependientes = jsonDependientes;
    }

    public String getJsonDependientes() {
        return jsonDependientes;
    }

    public void setJsonDependientesSubGrid(String jsonDependientesSubGrid) {
        this.jsonDependientesSubGrid = jsonDependientesSubGrid;
    }

    public String getJsonDependientesSubGrid() {
        return jsonDependientesSubGrid;
    }


    public void setJsonEL(String jsonEL) {
        this.jsonEL = jsonEL;
    }

    public String getJsonEL() {
        return jsonEL;
    }

    public void setLocdep(Integer locdep) {
        this.locdep = locdep;
    }

    public Integer getLocdep() {
        return locdep;
    }

    public void setDesdep(Integer desdep) {
        this.desdep = desdep;
    }

    public Integer getDesdep() {
        return desdep;
    }


    public void setLocel(Integer locel) {
        this.locel = locel;
    }

    public Integer getLocel() {
        return locel;
    }

    public void setDesel(Integer desel) {
        this.desel = desel;
    }

    public Integer getDesel() {
        return desel;
    }


    public void setJsonCA(String jsonCA) {
        this.jsonCA = jsonCA;
    }

    public String getJsonCA() {
        return jsonCA;
    }

    public void setLocca(Integer locca) {
        this.locca = locca;
    }

    public Integer getLocca() {
        return locca;
    }

    public void setDesca(Integer desca) {
        this.desca = desca;
    }

    public Integer getDesca() {
        return desca;
    }

    public void setJsonTL(String jsonTL) {
        this.jsonTL = jsonTL;
    }

    public String getJsonTL() {
        return jsonTL;
    }

    public void setLoctl(Integer loctl) {
        this.loctl = loctl;
    }

    public Integer getLoctl() {
        return loctl;
    }

    public void setDestl(Integer destl) {
        this.destl = destl;
    }

    public Integer getDestl() {
        return destl;
    }

    public void setJsonPN(String jsonPN) {
        this.jsonPN = jsonPN;
    }

    public String getJsonPN() {
        return jsonPN;
    }

    public void setLocpn(Integer locpn) {
        this.locpn = locpn;
    }

    public Integer getLocpn() {
        return locpn;
    }

    public void setDespn(Integer despn) {
        this.despn = despn;
    }

    public Integer getDespn() {
        return despn;
    }

    public void setJsonIP(String jsonIP) {
        this.jsonIP = jsonIP;
    }

    public String getJsonIP() {
        return jsonIP;
    }

    public void setLocip(Integer locip) {
        this.locip = locip;
    }

    public Integer getLocip() {
        return locip;
    }

    public void setDesip(Integer desip) {
        this.desip = desip;
    }

    public Integer getDesip() {
        return desip;
    }

    public void setVendep(Double vendep) {
        this.vendep = vendep;
    }

    public Double getVendep() {
        return vendep;
    }

    public void setVenel(Double venel) {
        this.venel = venel;
    }

    public Double getVenel() {
        return venel;
    }

    public void setVenca(Double venca) {
        this.venca = venca;
    }

    public Double getVenca() {
        return venca;
    }

    public void setVentl(Double ventl) {
        this.ventl = ventl;
    }

    public Double getVentl() {
        return ventl;
    }

    public void setVenpn(Double venpn) {
        this.venpn = venpn;
    }

    public Double getVenpn() {
        return venpn;
    }

    public void setVenip(Double venip) {
        this.venip = venip;
    }

    public Double getVenip() {
        return venip;
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

    public void setLeyendaConstruccion(String leyendaConstruccion) {
        this.leyendaConstruccion = leyendaConstruccion;
    }

    public String getLeyendaConstruccion() {
        return leyendaConstruccion;
    }

    public void setJsonCAH(String jsonCAH) {
        this.jsonCAH = jsonCAH;
    }

    public String getJsonCAH() {
        return jsonCAH;
    }

    public void setLoccah(Integer loccah) {
        this.loccah = loccah;
    }

    public Integer getLoccah() {
        return loccah;
    }

    public void setDescah(Integer descah) {
        this.descah = descah;
    }

    public Integer getDescah() {
        return descah;
    }

    public void setVencah(Double vencah) {
        this.vencah = vencah;
    }

    public Double getVencah() {
        return vencah;
    }

    public void setJsonTimbrado(String jsonTimbrado) {
        this.jsonTimbrado = jsonTimbrado;
    }

    public String getJsonTimbrado() {
        return jsonTimbrado;
    }

    public void setLocTimbrado(Integer locTimbrado) {
        this.locTimbrado = locTimbrado;
    }

    public Integer getLocTimbrado() {
        return locTimbrado;
    }

    public void setDesTimbrado(Integer desTimbrado) {
        this.desTimbrado = desTimbrado;
    }

    public Integer getDesTimbrado() {
        return desTimbrado;
    }

    public void setVenTimbrado(Double venTimbrado) {
        this.venTimbrado = venTimbrado;
    }

    public Double getVenTimbrado() {
        return venTimbrado;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setListaComprobanteDTO(List<CustomTnComprobanteDTO> listaComprobanteDTO) {
        this.listaComprobanteDTO = listaComprobanteDTO;
    }

    public List<CustomTnComprobanteDTO> getListaComprobanteDTO() {
        return listaComprobanteDTO;
    }

    public void setUserComprobante(boolean userComprobante) {
        this.userComprobante = userComprobante;
    }

    public boolean getUserComprobante() {
        return userComprobante;
    }

    public void setListaDoctosExpPersonalDTO(List<CustomDoctosExpPersonalDTO> listaDoctosExpPersonalDTO) {
        this.listaDoctosExpPersonalDTO = listaDoctosExpPersonalDTO;
    }

    public List<CustomDoctosExpPersonalDTO> getListaDoctosExpPersonalDTO() {
        return listaDoctosExpPersonalDTO;
    }

    public void setJsonDDEP(String jsonDDEP) {
        this.jsonDDEP = jsonDDEP;
    }

    public String getJsonDDEP() {
        return jsonDDEP;
    }

    public void setLocddep(Integer locddep) {
        this.locddep = locddep;
    }

    public Integer getLocddep() {
        return locddep;
    }

    public void setDesddep(Integer desddep) {
        this.desddep = desddep;
    }

    public Integer getDesddep() {
        return desddep;
    }

    public void setVenddep(Double venddep) {
        this.venddep = venddep;
    }

    public Double getVenddep() {
        return venddep;
    }

    public void setLocAnAc(Integer locAnAc) {
        this.locAnAc = locAnAc;
    }

    public Integer getLocAnAc() {
        return locAnAc;
    }

    public void setDescAnAc(Integer descAnAc) {
        this.descAnAc = descAnAc;
    }

    public Integer getDescAnAc() {
        return descAnAc;
    }

    public void setVenAnAc(Double venAnAc) {
        this.venAnAc = venAnAc;
    }

    public Double getVenAnAc() {
        return venAnAc;
    }

    public List<CustomTdExpAntecedentesAcademicosDTO> getListaAntAcademicosDTO() {
        return listaAntAcademicosDTO;
    }
    
    public void setListaAntAcademicosDTO(List<CustomTdExpAntecedentesAcademicosDTO> listaAntAcademicosDTO) {
        this.listaAntAcademicosDTO = listaAntAcademicosDTO;
    }

    public void setJsonAntAcademicos(String jsonAntAcademicos) {
        this.jsonAntAcademicos = jsonAntAcademicos;
    }

    public String getJsonAntAcademicos() {
        return jsonAntAcademicos;
    }

    public void setListaCursosDTO(List<CustomTdExpCapacitacionDTO> listaCursosDTO) {
        this.listaCursosDTO = listaCursosDTO;
    }

    public List<CustomTdExpCapacitacionDTO> getListaCursosDTO() {
        return listaCursosDTO;
    }

    public void setJsonCursos(String jsonCursos) {
        this.jsonCursos = jsonCursos;
    }

    public String getJsonCursos() {
        return jsonCursos;
    }

    public void setLocCursos(Integer locCursos) {
        this.locCursos = locCursos;
    }

    public Integer getLocCursos() {
        return locCursos;
    }

    public void setDesCursos(Integer desCursos) {
        this.desCursos = desCursos;
    }

    public Integer getDesCursos() {
        return desCursos;
    }

    public void setVenCursos(Double venCursos) {
        this.venCursos = venCursos;
    }

    public Double getVenCursos() {
        return venCursos;
    }

    public void setListaSPCDTO(List<CustomTdExpDoctosSinDatosDTO> listaSPCDTO) {
        this.listaSPCDTO = listaSPCDTO;
    }

    public List<CustomTdExpDoctosSinDatosDTO> getListaSPCDTO() {
        return listaSPCDTO;
    }

    public void setJsonSPC(String jsonSPC) {
        this.jsonSPC = jsonSPC;
    }

    public String getJsonSPC() {
        return jsonSPC;
    }

    public void setLocSPC(Integer locSPC) {
        this.locSPC = locSPC;
    }

    public Integer getLocSPC() {
        return locSPC;
    }

    public void setDesSPC(Integer desSPC) {
        this.desSPC = desSPC;
    }

    public Integer getDesSPC() {
        return desSPC;
    }

    public void setVenSPC(Double venSPC) {
        this.venSPC = venSPC;
    }

    public Double getVenSPC() {
        return venSPC;
    }

    public void setFiltradoPorRfc(boolean filtradoPorRfc) {
        this.filtradoPorRfc = filtradoPorRfc;
    }

    public boolean isFiltradoPorRfc() {
        return filtradoPorRfc;
    }
}
