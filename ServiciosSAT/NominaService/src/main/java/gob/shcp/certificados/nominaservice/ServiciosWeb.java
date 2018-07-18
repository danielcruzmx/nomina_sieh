package gob.shcp.certificados.nominaservice;

import gob.shcp.certificados.nominaservice.azure.FileService;
import gob.shcp.certificados.nominaservice.model.PaqueteEnvio;
import gob.shcp.certificados.nominaservice.model.Respuesta;
import gob.shcp.certificados.nominaservice.service.NominaCancelacionService;
import gob.shcp.certificados.nominaservice.service.NominaConsultaService;
import gob.shcp.certificados.nominaservice.service.NominaRecepcionService;
import gob.shcp.webservice.cancelacion.RespuestaNominaCancelacion;
import gob.shcp.webservice.consulta.RespuestaNominaConsulta;
import gob.shcp.webservice.recepcion.RespuestaNominaRecepcion;
import java.net.URI;
import java.util.Base64;

/**
 *
 * @author omar_gomez
 */
public class ServiciosWeb {

    private static String RFC;
    
    public static Respuesta procesoNominaRecepcion(String rfc, String fileName,String file) throws Exception {
        PaqueteEnvio pk = new PaqueteEnvio();
        Respuesta r = new Respuesta();
        checkParams(rfc, fileName, file);
        setRFC(rfc);

        byte[] f = Base64.getDecoder().decode(file);
        pk.setFileName(fileName);
        pk.setResource(f);
        URI uri = FileService.upload(pk);
        System.out.println("Guardamos el archivo: " + uri.toString());
        System.out.println("Invocando servicio");
        
        RespuestaNominaRecepcion respuestaNominaRecepcion = NominaRecepcionService.process(uri);
        System.out.println("CodRespuesta:" + respuestaNominaRecepcion.getCodRespuesta() + ","
                + "IdPaquete:" + respuestaNominaRecepcion.getIdPaquete().getValue() + ","
                + "Respuesta:" + respuestaNominaRecepcion.getRespuesta().getValue());

        r = new Respuesta(respuestaNominaRecepcion.getCodRespuesta(),
                respuestaNominaRecepcion.getIdPaquete().getValue(),
                respuestaNominaRecepcion.getRespuesta().getValue());

        return r;
    }

    public static Respuesta procesoNominaCancelacion(String rfc,String fileName, String file) throws Exception {
        
        Respuesta respuesta = new Respuesta();
        PaqueteEnvio pk = new PaqueteEnvio();
        checkParams(rfc, fileName, file);
        setRFC(rfc);

        byte[] f = Base64.getDecoder().decode(file);
        pk.setFileName(fileName);
        pk.setResource(f);
        URI uri = FileService.upload(pk);
        System.out.println("Guardamos el archivo: " + uri.toString());
        System.out.println("Invocando servicio");
        
        RespuestaNominaCancelacion r = NominaCancelacionService.process(uri);
        System.out.println("CodRespuesta:" + r.getCodRespuesta() + ", "
                + "UriSalida:" + r.getUriSalida().getValue() + ", "
                + "Respuesta:" + r.getRespuesta().getValue());

        respuesta = new Respuesta();
        respuesta.setCodRespuesta(r.getCodRespuesta());
        respuesta.setUriSalida(r.getUriSalida().getValue());
        respuesta.setRespuesta(r.getRespuesta().getValue());

        return respuesta;
    }

    public static Respuesta procesoNominaConsulta(String rfc, String idPaquete) throws Exception {
        Respuesta respuesta = new Respuesta();
        PaqueteEnvio pk = new PaqueteEnvio();
        checkParams(rfc, idPaquete);
        setRFC(rfc);
        
        pk.setIdPaquete(idPaquete);
        RespuestaNominaConsulta resp = NominaConsultaService.process(pk);
        System.out.println(resp.getEstadoPaquete() + ","
                + resp.getRespuestaServicio().getValue() + ","
                + resp.getBlobUriRespuesta().getValue());
        respuesta = new Respuesta(resp.getEstadoPaquete(),
                resp.getRespuestaServicio().getValue(),
                resp.getBlobUriRespuesta().getValue());

        return respuesta;

    }

    private static void checkParams(String rfc,String fileName, String file )throws Exception{
        if(rfc==null || (rfc!=null && rfc.length()<=0))throw new Exception("Se requiere RFC.");
        if(file==null || (file!=null && file.length()<=0)) throw new Exception("Se requiere archivo.");
        if(file!=null && (fileName == null || (fileName!=null && fileName.length()<=0))) throw new Exception ("Se requiere especificar el nombre del archivo.");
    }
    
    private static void checkParams(String rfc ,String idPaquete)throws Exception{
        if(rfc==null || (rfc!=null && rfc.length()<=0))throw new Exception("Se requiere RFC.");
        if(idPaquete == null || (idPaquete!=null && idPaquete.length()<=0) ) throw new Exception("Se requiere id Paquete.");
    }

    public static String getRFC() {
        return RFC;
    }

    public static void setRFC(String RFC) {
        ServiciosWeb.RFC = RFC;
    }

    
}
