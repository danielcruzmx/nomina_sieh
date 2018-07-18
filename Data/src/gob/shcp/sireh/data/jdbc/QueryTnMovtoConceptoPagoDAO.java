package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.CustomTnMovtoConceptoPagoSitCaptura;
import gob.shcp.sireh.domain.jdbc.PadronFonac;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;

import java.util.Date;
import java.util.List;

public interface QueryTnMovtoConceptoPagoDAO extends TnMovtoConceptoPagoDAO {
    
    @FindByNamedQuery(name="selectMovtoConceptoPagoByRfc", value=TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> findMovtosConceptoPagoByRfc(String mcp_rfc);
    
    @FindByNamedQuery(name="tnMovtoConceptoPagoSitCapturaByRfc", value=CustomTnMovtoConceptoPagoSitCaptura.class)
    List<CustomTnMovtoConceptoPagoSitCaptura> findMovtosConceptoPagoSitCapturaByRfc(String id_sit_captura1, String id_sit_captura2, String idTipoConcepto,  String idConcepto1, String idConcepto2,
                                                                     String idConcepto3, String idConcepto4, String idConcepto5, Date rangoFechaInferior, Date rangoFechaSuperior, String mcp_rfc);
    
    
    @FindByCondition( value=TnMovtoConceptoPago.class, condition="MCP_RFC=? AND  ID_TIPO_CPTO=? AND  ID_CONCEPTO =?   AND  ID_SIT_CAPTURA = 'V' ")
    TnMovtoConceptoPago findSituacionCpto(String mcp_rfc, String id_tipo_cpto,String id_concepto);
    
    @FindByNamedQuery(name="consultaSituacionConcepto", value=TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> findSituacionCptoPago(String mcp_rfc, String id_tipo_cpto,String id_concepto);
    
    @FindByNamedQuery(name="consultaSituacionConceptoCtrAsist", value=TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> findSituacionCptoPagoCtrAsist(String mcp_rfc, String id_tipo_cpto,String id_concepto, Date fecha_incidencia);
    
    @FindByCondition( value=TnMovtoConceptoPago.class, condition="ID_TIPO_CPTO = ? AND ID_CONCEPTO IN (?, ?) AND ID_SIT_CAPTURA = ?  AND MCP_RFC = ?")
    TnMovtoConceptoPago findByIdTipoCptoMcpRfc(String idTipoCpto, String idConcepto1, String idConcepto2, String idSitCaptura, String mcpRfc);
    
    @FindByCondition( value=TnMovtoConceptoPago.class, condition="TRIM(ID_TIPO_CPTO) = ? AND TRIM(ID_CONCEPTO) IN (?, ?) AND ID_SIT_CAPTURA IN (?,?)  AND MCP_RFC = ? AND MCP_QNA_CAPTURA BETWEEN ? AND ? ")
    List<TnMovtoConceptoPago> findByIdTipoCptoMcpRfcQnaCaptura(String idTipoCpto, String idConcepto1, String idConcepto2, String idSitCaptura1, String idSitCaptura2, String mcpRfc, Integer mcpQnaCapturaInicial, Integer mcpQnaCapturaFinal);

    @FindByNamedQuery(name="consultaPadronFonac", value=TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> getNumRegistrosPadronFonac();
    
    @FindByNamedQuery(name="consultaRegsAfectadosPadronFonac", value=TnMovtoConceptoPago.class)
    List<TnMovtoConceptoPago> getNumRegistrosAfectadosPadronFonac();
    
}
