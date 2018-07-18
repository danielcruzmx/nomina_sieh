package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

import java.util.Date;

public class CustomCursosFacturasDTO extends TnCapCursoDTO implements java.io.Serializable, Model {
    
    private java.lang.String descCoordinacion;
    private java.lang.String descCursoPrincipal;
    private java.lang.String descPeriodo;
    private java.lang.String descEjeTematico;
    private java.lang.String descSubprograma;
    private java.lang.String descModalidad;
    private java.lang.String descFinalidad;
    private java.lang.String descControlCurso;
    private java.lang.String contratoCursoNumero;
    
    // Factura
    private java.lang.String facturaFolio;
    private java.util.Date facturaFecha;
    private java.lang.Double facturaMonto;
    private java.lang.Integer idSituacionFactura;
    private java.lang.String descSituacionFactura;
    
    // Atenta Nota
    private java.lang.String facturaAtentaNotaNumero;
    private java.util.Date facturaAtentaNotaFecha;
    
    public void setDescCoordinacion(String descCoordinacion) {
        this.descCoordinacion = descCoordinacion;
    }

    public String getDescCoordinacion() {
        return descCoordinacion;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setDescControlCurso(String descControlCurso) {
        this.descControlCurso = descControlCurso;
    }

    public String getDescControlCurso() {
        return descControlCurso;
    }
    
    public void setFacturaFolio(String facturaFolio) {
        this.facturaFolio = facturaFolio;
    }

    public String getFacturaFolio() {
        return facturaFolio;
    }

    public void setFacturaFecha(Date facturaFecha) {
        this.facturaFecha = facturaFecha;
    }

    public Date getFacturaFecha() {
        return facturaFecha;
    }

    public void setFacturaMonto(Double facturaMonto) {
        this.facturaMonto = facturaMonto;
    }

    public Double getFacturaMonto() {
        return facturaMonto;
    }

    public void setIdSituacionFactura(Integer idSituacionFactura) {
        this.idSituacionFactura = idSituacionFactura;
    }

    public Integer getIdSituacionFactura() {
        return idSituacionFactura;
    }
    
    public void setDescSituacionFactura(String descSituacionFactura) {
        this.descSituacionFactura = descSituacionFactura;
    }

    public String getDescSituacionFactura() {
        return descSituacionFactura;
    }
    
    public void setContratoCursoNumero(String contratoCursoNumero) {
        this.contratoCursoNumero = contratoCursoNumero;
    }

    public String getContratoCursoNumero() {
        return contratoCursoNumero;
    }
    
    public void setDescPeriodo(String descPeriodo) {
        this.descPeriodo = descPeriodo;
    }

    public String getDescPeriodo() {
        return descPeriodo;
    }
    
    public void setFacturaAtentaNotaNumero(String facturaAtentaNotaNumero) {
        this.facturaAtentaNotaNumero = facturaAtentaNotaNumero;
    }

    public String getFacturaAtentaNotaNumero() {
        return facturaAtentaNotaNumero;
    }

    public void setFacturaAtentaNotaFecha(Date facturaAtentaNotaFecha) {
        this.facturaAtentaNotaFecha = facturaAtentaNotaFecha;
    }

    public Date getFacturaAtentaNotaFecha() {
        return facturaAtentaNotaFecha;
    }
}
