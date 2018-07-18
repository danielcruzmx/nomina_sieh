package gob.shcp.sireh.domain.jdbc.servicios;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdBitacoraUpdateTabla data.
 */
public class TdBitacoraUpdateTabla implements Domain, Serializable {
                    @PrimaryKey
            private java.lang.Integer idBitacora;
                private java.lang.String debeDecir;
                private java.lang.String dice;
                private java.lang.String encabezadoTabla;
                private java.lang.String ipOrigen;
                private java.lang.String motivoModifica;
                private java.lang.String tablaModificada;
    
    /**
     * Constructor for TdBitacoraUpdateTabla class.
     */
    public TdBitacoraUpdateTabla() { }
                                
    /**
     * Constructor for TdBitacoraUpdateTabla class.
     *
     * @param idBitacora java.lang.Integer
     * @param debeDecir java.lang.String
     * @param dice java.lang.String
     * @param encabezadoTabla java.lang.String
     * @param ipOrigen java.lang.String
     * @param motivoModifica java.lang.String
     * @param tablaModificada java.lang.String
     */
    public TdBitacoraUpdateTabla( java.lang.Integer idBitacora, java.lang.String debeDecir, java.lang.String dice, java.lang.String encabezadoTabla, java.lang.String ipOrigen, java.lang.String motivoModifica, java.lang.String tablaModificada) {
            this.idBitacora = idBitacora;
            this.debeDecir = debeDecir;
            this.dice = dice;
            this.encabezadoTabla = encabezadoTabla;
            this.ipOrigen = ipOrigen;
            this.motivoModifica = motivoModifica;
            this.tablaModificada = tablaModificada;
        }


    /**
     * Get idBitacora value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdBitacora() {
            return this.idBitacora;
        }

    /**
     * Get debeDecir value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDebeDecir() {
            return this.debeDecir;
        }

    /**
     * Get dice value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDice() {
            return this.dice;
        }

    /**
     * Get encabezadoTabla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getEncabezadoTabla() {
            return this.encabezadoTabla;
        }

    /**
     * Get ipOrigen value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIpOrigen() {
            return this.ipOrigen;
        }

    /**
     * Get motivoModifica value.
     *
     * @return java.lang.String
     */
    public java.lang.String getMotivoModifica() {
            return this.motivoModifica;
        }

    /**
     * Get tablaModificada value.
     *
     * @return java.lang.String
     */
    public java.lang.String getTablaModificada() {
            return this.tablaModificada;
        }

    
    /**
     * Set idBitacora value.
     *
     * @param idBitacora java.lang.Integer
     */
    public void setIdBitacora(java.lang.Integer idBitacora) {
            this.idBitacora = idBitacora;
        }
    
    /**
     * Set debeDecir value.
     *
     * @param debeDecir java.lang.String
     */
    public void setDebeDecir(java.lang.String debeDecir) {
            this.debeDecir = debeDecir;
        }
    
    /**
     * Set dice value.
     *
     * @param dice java.lang.String
     */
    public void setDice(java.lang.String dice) {
            this.dice = dice;
        }
    
    /**
     * Set encabezadoTabla value.
     *
     * @param encabezadoTabla java.lang.String
     */
    public void setEncabezadoTabla(java.lang.String encabezadoTabla) {
            this.encabezadoTabla = encabezadoTabla;
        }
    
    /**
     * Set ipOrigen value.
     *
     * @param ipOrigen java.lang.String
     */
    public void setIpOrigen(java.lang.String ipOrigen) {
            this.ipOrigen = ipOrigen;
        }
    
    /**
     * Set motivoModifica value.
     *
     * @param motivoModifica java.lang.String
     */
    public void setMotivoModifica(java.lang.String motivoModifica) {
            this.motivoModifica = motivoModifica;
        }
    
    /**
     * Set tablaModificada value.
     *
     * @param tablaModificada java.lang.String
     */
    public void setTablaModificada(java.lang.String tablaModificada) {
            this.tablaModificada = tablaModificada;
        }


    /**
     * Set identity value.
     *
     * @param idBitacora Serializable
     */
    public void setIdentity(Serializable idBitacora) {
        this.idBitacora = ( java.lang.Integer ) idBitacora;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idBitacora;
    }
}
