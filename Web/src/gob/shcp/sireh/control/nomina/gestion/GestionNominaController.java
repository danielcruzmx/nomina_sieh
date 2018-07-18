package gob.shcp.sireh.control.nomina.gestion;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.gestion.CierreNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.ConsultaNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GestionNominaController extends AbstractController implements AnnotatedController {

    private static final String consultaViewName = "listaNominas";
    private static final String consultaViewNameCierre = "cierreNomina";
    private static final String consultaViewNameCierreAfter = "cierreNominaAfter";
    private static final String mantenimientoViewName = "modificacionNomina";

    private static final int numQuincenasAMostrar = 24;

    @RequestMapping
    public String consultaNominas(Model model, ConsultaNominaDTO consultaNominaDTO) {
        if (consultaNominaDTO.isCancel()) {
            consultaNominaDTO = new ConsultaNominaDTO();
        }
        consultaNominaDTO.setUrlOrigen("consultaNominas");
        consultaNominaDTO.setUrlDestino("consultaNominas");
        consultaNominaDTO.setBeanName("listaNominas");

        if (consultaNominaDTO.getTipoNomina() != null && !consultaNominaDTO.getTipoNomina().equals("")) {
            List<String> listIdTipoNomina = new ArrayList<String>();
            listIdTipoNomina.add(consultaNominaDTO.getTipoNomina());
            if (consultaNominaDTO.getTipoNomina().equals("DJ")) {
                listIdTipoNomina.add("DE");
            }
            consultaNominaDTO.setListIdTipoNomina(listIdTipoNomina);
        }
        model.addAttribute(consultaNominaDTO);
        return super.getViewName(this.consultaViewName);
    }

    @RequestMapping
    public String altaNomina(Model model) {
        GestionNominaService gestionNominaService = super.getService(GestionNominaService.class);

        final NominaDTO nominaDTO = new NominaDTO();
        nominaDTO.setTipoMantenimiento("A");
        nominaDTO.setListadoQuincenas(gestionNominaService.getListadoNominas(numQuincenasAMostrar));

        QnaCapturaDTO qnaVigente = gestionNominaService.getQuincenaVigente();
        Date fecIni = qnaVigente.getInicioQuincena();
        Date fecFin = qnaVigente.getFinQuincena();

        nominaDTO.setNomIniPago(fecIni);
        nominaDTO.setNomFinPago(fecFin);
        nominaDTO.setNomFecPago(fecFin);
        nominaDTO.setNomFecDeposito(fecFin);
        nominaDTO.setNomFecApertura(fecIni);
        nominaDTO.setNomFecCierre(fecFin);
        model.addAttribute(nominaDTO);
        return super.getViewName(this.mantenimientoViewName);
    }
    
    @RequestMapping
    public String consultaNominasCierre(Model model, CierreNominaDTO cierreNominaDTO) {
        cierreNominaDTO.setQnaPago(super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger());
        model.addAttribute(cierreNominaDTO);
        return super.getViewName(this.consultaViewNameCierre);
    }
    
    /**
     * Metodo encargado de procesar el cierre de nóminas de la quincena vigente.
     * @author Oscar S.
     * @param model Model
     * @param cierreNominaDTO CierreNominaDTO
     * @return String
     */
    @RequestMapping
    public String cierreNomina(Model model, CierreNominaDTO cierreNominaDTO) {
        try {
            cierreNominaDTO.setQnaPago(super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger());
            
            /*if (cierreNominaDTO.getQnaPago() != null) {
                if (super.getService(CalculoNominaService.class).validaCierreNomina(cierreNominaDTO.getQnaPago())) {
                    super.getService(CalculoNominaService.class).cierreNomina(cierreNominaDTO.getQnaPago());
                } else {
                    super.saveError(model, "nomina.gestion.cierre.error.procesadas", cierreNominaDTO.getQnaPago());
                }
            } else {
                super.saveError(model, "nomina.gestion.cierre.error.qnaPago");
            }*/
            super.getService(CalculoNominaService.class).cierreNomina(cierreNominaDTO.getQnaPago());
            
            super.saveMessage(model, "nomina.gestion.cierre.ok", cierreNominaDTO.getQnaPago());
        } catch (Exception e) {
            super.saveError(model, "nomina.gestion.cierre.error");
        }
        model.addAttribute(cierreNominaDTO);
        return super.getViewName(this.consultaViewNameCierreAfter);
    }

    @RequestMapping
    public String modificacionNomina(Model model, @RequestParam("idQna") Integer id) {
        final NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNomina(id);
        nominaDTO.setTipoMantenimiento("M");
        model.addAttribute(nominaDTO);
        return super.getViewName(this.mantenimientoViewName);
    }

    @RequestMapping
    public String insertNomina(Model model, NominaDTO nominaDTO) {
        GestionNominaService service = super.getService(GestionNominaService.class);
        int nextComplemento = service.getNextComplemento(nominaDTO);

        Long idNomina;
        int numComplemento = Integer.parseInt(nominaDTO.getNomNumComplem());

        if (nextComplemento <= numComplemento) {
            if (!nominaDTO.getIdTipoNomina().equals("AG")) {
                nominaDTO.setNomGratifAgui("");
                nominaDTO.setNomDiasPagar(0);
                nominaDTO.setNomAplicarExentos("");
                nominaDTO.setNomCompletarPeriodo("");
                nominaDTO.setNomVigente("");
            }
            idNomina = service.insertNomina(nominaDTO, super.identity().get().getUserID());
        } else {
            model.addAttribute(nominaDTO);
            super.saveError(model, "nomina.gestion.getNextComplemento.error", numComplemento, nextComplemento);
            return super.getViewName(this.mantenimientoViewName);
        }
        super.saveMessage(model, "nomina.gestion.alta.ok", idNomina);
        
        ConsultaNominaDTO consultaNominaDTO = new ConsultaNominaDTO();
        consultaNominaDTO.setUrlOrigen("consultaNominas");
        consultaNominaDTO.setUrlDestino("consultaNominas");
        consultaNominaDTO.setBeanName("listaNominas");
        return consultaNominas(model, consultaNominaDTO);
    }

    @RequestMapping
    public String updateNomina(Model model, NominaDTO nominaDTO) {
        if (!nominaDTO.getIdTipoNomina().equals("AG")) {
            nominaDTO.setNomGratifAgui("");
            nominaDTO.setNomDiasPagar(0);
            nominaDTO.setNomAplicarExentos("");
            nominaDTO.setNomCompletarPeriodo("");
            nominaDTO.setNomVigente("");
        }
    
        super.getService(GestionNominaService.class).updateNomina(nominaDTO, super.identity().get().getUserID());
        super.saveMessage(model, "nomina.gestion.update.ok", nominaDTO.getIdNomina());
        
        ConsultaNominaDTO consultaNominaDTO = new ConsultaNominaDTO();
        consultaNominaDTO.setUrlOrigen("consultaNominas");
        consultaNominaDTO.setUrlDestino("consultaNominas");
        consultaNominaDTO.setBeanName("listaNominas");
        return consultaNominas(model, consultaNominaDTO);
    }

    @RequestMapping
    public String cancelarNomina(Model model) {
        ConsultaNominaDTO consultaNominaDTO = new ConsultaNominaDTO();
        consultaNominaDTO.setUrlOrigen("consultaNominas");
        consultaNominaDTO.setUrlDestino("consultaNominas");
        consultaNominaDTO.setBeanName("listaNominas");
        return consultaNominas(model, consultaNominaDTO);
    }
    
    @RequestMapping
    public String acumConcentPercepDeduc(Model model, ConsultaNominaDTO consultaNominaDTO){
        logger.debug("*********** Acumulado para el concentrado de percepciones y deducciones ");
        
        if (consultaNominaDTO.isCancel()) {
            consultaNominaDTO = new ConsultaNominaDTO();
        }
        if(consultaNominaDTO.getQuincena() != null){  consultaNominaDTO.setMuestraRegistros(true);  }
        consultaNominaDTO.setUrlOrigen("acumConcentPercepDeduc");
        consultaNominaDTO.setUrlDestino("acumConcentPercepDeduc");
        consultaNominaDTO.setBeanName("listaNominasACPD");
        
        model.addAttribute(consultaNominaDTO);
        return super.getViewName("acumuladoConcentradoPD");
    }
    
    @RequestMapping
    public String processAcumuConcentrPercepcDeduc(Model model, ConsultaNominaDTO consultaNominaDTO, @RequestParam("idQna") String id){
        logger.debug("******** processAcumuConcentrPercepcDeduc **************");
        
        logger.debug("idQna= " + id);
        super.getService(GestionNominaService.class).processAcumuConcentrPercepcDeduc(new Integer(id));
        super.saveMessage(model, "nomina.calculo.procesada.acumulado.concentrado", id);
        consultaNominaDTO.setQuincena(null);
        return acumConcentPercepDeduc(model, consultaNominaDTO );
    }

}
