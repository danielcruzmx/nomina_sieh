package gob.shcp.sireh.control;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.control.nomina.calculo.CalculoNominaController;

import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;

import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SirehUtil extends AbstractController implements AnnotatedController {
    
    @RequestMapping
    public String muestraDetallePorRFCconTag(Model model, @RequestParam("rfcEmpleado") String rfc, PagoDTO pagoDTO) {
        logger.debug("--> muestraDetallePorRFCconTag(" + rfc + ")");

        if (rfc == null || rfc.trim().length() == 0) {
            pagoDTO.setBaseUrl("muestraDetallePorRFCconTag");
            
            super.saveMessage(model, "nomina.calculo.rfcnoencontrado", rfc);
            pagoDTO.setRfcNoEncontrado(true);
            
            logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("pagadosConsultaGlobal");
        }
         
        CalculoNominaService service = super.getService(CalculoNominaService.class);
        rfc = rfc.trim();

        // Se invoca a drools y se inserta en base.
        PagoDTO newPagoDTO = null;
        try {
            newPagoDTO = service.calcByRFC(rfc);
        } catch (Exception e) {
            logger.debug("Exception --------->" + e.toString());
            
            pagoDTO.setBaseUrl("muestraDetallePorRFCconTag");
            
            super.saveMessage(model, "nomina.calculo.rfcnoencontrado", rfc);
            pagoDTO.setRfcNoEncontrado(true);
            
            logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("pagadosConsultaGlobal");
        }
        
        if (newPagoDTO == null) {
            pagoDTO.setBaseUrl("muestraDetallePorRFCconTag");
            
            super.saveMessage(model, "nomina.calculo.rfcnoencontrado", rfc);
            pagoDTO.setRfcNoEncontrado(true);
            
            logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("pagadosConsultaGlobal");
        } else {
            pagoDTO = newPagoDTO;
        }
        
        StringBuffer cadenaConceptosPago = new StringBuffer();
        List<TnConceptoPagadoDTO> conceptosPagados = pagoDTO.getConceptosPagados();
        //TODO: Solo prueba
        //List<TnConceptoPagadoDTO> conceptosPagados2 = new ArrayList<TnConceptoPagadoDTO>();
        Collections.sort(conceptosPagados);
        
        for (TnConceptoPagadoDTO conceptoPagado: conceptosPagados) {
            cadenaConceptosPago.append(conceptoPagado.getIdTipoCpto()).append(";").append(conceptoPagado.getIdCptoPago()).append(";").append(conceptoPagado.getCpMonto()).append("|\n");
            
            /*if (conceptoPagado.getIdTipoCpto().equals("D") && conceptoPagado.getIdCptoPago().equals("01")) {
                conceptoPagado.setCpMonto(new Double("1826.35"));
            }
            conceptosPagados2.add(conceptoPagado);*/
        }
        logger.debug("conceptosPagados -> " + cadenaConceptosPago.toString());
        
        // Se setean las descripciones para los nuevos conceptos pagados.
        CalculoNominaController.setDescripcionesConceptosPagados(service.getDescripcionesConceptosPago(), conceptosPagados);
        
        //TODO: Solo prueba
        //pagoDTO.setConceptosPagados(conceptosPagados2);
        
        // Se calcula el liquido a pagar.
        pagoDTO.calculaLiquido();
        pagoDTO.setRfcEmpleado(rfc);

        QnaCapturaDTO qnaCapturaDTO = super.getService(GestionNominaService.class).getQuincenaVigente();
        pagoDTO.setNumQuincena(Integer.valueOf(qnaCapturaDTO.getQuincena()));
        pagoDTO.setNumAnio(Integer.valueOf(qnaCapturaDTO.getAnio()));
        
        pagoDTO.setBaseUrl("muestraDetallePorRFCconTag");
        logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
        
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("pagadosConsultaGlobal");
    }

    @RequestMapping
    public String muestraDetallePorPlazaconTag(Model model, @RequestParam("idPlaza") String idPlaza, PagoDTO pagoDTO) {
        logger.debug("--> muestraDetallePorPlazaconTag(" + idPlaza + ")");

        if (idPlaza == null || idPlaza.trim().length() == 0) {
            pagoDTO.setBaseUrl("muestraDetallePorPlazaconTag");
            super.saveMessage(model, "nomina.calculo.plazanoencontrada", idPlaza);
            
            pagoDTO.setRfcNoEncontrado(true);
            logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
            
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("pagadosConsultaGlobal");
        }

        CalculoNominaService service = super.getService(CalculoNominaService.class);

        idPlaza = idPlaza.trim();

        // Se invoca a drools y se inserta en base.
        PagoDTO newPagoDTO = service.calcByPlaza(idPlaza);
        if (newPagoDTO == null) {
            pagoDTO.setBaseUrl("muestraDetallePorPlazaconTag");
            super.saveMessage(model, "nomina.calculo.plazanoencontrada", idPlaza);
            
            pagoDTO.setRfcNoEncontrado(true);
            logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
            
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("pagadosConsultaGlobal");
        } else {
            pagoDTO = newPagoDTO;
        }
        
        StringBuffer cadenaConceptosPago = new StringBuffer();
        List<TnConceptoPagadoDTO> conceptosPagados = pagoDTO.getConceptosPagados();
        Collections.sort(conceptosPagados);
        
        for (TnConceptoPagadoDTO conceptoPagado: conceptosPagados) {
            cadenaConceptosPago.append(conceptoPagado.getIdTipoCpto()).append(";").append(conceptoPagado.getIdCptoPago()).append(";").append(conceptoPagado.getCpMonto()).append("|\n");
        }
        logger.debug("conceptosPagados -> " + cadenaConceptosPago.toString());

        // Se setean las descripciones para los nuevos conceptos pagados.
        CalculoNominaController.setDescripcionesConceptosPagados(service.getDescripcionesConceptosPago(), conceptosPagados);

        // Se calcula el liquido a pagar.
        pagoDTO.calculaLiquido();
        pagoDTO.setBusquedaPorPlaza(true);

        QnaCapturaDTO qnaCapturaDTO = super.getService(GestionNominaService.class).getQuincenaVigente();
        pagoDTO.setNumQuincena(Integer.valueOf(qnaCapturaDTO.getQuincena()));
        pagoDTO.setNumAnio(Integer.valueOf(qnaCapturaDTO.getAnio()));
        
        pagoDTO.setBaseUrl("muestraDetallePorPlazaconTag");
        logger.debug("getBaseUrl -> " + pagoDTO.getBaseUrl());
        
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("pagadosConsultaGlobal");
    }
}
