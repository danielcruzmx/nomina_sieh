package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTdNmResumen;
import gob.shcp.sireh.domain.jdbc.TdNmResumen;

import java.util.List;

public interface QueryTdNmResumenDAO extends TdNmResumenDAO{
   
    @FindByNamedQuery(name="maxRemesaInternaPagoMerito", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> findMaxRemesaInternaPagoMerito(Integer td_nmr_ciclo_pago);
    
    @FindByNamedQuery(name="selectRemesaInternaPagoMerito", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> selectRemesaInternaPagoMerito(Integer td_nmh_ciclo, Integer td_nmr_cve_causal, String td_nmh_op,  Integer td_nmh_ciclo_final,  Integer td_nmh_ciclo_inicial, String td_nmr_remesa_interna);
    
    @FindByNamedQuery(name="selectRemesaInternaPagoMeritoRechazos", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> selectRemesaInternaPagoMeritoRechazos(
    Integer ciclo, Integer causal, String op, Integer ciclo2, Integer causal2, String op2);
    
    @FindByNamedQuery(name="selectRemesaInternaPagoMeritoAnosConsecutivos", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> selectRemesaInternaPagoMeritoConsecutivos(Integer td_nmh_ciclo, Integer td_nmr_cve_causal, String td_nmh_op,  Integer td_nmh_ciclo_final,  Integer td_nmh_ciclo_inicial, String td_nmr_remesa_interna);
    
    @FindByNamedQuery(name="selectMeritoActualizaRfcContraResumen", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> selectMeritoActualizaRfcContraResumen();
    
    @FindByNamedQuery(name="selectMeritoActualizaRfcProcesoNmResumen", value=CustomTdNmResumen.class)
    List<CustomTdNmResumen> selectMeritoActualizaRfcProcesoNmResumen();
    
    
    
    
}
