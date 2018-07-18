package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

/**
 * Domain object for persistent TdPlazaAfectacion data.
 */
public class TdPlazaAfectacion implements Domain, Serializable {
    private TdPlazaAfectacionPK idComposite;
    private java.lang.String idGrupoPago;
    private java.lang.String idUnidad;
    private java.util.Date fecModifico;
    private java.lang.Integer idEdo;
    private java.lang.String idJustificacion;
    private java.lang.String idPuesto;
    private java.lang.String idRegularizable;
    private java.lang.Boolean idZonaEcon;
    private java.lang.Integer plafDiasAguinaldo;
    private java.lang.Integer plafDiasPrima;
    private java.util.Date plafFinal;
    private java.util.Date plafInicio;
    private java.lang.String plafProyAmplia;
    private java.lang.String plafProyReduce;
    private java.lang.String usuario;

    /**
     * Constructor for TdPlazaAfectacion class.
     */
    public TdPlazaAfectacion() {
    }

    /**
     * Constructor for TdPlazaAfectacion class.
     *
     * @param idOficioAfecta java.lang.Long
     * @param idOperacion java.lang.String
     * @param idPlaza java.lang.Integer
     * @param plafCiclo java.lang.Integer
     * @param idGrupoPago java.lang.String
     * @param idUnidad java.lang.String
     * @param fecModifico java.util.Date
     * @param idEdo java.lang.Integer
     * @param idJustificacion java.lang.String
     * @param idPuesto java.lang.String
     * @param idRegularizable java.lang.String
     * @param idZonaEcon java.lang.Boolean
     * @param plafDiasAguinaldo java.lang.Integer
     * @param plafDiasPrima java.lang.Integer
     * @param plafFinal java.util.Date
     * @param plafInicio java.util.Date
     * @param plafProyAmplia java.lang.String
     * @param plafProyReduce java.lang.String
     * @param usuario java.lang.String
     */
    public TdPlazaAfectacion(TdPlazaAfectacionPK idComposite, 
                             java.lang.String idGrupoPago, 
                             java.lang.String idUnidad, 
                             java.util.Date fecModifico, 
                             java.lang.Integer idEdo, 
                             java.lang.String idJustificacion, 
                             java.lang.String idPuesto, 
                             java.lang.String idRegularizable, 
                             java.lang.Boolean idZonaEcon, 
                             java.lang.Integer plafDiasAguinaldo, 
                             java.lang.Integer plafDiasPrima, 
                             java.util.Date plafFinal, 
                             java.util.Date plafInicio, 
                             java.lang.String plafProyAmplia, 
                             java.lang.String plafProyReduce, 
                             java.lang.String usuario) {
        this.idComposite = idComposite;
        this.idGrupoPago = idGrupoPago;
        this.idUnidad = idUnidad;
        this.fecModifico = fecModifico;
        this.idEdo = idEdo;
        this.idJustificacion = idJustificacion;
        this.idPuesto = idPuesto;
        this.idRegularizable = idRegularizable;
        this.idZonaEcon = idZonaEcon;
        this.plafDiasAguinaldo = plafDiasAguinaldo;
        this.plafDiasPrima = plafDiasPrima;
        this.plafFinal = plafFinal;
        this.plafInicio = plafInicio;
        this.plafProyAmplia = plafProyAmplia;
        this.plafProyReduce = plafProyReduce;
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
     * Get idOperacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdOperacion() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdOperacion();
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getIdPlaza();
    }

    /**
     * Get plafCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getPlafCiclo();
    }

    /**
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
    }

    /**
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
    }

    /**
     * Get idJustificacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdJustificacion() {
        return this.idJustificacion;
    }

    /**
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;
    }

    /**
     * Get idRegularizable value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdRegularizable() {
        return this.idRegularizable;
    }

    /**
     * Get idZonaEcon value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdZonaEcon() {
        return this.idZonaEcon;
    }

    /**
     * Get plafDiasAguinaldo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafDiasAguinaldo() {
        return this.plafDiasAguinaldo;
    }

    /**
     * Get plafDiasPrima value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlafDiasPrima() {
        return this.plafDiasPrima;
    }

    /**
     * Get plafFinal value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlafFinal() {
        return this.plafFinal;
    }

    /**
     * Get plafInicio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlafInicio() {
        return this.plafInicio;
    }

    /**
     * Get plafProyAmplia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlafProyAmplia() {
        return this.plafProyAmplia;
    }

    /**
     * Get plafProyReduce value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlafProyReduce() {
        return this.plafProyReduce;
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
            idComposite = new TdPlazaAfectacionPK();
        }
        this.idComposite.setIdOficioAfecta(idOficioAfecta);
    }

    /**
     * Set idOperacion value.
     *
     * @param idOperacion java.lang.String
     */
    public void setIdOperacion(java.lang.String idOperacion) {
        if (idComposite == null) {
            idComposite = new TdPlazaAfectacionPK();
        }
        this.idComposite.setIdOperacion(idOperacion);
    }

    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        if (idComposite == null) {
            idComposite = new TdPlazaAfectacionPK();
        }
        this.idComposite.setIdPlaza(idPlaza);
    }

    /**
     * Set plafCiclo value.
     *
     * @param plafCiclo java.lang.Integer
     */
    public void setPlafCiclo(java.lang.Integer plafCiclo) {
        if (idComposite == null) {
            idComposite = new TdPlazaAfectacionPK();
        }
        this.idComposite.setPlafCiclo(plafCiclo);
    }

    /**
     * Set idGrupoPago value.
     *
     * @param idGrupoPago java.lang.String
     */
    public void setIdGrupoPago(java.lang.String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
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
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    /**
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
    }

    /**
     * Set idJustificacion value.
     *
     * @param idJustificacion java.lang.String
     */
    public void setIdJustificacion(java.lang.String idJustificacion) {
        this.idJustificacion = idJustificacion;
    }

    /**
     * Set idPuesto value.
     *
     * @param idPuesto java.lang.String
     */
    public void setIdPuesto(java.lang.String idPuesto) {
        this.idPuesto = idPuesto;
    }

    /**
     * Set idRegularizable value.
     *
     * @param idRegularizable java.lang.String
     */
    public void setIdRegularizable(java.lang.String idRegularizable) {
        this.idRegularizable = idRegularizable;
    }

    /**
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Boolean
     */
    public void setIdZonaEcon(java.lang.Boolean idZonaEcon) {
        this.idZonaEcon = idZonaEcon;
    }

    /**
     * Set plafDiasAguinaldo value.
     *
     * @param plafDiasAguinaldo java.lang.Integer
     */
    public void setPlafDiasAguinaldo(java.lang.Integer plafDiasAguinaldo) {
        this.plafDiasAguinaldo = plafDiasAguinaldo;
    }

    /**
     * Set plafDiasPrima value.
     *
     * @param plafDiasPrima java.lang.Integer
     */
    public void setPlafDiasPrima(java.lang.Integer plafDiasPrima) {
        this.plafDiasPrima = plafDiasPrima;
    }

    /**
     * Set plafFinal value.
     *
     * @param plafFinal java.util.Date
     */
    public void setPlafFinal(java.util.Date plafFinal) {
        this.plafFinal = plafFinal;
    }

    /**
     * Set plafInicio value.
     *
     * @param plafInicio java.util.Date
     */
    public void setPlafInicio(java.util.Date plafInicio) {
        this.plafInicio = plafInicio;
    }

    /**
     * Set plafProyAmplia value.
     *
     * @param plafProyAmplia java.lang.String
     */
    public void setPlafProyAmplia(java.lang.String plafProyAmplia) {
        this.plafProyAmplia = plafProyAmplia;
    }

    /**
     * Set plafProyReduce value.
     *
     * @param plafProyReduce java.lang.String
     */
    public void setPlafProyReduce(java.lang.String plafProyReduce) {
        this.plafProyReduce = plafProyReduce;
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
        this.idComposite = (TdPlazaAfectacionPK)idComposite;
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
