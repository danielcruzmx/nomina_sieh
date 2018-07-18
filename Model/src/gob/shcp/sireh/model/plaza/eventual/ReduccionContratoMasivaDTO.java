package gob.shcp.sireh.model.plaza.eventual;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ReduccionContratoMasivaDTO implements java.io.Serializable, Model{
    public ReduccionContratoMasivaDTO() {
    }
    
    private String urlOrigen;
    private String urlDestino;
    
    private java.lang.String plazaFinContString;
    private String idUnidadNom;    
    
    // Exportar a xls
    private List<TdPlazaDTO> listaResultados = new ArrayList<TdPlazaDTO>();
    private String nombreArchivoResultados;
    
    //Datos de reduccion
    private java.util.Date fechaTerminoVigencia;
    private java.lang.String mepObserva;

    // Filtros
    private List<String> idUnidadNomFilter;
    private String plazaFinContYearFilter;
    private String mepObservaFilter;
    private String idGrupoPagoFilter;
    
    // Grid
     private String[] idPlaza;
    
    // Navegacion
    private boolean buscar;
    private boolean prorroga;
    private boolean reduccion;
    private boolean cancel;
    private boolean muestraRegistros;
    
    private String PlazaFinContStringHidden;
    private Integer anio;
    private java.util.Date inicioQuincenaCaptura;
    
     
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
    
    
    // plazaFinContString not null
    @ValidationMethod(forProperty = "plazaFinContString", errorCode = "not.null")
    private boolean validatePlazaFinContStringNotNull() {
        if (this.isBuscar()) {
            if (this.getPlazaFinContString() == null || this.getPlazaFinContString().length() <= 0 ) {
                return false;
            }
        }            
        return true;
    }
    
    
    // fechaTerminoVigencia not null
    @ValidationMethod(forProperty = "fechaTerminoVigencia", errorCode = "not.null")
    private boolean validateFechaTerminoVigenciaNotNull() {
        if (this.isReduccion()) {
            if (this.getFechaTerminoVigencia() == null) {
                return false;
            }
        }            
        return true;
    }
    
    // fechaTerminoVigencia dentro del año actual
    @ValidationMethod(forProperty = "fechaTerminoVigencia", errorCode = "fecha.invalida.anio")
    private boolean validateFechaTerminoVigenciaAnio() {

        if (this.isReduccion()) {
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
    
    // fechaTerminoVigencia debe ser < Fecha de término de contrato
    @ValidationMethod(forProperty = "fechaTerminoVigencia", errorCode = "fecha.invalida.rango")
    private boolean validateFechaTerminoVigenciaVsTerminoContrato() {

        if (this.isReduccion()) {
            if (this.getFechaTerminoVigencia() == null) {
                return false;
            }

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if (this.getPlazaFinContStringHidden() == null || this.getPlazaFinContStringHidden().length() <= 0) {
                return false;
            }
            Date fechaFinCont = null;
            try {
                fechaFinCont = format.parse(this.getPlazaFinContStringHidden());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            // Si la fecha de fin de contrato es mayor a la fecha actual de termino de contrato, envia error
            if (!DateUtils.truncate(fechaFinCont, Calendar.DATE).after(DateUtils.truncate(this.getFechaTerminoVigencia(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }

    // fechaTerminoVigencia debe ser >= Fecha inicial de la quincena de captura
    @ValidationMethod(forProperty = "fechaTerminoVigencia", errorCode = "fecha.invalida.rango.quincena")
    private boolean validateFechaTerminoVigenciaVsQuincenaCaptura() {

        if (this.isReduccion()) {
            if (this.getFechaTerminoVigencia() == null) {
                return false;
            }

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            if (this.getPlazaFinContStringHidden() == null || this.getPlazaFinContStringHidden().length() <= 0) {
                return false;
            }
            Date fechaFinCont = null;
            try {
                fechaFinCont = format.parse(this.getPlazaFinContStringHidden());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            // Si la fecha de fin de contrato es menor a la fecha inicial del afecha de captura, envia error
            if (DateUtils.truncate(this.getFechaTerminoVigencia(), Calendar.DATE).before(DateUtils.truncate(this.getInicioQuincenaCaptura(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
    // mepObserva maximo 
    @ValidationMethod(forProperty = "mepObserva", errorCode = "length")
    private boolean validateMepObserva() {
        if (this.isReduccion()) {
            if (this.getMepObserva() != null && this.getMepObserva().length() > 255) {
                return false;
            }
        }
        return true;
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

    public void setProrroga(boolean prorroga) {
        this.prorroga = prorroga;
    }

    public boolean isProrroga() {
        return prorroga;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }



    public void setNombreArchivoResultados(String nombreArchivoResultados) {
        this.nombreArchivoResultados = nombreArchivoResultados;
    }

    public String getNombreArchivoResultados() {
        return nombreArchivoResultados;
    }

    public void setListaResultados(List<TdPlazaDTO> listaResultados) {
        this.listaResultados = listaResultados;
    }

    public List<TdPlazaDTO> getListaResultados() {
        return listaResultados;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setInicioQuincenaCaptura(Date inicioQuincenaCaptura) {
        this.inicioQuincenaCaptura = inicioQuincenaCaptura;
    }

    public Date getInicioQuincenaCaptura() {
        return inicioQuincenaCaptura;
    }

    public void setReduccion(boolean reduccion) {
        this.reduccion = reduccion;
    }

    public boolean isReduccion() {
        return reduccion;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }
}
