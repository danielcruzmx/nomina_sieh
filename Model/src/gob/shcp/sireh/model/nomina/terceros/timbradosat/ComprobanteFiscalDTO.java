package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

public class ComprobanteFiscalDTO implements Serializable, Model {
    //Criterios busqueda
    private Integer qnaPago;
    private Integer qnaCaptura;
    private Integer hpConsecNomina;
    private Integer complemento;
    private String  tipoNomina;
    private String  unidad;
    private String  beanName;
    private String  urlOrigen;
    private String  urlDestino;
    private String[] idGrupo;
    
    //buaqueda por usuario
    private Integer qnaIniEmpl;
    private Integer qnaFinEmpl;
    private String  rfcEmpleado;
     
    //Comprobante
    private Integer idComprobante;
    private Integer idPaquete;
    
    //Empleado
    private String rfc;
    private String nombre;
    private String nivel;
    
    //Busqueda por empleado
    private String HP_QNA_PAGO;
    private String ID_TIPO_NOMINA;
    private String HP_NUM_COMPLEM;
    private String HP_CONSEC_NOMINA;
    private String DESC_SIT_PAGO;
    private String ID_COMPROBANTE;
    private String ID_PAQUETE;
    private String ID_PAQUETE_CANCELADO;
    private String COMP_FOLIO_RECIBO;
    private String HP_FOLIO;
    private String HP_DIF_FOLIO;
    private String COMP_FOLIO_FISCAL;
    private String HP_NETO_PAGO;
    private String COMP_FECHA_EMISION;
    private String DESC_UNIDAD;
    private String NOMBRE_EMPLEADO;
    private String CN_FOLIO;
    private String CN_DIF_FOLIO;
    private String CN_PAQUETE;
    private String CN_CONSEC_NOMINA;
    private String ID_DESC_UNIDAD;
    private String NOMBRES_EMPLEADO;
    
    
    //Control
    private boolean buscar;
    private boolean limpiar;
    private boolean procesar;
    private boolean muestraRegistros;

    public void setQnaPago(Integer qnaPago) {
        this.qnaPago = qnaPago;
    }

    public Integer getQnaPago() {
        return qnaPago;
    }

    public void setComplemento(Integer complemento) {
        this.complemento = complemento;
    }

    public Integer getComplemento() {
        return complemento;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setIdGrupo(String[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String[] getIdGrupo() {
        return idGrupo;
    }

    public void setQnaCaptura(Integer qnaCaptura) {
        this.qnaCaptura = qnaCaptura;
    }

    public Integer getQnaCaptura() {
        return qnaCaptura;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setQnaIniEmpl(Integer qnaIniEmpl) {
        this.qnaIniEmpl = qnaIniEmpl;
    }

    public Integer getQnaIniEmpl() {
        return qnaIniEmpl;
    }

    public void setQnaFinEmpl(Integer qnaFinEmpl) {
        this.qnaFinEmpl = qnaFinEmpl;
    }

    public Integer getQnaFinEmpl() {
        return qnaFinEmpl;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setHP_QNA_PAGO(String hP_QNA_PAGO) {
        this.HP_QNA_PAGO = hP_QNA_PAGO;
    }

    public String getHP_QNA_PAGO() {
        return HP_QNA_PAGO;
    }

    public void setID_TIPO_NOMINA(String iD_TIPO_NOMINA) {
        this.ID_TIPO_NOMINA = iD_TIPO_NOMINA;
    }

    public String getID_TIPO_NOMINA() {
        return ID_TIPO_NOMINA;
    }

    public void setHP_NUM_COMPLEM(String hP_NUM_COMPLEM) {
        this.HP_NUM_COMPLEM = hP_NUM_COMPLEM;
    }

    public String getHP_NUM_COMPLEM() {
        return HP_NUM_COMPLEM;
    }

    public void setHP_CONSEC_NOMINA(String hP_CONSEC_NOMINA) {
        this.HP_CONSEC_NOMINA = hP_CONSEC_NOMINA;
    }

    public String getHP_CONSEC_NOMINA() {
        return HP_CONSEC_NOMINA;
    }

    public void setDESC_SIT_PAGO(String dESC_SIT_PAGO) {
        this.DESC_SIT_PAGO = dESC_SIT_PAGO;
    }

    public String getDESC_SIT_PAGO() {
        return DESC_SIT_PAGO;
    }

    public void setID_COMPROBANTE(String iD_COMPROBANTE) {
        this.ID_COMPROBANTE = iD_COMPROBANTE;
    }

    public String getID_COMPROBANTE() {
        return ID_COMPROBANTE;
    }

    public void setID_PAQUETE(String iD_PAQUETE) {
        this.ID_PAQUETE = iD_PAQUETE;
    }

    public String getID_PAQUETE() {
        return ID_PAQUETE;
    }

    public void setID_PAQUETE_CANCELADO(String iD_PAQUETE_CANCELADO) {
        this.ID_PAQUETE_CANCELADO = iD_PAQUETE_CANCELADO;
    }

    public String getID_PAQUETE_CANCELADO() {
        return ID_PAQUETE_CANCELADO;
    }

    public void setCOMP_FOLIO_RECIBO(String cOMP_FOLIO_RECIBO) {
        this.COMP_FOLIO_RECIBO = cOMP_FOLIO_RECIBO;
    }

    public String getCOMP_FOLIO_RECIBO() {
        return COMP_FOLIO_RECIBO;
    }

    public void setHP_FOLIO(String hP_FOLIO) {
        this.HP_FOLIO = hP_FOLIO;
    }

    public String getHP_FOLIO() {
        return HP_FOLIO;
    }

    public void setHP_DIF_FOLIO(String hP_DIF_FOLIO) {
        this.HP_DIF_FOLIO = hP_DIF_FOLIO;
    }

    public String getHP_DIF_FOLIO() {
        return HP_DIF_FOLIO;
    }

    public void setCOMP_FOLIO_FISCAL(String cOMP_FOLIO_FISCAL) {
        this.COMP_FOLIO_FISCAL = cOMP_FOLIO_FISCAL;
    }

    public String getCOMP_FOLIO_FISCAL() {
        return COMP_FOLIO_FISCAL;
    }

    public void setHP_NETO_PAGO(String hP_NETO_PAGO) {
        this.HP_NETO_PAGO = hP_NETO_PAGO;
    }

    public String getHP_NETO_PAGO() {
        return HP_NETO_PAGO;
    }

    public void setCOMP_FECHA_EMISION(String cOMP_FECHA_EMISION) {
        this.COMP_FECHA_EMISION = cOMP_FECHA_EMISION;
    }

    public String getCOMP_FECHA_EMISION() {
        return COMP_FECHA_EMISION;
    }

    public void setDESC_UNIDAD(String dESC_UNIDAD) {
        this.DESC_UNIDAD = dESC_UNIDAD;
    }

    public String getDESC_UNIDAD() {
        return DESC_UNIDAD;
    }

    public void setNOMBRE_EMPLEADO(String nOMBRE_EMPLEADO) {
        this.NOMBRE_EMPLEADO = nOMBRE_EMPLEADO;
    }

    public String getNOMBRE_EMPLEADO() {
        return NOMBRE_EMPLEADO;
    }

    public void setCN_FOLIO(String cN_FOLIO) {
        this.CN_FOLIO = cN_FOLIO;
    }

    public String getCN_FOLIO() {
        return CN_FOLIO;
    }

    public void setCN_DIF_FOLIO(String cN_DIF_FOLIO) {
        this.CN_DIF_FOLIO = cN_DIF_FOLIO;
    }

    public String getCN_DIF_FOLIO() {
        return CN_DIF_FOLIO;
    }

    public void setCN_PAQUETE(String cN_PAQUETE) {
        this.CN_PAQUETE = cN_PAQUETE;
    }

    public String getCN_PAQUETE() {
        return CN_PAQUETE;
    }

    public void setCN_CONSEC_NOMINA(String cN_CONSEC_NOMINA) {
        this.CN_CONSEC_NOMINA = cN_CONSEC_NOMINA;
    }

    public String getCN_CONSEC_NOMINA() {
        return CN_CONSEC_NOMINA;
    }

    public void setID_DESC_UNIDAD(String iD_DESC_UNIDAD) {
        this.ID_DESC_UNIDAD = iD_DESC_UNIDAD;
    }

    public String getID_DESC_UNIDAD() {
        return ID_DESC_UNIDAD;
    }

    public void setNOMBRES_EMPLEADO(String nOMBRES_EMPLEADO) {
        this.NOMBRES_EMPLEADO = nOMBRES_EMPLEADO;
    }

    public String getNOMBRES_EMPLEADO() {
        return NOMBRES_EMPLEADO;
    }

    public void setHpConsecNomina(Integer hpConsecNomina) {
        this.hpConsecNomina = hpConsecNomina;
    }

    public Integer getHpConsecNomina() {
        return hpConsecNomina;
    }
}
