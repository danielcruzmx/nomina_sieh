package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.BusinessService;
import javax.ejb.Local;
@Local
public interface TimbradoJMSService extends BusinessService{
    
    void sendComprobantesCFDI(int idNomina, String rootPathAplication);
    void postProcesoSendComprobantesCFDI(int idNomina, String rootPathAplication);
    
    void sendGenerarCadenas(String rootPathAplication, int idNomina, String usuario);
    void postProcesoGenerarCadenas(String rootPathAplication, int idNomina, String usuario);
    
    void sendIntegrarXmlFirma(String rootPathAplication, int idNomina, String usuario);
    void postProcesoIntegrarXmlFirma(String rootPathAplication, int idNomina, String usuario);
    
}
