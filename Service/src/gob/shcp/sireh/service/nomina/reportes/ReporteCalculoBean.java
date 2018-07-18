package gob.shcp.sireh.service.nomina.reportes;

import gob.shcp.fsn.service.AbstractBean;

import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "ReporteCalculo")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ReporteCalculoBean extends AbstractBean implements ReporteCalculoService {

    public Integer getHistoricoMaxPag(String rfcEmpleado, String qnaIni, String qnaFin) {
        return super.getService(ReporteCalculoService.class).getHistoricoMaxPag(rfcEmpleado, qnaIni, qnaFin);
    }

    /**
     * Servicio para la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param consecNomina, tipoarchivo
     * @return Lista con datos
     */
    public List<Map<Integer, Object>> getHistoricoRevision(Integer consecNomina, String tipoarchivo) {
        return super.getService(ReporteCalculoService.class).getHistoricoRevision(consecNomina, tipoarchivo);
    }

    /**
     * Servicio para la generacion de archivos con informacion acumulada por rfc y periodo
     * @author Roberto Muñoz
     * @param consecNomina, tipoarchivo
     * @return Lista con datos
     */
    public List<Map<Integer, Object>> getHistoricoAcumulado(Integer qnaini, Integer qnafin, String rfc, String rfcb, String estatus, String tipopro) {
        return super.getService(ReporteCalculoService.class).getHistoricoAcumulado(qnaini, qnafin, rfc, rfcb, estatus, tipopro);
    }

}
