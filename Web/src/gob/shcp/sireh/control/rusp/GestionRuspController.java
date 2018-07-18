package gob.shcp.sireh.control.rusp;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.rusp.DatosBasicos1DTO;
import gob.shcp.sireh.model.rusp.DatosBasicosDTO;
import gob.shcp.sireh.model.rusp.RuspBajaDTO;
import gob.shcp.sireh.service.rusp.RuspService;

import java.io.IOException;

import java.io.OutputStream;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import gob.shcp.sireh.model.rusp.RuspDTO;

import gob.shcp.sireh.model.rusp.TdRuspHijoDTO;
import gob.shcp.sireh.service.SirehUtils;

import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de atender solicitudes del modulo RUSP.
 */
@Controller
public class GestionRuspController extends AbstractController implements AnnotatedController {
   
    private static final String formtatoFecha = "dd/MM/yyyy";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);
    
    /**
     * Genera el archivo de RUSO en base a las nominas seleccionadas
     * @author  Martin C.
     * @param   model Model
     * @param   ruspDTO RuspDTO
     * @return  String
     */ 
    @RequestMapping
    public String pInformacionBasica(Model model, RuspDTO ruspDTO, HttpServletResponse response) throws IOException {
        if(ruspDTO.getCiclo() != null && ruspDTO.getQuincena() != null){
            if(ruspDTO.isLimpiar()){
                ruspDTO = new RuspDTO();
            }
            else{
                if(ruspDTO.getCiclo().equalsIgnoreCase("0")){
                    super.saveError(model, "Seleccione el Ciclo...");
                    ruspDTO.setMuestraNominas(false);
                }
                if(ruspDTO.getQuincena().equalsIgnoreCase("0")){
                    super.saveError(model, "Seleccione la quincena...");
                    ruspDTO.setMuestraNominas(false);
                }
                if(ruspDTO.getEmail().equalsIgnoreCase("")){
                    super.saveError(model, "Proporcione un email que sea valido...");
                    ruspDTO.setMuestraNominas(false);
                }
                if(ruspDTO.getEscenario().equalsIgnoreCase("")){
                    super.saveError(model, "Seleccione un escenario...");
                    ruspDTO.setMuestraNominas(false);
                }
                if(!ruspDTO.getQuincena().equalsIgnoreCase("0") && !ruspDTO.getCiclo().equalsIgnoreCase("0") && !ruspDTO.getEmail().equalsIgnoreCase("") && !ruspDTO.getEscenario().equalsIgnoreCase("0")){
                    //ruspDTO.setFecha(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(new Integer(ruspDTO.getCiclo() + ruspDTO.getQuincena()), 'I')));
                    ruspDTO.setCicloQna(ruspDTO.getCiclo() + ruspDTO.getQuincena());
                    ruspDTO.setBeanlista("ruspInformacionBasica-nominas");
                    
                    //ruspDTO.setMuestraNominas(true);
                    
                    ruspDTO.setIQuincena(new Integer(ruspDTO.getQuincena()));
                    
                    if((ruspDTO.getIQuincena()%2) == 0){
                        Integer iQna = ruspDTO.getIQuincena()-1;
                        ruspDTO.setQuincenaAnterior(iQna);  
                    }
                    else {
                        ruspDTO.setQuincenaAnterior(ruspDTO.getIQuincena());
                    }
                    
                    String nominas="";
                    String[] lista=ruspDTO.getSeleccionConsecNomina();
                    if(ruspDTO.isGeneraArchivo()){
                        if (lista != null) {
                            for(int i=0;i<lista.length;i++){
                                nominas = nominas + lista[i]+",";
                            }
                            ruspDTO.setListNominas(nominas.substring(0,nominas.length()-1));
                            super.getService(RuspService.class).procesarInformacionBasicaRusp(ruspDTO);                           

                            if(ruspDTO.isGeneraArchivo()!=false){
                               if (!ruspDTO.getCiclo().equalsIgnoreCase("0") && !ruspDTO.getQuincena().equalsIgnoreCase("0")){
                                   super.saveMessage(model, "El proceso se realizo con exito.");
                               }
                            }

                        }
                        else{
                            super.saveError(model,"Seleccione las nóminas a procesar.");
                        }
                    }
                }
            }
        }
        model.addAttribute(ruspDTO);
        return super.getViewName("pInformacionBasica");
    } 
    /**
     * Obtiene el numero de registros que seran afectados para el proceso Información Básica en el Rusp
     * @author  Cesar B.
     * @param   qna Integer
     */
     @RequestMapping
     public void geNumRegsInfoBasicCallback(@RequestParam("qna") Integer qna, HttpServletResponse response) throws IOException {
         String nr = super.getService(RuspService.class).getRegsRuspInfoBasica(qna).toString();
         logger.debug("............");
         response.setHeader("Cache-Control","no-cache"); 
         response.setDateHeader("Expires", 0);
         response.setHeader("Pragma","no-cache");
         response.setContentType("text/plain");
         PrintWriter out = response.getWriter();
         out.print(nr);
     }
    
    
    /**
     * Archivo de Bajas
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String interfazBajas(Model model, RuspBajaDTO ruspBajaDTO) {
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.isCancel()) {
            ruspBajaDTO = new RuspBajaDTO();
        }
            
        model.addAttribute(ruspBajaDTO);
        return super.getViewName("interfazBajas");
    }

    /**
     * Archivo de Bajas
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String generaBajas(Model model, RuspBajaDTO ruspBajaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        String nombre;
        fileName = null;
        nombre = null;
        String ciclo;
        String quincena = ruspBajaDTO.getRbQnaPago();
        StringBuilder strCsv = new StringBuilder();
        Integer contador = 0;

        if (ruspBajaDTO.getRbCiclo() != "0" && quincena.substring(1, 1) != "0") {
            // Aqui va el codigo de lo que hace el metodo....    :-)
           
            ciclo = ruspBajaDTO.getRbCiclo();

            do {
              if (contador == 0) {
                  nombre = "ArchivoBajasQna" + ruspBajaDTO.getRbQnaPago();

                  List<String> datos = super.getService(RuspService.class).getBajasRusp(quincena);

                  for (String renglon: datos) {
                       strCsv.append(renglon).append("\r\n");
                  }

                  byte[] bytes = strCsv.toString().getBytes();
                  response.setContentType("text/plain");
                  response.setContentLength(bytes.length);
                  response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".txt");
                  OutputStream out = response.getOutputStream();
                  out.write(bytes, 0, bytes.length);

              } 

              if (contador == 1) {
                  nombre = "ArchivoBajasNoQna" + ruspBajaDTO.getRbQnaPago();

                  List<String> datos = super.getService(RuspService.class).getBajasRuspNqna(quincena);

                  for (String renglon: datos) {
                       strCsv.append(renglon).append("\r\n");
                  }
                  
                  byte[] bytes = strCsv.toString().getBytes();
                  response.setContentType("text/plain");
                  response.setContentLength(bytes.length);
                  response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".txt");
                  OutputStream out = response.getOutputStream();
                  out.write(bytes, 0, bytes.length);

              }
              ruspBajaDTO.setValidacion(true);

              contador += 1;
            } while (contador < 2);
        }
        else {
            ciclo = ruspBajaDTO.getRbCiclo();
            ruspBajaDTO.setValidacion(true);
            super.saveError(model, "El ciclo es campo obligatorio, seleccione un ciclo de la lista");
        }
        
        return null;
    }

    /**
     * Archivo de Bajas 
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String generaBajasNoqna(Model model, RuspBajaDTO ruspBajaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        String nombre;
        fileName = null;
        nombre = null;
        String quincena = ruspBajaDTO.getRbQnaPago();
        String ciclo = ruspBajaDTO.getRbCiclo();
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.getRbCiclo() != "0") {
            if (ruspBajaDTO.getRbCiclo().equalsIgnoreCase("0")) {
                super.saveError(model, "El ciclo es campo obligatorio, seleccione un ciclo de la lista");
            }
            else if (ruspBajaDTO.getRbQnaPago().equalsIgnoreCase("0")) {
                super.saveError(model, "La quincena es campo obligatorio, seleccione una quincena de la lista");
            }
            // Aqui va el codigo de lo que hace el metodo....    :-)
           
            if (quincena.substring(1, 1) != "'") {
                nombre = "ArchivoBajasNoExistenQna" + ruspBajaDTO.getRbQnaPago();

                List<String> datos = super.getService(RuspService.class).getBajasRuspNqna(quincena);
                
                for (String renglon: datos) {
                     strCsv.append(renglon).append("\r\n");
                }
                      
            }

            byte[] bytes = strCsv.toString().getBytes();
            response.setContentType("text/plain");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".txt");
            OutputStream out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);

        }
        return null;
    }

    /**
     * Archivo de Bajas
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String generaBajasCiclo(Model model, RuspBajaDTO ruspBajaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        String nombre;
        fileName = null;
        nombre = null;
        String ciclo = ruspBajaDTO.getRbCiclo();
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.getRbCiclo() != "0") {
            // Aqui va el codigo de lo que hace el metodo....    :-)
                nombre = "ArchivoBajasCiclo" + ciclo;
                
                List<String> datos = super.getService(RuspService.class).getBajasCicloRusp(ciclo);

                for (String renglon: datos) {
                     strCsv.append(renglon).append("\r\n");
                }
                

            byte[] bytes = strCsv.toString().getBytes();
            response.setContentType("text/plain");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + ".txt");
            OutputStream out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);
        }
        else {
              super.saveError(model, "El ciclo es campo obligatorio, seleccione un ciclo de la lista");
        }
        ruspBajaDTO.setValidacion(true);
        return null;
    }

    /**
     * Archivo de datos personales
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String interfazDatosPersonales(Model model, RuspBajaDTO ruspBajaDTO) {
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.isCancel()) {
            ruspBajaDTO = new RuspBajaDTO();
        }
            
        model.addAttribute(ruspBajaDTO);
        return super.getViewName("interfazDatosPersonales");        
    }

    /**
     * Archivo de datos personales
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String generaDatosPersonales(Model model, RuspBajaDTO ruspBajaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        fileName = null;
        String quincena = ruspBajaDTO.getRbQnaPago();
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.getRbCiclo() != null) {
            if (ruspBajaDTO.getRbCiclo().equalsIgnoreCase("0")) {
                super.saveError(model, "El ciclo es campo obligatorio, seleccione un ciclo de la lista");
            }
            else if (ruspBajaDTO.getRbQnaPago().equalsIgnoreCase("0")) {
                super.saveError(model, "La quincena es campo obligatorio, seleccione una quincena de la lista");
            }
            if (!ruspBajaDTO.getRbQnaPago().equalsIgnoreCase("0") && !ruspBajaDTO.getRbCiclo().equalsIgnoreCase("0")) {
                ruspBajaDTO.setMuestraReporte(true);
            }
            // Aqui va el codigo de lo que hace el metodo....    :-)
            if (ruspBajaDTO.getRbQnaPago() != null) { 

                 List<String> datos = super.getService(RuspService.class).getDatosPersonalesRusp(quincena);

                  for (String renglon: datos) {
                      strCsv.append(renglon).append("\r\n");
                  }

            }       
            byte[] bytes = strCsv.toString().getBytes();
            response.setContentType("text/plain");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"" + "DatosPersonales" + quincena + ".txt");
            OutputStream out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);

        }
        return null;
    }

    /**
     * Archivo de información básica
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String interfazInfoBasica(Model model, RuspBajaDTO ruspBajaDTO) {
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.isCancel()) {
            ruspBajaDTO = new RuspBajaDTO();
        }
            
        model.addAttribute(ruspBajaDTO);
        return super.getViewName("interfazInfoBasica");        
    }

    /**
     * Archivo de información básica
     * @author Ricardo L.
     * @param model Model
     * @param ruspBajaDTO RuspBajaDTO
     * @return String
     */
    @RequestMapping
    public String generaInfoBasica(Model model, RuspBajaDTO ruspBajaDTO, HttpServletResponse response) throws IOException {
        String fileName;
        fileName = null;
        String quincena = ruspBajaDTO.getRbQnaPago();
        StringBuilder strCsv = new StringBuilder();

        if (ruspBajaDTO.getRbCiclo() != null) {
            if (ruspBajaDTO.getRbCiclo().equalsIgnoreCase("0")) {
                super.saveError(model, "El ciclo es campo obligatorio, seleccione un ciclo de la lista");
            }
            else if (ruspBajaDTO.getRbQnaPago().equalsIgnoreCase("0")) {
                super.saveError(model, "La quincena es campo obligatorio, seleccione una quincena de la lista");
            }
            if (!ruspBajaDTO.getRbQnaPago().equalsIgnoreCase("0") && !ruspBajaDTO.getRbCiclo().equalsIgnoreCase("0")) {
                ruspBajaDTO.setMuestraReporte(true);
            }
            // Aqui va el codigo de lo que hace el metodo....    :-)
            if (ruspBajaDTO.getRbQnaPago() != null) { 

                 List<String> datos = super.getService(RuspService.class).getInfoBasicaRusp(quincena);

                  for (String renglon: datos) {
                      strCsv.append(renglon).append("\r\n");
                  }

            }       
            byte[] bytes = strCsv.toString().getBytes();
            response.setContentType("text/plain");
            response.setContentLength(bytes.length);
            response.setHeader("Content-Disposition", "attachment; filename=\"" + "InformacionBasica" + quincena + ".txt");
            OutputStream out = response.getOutputStream();
            out.write(bytes, 0, bytes.length);

        }
        return null;
    }

    /**
     * Proceso Bajss: Actualiza los registros del rusp
     * @author  Martin C.
     * @param   model Model
     * @param   ruspDTO RuspDTO
     * @return  String
     */
    @RequestMapping
    public String pBajas(Model model, RuspDTO ruspDTO) {
        if(ruspDTO.getCiclo() != null && ruspDTO.getQuincena() != null){
            if(ruspDTO.isMuestraReporte()){
                if(ruspDTO.getCiclo().equalsIgnoreCase("0") || ruspDTO.getQuincena().equalsIgnoreCase("0")){
                    if(ruspDTO.getCiclo().equalsIgnoreCase("0")){
                        super.saveError(model, "* - El ciclo es un campo requerido, seleccione el ciclo.");
                    }
                    if(ruspDTO.getQuincena().equalsIgnoreCase("0")){
                        super.saveError(model, "* - La quincena es un campo requerido, seleccione la quincena.");
                    }
                }
                else {
                    if(ruspDTO.isProcesar() && ruspDTO.isMuestraReporte()){  
                        super.getService(RuspService.class).procesarBajasRusp(ruspDTO);
                 
                        if(ruspDTO.getCiclo()!= null && ruspDTO.getQuincena()!=null && ruspDTO.isMuestraReporte()!=false){
                           if (!ruspDTO.getCiclo().equalsIgnoreCase("0") && !ruspDTO.getQuincena().equalsIgnoreCase("0")){
                               super.saveMessage(model, "El proceso se realizo con exito.");
                           }
                        }                    
                    }
                }
            }
            else if(ruspDTO.isLimpiar()){
                ruspDTO = new RuspDTO();
            }
        }
        model.addAttribute(ruspDTO);
        return super.getViewName("pBajas");
    }
    
    
    /**
     * Obtiene el numero de registros que seran afectados para el proceso Bajas en el Rusp
     * @author  Martin C.
     * @param   qna Integer
     */
    @RequestMapping
    public void geNumRegsCallback(@RequestParam("qna") Integer qna, HttpServletResponse response) throws IOException {
        String nr = super.getService(RuspService.class).getNumReg_pBajas(qna).toString();
        logger.debug("............");
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(nr);
    }
    
    /**
     * 
     * @author  Cesar B.
     * @param   model Model
     * @param   ruspDTO RuspDTO
     * @return  String
     */ 
     @RequestMapping
     public String pDatosPersonales(Model model, RuspDTO ruspDTO) {
         if(ruspDTO.getCiclo() != null && ruspDTO.getQuincena() != null){
             if(ruspDTO.isMuestraReporte()){
                 if(ruspDTO.getCiclo().equalsIgnoreCase("0") || ruspDTO.getQuincena().equalsIgnoreCase("0")){
                     if(ruspDTO.getCiclo().equalsIgnoreCase("0")){
                         super.saveError(model, "* - El ciclo es un campo requerido, seleccione el ciclo.");
                     }
                     if(ruspDTO.getQuincena().equalsIgnoreCase("0")){
                         super.saveError(model, "* - La quincena es un campo requerido, seleccione la quincena.");
                     }
                 }
                 else {
                     if(ruspDTO.isProcesar() && ruspDTO.isMuestraReporte()){  
                         super.getService(RuspService.class).procesarDatosPersonalesRusp(ruspDTO);
                         
                         if(ruspDTO.getCiclo()!= null && ruspDTO.getQuincena()!=null && ruspDTO.isMuestraReporte()!=false){
                            if (!ruspDTO.getCiclo().equalsIgnoreCase("0") && !ruspDTO.getQuincena().equalsIgnoreCase("0")){
                                super.saveMessage(model, "El proceso se realizo con exito.");
                            }
                         }
                     }
                 }
             }
             else if(ruspDTO.isLimpiar()){
                 ruspDTO = new RuspDTO();
             }
         }
         model.addAttribute(ruspDTO);
         return super.getViewName("pDatosPersonales");
     } 
    /**
     * Obtiene el numero de registros que seran afectados para el proceso Datos Personales en el Rusp
     * @author  Cesar B.
     * @param   qna Integer
     */
    @RequestMapping
    public void geNumRegsDatosPerCallback(@RequestParam("qna") Integer qna, HttpServletResponse response) throws IOException {
        String nr = super.getService(RuspService.class).getNumReg_pDatosPer(qna).toString();
        logger.debug("............");
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(nr);
    }
     
    
    // ----------------------------------------------------------------------------------------------------------------------------------------------------------
    
     /**
      * 
      * @author  Martin C.
      * @param   model Model
      * @param   ruspDTO RuspDTO
      * @return  String
      */ 
     @RequestMapping
     public String iInformacionBasica(Model model, RuspDTO ruspDTO) {
         
         model.addAttribute(ruspDTO);
         return super.getViewName("iInformacionBasica");
     }
     
     /**
      * 
      * @author  Martin C.
      * @param   model Model
      * @param   ruspDTO RuspDTO
      * @return  String
      */
     @RequestMapping
     public String iBajas(Model model, RuspDTO ruspDTO) {
         model.addAttribute(ruspDTO);
         return super.getViewName("iBajas");
     }
     
     /**
      * 
      * @author  Martin C.
      * @param   model Model
      * @param   ruspDTO RuspDTO
      * @return  String
      */ 
     @RequestMapping
     public String iDatosPersonales(Model model, RuspDTO ruspDTO) {
         
         model.addAttribute(ruspDTO);
         return super.getViewName("iDatosPersonales");
     }    

    /**
     * Método que muestra la pantalla de empleados para modificar datos de CURP de hijos y lenguas 
     * * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return
     */
    @RequestMapping
    public String gestionDatos(Model model,ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if(consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("gestionDatos");
        consultaEmpleadoDTO.setUrlDestino("obtieneCurp");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleadosHis");
    }

    /**
     * Metodo que ejecuta la consulta de las CURPS de un trabajador por su rfc
     * @param model Model
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String obtieneCurp(Model model, @RequestParam("rfcEmpleado")
        String rfcEmpleado, DatosBasicosDTO datosBasicosDTO) {
        TdEmpleadoDTO empleadoDTO = super.getService(RuspService.class).getEmpleado(rfcEmpleado);
        super.transformation().map(empleadoDTO, datosBasicosDTO);
        model.addAttribute(datosBasicosDTO);
        return super.getViewName("cambioHijosCurp");
    }

    /**
     * Metodo encargado de agregar una CURP a un empleado por su rfc
     * @param model Model
     * @param rfcEmpleado String
     * @return
     */
    @RequestMapping
    public String addCurp(Model model, DatosBasicos1DTO datosBasicos1DTO, DatosBasicosDTO datosBasicosDTO) {
        datosBasicos1DTO = new DatosBasicos1DTO();
        datosBasicos1DTO.setRfcEmpleado(datosBasicosDTO.getRfcEmpleado());
        datosBasicos1DTO.setRfcUnico(datosBasicosDTO.getRfcUnico());
        model.addAttribute(datosBasicos1DTO);
        return super.getViewName("cambioCurpHijos");
    }

    /**
     * Metodo encargado de consultar los datos de la CURP de hijos por su idCurp y rfcEmpleado
     * @param model Model
     * @param idHijos String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String getCurpHijo(Model model, @RequestParam("curpHijo") String curpHijo,
        @RequestParam("rfcEmpleado") String rfcEmpleado) {
        DatosBasicos1DTO datosBasicos1DTO = super.getService(RuspService.class).getCurpHijos(curpHijo, rfcEmpleado);
        /*TdRuspHijoDTO tdRuspHijoDTO = super.getService(RuspService.class).getCurpHijos(curpHijo, rfcEmpleado);
        tdRuspHijoDTO.setTrhRfc(tdRuspHijoDTO.getTrhRfc());
        tdRuspHijoDTO.setTrhCurp(tdRuspHijoDTO.getTrhCurp());
        model.addAttribute(tdRuspHijoDTO); */
        return super.getViewName("cambioCurpHijos");
    }

    /**
     * Metodo encargado de actualizar CURP
     * @param model Model
     * @param TdRuspHijoDTO tdRuspHijoDTO
     * @return String
     */
    @RequestMapping
    public String updateCurpHijos(Model model, DatosBasicos1DTO datosBasicos1DTO, DatosBasicosDTO datosBasicosDTO) {

        if (datosBasicos1DTO.getNombreEmpleado() == null || datosBasicos1DTO.getNombreEmpleado().equals("")) {
            super.saveError(model, "El campo Nombre no puede ser vacio o nulo ");
            return super.getViewName("cambioCurpHijos");
         }
        if (datosBasicos1DTO.getPrimerApellido() == null || datosBasicos1DTO.getPrimerApellido().equals("")) {
            super.saveError(model, "El campo Nombre no puede ser vacio o nulo ");
            return super.getViewName("cambioCurpHijos");
         }
        if (datosBasicos1DTO.getCurpEmpleado() == null || datosBasicos1DTO.getCurpEmpleado().equals("")) {
            super.saveError(model, "El campo CURP no puede ser vacio o nulo ");
            return super.getViewName("cambioCurpHijos");
         }
         if (datosBasicos1DTO.getCurpEmpleado().length() != 18) {
             super.saveError(model, "El campo CURP debe de ser de 18 caracteres ");
             return super.getViewName("cambioCurpHijos");
         }
    
        super.getService(RuspService.class).saveCurpHijos(datosBasicos1DTO, super.security().getUserName());
        //datosBasicosDTO.setRfcEmpleado(datosBasicos1DTO.getRfcEmpleado());
        //model.addAttribute(datosBasicosDTO);
        return obtieneCurp(model, datosBasicosDTO.getRfcEmpleado(), datosBasicosDTO);
    //    return super.getViewName("cambioHijosCurp");
    }

    /**
     * Metodo que se encarga de eliminar las CURPS seleccionadas
     * @param model Model
     * @param datosBasicosDTO DatosBasicosDTO
     * @return String
     */
    @RequestMapping
    public String deleteCurpHijos(Model model, DatosBasicosDTO datosBasicosDTO) {
    
        List<DatosBasicosDTO> listaDatosBasicos = new ArrayList <DatosBasicosDTO>();
        if (datosBasicosDTO.getIdHijos() == null) { 
           super.saveError(model, "Error en selección de registro de hijos ");
           return super.getViewName("cambioHijosCurp");
        }
        for (String item : datosBasicosDTO.getIdHijos()) {
            DatosBasicosDTO borraCurp = new DatosBasicosDTO();
            borraCurp.setRfcEmpleado(datosBasicosDTO.getRfcEmpleado());
            borraCurp.setCurpEmpleado(item);
            listaDatosBasicos.add(borraCurp);
            
        }
        super.getService(RuspService.class).deleteCurpHijos(listaDatosBasicos);
        return super.getViewName("cambioHijosCurp");
    }

    /**
     */
    @RequestMapping
    public String cancelar(Model model, DatosBasicosDTO datosBasicosDTO) {
            
        return obtieneCurp(model, datosBasicosDTO.getRfcEmpleado(), datosBasicosDTO);

    }

    /**
     * Metodo que se encarga de eliminar las lenguas seleccionadas
     * @param model Model
     * @param datosBasicosDTO DatosBasicosDTO
     * @return String
     */
    @RequestMapping
    public String deleteLengua(Model model, DatosBasicosDTO datosBasicosDTO) {
      
        List<DatosBasicosDTO> listaDatosBasicos = new ArrayList <DatosBasicosDTO>();
        if (datosBasicosDTO.getIdLengua() == null) { 
           super.saveError(model, "Error en selección de registro de lengua ");
           return super.getViewName("cambioHijosCurp");
        }
        for (Integer item : datosBasicosDTO.getIdLengua()) {
            DatosBasicosDTO borraLengua = new DatosBasicosDTO();
            borraLengua.setRfcEmpleado(datosBasicosDTO.getRfcEmpleado());
            borraLengua.setLengua(item);
            listaDatosBasicos.add(borraLengua);
            
        }
        super.getService(RuspService.class).deleteLengua(listaDatosBasicos);
        return super.getViewName("cambioHijosCurp");
    }

    /**
     * Metodo encargado de agregar una lengua a un empleado por su rfc
     * @param model Model
     * @param rfcEmpleado String
     * @return
     */
    @RequestMapping
    public String addLengua(Model model, DatosBasicos1DTO datosBasicos1DTO, DatosBasicosDTO datosBasicosDTO) {
        datosBasicos1DTO = new DatosBasicos1DTO();
        datosBasicos1DTO.setRfcEmpleado(datosBasicosDTO.getRfcEmpleado());
        datosBasicos1DTO.setRfcUnico(datosBasicosDTO.getRfcUnico());
        model.addAttribute(datosBasicos1DTO);
        return super.getViewName("cambioLengua");
    }

    /**
     * Metodo encargado de actualizar CURP
     * @param model Model
     * @param TdRuspHijoDTO tdRuspHijoDTO
     * @return String
     */
    @RequestMapping
    public String updateLengua(Model model, DatosBasicos1DTO datosBasicos1DTO, DatosBasicosDTO datosBasicosDTO) {
    
        super.getService(RuspService.class).saveLengua(datosBasicos1DTO, super.security().getUserName());
        //datosBasicosDTO.setRfcEmpleado(datosBasicos1DTO.getRfcEmpleado());
        //model.addAttribute(datosBasicosDTO);
        return obtieneCurp(model, datosBasicosDTO.getRfcEmpleado(), datosBasicosDTO);
        
        //return super.getViewName("cambioHijosCurp");
    }

}
