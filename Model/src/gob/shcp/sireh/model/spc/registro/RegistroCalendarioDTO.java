package gob.shcp.sireh.model.spc.registro;

import gob.shcp.fsn.model.Model;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class RegistroCalendarioDTO implements java.io.Serializable, Model {

    private java.lang.Integer idCurso;
    private java.lang.String cursoClave;
    private java.lang.String descCursoPrincipal;
    private String idSubprograma;
    private java.lang.String descSubprograma;
    private java.lang.String idEjeTematico;
    private java.lang.String descEjeTematico;
    private int idModalidad;
    private java.lang.String descModalidad;
    private int idFinalidad;
    private java.lang.String descFinalidad;
    private java.lang.Float cursoDuracion;
    private java.util.Date cursoFecFin;
    private java.util.Date cursoFecIni;
    private java.lang.String idSede;
    private java.lang.String descSede;
    private java.lang.String idAula;
    private java.lang.String descAula;
    private java.lang.String idHorarioCurso;
    private java.lang.String descHorarioCurso;
    private java.lang.Integer cursoMinimoParticipantes;
    private java.lang.Integer cursoMaximoParticipantes;
    private java.lang.String idControlCurso;
    private java.lang.String cursoHorarioObser;
    private Float numeroHorasHorario;
    private boolean showHorario;
    
    // Horario inicial
    private boolean dia1;
    private boolean dia2;
    private boolean dia3;
    private boolean dia4;
    private boolean dia5;
    private boolean dia6;
    private boolean dia7;
    
    // Horario inicial
    private java.lang.Integer idHorarioInicialCurso1;
    private java.lang.Integer idHorarioInicialCurso2;
    private java.lang.Integer idHorarioInicialCurso3;
    private java.lang.Integer idHorarioInicialCurso4;
    private java.lang.Integer idHorarioInicialCurso5;
    private java.lang.Integer idHorarioInicialCurso6;
    private java.lang.Integer idHorarioInicialCurso7;
    
    // Horario final
    private java.lang.Integer idHorarioFinalCurso1;
    private java.lang.Integer idHorarioFinalCurso2;
    private java.lang.Integer idHorarioFinalCurso3;
    private java.lang.Integer idHorarioFinalCurso4;
    private java.lang.Integer idHorarioFinalCurso5;
    private java.lang.Integer idHorarioFinalCurso6;
    private java.lang.Integer idHorarioFinalCurso7;
    
    public RegistroCalendarioDTO() {
    }

    public void setCursoClave(String cursoClave) {
        this.cursoClave = cursoClave;
    }

    public String getCursoClave() {
        return cursoClave;
    }

    public void setDescCursoPrincipal(String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
    }

    public String getDescCursoPrincipal() {
        return descCursoPrincipal;
    }

    public void setIdSubprograma(String idSubprograma) {
        this.idSubprograma = idSubprograma;
    }

    public String getIdSubprograma() {
        return idSubprograma;
    }

    public void setIdEjeTematico(String idEjeTematico) {
        this.idEjeTematico = idEjeTematico;
    }

    public String getIdEjeTematico() {
        return idEjeTematico;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdFinalidad(int idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    public int getIdFinalidad() {
        return idFinalidad;
    }

    public void setCursoDuracion(java.lang.Float cursoDuracion) {
        this.cursoDuracion = cursoDuracion;
    }

    public java.lang.Float getCursoDuracion() {
        return cursoDuracion;
    }

    public void setCursoFecFin(Date cursoFecFin) {
        this.cursoFecFin = cursoFecFin;
    }

    public Date getCursoFecFin() {
        return cursoFecFin;
    }

    public void setCursoFecIni(Date cursoFecIni) {
        this.cursoFecIni = cursoFecIni;
    }

    public Date getCursoFecIni() {
        return cursoFecIni;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdHorarioCurso(String idHorarioCurso) {
        this.idHorarioCurso = idHorarioCurso;
    }

    public String getIdHorarioCurso() {
        return idHorarioCurso;
    }

    public void setCursoMinimoParticipantes(Integer cursoMinimoParticipantes) {
        this.cursoMinimoParticipantes = cursoMinimoParticipantes;
    }

    public Integer getCursoMinimoParticipantes() {
        return cursoMinimoParticipantes;
    }

    public void setDescSubprograma(String descSubprograma) {
        this.descSubprograma = descSubprograma;
    }

    public String getDescSubprograma() {
        return descSubprograma;
    }

    public void setDescEjeTematico(String descEjeTematico) {
        this.descEjeTematico = descEjeTematico;
    }

    public String getDescEjeTematico() {
        return descEjeTematico;
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

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdControlCurso(String idControlCurso) {
        this.idControlCurso = idControlCurso;
    }

    public String getIdControlCurso() {
        return idControlCurso;
    }

    public void setCursoHorarioObser(String cursoHorarioObser) {
        this.cursoHorarioObser = cursoHorarioObser;
    }

    public String getCursoHorarioObser() {
        return cursoHorarioObser;
    }

    public void setCursoMaximoParticipantes(Integer cursoMaximoParticipantes) {
        this.cursoMaximoParticipantes = cursoMaximoParticipantes;
    }

    public Integer getCursoMaximoParticipantes() {
        return cursoMaximoParticipantes;
    }
    
    public void setIdHorarioInicialCurso1(Integer idHorarioInicialCurso1) {
        this.idHorarioInicialCurso1 = idHorarioInicialCurso1;
    }

    public Integer getIdHorarioInicialCurso1() {
        return idHorarioInicialCurso1;
    }

    public void setIdHorarioInicialCurso2(Integer idHorarioInicialCurso2) {
        this.idHorarioInicialCurso2 = idHorarioInicialCurso2;
    }

    public Integer getIdHorarioInicialCurso2() {
        return idHorarioInicialCurso2;
    }

    public void setIdHorarioInicialCurso3(Integer idHorarioInicialCurso3) {
        this.idHorarioInicialCurso3 = idHorarioInicialCurso3;
    }

    public Integer getIdHorarioInicialCurso3() {
        return idHorarioInicialCurso3;
    }

    public void setIdHorarioInicialCurso4(Integer idHorarioInicialCurso4) {
        this.idHorarioInicialCurso4 = idHorarioInicialCurso4;
    }

    public Integer getIdHorarioInicialCurso4() {
        return idHorarioInicialCurso4;
    }

    public void setIdHorarioInicialCurso5(Integer idHorarioInicialCurso5) {
        this.idHorarioInicialCurso5 = idHorarioInicialCurso5;
    }

    public Integer getIdHorarioInicialCurso5() {
        return idHorarioInicialCurso5;
    }

    public void setIdHorarioInicialCurso6(Integer idHorarioInicialCurso6) {
        this.idHorarioInicialCurso6 = idHorarioInicialCurso6;
    }

    public Integer getIdHorarioInicialCurso6() {
        return idHorarioInicialCurso6;
    }

    public void setIdHorarioInicialCurso7(Integer idHorarioInicialCurso7) {
        this.idHorarioInicialCurso7 = idHorarioInicialCurso7;
    }

    public Integer getIdHorarioInicialCurso7() {
        return idHorarioInicialCurso7;
    }

    public void setIdHorarioFinalCurso1(Integer idHorarioFinalCurso1) {
        this.idHorarioFinalCurso1 = idHorarioFinalCurso1;
    }

    public Integer getIdHorarioFinalCurso1() {
        return idHorarioFinalCurso1;
    }

    public void setIdHorarioFinalCurso2(Integer idHorarioFinalCurso2) {
        this.idHorarioFinalCurso2 = idHorarioFinalCurso2;
    }

    public Integer getIdHorarioFinalCurso2() {
        return idHorarioFinalCurso2;
    }

    public void setIdHorarioFinalCurso3(Integer idHorarioFinalCurso3) {
        this.idHorarioFinalCurso3 = idHorarioFinalCurso3;
    }

    public Integer getIdHorarioFinalCurso3() {
        return idHorarioFinalCurso3;
    }

    public void setIdHorarioFinalCurso4(Integer idHorarioFinalCurso4) {
        this.idHorarioFinalCurso4 = idHorarioFinalCurso4;
    }

    public Integer getIdHorarioFinalCurso4() {
        return idHorarioFinalCurso4;
    }

    public void setIdHorarioFinalCurso5(Integer idHorarioFinalCurso5) {
        this.idHorarioFinalCurso5 = idHorarioFinalCurso5;
    }

    public Integer getIdHorarioFinalCurso5() {
        return idHorarioFinalCurso5;
    }

    public void setIdHorarioFinalCurso6(Integer idHorarioFinalCurso6) {
        this.idHorarioFinalCurso6 = idHorarioFinalCurso6;
    }

    public Integer getIdHorarioFinalCurso6() {
        return idHorarioFinalCurso6;
    }

    public void setIdHorarioFinalCurso7(Integer idHorarioFinalCurso7) {
        this.idHorarioFinalCurso7 = idHorarioFinalCurso7;
    }

    public Integer getIdHorarioFinalCurso7() {
        return idHorarioFinalCurso7;
    }

    public void setDia1(boolean dia1) {
        this.dia1 = dia1;
    }

    public boolean isDia1() {
        return dia1;
    }

    public void setDia2(boolean dia2) {
        this.dia2 = dia2;
    }

    public boolean isDia2() {
        return dia2;
    }

    public void setDia3(boolean dia3) {
        this.dia3 = dia3;
    }

    public boolean isDia3() {
        return dia3;
    }

    public void setDia4(boolean dia4) {
        this.dia4 = dia4;
    }

    public boolean isDia4() {
        return dia4;
    }

    public void setDia5(boolean dia5) {
        this.dia5 = dia5;
    }

    public boolean isDia5() {
        return dia5;
    }

    public void setDia6(boolean dia6) {
        this.dia6 = dia6;
    }

    public boolean isDia6() {
        return dia6;
    }

    public void setDia7(boolean dia7) {
        this.dia7 = dia7;
    }

    public boolean isDia7() {
        return dia7;
    }
    
    //Validaciones
     // la fecha inicial debe ser menor o igual a la fecha final
     @ValidationMethod(forProperty = "cursoFecIni", errorCode = "fecha.invalida.rango")
     public boolean validateFechasAltaRango() {
         if (this.getCursoFecIni() == null || this.getCursoFecFin() == null) {
             return false;
         }
         if (DateUtils.truncate(this.getCursoFecFin(), Calendar.DATE).before(DateUtils.truncate(this.getCursoFecIni(), Calendar.DATE))) {
             return false;
         }
         return true;
     }

     @ValidationMethod(forProperty = "idSede", errorCode = "not.null")
     public boolean validateIdSede() {
         return this.getIdSede() != null && this.getIdSede().length() > 0;
     }

     @ValidationMethod(forProperty = "idAula", errorCode = "not.null")
     public boolean validateIdAula() {
         return this.getIdAula() != null && this.getIdAula().length() > 0;
     }

     @ValidationMethod(forProperty = "cursoMinimoParticipantes", errorCode = "not.null")
     public boolean validateCursoMinimoParticipantes() {
         return this.getCursoMinimoParticipantes() != null && this.getCursoMinimoParticipantes().toString().length() > 0;
     }
     
     @ValidationMethod(forProperty = "cursoMinimoParticipantes", errorCode = "not.valid")
     public boolean validateCursoMinimoParticipantesNotValid() {
         if(this.getCursoMinimoParticipantes() == null || this.getCursoMaximoParticipantes() == null ){
             return false;
         }
         if(this.getCursoMinimoParticipantes().intValue() > this.getCursoMaximoParticipantes().intValue() ){
             return false;
         }
         return true;
     }

     // Los combos del horario LUNES debe ir llenos
     @ValidationMethod(forProperty = "dia1", errorCode = "not.valid")
    public boolean validateDia1() {
        if (this.isDia1()) {
            if (this.getIdHorarioInicialCurso1() == null || this.getIdHorarioFinalCurso1() == null || (this.getIdHorarioInicialCurso1() >= this.getIdHorarioFinalCurso1())) {
                return false;
            }
        }
        return true;
    }
     
    // Los combos del horario MARTES debe ir llenos
    @ValidationMethod(forProperty = "dia2", errorCode = "not.valid")
    public boolean validateDia2() {
        if (this.isDia2()) {
           if(this.getIdHorarioInicialCurso2() == null || this.getIdHorarioFinalCurso2() == null || (this.getIdHorarioInicialCurso2() >= this.getIdHorarioFinalCurso2())){
               return false;
           }
        }
        return true;
    }
    
    // Los combos del horario MIERCOLES debe ir llenos
    @ValidationMethod(forProperty = "dia3", errorCode = "not.valid")
    public boolean validateDia3() {
        if (this.isDia3()) {
            if (this.getIdHorarioInicialCurso3() == null || this.getIdHorarioFinalCurso3() == null || (this.getIdHorarioInicialCurso3() >= this.getIdHorarioFinalCurso3())) {
                return false;
            }
        }
        return true;
    }
    
    // Los combos del horario JUEVES debe ir llenos
    @ValidationMethod(forProperty = "dia4", errorCode = "not.valid")
    public boolean validateDia4() {
        if (this.isDia4()) {
            if (this.getIdHorarioInicialCurso4() == null || this.getIdHorarioFinalCurso4() == null || (this.getIdHorarioInicialCurso4() >= this.getIdHorarioFinalCurso4())) {
                return false;
            }
        }
        return true;
    }
    
    // Los combos del horario VIERNES debe ir llenos
    @ValidationMethod(forProperty = "dia5", errorCode = "not.valid")
    public boolean validateDia5() {
        if (this.isDia5()) {
            if (this.getIdHorarioInicialCurso5() == null || this.getIdHorarioFinalCurso5() == null || (this.getIdHorarioInicialCurso5() >= this.getIdHorarioFinalCurso5())) {
                return false;
            }
        }
        return true;
    }
    
    // Los combos del horario SABADO debe ir llenos
    @ValidationMethod(forProperty = "dia6", errorCode = "not.valid")
    public boolean validateDia6() {
        if (this.isDia6()) {
           if (this.getIdHorarioInicialCurso6() == null || this.getIdHorarioFinalCurso6() == null || (this.getIdHorarioInicialCurso6() >= this.getIdHorarioFinalCurso6())){
               return false;
           }
        }
        return true;
    }

    @ValidationMethod(forProperty = "dia7", errorCode = "not.valid")
    public boolean validateDia7() {
        if (this.isDia7()) {
            if (this.getIdHorarioInicialCurso7() == null || this.getIdHorarioFinalCurso7() == null || (this.getIdHorarioInicialCurso7() >= this.getIdHorarioFinalCurso7())) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Valida que la duracion del curso corresponda con el numero de horas sumadas en la seleccion del horario
     * @return boolean
     */
    @ValidationMethod(forProperty = "cursoDuracion", errorCode = "not.valid", args="numeroHorasHorario,cursoDuracion")
    public boolean validateHorasSemana() {
        if(this.getIdModalidad() != 2 && this.getIdSubprograma() != null && !this.getIdSubprograma().equals("E") ) {
            if(this.getCursoFecIni() == null || this.getCursoFecFin() == null || this.getCursoDuracion() == null){
                this.setNumeroHorasHorario(Float.valueOf(0));
                return false;
            }
    
            int numeroMinutos = 0;
    
            Calendar fechaInicial = Calendar.getInstance();
            Calendar fechaFinal = Calendar.getInstance();
    
            fechaInicial.setTime(cursoFecIni);
            fechaFinal.setTime(cursoFecFin);
            fechaFinal.add(Calendar.DAY_OF_MONTH, 1);
            while (fechaInicial.before(fechaFinal)) {
                int dayOfweek = transformDayOfWeekFromJavaToOracle(fechaInicial.get(Calendar.DAY_OF_WEEK));
                switch (dayOfweek) {
                case 1:
                    numeroMinutos += this.isDia1() ? getMinutos(this.getIdHorarioFinalCurso1()) - getMinutos(this.getIdHorarioInicialCurso1()) : 0;
                    break;
                case 2:
                    numeroMinutos += this.isDia2() ? getMinutos(this.getIdHorarioFinalCurso2()) - getMinutos(this.getIdHorarioInicialCurso2()) : 0;
                    break;
                case 3:
                    numeroMinutos += this.isDia3() ? getMinutos(this.getIdHorarioFinalCurso3()) - getMinutos(this.getIdHorarioInicialCurso3()) : 0;
                    break;
                case 4:
                    numeroMinutos += this.isDia4() ? getMinutos(this.getIdHorarioFinalCurso4()) - getMinutos(this.getIdHorarioInicialCurso4()) : 0;
                    break;
                case 5:
                    numeroMinutos += this.isDia5() ? getMinutos(this.getIdHorarioFinalCurso5()) - getMinutos(this.getIdHorarioInicialCurso5()) : 0;
                    break;
                case 6:
                    numeroMinutos += this.isDia6() ? getMinutos(this.getIdHorarioFinalCurso6()) - getMinutos(this.getIdHorarioInicialCurso6()) : 0;
                    break;
                case 7:
                    numeroMinutos += this.isDia7() ? getMinutos(this.getIdHorarioFinalCurso7()) - getMinutos(this.getIdHorarioInicialCurso7()) : 0;
                    break;
                }
                fechaInicial.add(Calendar.DAY_OF_MONTH, 1);
            }
    
            
            if  ( ((int) (this.getCursoDuracion() * 60)) != numeroMinutos) {
                this.setNumeroHorasHorario( Float.valueOf((float) numeroMinutos / 60) > 0 ? Float.valueOf((float) numeroMinutos / 60) : Float.valueOf(0) );
                return false;
            }
        }
        return true;
    }
    
    private int getMinutos(int numeroHoras){
        int minutos = numeroHoras % 100;
        minutos += (numeroHoras / 100) * 60;
        return minutos;
    }
    
    /**
     * Convierte un DAY_OF_WEEK  de Java a Oracle
     * @param dayOfWeek
     * @return
     */
    private int transformDayOfWeekFromJavaToOracle(int dayOfWeek) {
        return dayOfWeek == 1 ? 7 : dayOfWeek - 1;
    }

    public void setNumeroHorasHorario(Float numeroHorasHorario) {
        this.numeroHorasHorario = numeroHorasHorario;
    }

    public Float getNumeroHorasHorario() {
        return numeroHorasHorario;
    }

    public void setShowHorario(boolean showHorario) {
        this.showHorario = showHorario;
    }

    public boolean isShowHorario() {
        return showHorario;
    }
}
