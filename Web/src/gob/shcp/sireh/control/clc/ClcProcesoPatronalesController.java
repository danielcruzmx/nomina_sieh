package gob.shcp.sireh.control.clc;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcPatronalesDTO;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import gob.shcp.sireh.service.clc.proceso.ClcPatronalesService;

import gob.shcp.sireh.service.clc.proceso.ClcTercerosService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClcProcesoPatronalesController extends AbstractController implements AnnotatedController {
    
    private static final String GUIA_CONTABLE_CANCELADOS = "2201";
    
    /********************************************************* PROCESA PATRONALES ******************************************************/
     /**
      * Procesa Patronales - Metodo encargado de verificar el tipo de clc en el proceso de terceros con base en el objeto clcPatronalesDTO.
      * @author Oscar S.
      * @param model Model
      * @param clcPatronalesDTO ClcPatronalesDTO
      * @return String
      */
     @RequestMapping
     public String verificaTipoClc(Model model, ClcPatronalesDTO clcPatronalesDTO) {
         // Combo tipo proceso
         if (clcPatronalesDTO.getTipoClc() == null) {
             super.saveError(model, "clc.proceso.clcPatronales.error.tipoClc");
             clcPatronalesDTO.setVerificaTipoClc(false);
         } else {
             if (clcPatronalesDTO.getTipoClc().equals("BIMESTRAL")) {
                 clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_BIMESTRAL");
                 clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronalesBimestral");
                 clcPatronalesDTO.setEstado(new Integer(9));
             } else if (clcPatronalesDTO.getTipoClc().equals("MENSUAL")) {
                 clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_MENSUAL");
                 clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronales");
                 
             } else {
                 clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_QUINCENAL");
                 clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronales");
             }
             
             // Obtener meses validos
             ArrayList<EtiquetaClaveValorEntero> mesesValores = getMesValores();
             // Combo meses
             clcPatronalesDTO.setMesesValores(mesesValores);
             
             // Obtener ciclos validos
             ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
             
             // Combo quincena de pago
             clcPatronalesDTO.setCicloCombo(super.security().getOperationYear());
             clcPatronalesDTO.setCicloValoresQnaPago(cicloValores);
         }
         
         model.addAttribute(clcPatronalesDTO);
         return super.getViewName("clcPatronalesGenera");
     }
     
    /**
     * Procesa Patronales
     * @author
     * @param model Model
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return String
     */
    @RequestMapping
    public String clcPatronalesGenera(Model model, ClcPatronalesDTO clcPatronalesDTO) {
        if (clcPatronalesDTO.isCancel()) {
            clcPatronalesDTO = new ClcPatronalesDTO();
        }
        
        if (clcPatronalesDTO.isBusquedaClc() && 
            clcPatronalesDTO.getCiclo() != null && 
            (clcPatronalesDTO.getQuincena() != null || !clcPatronalesDTO.getMes().equals("")) && 
            clcPatronalesDTO.getTipoNominaPatronales() != null) {
            // Init params
            clcPatronalesDTO = getInitParamsPatronales(clcPatronalesDTO);
        }    
        model.addAttribute(clcPatronalesDTO);
        return super.getViewName("clcPatronalesGenera");
    }
    
    /**
     * Procesa Patronales - Metodo encargado de ejecutar el stored procedure para generar clc de terceros con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureClcPatronales(Model model, ClcPatronalesDTO clcPatronalesDTO) {
        if (clcPatronalesDTO.getNominaGrupo() == null || clcPatronalesDTO.getNominaGrupo().length == 0) {
            super.saveError(model, "clc.proceso.clcPatronales.error.nominaGrupo");
        } else if (clcPatronalesDTO.getQnaPago() == null || clcPatronalesDTO.getQnaPago() == 0) {
            super.saveError(model, "clc.proceso.clcPatronales.error.qnaPago");
        } else if (clcPatronalesDTO.getComplemento() == null || clcPatronalesDTO.getComplemento().equals("")) {
            super.saveError(model, "clc.proceso.clcPatronales.error.complemento");
        } else {
            // Verifica si la clc ya existe
            boolean existeClc = super.getService(ClcPatronalesService.class).existeCLCProcesadaPatronales(clcPatronalesDTO.getCiclo(), 
                                                                                                          clcPatronalesDTO.getQnaPago(), 
                                                                                                          clcPatronalesDTO.getTipoNominaPatronales(), 
                                                                                                          clcPatronalesDTO.getComplemento());
            
            logger.debug("executeProcedureClcPatronales -> existeClc -----------------> " + existeClc);
            
            // Verificar si existen errores
            Integer existeError = super.getService(ClcPatronalesService.class).executeProcedureExisteError(clcPatronalesDTO);
            logger.debug("executeProcedureClcPatronales -> existeError -----------------> " + existeError);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcPatronales.existe.error");
                clcPatronalesDTO.setMuestraErrores(true);
            } else {
                String[] nominas = clcPatronalesDTO.getNominaGrupo();
                StringBuffer sb = new StringBuffer();
                
                // Nominas
                for (String nomina : nominas) {
                    String[] result = nomina.split("\\|");                    
                    sb.append(result[0]).append(",");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                clcPatronalesDTO.setNominasCadena(sb.toString());
                
                // Verifica si la clc no existe y si hay reproceso
                //if (existeClc && clcPatronalesDTO.getCheckBoxReprocesa().equals("S")) {
                if (clcPatronalesDTO.getCheckBoxReprocesa().equals("S")) {
                     // Obtener numero de clc a reprocesar
                    Integer numeroClcPatronalesReproceso = super.getService(ClcPatronalesService.class).getClcPatronalReproceso(clcPatronalesDTO.getCiclo(), 
                                                                                                                                clcPatronalesDTO.getQnaPago(), 
                                                                                                                                clcPatronalesDTO.getTipoNominaPatronales(), 
                                                                                                                                clcPatronalesDTO.getComplemento());
                    logger.debug("executeProcedureClcPatronales -> numeroClcPatronalesReproceso -----------------> " + numeroClcPatronalesReproceso);
                    clcPatronalesDTO.setReproceso(String.valueOf(numeroClcPatronalesReproceso));
                } else {
                    clcPatronalesDTO.setReproceso("0");
                }
                
                // Funcion GENERA_CXLC_TER_APORTA
                Integer executeError = super.getService(ClcPatronalesService.class).executeProcedurePatronales(clcPatronalesDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcPatronales.ok");
                    clcPatronalesDTO = new ClcPatronalesDTO();
                } else {
                    super.saveError(model, "clc.proceso.clcPatronales.error");
                    
                    // Init params
                    clcPatronalesDTO = getInitParamsPatronales(clcPatronalesDTO);
                    
                    clcPatronalesDTO.setMuestraErrores(true);
                }
            }
        }
                    
        model.addAttribute(clcPatronalesDTO);
        return super.getViewName("clcPatronalesGenera");
    }
    
    /**
     * Procesa Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesDTO ClcPatronalesDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteErrorPatronales(Model model, ClcPatronalesDTO clcPatronalesDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcPatronalesService.class).marcaRevisadoExisteError(clcPatronalesDTO);
            
            super.saveMessage(model, "clc.proceso.clcPatronales.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcPatronales.revisado.error");
        }
        
        // Init params
        clcPatronalesDTO = getInitParamsPatronales(clcPatronalesDTO);
        
        model.addAttribute(clcPatronalesDTO);
        return super.getViewName("clcPatronalesGenera");
    }
    
    private ClcPatronalesDTO getInitParamsPatronales(ClcPatronalesDTO clcPatronalesDTO) {    
        if (clcPatronalesDTO.getTipoClc() != null) {
            // Combo tipo nomina
            if (clcPatronalesDTO.getTipoClc().equals("BIMESTRAL")) {
                clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_BIMESTRAL");
                clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronalesBimestral");
                
                logger.debug("getInitParamsPatronales (Bimestral) -> quincenas -----------------> " + clcPatronalesDTO.getQuincena());
                
                // Lista de quincenas               
                clcPatronalesDTO.setQuincenasList(splitAsIntegerList(clcPatronalesDTO.getQuincena(), ","));
                
            } else if (clcPatronalesDTO.getTipoClc().equals("MENSUAL")) {
                clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_MENSUAL");
                clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronales");
                
                // Obtener mes y año
                 String mes = "";
                if (clcPatronalesDTO.getMes().equals("10") || clcPatronalesDTO.getMes().equals("11") || clcPatronalesDTO.getMes().equals("12")) {
                    mes = clcPatronalesDTO.getMes();
                } else {
                    mes = String.valueOf("0").concat(clcPatronalesDTO.getMes());
                }
                String anio = super.security().getOperationYear();
                
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                
                // Genera fecha inicial
                String strFechaInicial = anio + "-" + mes + "-01";
                Date fechaInicial = new Date();
                try {
                    fechaInicial = formatoDelTexto.parse(strFechaInicial);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                
                // Genera fecha final
                String strFechaFinal = anio + "-" + mes + "-16";
                Date fechaFinal = new Date();
                try {
                    fechaFinal = formatoDelTexto.parse(strFechaFinal);
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                
                // Obtener quincenas
                Integer quincenaInicial = getQuincenaCapturaAsInteger(fechaInicial);
                Integer quincenaFinal = getQuincenaCapturaAsInteger(fechaFinal);
                logger.debug("getInitParamsPatronales -> quincenas -----------------> " + quincenaInicial + " - " + quincenaFinal);
                
                // Lista de quincenas
                List<Integer> quincenasList =  new ArrayList<Integer>();
                quincenasList.add(quincenaInicial);
                quincenasList.add(quincenaFinal);
                clcPatronalesDTO.setQuincenasList(quincenasList);
            } else {
                clcPatronalesDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaPatronales_QUINCENAL");
                clcPatronalesDTO.setBeanName("busquedaClcProcesaPatronales");
                
                logger.debug("getInitParamsPatronales -> quincenas -----------------> " + clcPatronalesDTO.getQuincena());
                
                // Lista de quincenas               
                clcPatronalesDTO.setQuincenasList(splitAsIntegerList(clcPatronalesDTO.getQuincena(), ","));
            }
        }
        
        // Criterios de busqueda
        clcPatronalesDTO.setVerificaTipoClc(true);
        
        // Obtener meses validos
        ArrayList<EtiquetaClaveValorEntero> mesesValores = getMesValores();
        // Combo meses
        clcPatronalesDTO.setMesesValores(mesesValores);
        
        // Muestra pagedList
        clcPatronalesDTO.setMuestraRegistros(true);
        
        // Filtros
        List<String> conceptoPagoList = new ArrayList<String>();
        
        if (clcPatronalesDTO.getTipoClc().equals("BIMESTRAL")) {
            if (clcPatronalesDTO.getTipoNominaPatronales().equals("FV")) {//Fovissste
                conceptoPagoList.add("FV");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("RP")) {//Cesantia
                conceptoPagoList.add("RV");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("SA")) {//SAR
                conceptoPagoList.add("SA");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("AP")) {//Ahorro solidario
                conceptoPagoList.add("AP");
                clcPatronalesDTO.setEstado(new Integer(9));
            }
        } else {
            if (clcPatronalesDTO.getTipoNominaPatronales().equals("IS") || clcPatronalesDTO.getTipoNominaPatronales().equals("IX") ) {//ISSSTE
                conceptoPagoList.add("IS");
                conceptoPagoList.add("EI");            
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("SC")) {//SEGURO COLECTIVO
                conceptoPagoList.add("GN");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("N2")) {// IMPUESTO SOBRE NOMINA 2%
                conceptoPagoList.add("2N");
                conceptoPagoList.add("EN");
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("FV")) {// Fovissste
                conceptoPagoList.add("FV");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("RP")) {// Cesantia
                conceptoPagoList.add("RV");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("SA")) {// SAR
                conceptoPagoList.add("SA");
                clcPatronalesDTO.setEstado(new Integer(9));
            } else if (clcPatronalesDTO.getTipoNominaPatronales().equals("AP")) {// Ahorro solidario
                conceptoPagoList.add("AP");
                clcPatronalesDTO.setEstado(new Integer(9));
            }
        }
        clcPatronalesDTO.setConceptoPagoList(conceptoPagoList);
        
        // Busqueda clc
        clcPatronalesDTO.setBusquedaClc(true);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
        
        // Combo quincena de pago
        clcPatronalesDTO.setCicloCombo(super.security().getOperationYear());
        clcPatronalesDTO.setCicloValoresQnaPago(cicloValores);
        
        // Checkbox reprocesa
        clcPatronalesDTO.setCheckBoxReprocesa("");
        
        return clcPatronalesDTO;
    }
    
    /**
     * Procesa Patronales
     * @author
     * @param model Model
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String clcPatronalesCancelados(Model model, ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        if (clcPatronalesCanceladosDTO.isCancel()) {
            clcPatronalesCanceladosDTO = new ClcPatronalesCanceladosDTO();
        }
        
        if (clcPatronalesCanceladosDTO.isBusquedaClc()) {                            
            if (clcPatronalesCanceladosDTO.getCiclo() == null || clcPatronalesCanceladosDTO.getCiclo() == 0) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.ciclo");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcPatronalesCanceladosDTO.getQuincena() == null || clcPatronalesCanceladosDTO.getQuincena().equals("")) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.quincena");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales() == null || clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("")) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.tipoNominaPatronales");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcPatronalesCanceladosDTO.getComplemento() == null || clcPatronalesCanceladosDTO.getComplemento().equals("")) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.complemento");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcPatronalesCanceladosDTO.getClcCancelacion() == null || clcPatronalesCanceladosDTO.getClcCancelacion() == 0) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.clc");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(true);
                
            } else if (clcPatronalesCanceladosDTO.getClcCancelacion() > 6000 && clcPatronalesCanceladosDTO.getClcCancelacion() < 7999) {
                super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.clc.rango");
                clcPatronalesCanceladosDTO.setBusquedaClc(false);
                clcPatronalesCanceladosDTO.setBusquedaDisabled(true);
                
            } else {
                // Init params
                clcPatronalesCanceladosDTO = getInitParamsPatronalesCancelados(clcPatronalesCanceladosDTO);
            }
        }
        
        model.addAttribute(clcPatronalesCanceladosDTO);
        return super.getViewName("clcPatronalesCancelados");
    }
    
    /**
     * Metodo encargado de inicializar parametros en el proceso de ajuste de terceros con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     */
    private ClcPatronalesCanceladosDTO getInitParamsPatronalesCancelados(ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
    
        logger.debug("getInitParamsPatronalesCancelados -> quincenas -----------------> " + clcPatronalesCanceladosDTO.getQuincena());
        
        // Lista de quincenas               
        List<Integer> listAux = new ArrayList<Integer>();
        listAux.add(clcPatronalesCanceladosDTO.getQnaCancelacion());
        clcPatronalesCanceladosDTO.setQuincenasList(listAux);
         
        // Muestra pagedList
        clcPatronalesCanceladosDTO.setBusquedaClc(true);
        
        // Filtros
        List<String> conceptoPagoList = new ArrayList<String>();        
        if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("IS") || clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("IX") ) {//ISSSTE
            conceptoPagoList.add("IS");
            conceptoPagoList.add("EI");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("SC")) {//SEGURO COLECTIVO
            conceptoPagoList.add("GN");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("N2")) {// IMPUESTO SOBRE NOMINA 2%
            conceptoPagoList.add("2N");
            conceptoPagoList.add("EN");
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("FV")) {// Fovissste
            conceptoPagoList.add("FV");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("RP")) {// Cesantia
            conceptoPagoList.add("RV");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("SA")) {// SAR
            conceptoPagoList.add("SA");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        } else if (clcPatronalesCanceladosDTO.getTipoNominaPatronales().equals("AP")) {// Ahorro solidario
            conceptoPagoList.add("AP");
            clcPatronalesCanceladosDTO.setEstado(new Integer(9));
        }
        clcPatronalesCanceladosDTO.setConceptoPagoList(conceptoPagoList);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
        
        return clcPatronalesCanceladosDTO;
    }
    
    /**
     * Procesa Patronales - Metodo encargado de ejecutar el stored procedure para cancelar terceros con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureAplicaCxlcCancelado(Model model, ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
    
        if ((clcPatronalesCanceladosDTO.getCompensadaGrupo() == null || clcPatronalesCanceladosDTO.getCompensadaGrupo().length == 0) &&
            (clcPatronalesCanceladosDTO.getTrabajadorGrupo() == null || clcPatronalesCanceladosDTO.getTrabajadorGrupo().length == 0)) {
            super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.grupos");
        } else if (clcPatronalesCanceladosDTO.getQnaCancelacion() == null || clcPatronalesCanceladosDTO.getQnaCancelacion() == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.qnaCancelacion");
        } else if (clcPatronalesCanceladosDTO.getClcCancelacion() == null || clcPatronalesCanceladosDTO.getClcCancelacion() == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.clc");
        } else if (clcPatronalesCanceladosDTO.getClcCancelacion() > 6000 && clcPatronalesCanceladosDTO.getClcCancelacion() < 7999) {
            super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.clc.rango");
        } else if (clcPatronalesCanceladosDTO.getComplemento() == null || clcPatronalesCanceladosDTO.getComplemento().equals("")) {
            super.saveError(model, "clc.proceso.clcPatronalesCancelados.error.complemento");
        } else {
            Set<TnCxlcCanceladoDTO> cancelados = new HashSet<TnCxlcCanceladoDTO>();
            
            // Verificar si existen errores
            Integer existeError = super.getService(ClcPatronalesService.class).executeProcedureExisteErrorCancelados(clcPatronalesCanceladosDTO);
            logger.debug("executeProcedureAplicaCxlcCancelado -> existeError -----------------> " + existeError);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcPatronales.existe.error");
                clcPatronalesCanceladosDTO.setMuestraErrores(true);
            } else {
                
                if (clcPatronalesCanceladosDTO.getCompensadaGrupo() != null && clcPatronalesCanceladosDTO.getCompensadaGrupo().length > 0) {
                    // Obtener datos del trabajador
                    String[] datosCompensada = clcPatronalesCanceladosDTO.getCompensadaGrupo();//TODO: Validacion de checkbox
                    
                    if (datosCompensada.length > 0) {
                        // Verifica si el trabajador existe en la tabla tn_cxlc_cancelados
                        for (String trabajador : datosCompensada) {
                            if (trabajador != null && !trabajador.equals("")) {
                                String[] result = trabajador.split("\\|");
                                logger.debug(result[0] + " - " + result[1] + " - " + result[2] + " - " + result[3] + " - " + result[4] + " - " + result[5] + " - " + result[6]);
                                
                                Integer ciclo = new Integer(result[0]);
                                Integer clcCancelacion = new Integer(result[1]);
                                Long folio = Long.valueOf(result[2]);
                                Integer difFolio = new Integer(result[3]);
                                String idTipoCpto = result[4];
                                String idCptoPago = result[5];
                                Integer guiaContable = new Integer(GUIA_CONTABLE_CANCELADOS);
                                Double monto = Double.parseDouble(result[7]);
                                String unidad = result[8];
                                String grupoPago = result[9];
                                Integer estado = new Integer(result[10]);

                                boolean existe = super.getService(ClcPatronalesService.class).existeTnCxlcCancelado(clcPatronalesCanceladosDTO.getClcCancelacion(), 
                                                                                                                    clcPatronalesCanceladosDTO.getCiclo(), 
                                                                                                                    difFolio, 
                                                                                                                    folio, 
                                                                                                                    guiaContable, 
                                                                                                                    idCptoPago, 
                                                                                                                    idTipoCpto);
                                if (!existe) {
                                    TnCxlcCanceladoDTO cancelado = new TnCxlcCanceladoDTO();

                                    cancelado.setCxlccCiclo(clcPatronalesCanceladosDTO.getCiclo());
                                    cancelado.setCxlc(clcPatronalesCanceladosDTO.getClcCancelacion());
                                    cancelado.setCxlccFolio(folio);
                                    cancelado.setCxlccDifFolio(difFolio);
                                    cancelado.setIdTipoCpto(idTipoCpto);
                                    cancelado.setIdCptoPago(idCptoPago);
                                    cancelado.setCxlccGuiaCont(guiaContable);
                                    cancelado.setCxlccMonto(monto);
                                    cancelado.setCxlccTipoProceso("COM");
                                    cancelado.setIdUnidad(unidad);
                                    cancelado.setCxlccUniAplica(unidad);
                                    cancelado.setIdGrupoPago(grupoPago);
                                    cancelado.setIdEdo(estado);
                                    cancelado.setIdTipoNomina(clcPatronalesCanceladosDTO.getTipoNominaPatronales());
                                    cancelado.setAplicado("0");

                                    cancelados.add(cancelado);
                                } else {
                                    super.saveError(model, "clc.proceso.clcPatronalesCancelados.cheque.error", folio);
                                    logger.debug("Ya existe: " + folio);
                                }
                            }
                        }
                    }
                }
                
                // Aplica cancelados
                super.getService(ClcPatronalesService.class).saveAplicaCancelados(cancelados, super.security().getUserName());
                
                // Funcion CLC_TERCEROS_CANCELADOS
                Integer executeError = super.getService(ClcPatronalesService.class).executeProcedurePatronalesCancelados(clcPatronalesCanceladosDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcPatronalesCancelados.ok");
                    clcPatronalesCanceladosDTO = new ClcPatronalesCanceladosDTO();
                } else {
                    super.saveError(model, "clc.proceso.clcPatronalesCancelados.error");
                    
                    // Elimina cancelados
                    logger.debug("--------------------------------------> Elimina  "  + cancelados.size() + " cheques cancelados.");
                    super.getService(ClcPatronalesService.class).deleteAplicaCancelados(cancelados, super.security().getUserName());
                    
                    // Init params
                    clcPatronalesCanceladosDTO = getInitParamsPatronalesCancelados(clcPatronalesCanceladosDTO);
                    
                    clcPatronalesCanceladosDTO.setMuestraErrores(true);
                }
            }
        }
        model.addAttribute(clcPatronalesCanceladosDTO);
        return super.getViewName("clcPatronalesCancelados");
    }
    
    /**
     * Procesa Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesCanceladosDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesCanceladosDTO ClcPatronalesCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteErrorPatronalesCancelados(Model model, ClcPatronalesCanceladosDTO clcPatronalesCanceladosDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcPatronalesService.class).marcaRevisadoExisteErrorCancelados(clcPatronalesCanceladosDTO);
            
            super.saveMessage(model, "clc.proceso.clcPatronales.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcPatronales.revisado.error");
        }
        
        // Init params
        clcPatronalesCanceladosDTO = getInitParamsPatronalesCancelados(clcPatronalesCanceladosDTO);
        
        model.addAttribute(clcPatronalesCanceladosDTO);
        return super.getViewName("clcPatronalesCancelados");
    }
    
    /**
     * Procesa Patronales
     * @author
     * @param model Model
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return String
     */
    @RequestMapping
    public String clcPatronalesAjustes(Model model, ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        if (clcPatronalesAjustesDTO.isCancel()) {
            clcPatronalesAjustesDTO = new ClcPatronalesAjustesDTO();
        }

        if (clcPatronalesAjustesDTO.isBusquedaClc()) {
            if (clcPatronalesAjustesDTO.getCiclo() == null || clcPatronalesAjustesDTO.getCiclo() == 0) {
                super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.ciclo");
                clcPatronalesAjustesDTO.setBusquedaClc(false);
            } else if (clcPatronalesAjustesDTO.getQuincena() == null || clcPatronalesAjustesDTO.getQuincena() == 0) {
                super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.quincena");
                clcPatronalesAjustesDTO.setBusquedaClc(false);
            } else if (clcPatronalesAjustesDTO.getComplemento() == null) {
                super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.complemento");
                clcPatronalesAjustesDTO.setBusquedaClc(false);
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales() == null || clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("")) {
                super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.tipoNominaPatronales");
                clcPatronalesAjustesDTO.setBusquedaClc(false);
            }
        } else {
            // Init params
            clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
        }
        
        model.addAttribute(clcPatronalesAjustesDTO);
        return super.getViewName("clcPatronalesAjustes");
    }
    
    /**
     * Procesa Patronales - Metodo encargado de ejecutar el stored procedure para ajustar terceros con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureAplicaCxlcAjustes(Model model, ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        
        if (clcPatronalesAjustesDTO.getAjusteGrupo() == null || clcPatronalesAjustesDTO.getAjusteGrupo().length == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.grupos");
        } else if (clcPatronalesAjustesDTO.getCiclo() == null || clcPatronalesAjustesDTO.getCiclo() == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.ciclo");
        } else if (clcPatronalesAjustesDTO.getQuincena() == null || clcPatronalesAjustesDTO.getQuincena() == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.quincena");
        } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales() == null || clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("")) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.tipoNominaPatronales");
        } else if (clcPatronalesAjustesDTO.getComplemento() == null) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.complemento");
        } else if (clcPatronalesAjustesDTO.getSigno() == null || clcPatronalesAjustesDTO.getSigno().equals("")) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.signo");
        } else if (clcPatronalesAjustesDTO.getImporteAjuste() == 0) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.importeAjuste");
        } else if (clcPatronalesAjustesDTO.getImporteAjuste() > 25) {
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.error.importeAjusteMayor");
        } else {
        
            // Verificar si existen errores
            Integer existeError = super.getService(ClcPatronalesService.class).executeProcedureExisteErrorAjustes(clcPatronalesAjustesDTO);
            logger.debug("executeProcedureAplicaCxlcAjustes -> existeError -----------------> " + existeError);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcPatronalesAjustes.existe.error");
                clcPatronalesAjustesDTO.setMuestraErrores(true);
            } else {
                
                // Obtener datos de la CLC de ajuste
                String[] datosAjuste = clcPatronalesAjustesDTO.getAjusteGrupo();
                clcPatronalesAjustesDTO.setClcAjuste(new Integer(datosAjuste[0]));
                
                // Obtener datos de la CLC compensada
                //String[] datosCompensada = clcPatronalesAjustesDTO.getCompensadaGrupo();
                //clcPatronalesAjustesDTO.setClcCompensada(new Integer(datosCompensada[0]));
                clcPatronalesAjustesDTO.setClcCompensada(new Integer(0));
                 
                // Funcion CLC_TERCEROS_AJUSTES
                Integer executeError = super.getService(ClcPatronalesService.class).executeProcedurePatronalesAjustes(clcPatronalesAjustesDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcPatronalesAjustes.ok");
                    clcPatronalesAjustesDTO = new ClcPatronalesAjustesDTO();
                } else if (executeError == 2) {
                    super.saveError(model, "clc.proceso.clcPatronalesAjustes.error2");
                    
                    // Init params
                    clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
                    
                    clcPatronalesAjustesDTO.setMuestraErrores(true);
                }  else if (executeError == 3) {
                    super.saveError(model, "clc.proceso.clcPatronalesAjustes.error3");
                    
                    // Init params
                    clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
                    
                    clcPatronalesAjustesDTO.setMuestraErrores(true);
                } else if (executeError == 4) {
                    super.saveError(model, "clc.proceso.clcPatronalesAjustes.error4");
                    
                    // Init params
                    clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
                    
                    clcPatronalesAjustesDTO.setMuestraErrores(true);
                } else {
                    super.saveError(model, "clc.proceso.clcPatronalesAjustes.error");
                    
                    // Init params
                    clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
                    
                    clcPatronalesAjustesDTO.setMuestraErrores(true);
                }
            }
        }
        model.addAttribute(clcPatronalesAjustesDTO);
        return super.getViewName("clcPatronalesAjustes");
    }
    
    /**
     * Procesa Patronales - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteErrorPatronalesAjustes(Model model, ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcPatronalesService.class).marcaRevisadoExisteErrorAjustes(clcPatronalesAjustesDTO);
            
            super.saveMessage(model, "clc.proceso.clcPatronalesAjustes.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcPatronalesAjustes.revisado.error");
        }
        
        // Init params
        clcPatronalesAjustesDTO = getInitParamsPatronalesAjustes(clcPatronalesAjustesDTO);
        
        model.addAttribute(clcPatronalesAjustesDTO);
        return super.getViewName("clcPatronalesAjustes");
    }
    
    /**
     * Metodo encargado de inicializar parametros en el proceso de cancelacion de terceros con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     */
    private ClcPatronalesAjustesDTO getInitParamsPatronalesAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
                
        logger.debug("getInitParamsPatronalesAjustes -> quincenas -----------------> " + clcPatronalesAjustesDTO.getQuincena());
        
        // Lista de quincenas
        List<Integer> listAux = new ArrayList<Integer>();
        listAux.add(clcPatronalesAjustesDTO.getQuincena());
        clcPatronalesAjustesDTO.setQuincenasList(listAux);
         
        // Muestra pagedList
        clcPatronalesAjustesDTO.setBusquedaClc(false);
        
        // BeanName
        //clcPatronalesAjustesDTO = getBeanNamePatronalesAjustes(clcPatronalesAjustesDTO);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
         
        // Combo quincena de cancelacion
        clcPatronalesAjustesDTO.setCicloValoresQnaPago(cicloValores);
        
        return clcPatronalesAjustesDTO;
    }
    
    /**
     * Metodo encargado de obtener los beanName necesarios en el proceso de busqueda de terceros con base en el objeto clcPatronalesAjustesDTO.
     * @author Oscar S.
     * @param clcPatronalesAjustesDTO ClcPatronalesAjustesDTO
     * @return Patronales ClcPatronalesAjustesDTO
     */
    private ClcPatronalesAjustesDTO getBeanNamePatronalesAjustes(ClcPatronalesAjustesDTO clcPatronalesAjustesDTO) {
        // BeanName
        if (clcPatronalesAjustesDTO.getTipoNominaPatronales() != null) {
            if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("FO")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_FONAC");
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("SD")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_SINDICATO");
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("AH")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_CAJA_DE_AHORRO_SINDICAL");
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("FS")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_FSTSE");
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("PA")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_PENSION_ALIMENTICIA");
            } else if (clcPatronalesAjustesDTO.getTipoNominaPatronales().equals("RI")) {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_IMPUESTOS");
            }  else {
                clcPatronalesAjustesDTO.setBeanName("busquedaClcProcesaPatronalesAjustes_OTROS");
                
                // Tipo momina
                String guiasContables = super.getService(ClcPatronalesService.class).guiaContableByTipoNominaPatronales(clcPatronalesAjustesDTO.getTipoNominaPatronales()).replaceAll("\\|", ",");
                logger.debug("clcPatronalesAjustesDTO -> guiasContables --------> " + guiasContables);
                
                // Guias contables validas
                List<String> guiasContablesList = new ArrayList<String>();
                String[] temp = guiasContables.split(",");
                
                for(int i = 0; i < temp.length; i++) {
                    guiasContablesList.add(temp[i]);
                }
                clcPatronalesAjustesDTO.setGuiasContablesList(guiasContablesList);
            }
            logger.debug("clcPatronalesAjustesDTO -> beanName -----------------> " + clcPatronalesAjustesDTO.getBeanName());
        }
        return clcPatronalesAjustesDTO;
    }
    
    /**
     * Metodo encargado de obtener la quincena de captura como Integer a partir de un Date
     * @author Gualberto G.
     * @param fechaQuincena
     * @return Integer
     */
    private Integer getQuincenaCapturaAsInteger(Date fechaQuincena) {
        if (fechaQuincena == null) {
            return null;
        }

        Calendar fechaQuincenaCalendar = Calendar.getInstance();
        fechaQuincenaCalendar.setTime(fechaQuincena);
        int anio = fechaQuincenaCalendar.get(Calendar.YEAR);
        int mes = fechaQuincenaCalendar.get(Calendar.MONTH) + 1;
        int dia = fechaQuincenaCalendar.get(Calendar.DAY_OF_MONTH);
        int quincena;
        if (dia >= 1 && dia <= 15) {
            quincena = (mes * 2) - 1;
        } else {
            quincena = (mes * 2);
        }

        return Integer.valueOf(anio * 100 + quincena);
    }
    
    private List<Integer> splitAsIntegerList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);

        Integer[] numbers = new Integer[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            numbers[i] = new Integer(arreglo[i]);
        }
        return Arrays.asList(numbers);
    }
    
    /**
     * Lista de meses vigentes.
     * @author Oscar S.
     * @return ArrayList<EtiquetaClaveValorEntero>
     */
    private ArrayList<EtiquetaClaveValorEntero> getMesValores() {
        // Obtener meses validos
        ArrayList<EtiquetaClaveValorEntero> mesesValores = new ArrayList<EtiquetaClaveValorEntero>();
        
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(1), "enero"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(2), "febrero"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(3), "marzo"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(4), "abril"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(5), "mayo"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(6), "junio"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(7), "julio"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(8), "agosto"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(9), "septiembre"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(10), "octubre"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(11), "noviembre"));
        mesesValores.add(new EtiquetaClaveValorEntero(new Integer(12), "diciembre"));
        
        return mesesValores;
    }
    
    /**
     * Lista de quincenas vigentes.
     * @author Oscar S.
     * @return ArrayList<EtiquetaClaveValorEntero>
     */
    private ArrayList<EtiquetaClaveValorEntero> getCicloValoresQuincenas() {
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = new ArrayList<EtiquetaClaveValorEntero>();
        Integer cicloActual = new Integer(super.security().getOperationYear());
        
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("01")), String.valueOf(cicloActual).concat("01")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("02")), String.valueOf(cicloActual).concat("02")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("03")), String.valueOf(cicloActual).concat("03")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("04")), String.valueOf(cicloActual).concat("04")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("05")), String.valueOf(cicloActual).concat("05")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("06")), String.valueOf(cicloActual).concat("06")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("07")), String.valueOf(cicloActual).concat("07")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("08")), String.valueOf(cicloActual).concat("08")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("09")), String.valueOf(cicloActual).concat("09")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("10")), String.valueOf(cicloActual).concat("10")));
        
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("11")), String.valueOf(cicloActual).concat("11")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("12")), String.valueOf(cicloActual).concat("12")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("13")), String.valueOf(cicloActual).concat("13")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("14")), String.valueOf(cicloActual).concat("14")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("15")), String.valueOf(cicloActual).concat("15")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("16")), String.valueOf(cicloActual).concat("16")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("17")), String.valueOf(cicloActual).concat("17")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("18")), String.valueOf(cicloActual).concat("18")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("19")), String.valueOf(cicloActual).concat("19")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("20")), String.valueOf(cicloActual).concat("20")));
        
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("21")), String.valueOf(cicloActual).concat("21")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("22")), String.valueOf(cicloActual).concat("22")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("23")), String.valueOf(cicloActual).concat("23")));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(String.valueOf(cicloActual).concat("24")), String.valueOf(cicloActual).concat("24")));
        
        return cicloValores;
    }
}
