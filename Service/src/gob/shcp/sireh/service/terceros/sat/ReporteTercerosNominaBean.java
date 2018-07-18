package gob.shcp.sireh.service.terceros.sat;

import gob.shcp.fsn.service.AbstractBean;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "ReporteTercerosNomina")
@Local( { ReporteTercerosNominaService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ReporteTercerosNominaBean extends AbstractBean implements ReporteTercerosNominaService {
    /**
     * Obtiene los complementos del historico de pago por unidad
     * @author Martin C.
     * @param unidades String
     * @return String
     */
    public List<String> getTiposNominaHistPagoByUnidad(List<String> unidades){
        return super.getService(ReporteTercerosNominaService.class).getTiposNominaHistPagoByUnidad(unidades);
    }
    
    public List<String> getQnasPagoFromHistoricoPago(Integer qnaEnd){
        return super.getService(ReporteTercerosNominaService.class).getQnasPagoFromHistoricoPago(qnaEnd);
    }
    
    public List<String> getComplementosByUnidadQnaPago(List<String> unidades, List<String> qnas, List<String> nominas){
        return super.getService(ReporteTercerosNominaService.class).getComplementosByUnidadQnaPago(unidades, qnas, nominas);
    }
}
