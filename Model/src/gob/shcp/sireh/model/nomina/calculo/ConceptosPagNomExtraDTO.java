package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.TnConceptoPagadoBeneficiarioDTO;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Pantalla: Cálculo de nómina - Extraordinaria - Personal - Conceptos pagados 
 */
public class ConceptosPagNomExtraDTO implements Serializable, Model {    
    /*DATOS DE LA NOMINA*/
    private Integer nomQnaCaptura;
    private String nomNumComplem = "0";
    private String descNomina;
    private String idTipoNomina;
    private String nomDescTipoNomina;
    private String nomDescGrupoPago;
    private String periodoPago;
    private String idEdoNom;
    private Date nomIniPago;
    private Date nomFinPago;
    private Integer idNomina;
    private String idGrupoPago;
    private int idQna;
    
    /*DATOS DEL EMPLEADO*/
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String rfcEmpleado;
    private String descTipoPago;
    
    /*DATOS DE LA PLAZA*/
    private Integer idPlaza;
    private String idPuestoNom;
    private Integer idZonaDistNom;
    private String descGrupoPago;
    private String idNivelPto;
    private String idNombramiento;
    private String descNombramiento;
    private String descJerarquia;
    
    /*OTROS*/
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    private java.util.Date cnqFinPago;
    private java.util.Date cnqIniPago;
    private java.lang.Double cnqLiquido;
    private String jsonDataString;
    private String jsonConceptosString;
    private String postData;
    private String status;
    
    private String conceptos;
    private String tipoExtraordinaria;
    
    /* jdbc-sql-def-->listaConceptosNomExt
     * para el paginador --> ConceptosJSon*/
    List<TnConceptoPagadoBeneficiarioDTO> conceptosPagados;
    
    /* Para el comboBox */
    List<ConceptoPagoDTO> conceptosPago;
    
    public ConceptosPagNomExtraDTO() {
    }

    public void setNomQnaCaptura(Integer nomQnaCaptura) {
        this.nomQnaCaptura = nomQnaCaptura;
    }

    public Integer getNomQnaCaptura() {
        return nomQnaCaptura;
    }

    public void setNomNumComplem(String nomNumComplem) {
        this.nomNumComplem = nomNumComplem;
    }

    public String getNomNumComplem() {
        return nomNumComplem;
    }

    public void setDescNomina(String descNomina) {
        this.descNomina = descNomina;
    }

    public String getDescNomina() {
        return descNomina;
    }

    public void setNomDescTipoNomina(String nomDescTipoNomina) {
        this.nomDescTipoNomina = nomDescTipoNomina;
    }

    public String getNomDescTipoNomina() {
        return nomDescTipoNomina;
    }

    public void setNomDescGrupoPago(String nomDescGrupoPago) {
        this.nomDescGrupoPago = nomDescGrupoPago;
    }

    public String getNomDescGrupoPago() {
        return nomDescGrupoPago;
    }

    public void setPeriodoPago(String periodoPago) {
        this.periodoPago = periodoPago;
    }

    public String getPeriodoPago() {
        return periodoPago;
    }

    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setDescTipoPago(String descTipoPago) {
        this.descTipoPago = descTipoPago;
    }

    public String getDescTipoPago() {
        return descTipoPago;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setConceptosPagados(List<TnConceptoPagadoBeneficiarioDTO> conceptosPagados) {
        this.conceptosPagados = conceptosPagados;
    }

    public List<TnConceptoPagadoBeneficiarioDTO> getConceptosPagados() {
        return conceptosPagados;
    }

    public void setConceptosPago(List<ConceptoPagoDTO> conceptosPago) {
        this.conceptosPago = conceptosPago;
    }

    public List<ConceptoPagoDTO> getConceptosPago() {
        return conceptosPago;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCnqFinPago(Date cnqFinPago) {
        this.cnqFinPago = cnqFinPago;
    }

    public Date getCnqFinPago() {
        return cnqFinPago;
    }

    public void setCnqIniPago(Date cnqIniPago) {
        this.cnqIniPago = cnqIniPago;
    }

    public Date getCnqIniPago() {
        return cnqIniPago;
    }

    public void setCnqLiquido(Double cnqLiquido) {
        this.cnqLiquido = cnqLiquido;
    }

    public Double getCnqLiquido() {
        return cnqLiquido;
    }

    public void setJsonDataString(String jsonDataString) {
        this.jsonDataString = jsonDataString;
    }

    public String getJsonDataString() {
        return jsonDataString;
    }

    public void setNomIniPago(Date nomIniPago) {
        this.nomIniPago = nomIniPago;
    }

    public Date getNomIniPago() {
        return nomIniPago;
    }

    public void setNomFinPago(Date nomFinPago) {
        this.nomFinPago = nomFinPago;
    }

    public Date getNomFinPago() {
        return nomFinPago;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setIdQna(int idQna) {
        this.idQna = idQna;
    }

    public int getIdQna() {
        return idQna;
    }
    
    public String getJsonConceptosString() {
        return jsonConceptosString;
    }

    public void setJsonConceptosString(String jsonConceptosString) {
        this.jsonConceptosString = jsonConceptosString;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public String getPostData() {
        return postData;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setConceptos(String conceptos) {
        this.conceptos = conceptos;
    }

    public String getConceptos() {
        return conceptos;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }
    
    public void setTipoExtraordinaria(String tipoExtraordinaria) {
        this.tipoExtraordinaria = tipoExtraordinaria;
    }

    public String getTipoExtraordinaria() {
        return tipoExtraordinaria;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }
}
