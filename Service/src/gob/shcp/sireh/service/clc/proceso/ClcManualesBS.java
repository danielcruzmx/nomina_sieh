package gob.shcp.sireh.service.clc.proceso;

import gob.shcp.fsn.service.ServiceException;

import gob.shcp.sireh.data.jdbc.TcPartidaDAO;
import gob.shcp.sireh.data.jdbc.TcTipoNominaDAO;
import gob.shcp.sireh.data.jdbc.TdCxlcDAO;
import gob.shcp.sireh.data.jdbc.TdSecCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdSecCxlcDAO;

import gob.shcp.sireh.domain.jdbc.TcPartida;
import gob.shcp.sireh.domain.jdbc.TcTipoNomina;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdCxlcPK;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlcPK;

import gob.shcp.sireh.model.TdSecCxlcDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesArchivoDTO;
import gob.shcp.sireh.model.clc.proceso.ClcManualesCapturaDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.parser.support.ParserXls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * Business Service encargado de atender solicitudes correspondientes a CLC Manuales.
 */
public class ClcManualesBS extends AbstractSirehService implements ClcManualesService {

    //public static final String EXPRESION_REGULAR_VALIDACION_UNIDAD = "[0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ESTADO = "[0-9]{1,2}$";
    //public static final String EXPRESION_REGULAR_VALIDACION_MONTO = "^(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d{0,2})?$";
    public static final String EXPRESION_REGULAR_VALIDACION_MONTO = "^(([1-9]\\d{0,12}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d{0,13})?$";
    public static final String EXPRESION_REGULAR_VALIDACION_PARTIDA = "[0-9]{1,5}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_CPTO = "[A-Z0-9]{1,2}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_MOVTO = "[0-9]{1,3}$";
    
    /**
     * Procesa Manuales - Metodo encargado de obtener la clave presupuestal con base en el tipo de nomina
     * @author Oscar S.
     * @param idTipoNomina String
     * @return String
     */
    public String getClavePresupuestalByTipoNomina(String idTipoNomina) {
        TcTipoNomina tcTipoNomina = super.persistence().get(TcTipoNominaDAO.class).getById(idTipoNomina);
        return tcTipoNomina.getTipoNomPresupuestal();
    }
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de clc en el rango de las 5000
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    public Integer getMaxCxlcManuales(Integer cxlcCiclo) {
        List<TdCxlc> tdCxlc = super.persistence().get(CustomTdCxlcDAO.class).getMaxCxlcManuales(cxlcCiclo);
        return tdCxlc.get(0).getCxlc();
    }
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maximo de secuencia
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    public Integer getMaxSecCxlcManuales(Integer cxlcCiclo) {
        List<TdSecCxlc> tdCxlc = super.persistence().get(CustomTdSecCxlcDAO.class).getMaxSecCxlcManuales(cxlcCiclo);
        return tdCxlc.get(0).getSecCxlc();
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar la cxlc
     * @author Oscar S.
     * @param clcManualesCapturaDTO clcManualesDTO
     * @param clavePresupuestal String
     * @param usuario String
     */
    public void createClcManuales(ClcManualesCapturaDTO clcManualesCapturaDTO, String clavePresupuestal, String usuario) {
        // Obtener posicion de la unidad
        Integer unidadSeleccionada = clcManualesCapturaDTO.getUnidad();
        String stringUnidad = getElemClavepresupuestal(clavePresupuestal, "unidad");
        
        int posicion = getPosicion(stringUnidad, String.valueOf(unidadSeleccionada));
        logger.debug("posicion de la unidad -------> " + posicion);
        
        // Paso 1) Preparar objeto cxlc
        TdCxlc cxlc = new TdCxlc();
        TdCxlcPK pk = new TdCxlcPK();
        pk.setCxlc(clcManualesCapturaDTO.getNumCxlc());
        pk.setCxlcCiclo(clcManualesCapturaDTO.getCiclo());
        cxlc.setIdentity(pk);
        
        cxlc.setCxlc(clcManualesCapturaDTO.getNumCxlc());
        cxlc.setCxlcCiclo(clcManualesCapturaDTO.getCiclo());
        
        cxlc.setIdTipoNomina(clcManualesCapturaDTO.getTipoNomina());
        cxlc.setCxlcComplemento(0);
        cxlc.setCxlcMonto(clcManualesCapturaDTO.getImporte());
        cxlc.setCxlcQnaPago(clcManualesCapturaDTO.getQnaCaptura());
        cxlc.setCxlcSiaff(0);
        cxlc.setCxlcSituacion("D"); // TODO: Se actualiza a peticion  de Carlos de la Rosa
        cxlc.setFecModifico(new Date());
        cxlc.setUsuario(usuario);
        cxlc.setCxlcCompromiso(0L);
        cxlc.setCxlcConciliaSicop(0);
        cxlc.setCxlcDevengado(0L);
        cxlc.setCxlcIva(clcManualesCapturaDTO.getIva());
        cxlc.setCxlcMaestroPto(0);
        cxlc.setCxlcNota(clcManualesCapturaDTO.getNota());
        cxlc.setCxlcRectifica(0);
        cxlc.setCxlcTipoProceso("MANUAL");
        cxlc.setCxlcParametros("");
        
        // Paso 2) Insertar objeto cxlc
        super.persistence().get(TdCxlcDAO.class).save(cxlc);
        
        // Paso 3) Preparar objeto secCxlc
        TdSecCxlc secCxlc = new TdSecCxlc();
        
        TdSecCxlcPK pk2 = new TdSecCxlcPK();
        pk2.setCxlc(clcManualesCapturaDTO.getNumCxlc());
        pk2.setSecCxlcCiclo(clcManualesCapturaDTO.getCiclo());
        pk2.setSecCxlc(clcManualesCapturaDTO.getSecuencia());// TODO: Verify
        secCxlc.setIdentity(pk2);
        
        secCxlc.setCxlc(clcManualesCapturaDTO.getNumCxlc());
        secCxlc.setSecCxlcCiclo(clcManualesCapturaDTO.getCiclo());
        secCxlc.setSecCxlc(clcManualesCapturaDTO.getSecuencia());// TODO: Verify
        
        secCxlc.setIdActInsti(getElemClavepresupuestal(clavePresupuestal, "actInst") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInst"), posicion) : "");
        secCxlc.setIdActPriorita(getElemClavepresupuestal(clavePresupuestal, "actInstPri") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInstPri"), posicion) : "");
        secCxlc.setIdActInstiEsp(getElemClavepresupuestal(clavePresupuestal, "actInstEsp") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "actInstEsp"), posicion) : "");
        secCxlc.setIdEdo(getElemClavepresupuestal(clavePresupuestal, "estado") != null ? new Integer(getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "estado"), posicion)) : 0);
        secCxlc.setIdFuncion(getElemClavepresupuestal(clavePresupuestal, "funcion") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "funcion"), posicion) : "");
        secCxlc.setIdPrograma(getElemClavepresupuestal(clavePresupuestal, "programa") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "programa"), posicion) : "");
        secCxlc.setIdUnidad(String.valueOf(clcManualesCapturaDTO.getUnidad()));
        secCxlc.setIdUnidadEjecuto(getElemClavepresupuestal(clavePresupuestal, "ejecutora") != null ? getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "ejecutora"), posicion) : "");
        secCxlc.setSecGuiaContableEjer(0);
        secCxlc.setFecModifico(new Date());
        secCxlc.setUsuario(usuario);
        secCxlc.setIdFuenteFinan(getElemClavepresupuestal(clavePresupuestal, "fuente") != null ? new Integer(getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "fuente"), posicion)) : 0);
        
        String idPartida = String.valueOf(clcManualesCapturaDTO.getPartida());
        if (idPartida.equals("12201")) {
            secCxlc.setIdGrupopago("V");
        } else {
            secCxlc.setIdGrupopago("E");
        }
        secCxlc.setIdPartida(idPartida);
        secCxlc.setIdSindicato(0);
        secCxlc.setIdTipoGasto(getElemClavepresupuestal(clavePresupuestal, "tipoGasto") != null ? new Integer(getElementPosicion(getElemClavepresupuestal(clavePresupuestal, "tipoGasto"), posicion)) : 0);
        secCxlc.setSecClaveMov("");
        secCxlc.setSecCompromiso("");
        secCxlc.setSecCtaClabe("");
        secCxlc.setSecCxlcSiaff(0L);
        secCxlc.setSecCxlcTerceros(0);
        secCxlc.setSecDevengado(0L);
        secCxlc.setSecFecExtraSicop(null);
        secCxlc.setSecMonto(clcManualesCapturaDTO.getImporte());
        secCxlc.setSecQnaApli(0);
        secCxlc.setSecSiaff(0);
        secCxlc.setSecTerceros(0);
        
        // Concepto Movto y Tipo Concepto
        TcTipoNomina nomina = super.persistence().get(TcTipoNominaDAO.class).getById(clcManualesCapturaDTO.getTipoNomina());
        secCxlc.setSecCptoMovto(nomina.getTipoNomMovto());// TODO: Se actualiza a peticion  de Carlos de la Rosa
        secCxlc.setSecTipoCpto(nomina.getTipoNomCpto());
        
        // Paso 4) Insertar objeto secCxlc
        super.persistence().get(TdSecCxlcDAO.class).save(secCxlc);
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
    
    private List<String> splitAsList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);
        return Arrays.asList(arreglo);
    }
    
    /**
     * Procesa Manual - Metodo encargado de procesar el archivo de la cxlc manual vs plantilla - Fondo
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @return clcManualesArchivoDTO ClcManualesArchivoDTO
     */
    public ClcManualesArchivoDTO processFileClcManual(ClcManualesArchivoDTO clcManualesArchivoDTO) {
        clcManualesArchivoDTO.setPlantillaErronea(false);
        
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
        clcManualesArchivoDTO.setAnio(anio);
        
        boolean archivoValido = false;
        String usuario = super.identity().get().getName();
        
        try {
            clcManualesArchivoDTO.setListaClcManualCorrecta(new ArrayList<ClcManualesArchivoDTO>());
            clcManualesArchivoDTO.setListaClcManualIncorrecta(new HashSet<ClcManualesArchivoDTO>());
            
            String templateFileXml = super.configuration().getString("clc.templates.dir") + 
                                     File.separator + 
                                     super.configuration().getString("clcManualArchivo", "jxls.templates.manualArchivo");

            InputStream inputStreamXls = clcManualesArchivoDTO.getFile().getInputStream();
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            
            List<ClcManualesArchivoDTO> listClcManualesArchivoDTO = parserXls.parseFile(inputStreamXls, ClcManualesArchivoDTO.class);
            
            if (!(parserXls.getEncabezadoDTO().getA().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.unidad")) && 
                  parserXls.getEncabezadoDTO().getB().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.estado")) && 
                  parserXls.getEncabezadoDTO().getC().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.monto")) && 
                  parserXls.getEncabezadoDTO().getD().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.partida")) && 
                  parserXls.getEncabezadoDTO().getE().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.tipoCpto")) && 
                  parserXls.getEncabezadoDTO().getF().equals(super.configuration().getString("clcManualArchivo", "jxls.templates.evaluacion.encabezado.manualArchivo.tipoMovto")))) {
                clcManualesArchivoDTO.setPlantillaErronea(true);
                return clcManualesArchivoDTO;
            }
            
            if (listClcManualesArchivoDTO != null && listClcManualesArchivoDTO.size() == 0) {
                clcManualesArchivoDTO.setPlantillaErronea(true);
                return clcManualesArchivoDTO;
            }
            
            // Validaciones
            clcManualesArchivoDTO = processValidaDatosPlantilla(listClcManualesArchivoDTO, clcManualesArchivoDTO);
            
            // Verifica si el archivo es valido
            clcManualesArchivoDTO.setArchivoValido(clcManualesArchivoDTO.getListaClcManualIncorrecta().size() == 0);
            
            Set<ClcManualesArchivoDTO> listaErrores = new HashSet<ClcManualesArchivoDTO>();
            if (clcManualesArchivoDTO.getListaClcManualIncorrecta().size() > 0) {
                listaErrores.addAll(clcManualesArchivoDTO.getListaClcManualIncorrecta());
            }
            listaErrores.addAll(clcManualesArchivoDTO.getListaClcManualCorrecta());
            clcManualesArchivoDTO.setListaErrores(listaErrores);
            
            String nameFileXls = clcManualesArchivoDTO.getNombreArchivoErrores();
            String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = super.configuration().getString("clc.templates.dir") + 
                                               File.separator + 
                                               super.configuration().getString("clcManualArchivo", "jxls.templates.xls.manualArchivo");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("clcManualesArchivoDTO", clcManualesArchivoDTO);
            
            try {
                transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
            } catch (InvalidFormatException e) {
                throw new ServiceException("ServiceException in ClcManualesBS [processFileClcManual] " + e.toString(), e);
            } catch (IOException e) {
                throw new ServiceException("ServiceException in ClcManualesBS [processFileClcManual] " + e.toString(), e);
            }
            clcManualesArchivoDTO.setNombreArchivoErrores(nameFileXls);
        } catch (ServiceException e) {
            throw new ServiceException("ServiceException in ClcManualesBS [processFileClcManual] " + e.toString(), e);
        } catch (Exception e) {
            throw new ServiceException("Exception in ClcManualesBS [processFileClcManual] " + e.toString(), e);
        } finally {
        }
        return clcManualesArchivoDTO;
    }
    
    /**
     * Procesa Manual - Metodo encargado de procesar y validar el archivo de la cxlc manual vs plantilla - Forma
     * @author Oscar S.
     * @param listClcManualesArchivoDTO List<ClcManualesArchivoDTO>
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @return clcManualesArchivoDTO ClcManualesArchivoDTO
     */
    private ClcManualesArchivoDTO processValidaDatosPlantilla(List<ClcManualesArchivoDTO> listClcManualesArchivoDTO, ClcManualesArchivoDTO clcManualesArchivoDTO) {
        Set<ClcManualesArchivoDTO> listaClcManualIncorrecta = new HashSet<ClcManualesArchivoDTO>();
        List<ClcManualesArchivoDTO> listaClcManualCorrecta = new ArrayList<ClcManualesArchivoDTO>();

        try {
            Pattern pat = null;
            Matcher mat = null;
            Calendar f = Calendar.getInstance();
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date());
            int anio = hoy.get(Calendar.YEAR);
            Boolean errorValidacionDatos = false;
            
            // Lista de unidades
            List<String> unidades = super.persistence().get(CustomTdCxlcDAO.class).getListaUnidades(clcManualesArchivoDTO.getCiclo());
            
            // Lista partidas
            List<TcPartida> listaPartidas = super.persistence().get(TcPartidaDAO.class).findAll();
            List<String> partidas = new ArrayList<String>();
            for (TcPartida partida : listaPartidas ) {
                partidas.add(String.valueOf(partida.getIdPartida()));
            }
            
            TcTipoNomina tcTipoNomina = super.persistence().get(TcTipoNominaDAO.class).getById(clcManualesArchivoDTO.getTipoNomina());
            /* Lista conceptos
            List<String> conceptos = new ArrayList<String>();
            
            Lista movimientos
            List<String> movimientos = new ArrayList<String>();
            
            for (TcTipoNomina tipos : listaTiposNomina) {
                conceptos.add(tipos.getTipoNomCpto());
                movimientos.add(tipos.getTipoNomMovto());
            }*/
             
            for (ClcManualesArchivoDTO clcManualesArchivoDTOVo : listClcManualesArchivoDTO) {
                errorValidacionDatos = false;
                StringBuffer buffer = new StringBuffer(super.configuration().getString("clcManualArchivo", "validacion.datos.validacion.datos"));
                
                // UNIDAD

                if (clcManualesArchivoDTOVo.getUnidadArchivo() != null) {
                    if (!unidades.contains(clcManualesArchivoDTOVo.getUnidadArchivo())) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", 
                                                                      "validacion.datos.unidad.catalogo"));
                        logger.debug("Unidad no existe en el catalogo -> " + clcManualesArchivoDTOVo.getUnidadArchivo());
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.unidad"));
                    logger.debug("Unidad incorrecta -> " + clcManualesArchivoDTOVo.getUnidadArchivo());
                }
                
                // ESTADO
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ESTADO);
                if (clcManualesArchivoDTOVo.getEstadoArchivo() != null) {
                    mat = pat.matcher(clcManualesArchivoDTOVo.getEstadoArchivo());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.estado"));
                        logger.debug("Estado incorrecto -> " + clcManualesArchivoDTOVo.getEstadoArchivo());
                    } else {
                        // Lista de estados
                        List<String> estados = super.persistence().get(CustomTdCxlcDAO.class).getListaEstados(clcManualesArchivoDTOVo.getUnidadArchivo(), clcManualesArchivoDTO.getCiclo());
                        if (!estados.contains(clcManualesArchivoDTOVo.getEstadoArchivo())) {
                            errorValidacionDatos = true;
                            buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.estado.catalogo"));
                            logger.debug("Estado no existe en el catalogo -> " + clcManualesArchivoDTOVo.getEstadoArchivo() + "-" + clcManualesArchivoDTOVo.getUnidadArchivo());
                        }
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.estado"));
                    logger.debug("Estado incorrecto -> " + clcManualesArchivoDTOVo.getEstadoArchivo());
                }
                
                // MONTO
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_MONTO);
                if (clcManualesArchivoDTOVo.getMontoArchivo() != null) {
                    mat = pat.matcher(clcManualesArchivoDTOVo.getMontoArchivo());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.monto"));
                        logger.debug("Monto incorrecto -> " + clcManualesArchivoDTOVo.getMontoArchivo());
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.monto"));
                    logger.debug("Monto incorrecto -> " + clcManualesArchivoDTOVo.getMontoArchivo());
                }
                
                // PARTIDA
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_PARTIDA);
                if (clcManualesArchivoDTOVo.getPartidaArchivo() != null) {
                    mat = pat.matcher(clcManualesArchivoDTOVo.getPartidaArchivo());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.partida"));
                        logger.debug("Partida incorrecta -> " + clcManualesArchivoDTOVo.getPartidaArchivo());
                    } else {
                        if (!partidas.contains(clcManualesArchivoDTOVo.getPartidaArchivo())) {
                            errorValidacionDatos = true;
                            buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.partida.catalogo"));
                            logger.debug("Partida no existe en el catalogo -> " + clcManualesArchivoDTOVo.getPartidaArchivo());
                        }
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.partida"));
                    logger.debug("Partida incorrecta -> " + clcManualesArchivoDTOVo.getPartidaArchivo());
                }
                
                if (clcManualesArchivoDTO.getTipoNomina().equals("IS") || clcManualesArchivoDTO.getTipoNomina().equals("IT")) {
                    // TIPO_CPTO
                    pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO_CPTO);
                    if (clcManualesArchivoDTOVo.getTipoCptoArchivo() != null) {
                        mat = pat.matcher(clcManualesArchivoDTOVo.getTipoCptoArchivo());
                        if (mat != null && !mat.matches()) {
                            errorValidacionDatos = true;
                            buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoCpto"));
                            logger.debug("Tipo concepto incorrecto -> " + clcManualesArchivoDTOVo.getTipoCptoArchivo());
                        } else {
                            if (!tcTipoNomina.getTipoNomCpto().equals(clcManualesArchivoDTOVo.getTipoCptoArchivo())) {
                                errorValidacionDatos = true;
                                buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoCpto.catalogo"));
                                logger.debug("Tipo concepto no existe en el catalogo -> " + clcManualesArchivoDTOVo.getTipoCptoArchivo());
                            }
                        }
                    } else {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoCpto"));
                        logger.debug("Tipo concepto incorrecto -> " + clcManualesArchivoDTOVo.getTipoCptoArchivo());
                    }
                    
                    // TIPO_MOVTO
                    pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO_MOVTO);
                    if (clcManualesArchivoDTOVo.getTipoMovtoArchivo() != null) {
                        mat = pat.matcher(clcManualesArchivoDTOVo.getTipoMovtoArchivo());
                        if (mat != null && !mat.matches()) {
                            errorValidacionDatos = true;
                            buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoMovto"));
                            logger.debug("Tipo movimiento incorrecto -> " + clcManualesArchivoDTOVo.getTipoMovtoArchivo());
                        } else {
                            if (!tcTipoNomina.getTipoNomMovto().equals(clcManualesArchivoDTOVo.getTipoMovtoArchivo())) {
                                errorValidacionDatos = true;
                                buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoMovto.catalogo"));
                                logger.debug("Tipo movimiento no existe en el catalogo -> " + clcManualesArchivoDTOVo.getTipoMovtoArchivo());
                            }
                        }
                    } else {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.tipoMovto"));
                        logger.debug("Tipo movimiento incorrecto -> " + clcManualesArchivoDTOVo.getTipoMovtoArchivo());
                    }
                }
                
                // Valida Clave presupuestal
                try {
                    List<TdSecCxlc> pivote = super.persistence().get(CustomTdSecCxlcDAO.class).getSecCxlcManualArchivo(clcManualesArchivoDTO.getCiclo(), 
                                                                                                                       clcManualesArchivoDTOVo.getUnidadArchivo(), 
                                                                                                                       clcManualesArchivoDTOVo.getPartidaArchivo(), 
                                                                                                                       clcManualesArchivoDTOVo.getEstadoArchivo());
                    pivote.get(0);
                } catch (Exception e) {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("clcManualArchivo", "validacion.datos.cvePresupuestal.catalogo"));
                    logger.debug("Clave presupuestal invalida -> " + clcManualesArchivoDTOVo.getCiclo() + "|" + 
                                                                     clcManualesArchivoDTOVo.getUnidadArchivo() + "|" + 
                                                                     clcManualesArchivoDTOVo.getPartidaArchivo() + "|" + 
                                                                     clcManualesArchivoDTOVo.getEstadoArchivo());
                }
                
                if (!errorValidacionDatos) {
                    listaClcManualCorrecta.add(clcManualesArchivoDTOVo);
                } else {
                    clcManualesArchivoDTOVo.setMensaje(buffer.toString());
                    listaClcManualIncorrecta.add(clcManualesArchivoDTOVo);
                }
            }
            
            clcManualesArchivoDTO.setListaClcManualCorrecta(listaClcManualCorrecta);
            clcManualesArchivoDTO.setListaClcManualIncorrecta(listaClcManualIncorrecta);
        } catch (Exception e) {
            throw new ServiceException("Exception in ClcManualesBS [processValidaDatosPlantilla] " + e.toString(), e);
        }
        return clcManualesArchivoDTO;
    }
    
    /**
     * Procesa Manual - Metodo encargado de guardar cabecera y secuencias de la cxlc manual
     * @author Oscar S.
     * @param clcManualesArchivoDTO ClcManualesArchivoDTO
     * @param usuario String
     */
    public void createClcManualesArchivo(ClcManualesArchivoDTO clcManualesArchivoDTO, String usuario) {
        // Paso 1) Obtener el monto total
        String[] secuencias = clcManualesArchivoDTO.getSecuenciaGrupo();
        Double montoTotal = 0.00;
        for (String secuencia: secuencias) {
            if(secuencia == null || secuencia.length() <= 0){
                break;
            }
            String[] result = secuencia.split("\\|");
            montoTotal += new Double(result[2]);
        }
        
        // Paso 2) Preparar objeto cxlc
        TdCxlc cxlc = new TdCxlc();
        TdCxlcPK pk = new TdCxlcPK();
        pk.setCxlc(clcManualesArchivoDTO.getNumCxlc());
        pk.setCxlcCiclo(clcManualesArchivoDTO.getCiclo());
        cxlc.setIdentity(pk);
        
        cxlc.setCxlc(clcManualesArchivoDTO.getNumCxlc());
        cxlc.setCxlcCiclo(clcManualesArchivoDTO.getCiclo());
        
        cxlc.setIdTipoNomina(clcManualesArchivoDTO.getTipoNomina());
        cxlc.setCxlcComplemento(clcManualesArchivoDTO.getComplemento());
        cxlc.setCxlcMonto(montoTotal);
        cxlc.setCxlcQnaPago(clcManualesArchivoDTO.getQnaAplicacion());
        cxlc.setCxlcSiaff(0);
        cxlc.setCxlcSituacion("D"); // TODO: Se actualiza a peticion de Carlos de la Rosa
        cxlc.setFecModifico(new Date());
        cxlc.setUsuario(usuario);
        cxlc.setCxlcCompromiso(0L);
        cxlc.setCxlcConciliaSicop(0);
        cxlc.setCxlcDevengado(0L);
        cxlc.setCxlcIva(0.0);
        cxlc.setCxlcMaestroPto(0);
        cxlc.setCxlcNota("MANUAL ACHIVO");
        cxlc.setCxlcRectifica(0);
        cxlc.setCxlcTipoProceso("MANUAL ARCHIVO");
        cxlc.setCxlcParametros("");
        
        // Paso 3) Insertar objeto cxlc
        super.persistence().get(TdCxlcDAO.class).save(cxlc);
        
        // Paso 4) Obtener las secuencias seleccionadas
        int contador = 1;
        for (String secuencia: secuencias) {
            if(secuencia == null || secuencia.length() <= 0){
                break;
            }
            String[] result = secuencia.split("\\|");
            
            String unidadArchivo = result[0];
            String estadoArchivo = result[1];
            String montoArchivo = result[2];
            String partidaArchivo = result[3];
            String tipoCptoArchivo = result[4];
            String tipoMovtoArchivo = result[5];
            
            // Paso 5) Obtener secuencia pivote - tabla de presupuesto
            List<TdSecCxlc> pivote = super.persistence().get(CustomTdSecCxlcDAO.class).getSecCxlcManualArchivo(clcManualesArchivoDTO.getCiclo(), unidadArchivo, partidaArchivo, estadoArchivo);
            TdSecCxlc tdSecCxlc = pivote.get(0);
            
            // Paso 6) Preparar objeto secCxlc
            TdSecCxlc secCxlc = new TdSecCxlc();
            
            TdSecCxlcPK pk2 = new TdSecCxlcPK();
            pk2.setCxlc(clcManualesArchivoDTO.getNumCxlc());
            pk2.setSecCxlcCiclo(clcManualesArchivoDTO.getCiclo());
            pk2.setSecCxlc(contador);
            secCxlc.setIdentity(pk2);
            
            secCxlc.setCxlc(clcManualesArchivoDTO.getNumCxlc());
            secCxlc.setSecCxlcCiclo(clcManualesArchivoDTO.getCiclo());
            secCxlc.setSecCxlc(contador);
            
            secCxlc.setIdActInsti(tdSecCxlc.getIdActInsti());
            secCxlc.setIdActPriorita(tdSecCxlc.getIdActPriorita());
            
            // Caso especial - Partida
            //String idPartida = String.valueOf(clcManualesArchivoDTO.getPartidaCaptura());
             
            if (clcManualesArchivoDTO.getTipoNomina().equals("NS") && partidaArchivo.equals("14401")) {
                secCxlc.setIdActInstiEsp( clcManualesArchivoDTO.getPlurianual() );
            } else if (clcManualesArchivoDTO.getTipoNomina().equals("SC") && partidaArchivo.equals("14405")) {
                secCxlc.setIdActInstiEsp( clcManualesArchivoDTO.getPlurianual() );
            } else if (clcManualesArchivoDTO.getTipoNomina().equals("GM") && partidaArchivo.equals("14403")) {
                secCxlc.setIdActInstiEsp( clcManualesArchivoDTO.getPlurianual() );
            } else if (clcManualesArchivoDTO.getTipoNomina().equals("MD") && partidaArchivo.equals("14401")) {
                secCxlc.setIdActInstiEsp( clcManualesArchivoDTO.getPlurianual() );
            } else {
                secCxlc.setIdActInstiEsp(tdSecCxlc.getIdActInstiEsp());
            }
            secCxlc.setIdEdo(tdSecCxlc.getIdEdo());
            secCxlc.setIdFuncion(tdSecCxlc.getIdFuncion());
            secCxlc.setIdPrograma(tdSecCxlc.getIdPrograma());
            secCxlc.setIdUnidad(tdSecCxlc.getIdUnidad());
            secCxlc.setIdUnidadEjecuto(tdSecCxlc.getIdUnidadEjecuto());
            secCxlc.setSecGuiaContableEjer(0);
            secCxlc.setFecModifico(new Date());
            secCxlc.setUsuario(usuario);
            secCxlc.setIdFuenteFinan(tdSecCxlc.getIdFuenteFinan());
            
            // Partida
            if (partidaArchivo.equals("12201")) {
                secCxlc.setIdGrupopago("V");
            } else {
                secCxlc.setIdGrupopago("E");
            }
            secCxlc.setIdPartida(partidaArchivo);
            secCxlc.setIdSindicato(0);
            secCxlc.setIdTipoGasto(tdSecCxlc.getIdTipoGasto());
            secCxlc.setSecClaveMov("");
            secCxlc.setSecCompromiso("");
            
            secCxlc.setSecCtaClabe("0");
            secCxlc.setSecCxlcSiaff(0L);
            secCxlc.setSecCxlcTerceros(0);
            secCxlc.setSecDevengado(0L);
            secCxlc.setSecFecExtraSicop(null);
            secCxlc.setSecMonto(new Double(montoArchivo));
            secCxlc.setSecQnaApli(clcManualesArchivoDTO.getQnaAplicacion());
            secCxlc.setSecSiaff(0);
            secCxlc.setSecTerceros(0);
            
            // Concepto Movto y Tipo Concepto
            if (clcManualesArchivoDTO.getTipoNomina().equals("IS") || clcManualesArchivoDTO.getTipoNomina().equals("IT")) {
                secCxlc.setSecCptoMovto(tipoMovtoArchivo);
                secCxlc.setSecTipoCpto(tipoCptoArchivo);
            } else {
                TcTipoNomina nomina = super.persistence().get(TcTipoNominaDAO.class).getById(clcManualesArchivoDTO.getTipoNomina());
                secCxlc.setSecCptoMovto(nomina.getTipoNomMovto());// TODO: Se actualiza a peticion  de Carlos de la Rosa
                secCxlc.setSecTipoCpto(nomina.getTipoNomCpto());
            }
            
            // Paso 7) Insertar objeto secCxlc
            super.persistence().get(TdSecCxlcDAO.class).save(secCxlc);
            
            contador++;
        }
    }
    
    public TdSecCxlcDTO getClavePresupuestal(Integer ciclo, String unidad, String partida, String estado) {
        List<TdSecCxlc> pivote = super.persistence().get(CustomTdSecCxlcDAO.class).getSecCxlcManualArchivo(ciclo, unidad, partida, estado);
        return super.transformation().map( pivote.get(0), TdSecCxlcDTO.class);
    }
}
