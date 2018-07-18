package gob.shcp.sireh.data.jdbc.rusp;

import gob.shcp.fsn.data.annotation.FindByCondition;

import gob.shcp.sireh.domain.jdbc.rusp.TdRuspHijo;

import java.util.List;

public interface QueryTdRuspHijoDAO extends TdRuspHijoDAO {

    @FindByCondition(value=TdRuspHijo.class, condition="TRH_RFC=?")
    List<TdRuspHijo> findByTrhRfc(java.lang.String trhRfc);

    }
