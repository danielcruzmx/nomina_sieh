package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TdRuspInfoBasica data.
 */
public class TdRuspInfoBasica implements Domain, Serializable {
    
    private TdRuspInfoBasicaPK idComposite;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.lang.Integer idEdo;
    private java.lang.Integer idEdoNac;
    private java.lang.Integer idMunicipio;
    private java.lang.String idNivelPto;
    private java.lang.String idPuesto;
    private java.lang.String idSitPlaza;
    private java.lang.String idUnidad;
    private java.lang.Integer idZonaEcon;
    private java.util.Date ribAltaUltimoPuesto;
    private java.lang.String ribClaveSep;
    private java.lang.String ribCodigoPuesto;
    private java.lang.Double ribCompensacion;
    private java.lang.Integer ribConsPto;
    private java.lang.Integer ribConsPtoJefe;
    private java.lang.String ribCurp;
    private java.lang.String ribDeclaracionPatrimonial;
    private java.lang.Boolean ribEstatusOcupacional;
    private java.lang.String ribEMail;
    private java.util.Date ribFechaNacimiento;
    private java.lang.Boolean ribFuncionPuesto;
    private java.lang.Boolean ribGenero;
    private java.util.Date ribIngresoApf;
    private java.util.Date ribIngresoInstitucion;
    private java.util.Date ribIngresoSpc;
    private java.lang.Boolean ribInstSegSocial;
    private java.lang.Boolean ribMotivoDeclaracion;
    private java.lang.String ribNivelTabularPagado;
    private java.lang.String ribNombre;
    private java.lang.String ribNombrePuesto;
    private java.lang.String ribNumeroEmpleado;
    private java.lang.String ribNumSegSocial;
    private java.util.Date ribObligacionDeclPat;
    private java.lang.Integer ribPaisNac;
    private java.lang.Integer ribPaisPlaza;
    private java.lang.String ribPrimerApellido;
    private java.lang.Integer ribPuestoEstr;
    private java.lang.Integer ribRamo;
    private java.lang.String ribRfc;
    private java.lang.String ribSegundoApellido;
    private java.lang.Double ribSueldo;
    private java.lang.Boolean ribTipoContratacion;
    private java.lang.Boolean ribTipoPersonal;
    private java.lang.Boolean ribTipoPlaza;

    /**
     * Constructor for TdRuspInfoBasica class.
     */
    public TdRuspInfoBasica() {
    }

    /**
     * Constructor for TdRuspInfoBasica class.
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
    public TdRuspInfoBasica(TdRuspInfoBasicaPK idComposite, java.util.Date fecModifico, java.lang.String usuario, 
                            java.lang.Integer idEdo, java.lang.Integer idEdoNac, java.lang.Integer idMunicipio, 
                            java.lang.String idNivelPto, java.lang.String idPuesto, java.lang.String idSitPlaza, 
                            java.lang.String idUnidad, java.lang.Integer idZonaEcon, 
                            java.util.Date ribAltaUltimoPuesto, java.lang.String ribClaveSep, 
                            java.lang.String ribCodigoPuesto, java.lang.Double ribCompensacion, 
                            java.lang.Integer ribConsPto, java.lang.Integer ribConsPtoJefe, java.lang.String ribCurp, 
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
        this.idComposite = idComposite;
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
     * Get ribCiclo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibCiclo() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRibCiclo();
    }

    /**
     * Get ribPlaza value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPlaza() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRibPlaza();
    }

    /**
     * Get ribQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibQnaPago() {
        if (idComposite == null) {
            return null;
        }
        return this.idComposite.getRibQnaPago();
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
     * Get idEdo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdEdo() {
        return this.idEdo;
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
     * Get idMunicipio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdMunicipio() {
        return this.idMunicipio;
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
     * Get idPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdPuesto() {
        return this.idPuesto;
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
     * Get idUnidad value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdUnidad() {
        return this.idUnidad;
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
     * Get ribAltaUltimoPuesto value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibAltaUltimoPuesto() {
        return this.ribAltaUltimoPuesto;
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
     * Get ribCodigoPuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibCodigoPuesto() {
        return this.ribCodigoPuesto;
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
     * Get ribConsPto value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibConsPto() {
        return this.ribConsPto;
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
     * Get ribCurp value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibCurp() {
        return this.ribCurp;
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
     * Get ribEstatusOcupacional value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibEstatusOcupacional() {
        return this.ribEstatusOcupacional;
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
     * Get ribFechaNacimiento value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibFechaNacimiento() {
        return this.ribFechaNacimiento;
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
     * Get ribGenero value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibGenero() {
        return this.ribGenero;
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
     * Get ribIngresoInstitucion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getRibIngresoInstitucion() {
        return this.ribIngresoInstitucion;
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
     * Get ribInstSegSocial value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibInstSegSocial() {
        return this.ribInstSegSocial;
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
     * Get ribNivelTabularPagado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNivelTabularPagado() {
        return this.ribNivelTabularPagado;
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
     * Get ribNombrePuesto value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNombrePuesto() {
        return this.ribNombrePuesto;
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
     * Get ribNumSegSocial value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibNumSegSocial() {
        return this.ribNumSegSocial;
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
     * Get ribPaisNac value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibPaisNac() {
        return this.ribPaisNac;
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
     * Get ribPrimerApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibPrimerApellido() {
        return this.ribPrimerApellido;
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
     * Get ribRamo value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getRibRamo() {
        return this.ribRamo;
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
     * Get ribSegundoApellido value.
     *
     * @return java.lang.String
     */
    public java.lang.String getRibSegundoApellido() {
        return this.ribSegundoApellido;
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
     * Get ribTipoContratacion value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibTipoContratacion() {
        return this.ribTipoContratacion;
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
     * Get ribTipoPlaza value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isRibTipoPlaza() {
        return this.ribTipoPlaza;
    }


    /**
     * Set ribCiclo value.
     *
     * @param ribCiclo java.lang.Integer
     */
    public void setRibCiclo(java.lang.Integer ribCiclo) {
        if (idComposite == null) {
            idComposite = new TdRuspInfoBasicaPK();
        }
        this.idComposite.setRibCiclo(ribCiclo);
    }

    /**
     * Set ribPlaza value.
     *
     * @param ribPlaza java.lang.Integer
     */
    public void setRibPlaza(java.lang.Integer ribPlaza) {
        if (idComposite == null) {
            idComposite = new TdRuspInfoBasicaPK();
        }
        this.idComposite.setRibPlaza(ribPlaza);
    }

    /**
     * Set ribQnaPago value.
     *
     * @param ribQnaPago java.lang.Integer
     */
    public void setRibQnaPago(java.lang.Integer ribQnaPago) {
        if (idComposite == null) {
            idComposite = new TdRuspInfoBasicaPK();
        }
        this.idComposite.setRibQnaPago(ribQnaPago);
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
     * Set idEdo value.
     *
     * @param idEdo java.lang.Integer
     */
    public void setIdEdo(java.lang.Integer idEdo) {
        this.idEdo = idEdo;
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
     * Set idMunicipio value.
     *
     * @param idMunicipio java.lang.Integer
     */
    public void setIdMunicipio(java.lang.Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
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
     * Set idPuesto value.
     *
     * @param idPuesto java.lang.String
     */
    public void setIdPuesto(java.lang.String idPuesto) {
        this.idPuesto = idPuesto;
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
     * Set idUnidad value.
     *
     * @param idUnidad java.lang.String
     */
    public void setIdUnidad(java.lang.String idUnidad) {
        this.idUnidad = idUnidad;
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
     * Set ribAltaUltimoPuesto value.
     *
     * @param ribAltaUltimoPuesto java.util.Date
     */
    public void setRibAltaUltimoPuesto(java.util.Date ribAltaUltimoPuesto) {
        this.ribAltaUltimoPuesto = ribAltaUltimoPuesto;
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
     * Set ribCodigoPuesto value.
     *
     * @param ribCodigoPuesto java.lang.String
     */
    public void setRibCodigoPuesto(java.lang.String ribCodigoPuesto) {
        this.ribCodigoPuesto = ribCodigoPuesto;
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
     * Set ribConsPto value.
     *
     * @param ribConsPto java.lang.Integer
     */
    public void setRibConsPto(java.lang.Integer ribConsPto) {
        this.ribConsPto = ribConsPto;
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
     * Set ribCurp value.
     *
     * @param ribCurp java.lang.String
     */
    public void setRibCurp(java.lang.String ribCurp) {
        this.ribCurp = ribCurp;
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
     * Set ribEstatusOcupacional value.
     *
     * @param ribEstatusOcupacional java.lang.Boolean
     */
    public void setRibEstatusOcupacional(java.lang.Boolean ribEstatusOcupacional) {
        this.ribEstatusOcupacional = ribEstatusOcupacional;
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
     * Set ribFechaNacimiento value.
     *
     * @param ribFechaNacimiento java.util.Date
     */
    public void setRibFechaNacimiento(java.util.Date ribFechaNacimiento) {
        this.ribFechaNacimiento = ribFechaNacimiento;
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
     * Set ribGenero value.
     *
     * @param ribGenero java.lang.Boolean
     */
    public void setRibGenero(java.lang.Boolean ribGenero) {
        this.ribGenero = ribGenero;
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
     * Set ribIngresoInstitucion value.
     *
     * @param ribIngresoInstitucion java.util.Date
     */
    public void setRibIngresoInstitucion(java.util.Date ribIngresoInstitucion) {
        this.ribIngresoInstitucion = ribIngresoInstitucion;
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
     * Set ribInstSegSocial value.
     *
     * @param ribInstSegSocial java.lang.Boolean
     */
    public void setRibInstSegSocial(java.lang.Boolean ribInstSegSocial) {
        this.ribInstSegSocial = ribInstSegSocial;
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
     * Set ribNivelTabularPagado value.
     *
     * @param ribNivelTabularPagado java.lang.String
     */
    public void setRibNivelTabularPagado(java.lang.String ribNivelTabularPagado) {
        this.ribNivelTabularPagado = ribNivelTabularPagado;
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
     * Set ribNombrePuesto value.
     *
     * @param ribNombrePuesto java.lang.String
     */
    public void setRibNombrePuesto(java.lang.String ribNombrePuesto) {
        this.ribNombrePuesto = ribNombrePuesto;
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
     * Set ribNumSegSocial value.
     *
     * @param ribNumSegSocial java.lang.String
     */
    public void setRibNumSegSocial(java.lang.String ribNumSegSocial) {
        this.ribNumSegSocial = ribNumSegSocial;
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
     * Set ribPaisNac value.
     *
     * @param ribPaisNac java.lang.Integer
     */
    public void setRibPaisNac(java.lang.Integer ribPaisNac) {
        this.ribPaisNac = ribPaisNac;
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
     * Set ribPrimerApellido value.
     *
     * @param ribPrimerApellido java.lang.String
     */
    public void setRibPrimerApellido(java.lang.String ribPrimerApellido) {
        this.ribPrimerApellido = ribPrimerApellido;
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
     * Set ribRamo value.
     *
     * @param ribRamo java.lang.Integer
     */
    public void setRibRamo(java.lang.Integer ribRamo) {
        this.ribRamo = ribRamo;
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
     * Set ribSegundoApellido value.
     *
     * @param ribSegundoApellido java.lang.String
     */
    public void setRibSegundoApellido(java.lang.String ribSegundoApellido) {
        this.ribSegundoApellido = ribSegundoApellido;
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
     * Set ribTipoContratacion value.
     *
     * @param ribTipoContratacion java.lang.Boolean
     */
    public void setRibTipoContratacion(java.lang.Boolean ribTipoContratacion) {
        this.ribTipoContratacion = ribTipoContratacion;
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
     * Set ribTipoPlaza value.
     *
     * @param ribTipoPlaza java.lang.Boolean
     */
    public void setRibTipoPlaza(java.lang.Boolean ribTipoPlaza) {
        this.ribTipoPlaza = ribTipoPlaza;
    }


    /**
     * Set identity value.
     *
     * @param idComposite Serializable
     */
    public void setIdentity(Serializable idComposite) {
        this.idComposite = (TdRuspInfoBasicaPK)idComposite;
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
