package gob.shcp.sireh.service.anuncio;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TnAnuncioDTO;

import javax.ejb.Local;

@Local
public interface AnuncioService extends BusinessService {
    
    public TnAnuncioDTO getAnuncio();
}
