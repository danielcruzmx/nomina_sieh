package gob.shcp.sireh.model.clc.interfaz;

import gob.shcp.fsn.model.Model;

public class GenSolCompDTO implements java.io.Serializable, Model {

    private java.lang.String csvFileName;
    private java.lang.String csvFilePath;
    
    public String getCsvFileName() {
        return csvFileName;
    }

    public void setCsvFileName(String csvFileName) {
        this.csvFileName = csvFileName;
    }
    
    public void setCsvFilePath(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    public String getCsvFilePath() {
        return csvFilePath;
    }
}
