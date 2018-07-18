package gob.shcp.sireh.model.configuracion.mantenimiento.plantillas;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.SelectStringDTO;

//import java.util.Date;
import java.util.List;
//import java.util.Map;

public class DatosPlantillaDTO implements java.io.Serializable, Model { 
    private String nomReg;
    private AtributosPlantillaDTO rfc;
    private AtributosPlantillaDTO curp;
    private AtributosPlantillaDTO importe;
    private AtributosPlantillaDTO tipoMovto;
    private AtributosPlantillaDTO referencia;
    private AtributosPlantillaDTO concepto;
    private AtributosPlantillaDTO qna;
    private AtributosPlantillaDTO qnaFin;
    private AtributosPlantillaDTO numQuincenas;
    private AtributosPlantillaDTO porcentaje;
    private AtributosPlantillaDTO fechaIncidencia;
    
    private List<SelectStringDTO> listaTipos;
    private List listaPlantillas;
    private List<RecordDTO> listaRecord;
    private String nomPlantilla;
    private boolean activo;
    
    public DatosPlantillaDTO(){
        rfc              = new AtributosPlantillaDTO();
        curp             = new AtributosPlantillaDTO();
        importe          = new AtributosPlantillaDTO();
        tipoMovto        = new AtributosPlantillaDTO();
        referencia       = new AtributosPlantillaDTO();
        concepto         = new AtributosPlantillaDTO();
        qna              = new AtributosPlantillaDTO();
        qnaFin           = new AtributosPlantillaDTO();
        numQuincenas     = new AtributosPlantillaDTO();
        porcentaje       = new AtributosPlantillaDTO();
        fechaIncidencia = new AtributosPlantillaDTO();
    }



    public void setNomReg(String nomReg) {
        this.nomReg = nomReg;
    }

    public String getNomReg() {
        return nomReg;
    }

    public void setRfc(AtributosPlantillaDTO rfc) {
        this.rfc = rfc;
    }

    public AtributosPlantillaDTO getRfc() {
        return rfc;
    }

    public void setCurp(AtributosPlantillaDTO curp) {
        this.curp = curp;
    }

    public AtributosPlantillaDTO getCurp() {
        return curp;
    }

    public void setImporte(AtributosPlantillaDTO importe) {
        this.importe = importe;
    }

    public AtributosPlantillaDTO getImporte() {
        return importe;
    }

    public void setTipoMovto(AtributosPlantillaDTO tipoMovto) {
        this.tipoMovto = tipoMovto;
    }

    public AtributosPlantillaDTO getTipoMovto() {
        return tipoMovto;
    }

    public void setReferencia(AtributosPlantillaDTO referencia) {
        this.referencia = referencia;
    }

    public AtributosPlantillaDTO getReferencia() {
        return referencia;
    }

    public void setConcepto(AtributosPlantillaDTO concepto) {
        this.concepto = concepto;
    }

    public AtributosPlantillaDTO getConcepto() {
        return concepto;
    }

    public void setQna(AtributosPlantillaDTO qna) {
        this.qna = qna;
    }

    public AtributosPlantillaDTO getQna() {
        return qna;
    }

    public void setQnaFin(AtributosPlantillaDTO qnaFin) {
        this.qnaFin = qnaFin;
    }

    public AtributosPlantillaDTO getQnaFin() {
        return qnaFin;
    }




    public void setPorcentaje(AtributosPlantillaDTO porcentaje) {
        this.porcentaje = porcentaje;
    }

    public AtributosPlantillaDTO getPorcentaje() {
        return porcentaje;
    }

    public void setListaTipos(List<SelectStringDTO> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public List<SelectStringDTO> getListaTipos() {
        return listaTipos;
    }

    public void setListaPlantillas(List listaPlantillas) {
        this.listaPlantillas = listaPlantillas;
    }

    public List getListaPlantillas() {
        return listaPlantillas;
    }

    public void setNomPlantilla(String nomPlantilla) {
        this.nomPlantilla = nomPlantilla;
    }

    public String getNomPlantilla() {
        return nomPlantilla;
    }

    public void setListaRecord(List<RecordDTO> listaRecord) {
        this.listaRecord = listaRecord;
    }

    public List<RecordDTO> getListaRecord() {
        return listaRecord;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNumQuincenas(AtributosPlantillaDTO numQuincenas) {
        this.numQuincenas = numQuincenas;
    }

    public AtributosPlantillaDTO getNumQuincenas() {
        return numQuincenas;
    }

    public void setFechaIncidencia(AtributosPlantillaDTO fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public AtributosPlantillaDTO getFechaIncidencia() {
        return fechaIncidencia;
    }
}
