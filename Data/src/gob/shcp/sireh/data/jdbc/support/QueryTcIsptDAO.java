package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.data.jdbc.TcIsptDAO;

import gob.shcp.sireh.domain.jdbc.TcIspt;

import java.util.List;

public interface QueryTcIsptDAO extends TcIsptDAO{
    @FindByNamedQuery(name="tcIsptByTipo", value=TcIspt.class)
    List<TcIspt> getCatalogoByTipo(String tipo);
}