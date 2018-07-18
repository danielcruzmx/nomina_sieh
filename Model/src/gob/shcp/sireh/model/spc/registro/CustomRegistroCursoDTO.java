package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.spc.TnCapCursoDTO;

public class CustomRegistroCursoDTO extends TnCapCursoDTO implements java.io.Serializable, Model {
    
    private java.lang.String descSede;
    private java.lang.String descAula;
    private java.lang.String descHorarioCurso;
    private java.lang.String idTipoInstEducat;
    private java.lang.String descProveedor;
    private java.lang.String descEjeTematico;
    private java.lang.String descControlCurso;
    private java.lang.String descSubprograma;
    private java.lang.String descCursoPrincipal;
    private java.lang.String descModalidad;
    private java.lang.String descFinalidad;
    
    public void setDescSede(String descSede) {
        this.descSede = descSede;
    }

    public String getDescSede() {
        return descSede;
    }

    public void setDescAula(String descAula) {
        this.descAula = descAula;
    }

    public String getDescAula() {
        return descAula;
    }

    public void setDescHorarioCurso(String descHorarioCurso) {
        this.descHorarioCurso = descHorarioCurso;
    }

    public String getDescHorarioCurso() {
        return descHorarioCurso;
    }

    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }
    
    public void setIdTipoInstEducat(String idTipoInstEducat) {
        this.idTipoInstEducat = idTipoInstEducat;
    }

    public String getIdTipoInstEducat() {
        return idTipoInstEducat;
    }
    
    public void setDescControlCurso(String descControlCurso) {
        this.descControlCurso = descControlCurso;
    }

    public String getDescControlCurso() {
        return descControlCurso;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setDescModalidad(String descModalidad) {
        this.descModalidad = descModalidad;
    }

    public String getDescModalidad() {
        return descModalidad;
    }

    public void setDescFinalidad(String descFinalidad) {
        this.descFinalidad = descFinalidad;
    }

    public String getDescFinalidad() {
        return descFinalidad;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
    }
}
