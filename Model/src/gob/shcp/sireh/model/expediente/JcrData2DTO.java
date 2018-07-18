package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnResource;

import java.util.Map;

public class JcrData2DTO extends FsnResource implements Model {
    //public static final String PROPERTY_REGION = "fsn:region";
    //public static final String PROPERTY_PAIS = "fsn:pais";
    //public static final String NODE_TYPE = "fsn:fsntest2Resource";
    
    public static String PRIMARY_TYPE = "fsn:expedienteSirehResource";
    public static final String PROPERTY_RFC_META = "fsn:rfc_meta";
    public static final String PROPERTY_DOC_META = "fsn:doc_meta";
    
    private FileContent file;
    private long MAX_FILE_SIZE = 20971520;

    public JcrData2DTO() {
        super(PRIMARY_TYPE);
        setVersionable(true);
    }
    public JcrData2DTO(Map properties) {
        super(properties, PRIMARY_TYPE);
    }
    public void setRfc(String rfc) {
        this.getProperties().put(PROPERTY_RFC_META, rfc);
    }
    public String getRfc() {
        return (String)this.getProperties().get(PROPERTY_RFC_META);
    }
    public void setDocumento(String documento) {
        this.getProperties().put(PROPERTY_DOC_META, documento);
    }
    public String getDocumento() {
        return (String)this.getProperties().get(PROPERTY_DOC_META);
    }
    public void setDescription(String description) {
        super.getProperties().put(PROPERTY_DESCRIPTION, description);
    }
    public String getDescription() {
        return (String)super.getProperties().get(PROPERTY_DESCRIPTION);
    }

    public void setFile(FileContent file) {
        this.file = file;
        this.setData(file.getInputStream());
        this.setName(file.getOriginalFilename());
    }

    public FileContent getFile() {
        return file;
    }

}

