package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnCapCalendarioCurso extends TnCapCalCurso implements Domain, Serializable{
    
    public String cursoClave;
    public String descCursoPrincipal;
    public String descHorarioCursoInicial;
    public String descHorarioCursoFinal;
    public Integer diaSemana;
    
    public CustomTnCapCalendarioCurso() {
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

    public void setDescHorarioCursoInicial(String descHorarioCursoInicial) {
        this.descHorarioCursoInicial = descHorarioCursoInicial;
    }

    public String getDescHorarioCursoInicial() {
        return descHorarioCursoInicial;
    }

    public void setDescHorarioCursoFinal(String descHorarioCursoFinal) {
        this.descHorarioCursoFinal = descHorarioCursoFinal;
    }

    public String getDescHorarioCursoFinal() {
        return descHorarioCursoFinal;
    }

    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }
}
