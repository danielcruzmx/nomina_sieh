package gob.shcp.sireh.model.nomina.terceros.aportaciones;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;


//import gob.shcp.fsn.util.FileContent;

public class CargaPlantillaSARTercerosDTO implements java.io.Serializable, Model {
    
    private FileContent file;
    private String resultadoParser;
    private String fileName;
    private boolean procesar;
    private Long versionArchivo;
    @RegExp("[A-Z]+")
    private String idTercero;
    private String descTercero;
    private String error;

    
    private boolean cancel;
   
    public void setFile(FileContent file) {
        this.file = file;
    }

    public FileContent getFile() {
        return file;
    }

    public void setResultadoParser(String resultadoParser) {
        this.resultadoParser = resultadoParser;
    }

    public String getResultadoParser() {
        return resultadoParser;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setVersionArchivo(Long versionArchivo) {
        this.versionArchivo = versionArchivo;
    }

    public Long getVersionArchivo() {
        return versionArchivo;
    }
    
    @ValidationMethod(forProperty="file", errorCode="error.verify.unselected")
    private boolean validateFile(){
        if(this.getFile() != null){        
            if(this.file.isEmpty()){
                return false;
            }
        }
        return true;
    }

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setDescTercero(String descTercero) {
        this.descTercero = descTercero;
    }

    public String getDescTercero() {
        return descTercero;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
