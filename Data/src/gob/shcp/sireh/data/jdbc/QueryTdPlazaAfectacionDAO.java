package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTdPlazaAfectacion;
import gob.shcp.sireh.domain.jdbc.TdPension;

import java.util.List;

public interface QueryTdPlazaAfectacionDAO extends TdPlazaAfectacionDAO {


    
    @FindByNamedQuery(name="selectTdPlazaAfectacion", value = CustomTdPlazaAfectacion.class)
    List<CustomTdPlazaAfectacion> findByTdPlazaAfectacion(String usuario );
   
    @FindByNamedQuery(name="selectTdPlazaAfectacionVsPlaza", value = CustomTdPlazaAfectacion.class)
    List<CustomTdPlazaAfectacion> findByTdPlazaAfectacionVsPlaza(String usuario );
    
    @FindByNamedQuery(name="selectTdPlazaAfectacionVsUnidad", value = CustomTdPlazaAfectacion.class)
    List<CustomTdPlazaAfectacion> findByTdPlazaAfectacionVsUnidad(String usuario );
    
    @FindByNamedQuery(name="selectTdPlazaAfectacionVsPuesto", value = CustomTdPlazaAfectacion.class)
    List<CustomTdPlazaAfectacion> findByTdPlazaAfectacionVsPuesto(String usuario );
    
    @FindByNamedQuery(name="selectTdPlazaAfectacionVsEstado", value = CustomTdPlazaAfectacion.class)
    List<CustomTdPlazaAfectacion> findByTdPlazaAfectacionVsEstado(String usuario );
    
  

}
