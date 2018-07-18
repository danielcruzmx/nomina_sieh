package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Map;

public class JcrDataGestionDocumentosDTO extends FsnResource implements Model {

    public static String NODE_TYPE = "fsn:expedienteSirehResource";
    public static String PROPERTY_CADENA = "fsn:cadena";
    public static String PROPERTY_LONG = "fsn:long";
    public static String PROPERTY_DECIMAL = "fsn:decimal";
    public static String PROPERTY_BOOLEANO = "fsn:booleano";
    public static String PROPERTY_DOBLE = "fsn:doble";
    public static String PROPERTY_FECHA = "fsn:fecha";

    private FileContent file;
    private FileContent[] files;
    private long MAX_FILE_SIZE = 20971520;
    
    // Busqueda
    private boolean rollback;
    
    public JcrDataGestionDocumentosDTO() {
        super(NODE_TYPE);
        setVersionable(true);
    }

    public JcrDataGestionDocumentosDTO(Map properties) {
        super(properties, NODE_TYPE);
        setVersionable(true);
    }

    public void setFile(FileContent file) {
        this.file = file;
    }

    public FileContent getFile() {
        return file;
    }

    public void setDescripcion(String descripcion) {
        super.getProperties().put(PROPERTY_DESCRIPTION, descripcion);
    }

    public String getDescripcion() {
        return (String)super.getProperties().get(PROPERTY_DESCRIPTION);
    }

    public void setCadena(String cadena) {
        super.getProperties().put(PROPERTY_CADENA, cadena);
    }

    public String getCadena() {
        return (String)super.getProperties().get(PROPERTY_CADENA);

    }

    public void setLong_(Long long_) {
        super.getProperties().put(PROPERTY_LONG, long_);
    }

    public Long getLong_() {
        return (Long)super.getProperties().get(PROPERTY_LONG);
    }

    public void setDecimal(BigDecimal decimal) {
        super.getProperties().put(PROPERTY_DECIMAL, decimal);
    }

    public BigDecimal getDecimal() {
        return (BigDecimal)super.getProperties().get(PROPERTY_DECIMAL);
    }

    public void setBooleano(Boolean booleano) {
        super.getProperties().put(PROPERTY_BOOLEANO, booleano);
    }
    
    public Boolean getBooleano() {
        return (Boolean)super.getProperties().get(PROPERTY_BOOLEANO);
    }

    public void setDoble(Double doble) {
        super.getProperties().put(PROPERTY_DOBLE, doble);
    }

    public Double getDoble() {
        return (Double)super.getProperties().get(PROPERTY_DOBLE);
    }

    public void setFecha(Calendar fecha) {
        super.getProperties().put(PROPERTY_FECHA, fecha);
    }

    public Calendar getFecha() {
        return (Calendar)super.getProperties().get(PROPERTY_FECHA);
    }
    
    public void setFiles(FileContent[] files) {
        this.files = files;
    }

    public FileContent[] getFiles() {
        return files;
    }

    public void setRollback(boolean rollback) {
        this.rollback = rollback;
    }

    public boolean isRollback() {
        return rollback;
    }
}
