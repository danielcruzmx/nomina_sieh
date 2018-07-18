package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;

/**
 * Model object for transporting TnHistoricoPago data.
 */
public class TnHistoricoPagoDTO  implements java.io.Serializable, Model {    

    @NotNull
    private java.lang.Integer hpDifFolio;
    @NotNull
    private java.lang.Long hpFolio;
    @NotNull
    private int hpCicloUnidad;
    @MaxLength(12)    
    private java.lang.String idUnidadNom;
    @MaxLength(12)    
    private java.lang.String idUnidadPre;
    @MaxLength(72)    
    private java.lang.String hpClabe;
    private java.lang.Integer hpConsecNomina;
    @MaxLength(4)    
    private java.lang.String hpDepositoSN;
    private java.lang.Integer hpDiasPago;
    private java.lang.Integer hpEjerFiscal;
    private java.util.Date hpFinPago;
    private java.util.Date hpIniPago;
    @MaxLength(4)    
    private java.lang.String hpJerarquia;
    @NotNull
    private java.lang.Double hpNetoPago;
    @MaxLength(4)    
    private java.lang.String hpNombramiento;
    @MaxLength(8)    
    private java.lang.String hpNumComplem;
    private java.lang.Integer hpNumPension;
    private java.lang.Integer hpPcpPagados;
    private java.lang.Integer hpPcpPorPagar;
    private java.lang.Integer hpQnaPago;
    @MaxLength(52)
    @NotNull
    @NotBlank
    private java.lang.String hpRfc;
    private java.lang.Integer idEdoNom;
    private java.lang.Integer idEdoPre;
    @MaxLength(4)    
    private java.lang.String idGrupopagoNom;
    private java.lang.Integer idMuniNom;
    @MaxLength(16)    
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    @MaxLength(28)    
    private java.lang.String idPuestoNom;
    @MaxLength(28)    
    private java.lang.String idPuestoPre;
    private java.lang.Integer idRangoNom;
    @MaxLength(4)    
    private java.lang.String idSitPago;
    @MaxLength(12)    
    private java.lang.String idTipoNomina;
    private java.lang.Integer idZonaDistNom;
    private java.lang.Boolean idZonaEcoNom;
    private java.lang.Boolean idZonaEcoPre;

    /**
     * Constructor for TnHistoricoPagoDTO class.
     */
    public TnHistoricoPagoDTO() { }    

                                                                                                                                                
    /**
     * Constructor for TnHistoricoPagoDTO class.
     *
     * @param hpDifFolio java.lang.Integer
     * @param hpFolio java.lang.Long
     * @param hpCicloUnidad int
     * @param idUnidadNom java.lang.String
     * @param idUnidadPre java.lang.String
     * @param hpClabe java.lang.String
     * @param hpConsecNomina java.lang.Integer
     * @param hpDepositoSN java.lang.String
     * @param hpDiasPago java.lang.Integer
     * @param hpEjerFiscal java.lang.Integer
     * @param hpFinPago java.util.Date
     * @param hpIniPago java.util.Date
     * @param hpJerarquia java.lang.String
     * @param hpNetoPago java.lang.Long
     * @param hpNombramiento java.lang.String
     * @param hpNumComplem java.lang.String
     * @param hpNumPension java.lang.Integer
     * @param hpPcpPagados java.lang.Integer
     * @param hpPcpPorPagar java.lang.Integer
     * @param hpQnaPago java.lang.Integer
     * @param hpRfc java.lang.String
     * @param idEdoNom java.lang.Integer
     * @param idEdoPre java.lang.Integer
     * @param idGrupopagoNom java.lang.String
     * @param idMuniNom java.lang.Integer
     * @param idNivelPto java.lang.String
     * @param idPlaza java.lang.Integer
     * @param idPuestoNom java.lang.String
     * @param idPuestoPre java.lang.String
     * @param idRangoNom java.lang.Integer
     * @param idSitPago java.lang.String
     * @param idTipoNomina java.lang.String
     * @param idZonaDistNom java.lang.Integer
     * @param idZonaEcoNom java.lang.Boolean
     * @param idZonaEcoPre java.lang.Boolean
     */
    public TnHistoricoPagoDTO( java.lang.Integer hpDifFolio, java.lang.Long hpFolio, int hpCicloUnidad, java.lang.String idUnidadNom, java.lang.String idUnidadPre, java.lang.String hpClabe, java.lang.Integer hpConsecNomina, java.lang.String hpDepositoSN, java.lang.Integer hpDiasPago, java.lang.Integer hpEjerFiscal, java.util.Date hpFinPago, java.util.Date hpIniPago, java.lang.String hpJerarquia, java.lang.Double hpNetoPago, java.lang.String hpNombramiento, java.lang.String hpNumComplem, java.lang.Integer hpNumPension, java.lang.Integer hpPcpPagados, java.lang.Integer hpPcpPorPagar, java.lang.Integer hpQnaPago, java.lang.String hpRfc, java.lang.Integer idEdoNom, java.lang.Integer idEdoPre, java.lang.String idGrupopagoNom, java.lang.Integer idMuniNom, java.lang.String idNivelPto, java.lang.Integer idPlaza, java.lang.String idPuestoNom, java.lang.String idPuestoPre, java.lang.Integer idRangoNom, java.lang.String idSitPago, java.lang.String idTipoNomina, java.lang.Integer idZonaDistNom, java.lang.Boolean idZonaEcoNom, java.lang.Boolean idZonaEcoPre){    
        this.hpDifFolio = hpDifFolio;
        this.hpFolio = hpFolio;
        this.hpCicloUnidad = hpCicloUnidad;
        this.idUnidadNom = idUnidadNom;
        this.idUnidadPre = idUnidadPre;
        this.hpClabe = hpClabe;
        this.hpConsecNomina = hpConsecNomina;
        this.hpDepositoSN = hpDepositoSN;
        this.hpDiasPago = hpDiasPago;
        this.hpEjerFiscal = hpEjerFiscal;
        this.hpFinPago = hpFinPago;
        this.hpIniPago = hpIniPago;
        this.hpJerarquia = hpJerarquia;
        this.hpNetoPago = hpNetoPago;
        this.hpNombramiento = hpNombramiento;
        this.hpNumComplem = hpNumComplem;
        this.hpNumPension = hpNumPension;
        this.hpPcpPagados = hpPcpPagados;
        this.hpPcpPorPagar = hpPcpPorPagar;
        this.hpQnaPago = hpQnaPago;
        this.hpRfc = hpRfc;
        this.idEdoNom = idEdoNom;
        this.idEdoPre = idEdoPre;
        this.idGrupopagoNom = idGrupopagoNom;
        this.idMuniNom = idMuniNom;
        this.idNivelPto = idNivelPto;
        this.idPlaza = idPlaza;
        this.idPuestoNom = idPuestoNom;
        this.idPuestoPre = idPuestoPre;
        this.idRangoNom = idRangoNom;
        this.idSitPago = idSitPago;
        this.idTipoNomina = idTipoNomina;
        this.idZonaDistNom = idZonaDistNom;
        this.idZonaEcoNom = idZonaEcoNom;
        this.idZonaEcoPre = idZonaEcoPre;
    }    

    
    /**
     * Set hpDifFolio value.
     *
     * @param hpDifFolio java.lang.Integer
     */
    public void setHpDifFolio(java.lang.Integer hpDifFolio){
        this.hpDifFolio = hpDifFolio;
    }
    
    /**
     * Get hpDifFolio value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpDifFolio() {
        return this.hpDifFolio;    
    }
    
    /**
     * Set hpFolio value.
     *
     * @param hpFolio java.lang.Long
     */
    public void setHpFolio(java.lang.Long hpFolio){
        this.hpFolio = hpFolio;
    }
    
    /**
     * Get hpFolio value.
     *
     * @return java.lang.Long
     */
    public java.lang.Long getHpFolio() {
        return this.hpFolio;    
    }
    
    /**
     * Set hpCicloUnidad value.
     *
     * @param hpCicloUnidad int
     */
    public void setHpCicloUnidad(int hpCicloUnidad){
        this.hpCicloUnidad = hpCicloUnidad;
    }
    
    /**
     * Get hpCicloUnidad value.
     *
     * @return int
     */
    public int getHpCicloUnidad() {
        return this.hpCicloUnidad;    
    }
    
    /**
     * Set idUnidadNom value.
     *
     * @param idUnidadNom java.lang.String
     */
    public void setIdUnidadNom(java.lang.String idUnidadNom){
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
     * Set idUnidadPre value.
     *
     * @param idUnidadPre java.lang.String
     */
    public void setIdUnidadPre(java.lang.String idUnidadPre){
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
     * Set hpClabe value.
     *
     * @param hpClabe java.lang.String
     */
    public void setHpClabe(java.lang.String hpClabe){
        this.hpClabe = hpClabe;
    }
    
    /**
     * Get hpClabe value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpClabe() {
        return this.hpClabe;    
    }
    
    /**
     * Set hpConsecNomina value.
     *
     * @param hpConsecNomina java.lang.Integer
     */
    public void setHpConsecNomina(java.lang.Integer hpConsecNomina){
        this.hpConsecNomina = hpConsecNomina;
    }
    
    /**
     * Get hpConsecNomina value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpConsecNomina() {
        return this.hpConsecNomina;    
    }
    
    /**
     * Set hpDepositoSN value.
     *
     * @param hpDepositoSN java.lang.String
     */
    public void setHpDepositoSN(java.lang.String hpDepositoSN){
        this.hpDepositoSN = hpDepositoSN;
    }
    
    /**
     * Get hpDepositoSN value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpDepositoSN() {
        return this.hpDepositoSN;    
    }
    
    /**
     * Set hpDiasPago value.
     *
     * @param hpDiasPago java.lang.Integer
     */
    public void setHpDiasPago(java.lang.Integer hpDiasPago){
        this.hpDiasPago = hpDiasPago;
    }
    
    /**
     * Get hpDiasPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpDiasPago() {
        return this.hpDiasPago;    
    }
    
    /**
     * Set hpEjerFiscal value.
     *
     * @param hpEjerFiscal java.lang.Integer
     */
    public void setHpEjerFiscal(java.lang.Integer hpEjerFiscal){
        this.hpEjerFiscal = hpEjerFiscal;
    }
    
    /**
     * Get hpEjerFiscal value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpEjerFiscal() {
        return this.hpEjerFiscal;    
    }
    
    /**
     * Set hpFinPago value.
     *
     * @param hpFinPago java.util.Date
     */
    public void setHpFinPago(java.util.Date hpFinPago){
        this.hpFinPago = hpFinPago;
    }
    
    /**
     * Get hpFinPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHpFinPago() {
        return this.hpFinPago;    
    }
    
    /**
     * Set hpIniPago value.
     *
     * @param hpIniPago java.util.Date
     */
    public void setHpIniPago(java.util.Date hpIniPago){
        this.hpIniPago = hpIniPago;
    }
    
    /**
     * Get hpIniPago value.
     *
     * @return java.util.Date
     */
    public java.util.Date getHpIniPago() {
        return this.hpIniPago;    
    }
    
    /**
     * Set hpJerarquia value.
     *
     * @param hpJerarquia java.lang.String
     */
    public void setHpJerarquia(java.lang.String hpJerarquia){
        this.hpJerarquia = hpJerarquia;
    }
    
    /**
     * Get hpJerarquia value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpJerarquia() {
        return this.hpJerarquia;    
    }
    
    /**
     * Set hpNetoPago value.
     *
     * @param hpNetoPago java.lang.Long
     */
    public void setHpNetoPago(java.lang.Double hpNetoPago){
        this.hpNetoPago = hpNetoPago;
    }
    
    /**
     * Get hpNetoPago value.
     *
     * @return java.lang.Long
     */
    public java.lang.Double getHpNetoPago() {
        return this.hpNetoPago;    
    }
    
    /**
     * Set hpNombramiento value.
     *
     * @param hpNombramiento java.lang.String
     */
    public void setHpNombramiento(java.lang.String hpNombramiento){
        this.hpNombramiento = hpNombramiento;
    }
    
    /**
     * Get hpNombramiento value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpNombramiento() {
        return this.hpNombramiento;    
    }
    
    /**
     * Set hpNumComplem value.
     *
     * @param hpNumComplem java.lang.String
     */
    public void setHpNumComplem(java.lang.String hpNumComplem){
        this.hpNumComplem = hpNumComplem;
    }
    
    /**
     * Get hpNumComplem value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpNumComplem() {
        return this.hpNumComplem;    
    }
    
    /**
     * Set hpNumPension value.
     *
     * @param hpNumPension java.lang.Integer
     */
    public void setHpNumPension(java.lang.Integer hpNumPension){
        this.hpNumPension = hpNumPension;
    }
    
    /**
     * Get hpNumPension value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpNumPension() {
        return this.hpNumPension;    
    }
    
    /**
     * Set hpPcpPagados value.
     *
     * @param hpPcpPagados java.lang.Integer
     */
    public void setHpPcpPagados(java.lang.Integer hpPcpPagados){
        this.hpPcpPagados = hpPcpPagados;
    }
    
    /**
     * Get hpPcpPagados value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpPcpPagados() {
        return this.hpPcpPagados;    
    }
    
    /**
     * Set hpPcpPorPagar value.
     *
     * @param hpPcpPorPagar java.lang.Integer
     */
    public void setHpPcpPorPagar(java.lang.Integer hpPcpPorPagar){
        this.hpPcpPorPagar = hpPcpPorPagar;
    }
    
    /**
     * Get hpPcpPorPagar value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpPcpPorPagar() {
        return this.hpPcpPorPagar;    
    }
    
    /**
     * Set hpQnaPago value.
     *
     * @param hpQnaPago java.lang.Integer
     */
    public void setHpQnaPago(java.lang.Integer hpQnaPago){
        this.hpQnaPago = hpQnaPago;
    }
    
    /**
     * Get hpQnaPago value.
     *
     * @return java.lang.Integer
     */
    public java.lang.Integer getHpQnaPago() {
        return this.hpQnaPago;    
    }
    
    /**
     * Set hpRfc value.
     *
     * @param hpRfc java.lang.String
     */
    public void setHpRfc(java.lang.String hpRfc){
        this.hpRfc = hpRfc;
    }
    
    /**
     * Get hpRfc value.
     *
     * @return java.lang.String
     */
    public java.lang.String getHpRfc() {
        return this.hpRfc;    
    }
    
    /**
     * Set idEdoNom value.
     *
     * @param idEdoNom java.lang.Integer
     */
    public void setIdEdoNom(java.lang.Integer idEdoNom){
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
    public void setIdEdoPre(java.lang.Integer idEdoPre){
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
     * Set idGrupopagoNom value.
     *
     * @param idGrupopagoNom java.lang.String
     */
    public void setIdGrupopagoNom(java.lang.String idGrupopagoNom){
        this.idGrupopagoNom = idGrupopagoNom;
    }
    
    /**
     * Get idGrupopagoNom value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdGrupopagoNom() {
        return this.idGrupopagoNom;    
    }
    
    /**
     * Set idMuniNom value.
     *
     * @param idMuniNom java.lang.Integer
     */
    public void setIdMuniNom(java.lang.Integer idMuniNom){
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
     * Set idNivelPto value.
     *
     * @param idNivelPto java.lang.String
     */
    public void setIdNivelPto(java.lang.String idNivelPto){
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
     * Set idPlaza value.
     *
     * @param idPlaza java.lang.Integer
     */
    public void setIdPlaza(java.lang.Integer idPlaza){
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
     * Set idPuestoNom value.
     *
     * @param idPuestoNom java.lang.String
     */
    public void setIdPuestoNom(java.lang.String idPuestoNom){
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
     * Set idPuestoPre value.
     *
     * @param idPuestoPre java.lang.String
     */
    public void setIdPuestoPre(java.lang.String idPuestoPre){
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
    public void setIdRangoNom(java.lang.Integer idRangoNom){
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
     * Set idSitPago value.
     *
     * @param idSitPago java.lang.String
     */
    public void setIdSitPago(java.lang.String idSitPago){
        this.idSitPago = idSitPago;
    }
    
    /**
     * Get idSitPago value.
     *
     * @return java.lang.String
     */
    public java.lang.String getIdSitPago() {
        return this.idSitPago;    
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
     * Set idZonaDistNom value.
     *
     * @param idZonaDistNom java.lang.Integer
     */
    public void setIdZonaDistNom(java.lang.Integer idZonaDistNom){
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
     * Set idZonaEcoNom value.
     *
     * @param idZonaEcoNom java.lang.Boolean
     */
    public void setIdZonaEcoNom(java.lang.Boolean idZonaEcoNom){
        this.idZonaEcoNom = idZonaEcoNom;
    }
    
    /**
     * Get idZonaEcoNom value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdZonaEcoNom() {
        return this.idZonaEcoNom;    
    }
    
    /**
     * Set idZonaEcoPre value.
     *
     * @param idZonaEcoPre java.lang.Boolean
     */
    public void setIdZonaEcoPre(java.lang.Boolean idZonaEcoPre){
        this.idZonaEcoPre = idZonaEcoPre;
    }
    
    /**
     * Get idZonaEcoPre value.
     *
     * @return java.lang.Boolean
     */
    public java.lang.Boolean isIdZonaEcoPre() {
        return this.idZonaEcoPre;    
    }


}