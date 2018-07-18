package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.support.CustomHistoricoRevisionDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdHistoricoDAO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.util.List;
import java.util.Map;

public class ReporteCalculoBS extends AbstractSirehService implements ReporteCalculoService {
    
    public Integer getHistoricoMaxPag(String rfcEmpleado, String qnaIni, String qnaFin) {
        return super.persistence().get(CustomTdHistoricoDAO.class).getHistoricoMaxPag(rfcEmpleado, qnaIni, qnaFin);
    }

    /**
     * Servicio para la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param consecNomina, String tipoarchivo
     * @return Lista con datos
     */
    public List<Map<Integer, Object>> getHistoricoRevision(Integer consecNomina, String tipoarchivo) {
        try {
            return super.persistence().get(CustomHistoricoRevisionDAO.class).getSelectHistoricoRevisionOP1(consecNomina, tipoarchivo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("No se encuentra información con los parámetros proporcionados. Revise e intente de nuevo.");
        }
    }

    /**
     * Servicio para la generacion de archivos con informacion acumulada de rfc periodo
     * @author Roberto Muñoz
     * @param qnaini, Integer qnafin, String rfc, String estatus, String tipopro
     * @return Lista con datos
     */
    public List<Map<Integer, Object>> getHistoricoAcumulado(Integer qnaini, Integer qnafin, String rfc, String rfcb,String estatus, String tipopro) {
        try {
            return super.persistence().get(CustomHistoricoRevisionDAO.class).getSelectHistoricoAcumuladoOP1(qnaini, qnafin, rfc, rfcb, estatus, tipopro);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("No se encuentra información con los parámetros proporcionados. Revise e intente de nuevo.");
        }
    }

}


