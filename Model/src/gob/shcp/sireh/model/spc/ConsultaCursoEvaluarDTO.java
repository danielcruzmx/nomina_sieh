package gob.shcp.sireh.model.spc;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class ConsultaCursoEvaluarDTO extends ConsultaCursoDTO implements Serializable, Model {
    private boolean filtroCoordinacionAdministrativa;


    public void setFiltroCoordinacionAdministrativa(boolean filtroCoordinacionAdministrativa) {
        this.filtroCoordinacionAdministrativa = filtroCoordinacionAdministrativa;
    }

    public boolean isFiltroCoordinacionAdministrativa() {
        return filtroCoordinacionAdministrativa;
    }
}
