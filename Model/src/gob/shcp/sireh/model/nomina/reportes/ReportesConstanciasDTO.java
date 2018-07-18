package gob.shcp.sireh.model.nomina.reportes;

import gob.shcp.fsn.model.Model;

public class ReportesConstanciasDTO implements java.io.Serializable, Model {
    
    /* F I L T R O S */
    private Integer ciclo;
    private String  unidad;
    private String  rfcEmpleado;
    private String  rfcEmpleado2;
    private String  tipoReporte;
    private String  origen;
    private String firmado;
    private String qnaIni;
    private String qnaFin;
    private String rfcResponsable;
    private String cargoResponsable;
    private String nombreResponsable;
    private String noOficio;
    private String beanName;
    private Long importe;
    
    private String nombreEmpleado;
    private String nivel;
    private String idUnidadPto;
    
    /* C O N T R O L */
    private boolean cancel;
    private boolean muestraReporte;
    private boolean muestraRegistros;
    
    private String[] seleccionConsecNomina;
    
    
    public ReportesConstanciasDTO() { }
    
    public ReportesConstanciasDTO(String unidad, Integer ciclo, String  rfcEmpleado, String  tipoReporte, String origen, String firmado, String rfcResponsable, String cargoResponsable, String nombreResponsable, String rfcEmpleado2, String noOficio) {
        this.ciclo = ciclo;
        this.unidad = unidad;
        this.rfcEmpleado = rfcEmpleado;
        this.tipoReporte = tipoReporte;
        this.origen = origen;
        this.firmado = firmado;
        this.rfcResponsable = rfcResponsable;
        this.cargoResponsable = cargoResponsable;
        this.nombreResponsable = nombreResponsable;
        this.rfcEmpleado2 = rfcEmpleado2;
        this.noOficio = noOficio;
        
    }


    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
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

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setFirmado(String firmado) {
        this.firmado = firmado;
    }

    public String getFirmado() {
        return firmado;
    }

    public void setQnaIni(String qnaIni) {
        this.qnaIni = qnaIni;
    }

    public String getQnaIni() {
        return qnaIni;
    }

    public void setQnaFin(String qnaFin) {
        this.qnaFin = qnaFin;
    }

    public String getQnaFin() {
        return qnaFin;
    }

    public void setRfcResponsable(String rfcResponsable) {
        this.rfcResponsable = rfcResponsable;
    }

    public String getRfcResponsable() {
        return rfcResponsable;
    }

    public void setCargoResponsable(String cargoResponsable) {
        this.cargoResponsable = cargoResponsable;
    }

    public String getCargoResponsable() {
        return cargoResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setRfcEmpleado2(String rfcEmpleado2) {
        this.rfcEmpleado2 = rfcEmpleado2;
    }

    public String getRfcEmpleado2() {
        return rfcEmpleado2;
    }

    public void setNoOficio(String noOficio) {
        this.noOficio = noOficio;
    }

    public String getNoOficio() {
        return noOficio;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setSeleccionConsecNomina(String[] seleccionConsecNomina) {
        this.seleccionConsecNomina = seleccionConsecNomina;
    }

    public String[] getSeleccionConsecNomina() {
        return seleccionConsecNomina;
    }

    public void setImporte(Long importe) {
        this.importe = importe;
    }

    public Long getImporte() {
        return importe;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setIdUnidadPto(String idUnidadPto) {
        this.idUnidadPto = idUnidadPto;
    }

    public String getIdUnidadPto() {
        return idUnidadPto;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }
}
