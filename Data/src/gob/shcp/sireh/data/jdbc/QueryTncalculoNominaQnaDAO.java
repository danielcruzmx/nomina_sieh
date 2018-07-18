package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.sireh.domain.jdbc.TnCalculoNominaQna;

import java.util.List;

public interface QueryTncalculoNominaQnaDAO extends TnCalculoNominaQnaDAO {

    @FindByCondition(value = TnCalculoNominaQna.class, condition = "ID_NOMINA=?")
    List<TnCalculoNominaQna> findByidNomina(java.lang.Integer idNomina);
}
