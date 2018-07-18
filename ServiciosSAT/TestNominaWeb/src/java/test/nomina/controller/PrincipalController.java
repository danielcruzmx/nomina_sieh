package test.nomina.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author omar_gomez
 */
@Controller
@RequestMapping("/principal")
public class PrincipalController {
    
    
    private String jnlpFileString="PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4KPGpubHAgIHNwZWM9IjEuMCsiIHhtbG5zOmpmeD0iaHR0cDov"+
"L2phdmFmeC5jb20iICBocmVmPSJfZG93bmxvYWRlci5qbmxwXyI+CiAgICA8aW5mb3JtYXRpb24+CiAgICAgICAgPHRpdGxlPk5v"+
"bWluYVNlcnZpY2U8L3RpdGxlPgogICAgICAgIDx2ZW5kb3I+U0hDUDwvdmVuZG9yPgogICAgICAgIDxkZXNjcmlwdGlvbj5TQ0hQ"+
"PC9kZXNjcmlwdGlvbj4KICAgICAgICA8b2ZmbGluZS1hbGxvd2VkLz4KICAgIDwvaW5mb3JtYXRpb24+CiAgICA8cmVzb3VyY2Vz"+
"PgogICAgICAgIDxqMnNlIHZlcnNpb249IjEuNysiIGhyZWY9Imh0dHA6Ly9qYXZhLnN1bi5jb20vcHJvZHVjdHMvYXV0b2RsL2oy"+
"c2UiLz4KICAgICAgICA8amFyIGhyZWY9Il9yZXFVUkxfL2FwcC9Ob21pbmFTZXJ2aWNlLTEuMC1TTkFQU0hPVC5qYXIiIGRvd25s"+
"b2FkPSJlYWdlciIgbWFpbj0idHJ1ZSIvPiAgICAKICAgIDwvcmVzb3VyY2VzPgogICAgPHNlY3VyaXR5PgogICAgICAgIDxhbGwt"+
"cGVybWlzc2lvbnMvPgogICAgPC9zZWN1cml0eT4KICAgIDxqZng6amF2YWZ4LWRlc2MgIHdpZHRoPSI2MDAiIGhlaWdodD0iMjAw"+
"IiBtYWluLWNsYXNzPSJnb2Iuc2hjcC5jZXJ0aWZpY2Fkb3Mubm9taW5hc2VydmljZS5NYWluQXBwIiBuYW1lPSJNYWluQXBwIiA+"+
"CiAgICAgICAgPGZ4OnBhcmFtIG5hbWU9InNlcnZpY2UiIHZhbHVlPSJfc2VydmljZV8iLz4KICAgICAgICA8Zng6cGFyYW0gbmFt"+
"ZT0icmZjIiB2YWx1ZT0iX3JmY18iLz4KICAgICAgICA8Zng6cGFyYW0gbmFtZT0iZmlsZSIgdmFsdWU9Il9maWxlXyIvPgogICAg"+
"ICAgIDxmeDpwYXJhbSBuYW1lPSJmaWxlTmFtZSIgdmFsdWU9Il9maWxlTmFtZV8iLz4KICAgICAgICA8Zng6cGFyYW0gbmFtZT0i"+
"aWRQYXF1ZXRlIiB2YWx1ZT0iX2lkUGFxdWV0ZV8iLz4KICAgICAgICA8Zng6cGFyYW0gbmFtZT0idXJsUmVxdWVzdCIgdmFsdWU9"+
"Il91cmxSZXF1ZXN0XyIvPgogICAgPC9qZng6amF2YWZ4LWRlc2M+CiAgICA8dXBkYXRlIGNoZWNrPSJhbHdheXMiIHBvbGljeT0i"+
"YWx3YXlzIi8+Cjwvam5scD4=";
    
    private static final String SERVICIO_RECEPCION = "RECEPCION";
    private static final String SERVICIO_CONSULTA = "CONSULTA";
    private static final String SERVICIO_CANCELACION = "CANCELACION";

    
    @RequestMapping(value = "/downloadAppWS", method = RequestMethod.GET)
    public void downloadAppWS(HttpServletRequest req, HttpServletResponse resp){
        InputStream is = null;

        try {

                final String service = req.getParameter("service") != null? req.getParameter("service") : "";
                final String rfc = req.getParameter("rfc") != null? req.getParameter("rfc") : "";
                String fileSat = req.getParameter("fileSat") != null? req.getParameter("fileSat"): "";
                String fileNameSat = req.getParameter("fileNameSat") != null? req.getParameter("fileNameSat") : "";
                final String idPaquete = req.getParameter("idPaquete") != null? req.getParameter("idPaquete") : "";
                final String idNomina = req.getParameter("idNomina") != null? req.getParameter("idNomina") : "";
                final String filename = UUID.randomUUID()+ ".jnlp";
                
                
                if(SERVICIO_RECEPCION.equalsIgnoreCase(service)){
                    String ubicacion="";
                    ubicacion = "C:\\temp\\SHC850101U37_2017_NOMIDddd_3.zip";
                    File file = new File(ubicacion);
                    InputStream targetStream = new FileInputStream(file);
                    byte[] f = new byte[(int)file.length()];
                    targetStream.read(f);
                    targetStream.read(f);
                    fileSat=DatatypeConverter.printBase64Binary(f);
                    fileNameSat="SHC850101U37_2017_NOMIDddd_3.zip";
                    System.out.println(fileSat);
                    System.out.println(fileNameSat);
                }else if(SERVICIO_CANCELACION.equalsIgnoreCase(service)){
                    String ubicacion="";
                    ubicacion = "C:\\temp\\cancelacion\\archivo_cancelacion_prueba.zip";
                    File file = new File(ubicacion);
                    InputStream targetStream = new FileInputStream(file);
                    byte[] f = new byte[(int)file.length()];
                    targetStream.read(f);
                    fileSat=DatatypeConverter.printBase64Binary(f);
                    fileNameSat="archivo_cancelacion_prueba.zip";
                    System.out.println(fileSat);
                    System.out.println(fileNameSat);
                }


                
                String requestUrl = req.getRequestURL().toString();
                System.out.println("RequestUrl:"+requestUrl);
                final String contextPath = req.getContextPath();
                requestUrl= requestUrl.substring(0,requestUrl.indexOf(contextPath))+contextPath;
                
                final String urlRequest="http://172.22.153.119:7001/TestNominaWeb/rest/service/respuesta";

                
                                
                //String jnlpfile=  new String(Base64.decode(jnlpFileString));
                byte[] decoded =DatatypeConverter.parseBase64Binary(jnlpFileString);
                String jnlpfile=new String(decoded, "UTF-8");
                
                /*para simular el codificado
                String ubicacion = "D:\\Documentos\\Documents\\00_HACIENDA\\BRANCHS\\Externos\\NominaService\\NominaService.jnlp";
                File file = new File(ubicacion);
                InputStream targetStream = new FileInputStream(file);
                byte[] f = new byte[(int)file.length()];
                targetStream.read(f);
                String jnlpfile = DatatypeConverter.printBase64Binary(f);
                
                byte[] decoded =DatatypeConverter.parseBase64Binary(jnlpfile);
                jnlpfile=new String(decoded, "UTF-8");
                FIN para simular el codificado*/
                
                jnlpfile=jnlpfile.replaceAll("_service_",service);
                jnlpfile=jnlpfile.replaceAll("_rfc_",rfc);
                jnlpfile=jnlpfile.replaceAll("_file_",fileSat);
                jnlpfile=jnlpfile.replaceAll("_fileName_",fileNameSat);
                jnlpfile=jnlpfile.replaceAll("_idPaquete_",idPaquete);
                //jnlpfile=jnlpfile.replaceAll("_reqURL_",super.configuration().getString("PKI_WEB_RESOURCES_URL"));
                 jnlpfile=jnlpfile.replaceAll("_reqURL_","http://172.22.153.119:7001/TestNominaWeb");
                jnlpfile=jnlpfile.replaceAll("_urlRequest_",urlRequest);
                jnlpfile=jnlpfile.replaceAll("_idNomina_",idNomina);
                jnlpfile=jnlpfile.replaceAll("_downloader.jnlp_",filename);
                String attachment = "inline; filename=\"" + filename +"\"";
                resp.setContentType("application/x-java-jnlp-file");
                resp.setHeader("Cache-Control", "max-age=30");
                resp.setHeader("Content-disposition", attachment);
                IOUtils.copy(IOUtils.toInputStream(jnlpfile, "UTF-8"), resp.getOutputStream());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
}
