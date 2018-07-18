package gob.shcp.sireh.domain.jdbc.spc;

import java.io.Serializable;

/**
 * Composed primary object for TnCapCalendarioCurso data.
 */
public class TnCapCalendarioCursoPK implements Serializable {
    private java.util.Date fecha;
    private java.lang.Integer idCurso;
    private java.lang.Integer idHorarioCursoFinal;
    private java.lang.Integer idHorarioCursoInicial;

    /**
     * Constructor for TnCapCalendarioCursoPK class.
     */
    public TnCapCalendarioCursoPK() {
    }
    
    /**
     * Constructor for TnCapCalendarioCursoPK class.
     *
     * @param fecha java.util.Date
     * @param idCurso java.lang.Integer
     * @param idHorarioCursoFinal java.lang.Integer
     * @param idHorarioCursoInicial java.lang.Integer
     */
    public TnCapCalendarioCursoPK(java.util.Date fecha, java.lang.Integer idCurso, 
                                  java.lang.Integer idHorarioCursoFinal, java.lang.Integer idHorarioCursoInicial) {
        this.fecha = fecha;
        this.idCurso = idCurso;
        this.idHorarioCursoFinal = idHorarioCursoFinal;
        this.idHorarioCursoInicial = idHorarioCursoInicial;

    }
    
    /**
     * Get fecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecha() {
        return this.fecha;
    }

    /**
     * Set fecha value.
     *
     * @param fecha java.util.Date
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        return this.idCurso;
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * Get idHorarioCursoFinal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoFinal() {
        return this.idHorarioCursoFinal;
    }

    /**
     * Set idHorarioCursoFinal value.
     *
     * @param idHorarioCursoFinal java.lang.Integer
     */
    public void setIdHorarioCursoFinal(java.lang.Integer idHorarioCursoFinal) {
        this.idHorarioCursoFinal = idHorarioCursoFinal;
    }

    /**
     * Get idHorarioCursoInicial value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoInicial() {
        return this.idHorarioCursoInicial;
    }

    /**
     * Set idHorarioCursoInicial value.
     *
     * @param idHorarioCursoInicial java.lang.Integer
     */
    public void setIdHorarioCursoInicial(java.lang.Integer idHorarioCursoInicial) {
        this.idHorarioCursoInicial = idHorarioCursoInicial;
    }

}
