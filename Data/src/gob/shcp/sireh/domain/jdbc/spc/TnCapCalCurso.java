package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapCalendarioCurso data.
 */
public class TnCapCalCurso implements Domain, Serializable {
    private TnCapCalendarioCursoPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TnCapCalendarioCurso class.
     */
    public TnCapCalCurso() {
    }

    /**
     * Constructor for TnCapCalendarioCurso class.
     *
     * @param fecha java.util.Date
     * @param idCurso java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TnCapCalCurso(TnCapCalendarioCursoPK idComposite, java.util.Date fecModifico, java.lang.String usuario) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get fecha value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecha() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getFecha();
    }

    /**
     * Get idCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdCurso() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCurso();
    }

    /**
     * Get idHorarioCursoFinal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoFinal() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdHorarioCursoFinal();
    }

    /**
     * Get idHorarioCursoInicial value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdHorarioCursoInicial() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdHorarioCursoInicial();
    }

    /**
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }


    /**
     * Set fecha value.
     *
     * @param fecha java.util.Date
     */
    public void setFecha(java.util.Date fecha) {
        if (idComposite == null) {
            idComposite = new TnCapCalendarioCursoPK();
        }
        this.idComposite.setFecha(fecha);
    }

    /**
     * Set idCurso value.
     *
     * @param idCurso java.lang.Integer
     */
    public void setIdCurso(java.lang.Integer idCurso) {
        if (idComposite == null) {
            idComposite = new TnCapCalendarioCursoPK();
        }
        this.idComposite.setIdCurso(idCurso);
    }

    /**
     * Set idHorarioCursoFinal value.
     *
     * @param idHorarioCursoFinal java.lang.Integer
     */
    public void setIdHorarioCursoFinal(java.lang.Integer idHorarioCursoFinal) {
        if (idComposite == null) {
            idComposite = new TnCapCalendarioCursoPK();
        }
        this.idComposite.setIdHorarioCursoFinal(idHorarioCursoFinal);
    }

    /**
     * Set idHorarioCursoInicial value.
     *
     * @param idHorarioCursoInicial java.lang.Integer
     */
    public void setIdHorarioCursoInicial(java.lang.Integer idHorarioCursoInicial) {
        if (idComposite == null) {
            idComposite = new TnCapCalendarioCursoPK();
        }
        this.idComposite.setIdHorarioCursoInicial(idHorarioCursoInicial);
    }

    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnCapCalendarioCursoPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }
}
