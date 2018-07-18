package gob.shcp.sireh.model.plaza;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdPlaza data.
 */
public class TdPlazaDTO implements java.io.Serializable, Model {

    private java.lang.Integer idPlaza;
    @MaxLength(4)
    private java.lang.String idGrupoPago;
    @MaxLength(28)
    private java.lang.String idPuestoNom;
    @MaxLength(8)
    private java.lang.String idSitPlaza;
    @MaxLength(4)
    private java.lang.String idTipoPlaza;
    @MaxLength(12)
    private java.lang.String idUnidadNom;
    private java.lang.Integer idZonaEcoNom;
    private java.lang.Integer idZonaEcoPre;
    @NotNull
    private int plazaCiclo;
    //@NotNull
    private java.util.Date fecModifico;
    //@NotBlank(errorCode = "not.null")
    //@NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.lang.Integer idEdoNom;
    private java.lang.Integer idEdoPre;
    private java.lang.Integer idInmueble;
    private java.lang.Integer idMovtoPersona;
    private java.lang.Integer idMuniNom;
    @MaxLength(160)
    private java.lang.String idNodo;
    @MaxLength(24)
    private java.lang.String idProyAmpliaPre;
    @MaxLength(24)
    private java.lang.String idProyReducePre;
    @MaxLength(8)
    private java.lang.String idPtoEstrategico;
    @MaxLength(28)
    private java.lang.String idPuestoPre;
    private java.lang.Integer idRangoNom;
    private java.lang.Integer idRangoPre;
    @MaxLength(20)
    private java.lang.String idServPub;
    @MaxLength(12)
    private java.lang.String idUnidadPre;
    private java.lang.Integer idZonaDistNom;
    @MaxLength(160)
    private java.lang.String plazaAla;
    @MaxLength(60)
    private java.lang.String plazaConmut;
    @MaxLength(160)
    private java.lang.String plazaEdif;
    @MaxLength(60)
    private java.lang.String plazaExt1;
    @MaxLength(60)
    private java.lang.String plazaExt2;
    private java.util.Date plazaFinCont;
    private java.util.Date plazaFinLic;
    private java.lang.Double plazaImpHono;
    private java.util.Date plazaIniCont;
    private java.util.Date plazaIniLic;
    @MaxLength(160)
    private java.lang.String plazaOfna;
    @MaxLength(160)
    private java.lang.String plazaPiso;
    private java.lang.Integer plazaQnaCaptura;
    @MaxLength(240)
    private java.lang.String plazaReferencia;
    private java.lang.Integer plazaRespaldo;
    @MaxLength(52)
    private java.lang.String plazaRfc;
    @MaxLength(60)
    private java.lang.String plazaTelOf1;
    @MaxLength(60)
    private java.lang.String plazaTelOf2;
    private java.lang.Integer idVacancia;
    private java.util.Date plazaUltimoMovto;
    
    // Rusp
    private java.lang.String idObligado;
    private java.lang.Integer idMotivoObligado;
    
    /**
     * Constructor for TdPlazaDTO class.
     */
    public TdPlazaDTO() {
    }
    
    /**
     * Constructor for TdPlazaDTO class.
     *
     * @param idPlaza java.lang.Integer
     * @param idGrupoPago java.lang.String
     * @param idPuestoNom java.lang.String
     * @param idSitPlaza java.lang.String
     * @param idTipoPlaza java.lang.String
     * @param idUnidadNom java.lang.String
     * @param idZonaEcoNom java.lang.Integer
     * @param idZonaEcoPre java.lang.Integer
     * @param plazaCiclo int
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idEdoNom java.lang.Integer
     * @param idEdoPre java.lang.Integer
     * @param idInmueble java.lang.Integer
     * @param idMovtoPersona java.lang.Integer
     * @param idMuniNom java.lang.Integer
     * @param idNodo java.lang.String
     * @param idProyAmpliaPre java.lang.String
     * @param idProyReducePre java.lang.String
     * @param idPtoEstrategico java.lang.String
     * @param idPuestoPre java.lang.String
     * @param idRangoNom java.lang.Integer
     * @param idRangoPre java.lang.Integer
     * @param idServPub java.lang.String
     * @param idUnidadPre java.lang.String
     * @param idZonaDistNom java.lang.Integer
     * @param plazaAla java.lang.String
     * @param plazaConmut java.lang.String
     * @param plazaEdif java.lang.String
     * @param plazaExt1 java.lang.String
     * @param plazaExt2 java.lang.String
     * @param plazaFinCont java.util.Date
     * @param plazaFinLic java.util.Date
     * @param plazaImpHono java.lang.Double
     * @param plazaIniCont java.util.Date
     * @param plazaIniLic java.util.Date
     * @param plazaOfna java.lang.String
     * @param plazaPiso java.lang.String
     * @param plazaQnaCaptura java.lang.Integer
     * @param plazaReferencia java.lang.String
     * @param plazaRespaldo java.lang.Integer
     * @param plazaRfc java.lang.String
     * @param plazaTelOf1 java.lang.String
     * @param plazaTelOf2 java.lang.String
     * @param plazaUltimoMovto java.util.Date
     */
    public TdPlazaDTO(java.lang.Integer idPlaza, 
                      java.lang.String idGrupoPago, 
                      java.lang.String idPuestoNom, 
                      java.lang.String idSitPlaza, 
                      java.lang.String idTipoPlaza, 
                      java.lang.String idUnidadNom, 
                      java.lang.Integer idZonaEcoNom, 
                      java.lang.Integer idZonaEcoPre, 
                      int plazaCiclo, 
                      java.util.Date fecModifico, 
                      java.lang.String usuario, 
                      java.lang.Integer idEdoNom, 
                      java.lang.Integer idEdoPre, 
                      java.lang.Integer idInmueble, 
                      java.lang.Integer idMovtoPersona, 
                      java.lang.Integer idMuniNom, 
                      java.lang.String idNodo, 
                      java.lang.String idProyAmpliaPre, 
                      java.lang.String idProyReducePre, 
                      java.lang.String idPtoEstrategico, 
                      java.lang.String idPuestoPre, 
                      java.lang.Integer idRangoNom, 
                      java.lang.Integer idRangoPre, 
                      java.lang.String idServPub, 
                      java.lang.String idUnidadPre, 
                      java.lang.Integer idZonaDistNom, 
                      java.lang.String plazaAla, 
                      java.lang.String plazaConmut, 
                      java.lang.String plazaEdif, 
                      java.lang.String plazaExt1, 
                      java.lang.String plazaExt2, 
                      java.util.Date plazaFinCont, 
                      java.util.Date plazaFinLic, 
                      java.lang.Double plazaImpHono, 
                      java.util.Date plazaIniCont, 
                      java.util.Date plazaIniLic, 
                      java.lang.String plazaOfna, 
                      java.lang.String plazaPiso, 
                      java.lang.Integer plazaQnaCaptura, 
                      java.lang.String plazaReferencia, 
                      java.lang.Integer plazaRespaldo, 
                      java.lang.String plazaRfc, 
                      java.lang.String plazaTelOf1, 
                      java.lang.String plazaTelOf2, 
                      java.lang.Integer idVacancia,
                      java.util.Date plazaUltimoMovto) {
                      //java.lang.String idObligado
                      //java.lang.Integer idMotivoObligado) {
                      
        this.idPlaza = idPlaza;
        this.idGrupoPago = idGrupoPago;
        this.idPuestoNom = idPuestoNom;
        this.idSitPlaza = idSitPlaza;
        this.idTipoPlaza = idTipoPlaza;
        this.idUnidadNom = idUnidadNom;
        this.idZonaEcoNom = idZonaEcoNom;
        this.idZonaEcoPre = idZonaEcoPre;
        this.plazaCiclo = plazaCiclo;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEdoNom = idEdoNom;
        this.idEdoPre = idEdoPre;
        this.idInmueble = idInmueble;
        this.idMovtoPersona = idMovtoPersona;
        this.idMuniNom = idMuniNom;
        this.idNodo = idNodo;
        this.idProyAmpliaPre = idProyAmpliaPre;
        this.idProyReducePre = idProyReducePre;
        this.idPtoEstrategico = idPtoEstrategico;
        this.idPuestoPre = idPuestoPre;
        this.idRangoNom = idRangoNom;
        this.idRangoPre = idRangoPre;
        this.idServPub = idServPub;
        this.idUnidadPre = idUnidadPre;
        this.idZonaDistNom = idZonaDistNom;
        this.plazaAla = plazaAla;
        this.plazaConmut = plazaConmut;
        this.plazaEdif = plazaEdif;
        this.plazaExt1 = plazaExt1;
        this.plazaExt2 = plazaExt2;
        this.plazaFinCont = plazaFinCont;
        this.plazaFinLic = plazaFinLic;
        this.plazaImpHono = plazaImpHono;
        this.plazaIniCont = plazaIniCont;
        this.plazaIniLic = plazaIniLic;
        this.plazaOfna = plazaOfna;
        this.plazaPiso = plazaPiso;
        this.plazaQnaCaptura = plazaQnaCaptura;
        this.plazaReferencia = plazaReferencia;
        this.plazaRespaldo = plazaRespaldo;
        this.plazaRfc = plazaRfc;
        this.plazaTelOf1 = plazaTelOf1;
        this.plazaTelOf2 = plazaTelOf2;
        this.idVacancia = idVacancia;
        this.plazaUltimoMovto = plazaUltimoMovto;
        
        // Rusp
        //this.idObligado = idObligado;
        //this.idMotivoObligado = idMotivoObligado;
    }
    
    /**
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    /**
     * Get idPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdPlaza() {
        return this.idPlaza;
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
     * Get idGrupoPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPago() {
        return this.idGrupoPago;
    }

    /**
     * Set idPuestoNom value.
     *
     * @param idPuestoNom java.lang.String
     */
    public void setIdPuestoNom(java.lang.String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    /**
     * Get idPuestoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoNom() {
        return this.idPuestoNom;
    }

    /**
     * Set idSitPlaza value.
     *
     * @param idSitPlaza java.lang.String
     */
    public void setIdSitPlaza(java.lang.String idSitPlaza) {
        this.idSitPlaza = idSitPlaza;
    }

    /**
     * Get idSitPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPlaza() {
        return this.idSitPlaza;
    }

    /**
     * Set idTipoPlaza value.
     *
     * @param idTipoPlaza java.lang.String
     */
    public void setIdTipoPlaza(java.lang.String idTipoPlaza) {
        this.idTipoPlaza = idTipoPlaza;
    }

    /**
     * Get idTipoPlaza value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoPlaza() {
        return this.idTipoPlaza;
    }

    /**
     * Set idUnidadNom value.
     *
     * @param idUnidadNom java.lang.String
     */
    public void setIdUnidadNom(java.lang.String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    /**
     * Get idUnidadNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadNom() {
        return this.idUnidadNom;
    }

    /**
     * Set idZonaEcoNom value.
     *
     * @param idZonaEcoNom java.lang.Integer
     */
    public void setIdZonaEcoNom(java.lang.Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    /**
     * Get idZonaEcoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcoNom() {
        return this.idZonaEcoNom;
    }

    /**
     * Set idZonaEcoPre value.
     *
     * @param idZonaEcoPre java.lang.Integer
     */
    public void setIdZonaEcoPre(java.lang.Integer idZonaEcoPre) {
        this.idZonaEcoPre = idZonaEcoPre;
    }

    /**
     * Get idZonaEcoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaEcoPre() {
        return this.idZonaEcoPre;
    }

    /**
     * Set plazaCiclo value.
     *
     * @param plazaCiclo int
     */
    public void setPlazaCiclo(int plazaCiclo) {
        this.plazaCiclo = plazaCiclo;
    }

    /**
     * Get plazaCiclo value.
     *
     * @return int
     */
    public int getPlazaCiclo() {
        return this.plazaCiclo;
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
     * Get fecModifico value.
     *
     * @return java.util.Date
     */
    public java.util.Date getFecModifico() {
        return this.fecModifico;
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
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
     * Set idEdoNom value.
     *
     * @param idEdoNom java.lang.Integer
     */
    public void setIdEdoNom(java.lang.Integer idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    /**
     * Get idEdoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNom() {
        return this.idEdoNom;
    }

    /**
     * Set idEdoPre value.
     *
     * @param idEdoPre java.lang.Integer
     */
    public void setIdEdoPre(java.lang.Integer idEdoPre) {
        this.idEdoPre = idEdoPre;
    }

    /**
     * Get idEdoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoPre() {
        return this.idEdoPre;
    }

    /**
     * Set idInmueble value.
     *
     * @param idInmueble java.lang.Integer
     */
    public void setIdInmueble(java.lang.Integer idInmueble) {
        this.idInmueble = idInmueble;
    }

    /**
     * Get idInmueble value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdInmueble() {
        return this.idInmueble;
    }

    /**
     * Set idMovtoPersona value.
     *
     * @param idMovtoPersona java.lang.Integer
     */
    public void setIdMovtoPersona(java.lang.Integer idMovtoPersona) {
        this.idMovtoPersona = idMovtoPersona;
    }

    /**
     * Get idMovtoPersona value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMovtoPersona() {
        return this.idMovtoPersona;
    }

    /**
     * Set idMuniNom value.
     *
     * @param idMuniNom java.lang.Integer
     */
    public void setIdMuniNom(java.lang.Integer idMuniNom) {
        this.idMuniNom = idMuniNom;
    }

    /**
     * Get idMuniNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMuniNom() {
        return this.idMuniNom;
    }

    /**
     * Set idNodo value.
     *
     * @param idNodo java.lang.String
     */
    public void setIdNodo(java.lang.String idNodo) {
        this.idNodo = idNodo;
    }

    /**
     * Get idNodo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNodo() {
        return this.idNodo;
    }

    /**
     * Set idProyAmpliaPre value.
     *
     * @param idProyAmpliaPre java.lang.String
     */
    public void setIdProyAmpliaPre(java.lang.String idProyAmpliaPre) {
        this.idProyAmpliaPre = idProyAmpliaPre;
    }

    /**
     * Get idProyAmpliaPre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProyAmpliaPre() {
        return this.idProyAmpliaPre;
    }

    /**
     * Set idProyReducePre value.
     *
     * @param idProyReducePre java.lang.String
     */
    public void setIdProyReducePre(java.lang.String idProyReducePre) {
        this.idProyReducePre = idProyReducePre;
    }

    /**
     * Get idProyReducePre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdProyReducePre() {
        return this.idProyReducePre;
    }

    /**
     * Set idPtoEstrategico value.
     *
     * @param idPtoEstrategico java.lang.String
     */
    public void setIdPtoEstrategico(java.lang.String idPtoEstrategico) {
        this.idPtoEstrategico = idPtoEstrategico;
    }

    /**
     * Get idPtoEstrategico value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPtoEstrategico() {
        return this.idPtoEstrategico;
    }

    /**
     * Set idPuestoPre value.
     *
     * @param idPuestoPre java.lang.String
     */
    public void setIdPuestoPre(java.lang.String idPuestoPre) {
        this.idPuestoPre = idPuestoPre;
    }

    /**
     * Get idPuestoPre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuestoPre() {
        return this.idPuestoPre;
    }

    /**
     * Set idRangoNom value.
     *
     * @param idRangoNom java.lang.Integer
     */
    public void setIdRangoNom(java.lang.Integer idRangoNom) {
        this.idRangoNom = idRangoNom;
    }

    /**
     * Get idRangoNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRangoNom() {
        return this.idRangoNom;
    }

    /**
     * Set idRangoPre value.
     *
     * @param idRangoPre java.lang.Integer
     */
    public void setIdRangoPre(java.lang.Integer idRangoPre) {
        this.idRangoPre = idRangoPre;
    }

    /**
     * Get idRangoPre value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdRangoPre() {
        return this.idRangoPre;
    }

    /**
     * Set idServPub value.
     *
     * @param idServPub java.lang.String
     */
    public void setIdServPub(java.lang.String idServPub) {
        this.idServPub = idServPub;
    }

    /**
     * Get idServPub value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdServPub() {
        return this.idServPub;
    }

    /**
     * Set idUnidadPre value.
     *
     * @param idUnidadPre java.lang.String
     */
    public void setIdUnidadPre(java.lang.String idUnidadPre) {
        this.idUnidadPre = idUnidadPre;
    }

    /**
     * Get idUnidadPre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidadPre() {
        return this.idUnidadPre;
    }

    /**
     * Set idZonaDistNom value.
     *
     * @param idZonaDistNom java.lang.Integer
     */
    public void setIdZonaDistNom(java.lang.Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    /**
     * Get idZonaDistNom value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdZonaDistNom() {
        return this.idZonaDistNom;
    }

    /**
     * Set plazaAla value.
     *
     * @param plazaAla java.lang.String
     */
    public void setPlazaAla(java.lang.String plazaAla) {
        this.plazaAla = plazaAla;
    }

    /**
     * Get plazaAla value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaAla() {
        return this.plazaAla;
    }

    /**
     * Set plazaConmut value.
     *
     * @param plazaConmut java.lang.String
     */
    public void setPlazaConmut(java.lang.String plazaConmut) {
        this.plazaConmut = plazaConmut;
    }

    /**
     * Get plazaConmut value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaConmut() {
        return this.plazaConmut;
    }

    /**
     * Set plazaEdif value.
     *
     * @param plazaEdif java.lang.String
     */
    public void setPlazaEdif(java.lang.String plazaEdif) {
        this.plazaEdif = plazaEdif;
    }

    /**
     * Get plazaEdif value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaEdif() {
        return this.plazaEdif;
    }

    /**
     * Set plazaExt1 value.
     *
     * @param plazaExt1 java.lang.String
     */
    public void setPlazaExt1(java.lang.String plazaExt1) {
        this.plazaExt1 = plazaExt1;
    }

    /**
     * Get plazaExt1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaExt1() {
        return this.plazaExt1;
    }

    /**
     * Set plazaExt2 value.
     *
     * @param plazaExt2 java.lang.String
     */
    public void setPlazaExt2(java.lang.String plazaExt2) {
        this.plazaExt2 = plazaExt2;
    }

    /**
     * Get plazaExt2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaExt2() {
        return this.plazaExt2;
    }

    /**
     * Set plazaFinCont value.
     *
     * @param plazaFinCont java.util.Date
     */
    public void setPlazaFinCont(java.util.Date plazaFinCont) {
        this.plazaFinCont = plazaFinCont;
    }

    /**
     * Get plazaFinCont value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlazaFinCont() {
        return this.plazaFinCont;
    }

    /**
     * Set plazaFinLic value.
     *
     * @param plazaFinLic java.util.Date
     */
    public void setPlazaFinLic(java.util.Date plazaFinLic) {
        this.plazaFinLic = plazaFinLic;
    }

    /**
     * Get plazaFinLic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlazaFinLic() {
        return this.plazaFinLic;
    }

    /**
     * Set plazaImpHono value.
     *
     * @param plazaImpHono java.lang.Double
     */
    public void setPlazaImpHono(java.lang.Double plazaImpHono) {
        this.plazaImpHono = plazaImpHono;
    }

    /**
     * Get plazaImpHono value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getPlazaImpHono() {
        return this.plazaImpHono;
    }

    /**
     * Set plazaIniCont value.
     *
     * @param plazaIniCont java.util.Date
     */
    public void setPlazaIniCont(java.util.Date plazaIniCont) {
        this.plazaIniCont = plazaIniCont;
    }

    /**
     * Get plazaIniCont value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlazaIniCont() {
        return this.plazaIniCont;
    }

    /**
     * Set plazaIniLic value.
     *
     * @param plazaIniLic java.util.Date
     */
    public void setPlazaIniLic(java.util.Date plazaIniLic) {
        this.plazaIniLic = plazaIniLic;
    }

    /**
     * Get plazaIniLic value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlazaIniLic() {
        return this.plazaIniLic;
    }

    /**
     * Set plazaOfna value.
     *
     * @param plazaOfna java.lang.String
     */
    public void setPlazaOfna(java.lang.String plazaOfna) {
        this.plazaOfna = plazaOfna;
    }

    /**
     * Get plazaOfna value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaOfna() {
        return this.plazaOfna;
    }

    /**
     * Set plazaPiso value.
     *
     * @param plazaPiso java.lang.String
     */
    public void setPlazaPiso(java.lang.String plazaPiso) {
        this.plazaPiso = plazaPiso;
    }

    /**
     * Get plazaPiso value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaPiso() {
        return this.plazaPiso;
    }

    /**
     * Set plazaQnaCaptura value.
     *
     * @param plazaQnaCaptura java.lang.Integer
     */
    public void setPlazaQnaCaptura(java.lang.Integer plazaQnaCaptura) {
        this.plazaQnaCaptura = plazaQnaCaptura;
    }

    /**
     * Get plazaQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlazaQnaCaptura() {
        return this.plazaQnaCaptura;
    }

    /**
     * Set plazaReferencia value.
     *
     * @param plazaReferencia java.lang.String
     */
    public void setPlazaReferencia(java.lang.String plazaReferencia) {
        this.plazaReferencia = plazaReferencia;
    }

    /**
     * Get plazaReferencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaReferencia() {
        return this.plazaReferencia;
    }

    /**
     * Set plazaRespaldo value.
     *
     * @param plazaRespaldo java.lang.Integer
     */
    public void setPlazaRespaldo(java.lang.Integer plazaRespaldo) {
        this.plazaRespaldo = plazaRespaldo;
    }

    /**
     * Get plazaRespaldo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getPlazaRespaldo() {
        return this.plazaRespaldo;
    }

    /**
     * Set plazaRfc value.
     *
     * @param plazaRfc java.lang.String
     */
    public void setPlazaRfc(java.lang.String plazaRfc) {
        this.plazaRfc = plazaRfc;
    }

    /**
     * Get plazaRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaRfc() {
        return this.plazaRfc;
    }

    /**
     * Set plazaTelOf1 value.
     *
     * @param plazaTelOf1 java.lang.String
     */
    public void setPlazaTelOf1(java.lang.String plazaTelOf1) {
        this.plazaTelOf1 = plazaTelOf1;
    }

    /**
     * Get plazaTelOf1 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaTelOf1() {
        return this.plazaTelOf1;
    }

    /**
     * Set plazaTelOf2 value.
     *
     * @param plazaTelOf2 java.lang.String
     */
    public void setPlazaTelOf2(java.lang.String plazaTelOf2) {
        this.plazaTelOf2 = plazaTelOf2;
    }

    /**
     * Get plazaTelOf2 value.
     *
     * @return java.lang.String
     */
    public java.lang.String getPlazaTelOf2() {
        return this.plazaTelOf2;
    }

    /**
     * Set plazaUltimoMovto value.
     *
     * @param plazaUltimoMovto java.util.Date
     */
    public void setPlazaUltimoMovto(java.util.Date plazaUltimoMovto) {
        this.plazaUltimoMovto = plazaUltimoMovto;
    }

    /**
     * Get plazaUltimoMovto value.
     *
     * @return java.util.Date
     */
    public java.util.Date getPlazaUltimoMovto() {
        return this.plazaUltimoMovto;
    }
    
    /*public void setIdObligado(String idObligado) {
        this.idObligado = idObligado;
    }

    public String getIdObligado() {
        return idObligado;
    }

    public void setIdMotivoObligado(Integer idMotivoObligado) {
        this.idMotivoObligado = idMotivoObligado;
    }

    public Integer getIdMotivoObligado() {
        return idMotivoObligado;
    }*/

    public void setIdVacancia(Integer idVacancia) {
        this.idVacancia = idVacancia;
    }

    public Integer getIdVacancia() {
        return idVacancia;
    }

    public void setIdObligado(String idObligado) {
        this.idObligado = idObligado;
    }

    public String getIdObligado() {
        return idObligado;
    }

    public void setIdMotivoObligado(Integer idMotivoObligado) {
        this.idMotivoObligado = idMotivoObligado;
    }

    public Integer getIdMotivoObligado() {
        return idMotivoObligado;
    }
}
