package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.jcr.node.FsnFile;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.jcr.query.JcrCondition;

import gob.shcp.sireh.model.expediente.JcrData2DTO;
import gob.shcp.sireh.model.expediente.JcrDataDTO;

import java.io.InputStream;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "jcr")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
@Local( { TestJcrService.class })
public class TestJcrBean extends AbstractBean implements TestJcrService {

    public Collection searchFiles(JcrDataDTO jcrDataDTO) {
        return super.getService(TestJcrService.class).searchFiles(jcrDataDTO);
    }

    public String saveFile(JcrDataDTO jcrDataDTO, boolean rollback) {
        return super.getService(TestJcrService.class).saveFile(jcrDataDTO, rollback);
    }

    public FsnResource getFile(String id) {
        return super.getService(TestJcrService.class).getFile(id);
    }

    public String updateFile(JcrDataDTO jcrDataDTO) {
        return super.getService(TestJcrService.class).updateFile(jcrDataDTO);
    }

    public void deleteFile(String idArchivo) {
        super.getService(TestJcrService.class).deleteFile(idArchivo);
    }

    public Collection showVersions(String idArchivo) {
        return super.getService(TestJcrService.class).showVersions(idArchivo);
    }

    public List<String> saveMultipleFiles(JcrDataDTO jcrDataDTO) {
        return super.getService(TestJcrService.class).saveMultipleFiles(jcrDataDTO);
    }

    public String saveFile(FsnResource fsnResource) {
        return super.getService(TestJcrService.class).saveFile(fsnResource);
    }

    public List<String> saveFiles(List<FsnResource> fsnResourceList) {
        return super.getService(TestJcrService.class).saveFiles(fsnResourceList);
    }

    public FsnResource getFileById(String uuid) {
        return super.getService(TestJcrService.class).getFileById(uuid);
    }

    public List<FsnFile> getFilesById(String[] uuids) {
        return super.getService(TestJcrService.class).getFilesById(uuids);
    }

    public List<FsnFile> getFilesByCondition(String nodeTypeName, List<JcrCondition> conditions) {
        return super.getService(TestJcrService.class).getFilesByCondition(nodeTypeName, conditions);
    }

    public List<FsnFile> getFilesByCondition(List<JcrCondition> conditions) {
        return super.getService(TestJcrService.class).getFilesByCondition(conditions);
    }

    public List<FsnFile> getVersions(String uuid) {
        return super.getService(TestJcrService.class).getVersions(uuid);
    }

    public String updateFile(String uuid, InputStream data) {
        return super.getService(TestJcrService.class).updateFile(uuid, data);
    }

    public String updateFile(String uuid, InputStream data, Map properties) {
        return super.getService(TestJcrService.class).updateFile(uuid, data, properties);
    }

    public String updateFile(String uuid, Map properties) {
        return super.getService(TestJcrService.class).updateFile(uuid, properties);
    }

    public Collection searchFiles(JcrData2DTO jcrData2DTO) {
        return super.getService(TestJcrService.class).searchFiles(jcrData2DTO);
    }

    public String updateFile(JcrData2DTO jcrData2DTO) {
        return super.getService(TestJcrService.class).updateFile(jcrData2DTO);
    }
}
