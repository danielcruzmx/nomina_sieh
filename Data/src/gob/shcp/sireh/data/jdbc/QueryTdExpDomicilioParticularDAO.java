package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TcCodigoPostal;
import gob.shcp.sireh.domain.jdbc.TcMunicipio;
import gob.shcp.sireh.domain.jdbc.TdExpDomicilioParticular;
import gob.shcp.sireh.domain.jdbc.TotalRegistrosExpediente;

import java.util.List;

public interface QueryTdExpDomicilioParticularDAO extends TdExpDomicilioParticularDAO {
    
    @FindByNamedQuery(name="sequence-altaDomicilio", value = TdExpDomicilioParticular.class)
    List<TdExpDomicilioParticular> getSequenceAltaDomicilio();
    
    @FindByNamedQuery(name="totalRegistrados-altaDomicilio", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRegistradosExpedienteDomicilio(String rfcEmpleado);
    
    @FindByNamedQuery(name="totalRechazados-altaDomicilio", value = TotalRegistrosExpediente.class)
    List<TotalRegistrosExpediente> getTotalRechazadosExpedienteDomicilio(String rfcEmpleado);
    
    @FindByNamedQuery(name="getMuicipiosByEstado-altaDomicilio", value = TcMunicipio.class)
    List<TcMunicipio> getMunicipiosByEntidadFederativa(Integer entidadFederativa);
    
    @FindByNamedQuery(name="getCpsByEstadoAndMunicipio-altaDomicilio", value = TcCodigoPostal.class)
    List<TcCodigoPostal> getCpsByEntidadFederativaAndMunicipios(Integer entidadFederativa, Integer municipio);
    
    @FindByNamedQuery(name="getColoniasByCodigoPostal-altaDomicilio", value = TcCodigoPostal.class)
    List<TcCodigoPostal> getColoniasByCodigoPostal(String codigoPostal);
}
