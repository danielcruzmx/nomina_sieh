package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.spc.TcCapCursoPrincp;

import java.util.List;

public interface QueryTcCapCursoPrincpDAO extends TcCapCursoPrincpDAO {

    @FindByNamedQuery(name = "getCursoPrincpByClave-TcCapCursoPrincp", value = TcCapCursoPrincp.class)
    public List<TcCapCursoPrincp> getCursoPrincpByClave(String cursoClave);

}
