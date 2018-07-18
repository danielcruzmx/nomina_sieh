package gob.shcp.sireh.model.nomina.conceptos;

import gob.shcp.fsn.model.Model;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Map;

import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;


/**
 * Objeto de trasporte de datos en la 
 * Actualizacion de conceptos del empleado.
 */
public class DatosEmpleadoCptoDTO implements java.io.Serializable, Model {

     /***  Query 1 *******/
     /***  TD_EMPLEADO ***/
     private java.lang.String       rfcEmpleado;
     private java.lang.String       nombreEmpleado;
     private java.lang.String       primerApellido;
     private java.lang.String       segundoApellido;
     /***  TD_PLAZA ***/
     private java.lang.Integer      idPlaza;
     private java.lang.String       idUnidadNom;
     private java.lang.String       idPuestoNom;
     /***  TC_UNIDAD ***/
     private java.lang.String       descUnidad;
     /***  TC_PUESTO ***/
     private java.lang.String       descPuesto;
     /***  TC_TABULADOR ***/
     private java.math.BigDecimal   tabSueldo;
     private java.math.BigDecimal   tabCompensacion;   
     private java.lang.String       idNivelPto;
     /***  TC_NOMBRAMIENTO ***/
     private java.lang.String       descNomNombramiento;
     /***  TC_ATRIBUTO_PUESTO ***/
     private java.lang.String       idNombramiento;
     
     /*** Query 2 - GRID DE CONCEPTOS***/
     /*** TN_MOVTO_CONCEPTO_PAGO **/
     private java.math.BigDecimal   mcpMonto;
     @NotBlank
     @RegExp("[0-9]*[.]?[0-9]*")
     private java.lang.String       mcpMontoLabel;
     private java.math.BigDecimal   mcpPorcentaje;
     @NotBlank
     @RegExp("[0-9]*[.]?[0-9]*")
     private java.lang.String       mcpPorcentajeLabel;
     private java.math.BigDecimal   mcpMontoAdeudo;
     @NotBlank
     @RegExp("[-+]?[0-9]*[.]?[0-9]*")
     private java.lang.String       mcpMontoAdeudoLabel;
     private java.lang.String       mcpMontoQnalAdeudoLabel;
     private java.lang.String       usuario;
     private java.lang.String       idSitCaptura;
     private java.lang.String       descSitCaptura;
     /*** TN_MOVTO_CONCEPTO_PAGO **/
     private java.lang.String       idTipoCpto;
     private java.lang.String       idConcepto;
     /*** TC_CONCEPTO_PAGO **/
     private java.lang.String       descConPag;
     
     /*** Query 3 - COMBOBOX - TC_CONCEPTO_PAGO_CAPTURA *******/
     private java.lang.String       cpcTipoCaptura;
     private java.lang.String       cpcTipoCalculo;
     private java.lang.String       cpcPermanente;
     private java.lang.String       cpcMensaje;
    
    //---------------------- proceso elimina concepto TN_MOVTO_CONCEPTO_PAGO -------------
     private java.lang.String       mcpRefCancela;
     private java.lang.Integer      mcpQnaCancelo;
     private java.lang.Integer      mcpQnaIni;
     private java.lang.String       mcpQnaIniLabel;
     private java.lang.Integer      mcpQnaFin;
     private java.lang.String       mcpQnaFinLabel;
     private java.lang.Integer      mcpQnaADescontar;
     @NotBlank
     @MaxLength(60)
     private java.lang.String       mcpRefCaptura;
     private java.util.Date         fecModifico;
     private java.lang.String       fecModificoLabel;
     private BigDecimal             qnaAplicadas;
     private java.lang.String       cpcSubTipo;
     private java.lang.String       cpcSubTipoDesc;
     
     //--------------------- propiedades en pantallas ------------------------
     private java.lang.String       fistCharOnIdNivelPto;
     private java.lang.String       fistCharOnIdNombramiento;
     private java.lang.String       selectedConceptoComboBox;
     private Map<String, Object>    listaOrdenadaQuincenas;
     private java.util.Map<String,  Object>  mapaOpcionesRdButtons;
     private java.lang.Integer      opcionRdButtonInt;
     private java.lang.String       opcionRdButton;
     private java.lang.Integer      anioQnaInicial;
     private java.lang.Integer      qnaQnaInicial;
     private java.lang.String       qnaIniLabel;
     private BigDecimal             ultimaQnaProcesa;
     private String                 idTercero;
     private boolean                valida;
     
     // ---------------- propiedades de proceso de detalle ------------------
     private java.util.Date         mcpFecIncidencia;
     private java.lang.String       mcpFecIncidenciaLabel;
     private java.math.BigDecimal   mcpHorasDias;
     @NotBlank
     @RegExp("[0-9]*[.]?[0-9]*")
     private java.lang.String       mcpHorasDiasLabel;
     private java.math.BigDecimal   mcpQnaCaptura;
     
     // ---------------- propiedades de proceso de Adeudo ------------------ 
     private java.util.Date         mcpFecIniAdeudo;
     private java.util.Date         mcpFecFinAdeudo;
     private java.lang.Integer      mcpQnasAdeudo;
     

 public DatosEmpleadoCptoDTO(){  }
 
 public DatosEmpleadoCptoDTO(
    String rfcEmpleado,
    String nombreEmpleado,
    String primerApellido,
    String segundoApellido,
    Integer idPlaza,
    String idUnidadNom,
    String idPuestoNom,
    String descUnidad,
    String descPuesto,
    BigDecimal tabSueldo,
    BigDecimal tabCompensacion,
    String idNivelPto,
    String descNomNombramiento,
    String idNombramiento,
    BigDecimal mcpMonto,
    BigDecimal mcpPorcentaje,
    BigDecimal mcpMontoAdeudo,
    String usuario,
    String idSitCaptura,
    String idTipoCpto,
    String idConcepto,
    String descConPag,
    String cpcTipoCaptura,
    String cpcTipoCalculo,
    String cpcPermanente,
    String cpcMensaje,
    String cpcSubTipo,
    String cpcSubTipoDesc,
    String fistCharOnIdNivelPto,
    String fistCharOnIdNombramiento,
    String selectedConceptoComboBox,
    String mcpRefCancela,
    Integer mcpQnaCancelo,
    Map<String, Object> mapaOpcionesRdButtons,
    Map<String, Object> listaOrdenadaQuincenas,
    Integer mcpQnaIni,
    Integer mcpQnaFin,
    Integer mcpQnaADescontar,
    String mcpQnaIniLabel,
    String mcpQnaFinLabel,
    String mcpPorcentajeLabel,
    Integer anioQnaInicial,
    Integer qnaQnaInicial,
    String qnaIniLabel,
    String mcpRefCaptura,
    String opcionRdButton, 
    Integer opcionRdButtonInt,
    String mcpMontoLabel,
    java.util.Date mcpFecIniAdeudo,
    java.util.Date mcpFecFinAdeudo, 
    String descSitCaptura,
    Date mcpFecIncidencia,
    BigDecimal mcpHorasDias,
    String mcpHorasDiasLabel,
    BigDecimal mcpQnaCaptura,
    Date fecModifico,
    String idTercero,
    BigDecimal qnaAplicadas,
    BigDecimal ultimaQnaProcesa,
    String mcpMontoAdeudoLabel,
    Integer mcpQnasAdeudo,
    boolean valida,
    String mcpMontoQnalAdeudoLabel
    ){
        
         this.rfcEmpleado = rfcEmpleado;
         this.nombreEmpleado = nombreEmpleado;
         this.primerApellido = primerApellido;
         this.segundoApellido = segundoApellido;
         this.idPlaza = idPlaza;
         this.idUnidadNom = idUnidadNom;
         this.idPuestoNom = idPuestoNom;
         this.descUnidad = descUnidad;
         this.descPuesto = descPuesto;
         this.tabSueldo = tabSueldo;
         this.tabCompensacion = tabCompensacion;
         this.idNivelPto = idNivelPto;
         this.descNomNombramiento = descNomNombramiento;
         this.idNombramiento = idNombramiento;
         this.mcpMonto = mcpMonto;
         this.mcpPorcentaje = mcpPorcentaje;
         this.mcpMontoAdeudo = mcpMontoAdeudo;
         this.usuario = usuario;
         this.idSitCaptura = idSitCaptura;
         this.idTipoCpto = idTipoCpto;
         this.idConcepto = idConcepto;
         this.descConPag = descConPag;
         this.cpcTipoCaptura = cpcTipoCaptura;
         this.cpcTipoCalculo = cpcTipoCalculo;
         this.cpcPermanente = cpcPermanente;
         this.cpcMensaje = cpcMensaje;
         this.cpcSubTipo = cpcSubTipo;
         this.cpcSubTipoDesc = cpcSubTipoDesc;
         this.fistCharOnIdNivelPto = fistCharOnIdNivelPto;
         this.fistCharOnIdNombramiento = fistCharOnIdNombramiento;
         this.selectedConceptoComboBox = selectedConceptoComboBox;
         this.mcpRefCancela = mcpRefCancela;
         this.mcpQnaCancelo = mcpQnaCancelo;
         this.mapaOpcionesRdButtons = mapaOpcionesRdButtons;
         this.listaOrdenadaQuincenas = listaOrdenadaQuincenas;
         this.mcpQnaIni = mcpQnaIni;
         this.mcpQnaFin = mcpQnaFin;
         this.mcpQnaADescontar = mcpQnaADescontar; 
         this.mcpQnaIniLabel = mcpQnaIniLabel;
         this.mcpQnaFinLabel = mcpQnaFinLabel;
         this.mcpPorcentajeLabel = mcpPorcentajeLabel;
         this.anioQnaInicial = anioQnaInicial;
         this.qnaQnaInicial = qnaQnaInicial;
         this.qnaIniLabel = qnaIniLabel;
         this.mcpRefCaptura = mcpRefCaptura;
         this.opcionRdButton = opcionRdButton;
         this.opcionRdButtonInt = opcionRdButtonInt;
         this.mcpMontoLabel = mcpMontoLabel;
         this.mcpFecIniAdeudo = mcpFecIniAdeudo;
         this.mcpFecFinAdeudo = mcpFecFinAdeudo;
         this.descSitCaptura = descSitCaptura;
         this.mcpFecIncidencia = mcpFecIncidencia;
         this.mcpHorasDias = mcpHorasDias;
         this.mcpHorasDiasLabel = mcpHorasDiasLabel;
         this.mcpQnaCaptura = mcpQnaCaptura;
         this.fecModifico = fecModifico;
         this.idTercero = idTercero;
         this.qnaAplicadas = qnaAplicadas;
         this.ultimaQnaProcesa = ultimaQnaProcesa;
         this.mcpMontoAdeudoLabel = mcpMontoAdeudoLabel;
         this.mcpQnasAdeudo = mcpQnasAdeudo;
         this.valida = valida;
         this.mcpMontoQnalAdeudoLabel = mcpMontoQnalAdeudoLabel; }


    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNom(String idUnidadNom) {
        this.idUnidadNom = idUnidadNom;
    }

    public String getIdUnidadNom() {
        return idUnidadNom;
    }

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setTabSueldo(BigDecimal tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public BigDecimal getTabSueldo() {
        return tabSueldo;
    }

    public void setTabCompensacion(BigDecimal tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public BigDecimal getTabCompensacion() {
        return tabCompensacion;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setDescNomNombramiento(String descNomNombramiento) {
        this.descNomNombramiento = descNomNombramiento;
    }

    public String getDescNomNombramiento() {
        return descNomNombramiento;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setMcpMonto(BigDecimal mcpMonto) {
        this.mcpMonto = mcpMonto;
    }

    public BigDecimal getMcpMonto() {
        return mcpMonto;
    }

    public void setMcpMontoLabel(String mcpMontoLabel) {
        this.mcpMontoLabel = mcpMontoLabel;
    }

    public String getMcpMontoLabel() {
        return mcpMontoLabel;
    }

    public void setMcpPorcentaje(BigDecimal mcpPorcentaje) {
        this.mcpPorcentaje = mcpPorcentaje;
    }

    public BigDecimal getMcpPorcentaje() {
        return mcpPorcentaje;
    }

    public void setMcpPorcentajeLabel(String mcpPorcentajeLabel) {
        this.mcpPorcentajeLabel = mcpPorcentajeLabel;
    }

    public String getMcpPorcentajeLabel() {
        return mcpPorcentajeLabel;
    }

    public void setMcpMontoAdeudo(BigDecimal mcpMontoAdeudo) {
        this.mcpMontoAdeudo = mcpMontoAdeudo;
    }

    public BigDecimal getMcpMontoAdeudo() {
        return mcpMontoAdeudo;
    }

    public void setMcpMontoAdeudoLabel(String mcpMontoAdeudoLabel) {
        this.mcpMontoAdeudoLabel = mcpMontoAdeudoLabel;
    }

    public String getMcpMontoAdeudoLabel() {
        return mcpMontoAdeudoLabel;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setIdSitCaptura(String idSitCaptura) {
        this.idSitCaptura = idSitCaptura;
    }

    public String getIdSitCaptura() {
        return idSitCaptura;
    }

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setIdConcepto(String idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getIdConcepto() {
        return idConcepto;
    }

    public void setDescConPag(String descConPag) {
        this.descConPag = descConPag;
    }

    public String getDescConPag() {
        return descConPag;
    }

    public void setCpcTipoCaptura(String cpcTipoCaptura) {
        this.cpcTipoCaptura = cpcTipoCaptura;
    }

    public String getCpcTipoCaptura() {
        return cpcTipoCaptura;
    }

    public void setCpcTipoCalculo(String cpcTipoCalculo) {
        this.cpcTipoCalculo = cpcTipoCalculo;
    }

    public String getCpcTipoCalculo() {
        return cpcTipoCalculo;
    }

    public void setCpcPermanente(String cpcPermanente) {
        this.cpcPermanente = cpcPermanente;
    }

    public String getCpcPermanente() {
        return cpcPermanente;
    }

    public void setCpcMensaje(String cpcMensaje) {
        this.cpcMensaje = cpcMensaje;
    }

    public String getCpcMensaje() {
        return cpcMensaje;
    }

    public void setMcpRefCancela(String mcpRefCancela) {
        this.mcpRefCancela = mcpRefCancela;
    }

    public String getMcpRefCancela() {
        return mcpRefCancela;
    }

    public void setMcpQnaCancelo(Integer mcpQnaCancelo) {
        this.mcpQnaCancelo = mcpQnaCancelo;
    }

    public Integer getMcpQnaCancelo() {
        return mcpQnaCancelo;
    }

    public void setMcpQnaIni(Integer mcpQnaIni) {
        this.mcpQnaIni = mcpQnaIni;
    }

    public Integer getMcpQnaIni() {
        return mcpQnaIni;
    }

    public void setMcpQnaIniLabel(String mcpQnaIniLabel) {
        this.mcpQnaIniLabel = mcpQnaIniLabel;
    }

    public String getMcpQnaIniLabel() {
        return mcpQnaIniLabel;
    }

    public void setMcpQnaFin(Integer mcpQnaFin) {
        this.mcpQnaFin = mcpQnaFin;
    }

    public Integer getMcpQnaFin() {
        return mcpQnaFin;
    }

    public void setMcpQnaADescontar(Integer mcpQnaADescontar) {
        this.mcpQnaADescontar = mcpQnaADescontar;
    }

    public Integer getMcpQnaADescontar() {
        return mcpQnaADescontar;
    }

    public void setMcpRefCaptura(String mcpRefCaptura) {
        this.mcpRefCaptura = mcpRefCaptura;
    }

    public String getMcpRefCaptura() {
        return mcpRefCaptura;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setQnaAplicadas(BigDecimal qnaAplicadas) {
        this.qnaAplicadas = qnaAplicadas;
    }

    public BigDecimal getQnaAplicadas() {
        return qnaAplicadas;
    }

    public void setFistCharOnIdNivelPto(String fistCharOnIdNivelPto) {
        this.fistCharOnIdNivelPto = fistCharOnIdNivelPto;
    }

    public String getFistCharOnIdNivelPto() {
        return fistCharOnIdNivelPto;
    }

    public void setFistCharOnIdNombramiento(String fistCharOnIdNombramiento) {
        this.fistCharOnIdNombramiento = fistCharOnIdNombramiento;
    }

    public String getFistCharOnIdNombramiento() {
        return fistCharOnIdNombramiento;
    }

    public void setSelectedConceptoComboBox(String selectedConceptoComboBox) {
        this.selectedConceptoComboBox = selectedConceptoComboBox;
    }

    public String getSelectedConceptoComboBox() {
        return selectedConceptoComboBox;
    }

    public void setListaOrdenadaQuincenas(Map<String, Object> listaOrdenadaQuincenas) {
        this.listaOrdenadaQuincenas = listaOrdenadaQuincenas;
    }

    public Map<String, Object> getListaOrdenadaQuincenas() {
        return listaOrdenadaQuincenas;
    }

    public void setMapaOpcionesRdButtons(Map<String, Object> mapaOpcionesRdButtons) {
        this.mapaOpcionesRdButtons = mapaOpcionesRdButtons;
    }

    public Map<String, Object> getMapaOpcionesRdButtons() {
        return mapaOpcionesRdButtons;
    }

    public void setOpcionRdButtonInt(Integer opcionRdButtonInt) {
        this.opcionRdButtonInt = opcionRdButtonInt;
    }

    public Integer getOpcionRdButtonInt() {
        return opcionRdButtonInt;
    }

    public void setOpcionRdButton(String opcionRdButton) {
        this.opcionRdButton = opcionRdButton;
    }

    public String getOpcionRdButton() {
        return opcionRdButton;
    }

    public void setAnioQnaInicial(Integer anioQnaInicial) {
        this.anioQnaInicial = anioQnaInicial;
    }

    public Integer getAnioQnaInicial() {
        return anioQnaInicial;
    }

    public void setQnaQnaInicial(Integer qnaQnaInicial) {
        this.qnaQnaInicial = qnaQnaInicial;
    }

    public Integer getQnaQnaInicial() {
        return qnaQnaInicial;
    }

    public void setQnaIniLabel(String qnaIniLabel) {
        this.qnaIniLabel = qnaIniLabel;
    }

    public String getQnaIniLabel() {
        return qnaIniLabel;
    }

    public void setUltimaQnaProcesa(BigDecimal ultimaQnaProcesa) {
        this.ultimaQnaProcesa = ultimaQnaProcesa;
    }

    public BigDecimal getUltimaQnaProcesa() {
        return ultimaQnaProcesa;
    }

    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setMcpFecIncidencia(Date mcpFecIncidencia) {
        this.mcpFecIncidencia = mcpFecIncidencia;
    }

    public Date getMcpFecIncidencia() {
        return mcpFecIncidencia;
    }

    public void setMcpHorasDias(BigDecimal mcpHorasDias) {
        this.mcpHorasDias = mcpHorasDias;
    }

    public BigDecimal getMcpHorasDias() {
        return mcpHorasDias;
    }

    public void setMcpQnaCaptura(BigDecimal mcpQnaCaptura) {
        this.mcpQnaCaptura = mcpQnaCaptura;
    }

    public BigDecimal getMcpQnaCaptura() {
        return mcpQnaCaptura;
    }

    public void setMcpFecIniAdeudo(Date mcpFecIniAdeudo) {
        this.mcpFecIniAdeudo = mcpFecIniAdeudo;
    }

    public Date getMcpFecIniAdeudo() {
        return mcpFecIniAdeudo;
    }

    public void setMcpFecFinAdeudo(Date mcpFecFinAdeudo) {
        this.mcpFecFinAdeudo = mcpFecFinAdeudo;
    }

    public Date getMcpFecFinAdeudo() {
        return mcpFecFinAdeudo;
    }
    
    public String getMontoReadOnly(){
        if( ("T0".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T1".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T2".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T3".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T4".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T5".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T6".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T7".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T8".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("T9".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("TA".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("TD".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            
            ("PD".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("LP".equals(idConcepto) && "D".equals(idTipoCpto)) ||
            ("NM".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PC".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("P0".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PA".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PB".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PE".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PI".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("NP".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("PF".equals(idConcepto) && "P".equals(idTipoCpto)) ||
            ("29".equals(idConcepto) && "D".equals(idTipoCpto)) ){
            return "true";   }
        return "false";
    }

    public void setCpcSubTipo(String cpcSubTipo) {
        this.cpcSubTipo = cpcSubTipo;
    }

    public String getCpcSubTipo() {
        return cpcSubTipo;
    }

    public void setCpcSubTipoDesc(String cpcSubTipoDesc) {
        this.cpcSubTipoDesc = cpcSubTipoDesc;
    }

    public String getCpcSubTipoDesc() {
        return cpcSubTipoDesc;
    }

    public void setMcpQnaFinLabel(String mcpQnaFinLabel) {
        this.mcpQnaFinLabel = mcpQnaFinLabel;
    }

    public String getMcpQnaFinLabel() {
        return mcpQnaFinLabel;
    }

    public void setMcpHorasDiasLabel(String mcpHorasDiasLabel) {
        this.mcpHorasDiasLabel = mcpHorasDiasLabel;
    }

    public String getMcpHorasDiasLabel() {
        return mcpHorasDiasLabel;
    }

    public void setMcpQnasAdeudo(Integer mcpQnasAdeudo) {
        this.mcpQnasAdeudo = mcpQnasAdeudo;
    }

    public Integer getMcpQnasAdeudo() {
        return mcpQnasAdeudo;
    }
    
    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public boolean isValida() {
        return valida;
    }

    public void setMcpMontoQnalAdeudoLabel(String mcpMontoQnalAdeudoLabel) {
        this.mcpMontoQnalAdeudoLabel = mcpMontoQnalAdeudoLabel;
    }

    public String getMcpMontoQnalAdeudoLabel() {
        return mcpMontoQnalAdeudoLabel;
    }
    
    @ValidationMethod(forProperty="mcpQnaFin", errorCode="error.qnaFin.unselected")
    private boolean validateMcpQnaFin() {
        if(this.isValida()){
            return !(this.getMcpQnaFin() == null);
        }
        return true;
    }

    public void setFecModificoLabel(String fecModificoLabel) {
        this.fecModificoLabel = fecModificoLabel;
    }

    public String getFecModificoLabel() {
        return fecModificoLabel;
    }

    public void setMcpFecIncidenciaLabel(String mcpFecIncidenciaLabel) {
        this.mcpFecIncidenciaLabel = mcpFecIncidenciaLabel;
    }

    public String getMcpFecIncidenciaLabel() {
        return mcpFecIncidenciaLabel;
    }
}
