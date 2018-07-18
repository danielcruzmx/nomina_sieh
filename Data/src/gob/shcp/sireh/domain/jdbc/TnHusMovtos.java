package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TnHusMovtos data.
 */
public class TnHusMovtos implements Domain, Serializable {
    private TnHusMovtoPK idComposite;
    private java.util.Date fecModifico;
    private float husmovComp;
    private int husmovMotivo;
    private java.lang.String husmovNivPto;
    private boolean husmovNivTab;
    private float husmovOtrasPer;
    private int husmovPtda;
    private float husmovQuinq;
    private float husmovSalMin;
    private float husmovSobresdo;
    private float husmovSueldo;
    private int husmovZona;
    private boolean husmovZonaEco;
    private int idEdo;
    private int idMunicipio;
    private java.lang.String idUnidad;
    private java.lang.String usuario;
    private java.lang.String husmovCategoria;
    private java.lang.String husmovDescripPt;
    private java.util.Date husmovHasta;
    private java.lang.String husmovMensaje;
    private java.lang.String husmovSupMedAp;
    private java.lang.String husmovTipo;

    /**
     * Constructor for TnHusMovtos class.
     */
    public TnHusMovtos() {
    }

    /**
     * Constructor for TnHusMovtos class.
     *
     * @param husmovMovto java.lang.String
     * @param husmovPuesto java.lang.String
     * @param husmovRfc java.lang.String
     * @param husmovVigencia java.util.Date
     * @param fecModifico java.util.Date
     * @param husmovComp float
     * @param husmovMotivo int
     * @param husmovNivPto java.lang.String
     * @param husmovNivTab boolean
     * @param husmovOtrasPer float
     * @param husmovPtda int
     * @param husmovQuinq float
     * @param husmovSalMin float
     * @param husmovSobresdo float
     * @param husmovSueldo float
     * @param husmovZona int
     * @param husmovZonaEco boolean
     * @param idEdo int
     * @param idMunicipio int
     * @param idUnidad java.lang.String
     * @param usuario java.lang.String
     * @param husmovCategoria java.lang.String
     * @param husmovDescripPt java.lang.String
     * @param husmovHasta java.util.Date
     * @param husmovMensaje java.lang.String
     * @param husmovSupMedAp java.lang.String
     * @param husmovTipo java.lang.String
     */
    public TnHusMovtos(TnHusMovtoPK idComposite, java.util.Date fecModifico, 
                       float husmovComp, int husmovMotivo, 
                       java.lang.String husmovNivPto, boolean husmovNivTab, 
                       float husmovOtrasPer, int husmovPtda, float husmovQuinq, 
                       float husmovSalMin, float husmovSobresdo, 
                       float husmovSueldo, int husmovZona, 
                       boolean husmovZonaEco, int idEdo, int idMunicipio, 
                       java.lang.String idUnidad, java.lang.String usuario, 
                       java.lang.String husmovCategoria, 
                       java.lang.String husmovDescripPt, 
                       java.util.Date husmovHasta, 
                       java.lang.String husmovMensaje, 
                       java.lang.String husmovSupMedAp, 
                       java.lang.String husmovTipo) {
        this.idComposite = idComposite;
        this.fecModifico = fecModifico;
        this.husmovComp = husmovComp;
        this.husmovMotivo = husmovMotivo;
        this.husmovNivPto = husmovNivPto;
        this.husmovNivTab = husmovNivTab;
        this.husmovOtrasPer = husmovOtrasPer;
        this.husmovPtda = husmovPtda;
        this.husmovQuinq = husmovQuinq;
        this.husmovSalMin = husmovSalMin;
        this.husmovSobresdo = husmovSobresdo;
        this.husmovSueldo = husmovSueldo;
        this.husmovZona = husmovZona;
        this.husmovZonaEco = husmovZonaEco;
        this.idEdo = idEdo;
        this.idMunicipio = idMunicipio;
        this.idUnidad = idUnidad;
        this.usuario = usuario;
        this.husmovCategoria = husmovCategoria;
        this.husmovDescripPt = husmovDescripPt;
        this.husmovHasta = husmovHasta;
        this.husmovMensaje = husmovMensaje;
        this.husmovSupMedAp = husmovSupMedAp;
        this.husmovTipo = husmovTipo;
    }

    /**
     * Get husmovMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovMovto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusmovMovto();
    }

    /**
     * Get husmovPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovPuesto() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusmovPuesto();
    }

    /**
     * Get husmovRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovRfc() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusmovRfc();
    }

    /**
     * Get husmovVigencia value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusmovVigencia() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getHusmovVigencia();
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
     * Get husmovComp value.
     *
     * @return float
     */
    public float getHusmovComp() {
        return this.husmovComp;
    }

    /**
     * Get husmovMotivo value.
     *
     * @return int
     */
    public int getHusmovMotivo() {
        return this.husmovMotivo;
    }

    /**
     * Get husmovNivPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovNivPto() {
        return this.husmovNivPto;
    }

    /**
     * Get husmovNivTab value.
     *
     * @return boolean
     */
    public boolean isHusmovNivTab() {
        return this.husmovNivTab;
    }

    /**
     * Get husmovOtrasPer value.
     *
     * @return float
     */
    public float getHusmovOtrasPer() {
        return this.husmovOtrasPer;
    }

    /**
     * Get husmovPtda value.
     *
     * @return int
     */
    public int getHusmovPtda() {
        return this.husmovPtda;
    }

    /**
     * Get husmovQuinq value.
     *
     * @return float
     */
    public float getHusmovQuinq() {
        return this.husmovQuinq;
    }

    /**
     * Get husmovSalMin value.
     *
     * @return float
     */
    public float getHusmovSalMin() {
        return this.husmovSalMin;
    }

    /**
     * Get husmovSobresdo value.
     *
     * @return float
     */
    public float getHusmovSobresdo() {
        return this.husmovSobresdo;
    }

    /**
     * Get husmovSueldo value.
     *
     * @return float
     */
    public float getHusmovSueldo() {
        return this.husmovSueldo;
    }

    /**
     * Get husmovZona value.
     *
     * @return int
     */
    public int getHusmovZona() {
        return this.husmovZona;
    }

    /**
     * Get husmovZonaEco value.
     *
     * @return boolean
     */
    public boolean isHusmovZonaEco() {
        return this.husmovZonaEco;
    }

    /**
     * Get idEdo value.
     *
     * @return int
     */
    public int getIdEdo() {
        return this.idEdo;
    }

    /**
     * Get idMunicipio value.
     *
     * @return int
     */
    public int getIdMunicipio() {
        return this.idMunicipio;
    }

    /**
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
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
     * Get husmovCategoria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovCategoria() {
        return this.husmovCategoria;
    }

    /**
     * Get husmovDescripPt value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovDescripPt() {
        return this.husmovDescripPt;
    }

    /**
     * Get husmovHasta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHusmovHasta() {
        return this.husmovHasta;
    }

    /**
     * Get husmovMensaje value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovMensaje() {
        return this.husmovMensaje;
    }

    /**
     * Get husmovSupMedAp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovSupMedAp() {
        return this.husmovSupMedAp;
    }

    /**
     * Get husmovTipo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHusmovTipo() {
        return this.husmovTipo;
    }

    /**
     * Set husmovMovto value.
     *
     * @param husmovMovto java.lang.String
     */
    public void setHusmovMovto(java.lang.String husmovMovto) {
        if (idComposite == null) {
            idComposite = new TnHusMovtoPK();
        }
        this.idComposite.setHusmovMovto(husmovMovto);
    }

    /**
     * Set husmovPuesto value.
     *
     * @param husmovPuesto java.lang.String
     */
    public void setHusmovPuesto(java.lang.String husmovPuesto) {
        if (idComposite == null) {
            idComposite = new TnHusMovtoPK();
        }
        this.idComposite.setHusmovPuesto(husmovPuesto);
    }

    /**
     * Set husmovRfc value.
     *
     * @param husmovRfc java.lang.String
     */
    public void setHusmovRfc(java.lang.String husmovRfc) {
        if (idComposite == null) {
            idComposite = new TnHusMovtoPK();
        }
        this.idComposite.setHusmovRfc(husmovRfc);
    }

    /**
     * Set husmovVigencia value.
     *
     * @param husmovVigencia java.util.Date
     */
    public void setHusmovVigencia(java.util.Date husmovVigencia) {
        if (idComposite == null) {
            idComposite = new TnHusMovtoPK();
        }
        this.idComposite.setHusmovVigencia(husmovVigencia);
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
     * Set husmovComp value.
     *
     * @param husmovComp float
     */
    public void setHusmovComp(float husmovComp) {
        this.husmovComp = husmovComp;
    }

    /**
     * Set husmovMotivo value.
     *
     * @param husmovMotivo int
     */
    public void setHusmovMotivo(int husmovMotivo) {
        this.husmovMotivo = husmovMotivo;
    }

    /**
     * Set husmovNivPto value.
     *
     * @param husmovNivPto java.lang.String
     */
    public void setHusmovNivPto(java.lang.String husmovNivPto) {
        this.husmovNivPto = husmovNivPto;
    }

    /**
     * Set husmovNivTab value.
     *
     * @param husmovNivTab boolean
     */
    public void setHusmovNivTab(boolean husmovNivTab) {
        this.husmovNivTab = husmovNivTab;
    }

    /**
     * Set husmovOtrasPer value.
     *
     * @param husmovOtrasPer float
     */
    public void setHusmovOtrasPer(float husmovOtrasPer) {
        this.husmovOtrasPer = husmovOtrasPer;
    }

    /**
     * Set husmovPtda value.
     *
     * @param husmovPtda int
     */
    public void setHusmovPtda(int husmovPtda) {
        this.husmovPtda = husmovPtda;
    }

    /**
     * Set husmovQuinq value.
     *
     * @param husmovQuinq float
     */
    public void setHusmovQuinq(float husmovQuinq) {
        this.husmovQuinq = husmovQuinq;
    }

    /**
     * Set husmovSalMin value.
     *
     * @param husmovSalMin float
     */
    public void setHusmovSalMin(float husmovSalMin) {
        this.husmovSalMin = husmovSalMin;
    }

    /**
     * Set husmovSobresdo value.
     *
     * @param husmovSobresdo float
     */
    public void setHusmovSobresdo(float husmovSobresdo) {
        this.husmovSobresdo = husmovSobresdo;
    }

    /**
     * Set husmovSueldo value.
     *
     * @param husmovSueldo float
     */
    public void setHusmovSueldo(float husmovSueldo) {
        this.husmovSueldo = husmovSueldo;
    }

    /**
     * Set husmovZona value.
     *
     * @param husmovZona int
     */
    public void setHusmovZona(int husmovZona) {
        this.husmovZona = husmovZona;
    }

    /**
     * Set husmovZonaEco value.
     *
     * @param husmovZonaEco boolean
     */
    public void setHusmovZonaEco(boolean husmovZonaEco) {
        this.husmovZonaEco = husmovZonaEco;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo int
     */
    public void setIdEdo(int idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Set idMunicipio value.
     *
     * @param idMunicipio int
     */
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
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
     * Set husmovCategoria value.
     *
     * @param husmovCategoria java.lang.String
     */
    public void setHusmovCategoria(java.lang.String husmovCategoria) {
        this.husmovCategoria = husmovCategoria;
    }

    /**
     * Set husmovDescripPt value.
     *
     * @param husmovDescripPt java.lang.String
     */
    public void setHusmovDescripPt(java.lang.String husmovDescripPt) {
        this.husmovDescripPt = husmovDescripPt;
    }

    /**
     * Set husmovHasta value.
     *
     * @param husmovHasta java.util.Date
     */
    public void setHusmovHasta(java.util.Date husmovHasta) {
        this.husmovHasta = husmovHasta;
    }

    /**
     * Set husmovMensaje value.
     *
     * @param husmovMensaje java.lang.String
     */
    public void setHusmovMensaje(java.lang.String husmovMensaje) {
        this.husmovMensaje = husmovMensaje;
    }

    /**
     * Set husmovSupMedAp value.
     *
     * @param husmovSupMedAp java.lang.String
     */
    public void setHusmovSupMedAp(java.lang.String husmovSupMedAp) {
        this.husmovSupMedAp = husmovSupMedAp;
    }

    /**
     * Set husmovTipo value.
     *
     * @param husmovTipo java.lang.String
     */
    public void setHusmovTipo(java.lang.String husmovTipo) {
        this.husmovTipo = husmovTipo;
    }

    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TnHusMovtoPK)idComposite;
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
