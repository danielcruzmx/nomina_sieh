package gob.shcp.sireh.model.nomina.incidencias;

import gob.shcp.fsn.model.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class GestionIncidenciasPersonalDTO implements java.io.Serializable, Model {

    private boolean delete;
    private boolean add;
    
    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Integer idRangoNom;
    private java.lang.String mcpMonto;
    private java.util.List<IncidenciaPersonalDTO> listaIncidenciasPersonal = new ArrayList<IncidenciaPersonalDTO>();
    private java.lang.String tipoIncidencia;
    private java.lang.String idConcepto;
    private Long[] idMovimientos;

    private java.util.Date fechaIncidenciaSeleccionada;
    private java.util.Date ultimaFechaIncidenciaSeleccionada;
    private Boolean mostrarCalcular = Boolean.FALSE;
    private Boolean mostrarAceptar = Boolean.FALSE;
    private Boolean mostrarEliminar = Boolean.FALSE;
    
    
    private java.lang.String tipoLicencia;
    
    private java.lang.String fechasSinSueldoRegexp;
    private java.lang.String fechasMedioSueldoRegexp;
    private java.lang.String fechasFaltaRegexp;
    private java.lang.String fechasDiasEconomicosRegexp;
    private java.lang.String fechasDisabled;
    
    
    private java.lang.String fechaLimiteInferior;
    private java.lang.String fechaLimiteSuperior;
    private java.lang.String startDate;
    
    private java.util.List<String> idConceptoFilter = new ArrayList<String>(); 
    private java.lang.String idTipoCptoFilter;

    

    public GestionIncidenciasPersonalDTO() {
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isDelete() {
        return delete;
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

    public void setIdMovimientos(Long[] idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public Long[] getIdMovimientos() {
        return idMovimientos;
    }

    public void setFechaIncidenciaSeleccionada(Date fechaIncidenciaSeleccionada) {
        this.fechaIncidenciaSeleccionada = fechaIncidenciaSeleccionada;
    }

    public Date getFechaIncidenciaSeleccionada() {
        return fechaIncidenciaSeleccionada;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

//    public void setIdMovimientosCapturadas(Long[] idMovimientosCapturadas) {
//        this.idMovimientosCapturadas = idMovimientosCapturadas;
//    }
//
//    public Long[] getIdMovimientosCapturadas() {
//        return idMovimientosCapturadas;
//    }

    public void setFechasSinSueldoRegexp(String fechasSinSueldoRegexp) {
        this.fechasSinSueldoRegexp = fechasSinSueldoRegexp;
    }

    public String getFechasSinSueldoRegexp() {
        return fechasSinSueldoRegexp;
    }

    public void setFechasMedioSueldoRegexp(String fechasMedioSueldoRegexp) {
        this.fechasMedioSueldoRegexp = fechasMedioSueldoRegexp;
    }

    public String getFechasMedioSueldoRegexp() {
        return fechasMedioSueldoRegexp;
    }

    public void setFechaLimiteInferior(String fechaLimiteInferior) {
        this.fechaLimiteInferior = fechaLimiteInferior;
    }

    public String getFechaLimiteInferior() {
        return fechaLimiteInferior;
    }

    public void setFechaLimiteSuperior(String fechaLimiteSuperior) {
        this.fechaLimiteSuperior = fechaLimiteSuperior;
    }

    public String getFechaLimiteSuperior() {
        return fechaLimiteSuperior;
    }


    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setIdRangoNom(Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    public Integer getIdRangoNom() {
        return idRangoNom;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }
    
    @ValidationMethod(forProperty="fechaIncidenciaSeleccionada", errorCode="not.blank")
    public boolean validateFechaIncidenciaSeleccionadaNula() {
        if (this.isAdd()) {
            return this.getFechaIncidenciaSeleccionada() != null;
        }
        return true;
    }

    @ValidationMethod(forProperty="fechaIncidenciaSeleccionada", errorCode="fecha.invalida")
    public boolean validateFechaIncidenciaSeleccionadaInvalida(){
        if (this.isAdd()) {
            List<IncidenciaPersonalDTO> listaInicidenciasPersonalDTO = this.getListaIncidenciasPersonal();

            if (listaInicidenciasPersonalDTO != null && !listaInicidenciasPersonalDTO.isEmpty()) {
                for (IncidenciaPersonalDTO incidenciaPersonalDTO: listaInicidenciasPersonalDTO) {
                    if (incidenciaPersonalDTO.getMcpFecIncidencia().equals(this.getFechaIncidenciaSeleccionada()))
                        return false;
                }
            }
        }
        return true;
    }
    
    @ValidationMethod(forProperty="idMovimientos", errorCode="error.delete.unselected")
    private boolean validateIdMovimientos() {
        if(this.isDelete()) {
            return (this.getIdMovimientos() != null && this.getIdMovimientos().length > 0);
        }
        return true;
    }
    
    @ValidationMethod(forProperty="idConcepto", errorCode="error.select.unspecified")
    public boolean validateIdConcepto(){
        if (this.isAdd() && this.getTipoIncidencia() != null && this.getTipoIncidencia().equals("F") ) {
            return this.idConcepto != null && this.idConcepto.length() > 0 && !this.idConcepto.equals("0");
        }
        return true;
    }

    public void setMostrarCalcular(Boolean mostrarCalcular) {
        this.mostrarCalcular = mostrarCalcular;
    }

    public Boolean getMostrarCalcular() {
        return mostrarCalcular;
    }

    public void setMostrarAceptar(Boolean mostrarAceptar) {
        this.mostrarAceptar = mostrarAceptar;
    }

    public Boolean getMostrarAceptar() {
        return mostrarAceptar;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public boolean isAdd() {
        return add;
    }

    public void setMostrarEliminar(Boolean mostrarEliminar) {
        this.mostrarEliminar = mostrarEliminar;
    }

    public Boolean getMostrarEliminar() {
        return mostrarEliminar;
    }

    public void setUltimaFechaIncidenciaSeleccionada(Date ultimaFechaIncidenciaSeleccionada) {
        this.ultimaFechaIncidenciaSeleccionada = ultimaFechaIncidenciaSeleccionada;
    }

    public Date getUltimaFechaIncidenciaSeleccionada() {
        return ultimaFechaIncidenciaSeleccionada;
    }



    public void setTipoIncidencia(String tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public String getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setFechasFaltaRegexp(String fechasFaltaRegexp) {
        this.fechasFaltaRegexp = fechasFaltaRegexp;
    }

    public String getFechasFaltaRegexp() {
        return fechasFaltaRegexp;
    }

    public void setIdConceptoFilter(List<String> idConceptoFilter) {
        this.idConceptoFilter = idConceptoFilter;
    }

    public List<String> getIdConceptoFilter() {
        return idConceptoFilter;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setListaIncidenciasPersonal(List<IncidenciaPersonalDTO> listaIncidenciasPersonal) {
        this.listaIncidenciasPersonal = listaIncidenciasPersonal;
    }

    public List<IncidenciaPersonalDTO> getListaIncidenciasPersonal() {
        return listaIncidenciasPersonal;
    }

    public void setFechasDiasEconomicosRegexp(String fechasDiasEconomicosRegexp) {
        this.fechasDiasEconomicosRegexp = fechasDiasEconomicosRegexp;
    }

    public String getFechasDiasEconomicosRegexp() {
        return fechasDiasEconomicosRegexp;
    }

    public void setFechasDisabled(String fechasDisabled) {
        this.fechasDisabled = fechasDisabled;
    }

    public String getFechasDisabled() {
        return fechasDisabled;
    }

    public void setMcpMonto(String mcpMonto) {
        this.mcpMonto = mcpMonto;
    }

    public String getMcpMonto() {
        return mcpMonto;
    }

    public void setIdTipoCptoFilter(String idTipoCptoFilter) {
        this.idTipoCptoFilter = idTipoCptoFilter;
    }

    public String getIdTipoCptoFilter() {
        return idTipoCptoFilter;
    }
}
