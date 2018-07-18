package gob.shcp.sireh.data.jdbc.anuncio;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.data.jdbc.TnAnuncioDAO;

import gob.shcp.sireh.domain.jdbc.TnAnuncio;

import java.util.List;

public interface QueryTnAnuncioDAO extends TnAnuncioDAO {
    
    @FindByNamedQuery(name="TnAnuncio-getAnuncio", value = TnAnuncio.class)
    public List<TnAnuncio> getAnuncio();
}
