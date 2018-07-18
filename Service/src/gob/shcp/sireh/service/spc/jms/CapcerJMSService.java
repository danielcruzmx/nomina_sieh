package gob.shcp.sireh.service.spc.jms;

import gob.shcp.fsn.service.BusinessService;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface CapcerJMSService extends BusinessService {

    /**
     * Metodo JMS llamado por el controlador encargado de llamar el proceso de envio de correos de manera asincrona
     * @author Gualberto G.
     * @param operationalYear
     * @param idCurso
     * @param idModalidad
     * @param listaMapas
     * @param async
     */
    public void sendMessages(Integer operationalYear, Integer idCurso, Integer idModalidad, List<Map<String, Object>> listaMapas, String rfcSesion, String usuario, boolean async);

    /**
     * Metodo que es llamado por la cola JMS encargado de invocar al servicio de envio de correos electronicos
     * @author Gualberto G.
     * @param operationalYear
     * @param idCurso
     * @param idModalidad
     * @param listaMapas
     */
    public void postProcesoSendMessages(Integer operationalYear, Integer idCurso, Integer idModalidad, List<Map<String, Object>> listaMapas, String rfcSesion, String usuario);
}
