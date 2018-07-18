package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

public class PercepcionesDeduccionesDTO implements Model, java.io.Serializable {
    
    /***** Nodo Comprobantes - Complemento - Nomina - Percepciones - Percepcion *****/
    private String complNomPercTipoPercepcion;
    private String complNomPercClave;
    private String complNomPercConcepto;
    private String complNomPercImporteGravado;
    private String complNomPercImporteExento;
    
    /***** Nodo Comprobantes - Complemento - Nomina - Percepciones - Deduccion *****/
    private String complNomDeducTipoDeduccion;
    private String complNomDeducClave;
    private String complNomDeducConcepto;
    private String complNomDeducImporte;

    public void setComplNomPercTipoPercepcion(String complNomPercTipoPercepcion) {
        this.complNomPercTipoPercepcion = complNomPercTipoPercepcion;
    }

    public String getComplNomPercTipoPercepcion() {
        return complNomPercTipoPercepcion;
    }

    public void setComplNomPercClave(String complNomPercClave) {
        this.complNomPercClave = complNomPercClave;
    }

    public String getComplNomPercClave() {
        return complNomPercClave;
    }

    public void setComplNomPercConcepto(String complNomPercConcepto) {
        this.complNomPercConcepto = complNomPercConcepto;
    }

    public String getComplNomPercConcepto() {
        return complNomPercConcepto;
    }

    public void setComplNomPercImporteGravado(String complNomPercImporteGravado) {
        this.complNomPercImporteGravado = complNomPercImporteGravado;
    }

    public String getComplNomPercImporteGravado() {
        return complNomPercImporteGravado;
    }

    public void setComplNomPercImporteExento(String complNomPercImporteExento) {
        this.complNomPercImporteExento = complNomPercImporteExento;
    }

    public String getComplNomPercImporteExento() {
        return complNomPercImporteExento;
    }

    public void setComplNomDeducTipoDeduccion(String complNomDeducTipoDeduccion) {
        this.complNomDeducTipoDeduccion = complNomDeducTipoDeduccion;
    }

    public String getComplNomDeducTipoDeduccion() {
        return complNomDeducTipoDeduccion;
    }

    public void setComplNomDeducClave(String complNomDeducClave) {
        this.complNomDeducClave = complNomDeducClave;
    }

    public String getComplNomDeducClave() {
        return complNomDeducClave;
    }

    public void setComplNomDeducConcepto(String complNomDeducConcepto) {
        this.complNomDeducConcepto = complNomDeducConcepto;
    }

    public String getComplNomDeducConcepto() {
        return complNomDeducConcepto;
    }

    public void setComplNomDeducImporte(String complNomDeducImporte) {
        this.complNomDeducImporte = complNomDeducImporte;
    }

    public String getComplNomDeducImporte() {
        return complNomDeducImporte;
    }
}
