package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.jcr.node.FsnFile;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.jcr.query.JcrCondition;

import gob.shcp.sireh.model.expediente.JcrData2DTO;
import gob.shcp.sireh.model.expediente.JcrDataDTO;

import java.io.InputStream;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface TestJcrService extends BusinessService {

    public Collection searchFiles(JcrDataDTO jcrDataDTO);

    public String saveFile(JcrDataDTO jcrDataDTO, boolean rollback);

    public FsnResource getFile(String idArchivo);

    //public String updateFile(FsnResource resource);

    //public void deleteFile(String idArchivo);

    public Collection showVersions(String idArchivo);

    public List<String> saveMultipleFiles(JcrDataDTO jcrDataDTO);

    //public List<String> testAllJcrService(JcrDataDTO jcrDataDTO);
    /*test for all methods */

    public String saveFile(FsnResource fsnResource);

    public List<String> saveFiles(List<FsnResource> fsnResourceList);

    public FsnResource getFileById(String uuid);

    public List<FsnFile> getFilesById(String[] uuids);

    public List<FsnFile> getFilesByCondition(String nodeTypeName, List<JcrCondition> conditions);

    public List<FsnFile> getFilesByCondition(List<JcrCondition> conditions);

    public List<FsnFile> getVersions(String uuid);

    public String updateFile(String uuid, InputStream data);

    public String updateFile(String uuid, InputStream data, Map properties);

    public String updateFile(String uuid, Map properties);

    public String updateFile(JcrDataDTO jcrDataDTO);

    public void deleteFile(final String uuid);

    public Collection searchFiles(JcrData2DTO jcrData2DTO);

    public String updateFile(JcrData2DTO jcrData2DTO);
}
