package gob.shcp.sireh.model.clc.reportes;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ReportesCxlcDTO {

    //private SimpleDateFormat dateFormat = new SimpleDateFormat( "dd 'de' MMMM 'de' yyyy", new Locale("es","MX") );
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy", new Locale("es","MX") );

    // Filtros
    private java.lang.String uniCiclo;    
    private java.lang.String qnaCaptura;
    private java.lang.String complemento;
    private java.lang.String tipoNomina;
    private java.lang.String clc;

    private boolean cancel;
    private boolean muestraReporte;

    // Validaciones
    private java.lang.Boolean uniCicloRequired;
    private java.lang.Boolean qnaCapturaRequired;
    private java.lang.Boolean complementoRequired;
    private java.lang.Boolean tipoNominaRequired;
    private java.lang.Boolean clcRequired;

    // Datos adicionales
    private String parametros;
    private String suficienciaPresupuestaria;
    private String documento;
    private String mes;
    private Date fechaDepositoBanco;
    private Date fechaPagoPersonal;
    private Date fechaPagoISSSTE;
    private String pagoUnidad;
    private String periodo;
    private String correoElectronico;
    private String nota;
    private String responsable;
    private String puestoCargo;
    private String bimestre;
    
    // Prestaciones trimestrales
    private Integer trimestre;
    private ArrayList<EtiquetaClaveValorEntero> trimestreValores;
    
    public void setUniCiclo(String uniCiclo) {
        this.uniCiclo = uniCiclo;
    }

    public String getUniCiclo() {
        return uniCiclo;
    }

    public void setQnaCaptura(String qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public String getQnaCaptura() {
        return qnaCaptura;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setClc(String clc) {
        this.clc = clc;
    }

    public String getClc() {
        return clc;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setUniCicloRequired(Boolean uniCicloRequired) {
        this.uniCicloRequired = uniCicloRequired;
    }

    public Boolean getUniCicloRequired() {
        return uniCicloRequired;
    }

    public void setQnaCapturaRequired(Boolean qnaCapturaRequired) {
        this.qnaCapturaRequired = qnaCapturaRequired;
    }

    public Boolean getQnaCapturaRequired() {
        return qnaCapturaRequired;
    }

    public void setComplementoRequired(Boolean complementoRequired) {
        this.complementoRequired = complementoRequired;
    }

    public Boolean getComplementoRequired() {
        return complementoRequired;
    }

    public void setTipoNominaRequired(Boolean tipoNominaRequired) {
        this.tipoNominaRequired = tipoNominaRequired;
    }

    public Boolean getTipoNominaRequired() {
        return tipoNominaRequired;
    }

    public void setClcRequired(Boolean clcRequired) {
        this.clcRequired = clcRequired;
    }

    public Boolean getClcRequired() {
        return clcRequired;
    }

    public void setSuficienciaPresupuestaria(String suficienciaPresupuestaria) {
        this.suficienciaPresupuestaria = suficienciaPresupuestaria;
    }

    public String getSuficienciaPresupuestaria() {
        return suficienciaPresupuestaria;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setFechaDepositoBanco(Date fechaDepositoBanco) {
        this.fechaDepositoBanco = fechaDepositoBanco;
    }

    public Date getFechaDepositoBanco() {
        return fechaDepositoBanco;
    }

    public void setFechaPagoPersonal(Date fechaPagoPersonal) {
        this.fechaPagoPersonal = fechaPagoPersonal;
    }

    public Date getFechaPagoPersonal() {
        return fechaPagoPersonal;
    }

    public void setPagoUnidad(String pagoUnidad) {
        this.pagoUnidad = pagoUnidad;
    }

    public String getPagoUnidad() {
        return pagoUnidad;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public String getFechaDepositoBancoCad() {
        return fechaDepositoBanco==null? "": dateFormat.format(fechaDepositoBanco);
    }

    public String getFechaPagoPersonalCad() {
        return fechaDepositoBanco==null? "": dateFormat.format(fechaPagoPersonal);
    }

    public String getFechaPagoISSSTECad() {
        return fechaPagoISSSTE==null? "": dateFormat.format(fechaPagoISSSTE);
    }

    public void setFechaPagoISSSTE(Date fechaPagoISSSTE) {
        this.fechaPagoISSSTE = fechaPagoISSSTE;
    }

    public Date getFechaPagoISSSTE() {
        return fechaPagoISSSTE;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setPuestoCargo(String puestoCargo) {
        this.puestoCargo = puestoCargo;
    }

    public String getPuestoCargo() {
        return puestoCargo;
    }
    
    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getParametros() {
        return parametros;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setTrimestre(Integer trimestre) {
        this.trimestre = trimestre;
    }

    public Integer getTrimestre() {
        return trimestre;
    }

    public void setTrimestreValores(ArrayList<EtiquetaClaveValorEntero> trimestreValores) {
        this.trimestreValores = trimestreValores;
    }

    public ArrayList<EtiquetaClaveValorEntero> getTrimestreValores() {
        return trimestreValores;
    }
}
