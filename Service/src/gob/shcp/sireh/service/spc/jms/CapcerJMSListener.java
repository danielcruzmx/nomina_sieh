package gob.shcp.sireh.service.spc.jms;

import gob.shcp.fsn.service.access.AbstractLocator;

import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

public class CapcerJMSListener extends AbstractLocator implements MessageListener {

    /**
     * Listener encargado de interceptar el mensajes para el envio de mensajes de notificacion por correo electronico.
     * @author Gualberto G.
     * @param message Message
     */
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            final ObjectMessage m = (ObjectMessage)message;
            try {
                if (m.getObject() instanceof Object[]) {
                    Object[] objetoRecibido = (Object[])m.getObject();
                    
                    if (objetoRecibido != null && objetoRecibido.length == 7 && objetoRecibido[0].equals("postProcesoSendMessages")) {
                        super.getService(CapcerJMSService.class).postProcesoSendMessages((Integer)objetoRecibido[1], 
                                                                                         (Integer)objetoRecibido[2], 
                                                                                         (Integer)objetoRecibido[3], 
                                                                                         (List<Map<String, Object>>)objetoRecibido[4], (String)objetoRecibido[5], (String)objetoRecibido[6]);
                    }
                }
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
