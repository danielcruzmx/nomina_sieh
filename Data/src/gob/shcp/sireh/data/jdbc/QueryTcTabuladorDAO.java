package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.TcTabulador;


import java.util.Date;
import java.util.List;

public interface QueryTcTabuladorDAO extends TcTabuladorDAO{
    @FindByNamedQuery(name="tabuladorByNivelRango", value=TcTabulador.class)
    List<TcTabulador> findByNivelRango(Date apFin1, String idAtributoPuesto1, Date apFin2, String idAtributoPuesto2, Date apFin3, Integer idZonaEconNom, Integer idRangoNom);
}
