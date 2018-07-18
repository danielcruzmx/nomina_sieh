package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TdPension;

import java.util.List;

public interface QueryTdPensionDAO extends TdPensionDAO {

    @FindByNamedQuery(name="maxPension", value = TdPension.class)
    List<TdPension> getMaxPension(String pension_rfc);
    
}
