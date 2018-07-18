package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TcBanco;
import gob.shcp.sireh.domain.jdbc.TdExpAvisoAccidente;

import java.util.List;

public interface QueryTdExpAvisoAccidenteDAO extends TdExpAvisoAccidenteDAO  {

    @FindByNamedQuery(name="sequence-altaAvisoAccidente", value = TdExpAvisoAccidente.class)
    List<TdExpAvisoAccidente> getSequenceAltaAvisoAccidente();
    
    @FindByNamedQuery(name = "aviso-Accidente", value = TdExpAvisoAccidente.class)
    List<TdExpAvisoAccidente> getAvisoAccidente(String rfc);
    
}
