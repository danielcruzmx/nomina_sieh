package gob.shcp.sireh.model.clc.proceso;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;

import java.util.ArrayList;
import java.util.List;

public class ClcManualesCapturaDTO implements java.io.Serializable, Model {

    // Filtros
    private Integer ciclo;
    private Integer cxlc;
    private Integer numCxlc;
    private Integer secuencia;
    private String tipoNomina;
    private double importe;
    
    private Integer qnaCaptura;
    private Integer unidad;
    private double iva;
    private Integer partida;
    private String situacion;
    private String nota;
    
    private boolean cancel;
    private boolean muestraRegistros;
    
    private List<CxlcManual> clcToInsert;
    
    public Integer getCiclo() {
        return ciclo;
    }
    
    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }
    
    public String getTipoNomina() {
        return tipoNomina;
    }
    
    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }
    
    public Integer getCxlc() {
        return cxlc;
    }

    public void setCxlc(Integer cxlc) {
        this.cxlc = cxlc;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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
    
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }
    
    public void setNumCxlc(Integer numCxlc) {
        this.numCxlc = numCxlc;
    }

    public Integer getNumCxlc() {
        return numCxlc;
    }
    
    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }
}
