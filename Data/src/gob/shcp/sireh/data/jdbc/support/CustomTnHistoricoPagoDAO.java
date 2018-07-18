package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.CustomTnHistPago;

public interface CustomTnHistoricoPagoDAO extends DataService {

    public CustomTnHistPago findById(gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK id);
 
    public void corrigeEmpleadoCancelaPagoById(Long idFolio, Integer clvDifFolio, Integer idMotivoCanc, String referencia, Integer qnaAplica,Integer qnaPago, String atentaNota, Long cpcNumCxlc, String usuario);
    
    public CustomTnHistPago findEmplBloqueoDeposById(gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK id);
    
    public void corrigeEmpleadoBloqueoDepositoById(Long idFolio, Integer hpDifFolio, String hpClabe, String hpDepositoSN);
}