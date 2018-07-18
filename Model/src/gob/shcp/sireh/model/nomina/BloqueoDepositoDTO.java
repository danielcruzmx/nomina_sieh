package gob.shcp.sireh.model.nomina;

import java.math.BigDecimal;

public class BloqueoDepositoDTO  {
    private java.lang.Integer idFolio;                                  //Numero de Folio{capturado}
    private java.lang.Integer hpDifFolio;                               //Clave diferenciadora{capturado}
    private java.lang.String descTipoNomina;                            //Tipo de nomina
    private java.lang.Integer hpQnaPago;                                //Qna de PAgo
    private java.lang.String descSitPago;                               //Situacion cheque
    private java.lang.String hpRfc;                                     //RFC{capturado}
    private java.lang.String primerApellido;                            // concatena
    private java.lang.String segundoApellido;                           // concatena
    private java.lang.String nombreEmpleado;                            // concatena
    private java.math.BigDecimal hpNetoPago;                            // Liquido{capturado}
    private java.lang.String msgHpNetoPago;
    private java.lang.Integer idMotivoCancela; 
    private java.lang.String descMotivoCancela;                         // Motivo de Cancelacion{selecciona de combo}
    private java.lang.Integer cpcQnaAplica;                             // Quincena de recuperacion{selecciona de combo}
    private java.lang.String cpcReferencia;                             // Referencia{capturado}
    private java.lang.String usuario;
    private java.lang.String fecModifico;
    
    public BloqueoDepositoDTO() { }
    
    public BloqueoDepositoDTO(  java.lang.Integer idFolio,
                                java.lang.Integer hpDifFolio,
                                java.lang.String descTipoNomina,
                                java.lang.Integer hpQnaPago,
                                java.lang.String descSitPago,
                                java.lang.String hpRfc,
                                java.lang.String primerApellido,
                                java.lang.String segundoApellido,
                                java.lang.String nombreEmpleado,
                                java.math.BigDecimal hpNetoPago,
                                java.lang.String msgHpNetoPago,
                                java.lang.Integer idMotivoCancela,
                                java.lang.String descMotivoCancela,
                                java.lang.Integer cpcQnaAplica,
                                java.lang.String cpcReferencia,
                                java.lang.String usuario,
                                java.lang.String fecModifico) {
        this.idFolio = idFolio;
        this.hpDifFolio = hpDifFolio;
        this.descTipoNomina = descTipoNomina;
        this.hpQnaPago = hpQnaPago;
        this.descSitPago = descSitPago;
        this.hpRfc = hpRfc;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.hpNetoPago = hpNetoPago;
        this.msgHpNetoPago = msgHpNetoPago;
        this.idMotivoCancela = idMotivoCancela;
        this.descMotivoCancela = descMotivoCancela;
        this.cpcQnaAplica = cpcQnaAplica;
        this.cpcReferencia = cpcReferencia;
        this.usuario = usuario;
        this.fecModifico = fecModifico; }


    public void setIdFolio(Integer idFolio) {
        this.idFolio = idFolio;
    }

    public Integer getIdFolio() {
        return idFolio;
    }

    public void setHpDifFolio(Integer hpDifFolio) {
        this.hpDifFolio = hpDifFolio;
    }

    public Integer getHpDifFolio() {
        return hpDifFolio;
    }

    public void setDescTipoNomina(String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }

    public String getDescTipoNomina() {
        return descTipoNomina;
    }

    public void setHpQnaPago(Integer hpQnaPago) {
        this.hpQnaPago = hpQnaPago;
    }

    public Integer getHpQnaPago() {
        return hpQnaPago;
    }

    public void setDescSitPago(String descSitPago) {
        this.descSitPago = descSitPago;
    }

    public String getDescSitPago() {
        return descSitPago;
    }

    public void setHpRfc(String hpRfc) {
        this.hpRfc = hpRfc;
    }

    public String getHpRfc() {
        return hpRfc;
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

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setHpNetoPago(BigDecimal hpNetoPago) {
        this.hpNetoPago = hpNetoPago;
    }

    public BigDecimal getHpNetoPago() {
        return hpNetoPago;
    }

    public void setMsgHpNetoPago(String msgHpNetoPago) {
        this.msgHpNetoPago = msgHpNetoPago;
    }

    public String getMsgHpNetoPago() {
        return msgHpNetoPago;
    }

    public void setIdMotivoCancela(Integer idMotivoCancela) {
        this.idMotivoCancela = idMotivoCancela;
    }

    public Integer getIdMotivoCancela() {
        return idMotivoCancela;
    }

    public void setDescMotivoCancela(String descMotivoCancela) {
        this.descMotivoCancela = descMotivoCancela;
    }

    public String getDescMotivoCancela() {
        return descMotivoCancela;
    }

    public void setCpcQnaAplica(Integer cpcQnaAplica) {
        this.cpcQnaAplica = cpcQnaAplica;
    }

    public Integer getCpcQnaAplica() {
        return cpcQnaAplica;
    }

    public void setCpcReferencia(String cpcReferencia) {
        this.cpcReferencia = cpcReferencia;
    }

    public String getCpcReferencia() {
        return cpcReferencia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setFecModifico(String fecModifico) {
        this.fecModifico = fecModifico;
    }

    public String getFecModifico() {
        return fecModifico;
    }
}
