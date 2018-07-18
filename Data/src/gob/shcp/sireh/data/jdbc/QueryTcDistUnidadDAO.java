package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TcDistUnidad;

import java.util.List;

public interface QueryTcDistUnidadDAO extends TcDistUnidadDAO{

    @FindByNamedQuery(name="idDistUnidadesByRfc", value=TcDistUnidad.class)
    List<TcDistUnidad> getIdDistUnidadByRfc(String plaza_rfc);
}
