package gob.shcp.sireh.data.jdbc.servicios;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;


import gob.shcp.sireh.domain.jdbc.servicios.TdBitacoraUpdateTabla;

import java.util.List;

public interface QueryTdBitacoraUpdateTablaDAO extends TdBitacoraUpdateTablaDAO {
    
    @FindByNamedQuery(name="sequence-bitacoraTabla", value = TdBitacoraUpdateTabla.class)
    List<TdBitacoraUpdateTabla> getSequenceTdBitacoraTabla();
    
}
