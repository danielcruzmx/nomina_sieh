package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdSarNvo data.
 */
public class TdSarNvo implements Domain, Serializable {
    @PrimaryKey(sequenceName = "SD_SAR_CONSEC")
    private java.lang.Long idSarNvo;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.String idEdoCivil;
    private java.lang.String idEdoNac;
    private java.lang.String idEdoParti;
    private java.lang.String idEdoReceptora;
    private java.lang.String idGenero;
    private java.lang.String idMunicipio;
    private java.lang.String snAportAhorroSol;
    private java.lang.String snCalleParti;
    private java.lang.Long snCiclo;
    private java.lang.String snCodPost;
    private java.lang.String snColoniaParti;
    private java.lang.String snCredFovissste;
    private java.lang.String snCurp;
    private java.lang.String snDiasAusentismoBim;
    private java.lang.String snDiasCotizadosBim;
    private java.lang.String snDiasIncapacidadBim;
    private java.lang.String snFecCotizaIssste;
    private java.lang.String snFecIngrDep;
    private java.lang.String snFecNac;
    private java.lang.String snImpAhorroSol;
    private java.lang.String snNombramiento;
    private java.lang.String snNombre;
    private java.lang.String snNssIssste;
    private java.lang.String snNumEmpleado;
    private java.lang.String snPagaduria;
    private java.lang.String snPrimerApellido;
    private java.lang.String snReparto;
    private java.lang.String snRfc;
    private java.lang.String snSarBimestre;
    private java.lang.String snSdoBasicoAmorFovissste;
    private java.lang.String snSdoBasicoCotizaFovissste;
    private java.lang.String snSdoBasicoCotizaRcv;
    private java.lang.String snSegundoApellido;
    private java.lang.String snTipoMovto;
    private java.lang.String snTrabajadorRegAfore;
    private java.lang.Long snVersion;

    /**
     * Constructor for TdSarNvo class.
     */
    public TdSarNvo() {
    }

    /**
     * Constructor for TdSarNvo class.
     *
     * @param idSarNvo java.lang.Long
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idEdoCivil java.lang.String
     * @param idEdoNac java.lang.String
     * @param idEdoParti java.lang.String
     * @param idEdoReceptora java.lang.String
     * @param idGenero java.lang.String
     * @param idMunicipio java.lang.String
     * @param snAportAhorroSol java.lang.String
     * @param snCalleParti java.lang.String
     * @param snCiclo java.lang.Long
     * @param snCodPost java.lang.String
     * @param snColoniaParti java.lang.String
     * @param snCredFovissste java.lang.String
     * @param snCurp java.lang.String
     * @param snDiasAusentismoBim java.lang.String
     * @param snDiasCotizadosBim java.lang.String
     * @param snDiasIncapacidadBim java.lang.String
     * @param snFecCotizaIssste java.lang.String
     * @param snFecIngrDep java.lang.String
     * @param snFecNac java.lang.String
     * @param snImpAhorroSol java.lang.String
     * @param snNombramiento java.lang.String
     * @param snNombre java.lang.String
     * @param snNssIssste java.lang.String
     * @param snNumEmpleado java.lang.String
     * @param snPagaduria java.lang.String
     * @param snPrimerApellido java.lang.String
     * @param snReparto java.lang.String
     * @param snRfc java.lang.String
     * @param snSarBimestre java.lang.String
     * @param snSdoBasicoAmorFovissste java.lang.String
     * @param snSdoBasicoCotizaFovissste java.lang.String
     * @param snSdoBasicoCotizaRcv java.lang.String
     * @param snSegundoApellido java.lang.String
     * @param snTipoMovto java.lang.String
     * @param snTrabajadorRegAfore java.lang.String
     * @param snVersion java.lang.Long
     */
    public TdSarNvo(java.lang.Long idSarNvo, java.util.Date fecModifico, 
                    java.lang.String usuario, java.lang.String idEdoCivil, 
                    java.lang.String idEdoNac, java.lang.String idEdoParti, 
                    java.lang.String idEdoReceptora, java.lang.String idGenero, 
                    java.lang.String idMunicipio, 
                    java.lang.String snAportAhorroSol, 
                    java.lang.String snCalleParti, java.lang.Long snCiclo, 
                    java.lang.String snCodPost, 
                    java.lang.String snColoniaParti, 
                    java.lang.String snCredFovissste, java.lang.String snCurp, 
                    java.lang.String snDiasAusentismoBim, 
                    java.lang.String snDiasCotizadosBim, 
                    java.lang.String snDiasIncapacidadBim, 
                    java.lang.String snFecCotizaIssste, 
                    java.lang.String snFecIngrDep, java.lang.String snFecNac, 
                    java.lang.String snImpAhorroSol, 
                    java.lang.String snNombramiento, java.lang.String snNombre, 
                    java.lang.String snNssIssste, 
                    java.lang.String snNumEmpleado, 
                    java.lang.String snPagaduria, 
                    java.lang.String snPrimerApellido, 
                    java.lang.String snReparto, java.lang.String snRfc, 
                    java.lang.String snSarBimestre, 
                    java.lang.String snSdoBasicoAmorFovissste, 
                    java.lang.String snSdoBasicoCotizaFovissste, 
                    java.lang.String snSdoBasicoCotizaRcv, 
                    java.lang.String snSegundoApellido, 
                    java.lang.String snTipoMovto, 
                    java.lang.String snTrabajadorRegAfore, 
                    java.lang.Long snVersion) {
        this.idSarNvo = idSarNvo;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEdoCivil = idEdoCivil;
        this.idEdoNac = idEdoNac;
        this.idEdoParti = idEdoParti;
        this.idEdoReceptora = idEdoReceptora;
        this.idGenero = idGenero;
        this.idMunicipio = idMunicipio;
        this.snAportAhorroSol = snAportAhorroSol;
        this.snCalleParti = snCalleParti;
        this.snCiclo = snCiclo;
        this.snCodPost = snCodPost;
        this.snColoniaParti = snColoniaParti;
        this.snCredFovissste = snCredFovissste;
        this.snCurp = snCurp;
        this.snDiasAusentismoBim = snDiasAusentismoBim;
        this.snDiasCotizadosBim = snDiasCotizadosBim;
        this.snDiasIncapacidadBim = snDiasIncapacidadBim;
        this.snFecCotizaIssste = snFecCotizaIssste;
        this.snFecIngrDep = snFecIngrDep;
        this.snFecNac = snFecNac;
        this.snImpAhorroSol = snImpAhorroSol;
        this.snNombramiento = snNombramiento;
        this.snNombre = snNombre;
        this.snNssIssste = snNssIssste;
        this.snNumEmpleado = snNumEmpleado;
        this.snPagaduria = snPagaduria;
        this.snPrimerApellido = snPrimerApellido;
        this.snReparto = snReparto;
        this.snRfc = snRfc;
        this.snSarBimestre = snSarBimestre;
        this.snSdoBasicoAmorFovissste = snSdoBasicoAmorFovissste;
        this.snSdoBasicoCotizaFovissste = snSdoBasicoCotizaFovissste;
        this.snSdoBasicoCotizaRcv = snSdoBasicoCotizaRcv;
        this.snSegundoApellido = snSegundoApellido;
        this.snTipoMovto = snTipoMovto;
        this.snTrabajadorRegAfore = snTrabajadorRegAfore;
        this.snVersion = snVersion;
    }

    /**
     * Get idSarNvo value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getIdSarNvo() {
        return this.idSarNvo;
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
     * Get idEdoCivil value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoCivil() {
        return this.idEdoCivil;
    }

    /**
     * Get idEdoNac value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoNac() {
        return this.idEdoNac;
    }

    /**
     * Get idEdoParti value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoParti() {
        return this.idEdoParti;
    }

    /**
     * Get idEdoReceptora value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoReceptora() {
        return this.idEdoReceptora;
    }

    /**
     * Get idGenero value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGenero() {
        return this.idGenero;
    }

    /**
     * Get idMunicipio value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdMunicipio() {
        return this.idMunicipio;
    }

    /**
     * Get snAportAhorroSol value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnAportAhorroSol() {
        return this.snAportAhorroSol;
    }

    /**
     * Get snCalleParti value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnCalleParti() {
        return this.snCalleParti;
    }

    /**
     * Get snCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Long getSnCiclo() {
        return this.snCiclo;
    }

    /**
     * Get snCodPost value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnCodPost() {
        return this.snCodPost;
    }

    /**
     * Get snColoniaParti value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnColoniaParti() {
        return this.snColoniaParti;
    }

    /**
     * Get snCredFovissste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnCredFovissste() {
        return this.snCredFovissste;
    }

    /**
     * Get snCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnCurp() {
        return this.snCurp;
    }

    /**
     * Get snDiasAusentismoBim value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnDiasAusentismoBim() {
        return this.snDiasAusentismoBim;
    }

    /**
     * Get snDiasCotizadosBim value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnDiasCotizadosBim() {
        return this.snDiasCotizadosBim;
    }

    /**
     * Get snDiasIncapacidadBim value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnDiasIncapacidadBim() {
        return this.snDiasIncapacidadBim;
    }

    /**
     * Get snFecCotizaIssste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnFecCotizaIssste() {
        return this.snFecCotizaIssste;
    }

    /**
     * Get snFecIngrDep value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnFecIngrDep() {
        return this.snFecIngrDep;
    }

    /**
     * Get snFecNac value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnFecNac() {
        return this.snFecNac;
    }

    /**
     * Get snImpAhorroSol value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnImpAhorroSol() {
        return this.snImpAhorroSol;
    }

    /**
     * Get snNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnNombramiento() {
        return this.snNombramiento;
    }

    /**
     * Get snNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnNombre() {
        return this.snNombre;
    }

    /**
     * Get snNssIssste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnNssIssste() {
        return this.snNssIssste;
    }

    /**
     * Get snNumEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnNumEmpleado() {
        return this.snNumEmpleado;
    }

    /**
     * Get snPagaduria value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnPagaduria() {
        return this.snPagaduria;
    }

    /**
     * Get snPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnPrimerApellido() {
        return this.snPrimerApellido;
    }

    /**
     * Get snReparto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnReparto() {
        return this.snReparto;
    }

    /**
     * Get snRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnRfc() {
        return this.snRfc;
    }

    /**
     * Get snSarBimestre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnSarBimestre() {
        return this.snSarBimestre;
    }

    /**
     * Get snSdoBasicoAmorFovissste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnSdoBasicoAmorFovissste() {
        return this.snSdoBasicoAmorFovissste;
    }

    /**
     * Get snSdoBasicoCotizaFovissste value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnSdoBasicoCotizaFovissste() {
        return this.snSdoBasicoCotizaFovissste;
    }

    /**
     * Get snSdoBasicoCotizaRcv value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnSdoBasicoCotizaRcv() {
        return this.snSdoBasicoCotizaRcv;
    }

    /**
     * Get snSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnSegundoApellido() {
        return this.snSegundoApellido;
    }

    /**
     * Get snTipoMovto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnTipoMovto() {
        return this.snTipoMovto;
    }

    /**
     * Get snTrabajadorRegAfore value.
     *
     * @return java.lang.String
     */
    public java.lang.String getSnTrabajadorRegAfore() {
        return this.snTrabajadorRegAfore;
    }

    /**
     * Get snVersion value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getSnVersion() {
        return this.snVersion;
    }

    /**
     * Set idSarNvo value.
     *
     * @param idSarNvo java.lang.Long
     */
    public void setIdSarNvo(java.lang.Long idSarNvo) {
        this.idSarNvo = idSarNvo;
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
     * Set idEdoCivil value.
     *
     * @param idEdoCivil java.lang.String
     */
    public void setIdEdoCivil(java.lang.String idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    /**
     * Set idEdoNac value.
     *
     * @param idEdoNac java.lang.String
     */
    public void setIdEdoNac(java.lang.String idEdoNac) {
        this.idEdoNac = idEdoNac;
    }

    /**
     * Set idEdoParti value.
     *
     * @param idEdoParti java.lang.String
     */
    public void setIdEdoParti(java.lang.String idEdoParti) {
        this.idEdoParti = idEdoParti;
    }

    /**
     * Set idEdoReceptora value.
     *
     * @param idEdoReceptora java.lang.String
     */
    public void setIdEdoReceptora(java.lang.String idEdoReceptora) {
        this.idEdoReceptora = idEdoReceptora;
    }

    /**
     * Set idGenero value.
     *
     * @param idGenero java.lang.String
     */
    public void setIdGenero(java.lang.String idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * Set idMunicipio value.
     *
     * @param idMunicipio java.lang.String
     */
    public void setIdMunicipio(java.lang.String idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * Set snAportAhorroSol value.
     *
     * @param snAportAhorroSol java.lang.String
     */
    public void setSnAportAhorroSol(java.lang.String snAportAhorroSol) {
        this.snAportAhorroSol = snAportAhorroSol;
    }

    /**
     * Set snCalleParti value.
     *
     * @param snCalleParti java.lang.String
     */
    public void setSnCalleParti(java.lang.String snCalleParti) {
        this.snCalleParti = snCalleParti;
    }

    /**
     * Set snCiclo value.
     *
     * @param snCiclo java.lang.Integer
     */
    public void setSnCiclo(java.lang.Long snCiclo) {
        this.snCiclo = snCiclo;
    }

    /**
     * Set snCodPost value.
     *
     * @param snCodPost java.lang.String
     */
    public void setSnCodPost(java.lang.String snCodPost) {
        this.snCodPost = snCodPost;
    }

    /**
     * Set snColoniaParti value.
     *
     * @param snColoniaParti java.lang.String
     */
    public void setSnColoniaParti(java.lang.String snColoniaParti) {
        this.snColoniaParti = snColoniaParti;
    }

    /**
     * Set snCredFovissste value.
     *
     * @param snCredFovissste java.lang.String
     */
    public void setSnCredFovissste(java.lang.String snCredFovissste) {
        this.snCredFovissste = snCredFovissste;
    }

    /**
     * Set snCurp value.
     *
     * @param snCurp java.lang.String
     */
    public void setSnCurp(java.lang.String snCurp) {
        this.snCurp = snCurp;
    }

    /**
     * Set snDiasAusentismoBim value.
     *
     * @param snDiasAusentismoBim java.lang.String
     */
    public void setSnDiasAusentismoBim(java.lang.String snDiasAusentismoBim) {
        this.snDiasAusentismoBim = snDiasAusentismoBim;
    }

    /**
     * Set snDiasCotizadosBim value.
     *
     * @param snDiasCotizadosBim java.lang.String
     */
    public void setSnDiasCotizadosBim(java.lang.String snDiasCotizadosBim) {
        this.snDiasCotizadosBim = snDiasCotizadosBim;
    }

    /**
     * Set snDiasIncapacidadBim value.
     *
     * @param snDiasIncapacidadBim java.lang.String
     */
    public void setSnDiasIncapacidadBim(java.lang.String snDiasIncapacidadBim) {
        this.snDiasIncapacidadBim = snDiasIncapacidadBim;
    }

    /**
     * Set snFecCotizaIssste value.
     *
     * @param snFecCotizaIssste java.lang.String
     */
    public void setSnFecCotizaIssste(java.lang.String snFecCotizaIssste) {
        this.snFecCotizaIssste = snFecCotizaIssste;
    }

    /**
     * Set snFecIngrDep value.
     *
     * @param snFecIngrDep java.lang.String
     */
    public void setSnFecIngrDep(java.lang.String snFecIngrDep) {
        this.snFecIngrDep = snFecIngrDep;
    }

    /**
     * Set snFecNac value.
     *
     * @param snFecNac java.lang.String
     */
    public void setSnFecNac(java.lang.String snFecNac) {
        this.snFecNac = snFecNac;
    }

    /**
     * Set snImpAhorroSol value.
     *
     * @param snImpAhorroSol java.lang.String
     */
    public void setSnImpAhorroSol(java.lang.String snImpAhorroSol) {
        this.snImpAhorroSol = snImpAhorroSol;
    }

    /**
     * Set snNombramiento value.
     *
     * @param snNombramiento java.lang.String
     */
    public void setSnNombramiento(java.lang.String snNombramiento) {
        this.snNombramiento = snNombramiento;
    }

    /**
     * Set snNombre value.
     *
     * @param snNombre java.lang.String
     */
    public void setSnNombre(java.lang.String snNombre) {
        this.snNombre = snNombre;
    }

    /**
     * Set snNssIssste value.
     *
     * @param snNssIssste java.lang.String
     */
    public void setSnNssIssste(java.lang.String snNssIssste) {
        this.snNssIssste = snNssIssste;
    }

    /**
     * Set snNumEmpleado value.
     *
     * @param snNumEmpleado java.lang.String
     */
    public void setSnNumEmpleado(java.lang.String snNumEmpleado) {
        this.snNumEmpleado = snNumEmpleado;
    }

    /**
     * Set snPagaduria value.
     *
     * @param snPagaduria java.lang.String
     */
    public void setSnPagaduria(java.lang.String snPagaduria) {
        this.snPagaduria = snPagaduria;
    }

    /**
     * Set snPrimerApellido value.
     *
     * @param snPrimerApellido java.lang.String
     */
    public void setSnPrimerApellido(java.lang.String snPrimerApellido) {
        this.snPrimerApellido = snPrimerApellido;
    }

    /**
     * Set snReparto value.
     *
     * @param snReparto java.lang.String
     */
    public void setSnReparto(java.lang.String snReparto) {
        this.snReparto = snReparto;
    }

    /**
     * Set snRfc value.
     *
     * @param snRfc java.lang.String
     */
    public void setSnRfc(java.lang.String snRfc) {
        this.snRfc = snRfc;
    }

    /**
     * Set snSarBimestre value.
     *
     * @param snSarBimestre java.lang.String
     */
    public void setSnSarBimestre(java.lang.String snSarBimestre) {
        this.snSarBimestre = snSarBimestre;
    }

    /**
     * Set snSdoBasicoAmorFovissste value.
     *
     * @param snSdoBasicoAmorFovissste java.lang.String
     */
    public void setSnSdoBasicoAmorFovissste(java.lang.String snSdoBasicoAmorFovissste) {
        this.snSdoBasicoAmorFovissste = snSdoBasicoAmorFovissste;
    }

    /**
     * Set snSdoBasicoCotizaFovissste value.
     *
     * @param snSdoBasicoCotizaFovissste java.lang.String
     */
    public void setSnSdoBasicoCotizaFovissste(java.lang.String snSdoBasicoCotizaFovissste) {
        this.snSdoBasicoCotizaFovissste = snSdoBasicoCotizaFovissste;
    }

    /**
     * Set snSdoBasicoCotizaRcv value.
     *
     * @param snSdoBasicoCotizaRcv java.lang.String
     */
    public void setSnSdoBasicoCotizaRcv(java.lang.String snSdoBasicoCotizaRcv) {
        this.snSdoBasicoCotizaRcv = snSdoBasicoCotizaRcv;
    }

    /**
     * Set snSegundoApellido value.
     *
     * @param snSegundoApellido java.lang.String
     */
    public void setSnSegundoApellido(java.lang.String snSegundoApellido) {
        this.snSegundoApellido = snSegundoApellido;
    }

    /**
     * Set snTipoMovto value.
     *
     * @param snTipoMovto java.lang.String
     */
    public void setSnTipoMovto(java.lang.String snTipoMovto) {
        this.snTipoMovto = snTipoMovto;
    }

    /**
     * Set snTrabajadorRegAfore value.
     *
     * @param snTrabajadorRegAfore java.lang.String
     */
    public void setSnTrabajadorRegAfore(java.lang.String snTrabajadorRegAfore) {
        this.snTrabajadorRegAfore = snTrabajadorRegAfore;
    }

    /**
     * Set snVersion value.
     *
     * @param snVersion java.lang.Long
     */
    public void setSnVersion(java.lang.Long snVersion) {
        this.snVersion = snVersion;
    }

    /**
     * Set identity value.
     *
     * @param idSarNvo Serializable
     */
    public void setIdentity(Serializable idSarNvo) {
        this.idSarNvo = (java.lang.Long)idSarNvo;
    }

    /**
     * Get identity value.
     *
     * @return Serializable
     */
    public Serializable getIdentity() {
        return this.idSarNvo;
    }
}
