package gob.shcp.sireh.model.plaza.estructura.masivos;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;



import java.util.ArrayList;
import java.util.Date;

import java.util.List;



import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CreacionPlazaMasivaDTO  extends TdPlazaDTO implements java.io.Serializable, Model{
    private FileContent file;
    private String urlOrigen;
    private String urlDestino;
    private List listModel = new ArrayList();
    private boolean procesoValidacionExitoso;
    private String mensaje;
    private String anio;
    private Boolean archivoValido;
    private List<CreacionPlazaMasivaDTO> listaErrores;
    private String nombreArchivoErrores;
    private String rutaArchivoErrores;
    private Integer plazasProcesadas;
    static String idOficioAfecta;
    private java.lang.String mepObserva;
    private String adecuacionCicloAnterior;
    private String adecuacionCicloActual;
    private String unidad;
    private String nivel;
    private Integer consecutivo;
    private Integer zona;
    private String codigo;
    private Integer plaza;
    private Integer casos;
    private String tipo;
    private String estatus;
    private String cancelada;
    private String tipoMovimiento;
    private String regularizable;
    private String tipoPersonal;
    private Integer entidadFederativa;
    private Date inicioVigencia;
    private Date finVigencia;
    private String tipoServidor;
    private java.lang.Double importe;
    private Boolean isRegularizable;
    private Boolean inicio=false;
    private Boolean plantillaErronea;
    private String tipoProceso;
    private List<CreacionPlazaMasivaDTO> listaPlazaEstructuraIncorrecta;
    private List<CreacionPlazaMasivaDTO> listaPlazaEstructuraCorrecta;
  
    
    public CreacionPlazaMasivaDTO() {
        listaErrores = new ArrayList<CreacionPlazaMasivaDTO>();
    }
    

    @ValidationMethod(forProperty="file", errorCode="error.file.unspecified")
    public boolean validateFile(){ 
        return  !inicio?true:this.getFile() != null && this.getFile().getSize()>0L && inicio;
    }
    
    public FileContent getFile() {
        return file;
    }

    public void setFile(FileContent file) {
        this.file = file;
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

    public List getListModel() {
        return listModel;
    }

    public void setListModel(List listModel) {
        this.listModel = listModel;
    }

    public boolean isProcesoValidacionExitoso() {
        return procesoValidacionExitoso;
    }

    public void setProcesoValidacionExitoso(boolean procesoValidacionExitoso) {
        this.procesoValidacionExitoso = procesoValidacionExitoso;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Boolean getArchivoValido() {
        return archivoValido;
    }

    public void setArchivoValido(Boolean archivoValido) {
        this.archivoValido = archivoValido;
    }

    public String getNombreArchivoErrores() {
        return nombreArchivoErrores;
    }

    public void setNombreArchivoErrores(String nombreArchivoErrores) {
        this.nombreArchivoErrores = nombreArchivoErrores;
    }

    public List<CreacionPlazaMasivaDTO> getListaErrores() {
        return listaErrores;
    }

    public void setListaErrores(List<CreacionPlazaMasivaDTO> listaErrores) {
        this.listaErrores = listaErrores;
    }

    public String getRutaArchivoErrores() {
        return rutaArchivoErrores;
    }

    public void setRutaArchivoErrores(String rutaArchivoErrores) {
        this.rutaArchivoErrores = rutaArchivoErrores;
    }

    public Integer getPlazasProcesadas() {
        return plazasProcesadas;
    }

    public void setPlazasProcesadas(Integer plazasProcesadas) {
        this.plazasProcesadas = plazasProcesadas;
    }

    public static String getIdOficioAfecta() {
        return idOficioAfecta;
    }

    public static void setIdOficioAfecta(String idOficioAfecta) {
        CreacionPlazaMasivaDTO.idOficioAfecta = idOficioAfecta;
    }

    public String getAdecuacionCicloAnterior() {
        return adecuacionCicloAnterior;
    }

    public void setAdecuacionCicloAnterior(String adecuacionCicloAnterior) {
        this.adecuacionCicloAnterior = adecuacionCicloAnterior;
    }

    public String getAdecuacionCicloActual() {
        return adecuacionCicloActual;
    }

    public void setAdecuacionCicloActual(String adecuacionCicloActual) {
        this.adecuacionCicloActual = adecuacionCicloActual;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getPlaza() {
        return plaza;
    }

    public void setPlaza(Integer plaza) {
        this.plaza = plaza;
    }

    public Integer getCasos() {
        return casos;
    }

    public void setCasos(Integer casos) {
        this.casos = casos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCancelada() {
        return cancelada;
    }

    public void setCancelada(String cancelada) {
        this.cancelada = cancelada;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getRegularizable() {
        return regularizable;
    }

    public void setRegularizable(String regularizable) {
        this.regularizable = regularizable;
        if(this.regularizable!=null && this.regularizable.equals("REGULARIZABLE")){
            setIsRegularizable(true);
        }
        else{
            setIsRegularizable(false);
        }
    }

    public String getTipoPersonal() {
        return tipoPersonal;
    }

    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }

    public Integer getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setEntidadFederativa(Integer entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Boolean getIsRegularizable() {
        return isRegularizable;
    }

    public void setIsRegularizable(Boolean isRegularizable) {
        this.isRegularizable = isRegularizable;
    }

    public Boolean getInicio() {
        return inicio;
    }

    public void setInicio(Boolean inicio) {
        this.inicio = inicio;
    }

    public Boolean getPlantillaErronea() {
        return plantillaErronea;
    }

    public void setPlantillaErronea(Boolean plantillaErronea) {
        this.plantillaErronea = plantillaErronea;
    }

    public void setTipoProceso(String tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public String getTipoProceso() {
        return tipoProceso;
    }

    public List<CreacionPlazaMasivaDTO> getListaPlazaEstructuraIncorrecta() {
        return listaPlazaEstructuraIncorrecta;
    }

    public void setListaPlazaEstructuraIncorrecta(List<CreacionPlazaMasivaDTO> listaPlazaEstructuraIncorrecta) {
        this.listaPlazaEstructuraIncorrecta = listaPlazaEstructuraIncorrecta;
    }

    public List<CreacionPlazaMasivaDTO> getListaPlazaEstructuraCorrecta() {
        return listaPlazaEstructuraCorrecta;
    }

    public void setListaPlazaEstructuraCorrecta(List<CreacionPlazaMasivaDTO> listaPlazaEstructuraCorrecta) {
        this.listaPlazaEstructuraCorrecta = listaPlazaEstructuraCorrecta;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setFinVigencia(Date finVigencia) {
        this.finVigencia = finVigencia;
    }

    public Date getFinVigencia() {
        return finVigencia;
    }

    public void setTipoServidor(String tipoServidor) {
        this.tipoServidor = tipoServidor;
    }

    public String getTipoServidor() {
        return tipoServidor;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getImporte() {
        return importe;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
}
