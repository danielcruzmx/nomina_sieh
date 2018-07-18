package gob.shcp.sireh.data.jdbc;


import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;

import java.util.List;

public interface QueryTcAtributoPuestoDAO  extends TcAtributoPuestoDAO{

    @FindByNamedQuery(name="atributoPuesto", value=TcAtributoPuesto.class)
    List<TcAtributoPuesto> findAtributoPuesto(String id_atributo_puesto, String ap_fin);
    
    @FindByNamedQuery(name="selectAtributoPuestoPlazaEstructuraCreacion",  value=CustomTcAtributoPuesto.class)
      List<CustomTcAtributoPuesto> findAtributoPuestoPlazaEstructuraCreacion(String idAtributoPuesto);
}
