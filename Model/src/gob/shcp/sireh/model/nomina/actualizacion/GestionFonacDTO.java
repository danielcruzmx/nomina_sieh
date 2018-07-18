package gob.shcp.sireh.model.nomina.actualizacion;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.SelectIntegerStringDTO;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.incidencias.IncidenciaPersonalDTO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GestionFonacDTO implements java.io.Serializable, Model{

    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    private TnMovtoConceptoPagoDTO movtoConceptoPagoDTO;
    private java.lang.Boolean hasFonac;
    private java.lang.Boolean hasFonacPrevio;
    private java.lang.Boolean altaEneabled;
    private java.util.List<SelectIntegerStringDTO> listaQnasAdeudo = new ArrayList<SelectIntegerStringDTO>();
    
    private java.util.Date fecFinAdeudo;
    private java.util.Date fecIniAdeudo;
    private String mensaje;


    public GestionFonacDTO() {
    }

    public GestionFonacDTO(java.lang.String rfcEmpleado, 
                           java.lang.String nombreEmpleado, 
                           java.lang.String primerApellido, 
                           java.lang.String segundoApellido, 
                           java.lang.String idPuestoNom, 
                           java.lang.String idNivelPto, 
                           java.lang.Integer idPlaza, 
                           TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, 
                           java.lang.Boolean hasFonac, 
                           java.lang.Boolean hasFonacPrevio, 
                           java.lang.Boolean altaEneabled, 
                           java.util.List listaQnasAdeudo, 
                           java.util.Date fecFinAdeudo, 
                           java.util.Date fecIniAdeudo) {
        this.rfcEmpleado = rfcEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.idPuestoNom = idPuestoNom;
        this.idNivelPto = idNivelPto;
        this.idPlaza = idPlaza;
        this.movtoConceptoPagoDTO = movtoConceptoPagoDTO;
        this.hasFonac = hasFonac;
        this.hasFonacPrevio = hasFonacPrevio;
        this.altaEneabled = altaEneabled;
        this.listaQnasAdeudo = listaQnasAdeudo;
        this.fecFinAdeudo = fecFinAdeudo;
        this.fecIniAdeudo = fecIniAdeudo;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }


    public void setMovtoConceptoPagoDTO(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO) {
        this.movtoConceptoPagoDTO = movtoConceptoPagoDTO;
    }

    public TnMovtoConceptoPagoDTO getMovtoConceptoPagoDTO() {
        return movtoConceptoPagoDTO;
    }

    public void setHasFonac(Boolean hasFonac) {
        this.hasFonac = hasFonac;
    }

    public Boolean getHasFonac() {
        return hasFonac;
    }

    public void setHasFonacPrevio(Boolean hasFonacPrevio) {
        this.hasFonacPrevio = hasFonacPrevio;
    }

    public Boolean getHasFonacPrevio() {
        return hasFonacPrevio;
    }


    public void setAltaEneabled(Boolean altaEneabled) {
        this.altaEneabled = altaEneabled;
    }

    public Boolean getAltaEneabled() {
        return altaEneabled;
    }

    public void setFecFinAdeudo(Date fecFinAdeudo) {
        this.fecFinAdeudo = fecFinAdeudo;
    }

    public Date getFecFinAdeudo() {
        return fecFinAdeudo;
    }

    public void setFecIniAdeudo(Date fecIniAdeudo) {
        this.fecIniAdeudo = fecIniAdeudo;
    }

    public Date getFecIniAdeudo() {
        return fecIniAdeudo;
    }
    


    
//    @ValidationMethod(forProperty = "movtoConceptoPagoDTO.qnasAdeudo", errorCode = "error.select.unspecified")
//    public boolean validateQnasAdeudo() {
//        if (this.getMovtoConceptoPagoDTO() != null && this.getMovtoConceptoPagoDTO().getQnasAdeudo() != null && this.getMovtoConceptoPagoDTO().getQnasAdeudo().intValue() != 0) {
//            return true;
//        }
//        return false;
//    }

    @ValidationMethod(forProperty = "fecIniAdeudo", errorCode = "fecha.invalida.rango")
    public boolean validateFechasRango() {
        if (this.hasFonac != null && this.getMovtoConceptoPagoDTO() != null && this.getMovtoConceptoPagoDTO().getIdMovtoConceptoPago() != null && this.hasFonac) {
            // se valida que se trate de una actualización
            if (this.getFecIniAdeudo() == null && this.getFecFinAdeudo() == null){
                return true;
            }
            
            if ( (this.getFecIniAdeudo() == null && this.getFecFinAdeudo() != null ) || (this.getFecIniAdeudo() != null && this.getFecFinAdeudo() == null) ){
                return false;
            }

            if (!DateUtils.truncate(this.getFecFinAdeudo(), Calendar.DATE).after(DateUtils.truncate(this.getFecIniAdeudo(), Calendar.DATE))) {
                return false;
            }
        }
        return true;
    }


    public void setListaQnasAdeudo(List<SelectIntegerStringDTO> listaQnasAdeudo) {
        this.listaQnasAdeudo = listaQnasAdeudo;
    }

    public List<SelectIntegerStringDTO> getListaQnasAdeudo() {
        return listaQnasAdeudo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
