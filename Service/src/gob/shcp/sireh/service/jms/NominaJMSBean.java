package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.AbstractBean;

import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name = "NominaJMS")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class NominaJMSBean extends AbstractBean implements NominaJMSService {

    /**
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void sendNomina(int idQna, int idPlaza, String idRfc, boolean async) {
        super.getService(NominaJMSService.class).sendNomina(idQna, idPlaza, idRfc, async);
    }
    
    /**
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void sendNominaGpoPago(int idQna, int idPlaza, String idRfc, String idGrupoPago, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones, String usuario, boolean async) {
        super.getService(NominaJMSService.class).sendNominaGpoPago(idQna, idPlaza, idRfc, idGrupoPago, nomFuenteDatos, operationalYear, dimensiones, usuario,  async);
    }
    
    /**
     * Metodo encargado del calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void calculoNomina(int idQna, int idPlaza, String idRfc, String idGrupoPago, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones, String usuario) {
        super.getService(NominaJMSService.class).calculoNomina(idQna, idPlaza, idRfc, idGrupoPago, nomFuenteDatos, operationalYear, dimensiones, usuario);
    }
    
    /**
     * Metodo encargado de la llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void postInsercionNomina(int idQna, int idPlaza, String idRfc) {
        super.getService(NominaJMSService.class).postInsercionNomina(idQna, idPlaza, idRfc);
    }


    public void sendNominaAguinado(int idQna) {
        super.getService(NominaJMSService.class).sendNominaAguinado(idQna);
    }


    public void postProcesoAguinaldo(int idQna) {
        super.getService(NominaJMSService.class).postProcesoAguinaldo(idQna);
    }
    
    public void sendNominaFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha){
        super.getService(NominaJMSService.class).sendNominaFonac(idNomina, qnaIni, qnaFin, qnaNom, rfc, usuario, fecha);
    }
        
    public void postProcesoFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha){
        super.getService(NominaJMSService.class).postProcesoFonac(idNomina, qnaIni,  qnaFin,  qnaNom, rfc, usuario, fecha);
    }
    
    /***** GENERAR EL PAQUETE XML DE ENVIO AL SAT *****/
    public void sendGenerarPaqueteXmlTimbrado(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario){
        super.getService(NominaJMSService.class).sendGenerarPaqueteXmlTimbrado(roothPath, idQna, hpQnaPago, version, usuario);
    }
    public void postGenerarPaqueteXmlTimbrado(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario){
        super.getService(NominaJMSService.class).postGenerarPaqueteXmlTimbrado(roothPath, idQna, hpQnaPago, version, usuario);
    }
    
    /***** PROCESAR EL ARCHIVO TIMBRADO POR EL SAT *****/
    public void sendProcesarPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario){
        super.getService(NominaJMSService.class).sendProcesarPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancela, idNomina, cnPaquete, cnPaqueteRv, localTempDir, usuario);
    }
    public void postProcesarPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario){
        super.getService(NominaJMSService.class).postProcesarPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancela, idNomina, cnPaquete, cnPaqueteRv, localTempDir, usuario);
    }
}

