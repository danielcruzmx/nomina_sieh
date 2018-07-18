package gob.shcp.sireh.service.spc.jms;

import gob.shcp.sireh.data.jdbc.spc.TnCapCursoDAO;

import gob.shcp.sireh.domain.jdbc.spc.TnCapCurso;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.spc.capcer.registro.RegistroCursoSPCService;

import java.util.List;
import java.util.Map;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class CapcerJMSBS extends AbstractSirehService implements CapcerJMSService {

    private JmsTemplate jmsTemplate;
    private Queue destination;

    public void setConnectionFactory(ConnectionFactory cf) {
        this.jmsTemplate = new JmsTemplate(cf);
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setDestination(Queue queue) {
        this.destination = queue;
    }

    public Queue getDestination() {
        return destination;
    }
    
    /**
     * Metodo JMS llamado por el controlador encargado de llamar el proceso de envio de correos de manera asincrona
     * @author Gualberto G.
     * @param operationalYear Integer
     * @param idCurso Integer
     * @param idModalidad Integer
     * @param listaMapas List&lt;Map&lt;String, Object&gt;&gt;
     * @param async boolean
     */
    public void sendMessages(final Integer operationalYear, final Integer idCurso, final Integer idModalidad, final List<Map<String, Object>> listaMapas, final String rfcSesion, final String usuario, final boolean async) {
        final String accion = "postProcesoSendMessages";
        final Object[] objetoAEnviar = new Object[] { accion, operationalYear, idCurso, idModalidad, listaMapas, rfcSesion, usuario };

        if (async) {
            getJmsTemplate().send(getDestination(), new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            logger.debug("\n\n--> Sending object: " + accion + "-" + operationalYear + " - " + idCurso + " - " + idModalidad + " - " + listaMapas + " - " + rfcSesion + " - " + usuario);
                            return session.createObjectMessage(objetoAEnviar);
                        }
                    });
        } else {
            postProcesoSendMessages(operationalYear, idCurso, idModalidad, listaMapas, rfcSesion, usuario);
        }
    }

    /**
     * Metodo que es llamado por la cola JMS encargado de invocar al servicio de envio de correos electronicos
     * @author Gualberto G
     * @param operationalYear Integer
     * @param idCurso Integer
     * @param idModalidad Integer
     * @param listaMapas List&lt;Map&lt;String, Object&gt;&gt;
     */
    public void postProcesoSendMessages(Integer operationalYear, Integer idCurso, Integer idModalidad, List<Map<String, Object>> listaMapas, String rfcSesion, String usuario) {
        super.getService(RegistroCursoSPCService.class).enviarMensajesCorreo(operationalYear, idCurso, idModalidad, listaMapas, rfcSesion, usuario);
    }
}


