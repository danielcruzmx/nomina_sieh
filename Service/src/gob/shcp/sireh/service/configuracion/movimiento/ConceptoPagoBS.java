package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.TcConceptoPagoDAO;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoPK;
import gob.shcp.sireh.model.configuracion.movimientos.ConceptoPagoDTO;

import gob.shcp.sireh.model.configuracion.movimientos.MovimientoPersonalDTO;



public class ConceptoPagoBS
    extends AbstractService
    implements ConceptoPagoService {

    public ConceptoPagoDTO getConceptoPago(String idTipoCpto, String idCptoPago ) {
        TcConceptoPagoPK pk = new TcConceptoPagoPK(idCptoPago,idTipoCpto);
        TcConceptoPagoDAO dao = super.persistence().get(TcConceptoPagoDAO.class);
        TcConceptoPago tcCptoPago =  dao.getById(pk);
        final ConceptoPagoDTO conceptoPagoDTO = super.transformation().map(tcCptoPago,ConceptoPagoDTO.class );
        return conceptoPagoDTO;
    }
    
}
