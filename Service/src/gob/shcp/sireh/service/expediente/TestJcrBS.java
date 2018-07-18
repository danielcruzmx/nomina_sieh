package gob.shcp.sireh.service.expediente;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.jcr.node.FsnFile;
import gob.shcp.jcr.node.FsnResource;
import gob.shcp.jcr.query.JcrCondition;
import gob.shcp.jcr.service.JcrService;

import gob.shcp.sireh.model.expediente.JcrData2DTO;
import gob.shcp.sireh.model.expediente.JcrDataDTO;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

public class TestJcrBS extends AbstractService implements TestJcrService {
    public TestJcrBS() {
    }

    public Collection searchFiles(JcrDataDTO jcrDataDTO) {
        List conditions = new ArrayList();
        /*
         * busquedas en el componente JCR.
         * para realizar busquedas en el componente JCR podemos utilizar
         * la clase JcrCondition.
         *
         * la forma de utilizar esta clase, es inicializandola con los criterios de busqueda
         * deseados (filtros). al final cada condición se agrega a una coleccion que contiene
         * todas la condiciones por las cuales se filtra la busqueda de archivos en el repositorio JCR
         */

        if (StringUtils.hasText(jcrDataDTO.getCadena())) {
            /*
             * cada condición se aplica sobre la propiedad de los archivos del repositorio.
             * new JcrCondition() - se crea un objeto condition
             * jcrCondition.field(String fieldName) - se inicializa el nombre del campo sobre el cual aplica la condición.
             * jcrCondition.like() - se setea el tipo de condición. Ver la clase para los tipos soportados.
             * jcrCondition.value(Object valueToCompare) - se pasa el valor en valueToComapre con el cual se desa comparar.
             */
            conditions.add(JcrCondition.add().field(JcrDataDTO.PROPERTY_CADENA).like().value(jcrDataDTO.getCadena()));
        }

        if (jcrDataDTO.getDecimal() != null) {
            conditions.add(new JcrCondition().field(JcrDataDTO.PROPERTY_DECIMAL).equals().value(jcrDataDTO.getDecimal()));
        }

        if (StringUtils.hasText(jcrDataDTO.getDescripcion())) {
            conditions.add(new JcrCondition().fieldDescription().like().value(jcrDataDTO.getDescripcion()));
        }

        if (jcrDataDTO.getDoble() != null) {
            conditions.add(new JcrCondition().field(JcrDataDTO.PROPERTY_DOBLE).equals().value(jcrDataDTO.getDoble()));
        }

        if (StringUtils.hasText(jcrDataDTO.getEncoding())) {
            conditions.add(new JcrCondition().fieldEncoding().like().value(jcrDataDTO.getEncoding()));
        }

        if (jcrDataDTO.getFecha() != null) {
            conditions.add(new JcrCondition().fieldLastModified().lessThan().value(Calendar.getInstance()));
        }

        if (jcrDataDTO.getLong_() != null) {
            conditions.add(new JcrCondition().field(JcrDataDTO.PROPERTY_LONG).equals().value(jcrDataDTO.getLong_()));
        }

        if (StringUtils.hasText(jcrDataDTO.getMimeType())) {
            conditions.add(new JcrCondition().fieldMimeType().like().value(jcrDataDTO.getMimeType()));
        }

        if (StringUtils.hasText(jcrDataDTO.getTitle())) {
            conditions.add(new JcrCondition().fieldTitle().like().value(jcrDataDTO.getTitle()));
        }
        if (StringUtils.hasText(jcrDataDTO.getName())) {
            conditions.add(new JcrCondition().fieldFileName().like().value("%" + jcrDataDTO.getName() + "%"));

        }
        // tanto el nombre del archivo como las condiciones pueden ser  null, en cuyo caso el metodo regresa todos los nodos 
        // existentes en el repositorio para esta aplicacion.
        return (Collection)super.getService(JcrService.class).getFilesByCondition(jcrDataDTO.getNodeType(), conditions);
    }

    public String saveFile(JcrDataDTO jcrDataDTO, boolean rollback) {
        String idfile = saveFile(jcrDataDTO);
        if (rollback) {
            throw new RuntimeException("probando rollback al archivo con id = " + idfile);
        }
        return idfile;
    }
    
    public FsnResource getFile(String id) {
        return super.getService(JcrService.class).getFileById(id);
    }


    public String updateFile(JcrDataDTO jcrDataDTO) {
        return super.getService(JcrService.class).updateFile(jcrDataDTO);
    }

    public void deleteFile(String idArchivo) {
        super.getService(JcrService.class).deleteFile(idArchivo);

    }

    public Collection showVersions(String idArchivo) {
        return super.getService(JcrService.class).getVersions(idArchivo);
    }

    public List<String> saveMultipleFiles(JcrDataDTO jcrDataDTO) {
        List<FsnResource> fileList = new ArrayList<FsnResource>();
        int i = 0;
        for (FileContent file: jcrDataDTO.getFiles()) {
            if (file.getBytes().length <= 0)
                continue;
            FsnResource fileResource = new FsnResource(jcrDataDTO.getProperties(), jcrDataDTO.NODE_TYPE);
            fileResource.setData(file.getInputStream());
            fileResource.setVersionable(true);
            i++;
            String filename = "" + i + "_" + System.currentTimeMillis() + file.getOriginalFilename();
            fileResource.setName(filename);
            fileList.add(fileResource);
        }
        return super.getService(JcrService.class).saveFiles(fileList);
    }

    public String saveFile(FsnResource fsnResource) {
        JcrService service = super.getService(JcrService.class);
        return service.saveFile(fsnResource);
    }

    public List<String> saveFiles(List<FsnResource> fsnResourceList) {
        JcrService service = super.getService(JcrService.class);
        return service.saveFiles(fsnResourceList);
    }

    public FsnResource getFileById(String uuid) {
        JcrService service = super.getService(JcrService.class);
        return service.getFileById(uuid);
    }

    public List<FsnFile> getFilesById(String[] uuids) {
        JcrService service = super.getService(JcrService.class);
        return service.getFilesById(uuids);
    }

    public List<FsnFile> getFilesByCondition(String nodeTypeName, List<JcrCondition> conditions) {
        JcrService service = super.getService(JcrService.class);
        return super.getService(JcrService.class).getFilesByCondition(nodeTypeName, conditions);
    }

    public List<FsnFile> getFilesByCondition(List<JcrCondition> conditions) {
        JcrService service = super.getService(JcrService.class);
        return service.getFilesByCondition(conditions);
    }

    public List<FsnFile> getVersions(String uuid) {
        JcrService service = super.getService(JcrService.class);
        return service.getVersions(uuid);
    }

    public String updateFile(String uuid, InputStream data) {
        JcrService service = super.getService(JcrService.class);
        return service.updateFile(uuid, data);
    }

    public String updateFile(String uuid, InputStream data, Map properties) {
        JcrService service = super.getService(JcrService.class);
        return service.updateFile(uuid, data, properties);
    }

    public String updateFile(String uuid, Map properties) {
        JcrService service = super.getService(JcrService.class);
        return service.updateFile(uuid, properties);
    }

    public String updateFile(JcrData2DTO jcrData2DTO) {
        return super.getService(JcrService.class).updateFile(jcrData2DTO);
    }

    public Collection searchFiles(JcrData2DTO jcrData2DTO) {

        List conditions = new ArrayList();
        /*
         * busquedas en el componente JCR.
         * para realizar busquedas en el componente JCR podemos utilizar
         * la clase JcrCondition.
         *
         * la forma de utilizar esta clase, es inicializandola con los criterios de busqueda
         * deseados (filtros). al final cada condición se agrega a una coleccion que contiene
         * todas la condiciones por las cuales se filtra la busqueda de archivos en el repositorio JCR
         * */
        if (StringUtils.hasText(jcrData2DTO.getRfc())) {
            /*
             * cada condición se aplica sobre la propiedad de los archivos del repositorio.
             * new JcrCondition() - se crea un objeto condition
             * jcrCondition.field(String fieldName) - se inicializa el nombre del campo sobre el cual aplica la condición.
             * jcrCondition.like() - se setea el tipo de condición. Ver la clase para los tipos soportados.
             * jcrCondition.value(Object valueToCompare) - se pasa el valor en valueToComapre con el cual se desa comparar.
             */
            conditions.add(new JcrCondition().field(JcrData2DTO.PROPERTY_RFC_META).like().value(jcrData2DTO.getRfc()));
        }

        if (StringUtils.hasText(jcrData2DTO.getDocumento())) {
            conditions.add(new JcrCondition().field(JcrData2DTO.PROPERTY_DOC_META).equals().value(jcrData2DTO.getDocumento()));
        }
        if (StringUtils.hasText(jcrData2DTO.getDescription())) {
            //conditions.add(new JcrCondition().fieldDescription().like().value(jcrData2DTO.getDescripcion()));
            conditions.add(new JcrCondition().field(JcrData2DTO.PROPERTY_DESCRIPTION).equals().value(jcrData2DTO.getDescription()));
        }
        if (StringUtils.hasText(jcrData2DTO.getEncoding())) {
            conditions.add(new JcrCondition().fieldEncoding().like().value(jcrData2DTO.getEncoding()));
        }
        if (StringUtils.hasText(jcrData2DTO.getMimeType())) {
            conditions.add(new JcrCondition().fieldMimeType().like().value(jcrData2DTO.getMimeType()));
        }
        if (StringUtils.hasText(jcrData2DTO.getTitle())) {
            conditions.add(new JcrCondition().fieldTitle().like().value(jcrData2DTO.getTitle()));
        }
        if (StringUtils.hasText(jcrData2DTO.getName())) {
            conditions.add(new JcrCondition().fieldFileName().like().value("%" + jcrData2DTO.getName() + "%"));
        }
        
        // tanto el nombre del archivo como las condiciones pueden ser  null, en cuyo caso el metodo regresa todos los nodos 
        // existentes en el repositorio para esta aplicacion.
        return (Collection)super.getService(JcrService.class).getFilesByCondition(jcrData2DTO.getNodeType(), conditions);
    }
}
