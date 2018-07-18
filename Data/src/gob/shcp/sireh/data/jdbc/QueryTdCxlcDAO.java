package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.TdCxlc;

import java.util.List;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public interface QueryTdCxlcDAO extends TdCxlcDAO {

    @FindByNamedQuery(name="cxlcComprometidas", value = TdCxlc.class)
    List<TdCxlc> getCxlcComprometidas(Integer cxlcCiclo, SqlParameterSource namedParameters);
    
    @FindByNamedQuery(name="cxlcComprometidasList", value = TdCxlc.class)
    List<TdCxlc> getCxlcComprometidasList(Integer cxlcCiclo, List<Integer> cxlcCompromiso);
    
    @FindByNamedQuery(name="maxCxlcCompromiso", value = TdCxlc.class)
    List<TdCxlc> getMaxCxlcCompromiso(Integer cxlcCiclo);
    
    @FindByNamedQuery(name="maxCxlcDevengado", value = TdCxlc.class)
    List<TdCxlc> getMaxCxlcDevengado(Integer cxlcCiclo);
}
