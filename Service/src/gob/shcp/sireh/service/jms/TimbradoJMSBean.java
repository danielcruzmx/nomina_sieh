package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.AbstractBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name = "TimbradoJMS")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class TimbradoJMSBean extends AbstractBean implements TimbradoJMSService{

    public void sendComprobantesCFDI(int idNomina, String rootPathAplication) {
        super.getService(TimbradoJMSService.class).sendComprobantesCFDI(idNomina, rootPathAplication);
    }

    public void postProcesoSendComprobantesCFDI(int idNomina, String rootPathAplication) {
        super.getService(TimbradoJMSService.class).postProcesoSendComprobantesCFDI(idNomina, rootPathAplication);
    }
    
    
    public void sendGenerarCadenas(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoJMSService.class).sendGenerarCadenas(rootPathAplication, idNomina, usuario);
    }
    public void postProcesoGenerarCadenas(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoJMSService.class).postProcesoGenerarCadenas(rootPathAplication, idNomina, usuario);
    }
    
    public void sendIntegrarXmlFirma(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoJMSService.class).sendIntegrarXmlFirma(rootPathAplication, idNomina, usuario);
    }
    public void postProcesoIntegrarXmlFirma(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoJMSService.class).postProcesoIntegrarXmlFirma(rootPathAplication, idNomina, usuario);
    }
}
