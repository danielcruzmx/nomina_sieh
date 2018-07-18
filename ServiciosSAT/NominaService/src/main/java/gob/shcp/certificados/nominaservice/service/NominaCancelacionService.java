package gob.shcp.certificados.nominaservice.service;

import gob.shcp.certificados.nominaservice.model.PaqueteEnvio;
import gob.shcp.webservice.cancelacion.INominaCancelacion;
import gob.shcp.webservice.cancelacion.NominaCancelacion;
import gob.shcp.webservice.cancelacion.ObjectFactory;
import gob.shcp.webservice.cancelacion.PeticionNominaCancelacion;
import gob.shcp.webservice.cancelacion.RespuestaNominaCancelacion;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author omar_gomez
 */
public class NominaCancelacionService {
    
    public static RespuestaNominaCancelacion process(URI uri){
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
        TimeZone.setDefault(TimeZone.getTimeZone("America/Mexico_City"));
        disableSslVerification();
        PeticionNominaCancelacion peticion = new PeticionNominaCancelacion();
        ObjectFactory obj = new ObjectFactory();
        peticion.setUriBlob(obj.createPeticionNominaCancelacionUriBlob(uri.toString()));
        RespuestaNominaCancelacion r = procesarPaquete(peticion);
        return r;
    }

    private static void disableSslVerification() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }
    
    private static RespuestaNominaCancelacion procesarPaquete(PeticionNominaCancelacion parameters){
        NominaCancelacion service = new NominaCancelacion();
        INominaCancelacion port = service.getEndPointRecibe();
        return port.procesarCancelacion(parameters);
    }
}
