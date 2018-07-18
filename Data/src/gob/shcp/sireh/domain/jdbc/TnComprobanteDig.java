package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;
import gob.shcp.fsn.data.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Domain object for persistent TnComprobanteDig data.
 */
public class TnComprobanteDig implements Domain, Serializable {
    private TnComprobanteDigPK idComposite;
    private java.lang.String cnRefTimbrado;
    private java.lang.String cnSituacion;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private byte[] cnArchAnexo20;
    private byte[] cnArchACancelar;
    private byte[] cnArchCreacion;
    private byte[] cnArchTimbrado;
    private java.lang.String cnCadenaOriginal;
    private java.lang.String cnCadenaSello;
    private java.lang.Integer cnConsecNomina;
    private java.lang.Integer cnEjercicio;
    private java.util.Date cnFechaGenerado;
    private java.util.Date cnFecCanc;
    private java.util.Date cnFecEnvio;
    private java.util.Date cnFecEnvCanc;
    private java.util.Date cnFecFirmaRec;
    private java.util.Date cnFecRespuesta;
    private java.lang.String cnFolioFiscal;
    private java.lang.String cnFolioRecibo;
    private java.lang.String cnIdPaqueteSat;
    private java.lang.String cnIncidencia;
    private java.lang.Integer cnPaqueteRv;
    private java.lang.String cnRfc;
    private java.lang.String cnUriblobCanc;
    private java.lang.String cnUriblobTimb;
    private java.sql.Clob cnXmlCancelado;
    private java.sql.Clob cnXmlGenerado;
    private java.sql.Clob cnXmlTimbrado;
    private java.lang.Integer cnEnviadoInst;
    private java.lang.Integer cnEnviadoPers;

    /**
     * Constructor for TnComprobanteDig class.
     */
        public TnComprobanteDig() { }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        /**
         * Constructor for TnComprobanteDig class.
         *
         * @param cnDifFolio java.lang.Integer
         * @param cnFolio java.lang.Long
         * @param cnPaquete java.lang.Integer
         * @param cnRefTimbrado java.lang.String
         * @param cnSituacion java.lang.String
         * @param fecModifico java.util.Date
         * @param usuario java.lang.String
         * @param cnArchAnexo20 java.sql.Blob
         * @param cnArchACancelar java.sql.Blob
         * @param cnArchCreacion java.sql.Blob
         * @param cnArchTimbrado java.sql.Blob
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
         * @param cnXmlCancelado java.sql.Clob
         * @param cnXmlGenerado java.sql.Clob
         * @param cnXmlTimbrado java.sql.Clob
         */
        public TnComprobanteDig( TnComprobanteDigPK idComposite, java.lang.String cnRefTimbrado, java.lang.String cnSituacion, java.util.Date fecModifico, java.lang.String usuario, byte[] cnArchAnexo20, byte[] cnArchACancelar, byte[] cnArchCreacion, byte[] cnArchTimbrado, java.lang.String cnCadenaOriginal, java.lang.String cnCadenaSello, java.lang.Integer cnConsecNomina, java.lang.Integer cnEjercicio, java.lang.Integer cnEnviadoInst, java.lang.Integer cnEnviadoPers, java.util.Date cnFechaGenerado, java.util.Date cnFecCanc, java.util.Date cnFecEnvio, java.util.Date cnFecEnvCanc, java.util.Date cnFecFirmaRec, java.util.Date cnFecRespuesta, java.lang.String cnFolioFiscal, java.lang.String cnFolioRecibo, java.lang.String cnIdPaqueteSat, java.lang.String cnIncidencia, java.lang.Integer cnPaqueteRv, java.lang.String cnRfc, java.lang.String cnUriblobCanc, java.lang.String cnUriblobTimb, java.sql.Clob cnXmlCancelado, java.sql.Clob cnXmlGenerado, java.sql.Clob cnXmlTimbrado) {
            this.idComposite = idComposite;
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
         * Get cnDifFolio value.
         *
         * @return java.lang.Integer
         */
        public java.lang.Integer getCnDifFolio() {
                if(idComposite == null) {
                return null;
            }
            return this.idComposite.getCnDifFolio();
            }

        /**
         * Get cnFolio value.
         *
         * @return java.lang.Long
         */
        public java.lang.Long getCnFolio() {
                if(idComposite == null) {
                return null;
            }
            return this.idComposite.getCnFolio();
            }

        /**
         * Get cnPaquete value.
         *
         * @return java.lang.Integer
         */
        public java.lang.Integer getCnPaquete() {
                if(idComposite == null) {
                return null;
            }
            return this.idComposite.getCnPaquete();
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
         * Get cnSituacion value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnSituacion() {
                return this.cnSituacion;
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
         * Get cnCadenaOriginal value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnCadenaOriginal() {
                return this.cnCadenaOriginal;
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
         * Get cnConsecNomina value.
         *
         * @return java.lang.Integer
         */
        public java.lang.Integer getCnConsecNomina() {
                return this.cnConsecNomina;
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
         * Get cnFechaGenerado value.
         *
         * @return java.util.Date
         */
        public java.util.Date getCnFechaGenerado() {
                return this.cnFechaGenerado;
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
         * Get cnFecEnvio value.
         *
         * @return java.util.Date
         */
        public java.util.Date getCnFecEnvio() {
                return this.cnFecEnvio;
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
         * Get cnFecFirmaRec value.
         *
         * @return java.util.Date
         */
        public java.util.Date getCnFecFirmaRec() {
                return this.cnFecFirmaRec;
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
         * Get cnFolioFiscal value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnFolioFiscal() {
                return this.cnFolioFiscal;
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
         * Get cnIdPaqueteSat value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnIdPaqueteSat() {
                return this.cnIdPaqueteSat;
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
         * Get cnPaqueteRv value.
         *
         * @return java.lang.Integer
         */
        public java.lang.Integer getCnPaqueteRv() {
                return this.cnPaqueteRv;
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
         * Get cnUriblobCanc value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnUriblobCanc() {
                return this.cnUriblobCanc;
            }

        /**
         * Get cnUriblobTimb value.
         *
         * @return java.lang.String
         */
        public java.lang.String getCnUriblobTimb() {
                return this.cnUriblobTimb;
            }

        /**
         * Get cnXmlCancelado value.
         *
         * @return java.sql.Clob
         */
        public java.sql.Clob getCnXmlCancelado() {
                return this.cnXmlCancelado;
            }

        /**
         * Get cnXmlGenerado value.
         *
         * @return java.sql.Clob
         */
        public java.sql.Clob getCnXmlGenerado() {
                return this.cnXmlGenerado;
            }

        /**
         * Get cnXmlTimbrado value.
         *
         * @return java.sql.Clob
         */
        public java.sql.Clob getCnXmlTimbrado() {
                return this.cnXmlTimbrado;
            }

        
        /**
         * Set cnDifFolio value.
         *
         * @param cnDifFolio java.lang.Integer
         */
        public void setCnDifFolio(java.lang.Integer cnDifFolio) {
                if(idComposite == null) {
                idComposite = new TnComprobanteDigPK();
            }
            this.idComposite.setCnDifFolio(cnDifFolio);
            }
        
        /**
         * Set cnFolio value.
         *
         * @param cnFolio java.lang.Long
         */
        public void setCnFolio(java.lang.Long cnFolio) {
                if(idComposite == null) {
                idComposite = new TnComprobanteDigPK();
            }
            this.idComposite.setCnFolio(cnFolio);
            }
        
        /**
         * Set cnPaquete value.
         *
         * @param cnPaquete java.lang.Integer
         */
        public void setCnPaquete(java.lang.Integer cnPaquete) {
                if(idComposite == null) {
                idComposite = new TnComprobanteDigPK();
            }
            this.idComposite.setCnPaquete(cnPaquete);
            }
        
        /**
         * Set cnRefTimbrado value.
         *
         * @param cnRefTimbrado java.lang.String
         */
        public void setCnRefTimbrado(java.lang.String cnRefTimbrado) {
                this.cnRefTimbrado = cnRefTimbrado;
            }
        
        /**
         * Set cnSituacion value.
         *
         * @param cnSituacion java.lang.String
         */
        public void setCnSituacion(java.lang.String cnSituacion) {
                this.cnSituacion = cnSituacion;
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
         * Set cnCadenaOriginal value.
         *
         * @param cnCadenaOriginal java.lang.String
         */
        public void setCnCadenaOriginal(java.lang.String cnCadenaOriginal) {
                this.cnCadenaOriginal = cnCadenaOriginal;
            }
        
        /**
         * Set cnCadenaSello value.
         *
         * @param cnCadenaSello java.lang.String
         */
        public void setCnCadenaSello(java.lang.String cnCadenaSello) {
                this.cnCadenaSello = cnCadenaSello;
            }
        
        /**
         * Set cnConsecNomina value.
         *
         * @param cnConsecNomina java.lang.Integer
         */
        public void setCnConsecNomina(java.lang.Integer cnConsecNomina) {
                this.cnConsecNomina = cnConsecNomina;
            }
        
        /**
         * Set cnEjercicio value.
         *
         * @param cnEjercicio java.lang.Integer
         */
        public void setCnEjercicio(java.lang.Integer cnEjercicio) {
                this.cnEjercicio = cnEjercicio;
            }
        

        
        /**
         * Set cnFechaGenerado value.
         *
         * @param cnFechaGenerado java.util.Date
         */
        public void setCnFechaGenerado(java.util.Date cnFechaGenerado) {
                this.cnFechaGenerado = cnFechaGenerado;
            }
        
        /**
         * Set cnFecCanc value.
         *
         * @param cnFecCanc java.util.Date
         */
        public void setCnFecCanc(java.util.Date cnFecCanc) {
                this.cnFecCanc = cnFecCanc;
            }
        
        /**
         * Set cnFecEnvio value.
         *
         * @param cnFecEnvio java.util.Date
         */
        public void setCnFecEnvio(java.util.Date cnFecEnvio) {
                this.cnFecEnvio = cnFecEnvio;
            }
        
        /**
         * Set cnFecEnvCanc value.
         *
         * @param cnFecEnvCanc java.util.Date
         */
        public void setCnFecEnvCanc(java.util.Date cnFecEnvCanc) {
                this.cnFecEnvCanc = cnFecEnvCanc;
            }
        
        /**
         * Set cnFecFirmaRec value.
         *
         * @param cnFecFirmaRec java.util.Date
         */
        public void setCnFecFirmaRec(java.util.Date cnFecFirmaRec) {
                this.cnFecFirmaRec = cnFecFirmaRec;
            }
        
        /**
         * Set cnFecRespuesta value.
         *
         * @param cnFecRespuesta java.util.Date
         */
        public void setCnFecRespuesta(java.util.Date cnFecRespuesta) {
                this.cnFecRespuesta = cnFecRespuesta;
            }
        
        /**
         * Set cnFolioFiscal value.
         *
         * @param cnFolioFiscal java.lang.String
         */
        public void setCnFolioFiscal(java.lang.String cnFolioFiscal) {
                this.cnFolioFiscal = cnFolioFiscal;
            }
        
        /**
         * Set cnFolioRecibo value.
         *
         * @param cnFolioRecibo java.lang.String
         */
        public void setCnFolioRecibo(java.lang.String cnFolioRecibo) {
                this.cnFolioRecibo = cnFolioRecibo;
            }
        
        /**
         * Set cnIdPaqueteSat value.
         *
         * @param cnIdPaqueteSat java.lang.String
         */
        public void setCnIdPaqueteSat(java.lang.String cnIdPaqueteSat) {
                this.cnIdPaqueteSat = cnIdPaqueteSat;
            }
        
        /**
         * Set cnIncidencia value.
         *
         * @param cnIncidencia java.lang.String
         */
        public void setCnIncidencia(java.lang.String cnIncidencia) {
                this.cnIncidencia = cnIncidencia;
            }
        
        /**
         * Set cnPaqueteRv value.
         *
         * @param cnPaqueteRv java.lang.Integer
         */
        public void setCnPaqueteRv(java.lang.Integer cnPaqueteRv) {
                this.cnPaqueteRv = cnPaqueteRv;
            }
        
        /**
         * Set cnRfc value.
         *
         * @param cnRfc java.lang.String
         */
        public void setCnRfc(java.lang.String cnRfc) {
                this.cnRfc = cnRfc;
            }
        
        /**
         * Set cnUriblobCanc value.
         *
         * @param cnUriblobCanc java.lang.String
         */
        public void setCnUriblobCanc(java.lang.String cnUriblobCanc) {
                this.cnUriblobCanc = cnUriblobCanc;
            }
        
        /**
         * Set cnUriblobTimb value.
         *
         * @param cnUriblobTimb java.lang.String
         */
        public void setCnUriblobTimb(java.lang.String cnUriblobTimb) {
                this.cnUriblobTimb = cnUriblobTimb;
            }
        
        /**
         * Set cnXmlCancelado value.
         *
         * @param cnXmlCancelado java.sql.Clob
         */
        public void setCnXmlCancelado(java.sql.Clob cnXmlCancelado) {
                this.cnXmlCancelado = cnXmlCancelado;
            }
        
        /**
         * Set cnXmlGenerado value.
         *
         * @param cnXmlGenerado java.sql.Clob
         */
        public void setCnXmlGenerado(java.sql.Clob cnXmlGenerado) {
                this.cnXmlGenerado = cnXmlGenerado;
            }
        
        /**
         * Set cnXmlTimbrado value.
         *
         * @param cnXmlTimbrado java.sql.Clob
         */
        public void setCnXmlTimbrado(java.sql.Clob cnXmlTimbrado) {
                this.cnXmlTimbrado = cnXmlTimbrado;
            }


        /**
         * Set identity value.
         *
         * @param idComposite Serializable
         */
        public void setIdentity(Serializable idComposite) {
            this.idComposite = (TnComprobanteDigPK ) idComposite;
        }

        /**
         * Get identity value.
         *
         * @return Serializable
         */
        public Serializable getIdentity() {
            return this.idComposite;
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

    public void setCnArchAnexo20(byte[] cnArchAnexo20) {
        this.cnArchAnexo20 = cnArchAnexo20;
    }

    public byte[] getCnArchAnexo20() {
        return cnArchAnexo20;
    }

    public void setCnArchACancelar(byte[] cnArchACancelar) {
        this.cnArchACancelar = cnArchACancelar;
    }

    public byte[] getCnArchACancelar() {
        return cnArchACancelar;
    }

    public void setCnArchCreacion(byte[] cnArchCreacion) {
        this.cnArchCreacion = cnArchCreacion;
    }

    public byte[] getCnArchCreacion() {
        return cnArchCreacion;
    }

    public void setCnArchTimbrado(byte[] cnArchTimbrado) {
        this.cnArchTimbrado = cnArchTimbrado;
    }

    public byte[] getCnArchTimbrado() {
        return cnArchTimbrado;
    }
}
