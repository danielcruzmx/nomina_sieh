package test.nomina.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.nomina.model.Respuesta;


/**
 *
 * @author omar_gomez
 */
@RestController
@RequestMapping("/service")
public class ServiceController {
    
    @RequestMapping(value = "/respuesta", method = RequestMethod.POST)
    public void respuesta(@RequestBody Respuesta respuesta){
        System.out.println("CodRespuesta:"+respuesta.getCodRespuesta()+","+
                  "IdPaquete:"+respuesta.getIdPaquete()+","+
                  "Respuesta:"+respuesta.getRespuesta()+","+
                  "UriSalida:"+respuesta.getUriSalida());
    }
}
