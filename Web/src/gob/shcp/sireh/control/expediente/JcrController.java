package gob.shcp.sireh.control.expediente;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.jcr.node.FsnFile;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.sireh.model.expediente.JcrData2DTO;
import gob.shcp.sireh.model.expediente.JcrDataDTO;

import gob.shcp.sireh.service.expediente.TestJcrService;

import java.io.IOException;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class JcrController extends AbstractController implements AnnotatedController {
    
    protected final Log log = LogFactory.getLog(getClass());
    
    // metodos para nodo tipo fsntestResource
    @RequestMapping
    public String initSearchFiles(Model model, JcrDataDTO jcrDataDTO) {
        return super.getViewName("searchFiles");
    }
    
    @RequestMapping
    public String searchFiles(Model model, JcrDataDTO jcrDataDTO) {
        //Collection cl = super.getService(TestJcrService.class).searchFiles(jcrDataDTO);
        //model.addAttribute("filesList", cl);
        return super.getViewName("searchFiles");
    }
    
    @RequestMapping
    public String initSaveFile(Model model, JcrDataDTO jcrDataDTO) {
        return super.getViewName("uploadFiles");
    }
    
    @RequestMapping
    public String initSaveMultipleFiles(Model model, JcrDataDTO jcrDataDTO) {
        return super.getViewName("uploadMultipleFiles");
    }
    
    //
    @RequestMapping
    public String saveFile(Model model, JcrDataDTO jcrDataDTO) {
        String idFile = null;
        jcrDataDTO.setName(jcrDataDTO.getFile().getOriginalFilename());
        jcrDataDTO.setData(jcrDataDTO.getFile().getInputStream());
        idFile = super.getService(TestJcrService.class).saveFile(jcrDataDTO, jcrDataDTO.isRollback());
        super.saveMessage(model, "jcr.file.save.ok", idFile);
        return super.getViewName("uploadFiles");
    }
    
    @RequestMapping
    public String saveMultipleFiles(Model model, JcrDataDTO jcrDataDTO) {
        //List<String> idFiles  =testAllJcrService(jcrDataDTO);
        List<String> idFiles = super.getService(TestJcrService.class).saveMultipleFiles(jcrDataDTO);
        
        for (String id: idFiles) {
            super.saveMessage(model, "jcr.file.save.ok", id);
        }
        return searchFiles(model, jcrDataDTO);
    }
    
    @RequestMapping
    public String downloadFile(@RequestParam("uuid") String uuid, HttpServletResponse response) throws IOException {
        FsnResource fsnResource = super.getService(TestJcrService.class).getFile(uuid);
        String mimetype = fsnResource.getMimeType();
        response.setContentType(mimetype);
        fsnResource.getDataSize();
        FileCopyUtils.copy(fsnResource.getData(), response.getOutputStream());
        return null;
    }
    
    @RequestMapping
    public String initUpdateFile(Model model, @RequestParam("uuid")String uuid) {
        FsnResource file = super.getService(TestJcrService.class).getFile(uuid);
        JcrDataDTO jcrDataDTO = new JcrDataDTO(file.getProperties());
        model.addAttribute(jcrDataDTO);
        return super.getViewName("updateFiles");
    }


    @RequestMapping
    public String updateFile(Model model, JcrDataDTO jcrDataDTO) {
        jcrDataDTO.setName(jcrDataDTO.getFile().getOriginalFilename());
        jcrDataDTO.setData(jcrDataDTO.getFile().getInputStream());
        String versionValue = super.getService(TestJcrService.class).updateFile(jcrDataDTO);
        super.saveMessage(model, "jcr.file.save.version.info", versionValue);
        return searchFiles(model, jcrDataDTO);
    }
    
    @RequestMapping
    public String initRenameFile(Model model, @RequestParam("uuid") String uuid) {
        FsnResource file = super.getService(TestJcrService.class).getFile(uuid);
        JcrDataDTO jcrDataDTO = new JcrDataDTO(file.getProperties());
        model.addAttribute(jcrDataDTO);
        return super.getViewName("renameFile");
    }
    
    @RequestMapping
    public String deleteFile(Model model, @RequestParam("uuid")String uuid) {
        super.getService(TestJcrService.class).deleteFile(uuid);
        super.saveMessage(model, "jcr.file.delete.ok", uuid);
        JcrDataDTO jcrDataDTO = new JcrDataDTO();
        model.addAttribute(jcrDataDTO);
        return searchFiles(model, jcrDataDTO);
    }
    
    @RequestMapping
    public String showVersionsFile(Model model, @RequestParam("uuid") String uuid) {
        model.addAttribute("showVersionsId", uuid);
        model.addAttribute(new JcrDataDTO());
        return super.getViewName("searchFiles");
    }
    
    @RequestMapping
    public String initSearch2Files(Model model) {
        model.addAttribute("jcrData2DTO", new JcrData2DTO());
        return super.getViewName("search2Files");
    }
    
    @RequestMapping
    public String search2Files(Model model, JcrData2DTO jcrData2DTO) {
        Collection<FsnFile> cl = super.getService(TestJcrService.class).searchFiles(jcrData2DTO);
        model.addAttribute("filesList", cl);
        return super.getViewName("search2Files");
    }

    @RequestMapping
    public String initSave2File(Model model) {
        model.addAttribute("jcrData2DTO", new JcrData2DTO());
        return super.getViewName("upload2Files");
    }
    
    //
    @RequestMapping
    public String save2File(Model model, JcrData2DTO jcrData2DTO) {
        String idFile = null;
        idFile = super.getService(TestJcrService.class).saveFile(jcrData2DTO);
        super.saveMessage(model, "jcr.file.save.ok", idFile);
        return super.getViewName("search2Files");
    }
    
    @RequestMapping
    public String initUpdate2File(Model model, @RequestParam("uuid") String uuid) {
        FsnResource file = super.getService(TestJcrService.class).getFile(uuid);
        JcrData2DTO jcrData2DTO = new JcrData2DTO(file.getProperties());
        model.addAttribute(jcrData2DTO);
        return super.getViewName("update2Files");
    }
    
    @RequestMapping
    public String update2File(Model model, JcrData2DTO jcrData2DTO) {
        String versionValue = super.getService(TestJcrService.class).updateFile(jcrData2DTO);
        super.saveMessage(model, "jcr.file.save.version.info", versionValue);
        return search2Files(model, jcrData2DTO);
    }
    
    @RequestMapping
    public String delete2File(Model model, @RequestParam("uuid")
        String uuid) {
        super.getService(TestJcrService.class).deleteFile(uuid);
        super.saveMessage(model, "jcr.file.delete.ok", uuid);
        JcrData2DTO jcrData2DTO = new JcrData2DTO();
        model.addAttribute(jcrData2DTO);
        return search2Files(model, jcrData2DTO);
    }
    
    @RequestMapping
    public String showVersions2File(Model model, @RequestParam("uuid") String uuid) {
        Collection versions = super.getService(TestJcrService.class).showVersions(uuid);
        model.addAttribute("versionsList", versions);
        model.addAttribute(new JcrData2DTO());
        return super.getViewName("search2Files");
    }
    
    //busqueda de archivos por id.
    @RequestMapping
    public String searchAllFilesById(Model model) {
        Collection<FsnFile> cl = super.getService(TestJcrService.class).searchFiles(new JcrDataDTO());
        Collection<FsnFile> cl2 = super.getService(TestJcrService.class).searchFiles(new JcrData2DTO());
        String[] uuids = new String[cl.size() + cl2.size()];
        int i = 0;

        for (FsnFile file: cl) {
            uuids[i] = file.getUuid();
            i++;

        }
        for (FsnFile file: cl2) {
            uuids[i] = file.getUuid();
            i++;
        }
        Collection cl3 = super.getService(TestJcrService.class).getFilesById(uuids);
        model.addAttribute("filesList", cl);
        return super.getViewName("searchAllFiles");
    }
}
