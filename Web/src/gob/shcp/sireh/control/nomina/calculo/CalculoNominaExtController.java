 package gob.shcp.sireh.control.nomina.calculo;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TnCalculoNominaQnaDTO;
import gob.shcp.sireh.model.TnConceptoPagadoBeneficiarioDTO;
import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.calculo.AsociaPlazaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptosPagNomExtraDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.calculo.incremento.IncrementoNominaDTO;
import gob.shcp.sireh.model.nomina.calculo.incremento.IncrementoNominaMandosDTO;
import gob.shcp.sireh.model.nomina.calculo.vales.ValesNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.jms.NominaJMSService;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaExtraService;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.nomina.calculo.IncrementoNominaService;
import gob.shcp.sireh.service.nomina.calculo.ValesNominaService;

import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import java.io.IOException;
import java.io.PrintWriter;

import java.math.BigDecimal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.ArrayUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculoNominaExtController extends AbstractController implements AnnotatedController {
    
    private static final String formatoDate = "dd/MM/yyyy";

    private static final String idTpNominaLaudo = "LA";
    private static final String idTpNominaPersonalBaja = "OB";
    private static final String idTpNominaIncentivo = "IN";
    private static final String idTpNominaValesDespensa = "VA";
    private static final String idTpNominaDiferencias = "OD";
    private static final String idTpNominaDiferenciasBaja = "DB";
    
    private static final String idTpNominaExtraordinaria = "EX";
    private static final String idTpExtrPerseverancia = "EXP";
    
    private static final String idNominaIncentivo = "IN";
    
    private static final String idTpExtrVivienda = "VE";
    private static final String idTpExtrDiferencias = "CJ";
    private static final String idTpExtrDevoluciones = "DJ";
    private static final String idTpExtrDevolucionesImpto = "DE";
    private static final String idTpExtrSarFovissste = "SA";
    private static final String idTpExtrAgConsejeria = "AC";
    
    private static final String idTpExtrAguinaldo = "AG";
    private static final String idTpExtrAgVigentes = "AGV";
    private static final String idTpExtrAgBajas = "AGB";
    
    private static final String idGrupoPagoEstructura = "E";
    private static final String idGrupoPagoEventual = "V";
    
    // FONAC
    private static final String idTpExtrFonacOrdinaria = "FO";
    private static final String idTpExtrFonacDesincorporados = "FE";
     
    private static final String idTpExtrConReglas = "EXR";

    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Laudo
     * @author Gualberto G.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaLaudos(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaLaudo);
    }

    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Incentivo
     * @author Gualberto G.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaIncentivo(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaIncentivo);
    }

    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Sueldo (Nomina extraordinaria)
     * @author Gualberto G.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaSueldos(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaExtraordinaria);
    }
    
    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Perseverancia y lealtad (Nomina extraordinaria)
     * @author Oscar S.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaPerseverancia(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrPerseverancia);
    }
    
    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Personal de baja
     * @author Gualberto G.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaPersonalBaja(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaPersonalBaja);
    }
    
    @RequestMapping
    public String consultaVivienda(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrVivienda);
    }
    
    @RequestMapping
    public String consultaDiferencias(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrDiferencias);
    }
    
    @RequestMapping
    public String consultaDevoluciones(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrDevoluciones);
    }
    
    @RequestMapping
    public String consultaAguinaldo(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrAgConsejeria);
    }
    
    @RequestMapping
    public String consultaVales(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaValesDespensa);
    }
    
    @RequestMapping
    public String consultaDifVigentes(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaDiferencias);
    }
    
    @RequestMapping
    public String consultaDifBajas(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpNominaDiferenciasBaja);
    }
    
    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo SAR-FOVISSSTE (Nomina extraordinaria)
     * @author Oscar S.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaSarFovissste(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrSarFovissste);
    }
    
    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Aguinaldo - Vigentes (Nomina extraordinaria)
     * @author Oscar S.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaAgVigentes(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrAgVigentes);
    }
    
    /**
     * Metodo encargado de mostrar la vista con las nominas de tipo Aguinaldo - Bajas (Nomina extraordinaria)
     * @author Oscar S.
     * @param model
     * @return String
     */
    @RequestMapping
    public String consultaAgBajas(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrAgBajas);
    }

    /**
     * Metodo encargado de obtener la nomina por grupo de pago estructura -  incentivo.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasIncentivoEst(Model model) {
        return consultaNominasPorTipoNomina(model, idGrupoPagoEstructura, idNominaIncentivo);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago eventual - incentivo.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasIncentivoEve(Model model) {
        return consultaNominasPorTipoNomina(model, idGrupoPagoEventual, idNominaIncentivo);
    }
    
    @RequestMapping
    public String liquidacionAnticipada(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrFonacDesincorporados );
    }
    
    @RequestMapping
    public String finCiclo(Model model) {
        return consultaNominasPorTipoNomina(model, null, idTpExtrFonacOrdinaria);
    }

    /**
     * Metodo encargado de regresar a la consulta de nominas.
     * @author Oscar S.
     * @param model
     * @param pagoDTO PagoDTO
     * @return String
     */
    @RequestMapping
    public String cancelarCalculoNomina(Model model, PagoDTO pagoDTO) {
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(pagoDTO.getIdQna());
        String idTipoNomina = nominaDTO.getIdTipoNomina();
        
        if (idTipoNomina.equals(idTpNominaLaudo)) {
            return consultaLaudos(model);
            
        } else if (idTipoNomina.equals("EX")) {   
            if (nominaDTO.getDescNomina().equals("PERSERVERANCIA Y LEALTAD")) {
                return consultaPerseverancia(model);
            } else if(pagoDTO.getTipoExtraordinaria().equalsIgnoreCase("R")) {
                return conReglas(model);
            } else {
                return consultaSueldos(model);
            }   
        } else if (idTipoNomina.equals(idTpNominaPersonalBaja)) {
            return consultaPersonalBaja(model);
            
        } else if (idTipoNomina.equals(idTpNominaIncentivo)) {
            return consultaIncentivo(model);
            
        } else if (idTipoNomina.equals(idTpExtrVivienda)) {
            return consultaVivienda(model);
            
        } else if (idTipoNomina.equals(idTpExtrDiferencias)) {
            return consultaDiferencias(model);
            
        } else if (idTipoNomina.equals(idTpExtrDevoluciones) || idTipoNomina.equals(idTpExtrDevolucionesImpto)) {
            return consultaDevoluciones(model);
            
        } else if (idTipoNomina.equals(idTpExtrAgConsejeria)) {
            return consultaAguinaldo(model);    
            
        } else if (idTipoNomina.equals(idTpNominaValesDespensa)) {
            return consultaVales(model);
            
        } else if (idTipoNomina.equals(idTpExtrPerseverancia)) {
            return consultaPerseverancia(model);
            
        } else if (idTipoNomina.equals(idTpNominaDiferencias)) {
            return consultaDifVigentes(model);
            
        } else if (idTipoNomina.equals(idTpNominaDiferenciasBaja)) {
            return consultaDifBajas(model);

        } else if (idTipoNomina.equals(idTpExtrSarFovissste)) {
            return consultaSarFovissste(model);
        } else if (idTipoNomina.equals(idTpExtrFonacOrdinaria)) {
            return finCiclo(model);
        } else if (idTipoNomina.equals(idTpExtrFonacDesincorporados)) {
            return liquidacionAnticipada(model);
        } else if (idTipoNomina.equals("AG")) {   
            if (nominaDTO.getNomVigente().equals("V")) {
                return consultaAgVigentes(model);
            } else {
                return consultaAgBajas(model);
            }
        }
        return "";
    }
    
    /** 
     * Metodo encargado de finalizar la nomina extraordinaria
     * @author Gualberto G.
     * @param model
     * @param pagoDTO
     * @return String
     */
    @RequestMapping
    public String finalizar(Model model, PagoDTO pagoDTO) {
        // Actualizar el status a Procesando en la nomina seleccionada.
        super.getService(CalculoNominaExtraService.class).updateStatusProcesandoNominaQna(pagoDTO.getIdQna());
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(pagoDTO.getIdQna());
        
        // Se invoca el servicio de JMS para invocar el store de finalizacion de la nomina, asincronicamente.
        super.getService(NominaJMSService.class).sendNomina(pagoDTO.getIdQna(), 0, "x",  true);
        super.saveMessage(model, "nomina.calculo.procesada", pagoDTO.getIdQna());
        
        //return consultaNominasPorTipoNomina(model, nominaDTO.getIdTipoNomina());
         String idTipoNomina = nominaDTO.getIdTipoNomina();
         
         if (idTipoNomina.equals(idTpNominaLaudo)) {
             return consultaLaudos(model);
             
         } else if (idTipoNomina.equals(idTpNominaExtraordinaria)) {   
             if (nominaDTO.getDescNomina().equals("PERSERVERANCIA Y LEALTAD")) {
                 return consultaPerseverancia(model);
             } else {
                 return consultaSueldos(model);
             }   
         } else if (idTipoNomina.equals(idTpNominaPersonalBaja)) {
             return consultaPersonalBaja(model);
             
         } else if (idTipoNomina.equals(idTpNominaIncentivo)) {
             return consultaIncentivo(model);
             
         } else if (idTipoNomina.equals(idTpExtrVivienda)) {
             return consultaVivienda(model);
             
         } else if (idTipoNomina.equals(idTpExtrDiferencias)) {
             return consultaDiferencias(model);
             
         } else if (idTipoNomina.equals(idTpExtrDevoluciones) || idTipoNomina.equals(idTpExtrDevolucionesImpto)) {
             return consultaDevoluciones(model);
         } else if (idTipoNomina.equals(idTpExtrAgConsejeria)) {
             return consultaAguinaldo(model);    
         } else if (idTipoNomina.equals(idTpNominaValesDespensa)) {
             return consultaVales(model);
             
         } else if (idTipoNomina.equals(idTpExtrPerseverancia)) {
             return consultaPerseverancia(model);
             
         } else if (idTipoNomina.equals(idTpNominaDiferencias)) {
             return consultaDifVigentes(model);
             
         } else if (idTipoNomina.equals(idTpNominaDiferenciasBaja)) {
             return consultaDifBajas(model);
             
         } else if (idTipoNomina.equals(idTpExtrSarFovissste)) {
            return consultaSarFovissste(model);
        } else if (idTipoNomina.equals(idTpExtrFonacOrdinaria)) {
            return finCiclo(model);
        } else if (idTipoNomina.equals(idTpExtrFonacDesincorporados)) {
            return liquidacionAnticipada(model);
             
         } else if (idTipoNomina.equals("AG")) {   
             if (nominaDTO.getNomVigente().equals("V")) {
                 return consultaAgVigentes(model);
             } else {
                 return consultaAgBajas(model);
             }
         }
         return "";
    }
    
    /**
     * Metodo encargado de cancelar la asociacion de el empleado con la plaza. Direcciona a la pagina del listado de rfc
     * @author Gualberto G.
     * @param model
     * @param asociaPlazaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String cancelarAsociacion(Model model, AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(asociaPlazaEmpleadoDTO.getIdNomina());
        String idTipoNomina = nominaDTO.getIdTipoNomina();
        if (idTipoNomina != null && idTipoNomina.equals("AG")){
            if(nominaDTO.getNomVigente() != null && nominaDTO.getNomVigente().equals("V")){
                idTipoNomina = idTipoNomina + "V";
            }
            if(nominaDTO.getNomVigente() != null && nominaDTO.getNomVigente().equals("N")){
                idTipoNomina = idTipoNomina + "B";
            }
            nominaDTO.setIdTipoNomina(idTipoNomina);
        }
        return consultaNominasPorTipoNomina(model, null, nominaDTO.getIdTipoNomina());
    }
    
    /**
     * Metodo encargado de buscar nóminas de aguinaldo.
     * @author Oscar S.
     * @param model Model
     * @param pagoDTO PagoDTO
     * @return String
     */
    @RequestMapping
    public String consultaNominasAguinaldo(Model model, PagoDTO pagoDTO) {
        if (pagoDTO.isCancel()) {
            String agVigente = pagoDTO.getAgVigente();
            pagoDTO = new PagoDTO();
            pagoDTO.setAgVigente(agVigente);
            pagoDTO.setViewName(pagoDTO.getAgVigente().equals("V") ? "consultaAgVigentes": "consultaAgBajas");
        }
        logger.debug("agVigente ------------->" + pagoDTO.getAgVigente());
        
        model.addAttribute("pagoDTO", pagoDTO);
        return consultaNominasPorTipoNominaAg(model, pagoDTO, pagoDTO.getAgVigente().equals("V") ? "AGV": "AGB");
    }
    
    /**
     * Metodo encargado de listar nominas de aguinaldo por tipo de nómina.
     * @author Oscar S.
     * @param model Model
     * @param pagoDTO PagoDTO
     * @param idTipoNomina String
     * @return String
     */
    @RequestMapping
    public String consultaNominasPorTipoNominaAg(Model model, PagoDTO pagoDTO, String idTipoNomina) {        
        if (idTipoNomina.equals("AGV") || idTipoNomina.equals("AGB")) {
            pagoDTO.setIdTipoNomina("AG");
        } else {
            pagoDTO.setIdTipoNomina(idTipoNomina);
        }
        
        Integer quincenaActual = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();

        if (idTipoNomina.equals("AGV") || idTipoNomina.equals("AGB")) {
            // Quincena anterior
            
            pagoDTO.setQuincenaAnterior(SirehUtils.substractQuincena(quincenaActual, 6));
            logger.debug("Quincena anterior --------------> " + pagoDTO.getQuincenaAnterior());
        } else {
            // Quincena anterior
            pagoDTO.setQuincenaAnterior(SirehUtils.substractQuincena(quincenaActual, 1));
            logger.debug("Quincena anterior --------------> " + pagoDTO.getQuincenaAnterior());
        }
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoNomina");
    }
    
    /**
     * Metodo encargado de mostrar el listado de nominas segun su tipo
     * @author Gualberto G.
     * @param model
     * @param idTipoNomina
     * @return String
     */
    @RequestMapping
    public String consultaNominasPorTipoNomina(Model model, @RequestParam("idGrupoPago") String idGrupoPago, @RequestParam("idTipoNomina") String idTipoNomina) {
        PagoDTO pagoDTO = new PagoDTO();
        List<String> listIdTipoNomina = new ArrayList<String>();
        if (idTipoNomina.equals("AGV") || idTipoNomina.equals("AGB")) {
            listIdTipoNomina.add("AG");
            pagoDTO.setIdTipoNomina("AG");
        } else if (idTipoNomina.equals("EX") || idTipoNomina.equals("EXP") || idTipoNomina.equals("EXR") ) {
            listIdTipoNomina.add("EX");
            pagoDTO.setIdTipoNomina("EX");
        } else if ( idTipoNomina.equals(idTpExtrDevoluciones) || idTipoNomina.equals(idTpExtrDevolucionesImpto) ) {
            listIdTipoNomina.add(idTpExtrDevoluciones);
            listIdTipoNomina.add(idTpExtrDevolucionesImpto);
            pagoDTO.setIdTipoNomina(idTpExtrDevoluciones);
        } else {
            pagoDTO.setIdTipoNomina(idTipoNomina);
            listIdTipoNomina.add(idTipoNomina);
        }
        
        
        
        if (idTipoNomina.equals(idTpNominaLaudo)) {
            pagoDTO.setViewName("consultaLaudos");
        } else if (idTipoNomina.equals(idTpNominaExtraordinaria)) {
            pagoDTO.setViewName("consultaSueldos");
            pagoDTO.setTipoExtraordinaria("S");
        } else if (idTipoNomina.equals(idTpExtrPerseverancia)) {
            pagoDTO.setViewName("consultaPerseverancia");
            pagoDTO.setTipoExtraordinaria("P");
            
        } else if (idTipoNomina.equals(idTpExtrConReglas)) {
            pagoDTO.setViewName("conReglas");
            pagoDTO.setTipoExtraordinaria("R");
            
        } else if (idTipoNomina.equals(idTpNominaPersonalBaja)) {
            pagoDTO.setViewName("consultaPersonalBaja");
            
        } else if (idTipoNomina.equals(idTpNominaIncentivo)) {
            pagoDTO.setViewName("consultaIncentivo");
            
        } else if (idTipoNomina.equals(idTpExtrVivienda)) {
            pagoDTO.setViewName("consultaVivienda");
            
        } else if (idTipoNomina.equals(idTpExtrDiferencias)) {
            pagoDTO.setViewName("consultaDiferencias");
            
        } else if (idTipoNomina.equals(idTpExtrDevoluciones)) {
            pagoDTO.setViewName("consultaDevoluciones");
        
        } else if (idTipoNomina.equals(idTpExtrAgConsejeria)) {
            pagoDTO.setViewName("consultaAguinaldo");
            
        } else if (idTipoNomina.equals(idTpNominaValesDespensa)) {
            pagoDTO.setViewName("consultaVales");
            
        } else if (idTipoNomina.equals(idTpNominaDiferencias)) {
            pagoDTO.setViewName("consultaDifVigentes");
        } else if (idTipoNomina.equals(idTpNominaDiferenciasBaja)) {
            pagoDTO.setViewName("consultaDifBajas");
            
        } else if (idTipoNomina.equals(idTpExtrSarFovissste)) {
            pagoDTO.setViewName("consultaSarFovissste");
            
        } else if (idTipoNomina.equals(idTpExtrAgVigentes)) {
            pagoDTO.setViewName("consultaAgVigentes");
            pagoDTO.setAgVigente("V");
        } else if (idTipoNomina.equals(idTpExtrAgBajas)) {
            pagoDTO.setViewName("consultaAgBajas");
            pagoDTO.setAgVigente("N");
        } else if (idTipoNomina.equals(idTpExtrFonacOrdinaria)) {
            pagoDTO.setViewName("finCiclo");
        } else if (idTipoNomina.equals(idTpExtrFonacDesincorporados)) {
            pagoDTO.setViewName("liquidacionAnticipada");
        }
        
        Integer quincenaActual = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        
        // SAR-FOVISSSTE
        if (idTipoNomina.equals(idTpExtrSarFovissste)) {
            // Quincena anterior
            pagoDTO.setQuincenaAnterior(SirehUtils.substractQuincena(quincenaActual, 1));
            logger.debug("Quincena anterior -------------> " + pagoDTO.getQuincenaAnterior());
        } else if (idTipoNomina.equals("AGV") || idTipoNomina.equals("AGB")) {
            // Quincena anterior
            pagoDTO.setQuincenaAnterior(SirehUtils.substractQuincena(quincenaActual, 6));
            logger.debug("Quincena anterior --------------> " + pagoDTO.getQuincenaAnterior());
        } else {
            // Quincena anterior
            pagoDTO.setQuincenaAnterior(SirehUtils.substractQuincena(quincenaActual, 1));
            logger.debug("Quincena anterior --------------> " + pagoDTO.getQuincenaAnterior());
        }
        
        Integer quincenaResta = SirehUtils.substractQuincena(quincenaActual, 1);
        
        if (idGrupoPago != null && idTipoNomina != null && 
            idGrupoPago.equals(idGrupoPagoEstructura) && idTipoNomina.equals(idNominaIncentivo)) {
            pagoDTO.setViewName("consultaNominasIncentivoEst");
            pagoDTO.setQuincenaProceso(quincenaResta);
            pagoDTO.setIdGrupoPago(idGrupoPago);
        } else if (idGrupoPago != null && idTipoNomina != null &&
            idGrupoPago.equals(idGrupoPagoEventual) && idTipoNomina.equals(idNominaIncentivo)) {
            pagoDTO.setViewName("consultaNominasIncentivoEve");
            pagoDTO.setQuincenaProceso(quincenaResta);
            pagoDTO.setIdGrupoPago(idGrupoPago);
        }
        pagoDTO.setListIdTipoNomina(listIdTipoNomina);
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoNomina");
    }
    
    /**
     * Metodo encargado de obtener la quincena posterior con base en la quincena actual.
     * @author Oscar S.
     * @param quincenaActual Integer
     * @return Integer
     */
    private Integer getQuincenaPosterior(Integer quincenaActual) {
        int ciclo = Integer.parseInt(quincenaActual.toString().substring(0, 4));
        String quincena = String.valueOf(quincenaActual).substring(4, 6);
        String quincenaResta = "";
        
        if (quincena.equals("24")) {
            quincenaResta = "01";
            ciclo = ciclo + 1;
        } else if (quincena.equals("23") || quincena.equals("22") || quincena.equals("21") || 
                   quincena.equals("20") || quincena.equals("19") || quincena.equals("18") || 
                   quincena.equals("17") || quincena.equals("16") || quincena.equals("15") || 
                   quincena.equals("14") || quincena.equals("13") || quincena.equals("12") || 
                   quincena.equals("11") || quincena.equals("10")) {
            quincenaResta = String.valueOf(new Integer(quincena) + 1); // TODO: Solo pruebas sumar 3
        } else {
            quincenaResta = "0" + String.valueOf(new Integer(quincena) + 1);
        }
        return new Integer(ciclo + quincenaResta);
    }
    
    /**
     * Metodo encargado de obtener la quincena anterior con base en la quincena actual.
     * @author Oscar S.
     * @param quincenaActual Integer
     * @return Integer
     */
    private Integer getQuincenaAnterior(Integer quincenaActual, int restaQuincenas) {
        int ciclo = Integer.parseInt(quincenaActual.toString().substring(0, 4));
        String quincena = String.valueOf(quincenaActual).substring(4, 6);
        String quincenaResta = "";
        if (quincena.equals("01")) {
            quincenaResta = "24";
            ciclo = ciclo - 1;
        } else if (quincena.equals("24") || quincena.equals("23") || quincena.equals("22") || quincena.equals("21") || 
                   quincena.equals("20") || quincena.equals("19") || quincena.equals("18") || quincena.equals("17") || 
                   quincena.equals("16") || quincena.equals("15") || quincena.equals("14") || quincena.equals("13") || 
                   quincena.equals("12") || quincena.equals("11")) {
            quincenaResta = String.valueOf(new Integer(quincena) - restaQuincenas);
        } else {
            quincenaResta = "0" + String.valueOf(new Integer(quincena) - restaQuincenas);
        }
        return new Integer(ciclo + quincenaResta);
    }
    
    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author Gualberto G.
     * @param model Model
     * @param idGrupoPago RequestParam
     * @return String
     */
    @RequestMapping
    public String listaRFCsPorGrupoPago(Model model, @RequestParam("idGrupoPago") String idGrupoPago, @RequestParam("idQna") int idQna, @RequestParam("status")
        String status, PagoDTO pagoDTO) {
        logger.debug("--> listaRFCsPorGrupoPago(" + idGrupoPago + "," + idQna + "," + status + ")");
        
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(idQna);     
        pagoDTO.setIdTipoNomina(nominaDTO.getIdTipoNomina());
        pagoDTO.setIdGrupoPago(idGrupoPago);
        pagoDTO.setIdQna(idQna);
        pagoDTO.setStatus(status);
        pagoDTO.setViewName("listaRFCsPorGrupoPago");
        
        // SAR-FOVISSSTE
        if (nominaDTO.getIdTipoNomina().equals("SA")) {
            pagoDTO.setBeanName("listaRfcsCalculoNominaQnaSAR-FOV");
        } else {
            pagoDTO.setBeanName("listaRfcsCalculoNominaQna");
        }
        
        // Aguinaldo
        if (nominaDTO.getIdTipoNomina().equals("AG")) {
            if (nominaDTO.getNomVigente().equals("V")) {
                pagoDTO.setAgVigente("V");
            } else {
                pagoDTO.setAgVigente("N");
            }
        }
        
        // Perseverancia
        if (nominaDTO.getIdTipoNomina().equals("EX")) {
            if (nominaDTO.getDescNomina().equals("PERSERVERANCIA Y LEALTAD")) {
                pagoDTO.setTipoExtraordinaria("P");
            } else if(nominaDTO.getNomReglaCalculo() != null && nominaDTO.getNomReglaCalculo().startsWith("PKG") ){
                pagoDTO.setTipoExtraordinaria("R");
            } else {
                pagoDTO.setTipoExtraordinaria("S");
            }
        }
        
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoRFCs");
    }
    
    @RequestMapping
    public String listaRFCsPorGrupoPagoReprocesoAG(Model model, 
                                                   @RequestParam("idGrupoPago") String idGrupoPago, 
                                                   @RequestParam("idQna") int idQna, 
                                                   @RequestParam("status") String status, 
                                                   PagoDTO pagoDTO) {
        logger.debug("--> listaRFCsPorGrupoPagoReprocesoAG(" + idGrupoPago + "," + idQna + "," + status + ")");
        super.saveMessage(model, "nomina.calculo.procesada", idQna);         
        super.getService(CalculoNominaService.class).updateStatusProcesandoNominaQna(idQna);
        super.getService(NominaJMSService.class).sendNominaAguinado(idQna);
        pagoDTO.setBeanName("listaRfcsCalculoNominaQnaAG");
        
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(idQna);
        if (nominaDTO.getNomVigente().equals("V")) {
            pagoDTO.setAgVigente("V");
        } else {
            pagoDTO.setAgVigente("N");
        }
        return consultaNominasPorTipoNomina(model, null, nominaDTO.getNomVigente().equals("V") ? idTpExtrAgVigentes : idTpExtrAgBajas);
    }
    
    @RequestMapping
    public String listaRFCsPorGrupoPagoReproceso(Model model, 
                                                   @RequestParam("idGrupoPago") String idGrupoPago, 
                                                   @RequestParam("idQna") int idQna, 
                                                   @RequestParam("status") String status, 
                                                   @RequestParam("nomFuenteDatos") String nomFuenteDatos, 
                                                   PagoDTO pagoDTO) {
        logger.debug("--> listaRFCsPorGrupoPagoReproceso(" + idGrupoPago + "," + idQna + "," + status + ")");
        Integer quincenaCaptura =  super.getService(MovimientoNominaService.class).getQuincenaCaptura().intValue();
        int anio = quincenaCaptura / 100;
        NominaDTO nominaDTO = super.getService(CalculoNominaExtraService.class).getNominaDTO(idQna);      
        String idTipoNomina = nominaDTO.getIdTipoNomina();
        super.saveMessage(model, "nomina.calculo.procesada", idQna);         
        super.getService(CalculoNominaService.class).updateStatusProcesandoNominaQna(idQna);
        if(idTipoNomina != null && idTipoNomina.equals(idTpExtrAguinaldo)){
            super.getService(NominaJMSService.class).sendNominaAguinado(idQna);
            pagoDTO.setBeanName("listaRfcsCalculoNominaQnaAG");
            if (nominaDTO.getNomVigente().equals("V")) {
                pagoDTO.setAgVigente("V");
                idTipoNomina = idTpExtrAgVigentes;
            } else {
                pagoDTO.setAgVigente("N");
                idTipoNomina = idTpExtrAgBajas;
            }
        }else if (idTipoNomina != null && idTipoNomina.equals(idTpNominaExtraordinaria)){
            if(nominaDTO.getNomReglaCalculo() != null &&  nominaDTO.getNomReglaCalculo().startsWith("PKG") ){
                idTipoNomina = idTpExtrConReglas;
            }
        }else if (idTipoNomina != null && (idTipoNomina.equals(idNominaIncentivo) || idTipoNomina.equals(idTpNominaExtraordinaria))){
            // Se invoca el servicio de JMS para invocar el store de finalizacion de la nomina, asincronicamente.
            super.getService(NominaJMSService.class).sendNominaGpoPago(idQna, 0, "x",idGrupoPago, nomFuenteDatos, super.security().getOperationYear(), super.security().getDimensions(), super.security().getUserName(), true);
        }else if (idTipoNomina != null && (idTipoNomina.equals(idTpExtrFonacOrdinaria) || idTipoNomina.equals(idTpExtrFonacDesincorporados))){
            Integer qnaIni = (anio - 1) * 100 + 14;
            Integer qnaFinExtraordinaria = quincenaCaptura;
            Integer qnaFinOrdinaria = (anio) * 100 + 13;
            Integer qnaNom = nominaDTO.getNomQnaCaptura();
            SimpleDateFormat sf = new SimpleDateFormat(formatoDate);
            logger.warn("qnaIni " + qnaIni);
            logger.warn("qnaFinOrdinaria " + qnaFinOrdinaria);
            logger.warn("qnaFinExtraordinaria " + qnaFinExtraordinaria);
            logger.warn("qnaNom " + qnaNom);
            if(idTipoNomina.equals(idTpExtrFonacOrdinaria)){
                super.getService(NominaJMSService.class).sendNominaFonac(idQna, qnaIni, qnaFinOrdinaria, qnaNom, null, super.security().getUserName(), sf.format(new java.util.Date()) );
            }
            else if(idTipoNomina.equals(idTpExtrFonacDesincorporados)){
                List<TnCalculoNominaQnaDTO> lista = super.getService(CalculoNominaExtraService.class).getNominasByIdNomina(idQna);
                StringBuilder rfcs = new StringBuilder("");
                if(lista != null && !lista.isEmpty()){
                    rfcs.append("'");
                    for(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO : lista){
                        rfcs.append(tnCalculoNominaQnaDTO.getCnqRfc()).append("','") ;
                    }
                }
                
                String cadenarfcs = rfcs.toString();
                if(cadenarfcs.length() > 0){
                    if(cadenarfcs.endsWith(",'")) {
                        cadenarfcs= cadenarfcs.substring(0, cadenarfcs.length() - 2);
                     }
                }
                logger.warn("idNomina " + idQna);
                logger.warn("cadenarfcs " + cadenarfcs);
                super.getService(NominaJMSService.class).sendNominaFonac(idQna, qnaIni, qnaFinExtraordinaria, qnaNom, cadenarfcs, super.security().getUserName(), sf.format(new java.util.Date()) );
            }
        }
        return consultaNominasPorTipoNomina(model, idGrupoPago, idTipoNomina);
    }
    /**
     * Metodo encargado de pasar a la pantalla que asocia el empleado con la plaza
     * @param model
     * @param pagoDTO
     * @return String
     */
    @RequestMapping
    public String asociarEmpleadoPlaza(Model model, PagoDTO pagoDTO){
        AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO = new AsociaPlazaEmpleadoDTO();
        asociaPlazaEmpleadoDTO.setIdNomina( pagoDTO.getIdQna());
        asociaPlazaEmpleadoDTO.setIdGrupoPagoNomina(pagoDTO.getIdGrupoPago());
        asociaPlazaEmpleadoDTO.setIdTipoNomina(pagoDTO.getIdTipoNomina());
        asociaPlazaEmpleadoDTO.setAgVigente(pagoDTO.getAgVigente());
        // Si la nomina es FONAC se consideran unicamebte enlace y confianza jerarquias 5,7
        if (asociaPlazaEmpleadoDTO.getIdTipoNomina().equals("FO") || asociaPlazaEmpleadoDTO.getIdTipoNomina().equals("FE")) {
            if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("E")) {
                asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoEFO");
            } else if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("V")) {
                asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoVFO");
            }
        } else if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("E")) {
            asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoE");
        } else if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("V")) {
            asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoV");
        } else if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("H")) {
            asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoH");
        } else if (asociaPlazaEmpleadoDTO.getIdGrupoPagoNomina().equals("J")) {
            asociaPlazaEmpleadoDTO.setHelproutineBeanName("plazaPopUpGpoJ");
        }
        
        
        super.getService(CalculoNominaExtraService.class).getQuincenaCaptura(asociaPlazaEmpleadoDTO);
        model.addAttribute("asociaPlazaEmpleadoDTO", asociaPlazaEmpleadoDTO);
        return super.getViewName("asociacionEmpleadoPlaza");
    }

    /**
     * Metodo encargado de invocar el servicio para eliminar registros de la tabla TN_CALCULO_NOMINA_QNA
     * @author Gualberto G.
     * @param model
     * @param pagoDTO
     * @return String
     */
    @RequestMapping
    public String deleteEmpleado(Model model, PagoDTO pagoDTO){
        if(pagoDTO == null || pagoDTO.getCasosMuestra() == null || pagoDTO.getCasosMuestra().length <= 0){
            super.saveError(model, "nominaextraordinaria.calculo.error.seleccionar");
            return listaRFCsPorGrupoPago(model, pagoDTO.getIdGrupoPago(), pagoDTO.getIdQna(), pagoDTO.getStatus(), new PagoDTO());
        }
        super.getService(CalculoNominaExtraService.class).deleteEmpleados(pagoDTO.getCasosMuestra() , pagoDTO.getIdQna());
        super.saveMessage(model, "nominaextraordinaria.calculo.deleteempleados");
         
        return listaRFCsPorGrupoPago(model, pagoDTO.getIdGrupoPago(), pagoDTO.getIdQna(), pagoDTO.getStatus(), new PagoDTO());
    }

    /**
     * Metodo encargado de agregar un empleado a la nomina extraordinaria
     * @author Gualberto G.
     * @param model
     * @param asociaPlazaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String agregarRfcPlaza(Model model, AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        // Se invoca al servicio calcula y agrega el empleado a la tabla de paso tn_calculo_nomina_qna
        PagoDTO pagoDTO = super.getService(CalculoNominaExtraService.class).updateCalculaAgregaEmpleado(asociaPlazaEmpleadoDTO);
        
        model.addAttribute("pagoDTO", pagoDTO);
        super.saveMessage(model, "nominaextraordinaria.calculo.addempleado");
        return listaRFCsPorGrupoPago(model, pagoDTO.getIdGrupoPago(), pagoDTO.getIdQna(), pagoDTO.getStatus(), new PagoDTO());
    }
    
    /**
     * Metodo encargado de hacer una busqueda de rfc's por los datos seleccionados en la pantalla
     * @author Gualberto G
     * @param model
     * @param pagoDTO
     * @return String
     */
    @RequestMapping
    public String buscaRFCsPorGrupoPago(Model model, PagoDTO pagoDTO) {
        return listaRFCsPorGrupoPago(model, pagoDTO.getIdGrupoPago(), pagoDTO.getIdQna(), pagoDTO.getStatus(), pagoDTO);
    }
    
    public static void setDescripcionesConceptosPagados(Collection<TcConceptoPagoDTO> listaConceptosPago, List<TnConceptoPagadoDTO> listaConceptosPagados) {
        // Se vacian los conceptos en un hash para obtener sus descripciones.
        Hashtable<String, String> tablaConceptos = new Hashtable<String, String>();
        String tipo;
        String concepto;
        String descripcion;
        String key;
        String value;
        
        for (TcConceptoPagoDTO conceptoPagoDTO: listaConceptosPago) {
            tipo = conceptoPagoDTO.getIdTipoCpto().trim();
            concepto = conceptoPagoDTO.getIdConcepto().trim();
            descripcion = conceptoPagoDTO.getDescConPag();
            if (descripcion == null || tipo.equals("C")) {
                continue;
            }
            key = tipo + "-" + concepto;
            tablaConceptos.put(key, descripcion);
        }

        // Se setean las descripciones de los conceptos pagados
        TnConceptoPagadoDTO conceptoPagadoDTO;
        
        for (int i = 0; i < listaConceptosPagados.size(); ) {
            conceptoPagadoDTO = listaConceptosPagados.get(i);
            tipo = conceptoPagadoDTO.getIdTipoCpto().trim();
            concepto = conceptoPagadoDTO.getIdCptoPago().trim();
            
            if (tipo.equals("C")) { // Control no se pinta en la vista.
                listaConceptosPagados.remove(i);
                continue;
            }
            key = tipo + "-" + concepto;
            value = tablaConceptos.get(tipo + "-" + concepto);
            conceptoPagadoDTO.setDescConPag(value != null ? value : "");
            i++;
        }

    }
    
    /**
     * Metodo encargado de obtener datos del empledo, plaza y conceptos
     * @author Martin Cano
     * @param model Model
     * @param idGrupoPago String
     * @param idQna String
     * @param idPlaza String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String conceptosNominaExt(Model model, 
                                     @RequestParam("idGrupoPago") String idGrupoPago,
                                     @RequestParam("idQna") String idQna, 
                                     @RequestParam("idPlaza") String idPlaza, 
                                     @RequestParam("rfcEmpleado") String rfcEmpleado,
                                     @RequestParam("status") String status,
                                     @RequestParam("cnqinipago") String cnqinipago) throws IOException, JsonGenerationException, JsonMappingException {

        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagados = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
//        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagadosPercepcionesAux = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
//        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagadosDeduccionesAux = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
        
        TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO = new TnCalculoNominaQnaDTO();
//        TnConceptoPagadoBeneficiarioDTO tnConceptoPagadoDTO = null;
        
        List<String> lConceptos = null;
        String delimiterConceptos = "[|]";
//        String delimiterConcepto = "[;]";
        String[] conceptos = null;
//        String[] concepto = null;
        Date cnqIniPago;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            cnqIniPago = sdf.parse(cnqinipago);
            tnCalculoNominaQnaDTO.setCnqIniPago(cnqIniPago);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        ConceptosPagNomExtraDTO conceptosPagNomExtraDTO = new ConceptosPagNomExtraDTO();
        ConceptosPagNomExtraDTO conceptosPagNomExtraDTOGP = new ConceptosPagNomExtraDTO();
        logger.debug("idNomina: " + idQna + " idPlaza: " + idPlaza + " rfcEmpleado: " + rfcEmpleado + " idGrupoPago: " + idGrupoPago + " Status: " + status + "  cnqinipago:  " + cnqinipago);
        
        tnCalculoNominaQnaDTO.setIdNomina(new Integer(idQna));
        tnCalculoNominaQnaDTO.setIdPlaza(new Integer(idPlaza));
        tnCalculoNominaQnaDTO.setCnqRfc(rfcEmpleado);
        
        /***** TMP_TN_CALCULO_NOMINA_QNA ---> Conceptos de pago ******/
        tnCalculoNominaQnaDTO = super.getService(CalculoNominaExtraService.class).getByIdCalculoNominaQna(tnCalculoNominaQnaDTO);
        
        /***** TC_CONCEPTO_PAGO --->  Datos del empleado ******/
        conceptosPagNomExtraDTO = super.getService(CalculoNominaExtraService.class).getConceptosNominaExtra(rfcEmpleado);
        
        /***** TN_NOMINA, TC_TIPO_NOMINA, TC_GRUPO_PAGO, TN_REG_CONTROL, TC_ESTADO_NOMINA --->  Datos de la nomina (jdbc-sql-defs-drools.queryNominasQnaPorQna) ******/
        NominaDTO nominaDTO = super.getService(CalculoNominaService.class).getNominaByIdExtraordinaria(new Integer(idQna));
        
        // Perseverancia
        if (nominaDTO.getIdTipoNomina().equals("EX")) {
            if (nominaDTO.getDescNomina().equals("PERSERVERANCIA Y LEALTAD")) {
                conceptosPagNomExtraDTO.setTipoExtraordinaria("P");
            } else {
                conceptosPagNomExtraDTO.setTipoExtraordinaria("S");
            }
        }
        
        /*****  --->  (jdbc-sql-defs.datosPlazaByGpoPagoRfc) ******/
        conceptosPagNomExtraDTOGP = super.getService(CalculoNominaExtraService.class).getDatosPlazaByGpoPagoRfc(new Integer(idPlaza), rfcEmpleado);
        
        conceptosPagNomExtraDTO.setIdGrupoPago(idGrupoPago);
        conceptosPagNomExtraDTO.setIdNomina(new Integer(idQna));
        conceptosPagNomExtraDTO.setIdEdoNom(nominaDTO.getIdEdoNom());
        conceptosPagNomExtraDTO.setIdTipoNomina(nominaDTO.getIdTipoNomina());
        conceptosPagNomExtraDTO.setNomQnaCaptura(nominaDTO.getNomQnaCaptura());
        conceptosPagNomExtraDTO.setNomNumComplem(nominaDTO.getNomNumComplem());
        conceptosPagNomExtraDTO.setDescNomina(nominaDTO.getDescNomina());
        conceptosPagNomExtraDTO.setNomDescTipoNomina(nominaDTO.getNomDescTipoNomina());
        conceptosPagNomExtraDTO.setNomDescGrupoPago(nominaDTO.getNomDescGrupoPago());
        conceptosPagNomExtraDTO.setIdPlaza(new Integer(idPlaza));
        conceptosPagNomExtraDTO.setFecModifico(tnCalculoNominaQnaDTO.getFecModifico());
        conceptosPagNomExtraDTO.setUsuario(tnCalculoNominaQnaDTO.getUsuario());
        conceptosPagNomExtraDTO.setCnqIniPago(tnCalculoNominaQnaDTO.getCnqIniPago());
        conceptosPagNomExtraDTO.setCnqFinPago(tnCalculoNominaQnaDTO.getCnqFinPago());
        conceptosPagNomExtraDTO.setCnqLiquido(tnCalculoNominaQnaDTO.getCnqLiquido());
        conceptosPagNomExtraDTO.setDescTipoPago(conceptosPagNomExtraDTOGP.getDescTipoPago());
        conceptosPagNomExtraDTO.setIdPuestoNom(conceptosPagNomExtraDTOGP.getIdPuestoNom());
        conceptosPagNomExtraDTO.setIdZonaDistNom(conceptosPagNomExtraDTOGP.getIdZonaDistNom());
        conceptosPagNomExtraDTO.setDescGrupoPago(conceptosPagNomExtraDTOGP.getDescGrupoPago());
        conceptosPagNomExtraDTO.setIdNivelPto(conceptosPagNomExtraDTOGP.getIdNivelPto());
        conceptosPagNomExtraDTO.setIdNombramiento(conceptosPagNomExtraDTOGP.getIdNombramiento() );
        conceptosPagNomExtraDTO.setDescNombramiento(conceptosPagNomExtraDTOGP.getDescNombramiento());
        conceptosPagNomExtraDTO.setDescJerarquia(conceptosPagNomExtraDTOGP.getDescJerarquia());
        
        conceptosPagNomExtraDTO.setStatus(status);
        
        if (tnCalculoNominaQnaDTO.getCnqIniPago() != null && tnCalculoNominaQnaDTO.getCnqFinPago() != null) {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String cNqIniPago = df.format(tnCalculoNominaQnaDTO.getCnqIniPago());
            String cNqFinPago = df.format(tnCalculoNominaQnaDTO.getCnqFinPago());
            conceptosPagNomExtraDTO.setPeriodoPago(cNqIniPago + " - " + cNqFinPago);
        } else {
            conceptosPagNomExtraDTO.setPeriodoPago("  ");
        }
        
        // No tiene conceptos
        if (tnCalculoNominaQnaDTO.getCnqCptos() == null) {
            super.saveMessage(model, "El rfc seleccionado no tiene conceptos asignados.");
            model.addAttribute(conceptosPagNomExtraDTO);
            return super.getViewName("conceptosNominaExt");
        }
        
        // Conceptos
        conceptos = tnCalculoNominaQnaDTO.getCnqCptos().trim().split(delimiterConceptos);
        conceptosPagNomExtraDTO.setConceptos(tnCalculoNominaQnaDTO.getCnqCptos().trim());
        
        // Control
        if (nominaDTO.getIdTipoNomina().equals("SA")) {
            conceptosPagados = getConceptosPagados(conceptos, null, new String[] { "ND", "SB","SR", "SA", "FV", "RV", "AP", "RC", "SE", "RT", "ST", "RH", "SH" });
        } else if (nominaDTO.getIdTipoNomina().equals("AG")) {
            conceptosPagados = getConceptosPagados(conceptos, new String[]{"24","1E","AH"}, new String[]{"IA","62"} );
        } else if (nominaDTO.getIdTipoNomina().equals("VA")) {
            conceptosPagados = getConceptosPagados(conceptos, new String[]{"VA"}, new String[]{"62"} );
        } else if (nominaDTO.getIdTipoNomina().equals("AC")) {
            conceptosPagados = getConceptosPagados(conceptos, new String[]{"24","1E","CJ"}, new String[]{"IA","IE","62"} );
        } else if (nominaDTO != null && nominaDTO.getIdTipoNomina() != null && nominaDTO.getIdTipoNomina().equals("FO") || nominaDTO.getIdTipoNomina().equals("FE")) {
            if (conceptosPagNomExtraDTO.getIdNombramiento() != null && 
                conceptosPagNomExtraDTO.getIdNombramiento().equals("C")) {
                conceptosPagados = getConceptosPagados(conceptos, new String[]{ "GC", "TC", "SI", "RE" }, null);
            } else if (conceptosPagNomExtraDTO.getIdNombramiento() != null && conceptosPagNomExtraDTO.getIdNombramiento().equals("B")) {
                conceptosPagados = getConceptosPagados(conceptos, new String[]{ "GB", "TB", "SI", "RE" }, null);
            }
        } else {
            // cuando las nominas deben tener todos los conceptos enviamos en null null
            conceptosPagados = getConceptosPagados(conceptos, null, null);
        }
        
        lConceptos = super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraOrd(rfcEmpleado);
        StringBuffer sb = new StringBuffer();
        for(String vConcepto : lConceptos){
            logger.debug("vConcepto ----> " + vConcepto);
            sb.append(vConcepto).append(";");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length()-1, sb.length());
        }
        
        conceptosPagNomExtraDTO.setJsonConceptosString(sb.toString());
        logger.debug("sConceptos: " + sb.toString());
        conceptosPagNomExtraDTO.setConceptosPagados(conceptosPagados);
        
        // Cadena JSON
        String jsonDataString = generateJSONString(conceptosPagados, nominaDTO.getIdTipoNomina());
        conceptosPagNomExtraDTO.setJsonDataString(jsonDataString);
        
        model.addAttribute("conceptosPagNomExtraDTO", conceptosPagNomExtraDTO);
        return super.getViewName("conceptosNominaExt");
    }

    /**
     * 
     * @param conceptos Los conceptos que vienen de la base de datos
     * @param conceptosValidosPercepciones Arreglo con los conceptos validos para percepciones
     * @param conceptosValidosDeducciones Arreglo con los conceptos validos para deducciones
     * @return List<TnConceptoPagadoBeneficiarioDTO>
     */
    private List<TnConceptoPagadoBeneficiarioDTO> getConceptosPagados(String[] conceptos, 
                                                                      String[] conceptosValidosPercepciones, 
                                                                      String[] conceptosValidosDeducciones) {
        String[] concepto;
        String delimiterConcepto = "[;]";
        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagados = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagadosPercepcionesAux = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
        List<TnConceptoPagadoBeneficiarioDTO> conceptosPagadosDeduccionesAux = new ArrayList<TnConceptoPagadoBeneficiarioDTO>();
        TnConceptoPagadoBeneficiarioDTO tnConceptoPagadoDTO = null;

        boolean nominaTodosConceptos = conceptosValidosPercepciones == null && conceptosValidosDeducciones == null;

        if (conceptos != null && conceptos.length > 0) {
            for (int i = 0; i < conceptos.length; i++) {
                concepto = conceptos[i].trim().split(delimiterConcepto);
                if (concepto[1] != null && concepto[1].equals("P")) {
                    if (nominaTodosConceptos || (conceptosValidosPercepciones != null && conceptosValidosPercepciones.length > 0 && ArrayUtils.contains(conceptosValidosPercepciones, concepto[2]))) {
                        tnConceptoPagadoDTO = new TnConceptoPagadoBeneficiarioDTO();
                        tnConceptoPagadoDTO.setIdTipoCpto(concepto[1]);
                        tnConceptoPagadoDTO.setIdCptoPago(concepto[2]);
                        tnConceptoPagadoDTO.setCpMonto(concepto[3] != null ? new BigDecimal(concepto[3]):null);
                        conceptosPagadosPercepcionesAux.add(tnConceptoPagadoDTO);
                    }
                } else if (concepto[1] != null && (concepto[1].equals("D"))) {
                    if (nominaTodosConceptos || (conceptosValidosDeducciones != null && conceptosValidosDeducciones.length > 0 && ArrayUtils.contains(conceptosValidosDeducciones, concepto[2]))) {
                        // Deducciones

                        tnConceptoPagadoDTO = new TnConceptoPagadoBeneficiarioDTO();

                        // Beneficiarios
                        if (concepto[0] != null && !concepto[0].equals("") && concepto[1].equals("D") && concepto[2].equals("62")) {
                            tnConceptoPagadoDTO.setBeneficiario(concepto[0]);
                        } else {
                            tnConceptoPagadoDTO.setBeneficiario("");
                        }

                        tnConceptoPagadoDTO.setIdTipoCpto(concepto[1]);
                        tnConceptoPagadoDTO.setIdCptoPago(concepto[2]);
                        tnConceptoPagadoDTO.setCpMonto(concepto[3] != null ? new BigDecimal(concepto[3]) : null);
                        conceptosPagadosDeduccionesAux.add(tnConceptoPagadoDTO);
                    }
                } else if (concepto[1] != null && concepto[1].equals("C")) {
                    if (nominaTodosConceptos || (conceptosValidosDeducciones != null && conceptosValidosDeducciones.length > 0 && ArrayUtils.contains(conceptosValidosDeducciones, concepto[2]))) {
                        tnConceptoPagadoDTO = new TnConceptoPagadoBeneficiarioDTO();
                        tnConceptoPagadoDTO.setIdTipoCpto(concepto[1]);
                        tnConceptoPagadoDTO.setIdCptoPago(concepto[2]);
                        tnConceptoPagadoDTO.setCpMonto(concepto[3] != null ? new BigDecimal(concepto[3]) : null);
                        conceptosPagadosDeduccionesAux.add(tnConceptoPagadoDTO);
                    }
                }
            }
        }
        Collections.sort(conceptosPagadosPercepcionesAux);
        Collections.sort(conceptosPagadosDeduccionesAux);
        for (TnConceptoPagadoBeneficiarioDTO cp: conceptosPagadosPercepcionesAux) {
            conceptosPagados.add(cp);
        }
        for (TnConceptoPagadoBeneficiarioDTO cd: conceptosPagadosDeduccionesAux) {
            conceptosPagados.add(cd);
        }
                        
        return conceptosPagados;
    }
    
    /**
     * Metodo encargado de generar cadenas tipo JSON con base en una lista de objetos TnConceptoPagadoDTO
     * @author Oscar S.
     * @param conceptosPagados List<TnConceptoPagadoDTO>
     * @return jsonDataString String
     */
    @SuppressWarnings("unchecked")
    private String generateJSONString(List<TnConceptoPagadoBeneficiarioDTO> conceptosPagados, String idTipoNomina) throws IOException, JsonGenerationException, JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        
        // jsonMap Nivel 1
        HashMap<String, Object> jsonMapNiv1 = new HashMap<String, Object>();
        
        // jsonMap Nivel 2
        List jsonMapNiv2 = new ArrayList();
        HashMap<String, Object> idCellJsonMap;
        
        // jsonMap Nivel 3
        HashMap<String, Object> jsonConceptos;
         
        int counter = 1;
        
        for (TnConceptoPagadoBeneficiarioDTO concepto : conceptosPagados) { 
            jsonConceptos = new HashMap<String, Object>();
            
            jsonConceptos.put("idTipoCpto", concepto.getIdTipoCpto() != null ? concepto.getIdTipoCpto().toString() : "");
            jsonConceptos.put("concepto", concepto.getIdCptoPago() != null ? concepto.getIdCptoPago().toString() : "");
            
            if (idTipoNomina.equals("SA")) {
                if (concepto.getIdTipoCpto().equals("C")) {
                    jsonConceptos.put("control", concepto.getCpMonto() != null && concepto.getCpMonto().compareTo(BigDecimal.ZERO) > 0 ? concepto.getCpMonto() : BigDecimal.ZERO);
                } 
            } else {
                jsonConceptos.put("beneficiario", concepto.getBeneficiario() != null ? concepto.getBeneficiario().toString() : "");
                
                if (concepto.getIdTipoCpto().equals("P")) {
                    jsonConceptos.put("percepciones", concepto.getCpMonto() != null && concepto.getCpMonto().compareTo(BigDecimal.ZERO) > 0 ? concepto.getCpMonto() : BigDecimal.ZERO);
                    jsonConceptos.put("deducciones", 0);
                } else {
                    jsonConceptos.put("percepciones", 0);
                    jsonConceptos.put("deducciones", concepto.getCpMonto() != null && concepto.getCpMonto().compareTo(BigDecimal.ZERO) > 0 ? concepto.getCpMonto() : BigDecimal.ZERO);
                }
            }
            
            // jsonMap Nivel 2
            idCellJsonMap = new HashMap<String, Object>();
            idCellJsonMap.put("id", String.valueOf(counter));
            idCellJsonMap.put("cell", jsonConceptos);
            
            jsonMapNiv2.add(idCellJsonMap);
            
            counter++;
        }
        
        jsonMapNiv1.put("page", "1");
        jsonMapNiv1.put("total", 1);
        jsonMapNiv1.put("records", String.valueOf(conceptosPagados.size()));
        jsonMapNiv1.put("rows", jsonMapNiv2);
        
        return mapper.writeValueAsString(jsonMapNiv1);
    }
        
    /**
     * Metodo encargado de guardar la cadena de conceptos
     * @author Martin Cano
     * @param model Model
     * @param conceptosPagNomExtraDTO ConceptosPagNomExtraDTO
     * @return String
     */
    @RequestMapping
    public String jsonRequestConceptos(Model model, ConceptosPagNomExtraDTO conceptosPagNomExtraDTO) throws IOException {
        String retorno = null;
        StringBuffer sb = new StringBuffer();
        ObjectMapper mapper = new ObjectMapper();
        List<ConceptosJson> conceptos = new ArrayList<ConceptosJson>();
        String[] tokensCptos = null;
        String[] tokensCpto  = null;
        String delimiterConceptos = "[|]";
        String delimiterConcepto = "[;]";
        
        Double percepciones = new Double(0);
        Double deducciones = new Double(0);
        Double control = new Double(0);
        
        boolean conceptosRepetidos = false;
        TnConceptoPagadoDTO tnConceptoPagadoDTO = null;
        List<TnConceptoPagadoDTO> conceptosOld = new ArrayList<TnConceptoPagadoDTO>();
        
        if (conceptosPagNomExtraDTO.getConceptos() != null && conceptosPagNomExtraDTO.getConceptos().length() > 0) {
            tokensCptos = conceptosPagNomExtraDTO.getConceptos().trim().split(delimiterConceptos);
            
            for (int i = 0; i < tokensCptos.length; i++) {
                tokensCpto = tokensCptos[i].trim().split(delimiterConcepto);
                
                tnConceptoPagadoDTO = new TnConceptoPagadoDTO();
                tnConceptoPagadoDTO.setCpNumConcepto(new Integer(tokensCpto[0]));
                tnConceptoPagadoDTO.setIdTipoCpto(tokensCpto[1]);
                tnConceptoPagadoDTO.setIdCptoPago(tokensCpto[2]);
                tnConceptoPagadoDTO.setCpMonto(new Double(tokensCpto[3]));
                conceptosOld.add(tnConceptoPagadoDTO);
            }
        }
        
        try {
            conceptos = (List<ConceptosJson>)mapper.readValue(conceptosPagNomExtraDTO.getPostData(), mapper.getTypeFactory().constructCollectionType(List.class, ConceptosJson.class));
        } catch (JsonParseException e) {
            e.printStackTrace();
            conceptos = null;
            super.saveError(model, "error.calculoNominaExtrController.jsonRequestConceptos.JsonParseException");
            retorno = "conceptosNominaExt";} 
         catch (JsonMappingException e) {
            e.printStackTrace();
            conceptos = null;
            super.saveError(model, "error.calculoNominaExtrController.jsonRequestConceptos.JsonMappingException");
            retorno = "conceptosNominaExt"; } 
         catch (IOException e) {
            e.printStackTrace();
            conceptos = null;
            super.saveError(model, "error.calculoNominaExtrController.jsonRequestConceptos.IOException");
            retorno = "conceptosNominaExt";
        }

        // Valida que no haya conceptos repetidos
        conceptosRepetidos = verificaExistenRepetidos(conceptos);

        if (!conceptosRepetidos) {
            for (ConceptosJson concepto: conceptos) {
                // Beneficiarios
                if (concepto.getBeneficiario() != null && !concepto.getBeneficiario().equals("") && concepto.getIdTipoCpto().equals("D") && concepto.getConcepto().equals("62")) {
                    sb.append(concepto.getBeneficiario());
                } else {
                    sb.append("-1");
                }
                sb.append(";");
                sb.append(concepto.getIdTipoCpto());
                sb.append(";");
                sb.append(concepto.getConcepto());
                sb.append(";");
                
                if (conceptosPagNomExtraDTO.getIdTipoNomina().equals("SA")) {
                    if (concepto.getIdTipoCpto().equals("C")) {
                        control += new Double(concepto.getControl());
                        sb.append(concepto.getControl());
                        sb.append("|");
                    } 
                } else {
                    if (concepto.getIdTipoCpto().equals("P")) {
                        percepciones += redondear (new Double(concepto.getPercepciones()));
                        sb.append(concepto.getPercepciones());
                        sb.append("|");
                    } else {
                        deducciones += redondear( new Double(concepto.getDeducciones()));
                        sb.append(concepto.getDeducciones());
                        sb.append("|");
                    }
                }
            }
            logger.debug("*********** SB: " + sb);
            
            // Ciclo para agregar los conceptos de control
            if (!conceptosPagNomExtraDTO.getIdTipoNomina().equals("SA")) {
                for(TnConceptoPagadoDTO conceptoOld: conceptosOld){
                    if(conceptoOld.getIdTipoCpto().equalsIgnoreCase("C")){
                        //sb.append("-1"); sb.append(";");
                        sb.append(conceptoOld.getCpNumConcepto());  sb.append(";");
                        sb.append(conceptoOld.getIdTipoCpto());     sb.append(";");
                        sb.append(conceptoOld.getIdCptoPago());     sb.append(";");
                        sb.append(conceptoOld.getCpMonto());        
                        sb.append("|");
                    }
                }
                logger.debug("*********** SB2: " + sb);
            }
            
            if (sb.length() > 0 && "|".equalsIgnoreCase(  String.valueOf(sb.charAt(sb.length()-1 ) )  )   )  {
                sb.delete(sb.length() - 1, sb.length());
            }
            if (sb.length() > 0 && ";".equalsIgnoreCase(  String.valueOf(sb.charAt(sb.length()-1 ) )  )   )  {
                sb.delete(sb.length() - 1, sb.length());
            }
            logger.debug("*********** SB3: " + sb);
            
            /* GUARDA LOS CONCEPTOS EN LA BD ****/
            TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO = new TnCalculoNominaQnaDTO();
            tnCalculoNominaQnaDTO.setIdPlaza(conceptosPagNomExtraDTO.getIdPlaza());
            tnCalculoNominaQnaDTO.setIdNomina(conceptosPagNomExtraDTO.getIdNomina());
            tnCalculoNominaQnaDTO.setCnqRfc(conceptosPagNomExtraDTO.getRfcEmpleado());
            tnCalculoNominaQnaDTO.setCnqIniPago(conceptosPagNomExtraDTO.getCnqIniPago());
            tnCalculoNominaQnaDTO.setCnqFinPago(conceptosPagNomExtraDTO.getCnqFinPago());
            tnCalculoNominaQnaDTO.setCnqLiquido(redondear( percepciones - deducciones));
            tnCalculoNominaQnaDTO.setCnqCptos(sb.toString().toUpperCase());
            tnCalculoNominaQnaDTO.setUsuario(super.security().getUserName());
            tnCalculoNominaQnaDTO.setFecModifico(new Date());
            
            super.getService(CalculoNominaExtraService.class).saveConceptosNominaExtraOrdinaria(tnCalculoNominaQnaDTO);
            
            return listaRFCsPorGrupoPago(model, conceptosPagNomExtraDTO.getIdGrupoPago(), conceptosPagNomExtraDTO.getIdNomina(), conceptosPagNomExtraDTO.getStatus(), new PagoDTO());
        } else {
            conceptosPagNomExtraDTO.setJsonDataString(conceptosPagNomExtraDTO.getPostData());
            model.addAttribute("conceptosPagNomExtraDTO", conceptosPagNomExtraDTO);
            super.saveError(model, "error.calculoNominaExt.controller.cptsRepetidos");
            retorno = "conceptosNominaExt";
            return super.getViewName(retorno);
        }
    }
    
    /**
     * Metodo encargado de verificar si existen elementos repetidos en la lista de conceptos.
     * @author Martin Cano.
     * @param lConceptos List<ConceptosJson>
     * @return boolean
     */
    public boolean verificaExistenRepetidos(List<ConceptosJson> lConceptos){
        ConceptosJson concepto = null;
        ConceptosJson conceptoAux = null;
        int repetidos = 0;
        boolean retorno = false;
        
        for(int i = 0; i < lConceptos.size(); i++){
            concepto = lConceptos.get(i);
            if(concepto.getConcepto().length() > 2){  concepto.setConcepto(concepto.getConcepto().substring(0, 2));  } // elimina la descripcion del concepto
            for(int k = 0; k < lConceptos.size(); k++){
                conceptoAux = lConceptos.get(k);
                if(concepto.getIdTipoCpto().equalsIgnoreCase(conceptoAux.getIdTipoCpto()) && concepto.getConcepto().equalsIgnoreCase(conceptoAux.getConcepto())){
                    repetidos++;
                }
            } if(repetidos >= 2) {retorno = true;   } repetidos = 0;
        }
        return false;
    }
    
    /**
     * Metodo encargado de redireccionar a la pagina anterior
     * @author Martin Cano
     * @param model Model
     * @param conceptosPagNomExtraDTO ConceptosPagNomExtraDTO
     * @return String
     */
    @RequestMapping
    public String regresarPantallaAnterior(Model model, ConceptosPagNomExtraDTO conceptosPagNomExtraDTO) throws IOException {
        return listaRFCsPorGrupoPago(model, conceptosPagNomExtraDTO.getIdGrupoPago(), conceptosPagNomExtraDTO.getIdNomina(), conceptosPagNomExtraDTO.getStatus(), new PagoDTO());
    }
    
    /**
     * Metodo encargado de formar el combo de tipos de concepto. Este método no regresa un valor, sin embargo la cadena generada está en el response.
     * @author Oscar S.
     * @param idTipoNomina String
     * @param response HttpServletResponse
     * @return
     */
    @RequestMapping
    public void jsonCallbackTipoConcepto(@RequestParam("idTipoNomina") String idTipoNomina, 
                                         HttpServletResponse response) throws IOException {
        
        logger.debug("jsonCallbackTipoConcepto -> idTipoNomina ----------------------> " + idTipoNomina);
        
        StringBuffer sb = new StringBuffer();
        sb.append("<select name='idTipoCpto' id='idTipoCpto'>");
        sb.append("<option value='' selected='selected'>SELECCIONE...</option>");

        // SAR-FOVISSSTE
        if (idTipoNomina.equals("SA")) {
            sb.append("<option value='C'>C</option>");
        } else {
            sb.append("<option value='P'>P</option>");
            sb.append("<option value='D'>D</option>");
        }
        
        sb.append("</select>");

        // Cadena JSON
        String jsonDataString = sb.toString();

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        out.print(jsonDataString);
    }
    
    /**
     * Metodo encargado de formar el combo de conceptos por tipo de concepto. Este método no regresa un valor, sin embargo la cadena generada está en el response.
     * @author Oscar S.
     * @param tipoConcepto String
     * @param idTipoNomina String
     * @param response HttpServletResponse
     * @return
     */
    @RequestMapping
    public void jsonCallbackConceptosByTipoConcepto(@RequestParam("tipoConcepto") String tipoConcepto, 
                                                    @RequestParam("idTipoNomina") String idTipoNomina,
                                                    HttpServletResponse response) throws IOException {

        logger.debug("jsonCallbackConceptosByTipoConcepto -> tipoConcepto ----------------------> " + tipoConcepto);
        logger.debug("jsonCallbackConceptosByTipoConcepto -> idTipoNomina ----------------------> " + idTipoNomina);
        
        StringBuffer sb = new StringBuffer();

        if (tipoConcepto == null || tipoConcepto.equals("")) {
            sb.append("<select name='concepto' id='concepto'>");
            sb.append("<option value='' selected='selected'>SELECCIONE...</option>");
            sb.append("</select>");
        } else {
            List<TcConceptoPagoDTO> conceptos = null;
            
            if (idTipoNomina.equals("VA") && tipoConcepto.equals("P")) {
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("VA");
                tcConceptoPagoDTO.setDescConPag("VA - Vales de Despensa");
                conceptos.add(tcConceptoPagoDTO);
            } else if(idTipoNomina.equals("VA") && tipoConcepto.equals("D")){
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("62");
                tcConceptoPagoDTO.setDescConPag("62 - Descuento de Pensión Alimenticia");
                conceptos.add(tcConceptoPagoDTO);
            } else if (idTipoNomina.equals("SA") && tipoConcepto.equals("C")) {
                // Conceptos por tipo concepto
                conceptos = super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraSARFOV();
                
            } else if (idTipoNomina.equals("AG") && tipoConcepto.equals("P")) {
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("24");
                tcConceptoPagoDTO.setDescConPag("24 - Aguinaldo o Gratificación de fin de año");
                conceptos.add(tcConceptoPagoDTO);
                
                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("1E");
                tcConceptoPagoDTO2.setDescConPag("1E - Aguinaldo Exento");
                conceptos.add(tcConceptoPagoDTO2);
                
                TcConceptoPagoDTO tcConceptoPagoDTO3 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO3.setIdConcepto("AH");
                tcConceptoPagoDTO3.setDescConPag("AH - Aguinaldo Honorario");
                conceptos.add(tcConceptoPagoDTO3);
                
            }  else if (idTipoNomina.equals("AG") && tipoConcepto.equals("D")) {
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("IA");
                tcConceptoPagoDTO.setDescConPag("IA - Impuesto Sobre la Renta Aguinaldo");
                conceptos.add(tcConceptoPagoDTO);

                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("62");
                tcConceptoPagoDTO2.setDescConPag("62 - Descuento de Pensión Alimenticia");
                conceptos.add(tcConceptoPagoDTO2);
                
            } else if (idTipoNomina.equals("AC") && tipoConcepto.equals("P")) {
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("24");
                tcConceptoPagoDTO.setDescConPag("24 - Aguinaldo o Gratificación de fin de año");
                conceptos.add(tcConceptoPagoDTO);
                
                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("1E");
                tcConceptoPagoDTO2.setDescConPag("1E - Aguinaldo Exento");
                conceptos.add(tcConceptoPagoDTO2);
                
                TcConceptoPagoDTO tcConceptoPagoDTO3 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO3.setIdConcepto("CJ");
                tcConceptoPagoDTO3.setDescConPag("CJ - Asig. por radicación en el extranjero");
                conceptos.add(tcConceptoPagoDTO3);
                
            }  else if (idTipoNomina.equals("AC") && tipoConcepto.equals("D")) {
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("IA");
                tcConceptoPagoDTO.setDescConPag("IA - Impuesto Sobre la Renta Aguinaldo");
                conceptos.add(tcConceptoPagoDTO);
                
                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("IE");
                tcConceptoPagoDTO2.setDescConPag("IE - Impuesto Sobre la Renta sueldos extranjero");
                conceptos.add(tcConceptoPagoDTO2);

                TcConceptoPagoDTO tcConceptoPagoDTO3 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO3.setIdConcepto("62");
                tcConceptoPagoDTO3.setDescConPag("62 - Descuento de Pensión Alimenticia");
                conceptos.add(tcConceptoPagoDTO3);
            } else if( (idTipoNomina.equals("FOB") || idTipoNomina.equals("FEB")) && tipoConcepto.equals("P")){
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("GB");
                tcConceptoPagoDTO.setDescConPag("GB - Fonac Liq. Aportación Gobierno Base");
                conceptos.add(tcConceptoPagoDTO);
                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("TB");
                tcConceptoPagoDTO2.setDescConPag("TB - Fonac Liq. Aportación Trabajador Base");
                conceptos.add(tcConceptoPagoDTO2);
                TcConceptoPagoDTO tcConceptoPagoDTO3 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO3.setIdConcepto("SI");
                tcConceptoPagoDTO3.setDescConPag("SI - Fonac Liq. Aportación Sindicato");
                conceptos.add(tcConceptoPagoDTO3);
                TcConceptoPagoDTO tcConceptoPagoDTO4 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO4.setIdConcepto("RE");
                tcConceptoPagoDTO4.setDescConPag("RE - Fonac Liq. Rendimientos");
                conceptos.add(tcConceptoPagoDTO4);
            } else if( (idTipoNomina.equals("FOC") || idTipoNomina.equals("FEC")) && tipoConcepto.equals("P")){
                conceptos = new ArrayList<TcConceptoPagoDTO>();
                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("GC");
                tcConceptoPagoDTO.setDescConPag("GC - Fonac Liq. Aportación Gobierno Confianza");
                conceptos.add(tcConceptoPagoDTO);
                TcConceptoPagoDTO tcConceptoPagoDTO2 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO2.setIdConcepto("TC");
                tcConceptoPagoDTO2.setDescConPag("TC - Fonac Liq. Aportación Trabajador Confianza");
                conceptos.add(tcConceptoPagoDTO2);
                TcConceptoPagoDTO tcConceptoPagoDTO3 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO3.setIdConcepto("SI");
                tcConceptoPagoDTO3.setDescConPag("SI - Fonac Liq. Aportación Sindicato");
                conceptos.add(tcConceptoPagoDTO3);
                TcConceptoPagoDTO tcConceptoPagoDTO4 = new TcConceptoPagoDTO();
                tcConceptoPagoDTO4.setIdConcepto("RE");
                tcConceptoPagoDTO4.setDescConPag("RE - Fonac Liq. Rendimientos");
                conceptos.add(tcConceptoPagoDTO4);
            }else if((idTipoNomina.equals("FOC") || idTipoNomina.equals("FOB") ||  idTipoNomina.equals("FEB") ||  idTipoNomina.equals("FEC")) && tipoConcepto.equals("D")){
                conceptos = new ArrayList<TcConceptoPagoDTO>();

                TcConceptoPagoDTO tcConceptoPagoDTO = new TcConceptoPagoDTO();
                tcConceptoPagoDTO.setIdConcepto("62");
                tcConceptoPagoDTO.setDescConPag("62 - Descuento de Pensión Alimenticia");
                conceptos.add(tcConceptoPagoDTO);
            } else {
                // Conceptos por tipo concepto
                conceptos = super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraOrdByTipoConcepto(tipoConcepto);
            }
            
            sb.append("<option value='' selected='selected'>SELECCIONE...</option>");
            for (TcConceptoPagoDTO concepto: conceptos) {
                sb.append("<option value='" + concepto.getIdConcepto() + "'>" + concepto.getDescConPag() + "</option>");
            }
        }

        // Cadena JSON
        String jsonDataString = sb.toString();

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        out.print(jsonDataString);
    }
    
    @RequestMapping
    public String sueldos(Model model) {
        IncrementoNominaDTO  incrementoNominaDTO = new  IncrementoNominaDTO();
        
        super.getService(IncrementoNominaService.class).getValoresIniciales(incrementoNominaDTO);
        
        incrementoNominaDTO.setSubtitle("Obtención del período laborado - Sueldos Operativos");
        model.addAttribute(incrementoNominaDTO);
        return super.getViewName("sueldos");
    }
    
    @RequestMapping
    public String prestaciones(Model model) {
        IncrementoNominaDTO incrementoNominaDTO = new  IncrementoNominaDTO();
        incrementoNominaDTO.setSubtitle("Obtención del período laborado - Prestaciones");
        return super.getViewName("sueldos");
    }

    @RequestMapping
    public String sueldosAceptar(Model model, IncrementoNominaDTO incrementoNominaDTO) {

        SimpleDateFormat df = new SimpleDateFormat(formatoDate);

        String fecIni = df.format(incrementoNominaDTO.getFecIni());
        String fecFin = df.format(incrementoNominaDTO.getFecFin());
        Integer qnaProceso = incrementoNominaDTO.getQnaProceso();
        Integer qnaIni = incrementoNominaDTO.getQnaIni();
        Integer qnaFin = incrementoNominaDTO.getQnaFin();
        String tabAnt = df.format(incrementoNominaDTO.getTabAnt());
        String tabNvo = df.format(incrementoNominaDTO.getTabNvo());
        BigDecimal compensacionAnt = incrementoNominaDTO.getCompensacionAnt();
        BigDecimal despensaAnt = incrementoNominaDTO.getDespensaAnt();
        BigDecimal previsionAnt = incrementoNominaDTO.getPrevisionAnt();
        BigDecimal serviciosAnt = incrementoNominaDTO.getServiciosAnt();
        BigDecimal transporteAnt = incrementoNominaDTO.getTransporteAnt();
        BigDecimal compensacionNva = incrementoNominaDTO.getCompensacionNva();
        BigDecimal despensaNva = incrementoNominaDTO.getDespensaNva();
        BigDecimal previsionNva = incrementoNominaDTO.getPrevisionNva();
        BigDecimal serviciosNva = incrementoNominaDTO.getServiciosNva();
        BigDecimal transporteNva = incrementoNominaDTO.getTransporteNva();

        super.getService(CalculoNominaService.class).obtienePeriodoLaboradoIS(null, fecIni, fecFin, qnaProceso, qnaIni, qnaFin, 
                                                                              tabAnt, tabNvo, compensacionAnt, despensaAnt, previsionAnt, 
                                                                              serviciosAnt, transporteAnt, compensacionNva, despensaNva, previsionNva, 
                                                                              serviciosNva, transporteNva);

        super.saveMessage(model, "nomina.diferencias.alta.ok");
        return super.getViewName("sueldos");
    }

//------
    @RequestMapping
    public String sueldosMandos(Model model) {
        IncrementoNominaDTO  incrementoNominaDTO = new  IncrementoNominaDTO();
        
        super.getService(IncrementoNominaService.class).getValoresIniciales(incrementoNominaDTO);
        
        IncrementoNominaMandosDTO incrementoNominaMandosDTO = super.transformation().map(incrementoNominaDTO, IncrementoNominaMandosDTO.class);
        incrementoNominaMandosDTO.setSubtitle("Obtención del período laborado - Sueldos Mandos");
        model.addAttribute(incrementoNominaMandosDTO);
        return super.getViewName("sueldosMandos");
    }
    
    @RequestMapping
    public String prestacionesm(Model model) {
        IncrementoNominaMandosDTO incrementoNominaMandosDTO = new  IncrementoNominaMandosDTO();
        incrementoNominaMandosDTO.setSubtitle("Obtención del período laborado - Prestaciones");
        return super.getViewName("sueldosMandos");
    }

    @RequestMapping
    public String sueldosmAceptar(Model model, IncrementoNominaMandosDTO incrementoNominaMandosDTO) {

        SimpleDateFormat df = new SimpleDateFormat(formatoDate);

        String fecIni = df.format(incrementoNominaMandosDTO.getFecIni());
        String fecFin = df.format(incrementoNominaMandosDTO.getFecFin());
        Integer qnaProceso = incrementoNominaMandosDTO.getQnaProceso();
        Integer qnaIni = incrementoNominaMandosDTO.getQnaIni();
        Integer qnaFin = incrementoNominaMandosDTO.getQnaFin();
        String tabAnt = df.format(incrementoNominaMandosDTO.getTabAnt());
        String tabNvo = df.format(incrementoNominaMandosDTO.getTabNvo());
        BigDecimal compensacionAnt1 = BigDecimal.ZERO; // incrementoNominaDTO.getCompensacionAnt();
        BigDecimal despensaAnt = incrementoNominaMandosDTO.getDespensaAnt();
        BigDecimal previsionAnt1 = BigDecimal.ZERO; // incrementoNominaDTO.getPrevisionAnt();
        BigDecimal serviciosAnt1 = BigDecimal.ZERO; // incrementoNominaDTO.getServiciosAnt();
        BigDecimal transporteAnt1 = BigDecimal.ZERO; // incrementoNominaDTO.getTransporteAnt();
        BigDecimal compensacionNva1 = BigDecimal.ZERO; // incrementoNominaDTO.getCompensacionNva();
        BigDecimal despensaNva = incrementoNominaMandosDTO.getDespensaNva();
        BigDecimal previsionNva1 = BigDecimal.ZERO; // incrementoNominaDTO.getPrevisionNva();
        BigDecimal serviciosNva1 = BigDecimal.ZERO; // incrementoNominaDTO.getServiciosNva();
        BigDecimal transporteNva1 = BigDecimal.ZERO; // incrementoNominaDTO.getTransporteNva();

        super.getService(CalculoNominaService.class).obtienePeriodoLaboradomIS(null, fecIni, fecFin, qnaProceso, qnaIni, qnaFin, 
                                                                              tabAnt, tabNvo, compensacionAnt1, despensaAnt, previsionAnt1, 
                                                                              serviciosAnt1, transporteAnt1, compensacionNva1, despensaNva, previsionNva1, 
                                                                              serviciosNva1, transporteNva1);

        super.saveMessage(model, "nomina.diferencias.alta.ok");
        return super.getViewName("sueldosMandos");
    }

//------
    @RequestMapping
    public String sueldosClean(Model model) {
        return sueldos(model);
    }

    @RequestMapping
    public String sueldosmClean(Model model) {
        return sueldosMandos(model);
    }
    
    @RequestMapping
    public String valesClean(Model model) {
        return getCandidatos(model);
    }
    
    @RequestMapping
    public String getCandidatos(Model model){
        ValesNominaDTO  valesNominaDTO = new ValesNominaDTO();
        super.getService(ValesNominaService.class).getValoresIniciales(valesNominaDTO);
        model.addAttribute(valesNominaDTO);
        return super.getViewName("candidatos"); 
    }
    
    @RequestMapping
    public String valesAceptar(Model model, ValesNominaDTO  valesNominaDTO){
        
        super.getService(ValesNominaService.class).updateNominaVales(valesNominaDTO);
        model.addAttribute(valesNominaDTO);
        super.saveMessage(model, "nomina.vales.alta.ok");
        return super.getViewName("candidatos"); 
    }
    
    @RequestMapping
    public String getPersevCandidatos(Model model){
        return super.getViewName("perseverancia"); 
    }
    @RequestMapping
    public String perservAceptar(Model model){
        super.getService(CalculoNominaExtraService.class).processPMCandidatosPerseverancia();
        super.saveMessage(model, "nomina.perseverancia.alta.ok");
        return consultaPerseverancia(model);
    }
    
    private static Double redondear(Double base) {
        Double valor = 0.0;
        valor = Math.rint(base * 100) / 100;
        return valor;
    }
    
    @RequestMapping
    public String conReglas(Model model){
        return consultaNominasPorTipoNomina(model, null, idTpExtrConReglas );
    }
}