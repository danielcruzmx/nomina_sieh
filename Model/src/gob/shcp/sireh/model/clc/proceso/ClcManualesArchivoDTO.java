package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class ClcManualesArchivoDTO implements java.io.Serializable, Model {

    // Filtros
    private Integer ciclo;
    private Integer cxlc;
    private Integer numCxlc;
    private Integer secuencia;
    private Integer complemento;
    private String tipoNomina;
    private String plurianual;
    private Integer qnaAplicacion;
    private Integer partidaCaptura;
    
    // Procesar archivo
    private Boolean inicio = false;
    private FileContent file;
    private List listModel = new ArrayList();
    private String mensaje;
    private Boolean archivoValido;
    private String nombreArchivoErrores;
    private String rutaArchivoErrores;
    private String anio;
    private Boolean plantillaErronea;
    private Set<ClcManualesArchivoDTO> listaClcManualIncorrecta;
    private List<ClcManualesArchivoDTO> listaClcManualCorrecta;
    private Set<ClcManualesArchivoDTO> listaErrores;
    
    // Columnas archivo
    private String unidadArchivo;
    private String estadoArchivo;
    private String montoArchivo;
    private String partidaArchivo;
    private String tipoCptoArchivo;
    private String tipoMovtoArchivo;
    
    private boolean cancel;
    private boolean muestraRegistros;
    private boolean muestraErrores;
    
    private String montoTotal;
    
    private List<CxlcManual> clcToInsert;
    private String[] secuenciaGrupo = new String[500];
    
    @ValidationMethod(forProperty="file", errorCode="error.file.unspecified")
    public boolean validateFile(){ 
        return !inicio?true:this.getFile() != null && this.getFile().getSize()>0L && inicio;
    }
    
    public Integer getCiclo() {
        return ciclo;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCxlc() {
        return cxlc;
    }

    public void setCxlc(Integer cxlc) {
        this.cxlc = cxlc;
    }

    public Integer getNumCxlc() {
        return numCxlc;
    }

    public void setNumCxlc(Integer numCxlc) {
        this.numCxlc = numCxlc;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public Integer getQnaAplicacion() {
        return qnaAplicacion;
    }

    public void setQnaAplicacion(Integer qnaAplicacion) {
        this.qnaAplicacion = qnaAplicacion;
    }

    public Integer getPartidaCaptura() {
        return partidaCaptura;
    }

    public void setPartidaCaptura(Integer partidaCaptura) {
        this.partidaCaptura = partidaCaptura;
    }

    public Boolean getInicio() {
        return inicio;
    }

    public void setInicio(Boolean inicio) {
        this.inicio = inicio;
    }

    public FileContent getFile() {
        return file;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public List getListModel() {
        return listModel;
    }

    public void setListModel(List listModel) {
        this.listModel = listModel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getArchivoValido() {
        return archivoValido;
    }

    public void setArchivoValido(Boolean archivoValido) {
        this.archivoValido = archivoValido;
    }

    public String getNombreArchivoErrores() {
        return nombreArchivoErrores;
    }

    public void setNombreArchivoErrores(String nombreArchivoErrores) {
        this.nombreArchivoErrores = nombreArchivoErrores;
    }

    public String getRutaArchivoErrores() {
        return rutaArchivoErrores;
    }

    public void setRutaArchivoErrores(String rutaArchivoErrores) {
        this.rutaArchivoErrores = rutaArchivoErrores;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    public Boolean getPlantillaErronea() {
        return plantillaErronea;
    }

    public void setPlantillaErronea(Boolean plantillaErronea) {
        this.plantillaErronea = plantillaErronea;
    }

    public Set<ClcManualesArchivoDTO> getListaClcManualIncorrecta() {
        return listaClcManualIncorrecta;
    }

    public void setListaClcManualIncorrecta(Set<ClcManualesArchivoDTO> listaClcManualIncorrecta) {
        this.listaClcManualIncorrecta = listaClcManualIncorrecta;
    }

    public List<ClcManualesArchivoDTO> getListaClcManualCorrecta() {
        return listaClcManualCorrecta;
    }

    public void setListaClcManualCorrecta(List<ClcManualesArchivoDTO> listaClcManualCorrecta) {
        this.listaClcManualCorrecta = listaClcManualCorrecta;
    }

    public String getUnidadArchivo() {
        return unidadArchivo;
    }

    public void setUnidadArchivo(String unidadArchivo) {
        this.unidadArchivo = unidadArchivo;
    }

    public String getEstadoArchivo() {
        return estadoArchivo;
    }

    public void setEstadoArchivo(String estadoArchivo) {
        this.estadoArchivo = estadoArchivo;
    }

    public String getMontoArchivo() {
        return montoArchivo;
    }

    public void setMontoArchivo(String montoArchivo) {
        this.montoArchivo = montoArchivo;
    }

    public String getPartidaArchivo() {
        return partidaArchivo;
    }

    public void setPartidaArchivo(String partidaArchivo) {
        this.partidaArchivo = partidaArchivo;
    }

    public String getTipoCptoArchivo() {
        return tipoCptoArchivo;
    }

    public void setTipoCptoArchivo(String tipoCptoArchivo) {
        this.tipoCptoArchivo = tipoCptoArchivo;
    }

    public String getTipoMovtoArchivo() {
        return tipoMovtoArchivo;
    }

    public void setTipoMovtoArchivo(String tipoMovtoArchivo) {
        this.tipoMovtoArchivo = tipoMovtoArchivo;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public List<CxlcManual> getClcToInsert() {
        return clcToInsert;
    }

    public void setClcToInsert(List<CxlcManual> clcToInsert) {
        this.clcToInsert = clcToInsert;
    }
    
    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }
    
    public void setListaErrores(Set<ClcManualesArchivoDTO> listaErrores) {
        this.listaErrores = listaErrores;
    }

    public Set<ClcManualesArchivoDTO> getListaErrores() {
        return listaErrores;
    }
    
    public String[] getSecuenciaGrupo() {
        return secuenciaGrupo;
    }

    public void setSecuenciaGrupo(String[] secuenciaGrupo) {
        this.secuenciaGrupo = secuenciaGrupo;
    }


    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMontoTotal() {
        return montoTotal;
    }


    public void setPlurianual(String plurianual) {
        this.plurianual = plurianual;
    }

    public String getPlurianual() {
        return plurianual;
    }
}
