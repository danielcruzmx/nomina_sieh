package gob.shcp.sireh.model.merito;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class PagoMeritoDTO implements Serializable, Model{

    public static final Integer ID_CAUSAL_PUNTUALIDAD = 3;
    public static final Integer ID_CAUSAL_CAPACITACION = 4;
    public static final Integer ID_CAUSAL_EVALUACION = 1;
    
    public static final String DESC_CAUSAL_PUNTUALIDAD = "Puntualidad";
    public static final String DESC_CAUSAL_CAPACITACION = "Capacitación";
    public static final String DESC_CAUSAL_EVALUACION = "Evaluación";
    
    public static final String SUFIX_PU = "PU";
    public static final String SUFIX_CA = "CA";
    public static final String SUFIX_EP = "EP";

    
   private String urlOrigen;
   private String urlDestino;
   private Integer tdNmhCiclo;
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
   private String descRechazo;
   private List <PagoMeritoDTO> listaErrores;
   private Boolean resultadoCargaArchivo;
   private String nombreArchivoErrores;
   private String rutaArchivoErrores;
    private String nombreArchivoRechazos;
    private String rutaArchivoRechazos;
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
   private List<PagoMeritoDTO> resumenList = new ArrayList<PagoMeritoDTO>();
   private List<PagoMeritoDTO> resumenRList = new ArrayList<PagoMeritoDTO>();
   private List<PagoMeritoDTO> resumenAnosConsecutivosList = new ArrayList<PagoMeritoDTO>();
   private Boolean validaNotaMeritoManual = false;
    private String tdNmhCveUnidad;
    private String tdNmhTipoPlaza;
    private String desGenero;
    private Integer anosAcumulados;
    private String fuente;
    private String conceptoPago;
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
    private String fechaModifico;
    private String nmrRfc;
    private Integer nmrCicloInicial;
    private Integer nmrCicloFinal;
    private Integer nmrDiasPagados;
    private String nmrRemesaInterna;
    private String nmhTipoPlaza;
    private String nombre;
   
    
   
   
   


   
   public PagoMeritoDTO() {
       Date hoy = new Date();
       Calendar cal = Calendar.getInstance();
       cal.setTime(hoy);
       Integer anioActual = cal.get(Calendar.YEAR);
       ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> listaCiclos = new ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero>();
       listaCiclos.add(this.getInstanceEtiquetaClaveValorEntero(anioActual,anioActual.toString()));
       anioActual--;
       listaCiclos.add(this.getInstanceEtiquetaClaveValorEntero(anioActual,anioActual.toString()));
       this.setCicloValores(listaCiclos);
       ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> listaCausal = new ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero>();
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

    public ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> getCicloValores() {
        return cicloValores;
    }

    public void setCicloValores(ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> cicloValores) {
        this.cicloValores = cicloValores;
    }

    public EtiquetaClaveValor getInstanceEtiquetaClaveValor(String clave, String valor) 
    {
        EtiquetaClaveValor etiquetaClaveValor = new EtiquetaClaveValor(clave, valor);
        return etiquetaClaveValor;
    }
    
    public EtiquetaClaveValorEntero getInstanceEtiquetaClaveValorEntero(Integer clave, String valor) 
    {
        EtiquetaClaveValorEntero etiquetaClaveValorEntero = new EtiquetaClaveValorEntero(clave, valor);
        return etiquetaClaveValorEntero;
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

    public List<PagoMeritoDTO> getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(List<PagoMeritoDTO> listaErrores) {
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

    public ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> getCausalValores() {
        return causalValores;
    }

    public void setCausalValores(ArrayList<PagoMeritoDTO.EtiquetaClaveValorEntero> causalValores) {
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

    public List<PagoMeritoDTO> getResumenList() {
        return resumenList;
    }

    public void setResumenList(List<PagoMeritoDTO> resumenList) {
        this.resumenList = resumenList;
    }

    public List<PagoMeritoDTO> getResumenAnosConsecutivosList() {
        return resumenAnosConsecutivosList;
    }

    public void setResumenAnosConsecutivosList(List<PagoMeritoDTO> resumenAnosConsecutivosList) {
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

    public String getNmrRfc() {
        return nmrRfc;
    }

    public void setNmrRfc(String nmrRfc) {
        this.nmrRfc = nmrRfc;
    }

    public Integer getNmrCicloInicial() {
        return nmrCicloInicial;
    }

    public void setNmrCicloInicial(Integer nmrCicloInicial) {
        this.nmrCicloInicial = nmrCicloInicial;
    }

    public Integer getNmrCicloFinal() {
        return nmrCicloFinal;
    }

    public void setNmrCicloFinal(Integer nmrCicloFinal) {
        this.nmrCicloFinal = nmrCicloFinal;
    }

    public Integer getNmrDiasPagados() {
        return nmrDiasPagados;
    }

    public void setNmrDiasPagados(Integer nmrDiasPagados) {
        this.nmrDiasPagados = nmrDiasPagados;
    }

    public String getNmrRemesaInterna() {
        return nmrRemesaInterna;
    }

    public void setNmrRemesaInterna(String nmrRemesaInterna) {
        this.nmrRemesaInterna = nmrRemesaInterna;
    }

    public String getNmhTipoPlaza() {
        return nmhTipoPlaza;
    }

    public void setNmhTipoPlaza(String nmhTipoPlaza) {
        this.nmhTipoPlaza = nmhTipoPlaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResumenRList(List<PagoMeritoDTO> resumenRList) {
        this.resumenRList = resumenRList;
    }

    public List<PagoMeritoDTO> getResumenRList() {
        return resumenRList;
    }

    public void setNombreArchivoRechazos(String nombreArchivoRechazos) {
        this.nombreArchivoRechazos = nombreArchivoRechazos;
    }

    public String getNombreArchivoRechazos() {
        return nombreArchivoRechazos;
    }

    public void setRutaArchivoRechazos(String rutaArchivoRechazos) {
        this.rutaArchivoRechazos = rutaArchivoRechazos;
    }

    public String getRutaArchivoRechazos() {
        return rutaArchivoRechazos;
    }

    public void setDescRechazo(String descRechazo) {
        this.descRechazo = descRechazo;
    }

    public String getDescRechazo() {
        return descRechazo;
    }

    public void setFechaModifico(String fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public String getFechaModifico() {
        return fechaModifico;
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
      
}
