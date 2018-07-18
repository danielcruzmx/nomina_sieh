package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.sql.Clob;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnComprobanteDig data.
 */
public class TnComprobanteDigDTO  implements java.io.Serializable, Model {    

    private java.lang.Integer cnDifFolio;
    private java.lang.Long cnFolio;
    private java.lang.Integer cnPaquete;
    @MaxLength(1)    
    private java.lang.String cnRefTimbrado;
    @MaxLength(1)    
    private java.lang.String cnSituacion;
    @NotNull
    private java.util.Date fecModifico;
    @NotBlank(errorCode="not.null")
    @NotNull
    @MaxLength(30)    
    private java.lang.String usuario;
    private byte[] cnArchAnexo20;
    private byte[] cnArchACancelar;
    private byte[] cnArchCreacion;
    private byte[] cnArchTimbrado;
    @MaxLength(3000)    
    private java.lang.String cnCadenaOriginal;
    @MaxLength(500)    
    private java.lang.String cnCadenaSello;
    private java.lang.Integer cnConsecNomina;
    private java.lang.Integer cnEjercicio;
    private java.util.Date cnFechaGenerado;
    private java.util.Date cnFecCanc;
    private java.util.Date cnFecEnvio;
    private java.util.Date cnFecEnvCanc;
    private java.util.Date cnFecFirmaRec;
    private java.util.Date cnFecRespuesta;
    @MaxLength(50)    
    private java.lang.String cnFolioFiscal;
    @MaxLength(35)    
    private java.lang.String cnFolioRecibo;
    @MaxLength(36)    
    private java.lang.String cnIdPaqueteSat;
    @MaxLength(500)    
    private java.lang.String cnIncidencia;
    private java.lang.Integer cnPaqueteRv;
    @MaxLength(13)    
    private java.lang.String cnRfc;
    @MaxLength(500)    
    private java.lang.String cnUriblobCanc;
    @MaxLength(500)    
    private java.lang.String cnUriblobTimb;
    private java.sql.Clob cnXmlCancelado;
    private java.sql.Clob cnXmlGenerado;
    private java.sql.Clob cnXmlTimbrado;
    private java.lang.Integer cnEnviadoInst;
    private java.lang.Integer cnEnviadoPers;

    /**
     * Constructor for TnComprobanteDigDTO class.
     */
    public TnComprobanteDigDTO() { }    

                                                                                                                                            
    /**
     * Constructor for TnComprobanteDigDTO class.
     *
     * @param cnDifFolio java.lang.Integer
     * @param cnFolio java.lang.Long
     * @param cnPaquete java.lang.Integer
     * @param cnRefTimbrado java.lang.String
     * @param cnSituacion java.lang.String
     * @param fecModifico java.util.Date
     * @param usuario java.lang.String
     * @param cnArchAnexo20 byte[]
     * @param cnArchACancelar byte[]
     * @param cnArchCreacion byte[]
     * @param cnArchTimbrado byte[]
     * @param cnCadenaOriginal java.lang.String
     * @param cnCadenaSello java.lang.String
     * @param cnConsecNomina java.lang.Integer
     * @param cnEjercicio java.lang.Integer
     * @param cnEnviadoInst java.lang.Boolean
     * @param cnEnviadoPers java.lang.Boolean
     * @param cnFechaGenerado java.util.Date
     * @param cnFecCanc java.util.Date
     * @param cnFecEnvio java.util.Date
     * @param cnFecEnvCanc java.util.Date
     * @param cnFecFirmaRec java.util.Date
     * @param cnFecRespuesta java.util.Date
     * @param cnFolioFiscal java.lang.String
     * @param cnFolioRecibo java.lang.String
     * @param cnIdPaqueteSat java.lang.String
     * @param cnIncidencia java.lang.String
     * @param cnPaqueteRv java.lang.Integer
     * @param cnRfc java.lang.String
     * @param cnUriblobCanc java.lang.String
     * @param cnUriblobTimb java.lang.String
     * @param cnXmlCancelado java.lang.String
     * @param cnXmlGenerado java.lang.String
     * @param cnXmlTimbrado java.lang.String
     */
    public TnComprobanteDigDTO( java.lang.Integer cnDifFolio, java.lang.Long cnFolio, java.lang.Integer cnPaquete, java.lang.String cnRefTimbrado, java.lang.String cnSituacion, java.util.Date fecModifico, java.lang.String usuario, byte[] cnArchAnexo20, byte[] cnArchACancelar, byte[] cnArchCreacion, byte[] cnArchTimbrado, java.lang.String cnCadenaOriginal, java.lang.String cnCadenaSello, java.lang.Integer cnConsecNomina, java.lang.Integer cnEjercicio, java.lang.Integer cnEnviadoInst, java.lang.Integer cnEnviadoPers, java.util.Date cnFechaGenerado, java.util.Date cnFecCanc, java.util.Date cnFecEnvio, java.util.Date cnFecEnvCanc, java.util.Date cnFecFirmaRec, java.util.Date cnFecRespuesta, java.lang.String cnFolioFiscal, java.lang.String cnFolioRecibo, java.lang.String cnIdPaqueteSat, java.lang.String cnIncidencia, java.lang.Integer cnPaqueteRv, java.lang.String cnRfc, java.lang.String cnUriblobCanc, java.lang.String cnUriblobTimb, java.sql.Clob cnXmlCancelado, java.sql.Clob cnXmlGenerado, java.sql.Clob cnXmlTimbrado){    
        this.cnDifFolio = cnDifFolio;
        this.cnFolio = cnFolio;
        this.cnPaquete = cnPaquete;
        this.cnRefTimbrado = cnRefTimbrado;
        this.cnSituacion = cnSituacion;
        this.fecModifico = fecModifico;
        this.usuario = usuario;
        this.cnArchAnexo20 = cnArchAnexo20;
        this.cnArchACancelar = cnArchACancelar;
        this.cnArchCreacion = cnArchCreacion;
        this.cnArchTimbrado = cnArchTimbrado;
        this.cnCadenaOriginal = cnCadenaOriginal;
        this.cnCadenaSello = cnCadenaSello;
        this.cnConsecNomina = cnConsecNomina;
        this.cnEjercicio = cnEjercicio;
        this.cnEnviadoInst = cnEnviadoInst;
        this.cnEnviadoPers = cnEnviadoPers;
        this.cnFechaGenerado = cnFechaGenerado;
        this.cnFecCanc = cnFecCanc;
        this.cnFecEnvio = cnFecEnvio;
        this.cnFecEnvCanc = cnFecEnvCanc;
        this.cnFecFirmaRec = cnFecFirmaRec;
        this.cnFecRespuesta = cnFecRespuesta;
        this.cnFolioFiscal = cnFolioFiscal;
        this.cnFolioRecibo = cnFolioRecibo;
        this.cnIdPaqueteSat = cnIdPaqueteSat;
        this.cnIncidencia = cnIncidencia;
        this.cnPaqueteRv = cnPaqueteRv;
        this.cnRfc = cnRfc;
        this.cnUriblobCanc = cnUriblobCanc;
        this.cnUriblobTimb = cnUriblobTimb;
        this.cnXmlCancelado = cnXmlCancelado;
        this.cnXmlGenerado = cnXmlGenerado;
        this.cnXmlTimbrado = cnXmlTimbrado;
    }    

    
    /**
     * Set cnDifFolio value.
     *
     * @param cnDifFolio java.lang.Integer
     */
    public void setCnDifFolio(java.lang.Integer cnDifFolio){
        this.cnDifFolio = cnDifFolio;
    }
    
    /**
     * Get cnDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnDifFolio() {
        return this.cnDifFolio;    
    }
    
    /**
     * Set cnFolio value.
     *
     * @param cnFolio java.lang.Long
     */
    public void setCnFolio(java.lang.Long cnFolio){
        this.cnFolio = cnFolio;
    }
    
    /**
     * Get cnFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getCnFolio() {
        return this.cnFolio;    
    }
    
    /**
     * Set cnPaquete value.
     *
     * @param cnPaquete java.lang.Integer
     */
    public void setCnPaquete(java.lang.Integer cnPaquete){
        this.cnPaquete = cnPaquete;
    }
    
    /**
     * Get cnPaquete value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnPaquete() {
        return this.cnPaquete;    
    }
    
    /**
     * Set cnRefTimbrado value.
     *
     * @param cnRefTimbrado java.lang.String
     */
    public void setCnRefTimbrado(java.lang.String cnRefTimbrado){
        this.cnRefTimbrado = cnRefTimbrado;
    }
    
    /**
     * Get cnRefTimbrado value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnRefTimbrado() {
        return this.cnRefTimbrado;    
    }
    
    /**
     * Set cnSituacion value.
     *
     * @param cnSituacion java.lang.String
     */
    public void setCnSituacion(java.lang.String cnSituacion){
        this.cnSituacion = cnSituacion;
    }
    
    /**
     * Get cnSituacion value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnSituacion() {
        return this.cnSituacion;    
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
     * Set cnArchAnexo20 value.
     *
     * @param cnArchAnexo20 byte[]
     */
    public void setCnArchAnexo20(byte[] cnArchAnexo20){
        this.cnArchAnexo20 = cnArchAnexo20;
    }
    
    /**
     * Get cnArchAnexo20 value.
     *
     * @return byte[]
     */
    public byte[] getCnArchAnexo20() {
        return this.cnArchAnexo20;    
    }
    
    /**
     * Set cnArchACancelar value.
     *
     * @param cnArchACancelar byte[]
     */
    public void setCnArchACancelar(byte[] cnArchACancelar){
        this.cnArchACancelar = cnArchACancelar;
    }
    
    /**
     * Get cnArchACancelar value.
     *
     * @return byte[]
     */
    public byte[] getCnArchACancelar() {
        return this.cnArchACancelar;    
    }
    
    /**
     * Set cnArchCreacion value.
     *
     * @param cnArchCreacion byte[]
     */
    public void setCnArchCreacion(byte[] cnArchCreacion){
        this.cnArchCreacion = cnArchCreacion;
    }
    
    /**
     * Get cnArchCreacion value.
     *
     * @return byte[]
     */
    public byte[] getCnArchCreacion() {
        return this.cnArchCreacion;    
    }
    
    /**
     * Set cnArchTimbrado value.
     *
     * @param cnArchTimbrado byte[]
     */
    public void setCnArchTimbrado(byte[] cnArchTimbrado){
        this.cnArchTimbrado = cnArchTimbrado;
    }
    
    /**
     * Get cnArchTimbrado value.
     *
     * @return byte[]
     */
    public byte[] getCnArchTimbrado() {
        return this.cnArchTimbrado;    
    }
    
    /**
     * Set cnCadenaOriginal value.
     *
     * @param cnCadenaOriginal java.lang.String
     */
    public void setCnCadenaOriginal(java.lang.String cnCadenaOriginal){
        this.cnCadenaOriginal = cnCadenaOriginal;
    }
    
    /**
     * Get cnCadenaOriginal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnCadenaOriginal() {
        return this.cnCadenaOriginal;    
    }
    
    /**
     * Set cnCadenaSello value.
     *
     * @param cnCadenaSello java.lang.String
     */
    public void setCnCadenaSello(java.lang.String cnCadenaSello){
        this.cnCadenaSello = cnCadenaSello;
    }
    
    /**
     * Get cnCadenaSello value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnCadenaSello() {
        return this.cnCadenaSello;    
    }
    
    /**
     * Set cnConsecNomina value.
     *
     * @param cnConsecNomina java.lang.Integer
     */
    public void setCnConsecNomina(java.lang.Integer cnConsecNomina){
        this.cnConsecNomina = cnConsecNomina;
    }
    
    /**
     * Get cnConsecNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnConsecNomina() {
        return this.cnConsecNomina;    
    }
    
    /**
     * Set cnEjercicio value.
     *
     * @param cnEjercicio java.lang.Integer
     */
    public void setCnEjercicio(java.lang.Integer cnEjercicio){
        this.cnEjercicio = cnEjercicio;
    }
    
    /**
     * Get cnEjercicio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnEjercicio() {
        return this.cnEjercicio;    
    }
    
   
    /**
     * Set cnFechaGenerado value.
     *
     * @param cnFechaGenerado java.util.Date
     */
    public void setCnFechaGenerado(java.util.Date cnFechaGenerado){
        this.cnFechaGenerado = cnFechaGenerado;
    }
    
    /**
     * Get cnFechaGenerado value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFechaGenerado() {
        return this.cnFechaGenerado;    
    }
    
    /**
     * Set cnFecCanc value.
     *
     * @param cnFecCanc java.util.Date
     */
    public void setCnFecCanc(java.util.Date cnFecCanc){
        this.cnFecCanc = cnFecCanc;
    }
    
    /**
     * Get cnFecCanc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFecCanc() {
        return this.cnFecCanc;    
    }
    
    /**
     * Set cnFecEnvio value.
     *
     * @param cnFecEnvio java.util.Date
     */
    public void setCnFecEnvio(java.util.Date cnFecEnvio){
        this.cnFecEnvio = cnFecEnvio;
    }
    
    /**
     * Get cnFecEnvio value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFecEnvio() {
        return this.cnFecEnvio;    
    }
    
    /**
     * Set cnFecEnvCanc value.
     *
     * @param cnFecEnvCanc java.util.Date
     */
    public void setCnFecEnvCanc(java.util.Date cnFecEnvCanc){
        this.cnFecEnvCanc = cnFecEnvCanc;
    }
    
    /**
     * Get cnFecEnvCanc value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFecEnvCanc() {
        return this.cnFecEnvCanc;    
    }
    
    /**
     * Set cnFecFirmaRec value.
     *
     * @param cnFecFirmaRec java.util.Date
     */
    public void setCnFecFirmaRec(java.util.Date cnFecFirmaRec){
        this.cnFecFirmaRec = cnFecFirmaRec;
    }
    
    /**
     * Get cnFecFirmaRec value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFecFirmaRec() {
        return this.cnFecFirmaRec;    
    }
    
    /**
     * Set cnFecRespuesta value.
     *
     * @param cnFecRespuesta java.util.Date
     */
    public void setCnFecRespuesta(java.util.Date cnFecRespuesta){
        this.cnFecRespuesta = cnFecRespuesta;
    }
    
    /**
     * Get cnFecRespuesta value.
     *
     * @return java.util.Date
     */
    public java.util.Date getCnFecRespuesta() {
        return this.cnFecRespuesta;    
    }
    
    /**
     * Set cnFolioFiscal value.
     *
     * @param cnFolioFiscal java.lang.String
     */
    public void setCnFolioFiscal(java.lang.String cnFolioFiscal){
        this.cnFolioFiscal = cnFolioFiscal;
    }
    
    /**
     * Get cnFolioFiscal value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnFolioFiscal() {
        return this.cnFolioFiscal;    
    }
    
    /**
     * Set cnFolioRecibo value.
     *
     * @param cnFolioRecibo java.lang.String
     */
    public void setCnFolioRecibo(java.lang.String cnFolioRecibo){
        this.cnFolioRecibo = cnFolioRecibo;
    }
    
    /**
     * Get cnFolioRecibo value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnFolioRecibo() {
        return this.cnFolioRecibo;    
    }
    
    /**
     * Set cnIdPaqueteSat value.
     *
     * @param cnIdPaqueteSat java.lang.String
     */
    public void setCnIdPaqueteSat(java.lang.String cnIdPaqueteSat){
        this.cnIdPaqueteSat = cnIdPaqueteSat;
    }
    
    /**
     * Get cnIdPaqueteSat value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnIdPaqueteSat() {
        return this.cnIdPaqueteSat;    
    }
    
    /**
     * Set cnIncidencia value.
     *
     * @param cnIncidencia java.lang.String
     */
    public void setCnIncidencia(java.lang.String cnIncidencia){
        this.cnIncidencia = cnIncidencia;
    }
    
    /**
     * Get cnIncidencia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnIncidencia() {
        return this.cnIncidencia;    
    }
    
    /**
     * Set cnPaqueteRv value.
     *
     * @param cnPaqueteRv java.lang.Integer
     */
    public void setCnPaqueteRv(java.lang.Integer cnPaqueteRv){
        this.cnPaqueteRv = cnPaqueteRv;
    }
    
    /**
     * Get cnPaqueteRv value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getCnPaqueteRv() {
        return this.cnPaqueteRv;    
    }
    
    /**
     * Set cnRfc value.
     *
     * @param cnRfc java.lang.String
     */
    public void setCnRfc(java.lang.String cnRfc){
        this.cnRfc = cnRfc;
    }
    
    /**
     * Get cnRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnRfc() {
        return this.cnRfc;    
    }
    
    /**
     * Set cnUriblobCanc value.
     *
     * @param cnUriblobCanc java.lang.String
     */
    public void setCnUriblobCanc(java.lang.String cnUriblobCanc){
        this.cnUriblobCanc = cnUriblobCanc;
    }
    
    /**
     * Get cnUriblobCanc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnUriblobCanc() {
        return this.cnUriblobCanc;    
    }
    
    /**
     * Set cnUriblobTimb value.
     *
     * @param cnUriblobTimb java.lang.String
     */
    public void setCnUriblobTimb(java.lang.String cnUriblobTimb){
        this.cnUriblobTimb = cnUriblobTimb;
    }
    
    /**
     * Get cnUriblobTimb value.
     *
     * @return java.lang.String
     */
    public java.lang.String getCnUriblobTimb() {
        return this.cnUriblobTimb;    
    }


    public void setCnXmlCancelado(Clob cnXmlCancelado) {
        this.cnXmlCancelado = cnXmlCancelado;
    }

    public Clob getCnXmlCancelado() {
        return cnXmlCancelado;
    }

    public void setCnXmlGenerado(Clob cnXmlGenerado) {
        this.cnXmlGenerado = cnXmlGenerado;
    }

    public Clob getCnXmlGenerado() {
        return cnXmlGenerado;
    }

    public void setCnXmlTimbrado(Clob cnXmlTimbrado) {
        this.cnXmlTimbrado = cnXmlTimbrado;
    }

    public Clob getCnXmlTimbrado() {
        return cnXmlTimbrado;
    }

    public void setCnEnviadoInst(Integer cnEnviadoInst) {
        this.cnEnviadoInst = cnEnviadoInst;
    }

    public Integer getCnEnviadoInst() {
        return cnEnviadoInst;
    }

    public void setCnEnviadoPers(Integer cnEnviadoPers) {
        this.cnEnviadoPers = cnEnviadoPers;
    }

    public Integer getCnEnviadoPers() {
        return cnEnviadoPers;
    }
}
