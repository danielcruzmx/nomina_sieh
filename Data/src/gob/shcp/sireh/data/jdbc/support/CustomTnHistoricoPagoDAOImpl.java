package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.CustomTnHistPago;

import java.util.List;

public class CustomTnHistoricoPagoDAOImpl extends JdbcDAO implements CustomTnHistoricoPagoDAO {
    
    public CustomTnHistPago findById(gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK tnHistoricoPagoIdPk){
        
        try {
            CustomTnHistPago pago = super.findByNamedQuery(CustomTnHistPago.class, "selectEmplHistCancelaPagosById", new Object[] {tnHistoricoPagoIdPk.getHpFolio(),tnHistoricoPagoIdPk.getHpDifFolio()}).get(0);
            if(pago.getHpNetoPago() != null){
                pago.setIdSitPago("T");
                pago.setHpFolio(tnHistoricoPagoIdPk.getHpFolio());
                pago.setHpDifFolio(tnHistoricoPagoIdPk.getHpDifFolio());
                return pago;
            } else return null;
        }
        catch (Exception e) {   e.printStackTrace();  return null;   }
    }
    
    public void corrigeEmpleadoCancelaPagoById(Long idFolio, Integer clvDifFolio, Integer idMotivoCanc, String referencia, Integer qnaAplica,Integer qnaPago, String atentaNota, Long cpcNumCxlc, String usuario) {
         super.executeByNamedQuery("updateEmplHistCancelaPagoById", idFolio, clvDifFolio);
         super.executeByNamedQuery("insertEmplSitPagoCancelaPago", idFolio, clvDifFolio, idMotivoCanc, referencia, qnaAplica, qnaPago, atentaNota, cpcNumCxlc, usuario);        
    }
    
    public CustomTnHistPago findEmplBloqueoDeposById(gob.shcp.sireh.domain.jdbc.TnHistoricoPagoPK tnHistoricoPagoIdPk){
        List<CustomTnHistPago> obj = super.findByNamedQuery(CustomTnHistPago.class, "selectEmplHistBloqPago", new Object[] {tnHistoricoPagoIdPk.getHpFolio(), tnHistoricoPagoIdPk.getHpDifFolio() });
        if( obj == null || obj.size() == 0 ) {
            return null;
        }
        CustomTnHistPago pago = obj.get(0);
        if (pago.getHpNetoPago() != null) {
            pago.setIdSitPago("T");
            pago.setHpFolio(tnHistoricoPagoIdPk.getHpFolio());
            pago.setHpDifFolio(tnHistoricoPagoIdPk.getHpDifFolio());
            return pago;
        } else return null;
    }
    
    public void corrigeEmpleadoBloqueoDepositoById(Long idFolio, Integer clvDifFolio, String hpClabe, String hpDepositoSN) {
        super.executeByNamedQuery("updateEmplHistPagoBloqueDeptoById", hpDepositoSN, hpClabe, idFolio, clvDifFolio);
    }
}
