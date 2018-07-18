package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.configuracion.movimientos.ConceptoPagoDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="ConceptoPago")
@Local({ConceptoPagoService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ConceptoPagoServiceBean 
    extends AbstractBean
    implements ConceptoPagoService {

    public ConceptoPagoDTO getConceptoPago(String idTipoCpto, String idCptoPago ) {
        return super.getService(ConceptoPagoService.class)
            .getConceptoPago(idTipoCpto,idCptoPago);
    }

}

