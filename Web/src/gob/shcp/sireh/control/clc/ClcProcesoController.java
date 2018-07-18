package gob.shcp.sireh.control.clc;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;
import gob.shcp.sireh.model.clc.proceso.ClcManualesArchivoDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesCapturaDTO;
import gob.shcp.sireh.model.clc.proceso.ClcOrdinariaDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosAjustesDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosCanceladosDTO;
import gob.shcp.sireh.model.clc.proceso.ClcTercerosDTO;
import gob.shcp.sireh.model.clc.proceso.CxlcManual;
import gob.shcp.sireh.model.clc.proceso.TnCxlcCanceladoDTO;

import gob.shcp.sireh.service.clc.proceso.ClcManualesService;
import gob.shcp.sireh.service.clc.proceso.ClcOrdinariaService;
import gob.shcp.sireh.service.clc.proceso.ClcTercerosService;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClcProcesoController extends AbstractController implements AnnotatedController {
       
    private static String formatoDecimal = "#,###.##";
    
    /********************************************************* PROCESA ORDINARIA ******************************************************/
    /**
     * Procesa Ordinaria - Metodo encargado de procesar clc ordinarias con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String clcOrdinaria(Model model, ClcOrdinariaDTO clcOrdinariaDTO) {
        if (!clcOrdinariaDTO.isMuestraErrores()) {
            clcOrdinariaDTO = new ClcOrdinariaDTO();
        }
        
        model.addAttribute(clcOrdinariaDTO);
        return super.getViewName("clcOrdinaria");
    }
    
    /**
     * Procesa Ordinaria - Metodo encargado de ejecutar el stored procedure para procesar clc ordinarias.
     * @author Oscar S.
     * @param model Model
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureClcOrdinaria(Model model, ClcOrdinariaDTO clcOrdinariaDTO) {
    
        if (clcOrdinariaDTO.getCicloUnidad() == null || clcOrdinariaDTO.getCicloUnidad() == 0) {
            super.saveError(model, "clc.proceso.clcOrdinaria.error.cicloUnidad");
        } else if (clcOrdinariaDTO.getQnaPago() == null || clcOrdinariaDTO.getQnaPago() == 0) {
            super.saveError(model, "clc.proceso.clcOrdinaria.error.qnaPago");
        } else if (clcOrdinariaDTO.getTipoNomina() == null || clcOrdinariaDTO.getTipoNomina().equals("") || clcOrdinariaDTO.getTipoNomina().equals("0")) {
            super.saveError(model, "clc.proceso.clcOrdinaria.error.tipoNomina");
        } else if (clcOrdinariaDTO.getNumComplem() == null || clcOrdinariaDTO.getNumComplem().equals("")) {
            super.saveError(model, "clc.proceso.clcOrdinaria.error.numComplem");
        } else {
            // Verificar si existen errores
            Integer existeError = super.getService(ClcOrdinariaService.class).executeProcedureExisteError(clcOrdinariaDTO);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcOrdinaria.existe.error");
                clcOrdinariaDTO.setMuestraErrores(true);
            } else {
                // Funcion CLC_ORDINARIA
                Integer executeError = super.getService(ClcOrdinariaService.class).executeProcedureClcOrdinaria(clcOrdinariaDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcOrdinaria.ok");
                    clcOrdinariaDTO = new ClcOrdinariaDTO();
                } else {
                    super.saveError(model, "clc.proceso.clcOrdinaria.error");
                    clcOrdinariaDTO.setMuestraErrores(true);
                }
            }
        }
        model.addAttribute(clcOrdinariaDTO);
        return super.getViewName("clcOrdinaria");
    }
    
    /**
     * Procesa Ordinaria - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcOrdinariaDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcOrdinariaDTO ClcOrdinariaDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteError(Model model, ClcOrdinariaDTO clcOrdinariaDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcOrdinariaService.class).marcaRevisadoExisteError(clcOrdinariaDTO);
            
            super.saveMessage(model, "clc.proceso.clcOrdinaria.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcOrdinaria.revisado.error");
        }
        model.addAttribute(clcOrdinariaDTO);
        return super.getViewName("clcOrdinaria");
    }
    
    
    
    /********************************************************* PROCESA TERCEROS ******************************************************/
    /**
     * Procesa Terceros - Metodo encargado de verificar el tipo de clc en el proceso de terceros con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosDTO ClcTercerosDTO
     * @return String
     */
    @RequestMapping
    public String verificaTipoClc(Model model, ClcTercerosDTO clcTercerosDTO) {
        // Combo tipo proceso
        if (clcTercerosDTO.getTipoClc() == null) {
            super.saveError(model, "clc.proceso.clcTerceros.error.tipoClc");
            clcTercerosDTO.setVerificaTipoClc(false);
        } else {
            if (clcTercerosDTO.getTipoClc().equals("MENSUAL")) {
                clcTercerosDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaTerceros_MENSUAL");
            } else {
                clcTercerosDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaTerceros_QUINCENAL");
            }
            
            // Obtener meses validos
            ArrayList<EtiquetaClaveValorEntero> mesesValores = getMesValores();
            // Combo meses
            clcTercerosDTO.setMesesValores(mesesValores);
            
            // Obtener ciclos validos
            ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
            
            // Combo quincena de pago
            clcTercerosDTO.setCicloCombo(super.security().getOperationYear());
            clcTercerosDTO.setCicloValoresQnaPago(cicloValores);
        }
        
        model.addAttribute(clcTercerosDTO);
        return super.getViewName("clcTercerosGenera");
    }
    
    /**
     * Procesa Terceros - Metodo encargado de busqueda de clc para el proceso de terceros con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosDTO ClcTercerosDTO
     * @return String
     * @deprecated
     */
    @RequestMapping
    public String clcTercerosGenera(Model model, ClcTercerosDTO clcTercerosDTO) {
        if (clcTercerosDTO.isCancel()) {
            clcTercerosDTO = new ClcTercerosDTO();
        }
        
        if (clcTercerosDTO.isBusquedaClc() && 
            clcTercerosDTO.getCiclo() != null && 
            (clcTercerosDTO.getQuincena() != null || !clcTercerosDTO.getMes().equals("")) && 
            clcTercerosDTO.getTipoNominaTerceros() != null) {
            // Init params
            clcTercerosDTO = getInitParamsTerceros(clcTercerosDTO);
            
            //clcTercerosDTO.setCheckBoxReprocesa("N");
        }
        
        model.addAttribute(clcTercerosDTO);
        return super.getViewName("clcTercerosGenera");
    }
    
    
    
    /**
     * Procesa Terceros
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String clcTercerosCancelados(Model model, ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        if (clcTercerosCanceladosDTO.isCancel()) {
            clcTercerosCanceladosDTO = new ClcTercerosCanceladosDTO();
        }
        
        if (clcTercerosCanceladosDTO.isBusquedaClc()) {            
            if (clcTercerosCanceladosDTO.getNominaOrigen() == null || clcTercerosCanceladosDTO.getNominaOrigen().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.nominaOrigen");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcTercerosCanceladosDTO.getCiclo() == null || clcTercerosCanceladosDTO.getCiclo() == 0) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.ciclo");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcTercerosCanceladosDTO.getQuincena() == null || clcTercerosCanceladosDTO.getQuincena().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.quincena");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros() == null || clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.tipoNominaTerceros");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcTercerosCanceladosDTO.getComplemento() == null || clcTercerosCanceladosDTO.getComplemento().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.complemento");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(false);
                
            } else if (clcTercerosCanceladosDTO.getClcCancelacion() == null || clcTercerosCanceladosDTO.getClcCancelacion() == 0) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.clc");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(true);
                
            } else if (clcTercerosCanceladosDTO.getClcCancelacion() > 6000 && clcTercerosCanceladosDTO.getClcCancelacion() < 7999) {
                super.saveError(model, "clc.proceso.clcTercerosCancelados.error.clc.rango");
                clcTercerosCanceladosDTO.setBusquedaClc(false);
                clcTercerosCanceladosDTO.setBusquedaDisabled(true);
                
            } else {
                // Init params
                clcTercerosCanceladosDTO = getInitParamsTercerosCancelados(clcTercerosCanceladosDTO);
            }
        }
        
        model.addAttribute(clcTercerosCanceladosDTO);
        return super.getViewName("clcTercerosCancelados");
    }
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para cancelar terceros con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureAplicaCxlcCancelado(Model model, ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
    
        if ((clcTercerosCanceladosDTO.getCompensadaGrupo() == null || clcTercerosCanceladosDTO.getCompensadaGrupo().length == 0) &&
            (clcTercerosCanceladosDTO.getTrabajadorGrupo() == null || clcTercerosCanceladosDTO.getTrabajadorGrupo().length == 0)) {
            super.saveError(model, "clc.proceso.clcTercerosCancelados.error.grupos");
        } else if (clcTercerosCanceladosDTO.getQnaCancelacion() == null || clcTercerosCanceladosDTO.getQnaCancelacion() == 0) {
            super.saveError(model, "clc.proceso.clcTercerosCancelados.error.qnaCancelacion");
        } else if (clcTercerosCanceladosDTO.getClcCancelacion() == null || clcTercerosCanceladosDTO.getClcCancelacion() == 0) {
            super.saveError(model, "clc.proceso.clcTercerosCancelados.error.clc");
        } else if (clcTercerosCanceladosDTO.getClcCancelacion() > 6000 && clcTercerosCanceladosDTO.getClcCancelacion() < 7999) {
            super.saveError(model, "clc.proceso.clcTercerosCancelados.error.clc.rango");
        } else if (clcTercerosCanceladosDTO.getComplemento() == null || clcTercerosCanceladosDTO.getComplemento().equals("")) {
            super.saveError(model, "clc.proceso.clcTercerosCancelados.error.complemento");
        } else {
            Set<TnCxlcCanceladoDTO> cancelados = new HashSet<TnCxlcCanceladoDTO>();
            
            // Verificar si existen errores
            Integer existeError = super.getService(ClcTercerosService.class).executeProcedureExisteErrorCancelados(clcTercerosCanceladosDTO);
            logger.debug("executeProcedureAplicaCxlcCancelado -> existeError -----------------> " + existeError);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcTerceros.existe.error");
                clcTercerosCanceladosDTO.setMuestraErrores(true);
            } else {
                if (clcTercerosCanceladosDTO.getTrabajadorGrupo() != null && clcTercerosCanceladosDTO.getTrabajadorGrupo().length > 0) {
                    // Obtener datos del trabajador
                    String[] datosTrabajador = clcTercerosCanceladosDTO.getTrabajadorGrupo(); //TODO: Validacion de checkbox
                    
                    if (datosTrabajador.length > 0) {
                        // Verifica si el trabajador existe en la tabla tn_cxlc_cancelados
                        for (String trabajador : datosTrabajador) {
                            if (trabajador != null && !trabajador.equals("")) {
                                String[] result = trabajador.split("\\|");
                                logger.debug(result[0] + " - " + result[1] + " - " + result[2] + " - " + result[3] + " - " + result[4] + " - " + result[5] + " - " + result[6]);
                                
                                Integer ciclo = new Integer(result[0]);
                                Integer clcCancelacion = new Integer(result[1]);
                                Long folio = Long.valueOf(result[2]);
                                Integer difFolio = new Integer(result[3]);
                                String idTipoCpto = result[4];
                                String idCptoPago = result[5];
                                Integer guiaContable = new Integer(result[6]);
                                Double monto = Double.parseDouble(result[7]);
                                String unidad = result[8];
                                String grupoPago = result[9];
                                Integer estado = new Integer(result[10]);
                                
                                boolean existe = super.getService(ClcTercerosService.class).existeTnCxlcCancelado(clcTercerosCanceladosDTO.getClcCancelacion(), 
                                                                                                                  clcTercerosCanceladosDTO.getCiclo(), 
                                                                                                                  difFolio, 
                                                                                                                  folio, 
                                                                                                                  guiaContable, 
                                                                                                                  idCptoPago, 
                                                                                                                  idTipoCpto);
                                if (!existe) {
                                    TnCxlcCanceladoDTO cancelado = new TnCxlcCanceladoDTO();

                                    cancelado.setCxlccCiclo(clcTercerosCanceladosDTO.getCiclo());
                                    cancelado.setCxlc(clcTercerosCanceladosDTO.getClcCancelacion());
                                    cancelado.setCxlccFolio(folio);
                                    cancelado.setCxlccDifFolio(difFolio);
                                    cancelado.setIdTipoCpto(idTipoCpto);
                                    cancelado.setIdCptoPago(idCptoPago);
                                    cancelado.setCxlccGuiaCont(guiaContable);
                                    cancelado.setCxlccMonto(monto);
                                    cancelado.setCxlccTipoProceso("TRA");
                                    cancelado.setIdUnidad(unidad);
                                    cancelado.setCxlccUniAplica(unidad);
                                    cancelado.setIdGrupoPago(grupoPago);
                                    cancelado.setIdEdo(estado);
                                    cancelado.setIdTipoNomina(clcTercerosCanceladosDTO.getTipoNominaTerceros());
                                    cancelado.setAplicado("0");

                                    cancelados.add(cancelado);
                                } else {
                                    super.saveError(model, "clc.proceso.clcTercerosCancelados.cheque.error", folio);
                                    logger.debug("Ya existe: " + folio);
                                }
                            }
                        }
                    }
                }
                
                if (clcTercerosCanceladosDTO.getCompensadaGrupo() != null && clcTercerosCanceladosDTO.getCompensadaGrupo().length > 0) {
                    // Obtener datos del trabajador
                    String[] datosCompensada = clcTercerosCanceladosDTO.getCompensadaGrupo(); //TODO: Validacion de checkbox
                    
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
                                Integer guiaContable = new Integer(result[6]);
                                Double monto = Double.parseDouble(result[7]);
                                String unidad = result[8];
                                String grupoPago = result[9];
                                Integer estado = new Integer(result[10]);

                                boolean existe = super.getService(ClcTercerosService.class).existeTnCxlcCancelado(clcTercerosCanceladosDTO.getClcCancelacion(), 
                                                                                                                  clcTercerosCanceladosDTO.getCiclo(), 
                                                                                                                  difFolio, 
                                                                                                                  folio, 
                                                                                                                  guiaContable, 
                                                                                                                  idCptoPago, 
                                                                                                                  idTipoCpto);
                                if (!existe) {
                                    TnCxlcCanceladoDTO cancelado = new TnCxlcCanceladoDTO();

                                    cancelado.setCxlccCiclo(clcTercerosCanceladosDTO.getCiclo());
                                    cancelado.setCxlc(clcTercerosCanceladosDTO.getClcCancelacion());
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
                                    cancelado.setIdTipoNomina(clcTercerosCanceladosDTO.getTipoNominaTerceros());
                                    cancelado.setAplicado("0");

                                    cancelados.add(cancelado);
                                } else {
                                    super.saveError(model, "clc.proceso.clcTercerosCancelados.cheque.error", folio);
                                    logger.debug("Ya existe: " + folio);
                                }
                            }
                        }
                    }
                }
                
                // Aplica cancelados
                super.getService(ClcTercerosService.class).saveAplicaCancelados(cancelados, super.security().getUserName());
                
                // Funcion CLC_TERCEROS_CANCELADOS
                Integer executeError = super.getService(ClcTercerosService.class).executeProcedureTercerosCancelados(clcTercerosCanceladosDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcTercerosCancelados.ok");
                    clcTercerosCanceladosDTO = new ClcTercerosCanceladosDTO();
                } else {
                    super.saveError(model, "clc.proceso.clcTercerosCancelados.error");
                    
                    // Elimina cancelados
                    logger.debug("--------------------------------------> Elimina  "  + cancelados.size() + " cheques cancelados.");
                    super.getService(ClcTercerosService.class).deleteAplicaCancelados(cancelados, super.security().getUserName());
                    
                    // Init params
                    clcTercerosCanceladosDTO = getInitParamsTercerosCancelados(clcTercerosCanceladosDTO);
                    
                    clcTercerosCanceladosDTO.setMuestraErrores(true);
                }
            }
        }
        model.addAttribute(clcTercerosCanceladosDTO);
        return super.getViewName("clcTercerosCancelados");
    }
    
    /**
     * Procesa Terceros - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteErrorTercerosCancelados(Model model, ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcTercerosService.class).marcaRevisadoExisteErrorCancelados(clcTercerosCanceladosDTO);
            
            super.saveMessage(model, "clc.proceso.clcTerceros.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcTerceros.revisado.error");
        }
        
        // Init params
        clcTercerosCanceladosDTO = getInitParamsTercerosCancelados(clcTercerosCanceladosDTO);
        
        model.addAttribute(clcTercerosCanceladosDTO);
        return super.getViewName("clcTercerosCancelados");
    }
    
    /**
     * Procesa Terceros
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return String
     */
    @RequestMapping
    public String clcTercerosAjustes(Model model, ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        if (clcTercerosAjustesDTO.isCancel()) {
            clcTercerosAjustesDTO = new ClcTercerosAjustesDTO();
        }
        
        if (clcTercerosAjustesDTO.isBusquedaClc()) {
            if (clcTercerosAjustesDTO.getNominaOrigen() == null || clcTercerosAjustesDTO.getNominaOrigen().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.error.nominaOrigen");
                clcTercerosAjustesDTO.setBusquedaClc(false);
            } else if (clcTercerosAjustesDTO.getCiclo() == null || clcTercerosAjustesDTO.getCiclo() == 0) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.error.ciclo");
                clcTercerosAjustesDTO.setBusquedaClc(false);
            } else if (clcTercerosAjustesDTO.getQuincena() == null || clcTercerosAjustesDTO.getQuincena() == 0) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.error.quincena");
                clcTercerosAjustesDTO.setBusquedaClc(false);
            }  else if (clcTercerosAjustesDTO.getTipoNominaTerceros() == null || clcTercerosAjustesDTO.getTipoNominaTerceros().equals("")) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.error.tipoNominaTerceros");
                clcTercerosAjustesDTO.setBusquedaClc(false);
            } else if (clcTercerosAjustesDTO.getComplemento() == null) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.error.complemento");
                clcTercerosAjustesDTO.setBusquedaClc(false);
            } else {
                // Init params
                clcTercerosAjustesDTO = getInitParamsTercerosAjustes(clcTercerosAjustesDTO);
            }
        }
        
        model.addAttribute(clcTercerosAjustesDTO);
        return super.getViewName("clcTercerosAjustes");
    }
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para ajustar terceros con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return String
     */
    @RequestMapping
    public String executeProcedureAplicaCxlcAjustes(Model model, ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        
        if (clcTercerosAjustesDTO.getAjusteGrupo() == null || clcTercerosAjustesDTO.getAjusteGrupo().length == 0) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.grupos");
        } else if (clcTercerosAjustesDTO.getNominaOrigen() == null || clcTercerosAjustesDTO.getNominaOrigen().equals("")) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.nominaOrigen");
        } else if (clcTercerosAjustesDTO.getCiclo() == null || clcTercerosAjustesDTO.getCiclo() == 0) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.ciclo");
        } else if (clcTercerosAjustesDTO.getQuincena() == null || clcTercerosAjustesDTO.getQuincena() == 0) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.quincena");
        } else if (clcTercerosAjustesDTO.getTipoNominaTerceros() == null || clcTercerosAjustesDTO.getTipoNominaTerceros().equals("")) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.tipoNominaTerceros");
        } else if (clcTercerosAjustesDTO.getComplemento() == null) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.complemento");
        } else if (clcTercerosAjustesDTO.getSigno() == null || clcTercerosAjustesDTO.getSigno().equals("")) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.signo");
        } else if (clcTercerosAjustesDTO.getImporteAjuste() == 0) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.importeAjuste");
        } else if (clcTercerosAjustesDTO.getImporteAjuste() > 25) {
            super.saveError(model, "clc.proceso.clcTercerosAjustes.error.importeAjusteMayor");
        } else {
        
            // Verificar si existen errores
            Integer existeError = super.getService(ClcTercerosService.class).executeProcedureExisteErrorAjustes(clcTercerosAjustesDTO);
            logger.debug("executeProcedureAplicaCxlcAjustes -> existeError -----------------> " + existeError);
            
            // Existen errores
            if (existeError == 1) {
                super.saveError(model, "clc.proceso.clcTercerosAjustes.existe.error");
                clcTercerosAjustesDTO.setMuestraErrores(true);
            } else {
                
                // Obtener datos de la CLC de ajuste
                String[] datosAjuste = clcTercerosAjustesDTO.getAjusteGrupo();
                clcTercerosAjustesDTO.setClcAjuste(new Integer(datosAjuste[0]));
                
                // Obtener datos de la CLC compensada
                //String[] datosCompensada = clcTercerosAjustesDTO.getCompensadaGrupo();
                //clcTercerosAjustesDTO.setClcCompensada(new Integer(datosCompensada[0]));
                clcTercerosAjustesDTO.setClcCompensada(new Integer(0));
                 
                // Funcion CLC_TERCEROS_AJUSTES
                Integer executeError = super.getService(ClcTercerosService.class).executeProcedureTercerosAjustes(clcTercerosAjustesDTO, super.security().getUserName());
                
                if (executeError == 0) {
                    super.saveMessage(model, "clc.proceso.clcTercerosAjustes.ok");
                    clcTercerosAjustesDTO = new ClcTercerosAjustesDTO();
                } else if (executeError == 2) {
                    super.saveError(model, "clc.proceso.clcTercerosAjustes.error2");
                    
                    // Init params
                    clcTercerosAjustesDTO = getInitParamsTercerosAjustes(clcTercerosAjustesDTO);
                    
                    clcTercerosAjustesDTO.setMuestraErrores(true);
                }  else if (executeError == 3) {
                    super.saveError(model, "clc.proceso.clcTercerosAjustes.error3");
                    
                    // Init params
                    clcTercerosAjustesDTO = getInitParamsTercerosAjustes(clcTercerosAjustesDTO);
                    
                    clcTercerosAjustesDTO.setMuestraErrores(true);
                } else {
                    super.saveError(model, "clc.proceso.clcTercerosAjustes.error");
                    
                    // Init params
                    clcTercerosAjustesDTO = getInitParamsTercerosAjustes(clcTercerosAjustesDTO);
                    
                    clcTercerosAjustesDTO.setMuestraErrores(true);
                }
            }
        }
        model.addAttribute(clcTercerosAjustesDTO);
        return super.getViewName("clcTercerosAjustes");
    }
    
    /**
     * Procesa Terceros - Metodo encargado de marcar como revisado si existen errores en las clc con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return String
     */
    @RequestMapping
    public String marcaRevisadoExisteErrorTercerosAjustes(Model model, ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        try {
            // Funcion EXISTE_ERROR
            super.getService(ClcTercerosService.class).marcaRevisadoExisteErrorAjustes(clcTercerosAjustesDTO);
            
            super.saveMessage(model, "clc.proceso.clcTercerosAjustes.revisado.ok");
        } catch (Exception e) {
            e.printStackTrace();
            super.saveError(model, "clc.proceso.clcTercerosAjustes.revisado.error");
        }
        
        // Init params
        clcTercerosAjustesDTO = getInitParamsTercerosAjustes(clcTercerosAjustesDTO);
        
        model.addAttribute(clcTercerosAjustesDTO);
        return super.getViewName("clcTercerosAjustes");
    }
    
    
    
    /********************************************************* UTILS ******************************************************/
    /**
     * Metodo encargado de obtener los beanName necesarios en el proceso de busqueda de terceros con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @return clcTercerosDTO ClcTercerosDTO
     */
    private ClcTercerosDTO getBeanNameTerceros(ClcTercerosDTO clcTercerosDTO) {
        // BeanName
        if (clcTercerosDTO.getTipoNominaTerceros() != null) {
            if (clcTercerosDTO.getTipoNominaTerceros().equals("FO")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_FONAC");
            } else if (clcTercerosDTO.getTipoNominaTerceros().equals("SD")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_SINDICATO");
            } else if (clcTercerosDTO.getTipoNominaTerceros().equals("AH")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_CAJA_DE_AHORRO_SINDICAL");
            } else if (clcTercerosDTO.getTipoNominaTerceros().equals("FS")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_FSTSE");
            } else if (clcTercerosDTO.getTipoNominaTerceros().equals("PA")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_PENSION_ALIMENTICIA");
            } else if (clcTercerosDTO.getTipoNominaTerceros().equals("RI")) {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_IMPUESTOS");
            }  else {
                clcTercerosDTO.setBeanName("busquedaClcProcesaTerceros_OTROS");
                
                // Tipo momina
                String guiasContables = super.getService(ClcTercerosService.class).guiaContableByTipoNominaTerceros(clcTercerosDTO.getTipoNominaTerceros()).replaceAll("\\|", ",");
                logger.debug("clcTercerosDTO -> guiasContables --------> " + guiasContables);
                
                // Guias contables validas
                List<String> guiasContablesList = new ArrayList<String>();
                String[] temp = guiasContables.split(",");
                
                for(int i = 0; i < temp.length; i++) {
                    guiasContablesList.add(temp[i]);
                }
                clcTercerosDTO.setGuiasContablesList(guiasContablesList);
            }
            logger.debug("clcTercerosDTO -> beanName -----------------> " + clcTercerosDTO.getBeanName());
        }
        return clcTercerosDTO;
    }
    
    /**
     * Metodo encargado de inicializar parametros en el proceso de terceros con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param clcTercerosDTO ClcTercerosDTO
     * @return clcTercerosDTO ClcTercerosDTO
     */
    private ClcTercerosDTO getInitParamsTerceros(ClcTercerosDTO clcTercerosDTO) {
        
        if (clcTercerosDTO.getTipoClc() != null) {
            // Combo tipo nomina
            if (clcTercerosDTO.getTipoClc().equals("MENSUAL")) {
                clcTercerosDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaTerceros_MENSUAL");
                
                // Obtener mes y año
                 String mes = "";
                if (clcTercerosDTO.getMes().equals("10") || clcTercerosDTO.getMes().equals("11") || clcTercerosDTO.getMes().equals("12")) {
                    mes = clcTercerosDTO.getMes();
                } else {
                    mes = String.valueOf("0").concat(clcTercerosDTO.getMes());
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
                logger.debug("getInitParamsTerceros -> quincenas -----------------> " + quincenaInicial + " - " + quincenaFinal);
                
                // Lista de quincenas
                List<Integer> quincenasList =  new ArrayList<Integer>();
                quincenasList.add(quincenaInicial);
                quincenasList.add(quincenaFinal);
                clcTercerosDTO.setQuincenasList(quincenasList);
            } else {
                clcTercerosDTO.setBeanNameTipoNomina("tdCxlcTipoNominaProcesaTerceros_QUINCENAL");
                
                logger.debug("getInitParamsTerceros -> quincenas -----------------> " + clcTercerosDTO.getQuincena());
                
                // Lista de quincenas               
                clcTercerosDTO.setQuincenasList(splitAsIntegerList(clcTercerosDTO.getQuincena(), ","));
            }
        }
        
        // Criterios de busqueda
        clcTercerosDTO.setVerificaTipoClc(true);
        
        // Obtener meses validos
        ArrayList<EtiquetaClaveValorEntero> mesesValores = getMesValores();
        // Combo meses
        clcTercerosDTO.setMesesValores(mesesValores);
        
        // Muestra pagedList
        clcTercerosDTO.setMuestraRegistros(true);
        
        // BeanName
        clcTercerosDTO = getBeanNameTerceros(clcTercerosDTO);
        
        // Busqueda clc
        clcTercerosDTO.setBusquedaClc(true);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
        
        // Combo quincena de pago
        clcTercerosDTO.setCicloCombo(super.security().getOperationYear());
        clcTercerosDTO.setCicloValoresQnaPago(cicloValores);
        
        // Checkbox reprocesa
        clcTercerosDTO.setCheckBoxReprocesa("");
        
        return clcTercerosDTO;
    }
    
    /**
     * Metodo encargado de obtener los beanName necesarios en el proceso de cancelacion de terceros con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     */
    private ClcTercerosCanceladosDTO getBeanNameTercerosCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
        // BeanName
        if (clcTercerosCanceladosDTO.getTipoNominaTerceros() != null) {
            if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("FO")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_FONAC");
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("SD")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_SINDICATO");
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("AH")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_CAJA_DE_AHORRO_SINDICAL");
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("FS")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_FSTSE");
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("PA")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_OTROS");
            } else if (clcTercerosCanceladosDTO.getTipoNominaTerceros().equals("IR")) {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_IMPUESTOS");
            }  else {
                clcTercerosCanceladosDTO.setBeanNameCancelados("canceladosProcesaTerceros_OTROS");
                
                // Tipo momina
                String guiasContables = super.getService(ClcTercerosService.class).guiaContableByTipoNominaTerceros(clcTercerosCanceladosDTO.getTipoNominaTerceros()).replaceAll("\\|", ",");
                logger.debug("clcTercerosCanceladosDTO -> guiasContables --------> " + guiasContables);
                
                // Guias contables validas
                List<String> guiasContablesList = new ArrayList<String>();
                String[] temp = guiasContables.split(",");
                
                for(int i = 0; i < temp.length; i++) {
                    guiasContablesList.add(temp[i]);
                }
                clcTercerosCanceladosDTO.setGuiasContablesList(guiasContablesList);
            }
            logger.debug("clcTercerosCanceladosDTO -> beanNameCancelados -----------------> " + clcTercerosCanceladosDTO.getBeanNameCancelados());
        }
        return clcTercerosCanceladosDTO;
    }
    
    /**
     * Metodo encargado de obtener los beanName necesarios en el proceso de busqueda de terceros con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return clcTercerosAjustesDTO ClcTercerosAjustesDTO
     */
    private ClcTercerosAjustesDTO getBeanNameTercerosAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
        // BeanName
        if (clcTercerosAjustesDTO.getTipoNominaTerceros() != null) {
            if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("FO")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_FONAC");
            } else if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("SD")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_SINDICATO");
            } else if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("AH")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_CAJA_DE_AHORRO_SINDICAL");
            } else if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("FS")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_FSTSE");
            } else if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("PA")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_PENSION_ALIMENTICIA");
            } else if (clcTercerosAjustesDTO.getTipoNominaTerceros().equals("RI")) {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_IMPUESTOS");
            }  else {
                clcTercerosAjustesDTO.setBeanName("busquedaClcProcesaTercerosAjustes_OTROS");
                
                // Tipo momina
                String guiasContables = super.getService(ClcTercerosService.class).guiaContableByTipoNominaTerceros(clcTercerosAjustesDTO.getTipoNominaTerceros()).replaceAll("\\|", ",");
                logger.debug("clcTercerosAjustesDTO -> guiasContables --------> " + guiasContables);
                
                // Guias contables validas
                List<String> guiasContablesList = new ArrayList<String>();
                String[] temp = guiasContables.split(",");
                
                for(int i = 0; i < temp.length; i++) {
                    guiasContablesList.add(temp[i]);
                }
                clcTercerosAjustesDTO.setGuiasContablesList(guiasContablesList);
            }
            logger.debug("clcTercerosAjustesDTO -> beanName -----------------> " + clcTercerosAjustesDTO.getBeanName());
        }
        return clcTercerosAjustesDTO;
    }
    
    /**
     * Metodo encargado de inicializar parametros en el proceso de cancelacion de terceros con base en el objeto clcTercerosAjustesDTO.
     * @author Oscar S.
     * @param clcTercerosAjustesDTO ClcTercerosAjustesDTO
     * @return clcTercerosAjustesDTO ClcTercerosAjustesDTO
     */
    private ClcTercerosAjustesDTO getInitParamsTercerosAjustes(ClcTercerosAjustesDTO clcTercerosAjustesDTO) {
                
        logger.debug("getInitParamsTercerosAjustes -> quincenas -----------------> " + clcTercerosAjustesDTO.getQuincena());
        
        // Lista de quincenas
        List<Integer> listAux = new ArrayList<Integer>();
        listAux.add(clcTercerosAjustesDTO.getQuincena());
        clcTercerosAjustesDTO.setQuincenasList(listAux);
         
        // Muestra pagedList
        clcTercerosAjustesDTO.setBusquedaClc(true);
        
        // BeanName
        //clcTercerosAjustesDTO = getBeanNameTercerosAjustes(clcTercerosAjustesDTO);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
         
        // Combo quincena de cancelacion
        clcTercerosAjustesDTO.setCicloValoresQnaPago(cicloValores);
        
        return clcTercerosAjustesDTO;
    }
    
    /**
     * Metodo encargado de inicializar parametros en el proceso de ajuste de terceros con base en el objeto clcTercerosCanceladosDTO.
     * @author Oscar S.
     * @param clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     * @return clcTercerosCanceladosDTO ClcTercerosCanceladosDTO
     */
    private ClcTercerosCanceladosDTO getInitParamsTercerosCancelados(ClcTercerosCanceladosDTO clcTercerosCanceladosDTO) {
    
        logger.debug("getInitParamsTercerosCancelados -> quincenas -----------------> " + clcTercerosCanceladosDTO.getQuincena());
        
        // Lista de quincenas               
        List<Integer> listAux = new ArrayList<Integer>();
        listAux.add(clcTercerosCanceladosDTO.getQnaCancelacion());
        clcTercerosCanceladosDTO.setQuincenasList(listAux);
         
        // Muestra pagedList
        clcTercerosCanceladosDTO.setBusquedaClc(true);
        
        // BeanName
        clcTercerosCanceladosDTO = getBeanNameTercerosCancelados(clcTercerosCanceladosDTO);
        
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = getCicloValoresQuincenas();
        
        return clcTercerosCanceladosDTO;
    }
    
    private List<String> splitAsList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);
        return Arrays.asList(arreglo);
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

    /**
     * Lista de ciclos vigentes.
     * @author Oscar S.
     * @return ArrayList<EtiquetaClaveValorEntero>
     */
    private ArrayList<EtiquetaClaveValorEntero> getCicloValores() {
        // Obtener ciclos validos
        ArrayList<EtiquetaClaveValorEntero> cicloValores = new ArrayList<EtiquetaClaveValorEntero>();
        
        Integer cicloActual = new Integer(super.security().getOperationYear());
        Integer cicloAnterior = Integer.valueOf(cicloActual - new Integer(1));
        Integer cicloPosterior = Integer.valueOf(cicloActual + new Integer(1));
        
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(cicloPosterior), String.valueOf(cicloPosterior)));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(cicloActual), String.valueOf(cicloActual)));
        cicloValores.add(new EtiquetaClaveValorEntero(new Integer(cicloAnterior), String.valueOf(cicloAnterior)));
        return cicloValores;
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
    
    /********************************************************* MANUALES ******************************************************/
    
    /**
     * Procesa Manual - Metodo encargado de procesar clc manuales con base en el objeto clcManualesCapturaDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesCapturaDTO ClcManualesCapturaDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesCaptura(Model model, ClcManualesCapturaDTO clcManualesCapturaDTO) {
        if (clcManualesCapturaDTO.isCancel()) {
            clcManualesCapturaDTO = new ClcManualesCapturaDTO();
        }
        
        clcManualesCapturaDTO.setCiclo(new Integer(super.security().getOperationYear()));
        
        // Obtiene el maximo para las cabeceras en el rango de las 5000
        Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(new Integer(super.security().getOperationYear()));
        clcManualesCapturaDTO.setCxlc(maxCxlc);
        clcManualesCapturaDTO.setNumCxlc(maxCxlc);
        logger.debug("clcManualesCaptura -> maxCxlc ---------------------> " + maxCxlc);
        
        // Obtiene el maximo para las secuencias
        clcManualesCapturaDTO.setSecuencia(new Integer(1));
        
        model.addAttribute(clcManualesCapturaDTO);
        return super.getViewName("clcManualesCaptura");
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener la quincena de captura con base en el ciclo seleccionado.
     * @author Oscar S.
     * @param ciclo Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getQnaCapturaCallback(@RequestParam("ciclo") Integer ciclo, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        sb.append("<option value=''>SELECCIONE...</option>");
        for (int i = 24; i > 0; i--) {
            if (i < 10) {
                sb.append("<option value='" + ciclo + "0" + i + "'>" + ciclo + "0" + i + "</option>");
            } else {
                sb.append("<option value='" + ciclo + i + "'>" + ciclo + i + "</option>");
            }
        }
        
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener las unidades con base en el tipo de nomina seleccionada.
     * @author Oscar S.
     * @param idTipoNomina String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getUnidadCallback(@RequestParam("idTipoNomina") String idTipoNomina, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            String clavePresupuestal = super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(idTipoNomina);
            logger.debug("clavePresupuestal -> " + clavePresupuestal);
            
            String stringElemento = getElemClavepresupuestal(clavePresupuestal, "unidad");
            
            List<String> unidades = splitAsList(stringElemento, ",");
            
            sb.append("<option value=''>SELECCIONE...</option>");
            for (String unidad : unidades) {            
                sb.append("<option value='" + unidad + "'>" + unidad + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }
        
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener las partidas con base en el tipo de nomina seleccionada.
     * @author Oscar S.
     * @param idTipoNomina String
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getPartidaCallback(@RequestParam("idTipoNomina") String idTipoNomina, HttpServletResponse response) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        try {
            String clavePresupuestal = super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(idTipoNomina);
            logger.debug("clavePresupuestal -> " + clavePresupuestal);
            
            String stringElemento = getElemClavepresupuestal(clavePresupuestal, "partida");
            
            List<String> partidas = splitAsList(stringElemento, ",");
            
            sb.append("<option value=''>SELECCIONE...</option>");
            for (String partida : partidas) {            
                sb.append("<option value='" + partida + "'>" + partida + "</option>");
            }
        } catch (Exception e) {
            sb.append("<option value=''>SELECCIONE...</option>");
        }
        
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(sb.toString());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener un elemento en particular la clave presupuestal.
     * @author Oscar S.
     * @param clavePresupuestal String
     * @param elemento String
     * @return stringElemento String
     */
    private String getElemClavepresupuestal(String clavePresupuestal, String elemento) {
        String[] clave = clavePresupuestal.split("\\|");
        String stringElemento = null;
        
        if (elemento.equals("ciclo")) {
            // Ciclo
            stringElemento = clave[0];
        } else if (elemento.equals("unidad")) {
            // Unidad responsable
            stringElemento = clave[1];
        } else if (elemento.equals("ejecutora")) {
            // Unidad ejecutora
            stringElemento = clave[2];
        } else if (elemento.equals("estado")) {
            // Estado
            stringElemento = clave[3];
        } else if (elemento.equals("funcion")) {
            // Funcion
            stringElemento = clave[4];
        } else if (elemento.equals("programa")) {
            // Programa
            stringElemento = clave[5];
        } else if (elemento.equals("actInst")) {
            // Actividad institucional
            stringElemento = clave[6];
        } else if (elemento.equals("actInstPri")) {
            // Actividad institucional prioritaria
            stringElemento = clave[7];
        } else if (elemento.equals("actInstEsp")) {
            // Actividad institucional especifica
            stringElemento = clave[8];
        } else if (elemento.equals("partida")) {
            // Partida
            stringElemento = clave[9];
        } else if (elemento.equals("tipoGasto")) {
            // Tipo de gasto
            stringElemento = clave[10];
        } else if (elemento.equals("fuente")) {
            // Fuente de financiamiento
            stringElemento = clave[11];
        }
        return stringElemento;
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener la cabecera de cxlc con base en el ciclo seleccionado.
     * @author Oscar S.
     * @param ciclo Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getNumCxlcCallback(@RequestParam("ciclo") Integer ciclo, HttpServletResponse response) throws IOException {
        // Obtiene el maximo para las cabeceras en el rango de las 5000
        Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(ciclo);
        logger.debug("getNumCxlcCallback -> maxCxlc ---------------------> " + maxCxlc);
        
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(maxCxlc.toString());
    }
    
    /**
     * Procesa Manual - Metodo encargado de obtener la secuencia de cxlc con base en el ciclo seleccionado.
     * @author Oscar S.
     * @param ciclo Integer
     * @param response HttpServletResponse
     */
    @RequestMapping
    public void getSecCxlcCallback(@RequestParam("ciclo") Integer ciclo, HttpServletResponse response) throws IOException {
        // Obtiene el maximo para las secuencias
        Integer maxSecCxlc = super.getService(ClcManualesService.class).getMaxSecCxlcManuales(ciclo);
        
        response.setHeader("Cache-Control","no-cache"); 
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma","no-cache");
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print(maxSecCxlc.toString());
    }
    
    /**
     * Procesa Manual - Metodo encargado de generar la cxlc previa con base en el objeto clcManualesCapturaDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesCapturaDTO clcManualesDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesCxlcPrevia(Model model, ClcManualesCapturaDTO clcManualesCapturaDTO) {
        if (clcManualesCapturaDTO.getCiclo() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.ciclo");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else if (clcManualesCapturaDTO.getTipoNomina() == null || clcManualesCapturaDTO.getTipoNomina().equals("")) {
            super.saveError(model, "clc.proceso.clcManuales.error.tipoNomina");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else if (clcManualesCapturaDTO.getImporte() == 0) {
            super.saveError(model, "clc.proceso.clcManuales.error.importe");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else if (clcManualesCapturaDTO.getQnaCaptura() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.qnaCaptura");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else if (clcManualesCapturaDTO.getUnidad() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.unidad");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else if (clcManualesCapturaDTO.getPartida() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.partida");
            clcManualesCapturaDTO.setMuestraRegistros(false);
        } else {
            clcManualesCapturaDTO.setMuestraRegistros(true);
            
            // Obtiene el maximo para las cabeceras en el rango de las 5000
            Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(clcManualesCapturaDTO.getCiclo());
            clcManualesCapturaDTO.setCxlc(maxCxlc);
            clcManualesCapturaDTO.setNumCxlc(maxCxlc);
            logger.debug("clcManualesCxlcPrevia -> maxCxlc ---------------------> " + maxCxlc);
            
            // Obtener clave presupuestal
            String clavePresupuestal = super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(clcManualesCapturaDTO.getTipoNomina());
            logger.debug("clavePresupuestal --------> " + clavePresupuestal);
            
            // Obtener posicion de la unidad
            Integer unidadSeleccionada = clcManualesCapturaDTO.getUnidad();
            String stringUnidad = getElemClavepresupuestal(clavePresupuestal, "unidad");
            
            int posicion = getPosicion(stringUnidad, String.valueOf(unidadSeleccionada));
            logger.debug("posicion de la unidad -------> " + posicion);
            
            // Genera cxlc previa
            CxlcManual cxlcManual = new CxlcManual();
            cxlcManual.setCxlcCiclo(clcManualesCapturaDTO.getCiclo());
            cxlcManual.setCxlcNumero(clcManualesCapturaDTO.getNumCxlc());
            cxlcManual.setCxlcSecuencia(clcManualesCapturaDTO.getSecuencia());
            
            cxlcManual.setCxlcUnidadResponsable(String.valueOf(clcManualesCapturaDTO.getUnidad()));
            cxlcManual.setCxlcUnidadEjecutora(getElemClavepresupuestal(clavePresupuestal, "ejecutora") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "ejecutora"), posicion) : "");
            
            cxlcManual.setCxlcEstado(getElemClavepresupuestal(clavePresupuestal, "estado") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "estado"), posicion) : "");
            cxlcManual.setCxlcFuncion(getElemClavepresupuestal(clavePresupuestal, "funcion") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "funcion"), posicion) : "");
            cxlcManual.setCxlcPrograma(getElemClavepresupuestal(clavePresupuestal, "programa") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "programa"), posicion) : "");
            
            cxlcManual.setCxlcActInst(getElemClavepresupuestal(clavePresupuestal, "actInst") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInst"), posicion) : "");
            cxlcManual.setCxlcActInstPri(getElemClavepresupuestal(clavePresupuestal, "actInstPri") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInstPri"), posicion) : "");
            cxlcManual.setCxlcActInstEsp(getElemClavepresupuestal(clavePresupuestal, "actInstEsp") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInstEsp"), posicion) : "");
            
            cxlcManual.setCxlcPartida(String.valueOf(clcManualesCapturaDTO.getPartida()));
            cxlcManual.setCxlcTipoGasto(getElemClavepresupuestal(clavePresupuestal, "tipoGasto") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "tipoGasto"), posicion) : "");
            cxlcManual.setCxlcFuente(getElemClavepresupuestal(clavePresupuestal, "fuente") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "fuente"), posicion) : "");
            
            cxlcManual.setCxlcMonto(clcManualesCapturaDTO.getImporte() > 0 ? clcManualesCapturaDTO.getImporte() : 0);
            cxlcManual.setCxlcNota(clcManualesCapturaDTO.getNota() != null ? clcManualesCapturaDTO.getNota() : "");
            cxlcManual.setCxlcIva(clcManualesCapturaDTO.getIva() > 0 ? clcManualesCapturaDTO.getIva() : 0);
            
            cxlcManual.setCxlcUsuario(super.security().getUserName());
            cxlcManual.setCxlcFechaModificacion(new Date());
            
            // Lista de cxlc
            List<CxlcManual> clcToInsert = new ArrayList<CxlcManual>();
            clcToInsert.add(cxlcManual);
            
            // Set de lista cxlc
            clcManualesCapturaDTO.setClcToInsert(clcToInsert);
        }
        model.addAttribute(clcManualesCapturaDTO);
        return super.getViewName("clcManualesCaptura");
    }
    
    private int getPosicion(String stringUnidad, String unidadSeleccionada) {
        List<String> unidades = splitAsList(stringUnidad, ",");
        int posicion = 0;
        int contador = 0;
        for (String unidad : unidades) {
            if (unidadSeleccionada.equals(unidad)) {
                posicion = contador;
                break;
            }
            contador++;
        }
        return posicion;
    }
    
    private String getElementPosicion(String stringElemento, int posicion) {
        List<String> elemento = splitAsList(stringElemento, ",");
        return elemento.size() < 2 ? stringElemento : String.valueOf(elemento.get(posicion));
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar la cxlc con base en el objeto clcManualesCapturaDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesCapturaDTO clcManualesDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesCxlcGuardar(Model model, ClcManualesCapturaDTO clcManualesCapturaDTO) {
        try {
            // Obtener clave presupuestal
            String clavePresupuestal = super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(clcManualesCapturaDTO.getTipoNomina());
            
            super.getService(ClcManualesService.class).createClcManuales(clcManualesCapturaDTO, clavePresupuestal, super.security().getUserName());
            
            super.saveMessage(model, "clc.proceso.clcManuales.ok");
            clcManualesCapturaDTO = new ClcManualesCapturaDTO();
            
            clcManualesCapturaDTO.setCiclo(new Integer(super.security().getOperationYear()));
            
            // Obtiene el maximo para las cabeceras en el rango de las 5000
            Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(new Integer(super.security().getOperationYear()));
            clcManualesCapturaDTO.setCxlc(maxCxlc);
            clcManualesCapturaDTO.setNumCxlc(maxCxlc);
            
            // Obtiene el maximo para las secuencias
            //Integer maxSecCxlc = super.getService(ClcManualesService.class).getMaxSecCxlcManuales(new Integer(super.security().getOperationYear()));
            //clcManualesCapturaDTO.setSecuencia(maxSecCxlc);
            clcManualesCapturaDTO.setSecuencia(new Integer(1));
        } catch (Exception ex) {
            throw new ServiceException("Error al realizar el proceso de captura manual de terceros.");
        }
        model.addAttribute(clcManualesCapturaDTO);
        return super.getViewName("clcManualesCaptura");
    }
    
    
    
    /**
     * Procesa Manual - Metodo encargado de procesar clc manuales por archivo con base en el objeto clcManualesArchivoDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesArchivoDTO clcManualesArchivoDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesArchivo(Model model, ClcManualesArchivoDTO clcManualesArchivoDTO) {
        if (clcManualesArchivoDTO.isCancel()) {
            clcManualesArchivoDTO = new ClcManualesArchivoDTO();
        }
        
        clcManualesArchivoDTO.setCiclo(new Integer(super.security().getOperationYear()));
        
        // Obtiene el maximo para las cabeceras en el rango de las 5000
        Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(new Integer(super.security().getOperationYear()));
        clcManualesArchivoDTO.setCxlc(maxCxlc);
        clcManualesArchivoDTO.setNumCxlc(maxCxlc);
        
        // Obtiene el maximo para las secuencias
        clcManualesArchivoDTO.setSecuencia(new Integer(0));
        
        clcManualesArchivoDTO.setInicio(true);
        
        model.addAttribute(clcManualesArchivoDTO);
        return super.getViewName("clcManualesArchivo");
    }
    
    /**
     * Procesa Manual - Metodo encargado de paginar el listado de secuencias.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesArchivoDTO clcManualesArchivoDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesPaginadorArchivo(Model model, ClcManualesArchivoDTO clcManualesArchivoDTO) {
        // Procesar archivo
        clcManualesArchivoDTO.setInicio(false);
        
        model.addAttribute(clcManualesArchivoDTO);
        return super.getViewName("clcManualesArchivo");
    }
    
    /**
     * Procesa Manual - Metodo encargado de cargar y validar el archivo de cxlc manual con base en el objeto clcManualesArchivoDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesArchivoDTO clcManualesArchivoDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesCargarArchivo(Model model, ClcManualesArchivoDTO clcManualesArchivoDTO) {
        if (clcManualesArchivoDTO.getCiclo() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.ciclo");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else if (clcManualesArchivoDTO.getComplemento() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.complemento");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else if (clcManualesArchivoDTO.getTipoNomina() == null || clcManualesArchivoDTO.getTipoNomina().equals("")) {
            super.saveError(model, "clc.proceso.clcManuales.error.tipoNomina");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else if ((clcManualesArchivoDTO.getTipoNomina().equals("NS") || clcManualesArchivoDTO.getTipoNomina().equals("SC") || 
                    clcManualesArchivoDTO.getTipoNomina().equals("GM") || clcManualesArchivoDTO.getTipoNomina().equals("MD")) && 
                   (clcManualesArchivoDTO.getPlurianual() == null || clcManualesArchivoDTO.getPlurianual().equals(""))) {
            super.saveError(model, "clc.proceso.clcManuales.error.plurianual");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else if (clcManualesArchivoDTO.getQnaAplicacion() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.qnaCaptura");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else if (clcManualesArchivoDTO.getPartidaCaptura() == null) {
            super.saveError(model, "clc.proceso.clcManuales.error.partida");
            clcManualesArchivoDTO.setMuestraRegistros(false);
        } else {
            clcManualesArchivoDTO.setMuestraRegistros(true);
            
            // Procesar archivo
            clcManualesArchivoDTO.setInicio(false);
            
            try {
                String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
                clcManualesArchivoDTO.setNombreArchivoErrores(nameFileXls);
                clcManualesArchivoDTO = super.getService(ClcManualesService.class).processFileClcManual(clcManualesArchivoDTO);
                
                if (clcManualesArchivoDTO.getPlantillaErronea()) {
                    clcManualesArchivoDTO.setMuestraErrores(true);
                    clcManualesArchivoDTO.setMuestraRegistros(false);
                    
                    clcManualesArchivoDTO.setMensaje(super.configuration().getString("clcManualArchivo", "carga.manualArchivo.mensaje.plantilla.erronea"));
                } else {
                    if (clcManualesArchivoDTO.getArchivoValido()) {
                        clcManualesArchivoDTO.setMuestraErrores(false);
                        clcManualesArchivoDTO.setMuestraRegistros(true);
                        
                        clcManualesArchivoDTO.setMensaje(super.configuration().getString("clcManualArchivo", "carga.manualArchivo.mensaje.archivo.valido"));
                    } else {
                        clcManualesArchivoDTO.setMuestraErrores(true);
                        clcManualesArchivoDTO.setMuestraRegistros(false);
                        
                        clcManualesArchivoDTO.setMensaje(super.configuration().getString("clcManualArchivo", "carga.manualArchivo.mensaje.archivo.invalido"));
                    }
                }
            } catch (ServiceException e) { 
                clcManualesArchivoDTO.setMensaje(super.configuration().getString("clcManualArchivo", "jxls.service.manualArchivo"));
                clcManualesArchivoDTO.setArchivoValido(false);   
                clcManualesArchivoDTO.setNombreArchivoErrores("");
            }
            
            // Calculo del monto
            List<ClcManualesArchivoDTO> list = clcManualesArchivoDTO.getListaClcManualCorrecta();
            Double monto = 0.0;
            for (ClcManualesArchivoDTO element : list) {
                monto += Double.valueOf(element.getMontoArchivo());
            }
            DecimalFormat df = new DecimalFormat(formatoDecimal);
            clcManualesArchivoDTO.setMontoTotal(df.format(monto));
        }
        model.addAttribute(clcManualesArchivoDTO);
        return super.getViewName("clcManualesArchivo");
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar el archivo de cxlc manual con base en el objeto clcManualesArchivoDTO.
     * @author Oscar S.
     * @param model Model
     * @param clcManualesArchivoDTO clcManualesArchivoDTO
     * @return String
     */
    @RequestMapping
    public String clcManualesGuardarArchivo(Model model, ClcManualesArchivoDTO clcManualesArchivoDTO) {
        try {
            // Obtener clave presupuestal
            //String clavePresupuestal = super.getService(ClcManualesService.class).getClavePresupuestalByTipoNomina(clcManualesArchivoDTO.getTipoNomina());
            
            // Guardar cabeceras y secuencias
            super.getService(ClcManualesService.class).createClcManualesArchivo(clcManualesArchivoDTO, super.security().getUserName());
            super.saveMessage(model, "clc.proceso.clcManualesArchivo.ok");
            
            clcManualesArchivoDTO = new ClcManualesArchivoDTO();
            clcManualesArchivoDTO.setCiclo(new Integer(super.security().getOperationYear()));
            
            // Obtiene el maximo para las cabeceras en el rango de las 5000
            Integer maxCxlc = super.getService(ClcManualesService.class).getMaxCxlcManuales(new Integer(super.security().getOperationYear()));
            clcManualesArchivoDTO.setCxlc(maxCxlc);
            clcManualesArchivoDTO.setNumCxlc(maxCxlc);
            
            // Obtiene el maximo para las secuencias
            clcManualesArchivoDTO.setSecuencia(0);
        } catch (Exception ex) {
            throw new ServiceException("Error al realizar el proceso de captura manual por archivo.");
        }
        model.addAttribute(clcManualesArchivoDTO);
        return super.getViewName("clcManualesArchivo");
    }
}
