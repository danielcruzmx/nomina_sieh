package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;


import java.io.Serializable;

/**
 * Domain object for persistent TcCapNotifCurso data.
 */
public class TcCapNotifCurso implements Domain, Serializable {
    private TcCapNotifCursoPK idComposite;
                                        private java.lang.String capNotifCursoAsunto;
                        private java.lang.String capNotifCursoMsg;
                        private java.util.Date fecModifico;
                        private java.lang.String idStatus;
                        private java.lang.String usuario;
            
    /**
     * Constructor for TcCapNotifCurso class.
     */
    public TcCapNotifCurso() { }
                                                                                                                                
    /**
     * Constructor for TcCapNotifCurso class.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     * @param idModalidad java.lang.Integer
     * @param capNotifCursoAsunto java.lang.String
     * @param capNotifCursoMsg java.lang.String
     * @param fecModifico java.util.Date
     * @param idStatus java.lang.String
     * @param usuario java.lang.String
     */
    public TcCapNotifCurso( TcCapNotifCursoPK idComposite, java.lang.String capNotifCursoAsunto, java.lang.String capNotifCursoMsg, java.util.Date fecModifico, java.lang.String idStatus, java.lang.String usuario) {
        this.idComposite = idComposite;
                                            this.capNotifCursoAsunto = capNotifCursoAsunto;
                            this.capNotifCursoMsg = capNotifCursoMsg;
                            this.fecModifico = fecModifico;
                            this.idStatus = idStatus;
                            this.usuario = usuario;
                }


    /**
     * Get capNotifCursoCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCapNotifCursoCiclo() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getCapNotifCursoCiclo();
        }

    /**
     * Get idModalidad value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdModalidad() {
            if(idComposite == null) {
            return null;
        }
        return this.idComposite.getIdModalidad();
        }

    /**
     * Get capNotifCursoAsunto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapNotifCursoAsunto() {
            return this.capNotifCursoAsunto;
        }

    /**
     * Get capNotifCursoMsg value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCapNotifCursoMsg() {
            return this.capNotifCursoMsg;
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
     * Get idStatus value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdStatus() {
            return this.idStatus;
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
     * Set capNotifCursoCiclo value.
     *
     * @param capNotifCursoCiclo java.lang.Integer
     */
    public void setCapNotifCursoCiclo(java.lang.Integer capNotifCursoCiclo) {
            if(idComposite == null) {
            idComposite = new TcCapNotifCursoPK();
        }
        this.idComposite.setCapNotifCursoCiclo(capNotifCursoCiclo);
        }
    
    /**
     * Set idModalidad value.
     *
     * @param idModalidad java.lang.Integer
     */
    public void setIdModalidad(java.lang.Integer idModalidad) {
            if(idComposite == null) {
            idComposite = new TcCapNotifCursoPK();
        }
        this.idComposite.setIdModalidad(idModalidad);
        }
    
    /**
     * Set capNotifCursoAsunto value.
     *
     * @param capNotifCursoAsunto java.lang.String
     */
    public void setCapNotifCursoAsunto(java.lang.String capNotifCursoAsunto) {
            this.capNotifCursoAsunto = capNotifCursoAsunto;
        }
    
    /**
     * Set capNotifCursoMsg value.
     *
     * @param capNotifCursoMsg java.lang.String
     */
    public void setCapNotifCursoMsg(java.lang.String capNotifCursoMsg) {
            this.capNotifCursoMsg = capNotifCursoMsg;
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
     * Set idStatus value.
     *
     * @param idStatus java.lang.String
     */
    public void setIdStatus(java.lang.String idStatus) {
            this.idStatus = idStatus;
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
        this.idComposite = (TcCapNotifCursoPK ) idComposite;
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
