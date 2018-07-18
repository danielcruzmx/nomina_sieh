package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;
import gob.shcp.sireh.domain.jdbc.TcConceptoPago;

import java.util.List;

public interface CustomConceptoPagoDAO extends DataService{

    public List<TcConceptoPago> getConceptosPago();
    
    public Long getSnVersion();

}
