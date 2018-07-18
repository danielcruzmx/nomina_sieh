package gob.shcp.sireh.domain.jdbc;

import java.io.Serializable;

/**
 * Composed primary object for TcTabulador data.
 */
public class TcTabuladorPK implements Serializable {
    private java.lang.String idNivelPto;
    private java.lang.Integer idRango;
    private java.lang.Integer idZonaEcon;
    private java.util.Date tabFin;

    /**
     * Constructor for TcTabuladorPK class.
     */
    public TcTabuladorPK() {
    }

    /**
     * Constructor for TcTabuladorPK class.
     *
     * @param idNivelPto java.lang.String
     * @param idRango java.lang.Integer
     * @param idZonaEcon java.lang.Integer
     * @param tabFin java.util.Date
     */
    public TcTabuladorPK(java.lang.String idNivelPto, 
                         java.lang.Integer idRango, 
                         java.lang.Integer idZonaEcon, java.util.Date tabFin) {
        this.idNivelPto = idNivelPto;
        this.idRango = idRango;
        this.idZonaEcon = idZonaEcon;
        this.tabFin = tabFin;

    }

    /**
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
    }

    /**
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    /**
     * Get idRango value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRango() {
        return this.idRango;
    }

    /**
     * Set idRango value.
     *
     * @param idRango java.lang.Integer
     */
    public void setIdRango(java.lang.Integer idRango) {
        this.idRango = idRango;
    }

    /**
     * Get idZonaEcon value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcon() {
        return this.idZonaEcon;
    }

    /**
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Integer
     */
    public void setIdZonaEcon(java.lang.Integer idZonaEcon) {
        this.idZonaEcon = idZonaEcon;
    }

    /**
     * Get tabFin value.
     *
     * @return java.util.Date
     */
    public java.util.Date getTabFin() {
        return this.tabFin;
    }

    /**
     * Set tabFin value.
     *
     * @param tabFin java.util.Date
     */
    public void setTabFin(java.util.Date tabFin) {
        this.tabFin = tabFin;
    }

}
