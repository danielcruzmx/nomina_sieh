package gob.shcp.sireh.control.nomina.calculo;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.fsn.util.FileContent;
import gob.shcp.sireh.model.nomina.calculo.ReglasCalculoNominaDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;

import java.net.URL;

import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.StatelessKnowledgeSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReglasNominaController extends AbstractController implements AnnotatedController {

    private StatelessKnowledgeSession ksessionStateless;
    private StatefulKnowledgeSession ksessionStateful;
    
    /**
     * Metodo encargado de inicializar la vista para el mantenimiento de reglas de calculo.
     * @author
     * @param model Model
     * @param reglasCalculoNominaDTO ReglasCalculoNominaDTO
     * @return String
     */
    @RequestMapping
    public String mantenimientoReglasCalculo(Model model, ReglasCalculoNominaDTO reglasCalculoNominaDTO) {                         
        logger.debug("-----------------> mantenimientoReglasCalculo = (" + reglasCalculoNominaDTO + ")");
        return cambiaDirectorio(model, reglasCalculoNominaDTO, null);
    }
    
    /**
     * Metodo encargado de subir archivos de reglas de calculo.
     * @author Oscar S.
     * @param model Model
     * @param reglasCalculoNominaDTO ReglasCalculoNominaDTO
     * @version 1.0
     * @return String
     * @deprecated
     */
    @RequestMapping
    public String uploadReglas(Model model, ReglasCalculoNominaDTO reglasCalculoNominaDTO) {
        logger.debug("--> uploadReglas = " + reglasCalculoNominaDTO);

        FileContent fileToUpload = reglasCalculoNominaDTO.getFile();
        String directoryNameOfRules = getDirectoryOfRules().getAbsolutePath();
        String directoryName = reglasCalculoNominaDTO.getDirectoryName();
        String filename = null;

        if (directoryName.equals("DSL")) {
            filename = "calculoNomina.dsl";
        } else {
            filename = fileToUpload.getOriginalFilename();
        }

        String absolutePath = directoryNameOfRules + System.getProperty("file.separator") + directoryName + System.getProperty("file.separator") + filename;
        logger.debug("--> absolutePath = " + absolutePath);

        RandomAccessFile raf = null;
        BufferedReader in = null;
        InputStreamReader istream = null;
        
        try {
            raf = new RandomAccessFile(absolutePath, "rw");
            in = new BufferedReader(istream = new InputStreamReader(fileToUpload.getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                raf.write(inputLine.getBytes());
                raf.write(System.getProperty("line.separator").getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (raf != null)
                    raf.close();
            } catch (Exception e) {
            }
            try {
                if (istream != null)
                    istream.close();
            } catch (Exception e) {
            }
            try {
                if (in != null)
                    in.close();
            } catch (Exception e) {
            }
        }
        return cambiaDirectorio(model, reglasCalculoNominaDTO, directoryName);
    }
        
    /**
     * Metodo encargado de subir y validar archivos de reglas de calculo/definiciones.
     * @author Oscar S.
     * @param model Model
     * @param reglasCalculoNominaDTO ReglasCalculoNominaDTO
     * @version 2.0
     * @return String
     */
    @RequestMapping
    public String uploadVerifyReglas(Model model, ReglasCalculoNominaDTO reglasCalculoNominaDTO) {
        logger.debug("----------------> uploadReglas = (" + reglasCalculoNominaDTO + ")");

        FileContent fileToUpload = reglasCalculoNominaDTO.getFile();
        String directoryNameOfRules = getDirectoryOfRules().getAbsolutePath();
        String directoryName = reglasCalculoNominaDTO.getDirectoryName();
        String filename = null;
        String fileExtension = null;
        String fileType = null;
        
        if (directoryName.equals("drools")) {
            filename = "change-set-config.xml";
            fileExtension = ".xml";
            fileType = "configuracion";
        } else if (directoryName.equals("DSL")) {
            filename = "calculoNomina.dsl";
            fileExtension = ".dsl";
            fileType = "definiciones";
        } else {
            filename = fileToUpload.getOriginalFilename();
            fileExtension = ".dslr";
            fileType = "reglas";
        }
        
        try {
            // Escribir archivo temporal
            String fileNameRandom = UUID.randomUUID().toString();
            String nameFileDat =  fileNameRandom + fileExtension;
            String rutaArchivo = super.configuration().getString("local.temp.dir");
            byte[] bytes = fileToUpload.getBytes();
            File tempFile = new File(rutaArchivo + File.separator + nameFileDat);
            FileOutputStream fos = new FileOutputStream(tempFile);
            fos.write(bytes);
            fos.close();
            
            // Validar reglas
            KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
            
            if (directoryName.equals("DSL")) {
                kbuilder.add(ResourceFactory.newFileResource(tempFile), ResourceType.DSL);
            } else {                
                String source = ("file:///" + directoryNameOfRules + System.getProperty("file.separator") + "DSL" + System.getProperty("file.separator") + "calculoNomina.dsl");
                logger.debug("----------------> source = " + source);
                byte[] bytesDSL = getBytesFromFile(source);
                
                kbuilder.add(ResourceFactory.newByteArrayResource(bytesDSL), ResourceType.DSL);
                kbuilder.add(ResourceFactory.newFileResource(tempFile), ResourceType.DSLR);
            }
            KnowledgeBuilderErrors errors = kbuilder.getErrors();
            StringBuffer errores = new StringBuffer();
            logger.debug("----------------> Errores = " + errors.size());
            
            if (errors.size() > 0) {
                for (KnowledgeBuilderError error: errors) {
                    logger.debug(error + "\n");
                    errores.append(error).append("\n <br/><br/>");
                }
                logger.debug("----------------> EL ARCHIVO DE REGLAS PRESENTA ERRORES");
                super.saveError(model, "nomina.calculo.reglas.error", fileType);
                
                // Errores
                reglasCalculoNominaDTO.setMuestraErrores(true);
                reglasCalculoNominaDTO.setLogErrores(errores.toString());
                
                return cambiaDirectorio(model, reglasCalculoNominaDTO, null);
            } else {
                logger.debug("----------------> El archivo de Reglas NO presenta errores de compilacion.");
                super.saveMessage(model, "nomina.calculo.reglas.ok", fileType);
                
                // Escribir archivo
                String absolutePath = directoryNameOfRules + System.getProperty("file.separator") + directoryName + System.getProperty("file.separator") + filename;
                logger.debug("----------------> absolutePath = " + absolutePath);
                 
                RandomAccessFile raf = null;
                BufferedReader in = null;
                InputStreamReader istream = null;
                
                try {
                    raf = new RandomAccessFile(absolutePath, "rw");
                    in = new BufferedReader(istream = new InputStreamReader(fileToUpload.getInputStream()));
                    String inputLine = null;
                    while ((inputLine = in.readLine()) != null) {
                        raf.write(inputLine.getBytes());
                        raf.write(System.getProperty("line.separator").getBytes());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (raf != null)
                            raf.close();
                    } catch (Exception e) {
                    }
                    try {
                        if (istream != null)
                            istream.close();
                    } catch (Exception e) {
                    }
                    try {
                        if (in != null)
                            in.close();
                    } catch (Exception e) {
                    }
                }
            }
            KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
            kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
            //ksessionStateless = kbase.newStatelessKnowledgeSession();
            ksessionStateful = kbase.newStatefulKnowledgeSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cambiaDirectorio(model, reglasCalculoNominaDTO, directoryName);
    }
    
    /**
     * Metodo encargado de obtener parametros de control de directorios y archivos cargados.
     * @author
     * @param model Model
     * @param reglasCalculoNominaDTO ReglasCalculoNominaDTO
     * @param directoryName String
     * @return String
     */
    private String cambiaDirectorio(Model model, ReglasCalculoNominaDTO reglasCalculoNominaDTO, String directoryName) {
        logger.debug("----------------> cambiaDirectorio = " + directoryName);

        String directoryNameOfRules = getDirectoryOfRules().getAbsolutePath();
        logger.debug("---------------->  directoryNameOfRules = " + directoryNameOfRules);

        File directory = null;
        boolean isRootDirectory = true;

        if (directoryName == null) {
            directory = new File(directoryNameOfRules);
        } else {
            directory = new File(directoryNameOfRules + System.getProperty("file.separator") + directoryName);
            isRootDirectory = directoryNameOfRules.equals(directory.getAbsolutePath());
        }
        logger.debug("----------------> directory = " + directory);
        logger.debug("----------------> isRootDirectory = " + isRootDirectory);
        
        reglasCalculoNominaDTO.setDirContents(directory.listFiles(), !isRootDirectory);
        reglasCalculoNominaDTO.setDirectoryName(directoryName);
        reglasCalculoNominaDTO.setShowUpload(!isRootDirectory);
        
        // Absolute path
        reglasCalculoNominaDTO.setRuta(directoryNameOfRules);
        
        model.addAttribute("reglasCalculoNominaDTO", reglasCalculoNominaDTO);
        return super.getViewName("mantenimientoReglasCalculo");
    }
    
    @RequestMapping
    public String downloadReglas(Model model, 
                                 @RequestParam("filename") String filename, 
                                 @RequestParam("dirname") String dirname, 
                                 @RequestParam("isdirectory") boolean isdirectory, 
                                 @RequestParam("islink") boolean islink, 
                                 HttpServletResponse response, 
                                 ReglasCalculoNominaDTO reglasCalculoNominaDTO) {

        logger.debug("----------------> downloadReglas = (" + filename + "," + dirname + "," + isdirectory + ")");

        if (isdirectory) {
            String newDir;
            if (islink) {
                newDir = dirname.indexOf(System.getProperty("file.separator")) != -1 ? dirname.substring(0, dirname.lastIndexOf(System.getProperty("file.separator"))) : null;
            } else {
                newDir = dirname.length() == 0 ? filename : dirname + System.getProperty("file.separator") + filename;
            }
            return cambiaDirectorio(model, reglasCalculoNominaDTO, newDir);
        }

        String directoryNameOfRules = getDirectoryOfRules().getAbsolutePath();
        String source = ("file:///" + directoryNameOfRules + System.getProperty("file.separator") + dirname + System.getProperty("file.separator") + filename);

        OutputStream out = null;

        try {
            byte[] bytes = getBytesFromFile(source);
            response.setContentType("text/plain");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
            out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                }
            } catch (IOException e) {
            }
        }
        return cambiaDirectorio(model, reglasCalculoNominaDTO, dirname);
    }

    @RequestMapping
    public String eliminaRegla(Model model, 
                               @RequestParam("filename") String filename, 
                               @RequestParam("dirname") String dirname, 
                               @RequestParam("isdirectory") boolean isdirectory, 
                               @RequestParam("islink") boolean islink, 
                               ReglasCalculoNominaDTO reglasCalculoNominaDTO) {

        logger.debug("----------------> eliminaRegla = (" + filename + "," + dirname + "," + isdirectory + ")");

        if (isdirectory || islink) {
            return cambiaDirectorio(model, reglasCalculoNominaDTO, dirname);
        }

        String directoryNameOfRules = getDirectoryOfRules().getAbsolutePath();
        String fileToDelete = (directoryNameOfRules + System.getProperty("file.separator") + dirname + System.getProperty("file.separator") + filename);

        File file = new File(fileToDelete);
        if (file.exists()) {
            file.delete();
            super.saveMessage(model, "nomina.calculo.reglas.eliminada", filename);
        } else {
            super.saveError(model, "nomina.calculo.reglas.noeliminada", fileToDelete);
        }
        return cambiaDirectorio(model, reglasCalculoNominaDTO, dirname);
    }

    private byte[] getBytesFromFile(String source) {
        byte[] bytes = null;
        BufferedReader in = null;
        InputStreamReader istream = null;

        try {
            StringBuffer sb = new StringBuffer();
            in = new BufferedReader(istream = new InputStreamReader(new URL(source).openConnection().getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine).append(System.getProperty("line.separator"));
            }
            bytes = sb.toString().getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (istream != null)
                    istream.close();
            } catch (Exception e) {
            }
            try {
                if (in != null)
                    in.close();
            } catch (Exception e) {
            }
        }
        return bytes;
    }

    private File getDirectoryOfRules() {
        File dirRules = null;
        try {
            return dirRules = new File(new URL(super.configuration().getString("droolsConfig", "app.drools.rules.dir")).getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dirRules;
    }
}
