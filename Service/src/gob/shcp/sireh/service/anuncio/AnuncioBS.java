package gob.shcp.sireh.service.anuncio;

import gob.shcp.sireh.data.jdbc.anuncio.QueryTnAnuncioDAO;

import gob.shcp.sireh.domain.jdbc.TnAnuncio;

import gob.shcp.sireh.model.TnAnuncioDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.anuncio.AnuncioService;

import java.util.List;

/**
 * Business Service encargado de obtener el anuncio actual
 */
public class AnuncioBS extends AbstractSirehService implements AnuncioService {

    public TnAnuncioDTO getAnuncio() {
        // Obtener anuncio        
        List<TnAnuncio> listaTnAnuncio = super.persistence().get(QueryTnAnuncioDAO.class).getAnuncio();
        TnAnuncioDTO tnAnuncioDTO = null;
        logger.debug("AnuncioBS -> tnAnuncioDTO.listaTnAnuncio.size() -> " + listaTnAnuncio.size());
        
        if (listaTnAnuncio != null && !listaTnAnuncio.isEmpty()) {
            TnAnuncio tnAnuncio = listaTnAnuncio.get(0);
            tnAnuncioDTO = super.transformation().map(tnAnuncio, TnAnuncioDTO.class);
        }
        return tnAnuncioDTO;
    }
}
