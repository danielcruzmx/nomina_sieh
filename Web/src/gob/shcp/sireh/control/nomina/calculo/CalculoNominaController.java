package gob.shcp.sireh.control.nomina.calculo;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.calculo.AltasYBajasDTO;
import gob.shcp.sireh.model.nomina.calculo.ComparaConDTO;
import gob.shcp.sireh.model.nomina.calculo.ComparaGralDTO;
import gob.shcp.sireh.model.nomina.calculo.GeneracionCecobanDTO;
import gob.shcp.sireh.model.nomina.calculo.ListaNegativosDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosConceptoEmpleadoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.model.plaza.FinContratoDTO;
import gob.shcp.sireh.service.jms.NominaJMSService;
import gob.shcp.sireh.service.nomina.calculo.CalculoNominaService;
import gob.shcp.sireh.service.nomina.movimientos.ActualizacionNominaService;
import gob.shcp.sireh.service.nomina.reportes.ReporteCalculoService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.math.BigDecimal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.time.DateUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculoNominaController extends AbstractController implements AnnotatedController {

    private static final String idGrupoPagoEstructura = "E";
    private static final String idGrupoPagoEventual = "V";
    private static final String idGrupoPagoHonorarios = "H";
    private static final String idGrupoPagoExtranjero = "J";
    private static final String idNominaOrdinaria = "OR";
    private static final String idNominaIncentivo = "IN";
    private static final String idNominaExtranjero = "CJ";
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago estructura.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasEstructura(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoEstructura, idNominaOrdinaria);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago eventual.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasEventual(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoEventual, idNominaOrdinaria);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago honorarios.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasHonorarios(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoHonorarios, idNominaOrdinaria);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago extranjeros.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasExtranjero(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoExtranjero, idNominaExtranjero);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago eventual - incentivo.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasIncentivoEve(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoEventual, idNominaIncentivo);
    }
    
    /**
     * Metodo encargado de obtener la nomina por grupo de pago estructura -  incentivo.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String consultaNominasIncentivoEst(Model model) {
        return consultaNominasPorGrupo(model, idGrupoPagoEstructura, idNominaIncentivo);
    }
    
    /**
     * Metodo encargado de obtener la nomina solicitada por grupo de pago.
     * @author
     * @param model Model
     * @param idGrupoPago RequestParam
     * @param idTipoNomina RequestParam
     * @return String
     */
    @RequestMapping
    public String consultaNominasPorGrupo(Model model, @RequestParam("idGrupoPago") String idGrupoPago, @RequestParam("idTipoNomina") String idTipoNomina) {
        PagoDTO pagoDTO = new PagoDTO();

        pagoDTO.setIdGrupoPago(idGrupoPago);
        pagoDTO.setIdTipoNomina(idTipoNomina);
        pagoDTO.setDescGrupoPago(super.getService(CalculoNominaService.class).getGrupoPago(idGrupoPago).getDescGrupoPago().trim());
        
        // Quincena anterior
        Integer quincenaActual = super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
        String ciclo = String.valueOf(quincenaActual).substring(0, 4);
        String quincena = String.valueOf(quincenaActual).substring(4, 6);
        String quincenaResta = "";
        if (quincena.equals("01")) {
            quincenaResta = "24";
        } else if (quincena.equals("24") || quincena.equals("23") || quincena.equals("22") || quincena.equals("21") || 
                   quincena.equals("20") || quincena.equals("19") || quincena.equals("18") || quincena.equals("17") || 
                   quincena.equals("16") || quincena.equals("15") || quincena.equals("14") || quincena.equals("13") || 
                   quincena.equals("12") || quincena.equals("11")) {
            quincenaResta = String.valueOf(new Integer(quincena) -1);
        } else {
            quincenaResta = "0" + String.valueOf(new Integer(quincena) -1);
        }
        
        if (idGrupoPago.equals(idGrupoPagoEstructura) && idTipoNomina.equals(idNominaOrdinaria)) {
            pagoDTO.setViewName("consultaNominasEstructura");
            pagoDTO.setBeanName("listaNominasQnaPorGrupo");
            pagoDTO.setUrlDestino("consultaNominasEstructura");
            
        } else if (idGrupoPago.equals(idGrupoPagoEventual) && idTipoNomina.equals(idNominaOrdinaria)) {
            pagoDTO.setViewName("consultaNominasEventual");
            pagoDTO.setBeanName("listaNominasQnaPorGrupo");
            pagoDTO.setUrlDestino("consultaNominasEventual");
            
        } else if (idGrupoPago.equals(idGrupoPagoHonorarios) && idTipoNomina.equals(idNominaOrdinaria)) {
            pagoDTO.setViewName("consultaNominasHonorarios");
            pagoDTO.setBeanName("listaNominasQnaPorGrupo");
            pagoDTO.setUrlDestino("consultaNominasHonorarios");
            
        } else if (idGrupoPago.equals(idGrupoPagoExtranjero) && idTipoNomina.equals(idNominaExtranjero)) {
            pagoDTO.setViewName("consultaNominasExtranjero");
            pagoDTO.setBeanName("listaNominasQnaPorGrupo");
            pagoDTO.setUrlDestino("consultaNominasExtranjero");
            
        } else if (idGrupoPago.equals(idGrupoPagoEstructura) && idTipoNomina.equals(idNominaIncentivo)) {
            pagoDTO.setViewName("consultaNominasIncentivoEstructura");
            pagoDTO.setBeanName("listaNominasQnaIncentivo");
            //pagoDTO.setQuincenaProceso(super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger() - 1);
            pagoDTO.setQuincenaProceso(new Integer(ciclo + quincenaResta));
            pagoDTO.setUrlDestino("consultaNominasIncentivoEst");
            logger.debug("Quincena proceso IN-EST --------------> " + pagoDTO.getQuincenaProceso());
            
        } else if (idGrupoPago.equals(idGrupoPagoEventual) && idTipoNomina.equals(idNominaIncentivo)) {
            pagoDTO.setViewName("consultaNominasIncentivoEventual");
            pagoDTO.setBeanName("listaNominasQnaIncentivo");
            //pagoDTO.setQuincenaProceso(super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger() - 1);
            pagoDTO.setQuincenaProceso(new Integer(ciclo + quincenaResta));
            pagoDTO.setUrlDestino("consultaNominasIncentivoEve");
            logger.debug("Quincena proceso IN-EVE --------------> " + pagoDTO.getQuincenaProceso());
            
        }
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoPorGrupo");
    }

    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author
     * @param model Model
     * @param idGrupoPago RequestParam
     * @return String
     */
    @RequestMapping
    public String listaRFCsPorGrupoPago(Model model, 
                                        @RequestParam("idGrupoPago") String idGrupoPago, 
                                        @RequestParam("idQna") int idQna, 
                                        @RequestParam("status") String status,
                                        @RequestParam("idTipoNomina") String idTipoNomina,
                                        @RequestParam("nomFuenteDatos") String nomFuenteDatos,
                                        PagoDTO pagoDTO) {
        logger.debug("--> listaRFCsPorGrupoPago(" + idGrupoPago + "," + idQna + "," + status + ")");
        
        // Nomina procesada
        if (status.equals("P")) {
            super.saveMessage(model, "nomina.calculo.procesando", idQna);
            return consultaNominasPorGrupo(model, idGrupoPago, idTipoNomina);
        }
        
        pagoDTO.setIdGrupoPago(idGrupoPago);
        pagoDTO.setIdTipoNomina(idTipoNomina);
        
        pagoDTO.setDescGrupoPago(super.getService(CalculoNominaService.class).getGrupoPago(idGrupoPago).getDescGrupoPago().trim());
        pagoDTO.setIdQna(idQna);
        pagoDTO.setStatus(status);
        
        // Nomina sin proceso
        if (status.equals("N")) {
            // Actualizar el status a Procesando en la nomina seleccionada.
            super.getService(CalculoNominaService.class).updateStatusProcesandoNominaQna(idQna);
            String operationalYear = super.security().getOperationYear();
            Map<String, Map<String, String>> dimensiones = super.security().getDimensions();

            // Se invoca el servicio de JMS para invocar el store de finalizacion de la nomina, asincronicamente.
            super.getService(NominaJMSService.class).sendNominaGpoPago(idQna, 0, "x",idGrupoPago, nomFuenteDatos, operationalYear, dimensiones, super.security().getUserName(), true);

            super.saveMessage(model, "nomina.calculo.procesada", idQna);         
            return consultaNominasPorGrupo(model, idGrupoPago, idTipoNomina);
        }
        
        // Casos de muestra
        Collection<String> listaRFCsCasoMuestra = super.getService(CalculoNominaService.class).getRFCsCasosMuestra(idGrupoPago, idQna);
        
        if (listaRFCsCasoMuestra != null && listaRFCsCasoMuestra.size() > 0) {
            String[] arrayRfcsCasosMuestra = listaRFCsCasoMuestra.toArray(new String[0]);
            pagoDTO.setCasosMuestra(arrayRfcsCasosMuestra); // RFCs de los casos muestra para setear los checkboxes.
            pagoDTO.setCasoMuestraOld(arrayToString(arrayRfcsCasosMuestra, ",")); // Para guardar el estado anterior de los casos muestra.
        }
        pagoDTO.setViewName("listaRFCsPorGrupoPago");
        
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoRFCs");
    }

    @RequestMapping
    public String buscaRFCsPorGrupoPago(Model model, PagoDTO pagoDTO) {
        return listaRFCsPorGrupoPago(model, pagoDTO.getIdGrupoPago(), pagoDTO.getIdQna(), "S", pagoDTO.getIdTipoNomina(),null,pagoDTO);
    }
    
    /**
     * Recalcular - Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por RFC.
     * @author
     * @param model Model
     * @param idGrupoPago RequestParam
     * @return String
     */
    @RequestMapping
    public String calculaNominaPorRFC(Model model, 
                                      @RequestParam("idGrupoPago") String idGrupoPago, 
                                      @RequestParam("idQna") int idQna,
                                      @RequestParam("rfcEmpleado") String rfc, 
                                      @RequestParam("idPlaza") int idPlaza, 
                                      PagoDTO pagoDTO) {
        logger.debug("--> calculaNominaPorRFC(" + idGrupoPago + "," + idQna + "," + rfc + "," + idPlaza + ")");
        
        // Se actualizan los casos muestra en base de datos.
        String[] casosMuestra = pagoDTO.getCasosMuestra();
        String casosMuestraOld = pagoDTO.getCasoMuestraOld();
        
        if (casosMuestra != null && casosMuestraOld != null) {
            actualizaCasosMuestra(casosMuestra, casosMuestraOld.split(","), super.getService(CalculoNominaService.class));
        }

        // Se invoca a drools y se inserta en base.
        PagoDTO newPagoDTO = super.getService(CalculoNominaService.class).calcByRFC(rfc);
        
        if (newPagoDTO == null) {
            super.saveMessage(model, "nomina.calculo.rfcnoencontrado", rfc);
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("estructura");
        } else {
            pagoDTO = newPagoDTO;
        }

        super.getService(CalculoNominaService.class).saveNominaRFC(pagoDTO, idQna, idPlaza, rfc, super.security().getUserName());

        // Se invoca el servicio de JMS para invocar el store de finalizacion de la nomina, sincronicamente.
        super.getService(NominaJMSService.class).sendNomina(idQna, idPlaza, rfc, false);

        // Se setean las descripciones para los nuevos conceptos pagados.
        setDescripcionesConceptosPagados(super.getService(CalculoNominaService.class).getDescripcionesConceptosPago(), pagoDTO.getConceptosPagados());

        NominaDTO nominaDTO = super.getService(CalculoNominaService.class).getNominaById(idQna);
        pagoDTO.setNominaDTO(nominaDTO);

        // Se calcula el liquido a pagar.
        pagoDTO.calculaLiquido();
        pagoDTO.setIdGrupoPago(idGrupoPago);
        pagoDTO.setDescGrupoPago(super.getService(CalculoNominaService.class).getGrupoPago(idGrupoPago).getDescGrupoPago().trim());
        pagoDTO.setIdQna(idQna);
        pagoDTO.setRfcEmpleado(rfc);
        pagoDTO.setIdPlaza(idPlaza);
        pagoDTO.setViewName("muestraDetallePorRFC");

        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("estructura");
    }

    @RequestMapping
    public String muestraDetallePorRFC(Model model, 
                                       @RequestParam("idGrupoPago") String idGrupoPago, 
                                       @RequestParam("idQna") int idQna, 
                                       @RequestParam("rfcEmpleado") String rfc, 
                                       @RequestParam("idPlaza") int idPlaza, 
                                       @RequestParam("idTipoNomina") String idTipoNomina, 
                                       PagoDTO pagoDTO) {

        logger.debug("--> muestraDetallePorRFC(" + idGrupoPago + "," + idQna + "," + rfc + "," + idPlaza + "," + idTipoNomina + ")");

        CalculoNominaService service = super.getService(CalculoNominaService.class);

        PagoDTO newPagoDTO = service.getByRFC(rfc);
        if (newPagoDTO == null) {
            super.saveMessage(model, "nomina.calculo.rfcnoencontrado", rfc);
            model.addAttribute("pagoDTO", pagoDTO);
            return super.getViewName("listadoRFCs");
        } else {
            pagoDTO = newPagoDTO;
        }
        
        // Validar si la nómina es de tipo Incentivo
        NominaDTO nominaDTO = idTipoNomina.equals("IN") ? service.getNominaByIdIncentivo(idQna) : service.getNominaById(idQna);
        pagoDTO.setNominaDTO(nominaDTO);

        // Se setean las descripciones para los nuevos conceptos pagados.
        setDescripcionesConceptosPagados(service.getDescripcionesConceptosPago(), pagoDTO.getConceptosPagados());

        // Se calcula el liquido a pagar.
        pagoDTO.calculaLiquido();
        pagoDTO.setIdGrupoPago(idGrupoPago);
        pagoDTO.setDescGrupoPago(service.getGrupoPago(idGrupoPago).getDescGrupoPago().trim());
        pagoDTO.setIdQna(idQna);
        pagoDTO.setRfcEmpleado(rfc);
        pagoDTO.setIdPlaza(idPlaza);
        pagoDTO.setViewName("muestraDetallePorRFC");

        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("estructura");
    }

    @RequestMapping
    public String cancelarCalculoNomina(Model model, PagoDTO pagoDTO) {
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("listadoPorGrupo");
    }

    @RequestMapping
    public String honorarios(Model model) {
        return super.getViewName("honorarios");
    }

    @RequestMapping
    public String aguiPeriodoLaborado(Model model) {
        return super.getViewName("aguiPeriodoLaborado");
    }

    @RequestMapping
    public String aguiDiasLab(Model model) {
        return super.getViewName("aguiDiasLab");
    }

    @RequestMapping
    public String aguiGeneracion(Model model) {
        return super.getViewName("aguiGeneracion");
    }

    @RequestMapping
    public String generacionCecoban(Model model) {

        GeneracionCecobanDTO generacionCecobanDTO = 
            super.getService(CalculoNominaService.class).preparaGeneracionCecoban();

        model.addAttribute(generacionCecobanDTO);
        return super.getViewName("generacionCecoban");
    }

    @RequestMapping
    public String generarArchivoCecoban(Model model, GeneracionCecobanDTO generacionCecobanDTO) {
        if (!validarFechas(generacionCecobanDTO.getFecPresentacion(), generacionCecobanDTO.getFecTransferencia())) {
            super.saveError(model, "nomina.fechasInvalidas.error");
            return super.getViewName("generacionCecoban");
        }

        generacionCecobanDTO = super.getService(CalculoNominaService.class).generarArchivoCecoban(generacionCecobanDTO);
        model.addAttribute(generacionCecobanDTO);

        return super.getViewName("generacionCecoban");
    }

    @RequestMapping
    public String downloadFile(Model model, GeneracionCecobanDTO generacionCecobanDTO, HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + generacionCecobanDTO.getNombreArchivo();

        try {
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);
                response.setContentType("text/plain");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + generacionCecobanDTO.getNombreArchivoUser() + "\"");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
        } finally {
            try {
                fs.close();
            } catch (IOException e) {

            }
        }
        return null;
    }


    private void actualizaCasosMuestra(String[] casosMuestra, String[] casosMuestraOld, CalculoNominaService service) {
        if (casosMuestra == null && casosMuestraOld == null)
            return;

        if (casosMuestra == null) {
            casosMuestra = new String[0];
        }
        if (casosMuestraOld == null) {
            casosMuestraOld = new String[0];
        }

        List<String> rfcsCasoMuestraSet = new ArrayList<String>();
        List<String> rfcsCasoMuestraUnset = new ArrayList<String>();

        HashSet<String> hashConCasoMuestra = new HashSet<String>(Arrays.asList(casosMuestra));
        HashSet<String> hashAnteriores = new HashSet<String>(Arrays.asList(casosMuestraOld));

        for (String rfc: hashConCasoMuestra) {
            if (hashAnteriores.contains(rfc)) {
                hashAnteriores.remove(rfc); // No se actualiza
            } else {
                rfcsCasoMuestraSet.add(rfc); // Se actualiza y setea caso muestra.
            }
        }
        for (String rfc: hashAnteriores) {
            rfcsCasoMuestraUnset.add(rfc); // Se actualiza y unsetea caso muestra.
        }

        if (rfcsCasoMuestraSet.size() != 0) {
            service.updateAndSetCasosMuestra(rfcsCasoMuestraSet);
        }
        if (rfcsCasoMuestraUnset.size() != 0) {
            service.updateAndUnsetCasosMuestra(rfcsCasoMuestraUnset);
        }
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

    private boolean validarFechas(Date fechaInicial, Date fechaFinal) {
        if (!isBusinessDay(fechaInicial) || !isBusinessDay(fechaFinal)) {
            return false;
        }
        return getNextBusinessDay(DateUtils.truncate(fechaInicial, Calendar.DATE)).equals(DateUtils.truncate(fechaFinal, Calendar.DATE));
    }

    private Date getNextBusinessDay(Date startDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //Increment the Date object by a Day and clear out hour/min/sec information
        Date nextDay = DateUtils.truncate(addDays(startDate, 1), Calendar.DATE);
        //If tomorrow is a valid business day, return it
        
        if (isBusinessDay(nextDay)) {
            return nextDay;
        } else { 
            //Else we recursively call our function until we find one. 
            return getNextBusinessDay(nextDay);
        }
    }

    private boolean isBusinessDay(Date dateToCheck) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //Setup the calendar to have the start date truncated 
        Calendar baseCal = Calendar.getInstance();
        baseCal.setTime(DateUtils.truncate(dateToCheck, Calendar.DATE));
        List<Date> offlimitDates;

        //Grab the list of dates for the year.  These SHOULD NOT be modified. 
        offlimitDates = getOfflimitDates(baseCal.get(Calendar.YEAR));

        //Determine if the date is on a weekend. 
        int dayOfWeek = baseCal.get(Calendar.DAY_OF_WEEK);
        boolean onWeekend = dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;

        //If it's on a holiday, increment and test again 
        //If it's on a weekend, increment necessary amount and test again
        if (offlimitDates.contains(baseCal.getTime()) || onWeekend)
            return false;
        else
            return true;
    }

    private List<Date> getOfflimitDates(int year) {
        List<Date> offlimitDates = new ArrayList<Date>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar baseCalendar = GregorianCalendar.getInstance();
        baseCalendar.clear();

        //Add in the static dates for the year.
        //New years day
        // Anio nuevo
        try {
            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.anioNuevo") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());

            //Dia de la constitución
            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.constitucion") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());


//            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.benitoJuarez") + "/" + year));
//            baseCalendar.set(Calendar.YEAR, year);
//            offlimitDates.add(baseCalendar.getTime());

//            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.juevesSanto") + "/" + year));
//            baseCalendar.set(Calendar.YEAR, year);
//            offlimitDates.add(baseCalendar.getTime());

//            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.viernesSanto") + "/" + year));
//            baseCalendar.set(Calendar.YEAR, year);
//            offlimitDates.add(baseCalendar.getTime());

            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.diaTrabajo") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());

            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.diaIndependencia") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());

            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.diaMuertos") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());

            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.diaRevolucion") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());

            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.diaEmpleadoBancario") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());
            
            baseCalendar.setTime(formatter.parse(super.configuration().getString("mensajesHolidaysMexico", "date.holiday.navidad") + "/" + year));
            baseCalendar.set(Calendar.YEAR, year);
            offlimitDates.add(baseCalendar.getTime());
        } catch (ParseException e) {
            // TODO
        }
        return offlimitDates;
    }

    private Date addDays(Date dateToAdd, int numberOfDay) {
        if (dateToAdd == null)
            throw new IllegalArgumentException("Date can't be null!");
            
        Calendar tempCal = Calendar.getInstance();
        tempCal.setTime(dateToAdd);
        tempCal.add(Calendar.DATE, numberOfDay);
        return tempCal.getTime();
    }

    /**
     * Metodo encargado de elaborar consultas entre una quincenay otra (altas y bajas)
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param altasybajasDTO AltasYBajasDTO
     * @return String
     */
    @RequestMapping
    public String altasYbajas(Model model, AltasYBajasDTO altasybajasDTO) {
        if (altasybajasDTO.isCancel()) {
            altasybajasDTO = new AltasYBajasDTO();
        }
        if (altasybajasDTO.isMuestraRegistros()) {
            String datosi = altasybajasDTO.getNomIni();
            String tempi[];
            tempi = datosi.split("-");
            altasybajasDTO.setTipoNomIni(tempi[0].trim());
            altasybajasDTO.setGpoPagoIni(tempi[1].trim());
            // altasybajasDTO.setNumCompIni(Integer.parseInt(tempi[2].trim()));
            altasybajasDTO.setNumCompIni(tempi[2].trim());
            String datosf = altasybajasDTO.getNomFin();
            String tempf[];
            tempf = datosf.split("-");
            altasybajasDTO.setTipoNomFin(tempf[0].trim());
            altasybajasDTO.setGpoPagoFin(tempf[1].trim());
            // altasybajasDTO.setNumCompFin(Integer.parseInt(tempf[2].trim()));
            altasybajasDTO.setNumCompFin(tempf[2].trim());
        }
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(altasybajasDTO);
        return super.getViewName("altasYbajas"); //Va el nombre de la JSP o del Servlet 
    }
    
     /**
     * Metodo encargado de los cambios de conceptos entre nóminas
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param comparaConDTO ComparaConDTO
     * @return String
     */
    @RequestMapping
    public String comparaCon(Model model, ComparaConDTO comparaConDTO) {
        if (comparaConDTO.isCancel()) {
            comparaConDTO = new ComparaConDTO();
        }
        if (comparaConDTO.isMuestraRegistros()) {
            String datosi = comparaConDTO.getNomIni();
            String tempi[];
            tempi = datosi.split("-");
            comparaConDTO.setTipoNomIni(tempi[0].trim());
            comparaConDTO.setGpoPagoIni(tempi[1].trim());
            comparaConDTO.setNumCompIni(Integer.parseInt(tempi[2].trim()));
            String datosf = comparaConDTO.getNomFin();
            String tempf[];
            tempf = datosf.split("-");
            comparaConDTO.setTipoNomFin(tempf[0].trim());
            comparaConDTO.setGpoPagoFin(tempf[1].trim());
            comparaConDTO.setNumCompFin(Integer.parseInt(tempf[2].trim()));
        }
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(comparaConDTO);
        return super.getViewName("comparaCon"); //Va el nombre de la JSP o del Servlet 
    }

    /**
     * Metodo encargado de los cambios de datos generales entre nóminas
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param comparaGralDTO ComparaGralDTO
     * @return String
     */
    @RequestMapping
    public String comparaGral(Model model, ComparaGralDTO comparaGralDTO) {
        if (comparaGralDTO.isCancel()) {
            comparaGralDTO = new ComparaGralDTO();
        }
        if (comparaGralDTO.isMuestraRegistros()) {
            String datosi = comparaGralDTO.getNomIni();
            String tempi[];
            tempi = datosi.split("-");
            comparaGralDTO.setTipoNomIni(tempi[0].trim());
            comparaGralDTO.setGpoPagoIni(tempi[1].trim());
            comparaGralDTO.setNumCompIni(Integer.parseInt(tempi[2].trim()));
            String datosf = comparaGralDTO.getNomFin();
            String tempf[];
            tempf = datosf.split("-");
            comparaGralDTO.setTipoNomFin(tempf[0].trim());
            comparaGralDTO.setGpoPagoFin(tempf[1].trim());
            comparaGralDTO.setNumCompFin(Integer.parseInt(tempf[2].trim()));
        }
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(comparaGralDTO);
        return super.getViewName("comparaGral"); //Va el nombre de la JSP o del Servlet 
    }
    
    /**
     * Metodo encargado de listar importes negativos
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param listaNegativosDTO ListaNegativosDTO
     * @return String
     */
    @RequestMapping
    public String listaNegativos(Model model, ListaNegativosDTO listaNegativosDTO) {
        if (listaNegativosDTO.isCancel()) {
            listaNegativosDTO = new ListaNegativosDTO();
        }
        if (listaNegativosDTO.isMuestraRegistros()) {
            String datosi = listaNegativosDTO.getNomIni();
            String tempi[];
            tempi = datosi.split("-");
            listaNegativosDTO.setTipoNomIni(tempi[0].trim());
            listaNegativosDTO.setGpoPagoIni(tempi[1].trim());
            listaNegativosDTO.setNumCompIni(Integer.parseInt(tempi[2].trim()));
        }
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(listaNegativosDTO);
        return super.getViewName("listaNegativos"); //Va el nombre de la JSP o del Servlet 
    }


    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina/conceptos con o sin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String cifrasPagoPorQnas(Model model) {
        PagoDTO pagoDTO = new PagoDTO();
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("cifrasPagoPorQnas");
    }
    

    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String historicoRevisionTodos(Model model, PagoDTO pagoDTO, HttpServletResponse response) throws IOException {
        if (pagoDTO.getIdQna() == 0) {
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("cifrasPagoPorQnas");
        }
        String tipoarchivo = "T";
        String tipoarchivodesc = "TodosLosConceptos";
        return createFile(model, pagoDTO, response, tipoarchivo, tipoarchivodesc);
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String historicoRevisionConPago(Model model, PagoDTO pagoDTO, HttpServletResponse response) throws IOException {
        if (pagoDTO.getIdQna() == 0) {
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("cifrasPagoPorQnas");
        }
        String tipoarchivo = "D";
        String tipoarchivodesc = "SoloConceptosConPago";
        return createFile(model, pagoDTO, response, tipoarchivo, tipoarchivodesc);
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina beneficiarias de pensión alimenticia
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String historicoRevisionConPA(Model model, PagoDTO pagoDTO, HttpServletResponse response) throws IOException {
        if (pagoDTO.getIdQna() == 0) {
            super.saveWarning(model, "warn.empty.selecc");
                return super.getViewName("cifrasPagoPorQnas");
        }
        String tipoarchivo="P";
        String tipoarchivodesc="SoloPensionAlimenticia";
        return createFile( model,  pagoDTO,  response,tipoarchivo,tipoarchivodesc);
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina y conceptos de control
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String historicoRevisionControl(Model model, PagoDTO pagoDTO, HttpServletResponse response) throws IOException {
        if (pagoDTO.getIdQna() == 0) {
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("cifrasPagoPorQnas");
        }
        
        String tipoarchivo = "C";
        String tipoarchivodesc = "ConceptosPatronales";
        return createFile(model, pagoDTO, response, tipoarchivo, tipoarchivodesc);
    }

    /**
     * Convierte un arreglo de strings concatenandolos separados por un delimitador
     */
    private String arrayToString(String[] array, String delim) {
        StringBuffer sb = new StringBuffer();

        for (String bucket: array) {
            sb.append(bucket).append(delim);
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - delim.length(), sb.length());
        }
        return sb.toString();
    }
    
    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de nomina y conceptos con o sin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    private String createFile(Model model, PagoDTO pagoDTO, 
                              HttpServletResponse response, String tipoarchivo, 
                              String tipoarchivodesc) throws IOException {
        Object campo;
        Integer consecNomina = pagoDTO.getIdQna();
        logger.debug("consecNomina:::" + consecNomina);
        List<Map<Integer, Object>> histRevList = super.getService(ReporteCalculoService.class).getHistoricoRevision(consecNomina, tipoarchivo);
        StringBuilder strCsv = new StringBuilder();
        
        if(histRevList.isEmpty()){
            super.saveWarning(model,"warn.data.list");
            return super.getViewName("listadoRFCsPorGrupoPago"); 
        }

        for (Map row: histRevList) {
            for (int i = 1; i <= row.size(); i++) {
                campo = row.get(i);

                if (campo == null || campo.toString().equals("null") || campo.toString().length() < 1) {
                    campo = " ";
                }
                strCsv.append(campo);
                strCsv.append(",");
            }
            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
        }
        
        String qnaGrupo = pagoDTO.getDescGrupoPago() != null ? pagoDTO.getDescGrupoPago() : String.valueOf(pagoDTO.getQuincenaProceso());
        
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "HistoricoRevision_" +  qnaGrupo +  "_Consecutivo_de_nomina_" + pagoDTO.getIdQna() +  "_" + tipoarchivodesc + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
    }
    
    @RequestMapping
     public String listEmplConceptosControl(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()){
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("calculoNomina");
        consultaEmpleadoDTO.setUrlOrigen("listEmplConceptosControl");
        consultaEmpleadoDTO.setUrlDestino("conceptosControl");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
    
    @RequestMapping
    public String conceptosControl(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado){
        String retorno = null;
        DatosEmpleadoCptoDTO datosEmpleadoCptoDTO = new DatosEmpleadoCptoDTO();
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
        if(datosEmpleadoCptoDTO == null){
            super.saveError(model, "error.actualizacionNomina.datosEmpleadoCptoG");
            model.addAttribute(new DatosEmpleadoCptoDTO());
            retorno = super.getViewName("conceptosEmpleado");
        }
        else {
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosControl");
        }
        return retorno;
    }
    
    @RequestMapping
    public String addConceptoControl(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        String retorno = null;
        if(datosEmpleadoCptoDTO.getSelectedConceptoComboBox().equals("0")){
            super.saveError(model, "Seleccione el concepto que sera asignado al empleado.");
            retorno = super.getViewName("conceptosControl");
        } 
        else {
            StringTokenizer st = new StringTokenizer(datosEmpleadoCptoDTO.getSelectedConceptoComboBox(), "|", false);
            datosEmpleadoCptoDTO.setIdTipoCpto(st.nextToken());
            datosEmpleadoCptoDTO.setIdConcepto(st.nextToken()); 
            datosEmpleadoCptoDTO.setCpcTipoCaptura(st.nextToken());
            datosEmpleadoCptoDTO.setCpcTipoCalculo(st.nextToken());
            datosEmpleadoCptoDTO.setCpcPermanente(st.nextToken());
            datosEmpleadoCptoDTO.setCpcMensaje(st.nextToken());
            datosEmpleadoCptoDTO.setDescConPag(st.nextToken());
            datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID()); 
            
            List<Integer> qnaInicial = super.getService(ActualizacionNominaService.class).getQnaInicial();
            Iterator itr = qnaInicial.iterator();
            Integer qna = (Integer) itr.next();
            Integer anio = (Integer) itr.next();
            
            datosEmpleadoCptoDTO.setAnioQnaInicial(anio);
            datosEmpleadoCptoDTO.setQnaQnaInicial(qna);
            
            if(qna<10){ 
                datosEmpleadoCptoDTO.setMcpQnaIni(Integer.parseInt(anio+"0"+qna));
                datosEmpleadoCptoDTO.setMcpQnaIniLabel(anio+"0"+qna);
            }
            else{  
                datosEmpleadoCptoDTO.setMcpQnaIni(Integer.parseInt(anio+""+qna));
                datosEmpleadoCptoDTO.setMcpQnaIniLabel(anio+""+qna);
            }
            
            if(datosEmpleadoCptoDTO.getCpcPermanente().equals("N1")){
                datosEmpleadoCptoDTO.setMcpQnaFin(datosEmpleadoCptoDTO.getMcpQnaIni());
                datosEmpleadoCptoDTO.setMcpQnaFinLabel("SOLO POR ESTA QUINCENA");
                datosEmpleadoCptoDTO.setMcpQnaADescontar(1);
            }
            if(!(datosEmpleadoCptoDTO.getCpcPermanente().equals("N1"))){
                datosEmpleadoCptoDTO.setMcpQnaFin(datosEmpleadoCptoDTO.getMcpQnaIni());
                datosEmpleadoCptoDTO.setMcpQnaFinLabel("EL CONCEPTO NO TIENE PARAMETRIZACION DE PERMANENTE");
                datosEmpleadoCptoDTO.setMcpQnaADescontar(1);
            }
            
            datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(1) );
            //datosEmpleadoCptoDTO.setMcpMontoLabel("1.00");
            
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("addConceptosControl");
        }             
        return retorno;
    }
    
    @RequestMapping
    public String addrConceptoControl(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        if(datosEmpleadoCptoDTO.getMcpMontoLabel() == null){
            super.saveError(model, "El campo monto es obligatorio; Proporcione un monto.");
            return super.getViewName("addConceptosControl");
        }
        
        datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
        super.getService(ActualizacionNominaService.class).agregarConceptoEmpleado(datosEmpleadoCptoDTO);
        
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
        
        datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
        datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("conceptosControl");
    }
    
    @RequestMapping
    public String deleteConceptoControl(Model model,  @RequestParam("conceptoYtipoConcepto") String conceptoYtipoConcepto, @RequestParam("cpcSubTipo") String cpcSubTipo, @RequestParam("cpcSubTipoDesc") String cpcSubTipoDesc, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        datosEmpleadoCptoDTO.setIdTipoCpto(conceptoYtipoConcepto.substring(0,1));
        datosEmpleadoCptoDTO.setIdConcepto(conceptoYtipoConcepto.substring(1,3));
        
        DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO = new DatosConceptoEmpleadoDTO();
        datosConceptoEmpleadoDTO.setRfcEmpleado(datosEmpleadoCptoDTO.getRfcEmpleado());
        datosConceptoEmpleadoDTO.setIdTipoCpto(datosEmpleadoCptoDTO.getIdTipoCpto());
        datosConceptoEmpleadoDTO.setIdConcepto(datosEmpleadoCptoDTO.getIdConcepto());
        
        datosConceptoEmpleadoDTO = super.getService(ActualizacionNominaService.class).buscarDetalleConceptoEmpleadoBis(datosConceptoEmpleadoDTO);
        
        datosEmpleadoCptoDTO.setIdTipoCpto(datosConceptoEmpleadoDTO.getIdTipoCpto());
        datosEmpleadoCptoDTO.setIdConcepto(datosConceptoEmpleadoDTO.getIdConcepto());
        datosEmpleadoCptoDTO.setDescConPag(datosConceptoEmpleadoDTO.getDescConPag());
        datosEmpleadoCptoDTO.setMcpMonto(datosConceptoEmpleadoDTO.getMcpMonto());
        datosEmpleadoCptoDTO.setMcpPorcentaje(datosConceptoEmpleadoDTO.getMcpPorcentaje());
        datosEmpleadoCptoDTO.setMcpMontoAdeudo(datosConceptoEmpleadoDTO.getMcpMontoAdeudo());
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("deleteConceptosControl");
    }
    
    @RequestMapping
    public String deleterConceptoControl(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        String retorno = null;
        String subtipo      = datosEmpleadoCptoDTO.getCpcSubTipo();
        String subtipoDesc  = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
        if(datosEmpleadoCptoDTO.getMcpRefCancela().equals("") || datosEmpleadoCptoDTO.getMcpRefCancela() == null){
            super.saveError(model, "actualizacionNomina.eliminaConceptosEmpleado.referencia.error");
            retorno = super.getViewName("deleteConceptosControl");   }
        if(!datosEmpleadoCptoDTO.getMcpRefCancela().equals("") && datosEmpleadoCptoDTO.getMcpRefCancela() != null){
            super.getService(ActualizacionNominaService.class).eliminaConceptoEmpleado(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosControl");   
            
            datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto()==null?" ":datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento()==null?" ":datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            datosEmpleadoCptoDTO.setCpcSubTipo(subtipo);
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(subtipoDesc);
        }
        model.addAttribute(datosEmpleadoCptoDTO);
        return retorno;
    }
    
    @RequestMapping
    public String finContrato(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO, HttpServletResponse response) throws IOException {
        String retorno = null;
                
        if(datosEmpleadoCptoDTO.getMcpQnaFinLabel() == null){
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("finContrato");
        }
        
        else if(datosEmpleadoCptoDTO.getMcpQnaFinLabel() != null){
            if(datosEmpleadoCptoDTO.getMcpQnaFinLabel().equals("0")){
                super.saveError(model, "Seleccione el criterio de busuqeda.");
                retorno = super.getViewName("finContrato");
            }
            
            else if(!datosEmpleadoCptoDTO.getMcpQnaFinLabel().equals("0")){
                List<FinContratoDTO> lPlazas = super.getService(CalculoNominaService.class).finContrato(datosEmpleadoCptoDTO.getMcpQnaFinLabel());
            
                byte[] bytes = layoutPlazasCanceladas(lPlazas).toString().getBytes();
                
                response.setContentType("text/csv");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=\"" + "finContratos.csv");
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
                
                retorno = null;
            }
        }
        return retorno;
    }
    
    public StringBuilder layoutPlazasCanceladas(List<FinContratoDTO> listaPlazas){
        String layout = "QUINCENA, FECHA INICIO CONTRATO, FECHA FIN CONTRATO, " +
                        "CURP, RFC, EPELLIDO PATERNO, APELLIDO MATERNO, NOMBRE, " +
                        "PUESTO FUNCIONAL, PLAZA, NIVEL, UNIDAD FISICA, GRUPO PAGO";
        StringBuilder stringBuild = new StringBuilder();
        
        stringBuild.append(layout);
        stringBuild.append("\r\n");
        for(FinContratoDTO plaza:listaPlazas){
            stringBuild.append(plaza.getQuincena());
            stringBuild.append(",");
            stringBuild.append(plaza.getPlazaIniContrato());
            stringBuild.append(",");
            stringBuild.append(plaza.getPlazaFinContrato());
            stringBuild.append(",");
            stringBuild.append(plaza.getCurpEmpleado());
            stringBuild.append(",");
            stringBuild.append(plaza.getRfcEmpleado());
            stringBuild.append(",");
            stringBuild.append(plaza.getPApellido());
            stringBuild.append(",");
            stringBuild.append(plaza.getSApellido());
            stringBuild.append(",");
            stringBuild.append(plaza.getNombre());
            stringBuild.append(",");
            stringBuild.append(plaza.getPuesto());
            stringBuild.append(",");
            stringBuild.append(plaza.getPlaza());
            stringBuild.append(",");
            stringBuild.append(plaza.getNivelPuesto());
            stringBuild.append(",");
            stringBuild.append(plaza.getUnidad());
            stringBuild.append(",");
            stringBuild.append(plaza.getDESC_GRUPO_PAGO());
            
            stringBuild.append("\r\n");
        }
        return stringBuild;
    } 

    /**
     * Metodo encargado de iniciar el módulo de acumulados por periodo y RFCsin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String acumuladoTrabajador(Model model){
        PagoDTO pagoDTO = new PagoDTO();
        model.addAttribute("pagoDTO", pagoDTO);
        return super.getViewName("acumuladoTrabajador");
    }

    /**
     * Metodo encargado de ejecutar la generacion de archivos con acumulados por periodo y RFC sin pago
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String historicoAcumulados(Model model, PagoDTO pagoDTO, HttpServletResponse response) throws IOException {
        if (pagoDTO.getQuincenaAnterior() == 0 || pagoDTO.getQuincenaPosterior() == 0
            || pagoDTO.getStatus() == null || pagoDTO.getStatus().toString().length() < 1

        ) {
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("acumuladoTrabajador");
        }
        return createFileAcu(model, pagoDTO, response);
    }
    
    /**
     * Metodo encargado de ejecutar la generacion de archivos con informacion de acumulados por periodo y rfc
     * @author Roberto Muñoz
     * @param model Model
     * @return String
     */
    private String createFileAcu(Model model, PagoDTO pagoDTO, 
                              HttpServletResponse response) throws IOException {
        Object campo;
        Integer qnaini = pagoDTO.getQuincenaAnterior() ;
        Integer qnafin = pagoDTO.getQuincenaPosterior() ;
        String rfc = pagoDTO.getRfcEmpleado();
        String rfcb = "'"+pagoDTO.getRfcEmpleado()+"'";        
        String estatus = pagoDTO.getStatus();
        String tipopro = pagoDTO.getIdTipoNomina();
        List<Map<Integer, Object>> histRevList = super.getService(ReporteCalculoService.class).getHistoricoAcumulado(qnaini, qnafin, rfc, rfcb, estatus, tipopro);
        StringBuilder strCsv = new StringBuilder();
        
        if(histRevList.isEmpty()){
            super.saveWarning(model,"warn.data.list");
            return super.getViewName("listadoRFCsPorGrupoPago"); 
        }

        for (Map row: histRevList) {
            for (int i = 1; i <= row.size(); i++) {
                campo = row.get(i);

                if (campo == null || campo.toString().equals("null") || campo.toString().length() < 1) {
                    campo = " ";
                }
                strCsv.append(campo);
                strCsv.append(",");
            }
            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
        }
        
        String tipodesc="";
        
        if (pagoDTO.getIdTipoNomina().equals("C")) {tipodesc="CONCEPTOS DE CONTROL";}
        if (pagoDTO.getIdTipoNomina().equals("D")) {tipodesc="CONCEPTOS AFECTADOS";}
        if (pagoDTO.getIdTipoNomina().equals("T")) {tipodesc="TODOS LOS CONCEPTOS";}
        if (pagoDTO.getIdTipoNomina().equals("P")) {tipodesc="CONCEPTOS DE PENSION ALIMENTICIA";}        
        
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/plain");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + " ACUMULADO DE " + tipodesc + " " + pagoDTO.getRfcEmpleado() +  " DE LA QNA " + pagoDTO.getQuincenaAnterior() +  " A " + pagoDTO.getQuincenaPosterior() + ".csv" + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);
        return null;
    }

}
