package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.util.List;
import java.util.Map;


import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CustomTdPensionDTO extends TdPensionDTO implements java.io.Serializable, Model{

    private java.util.Map<java.lang.String, java.lang.String> conceptosPorcentajePercepciones;
    private java.util.Map<java.lang.String, java.lang.String> conceptosPorcentajeDeducciones;
    private List<String> idsConceptosPorcentajePercepciones;
    private List<String> idsConceptosPorcentajeDeducciones;
    private String cuotaPorcentaje;

    // FILTROS
    private String plaza_rfc;


    public CustomTdPensionDTO(){
            super();
        }

    public void setConceptosPorcentajePercepciones(Map<String, String> conceptosPorcentajePercepciones) {
        this.conceptosPorcentajePercepciones = conceptosPorcentajePercepciones;
    }

    public Map<String, String> getConceptosPorcentajePercepciones() {
        return conceptosPorcentajePercepciones;
    }

    public void setConceptosPorcentajeDeducciones(Map<String, String> conceptosPorcentajeDeducciones) {
        this.conceptosPorcentajeDeducciones = conceptosPorcentajeDeducciones;
    }

    public Map<String, String> getConceptosPorcentajeDeducciones() {
        return conceptosPorcentajeDeducciones;
    }

    public void setCuotaPorcentaje(String cuotaPorcentaje) {
        this.cuotaPorcentaje = cuotaPorcentaje;
    }

    public String getCuotaPorcentaje() {
        return cuotaPorcentaje;
    }

    public void setIdsConceptosPorcentajePercepciones(List<String> idsConceptosPorcentajePercepciones) {
        this.idsConceptosPorcentajePercepciones = idsConceptosPorcentajePercepciones;
    }

    public List<String> getIdsConceptosPorcentajePercepciones() {
        return idsConceptosPorcentajePercepciones;
    }

    public void setIdsConceptosPorcentajeDeducciones(List<String> idsConceptosPorcentajeDeducciones) {
        this.idsConceptosPorcentajeDeducciones = idsConceptosPorcentajeDeducciones;
    }

    public List<String> getIdsConceptosPorcentajeDeducciones() {
        return idsConceptosPorcentajeDeducciones;
    }

    public void setPlaza_rfc(String plaza_rfc) {
        this.plaza_rfc = plaza_rfc;
    }

    public String getPlaza_rfc() {
        return plaza_rfc;
    }
    
    @ValidationMethod(forProperty="montoPension", errorCode="error.invalid.percentage")
    public boolean validatePorcentaje(){
        if(this.getCuotaPorcentaje().equals( "porcentaje" )){
            return this.getMontoPension() != null && this.getMontoPension() < 100;
        }
            return true;
    }  
    
    @ValidationMethod(forProperty="montoPension", errorCode="error.invalid.number")
    public boolean validateCuotaFija(){
        if(this.getCuotaPorcentaje().equals( "cuotaFija" )){
        return this.getMontoPension() != null && this.getMontoPension() > 0 && this.getMontoPension() <= 50000;
        }
        return true;
    }
    
    @ValidationMethod(forProperty="idZonaDist", errorCode="error.select.unspecified")
    public boolean validateIdZonaDist(){
        return this.getIdZonaDist() != 0;
    }

    // Debe seleccionar al menos algun concepto, ya sea deduccion o percecpcion
    @ValidationMethod(forProperty = "idsConceptosPorcentajePercepciones", errorCode = "not.empty")
    public boolean validateIdsConceptosPorcentaje() {
        return !( (this.getIdsConceptosPorcentajeDeducciones() == null || this.getIdsConceptosPorcentajeDeducciones().isEmpty()) && 
                 (this.getIdsConceptosPorcentajePercepciones() == null || this.getIdsConceptosPorcentajePercepciones().isEmpty()) );
    }


}
