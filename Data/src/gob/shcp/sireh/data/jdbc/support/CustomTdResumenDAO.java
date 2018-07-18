package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

public interface CustomTdResumenDAO extends DataService {

    public void updateRemesaInternaPagoMerito(String td_nmr_remesa_interna, Integer td_nmr_ciclo_pago, String td_nmr_op, Integer td_nmr_cve_causal, Integer td_nmr_ciclo_final, Integer td_nmr_ciclo_inicial);

    public int updateProcesoNm(Integer td_nmr_ciclo_pago, String td_nmr_op, Integer td_nmr_cve_causal, String usuario);

    public void updateMeritoActualizaRfcResumen(String td_nmr_rfc_actualizar, String td_nmr_rfc);

    public void updateMeritoActualizaRfcProcesoNmResumen(String td_nmr_rfc_actualizar, String td_nmr_rfc);
}
