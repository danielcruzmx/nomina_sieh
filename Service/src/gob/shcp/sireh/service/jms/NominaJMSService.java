package gob.shcp.sireh.service.jms;

import gob.shcp.fsn.service.BusinessService;

import java.util.Map;

import javax.ejb.Local;


@Local
public interface NominaJMSService extends BusinessService {

    /**
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void sendNomina(int idQna, int idPlaza, String idRfc, boolean async);
    
    /**
     * Metodo encargado de ejecutar cola JMS para el calculo de nomina.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void sendNominaGpoPago(int idQna, int idPlaza, String idRfc, String idGrupoPago, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones, String usuario, boolean async);
    
    /**
     * Metodo encargado del calculo de nomina y llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     * @param idGrupoPago String
     * @param usuario String
     */
    public void calculoNomina(final int idQna, final int idPlaza, final String idRfc, final String idGrupoPago, final String nomFuenteDatos, final String operationalYear, final Map<String, Map<String, String>> dimensiones, final String usuario);
    
    /**
     * Metodo encargado de la llamada a store procedure de calculo.
     * @author Oscar S.
     * @param idQna int
     * @param idPlaza int
     */
    public void postInsercionNomina(int idQna, int idPlaza, String idRfc);
    
    public void sendNominaAguinado(int idQna);
    
    public void postProcesoAguinaldo(int idQna);
    
    public void sendNominaFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha);
    
    public void postProcesoFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha);
    
    
    /***** GENERAR EL PAQUETE XML DE ENVIO AL SAT *****/
    public void sendGenerarPaqueteXmlTimbrado(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario);
    public void postGenerarPaqueteXmlTimbrado(String roothPath, String idQna, Integer hpQnaPago, String version, String usuario);
    
    /***** PROCESAR EL ARCHIVO TIMBRADO POR EL SAT - DE FORMA ASINCRONA *****/
    public void sendProcesarPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario);
    public void postProcesarPaqueteTimbradoSAT(String archivoPaquete, String archivoReporte, String archivoCancela, Integer idNomina, Integer cnPaquete, Integer cnPaqueteRv, String localTempDir, String usuario);
}