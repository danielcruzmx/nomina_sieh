package gob.shcp.certificados.nominaservice.service;

import gob.shcp.certificados.nominaservice.model.PaqueteEnvio;
import gob.shcp.webservice.consulta.INominaConsulta;
import gob.shcp.webservice.consulta.NominaConsulta;
import gob.shcp.webservice.consulta.ObjectFactory;
import gob.shcp.webservice.consulta.PeticionNominaConsulta;
import gob.shcp.webservice.consulta.RespuestaNominaConsulta;
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
public class NominaConsultaService {

    public static RespuestaNominaConsulta process(PaqueteEnvio envio) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
        TimeZone.setDefault(TimeZone.getTimeZone("America/Mexico_City"));
        disableSslVerification();
        PeticionNominaConsulta peticion  = new PeticionNominaConsulta();
        ObjectFactory obj = new ObjectFactory();
        peticion.setIdPaquete(obj.createPeticionNominaConsultaIdPaquete(envio.getIdPaquete()));
        RespuestaNominaConsulta r = procesarPaquete(peticion);
        System.out.println("NominaConsultaService: EstadoPaquete:"+r.getEstadoPaquete()+", RespuestaServicio:"+r.getRespuestaServicio().getValue()+", BlobUriRespuesta:"+r.getBlobUriRespuesta().getValue());
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
    
    private static RespuestaNominaConsulta procesarPaquete(PeticionNominaConsulta parameters) {
        NominaConsulta service = new NominaConsulta();
        INominaConsulta port = service.getEndPointRecibe();
        return port.consultarEstado(parameters);
    }

}
