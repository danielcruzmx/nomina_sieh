package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TdRuspInfoBasica data.
 */
public class TdRuspInfoBasicaDTO implements java.io.Serializable, Model {

    private java.lang.Integer ribCiclo;
    private java.lang.Integer ribPlaza;
    private java.lang.Integer ribQnaPago;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode = "not.null")
    @NotNull
    @MaxLength(120)
    private java.lang.String usuario;
    private java.lang.Integer idEdo;
    private java.lang.Integer idEdoNac;
    private java.lang.Integer idMunicipio;
    @MaxLength(16)
    private java.lang.String idNivelPto;
    @MaxLength(28)
    private java.lang.String idPuesto;
    @MaxLength(8)
    private java.lang.String idSitPlaza;
    @MaxLength(16)
    private java.lang.String idUnidad;
    private java.lang.Integer idZonaEcon;
    private java.util.Date ribAltaUltimoPuesto;
    @MaxLength(88)
    private java.lang.String ribClaveSep;
    @MaxLength(120)
    private java.lang.String ribCodigoPuesto;
    private java.lang.Double ribCompensacion;
    private java.lang.Integer ribConsPto;
    private java.lang.Integer ribConsPtoJefe;
    @MaxLength(72)
    private java.lang.String ribCurp;
    @MaxLength(4)
    private java.lang.String ribDeclaracionPatrimonial;
    private java.lang.Boolean ribEstatusOcupacional;
    @MaxLength(400)
    private java.lang.String ribEMail;
    private java.util.Date ribFechaNacimiento;
    private java.lang.Boolean ribFuncionPuesto;
    private java.lang.Boolean ribGenero;
    private java.util.Date ribIngresoApf;
    private java.util.Date ribIngresoInstitucion;
    private java.util.Date ribIngresoSpc;
    private java.lang.Boolean ribInstSegSocial;
    private java.lang.Boolean ribMotivoDeclaracion;
    @MaxLength(16)
    private java.lang.String ribNivelTabularPagado;
    @MaxLength(200)
    private java.lang.String ribNombre;
    @MaxLength(1000)
    private java.lang.String ribNombrePuesto;
    @MaxLength(200)
    private java.lang.String ribNumeroEmpleado;
    @MaxLength(60)
    private java.lang.String ribNumSegSocial;
    private java.util.Date ribObligacionDeclPat;
    private java.lang.Integer ribPaisNac;
    private java.lang.Integer ribPaisPlaza;
    @MaxLength(200)
    private java.lang.String ribPrimerApellido;
    private java.lang.Integer ribPuestoEstr;
    private java.lang.Integer ribRamo;
    @MaxLength(52)
    private java.lang.String ribRfc;
    @MaxLength(200)
    private java.lang.String ribSegundoApellido;
    private java.lang.Double ribSueldo;
    private java.lang.Boolean ribTipoContratacion;
    private java.lang.Boolean ribTipoPersonal;
    private java.lang.Boolean ribTipoPlaza;

    /**
     * Constructor for TdRuspInfoBasicaDTO class.
     */
    public TdRuspInfoBasicaDTO() {
    }
    
    /**
     * Constructor for TdRuspInfoBasicaDTO class.
     *
     * @param ribCiclo java.lang.Integer
     * @param ribPlaza java.lang.Integer
     * @param ribQnaPago java.lang.Integer
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param idEdo java.lang.Integer
     * @param idEdoNac java.lang.Integer
     * @param idMunicipio java.lang.Integer
     * @param idNivelPto java.lang.String
     * @param idPuesto java.lang.String
     * @param idSitPlaza java.lang.String
     * @param idUnidad java.lang.String
     * @param idZonaEcon java.lang.Integer
     * @param ribAltaUltimoPuesto java.util.Date
     * @param ribClaveSep java.lang.String
     * @param ribCodigoPuesto java.lang.String
     * @param ribCompensacion java.lang.Double
     * @param ribConsPto java.lang.Integer
     * @param ribConsPtoJefe java.lang.Integer
     * @param ribCurp java.lang.String
     * @param ribDeclaracionPatrimonial java.lang.String
     * @param ribEstatusOcupacional java.lang.Boolean
     * @param ribEMail java.lang.String
     * @param ribFechaNacimiento java.util.Date
     * @param ribFuncionPuesto java.lang.Boolean
     * @param ribGenero java.lang.Boolean
     * @param ribIngresoApf java.util.Date
     * @param ribIngresoInstitucion java.util.Date
     * @param ribIngresoSpc java.util.Date
     * @param ribInstSegSocial java.lang.Boolean
     * @param ribMotivoDeclaracion java.lang.Boolean
     * @param ribNivelTabularPagado java.lang.String
     * @param ribNombre java.lang.String
     * @param ribNombrePuesto java.lang.String
     * @param ribNumeroEmpleado java.lang.String
     * @param ribNumSegSocial java.lang.String
     * @param ribObligacionDeclPat java.util.Date
     * @param ribPaisNac java.lang.Integer
     * @param ribPaisPlaza java.lang.Integer
     * @param ribPrimerApellido java.lang.String
     * @param ribPuestoEstr java.lang.Integer
     * @param ribRamo java.lang.Integer
     * @param ribRfc java.lang.String
     * @param ribSegundoApellido java.lang.String
     * @param ribSueldo java.lang.Double
     * @param ribTipoContratacion java.lang.Boolean
     * @param ribTipoPersonal java.lang.Boolean
     * @param ribTipoPlaza java.lang.Boolean
     */
    public TdRuspInfoBasicaDTO(java.lang.Integer ribCiclo, java.lang.Integer ribPlaza, java.lang.Integer ribQnaPago, 
                               java.util.Date fecModifico, java.lang.String usuario, java.lang.Integer idEdo, 
                               java.lang.Integer idEdoNac, java.lang.Integer idMunicipio, java.lang.String idNivelPto, 
                               java.lang.String idPuesto, java.lang.String idSitPlaza, java.lang.String idUnidad, 
                               java.lang.Integer idZonaEcon, java.util.Date ribAltaUltimoPuesto, 
                               java.lang.String ribClaveSep, java.lang.String ribCodigoPuesto, 
                               java.lang.Double ribCompensacion, java.lang.Integer ribConsPto, 
                               java.lang.Integer ribConsPtoJefe, java.lang.String ribCurp, 
                               java.lang.String ribDeclaracionPatrimonial, java.lang.Boolean ribEstatusOcupacional, 
                               java.lang.String ribEMail, java.util.Date ribFechaNacimiento, 
                               java.lang.Boolean ribFuncionPuesto, java.lang.Boolean ribGenero, 
                               java.util.Date ribIngresoApf, java.util.Date ribIngresoInstitucion, 
                               java.util.Date ribIngresoSpc, java.lang.Boolean ribInstSegSocial, 
                               java.lang.Boolean ribMotivoDeclaracion, java.lang.String ribNivelTabularPagado, 
                               java.lang.String ribNombre, java.lang.String ribNombrePuesto, 
                               java.lang.String ribNumeroEmpleado, java.lang.String ribNumSegSocial, 
                               java.util.Date ribObligacionDeclPat, java.lang.Integer ribPaisNac, 
                               java.lang.Integer ribPaisPlaza, java.lang.String ribPrimerApellido, 
                               java.lang.Integer ribPuestoEstr, java.lang.Integer ribRamo, java.lang.String ribRfc, 
                               java.lang.String ribSegundoApellido, java.lang.Double ribSueldo, 
                               java.lang.Boolean ribTipoContratacion, java.lang.Boolean ribTipoPersonal, 
                               java.lang.Boolean ribTipoPlaza) {
        this.ribCiclo = ribCiclo;
        this.ribPlaza = ribPlaza;
        this.ribQnaPago = ribQnaPago;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.idEdo = idEdo;
        this.idEdoNac = idEdoNac;
        this.idMunicipio = idMunicipio;
        this.idNivelPto = idNivelPto;
        this.idPuesto = idPuesto;
        this.idSitPlaza = idSitPlaza;
        this.idUnidad = idUnidad;
        this.idZonaEcon = idZonaEcon;
        this.ribAltaUltimoPuesto = ribAltaUltimoPuesto;
        this.ribClaveSep = ribClaveSep;
        this.ribCodigoPuesto = ribCodigoPuesto;
        this.ribCompensacion = ribCompensacion;
        this.ribConsPto = ribConsPto;
        this.ribConsPtoJefe = ribConsPtoJefe;
        this.ribCurp = ribCurp;
        this.ribDeclaracionPatrimonial = ribDeclaracionPatrimonial;
        this.ribEstatusOcupacional = ribEstatusOcupacional;
        this.ribEMail = ribEMail;
        this.ribFechaNacimiento = ribFechaNacimiento;
        this.ribFuncionPuesto = ribFuncionPuesto;
        this.ribGenero = ribGenero;
        this.ribIngresoApf = ribIngresoApf;
        this.ribIngresoInstitucion = ribIngresoInstitucion;
        this.ribIngresoSpc = ribIngresoSpc;
        this.ribInstSegSocial = ribInstSegSocial;
        this.ribMotivoDeclaracion = ribMotivoDeclaracion;
        this.ribNivelTabularPagado = ribNivelTabularPagado;
        this.ribNombre = ribNombre;
        this.ribNombrePuesto = ribNombrePuesto;
        this.ribNumeroEmpleado = ribNumeroEmpleado;
        this.ribNumSegSocial = ribNumSegSocial;
        this.ribObligacionDeclPat = ribObligacionDeclPat;
        this.ribPaisNac = ribPaisNac;
        this.ribPaisPlaza = ribPaisPlaza;
        this.ribPrimerApellido = ribPrimerApellido;
        this.ribPuestoEstr = ribPuestoEstr;
        this.ribRamo = ribRamo;
        this.ribRfc = ribRfc;
        this.ribSegundoApellido = ribSegundoApellido;
        this.ribSueldo = ribSueldo;
        this.ribTipoContratacion = ribTipoContratacion;
        this.ribTipoPersonal = ribTipoPersonal;
        this.ribTipoPlaza = ribTipoPlaza;
    }

    /**
     * Set ribCiclo value.
     *
     * @param ribCiclo java.lang.Integer
     */
    public void setRibCiclo(java.lang.Integer ribCiclo) {
        this.ribCiclo = ribCiclo;
    }

    /**
     * Get ribCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibCiclo() {
        return this.ribCiclo;
    }

    /**
     * Set ribPlaza value.
     *
     * @param ribPlaza java.lang.Integer
     */
    public void setRibPlaza(java.lang.Integer ribPlaza) {
        this.ribPlaza = ribPlaza;
    }

    /**
     * Get ribPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPlaza() {
        return this.ribPlaza;
    }

    /**
     * Set ribQnaPago value.
     *
     * @param ribQnaPago java.lang.Integer
     */
    public void setRibQnaPago(java.lang.Integer ribQnaPago) {
        this.ribQnaPago = ribQnaPago;
    }

    /**
     * Get ribQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibQnaPago() {
        return this.ribQnaPago;
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
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
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
     * Set idEdoNac value.
     *
     * @param idEdoNac java.lang.Integer
     */
    public void setIdEdoNac(java.lang.Integer idEdoNac) {
        this.idEdoNac = idEdoNac;
    }

    /**
     * Get idEdoNac value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdoNac() {
        return this.idEdoNac;
    }

    /**
     * Set idMunicipio value.
     *
     * @param idMunicipio java.lang.Integer
     */
    public void setIdMunicipio(java.lang.Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    /**
     * Get idMunicipio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMunicipio() {
        return this.idMunicipio;
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
     * Get idNivelPto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdNivelPto() {
        return this.idNivelPto;
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
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
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
     * Set idZonaEcon value.
     *
     * @param idZonaEcon java.lang.Integer
     */
    public void setIdZonaEcon(java.lang.Integer idZonaEcon) {
        this.idZonaEcon = idZonaEcon;
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
     * Set ribAltaUltimoPuesto value.
     *
     * @param ribAltaUltimoPuesto java.util.Date
     */
    public void setRibAltaUltimoPuesto(java.util.Date ribAltaUltimoPuesto) {
        this.ribAltaUltimoPuesto = ribAltaUltimoPuesto;
    }

    /**
     * Get ribAltaUltimoPuesto value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibAltaUltimoPuesto() {
        return this.ribAltaUltimoPuesto;
    }

    /**
     * Set ribClaveSep value.
     *
     * @param ribClaveSep java.lang.String
     */
    public void setRibClaveSep(java.lang.String ribClaveSep) {
        this.ribClaveSep = ribClaveSep;
    }

    /**
     * Get ribClaveSep value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibClaveSep() {
        return this.ribClaveSep;
    }

    /**
     * Set ribCodigoPuesto value.
     *
     * @param ribCodigoPuesto java.lang.String
     */
    public void setRibCodigoPuesto(java.lang.String ribCodigoPuesto) {
        this.ribCodigoPuesto = ribCodigoPuesto;
    }

    /**
     * Get ribCodigoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibCodigoPuesto() {
        return this.ribCodigoPuesto;
    }

    /**
     * Set ribCompensacion value.
     *
     * @param ribCompensacion java.lang.Double
     */
    public void setRibCompensacion(java.lang.Double ribCompensacion) {
        this.ribCompensacion = ribCompensacion;
    }

    /**
     * Get ribCompensacion value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getRibCompensacion() {
        return this.ribCompensacion;
    }

    /**
     * Set ribConsPto value.
     *
     * @param ribConsPto java.lang.Integer
     */
    public void setRibConsPto(java.lang.Integer ribConsPto) {
        this.ribConsPto = ribConsPto;
    }

    /**
     * Get ribConsPto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibConsPto() {
        return this.ribConsPto;
    }

    /**
     * Set ribConsPtoJefe value.
     *
     * @param ribConsPtoJefe java.lang.Integer
     */
    public void setRibConsPtoJefe(java.lang.Integer ribConsPtoJefe) {
        this.ribConsPtoJefe = ribConsPtoJefe;
    }

    /**
     * Get ribConsPtoJefe value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibConsPtoJefe() {
        return this.ribConsPtoJefe;
    }

    /**
     * Set ribCurp value.
     *
     * @param ribCurp java.lang.String
     */
    public void setRibCurp(java.lang.String ribCurp) {
        this.ribCurp = ribCurp;
    }

    /**
     * Get ribCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibCurp() {
        return this.ribCurp;
    }

    /**
     * Set ribDeclaracionPatrimonial value.
     *
     * @param ribDeclaracionPatrimonial java.lang.String
     */
    public void setRibDeclaracionPatrimonial(java.lang.String ribDeclaracionPatrimonial) {
        this.ribDeclaracionPatrimonial = ribDeclaracionPatrimonial;
    }

    /**
     * Get ribDeclaracionPatrimonial value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibDeclaracionPatrimonial() {
        return this.ribDeclaracionPatrimonial;
    }

    /**
     * Set ribEstatusOcupacional value.
     *
     * @param ribEstatusOcupacional java.lang.Boolean
     */
    public void setRibEstatusOcupacional(java.lang.Boolean ribEstatusOcupacional) {
        this.ribEstatusOcupacional = ribEstatusOcupacional;
    }

    /**
     * Get ribEstatusOcupacional value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibEstatusOcupacional() {
        return this.ribEstatusOcupacional;
    }

    /**
     * Set ribEMail value.
     *
     * @param ribEMail java.lang.String
     */
    public void setRibEMail(java.lang.String ribEMail) {
        this.ribEMail = ribEMail;
    }

    /**
     * Get ribEMail value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibEMail() {
        return this.ribEMail;
    }

    /**
     * Set ribFechaNacimiento value.
     *
     * @param ribFechaNacimiento java.util.Date
     */
    public void setRibFechaNacimiento(java.util.Date ribFechaNacimiento) {
        this.ribFechaNacimiento = ribFechaNacimiento;
    }

    /**
     * Get ribFechaNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibFechaNacimiento() {
        return this.ribFechaNacimiento;
    }

    /**
     * Set ribFuncionPuesto value.
     *
     * @param ribFuncionPuesto java.lang.Boolean
     */
    public void setRibFuncionPuesto(java.lang.Boolean ribFuncionPuesto) {
        this.ribFuncionPuesto = ribFuncionPuesto;
    }

    /**
     * Get ribFuncionPuesto value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibFuncionPuesto() {
        return this.ribFuncionPuesto;
    }

    /**
     * Set ribGenero value.
     *
     * @param ribGenero java.lang.Boolean
     */
    public void setRibGenero(java.lang.Boolean ribGenero) {
        this.ribGenero = ribGenero;
    }

    /**
     * Get ribGenero value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibGenero() {
        return this.ribGenero;
    }

    /**
     * Set ribIngresoApf value.
     *
     * @param ribIngresoApf java.util.Date
     */
    public void setRibIngresoApf(java.util.Date ribIngresoApf) {
        this.ribIngresoApf = ribIngresoApf;
    }

    /**
     * Get ribIngresoApf value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibIngresoApf() {
        return this.ribIngresoApf;
    }

    /**
     * Set ribIngresoInstitucion value.
     *
     * @param ribIngresoInstitucion java.util.Date
     */
    public void setRibIngresoInstitucion(java.util.Date ribIngresoInstitucion) {
        this.ribIngresoInstitucion = ribIngresoInstitucion;
    }

    /**
     * Get ribIngresoInstitucion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibIngresoInstitucion() {
        return this.ribIngresoInstitucion;
    }

    /**
     * Set ribIngresoSpc value.
     *
     * @param ribIngresoSpc java.util.Date
     */
    public void setRibIngresoSpc(java.util.Date ribIngresoSpc) {
        this.ribIngresoSpc = ribIngresoSpc;
    }

    /**
     * Get ribIngresoSpc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibIngresoSpc() {
        return this.ribIngresoSpc;
    }

    /**
     * Set ribInstSegSocial value.
     *
     * @param ribInstSegSocial java.lang.Boolean
     */
    public void setRibInstSegSocial(java.lang.Boolean ribInstSegSocial) {
        this.ribInstSegSocial = ribInstSegSocial;
    }

    /**
     * Get ribInstSegSocial value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibInstSegSocial() {
        return this.ribInstSegSocial;
    }

    /**
     * Set ribMotivoDeclaracion value.
     *
     * @param ribMotivoDeclaracion java.lang.Boolean
     */
    public void setRibMotivoDeclaracion(java.lang.Boolean ribMotivoDeclaracion) {
        this.ribMotivoDeclaracion = ribMotivoDeclaracion;
    }

    /**
     * Get ribMotivoDeclaracion value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibMotivoDeclaracion() {
        return this.ribMotivoDeclaracion;
    }

    /**
     * Set ribNivelTabularPagado value.
     *
     * @param ribNivelTabularPagado java.lang.String
     */
    public void setRibNivelTabularPagado(java.lang.String ribNivelTabularPagado) {
        this.ribNivelTabularPagado = ribNivelTabularPagado;
    }

    /**
     * Get ribNivelTabularPagado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNivelTabularPagado() {
        return this.ribNivelTabularPagado;
    }

    /**
     * Set ribNombre value.
     *
     * @param ribNombre java.lang.String
     */
    public void setRibNombre(java.lang.String ribNombre) {
        this.ribNombre = ribNombre;
    }

    /**
     * Get ribNombre value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNombre() {
        return this.ribNombre;
    }

    /**
     * Set ribNombrePuesto value.
     *
     * @param ribNombrePuesto java.lang.String
     */
    public void setRibNombrePuesto(java.lang.String ribNombrePuesto) {
        this.ribNombrePuesto = ribNombrePuesto;
    }

    /**
     * Get ribNombrePuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNombrePuesto() {
        return this.ribNombrePuesto;
    }

    /**
     * Set ribNumeroEmpleado value.
     *
     * @param ribNumeroEmpleado java.lang.String
     */
    public void setRibNumeroEmpleado(java.lang.String ribNumeroEmpleado) {
        this.ribNumeroEmpleado = ribNumeroEmpleado;
    }

    /**
     * Get ribNumeroEmpleado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNumeroEmpleado() {
        return this.ribNumeroEmpleado;
    }

    /**
     * Set ribNumSegSocial value.
     *
     * @param ribNumSegSocial java.lang.String
     */
    public void setRibNumSegSocial(java.lang.String ribNumSegSocial) {
        this.ribNumSegSocial = ribNumSegSocial;
    }

    /**
     * Get ribNumSegSocial value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNumSegSocial() {
        return this.ribNumSegSocial;
    }

    /**
     * Set ribObligacionDeclPat value.
     *
     * @param ribObligacionDeclPat java.util.Date
     */
    public void setRibObligacionDeclPat(java.util.Date ribObligacionDeclPat) {
        this.ribObligacionDeclPat = ribObligacionDeclPat;
    }

    /**
     * Get ribObligacionDeclPat value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibObligacionDeclPat() {
        return this.ribObligacionDeclPat;
    }

    /**
     * Set ribPaisNac value.
     *
     * @param ribPaisNac java.lang.Integer
     */
    public void setRibPaisNac(java.lang.Integer ribPaisNac) {
        this.ribPaisNac = ribPaisNac;
    }

    /**
     * Get ribPaisNac value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPaisNac() {
        return this.ribPaisNac;
    }

    /**
     * Set ribPaisPlaza value.
     *
     * @param ribPaisPlaza java.lang.Integer
     */
    public void setRibPaisPlaza(java.lang.Integer ribPaisPlaza) {
        this.ribPaisPlaza = ribPaisPlaza;
    }

    /**
     * Get ribPaisPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPaisPlaza() {
        return this.ribPaisPlaza;
    }

    /**
     * Set ribPrimerApellido value.
     *
     * @param ribPrimerApellido java.lang.String
     */
    public void setRibPrimerApellido(java.lang.String ribPrimerApellido) {
        this.ribPrimerApellido = ribPrimerApellido;
    }

    /**
     * Get ribPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibPrimerApellido() {
        return this.ribPrimerApellido;
    }

    /**
     * Set ribPuestoEstr value.
     *
     * @param ribPuestoEstr java.lang.Integer
     */
    public void setRibPuestoEstr(java.lang.Integer ribPuestoEstr) {
        this.ribPuestoEstr = ribPuestoEstr;
    }

    /**
     * Get ribPuestoEstr value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPuestoEstr() {
        return this.ribPuestoEstr;
    }

    /**
     * Set ribRamo value.
     *
     * @param ribRamo java.lang.Integer
     */
    public void setRibRamo(java.lang.Integer ribRamo) {
        this.ribRamo = ribRamo;
    }

    /**
     * Get ribRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibRamo() {
        return this.ribRamo;
    }

    /**
     * Set ribRfc value.
     *
     * @param ribRfc java.lang.String
     */
    public void setRibRfc(java.lang.String ribRfc) {
        this.ribRfc = ribRfc;
    }

    /**
     * Get ribRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibRfc() {
        return this.ribRfc;
    }

    /**
     * Set ribSegundoApellido value.
     *
     * @param ribSegundoApellido java.lang.String
     */
    public void setRibSegundoApellido(java.lang.String ribSegundoApellido) {
        this.ribSegundoApellido = ribSegundoApellido;
    }

    /**
     * Get ribSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibSegundoApellido() {
        return this.ribSegundoApellido;
    }

    /**
     * Set ribSueldo value.
     *
     * @param ribSueldo java.lang.Double
     */
    public void setRibSueldo(java.lang.Double ribSueldo) {
        this.ribSueldo = ribSueldo;
    }

    /**
     * Get ribSueldo value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getRibSueldo() {
        return this.ribSueldo;
    }

    /**
     * Set ribTipoContratacion value.
     *
     * @param ribTipoContratacion java.lang.Boolean
     */
    public void setRibTipoContratacion(java.lang.Boolean ribTipoContratacion) {
        this.ribTipoContratacion = ribTipoContratacion;
    }

    /**
     * Get ribTipoContratacion value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibTipoContratacion() {
        return this.ribTipoContratacion;
    }

    /**
     * Set ribTipoPersonal value.
     *
     * @param ribTipoPersonal java.lang.Boolean
     */
    public void setRibTipoPersonal(java.lang.Boolean ribTipoPersonal) {
        this.ribTipoPersonal = ribTipoPersonal;
    }

    /**
     * Get ribTipoPersonal value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibTipoPersonal() {
        return this.ribTipoPersonal;
    }

    /**
     * Set ribTipoPlaza value.
     *
     * @param ribTipoPlaza java.lang.Boolean
     */
    public void setRibTipoPlaza(java.lang.Boolean ribTipoPlaza) {
        this.ribTipoPlaza = ribTipoPlaza;
    }

    /**
     * Get ribTipoPlaza value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibTipoPlaza() {
        return this.ribTipoPlaza;
    }
}
