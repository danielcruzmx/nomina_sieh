package gob.shcp.sireh.service.jms;

import gob.shcp.sireh.data.jdbc.TnNominaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;
import gob.shcp.sireh.domain.jdbc.TnNomina;
import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;
import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;

import java.sql.Types;

import java.util.Map;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


public class NominaJMSBS extends AbstractSirehService implements NominaJMSService {

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
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void sendNomina(final int idQna, final int idPlaza, final String idRfc, final boolean async) {
        final String accion = "postProcesoNomina";
        final Object[] objetoAEnviar = new Object[] { accion, idQna, idPlaza, idRfc };

        if (async) {
            getJmsTemplate().send(getDestination(), new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            logger.debug("--> Sending object: " + accion + "-" + idQna + "-" + idPlaza + "-");
                            return session.createObjectMessage(objetoAEnviar);
                        }
                    });
        } else {
            // Store procedure
            postInsercionNomina(idQna, idPlaza, idRfc);
        }
    }

    /**
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void sendNominaGpoPago(final int idQna, final int idPlaza, final String idRfc, final String idGrupoPago, final String nomFuenteDatos, final String operationalYear, final Map<String, Map<String, String>> dimensiones, final String usuario, final boolean async) {
        final String accion = "postProcesoCalculoNomina";
        final Object[] objetoAEnviar = new Object[] { accion, idQna, idPlaza, idRfc, idGrupoPago, nomFuenteDatos, operationalYear, dimensiones, usuario};

        if (async) {
            getJmsTemplate().send(getDestination(), new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            logger.debug("\n\n--> Sending object: " + accion + "-" + idQna + "-" + idPlaza + "-" + idRfc + "-" + idGrupoPago + "-" + nomFuenteDatos + "-" + operationalYear + "-" + dimensiones + "-" + usuario);
                            return session.createObjectMessage(objetoAEnviar);
                        }
                    });
        } else {
            // Ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
            calculoNomina(idQna, idPlaza, idRfc, idGrupoPago, nomFuenteDatos, operationalYear, dimensiones, usuario);
            
            // Store procedure
            postInsercionNomina(idQna, idPlaza, idRfc);
        }
    }
    
    /**
     * Metodo encargado del calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void calculoNomina(final int idQna, final int idPlaza, final String idRfc,  final String idGrupoPago, final String nomFuenteDatos, final String operationalYear, final Map<String, Map<String, String>> dimensiones, final String usuario) {
        super.getService(CalculoNominaService.class).saveNominaCompletaGpoPago(super.getService(CalculoNominaService.class).calcByGpoPago(idGrupoPago, idQna, nomFuenteDatos, operationalYear, dimensiones), idQna, usuario);
    }
    
    /**
     * Metodo encargado de la llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void postInsercionNomina(int idQna, int idPlaza, String idRfc) {
        TnNomina tnNomina = super.persistence().get(TnNominaDAO.class).getById(idQna);

        if (tnNomina != null && tnNomina.getNomReglaCalculo() != null && !tnNomina.getNomReglaCalculo().equals("")) {
            String[] tokens = tnNomina.getNomReglaCalculo().split("\\|");
            if (tokens.length > 0) {
                int numParams = tokens.length / 3;
                String[] params = new String[numParams];
                String[] args = new String[numParams];
                int[]types = new int[numParams];

                for (int i = 0; i < numParams; i++) {
                    switch (tokens[i * 3 + 1].charAt(0) ) {
                    case 'V':
                        types[i] = Types.VARCHAR;
                        break;
                    case 'N':
                        types[i] = Types.NUMERIC;
                        break;
                    }
                    params[i] = tokens[i * 3 + 2];
                    args[i] = tokens[i * 3 + 3];
                }
                logger.warn("params " + params);
                logger.warn("args " + args);
                super.persistence().get(CustomCalculoDAO.class).postInsercionNominaDinamico(tokens[0], types, params, args);
            }
        } else {
            super.persistence().get(CustomCalculoDAO.class).postInsercionNomina(idQna, idPlaza, idRfc);
        }
    }

    public void sendNominaAguinado(final int idQna) {
        final String accion = "postProcesoAguinaldo";
        final Object[] objetoAEnviar = new Object[] { accion, idQna };

            getJmsTemplate().send(getDestination(), new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            logger.debug("--> Sending object: " + accion + "-" + idQna + "-");
                            return session.createObjectMessage(objetoAEnviar);
                        }
                    });
        
    }

    public void postProcesoAguinaldo(int idQna) {
        //super.getService(CalculoNominaExtraService.class).processPMNominaAguinaldo(idQna);
        super.persistence().get(CustomCalculoDAO.class).generarNominaAguinaldo(idQna);
    }
    
    public void sendNominaFonac(final Integer idNomina, final Integer qnaIni, final Integer qnaFin, final Integer qnaNom, final String rfc, final String usuario,final String fecha) {
        final String accion = "postProcesoFonac";
        final Object[] objetoAEnviar = new Object[] { accion, idNomina, qnaIni, qnaFin, qnaNom, rfc, usuario, fecha};

            getJmsTemplate().send(getDestination(), new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            logger.debug("--> Sending object: " + accion + "-" + idNomina + "-" + qnaIni + "-" + qnaFin + "-" + qnaNom + "-" + rfc + "-" + usuario + "-" + fecha );
                            return session.createObjectMessage(objetoAEnviar);
                        }
                    });
        
    }

    public void postProcesoFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha ) {
        logger.debug("******************* postProcesoFonac ***************************");
        super.persistence().get(CustomCalculoDAO.class).generarNominaFonac( idNomina, qnaIni,  qnaFin,  qnaNom, rfc, usuario, fecha);
    }
    
    
    /***** GENERAR EL PAQUETE XML DE ENVIO AL SAT *****  MARTIN C. */
    public void sendGenerarPaqueteXmlTimbrado(final String roothPath, final String idQna, final Integer hpQnaPago, final String version, final String usuario){
        final String accion = "postGenerarPaqueteXmlTimbrado";
        final Object[] objetoAEnviar = new Object[] { accion, roothPath, idQna, hpQnaPago, version, usuario};
        
        getJmsTemplate().send(getDestination(), new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                logger.debug(" ---> Sending object: " + accion + "-" + roothPath + "-" + idQna + "-" + hpQnaPago + "-" + version  + "-" + usuario);
                return session.createObjectMessage(objetoAEnviar);
            }
        });
    }
    public void postGenerarPaqueteXmlTimbrado(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario){
        super.getService(TercerosNominaService.class).processSatGenerarPaquteXml(roothPath, idQna, hpQnaPago, version, usuario);
    }

    /***** PROCESAR EL ARCHIVO TIMBRADO POR EL SAT ***** - MARTIN C. */
    public void sendProcesarPaqueteTimbradoSAT(final String archivoPaquete, final String archivoReporte, final String archivoCancela, final Integer idNomina, final Integer cnPaquete, final Integer cnPaqueteRv, final String localTempDir, final String usuario){
        final String accion = "postProcesarPaqueteTimbradoSAT";
        final Object[] objetoAEnviar = new Object[] { accion, archivoPaquete, archivoReporte, archivoCancela, idNomina, cnPaquete, cnPaqueteRv, localTempDir, usuario};
        getJmsTemplate().send(getDestination(), new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                logger.debug("--> Sending object: " +   accion + "-" + archivoPaquete + "-" + cnPaquete  + "-" + archivoReporte + "-" + archivoCancela + "-" + usuario + "-" + idNomina + "-" + localTempDir);
                return session.createObjectMessage(objetoAEnviar);
            }
        });
    }
    
    public void postProcesarPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario){
        super.getService(TercerosNominaService.class).processSatPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancela, idNomina, cnPaquete, cnPaqueteRv, localTempDir, usuario);
    }

}
