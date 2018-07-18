package gob.shcp.certificados.nominaservice.service;

import gob.shcp.webservice.recepcion.INominaRecepcion;
import gob.shcp.webservice.recepcion.NominaRecepcion;
import gob.shcp.webservice.recepcion.ObjectFactory;
import gob.shcp.webservice.recepcion.PeticionNominaRecepcion;
import gob.shcp.webservice.recepcion.RespuestaNominaRecepcion;
import java.io.StringReader;
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
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

/**
 *
 * @author omar_gomez
 */
public class NominaRecepcionService {
    
    public static String RFC;
   
    public static RespuestaNominaRecepcion process(URI uri){
    
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
        TimeZone.setDefault(TimeZone.getTimeZone("America/Mexico_City"));         
        disableSslVerification();
        PeticionNominaRecepcion peticion = new PeticionNominaRecepcion();
        ObjectFactory obj = new ObjectFactory();
        peticion.setUriBlob(obj.createPeticionNominaRecepcionUriBlob(uri.toString()));
        RespuestaNominaRecepcion r = procesarPaquete_1(peticion);
        System.out.println("respuesta:"+r.getRespuesta().getValue()+",paquete:"+r.getIdPaquete().getValue());
        return r;
    }
    
    
    private static void procesarPaquete() {
         System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        disableSslVerification();
        NominaRecepcion service = new NominaRecepcion();
        QName portQName = new QName("http://tempuri.org/", "EndPointRecibe");
        String req = "<ProcesarPaquete  xmlns=\"http://tempuri.org/\"><parameters>ENTER VALUE</parameters></ProcesarPaquete>";
        try {
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            // TODO handle custom exceptions here
        }
    }
    
      private static void disableSslVerification() {
    try
    {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
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

    private static RespuestaNominaRecepcion procesarPaquete_1(PeticionNominaRecepcion parameters) {
        NominaRecepcion service = new NominaRecepcion();
        INominaRecepcion port = service.getEndPointRecibe();
        return port.procesarPaquete(parameters);
    }

    public static void setRFC(String RFC) {
        NominaRecepcionService.RFC = RFC;
    }

    

}
