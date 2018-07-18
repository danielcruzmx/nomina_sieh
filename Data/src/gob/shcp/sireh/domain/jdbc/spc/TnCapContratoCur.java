package gob.shcp.sireh.domain.jdbc.spc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnCapContratoCur data.
 */
public class TnCapContratoCur implements Domain, Serializable {
                    @PrimaryKey
            private java.lang.Integer idContratoCurso;
                private int idSituacionContrato;
                private int idTipoContratacion;
                private int contratoCursoCiclo;
                private java.lang.String contratoCursoDesc;
                private java.lang.String contratoCursoNumero;
                private java.lang.String contratoCursoRep1;
                private java.util.Date fecModifico;
                private java.lang.String usuario;
                private java.lang.String contratoCursoAdministrador;
                private java.util.Date contratoCursoFechaAdjud;
                private java.util.Date contratoCursoFechaContr;
                private java.lang.Double contratoCursoMonto;
                private java.lang.String contratoCursoRep2;
                private java.lang.String contratoCursoRep3;
    
    /**
     * Constructor for TnCapContratoCur class.
     */
    public TnCapContratoCur() { }
                                                                
    /**
     * Constructor for TnCapContratoCur class.
     *
     * @param idContratoCurso java.lang.Integer
     * @param idSituacionContrato int
     * @param idTipoContratacion int
     * @param contratoCursoCiclo int
     * @param contratoCursoDesc java.lang.String
     * @param contratoCursoNumero java.lang.String
     * @param contratoCursoRep1 java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param contratoCursoAdministrador java.lang.String
     * @param contratoCursoFechaAdjud java.util.Date
     * @param contratoCursoFechaContr java.util.Date
     * @param contratoCursoMonto java.lang.Double
     * @param contratoCursoRep2 java.lang.String
     * @param contratoCursoRep3 java.lang.String
     */
    public TnCapContratoCur( java.lang.Integer idContratoCurso, int idSituacionContrato, int idTipoContratacion, int contratoCursoCiclo, java.lang.String contratoCursoDesc, java.lang.String contratoCursoNumero, java.lang.String contratoCursoRep1, java.util.Date fecModifico, java.lang.String usuario, java.lang.String contratoCursoAdministrador, java.util.Date contratoCursoFechaAdjud, java.util.Date contratoCursoFechaContr, java.lang.Double contratoCursoMonto, java.lang.String contratoCursoRep2, java.lang.String contratoCursoRep3) {
            this.idContratoCurso = idContratoCurso;
            this.idSituacionContrato = idSituacionContrato;
            this.idTipoContratacion = idTipoContratacion;
            this.contratoCursoCiclo = contratoCursoCiclo;
            this.contratoCursoDesc = contratoCursoDesc;
            this.contratoCursoNumero = contratoCursoNumero;
            this.contratoCursoRep1 = contratoCursoRep1;
            this.fecModifico = fecModifico;
            this.usuario = usuario;
            this.contratoCursoAdministrador = contratoCursoAdministrador;
            this.contratoCursoFechaAdjud = contratoCursoFechaAdjud;
            this.contratoCursoFechaContr = contratoCursoFechaContr;
            this.contratoCursoMonto = contratoCursoMonto;
            this.contratoCursoRep2 = contratoCursoRep2;
            this.contratoCursoRep3 = contratoCursoRep3;
        }


    /**
     * Get idContratoCurso value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdContratoCurso() {
            return this.idContratoCurso;
        }

    /**
     * Get idSituacionContrato value.
     *
     * @return int
     */
    public int getIdSituacionContrato() {
            return this.idSituacionContrato;
        }

    /**
     * Get idTipoContratacion value.
     *
     * @return int
     */
    public int getIdTipoContratacion() {
            return this.idTipoContratacion;
        }

    /**
     * Get contratoCursoCiclo value.
     *
     * @return int
     */
    public int getContratoCursoCiclo() {
            return this.contratoCursoCiclo;
        }

    /**
     * Get contratoCursoDesc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoDesc() {
            return this.contratoCursoDesc;
        }

    /**
     * Get contratoCursoNumero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoNumero() {
            return this.contratoCursoNumero;
        }

    /**
     * Get contratoCursoRep1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep1() {
            return this.contratoCursoRep1;
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
     * Get contratoCursoAdministrador value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoAdministrador() {
            return this.contratoCursoAdministrador;
        }

    /**
     * Get contratoCursoFechaAdjud value.
     *
     * @return java.util.Date
     */
    public java.util.Date getContratoCursoFechaAdjud() {
            return this.contratoCursoFechaAdjud;
        }

    /**
     * Get contratoCursoFechaContr value.
     *
     * @return java.util.Date
     */
    public java.util.Date getContratoCursoFechaContr() {
            return this.contratoCursoFechaContr;
        }

    /**
     * Get contratoCursoMonto value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getContratoCursoMonto() {
            return this.contratoCursoMonto;
        }

    /**
     * Get contratoCursoRep2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep2() {
            return this.contratoCursoRep2;
        }

    /**
     * Get contratoCursoRep3 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getContratoCursoRep3() {
            return this.contratoCursoRep3;
        }

    
    /**
     * Set idContratoCurso value.
     *
     * @param idContratoCurso java.lang.Integer
     */
    public void setIdContratoCurso(java.lang.Integer idContratoCurso) {
            this.idContratoCurso = idContratoCurso;
        }
    
    /**
     * Set idSituacionContrato value.
     *
     * @param idSituacionContrato int
     */
    public void setIdSituacionContrato(int idSituacionContrato) {
            this.idSituacionContrato = idSituacionContrato;
        }
    
    /**
     * Set idTipoContratacion value.
     *
     * @param idTipoContratacion int
     */
    public void setIdTipoContratacion(int idTipoContratacion) {
            this.idTipoContratacion = idTipoContratacion;
        }
    
    /**
     * Set contratoCursoCiclo value.
     *
     * @param contratoCursoCiclo int
     */
    public void setContratoCursoCiclo(int contratoCursoCiclo) {
            this.contratoCursoCiclo = contratoCursoCiclo;
        }
    
    /**
     * Set contratoCursoDesc value.
     *
     * @param contratoCursoDesc java.lang.String
     */
    public void setContratoCursoDesc(java.lang.String contratoCursoDesc) {
            this.contratoCursoDesc = contratoCursoDesc;
        }
    
    /**
     * Set contratoCursoNumero value.
     *
     * @param contratoCursoNumero java.lang.String
     */
    public void setContratoCursoNumero(java.lang.String contratoCursoNumero) {
            this.contratoCursoNumero = contratoCursoNumero;
        }
    
    /**
     * Set contratoCursoRep1 value.
     *
     * @param contratoCursoRep1 java.lang.String
     */
    public void setContratoCursoRep1(java.lang.String contratoCursoRep1) {
            this.contratoCursoRep1 = contratoCursoRep1;
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
     * Set contratoCursoAdministrador value.
     *
     * @param contratoCursoAdministrador java.lang.String
     */
    public void setContratoCursoAdministrador(java.lang.String contratoCursoAdministrador) {
            this.contratoCursoAdministrador = contratoCursoAdministrador;
        }
    
    /**
     * Set contratoCursoFechaAdjud value.
     *
     * @param contratoCursoFechaAdjud java.util.Date
     */
    public void setContratoCursoFechaAdjud(java.util.Date contratoCursoFechaAdjud) {
            this.contratoCursoFechaAdjud = contratoCursoFechaAdjud;
        }
    
    /**
     * Set contratoCursoFechaContr value.
     *
     * @param contratoCursoFechaContr java.util.Date
     */
    public void setContratoCursoFechaContr(java.util.Date contratoCursoFechaContr) {
            this.contratoCursoFechaContr = contratoCursoFechaContr;
        }
    
    /**
     * Set contratoCursoMonto value.
     *
     * @param contratoCursoMonto java.lang.Double
     */
    public void setContratoCursoMonto(java.lang.Double contratoCursoMonto) {
            this.contratoCursoMonto = contratoCursoMonto;
        }
    
    /**
     * Set contratoCursoRep2 value.
     *
     * @param contratoCursoRep2 java.lang.String
     */
    public void setContratoCursoRep2(java.lang.String contratoCursoRep2) {
            this.contratoCursoRep2 = contratoCursoRep2;
        }
    
    /**
     * Set contratoCursoRep3 value.
     *
     * @param contratoCursoRep3 java.lang.String
     */
    public void setContratoCursoRep3(java.lang.String contratoCursoRep3) {
            this.contratoCursoRep3 = contratoCursoRep3;
        }


    /**
     * Set identity value.
     *
     * @param idContratoCurso Serializable
     */
    public void setIdentity(Serializable idContratoCurso) {
        this.idContratoCurso = ( java.lang.Integer ) idContratoCurso;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idContratoCurso;
    }
}
