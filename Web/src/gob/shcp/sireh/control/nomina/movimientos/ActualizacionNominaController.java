package gob.shcp.sireh.control.nomina.movimientos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.actualizacion.ActualizaErarioFedDTO;
import gob.shcp.sireh.model.nomina.actualizacion.ConsultaEmpleadoFonacDTO;
import gob.shcp.sireh.model.nomina.actualizacion.GestionFonacDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosConceptoEmpleadoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;
import gob.shcp.sireh.model.nomina.conceptos.MovtoConceptoPagoDTO;
import gob.shcp.sireh.service.nomina.movimientos.ActualizacionNominaService;

import java.math.BigDecimal;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ActualizacionNominaController extends AbstractController implements AnnotatedController {
    /**************************** CONCEPTOS GENERALES ******************************************
     * Control de la pagina de listado de RFCs de empleados.
     * @param model
     * @param consultaEmpleadoDTO
     * @return
     */
    @RequestMapping
     public String listarEmpleadosConConceGen(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()){
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoDTO.setUrlOrigen("listarEmpleadosConConceGen");
        consultaEmpleadoDTO.setUrlDestino("datosEmpleadoCptoG");
        consultaEmpleadoDTO.setMenuTitle( "De ayudas, primas y premios" );
        consultaEmpleadoDTO.setNombrePantalla( "actualizacionNomina" );

        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
    
    /**
     * Control de la vista de los CONCEPTOS.
     * @param model
     * @param rfcEmpleado
     * @return
     */
    @RequestMapping
    public String datosEmpleadoCptoG(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        String retorno = null;
        DatosEmpleadoCptoDTO datosEmpleadoCptoDTO = new DatosEmpleadoCptoDTO();
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
        if(datosEmpleadoCptoDTO == null){
            super.saveError(model, "error.actualizacionNomina.datosEmpleadoCptoG");
            model.addAttribute(new DatosEmpleadoCptoDTO());
            retorno = super.getViewName("conceptosEmpleado");//mcs
        }
        else {
            datosEmpleadoCptoDTO.setCpcSubTipo("G");
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(" De ayudas, primas y premios ");
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosEmpleado");
        }
        return retorno;
    }


    /**
     * Control de la vista de Eliminar Conceptos.
     * @param model
     * @param conceptoYtipoConcepto
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String validaEliminarConceptoDelEmpleado(Model model, @RequestParam("conceptoYtipoConcepto") String conceptoYtipoConcepto, @RequestParam("cpcSubTipo") String cpcSubTipo, @RequestParam("cpcSubTipoDesc") String cpcSubTipoDesc, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO) {
        datosEmpleadoCptoDTO.setIdTipoCpto(conceptoYtipoConcepto.substring(0,1));
        datosEmpleadoCptoDTO.setIdConcepto(conceptoYtipoConcepto.substring(1,3));
        
        DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO = new DatosConceptoEmpleadoDTO();
        datosConceptoEmpleadoDTO.setRfcEmpleado(datosEmpleadoCptoDTO.getRfcEmpleado());
        datosConceptoEmpleadoDTO.setIdTipoCpto(datosEmpleadoCptoDTO.getIdTipoCpto());
        datosConceptoEmpleadoDTO.setIdConcepto(datosEmpleadoCptoDTO.getIdConcepto());
            
        datosConceptoEmpleadoDTO = super.getService(ActualizacionNominaService.class).buscarDetalleConceptoEmpleado(datosConceptoEmpleadoDTO);
            
        datosEmpleadoCptoDTO.setIdTipoCpto(datosConceptoEmpleadoDTO.getIdTipoCpto());
        datosEmpleadoCptoDTO.setIdConcepto(datosConceptoEmpleadoDTO.getIdConcepto());
        datosEmpleadoCptoDTO.setDescConPag(datosConceptoEmpleadoDTO.getDescConPag());
        datosEmpleadoCptoDTO.setMcpMonto(datosConceptoEmpleadoDTO.getMcpMonto());
        datosEmpleadoCptoDTO.setMcpPorcentaje(datosConceptoEmpleadoDTO.getMcpPorcentaje());
        datosEmpleadoCptoDTO.setMcpMontoAdeudo(datosConceptoEmpleadoDTO.getMcpMontoAdeudo());
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("eliminaConceptoEmpleado");
    }
    
    /**
     * Metodo para eliminar Conceptos.
     * @param model
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String eliminaConceptoEmpleado(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        String retorno = null;
        String subtipo      = datosEmpleadoCptoDTO.getCpcSubTipo();
        String subtipoDesc  = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
        if(datosEmpleadoCptoDTO.getMcpRefCancela().equals("") || datosEmpleadoCptoDTO.getMcpRefCancela() == null){
            super.saveError(model, "actualizacionNomina.eliminaConceptosEmpleado.referencia.error");
            retorno = super.getViewName("eliminaConceptoEmpleado");   }
        if(!datosEmpleadoCptoDTO.getMcpRefCancela().equals("") && datosEmpleadoCptoDTO.getMcpRefCancela() != null){
            super.getService(ActualizacionNominaService.class).eliminaConceptoEmpleado(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosEmpleado");   
            
            datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto()==null?" ":datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento()==null?" ":datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            datosEmpleadoCptoDTO.setCpcSubTipo(subtipo);
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(subtipoDesc);
        }
        model.addAttribute(datosEmpleadoCptoDTO);
        return retorno;
    }
    
    
    /**
     * Control de la vista agregar Conceptos.
     * @param model
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String agregaConceptoEmpleado(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
         String retorno = null;
         Map<String, Object> opcRdButtons = null;
        
        if(datosEmpleadoCptoDTO.getSelectedConceptoComboBox().equals("0")){
            super.saveError(model, "Seleccione el concepto que desea agregar al empleado, de la lista desplegable en el campo conceptos");
            retorno = super.getViewName("conceptosEmpleado");
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
            
            if(datosEmpleadoCptoDTO.getCpcPermanente().equals("P")){
                datosEmpleadoCptoDTO.setMcpQnaFinLabel("HASTA QUE SE DE DE BAJA EL CONCEPTO");
                datosEmpleadoCptoDTO.setMcpQnaFin(209901);
            }
            
            if(datosEmpleadoCptoDTO.getCpcPermanente().equals("N1")){
                datosEmpleadoCptoDTO.setMcpQnaFin(datosEmpleadoCptoDTO.getMcpQnaIni());
                datosEmpleadoCptoDTO.setMcpQnaFinLabel("SOLO POR ESTA QUINCENA");
                datosEmpleadoCptoDTO.setMcpQnaADescontar(1);
                //int N1Quincenas = (datosEmpleadoCptoDTO.getMcpQnaFin() - datosEmpleadoCptoDTO.getMcpQnaIni()) + 1; 
                //datosEmpleadoCptoDTO.setMcpQnaADescontar(N1Quincenas);
            }
            
            if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("O")){
                opcRdButtons = super.getService(ActualizacionNominaService.class).colsultaTcCptsPagoCaptOpcRdbuttons(datosEmpleadoCptoDTO.getIdTipoCpto(), datosEmpleadoCptoDTO.getIdConcepto());
                datosEmpleadoCptoDTO.setMapaOpcionesRdButtons(opcRdButtons);
                retorno = super.getViewName("agregaConceptoTipoO"); 
            }
            
            else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("S")){
                if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("32")){
                    float sueldo = datosEmpleadoCptoDTO.getTabSueldo().floatValue(); 
                    float dias1  = 30.0f; 
                    float dias2  = 5.0f;
                    float monto  = (sueldo / dias1) * dias2;
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(monto) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(monto));
                }
                else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("P0")) ||
                   (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PA")) ||
                   (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PB")) ){
                    float sueldo = datosEmpleadoCptoDTO.getTabSueldo().floatValue(); 
                    float dias  = 30.0f;
                    float monto  = (sueldo / dias);
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(monto) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(monto));
                }
                else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("67")){
                    float sueldo = datosEmpleadoCptoDTO.getTabSueldo().floatValue();
                    float monto  = (sueldo / 30) * 2;
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(monto) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(monto));
                }
                else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("68")){
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(8.50));
                }
                else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PL")){
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(7500) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(7500.00));
                }
                else {
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel("0.00");
                }
                retorno = super.getViewName("agregaConceptoTipoS"); 
            }
            
            else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("C")){
                if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T0")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T1")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T2")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T3")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T4")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T5")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T6")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T7")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T8")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T9")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TA")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TD")) ){
                    float sueldo = datosEmpleadoCptoDTO.getTabSueldo() == null? new Float(0):datosEmpleadoCptoDTO.getTabSueldo().floatValue(); 
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(sueldo) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel("");
                }
                
                else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PD")){
                    float sueldo = datosEmpleadoCptoDTO.getTabSueldo().floatValue();
                    float monto  = (sueldo / 30); 
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(monto) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(monto));
                }
                else {
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0) );
                    datosEmpleadoCptoDTO.setMcpMontoLabel("0.00");
                }
                retorno = super.getViewName("agregaConceptoTipoC");
            }
            
            /* PARA CUALQUIER OTRO TIPO DE CONCEPTO QUE NO ESTE IMPLEMENTADO - PERO QUE SI TENGA PARAMATRIZACION */
            else {
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0) );
                datosEmpleadoCptoDTO.setMcpMontoLabel("0.00");
            }
        }
        model.addAttribute(datosEmpleadoCptoDTO);
        return retorno;
    }
    
    /**
     * Metodo para agregar Conceptos.
     * @param model
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String agregarConceptoEmpleado(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){ 
        String origenMenu = datosEmpleadoCptoDTO.getCpcSubTipo();
        String origenMenuLabel = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
        
        if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("S")){
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("68")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("P0")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PA")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PB")) ){
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                    datosEmpleadoCptoDTO.setMcpHorasDias(new BigDecimal(datosEmpleadoCptoDTO.getMcpHorasDiasLabel()));
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("67")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PL")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T0")) ||
                    (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("32")) ){
                logger.debug("***************");
            }
            else {
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0) );
                datosEmpleadoCptoDTO.setMcpMontoLabel("0.00");
            }
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("O") && !(datosEmpleadoCptoDTO.getIdConcepto().equals("AX"))){
            datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton())); 
            
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("98")){
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("AS")){
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("50")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else {  datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));  }
            
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("C")){
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("03")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("08")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("83")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()) );
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getMcpPorcentajeLabel()) );
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("29")) || 
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("LP ")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                datosEmpleadoCptoDTO.setMcpHorasDias(new BigDecimal(datosEmpleadoCptoDTO.getMcpHorasDiasLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("38")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("44")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("46")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A1"))  || 
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A2")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A3")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A4")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A5")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("51")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("54")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("56")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("57")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("72")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("79")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("AR")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("75")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0A")) || 
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0B")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0C")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0D")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0E"))   ){
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal( datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("27")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("34")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("H4")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal( datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("95")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal( datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("AU")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal( datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("NM")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PE")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PF")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PI")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("NP")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PC")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                datosEmpleadoCptoDTO.setMcpHorasDias(new BigDecimal(datosEmpleadoCptoDTO.getMcpHorasDiasLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T0")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T1")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T2")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T3")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T4")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T5")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T6")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T7")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T8")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T9")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TA")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TD")) ){
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                    datosEmpleadoCptoDTO.setMcpHorasDias(new BigDecimal(datosEmpleadoCptoDTO.getMcpHorasDiasLabel()));
            }
            
            else {   datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));   }
        }
        
        /* para los conceptos que tienen implementacion - pero si parametrizacion */
        else {    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0.00));   }
        
        /************************* EXCLUSION DE QUINQUENIOS ********************************************/
        if( !(datosEmpleadoCptoDTO.getIdConcepto().equals("AX"))){
            super.getService(ActualizacionNominaService.class).agregarConceptoEmpleado(datosEmpleadoCptoDTO);
        } 
        else{
            datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
            super.getService(ActualizacionNominaService.class).agregarConceptoEmpleadoPAX(datosEmpleadoCptoDTO);
        }
        /***********************************************************************************************/
        
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
    
        datosEmpleadoCptoDTO.setCpcSubTipo(origenMenu);
        datosEmpleadoCptoDTO.setCpcSubTipoDesc(origenMenuLabel);
    
        datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
        datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("conceptosEmpleado");
    }
    
    
    /**
     * Control de la vista modificar Conceptos.
     * @param model
     * @param conceptoYtipoConcepto
     * @param datosEmpleadoCptoDTO
     * @return view
     **/
    @RequestMapping
    public String modificaConceptoDelEmpleado(Model model, @RequestParam("conceptoYtipoConcepto") String conceptoYtipoConcepto, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO = new DatosConceptoEmpleadoDTO();
        DatosConceptoEmpleadoDTO aDatosConceptoEmpleadoDTO = new DatosConceptoEmpleadoDTO();
        String idTipoConcepto= conceptoYtipoConcepto.substring(0,1);
        String idConcepto=conceptoYtipoConcepto.substring(1,3);
        datosEmpleadoCptoDTO.setIdTipoCpto(idTipoConcepto);
        datosEmpleadoCptoDTO.setIdConcepto(idConcepto);
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        Map<String, Object> quincenas       = new HashMap<String, Object>();
        Map<String, Object> opcRdButtons    = null;
        String retorno      = null;
        String tipoConcepto = null;
        String concepto     = null;
        
        datosConceptoEmpleadoDTO.setIdConcepto(datosEmpleadoCptoDTO.getIdConcepto());
        datosConceptoEmpleadoDTO.setIdTipoCpto(datosEmpleadoCptoDTO.getIdTipoCpto().trim());
        datosConceptoEmpleadoDTO.setRfcEmpleado(datosEmpleadoCptoDTO.getRfcEmpleado());
        datosConceptoEmpleadoDTO.setUsuario(datosEmpleadoCptoDTO.getUsuario());
        
        if((datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A1")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A2")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A3")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A4")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A5")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A6")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A7")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A8")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A9")) ||
           (datosConceptoEmpleadoDTO.getIdTipoCpto().equals("P") && datosConceptoEmpleadoDTO.getIdConcepto().equals("A0"))  ){
            tipoConcepto    = datosEmpleadoCptoDTO.getIdTipoCpto();
            concepto        = datosEmpleadoCptoDTO.getIdConcepto();
           datosConceptoEmpleadoDTO.setIdTipoCpto("P");  
           datosConceptoEmpleadoDTO.setIdConcepto("AX");
        }
        
        aDatosConceptoEmpleadoDTO = datosConceptoEmpleadoDTO;
        
        datosConceptoEmpleadoDTO =  super.getService(ActualizacionNominaService.class).detalleConceptoEmpleadoActualizacion(datosConceptoEmpleadoDTO);
        
        if(datosConceptoEmpleadoDTO == null){
            String dscSubTIpo = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
            String subtipoCpto = datosEmpleadoCptoDTO.getCpcSubTipo();
            super.saveError(model, "El concepto no puede ser editado, porque fue asignado mediante carga masiva; Configure los parametros del concepto y vuelva a intentarlo.");
            datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(dscSubTIpo);
            datosEmpleadoCptoDTO.setCpcSubTipo(subtipoCpto);
            model.addAttribute(datosEmpleadoCptoDTO);
            return super.getViewName("conceptosEmpleado");
        }
       
        datosEmpleadoCptoDTO.setIdTipoCpto(idTipoConcepto);
        datosEmpleadoCptoDTO.setIdConcepto(idConcepto);
        
        datosEmpleadoCptoDTO.setCpcTipoCaptura(datosConceptoEmpleadoDTO.getCpcTipoCaptura());
        datosEmpleadoCptoDTO.setCpcTipoCalculo(datosConceptoEmpleadoDTO.getCpcTipoCalculo());
        datosEmpleadoCptoDTO.setCpcPermanente(datosConceptoEmpleadoDTO.getCpcPermanente());
        datosEmpleadoCptoDTO.setCpcMensaje(datosConceptoEmpleadoDTO.getCpcMensaje());
        datosEmpleadoCptoDTO.setDescConPag(datosConceptoEmpleadoDTO.getDescConPag());
        
        List<Integer> qnaInicial = super.getService(ActualizacionNominaService.class).getQnaInicial();
        Iterator itr = qnaInicial.iterator();
        Integer qna = (Integer) itr.next();
        Integer anio = (Integer) itr.next();
                
        datosEmpleadoCptoDTO.setAnioQnaInicial(anio);
        datosEmpleadoCptoDTO.setQnaQnaInicial(qna);
        
        datosEmpleadoCptoDTO.setMcpQnaIni(Integer.parseInt(anio+""+qna));
        datosEmpleadoCptoDTO.setQnaIniLabel(anio+""+qna);
        
        if(datosEmpleadoCptoDTO.getCpcPermanente().equals("P") || datosEmpleadoCptoDTO.getCpcPermanente().equals("P")){
            datosEmpleadoCptoDTO.setMcpQnaFinLabel("HASTA QUE SE DE DE BAJA EL CONCEPTO");
            datosEmpleadoCptoDTO.setMcpQnaFin(209901);
        }
        
        if(datosEmpleadoCptoDTO.getCpcPermanente().equals("N1")){
            datosEmpleadoCptoDTO.setMcpQnaFin(datosEmpleadoCptoDTO.getMcpQnaIni());
            datosEmpleadoCptoDTO.setMcpQnaFinLabel("SOLO POR ESTA QUINCENA");
            //int N1Quincenas = (datosEmpleadoCptoDTO.getMcpQnaFin() - datosEmpleadoCptoDTO.getMcpQnaIni()) + 1; 
            datosEmpleadoCptoDTO.setMcpQnaADescontar(1);
        }
        
        if(datosEmpleadoCptoDTO.getCpcTipoCalculo().equals("P")){
            opcRdButtons = super.getService(ActualizacionNominaService.class).colsultaTcCptsPagoCaptOpcRdbuttons(datosEmpleadoCptoDTO.getIdTipoCpto().trim(), datosEmpleadoCptoDTO.getIdConcepto());
            datosEmpleadoCptoDTO.setMapaOpcionesRdButtons(opcRdButtons);
        }
        
        if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("O")){
            datosConceptoEmpleadoDTO = super.getService(ActualizacionNominaService.class).detalleConceptosTipoO(datosEmpleadoCptoDTO.getIdTipoCpto(), datosEmpleadoCptoDTO.getIdConcepto(), datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setMcpMonto(datosConceptoEmpleadoDTO.getMcpMonto());
            datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(datosConceptoEmpleadoDTO.getMcpMonto()));
            datosEmpleadoCptoDTO.setMcpRefCaptura(datosConceptoEmpleadoDTO.getMcpRefCaptura());
            datosEmpleadoCptoDTO.setMcpPorcentaje(datosConceptoEmpleadoDTO.getMcpPorcentaje());
            datosEmpleadoCptoDTO.setOpcionRdButton(datosConceptoEmpleadoDTO.getMcpPorcentaje().toString());
            datosEmpleadoCptoDTO.setMcpQnaIni(datosConceptoEmpleadoDTO.getMcpQnaIni());
            datosEmpleadoCptoDTO.setMcpQnaFin(datosConceptoEmpleadoDTO.getMcpQnaFin());
            datosEmpleadoCptoDTO.setMcpQnaADescontar(datosConceptoEmpleadoDTO.getMcpQnaADescontar());
            retorno = super.getViewName("editaConceptoTipoO"); 
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("S")){
            datosConceptoEmpleadoDTO = super.getService(ActualizacionNominaService.class).detalleConceptosTipoO(datosEmpleadoCptoDTO.getIdTipoCpto(), datosEmpleadoCptoDTO.getIdConcepto(), datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setMcpMonto(datosConceptoEmpleadoDTO.getMcpMonto());
            datosEmpleadoCptoDTO.setMcpMontoLabel(String.valueOf(datosConceptoEmpleadoDTO.getMcpMonto()));
            datosEmpleadoCptoDTO.setMcpRefCaptura(datosConceptoEmpleadoDTO.getMcpRefCaptura());
            datosEmpleadoCptoDTO.setMcpPorcentaje(datosConceptoEmpleadoDTO.getMcpPorcentaje());
            datosEmpleadoCptoDTO.setMcpQnaIni(datosConceptoEmpleadoDTO.getMcpQnaIni());
            datosEmpleadoCptoDTO.setMcpQnaFin(datosConceptoEmpleadoDTO.getMcpQnaFin());
            datosEmpleadoCptoDTO.setMcpQnaADescontar(datosConceptoEmpleadoDTO.getMcpQnaADescontar());
            retorno = super.getViewName("editaConceptoTipoS");
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("C")){
            datosConceptoEmpleadoDTO = super.getService(ActualizacionNominaService.class).detalleConceptosTipoO(datosEmpleadoCptoDTO.getIdTipoCpto(), datosEmpleadoCptoDTO.getIdConcepto(), datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setMcpMonto(datosEmpleadoCptoDTO.getTabSueldo());
            datosEmpleadoCptoDTO.setMcpMontoLabel("");
            datosEmpleadoCptoDTO.setMcpRefCaptura(datosConceptoEmpleadoDTO.getMcpRefCaptura());
            datosEmpleadoCptoDTO.setMcpQnaFin(datosConceptoEmpleadoDTO.getMcpQnaFin());
            datosEmpleadoCptoDTO.setMcpQnaADescontar(datosConceptoEmpleadoDTO.getMcpQnaADescontar());
            datosEmpleadoCptoDTO.setMcpHorasDias(datosConceptoEmpleadoDTO.getMcpHorasDias());
            retorno = super.getViewName("editaConceptoTipoC");
        }
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return retorno;
    }
    /**
     * Metodo para modificar Concepto.
     * @param model
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String modificarConceptoDelEmpleado(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        String origenMenu = datosEmpleadoCptoDTO.getCpcSubTipo();
        String origenMenuLabel = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
        
        if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("S") && datosEmpleadoCptoDTO.getCpcTipoCalculo().equals("M")){
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("68")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            
            if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("P0")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PA")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PB")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("O") && datosEmpleadoCptoDTO.getCpcTipoCalculo().equals("M")){
            if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A1")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A2")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A3")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A4")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A5")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A6")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A6")) ||
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("A8"))){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("O") && datosEmpleadoCptoDTO.getCpcTipoCalculo().equals("P")){
            datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton())); 
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("98")){
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("AS")){
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("50")){
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
                //datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpPorcentajeLabel()) );
            }
            else {  datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getOpcionRdButton()));
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(0));
            }      
        }
        
        else if(datosEmpleadoCptoDTO.getCpcTipoCaptura().equals("C")){
            if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("83")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()) );
                datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getMcpPorcentajeLabel()) );
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("03")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()) );
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("08")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()) );
            }
            
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("29")) || 
               (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("LP")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                //datosEmpleadoCptoDTO.setMcpPorcentaje(new BigDecimal(datosEmpleadoCptoDTO.getDiasD29Label()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("38")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("44")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("46")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if((datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A1"))  || 
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A2")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A3")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A4")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("A5")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("51")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("54")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("56")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("57")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("72")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("79")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("AR")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("75")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0A")) || 
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0B")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0C")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0D")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("0E")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("84")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("27")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("34")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("H4")) ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if( (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T0")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T1")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T2")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T3")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T4")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T5")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T6")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T7")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T8")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("T9")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TA")) ||
                (datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("TD")) ){
                    datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
                    datosEmpleadoCptoDTO.setMcpHorasDias(new BigDecimal(datosEmpleadoCptoDTO.getMcpHorasDiasLabel()));
                }
            
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PD")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("D") && datosEmpleadoCptoDTO.getIdConcepto().equals("95")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("AU")){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("NM") ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            else if(datosEmpleadoCptoDTO.getIdTipoCpto().equals("P") && datosEmpleadoCptoDTO.getIdConcepto().equals("PC") ){
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
            
            else {
                datosEmpleadoCptoDTO.setMcpMonto(new BigDecimal(datosEmpleadoCptoDTO.getMcpMontoLabel()));
            }
        }
        
        super.getService(ActualizacionNominaService.class).actualizarConceptoEmpleado(datosEmpleadoCptoDTO);
        
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
        datosEmpleadoCptoDTO.setCpcSubTipo(origenMenu);
        datosEmpleadoCptoDTO.setCpcSubTipoDesc(origenMenuLabel);
        datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
        datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("conceptosEmpleado");
    }
     /**
     * Control de la vista adeudo del Concepto
     * @param model
     * @param conceptoYtipoConcepto
     * @param datosEmpleadoCptoDTO
     * @return
     */
     @RequestMapping
      public String adeudoConceptoDelEmpleado(Model model, @RequestParam("conceptoYtipoConcepto") String conceptoYtipoConcepto, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO = new DatosConceptoEmpleadoDTO();
        datosEmpleadoCptoDTO.setIdTipoCpto(conceptoYtipoConcepto.substring(0,1));
        datosEmpleadoCptoDTO.setIdConcepto(conceptoYtipoConcepto.substring(1,3));
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        Map<String, Object> quincenas       = new HashMap<String, Object>();
        
        datosConceptoEmpleadoDTO.setIdConcepto(datosEmpleadoCptoDTO.getIdConcepto());
        datosConceptoEmpleadoDTO.setIdTipoCpto(datosEmpleadoCptoDTO.getIdTipoCpto());
        datosConceptoEmpleadoDTO.setRfcEmpleado(datosEmpleadoCptoDTO.getRfcEmpleado());
        datosConceptoEmpleadoDTO.setUsuario(datosEmpleadoCptoDTO.getUsuario());
        
        datosConceptoEmpleadoDTO =  super.getService(ActualizacionNominaService.class).buscarDetalleConceptoEmpleado(datosConceptoEmpleadoDTO);
        
        datosEmpleadoCptoDTO.setDescConPag(datosConceptoEmpleadoDTO.getDescConPag());
        
        List<Integer> qnaInicial = super.getService(ActualizacionNominaService.class).getQnaInicial();
       
        Iterator itr = qnaInicial.iterator();
        Integer qna = (Integer) itr.next();
        Integer anio = (Integer) itr.next();
                         
        datosEmpleadoCptoDTO.setAnioQnaInicial(anio);
        datosEmpleadoCptoDTO.setQnaQnaInicial(qna);
         
        int numQna=qna;
        for(int anioQna=anio; anioQna<=anio+3; anioQna++){
            while(numQna<=24){
                if(numQna<10){
                    quincenas.put(anioQna+"0"+numQna, new Integer(anioQna+"0"+numQna) );
                    numQna++;
                }
                if(numQna>=10){
                    quincenas.put(anioQna+""+numQna, new Integer(anioQna+""+numQna));
                    numQna++;
                } 
            }
            numQna = 1;
        }
        Map<String, Object> sortedQuincenas = new TreeMap<String, Object>(quincenas);
        datosEmpleadoCptoDTO.setListaOrdenadaQuincenas(sortedQuincenas);
                 
        datosEmpleadoCptoDTO.setMcpQnaIni(Integer.parseInt(anio+""+qna));
         if(qna<10){  datosEmpleadoCptoDTO.setQnaIniLabel(anio+"0"+qna);  }
         else {  datosEmpleadoCptoDTO.setQnaIniLabel(anio+""+qna);}
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("adeudoConceptoEmpleado");
     }
     
     /**
     * Metodo para agregar adeudo al concepto
     * @param model
     * @param datosEmpleadoCptoDTO
     * @return
     */
     @RequestMapping
     public String adeudoSaveConceptoEmpleado(Model model, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        String retorno  = null;
         
        if(datosEmpleadoCptoDTO.getMcpFecIniAdeudo() == null){
            super.saveError(model, "error.actualizacionNomina.adeudo.save.fi", datosEmpleadoCptoDTO);
            retorno = "adeudoConceptoEmpleado";
        }
        if(datosEmpleadoCptoDTO.getMcpFecFinAdeudo() == null){   
            super.saveError(model, "error.actualizacionNomina.adeudo.save.ff", datosEmpleadoCptoDTO);
            retorno = "adeudoConceptoEmpleado";
        }
        if(datosEmpleadoCptoDTO.getMcpFecFinAdeudo() != null && datosEmpleadoCptoDTO.getMcpFecFinAdeudo() != null){
            if(fVsHoy(datosEmpleadoCptoDTO.getMcpFecIniAdeudo()).equals("menor")){
                super.saveError(model, "error.actualizacionNomina.adeudo.save.fi.hoy", datosEmpleadoCptoDTO);
                retorno = "adeudoConceptoEmpleado";
            }
            if(fVsHoy(datosEmpleadoCptoDTO.getMcpFecFinAdeudo()).equals("menor")){
                super.saveError(model, "error.actualizacionNomina.adeudo.save.ff.hoy", datosEmpleadoCptoDTO);
                retorno = "adeudoConceptoEmpleado";
            }
            if(fVsHoy(datosEmpleadoCptoDTO.getMcpFecIniAdeudo(), datosEmpleadoCptoDTO.getMcpFecFinAdeudo()).equals("menor")){
                super.saveError(model, "error.actualizacionNomina.adeudo.save.fiff", datosEmpleadoCptoDTO);
                retorno = "adeudoConceptoEmpleado";
            }
        }
        if((datosEmpleadoCptoDTO.getMcpFecIniAdeudo() != null) && (datosEmpleadoCptoDTO.getMcpFecFinAdeudo() != null) &&
           (fVsHoy(datosEmpleadoCptoDTO.getMcpFecIniAdeudo()) != "menor") && (fVsHoy(datosEmpleadoCptoDTO.getMcpFecFinAdeudo()) != "menor") &&
           (fVsHoy(datosEmpleadoCptoDTO.getMcpFecIniAdeudo(), datosEmpleadoCptoDTO.getMcpFecFinAdeudo()) != "menor")){
            
            datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
            super.getService(ActualizacionNominaService.class).adeudoSaveConceptoEmpleado(datosEmpleadoCptoDTO);
            retorno = "conceptosEmpleado";
        }
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName(retorno);
     }
     
    
    /**
     * Control de la vista detalle del concepto.
     * @param model
     * @param conceptoYtipoConcepto
     * @param datosEmpleadoCptoDTO
     * @return
     */
    @RequestMapping
    public String detalleConceptoDelEmpleado(Model model, @RequestParam("conceptoYtipoConcepto") String conceptoYtipoConcepto, DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        MovtoConceptoPagoDTO movtoConceptoPagoDTO = new MovtoConceptoPagoDTO();
        datosEmpleadoCptoDTO.setIdTipoCpto(conceptoYtipoConcepto.substring(0,1));
        datosEmpleadoCptoDTO.setIdConcepto(conceptoYtipoConcepto.substring(1,3));
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        
        movtoConceptoPagoDTO =  super.getService(ActualizacionNominaService.class).detalleConceptoDelEmpleado(datosEmpleadoCptoDTO);
        
        if(movtoConceptoPagoDTO == null){
            String dscSubTIpo = datosEmpleadoCptoDTO.getCpcSubTipoDesc();
            String subtipoCpto = datosEmpleadoCptoDTO.getCpcSubTipo();
            super.saveError(model, "No es posible ver el detalle del concepto, porque fue asignado mediante carga masiva; Configure los parametros del concepto y vuelva a intentarlo.");
            datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(datosEmpleadoCptoDTO.getRfcEmpleado());
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(dscSubTIpo);
            datosEmpleadoCptoDTO.setCpcSubTipo(subtipoCpto);
            model.addAttribute(datosEmpleadoCptoDTO);
            return super.getViewName("conceptosEmpleado");
        }
        
        datosEmpleadoCptoDTO.setFecModificoLabel(sdf.format(movtoConceptoPagoDTO.getFecModifico()));
        datosEmpleadoCptoDTO.setMcpFecIncidenciaLabel(sdf.format(movtoConceptoPagoDTO.getFecIncidencia()));
        
        
        datosEmpleadoCptoDTO.setMcpFecFinAdeudo (movtoConceptoPagoDTO.getFecFinAdeudo() == null ? new Date() : movtoConceptoPagoDTO.getFecFinAdeudo());
        datosEmpleadoCptoDTO.setMcpFecIncidencia(movtoConceptoPagoDTO.getFecIncidencia() == null ? new Date() : movtoConceptoPagoDTO.getFecIncidencia());
        datosEmpleadoCptoDTO.setMcpFecIniAdeudo(movtoConceptoPagoDTO.getFecIniAdeudo() == null ? new Date() : movtoConceptoPagoDTO.getFecIniAdeudo());
        datosEmpleadoCptoDTO.setFecModifico(movtoConceptoPagoDTO.getFecModifico() == null ? new Date() : movtoConceptoPagoDTO.getFecModifico());
        datosEmpleadoCptoDTO.setMcpHorasDias(movtoConceptoPagoDTO.getHorasDias() == null ? new BigDecimal(0) : movtoConceptoPagoDTO.getHorasDias());
        datosEmpleadoCptoDTO.setIdSitCaptura(movtoConceptoPagoDTO.getIdSitCaptura() == null ? "" : movtoConceptoPagoDTO.getIdSitCaptura());
        datosEmpleadoCptoDTO.setIdTercero(movtoConceptoPagoDTO.getIdTercero() == null ? "" : movtoConceptoPagoDTO.getIdTercero());
        datosEmpleadoCptoDTO.setMcpQnaCaptura(movtoConceptoPagoDTO.getMcpQnaCaptura() == null ? new BigDecimal(0) : movtoConceptoPagoDTO.getMcpQnaCaptura());
        datosEmpleadoCptoDTO.setMcpRefCancela(movtoConceptoPagoDTO.getMcpRefCancela() == null ? "" : movtoConceptoPagoDTO.getMcpRefCancela());
        datosEmpleadoCptoDTO.setMcpRefCaptura(movtoConceptoPagoDTO.getMcpRefCaptura() == null ? "" : movtoConceptoPagoDTO.getMcpRefCaptura());
        datosEmpleadoCptoDTO.setRfcEmpleado(movtoConceptoPagoDTO.getMcpRfc() == null ? "" : movtoConceptoPagoDTO.getMcpRfc());
        datosEmpleadoCptoDTO.setMcpMonto(movtoConceptoPagoDTO.getMonto() == null ? new BigDecimal(0) : new BigDecimal(movtoConceptoPagoDTO.getMonto()));
        datosEmpleadoCptoDTO.setMcpMontoAdeudo(movtoConceptoPagoDTO.getMontoAdeudo() == null ? new BigDecimal(0) : new BigDecimal(movtoConceptoPagoDTO.getMontoAdeudo()));
        datosEmpleadoCptoDTO.setMcpPorcentaje(movtoConceptoPagoDTO.getPorcentaje() == null ? new BigDecimal(0) : new BigDecimal(movtoConceptoPagoDTO.getPorcentaje()).setScale(2, BigDecimal.ROUND_DOWN));
        datosEmpleadoCptoDTO.setMcpQnasAdeudo(movtoConceptoPagoDTO.getQnasAdeudo() == null ? 0 : movtoConceptoPagoDTO.getQnasAdeudo().intValue());
        datosEmpleadoCptoDTO.setQnaAplicadas(movtoConceptoPagoDTO.getQnaAplicadas() == null ? new BigDecimal(0) : movtoConceptoPagoDTO.getQnaAplicadas());
        datosEmpleadoCptoDTO.setMcpQnaADescontar(movtoConceptoPagoDTO.getQnaADescontar() == null ? 0  : movtoConceptoPagoDTO.getQnaADescontar().intValue() );
        datosEmpleadoCptoDTO.setMcpQnaCancelo(movtoConceptoPagoDTO.getQnaCancelo() == null ? 0 : movtoConceptoPagoDTO.getQnaCancelo().intValue());
        datosEmpleadoCptoDTO.setMcpQnaFin(movtoConceptoPagoDTO.getQnaFin() == null ? 0 : movtoConceptoPagoDTO.getQnaFin().intValue());
        datosEmpleadoCptoDTO.setMcpQnaIni(movtoConceptoPagoDTO.getQnaIni() == null ? 0 : movtoConceptoPagoDTO.getQnaIni().intValue());
        datosEmpleadoCptoDTO.setUltimaQnaProcesa(movtoConceptoPagoDTO.getUltimaQnaProcesa() == null ? new BigDecimal(0) : movtoConceptoPagoDTO.getUltimaQnaProcesa());
        datosEmpleadoCptoDTO.setUsuario(movtoConceptoPagoDTO.getUsuario() == null ? "" : movtoConceptoPagoDTO.getUsuario());
        datosEmpleadoCptoDTO.setDescSitCaptura(movtoConceptoPagoDTO.getDescSitCaptura() == null ? "" : movtoConceptoPagoDTO.getDescSitCaptura());
        datosEmpleadoCptoDTO.setDescConPag(movtoConceptoPagoDTO.getDescConPag() == null ? "" : movtoConceptoPagoDTO.getDescConPag());
        datosEmpleadoCptoDTO.setCpcTipoCaptura(movtoConceptoPagoDTO.getTipoCaptura() == null ? "" : movtoConceptoPagoDTO.getTipoCaptura());
        datosEmpleadoCptoDTO.setCpcTipoCalculo(movtoConceptoPagoDTO.getTipoCalculo() == null ? "" : movtoConceptoPagoDTO.getTipoCalculo());
        datosEmpleadoCptoDTO.setCpcPermanente(movtoConceptoPagoDTO.getPermanente() == null ? "" : movtoConceptoPagoDTO.getPermanente());
        datosEmpleadoCptoDTO.setCpcSubTipo(movtoConceptoPagoDTO.getSubtipo() == null ? "" : movtoConceptoPagoDTO.getSubtipo());
        
        model.addAttribute(datosEmpleadoCptoDTO);
        return super.getViewName("detalleConceptoEmpleado");
    }
    
    /***************************************************************** TERCEROS ***************************************************************************************/
    
    /**
     * Control de la vista de rfc de empleados
     * @param model
     * @param consultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String listarEmpleadosConConTercer(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()){
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();   
        }
        consultaEmpleadoDTO.setUrlOrigen("listarEmpleadosConConTercer");
        consultaEmpleadoDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoDTO.setUrlDestino("datosEmpleadoCptoT");
        consultaEmpleadoDTO.setMenuTitle( "De terceros institucionales" );
        consultaEmpleadoDTO.setNombrePantalla( "actualizacionNomina" );
        
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }

    /**
     * Control de la vista de conceptos con subtipo terceros.
     * @param model
     * @param rfcEmpleado
     * @return
     */
    @RequestMapping
    public String datosEmpleadoCptoT(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        String retorno = null;
        DatosEmpleadoCptoDTO datosEmpleadoCptoDTO = new DatosEmpleadoCptoDTO();
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
        if(datosEmpleadoCptoDTO == null){
            super.saveError(model, "error.actualizacionNomina.datosEmpleadoCptoG");
            model.addAttribute(new DatosEmpleadoCptoDTO());
            retorno = super.getViewName("consultaEmpleados");
        }
        else {
            datosEmpleadoCptoDTO.setCpcSubTipo("T");
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(" De terceros Institucionales ");
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosEmpleado");
        }
        return retorno;
    }

    /***************************************************************** DEVOLUCIONES ***************************************************************************************/
    /**
     * Suntipo de concepto Devoluciones
     * @param model
     * @param consultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String listarEmpleadosConConDeDevo(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()){     
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();    
        }
        consultaEmpleadoDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoDTO.setUrlOrigen("listarEmpleadosConConDeDevo");
        consultaEmpleadoDTO.setUrlDestino("datosEmpleadoCptoD");
        consultaEmpleadoDTO.setMenuTitle( "De devoluciones" );
        consultaEmpleadoDTO.setNombrePantalla( "actualizacionNomina" );
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
             
    @RequestMapping//datosEmpleadoCpto
    public String datosEmpleadoCptoD(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        String retorno = null;
        DatosEmpleadoCptoDTO datosEmpleadoCptoDTO = new DatosEmpleadoCptoDTO();
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
        if(datosEmpleadoCptoDTO == null){
            super.saveError(model, "error.actualizacionNomina.datosEmpleadoCptoG");
            model.addAttribute(new DatosEmpleadoCptoDTO());
            retorno = super.getViewName("consultaEmpleados");
        }
        else {
            datosEmpleadoCptoDTO.setCpcSubTipo("D");
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(" De devoluciones ");
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            model.addAttribute(datosEmpleadoCptoDTO);
            retorno = super.getViewName("conceptosEmpleado");
        }
        return retorno;
    }
         
    /***************************************************************** REINTEGROS ***************************************************************************************/
    @RequestMapping
    public String listarEmpleadosConConDeRein(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()){     
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();    
        }
        consultaEmpleadoDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoDTO.setUrlOrigen("listarEmpleadosConConDeRein");
        consultaEmpleadoDTO.setUrlDestino("datosEmpleadoCptoR");
        consultaEmpleadoDTO.setMenuTitle( "De reintegros" );
        consultaEmpleadoDTO.setNombrePantalla( "actualizacionNomina" );
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
         
    @RequestMapping
    public String datosEmpleadoCptoR(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado) {
        String retorno = null;
        DatosEmpleadoCptoDTO datosEmpleadoCptoDTO = new DatosEmpleadoCptoDTO();
        datosEmpleadoCptoDTO = super.getService(ActualizacionNominaService.class).buscarDatosEmpleadoCpto(rfcEmpleado);
        if(datosEmpleadoCptoDTO == null){
            super.saveError(model, "error.actualizacionNomina.datosEmpleadoCptoG");
            model.addAttribute(new DatosEmpleadoCptoDTO());
            retorno = super.getViewName("consultaEmpleados");
        }
        else {
            datosEmpleadoCptoDTO.setCpcSubTipo("R");
            datosEmpleadoCptoDTO.setCpcSubTipoDesc(" De reintegros ");
            datosEmpleadoCptoDTO.setFistCharOnIdNivelPto(datosEmpleadoCptoDTO.getIdNivelPto().substring(0,1));
            datosEmpleadoCptoDTO.setFistCharOnIdNombramiento(datosEmpleadoCptoDTO.getIdNombramiento().substring(0,1));
            retorno = super.getViewName("conceptosEmpleado");
            model.addAttribute(datosEmpleadoCptoDTO);
        }
        return retorno;
    }
    
    @RequestMapping
    public String gestionFonac(Model model, ConsultaEmpleadoFonacDTO consultaEmpleadoFonacDTO){
        if(consultaEmpleadoFonacDTO.isCancel()){
            consultaEmpleadoFonacDTO = new ConsultaEmpleadoFonacDTO();
        }

        consultaEmpleadoFonacDTO.setIdSitPlazaFilter("O%");
        List listaIdJerarquias = new ArrayList<String>();
        listaIdJerarquias.add("5");
        listaIdJerarquias.add("7");
        consultaEmpleadoFonacDTO.setListaIdJerarquiasFilter(listaIdJerarquias);
        consultaEmpleadoFonacDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoFonacDTO.setUrlOrigen("gestionFonac");
        consultaEmpleadoFonacDTO.setUrlDestino("getFonac");
        model.addAttribute(consultaEmpleadoFonacDTO);
        return super.getViewName("consultaEmpleadosFonac");
    }
    
    @RequestMapping
    public String getFonac(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado){
        
        GestionFonacDTO gestionFonacDTO = super.getService(ActualizacionNominaService.class).getFonac(rfcEmpleado);
        if(gestionFonacDTO != null && gestionFonacDTO.getMensaje() != null && gestionFonacDTO.getMensaje().length() > 0 ){
            super.saveMessage(model, gestionFonacDTO.getMensaje());   
        }
        model.addAttribute(gestionFonacDTO);
        return super.getViewName("cambioFonac");
    }
    
    @RequestMapping
    public String updateFonac(Model model, GestionFonacDTO gestionFonacDTO){
        TnMovtoConceptoPagoDTO movtoConceptoPagoDTO = gestionFonacDTO.getMovtoConceptoPagoDTO();
        movtoConceptoPagoDTO.setMcpRfc(gestionFonacDTO.getRfcEmpleado());
        movtoConceptoPagoDTO.setMcpFecIniAdeudo(gestionFonacDTO.getFecIniAdeudo());
        movtoConceptoPagoDTO.setMcpFecFinAdeudo(gestionFonacDTO.getFecFinAdeudo());
        super.saveMessage(model, "nomina.updateFonac.ok");   
        super.getService(ActualizacionNominaService.class).updateFonac(movtoConceptoPagoDTO, gestionFonacDTO.getHasFonac());
    
        return gestionFonac(model, new ConsultaEmpleadoFonacDTO());
    }
        
    @RequestMapping
    public String gestionErarioFed(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO){
        if(consultaEmpleadoDTO.isCancel()){
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }

        consultaEmpleadoDTO.setUrlController("actualizacionNomina");
        consultaEmpleadoDTO.setUrlOrigen("gestionErarioFed");
        consultaEmpleadoDTO.setUrlDestino("getErarioFed");
        consultaEmpleadoDTO.setMenuTitle( "Erario Federal" );
        consultaEmpleadoDTO.setNombrePantalla( "actualizacionNomina" );
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultaEmpleados");
    }
    
    @RequestMapping
    public String getErarioFed(Model model, @RequestParam("rfcEmpleado") String rfcEmpleado){
        
        ActualizaErarioFedDTO actualizaErarioFedDTO = super.getService(ActualizacionNominaService.class).getErarioFed(rfcEmpleado);
        model.addAttribute(actualizaErarioFedDTO);
        return super.getViewName("actualizaErarioFed");
    }
    
    @RequestMapping
    public String updateErarioFed(Model model, ActualizaErarioFedDTO actualizaErarioFedDTO){
        TnMovtoConceptoPagoDTO movtoConceptoPagoDTO = actualizaErarioFedDTO.getMovtoConceptoPagoDTO();
        
        super.saveMessage(model, "nomina.updateErarioFed.ok");   
        super.getService(ActualizacionNominaService.class).updateErarioFed(movtoConceptoPagoDTO, actualizaErarioFedDTO.getRfcEmpleado(), actualizaErarioFedDTO.getHasErario());
    
        return gestionErarioFed(model, new ConsultaEmpleadoDTO());
    }
    
    public String fVsHoy(Date fecha1, Date fecha2){
        Calendar ch = Calendar.getInstance();
        Calendar cf = Calendar.getInstance();
        String retorno = null;
        ch.setTime(fecha1);
        cf.setTime(fecha2);
        int dh = ch.get(Calendar.DATE); int mh = ch.get(Calendar.MONTH) + 1; int ah = ch.get(Calendar.YEAR);
        int df = cf.get(Calendar.DATE); int mf = cf.get(Calendar.MONTH) + 1; int af = cf.get(Calendar.YEAR);
        if(af>ah){      retorno = "mayor";  }
        if(af<ah){  retorno = "menor";  }
        if(af==ah){
            if(mf>mh){  retorno = "mayor";  }
            if(mf<mh){  retorno = "menor"; }
            if(mf==mh){  
                if(df>dh){  retorno = "mayor";   }
                if(df<dh){  retorno = "menor";   }
                if(df==dh){  retorno = "igual";   }
            }
        }
        return retorno;
    }
            
    public String fVsHoy(Date fecha){
        Calendar ch = Calendar.getInstance();
        Calendar cf = Calendar.getInstance();
        String retorno = null;
        ch.setTime(new Date());
        cf.setTime(fecha);
        int dh = ch.get(Calendar.DATE); int mh = ch.get(Calendar.MONTH) + 1; int ah = ch.get(Calendar.YEAR);
        int df = cf.get(Calendar.DATE); int mf = cf.get(Calendar.MONTH) + 1; int af = cf.get(Calendar.YEAR);
        if(af>ah){      retorno = "mayor";  }
        if(af<ah){  retorno = "menor";  }
        if(af==ah){
            if(mf>mh){  retorno = "mayor";  }
            if(mf<mh){  retorno = "menor"; }
            if(mf==mh){  
                if(df>dh){  retorno = "mayor";   }
                if(df<dh){  retorno = "menor";   }
                if(df==dh){  retorno = "igual";   }
            }
        }
        return retorno;
    }
    
}