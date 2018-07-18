package gob.shcp.sireh.service.merito;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdNmHistoricoDAO;
import gob.shcp.sireh.data.jdbc.QueryTdNmPlantillaDAO;
import gob.shcp.sireh.data.jdbc.QueryTdNmResumenDAO;
import gob.shcp.sireh.data.jdbc.TdNmHistoricoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdHistoricoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdNmPlantillaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdResumenDAO;

import gob.shcp.sireh.domain.jdbc.CustomTdEmpleadoMerito;
import gob.shcp.sireh.domain.jdbc.CustomTdNmHistorico;
import gob.shcp.sireh.domain.jdbc.CustomTdNmResumen;
import gob.shcp.sireh.domain.jdbc.CustomTnNmPlantilla;
import gob.shcp.sireh.domain.jdbc.TdNmHistorico;
import gob.shcp.sireh.domain.jdbc.TdNmHistoricoPK;

import gob.shcp.sireh.model.merito.MeritoManualDTO;
import gob.shcp.sireh.model.merito.NotaDeMeritoDTO;
import gob.shcp.sireh.model.merito.PagoMeritoDTO;
import gob.shcp.sireh.model.merito.ProcesoNmDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO.PuntoCausalConsecutividad;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.parser.support.ParserXls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class MeritoBS extends AbstractSirehService implements MeritoService {

    static String EXPRESION_REGULAR_RFC = "^(([A-Z]|[a-z]|\\s){1})(([A-Z]|[a-z]){3})([0-9]{6})((([A-Z]|[a-z]|[0-9]){3}))";

    /** 
     * Metodo para obtener el número Máximo de Remesa por ciclo y causal.
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO getMaximoRemesaPorCicloYCausal(NotaDeMeritoDTO notaDeMeritoDTO) {
        List<TdNmHistorico> listaMaximaRemesaPorCicloYCausal = super.persistence().get(QueryTdNmHistoricoDAO.class).getMaxRemesaPorCicloYCausal(notaDeMeritoDTO.getTdNmhCiclo(), notaDeMeritoDTO.getTdNmhCveCausal());
        if (listaMaximaRemesaPorCicloYCausal != null && listaMaximaRemesaPorCicloYCausal.size() > 0) {
            TdNmHistorico tdNmHistorico = listaMaximaRemesaPorCicloYCausal.get(0);
            notaDeMeritoDTO.setTdNmhOp(tdNmHistorico.getNmhOp());
        }

        return notaDeMeritoDTO;
    }

    /** 
     * Metodo para actualizas el RFC empatando la tabla de Histórico y  Resúmen  contra la tabla de Empleado
     * @author Victor Pérez.
     */
    public void updateRfcProcesoNm() {
        //Busca las diferencias de rfc entre la tabla de Empelado y de Histórico antes de comenta el proceso de cálculo de consucitividad
        List<CustomTdNmHistorico> listaHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).selectMeritoActualizaRfcProcesoNmHistorico();
        // Actualizas las diferencias encontradas en la tabla de Histórico
        for (CustomTdNmHistorico customTdNmHistorico : listaHistorico) {
            super.persistence().get(CustomTdHistoricoDAO.class).updateMeritoActualizaRfcProcesoNmHistorico(customTdNmHistorico.getDebeDecir(), customTdNmHistorico.getDice());
        }

        //Busca las diferencias de rfc entre la tabla de Empelado y de Resúmen antes de comenta el proceso de cálculo de consucitividad
        List<CustomTdNmResumen> listaResumen = super.persistence().get(QueryTdNmResumenDAO.class).selectMeritoActualizaRfcProcesoNmResumen();
        // Actualizas las diferencias encontradas en la tabla de Resúmen
        for (CustomTdNmResumen customTdNmResumen : listaResumen) {
            super.persistence().get(CustomTdResumenDAO.class).updateMeritoActualizaRfcProcesoNmResumen(customTdNmResumen.getDebeDecir(), customTdNmResumen.getDice());
        }
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de puntualidad generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFilePuntuality(NotaDeMeritoDTO notaDeMeritoDTO) {
        // ++++++++++ STREAM DEL ARCHIVO RECIBIDO +++++++++++++++++++
        InputStream inputStreamXls = notaDeMeritoDTO.getFile().getInputStream();
        InputStream inputStreamXml = null;
        
        List<NotaDeMeritoDTO> listaNotaDeMeritoDTOIncorrectos; //Los registros incorrectos dentro del archivo que no cumplan con una regla
        notaDeMeritoDTO.setResultadoCargaArchivo(false); // Validación final del archivo
        
        notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(0);
        notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(0);
        
        logger.debug("Inicio el proceso : " + new Date().toString());

        String remesa = super.configuration().getString("nm", "sufix.remesa") + 
                        (notaDeMeritoDTO.getTdNmhOp().length() > 1 ? notaDeMeritoDTO.getTdNmhOp() : "0" + 
                        notaDeMeritoDTO.getTdNmhOp()); // Concatena REM  + "03" (tdnmhop)
                        
        logger.debug("remesa: " + remesa);

        try {
            // +++++++++++++++++++ Vacia la tabla temporal TN_NM_PLANTILLA ++++++++++++++++++++++++
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa);
            
            // +++++++++++++++++++ Parsea el archivo xls contra la plantilla --> devuelve una lista de objetos NotaDeMeritoDTO.
            listaNotaDeMeritoDTOIncorrectos = new ArrayList<NotaDeMeritoDTO>();
            String templateFileXml = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.puntualidad"); // Templeate del archiovo de puntualidad
            inputStreamXml = new FileInputStream(templateFileXml); // InputStream de la plantilla xml
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<NotaDeMeritoDTO> listNotaDeMeritoDTO = parserXls.parseFile(inputStreamXls, NotaDeMeritoDTO.class); 
            
            logger.debug("listNotaDeMeritoDTO: " + listNotaDeMeritoDTO);
            
            // ++++++++++++++++ Validamos los encabezados corresponda al layout ++++++++++++++++++++++++
            if (!(parserXls.getEncabezadoDTO().getA().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.numero")) && 
                parserXls.getEncabezadoDTO().getB().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.rfc")) && 
                parserXls.getEncabezadoDTO().getC().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.nombre")) && 
                parserXls.getEncabezadoDTO().getD().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.uni")) && 
                parserXls.getEncabezadoDTO().getE().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.puesto")) && 
                parserXls.getEncabezadoDTO().getF().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.plaza")) && 
                parserXls.getEncabezadoDTO().getG().toUpperCase().equals(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.encabezado.nivel")))) {
                notaDeMeritoDTO.setPlantillaErronea(true);
                return notaDeMeritoDTO;
            }
            
            // +++++++++++++++++++++++++ 1er Filtro: VERIFICA SI HAY OBJETOS REPETIDOS ++++++++++++++++++++++++
            List<NotaDeMeritoDTO> listNotaDeMeritoConFiltroDTO = new ArrayList<NotaDeMeritoDTO>();
            List<NotaDeMeritoDTO> auxListNotaDeMeritoConFiltroDTO = new ArrayList<NotaDeMeritoDTO>();
            Set<String> setRfcFiltro = new HashSet<String>();

            for (NotaDeMeritoDTO nota : listNotaDeMeritoDTO) {
                if (setRfcFiltro.contains(nota.getTdNmhRfcUnico())) {
                    //logger.debug("--------------------> RFC Repetido: " + nota.getTdNmhRfcUnico());
                    nota.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.rfc.repetido"));
                    listaNotaDeMeritoDTOIncorrectos.add(nota);
                } else {
                    listNotaDeMeritoConFiltroDTO.add(nota);
                    setRfcFiltro.add(nota.getTdNmhRfcUnico());
                }
            }


            List<HashMap<String, Object>> listaMapasPlantilla = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaPlantilla;
            
            // +++++++++++++++++++++++ Preparamos el objeto HashMap para insertarlo masivamente en la tabla temporal TN_NM_PLANTILLA +++++++++++++++
                for (NotaDeMeritoDTO notaDeMeritoVODTO : listNotaDeMeritoConFiltroDTO) {
                if (notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-"))
                    notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                
                mapaPlantilla = new HashMap<String, Object>();
                mapaPlantilla.put("tnNmpId", UUID.randomUUID().toString());
                mapaPlantilla.put("tnNmpTipoCarga", NotaDeMeritoDTO.SUFIX_PU);
                mapaPlantilla.put("tnNmpFechaCarga", new Date());
                mapaPlantilla.put("tnNmpRfc", notaDeMeritoVODTO.getTdNmhRfcUnico().length() >= 13 ? 
                        notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, 13) : 
                        notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, notaDeMeritoVODTO.getTdNmhRfcUnico().length()));
                mapaPlantilla.put("tnNmpNombre", notaDeMeritoVODTO.getNombreEmpleado().length() >= 80 ? 
                        notaDeMeritoVODTO.getNombreEmpleado().substring(0, 80) : 
                        notaDeMeritoVODTO.getNombreEmpleado().substring(0, notaDeMeritoVODTO.getNombreEmpleado().length()));
                mapaPlantilla.put("tnNmpUnidad", notaDeMeritoVODTO.getIdUnidad());
                mapaPlantilla.put("tnNmpPuesto", notaDeMeritoVODTO.getIdPuesto());
                mapaPlantilla.put("tnNmpPlaza", notaDeMeritoVODTO.getIdPlaza());
                mapaPlantilla.put("tnNmpNivel", notaDeMeritoVODTO.getIdNivelPto());
                mapaPlantilla.put("tnNmpCurso", null);
                mapaPlantilla.put("tnNmpDenominacion", null);
                mapaPlantilla.put("tnNmpInicio", null);
                mapaPlantilla.put("tnNmpTermino", null);
                mapaPlantilla.put("tnNmpDuracion", null);
                mapaPlantilla.put("tnNmpTipoPuesto", null);
                mapaPlantilla.put("tnNmpGenero", null);
                mapaPlantilla.put("tnNmpEstatus", null);
                mapaPlantilla.put("tnNmpMes", null);
                mapaPlantilla.put("tnNmpOp", remesa);
                listaMapasPlantilla.add(mapaPlantilla);
            }
            
            // ++++++++++++++++++++++++++++ INSERTA REGISTROS EN LA TABLA TEMPORAL ++++++++++++++++++++++++++++++++
            super.persistence().get(CustomTdNmPlantillaDAO.class).savePlantilla(listaMapasPlantilla, super.identity().get().getUserID());

            // ++++++++++++++++++++++++++++++++++++ ACTUALIZA EL RFC ++++++++++++++++++++++++++++++++
            listNotaDeMeritoConFiltroDTO = updateRfc(remesa);
            logger.debug("Termina Actualizacion de RFC : " + new Date().toString());

            // ++++++++++++++++++++++++++  Consulta todos los empleados válidos en la quincena de validación especificada y que se encuentran en la tabla temporal ++++++++++++
            List<CustomTdEmpleadoMerito> empleadoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByIdRfcYRfcUnico(notaDeMeritoDTO.getHpQnaPago(), remesa);
            logger.debug("----");
            // +++++++++++++++++++++++++++ Validacion remesa - causal - ciclo ++++++++++++++++++++++++
            //Consulta los rfc de la tabla de historico en el ciclo y cuausal correspondientes para saber si ya cuenta con una nota de merito por ese causal y en el año especificado                                                                                  
            List<CustomTdNmHistorico> listaTdNmHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).findNotaMeritoHistorico(notaDeMeritoDTO.getTdNmhCveCausal(), 
                                                                                                                                        notaDeMeritoDTO.getTdNmhCiclo());

            Comparator<CustomTdEmpleadoMerito> c = new Comparator<CustomTdEmpleadoMerito>() {
                    public int compare(CustomTdEmpleadoMerito o1, 
                        CustomTdEmpleadoMerito o2) {
                        int regreso = 0;
                        regreso = o1.getRfcUnico().compareTo(o2.getRfcUnico());
                        return regreso;
                    }
                };
            Collections.sort(empleadoList, c);
            
            Comparator<CustomTdNmHistorico> ch = new Comparator<CustomTdNmHistorico>() {
                    public int compare(CustomTdNmHistorico o1, CustomTdNmHistorico o2) {
                        int regreso = 0;
                        //regreso = o1.getNmhRfc().compareTo(o2.getNmhRfc());
                        regreso = o1.getNmhRfcUnico().compareTo(o2.getNmhRfcUnico());
                        return regreso;
                    }
                };
            Collections.sort(listaTdNmHistorico, ch);

            Pattern pattern = Pattern.compile(EXPRESION_REGULAR_RFC);
            Set<String> setRfc = new HashSet<String>();
            
            
            // +++++++++++++++++ Recorre el arreglo de objetos actualizado que leyó del archivo xls +++++++++++++++++
            for (NotaDeMeritoDTO notaDeMeritoVODTO : listNotaDeMeritoConFiltroDTO) {
                try {
                    //Valida si están presentes todos los elementos del layout, en caso contrario lo agrega a la lista de incorrectos
                    if (notaDeMeritoVODTO.getTdNmhRfcUnico() == null || 
                        notaDeMeritoVODTO.getIdUnidad() == null || 
                        notaDeMeritoVODTO.getIdPuesto() == null || 
                        notaDeMeritoVODTO.getIdPlaza() == null || 
                        notaDeMeritoVODTO.getIdPlaza() == 0 || 
                        notaDeMeritoVODTO.getIdNivelPto() == null) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.validacion"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    // ++++++++++++++++ Valida que el rfc sea valido y bien formado ++++++++++++++++++
                    Matcher match = pattern.matcher(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    if (!match.find()) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.rfc.no.valido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    // +++++++++++++++++++ Valida que no halla sido procesado ya un registro con el mismo rfc dentro del mismo archivo +++++++++++++++
                    if (setRfc.contains(notaDeMeritoVODTO.getTdNmhRfcUnico())) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.rfc.repetido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    if (notaDeMeritoVODTO.getTdNmhRfcUnico() != null && 
                        notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-"))
                        notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                    
                    // +++++++++++++++++ Valida que el empleado existe en la quincena de validación +++++++++++++
                    CustomTdEmpleadoMerito empSearch = new CustomTdEmpleadoMerito();
                    empSearch.setRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    int pos = Collections.binarySearch(empleadoList, empSearch, c);

                    if (pos < 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.noExisteUsuario"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    // +++++++++++++++++++++++++++ Valida que el empleado se operativo ++++++++++++++++++++++++
                    CustomTdEmpleadoMerito empleadoVO = empleadoList.get(pos);
                    if (!empleadoVO.getJerarquia().equals("OP")) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.no.operativo"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    // ++++++++++++++++++++++++ Valida que no cuenta con una nota de puntualidad en el mismo año y por el causal correspondiente ++++++++++
                    // listaTdNmHistorico lista de regisatros de la base de datos
                    CustomTdNmHistorico historicoSearch = new CustomTdNmHistorico();
                    historicoSearch.setNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    pos = Collections.binarySearch(listaTdNmHistorico, historicoSearch, ch);
                    
                    if (pos >= 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.existe.mismo.anio"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    } else {

                        try {
                            // ++++++++++++ Ontiene información del empleado e inserta en la tabla de Histórico al ser una nota de mérito valida ++++++++++
                            List<CustomTdEmpleadoMerito> ctdEmpleadoMeritoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByIdRfcYRfcUnicoEmpleado(
                            notaDeMeritoVODTO.getTdNmhRfcUnico(), 
                            notaDeMeritoDTO.getHpQnaPago());

                            CustomTdEmpleadoMerito tdEmpleado = ctdEmpleadoMeritoList.get(0);
                            Date hoy = new Date();
                            TdNmHistoricoPK tdNmHistoricoPK = new TdNmHistoricoPK();
                            tdNmHistoricoPK.setNmhNumDocto(notaDeMeritoDTO.getTdNmhNumDocto());
                            tdNmHistoricoPK.setNmhCiclo(notaDeMeritoDTO.getTdNmhCiclo());
                            tdNmHistoricoPK.setNmhCausal(notaDeMeritoDTO.getTdNmhCveCausal());
                            tdNmHistoricoPK.setNmhRfcUnico(tdEmpleado.getRfcUnico());
                            tdNmHistoricoPK.setNmhRfc(tdEmpleado.getRfcUnico());

                            TdNmHistorico tdNmHistorico = new TdNmHistorico();
                            tdNmHistorico.setIdentity(tdNmHistoricoPK);
                            tdNmHistorico.setIdUnidad(notaDeMeritoVODTO.getIdUnidad().toString());
                            tdNmHistorico.setUsuario(super.identity().get().getUserID());
                            tdNmHistorico.setFecModifico(hoy);
                            tdNmHistorico.setIdGenero(tdEmpleado.getIdGenero());
                            tdNmHistorico.setIdNivelPto(tdEmpleado.getIdNivelPto());
                            tdNmHistorico.setIdPlaza(tdEmpleado.getIdPlaza());
                            tdNmHistorico.setIdPuesto(tdEmpleado.getIdPuestoPre());
                            tdNmHistorico.setNmhCicloPago(null);
                            tdNmHistorico.setNmhFechaAgre(hoy);
                            tdNmHistorico.setNmhFechaReg(hoy);
                            tdNmHistorico.setNmhMesCurso(null);
                            tdNmHistorico.setNmhOp(remesa);
                            tdNmHistorico.setNmhQnaPagoValidar(notaDeMeritoDTO.getHpQnaPago());
                            tdNmHistorico.setNmhTipoPlaza(tdEmpleado.getIdNombramiento());
                            
                            super.persistence().get(TdNmHistoricoDAO.class).save(tdNmHistorico);
                            notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(notaDeMeritoDTO.getNumeroNotasMeritoCorrectas() + 1);
                            auxListNotaDeMeritoConFiltroDTO.add(notaDeMeritoVODTO);
                            setRfc.add(notaDeMeritoVODTO.getTdNmhRfcUnico()); // Lo agrega a un set para que no existe uno repetido en el mismo archivo
                        } catch (ServiceException e) {
                            notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.integridad") + e.toString());
                            e.printStackTrace();
                            listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                            continue;
                        }
                    }
                } catch (Exception e) {
                    notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorPuntualidad", "jxls.templates.puntualidad.error.merito.error.integridad") + e.toString());
                    e.printStackTrace();
                    listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                    continue;
                }
            }
            

            //Si hay incorrectos generamos el archivo que será util para el usuario y presentar los errores de validación
            logger.debug("Inicio el proceso de generación de Excel  : " + new Date().toString());
            if (listaNotaDeMeritoDTOIncorrectos.size() > 0) {
                notaDeMeritoDTO.setResultadoCargaArchivo(true);
                notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(listaNotaDeMeritoDTOIncorrectos.size());
                
                
                //  +++++++++++++++++++ Registros correctos e incorrectos en un solo archivo excell +++++++++++
                for(NotaDeMeritoDTO notaDeMeritoDTOIncorrectos : listaNotaDeMeritoDTOIncorrectos){
                    auxListNotaDeMeritoConFiltroDTO.add(notaDeMeritoDTOIncorrectos);
                }
                
                
                // +++++++++++++++++++++ Odena la lista por el numero consecutivo +++++++++++++
                Comparator<NotaDeMeritoDTO> comparator = new Comparator<NotaDeMeritoDTO>() {
                    public int compare(NotaDeMeritoDTO o1, NotaDeMeritoDTO o2) {
                        int regreso = 0;
                        regreso = o1.getConsecutivo().compareTo(o2.getConsecutivo());
                        return regreso;
                    }
                };
                Collections.sort(listaNotaDeMeritoDTOIncorrectos, comparator);
                Collections.sort(auxListNotaDeMeritoConFiltroDTO, comparator);
                
                // +++++++++++++++++++++ Agrga las listas al bean NotasDeMerito ++++++++++++++++
                notaDeMeritoDTO.setListaErrores(listaNotaDeMeritoDTOIncorrectos);
                notaDeMeritoDTO.setListaConcent(auxListNotaDeMeritoConFiltroDTO);
                
                // ++++++++++ Genera un numero aleatorio en base a la hora actual
                String aleatorio = super.dateToString(new Date(), "ddMMyyyy hhmmss").replace(" ", "");
                aleatorio = aleatorio.substring(8);
                
                // ++++++++++++++++++++ parametros y transformacion del excell a generar +++++++++++++++++++
                String nmeFileXls = notaDeMeritoDTO.getFile().getOriginalFilename();
                
                String nameFileErrXls   = nmeFileXls.substring(0, nmeFileXls.length() - 5) + "_" + "NMPUError_" + aleatorio + ".xlsx";
                String nameFileConXls   = nmeFileXls.substring(0, nmeFileXls.length() - 5) + "_" + "NMPUConcentrado_" + aleatorio + ".xlsx";
                
                String nombreArchivoErrXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileErrXls;
                String nombreArchivoConXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileConXls;
                
                String nombreArchivoPlantillaErrXls = super.configuration().getString("notasmerito.templates.dir") + File.separator +
                                                   super.configuration().getString("nm", "jxls.templates.xls.errores.puntualidad");
                String nombreArchivoPlantillaConXls = super.configuration().getString("notasmerito.templates.dir") + File.separator +
                                                   super.configuration().getString("nm", "jxls.templates.xls.concentrado.puntualidad");
                                                       
                                                   
                XLSTransformer transformer = new XLSTransformer();
                Map beansErr  = new HashMap();
                Map beansCon  = new HashMap();
                
                beansErr.put("notaDeMeritoDTO", notaDeMeritoDTO);
                beansCon.put("notaDeMeritoDTO", notaDeMeritoDTO);
                
                try {
                    transformer.transformXLS(nombreArchivoPlantillaErrXls,  beansErr, nombreArchivoErrXls);
                    transformer.transformXLS(nombreArchivoPlantillaConXls,  beansCon, nombreArchivoConXls);
                } catch (InvalidFormatException e) {
                    logger.debug("Exception: " + e.toString());
                } catch (IOException e) {
                    logger.debug("Exception: " + e.toString());
                }
                notaDeMeritoDTO.setNombreArchivoErrores(nameFileErrXls);
                notaDeMeritoDTO.setRutaArchivoErrores(nombreArchivoErrXls);
                
                notaDeMeritoDTO.setNombreArchivoConcent(nameFileConXls);
                notaDeMeritoDTO.setRutaArchivoConcent(nombreArchivoConXls);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException("Exception in MeritoBS [updateFilePuntuality] " + e.getCause(), e);
        } finally {
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa); //Eliminamos los registros de la tabla temporal
            logger.debug("Fin del proceso : " + new Date().toString());
        }
        return notaDeMeritoDTO;
    }

    /**   
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de capacitación generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFileTraining(NotaDeMeritoDTO notaDeMeritoDTO) {
        InputStream inputStreamXls = notaDeMeritoDTO.getFile().getInputStream();
        InputStream inputStreamXml = null;
        
        List<NotaDeMeritoDTO> listaNotaDeMeritoDTOIncorrectos;
        
        notaDeMeritoDTO.setResultadoCargaArchivo(false);
        
        notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(0);
        notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(0);
        
        logger.debug("updateNMFileTraining -> Inicio el proceso : " + new Date().toString());
        
        String remesa = super.configuration().getString("nm", "sufix.remesa") + (notaDeMeritoDTO.getTdNmhOp().length() > 1 ? notaDeMeritoDTO.getTdNmhOp() : "0" + notaDeMeritoDTO.getTdNmhOp());
        
        try {
            // Vaciar temporal 
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa);
            
            // Parsea el archivo xls contra la plantilla y devuelve una lista de objetos NotaDeMeritoDTO.
            listaNotaDeMeritoDTOIncorrectos = new ArrayList<NotaDeMeritoDTO>();
            String templateFileXml = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.capacitacion");
            inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<NotaDeMeritoDTO> listNotaDeMeritoDTO = parserXls.parseFile(inputStreamXls, NotaDeMeritoDTO.class);
            
            // Validamos los encabezados corresponda al layout
            if (!(parserXls.getEncabezadoDTO().getA().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.curso")) && 
                  parserXls.getEncabezadoDTO().getB().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.denominacion")) && 
                  parserXls.getEncabezadoDTO().getC().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.inicio")) && 
                  parserXls.getEncabezadoDTO().getD().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.termino")) && 
                  parserXls.getEncabezadoDTO().getE().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.duracion")) && 
                  parserXls.getEncabezadoDTO().getF().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.rfc")) && 
                  parserXls.getEncabezadoDTO().getG().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.nombre")) && 
                  parserXls.getEncabezadoDTO().getH().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.puesto")) && 
                  parserXls.getEncabezadoDTO().getI().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.unidad")) && 
                  parserXls.getEncabezadoDTO().getJ().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.genero")) && 
                  parserXls.getEncabezadoDTO().getK().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.estatus")) && 
                  parserXls.getEncabezadoDTO().getL().toUpperCase().equals(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.encabezado.mes")))) {
                notaDeMeritoDTO.setPlantillaErronea(true);
                return notaDeMeritoDTO;
            }
            
            // 1er Filtro
            List<NotaDeMeritoDTO> listNotaDeMeritoConFiltroDTO = new ArrayList<NotaDeMeritoDTO>();
            List<NotaDeMeritoDTO> auxListNotaDeMeritoConFiltroDTO = new ArrayList<NotaDeMeritoDTO>();
            Set<String> setRfcFiltro = new HashSet<String>();
            
            for (NotaDeMeritoDTO nota : listNotaDeMeritoDTO) {
                if (setRfcFiltro.contains(nota.getTdNmhRfcUnico())) {
                    logger.debug("--------------------> RFC Repetido: " + nota.getTdNmhRfcUnico());
                    nota.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.rfc.repetido"));
                    listaNotaDeMeritoDTOIncorrectos.add(nota);
                } else {
                    if (nota.getNivelOp().equals("OP") && nota.getDuracion() >= 20 && nota.getEstatus().toUpperCase().equals("APROBADO")) {
                        listNotaDeMeritoConFiltroDTO.add(nota);
                        setRfcFiltro.add(nota.getTdNmhRfcUnico());
                    } else {
                        nota.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.rechazado"));
                        listaNotaDeMeritoDTOIncorrectos.add(nota);
                    }
                }
            }
            
            List<HashMap<String, Object>> listaMapasPlantilla = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaPlantilla;
            
            for (NotaDeMeritoDTO notaDeMeritoVODTO : listNotaDeMeritoConFiltroDTO) {
                if (notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-"))
                    notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                
                mapaPlantilla = new HashMap<String, Object>();
                mapaPlantilla.put("tnNmpId", UUID.randomUUID().toString());
                mapaPlantilla.put("tnNmpTipoCarga", NotaDeMeritoDTO.SUFIX_CA);
                mapaPlantilla.put("tnNmpFechaCarga", new Date());
                mapaPlantilla.put("tnNmpRfc", notaDeMeritoVODTO.getTdNmhRfcUnico().length() >= 13 ? 
                                              notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, 13) : 
                                              notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, notaDeMeritoVODTO.getTdNmhRfcUnico().length()));
                mapaPlantilla.put("tnNmpNombre", notaDeMeritoVODTO.getNombreEmpleado().length() >= 80 ? 
                                                 notaDeMeritoVODTO.getNombreEmpleado().substring(0, 80) : 
                                                 notaDeMeritoVODTO.getNombreEmpleado().substring(0, notaDeMeritoVODTO.getNombreEmpleado().length()));
                mapaPlantilla.put("tnNmpUnidad", notaDeMeritoVODTO.getIdUnidad());
                mapaPlantilla.put("tnNmpPuesto", null);
                mapaPlantilla.put("tnNmpPlaza", null);
                mapaPlantilla.put("tnNmpNivel", null);
                mapaPlantilla.put("tnNmpCurso", notaDeMeritoVODTO.getCurso());
                mapaPlantilla.put("tnNmpDenominacion", notaDeMeritoVODTO.getNombreCurso());
                mapaPlantilla.put("tnNmpInicio", notaDeMeritoVODTO.getInicioCurso());
                mapaPlantilla.put("tnNmpTermino", notaDeMeritoVODTO.getFinCurso());
                mapaPlantilla.put("tnNmpDuracion", notaDeMeritoVODTO.getDuracion());
                mapaPlantilla.put("tnNmpTipoPuesto", notaDeMeritoVODTO.getNivelOp());
                mapaPlantilla.put("tnNmpGenero", notaDeMeritoVODTO.getGenero());
                mapaPlantilla.put("tnNmpEstatus", notaDeMeritoVODTO.getEstatus());
                mapaPlantilla.put("tnNmpMes", notaDeMeritoVODTO.getMes());
                mapaPlantilla.put("tnNmpOp", remesa);
                listaMapasPlantilla.add(mapaPlantilla);
            }
            
            // Inserta los registros en la tabla temporal TN_NM_PLANTILLA 
            super.persistence().get(CustomTdNmPlantillaDAO.class).savePlantilla(listaMapasPlantilla, super.identity().get().getUserID());
            logger.debug("updateNMFileTraining -> Termino de insertar en Temporal e inicia proceso de actualización de RFC : " + new Date().toString());
            
            // actualizar el RFC empatando la tabla de Histórico, Resúmen y el Archivo de Carga contra la tabla de Empleado
            listNotaDeMeritoConFiltroDTO = updateRfc(remesa);
            logger.debug("updateNMFileTraining -> Terminó actualización de RFC e inicia proceso de validación : " + new Date().toString());
            
            // Validacion remesa - causal - ciclo: Consulta todos los empleados válidos en la quincena de validación especificada y que se encuentran en la tabla temporal
            List<CustomTdEmpleadoMerito> empleadoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByIdRfcYRfcUnico(notaDeMeritoDTO.getHpQnaPago(), remesa);
            List<CustomTdNmHistorico> listaTdNmHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).findNotaMeritoHistorico(notaDeMeritoDTO.getTdNmhCveCausal(), 
                                                                                                                                        notaDeMeritoDTO.getTdNmhCiclo());
            
            Comparator<CustomTdEmpleadoMerito> c = new Comparator<CustomTdEmpleadoMerito>() {
                    public int compare(CustomTdEmpleadoMerito o1, CustomTdEmpleadoMerito o2) {
                        int regreso = 0;
                        regreso = o1.getRfcUnico().compareTo(o2.getRfcUnico());
                        return regreso;
                    }
                };
            Collections.sort(empleadoList, c);

            Comparator<CustomTdNmHistorico> ch = new Comparator<CustomTdNmHistorico>() {

                    public int compare(CustomTdNmHistorico o1, CustomTdNmHistorico o2) {
                        int regreso = 0;
                        //regreso = o1.getNmhRfc().compareTo(o2.getNmhRfc());
                        regreso = o1.getNmhRfcUnico().compareTo(o2.getNmhRfcUnico());
                        return regreso;
                    }
                };
            Collections.sort(listaTdNmHistorico, ch);

            Pattern pattern = Pattern.compile(EXPRESION_REGULAR_RFC);
            Set<String> setRfc = new HashSet<String>();
            
            // Valida los datos del archivo excell
            for (NotaDeMeritoDTO notaDeMeritoVODTO: listNotaDeMeritoConFiltroDTO) {
                try {
                    if (notaDeMeritoVODTO.getCurso() == null || 
                        (notaDeMeritoVODTO.getCurso() != null && notaDeMeritoVODTO.getCurso().length() == 0) || 
                        notaDeMeritoVODTO.getNombreCurso() == null || 
                        (notaDeMeritoVODTO.getNombreCurso() != null && notaDeMeritoVODTO.getNombreCurso().length() == 0) || 
                        notaDeMeritoVODTO.getInicioCurso() == null || notaDeMeritoVODTO.getFinCurso() == null || 
                        notaDeMeritoVODTO.getDuracion() == null || 
                        (notaDeMeritoVODTO.getDuracion() != null && notaDeMeritoVODTO.getDuracion() == 0) || 
                        notaDeMeritoVODTO.getTdNmhRfcUnico() == null || 
                        (notaDeMeritoVODTO.getTdNmhRfcUnico() != null && notaDeMeritoVODTO.getTdNmhRfcUnico().length() == 0) || 
                        notaDeMeritoVODTO.getNombreEmpleado() == null || 
                        (notaDeMeritoVODTO.getNombreEmpleado() != null && notaDeMeritoVODTO.getNombreEmpleado().length() == 0) || 
                        notaDeMeritoVODTO.getNivelOp() == null || 
                        (notaDeMeritoVODTO.getNivelOp() != null && notaDeMeritoVODTO.getNivelOp().length() == 0) || 
                        notaDeMeritoVODTO.getIdUnidad() == null || 
                        (notaDeMeritoVODTO.getIdUnidad() != null && notaDeMeritoVODTO.getIdUnidad() == 0) || 
                        notaDeMeritoVODTO.getGenero() == null || 
                        (notaDeMeritoVODTO.getGenero() != null && notaDeMeritoVODTO.getGenero().length() == 0) || 
                        notaDeMeritoVODTO.getEstatus() == null || 
                        (notaDeMeritoVODTO.getEstatus() != null && notaDeMeritoVODTO.getEstatus().length() == 0) || 
                        notaDeMeritoVODTO.getMes() == null || 
                        (notaDeMeritoVODTO.getMes() != null && notaDeMeritoVODTO.getMes().length() == 0)) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.validacion"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    if (notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-")){
                        notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                    }

                    Matcher match = pattern.matcher(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    
                    if (!match.find()) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.rfc.no.valido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    // RFC Repetidos
                    if (setRfc.contains(notaDeMeritoVODTO.getTdNmhRfcUnico())) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.rfc.repetido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    CustomTdEmpleadoMerito empSearch = new CustomTdEmpleadoMerito();
                    empSearch.setRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    int pos = Collections.binarySearch(empleadoList, empSearch, c);

                    if (pos < 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.noExisteUsuario"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    CustomTdEmpleadoMerito empleadoVO = empleadoList.get(pos);
                    if (!empleadoVO.getJerarquia().equals("OP")) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.no.operativo"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    if (notaDeMeritoVODTO.getDuracion() < 20) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.no.tiene.veinte.horas"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    if (!notaDeMeritoVODTO.getEstatus().toUpperCase().equals("APROBADO")) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.no.aprobado"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    
                    // 2da etapa - Cruce historico
                    CustomTdNmHistorico historicoSearch = new CustomTdNmHistorico();
                    historicoSearch.setNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    pos = Collections.binarySearch(listaTdNmHistorico, historicoSearch, ch);
                    
                    if (pos >= 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.existe.mismo.anio"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    } else {
                        try {
                            List<CustomTdEmpleadoMerito> ctdEmpleadoMeritoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByIdRfcYRfcUnicoEmpleado(
                            notaDeMeritoVODTO.getTdNmhRfcUnico(), 
                            notaDeMeritoDTO.getHpQnaPago());
                            CustomTdEmpleadoMerito tdEmpleado = ctdEmpleadoMeritoList.get(0);
                            
                            Date hoy = new Date();
                            TdNmHistoricoPK tdNmHistoricoPK = new TdNmHistoricoPK();
                            tdNmHistoricoPK.setNmhNumDocto(notaDeMeritoDTO.getTdNmhNumDocto());
                            tdNmHistoricoPK.setNmhCiclo(notaDeMeritoDTO.getTdNmhCiclo());
                            tdNmHistoricoPK.setNmhCausal(notaDeMeritoDTO.getTdNmhCveCausal());
                            tdNmHistoricoPK.setNmhRfcUnico(tdEmpleado.getRfcUnico());
                            tdNmHistoricoPK.setNmhRfc(tdEmpleado.getRfcUnico());
                            
                            TdNmHistorico tdNmHistorico = new TdNmHistorico();
                            tdNmHistorico.setIdentity(tdNmHistoricoPK);
                            tdNmHistorico.setIdUnidad(notaDeMeritoVODTO.getIdUnidad().toString());
                            tdNmHistorico.setUsuario(super.identity().get().getUserID());
                            tdNmHistorico.setFecModifico(hoy);
                            tdNmHistorico.setIdGenero(tdEmpleado.getIdGenero());
                            tdNmHistorico.setIdNivelPto(tdEmpleado.getIdNivelPto());
                            tdNmHistorico.setIdPlaza(tdEmpleado.getIdPlaza());
                            tdNmHistorico.setIdPuesto(tdEmpleado.getIdPuestoPre());
                            tdNmHistorico.setNmhCicloPago(null);
                            tdNmHistorico.setNmhFechaAgre(hoy);
                            tdNmHistorico.setNmhFechaReg(hoy);
                            tdNmHistorico.setNmhMesCurso(null);
                            tdNmHistorico.setNmhOp(remesa);
                            tdNmHistorico.setNmhQnaPagoValidar(notaDeMeritoDTO.getHpQnaPago());
                            tdNmHistorico.setNmhTipoPlaza(tdEmpleado.getIdNombramiento());

                            super.persistence().get(TdNmHistoricoDAO.class).save(tdNmHistorico);
                            notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(notaDeMeritoDTO.getNumeroNotasMeritoCorrectas() + 1);
                            auxListNotaDeMeritoConFiltroDTO.add(notaDeMeritoVODTO);
                            setRfc.add(notaDeMeritoVODTO.getTdNmhRfcUnico());
                        } catch (ServiceException e) {
                            notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.integridad") + e.toString());
                            listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                            e.printStackTrace();
                            continue;
                        }
                    }
                } catch (Exception e) {
                    notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorCapacitacion", "jxls.templates.capacitacion.error.merito.error.validacion") + " - "+ e.toString());
                    listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                    e.printStackTrace();
                    continue;
                }
            }
            logger.debug("updateNMFileTraining -> Termino proceso de validacion de notas de merito e inicia preparacion de XLS respuesta : " + new Date().toString());
            
            // Si hay incorrectos generamos el archivo que será util para el usuario y presentar los errores de validación
            // y el archivo de concentrado
            if (listaNotaDeMeritoDTOIncorrectos.size() > 0) {
                notaDeMeritoDTO.setResultadoCargaArchivo(true);
                notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(listaNotaDeMeritoDTOIncorrectos.size());
                
                // Registros correctos e incorrectos en un solo archivo 'concentrado'
                 for(NotaDeMeritoDTO notaDeMeritoDTOIncorrectos : listaNotaDeMeritoDTOIncorrectos){
                     auxListNotaDeMeritoConFiltroDTO.add(notaDeMeritoDTOIncorrectos);
                 }
                
                // Odena las listas por el numero consecutivo
                 Comparator<NotaDeMeritoDTO> comparator = new Comparator<NotaDeMeritoDTO>() {
                     public int compare(NotaDeMeritoDTO o1, NotaDeMeritoDTO o2) {
                         int regreso = 0;
                         regreso = o1.getCurso().compareTo(o2.getCurso());
                         return regreso;
                     }
                 };
                
                Collections.sort(listaNotaDeMeritoDTOIncorrectos, comparator);
                Collections.sort(auxListNotaDeMeritoConFiltroDTO, comparator);
                
                // Agrga las listas al bean NotasDeMerito
                notaDeMeritoDTO.setListaErrores(listaNotaDeMeritoDTOIncorrectos);
                notaDeMeritoDTO.setListaConcent(auxListNotaDeMeritoConFiltroDTO);
                
                // Genera un numero aleatorio en base a la hora actual
                String aleatorio = super.dateToString(new Date(), "ddMMyyyy hhmmss").replace(" ", "");
                aleatorio = aleatorio.substring(8);
                 
                // parametros y transformacion del excell a generar
                String nmeFileXls = notaDeMeritoDTO.getFile().getOriginalFilename();
                  
                String nameFileErrXls   = nmeFileXls.substring(0, nmeFileXls.length() - 5) + "_" + "NMCapError_" + aleatorio + ".xlsx";
                String nameFileConXls   = nmeFileXls.substring(0, nmeFileXls.length() - 5) + "_" + "NMCapConce_" + aleatorio + ".xlsx";
                
                String nombreArchivoErrXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileErrXls;
                String nombreArchivoConXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileConXls;
                
                String nombreArchivoPlantillaErrXls = super.configuration().getString("notasmerito.templates.dir") + File.separator +
                                                      super.configuration().getString("nm", "jxls.templates.xls.errores.capacticacion");
                String nombreArchivoPlantillaConXls = super.configuration().getString("notasmerito.templates.dir") + File.separator +
                                                      super.configuration().getString("nm", "jxls.templates.xls.concentrado.capacticacion");
                
                XLSTransformer transformer = new XLSTransformer();
                Map beansErr  = new HashMap();
                Map beansCon  = new HashMap();
                
                beansErr.put("notaDeMeritoDTO", notaDeMeritoDTO);
                beansCon.put("notaDeMeritoDTO", notaDeMeritoDTO);
                
                try {
                    transformer.transformXLS(nombreArchivoPlantillaErrXls,  beansErr, nombreArchivoErrXls);
                    transformer.transformXLS(nombreArchivoPlantillaConXls,  beansCon, nombreArchivoConXls);
                } catch (InvalidFormatException e) {
                    logger.debug("Exception: " + e.toString());
                } catch (IOException e) {
                    logger.debug("Exception: " + e.toString());
                }
                notaDeMeritoDTO.setNombreArchivoErrores(nameFileErrXls);
                notaDeMeritoDTO.setRutaArchivoErrores(nombreArchivoErrXls);
                
                notaDeMeritoDTO.setNombreArchivoConcent(nameFileConXls);
                notaDeMeritoDTO.setRutaArchivoConcent(nombreArchivoConXls);
            }
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [updateFileTraining] " + e.toString(), e);
        } finally {
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa);
            logger.debug("updateNMFileTraining -> Fin el proceso : " + new Date().toString());
        }
        return notaDeMeritoDTO;
    }
    
    /** 
     * Metodo para actualizar el RFC empatando la tabla de Histórico, Resúmen y el Archivo de Carga contra la tabla de Empleado
     * @author Victor Pérez.
     * @param tdNmOp String
     * @return notaDeMeritoDTOList List
     */
    public List<NotaDeMeritoDTO> updateRfc(String tdNmOp) {
        // Paso 1: Busca los empleados actualizados diferentes a lo que tiene el archivo y que se encuentra en la tabla temporal (TD_EMPLEADO vs TN_NM_PLANTILLA)
        List<CustomTnNmPlantilla> listaEmpleado = super.persistence().get(QueryTdNmPlantillaDAO.class).findNotaMeritoRfcaActualizar();
        
        // Optimizar
        // Paso 2: Actualiza las diferencias encontradas en la tambla TN_NM_PLANTILLA, es decir, se actualiza el RFC que contiene el archivo
        for (CustomTnNmPlantilla customTnNmPlantilla : listaEmpleado) {
            super.persistence().get(CustomTdNmPlantillaDAO.class).updatePlantillaRfc(customTnNmPlantilla.getDebeDecir(), customTnNmPlantilla.getDice(), tdNmOp);
        }

        // Paso 3: Busca los empleados actualizados diferentes contra la tabla de histórico TD_NM_HISTORICO (TD_EMPLEADO vs TD_NM_HISTORICO)
        List<CustomTdNmHistorico> listaHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).selectMeritoActualizaRfcContraHistorico();
        
        // Paso 4: Si encuentra diferencias actualiza el rfc de la tabla de TD_NM_HISTORICO
        if (listaHistorico != null && listaHistorico.size() > 0) {
            CustomTdNmHistorico customTdNmHistorico = listaHistorico.get(0);
            super.persistence().get(CustomTdHistoricoDAO.class).updateMeritoActualizaRfcHistorico(customTdNmHistorico.getDebeDecir(), customTdNmHistorico.getDice());
        }

        // Paso 5: Busca los empleados actualizados diferentes contra la tabla de resúmen (TD_EMPLEADO Vs TD_NM_RESUMEN)
        List<CustomTdNmResumen> listaResumen = super.persistence().get(QueryTdNmResumenDAO.class).selectMeritoActualizaRfcContraResumen();
        
        // Paso 6: Si encuentra diferencias actualiza el rfc de la tabla de TD_NM_RESUMEN
        if (listaResumen != null && listaResumen.size() > 0) {
            CustomTdNmResumen customTdNmResumen = listaResumen.get(0);
            super.persistence().get(CustomTdResumenDAO.class).updateMeritoActualizaRfcProcesoNmResumen(customTdNmResumen.getDebeDecir(), customTdNmResumen.getDice());
        }

        // Paso 7: Consultamos la tabla temporal TD_NM_HISTORICO y la volvemos a carga a memoria en los objetos como fueron leidos en el archivo a través de la clase NotaDeMeritoDTO
        List<NotaDeMeritoDTO> listaNotasMerito = new ArrayList<NotaDeMeritoDTO>();
        List<CustomTnNmPlantilla> listaCustomTdNmPlantilla = super.persistence().get(QueryTdNmPlantillaDAO.class).findPlantillaMerito(tdNmOp);
        int consecutivo = 1;
        
        for (CustomTnNmPlantilla customTnNmPlantilla: listaCustomTdNmPlantilla) {
            NotaDeMeritoDTO notaDeMeritoDTO = new NotaDeMeritoDTO();
            notaDeMeritoDTO.setConsecutivo(consecutivo++);
            notaDeMeritoDTO.setTdNmhRfcUnico(customTnNmPlantilla.getTnNmpRfc());
            notaDeMeritoDTO.setNombreEmpleado(customTnNmPlantilla.getTnNmpNombre());
            notaDeMeritoDTO.setIdUnidad(new Integer(customTnNmPlantilla.getTnNmpUnidad()));
            notaDeMeritoDTO.setIdPuesto(customTnNmPlantilla.getTnNmpPuesto());
            notaDeMeritoDTO.setIdPlaza(customTnNmPlantilla.getTnNmpPlaza());
            notaDeMeritoDTO.setIdNivelPto(customTnNmPlantilla.getTnNmpNivel());
            notaDeMeritoDTO.setCurso(customTnNmPlantilla.getTnNmpCurso());
            notaDeMeritoDTO.setNombreCurso(customTnNmPlantilla.getTnNmpDenominacion());
            notaDeMeritoDTO.setInicioCurso(customTnNmPlantilla.getTnNmpInicio());
            notaDeMeritoDTO.setFinCurso(customTnNmPlantilla.getTnNmpTermino());
            notaDeMeritoDTO.setDuracion(customTnNmPlantilla.getTnNmpDuracion());
            notaDeMeritoDTO.setNivelOp(customTnNmPlantilla.getTnNmpTipoPuesto());
            notaDeMeritoDTO.setGenero(customTnNmPlantilla.getTnNmpGenero());
            notaDeMeritoDTO.setEstatus(customTnNmPlantilla.getTnNmpEstatus());
            notaDeMeritoDTO.setMes(customTnNmPlantilla.getTnNmpMes());
            
            logger.debug("updateNMFileTraining -> Inicio de curso : " + customTnNmPlantilla.getTnNmpInicio());
            logger.debug("updateNMFileTraining -> Fin de curso : " + customTnNmPlantilla.getTnNmpTermino());
            
            listaNotasMerito.add(notaDeMeritoDTO);
        }
        return listaNotasMerito;
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de evaluación de desempeño generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFileTestPerformance(NotaDeMeritoDTO notaDeMeritoDTO) {
        InputStream inputStreamXls = notaDeMeritoDTO.getFile().getInputStream();
        InputStream inputStreamXml = null;
        List<NotaDeMeritoDTO> listaNotaDeMeritoDTOIncorrectos;
        notaDeMeritoDTO.setResultadoCargaArchivo(false);
        notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(0);
        notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(0);
        String remesa = super.configuration().getString("nm", "sufix.remesa") + (notaDeMeritoDTO.getTdNmhOp().length() > 1 ? notaDeMeritoDTO.getTdNmhOp() : "0" + notaDeMeritoDTO.getTdNmhOp());
        
        try {
            //Vaciar temporal
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa);
            
            listaNotaDeMeritoDTOIncorrectos = new ArrayList<NotaDeMeritoDTO>();
            String templateFileXml = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.evaluacion");
            inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<NotaDeMeritoDTO> listNotaDeMeritoDTO = parserXls.parseFile(inputStreamXls, NotaDeMeritoDTO.class);
            
            // Valida el archivo contra la plantilla
            if (!(parserXls.getEncabezadoDTO().getA().toUpperCase().equals(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.encabezado.numero")) && 
                  parserXls.getEncabezadoDTO().getB().toUpperCase().equals(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.encabezado.rfc")) && 
                  parserXls.getEncabezadoDTO().getC().toUpperCase().equals(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.encabezado.nombre")) && 
                  parserXls.getEncabezadoDTO().getD().toUpperCase().equals(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.encabezado.unidad")))) {
                notaDeMeritoDTO.setPlantillaErronea(true);
                return notaDeMeritoDTO;
            }
            
            // 1er Filtro: Valida si el archivo de carga contiene rfc's repetidos 
            List<NotaDeMeritoDTO> listNotaDeMeritoConFiltroDTO = new ArrayList<NotaDeMeritoDTO>();
            Set<String> setRfcFiltro = new HashSet<String>();
            for (NotaDeMeritoDTO nota : listNotaDeMeritoDTO) {
                if (setRfcFiltro.contains(nota.getTdNmhRfcUnico())) {
                    logger.debug("--------------------> RFC Repetido: " + nota.getTdNmhRfcUnico());
                    nota.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.rfc.repetido"));
                    listaNotaDeMeritoDTOIncorrectos.add(nota);
                } else {
                    listNotaDeMeritoConFiltroDTO.add(nota);
                    setRfcFiltro.add(nota.getTdNmhRfcUnico());
                }
            }
            
            // Incerta en la temporal la lista sin repetidos
            List<HashMap<String, Object>> listaMapasPlantilla = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaPlantilla;
            
            for (NotaDeMeritoDTO notaDeMeritoVODTO : listNotaDeMeritoConFiltroDTO) {
                if (notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-"))
                    notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                mapaPlantilla = new HashMap<String, Object>();
                mapaPlantilla.put("tnNmpId", UUID.randomUUID().toString());
                mapaPlantilla.put("tnNmpTipoCarga", NotaDeMeritoDTO.SUFIX_EP);
                mapaPlantilla.put("tnNmpFechaCarga", new Date());
                mapaPlantilla.put("tnNmpRfc", notaDeMeritoVODTO.getTdNmhRfcUnico().length() >= 13 ? 
                                              notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, 13) : 
                                              notaDeMeritoVODTO.getTdNmhRfcUnico().substring(0, notaDeMeritoVODTO.getTdNmhRfcUnico().length()));
                mapaPlantilla.put("tnNmpNombre", notaDeMeritoVODTO.getNombreEmpleado().length() >= 80 ? 
                                                 notaDeMeritoVODTO.getNombreEmpleado().substring(0, 80) : 
                                                 notaDeMeritoVODTO.getNombreEmpleado().substring(0, notaDeMeritoVODTO.getNombreEmpleado().length()));
                mapaPlantilla.put("tnNmpUnidad", notaDeMeritoVODTO.getIdUnidad());
                mapaPlantilla.put("tnNmpPuesto", null);
                mapaPlantilla.put("tnNmpPlaza", null);
                mapaPlantilla.put("tnNmpNivel", null);
                mapaPlantilla.put("tnNmpCurso", null);
                mapaPlantilla.put("tnNmpDenominacion", null);
                mapaPlantilla.put("tnNmpInicio", null);
                mapaPlantilla.put("tnNmpTermino", null);
                mapaPlantilla.put("tnNmpDuracion", null);
                mapaPlantilla.put("tnNmpTipoPuesto", null);
                mapaPlantilla.put("tnNmpGenero", null);
                mapaPlantilla.put("tnNmpEstatus", null);
                mapaPlantilla.put("tnNmpMes", null);
                mapaPlantilla.put("tnNmpOp", remesa);
                listaMapasPlantilla.add(mapaPlantilla);
            }
            super.persistence().get(CustomTdNmPlantillaDAO.class).savePlantilla(listaMapasPlantilla, super.identity().get().getUserID());
            
            // Actualizacion del rfc: Conciliacion de la tabla temporal contra la tabla de empleados y la de tabla de resumen
            listNotaDeMeritoConFiltroDTO = updateRfc(remesa);
            
            
            List<CustomTdEmpleadoMerito> empleadoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByIdRfcYRfcUnico(notaDeMeritoDTO.getHpQnaPago(), remesa);
            
            // Validacion remesa - causal - ciclo
            List<CustomTdNmHistorico> listaTdNmHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).findNotaMeritoHistorico(notaDeMeritoDTO.getTdNmhCveCausal(), 
                                                                                                                                        notaDeMeritoDTO.getTdNmhCiclo());
            // Validacion remesa - causal - ciclo
            List<CustomTdNmHistorico> listaTdNmHistoricoAnterior = super.persistence().get(QueryTdNmHistoricoDAO.class).findNotaMeritoHistorico(notaDeMeritoDTO.getTdNmhCveCausal(), 
                                                                                                                                                notaDeMeritoDTO.getTdNmhCiclo() - 1);

            Comparator<CustomTdEmpleadoMerito> c = new Comparator<CustomTdEmpleadoMerito>() {
                public int compare(CustomTdEmpleadoMerito o1, CustomTdEmpleadoMerito o2) {
                    int regreso = 0;
                    regreso = o1.getRfcUnico().compareTo(o2.getRfcUnico());
                    return regreso;
                }
            };

            Collections.sort(empleadoList, c);
            
            Comparator<CustomTdNmHistorico> ch = new Comparator<CustomTdNmHistorico>() {
                public int compare(CustomTdNmHistorico o1, CustomTdNmHistorico o2) {
                    int regreso = 0;
                    regreso = o1.getNmhRfc().compareTo(o2.getNmhRfc());
                    return regreso;
                }
            };
            
            Collections.sort(listaTdNmHistorico, ch);
            Collections.sort(listaTdNmHistoricoAnterior, ch);
            Pattern pattern = Pattern.compile(EXPRESION_REGULAR_RFC);
            Set<String> setRfc = new HashSet<String>();

            for (NotaDeMeritoDTO notaDeMeritoVODTO: listNotaDeMeritoConFiltroDTO) {
                try {
                    if (notaDeMeritoVODTO.getConsecutivo() == null || 
                        (notaDeMeritoVODTO.getConsecutivo() != null && notaDeMeritoVODTO.getConsecutivo() == 0) || 
                        notaDeMeritoVODTO.getTdNmhRfcUnico() == null || 
                        (notaDeMeritoVODTO.getTdNmhRfcUnico() != null && 
                         notaDeMeritoVODTO.getTdNmhRfcUnico().length() == 0) || 
                        notaDeMeritoVODTO.getNombreEmpleado() == null || 
                        (notaDeMeritoVODTO.getNombreEmpleado() != null && 
                         notaDeMeritoVODTO.getNombreEmpleado().length() == 0) || 
                        notaDeMeritoVODTO.getIdUnidad() == null || 
                        (notaDeMeritoVODTO.getIdUnidad() != null && notaDeMeritoVODTO.getIdUnidad() == 0)) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.validacion"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }
                    if (notaDeMeritoVODTO.getTdNmhRfcUnico().contains("-"))
                        notaDeMeritoVODTO.setTdNmhRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico().replace("-", ""));
                    
                    Matcher match = pattern.matcher(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    if (!match.find()) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.rfc.no.valido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    if (setRfc.contains(notaDeMeritoVODTO.getTdNmhRfcUnico())) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.rfc.repetido"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    CustomTdEmpleadoMerito empSearch = new CustomTdEmpleadoMerito();
                    empSearch.setRfcUnico(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    int pos = Collections.binarySearch(empleadoList, empSearch, c);

                    if (pos < 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.noExisteUsuario"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    CustomTdEmpleadoMerito empleadoVO = empleadoList.get(pos);
                    if (!empleadoVO.getJerarquia().equals("OP")) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.no.operativo"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    }

                    CustomTdNmHistorico historicoSearch = new CustomTdNmHistorico();
                    historicoSearch.setNmhRfc(notaDeMeritoVODTO.getTdNmhRfcUnico());
                    pos = Collections.binarySearch(listaTdNmHistorico, historicoSearch, ch);

                    if (pos >= 0) {
                        notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.existe.mismo.anio"));
                        listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                        continue;
                    } else {
                        pos = Collections.binarySearch(listaTdNmHistoricoAnterior, historicoSearch, ch);
                        
                        if (pos >= 0) {
                            notaDeMeritoVODTO.setMensaje(super.configuration().
                                              getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.existe.mismo.anio.anterior"));
                            listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                            continue;
                        } else {
                            try {
                                List<CustomTdEmpleadoMerito> ctdEmpleadoMeritoList = super.persistence().get(QueryTdEmpleadoDAO.class)
                                                                    .findEmpleadoByIdRfcYRfcUnicoEmpleado(notaDeMeritoVODTO.getTdNmhRfcUnico(), notaDeMeritoDTO.getHpQnaPago());
                                CustomTdEmpleadoMerito tdEmpleado = ctdEmpleadoMeritoList.get(0);

                                Date hoy = new Date();
                                TdNmHistoricoPK tdNmHistoricoPK = new TdNmHistoricoPK();
                                tdNmHistoricoPK.setNmhNumDocto(notaDeMeritoDTO.getTdNmhNumDocto());
                                tdNmHistoricoPK.setNmhCiclo(notaDeMeritoDTO.getTdNmhCiclo());
                                tdNmHistoricoPK.setNmhCausal(notaDeMeritoDTO.getTdNmhCveCausal());
                                tdNmHistoricoPK.setNmhRfcUnico(tdEmpleado.getRfcUnico());
                                tdNmHistoricoPK.setNmhRfc(tdEmpleado.getRfcUnico());

                                TdNmHistorico tdNmHistorico = new TdNmHistorico();
                                tdNmHistorico.setIdentity(tdNmHistoricoPK);
                                tdNmHistorico.setIdUnidad(notaDeMeritoVODTO.getIdUnidad().toString());
                                tdNmHistorico.setUsuario(super.identity().get().getUserID());
                                tdNmHistorico.setFecModifico(hoy);
                                tdNmHistorico.setIdGenero(tdEmpleado.getIdGenero());
                                tdNmHistorico.setIdNivelPto(tdEmpleado.getIdNivelPto());
                                tdNmHistorico.setIdPlaza(tdEmpleado.getIdPlaza());
                                tdNmHistorico.setIdPuesto(tdEmpleado.getIdPuestoPre());
                                tdNmHistorico.setNmhCicloPago(null);
                                tdNmHistorico.setNmhFechaAgre(hoy);
                                tdNmHistorico.setNmhFechaReg(hoy);
                                tdNmHistorico.setNmhMesCurso(null);
                                tdNmHistorico.setNmhOp(remesa);
                                tdNmHistorico.setNmhQnaPagoValidar(notaDeMeritoDTO.getHpQnaPago());
                                tdNmHistorico.setNmhTipoPlaza(tdEmpleado.getIdNombramiento());

                                super.persistence().get(TdNmHistoricoDAO.class).save(tdNmHistorico);
                                notaDeMeritoDTO.setNumeroNotasMeritoCorrectas(notaDeMeritoDTO.getNumeroNotasMeritoCorrectas() + 1);
                                setRfc.add(notaDeMeritoVODTO.getTdNmhRfcUnico());
                            } catch (ServiceException e) {
                                notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.integridad") + e.toString());
                                listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                                continue;
                            }
                        }
                    }
                } catch (Exception e) {
                    notaDeMeritoVODTO.setMensaje(super.configuration().getString("mensajesErrorEvaluacion", "jxls.templates.evaluacion.error.merito.error.validacion") + e.toString());
                    listaNotaDeMeritoDTOIncorrectos.add(notaDeMeritoVODTO);
                    continue;
                }
            }

            if (listaNotaDeMeritoDTOIncorrectos.size() > 0) {
                notaDeMeritoDTO.setResultadoCargaArchivo(true);
                notaDeMeritoDTO.setListaErrores(listaNotaDeMeritoDTOIncorrectos);
                notaDeMeritoDTO.setNumeroNotasMeritoIncorrectas(listaNotaDeMeritoDTOIncorrectos.size());
                
                String nameFileXls = UUID.randomUUID().toString() + ".xlsx";
                String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
                String nombreArchivoPlantillaXls = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.xls.errores.evaluacion");
                XLSTransformer transformer = new XLSTransformer();
                Map beans = new HashMap();
                beans.put("notaDeMeritoDTO", notaDeMeritoDTO);
                
                try {
                    transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
                } catch (InvalidFormatException e) {
                    throw new ServiceException("Exception in MeritoBS [updateFileTestPerformance] " + e.toString(), e);
                } catch (IOException e) {
                    throw new ServiceException("Exception in MeritoBS [updateFileTestPerformance] " + e.toString(), e);
                } catch (Exception e) {
                    throw new ServiceException("Exception in MeritoBS [updateFileTestPerformance] " + e.toString(), e);
                }
                notaDeMeritoDTO.setNombreArchivoErrores(nameFileXls);
                notaDeMeritoDTO.setRutaArchivoErrores(nombreArchivoXls);
            }
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [updateFileTestPerformance] " + e.toString(), e);
        } finally {
            super.persistence().get(CustomTdNmPlantillaDAO.class).deletePlantilla(remesa);
        }
        return notaDeMeritoDTO;
    }

    /** 
     * Metodo para validar el ingreso de una nota de mérito de forma manual de cualquier tipo de causal
     * @author Victor Pérez.
     * @param meritoManualDTO MeritoManualDTO
     * @return meritoManualDTO MeritoManualDTO
     */
    public MeritoManualDTO validProcessManually(MeritoManualDTO meritoManualDTO) {
        try {
            // Elimina los guiones del rfc
            if (meritoManualDTO.getTdNmhRfcUnico().contains("-")){
                meritoManualDTO.setTdNmhRfcUnico(meritoManualDTO.getTdNmhRfcUnico().replace("-", ""));}

            // Valida que el RFC exista en la quincena de validacion correspondiente
            List<CustomTdEmpleadoMerito> empleadoList = super.persistence().get(QueryTdEmpleadoDAO.class)
                                                                           .findEmpleadoByIdRfcYRfcUnicoEmpleado(meritoManualDTO.getTdNmhRfcUnico(), meritoManualDTO.getHpQnaPago());

            if (empleadoList != null && empleadoList.size() == 0) {
                meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.error.noExisteUsuario"));
                meritoManualDTO.setValidaNotaMeritoManual(true);
            } else {

                CustomTdEmpleadoMerito tdEmpleado = empleadoList.get(0);
                // Valida que sea un empleado opertativo
                if (!tdEmpleado.getJerarquia().equals(super.configuration().getString("nm", "atributo.jerarquia.operativo"))) {
                    meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.error.merito.no.es.operativo"));
                    meritoManualDTO.setValidaNotaMeritoManual(true);
                } else {
                    meritoManualDTO.setValidaNotaMeritoManual(false); //Condición para el DTO para que no valida que exista un archivo
                    meritoManualDTO.setIdPuesto(tdEmpleado.getIdPuestoPre());
                    meritoManualDTO.setIdNombramiento(tdEmpleado.getIdNombramiento());
                    meritoManualDTO.setIdGenero(tdEmpleado.getDescGenero());
                }
            }
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [validProcessManually] " + e.toString(), e);
        }
        return meritoManualDTO;
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico en forma manual a una remesa
     * @author Victor Pérez.
     * @param meritoManualDTO MeritoManualDTO
     * @return meritoManualDTO MeritoManualDTO
     */
    public MeritoManualDTO updateManually(MeritoManualDTO meritoManualDTO) {
        try {
            //String remesa = super.configuration().getString("nm", "sufix.remesa") + (meritoManualDTO.getTdNmhOp().length() > 1 ? meritoManualDTO.getTdNmhOp() : "0" + meritoManualDTO.getTdNmhOp()); // Concatenas la remesa máxima REM + 02
            
            if (meritoManualDTO.getTdNmhRfcUnico().contains("-")){
                meritoManualDTO.setTdNmhRfcUnico(meritoManualDTO.getTdNmhRfcUnico().replace("-", "")); }

            //Valida que el empleado este en la quincena de pago dada
            List<CustomTdEmpleadoMerito> empleadoList = super.persistence().get(QueryTdEmpleadoDAO.class)
                                                                           .findEmpleadoByIdRfcYRfcUnicoEmpleado(meritoManualDTO.getTdNmhRfcUnico(), meritoManualDTO.getHpQnaPago());
            if (empleadoList != null && empleadoList.size() == 0) {
                meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.error.noExisteUsuario"));
            } else {
                CustomTdEmpleadoMerito tdEmpleado = empleadoList.get(0);
                List<String> listaRfcs = new ArrayList<String>();
                listaRfcs.add(tdEmpleado.getRfcUnico());
                
                // Validacion rfc - causal - ciclo
                List<CustomTdNmHistorico> listaTdNmHistorico = super.persistence().get(QueryTdNmHistoricoDAO.class).findByRfcCausalCicloNotaMeritoHistorico(tdEmpleado.getRfcUnico(), 
                                                                                                                                            meritoManualDTO.getTdNmhCveCausal(), 
                                                                                                                                            meritoManualDTO.getTdNmhCiclo());
                if (listaTdNmHistorico != null && listaTdNmHistorico.size() >= 1) {
                    meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.error.merito.existe.mismo.anio"));
                } else {
                    // Consultas la nota de mérito del año anterior
                    List<CustomTdNmHistorico> listaTdNmHistoricoAnioAnterior = new ArrayList<CustomTdNmHistorico>();
                    if (meritoManualDTO.getTdNmhCveCausal().equals(NotaDeMeritoDTO.ID_CAUSAL_EVALUACION)) {

                        // Validacion remesa - causal - ciclo
                        listaTdNmHistoricoAnioAnterior = super.persistence().get(QueryTdNmHistoricoDAO.class).findNotaMeritoHistorico(meritoManualDTO.getTdNmhCveCausal(), meritoManualDTO.getTdNmhCiclo() - 1);
                    }
                    
                    // Si tiene nota de mérito del año anterior 
                    if (meritoManualDTO.getTdNmhCveCausal().equals(NotaDeMeritoDTO.ID_CAUSAL_EVALUACION) && 
                        listaTdNmHistoricoAnioAnterior != null && listaTdNmHistoricoAnioAnterior.size() >= 1) {
                        meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.error.merito.existe.mismo.anio.anterior"));
                    } else {
                        Date hoy = new Date();
                        TdNmHistoricoPK tdNmHistoricoPK = new TdNmHistoricoPK();
                        tdNmHistoricoPK.setNmhNumDocto(meritoManualDTO.getTdNmhNumDocto());
                        tdNmHistoricoPK.setNmhCiclo(meritoManualDTO.getTdNmhCiclo());
                        tdNmHistoricoPK.setNmhCausal(meritoManualDTO.getTdNmhCveCausal());
                        tdNmHistoricoPK.setNmhRfcUnico(tdEmpleado.getRfcUnico());
                        tdNmHistoricoPK.setNmhRfc(tdEmpleado.getRfcUnico());
                        
                        TdNmHistorico tdNmHistorico = new TdNmHistorico();
                        tdNmHistorico.setIdentity(tdNmHistoricoPK);
                        tdNmHistorico.setIdUnidad(tdEmpleado.getIdUnidadNom().toString());
                        tdNmHistorico.setUsuario(super.identity().get().getUserID());
                        tdNmHistorico.setFecModifico(hoy);
                        tdNmHistorico.setIdGenero(tdEmpleado.getIdGenero());
                        tdNmHistorico.setIdNivelPto(tdEmpleado.getIdNivelPto());
                        tdNmHistorico.setIdPlaza(tdEmpleado.getIdPlaza());
                        tdNmHistorico.setIdPuesto(tdEmpleado.getIdPuestoPre());
                        tdNmHistorico.setNmhCicloPago(null);
                        tdNmHistorico.setNmhFechaAgre(hoy);
                        tdNmHistorico.setNmhFechaReg(hoy);
                        tdNmHistorico.setNmhMesCurso(null);
                        tdNmHistorico.setNmhOp(meritoManualDTO.getTdNmhOp());
                        tdNmHistorico.setNmhQnaPagoValidar(meritoManualDTO.getHpQnaPago());
                        tdNmHistorico.setNmhTipoPlaza(meritoManualDTO.getIdNombramiento());

                        super.persistence().get(TdNmHistoricoDAO.class).save(tdNmHistorico); //Insertamos en el histórico
                        meritoManualDTO.setMensaje(super.configuration().getString("mensajesMeritoManual", "jxls.templates.manual.exito"));
                    }
                }
            }
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [updateManually] " + e.toString(), e);
        }
        return meritoManualDTO;
    }

    /** 
     * Metodo para generar el archivo de pago que se va hacia Nómina
     * @author Victor Pérez.
     * @param pagoMeritoDTO PagoMeritoDTO
     * @return pagoMeritoDTO PagoMeritoDTO
     */
    public PagoMeritoDTO generarArchivoPago(PagoMeritoDTO pagoMeritoDTO) {
        try {
            Integer maximoRemesaInternaPago = 0;
            
            List<CustomTdNmResumen> resumenList = super.persistence().get(QueryTdNmResumenDAO.class).findMaxRemesaInternaPagoMerito(pagoMeritoDTO.getTdNmhCiclo());
            
            if (resumenList != null && resumenList.size() >= 1) {
                CustomTdNmResumen customTdNmResumen = resumenList.get(0);
                if (customTdNmResumen != null && customTdNmResumen.getNmrRemesaInterna() != null) {
                    try {
                        maximoRemesaInternaPago = new Integer(customTdNmResumen.getNmrRemesaInterna().substring(5));
                    } catch (NumberFormatException e) {
                        maximoRemesaInternaPago = 0;
                    }
                }
                maximoRemesaInternaPago++;
            }
            
            String remesa = super.configuration().getString("nm", "sufix.remesa") + (pagoMeritoDTO.getTdNmhOp().length() > 1 ? pagoMeritoDTO.getTdNmhOp() : "0" + pagoMeritoDTO.getTdNmhOp());
            Formatter fmt = new Formatter();
            String remesaInterna = pagoMeritoDTO.getTdNmhCiclo() + fmt.format("%03d", maximoRemesaInternaPago).toString();
            super.persistence().get(CustomTdResumenDAO.class).updateRemesaInternaPagoMerito(remesaInterna, 
                                                                                            pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                            remesa, 
                                                                                            pagoMeritoDTO.getTdNmhCveCausal(), 
                                                                                            pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                            pagoMeritoDTO.getTdNmhCiclo());

            List<CustomTdNmResumen> customTdNmResumenList = super.persistence().get(QueryTdNmResumenDAO.class).selectRemesaInternaPagoMerito(pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                                 pagoMeritoDTO.getTdNmhCveCausal(), 
                                                                                                 remesa, 
                                                                                                 pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                                 pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                                 remesaInterna);
                                                                                                 
            List<CustomTdNmResumen> customTdNmResumenRechazosList = super.persistence().get(QueryTdNmResumenDAO.class).selectRemesaInternaPagoMeritoRechazos(
                                                                                            pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                            pagoMeritoDTO.getTdNmhCveCausal(), 
                                                                                            remesa, 
                                                                                            pagoMeritoDTO.getTdNmhCiclo(), 
                                                                                            pagoMeritoDTO.getTdNmhCveCausal(),
                                                                                            remesa);
            int c = 1;
            List<PagoMeritoDTO> resumen = new ArrayList<PagoMeritoDTO>();
            for (CustomTdNmResumen customTdNmResumen: customTdNmResumenList) {
                PagoMeritoDTO pagoMeritoDTOVO = super.transformation().map(customTdNmResumen, PagoMeritoDTO.class);
                pagoMeritoDTOVO.setConsecutivo(c++);
                resumen.add(pagoMeritoDTOVO);
            }
            
            int r = 1;
            List<PagoMeritoDTO> resumenR = new ArrayList<PagoMeritoDTO>();
            for (CustomTdNmResumen customTdNmResumenR: customTdNmResumenRechazosList) {
                PagoMeritoDTO pagoMeritoDTOVOR = super.transformation().map(customTdNmResumenR, PagoMeritoDTO.class);
                pagoMeritoDTOVOR.setConsecutivo(r++);
                resumenR.add(pagoMeritoDTOVOR);
            }

            pagoMeritoDTO.setResumenList(resumen);
            pagoMeritoDTO.setResumenRList(resumenR);


            // Genera el archivo segun el causal
            String nameFileXls  = "";
            String nameFileXlsR = "";
            String nombreArchivoXls = "";
            String nombreArchivoXlsR = "";
            String nombreArchivoPlantillaXls = "";
            String nombreArchivoPlantillaXlsR = "";
            
            if (pagoMeritoDTO.getTdNmhCveCausal().equals(pagoMeritoDTO.ID_CAUSAL_PUNTUALIDAD)) {
                String fecha = super.dateToString(new Date(), "yyyyMMddhhmmss").replace(" ", "");
                nameFileXls  = "pagoNMPuntualidad" + fecha + ".xlsx";
                nameFileXlsR = "pagoNMPuntualidadRechazos" + fecha + ".xlsx";
                nombreArchivoXls  = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
                nombreArchivoXlsR = super.configuration().getString("local.temp.dir") + File.separator + nameFileXlsR;
                nombreArchivoPlantillaXls  = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.xls.resultado.generacion.pago.puntualidad");
                nombreArchivoPlantillaXlsR = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.xls.resultado.generacion.pago.puntualidad.rechazos");
            }
            
            else if(pagoMeritoDTO.getTdNmhCveCausal().equals(pagoMeritoDTO.ID_CAUSAL_CAPACITACION)){
                String fecha = super.dateToString(new Date(), "yyyyMMddhhmmss").replace(" ", "");
                nameFileXls = "pagoNMCapacitacion" + fecha + ".xlsx";
                nameFileXlsR = "pagoNMCapacitacionRechazos" + fecha + ".xlsx";
                nombreArchivoXls  = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
                nombreArchivoXlsR = super.configuration().getString("local.temp.dir") + File.separator + nameFileXlsR;
                nombreArchivoPlantillaXls  = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.xls.resultado.generacion.pago.capacitacion");   
                nombreArchivoPlantillaXlsR = super.configuration().getString("notasmerito.templates.dir") + File.separator + super.configuration().getString("nm", "jxls.templates.xls.resultado.generacion.pago.capacitacion.rechazos");   
            }
            
            XLSTransformer transformer  = new XLSTransformer();
            XLSTransformer transformerR = new XLSTransformer();
            Map beans  = new HashMap();
            Map beansR = new HashMap();
            
            beans.put("pagoMeritoDTO", pagoMeritoDTO);
            beansR.put("pagoMeritoDTO", pagoMeritoDTO);
            
            try {
                transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
                transformerR.transformXLS(nombreArchivoPlantillaXlsR, beansR, nombreArchivoXlsR);
            } catch (InvalidFormatException e) {
                throw new ServiceException("Exception in MeritoBS [generarArchivoPago] " + e.toString(), e);
            } catch (IOException e) {
                throw new ServiceException("Exception in MeritoBS [generarArchivoPago] " + e.toString(), e);
            } catch (Exception e) {
                throw new ServiceException("Exception in MeritoBS [generarArchivoPago] " + e.toString(), e);
            }
            pagoMeritoDTO.setNombreArchivoErrores(nameFileXls);
            pagoMeritoDTO.setRutaArchivoErrores(nombreArchivoXls);
            
            pagoMeritoDTO.setNombreArchivoRechazos(nameFileXlsR);
            pagoMeritoDTO.setRutaArchivoRechazos(nombreArchivoXlsR);
            
        } catch (Exception e) {   throw new ServiceException("Exception in MeritoBS [generarArchivoPago] " + e.toString(), e);   }
        return pagoMeritoDTO;
        
    }

    /** 
     * Metodo para obtener la información del Empleado que se muestra en el detalle de 
     * @author Victor Pérez.
     * @param resumenMeritoDTO ResumenMeritoDTO
     * @return resumenMeritoDTO ResumenMeritoDTO
     */
    public ResumenMeritoDTO getEmpleadoInfoResumenMerito(ResumenMeritoDTO resumenMeritoDTO) {
        try {
            // Obtiene datos del empleado
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByRfcResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            CustomTdEmpleadoMerito customTdEmpleadoMerito = new CustomTdEmpleadoMerito();
            if (customTdEmpleadoMeritoList != null && customTdEmpleadoMeritoList.size() > 0) {
                customTdEmpleadoMerito = customTdEmpleadoMeritoList.get(0);
            }

            customTdEmpleadoMerito.setTdNmrRfc(resumenMeritoDTO.getTdNmrRfc());
            resumenMeritoDTO = super.transformation().map(customTdEmpleadoMerito, ResumenMeritoDTO.class);

            //Obtiene el monto del último pago de puntualidad
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoPuntualidadList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoUltimoPagoPuntualidadResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            
            if (customTdEmpleadoMeritoPuntualidadList != null && customTdEmpleadoMeritoPuntualidadList.size() > 0) {
                CustomTdEmpleadoMerito puntualidadVO = customTdEmpleadoMeritoPuntualidadList.get(0);
                resumenMeritoDTO.setUltimoPagoPuntualidad(puntualidadVO.getUltimoPagoPuntualidad());
            }

            //Obtiene el ultimo pago de consecuvitividad
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoConsecutividadList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoUltimoPagoConsecutividadResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            
            if (customTdEmpleadoMeritoConsecutividadList != null && 
                customTdEmpleadoMeritoConsecutividadList.size() > 0) {
                CustomTdEmpleadoMerito puntualidadConsecutividadVO = customTdEmpleadoMeritoConsecutividadList.get(0);
                resumenMeritoDTO.setUltimoPagoConsecutividad(puntualidadConsecutividadVO.getUltimoPagoConsecutividad());
            }
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [getEmpleadoInfoResumenMerito] " + e.toString(), e);
        }
        return resumenMeritoDTO;
    }

    /** 
     * Metodo para obtener la información del Empleado y la gráfica de Mérito en el ResumenMeritoDTO
     * @author Victor Pérez.
     * @param resumenMeritoDTO ResumenMeritoDTO
     * @return resumenMeritoDTO ResumenMeritoDTO
     */
    public ResumenMeritoDTO getEmpleadoInfoResumenGraficaMerito(ResumenMeritoDTO resumenMeritoDTO) {
        try {
            //Obtiene datos del empleado
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoByRfcResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            CustomTdEmpleadoMerito customTdEmpleadoMerito = new CustomTdEmpleadoMerito();
            
            if (customTdEmpleadoMeritoList != null && customTdEmpleadoMeritoList.size() > 0) {
                customTdEmpleadoMerito = customTdEmpleadoMeritoList.get(0);
            }

            customTdEmpleadoMerito.setTdNmrRfc(resumenMeritoDTO.getTdNmrRfc());
            resumenMeritoDTO = super.transformation().map(customTdEmpleadoMerito, ResumenMeritoDTO.class);

            //Obtiene el último pago de puntualidad
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoPuntualidadList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoUltimoPagoPuntualidadResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            
            if (customTdEmpleadoMeritoPuntualidadList != null && customTdEmpleadoMeritoPuntualidadList.size() > 0) {
                CustomTdEmpleadoMerito puntualidadVO = customTdEmpleadoMeritoPuntualidadList.get(0);
                resumenMeritoDTO.setUltimoPagoPuntualidad(puntualidadVO.getUltimoPagoPuntualidad());
            }
            
            // Obtiene el último pago de consecutividad
            List<CustomTdEmpleadoMerito> customTdEmpleadoMeritoConsecutividadList = super.persistence().get(QueryTdEmpleadoDAO.class).findEmpleadoUltimoPagoConsecutividadResumenMerito(resumenMeritoDTO.getTdNmrRfc());
            
            if (customTdEmpleadoMeritoConsecutividadList != null && customTdEmpleadoMeritoConsecutividadList.size() > 0) {
                CustomTdEmpleadoMerito puntualidadConsecutividadVO = customTdEmpleadoMeritoConsecutividadList.get(0);
                resumenMeritoDTO.setUltimoPagoConsecutividad(puntualidadConsecutividadVO.getUltimoPagoConsecutividad());
            }

            // Proceso para generar la gráfica de consecutividad
            //Obtiene los años consecutivos
            List<CustomTdNmHistorico> anosConsecutividadList = super.persistence().get(QueryTdNmHistoricoDAO.class).selectAnosConsecutividad(resumenMeritoDTO.getTdNmrRfc());

            //Obtiene los años consecutivos por causal
            List<CustomTdNmHistorico> anosConsecutividadYCausalList = super.persistence().get(QueryTdNmHistoricoDAO.class).selectAnosConsecutividadYCausal(resumenMeritoDTO.getTdNmrRfc());

            int consecutivo = 1, max = 0, min = 0;
            min = calculateMin(anosConsecutividadList); // Determina el año más pequeño
            max = calculateMax(anosConsecutividadList); // Determina el año más grande
            
            resumenMeritoDTO.setAnioIni(min);
            resumenMeritoDTO.setAnioFin(max);

            // Agrega un objeto de tipo EncabezadoConsecutividad que tiene como valores un consecutivo y el año
            for (int anio = min; anio <= max; anio++) {
                resumenMeritoDTO.getEncabezadoConsecutividadList().add(resumenMeritoDTO.getInstaceOfEncabezadoConsecutividad(consecutivo++, anio));
            }
            
            //Crea un hashmap para guardar los causales. Cada elemento (causal) tendrá un elemento de tipo Hashset. El HashSet indica si tiene o no puntualidad en ese año 
            HashMap mapCausal = new HashMap();
            mapCausal.put(ResumenMeritoDTO.ID_CAUSAL_PUNTUALIDAD, new HashSet());
            mapCausal.put(ResumenMeritoDTO.ID_CAUSAL_CAPACITACION, new HashSet());
            mapCausal.put(ResumenMeritoDTO.ID_CAUSAL_EVALUACION, new HashSet());
            
            for (CustomTdNmHistorico anosConsecutividadYCausal: anosConsecutividadYCausalList) {
                if (mapCausal.containsKey(anosConsecutividadYCausal.getNmhCausal())) {
                    HashSet setCilo = (HashSet)mapCausal.get(anosConsecutividadYCausal.getNmhCausal());
                    setCilo.add(anosConsecutividadYCausal.getNmhCiclo());
                }
            }

            // CReamos las instancias de Causal que son del tipo CausalConsecutividad especificando tipo de causal, nombre y color
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadPuntualidad = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_PUNTUALIDAD, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad.color"));
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadCapacitacion = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_CAPACITACION, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.capacitacion"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.capacitacion.color"));
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadEvaluacion = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_EVALUACION, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.evaluacion"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.evaluacion.color"));
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadOtros = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_OTROS, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.otros"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.otros.color"));
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadPuntualidadAcumulada = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_OTROS, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad.acumulado"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad.acumulado.color"));
            
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadAniosConsecutivos = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_OTROS, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.anios.consecutivos"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.anios.consecutivos.color"));
/*            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadPuntualidadMensualAcumulada = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_OTROS, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad.mensual.acumulado"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.puntualidad.mensual.acumulado.color"));*/
            ResumenMeritoDTO.CausalConsecutividad causalConsecutividadTotal = 
                resumenMeritoDTO.getInstanceOfCausalConsecutividad(ResumenMeritoDTO.ID_CAUSAL_OTROS, 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.total"), 
                                                                   super.message().get("sireh.label.merito.resumen.detalle.causal.total.color"));

            int indice = 0, suma = 0, sumaTotal = 0;
            boolean tienePuntualidad, tieneCapacitacion, tieneEvaluacion;
            int anioLimite      = new Integer(super.configuration().getString("nm", "merito.consecutividad.anio.limite.inferior")); // Para calcular a partir del 1990
            int newAnioLimite   = new Integer(super.configuration().getString("nm", "merito.consecutividad.new.anio.limite.inferior")); // Para calcular a partir del 2015
            
            
            
            for (int anio = min; anio <= max; anio++) {
                tienePuntualidad = false; // PAra cada año evalua si tiene nota de mérito para puntualidad
                tieneCapacitacion = false; // PAra cada año evalua si tiene nota de mérito para capacitación
                tieneEvaluacion = false; // PAra cada año evalua si tiene nota de mérito para evaluación de desempeño
                sumaTotal = 0;
                
                // obtenemos el HashSet de los años del causal de puntualidad
                // si contiene el año en cuestión lo ingresamos a la lista de causal de puntualidad creando un objeto de tipo PuntoCausalConsecutividad 
                // que tiene como valores el año, el valor del punto y si debe mostrar el valor.
                HashSet setCiloPuntualidad = (HashSet)mapCausal.get(ResumenMeritoDTO.ID_CAUSAL_PUNTUALIDAD);
                if (setCiloPuntualidad.contains(anio)) {
                    causalConsecutividadPuntualidad.getPuntoCausalConsecutividadList().add(resumenMeritoDTO
                                                    .getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.VALOR_CONSECUTIVIDAD, false));
                    tienePuntualidad = true;
                } else {
                    causalConsecutividadPuntualidad.getPuntoCausalConsecutividadList()
                                                   .add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, false));
                    tienePuntualidad = false;
                }

                HashSet setCiloCapacitacion = (HashSet)mapCausal.get(ResumenMeritoDTO.ID_CAUSAL_CAPACITACION);
                if (setCiloCapacitacion.contains(anio)) {
                    causalConsecutividadCapacitacion.getPuntoCausalConsecutividadList()
                                                    .add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.VALOR_CONSECUTIVIDAD, 
                                                                                                                                                    false));
                    tieneCapacitacion = true;
                } else {
                    causalConsecutividadCapacitacion.getPuntoCausalConsecutividadList()
                    .add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, false));
                    tieneCapacitacion = false;
                }

                HashSet setCiloEvaluacion = (HashSet)mapCausal.get(ResumenMeritoDTO.ID_CAUSAL_EVALUACION);
                if (setCiloEvaluacion.contains(anio)) {
                    causalConsecutividadEvaluacion.getPuntoCausalConsecutividadList().add(resumenMeritoDTO
                                                    .getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.VALOR_CONSECUTIVIDAD, false));
                    tieneEvaluacion = true;
                } else {
                    causalConsecutividadEvaluacion.getPuntoCausalConsecutividadList()
                                                    .add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, false));
                    tieneEvaluacion = false;
                }

                causalConsecutividadOtros.getPuntoCausalConsecutividadList().add(resumenMeritoDTO
                                                                            .getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, false));

                // Evaluamos tiene puntualidad, 
                // si año es mayor a 1990, 
                // y si es el primero la suma es el valor de consecutividad, 
                // si no es mayor al primero obtenemos el punto anterior, 
                // si este punto es igual a cero el valor será el valor de consecutividad y si no, 
                // sumamos el valor anterior más el valor de consecutividad
                     /******************** CAUSAL CONSECUTIVIDAD PUNTUALIDAD ACUMULADO *****************/
                     if (tienePuntualidad) {
                         if (anio >= anioLimite) {
                             if (indice > 0) {  
                                    PuntoCausalConsecutividad puntoCausalConsecutividad =  causalConsecutividadPuntualidadAcumulada.getPuntoCausalConsecutividadList().
                                                                                                                                    get(causalConsecutividadPuntualidadAcumulada.
                                                                                                                                    getPuntoCausalConsecutividadList().size() - 1);
                                                                                                
                                 if (puntoCausalConsecutividad.getPunto() == 0) {   suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;   } 
                                 else {   suma = puntoCausalConsecutividad.getPunto() + ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;   }
                             } else {   suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;   }
    
                             causalConsecutividadPuntualidadAcumulada.getPuntoCausalConsecutividadList().
                                                                        add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, suma, true));
                             sumaTotal += suma;
                         } else {   causalConsecutividadPuntualidadAcumulada.
                                                getPuntoCausalConsecutividadList().
                                                add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   }
    
                     } else {   causalConsecutividadPuntualidadAcumulada.
                                        getPuntoCausalConsecutividadList().
                                        add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   }
    
                 
                 /******************  CAUSAL CONSECUTIVIDAD AÑOS CONSECUTIVOS ************/ 
                 /***** 1990 - 2015 *****/
                 if(anio < newAnioLimite){
                    if(tienePuntualidad || tieneCapacitacion || tieneEvaluacion) {
                         if (indice > 0) {
                             PuntoCausalConsecutividad puntoCausalConsecutividad = causalConsecutividadAniosConsecutivos.getPuntoCausalConsecutividadList().
                                                                                                                        get(causalConsecutividadAniosConsecutivos.
                                                                                                                        getPuntoCausalConsecutividadList().size() - 1);
                             if (puntoCausalConsecutividad.getPunto() == 0) {    suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;  } 
                             else {   suma = puntoCausalConsecutividad.getPunto() + ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;   }
                         } else {  suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;  }
        
                         causalConsecutividadAniosConsecutivos.getPuntoCausalConsecutividadList().
                                                                add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, suma, true));
                         sumaTotal += suma;
                     } else {   causalConsecutividadAniosConsecutivos.
                                    getPuntoCausalConsecutividadList().
                                    add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   }
                 }
                 /***** 2015 - 9999 *****/
                 else if(anio >= newAnioLimite){
                    if(tieneCapacitacion){
                        if(indice > 0){
                            PuntoCausalConsecutividad puntoCausalConsecutividad = causalConsecutividadAniosConsecutivos.getPuntoCausalConsecutividadList().
                                                                                                                       get(causalConsecutividadAniosConsecutivos.
                                                                                                                       getPuntoCausalConsecutividadList().size() - 1);
                            if (puntoCausalConsecutividad.getPunto() == 0) {    suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;  } 
                            else {   suma = puntoCausalConsecutividad.getPunto() + ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;   }
                        } else {  suma = ResumenMeritoDTO.VALOR_CONSECUTIVIDAD;  }
                        causalConsecutividadAniosConsecutivos.getPuntoCausalConsecutividadList().
                                                               add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, suma, true));
                        sumaTotal += suma;
                    } else {   causalConsecutividadAniosConsecutivos.
                                    getPuntoCausalConsecutividadList().
                                    add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   }
                 }
                 
                 
                /**********************  CONSECUTIVIDAD PUNTUALIDAD MENSUAL ACUMULADO *****************
                 if (tienePuntualidad) {
                     if (anio >= anioLimite) {   
                         causalConsecutividadPuntualidadMensualAcumulada.getPuntoCausalConsecutividadList().add(resumenMeritoDTO.
                                                                getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.VALOR_CONSECUTIVIDAD_PUNTUALIDAD_MENSUAL, true));
                         sumaTotal += ResumenMeritoDTO.VALOR_CONSECUTIVIDAD_PUNTUALIDAD_MENSUAL;
                     } else {  causalConsecutividadPuntualidadMensualAcumulada.
                                    getPuntoCausalConsecutividadList().
                                    add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   }
                 } else {   causalConsecutividadPuntualidadMensualAcumulada.
                                getPuntoCausalConsecutividadList().
                                add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, ResumenMeritoDTO.SIN_VALOR_CONSECUTIVIDAD, true));   } */
    
                 causalConsecutividadTotal.getPuntoCausalConsecutividadList().
                                            add(resumenMeritoDTO.getInstanceOfPuntoCausalConsecutividad(anio, sumaTotal, true));
    
                 indice++;
             }

            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadPuntualidad);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadCapacitacion);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadEvaluacion);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadOtros);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadPuntualidadAcumulada);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadAniosConsecutivos);
            //resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadPuntualidadMensualAcumulada);
            resumenMeritoDTO.getCausalConsecutividadList().add(causalConsecutividadTotal);
        } catch (Exception e) {
            throw new ServiceException("Exception in MeritoBS [getEmpleadoInfoResumenMerito] " + e.toString(), e);
        }
    
    
        return resumenMeritoDTO;
    }

    /** 
     * Metodo para calcular el valor año máximo de la consulta derivada de los años que ha obtenido una nota de mérito un empleado específico
     * @author Victor Pérez.
     * @param anosConsecutividadList List<CustomTdNmHistorico>
     * @return int anioMaximo
     */
    private int calculateMax(List<CustomTdNmHistorico> anosConsecutividadList) {
        int max = 0;
        
        for (CustomTdNmHistorico customTdNmHistorico : anosConsecutividadList) {
            if (max < customTdNmHistorico.getNmhCiclo())
                max = customTdNmHistorico.getNmhCiclo();
        }
        return max;
    }

    /** 
     * Metodo para calcular el valor año mínimo de la consulta derivada de los años que ha obtenido una nota de mérito un empleado específico
     * @author Victor Pérez.
     * @param anosConsecutividadList List<CustomTdNmHistorico>
     * @return int anioMinimo
     */
    private int calculateMin(List<CustomTdNmHistorico> anosConsecutividadList) {
        int min = 0;
        
        if (anosConsecutividadList.size() > 0) {
            CustomTdNmHistorico customTdNmHistorico = anosConsecutividadList.get(0);
            min = customTdNmHistorico.getNmhCiclo();
        }
        
        for (CustomTdNmHistorico customTdNmHistorico : anosConsecutividadList) {
            if (min > customTdNmHistorico.getNmhCiclo()) 
                min = customTdNmHistorico.getNmhCiclo();
        }
        return min;
    }

    /** 
     * Metodo para llama a la función PKG_Notas_Merito.NM_CALCULO_CONSE que realiza el ingreso en la tabla de resumén realizando el cálculo de la consecutividad
     * @author Victor Pérez.
     * @param procesoNmDTO ProcesoNmDTO
     * @return procesoNmDTO ProcesoNmDTO
     */
    public ProcesoNmDTO updateProcesoNM(ProcesoNmDTO procesoNmDTO, String usuario) {
        procesoNmDTO.setRegreso(0);
        try {
            updateRfcProcesoNm();
            int regreso = super.persistence().get(CustomTdResumenDAO.class).updateProcesoNm(procesoNmDTO.getTdNmrCiclo(), procesoNmDTO.getTdNmrOp(), procesoNmDTO.getTdNmrCveCausal(), usuario);
            procesoNmDTO.setRegreso(regreso);

        } catch (ServiceException e) {
            procesoNmDTO.setRegreso(0);
        }
        return procesoNmDTO;
    }
}
