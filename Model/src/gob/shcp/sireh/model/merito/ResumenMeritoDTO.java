package gob.shcp.sireh.model.merito;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ResumenMeritoDTO implements Serializable, Model {

    public static final Integer ID_CAUSAL_PUNTUALIDAD = 3;
    public static final Integer ID_CAUSAL_CAPACITACION = 4;
    public static final Integer ID_CAUSAL_EVALUACION = 1;
    public static final Integer ID_CAUSAL_OTROS = 0;

    public static final String DESC_CAUSAL_PUNTUALIDAD = "Puntualidad";
    public static final String DESC_CAUSAL_CAPACITACION = "Capacitación";
    public static final String DESC_CAUSAL_EVALUACION = "Evaluación";

    public static final String SUFIX_PU = "PU";
    public static final String SUFIX_CA = "CA";
    public static final String SUFIX_EP = "EP";

    public static final Integer VALOR_CONSECUTIVIDAD = 6;
    public static final Integer SIN_VALOR_CONSECUTIVIDAD = 0;
    public static final Integer VALOR_CONSECUTIVIDAD_PUNTUALIDAD_MENSUAL = 18;
    
    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean muestraRegistros;

    private Integer tdNmhCiclo;
    private Integer anioIni;
    private Integer anioFin;
    private String tdNmhOp;
    private Integer hpQnaPago;
    private Integer tdNmhCveCausal;
    private ArrayList<EtiquetaClaveValorEntero> cicloValores;
    private ArrayList<EtiquetaClaveValorEntero> causalValores;
    private List listModel = new ArrayList();
    private FileContent file;
    private java.lang.Integer idPlaza;
    private String tdNmhRfcUnico;
    private String nombreEmpleado;
    private Integer idUnidad;
    private String idPuesto;
    private String idNivelPto;
    private Integer consecutivo;
    private String mensaje;
    private List<ResumenMeritoDTO> listaErrores;
    private Boolean resultadoCargaArchivo;
    private String nombreArchivoErrores;
    private String rutaArchivoErrores;
    private Integer numeroNotasMeritoCorrectas;
    private Integer numeroNotasMeritoIncorrectas;
    private String curso;
    private String nombreCurso;
    private Date inicioCurso;
    private Date finCurso;
    private Integer duracion;
    private String estatus;
    private String nivelOp;
    private String genero;
    private String mes;
    private String idGenero;
    private String idNombramiento;
    private Boolean manual;
    private List<ResumenMeritoDTO> resumenList = new ArrayList<ResumenMeritoDTO>();
    private List<ResumenMeritoDTO> resumenAnosConsecutivosList = new ArrayList<ResumenMeritoDTO>();
    private Boolean validaNotaMeritoManual = false;
    private String tdNmhCveUnidad;
    private String tdNmhTipoPlaza;
    private String desGenero;
    private Integer anosAcumulados;
    private String fuente;
    private String conceptoPago;
    private Integer tdNmrCiclo;
    private Integer tdNmrCicloPago;
    private Integer tdNmrCveCausal;
    private String tdNmrRfc;
    private Integer tdNmrCicloFinal;
    private Integer tdNmrCicloInicial;
    private Integer tdNmrDiasPagados;
    private String tdNmrRemesaInterna;
    private String descMhCausal;
    private String tdNmhFechaReg;
    private Integer hpQnaPagoValidar;
    private String tdNmhFechaAgre;
    private String usuario;
    private String fecModifico;
    private String tdNmrRfcUnico;
    private String descNmCausal;
    private String tdNmrOp;
    private String tdNmrOficEnvio;
    private Date tdNmrFecEnvio;
    private Double tdNmrImpteBruto;
    private Double tdNmrImpteNeto;
    private Double tdNmrImptePension;
    private Double tdNmrImpteIsr;
    private java.lang.String plazaRfc;
    private java.lang.String nombre;
    private java.lang.String idPuestoNom;
    private java.lang.String idSitPlaza;
    private java.lang.String descripcionSitua;
    private java.lang.String descripcionNombramiento;
    private java.lang.Double tabSueldo;
    private java.lang.Double ultimoPagoPuntualidad;
    private java.lang.Double ultimoPagoConsecutividad;
    private java.lang.Integer idUnidadNom;
    private java.lang.Integer tamanioEncabezadoConsecutividadList;
    private java.util.List<EncabezadoConsecutividad> encabezadoConsecutividadList = 
        new ArrayList<EncabezadoConsecutividad>();
    private java.util.List<CausalConsecutividad> causalConsecutividadList = new ArrayList<CausalConsecutividad>();


    public ResumenMeritoDTO() {
        Date hoy = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hoy);
        Integer anioActual = cal.get(Calendar.YEAR);
        ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> listaCiclos = 
            new ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero>();
        listaCiclos.add(this.getInstanceEtiquetaClaveValorEntero(anioActual, anioActual.toString()));
        anioActual--;
        listaCiclos.add(this.getInstanceEtiquetaClaveValorEntero(anioActual, anioActual.toString()));
        this.setCicloValores(listaCiclos);
        ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> listaCausal = 
            new ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero>();
        listaCausal.add(this.getInstanceEtiquetaClaveValorEntero(ID_CAUSAL_PUNTUALIDAD, DESC_CAUSAL_PUNTUALIDAD));
        listaCausal.add(this.getInstanceEtiquetaClaveValorEntero(ID_CAUSAL_CAPACITACION, DESC_CAUSAL_CAPACITACION));
        listaCausal.add(this.getInstanceEtiquetaClaveValorEntero(ID_CAUSAL_EVALUACION, DESC_CAUSAL_EVALUACION));
        this.setCausalValores(listaCausal);
        this.setManual(false);
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

    public Integer getTdNmhCiclo() {
        return tdNmhCiclo;
    }

    public void setTdNmhCiclo(Integer tdNmhCiclo) {
        this.tdNmhCiclo = tdNmhCiclo;
    }

    public String getTdNmhOp() {
        return tdNmhOp;
    }

    public void setTdNmhOp(String tdNmhOp) {
        this.tdNmhOp = tdNmhOp;
    }

    public ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> getCicloValores() {
        return cicloValores;
    }

    public void setCicloValores(ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> cicloValores) {
        this.cicloValores = cicloValores;
    }

    public EtiquetaClaveValor getInstanceEtiquetaClaveValor(String clave, String valor) {
        EtiquetaClaveValor etiquetaClaveValor = new EtiquetaClaveValor(clave, valor);
        return etiquetaClaveValor;
    }

    public EtiquetaClaveValorEntero getInstanceEtiquetaClaveValorEntero(Integer clave, String valor) {
        EtiquetaClaveValorEntero etiquetaClaveValorEntero = new EtiquetaClaveValorEntero(clave, valor);
        return etiquetaClaveValorEntero;
    }

    public EncabezadoConsecutividad getInstaceOfEncabezadoConsecutividad(Integer consecutivo, Integer tdNmhCiclo) {
        EncabezadoConsecutividad encabezadoConsecutividad = new EncabezadoConsecutividad(consecutivo, tdNmhCiclo);
        return encabezadoConsecutividad;
    }

    public PuntoCausalConsecutividad getInstanceOfPuntoCausalConsecutividad(Integer tdNmhCiclo, Integer punto, 
                                                                            boolean muestraValor) {
        PuntoCausalConsecutividad puntoCausalConsecutividad = 
            new PuntoCausalConsecutividad(tdNmhCiclo, punto, muestraValor);
        return puntoCausalConsecutividad;
    }

    public CausalConsecutividad getInstanceOfCausalConsecutividad(Integer tdNmhCveCausal, String nombreCausal, 
                                                                  String color) {
        CausalConsecutividad causalConsecutividad = new CausalConsecutividad(tdNmhCveCausal, nombreCausal, color);
        return causalConsecutividad;
    }

    public Integer getHpQnaPago() {
        return hpQnaPago;
    }

    public void setHpQnaPago(Integer hpQnaPago) {
        this.hpQnaPago = hpQnaPago;
    }

    public Integer getTdNmhCveCausal() {
        return tdNmhCveCausal;
    }

    public void setTdNmhCveCausal(Integer tdNmhCveCausal) {
        this.tdNmhCveCausal = tdNmhCveCausal;
    }

    public FileContent getFile() {
        return file;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public List getListModel() {
        return listModel;
    }

    public void setListModel(List listModel) {
        this.listModel = listModel;
    }

    public String getTdNmhRfcUnico() {
        return tdNmhRfcUnico;
    }

    public void setTdNmhRfcUnico(String tdNmhRfcUnico) {
        this.tdNmhRfcUnico = tdNmhRfcUnico;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<ResumenMeritoDTO> getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(List<ResumenMeritoDTO> listaErrores) {
        this.listaErrores = listaErrores;
    }


    public Integer getNumeroNotasMeritoCorrectas() {
        return numeroNotasMeritoCorrectas;
    }

    public void setNumeroNotasMeritoCorrectas(Integer numeroNotasMeritoCorrectas) {
        this.numeroNotasMeritoCorrectas = numeroNotasMeritoCorrectas;
    }

    public Integer getNumeroNotasMeritoIncorrectas() {
        return numeroNotasMeritoIncorrectas;
    }

    public void setNumeroNotasMeritoIncorrectas(Integer numeroNotasMeritoIncorrectas) {
        this.numeroNotasMeritoIncorrectas = numeroNotasMeritoIncorrectas;
    }

    public Boolean getResultadoCargaArchivo() {
        return resultadoCargaArchivo;
    }

    public void setResultadoCargaArchivo(Boolean resultadoCargaArchivo) {
        this.resultadoCargaArchivo = resultadoCargaArchivo;
    }

    public String getNombreArchivoErrores() {
        return nombreArchivoErrores;
    }

    public void setNombreArchivoErrores(String nombreArchivoErrores) {
        this.nombreArchivoErrores = nombreArchivoErrores;
    }

    public String getRutaArchivoErrores() {
        return rutaArchivoErrores;
    }

    public void setRutaArchivoErrores(String rutaArchivoErrores) {
        this.rutaArchivoErrores = rutaArchivoErrores;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Date getInicioCurso() {
        return inicioCurso;
    }

    public void setInicioCurso(Date inicioCurso) {
        this.inicioCurso = inicioCurso;
    }

    public Date getFinCurso() {
        return finCurso;
    }

    public void setFinCurso(Date finCurso) {
        this.finCurso = finCurso;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getNivelOp() {
        return nivelOp;
    }

    public void setNivelOp(String nivelOp) {
        this.nivelOp = nivelOp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> getCausalValores() {
        return causalValores;
    }

    public void setCausalValores(ArrayList<ResumenMeritoDTO.EtiquetaClaveValorEntero> causalValores) {
        this.causalValores = causalValores;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }


    public Boolean getValidaNotaMeritoManual() {
        return validaNotaMeritoManual;
    }

    public void setValidaNotaMeritoManual(Boolean validaNotaMeritoManual) {
        this.validaNotaMeritoManual = validaNotaMeritoManual;
    }

    public String getTdNmhCveUnidad() {
        return tdNmhCveUnidad;
    }

    public void setTdNmhCveUnidad(String tdNmhCveUnidad) {
        this.tdNmhCveUnidad = tdNmhCveUnidad;
    }

    public String getTdNmhTipoPlaza() {
        return tdNmhTipoPlaza;
    }

    public void setTdNmhTipoPlaza(String tdNmhTipoPlaza) {
        this.tdNmhTipoPlaza = tdNmhTipoPlaza;
    }

    public String getDesGenero() {
        return desGenero;
    }

    public void setDesGenero(String desGenero) {
        this.desGenero = desGenero;
    }

    public Integer getAnosAcumulados() {
        return anosAcumulados;
    }

    public void setAnosAcumulados(Integer anosAcumulados) {
        this.anosAcumulados = anosAcumulados;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public Integer getTdNmrCicloPago() {
        return tdNmrCicloPago;
    }

    public void setTdNmrCicloPago(Integer tdNmrCicloPago) {
        this.tdNmrCicloPago = tdNmrCicloPago;
    }

    public Integer getTdNmrCveCausal() {
        return tdNmrCveCausal;
    }

    public void setTdNmrCveCausal(Integer tdNmrCveCausal) {
        this.tdNmrCveCausal = tdNmrCveCausal;
    }

    public String getTdNmrRfc() {
        return tdNmrRfc;
    }

    public void setTdNmrRfc(String tdNmrRfc) {
        this.tdNmrRfc = tdNmrRfc;
    }

    public Integer getTdNmrCicloFinal() {
        return tdNmrCicloFinal;
    }

    public void setTdNmrCicloFinal(Integer tdNmrCicloFinal) {
        this.tdNmrCicloFinal = tdNmrCicloFinal;
    }

    public Integer getTdNmrCicloInicial() {
        return tdNmrCicloInicial;
    }

    public void setTdNmrCicloInicial(Integer tdNmrCicloInicial) {
        this.tdNmrCicloInicial = tdNmrCicloInicial;
    }

    public Integer getTdNmrDiasPagados() {
        return tdNmrDiasPagados;
    }

    public void setTdNmrDiasPagados(Integer tdNmrDiasPagados) {
        this.tdNmrDiasPagados = tdNmrDiasPagados;
    }

    public String getTdNmrRemesaInterna() {
        return tdNmrRemesaInterna;
    }

    public void setTdNmrRemesaInterna(String tdNmrRemesaInterna) {
        this.tdNmrRemesaInterna = tdNmrRemesaInterna;
    }

    public List<ResumenMeritoDTO> getResumenList() {
        return resumenList;
    }

    public void setResumenList(List<ResumenMeritoDTO> resumenList) {
        this.resumenList = resumenList;
    }

    public List<ResumenMeritoDTO> getResumenAnosConsecutivosList() {
        return resumenAnosConsecutivosList;
    }

    public void setResumenAnosConsecutivosList(List<ResumenMeritoDTO> resumenAnosConsecutivosList) {
        this.resumenAnosConsecutivosList = resumenAnosConsecutivosList;
    }

    public String getDescMhCausal() {
        return descMhCausal;
    }

    public void setDescMhCausal(String descMhCausal) {
        this.descMhCausal = descMhCausal;
    }

    public String getTdNmhFechaReg() {
        return tdNmhFechaReg;
    }

    public void setTdNmhFechaReg(String tdNmhFechaReg) {
        this.tdNmhFechaReg = tdNmhFechaReg;
    }

    public Integer getHpQnaPagoValidar() {
        return hpQnaPagoValidar;
    }

    public void setHpQnaPagoValidar(Integer hpQnaPagoValidar) {
        this.hpQnaPagoValidar = hpQnaPagoValidar;
    }

    public String getTdNmhFechaAgre() {
        return tdNmhFechaAgre;
    }

    public void setTdNmhFechaAgre(String tdNmhFechaAgre) {
        this.tdNmhFechaAgre = tdNmhFechaAgre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecModifico() {
        return fecModifico;
    }

    public void setFecModifico(String fecModifico) {
        this.fecModifico = fecModifico;
    }

    public String getTdNmrRfcUnico() {
        return tdNmrRfcUnico;
    }

    public void setTdNmrRfcUnico(String tdNmrRfcUnico) {
        this.tdNmrRfcUnico = tdNmrRfcUnico;
    }

    public String getDescNmCausal() {
        return descNmCausal;
    }

    public void setDescNmCausal(String descNmCausal) {
        this.descNmCausal = descNmCausal;
    }

    public String getTdNmrOp() {
        return tdNmrOp;
    }

    public void setTdNmrOp(String tdNmrOp) {
        this.tdNmrOp = tdNmrOp;
    }

    public String getTdNmrOficEnvio() {
        return tdNmrOficEnvio;
    }

    public void setTdNmrOficEnvio(String tdNmrOficEnvio) {
        this.tdNmrOficEnvio = tdNmrOficEnvio;
    }

    public Date getTdNmrFecEnvio() {
        return tdNmrFecEnvio;
    }

    public void setTdNmrFecEnvio(Date tdNmrFecEnvio) {
        this.tdNmrFecEnvio = tdNmrFecEnvio;
    }

    public Double getTdNmrImpteBruto() {
        return tdNmrImpteBruto;
    }

    public void setTdNmrImpteBruto(Double tdNmrImpteBruto) {
        this.tdNmrImpteBruto = tdNmrImpteBruto;
    }

    public Double getTdNmrImpteNeto() {
        return tdNmrImpteNeto;
    }

    public void setTdNmrImpteNeto(Double tdNmrImpteNeto) {
        this.tdNmrImpteNeto = tdNmrImpteNeto;
    }

    public Double getTdNmrImptePension() {
        return tdNmrImptePension;
    }

    public void setTdNmrImptePension(Double tdNmrImptePension) {
        this.tdNmrImptePension = tdNmrImptePension;
    }

    public Double getTdNmrImpteIsr() {
        return tdNmrImpteIsr;
    }

    public void setTdNmrImpteIsr(Double tdNmrImpteIsr) {
        this.tdNmrImpteIsr = tdNmrImpteIsr;
    }

    public String getPlazaRfc() {
        return plazaRfc;
    }

    public void setPlazaRfc(String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdSitPlaza() {
        return idSitPlaza;
    }

    public void setIdSitPlaza(String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    public String getDescripcionSitua() {
        return descripcionSitua;
    }

    public void setDescripcionSitua(String descripcionSitua) {
        this.descripcionSitua = descripcionSitua;
    }

    public String getDescripcionNombramiento() {
        return descripcionNombramiento;
    }

    public void setDescripcionNombramiento(String descripcionNombramiento) {
        this.descripcionNombramiento = descripcionNombramiento;
    }

    public Double getTabSueldo() {
        return tabSueldo;
    }

    public void setTabSueldo(Double tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public Double getUltimoPagoPuntualidad() {
        return ultimoPagoPuntualidad;
    }

    public void setUltimoPagoPuntualidad(Double ultimoPagoPuntualidad) {
        this.ultimoPagoPuntualidad = ultimoPagoPuntualidad;
    }

    public Double getUltimoPagoConsecutividad() {
        return ultimoPagoConsecutividad;
    }

    public void setUltimoPagoConsecutividad(Double ultimoPagoConsecutividad) {
        this.ultimoPagoConsecutividad = ultimoPagoConsecutividad;
    }

    public Integer getTdNmrCiclo() {
        return tdNmrCiclo;
    }

    public void setTdNmrCiclo(Integer tdNmrCiclo) {
        this.tdNmrCiclo = tdNmrCiclo;
    }

    public Integer getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdUnidadNom(Integer idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public List<ResumenMeritoDTO.EncabezadoConsecutividad> getEncabezadoConsecutividadList() {
        return encabezadoConsecutividadList;
    }

    public void setEncabezadoConsecutividadList(List<ResumenMeritoDTO.EncabezadoConsecutividad> encabezadoConsecutividadList) {
        this.encabezadoConsecutividadList = encabezadoConsecutividadList;
    }

    public List<ResumenMeritoDTO.CausalConsecutividad> getCausalConsecutividadList() {
        return causalConsecutividadList;
    }

    public void setCausalConsecutividadList(List<ResumenMeritoDTO.CausalConsecutividad> causalConsecutividadList) {
        this.causalConsecutividadList = causalConsecutividadList;
    }

    public Integer getTamanioEncabezadoConsecutividadList() {
        tamanioEncabezadoConsecutividadList = 0;
        if (encabezadoConsecutividadList != null) {
            tamanioEncabezadoConsecutividadList = encabezadoConsecutividadList.size();
        }
        return tamanioEncabezadoConsecutividadList;
    }

    public void setTamanioEncabezadoConsecutividadList(Integer tamanioEncabezadoConsecutividadList) {
        this.tamanioEncabezadoConsecutividadList = tamanioEncabezadoConsecutividadList;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
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

    public void setAnioIni(Integer anioIni) {
        this.anioIni = anioIni;
    }

    public Integer getAnioIni() {
        return anioIni;
    }

    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    public Integer getAnioFin() {
        return anioFin;
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

    public class EtiquetaClaveValorEntero {
        private Integer clave;
        private String valor;

        public EtiquetaClaveValorEntero(Integer clave, String valor) {
            this.setClave(clave);
            this.setValor(valor);
        }

        public Integer getClave() {
            return clave;
        }

        public void setClave(Integer clave) {
            this.clave = clave;
        }

        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }
    }

    public class EncabezadoConsecutividad {

        private Integer consecutivo;
        private Integer tdNmhCiclo;

        public EncabezadoConsecutividad(Integer consecutivo, Integer tdNmhCiclo) {
            this.setConsecutivo(consecutivo);
            this.setTdNmhCiclo(tdNmhCiclo);
        }

        public Integer getConsecutivo() {
            return consecutivo;
        }

        public void setConsecutivo(Integer consecutivo) {
            this.consecutivo = consecutivo;
        }

        public Integer getTdNmhCiclo() {
            return tdNmhCiclo;
        }

        public void setTdNmhCiclo(Integer tdNmhCiclo) {
            this.tdNmhCiclo = tdNmhCiclo;
        }
    }

    public class PuntoCausalConsecutividad {
        private Integer tdNmhCiclo;
        private Integer punto;
        private boolean muestraValor;

        public PuntoCausalConsecutividad(Integer tdNmhCiclo, Integer punto, boolean muestraValor) {
            this.tdNmhCiclo = tdNmhCiclo;
            this.punto = punto;
            this.muestraValor = muestraValor;
        }

        public Integer getTdNmhCiclo() {
            return tdNmhCiclo;
        }

        public void setTdNmhCiclo(Integer tdNmhCiclo) {
            this.tdNmhCiclo = tdNmhCiclo;
        }

        public Integer getPunto() {
            return punto;
        }

        public void setPunto(Integer punto) {
            this.punto = punto;
        }

        public boolean isMuestraValor() {
            return muestraValor;
        }

        public void setMuestraValor(boolean muestraValor) {
            this.muestraValor = muestraValor;
        }
    }

    public class CausalConsecutividad {

        private Integer tdNmhCveCausal;
        private String nombreCausal;
        private String color;
        private List<PuntoCausalConsecutividad> puntoCausalConsecutividadList = 
            new ArrayList<PuntoCausalConsecutividad>();


        public CausalConsecutividad(Integer tdNmhCveCausal, String nombreCausal, String color) {
            this.setTdNmhCveCausal(tdNmhCveCausal);
            this.nombreCausal = nombreCausal;
            this.color = color;
        }

        public Integer getTdNmhCveCausal() {
            return tdNmhCveCausal;
        }

        public void setTdNmhCveCausal(Integer tdNmhCveCausal) {
            this.tdNmhCveCausal = tdNmhCveCausal;
        }

        public List<ResumenMeritoDTO.PuntoCausalConsecutividad> getPuntoCausalConsecutividadList() {
            return puntoCausalConsecutividadList;
        }

        public void setPuntoCausalConsecutividadList(List<ResumenMeritoDTO.PuntoCausalConsecutividad> puntoCausalConsecutividadList) {
            this.puntoCausalConsecutividadList = puntoCausalConsecutividadList;
        }

        public String getNombreCausal() {
            return nombreCausal;
        }

        public void setNombreCausal(String nombreCausal) {
            this.nombreCausal = nombreCausal;
        }

        public int sumaPuntoValor(int posicion) {
            int suma = 0;
            if (puntoCausalConsecutividadList.size() > 0) {
                for (int i = 0; i <= posicion; i++) {
                    suma += puntoCausalConsecutividadList.get(i).getPunto();
                }
            }
            return suma;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
