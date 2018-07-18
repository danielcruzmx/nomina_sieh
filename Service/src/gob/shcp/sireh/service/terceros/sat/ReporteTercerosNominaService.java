package gob.shcp.sireh.service.terceros.sat;

import gob.shcp.fsn.service.BusinessService;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ReporteTercerosNominaService extends BusinessService {
    
    /**
     * Obtiene los complementos del historico de pago por unidad
     * @author Martin C.
     * @param unidades String
     * @return String
     */
    public List<String> getTiposNominaHistPagoByUnidad(List<String> unidades);
    public List<String> getQnasPagoFromHistoricoPago(Integer qnaEnd);
    public List<String> getComplementosByUnidadQnaPago(List<String> unidades, List<String> qnas, List<String> nominas);
    
}
