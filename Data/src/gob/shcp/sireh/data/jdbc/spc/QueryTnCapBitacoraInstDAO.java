package gob.shcp.sireh.data.jdbc.spc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.spc.TnCapBitacoraInst;

import java.util.Date;
import java.util.List;

public interface QueryTnCapBitacoraInstDAO extends TnCapBitacoraInstDAO {

    @FindByNamedQuery(name="sequence-TnCapBitacoraInstr", value = TnCapBitacoraInst.class)
    public List<TnCapBitacoraInst> getSequenceTnCapBitacoraInstructor();
    
    @FindByNamedQuery(name="TnCapBitacoraInstr-getDesasignado", value = TnCapBitacoraInst.class)
    public List<TnCapBitacoraInst> getDesasignado(Integer idCurso);
        
}
