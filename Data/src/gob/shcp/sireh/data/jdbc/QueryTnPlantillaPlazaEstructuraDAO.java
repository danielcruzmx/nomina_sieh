package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTnPlantillaPlazaEstructura;

import java.util.List;

public interface QueryTnPlantillaPlazaEstructuraDAO extends TnPlantillaPlazaEstructuraDAO {

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructura", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructura(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraVsPlaza", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByselectTnPlantillaPlazaEstructuraVsPlaza(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraVsUnidad", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructuraVsUnidad(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraVsPuesto", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructuraVsPuesto(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraVsEstado", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructuraVsEstado(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaAmpliaVsPlazaConversion", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaAmpliaVsPlazaConversion(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaAmpliaVsPlazaReubicacion", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaAmpliaVsPlazaReubicacion(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsPlaza", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsPlaza(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraConversionVsTipoMov", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructuraConversionVsTipoMov(String ppeTipo, String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaAmpliaVsGrupoPago", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaAmpliaVsGrupoPago( String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsGrupoPago", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsGrupoPago(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsUnidad", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsUnidad(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsPuesto", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsPuesto(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsZonaEco", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsZonaEco(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsEntidadFed", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsEntidadFed(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaAmpliaVsZona", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaAmpliaVsZona(String ppeTipo, String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsZonaCat", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsZonaCat(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsTipoMov", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsTipoMov(String ppeTipo, String usuario );

    @FindByNamedQuery(name="selectTnPlantillaCancelados", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaCancelados( String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaVsOficioAfectacion", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsOficioAfectacion(String ppeCiclo, Integer ciclo, String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaVsProyRegulariza", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsProyRegulariza(String ppeCiclo, Integer ciclo, String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaAmpliaVsPlazaAfectacion", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaAmpliaVsPlazaAfectacion(Integer ciclo, Integer operacion, String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaEstructuraVsPuestoVsPlaza", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaEstructuraVsPuestoVsPlaza(String usuario );

    @FindByNamedQuery(name="selectTnPlantillaPlazaVsTipoServPub", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsTipoServPub(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsTipoPlaza", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsTipoPlaza(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsInmueble", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsInmueble(String usuario);
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsFechaInicioVigencia", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsFechaInicioVigencia(String ppeTipo, Integer diasRetroactividad, String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsFechaFinVigencia", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsFechaFinVigencia(String ppeTipo, String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaVsGrupoPago", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaVsGrupoPago(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaPlazaReduceVsOcupados", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaPlazaReduceVsOcupados(String usuario );
    
    @FindByNamedQuery(name="selectTnPlantillaCreados", value = CustomTnPlantillaPlazaEstructura.class)
    List<CustomTnPlantillaPlazaEstructura> findByTnPlantillaCreados(String usuario );
    
}
