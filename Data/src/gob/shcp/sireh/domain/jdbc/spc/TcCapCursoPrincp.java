package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TcCapCursoPrincipal data.
 */
public class TcCapCursoPrincp implements Domain, Serializable {
    private TcCapCursoPrincplPK idComposite;
    private java.lang.String idCapacidadCert;
    private int idCaracter;
    private int idFinalidad;
    private int idModalidad;
    private java.lang.String descCursoPrincipal;
    private java.util.Date fecModifico;
    private java.lang.String usuario;

    /**
     * Constructor for TcCapCursoPrincipal class.
     */
    public TcCapCursoPrincp() {
    }

    /**
     * Constructor for TcCapCursoPrincipal class.
     *
     * @param cicloEjeTematico java.lang.Integer
     * @param idCursoPrincipal java.lang.String
     * @param idEjeTematico java.lang.String
     * @param idCapacidadCert String
     * @param idCaracter int
     * @param idFinalidad int
     * @param idModalidad int
     * @param descCursoPrincipal java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     */
    public TcCapCursoPrincp(TcCapCursoPrincplPK idComposite, String idCapacidadCert, int idCaracter, 
                               int idFinalidad, int idModalidad, java.lang.String descCursoPrincipal, 
                               java.util.Date fecModifico, java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idCapacidadCert = idCapacidadCert;
        this.idCaracter = idCaracter;
        this.idFinalidad = idFinalidad;
        this.idModalidad = idModalidad;
        this.descCursoPrincipal = descCursoPrincipal;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
    }

    /**
     * Get cicloEjeTematico value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCicloEjeTematico() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getCicloEjeTematico();
    }

    /**
     * Get idCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdCursoPrincipal() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdCursoPrincipal();
    }

    /**
     * Get idEjeTematico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEjeTematico() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdEjeTematico();
    }

    /**
     * Get idCaracter value.
     *
     * @return int
     */
    public int getIdCaracter() {
        return this.idCaracter;
    }

    /**
     * Get idFinalidad value.
     *
     * @return int
     */
    public int getIdFinalidad() {
        return this.idFinalidad;
    }

    /**
     * Get idModalidad value.
     *
     * @return int
     */
    public int getIdModalidad() {
        return this.idModalidad;
    }

    /**
     * Get descCursoPrincipal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescCursoPrincipal() {
        return this.descCursoPrincipal;
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
     * Set cicloEjeTematico value.
     *
     * @param cicloEjeTematico java.lang.Integer
     */
    public void setCicloEjeTematico(java.lang.Integer cicloEjeTematico) {
        if (idComposite == null) {
            idComposite = new TcCapCursoPrincplPK();
        }
        this.idComposite.setCicloEjeTematico(cicloEjeTematico);
    }

    /**
     * Set idCursoPrincipal value.
     *
     * @param idCursoPrincipal java.lang.String
     */
    public void setIdCursoPrincipal(java.lang.String idCursoPrincipal) {
        if (idComposite == null) {
            idComposite = new TcCapCursoPrincplPK();
        }
        this.idComposite.setIdCursoPrincipal(idCursoPrincipal);
    }

    /**
     * Set idEjeTematico value.
     *
     * @param idEjeTematico java.lang.String
     */
    public void setIdEjeTematico(java.lang.String idEjeTematico) {
        if (idComposite == null) {
            idComposite = new TcCapCursoPrincplPK();
        }
        this.idComposite.setIdEjeTematico(idEjeTematico);
    }

    /**
     * Set idCaracter value.
     *
     * @param idCaracter int
     */
    public void setIdCaracter(int idCaracter) {
        this.idCaracter = idCaracter;
    }

    /**
     * Set idFinalidad value.
     *
     * @param idFinalidad int
     */
    public void setIdFinalidad(int idFinalidad) {
        this.idFinalidad = idFinalidad;
    }

    /**
     * Set idModalidad value.
     *
     * @param idModalidad int
     */
    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    /**
     * Set descCursoPrincipal value.
     *
     * @param descCursoPrincipal java.lang.String
     */
    public void setDescCursoPrincipal(java.lang.String descCursoPrincipal) {
        this.descCursoPrincipal = descCursoPrincipal;
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
        this.idComposite = (TcCapCursoPrincplPK)idComposite;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idComposite;
    }

    public void setIdCapacidadCert(String idCapacidadCert) {
        this.idCapacidadCert = idCapacidadCert;
    }

    public String getIdCapacidadCert() {
        return idCapacidadCert;
    }
}
