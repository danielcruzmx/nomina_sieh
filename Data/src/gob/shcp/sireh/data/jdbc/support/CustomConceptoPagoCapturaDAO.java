package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCaptura;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCapturaPK;

public interface CustomConceptoPagoCapturaDAO extends DataService{

    public TcConceptoPagoCaptura getConceptoPago( TcConceptoPagoCapturaPK pk );
    public void save( TcConceptoPagoCaptura conceptoPago );
    public void update( TcConceptoPagoCaptura conceptoPago );
    
    public void betarInstructor(Integer idInstructor, String idProveedor);
}
