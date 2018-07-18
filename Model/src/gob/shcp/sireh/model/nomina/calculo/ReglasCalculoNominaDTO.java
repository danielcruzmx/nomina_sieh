package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;

import java.io.File;
import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.Date;

public class ReglasCalculoNominaDTO implements Serializable, Model {

    private FileContent file;
    private String directoryName;
    private boolean showUpload;
    private FileDTO[] files;
    private String logErrores;
    private boolean muestraErrores;
    private String ruta;
    
    public void setFile(FileContent file) {
        this.file = file;
    }

    public FileContent getFile() {
        return file;
    }

    public void setDirContents(File[] dirContents, boolean parentDir) {

        int i = 0;
        if (parentDir) {
            files = new FileDTO[dirContents.length + 1];
            files[i] = new FileDTO();
            i++;
        } else {
            files = new FileDTO[dirContents.length];
        }

        for (int j = 0; i < files.length; i++, j++) {
            files[i] = new FileDTO(dirContents[j]);
        }
    }

    public void setFiles(FileDTO[] files) {
        this.files = files;
    }

    public FileDTO[] getFiles() {
        return files;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public String getCaption() {
        if (directoryName == null)
            return "";

        return directoryName;
    }

    public void setShowUpload(boolean showUpload) {
        this.showUpload = showUpload;
    }

    public boolean getShowUpload() {
        return showUpload;
    }

    public void setLogErrores(String logErrores) {
        this.logErrores = logErrores;
    }

    public String getLogErrores() {
        return logErrores;
    }

    public void setMuestraErrores(boolean muestraErrores) {
        this.muestraErrores = muestraErrores;
    }

    public boolean isMuestraErrores() {
        return muestraErrores;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public class FileDTO {
        private String name;
        private String size;
        private Date lastModified;
        private boolean directory;
        private boolean link = false;

        private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        public FileDTO() {
            name = "..";
            directory = true;
            link = true;
        }

        public FileDTO(File file) {
            name = file.getName();
            lastModified = new Date(file.lastModified());
            directory = file.isDirectory();
            if (directory) {
                size = "";
            } else {
                size = (int)((file.length() / 1024d) * 100) / 100d + " KB";
            }
        }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public String getLastModified() {
            return link ? "" : dateFormat.format(lastModified);
        }

        public boolean getDirectory() {
            return directory;
        }

        public boolean getLink() {
            return link;
        }
    }
    
    
}
