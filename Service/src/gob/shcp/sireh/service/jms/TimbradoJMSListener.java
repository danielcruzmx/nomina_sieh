package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.access.AbstractLocator;

import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

public class TimbradoJMSListener extends AbstractLocator implements MessageListener {

    /**
     * Listener encargado de interceptar mensajes para ejecutar los procesos de timbrado.
     * @author Gualberto G.
     * @param message Message
     */
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            final ObjectMessage m = (ObjectMessage)message;

            try {
                if (m.getObject() instanceof Object[]) {
                    Object[] objetoRecibido = (Object[])m.getObject();
                    if (objetoRecibido != null && objetoRecibido.length == 3 && objetoRecibido[0].equals("postProcesoEnviarComprobantes")) {
                        super.getService(TimbradoJMSService.class).postProcesoSendComprobantesCFDI((Integer)objetoRecibido[1], (String)objetoRecibido[2]); 
                    }
                }
                if (m.getObject() instanceof Object[]) {
                    Object[] objetoRecibido = (Object[])m.getObject();
                    if (objetoRecibido != null && objetoRecibido.length == 4 && objetoRecibido[0].equals("postProcesoGenerarCadenas")) {
                        super.getService(TimbradoJMSService.class).postProcesoGenerarCadenas((String)objetoRecibido[1], (Integer)objetoRecibido[2], (String) objetoRecibido[3]); 
                    }
                }
                if (m.getObject() instanceof Object[]) {
                    Object[] objetoRecibido = (Object[])m.getObject();
                    if (objetoRecibido != null && objetoRecibido.length == 4 && objetoRecibido[0].equals("postProcesoIntegrarXmlFirma")) {
                        super.getService(TimbradoJMSService.class).postProcesoIntegrarXmlFirma((String)objetoRecibido[1], (Integer)objetoRecibido[2], (String) objetoRecibido[3]); 
                    }
                }
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }
        
        
    }
}
