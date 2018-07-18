package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnNomina data.
 */
public class TnNominaDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer idNomina;
    @MaxLength(4)    
    private java.lang.String idEdoNom;
    @MaxLength(4)    
    private java.lang.String idGrupoPagoNom;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(120)    
    private java.lang.String usuario;
    @MaxLength(1200)    
    private java.lang.String descNomina;
    @MaxLength(12)    
    private java.lang.String idTipoNomina;
    @MaxLength(4)    
    private java.lang.String nomAplicarExentos;
    private byte[] nomArchAnexo20;
    private byte[] nomArchCanc;
    private byte[] nomArchCreacion;
    private byte[] nomArchTimbrado;
    @MaxLength(4)    
    private java.lang.String nomCerrada;
    private java.lang.Integer nomCicloFon;
    @MaxLength(4)    
    private java.lang.String nomCompletarPeriodo;
    private java.lang.Integer nomDiasPagar;
    private java.lang.Double nomFacRen1;
    private java.lang.Double nomFacRen2;
    private java.util.Date nomFecAnexo20;
    private java.util.Date nomFecApertura;
    private java.util.Date nomFecCancA20;
    private java.util.Date nomFecCancSat;
    private java.util.Date nomFecCancSireh;
    private java.util.Date nomFecCierre;
    private java.util.Date nomFecCreacion;
    private java.util.Date nomFecDeposito;
    private java.util.Date nomFecPago;
    private java.util.Date nomFecTimbrado;
    private java.util.Date nomFinPago;
    @MaxLength(80)    
    private java.lang.String nomFuenteDatos;
    private java.lang.Double nomGobFed1;
    private java.lang.Double nomGobFed2;
    private java.lang.Double nomGobFed3;
    private java.lang.Double nomGobFed4;
    @MaxLength(4)    
    private java.lang.String nomGratifAgui;
    private java.lang.Double nomImpSin1;
    private java.lang.Double nomImpSin2;
    private java.util.Date nomIniPago;
    @MaxLength(2000)    
    private java.lang.String nomLeyenda;
    @MaxLength(8)    
    private java.lang.String nomNumComplem;
    private java.lang.Integer nomQnaCaptura;
    @MaxLength(400)    
    private java.lang.String nomRefSat;
    @MaxLength(400)    
    private java.lang.String nomRefTimbrado;
    @MaxLength(80)    
    private java.lang.String nomReglaCalculo;
    @MaxLength(8)    
    private java.lang.String nomRemesa;
    @MaxLength(4)    
    private java.lang.String nomVigente;

    /**
     * Constructor for TnNominaDTO class.
     */
    public TnNominaDTO() { }    

                                                                                                                                                                                            
    /**
     * Constructor for TnNominaDTO class.
     *
     * @param idNomina java.lang.Integer
     * @param idEdoNom java.lang.String
     * @param idGrupoPagoNom java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param descNomina java.lang.String
     * @param idTipoNomina java.lang.String
     * @param nomAplicarExentos java.lang.String
     * @param nomArchAnexo20 byte[]
     * @param nomArchCanc byte[]
     * @param nomArchCreacion byte[]
     * @param nomArchTimbrado byte[]
     * @param nomCerrada java.lang.String
     * @param nomCicloFon java.lang.Integer
     * @param nomCompletarPeriodo java.lang.String
     * @param nomDiasPagar java.lang.Integer
     * @param nomFacRen1 java.lang.Double
     * @param nomFacRen2 java.lang.Double
     * @param nomFecAnexo20 java.util.Date
     * @param nomFecApertura java.util.Date
     * @param nomFecCancA20 java.util.Date
     * @param nomFecCancSat java.util.Date
     * @param nomFecCancSireh java.util.Date
     * @param nomFecCierre java.util.Date
     * @param nomFecCreacion java.util.Date
     * @param nomFecDeposito java.util.Date
     * @param nomFecPago java.util.Date
     * @param nomFecTimbrado java.util.Date
     * @param nomFinPago java.util.Date
     * @param nomFuenteDatos java.lang.String
     * @param nomGobFed1 java.lang.Double
     * @param nomGobFed2 java.lang.Double
     * @param nomGobFed3 java.lang.Double
     * @param nomGobFed4 java.lang.Double
     * @param nomGratifAgui java.lang.String
     * @param nomImpSin1 java.lang.Double
     * @param nomImpSin2 java.lang.Double
     * @param nomIniPago java.util.Date
     * @param nomLeyenda java.lang.String
     * @param nomNumComplem java.lang.String
     * @param nomQnaCaptura java.lang.Integer
     * @param nomRefSat java.lang.String
     * @param nomRefTimbrado java.lang.String
     * @param nomReglaCalculo java.lang.String
     * @param nomRemesa java.lang.String
     * @param nomVigente java.lang.String
     */
    public TnNominaDTO( java.lang.Integer idNomina, java.lang.String idEdoNom, java.lang.String idGrupoPagoNom, java.util.Date fecModifico, java.lang.String usuario, java.lang.String descNomina, java.lang.String idTipoNomina, java.lang.String nomAplicarExentos, byte[] nomArchAnexo20, byte[] nomArchCanc, byte[] nomArchCreacion, byte[] nomArchTimbrado, java.lang.String nomCerrada, java.lang.Integer nomCicloFon, java.lang.String nomCompletarPeriodo, java.lang.Integer nomDiasPagar, java.lang.Double nomFacRen1, java.lang.Double nomFacRen2, java.util.Date nomFecAnexo20, java.util.Date nomFecApertura, java.util.Date nomFecCancA20, java.util.Date nomFecCancSat, java.util.Date nomFecCancSireh, java.util.Date nomFecCierre, java.util.Date nomFecCreacion, java.util.Date nomFecDeposito, java.util.Date nomFecPago, java.util.Date nomFecTimbrado, java.util.Date nomFinPago, java.lang.String nomFuenteDatos, java.lang.Double nomGobFed1, java.lang.Double nomGobFed2, java.lang.Double nomGobFed3, java.lang.Double nomGobFed4, java.lang.String nomGratifAgui, java.lang.Double nomImpSin1, java.lang.Double nomImpSin2, java.util.Date nomIniPago, java.lang.String nomLeyenda, java.lang.String nomNumComplem, java.lang.Integer nomQnaCaptura, java.lang.String nomRefSat, java.lang.String nomRefTimbrado, java.lang.String nomReglaCalculo, java.lang.String nomRemesa, java.lang.String nomVigente){    
        this.idNomina = idNomina;
        this.idEdoNom = idEdoNom;
        this.idGrupoPagoNom = idGrupoPagoNom;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.descNomina = descNomina;
        this.idTipoNomina = idTipoNomina;
        this.nomAplicarExentos = nomAplicarExentos;
        this.nomArchAnexo20 = nomArchAnexo20;
        this.nomArchCanc = nomArchCanc;
        this.nomArchCreacion = nomArchCreacion;
        this.nomArchTimbrado = nomArchTimbrado;
        this.nomCerrada = nomCerrada;
        this.nomCicloFon = nomCicloFon;
        this.nomCompletarPeriodo = nomCompletarPeriodo;
        this.nomDiasPagar = nomDiasPagar;
        this.nomFacRen1 = nomFacRen1;
        this.nomFacRen2 = nomFacRen2;
        this.nomFecAnexo20 = nomFecAnexo20;
        this.nomFecApertura = nomFecApertura;
        this.nomFecCancA20 = nomFecCancA20;
        this.nomFecCancSat = nomFecCancSat;
        this.nomFecCancSireh = nomFecCancSireh;
        this.nomFecCierre = nomFecCierre;
        this.nomFecCreacion = nomFecCreacion;
        this.nomFecDeposito = nomFecDeposito;
        this.nomFecPago = nomFecPago;
        this.nomFecTimbrado = nomFecTimbrado;
        this.nomFinPago = nomFinPago;
        this.nomFuenteDatos = nomFuenteDatos;
        this.nomGobFed1 = nomGobFed1;
        this.nomGobFed2 = nomGobFed2;
        this.nomGobFed3 = nomGobFed3;
        this.nomGobFed4 = nomGobFed4;
        this.nomGratifAgui = nomGratifAgui;
        this.nomImpSin1 = nomImpSin1;
        this.nomImpSin2 = nomImpSin2;
        this.nomIniPago = nomIniPago;
        this.nomLeyenda = nomLeyenda;
        this.nomNumComplem = nomNumComplem;
        this.nomQnaCaptura = nomQnaCaptura;
        this.nomRefSat = nomRefSat;
        this.nomRefTimbrado = nomRefTimbrado;
        this.nomReglaCalculo = nomReglaCalculo;
        this.nomRemesa = nomRemesa;
        this.nomVigente = nomVigente;
    }    

    
    /**
     * Set idNomina value.
     *
     * @param idNomina java.lang.Integer
     */
    public void setIdNomina(java.lang.Integer idNomina){
        this.idNomina = idNomina;
    }
    
    /**
     * Get idNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getIdNomina() {
        return this.idNomina;    
    }
    
    /**
     * Set idEdoNom value.
     *
     * @param idEdoNom java.lang.String
     */
    public void setIdEdoNom(java.lang.String idEdoNom){
        this.idEdoNom = idEdoNom;
    }
    
    /**
     * Get idEdoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdEdoNom() {
        return this.idEdoNom;    
    }
    
    /**
     * Set idGrupoPagoNom value.
     *
     * @param idGrupoPagoNom java.lang.String
     */
    public void setIdGrupoPagoNom(java.lang.String idGrupoPagoNom){
        this.idGrupoPagoNom = idGrupoPagoNom;
    }
    
    /**
     * Get idGrupoPagoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupoPagoNom() {
        return this.idGrupoPagoNom;    
    }
    
    /**
     * Set fecModifico value.
     *
     * @param fecModifico java.util.Date
     */
    public void setFecModifico(java.util.Date fecModifico){
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
    public void setUsuario(java.lang.String usuario){
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
     * Set descNomina value.
     *
     * @param descNomina java.lang.String
     */
    public void setDescNomina(java.lang.String descNomina){
        this.descNomina = descNomina;
    }
    
    /**
     * Get descNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getDescNomina() {
        return this.descNomina;    
    }
    
    /**
     * Set idTipoNomina value.
     *
     * @param idTipoNomina java.lang.String
     */
    public void setIdTipoNomina(java.lang.String idTipoNomina){
        this.idTipoNomina = idTipoNomina;
    }
    
    /**
     * Get idTipoNomina value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdTipoNomina() {
        return this.idTipoNomina;    
    }
    
    /**
     * Set nomAplicarExentos value.
     *
     * @param nomAplicarExentos java.lang.String
     */
    public void setNomAplicarExentos(java.lang.String nomAplicarExentos){
        this.nomAplicarExentos = nomAplicarExentos;
    }
    
    /**
     * Get nomAplicarExentos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomAplicarExentos() {
        return this.nomAplicarExentos;    
    }
    
    /**
     * Set nomArchAnexo20 value.
     *
     * @param nomArchAnexo20 byte[]
     */
    public void setNomArchAnexo20(byte[] nomArchAnexo20){
        this.nomArchAnexo20 = nomArchAnexo20;
    }
    
    /**
     * Get nomArchAnexo20 value.
     *
     * @return byte[]
     */
    public byte[] getNomArchAnexo20() {
        return this.nomArchAnexo20;    
    }
    
    /**
     * Set nomArchCanc value.
     *
     * @param nomArchCanc byte[]
     */
    public void setNomArchCanc(byte[] nomArchCanc){
        this.nomArchCanc = nomArchCanc;
    }
    
    /**
     * Get nomArchCanc value.
     *
     * @return byte[]
     */
    public byte[] getNomArchCanc() {
        return this.nomArchCanc;    
    }
    
    /**
     * Set nomArchCreacion value.
     *
     * @param nomArchCreacion byte[]
     */
    public void setNomArchCreacion(byte[] nomArchCreacion){
        this.nomArchCreacion = nomArchCreacion;
    }
    
    /**
     * Get nomArchCreacion value.
     *
     * @return byte[]
     */
    public byte[] getNomArchCreacion() {
        return this.nomArchCreacion;    
    }
    
    /**
     * Set nomArchTimbrado value.
     *
     * @param nomArchTimbrado byte[]
     */
    public void setNomArchTimbrado(byte[] nomArchTimbrado){
        this.nomArchTimbrado = nomArchTimbrado;
    }
    
    /**
     * Get nomArchTimbrado value.
     *
     * @return byte[]
     */
    public byte[] getNomArchTimbrado() {
        return this.nomArchTimbrado;    
    }
    
    /**
     * Set nomCerrada value.
     *
     * @param nomCerrada java.lang.String
     */
    public void setNomCerrada(java.lang.String nomCerrada){
        this.nomCerrada = nomCerrada;
    }
    
    /**
     * Get nomCerrada value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomCerrada() {
        return this.nomCerrada;    
    }
    
    /**
     * Set nomCicloFon value.
     *
     * @param nomCicloFon java.lang.Integer
     */
    public void setNomCicloFon(java.lang.Integer nomCicloFon){
        this.nomCicloFon = nomCicloFon;
    }
    
    /**
     * Get nomCicloFon value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNomCicloFon() {
        return this.nomCicloFon;    
    }
    
    /**
     * Set nomCompletarPeriodo value.
     *
     * @param nomCompletarPeriodo java.lang.String
     */
    public void setNomCompletarPeriodo(java.lang.String nomCompletarPeriodo){
        this.nomCompletarPeriodo = nomCompletarPeriodo;
    }
    
    /**
     * Get nomCompletarPeriodo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomCompletarPeriodo() {
        return this.nomCompletarPeriodo;    
    }
    
    /**
     * Set nomDiasPagar value.
     *
     * @param nomDiasPagar java.lang.Integer
     */
    public void setNomDiasPagar(java.lang.Integer nomDiasPagar){
        this.nomDiasPagar = nomDiasPagar;
    }
    
    /**
     * Get nomDiasPagar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNomDiasPagar() {
        return this.nomDiasPagar;    
    }
    
    /**
     * Set nomFacRen1 value.
     *
     * @param nomFacRen1 java.lang.Double
     */
    public void setNomFacRen1(java.lang.Double nomFacRen1){
        this.nomFacRen1 = nomFacRen1;
    }
    
    /**
     * Get nomFacRen1 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomFacRen1() {
        return this.nomFacRen1;    
    }
    
    /**
     * Set nomFacRen2 value.
     *
     * @param nomFacRen2 java.lang.Double
     */
    public void setNomFacRen2(java.lang.Double nomFacRen2){
        this.nomFacRen2 = nomFacRen2;
    }
    
    /**
     * Get nomFacRen2 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomFacRen2() {
        return this.nomFacRen2;    
    }
    
    /**
     * Set nomFecAnexo20 value.
     *
     * @param nomFecAnexo20 java.util.Date
     */
    public void setNomFecAnexo20(java.util.Date nomFecAnexo20){
        this.nomFecAnexo20 = nomFecAnexo20;
    }
    
    /**
     * Get nomFecAnexo20 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecAnexo20() {
        return this.nomFecAnexo20;    
    }
    
    /**
     * Set nomFecApertura value.
     *
     * @param nomFecApertura java.util.Date
     */
    public void setNomFecApertura(java.util.Date nomFecApertura){
        this.nomFecApertura = nomFecApertura;
    }
    
    /**
     * Get nomFecApertura value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecApertura() {
        return this.nomFecApertura;    
    }
    
    /**
     * Set nomFecCancA20 value.
     *
     * @param nomFecCancA20 java.util.Date
     */
    public void setNomFecCancA20(java.util.Date nomFecCancA20){
        this.nomFecCancA20 = nomFecCancA20;
    }
    
    /**
     * Get nomFecCancA20 value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecCancA20() {
        return this.nomFecCancA20;    
    }
    
    /**
     * Set nomFecCancSat value.
     *
     * @param nomFecCancSat java.util.Date
     */
    public void setNomFecCancSat(java.util.Date nomFecCancSat){
        this.nomFecCancSat = nomFecCancSat;
    }
    
    /**
     * Get nomFecCancSat value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecCancSat() {
        return this.nomFecCancSat;    
    }
    
    /**
     * Set nomFecCancSireh value.
     *
     * @param nomFecCancSireh java.util.Date
     */
    public void setNomFecCancSireh(java.util.Date nomFecCancSireh){
        this.nomFecCancSireh = nomFecCancSireh;
    }
    
    /**
     * Get nomFecCancSireh value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecCancSireh() {
        return this.nomFecCancSireh;    
    }
    
    /**
     * Set nomFecCierre value.
     *
     * @param nomFecCierre java.util.Date
     */
    public void setNomFecCierre(java.util.Date nomFecCierre){
        this.nomFecCierre = nomFecCierre;
    }
    
    /**
     * Get nomFecCierre value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecCierre() {
        return this.nomFecCierre;    
    }
    
    /**
     * Set nomFecCreacion value.
     *
     * @param nomFecCreacion java.util.Date
     */
    public void setNomFecCreacion(java.util.Date nomFecCreacion){
        this.nomFecCreacion = nomFecCreacion;
    }
    
    /**
     * Get nomFecCreacion value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecCreacion() {
        return this.nomFecCreacion;    
    }
    
    /**
     * Set nomFecDeposito value.
     *
     * @param nomFecDeposito java.util.Date
     */
    public void setNomFecDeposito(java.util.Date nomFecDeposito){
        this.nomFecDeposito = nomFecDeposito;
    }
    
    /**
     * Get nomFecDeposito value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecDeposito() {
        return this.nomFecDeposito;    
    }
    
    /**
     * Set nomFecPago value.
     *
     * @param nomFecPago java.util.Date
     */
    public void setNomFecPago(java.util.Date nomFecPago){
        this.nomFecPago = nomFecPago;
    }
    
    /**
     * Get nomFecPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecPago() {
        return this.nomFecPago;    
    }
    
    /**
     * Set nomFecTimbrado value.
     *
     * @param nomFecTimbrado java.util.Date
     */
    public void setNomFecTimbrado(java.util.Date nomFecTimbrado){
        this.nomFecTimbrado = nomFecTimbrado;
    }
    
    /**
     * Get nomFecTimbrado value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFecTimbrado() {
        return this.nomFecTimbrado;    
    }
    
    /**
     * Set nomFinPago value.
     *
     * @param nomFinPago java.util.Date
     */
    public void setNomFinPago(java.util.Date nomFinPago){
        this.nomFinPago = nomFinPago;
    }
    
    /**
     * Get nomFinPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomFinPago() {
        return this.nomFinPago;    
    }
    
    /**
     * Set nomFuenteDatos value.
     *
     * @param nomFuenteDatos java.lang.String
     */
    public void setNomFuenteDatos(java.lang.String nomFuenteDatos){
        this.nomFuenteDatos = nomFuenteDatos;
    }
    
    /**
     * Get nomFuenteDatos value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomFuenteDatos() {
        return this.nomFuenteDatos;    
    }
    
    /**
     * Set nomGobFed1 value.
     *
     * @param nomGobFed1 java.lang.Double
     */
    public void setNomGobFed1(java.lang.Double nomGobFed1){
        this.nomGobFed1 = nomGobFed1;
    }
    
    /**
     * Get nomGobFed1 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomGobFed1() {
        return this.nomGobFed1;    
    }
    
    /**
     * Set nomGobFed2 value.
     *
     * @param nomGobFed2 java.lang.Double
     */
    public void setNomGobFed2(java.lang.Double nomGobFed2){
        this.nomGobFed2 = nomGobFed2;
    }
    
    /**
     * Get nomGobFed2 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomGobFed2() {
        return this.nomGobFed2;    
    }
    
    /**
     * Set nomGobFed3 value.
     *
     * @param nomGobFed3 java.lang.Double
     */
    public void setNomGobFed3(java.lang.Double nomGobFed3){
        this.nomGobFed3 = nomGobFed3;
    }
    
    /**
     * Get nomGobFed3 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomGobFed3() {
        return this.nomGobFed3;    
    }
    
    /**
     * Set nomGobFed4 value.
     *
     * @param nomGobFed4 java.lang.Double
     */
    public void setNomGobFed4(java.lang.Double nomGobFed4){
        this.nomGobFed4 = nomGobFed4;
    }
    
    /**
     * Get nomGobFed4 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomGobFed4() {
        return this.nomGobFed4;    
    }
    
    /**
     * Set nomGratifAgui value.
     *
     * @param nomGratifAgui java.lang.String
     */
    public void setNomGratifAgui(java.lang.String nomGratifAgui){
        this.nomGratifAgui = nomGratifAgui;
    }
    
    /**
     * Get nomGratifAgui value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomGratifAgui() {
        return this.nomGratifAgui;    
    }
    
    /**
     * Set nomImpSin1 value.
     *
     * @param nomImpSin1 java.lang.Double
     */
    public void setNomImpSin1(java.lang.Double nomImpSin1){
        this.nomImpSin1 = nomImpSin1;
    }
    
    /**
     * Get nomImpSin1 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomImpSin1() {
        return this.nomImpSin1;    
    }
    
    /**
     * Set nomImpSin2 value.
     *
     * @param nomImpSin2 java.lang.Double
     */
    public void setNomImpSin2(java.lang.Double nomImpSin2){
        this.nomImpSin2 = nomImpSin2;
    }
    
    /**
     * Get nomImpSin2 value.
     *
     * @return java.lang.Double
     */
    public java.lang.Double getNomImpSin2() {
        return this.nomImpSin2;    
    }
    
    /**
     * Set nomIniPago value.
     *
     * @param nomIniPago java.util.Date
     */
    public void setNomIniPago(java.util.Date nomIniPago){
        this.nomIniPago = nomIniPago;
    }
    
    /**
     * Get nomIniPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getNomIniPago() {
        return this.nomIniPago;    
    }
    
    /**
     * Set nomLeyenda value.
     *
     * @param nomLeyenda java.lang.String
     */
    public void setNomLeyenda(java.lang.String nomLeyenda){
        this.nomLeyenda = nomLeyenda;
    }
    
    /**
     * Get nomLeyenda value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomLeyenda() {
        return this.nomLeyenda;    
    }
    
    /**
     * Set nomNumComplem value.
     *
     * @param nomNumComplem java.lang.String
     */
    public void setNomNumComplem(java.lang.String nomNumComplem){
        this.nomNumComplem = nomNumComplem;
    }
    
    /**
     * Get nomNumComplem value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomNumComplem() {
        return this.nomNumComplem;    
    }
    
    /**
     * Set nomQnaCaptura value.
     *
     * @param nomQnaCaptura java.lang.Integer
     */
    public void setNomQnaCaptura(java.lang.Integer nomQnaCaptura){
        this.nomQnaCaptura = nomQnaCaptura;
    }
    
    /**
     * Get nomQnaCaptura value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getNomQnaCaptura() {
        return this.nomQnaCaptura;    
    }
    
    /**
     * Set nomRefSat value.
     *
     * @param nomRefSat java.lang.String
     */
    public void setNomRefSat(java.lang.String nomRefSat){
        this.nomRefSat = nomRefSat;
    }
    
    /**
     * Get nomRefSat value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomRefSat() {
        return this.nomRefSat;    
    }
    
    /**
     * Set nomRefTimbrado value.
     *
     * @param nomRefTimbrado java.lang.String
     */
    public void setNomRefTimbrado(java.lang.String nomRefTimbrado){
        this.nomRefTimbrado = nomRefTimbrado;
    }
    
    /**
     * Get nomRefTimbrado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomRefTimbrado() {
        return this.nomRefTimbrado;    
    }
    
    /**
     * Set nomReglaCalculo value.
     *
     * @param nomReglaCalculo java.lang.String
     */
    public void setNomReglaCalculo(java.lang.String nomReglaCalculo){
        this.nomReglaCalculo = nomReglaCalculo;
    }
    
    /**
     * Get nomReglaCalculo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomReglaCalculo() {
        return this.nomReglaCalculo;    
    }
    
    /**
     * Set nomRemesa value.
     *
     * @param nomRemesa java.lang.String
     */
    public void setNomRemesa(java.lang.String nomRemesa){
        this.nomRemesa = nomRemesa;
    }
    
    /**
     * Get nomRemesa value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomRemesa() {
        return this.nomRemesa;    
    }
    
    /**
     * Set nomVigente value.
     *
     * @param nomVigente java.lang.String
     */
    public void setNomVigente(java.lang.String nomVigente){
        this.nomVigente = nomVigente;
    }
    
    /**
     * Get nomVigente value.
     *
     * @return java.lang.String
     */
    public java.lang.String getNomVigente() {
        return this.nomVigente;    
    }


}