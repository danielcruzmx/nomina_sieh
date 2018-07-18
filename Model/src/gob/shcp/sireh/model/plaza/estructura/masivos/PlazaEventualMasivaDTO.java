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

public class PlazaEventualMasivaDTO implements java.io.Serializable, Model{
    @NotBlank(applyIf="buscar=true")
    @NotNull(applyIf="buscar=true")
    private String plazaFinContString;
    private String urlOrigen;
    private String urlDestino;
    @NotNull(applyIf="baja=true")
    private Date fechaBaja;
    private java.lang.String mepObserva;
    private String[] idPlaza;
    private String idUnidadNom;
    private String mensaje;
    
    private List<TdPlazaDTO> listaResultados = new ArrayList<TdPlazaDTO>();
    private String nombreArchivoResultados;
    
    private List<String> idUnidadNomFilter;
    private String plazaFinContYearFilter;
    private String plazaFinContStringHidden;
    
    private boolean buscar;
    private boolean baja;
    private boolean cancel;
    private boolean muestraRegistros;
    
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

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
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

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setIdUnidadNomFilter(List<String> idUnidadNomFilter) {
        this.idUnidadNomFilter = idUnidadNomFilter;
    }

    public List<String> getIdUnidadNomFilter() {
        return idUnidadNomFilter;
    }


    public void setPlazaFinContStringHidden(String plazaFinContStringHidden) {
        this.plazaFinContStringHidden = plazaFinContStringHidden;
    }

    public String getPlazaFinContStringHidden() {
        return plazaFinContStringHidden;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    public boolean isBaja() {
        return baja;
    }


    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setPlazaFinContYearFilter(String plazaFinContYearFilter) {
        this.plazaFinContYearFilter = plazaFinContYearFilter;
    }

    public String getPlazaFinContYearFilter() {
        return plazaFinContYearFilter;
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
    
    // La fechaBaja <= FechaFinCont
    @ValidationMethod(forProperty = "fechaBaja", errorCode = "fecha.invalida")
    private boolean validateFechaBaja() {

        if (this.isBaja()) {
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
            if (DateUtils.truncate(this.getFechaBaja(), Calendar.DATE).after(DateUtils.truncate(fechaFinCont, Calendar.DATE))) {
                return false;
            }
            
        }
        return true;
    }
    
    // La fechaBaja <= Fecha final quincena captura
    @ValidationMethod(forProperty = "fechaBaja", errorCode = "fecha.invalida.quincena")
    private boolean validateFechaBajaVsQuincena() {

        if (this.isBaja()) {
            if (DateUtils.truncate(this.getFechaBaja(), Calendar.DATE).after(DateUtils.truncate(this.getFinQuincenaCaptura(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    

    // La fechaBaja >= 90 dias hacia atras de la fecha actual (Retrocatividad)
    @ValidationMethod(forProperty = "fechaBaja", errorCode = "fecha.invalida.retroactividad")
    private boolean validateFechaBajaVsRetroactividad() {
            
        if (this.isBaja()) {
            Calendar fechaDiasRetroactivos = Calendar.getInstance();
            fechaDiasRetroactivos.setTime(new Date());
            fechaDiasRetroactivos.add(Calendar.DATE, this.getDiasRetroactividad() * -1);
            
            if (DateUtils.truncate(this.getFechaBaja(), Calendar.DATE).before(DateUtils.truncate(fechaDiasRetroactivos.getTime(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }
    
        // La fechaBaja debe estar en este año
        @ValidationMethod(forProperty = "fechaBaja", errorCode = "fecha.invalida.anio")
        private boolean validateFechaBajaVsAnioActual() {
                
            if (this.isBaja()) {
                Calendar calFechaBaja = Calendar.getInstance();
                calFechaBaja.setTime(this.getFechaBaja());
                int anioFechaBaja = (int)calFechaBaja.get(Calendar.YEAR);

                    if(this.getAnio() < anioFechaBaja){
                        return false;
                    }
            }
            return true;
        }

    // mepObserva maximo 

    @ValidationMethod(forProperty = "mepObserva", errorCode = "length")
    private boolean validateMepObserva() {
        if (this.isBaja()) {
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
