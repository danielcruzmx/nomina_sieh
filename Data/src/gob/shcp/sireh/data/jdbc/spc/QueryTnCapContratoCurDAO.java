package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.spc.CustomAltaContrato;
import gob.shcp.sireh.domain.jdbc.spc.TnCapContratoCur;

import java.util.List;

public interface QueryTnCapContratoCurDAO extends TnCapContratoCurDAO {
    
    @FindByNamedQuery(name="sequence-TnCapContratoCurso", value = TnCapContratoCur.class)
    public List<TnCapContratoCur> getSequenceTnCapContratoCurso();
    
    @FindByNamedQuery(name="getContrato-TnCapContratoCurso", value = TnCapContratoCur.class)
    public List<TnCapContratoCur> getContrato(Integer idContrato);
    
    @FindByNamedQuery(name="getContratoCustom-TnCapContratoCurso", value = CustomAltaContrato.class)
    public List<CustomAltaContrato> getContratoCustom(Integer idContrato);
    
    @FindByNamedQuery(name="getContratoCursoNumero-TnCapContratoCurso", value = TnCapContratoCur.class)
    public List<TnCapContratoCur> getContratoCursoNumero(String numeroContrato, Integer ciclo);
    
}
