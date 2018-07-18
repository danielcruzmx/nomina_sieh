package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.Item;


import java.util.List;

public interface QueryTcPuestoVacanciaDAO extends TcPuestoVacanciaDAO{

    @FindByNamedQuery(name="consulta-tcpuestovacancia-excepcion", value=Item.class)
    List<Item> findByIdOrigenPtoException(String idPtoOrigen, Integer ptoExcepcion);
    
    
    @FindByNamedQuery(name="consulta-tcpuestovacancia-administrar", value=Item.class)
    List<Item> findAllPuestos();
}
