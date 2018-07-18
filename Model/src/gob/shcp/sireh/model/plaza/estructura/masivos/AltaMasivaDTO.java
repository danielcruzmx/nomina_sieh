package gob.shcp.sireh.model.plaza.estructura.masivos;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;


public class AltaMasivaDTO implements java.io.Serializable, Model{
    
    private String urlOrigen;
    private String urlDestino;
    
    //Búsqueda
    @NotBlank(applyIf="buscar=true")
    @NotNull(applyIf="buscar=true")
    private String usuario;
    private Integer qnaCaptura;
    @NotBlank(applyIf="buscar=true")
    @NotNull(applyIf="buscar=true")
    private java.lang.String plazaFinContString;
    private String idUnidadNom;    
    
    //Datos de alta
     @NotNull(applyIf="alta=true")
    private java.util.Date fechaInicioVigencia;
    @NotNull(applyIf="alta=true")
    private java.util.Date fechaTerminoVigencia;
    private java.lang.String mepObserva;

    // Datos de archivo excel
    private List<TdPlazaDTO> listaResultados = new ArrayList<TdPlazaDTO>();
    private String nombreArchivoResultados;
    
    // Filtros
    private List<String> idUnidadNomFilter;
    private String plazaFinContYearFilter;
    private String mepObservaFilter;
    private String idGrupoPagoFilter;
    
    // Grid
     private String[] idPlaza;
    
    // Navegacion
    private boolean buscar;
    private boolean alta;
    private boolean cancel;
    private boolean muestraRegistros;
    
    private String PlazaFinContStringHidden;
    
    // Quincena de captura
     private Date inicioQuincenaCaptura;
     private Date finQuincenaCaptura;
     private Integer diasRetroactividad;
     
     private Integer anio;

    
     
    public void setPlazaFinContString(String plazaFinContString) {
        this.plazaFinContString = plazaFinContString;
    }
     
     public String getPlazaFinContString() {
         return this.plazaFinContString;
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



    public String[] getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(String[] idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }



    public void setIdUnidadNomFilter(List<String> idUnidadNomFilter) {
        this.idUnidadNomFilter = idUnidadNomFilter;
    }

    public List<String> getIdUnidadNomFilter() {
        return idUnidadNomFilter;
    }




    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }




    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }


    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }





    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaTerminoVigencia(Date fechaTerminoVigencia) {
        this.fechaTerminoVigencia = fechaTerminoVigencia;
    }

    public Date getFechaTerminoVigencia() {
        return fechaTerminoVigencia;
    }

    public void setPlazaFinContStringHidden(String plazaFinContStringHidden) {
        this.PlazaFinContStringHidden = plazaFinContStringHidden;
    }

    public String getPlazaFinContStringHidden() {
        return PlazaFinContStringHidden;
    }
    
    public void setPlazaFinContYearFilter(String plazaFinContYearFilter) {
        this.plazaFinContYearFilter = plazaFinContYearFilter;
    }

    public String getPlazaFinContYearFilter() {
        return plazaFinContYearFilter;
    }

    public void setMepObservaFilter(String mepObservaFilter) {
        this.mepObservaFilter = mepObservaFilter;
    }

    public String getMepObservaFilter() {
        return mepObservaFilter;
    }

    public void setIdGrupoPagoFilter(String idGrupoPagoFilter) {
        this.idGrupoPagoFilter = idGrupoPagoFilter;
    }

    public String getIdGrupoPagoFilter() {
        return idGrupoPagoFilter;
    }

    public void setInicioQuincenaCaptura(Date inicioQuincenaCaptura) {
        this.inicioQuincenaCaptura = inicioQuincenaCaptura;
    }

    public Date getInicioQuincenaCaptura() {
        return inicioQuincenaCaptura;
    }

    public void setFinQuincenaCaptura(Date finQuincenaCaptura) {
        this.finQuincenaCaptura = finQuincenaCaptura;
    }

    public Date getFinQuincenaCaptura() {
        return finQuincenaCaptura;
    }

    public void setDiasRetroactividad(Integer diasRetroactividad) {
        this.diasRetroactividad = diasRetroactividad;
    }

    public Integer getDiasRetroactividad() {
        return diasRetroactividad;
    }
    
    // La qnaCaptura no debe ser null
    @ValidationMethod(forProperty = "qnaCaptura", errorCode = "not.null")
    private boolean validateFechaBaja() {

        if (this.isBuscar()) {
            if(this.getQnaCaptura() == null || this.getQnaCaptura().toString().length() == 0  ){
                return false;
            }
        }
        return true;
    }
    
    // La fechaFinVigencia > FechaInicioVigencia
    @ValidationMethod(forProperty = "fechaInicioVigencia", errorCode = "fecha.invalida")
    private boolean validateFechaInicioVigencia() {

        if (this.isAlta()) {

            if (this.getFechaInicioVigencia() == null || 
                this.getFechaTerminoVigencia() == null) {
                return false;
            }

            if (!DateUtils.truncate(this.getFechaTerminoVigencia(), Calendar.DATE).after(DateUtils.truncate(this.getFechaInicioVigencia(), Calendar.DATE))) {
                return false;
            }

        }
        return true;
    }
    
    // FechaInicioVigencia dentro del año actual
    @ValidationMethod(forProperty = "fechaInicioVigencia", errorCode = "fecha.invalida.anio")
    private boolean validateFechaInicioVigenciaAnio() {

        if (this.isAlta()) {
            if (this.getFechaInicioVigencia() == null ) {
                return false;
            }
            Calendar calFechaInicio = Calendar.getInstance();
            calFechaInicio.setTime(this.getFechaInicioVigencia());
            int anioFechaInicio = (int)calFechaInicio.get(Calendar.YEAR);

            if(this.getAnio() != anioFechaInicio){
                return false;
            }
        }
        return true;
    }
    
    // fechaTerminoVigencia dentro del año actual
    @ValidationMethod(forProperty = "fechaTerminoVigencia", errorCode = "fecha.invalida.anio")
    private boolean validateFechaTerminoVigenciaAnio() {

        if (this.isAlta()) {
            if (this.getFechaTerminoVigencia() == null ) {
                return false;
            }


            Calendar calFechaTermino = Calendar.getInstance();

            calFechaTermino.setTime(this.getFechaTerminoVigencia());

            int anioFechaTermino = (int)calFechaTermino.get(Calendar.YEAR);

            if(this.getAnio() != anioFechaTermino){
                return false;
            }
        }
        return true;
    }

    // La FechaInicioVigencia <= Fecha final quincena captura
    @ValidationMethod(forProperty = "fechaInicioVigencia", errorCode = "fecha.invalida.quincena")
    private boolean validateFechaInicioVigenciaVsQuincena() {

        if (this.isAlta()) {
            if (DateUtils.truncate(this.getFechaInicioVigencia(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    

    // La fechaInicioVigencia >= 90 dias hacia atras de la fecha actual (Retrocatividad)
    @ValidationMethod(forProperty = "fechaInicioVigencia", errorCode = "fecha.invalida.retroactividad")
    private boolean validateFechaInicioVigenciaVsRetroactividad() {
            
        if (this.isAlta()) {
            Calendar fechaDiasRetroactivos = Calendar.getInstance();
            fechaDiasRetroactivos.setTime(new Date());
            fechaDiasRetroactivos.add(Calendar.DATE, this.getDiasRetroactividad() * -1);
            
            if (DateUtils.truncate(this.getFechaInicioVigencia(), Calendar.DATE).before(DateUtils.truncate(fechaDiasRetroactivos.getTime(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
    // La fecha de alta debe ser > fecha de baja anterior
     @ValidationMethod(forProperty = "fechaInicioVigencia", errorCode = "fecha.invalida.baja.anterior")
     private boolean validateFechaInicioVigenciaVsFechaBajaAnterior() {
         
         if (this.isAlta()) {
             SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
             if(this.getPlazaFinContStringHidden() == null || this.getPlazaFinContStringHidden().length() <= 0 ){
                 return false;
             }
             Date fechaFinCont = null;
             try {
                 fechaFinCont = format.parse(this.getPlazaFinContStringHidden());
             } catch (ParseException e) {
                 // TODO
             }
             
             if (!DateUtils.truncate(this.getFechaInicioVigencia(), Calendar.DATE).after(DateUtils.truncate(fechaFinCont, Calendar.DATE))) {
                 return false;
             }
         }
         return true;
     }
     
    // mepObserva maximo 
    @ValidationMethod(forProperty = "mepObserva", errorCode = "length")
    private boolean validateMepObserva() {
        if (this.isAlta()) {
            if (this.getMepObserva() != null && this.getMepObserva().length() > 255) {
                return false;
            }
        }
        return true;
    }


    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setListaResultados(List<TdPlazaDTO> listaResultados) {
        this.listaResultados = listaResultados;
    }

    public List<TdPlazaDTO> getListaResultados() {
        return listaResultados;
    }

    public void setNombreArchivoResultados(String nombreArchivoResultados) {
        this.nombreArchivoResultados = nombreArchivoResultados;
    }

    public String getNombreArchivoResultados() {
        return nombreArchivoResultados;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
}
