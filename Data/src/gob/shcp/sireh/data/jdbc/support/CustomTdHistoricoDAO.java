package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import java.util.List;
import java.util.Map;

public interface CustomTdHistoricoDAO extends DataService {

    public void updateMeritoActualizaRfcHistorico(String td_nmh_rfc_unico, String rfc_unico);

    public void updateMeritoActualizaRfcProcesoNmHistorico(String td_nmh_rfc_unico, String rfc_unico);

    public Integer getHistoricoMaxPag(String rfcEmpleado, String qnaIni, String qnaFin);
    
    public String constanciasF(String rfc);
    
    /**
     * Metodo encargado de obtener las prestaciones trimestrales por grupo de pago
     * @author Armando Zuñiga.
     * @param qnaIni Integer
     * @param qnaFin Integer
     * @param grupoPago String
     * @param tipo String
     * @return List<Map<Integer, Object>>
     */
    public List<Map<Integer, Object>> generaPrestTrimByGpoPago(Integer qnaIni, Integer qnaFin, String grupoPago, String tipo);
}
