package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

public class CustomTnMovtoConceptoPagoIncidenciasPersonal extends TnMovtoConceptoPago implements Domain, 
                                                                                                 Serializable {

    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;

    private java.lang.String descSitCaptura;

    public CustomTnMovtoConceptoPagoIncidenciasPersonal() {
    }

    public CustomTnMovtoConceptoPagoIncidenciasPersonal(java.lang.String descSitCaptura, 
                                                        java.lang.Long idMovtoConceptoPago, 
                                                        java.lang.String idTercero, 
                                                        java.util.Date fecModifico, 
                                                        java.lang.String usuario, 
                                                        java.lang.String idConcepto, 
                                                        java.lang.String idSitCaptura, 
                                                        java.lang.String idTipoCpto, 
                                                        java.util.Date mcpFecFinAdeudo, 
                                                        java.util.Date mcpFecIncidencia, 
                                                        java.util.Date mcpFecIniAdeudo, 
                                                        java.lang.Integer mcpHorasDias, 
                                                        java.lang.Double mcpMonto, 
                                                        java.lang.Double mcpMontoAdeudo, 
                                                        java.lang.Float mcpPorcentaje, 
                                                        java.lang.Integer mcpQnasAdeudo, 
                                                        java.lang.Integer mcpQnaAplicadas, 
                                                        java.lang.Integer mcpQnaADescontar, 
                                                        java.lang.Integer mcpQnaCancelo, 
                                                        java.lang.Integer mcpQnaCaptura, 
                                                        java.lang.Integer mcpQnaFin, 
                                                        java.lang.Integer mcpQnaIni, 
                                                        java.lang.String mcpRefCancela, 
                                                        java.lang.String mcpRefCaptura, 
                                                        java.lang.String mcpRfc, 
                                                        java.lang.Integer mcpUltQnaProcesa) {
        super(idMovtoConceptoPago, idTercero, fecModifico, usuario, idConcepto, 
              idSitCaptura, idTipoCpto, mcpFecFinAdeudo, mcpFecIncidencia, 
              mcpFecIniAdeudo, mcpHorasDias, mcpMonto, mcpMontoAdeudo, 
              mcpPorcentaje, mcpQnasAdeudo, mcpQnaAplicadas, mcpQnaADescontar, 
              mcpQnaCancelo, mcpQnaCaptura, mcpQnaFin, mcpQnaIni, 
              mcpRefCancela, mcpRefCaptura, mcpRfc, mcpUltQnaProcesa);

        this.descSitCaptura = descSitCaptura;
    }

    public void setDescSitCaptura(String descSitCaptura) {
        this.descSitCaptura = descSitCaptura;
    }

    public String getDescSitCaptura() {
        return descSitCaptura;
    }

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

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }
}
