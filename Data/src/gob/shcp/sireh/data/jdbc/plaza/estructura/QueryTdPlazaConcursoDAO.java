package gob.shcp.sireh.data.jdbc.plaza.estructura;

import gob.shcp.fsn.data.annotation.FindByCondition;
import gob.shcp.sireh.domain.jdbc.CustomExpediente;

import gob.shcp.sireh.domain.jdbc.plaza.estructura.TdPlazaConcurso;

import java.util.List;

public interface QueryTdPlazaConcursoDAO extends TdPlazaConcursoDAO{

    /**
     * Find the first TdPlazaConcurso entity that matches the condition 'where idPlaza is equals to'.
     *
     * @param idPlaza java.lang.Integer
     * @return TdPlazaConcurso
     */
    @FindByCondition(value=TdPlazaConcurso.class, condition="ID_PLAZA=?")
    TdPlazaConcurso getByIdPlaza(java.lang.Integer idPlaza);

}
