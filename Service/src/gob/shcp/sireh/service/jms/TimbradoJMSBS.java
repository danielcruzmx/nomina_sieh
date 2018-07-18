package gob.shcp.sireh.service.jms;

import gob.shcp.sireh.service.AbstractSirehService;



import gob.shcp.sireh.service.nomina.terceros.timbrado.TimbradoSatService;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;

import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class TimbradoJMSBS extends AbstractSirehService implements TimbradoJMSService{

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


    public void sendComprobantesCFDI(final int idNomina, final String rootPathAplication) {
        final String accion = "postProcesoEnviarComprobantes";
        final Object[] objetoAEnviar = new Object[] { accion, idNomina, rootPathAplication };

        getJmsTemplate().send(getDestination(), new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        logger.debug("--> Sending object: " + accion + "-" + idNomina);
                        return session.createObjectMessage(objetoAEnviar);
                    }
                });
    }

    public void postProcesoSendComprobantesCFDI(int idNomina, String rootPathAplication) {
        super.getService(TimbradoSatService.class).enviarCorreosMasivo(idNomina, rootPathAplication);
    
    
    }
    
    public void sendGenerarCadenas(final String rootPathAplication, final int idNomina, final String usuario){
        final String accion = "postProcesoGenerarCadenas";
        final Object[] objetoAEnviar = new Object[] { accion, rootPathAplication, idNomina, usuario};

        getJmsTemplate().send(getDestination(), new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        logger.debug("--> Sending object: " + accion + "-" + idNomina);
                        return session.createObjectMessage(objetoAEnviar);
                    }
                });

    }
   public void postProcesoGenerarCadenas(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoSatService.class).processSatGenerarCadenas(rootPathAplication, idNomina, usuario);
    }
    
    public void sendIntegrarXmlFirma(final String rootPathAplication, final int idNomina, final String usuario){
        final String accion = "postProcesoIntegrarXmlFirma";
        final Object[] objetoAEnviar = new Object[] { accion, rootPathAplication, idNomina, usuario};

        getJmsTemplate().send(getDestination(), new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        logger.debug("--> Sending object: " + accion + "-" + idNomina);
                        return session.createObjectMessage(objetoAEnviar);
                    }
                });

    }
    public void postProcesoIntegrarXmlFirma(String rootPathAplication, int idNomina, String usuario){
        super.getService(TimbradoSatService.class).processSatIntegrarXmlFirma(rootPathAplication, idNomina, usuario);
    }
}
