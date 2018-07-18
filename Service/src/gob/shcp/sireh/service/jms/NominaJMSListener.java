package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.access.AbstractLocator;

import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;


public class NominaJMSListener extends AbstractLocator implements MessageListener {

    /**
     * Listener encargado de interceptar el mensajes para calculo de nomina y llammada a store procedure de calculo.
     * @author Oscar S.
     * @param message Message
     */
    public void onMessage(Message message) {
        if (message instanceof ObjectMessage) {
            final ObjectMessage m = (ObjectMessage)message;
            
            try {
                if (m.getObject() instanceof Object[]) {
                    Object[] objetoRecibido = (Object[])m.getObject();
                    // Calculo de nomina 
                    if (objetoRecibido != null && objetoRecibido.length == 9 && objetoRecibido[0].equals("postProcesoCalculoNomina")) {
                        // Ejecutar consultas relacionadas al calculo de nomina por grupo de pago.

                        super.getService(NominaJMSService.class).calculoNomina((Integer)objetoRecibido[1], (Integer)objetoRecibido[2], (String)objetoRecibido[3], (String)objetoRecibido[4], (String)objetoRecibido[5], (String) objetoRecibido[6], (Map<String, Map<String, String>>) objetoRecibido[7], (String)objetoRecibido[8]);
                        
                        // Ejecutar Store procedure  de manera asincrona
                        super.getService(NominaJMSService.class).sendNomina((Integer)objetoRecibido[1], (Integer)objetoRecibido[2], (String)objetoRecibido[3], true);
                    }
                    
                    // Store procedure de calculo.
                    if (objetoRecibido != null && objetoRecibido.length == 4 && objetoRecibido[0].equals("postProcesoNomina")) {
                        // Store procedure
                        super.getService(NominaJMSService.class).postInsercionNomina((Integer)objetoRecibido[1], (Integer)objetoRecibido[2], (String)objetoRecibido[3]);
                    }
                    
                    // Store procedure de nomina aguinaldo.
                    if (objetoRecibido != null && objetoRecibido.length == 2 && objetoRecibido[0].equals("postProcesoAguinaldo")) {
                        // Store procedure
                        super.getService(NominaJMSService.class).postProcesoAguinaldo((Integer)objetoRecibido[1]);
                    }
                    
                    // Store procedure de nomina fonac.
                    if (objetoRecibido != null && objetoRecibido.length == 8 && objetoRecibido[0].equals("postProcesoFonac")) {
                        // Store procedure
                        super.getService(NominaJMSService.class).postProcesoFonac((Integer)objetoRecibido[1], (Integer)objetoRecibido[2], (Integer)objetoRecibido[3], (Integer)objetoRecibido[4], (String)objetoRecibido[5], (String)objetoRecibido[6], (String)objetoRecibido[7] );
                    }
                    
                    // Proceso de generacion del paquete xml del timbrado
                    if (objetoRecibido != null && objetoRecibido.length == 6 && objetoRecibido[0].equals("postGenerarPaqueteXmlTimbrado")) {
                        super.getService(NominaJMSService.class).postGenerarPaqueteXmlTimbrado((String) objetoRecibido[1], (String) objetoRecibido[2], (Integer) objetoRecibido[3], (String) objetoRecibido[4], (String) objetoRecibido[5]);
                    }
                    
                     //----- PROCESAR EL ARCHIVO TIMBRADO POR EL SAT - DE FORMA ASINCRONA ---/
                    if (objetoRecibido != null && objetoRecibido.length == 9 && objetoRecibido[0].equals("postProcesarPaqueteTimbradoSAT")) {
                        super.getService(NominaJMSService.class).postProcesarPaqueteTimbradoSAT((String)objetoRecibido[1], (String)objetoRecibido[2], (String)objetoRecibido[3], (Integer)objetoRecibido[4], (Integer)objetoRecibido[5], (Integer)objetoRecibido[6], (String)objetoRecibido[7], (String)objetoRecibido[8]);
                    }

                }
            } catch (JMSException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
