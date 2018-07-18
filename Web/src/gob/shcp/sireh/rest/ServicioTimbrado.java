package gob.shcp.sireh.rest;

import gob.shcp.fsn.control.AbstractController;
import org.springframework.stereotype.Controller;
import gob.shcp.fsn.control.support.AnnotatedController;


import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.nomina.terceros.ComponenteXmlDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.TnComprobanteDigDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.ArchivoEnvio;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.PeticionCadena;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.Respuesta;

import gob.shcp.sireh.model.nomina.terceros.timbradosat.rest.RespuestaCadena;
import gob.shcp.sireh.service.SirehUtils;

import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;

import gob.shcp.sireh.service.nomina.terceros.timbrado.TimbradoSatService;

import java.io.File;

import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;

import javax.xml.bind.DatatypeConverter;



import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/timbrado/*")
public class ServicioTimbrado extends AbstractController implements AnnotatedController{


    @RequestMapping(value={"/respuesta"}, method={RequestMethod.POST})
    public @ResponseBody Respuesta respuesta(@RequestBody Respuesta respuesta){
        System.out.println("respuesta");
        System.out.println("CodRespuesta:"+respuesta.getCodRespuesta()+","+
                  "IdPaquete:"+respuesta.getIdPaquete()+","+
                  "Respuesta:"+respuesta.getRespuesta()+","+
                  "UriSalida:"+respuesta.getUriSalida());
                  if(respuesta.getCnFolio() != null && respuesta.getCnFolio() > 0 ){
                      super.getService(TimbradoSatService.class).processSatRespuestaSatRecepcionByFolio(respuesta.getIdNomina(), respuesta );
                  } else {
                      super.getService(TimbradoSatService.class).processSatRespuestaSatRecepcion(respuesta.getIdNomina(), respuesta );    
                  }
                  
               return respuesta;
    }
    
    @RequestMapping(value={"/respConsulta"}, method={RequestMethod.POST})
    public @ResponseBody Respuesta respuestaConsulta(@RequestBody Respuesta respuesta){
        System.out.println("respuestaConsulta");
        System.out.println("CodRespuesta:"+respuesta.getCodRespuesta()+","+
                  "IdPaquete:"+respuesta.getIdPaquete()+","+
                  "Respuesta:"+respuesta.getRespuesta()+","+
                  "UriSalida:"+respuesta.getUriSalida());
                  if(respuesta.getCnFolio() != null && respuesta.getCnFolio() > 0 ) {
                      super.getService(TimbradoSatService.class).processSatRespuestaSatConsultaByFolio(respuesta.getIdNomina(), respuesta );
                  } else {
                      super.getService(TimbradoSatService.class).processSatRespuestaSatConsulta(respuesta.getIdNomina(), respuesta );     
                  }
                 
                  return respuesta;
    }
    
    

    
    @RequestMapping(value={"/respCancelacion"}, method={RequestMethod.POST})
    public @ResponseBody Respuesta respuestaCancelacion(@RequestBody Respuesta respuesta){
        System.out.println("respuestaCancelacion");
        System.out.println("CodRespuesta:"+respuesta.getCodRespuesta()+","+
                  "IdPaquete:"+respuesta.getIdPaquete()+","+
                  "Respuesta:"+respuesta.getRespuesta()+","+
                  "UriSalida:"+respuesta.getUriSalida());
                  return respuesta;
    }
    
    @RequestMapping(value={"/getFile"},method={RequestMethod.POST})
       public @ResponseBody ArchivoEnvio consultaArchivo(@RequestBody ArchivoEnvio archivoEnvio) throws Exception{
        System.out.println("consultaArchivo");
        //System.out.println("FileName:"+archivoEnvio.getFileName() +","+
        //          "idNomina:"+archivoEnvio.getIdNomina() +","+
         //         "service:"+archivoEnvio.getService() +","+
          //        "Resource:"+archivoEnvio.getResource());
         NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(archivoEnvio.getIdNomina() );
        
        if(archivoEnvio.getService() != null && archivoEnvio.getService().equals(super.configuration().getString("timbrado", "SERVICIO_RECEPCION")) ){
            if(archivoEnvio.getCnFolio() != null && archivoEnvio.getCnFolio() > 0 ){
                TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(archivoEnvio.getCnFolio(), 9, archivoEnvio.getCnPaquete() );
                archivoEnvio.setFileName(super.configuration().getString("timbrado", "PREFIX_ANEXO20") + "_" + archivoEnvio.getCnFolio() + "_" + tnComprobanteDigDTO.getCnPaquete() + "_" + tnComprobanteDigDTO.getCnPaqueteRv() + ".zip" );   
                archivoEnvio.setResource(DatatypeConverter.printBase64Binary(tnComprobanteDigDTO.getCnArchAnexo20()));
            } else {
                archivoEnvio.setFileName(super.configuration().getString("timbrado", "PREFIX_ANEXO20") + "_" + nominaDTO.getIdNomina() + "_" + nominaDTO.getCnPaquete() + ".zip" );   
                archivoEnvio.setResource(DatatypeConverter.printBase64Binary(nominaDTO.getNomArchAnexo20()));
            }
        } else if(archivoEnvio.getService() != null && archivoEnvio.getService().equals(super.configuration().getString("timbrado", "SERVICIO_CANCELACION")) ){
            archivoEnvio.setFileName(super.configuration().getString("timbrado", "PREFIX_CANCELACION") + "_" + nominaDTO.getIdNomina() + "_" + nominaDTO.getCnPaquete()+ ".zip" );   
            archivoEnvio.setResource(DatatypeConverter.printBase64Binary(nominaDTO.getNomArchCanc() ));
        }
        System.out.println("Resource size: " + archivoEnvio.getResource().length() );
        System.out.println(archivoEnvio.getFileName() );
                  return archivoEnvio;
    }
    
    @RequestMapping(value={"/respDownload"},method={RequestMethod.POST})
       public @ResponseBody ArchivoEnvio respuestaDownload(@RequestBody ArchivoEnvio archivoEnvio) throws Exception{
        System.out.println("respuestaDownload");
        System.out.println("FileName:"+archivoEnvio.getFileName() +","+
                  "idNomina:"+archivoEnvio.getIdNomina() +","+
                  "service:"+archivoEnvio.getService() +","+
                  "Resource size:"+archivoEnvio.getResource().length() );
        
        byte[] timbradoBytes = DatatypeConverter.parseBase64Binary(archivoEnvio.getResource());
        List<byte[]> listaArchivosZip = new ArrayList<byte[]>();
        String localTempDir = super.configuration().getString("local.temp.dir");
        listaArchivosZip.add(timbradoBytes);

        List<String> listaArchivosRespuestaSat = 
            super.getService(TercerosNominaService.class).descargaDescomprimeZipTimbrado(archivoEnvio.getIdNomina(), 
                                                                                         listaArchivosZip, 
                                                                                         localTempDir);

        String archivoPaquete = SirehUtils.getElementFromPattern("^paquete", listaArchivosRespuestaSat);
        String archivoReporte = SirehUtils.getElementFromPattern("^reporte", listaArchivosRespuestaSat);
        String archivoCancelacion = "";
        Map<String,byte[]> mapaReportes = null;
        
        if(archivoEnvio.getCnFolio() != null && archivoEnvio.getCnFolio() > 0 ){
            TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(archivoEnvio.getCnFolio(), 9, archivoEnvio.getCnPaquete() );
            mapaReportes = super.getService(TercerosNominaService.class).processSatPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancelacion, archivoEnvio.getIdNomina(), archivoEnvio.getCnPaquete(), tnComprobanteDigDTO.getCnPaqueteRv(),  localTempDir, super.identity().get().getUserID());
            if(mapaReportes.get("archivoInforme") != null){
                 byte[] archivoInforme = mapaReportes.get("archivoInforme");
                tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(archivoEnvio.getCnFolio(), 9, archivoEnvio.getCnPaquete() );
                tnComprobanteDigDTO.setCnArchTimbrado(archivoInforme);
                super.getService(TimbradoSatService.class).updateTnComprobanteDig(tnComprobanteDigDTO);
            }
        } else {
            NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNominaById(archivoEnvio.getIdNomina() );
            mapaReportes = super.getService(TercerosNominaService.class).processSatPaqueteTimbradoSAT(archivoPaquete, archivoReporte, archivoCancelacion, nominaDTO.getIdNomina().intValue() , nominaDTO.getCnPaquete(), null, localTempDir, super.identity().get().getUserID());
            if(mapaReportes.get("archivoInforme") != null){
                byte[] archivoInforme = mapaReportes.get("archivoInforme");
            
            nominaDTO.setNomRefTimbrado("T");
            nominaDTO.setNomArchTimbrado(archivoInforme);
            super.getService(GestionNominaService.class).updateNominaCompleta(nominaDTO);
            }
        }
        
        
                  return archivoEnvio;
    }
    
    @RequestMapping(value={"/consultarCadenas"},method={RequestMethod.POST})
       public @ResponseBody RespuestaCadena consultarCadenas(@RequestBody PeticionCadena peticionCadena) throws Exception{
        System.out.println("consultarCadenas");
        System.out.println(
                  "idNomina:"+peticionCadena.getIdNomina() );
        List<TnComprobanteDigDTO> listaTnComprobanteDigDTO = null;
        System.out.println("peticionCadena.getCnFolio()" + peticionCadena.getCnFolio());
        System.out.println("peticionCadena.getCnPaquete()" + peticionCadena.getCnPaquete() );
        System.out.println("peticionCadena.getIdNomina()" + peticionCadena.getIdNomina() );
        if(peticionCadena.getCnFolio() != null && peticionCadena.getCnFolio() > 0 ){
             TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(peticionCadena.getCnFolio(), 9, peticionCadena.getCnPaquete() );
            listaTnComprobanteDigDTO = new ArrayList<TnComprobanteDigDTO>();
            listaTnComprobanteDigDTO.add(tnComprobanteDigDTO);
            System.out.println("peticionCadena.getCnFolio()" + peticionCadena.getCnFolio());
        } else {
            listaTnComprobanteDigDTO = super.getService(TimbradoSatService.class).getCadenaOriginalByIdNomina( peticionCadena.getIdNomina());    
        }
        
        List<ComponenteXmlDTO> listaComponenteXmlDTO =  super.transformation().map(listaTnComprobanteDigDTO, ComponenteXmlDTO.class);
        RespuestaCadena respuestaCadena = new RespuestaCadena();
        respuestaCadena.setCadenas(listaComponenteXmlDTO);
        respuestaCadena.setIdNomina(peticionCadena.getIdNomina());
        respuestaCadena.setCnFolio(peticionCadena.getCnFolio() );
        respuestaCadena.setCnPaquete(peticionCadena.getCnPaquete() );
        File p12File = new File(super.configuration().getString("timbrado.dir") + File.separator + super.configuration().getString("timbrado", "SIREH_TIMBRADO_CSD_FILENAME_P12"));
        byte[] bytesArray = new byte[(int) p12File.length()]; 
        FileInputStream fis = new FileInputStream(p12File);
          fis.read(bytesArray); //read file into bytes[]
          fis.close();
        respuestaCadena.setResource(DatatypeConverter.printBase64Binary(bytesArray));
        System.out.println("peticionCadena.getCnFolio()" + respuestaCadena.getCadenas().size() );
        System.out.println("peticionCadena.getCnFolio()" + respuestaCadena.getResource() );
        
        return respuestaCadena;
    }
    
    @RequestMapping(value={"/guardarCadenas"},method={RequestMethod.POST})
       public @ResponseBody RespuestaCadena guardarCadenas(@RequestBody RespuestaCadena respuestaCadena) throws Exception{
        System.out.println("RespuestaCadena");
        System.out.println(
                  "idNomina:"+respuestaCadena.getIdNomina() );
        List<ComponenteXmlDTO> listaCadenas = respuestaCadena.getCadenas();
        if(respuestaCadena.getCnFolio() != null && respuestaCadena.getCnFolio() > 0){
            TnComprobanteDigDTO tnComprobanteDigDTO = super.getService(TimbradoSatService.class).getTnComprobanteDigById(respuestaCadena.getCnFolio(), 9, respuestaCadena.getCnPaquete() );
            tnComprobanteDigDTO.setCnCadenaSello(listaCadenas.get(0).getCnCadenaSello() );
            tnComprobanteDigDTO.setCnRefTimbrado("F");
            super.getService(TimbradoSatService.class).updateTnComprobanteDig(tnComprobanteDigDTO);
        } else {
            super.getService(TimbradoSatService.class).processSatSelloTnComprobanteDig(respuestaCadena.getIdNomina(), listaCadenas, respuestaCadena.isValido());
        }
        return respuestaCadena;
    }
}
