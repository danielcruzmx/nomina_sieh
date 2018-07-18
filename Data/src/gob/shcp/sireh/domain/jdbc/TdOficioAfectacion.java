package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdOficioAfectacion data.
 */
public class TdOficioAfectacion implements Domain, Serializable {
    private TdOficioAfectacionPK idComposite;
    private java.lang.String idSitAfectaci;
    private java.lang.String idTipoDocto;
    private java.lang.String ofacTipoAfectaci;
    private java.util.Date fecModifico;
    private java.lang.String ofacAplicaOficio;
    private java.util.Date ofacFecAprobacion;
    private java.util.Date ofacFecModAprob;
    private java.util.Date ofacFecOfic;
    private java.lang.String ofacLeyendaJustif;
    private java.lang.String ofacNumAutoriza;
    private java.lang.String ofacProyRegulA;
    private java.lang.String ofacProyRegulR;
    private double ofacTotalAmpliacion;
    private double ofacTotalReduccion;
    private boolean ofacTotalSecuencia;
    private boolean ofacTotalSecSiaff;
    private java.lang.String ofacUsrAprobacion;
    private java.lang.String usuario;

    /**
     * Constructor for TdOficioAfectacion class.
     */
    public TdOficioAfectacion() {
    }

    /**
     * Constructor for TdOficioAfectacion class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param ofacCiclo java.lang.Integer
     * @param idSitAfectaci java.lang.String
     * @param idTipoDocto java.lang.String
     * @param ofacTipoAfectaci java.lang.String
     * @param fecModifico java.util.Date
     * @param ofacAplicaOficio java.lang.String
     * @param ofacFecAprobacion java.util.Date
     * @param ofacFecModAprob java.util.Date
     * @param ofacFecOfic java.util.Date
     * @param ofacLeyendaJustif java.lang.String
     * @param ofacNumAutoriza java.lang.String
     * @param ofacProyRegulA java.lang.String
     * @param ofacProyRegulR java.lang.String
     * @param ofacTotalAmpliacion double
     * @param ofacTotalReduccion double
     * @param ofacTotalSecuencia boolean
     * @param ofacTotalSecSiaff boolean
     * @param ofacUsrAprobacion java.lang.String
     * @param usuario java.lang.String
     */
    public TdOficioAfectacion(TdOficioAfectacionPK idComposite, 
                              java.lang.String idSitAfectaci, 
                              java.lang.String idTipoDocto, 
                              java.lang.String ofacTipoAfectaci, 
                              java.util.Date fecModifico, 
                              java.lang.String ofacAplicaOficio, 
                              java.util.Date ofacFecAprobacion, 
                              java.util.Date ofacFecModAprob, 
                              java.util.Date ofacFecOfic, 
                              java.lang.String ofacLeyendaJustif, 
                              java.lang.String ofacNumAutoriza, 
                              java.lang.String ofacProyRegulA, 
                              java.lang.String ofacProyRegulR, 
                              double ofacTotalAmpliacion, 
                              double ofacTotalReduccion, 
                              boolean ofacTotalSecuencia, 
                              boolean ofacTotalSecSiaff, 
                              java.lang.String ofacUsrAprobacion, 
                              java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idSitAfectaci = idSitAfectaci;
        this.idTipoDocto = idTipoDocto;
        this.ofacTipoAfectaci = ofacTipoAfectaci;
        this.fecModifico = fecModifico;
        this.ofacAplicaOficio = ofacAplicaOficio;
        this.ofacFecAprobacion = ofacFecAprobacion;
        this.ofacFecModAprob = ofacFecModAprob;
        this.ofacFecOfic = ofacFecOfic;
        this.ofacLeyendaJustif = ofacLeyendaJustif;
        this.ofacNumAutoriza = ofacNumAutoriza;
        this.ofacProyRegulA = ofacProyRegulA;
        this.ofacProyRegulR = ofacProyRegulR;
        this.ofacTotalAmpliacion = ofacTotalAmpliacion;
        this.ofacTotalReduccion = ofacTotalReduccion;
        this.ofacTotalSecuencia = ofacTotalSecuencia;
        this.ofacTotalSecSiaff = ofacTotalSecSiaff;
        this.ofacUsrAprobacion = ofacUsrAprobacion;
        this.usuario = usuario;
    }

    /**
     * Get idOficioAfecta value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdOficioAfecta() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdOficioAfecta();
    }

    /**
     * Get ofacCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getOfacCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getOfacCiclo();
    }

    /**
     * Get idSitAfectaci value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitAfectaci() {
        return this.idSitAfectaci;
    }

    /**
     * Get idTipoDocto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoDocto() {
        return this.idTipoDocto;
    }

    /**
     * Get ofacTipoAfectaci value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacTipoAfectaci() {
        return this.ofacTipoAfectaci;
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
     * Get ofacAplicaOficio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacAplicaOficio() {
        return this.ofacAplicaOficio;
    }

    /**
     * Get ofacFecAprobacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecAprobacion() {
        return this.ofacFecAprobacion;
    }

    /**
     * Get ofacFecModAprob value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecModAprob() {
        return this.ofacFecModAprob;
    }

    /**
     * Get ofacFecOfic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getOfacFecOfic() {
        return this.ofacFecOfic;
    }

    /**
     * Get ofacLeyendaJustif value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacLeyendaJustif() {
        return this.ofacLeyendaJustif;
    }

    /**
     * Get ofacNumAutoriza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacNumAutoriza() {
        return this.ofacNumAutoriza;
    }

    /**
     * Get ofacProyRegulA value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacProyRegulA() {
        return this.ofacProyRegulA;
    }

    /**
     * Get ofacProyRegulR value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacProyRegulR() {
        return this.ofacProyRegulR;
    }

    /**
     * Get ofacTotalAmpliacion value.
     *
     * @return double
     */
    public double getOfacTotalAmpliacion() {
        return this.ofacTotalAmpliacion;
    }

    /**
     * Get ofacTotalReduccion value.
     *
     * @return double
     */
    public double getOfacTotalReduccion() {
        return this.ofacTotalReduccion;
    }

    /**
     * Get ofacTotalSecuencia value.
     *
     * @return boolean
     */
    public boolean isOfacTotalSecuencia() {
        return this.ofacTotalSecuencia;
    }

    /**
     * Get ofacTotalSecSiaff value.
     *
     * @return boolean
     */
    public boolean isOfacTotalSecSiaff() {
        return this.ofacTotalSecSiaff;
    }

    /**
     * Get ofacUsrAprobacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getOfacUsrAprobacion() {
        return this.ofacUsrAprobacion;
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
     * Set idOficioAfecta value.
     *
     * @param idOficioAfecta java.lang.Long
     */
    public void setIdOficioAfecta(java.lang.Long idOficioAfecta) {
        if (idComposite == null) {
            idComposite = new TdOficioAfectacionPK();
        }
        this.idComposite.setIdOficioAfecta(idOficioAfecta);
    }

    /**
     * Set ofacCiclo value.
     *
     * @param ofacCiclo java.lang.Integer
     */
    public void setOfacCiclo(java.lang.Integer ofacCiclo) {
        if (idComposite == null) {
            idComposite = new TdOficioAfectacionPK();
        }
        this.idComposite.setOfacCiclo(ofacCiclo);
    }

    /**
     * Set idSitAfectaci value.
     *
     * @param idSitAfectaci java.lang.String
     */
    public void setIdSitAfectaci(java.lang.String idSitAfectaci) {
        this.idSitAfectaci = idSitAfectaci;
    }

    /**
     * Set idTipoDocto value.
     *
     * @param idTipoDocto java.lang.String
     */
    public void setIdTipoDocto(java.lang.String idTipoDocto) {
        this.idTipoDocto = idTipoDocto;
    }

    /**
     * Set ofacTipoAfectaci value.
     *
     * @param ofacTipoAfectaci java.lang.String
     */
    public void setOfacTipoAfectaci(java.lang.String ofacTipoAfectaci) {
        this.ofacTipoAfectaci = ofacTipoAfectaci;
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
     * Set ofacAplicaOficio value.
     *
     * @param ofacAplicaOficio java.lang.String
     */
    public void setOfacAplicaOficio(java.lang.String ofacAplicaOficio) {
        this.ofacAplicaOficio = ofacAplicaOficio;
    }

    /**
     * Set ofacFecAprobacion value.
     *
     * @param ofacFecAprobacion java.util.Date
     */
    public void setOfacFecAprobacion(java.util.Date ofacFecAprobacion) {
        this.ofacFecAprobacion = ofacFecAprobacion;
    }

    /**
     * Set ofacFecModAprob value.
     *
     * @param ofacFecModAprob java.util.Date
     */
    public void setOfacFecModAprob(java.util.Date ofacFecModAprob) {
        this.ofacFecModAprob = ofacFecModAprob;
    }

    /**
     * Set ofacFecOfic value.
     *
     * @param ofacFecOfic java.util.Date
     */
    public void setOfacFecOfic(java.util.Date ofacFecOfic) {
        this.ofacFecOfic = ofacFecOfic;
    }

    /**
     * Set ofacLeyendaJustif value.
     *
     * @param ofacLeyendaJustif java.lang.String
     */
    public void setOfacLeyendaJustif(java.lang.String ofacLeyendaJustif) {
        this.ofacLeyendaJustif = ofacLeyendaJustif;
    }

    /**
     * Set ofacNumAutoriza value.
     *
     * @param ofacNumAutoriza java.lang.String
     */
    public void setOfacNumAutoriza(java.lang.String ofacNumAutoriza) {
        this.ofacNumAutoriza = ofacNumAutoriza;
    }

    /**
     * Set ofacProyRegulA value.
     *
     * @param ofacProyRegulA java.lang.String
     */
    public void setOfacProyRegulA(java.lang.String ofacProyRegulA) {
        this.ofacProyRegulA = ofacProyRegulA;
    }

    /**
     * Set ofacProyRegulR value.
     *
     * @param ofacProyRegulR java.lang.String
     */
    public void setOfacProyRegulR(java.lang.String ofacProyRegulR) {
        this.ofacProyRegulR = ofacProyRegulR;
    }

    /**
     * Set ofacTotalAmpliacion value.
     *
     * @param ofacTotalAmpliacion double
     */
    public void setOfacTotalAmpliacion(double ofacTotalAmpliacion) {
        this.ofacTotalAmpliacion = ofacTotalAmpliacion;
    }

    /**
     * Set ofacTotalReduccion value.
     *
     * @param ofacTotalReduccion double
     */
    public void setOfacTotalReduccion(double ofacTotalReduccion) {
        this.ofacTotalReduccion = ofacTotalReduccion;
    }

    /**
     * Set ofacTotalSecuencia value.
     *
     * @param ofacTotalSecuencia boolean
     */
    public void setOfacTotalSecuencia(boolean ofacTotalSecuencia) {
        this.ofacTotalSecuencia = ofacTotalSecuencia;
    }

    /**
     * Set ofacTotalSecSiaff value.
     *
     * @param ofacTotalSecSiaff boolean
     */
    public void setOfacTotalSecSiaff(boolean ofacTotalSecSiaff) {
        this.ofacTotalSecSiaff = ofacTotalSecSiaff;
    }

    /**
     * Set ofacUsrAprobacion value.
     *
     * @param ofacUsrAprobacion java.lang.String
     */
    public void setOfacUsrAprobacion(java.lang.String ofacUsrAprobacion) {
        this.ofacUsrAprobacion = ofacUsrAprobacion;
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
        this.idComposite = (TdOficioAfectacionPK)idComposite;
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
