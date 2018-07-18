package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class CargaArchivoDTO  implements java.io.Serializable, Model{ 
    @RegExp("[A-Z]+")
    private String idTercero;
    private String descTercero;
    private FileContent file;
    private String resultadoParser;
    private String fileName;
    private boolean procesar;
    private List<DatosArchivoDTO> lista;
    private int totalRegFlatFile;
    private ResultadoDTO resultado;
    private String error;
    
    private String tipoConcepto;
    
    private String urlOrigen;
    private String urlDestino;
    


    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setResultadoParser(String resultadoParser) {
        this.resultadoParser = resultadoParser;
    }

    public String getResultadoParser() {
        return resultadoParser;
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public FileContent getFile() {
        return file;
    }

    public void setDescTercero(String descTercero) {
        this.descTercero = descTercero;
    }

    public String getDescTercero() {
        return descTercero;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    
   /* @ValidationMethod(forProperty="file", errorCode="error.file.unspecified")
    public boolean validateFile(){
      return  this.getFile() != null && this.getFile().getSize()>0L;
    }*/

    public void setLista(List<DatosArchivoDTO> lista) {
        this.lista = lista;
    }

    public List<DatosArchivoDTO> getLista() {
        return lista;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setResultado(ResultadoDTO resultado) {
        this.resultado = resultado;
    }

    public ResultadoDTO getResultado() {
        return resultado;
    }

    public void setTotalRegFlatFile(int totalRegFlatFile) {
        this.totalRegFlatFile = totalRegFlatFile;
    }

    public int getTotalRegFlatFile() {
        return totalRegFlatFile;
    }

    public void setTipoConcepto(String tipoConcepto) {
        this.tipoConcepto = tipoConcepto;
    }

    public String getTipoConcepto() {
        return tipoConcepto;
    }
    
    @ValidationMethod(forProperty="file", errorCode="error.verify.unselected")
    private boolean validateFile(){
        if(this.getFileName().equalsIgnoreCase("")){
            if(this.getFile().getSize() == 0){
               return false; 
            }
        }
        return true;
    } 

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

}
