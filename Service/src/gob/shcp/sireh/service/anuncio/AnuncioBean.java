package gob.shcp.sireh.service.anuncio;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.TnAnuncioDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de obtener el anuncio actual
 */
@Stateless(name = "Anuncio")
@Local( { AnuncioService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class AnuncioBean extends AbstractBean implements AnuncioService  {

    public TnAnuncioDTO getAnuncio() {
        return super.getService(AnuncioService.class).getAnuncio();
    }
}
