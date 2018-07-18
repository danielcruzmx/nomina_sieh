package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

import java.io.Serializable;

import java.util.Date;

public class CustomAsignarContratoDTO extends TnCapCursoDTO implements java.io.Serializable, Model {

    private java.lang.String descCursoPrincipal;
    private java.lang.String descSubprograma;
    private java.lang.String descEjeTematico;
    private java.lang.String descModalidad;
    private java.lang.String descFinalidad;
    private java.lang.String descProveedor;
    private java.lang.String descSede;
    private java.lang.String descAula;
    private java.lang.String descHorarioCurso;
    
    // Contrato
    private java.lang.Integer idContratoCurso;
    private java.lang.Integer idSituacionContrato;
    
    // Factura
    private java.lang.String facturaFolio;
    private java.lang.Double facturaMonto;
    private java.util.Date facturaFechaPago;
    private java.lang.Integer idSituacionFactura;
    
    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
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

    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }

    public String getDescSede() {
        return descSede;
    }

    public void setDescAula(String descAula) {
        this.descAula = descAula;
    }

    public String getDescAula() {
        return descAula;
    }

    public void setDescHorarioCurso(String descHorarioCurso) {
        this.descHorarioCurso = descHorarioCurso;
    }

    public String getDescHorarioCurso() {
        return descHorarioCurso;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }
    
    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }
    
    public Integer get_idContratoCurso() {
        return idContratoCurso;
    }

    public void setIdSituacionContrato(Integer idSituacionContrato) {
        this.idSituacionContrato = idSituacionContrato;
    }

    public Integer getIdSituacionContrato() {
        return idSituacionContrato;
    }

    public void setFacturaFolio(String facturaFolio) {
        this.facturaFolio = facturaFolio;
    }

    public String getFacturaFolio() {
        return facturaFolio;
    }

    public void setFacturaMonto(Double facturaMonto) {
        this.facturaMonto = facturaMonto;
    }

    public Double getFacturaMonto() {
        return facturaMonto;
    }

    public void setFacturaFechaPago(Date facturaFechaPago) {
        this.facturaFechaPago = facturaFechaPago;
    }

    public Date getFacturaFechaPago() {
        return facturaFechaPago;
    }

    public void setIdSituacionFactura(Integer idSituacionFactura) {
        this.idSituacionFactura = idSituacionFactura;
    }

    public Integer getIdSituacionFactura() {
        return idSituacionFactura;
    }
}
