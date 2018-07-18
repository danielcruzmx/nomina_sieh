package gob.shcp.sireh.service.plaza.estructura.masivos;


import gob.shcp.fsn.service.ServiceException;



import gob.shcp.sireh.data.jdbc.QueryTnPlantillaPlazaEstructuraDAO;

import gob.shcp.sireh.data.jdbc.TcProyRegularizaDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdOficioAfectacionDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;

import gob.shcp.sireh.data.jdbc.support.CustomTdPlazaAfectacionDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdPlazaDAO;


import gob.shcp.sireh.data.jdbc.support.CustomTnMovtosEmpPlaDAO;



import gob.shcp.sireh.domain.jdbc.CustomTnPlantillaPlazaEstructura;
import gob.shcp.sireh.data.jdbc.support.CustomTnPlantillaPlazaEstructuraDAO;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;

import gob.shcp.sireh.domain.jdbc.TcProyRegulariza;
import gob.shcp.sireh.domain.jdbc.TcProyRegularizaPK;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdOficioAfectacion;
import gob.shcp.sireh.domain.jdbc.TdOficioAfectacionPK;
import gob.shcp.sireh.domain.jdbc.TdPlaza;

import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;
import gob.shcp.sireh.service.AbstractSirehService;


import gob.shcp.sireh.service.parser.support.ParserXls;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.text.Collator;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class PlazaEstructuraMasivaBS extends AbstractSirehService implements PlazaEstructuraMasivaService {

    public static final Integer OPERACION_CREACION_PLAZA_MASIVA = 32;
    public static final Integer OPERACION_CANCELACION_PLAZA_MASIVA = 35;
    public static final Integer OPERACION_TRANSFERENCIA_PLAZA_MASIVA = 35;
    public static final Integer CREACION_ID_JUSTIFICACION = 32;
    public static final Integer ID_JUSTIFICACION = 99;
    public static final String CREACION_ID_GRUPO_PAGO = "E";
    public static final String CREACION_PREFIX_PLAF_PROY_AMPLIA = "CR";
    public static final String CREACION_PREFIX_PLAF_PROY_CONVERSION = "CN";
    public static final String CREACION_PREFIX_PLAF_PROY_REUBICACION = "CA";
    public static final String CREACION_PREFIX_PLAF_PROY_CANCELACION = "CX";
    public static final String CREACION_PREFIX_PLAF_PROY_TRANSFERENCIA = "TR";
    public static final String CREACION_PLAF_PROY_REDUCE = "S-PROB";
    public static final String CREACION_PLAF_PROY_AMPLIA = "S-PROY";
    public static final String CREACION_PLAF_FINAL = "01/01/2099";
    public static final String CREACION_PLAF_FINAL_NO_REGULARIZABLE = "31/12/";
    public static final Integer CREACION_PLAF_DIAS_PRIMA = 10;
    public static final Integer CREACION_PLAF_DIAS_AGUINALDO = 40;
    public static final String TIPO_MOVIMIENTO_CONVERSION = "C";
    public static final String TIPO_MOVIMIENTO_REUBICACION = "R";
    public static final String DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION = "CREACION";
    public static final String DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CONVERSION = "ConversiÛn";
    public static final String DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_REUBICACION = "ReubicaciÛn";
    public static final String DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CANCELACION = "CANCELACION";
    public static final String DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_TRANSFERENCIA = "TRANSFERENCIA";
    public static final String ID_TIPO_CREACION = "CREACION";
    public static final String ID_TIPO_CANCELACION = "CANCELACION";
    public static final String ID_TIPO_MOVIMIENTO_CONVERSION = "CONVERSION";
    public static final String ID_TIPO_MOVIMIENTO_REUBICACION = "REUBICACION";
    public static final String ID_TIPO_MOVIMIENTO_TRANSFERENCIA = "TRANSFERENCIA";
    public static final String ID_PROY_REGUL_PREFIX_CREACION_PLAZA_ESTRUCTURAL_MASIVA = "CR";
    public static final String ID_PROY_REGUL_PREFIX_CANCELACION_PLAZA_ESTRUCTURAL_MASIVA = "CX";
    public static final String ID_PROY_REGUL_PREFIX_TRANSFERENCIA_PLAZA_ESTRUCTURAL_MASIVA = "TR";
    public static final String ID_SIT_AFECTACION_CREACION = "A";
    public static final String ID_TIPO_DOCTO_CREACION = "A";
    public static final String OFAC_APLICA_OFICIO_CREACION = "N";
    public static final String TD_PLAZA_ID_SIT_PLAZA_CREACION = "C";
    public static final String TD_PLAZA_ID_SIT_PLAZA_CANCELACION = "W";
    public static final String TD_PLAZA_ID_SIT_PLAZA_TRANSFERENCIA = "Z";
    public static final Integer TD_PLAZA_PLAZA_RESPALDO = 0;
    public static final String TD_PLAZA_ID_GRUPO_PAGO = "E";
    public static final Integer TD_PLAZA_ID_RANGO_PRE = 0;
    public static final String TD_PLAZ_ID_PROY_REDUCE_PRE = "S-PROB";
    public static final Integer TD_PLAZA_ID_MUNI_NOM = 0;
    public static final Integer TD_PLAZA_ID_RANGO_NOM = 0;
    public static final Integer TD_PLAZA_ID_ZONA_DIST_NOM = 9000;
    public static final Integer TD_PLAZA_IMPORTE_HONORARIO = 0;
    public static final Integer TD_PLAZA_ID_MOVTO_PERSONA = 535;
    public static final Integer TD_PLAZA_ID_MOVTO_PERSONA_CANCELACION = 536;
    public static final Integer TD_PLAZA_ID_MOVTO_PERSONA_TRANSFERENCIA = 537;
    public static final String TD_PLAZA_PLAZA_REFERENCIA = 
        "CreaciÛn de plaza adecuaciÛn presupuestal n˙mero ";
    public static final String TD_PLAZA_ID_NODO = "000";
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA = 535;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CONVERSION = 509;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_REUBICACION = 507;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CANCELACION = 536;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_TRANSFERENCIA = 537;
    public static final String TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA = "C";
    public static final String TN_MOVTOS_EMP_PLA_ID_GRUPO_PAGO = "E";
    public static final Integer TN_MOVTOS_EMP_PLA_ID_RANGO_PRE = 0;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MUNI_NOM = 0;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_RANGO_NOM = 0;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_ZONA_DIST_NOM = 9000;
    public static final Integer TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO = 0;
    public static final Date TN_MOVTOS_EMP_PLA_MEP_FIN_CONT;
    public static final String EXPRESION_REGULAR_VALIDACION_ANTERIOR = "[0-9]{1,10}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ACTUAL = "[0-9]{1,10}$";
    public static final String EXPRESION_REGULAR_VALIDACION_UNIDAD = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_NIVEL = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,4}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ZONA = "[0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_CODIGO = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9 _]{1,7}$";
    public static final String EXPRESION_REGULAR_VALIDACION_PLAZAS = "[0-9]{1,6}$";
    public static final String EXPRESION_REGULAR_VALIDACION_CASOS = "-?[0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_PLAZA = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,1}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ESTATUS = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}";
    public static final String EXPRESION_REGULAR_VALIDACION_CANCELADA = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_MOVIMIENTO = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_REGULARIZABLE = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9\\s]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_PERSONAL = "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9\\s]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ENTIDAD = "[0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_VIGENCIA = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)";


    static {
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH, 31);
        c2.set(Calendar.MONTH, Calendar.DECEMBER);
        c2.set(Calendar.YEAR, 2099);
        TN_MOVTOS_EMP_PLA_MEP_FIN_CONT = c2.getTime();
    }

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
       
        creacionPlazaMasivaDTO.setPlantillaErronea(false);
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
        creacionPlazaMasivaDTO.setAnio(anio);
        boolean archivoValido = false;
        String usuario = super.identity().get().getUserID();
        try {
            creacionPlazaMasivaDTO.setListaPlazaEstructuraCorrecta(new ArrayList<CreacionPlazaMasivaDTO>());
            creacionPlazaMasivaDTO.setListaPlazaEstructuraIncorrecta(new ArrayList<CreacionPlazaMasivaDTO>());
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");

            InputStream inputStreamXls = creacionPlazaMasivaDTO.getFile().getInputStream();
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO = 
                parserXls.parseFile(inputStreamXls, 
                                    CreacionPlazaMasivaDTO.class);

            validaEncabezadosCreacion(parserXls, creacionPlazaMasivaDTO);
            if(creacionPlazaMasivaDTO.getPlantillaErronea() ){
                return creacionPlazaMasivaDTO;
            }


            if (listCreacionPlazaMasivaDTO != null && 
                listCreacionPlazaMasivaDTO.size() == 0) {
                creacionPlazaMasivaDTO.setPlantillaErronea(true);
                return creacionPlazaMasivaDTO;
            }

            creacionPlazaMasivaDTO = 
                    processPMPValidaDatosPlantilla(listCreacionPlazaMasivaDTO, 
                                                   creacionPlazaMasivaDTO);

            creacionPlazaMasivaDTO.setListaErrores(listCreacionPlazaMasivaDTO);
            String tipo = "";
            List<HashMap<String, Object>> listaMapasTnPlantillaPlazaEstructura = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnPlantillaPlazaEstructura;
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 creacionPlazaMasivaDTO.getListaPlazaEstructuraCorrecta()) { // listCreacionPlazaMasivaDTO
                mapaTnPlantillaPlazaEstructura = new HashMap<String, Object>();
                mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloActual());
                mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", 
                                                   templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", 
                                                   templateFileCreatePlazaEstructura.getUnidad());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel", 
                                                   templateFileCreatePlazaEstructura.getNivel());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", 
                                                   templateFileCreatePlazaEstructura.getZona());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", 
                                                   templateFileCreatePlazaEstructura.getCodigo());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza", 
                                                   templateFileCreatePlazaEstructura.getPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeCasos", 
                                                   templateFileCreatePlazaEstructura.getCasos());
                tipo = 
templateFileCreatePlazaEstructura.getTipo().toUpperCase().equals("CREACI”N") || 
templateFileCreatePlazaEstructura.getTipo().toUpperCase().equals("CREACION") ? 
"CREACION" : templateFileCreatePlazaEstructura.getTipo();
                mapaTnPlantillaPlazaEstructura.put("ppeTipo", tipo);
                mapaTnPlantillaPlazaEstructura.put("ppeEstatus", 
                                                   templateFileCreatePlazaEstructura.getEstatus());
                mapaTnPlantillaPlazaEstructura.put("ppeCancelada", 
                                                   templateFileCreatePlazaEstructura.getCancelada());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoMov", 
                                                   templateFileCreatePlazaEstructura.getTipoMovimiento());
                mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", 
                                                   templateFileCreatePlazaEstructura.getRegularizable());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", 
                                                   templateFileCreatePlazaEstructura.getTipoPersonal());
                mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", 
                                                   templateFileCreatePlazaEstructura.getEntidadFederativa());
	        mapaTnPlantillaPlazaEstructura.put("ppeTipoPlaza", 
	                                           templateFileCreatePlazaEstructura.getIdTipoPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoServPub", 
						   templateFileCreatePlazaEstructura.getIdServPub());
	        mapaTnPlantillaPlazaEstructura.put("ppePtoEstrategico", 
	                                           templateFileCreatePlazaEstructura.getIdPtoEstrategico());                                        
	        mapaTnPlantillaPlazaEstructura.put("ppeInmueble", 
	                                           templateFileCreatePlazaEstructura.getIdInmueble());                                        	                                              
		mapaTnPlantillaPlazaEstructura.put("usuario", 
						   usuario);
		mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
		listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
	    }

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, 
                                                                                                              usuario);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByselectTnPlantillaPlazaEstructuraVsPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsPlaza, 
                             comparatorPlaza);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsUnidad = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsUnidad(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorUnidad = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdUnidad().compareTo(o2.getIdUnidad());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsUnidad, 
                             comparatorUnidad);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuesto = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuesto(usuario);
                
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuesto = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPuesto().compareTo(o2.getIdPuesto());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuesto, 
                             comparatorPuesto);
                             

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsEstado = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsEstado(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorEstado = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = 
                                o1.getPpeEntidadFederativa().compareTo(o2.getPpeEntidadFederativa());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsEstado, 
                             comparatorEstado);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsZona = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsZona("CREACION", 
                                                                                                                     usuario);
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorZona = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaAmpliaVsZona, 
                             comparatorZona);

            List<CustomTnPlantillaPlazaEstructura> listafindByTnPlantillaPlazaEstructura = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructura(usuario);
            
            
            //Lista validacion vs Tipo Servidor publico
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsTipoServPub = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsTipoServPub(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorTipoServPub = new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdServPub().compareTo(o2.getIdServPub());
                        return regreso;
                    }
                };
                
            Collections.sort(listaTnPlantillaPlazaEstructuraVsTipoServPub, comparatorTipoServPub);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsTipoPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsTipoPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorTipoPlaza = new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdTipoPlaza().compareTo(o2.getIdTipoPlaza());
                        return regreso;
                    }
                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsTipoPlaza, comparatorTipoPlaza);

            //Lista validacion vs Inmueble
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsInmueble = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsInmueble(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorInmueble = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getPpeInmueble().compareTo(o2.getPpeInmueble());
                        return regreso;
                    }
                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsInmueble, 
                             comparatorInmueble);                             
           
            int pos = -1;
            StringBuffer buffer = null;
            archivoValido = true;
            boolean errorValidacion = false;
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {

                buffer = new StringBuffer();
                errorValidacion = false;

                //ValidaciÛn AfectaciÛn Vs Plaza
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPlaza, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos >= 0) {

                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                if (customTnPlantillaPlazaEstructura.getIdPlaza() >= 60000 && 
                    customTnPlantillaPlazaEstructura.getIdPlaza() <= 79999) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Unidad
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsUnidad, 
                         customTnPlantillaPlazaEstructura, comparatorUnidad);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                
	        //ValidaciÛn AfectaciÛn Vs Tipo Serv Publico
	        pos = 
	        Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsTipoServPub,
	                 customTnPlantillaPlazaEstructura, comparatorTipoServPub);
	        if (pos < 0) {
	            buffer.append(super.configuration().getString("plazaMasivaEstructura", 
	                                                          "carga.plaza.masiva.estructura.creacion.mensaje.tipo.servidor.publico.no.valida"));
	            errorValidacion = true;
	            archivoValido = false;
	        }

	        //ValidaciÛn AfectaciÛn Vs Tipo Plaza
	        pos = 
	        Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsTipoPlaza,
	                 customTnPlantillaPlazaEstructura, comparatorTipoPlaza);
	        if (pos < 0) {
	            buffer.append(super.configuration().getString("plazaMasivaEstructura", 
	                                                          "carga.plaza.masiva.estructura.creacion.mensaje.tipo.plaza.no.valida"));
	            errorValidacion = true;
	            archivoValido = false;
	        }
                
                //ValidaciÛn AfectaciÛn Vs Puesto
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuesto, 
                         customTnPlantillaPlazaEstructura, comparatorPuesto);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                

                //ValidaciÛn AfectaciÛn Vs Estado
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsEstado, 
                         customTnPlantillaPlazaEstructura, comparatorEstado);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.estado.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Zona
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsZona, 
                         customTnPlantillaPlazaEstructura, comparatorZona);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.zona.economica.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                
                //ValidaciÛn AfectaciÛn Vs Inmueble
                pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsInmueble, customTnPlantillaPlazaEstructura, comparatorInmueble);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.inmueble.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }


                if (errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
                }

            }

            creacionPlazaMasivaDTO.setArchivoValido(archivoValido && 
                                                    creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() == 
                                                    0);
            List<CreacionPlazaMasivaDTO> listaErrores = 
                new ArrayList<CreacionPlazaMasivaDTO>();

            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {
                CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVO = 
                    new CreacionPlazaMasivaDTO();
                creacionPlazaMasivaDTOVO.setAdecuacionCicloAnterior(customTnPlantillaPlazaEstructura.getPpeAdecuacionAnterior());
                creacionPlazaMasivaDTOVO.setAdecuacionCicloActual(customTnPlantillaPlazaEstructura.getPpeAdecuacionActual());
                creacionPlazaMasivaDTOVO.setUnidad(customTnPlantillaPlazaEstructura.getIdUnidad());
                creacionPlazaMasivaDTOVO.setNivel(customTnPlantillaPlazaEstructura.getIdNivel());
                creacionPlazaMasivaDTOVO.setZona(customTnPlantillaPlazaEstructura.getIdZona());
                creacionPlazaMasivaDTOVO.setCodigo(customTnPlantillaPlazaEstructura.getIdPuesto());
                creacionPlazaMasivaDTOVO.setPlaza(customTnPlantillaPlazaEstructura.getIdPlaza());
                creacionPlazaMasivaDTOVO.setCasos(customTnPlantillaPlazaEstructura.getPpeCasos());
                creacionPlazaMasivaDTOVO.setTipo(customTnPlantillaPlazaEstructura.getPpeTipo());
                creacionPlazaMasivaDTOVO.setEstatus(customTnPlantillaPlazaEstructura.getPpeEstauts());
                creacionPlazaMasivaDTOVO.setCancelada(customTnPlantillaPlazaEstructura.getPpeCancelada());
                creacionPlazaMasivaDTOVO.setTipoMovimiento(customTnPlantillaPlazaEstructura.getPpeTipoMov());
                creacionPlazaMasivaDTOVO.setRegularizable(customTnPlantillaPlazaEstructura.getPpeRegularizable());
                creacionPlazaMasivaDTOVO.setTipoPersonal(customTnPlantillaPlazaEstructura.getPpeTipoPersonal());
                creacionPlazaMasivaDTOVO.setIdTipoPlaza(customTnPlantillaPlazaEstructura.getIdTipoPlaza());
                creacionPlazaMasivaDTOVO.setIdServPub(customTnPlantillaPlazaEstructura.getIdServPub());
                creacionPlazaMasivaDTOVO.setIdPtoEstrategico(customTnPlantillaPlazaEstructura.getIdPtoEstrategico());
                creacionPlazaMasivaDTOVO.setEntidadFederativa(customTnPlantillaPlazaEstructura.getPpeEntidadFederativa());
                creacionPlazaMasivaDTOVO.setInicioVigencia(customTnPlantillaPlazaEstructura.getPpeInicioVigencia());
                creacionPlazaMasivaDTOVO.setIdInmueble(customTnPlantillaPlazaEstructura.getPpeInmueble() );
                creacionPlazaMasivaDTOVO.setMensaje(customTnPlantillaPlazaEstructura.getMensaje());
                listaErrores.add(creacionPlazaMasivaDTOVO);
            }

            if (creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() > 
                0) {
                listaErrores.addAll(creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta());
            }
            creacionPlazaMasivaDTO.setListaErrores(listaErrores);
            String nameFileXls = 
                creacionPlazaMasivaDTO.getNombreArchivoErrores();
            String nombreArchivoXls = 
                super.configuration().getString("local.temp.dir") + 
                File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.xls.plazaMasiva");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("creacionPlazaMasivaDTO", creacionPlazaMasivaDTO);

                transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                         nombreArchivoXls);

            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);

        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasiva] " + 
                                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasiva] " + 
                                                        e.toString(), e);
        } finally {
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }

    private void validaEncabezadosCreacion(ParserXls parserXls, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        Collator comparator = Collator.getInstance();
        comparator.setStrength(Collator.PRIMARY);
        StringBuffer buffer = new StringBuffer(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.validacion.encabezados"));
        Boolean errorValidacionEncabezados = false;
        if (parserXls.getEncabezadoDTO().getA() == null || comparator.compare(parserXls.getEncabezadoDTO().getA(), super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.adecuacion.anterior")) != 0) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.adecuacion.anterior"));
        }
        if (parserXls.getEncabezadoDTO().getB() == null || comparator.compare(parserXls.getEncabezadoDTO().getB(), super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.adecuacion.actual")) != 0) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.adecuacion.actual"));
        }
        if (parserXls.getEncabezadoDTO().getC() == null || !parserXls.getEncabezadoDTO().getC().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.unidad"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.unidad"));
        }
        if (parserXls.getEncabezadoDTO().getD() == null || !parserXls.getEncabezadoDTO().getD().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.nivel"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.nivel"));
        }
        if (parserXls.getEncabezadoDTO().getE() == null || !parserXls.getEncabezadoDTO().getE().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.zona"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.zona"));
        }
        if (parserXls.getEncabezadoDTO().getF() == null || comparator.compare(parserXls.getEncabezadoDTO().getF(), super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.codigo")) != 0){
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.codigo"));            
        }
        if (parserXls.getEncabezadoDTO().getG() == null || !parserXls.getEncabezadoDTO().getG().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.plaza"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.plazas"));
        }
        if (parserXls.getEncabezadoDTO().getH() == null || !parserXls.getEncabezadoDTO().getH().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.casos"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.casos"));
        }
        if (parserXls.getEncabezadoDTO().getI() == null || !parserXls.getEncabezadoDTO().getI().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo"));
        }
        if (parserXls.getEncabezadoDTO().getJ() == null || !parserXls.getEncabezadoDTO().getJ().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.estatus"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.estatus"));
        }
        if (parserXls.getEncabezadoDTO().getK() == null || !parserXls.getEncabezadoDTO().getK().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.cancelada"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.cancelada"));
        }
        if (parserXls.getEncabezadoDTO().getL() == null || !parserXls.getEncabezadoDTO().getL().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.movimiento"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo.movimiento"));
        }
        if (parserXls.getEncabezadoDTO().getM() == null || !parserXls.getEncabezadoDTO().getM().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.regularizable"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.regularizable"));
        }
        if (parserXls.getEncabezadoDTO().getN() == null || !parserXls.getEncabezadoDTO().getN().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.personal"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo.personal"));
        }
        if (parserXls.getEncabezadoDTO().getO() == null || !parserXls.getEncabezadoDTO().getO().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.entidad"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.entidad"));
        }
        if (parserXls.getEncabezadoDTO().getP() == null || !parserXls.getEncabezadoDTO().getP().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.inicio.vigencia"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.vigencia"));
        }
        if (parserXls.getEncabezadoDTO().getQ() == null || !parserXls.getEncabezadoDTO().getQ().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.plaza"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo.plaza"));
        }
        if (parserXls.getEncabezadoDTO().getR() == null || !parserXls.getEncabezadoDTO().getR().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.servidor"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo.serv.pub"));
        }
        if (parserXls.getEncabezadoDTO().getS() == null || !parserXls.getEncabezadoDTO().getS().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.pto.estrategico"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.pto.estrategico"));
        }
        if (parserXls.getEncabezadoDTO().getT() == null || !parserXls.getEncabezadoDTO().getT().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.inmueble"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.inmueble"));
        }
        if(errorValidacionEncabezados){
            creacionPlazaMasivaDTO.setPlantillaErronea(true);    
            creacionPlazaMasivaDTO.setMensaje(buffer.toString());
        }
        
    }


    public CreacionPlazaMasivaDTO processPMPValidaDatosPlantilla(List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO, 
                                                                 CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        List<CreacionPlazaMasivaDTO> listaPlazaEstructuraIncorrecta = 
            new ArrayList<CreacionPlazaMasivaDTO>();
        List<CreacionPlazaMasivaDTO> listaPlazaEstructuraCorrecta = 
            new ArrayList<CreacionPlazaMasivaDTO>();

            Pattern pat = null;
            Matcher mat = null;
            Calendar f = Calendar.getInstance();
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date());
            int anio = hoy.get(Calendar.YEAR);
            Boolean errorValidacionDatos = false;
            for (CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVo: 
                 listCreacionPlazaMasivaDTO) {
                errorValidacionDatos = false;
                StringBuffer buffer = 
                    new StringBuffer(super.configuration().getString("plazaMasivaEstructura", 
                                                                     "validacion.datos.validacion.datos"));
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ANTERIOR);
                if (creacionPlazaMasivaDTOVo.getAdecuacionCicloAnterior() != 
                    null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getAdecuacionCicloAnterior());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.adecuacion.anterior"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.adecuacion.anterior"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ACTUAL);
                if (creacionPlazaMasivaDTOVo.getAdecuacionCicloActual() != 
                    null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getAdecuacionCicloActual());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.adecuacion.actual"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.adecuacion.actual"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_UNIDAD);
                if (creacionPlazaMasivaDTOVo.getUnidad() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getUnidad());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.unidad"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.unidad"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_NIVEL);
                if (creacionPlazaMasivaDTOVo.getNivel() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getNivel());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.nivel"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.nivel"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ZONA);
                if (creacionPlazaMasivaDTOVo.getZona() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getZona().toString());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.zona"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.zona"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_CODIGO);
                if (creacionPlazaMasivaDTOVo.getCodigo() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getCodigo());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.codigo"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.codigo"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_PLAZAS);
                if (creacionPlazaMasivaDTOVo.getPlaza() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getPlaza().toString());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.plazas"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.plazas"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_CASOS);
                if (creacionPlazaMasivaDTOVo.getCasos() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getCasos().toString());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        creacionPlazaMasivaDTOVo.setMensaje((creacionPlazaMasivaDTOVo.getMensaje() == 
                                                             null ? 
                                                             super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "validacion.datos.validacion.datos") : 
                                                             creacionPlazaMasivaDTOVo.getMensaje()) + 
                                                            super.configuration().getString("plazaMasivaEstructura", 
                                                                                            "validacion.datos.casos"));
                    }
                } else {
                    errorValidacionDatos = true;
                    creacionPlazaMasivaDTOVo.setMensaje((creacionPlazaMasivaDTOVo.getMensaje() == 
                                                         null ? 
                                                         super.configuration().getString("plazaMasivaEstructura", 
                                                                                         "validacion.datos.validacion.datos") : 
                                                         creacionPlazaMasivaDTOVo.getMensaje()) + 
                                                        super.configuration().getString("plazaMasivaEstructura", 
                                                                                        "validacion.datos.casos"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO);
                if (creacionPlazaMasivaDTOVo.getTipo() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getTipo());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.tipo"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.tipo"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ESTATUS);
                if (creacionPlazaMasivaDTOVo.getEstatus() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getEstatus());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.estatus"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.estatus"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_CANCELADA);
                if (creacionPlazaMasivaDTOVo.getCancelada() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getCancelada());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.cancelada"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.cancelada"));
                }

                pat = 
Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO_MOVIMIENTO);
                if (creacionPlazaMasivaDTOVo.getTipoMovimiento() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getTipoMovimiento());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.tipo.movimiento"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.tipo.movimiento"));
                }

                pat = 
Pattern.compile(EXPRESION_REGULAR_VALIDACION_REGULARIZABLE);
                if (creacionPlazaMasivaDTOVo.getRegularizable() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getRegularizable());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.regularizable"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.regularizable"));
                }

                pat = 
Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO_PERSONAL);
                if (creacionPlazaMasivaDTOVo.getTipoPersonal() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getTipoPersonal());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.tipo.personal"));
                        listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.tipo.personal"));
                }

                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_ENTIDAD);
                if (creacionPlazaMasivaDTOVo.getEntidadFederativa() != null) {
                    mat = 
pat.matcher(creacionPlazaMasivaDTOVo.getEntidadFederativa().toString());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.entidad"));
                        listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.entidad"));
                }


                if (creacionPlazaMasivaDTOVo.getInicioVigencia() == null) {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.vigencia"));
                    listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                }

                if (creacionPlazaMasivaDTOVo.getInicioVigencia() != null) {
                    f.setTime(creacionPlazaMasivaDTOVo.getInicioVigencia());
                    if (f.get(Calendar.YEAR) != anio) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.vigencia"));
                        listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                    }
                }
                if (!errorValidacionDatos) {
                    listaPlazaEstructuraCorrecta.add(creacionPlazaMasivaDTOVo);
                } else {
                    creacionPlazaMasivaDTOVo.setMensaje(buffer.toString());
                    listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                }
            }
            creacionPlazaMasivaDTO.setListaPlazaEstructuraCorrecta(listaPlazaEstructuraCorrecta);
            creacionPlazaMasivaDTO.setListaPlazaEstructuraIncorrecta(listaPlazaEstructuraIncorrecta);


        return creacionPlazaMasivaDTO;
    }

    /**
     * MÈtodo encargado de el procesamiento y validaciÛn de carga masiva para conversiÛn y reubicaciÛn
     * @param creacionPlazaMasivaDTO
     * @return creacionPlazaMasivaDTO CreacionPlazaMasivaDTO
     */
    public CreacionPlazaMasivaDTO processPMFileConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        Collator comparator = Collator.getInstance();
        comparator.setStrength(Collator.PRIMARY);
        Calendar c = Calendar.getInstance(); 
        c.setTime(new Date());
        String anio = new Integer( (int) c.get(Calendar.YEAR)).toString();
        creacionPlazaMasivaDTO.setAnio(anio);
        boolean archivoValido= false;
        String usuario = super.identity().get().getUserID();
        try{
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", "jxls.templates.plazaMasiva");
                 
            InputStream inputStreamXls = 
                creacionPlazaMasivaDTO.getFile().getInputStream();   
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO = 
                parserXls.parseFile(inputStreamXls, CreacionPlazaMasivaDTO.class);
            if(!(parserXls.getEncabezadoDTO().getA() != null && comparator.compare(parserXls.getEncabezadoDTO().getA(), super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.anterior")) == 0 &&
                parserXls.getEncabezadoDTO().getB() != null && comparator.compare(parserXls.getEncabezadoDTO().getB(), super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.actual")) == 0 &&
                parserXls.getEncabezadoDTO().getC() != null && parserXls.getEncabezadoDTO().getC().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.unidad")) &&
                parserXls.getEncabezadoDTO().getD() != null && parserXls.getEncabezadoDTO().getD().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.nivel")) &&
                parserXls.getEncabezadoDTO().getE() != null && parserXls.getEncabezadoDTO().getE().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.zona")) &&
                parserXls.getEncabezadoDTO().getF() != null && comparator.compare(parserXls.getEncabezadoDTO().getF(), super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.codigo")) == 0 &&
                parserXls.getEncabezadoDTO().getG() != null && parserXls.getEncabezadoDTO().getG().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.plaza")) &&
                parserXls.getEncabezadoDTO().getH() != null && parserXls.getEncabezadoDTO().getH().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.casos")) &&
                parserXls.getEncabezadoDTO().getI() != null && parserXls.getEncabezadoDTO().getI().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo")) &&
                parserXls.getEncabezadoDTO().getJ() != null && parserXls.getEncabezadoDTO().getJ().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.estatus")) &&
                parserXls.getEncabezadoDTO().getK() != null && parserXls.getEncabezadoDTO().getK().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.cancelada")) && 
                parserXls.getEncabezadoDTO().getL() != null && parserXls.getEncabezadoDTO().getL().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.movimiento")) && 
                parserXls.getEncabezadoDTO().getM() != null && parserXls.getEncabezadoDTO().getM().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.regularizable")) &&
                parserXls.getEncabezadoDTO().getN() != null && parserXls.getEncabezadoDTO().getN().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.personal")) &&
                parserXls.getEncabezadoDTO().getO() != null && parserXls.getEncabezadoDTO().getO().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.entidad")) &&
                parserXls.getEncabezadoDTO().getP() != null && parserXls.getEncabezadoDTO().getP().equalsIgnoreCase(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.inicio.vigencia")))) {
                    creacionPlazaMasivaDTO.setPlantillaErronea(true);
                    return creacionPlazaMasivaDTO;                                                                                                         
                }
                
            creacionPlazaMasivaDTO = 
                    processPMPValidaDatosPlantilla(listCreacionPlazaMasivaDTO, 
                                                   creacionPlazaMasivaDTO);
                
            creacionPlazaMasivaDTO.setListaErrores(listCreacionPlazaMasivaDTO);                
            String patron = "dd/MM/yyyy";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            List<HashMap<String,Object>> listaMapasTnPlantillaPlazaEstructura = new ArrayList<HashMap<String,Object>>();
                        HashMap<String,Object> mapaTnPlantillaPlazaEstructura;                           
                        for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listCreacionPlazaMasivaDTO) {
                            mapaTnPlantillaPlazaEstructura = new HashMap<String,Object>();
                            mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual",templateFileCreatePlazaEstructura.getAdecuacionCicloActual() );
                            mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", templateFileCreatePlazaEstructura.getInicioVigencia() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", templateFileCreatePlazaEstructura.getUnidad() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel",templateFileCreatePlazaEstructura.getNivel() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", templateFileCreatePlazaEstructura.getZona() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", templateFileCreatePlazaEstructura.getCodigo());
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza",templateFileCreatePlazaEstructura.getPlaza() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCasos",templateFileCreatePlazaEstructura.getCasos() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipo", templateFileCreatePlazaEstructura.getTipo() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEstatus",templateFileCreatePlazaEstructura.getEstatus() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCancelada", templateFileCreatePlazaEstructura.getCancelada() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoMov",templateFileCreatePlazaEstructura.getTipoMovimiento() );
                            mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", templateFileCreatePlazaEstructura.getRegularizable() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", templateFileCreatePlazaEstructura.getTipoPersonal() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", templateFileCreatePlazaEstructura.getEntidadFederativa() );
                            mapaTnPlantillaPlazaEstructura.put("usuario", usuario);
                            mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                            listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
                        }
            

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                     new Comparator<CustomTnPlantillaPlazaEstructura>() {

                         public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                            CustomTnPlantillaPlazaEstructura o2) {
                             int regreso = 0;
                             regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                             return regreso;
                         }

                     };
                     
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorUnidad = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdUnidad().compareTo(o2.getIdUnidad());
                        return regreso;
                    }

                };
                
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuesto = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPuesto().compareTo(o2.getIdPuesto());
                        return regreso;
                    }

                };
                
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorEstado = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getPpeEntidadFederativa().compareTo(o2.getPpeEntidadFederativa());
                        return regreso;
                    }

                };

            // Valida que el tipo de movimiento sea CONVERSION O REUBICACION     
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaVsTipoMov = 
                     super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsTipoMov(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? ID_TIPO_MOVIMIENTO_CONVERSION : ID_TIPO_MOVIMIENTO_REUBICACION, 
                                                                                                                               usuario);
                                                                                                                               
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsPlaza = null;                                                                                                                               
            if ( comparator.compare(creacionPlazaMasivaDTO.getTipoProceso(), TIPO_MOVIMIENTO_CONVERSION) == 0 ) {
            // Plazas que existen en TD_PLAZA y estan en el rango de las presupuestales o NO existen en TD_PLAZA y se van a crear (CREACION)
                listaTnPlantillaPlazaAmpliaVsPlaza = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsPlazaConversion(usuario);
            }else if( comparator.compare(creacionPlazaMasivaDTO.getTipoProceso(), TIPO_MOVIMIENTO_REUBICACION) == 0 ){
                listaTnPlantillaPlazaAmpliaVsPlaza = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsPlazaReubicacion(usuario);
            }

            // Plazas ocupadas ID_SIT_PLAZA O P L
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaReduceVsOcupados = 
                     super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsOcupados(usuario);
            


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsGrupoPago = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsGrupoPago(usuario);
                
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaReduceVsGrupoPago = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsGrupoPago(usuario);                

            // Plazas que existen en TD_PLAZA y estan en el rango de las presupuestales (CANCELACION)
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaReduceVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsPlaza(usuario);
                                                                                                                      
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsZona = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsZona(ID_TIPO_CREACION, usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaVsOficioAfectacion = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsOficioAfectacion(anio, Integer.parseInt(anio), usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaVsProyRegulariza = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsProyRegulariza(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? CREACION_PREFIX_PLAF_PROY_CONVERSION : CREACION_PREFIX_PLAF_PROY_REUBICACION, Integer.parseInt(anio), usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsPlazaAfectacion = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsPlazaAfectacion(Integer.valueOf(anio), OPERACION_CREACION_PLAZA_MASIVA, usuario );
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraReduceVsUnidad = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsUnidad(usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuesto = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuesto(usuario);
            // Consulta las plazas que corresponden al puesto que trae el archivo .OK.                                                                                                                                                         
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraReduceVsPuesto = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsPuesto( usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaReduceVsZonaEco = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsZonaEco(usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaReduceVsEntidadFed = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsEntidadFed(usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsEstado = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsEstado(usuario);
            List<CustomTnPlantillaPlazaEstructura> listafindByTnPlantillaPlazaEstructura = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructura(usuario);
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraAmpliaVsUnidad = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsUnidad(usuario);
            

                     
            Collections.sort(listaTnPlantillaPlazaVsTipoMov, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaAmpliaVsGrupoPago, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaReduceVsGrupoPago, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaAmpliaVsZona, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaVsOficioAfectacion, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaVsProyRegulariza, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaAmpliaVsPlazaAfectacion, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaAmpliaVsPlaza, comparatorPlaza);
            Collections.sort(listaTnPlantillaReduceVsOcupados, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaReduceVsPlaza, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaEstructuraReduceVsUnidad, comparatorPlaza);                
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuesto, comparatorPuesto);            
            Collections.sort(listaTnPlantillaPlazaEstructuraReduceVsPuesto, comparatorPlaza);     
            Collections.sort(listaTnPlantillaPlazaReduceVsZonaEco, comparatorPlaza);     
            Collections.sort(listaTnPlantillaPlazaReduceVsEntidadFed, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaEstructuraVsEstado, comparatorEstado);
            Collections.sort(listaTnPlantillaPlazaEstructuraAmpliaVsUnidad, comparatorUnidad);

                
            int pos = -1;
            StringBuffer buffer =null;
            archivoValido = true;
            boolean errorValidacion = false;
            
            /** INICA PROCESO DE VALIDACIONES **/
            
            for(CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura : listafindByTnPlantillaPlazaEstructura ) {
            
                buffer = new StringBuffer();
                errorValidacion = false;
            
            // VALIDACIONES DE AMPLIACION
            
            
                //ValidaciÛn Ampliacion Vs TipoMov
                    pos = Collections.binarySearch(listaTnPlantillaPlazaVsTipoMov, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos >= 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.tipoMovimiento.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                
                //ValidaciÛn Ampliacion Vs Plaza
                if ( comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0 ) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsPlaza, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.plaza.fuera.rango"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                // Validacion Ampliacion Vs Grupo pago "E" y/o "J" (Creacion)
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0 ) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsGrupoPago, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.grupoPago.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                // Validacion Ampliacion Vs Zona
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0 ) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsZona, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.zonaEconomica.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                //Validacion Ampliacion Vs Puesto. Puesto debe existir en el catalogo TC_PUESTO y vigente en el catalogo TC_ATRIBUTO_PUESTO con fecha final ë01/01/2099í  .OK.
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuesto, customTnPlantillaPlazaEstructura, comparatorPuesto);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                //Validacion Ampliacion Vs Unidad. Unidad debe existir en catalogo
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraAmpliaVsUnidad, customTnPlantillaPlazaEstructura, comparatorUnidad);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                //ValidaciÛn ampliacion Vs Estado
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsEstado, 
                         customTnPlantillaPlazaEstructura, comparatorEstado);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.estado.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }

                //ValidaciÛn Reduce Vs Ocupados (Solo para CONVERSION)
                if ( comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipoMov(), TIPO_MOVIMIENTO_CONVERSION) == 0 && comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0 ) {
                    pos = Collections.binarySearch(listaTnPlantillaReduceVsOcupados, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos >= 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.plaza.ocupada"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                
                
                
                // Validacion Reduccion Vs Grupo pago "E" y/o "J" (Cancelacion)
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0 ) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsGrupoPago, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.grupoPago.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                //ValidaciÛn Reduccion Vs Plaza 
                 if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0 ){
                 pos = Collections.binarySearch(listaTnPlantillaPlazaReduceVsPlaza, customTnPlantillaPlazaEstructura, comparatorPlaza);
                 if(pos < 0) {
                      buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.existente"));
                     errorValidacion = true;      
                     archivoValido = false;
                 }
                 }

                //ValidaciÛn Reduccion Vs Unidad
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraReduceVsUnidad, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                 
                //ValidaciÛn Reduccion Vs Puesto. El puesto del archivo con tipo cancelaciÛn debe ser igual al puesto presupuestal de TD_PLAZA .OK.
                 if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0){
                 pos = Collections.binarySearch(listaTnPlantillaPlazaEstructuraReduceVsPuesto, customTnPlantillaPlazaEstructura, comparatorPlaza);
                 if(pos < 0) {
                      buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                     errorValidacion = true;  
                     archivoValido = false;
                 }
                }

                //ValidaciÛn Cancelacion Vs ZonaEconomica
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaReduceVsZonaEco, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos < 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.zonaEconomica.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }
                
                //ValidaciÛn Cancelacion Vs EntidadFed
                 if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CANCELACION) == 0){
                 pos = Collections.binarySearch(listaTnPlantillaPlazaReduceVsEntidadFed, customTnPlantillaPlazaEstructura, comparatorPlaza);
                 if(pos < 0) {
                      buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                                     "carga.plaza.masiva.estructura.creacion.mensaje.estado.no.valida"));
                     errorValidacion = true;  
                     archivoValido = false;
                 }
                }
                 

                //ValidaciÛn Reduccion Vs OficioAfectacion
                 if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0){
                 pos = Collections.binarySearch(listaTnPlantillaPlazaVsOficioAfectacion, customTnPlantillaPlazaEstructura, comparatorPlaza);
                 if(pos >= 0) {
                      buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                                     "carga.plaza.masiva.estructura.creacion.mensaje.oficioafectacion.no.valida"));
                     errorValidacion = true;  
                     archivoValido = false;
                 }
                }
                
                //ValidaciÛn Reduccion Vs ProyRegulariza
                 
                 pos = Collections.binarySearch(listaTnPlantillaPlazaVsProyRegulariza, customTnPlantillaPlazaEstructura, comparatorPlaza);
                 if(pos >= 0) {
                      buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                                     "carga.plaza.masiva.estructura.creacion.mensaje.proyregulariza.no.valida"));
                     errorValidacion = true;  
                     archivoValido = false;
                 }


                //ValidaciÛn ampliacion Vs PlazaVsPlazaAfectacion
                if (comparator.compare(customTnPlantillaPlazaEstructura.getPpeTipo(), ID_TIPO_CREACION) == 0) {
                    pos = Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsPlazaAfectacion, customTnPlantillaPlazaEstructura, comparatorPlaza);
                    if (pos >= 0) {
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.plazaafectacion.no.valida"));
                        errorValidacion = true;
                        archivoValido = false;
                    }
                }


                    if(errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
                }
                
            }
            creacionPlazaMasivaDTO.setArchivoValido(archivoValido && 
                                                    creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() == 
                                                    0);
            
            List<CreacionPlazaMasivaDTO> listaErrores = new ArrayList<CreacionPlazaMasivaDTO>();
            // if (!archivoValido) {
                   for(CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura : listafindByTnPlantillaPlazaEstructura ) {
                       CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVO = new CreacionPlazaMasivaDTO();
                       creacionPlazaMasivaDTOVO.setAdecuacionCicloAnterior(customTnPlantillaPlazaEstructura.getPpeAdecuacionAnterior());
                       creacionPlazaMasivaDTOVO.setAdecuacionCicloActual(customTnPlantillaPlazaEstructura.getPpeAdecuacionActual());
                       creacionPlazaMasivaDTOVO.setUnidad(customTnPlantillaPlazaEstructura.getIdUnidad());
                       creacionPlazaMasivaDTOVO.setNivel(customTnPlantillaPlazaEstructura.getIdNivel());
                       creacionPlazaMasivaDTOVO.setZona(customTnPlantillaPlazaEstructura.getIdZona());
                       creacionPlazaMasivaDTOVO.setCodigo(customTnPlantillaPlazaEstructura.getIdPuesto());
                       creacionPlazaMasivaDTOVO.setPlaza(customTnPlantillaPlazaEstructura.getIdPlaza());
                       creacionPlazaMasivaDTOVO.setCasos(customTnPlantillaPlazaEstructura.getPpeCasos());
                       creacionPlazaMasivaDTOVO.setTipo(customTnPlantillaPlazaEstructura.getPpeTipo());
                       creacionPlazaMasivaDTOVO.setEstatus(customTnPlantillaPlazaEstructura.getPpeEstauts());
                       creacionPlazaMasivaDTOVO.setCancelada(customTnPlantillaPlazaEstructura.getPpeCancelada());
                       creacionPlazaMasivaDTOVO.setTipoMovimiento(customTnPlantillaPlazaEstructura.getPpeTipoMov());
                       creacionPlazaMasivaDTOVO.setRegularizable(customTnPlantillaPlazaEstructura.getPpeRegularizable());
                       creacionPlazaMasivaDTOVO.setTipoPersonal(customTnPlantillaPlazaEstructura.getPpeTipoPersonal());
                       creacionPlazaMasivaDTOVO.setEntidadFederativa(customTnPlantillaPlazaEstructura.getPpeEntidadFederativa());
                       creacionPlazaMasivaDTOVO.setInicioVigencia(customTnPlantillaPlazaEstructura.getPpeInicioVigencia());
                       creacionPlazaMasivaDTOVO.setMensaje(customTnPlantillaPlazaEstructura.getMensaje());
                       listaErrores.add(creacionPlazaMasivaDTOVO);
                }
                
            if (creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() > 
                0) {
                listaErrores.addAll(creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta());
            }
                creacionPlazaMasivaDTO.setListaErrores(listaErrores);
                String nameFileXls =creacionPlazaMasivaDTO.getNombreArchivoErrores();
                String nombreArchivoXls = 
                    super.configuration().getString("local.temp.dir") + 
                    File.separator + nameFileXls;
                String nombreArchivoPlantillaXls = 
                    super.configuration().getString("plazaMasiva.templates.dir") + 
                    File.separator + 
                    super.configuration().getString("plazaMasivaEstructura", 
                                                    "jxls.templates.xls.plazaMasiva");
                XLSTransformer transformer = new XLSTransformer();
             
                Map beans = new HashMap();


            beans.put("creacionPlazaMasivaDTO", creacionPlazaMasivaDTO);

            transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                     nombreArchivoXls);
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
        } catch (InvalidFormatException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFileConversionReubicacion] " + 
                                       e.toString(), e);
        } catch (IOException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFileConversionReubicacion] " + 
                                       e.toString(), e);
        } finally {
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }
    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasiva(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        String nombreArchivoXls = null;
        try {
            String usuario = super.identity().get().getUserID();
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date());
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
            creacionPlazaMasivaDTO.setAnio(anio);
            Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");
            nombreArchivoXls = 
                    super.configuration().getString("local.temp.dir") + 
                    File.separator + 
                    creacionPlazaMasivaDTO.getNombreArchivoErrores();
            InputStream inputStreamArchivoXls = 
                new FileInputStream(nombreArchivoXls);
            InputStream inputStreamArchivoXml = 
                new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
            List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = 
                parserXls.parseFile(inputStreamArchivoXls, 
                                    CreacionPlazaMasivaDTO.class);
            creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);
            String patron = "dd/MM/yyyy";
            String adecuacionActual = null;
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            Calendar calendarOfacFecOficio = Calendar.getInstance();
            List<HashMap<String, Object>> listaMapasTdPlazaAfectacion = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlazaAfectacion;
            Set<String> adecuacionSet = new HashSet<String>();

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                mapaTdPlazaAfectacion = new HashMap<String, Object>();
                mapaTdPlazaAfectacion.put("plafCiclo", anio);
                 adecuacionActual =  templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                 mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad( adecuacionActual, 5, '0'));
                mapaTdPlazaAfectacion.put("idPlaza", 
                                          templateFileCreatePlazaEstructura.getPlaza());
                mapaTdPlazaAfectacion.put("idOperacion", 
                                          OPERACION_CREACION_PLAZA_MASIVA);
                mapaTdPlazaAfectacion.put("idRegularizable", 
                                          templateFileCreatePlazaEstructura.getIsRegularizable() ? 
                                          1 : 9);
                mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                mapaTdPlazaAfectacion.put("idUnidad", 
                                          templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlazaAfectacion.put("idPuesto", 
                                          templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlazaAfectacion.put("idEdo", 
                                          templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlazaAfectacion.put("idZonaEcon", 
                                          templateFileCreatePlazaEstructura.getZona());
                mapaTdPlazaAfectacion.put("idGrupoPago", 
                                          CREACION_ID_GRUPO_PAGO);
                mapaTdPlazaAfectacion.put("plafProfAmplia", 
                                          CREACION_PLAF_PROY_REDUCE);
                mapaTdPlazaAfectacion.put("plafProfReduce", 
                                          CREACION_PREFIX_PLAF_PROY_AMPLIA + 
                                          adecuacionActual);
                mapaTdPlazaAfectacion.put("plafInicio", 
                                          templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlazaAfectacion.put("plafFinal", CREACION_PLAF_FINAL);
                mapaTdPlazaAfectacion.put("plafDiasPrima", 
                                          CREACION_PLAF_DIAS_PRIMA);
                mapaTdPlazaAfectacion.put("plafDiasAguinaldo", 
                                          CREACION_PLAF_DIAS_AGUINALDO);
                mapaTdPlazaAfectacion.put("usuario", usuario);
                mapaTdPlazaAfectacion.put("fecModifico", new Date());
                listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != 
                    null && !adecuacionSet.contains(anio + adecuacionActual)) {
                    adecuacionSet.add(anio + adecuacionActual);
                }

                calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());

            }


            Integer anioEntero = c.get(Calendar.YEAR);
            Iterator it = adecuacionSet.iterator();
            while (it.hasNext()) {

                //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                String adecuacion = (String)it.next();
                String idProyRegul = 
                    ID_PROY_REGUL_PREFIX_CREACION_PLAZA_ESTRUCTURAL_MASIVA + 
                    adecuacion.substring(4);
                TcProyRegularizaPK tcProyRegularizaPK = 
                    new TcProyRegularizaPK();
                tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                tcProyRegularizaPK.setPrCiclo(anioEntero);

                TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                tcProyRegulariza.setDescProyRegul(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION);
                tcProyRegulariza.setUsuario(usuario);
                tcProyRegulariza.setFecModifico(new Date());

                super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);

                ////Insertamos registros por adecuaciÛn en TD_PLAZA_AFECTACION

                Long idOficioAfecta = new Long(anio + StringUtils.leftPad( adecuacion.substring(4), 5, '0'));
                TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);


                TdOficioAfectacion tdOficioAfectacion = 
                    new TdOficioAfectacion();
                tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                tdOficioAfectacion.setOfacAplicaOficio(ID_PROY_REGUL_PREFIX_CREACION_PLAZA_ESTRUCTURAL_MASIVA);
                tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacNumAutoriza(null);
                tdOficioAfectacion.setOfacLeyendaJustif(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION);
                tdOficioAfectacion.setOfacTotalSecuencia(false);
                tdOficioAfectacion.setOfacTotalSecSiaff(false);
                tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                tdOficioAfectacion.setOfacTotalReduccion(0.0);
                tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate(hoy.getTime(), 
                                                                         Calendar.DATE)); // Fecha corta 
                tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                tdOficioAfectacion.setUsuario(usuario);
                tdOficioAfectacion.setFecModifico(hoy.getTime());
                tdOficioAfectacion.setOfacTipoAfectaci(CREACION_PREFIX_PLAF_PROY_AMPLIA);
                super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);

            }

            List<HashMap<String, Object>> listaMapasTdPlaza = 
                new ArrayList<HashMap<String, Object>>();
            List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlaza;
            HashMap<String, Object> mapaTnMovtosEmpPla;

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 listTemplateFileCreatePlazaEstructura) {
                adecuacionActual = templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                mapaTdPlaza = new HashMap<String, Object>();
                mapaTdPlaza.put("idPlaza", 
                                templateFileCreatePlazaEstructura.getPlaza());
                mapaTdPlaza.put("idSitPlaza", TD_PLAZA_ID_SIT_PLAZA_CREACION);
                mapaTdPlaza.put("plazaRfc", null);
                mapaTdPlaza.put("plazaCiclo", anioEntero);
                mapaTdPlaza.put("plazaRespaldo", TD_PLAZA_PLAZA_RESPALDO);
                mapaTdPlaza.put("idGrupoPago", TD_PLAZA_ID_GRUPO_PAGO);
                mapaTdPlaza.put("idUnidadPre", 
                                templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlaza.put("idPuestoPre", 
                                templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlaza.put("idEdoPre", 
                                templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlaza.put("idZonaEconPre", 
                                templateFileCreatePlazaEstructura.getZona());
                mapaTdPlaza.put("idRangoPre", TD_PLAZA_ID_RANGO_PRE);
                mapaTdPlaza.put("idProyReducePre", CREACION_PLAF_PROY_REDUCE);
                mapaTdPlaza.put("idProyAmpliaPre", CREACION_PREFIX_PLAF_PROY_AMPLIA + adecuacionActual);
                                
                mapaTdPlaza.put("idUnidadNom", 
                                templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlaza.put("idPuestoNom", 
                                templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlaza.put("idEdoNom", 
                                templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlaza.put("idMuniNom", TD_PLAZA_ID_MUNI_NOM);
                mapaTdPlaza.put("idZonEcoNom", 
                                templateFileCreatePlazaEstructura.getZona());
                mapaTdPlaza.put("idRangoNom", TD_PLAZA_ID_RANGO_NOM);
                mapaTdPlaza.put("idZonaDistNom", TD_PLAZA_ID_ZONA_DIST_NOM);
                mapaTdPlaza.put("importeHonorario", 
                                TD_PLAZA_IMPORTE_HONORARIO);
                mapaTdPlaza.put("idMovtoPersona", TD_PLAZA_ID_MOVTO_PERSONA);
                mapaTdPlaza.put("plazaUltimoMovto", 
                                templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlaza.put("plazaIniCont", 
                                templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlaza.put("plazaFinCont", 
                                formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto 
                mapaTdPlaza.put("plazaIniLic", null);
                mapaTdPlaza.put("plazaFinLic", null);
                mapaTdPlaza.put("plazaReferencia", 
                                TD_PLAZA_PLAZA_REFERENCIA + CREACION_PREFIX_PLAF_PROY_AMPLIA + 
                                adecuacionActual);
                mapaTdPlaza.put("plazaQnaCaptura", quincenaCaptura);
                mapaTdPlaza.put("idTipoPlaza", templateFileCreatePlazaEstructura.getIdTipoPlaza());
                mapaTdPlaza.put("idServPub", templateFileCreatePlazaEstructura.getIdServPub());
                mapaTdPlaza.put("idPtoEstrategico", templateFileCreatePlazaEstructura.getIdPtoEstrategico());
                mapaTdPlaza.put("idNodo", TD_PLAZA_ID_NODO);
                mapaTdPlaza.put("idInmueble", templateFileCreatePlazaEstructura.getIdInmueble() );
                mapaTdPlaza.put("plazaEdif", null);
                mapaTdPlaza.put("plazaPiso", null);
                mapaTdPlaza.put("plazaAla", null);
                mapaTdPlaza.put("plazaOfna", null);
                mapaTdPlaza.put("plazaTelOf1", null);
                mapaTdPlaza.put("plazaTelOf2", null);
                mapaTdPlaza.put("plazaConMut", null);
                mapaTdPlaza.put("plazaExt1", null);
                mapaTdPlaza.put("plazaExt2", null);
                mapaTdPlaza.put("usuario", usuario);
                mapaTdPlaza.put("fecModifico", new Date());
                listaMapasTdPlaza.add(mapaTdPlaza);
                
                TcAtributoPuesto tcAtributoPuesto = 
                    super.getAtributoPuesto(templateFileCreatePlazaEstructura.getCodigo());


                mapaTnMovtosEmpPla = new HashMap<String, Object>();
                mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
                mapaTnMovtosEmpPla.put("idMovtoPersona", 
                                       TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA);
                mapaTnMovtosEmpPla.put("idPlaza", 
                                       templateFileCreatePlazaEstructura.getPlaza());
                mapaTnMovtosEmpPla.put("idSituacionPlaza", 
                                       TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA);
                mapaTnMovtosEmpPla.put("mepRfc", null);
                mapaTnMovtosEmpPla.put("mepPlazaRespaldo", null);
                mapaTnMovtosEmpPla.put("idGrupoPago", 
                                       TN_MOVTOS_EMP_PLA_ID_GRUPO_PAGO);
                mapaTnMovtosEmpPla.put("idUnidadPre", 
                                       templateFileCreatePlazaEstructura.getUnidad());
                mapaTnMovtosEmpPla.put("idPuestoPre", 
                                       templateFileCreatePlazaEstructura.getCodigo());
                mapaTnMovtosEmpPla.put("idEdoPre", 
                                       templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnMovtosEmpPla.put("idZonaEcoPre", 
                                       templateFileCreatePlazaEstructura.getZona());
                mapaTnMovtosEmpPla.put("idRangoPre", 
                                       TN_MOVTOS_EMP_PLA_ID_RANGO_PRE);
                mapaTnMovtosEmpPla.put("idUnidadNom", 
                                       templateFileCreatePlazaEstructura.getUnidad());
                mapaTnMovtosEmpPla.put("idPuestoNom", 
                                       templateFileCreatePlazaEstructura.getCodigo());
                mapaTnMovtosEmpPla.put("idNivelPtoNom", 
                                       tcAtributoPuesto.getIdNivelPto());
                mapaTnMovtosEmpPla.put("idNombramientoNom", 
                                       tcAtributoPuesto.getIdNombramiento());
                mapaTnMovtosEmpPla.put("idJerarquiaNom", 
                                       tcAtributoPuesto.getIdJerarquia());
                mapaTnMovtosEmpPla.put("idEdoNom", 
                                       templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnMovtosEmpPla.put("idMuniNom", 
                                       TN_MOVTOS_EMP_PLA_ID_MUNI_NOM);
                mapaTnMovtosEmpPla.put("idZonaEcoNom", 
                                       templateFileCreatePlazaEstructura.getZona());
                mapaTnMovtosEmpPla.put("idRangoNom", 
                                       TN_MOVTOS_EMP_PLA_ID_RANGO_NOM);
                mapaTnMovtosEmpPla.put("idZonaDistNom", 
                                       TN_MOVTOS_EMP_PLA_ID_ZONA_DIST_NOM);
                mapaTnMovtosEmpPla.put("mepImporteHonorario", 
                                       TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
                mapaTnMovtosEmpPla.put("mepUltimoMovto", 
                                       templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnMovtosEmpPla.put("mepIniCont", 
                                       templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnMovtosEmpPla.put("mepFinCont", 
                                       formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto dd/mm/ YY
                mapaTnMovtosEmpPla.put("mepIniLic", null);
                mapaTnMovtosEmpPla.put("mepFinLic", null);
                mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
                mapaTnMovtosEmpPla.put("idTipoPlaza", templateFileCreatePlazaEstructura.getIdTipoPlaza());
                mapaTnMovtosEmpPla.put("idServPub", templateFileCreatePlazaEstructura.getIdServPub());
                mapaTnMovtosEmpPla.put("idPtoEstrategico", templateFileCreatePlazaEstructura.getIdPtoEstrategico());
                mapaTnMovtosEmpPla.put("idInmueble", templateFileCreatePlazaEstructura.getIdInmueble() );
                mapaTnMovtosEmpPla.put("mepEdif", null);
                mapaTnMovtosEmpPla.put("mepPiso", null);
                mapaTnMovtosEmpPla.put("mepAla", null);
                mapaTnMovtosEmpPla.put("mepOfna", null);
                mapaTnMovtosEmpPla.put("mepTelOf1", null);
                mapaTnMovtosEmpPla.put("mepTelOf2", null);
                mapaTnMovtosEmpPla.put("mepConmut", null);
                mapaTnMovtosEmpPla.put("mepExt1", null);
                mapaTnMovtosEmpPla.put("mepExt2", null);
                mapaTnMovtosEmpPla.put("mepRfcUnico", null);
                mapaTnMovtosEmpPla.put("idBancoSar", null);
                mapaTnMovtosEmpPla.put("idTipoPago", null);
                mapaTnMovtosEmpPla.put("mepImssIssste", null);
                mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
                mapaTnMovtosEmpPla.put("mepCurp", null);
                mapaTnMovtosEmpPla.put("mepNombre", null);
                mapaTnMovtosEmpPla.put("mepPrimerApellido", null);
                mapaTnMovtosEmpPla.put("mepSegundoApellido", null);
                mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
                mapaTnMovtosEmpPla.put("mepClabe", null);
                mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
                mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
                mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
                mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
                mapaTnMovtosEmpPla.put("mepCalleParticular", null);
                mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
                mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
                mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
                mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
                mapaTnMovtosEmpPla.put("mepTelParticular", null);
                mapaTnMovtosEmpPla.put("idEdoCivil", null);
                mapaTnMovtosEmpPla.put("mepEMailOficial", null);
                mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
                mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
                mapaTnMovtosEmpPla.put("idGenero", null);
                mapaTnMovtosEmpPla.put("idNacionalidad", null);
                mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
                mapaTnMovtosEmpPla.put("idNivelEscolar", null);
                mapaTnMovtosEmpPla.put("idProfnCarrera", null);
                mapaTnMovtosEmpPla.put("idInstEducativa", null);
                mapaTnMovtosEmpPla.put("idInstProtcivil", null);
                mapaTnMovtosEmpPla.put("idEspProtcivil", null);
                mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
                mapaTnMovtosEmpPla.put("mepPadreMadre", null);
                mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
                mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
                mapaTnMovtosEmpPla.put("idRusp", null);
                mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
                mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
                mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
                mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
                mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
                mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
                mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
                mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
                mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
                mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
                mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
                mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
                mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
                mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
                mapaTnMovtosEmpPla.put("mepObserva", null);
                mapaTnMovtosEmpPla.put("mepObservaInternas", null);
                mapaTnMovtosEmpPla.put("mepQnaCancela", null);
                mapaTnMovtosEmpPla.put("mepUsrCancela", null);
                mapaTnMovtosEmpPla.put("mepFechaCancela", null);
                mapaTnMovtosEmpPla.put("usuario", usuario);
                mapaTnMovtosEmpPla.put("fecModifico", new Date());
                listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);
            }
            super.persistence().get(CustomTdPlazaDAO.class).saveTdPlaza(listaMapasTdPlaza, 
                                                                        usuario);
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, 
                                                                                      usuario);

            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, 
                                                                                            usuario);
        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMPlazaEstructuraMasiva] " + 
                                       e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
        }
        return creacionPlazaMasivaDTO;
    }
    

    /**
     * MÈtodo encargado de actualizar los registros de la carga masiva de ConversiÛn y ReubicaciÛn
     * @param creacionPlazaMasivaDTO
     * @return creacionPlazaMasivaDTO CreacionPlazaMasivaDTO
     */
    public CreacionPlazaMasivaDTO updatePMConversionReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        Collator comparator = Collator.getInstance();
        comparator.setStrength(Collator.PRIMARY);
        String nombreArchivoXls=null;
        String usuario = super.identity().get().getUserID();
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        try {
          Calendar hoy = Calendar.getInstance();
          hoy.setTime(new Date());
          Calendar c = Calendar.getInstance(); 
          c.setTime(new Date());
          String anio = new Integer( (int) c.get(Calendar.YEAR)).toString();
          creacionPlazaMasivaDTO.setAnio(anio);
          String templateFileXml = 
              super.configuration().getString("plazaMasiva.templates.dir") + 
              File.separator + 
              super.configuration().getString("plazaMasivaEstructura", "jxls.templates.plazaMasiva");
          nombreArchivoXls = 
              super.configuration().getString("local.temp.dir") + 
              File.separator + creacionPlazaMasivaDTO.getNombreArchivoErrores(); 
          InputStream inputStreamArchivoXls = new FileInputStream(nombreArchivoXls); 
          InputStream inputStreamArchivoXml = new FileInputStream(templateFileXml);
          ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
          List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = 
              parserXls.parseFile(inputStreamArchivoXls, CreacionPlazaMasivaDTO.class);
          creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);                
          String patron = "dd/MM/yyyy";
          Formatter fmt = new Formatter();
          String adecuacionActual = null;
          SimpleDateFormat formato = new SimpleDateFormat(patron);
          Calendar calendarOfacFecOficio = Calendar.getInstance();
          
            
            List<HashMap<String,Object>> listaMapasTnPlantillaPlazaEstructura = new ArrayList<HashMap<String,Object>>();
                        HashMap<String,Object> mapaTnPlantillaPlazaEstructura;                           
                        for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                            mapaTnPlantillaPlazaEstructura = new HashMap<String,Object>();
                            mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual",templateFileCreatePlazaEstructura.getAdecuacionCicloActual() );
                            mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", templateFileCreatePlazaEstructura.getInicioVigencia() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", templateFileCreatePlazaEstructura.getUnidad() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel",templateFileCreatePlazaEstructura.getNivel() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", templateFileCreatePlazaEstructura.getZona() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", templateFileCreatePlazaEstructura.getCodigo() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza",templateFileCreatePlazaEstructura.getPlaza() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCasos",templateFileCreatePlazaEstructura.getCasos() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipo", templateFileCreatePlazaEstructura.getTipo() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEstatus",templateFileCreatePlazaEstructura.getEstatus() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCancelada", templateFileCreatePlazaEstructura.getCancelada() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoMov",templateFileCreatePlazaEstructura.getTipoMovimiento() );
                            mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", templateFileCreatePlazaEstructura.getRegularizable() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", templateFileCreatePlazaEstructura.getTipoPersonal() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", templateFileCreatePlazaEstructura.getEntidadFederativa() );
                            mapaTnPlantillaPlazaEstructura.put("usuario", usuario);
                            mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                            listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
                        }
                        
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, usuario);                                              
          
          
          
            // Se obtienen los que se van a cancelar          
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraCancelados = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaCancelados(usuario );
            
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                     new Comparator<CustomTnPlantillaPlazaEstructura>() {

                         public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                            CustomTnPlantillaPlazaEstructura o2) {
                             int regreso = 0;
                             regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                             return regreso;
                         }

                     };
            
            CustomTnPlantillaPlazaEstructura  customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();
            if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION)) {
            // Se obtienen los que se van a crear
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraCreados = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaCreados(usuario );
            
                     
                     
            
            Collections.sort(listaTnPlantillaPlazaEstructuraCancelados, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaEstructuraCreados, comparatorPlaza);
            
            
            
                  
            // obtengo las plazas que se van a crear         
            List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructuraCreacion = new ArrayList<CreacionPlazaMasivaDTO>();
             for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                    customTnPlantillaPlazaEstructura.setIdPlaza(templateFileCreatePlazaEstructura.getPlaza());
                 if((templateFileCreatePlazaEstructura.getTipo() != null && templateFileCreatePlazaEstructura.getTipo().equals(ID_TIPO_CREACION) || templateFileCreatePlazaEstructura.getTipo().equals("CREACI”N"))  && Collections.binarySearch(listaTnPlantillaPlazaEstructuraCreados, customTnPlantillaPlazaEstructura , comparatorPlaza) >= 0  ){  
                     listTemplateFileCreatePlazaEstructuraCreacion.add(templateFileCreatePlazaEstructura);
                 }
                }
            
            HashMap<String, Object> mapaTnMovtosEmpPlaCreacion;
            HashMap<String, Object> mapaTdPlazaCreacion;
            List<HashMap<String,Object>> listaMapasTdPlazaCreacion = new ArrayList<HashMap<String,Object>>();
            
            List<HashMap<String,Object>> listaMapasTnMovtosEmpPlaCreacion = new ArrayList<HashMap<String,Object>>();
            Integer anioEntero = c.get(Calendar.YEAR);
                // inicio proceso con las plazas que se van a crear
                 for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                      listTemplateFileCreatePlazaEstructuraCreacion) {
                     adecuacionActual = templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                     mapaTdPlazaCreacion = new HashMap<String, Object>();
                     mapaTdPlazaCreacion.put("idPlaza", 
                                     templateFileCreatePlazaEstructura.getPlaza());
                     mapaTdPlazaCreacion.put("idSitPlaza", TD_PLAZA_ID_SIT_PLAZA_CREACION);
                     mapaTdPlazaCreacion.put("plazaRfc", null);
                     mapaTdPlazaCreacion.put("plazaCiclo", anioEntero);
                     mapaTdPlazaCreacion.put("plazaRespaldo", TD_PLAZA_PLAZA_RESPALDO);
                     mapaTdPlazaCreacion.put("idGrupoPago", TD_PLAZA_ID_GRUPO_PAGO);
                     mapaTdPlazaCreacion.put("idUnidadPre", 
                                     templateFileCreatePlazaEstructura.getUnidad());
                     mapaTdPlazaCreacion.put("idPuestoPre", 
                                     templateFileCreatePlazaEstructura.getCodigo());
                     mapaTdPlazaCreacion.put("idEdoPre", 
                                     templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTdPlazaCreacion.put("idZonaEconPre", 
                                     templateFileCreatePlazaEstructura.getZona());
                     mapaTdPlazaCreacion.put("idRangoPre", TD_PLAZA_ID_RANGO_PRE);
                     if(templateFileCreatePlazaEstructura.getTipoMovimiento() != null && (templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase("CONVERSION") || templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase(("CONVERSI”N") ))){
                         mapaTdPlazaCreacion.put("idProyAmpliaPre", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                         mapaTdPlazaCreacion.put("idProyReducePre", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual);
                     }else if(templateFileCreatePlazaEstructura.getTipoMovimiento() != null && (templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase("REUBICACI”N") || templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase(("REUBICACI”N") ))){
                     mapaTdPlazaCreacion.put("idProyAmpliaPre", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                     mapaTdPlazaCreacion.put("idProyReducePre", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual);
                         }
                     mapaTdPlazaCreacion.put("idUnidadNom", 
                                     templateFileCreatePlazaEstructura.getUnidad());
                     mapaTdPlazaCreacion.put("idPuestoNom", 
                                     templateFileCreatePlazaEstructura.getCodigo());
                     mapaTdPlazaCreacion.put("idEdoNom", 
                                     templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTdPlazaCreacion.put("idMuniNom", TD_PLAZA_ID_MUNI_NOM);
                     mapaTdPlazaCreacion.put("idZonEcoNom", 
                                     templateFileCreatePlazaEstructura.getZona());
                     mapaTdPlazaCreacion.put("idRangoNom", TD_PLAZA_ID_RANGO_NOM);
                     mapaTdPlazaCreacion.put("idZonaDistNom", TD_PLAZA_ID_ZONA_DIST_NOM);
                     mapaTdPlazaCreacion.put("importeHonorario", 
                                     TD_PLAZA_IMPORTE_HONORARIO);
                     mapaTdPlazaCreacion.put("idMovtoPersona", TD_PLAZA_ID_MOVTO_PERSONA);
                     mapaTdPlazaCreacion.put("plazaUltimoMovto", 
                                     templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTdPlazaCreacion.put("plazaIniCont", 
                                     templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTdPlazaCreacion.put("plazaFinCont", 
                                     formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto 
                     mapaTdPlazaCreacion.put("plazaIniLic", null);
                     mapaTdPlazaCreacion.put("plazaFinLic", null);
                     mapaTdPlazaCreacion.put("plazaReferencia", 
                                     TD_PLAZA_PLAZA_REFERENCIA + CREACION_PREFIX_PLAF_PROY_AMPLIA + 
                                     adecuacionActual);
                     mapaTdPlazaCreacion.put("plazaQnaCaptura", quincenaCaptura);
                     mapaTdPlazaCreacion.put("idTipoPlaza", null);
                     mapaTdPlazaCreacion.put("idServPub", null);
                     mapaTdPlazaCreacion.put("idPtoEstrategico", null);
                     mapaTdPlazaCreacion.put("idNodo", TD_PLAZA_ID_NODO);
                     mapaTdPlazaCreacion.put("idInmueble", null);
                     mapaTdPlazaCreacion.put("plazaEdif", null);
                     mapaTdPlazaCreacion.put("plazaPiso", null);
                     mapaTdPlazaCreacion.put("plazaAla", null);
                     mapaTdPlazaCreacion.put("plazaOfna", null);
                     mapaTdPlazaCreacion.put("plazaTelOf1", null);
                     mapaTdPlazaCreacion.put("plazaTelOf2", null);
                     mapaTdPlazaCreacion.put("plazaConMut", null);
                     mapaTdPlazaCreacion.put("plazaExt1", null);
                     mapaTdPlazaCreacion.put("plazaExt2", null);
                     mapaTdPlazaCreacion.put("usuario", usuario);
                     mapaTdPlazaCreacion.put("fecModifico", new Date());
                     listaMapasTdPlazaCreacion.add(mapaTdPlazaCreacion);
                     
                     TcAtributoPuesto tcAtributoPuesto = 
                         super.getAtributoPuesto(templateFileCreatePlazaEstructura.getCodigo());


                     mapaTnMovtosEmpPlaCreacion = new HashMap<String, Object>();
                     mapaTnMovtosEmpPlaCreacion.put("idMovtosEmpPla", null);
                     mapaTnMovtosEmpPlaCreacion.put("idMovtoPersona", 
                                            TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA);
                     mapaTnMovtosEmpPlaCreacion.put("idPlaza", 
                                            templateFileCreatePlazaEstructura.getPlaza());
                     mapaTnMovtosEmpPlaCreacion.put("idSituacionPlaza", 
                                            TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA);
                     mapaTnMovtosEmpPlaCreacion.put("mepRfc", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPlazaRespaldo", null);
                     mapaTnMovtosEmpPlaCreacion.put("idGrupoPago", 
                                            TN_MOVTOS_EMP_PLA_ID_GRUPO_PAGO);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadPre", 
                                            templateFileCreatePlazaEstructura.getUnidad());
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoPre", 
                                            templateFileCreatePlazaEstructura.getCodigo());
                     mapaTnMovtosEmpPlaCreacion.put("idEdoPre", 
                                            templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoPre", 
                                            templateFileCreatePlazaEstructura.getZona());
                     mapaTnMovtosEmpPlaCreacion.put("idRangoPre", 
                                            TN_MOVTOS_EMP_PLA_ID_RANGO_PRE);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadNom", 
                                            templateFileCreatePlazaEstructura.getUnidad());
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoNom", 
                                            templateFileCreatePlazaEstructura.getCodigo());
                     mapaTnMovtosEmpPlaCreacion.put("idNivelPtoNom", 
                                            tcAtributoPuesto.getIdNivelPto());
                     mapaTnMovtosEmpPlaCreacion.put("idNombramientoNom", 
                                            tcAtributoPuesto.getIdNombramiento());
                     mapaTnMovtosEmpPlaCreacion.put("idJerarquiaNom", 
                                            tcAtributoPuesto.getIdJerarquia());
                     mapaTnMovtosEmpPlaCreacion.put("idEdoNom", 
                                            templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTnMovtosEmpPlaCreacion.put("idMuniNom", 
                                            TN_MOVTOS_EMP_PLA_ID_MUNI_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoNom", 
                                            templateFileCreatePlazaEstructura.getZona());
                     mapaTnMovtosEmpPlaCreacion.put("idRangoNom", 
                                            TN_MOVTOS_EMP_PLA_ID_RANGO_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaDistNom", 
                                            TN_MOVTOS_EMP_PLA_ID_ZONA_DIST_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("mepImporteHonorario", 
                                            TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
                     mapaTnMovtosEmpPlaCreacion.put("mepUltimoMovto", 
                                            templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTnMovtosEmpPlaCreacion.put("mepIniCont", 
                                            templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTnMovtosEmpPlaCreacion.put("mepFinCont", 
                                            formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto dd/mm/ YY
                     mapaTnMovtosEmpPlaCreacion.put("mepIniLic", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFinLic", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepQnaCaptura", quincenaCaptura);
                     mapaTnMovtosEmpPlaCreacion.put("idTipoPlaza", null);
                     mapaTnMovtosEmpPlaCreacion.put("idServPub", null);
                     mapaTnMovtosEmpPlaCreacion.put("idPtoEstrategico", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInmueble", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEdif", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPiso", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepAla", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepOfna", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelOf1", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelOf2", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepConmut", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepExt1", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepExt2", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepRfcUnico", null);
                     mapaTnMovtosEmpPlaCreacion.put("idBancoSar", null);
                     mapaTnMovtosEmpPlaCreacion.put("idTipoPago", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepImssIssste", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSistemaReparto", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCurp", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepNombre", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPrimerApellido", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSegundoApellido", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecNacimiento", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepClabe", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepReferenciaOficio", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepIngresoGobFed", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepIngresoDependencia", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCasoMuestra", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCalleParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepColoniaParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveMuniParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveEdoParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCodpostParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEdoCivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEMailOficial", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEMailPersonal", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveEdoNac", null);
                     mapaTnMovtosEmpPlaCreacion.put("idGenero", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNacionalidad", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepDiscapacidad", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNivelEscolar", null);
                     mapaTnMovtosEmpPlaCreacion.put("idProfnCarrera", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInstEducativa", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInstProtcivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEspProtcivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEstudiaSiNo", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPadreMadre", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTerminoCargoSind", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCompatEmpleo", null);
                     mapaTnMovtosEmpPlaCreacion.put("idRusp", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecNotDecPatr", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecIniDeclPatr", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecIngSpc", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSpcAnioAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEdoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idMuniNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idRangoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNombramientoAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPlazaAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNivelPtoAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idJerarquiaAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepObserva", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepObservaInternas", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepQnaCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepUsrCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFechaCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("usuario", usuario);
                     mapaTnMovtosEmpPlaCreacion.put("fecModifico", new Date());
                     listaMapasTnMovtosEmpPlaCreacion.add(mapaTnMovtosEmpPlaCreacion);

                 }
                 
            // se insertan las plazas nuevas
            super.persistence().get(CustomTdPlazaDAO.class).saveTdPlaza(listaMapasTdPlazaCreacion, usuario);
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPlaCreacion, usuario);

                //fin proceso con las plazas que se van a crear
            }
                 List<HashMap<String,Object>> listaMapasTdPlazaAfectacion = new ArrayList<HashMap<String,Object>>();
                 HashMap<String,Object> mapaTdPlazaAfectacion;  
                 Set<String> adecuacionSet = new HashSet<String>();
                 HashMap<String,Object> mapaTdPlaza;  
                 List<HashMap<String, Object>> listaMapasTdPlaza = new ArrayList<HashMap<String, Object>>();
                 List<HashMap<String,Object>> listaMapasTnMovtosEmpPla = new ArrayList<HashMap<String,Object>>();
                          for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                          mapaTdPlazaAfectacion = new HashMap<String,Object>();
                          
                          adecuacionActual =  templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                          mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad( adecuacionActual, 5, '0'));
                          mapaTdPlazaAfectacion.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                          mapaTdPlazaAfectacion.put("idOperacion", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0  ?  OPERACION_CREACION_PLAZA_MASIVA : OPERACION_CANCELACION_PLAZA_MASIVA);
                          mapaTdPlazaAfectacion.put("idRegularizable", templateFileCreatePlazaEstructura.getIsRegularizable()?1:9);
                          mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                          mapaTdPlazaAfectacion.put("idUnidad", templateFileCreatePlazaEstructura.getUnidad());
                          mapaTdPlazaAfectacion.put("idPuesto", templateFileCreatePlazaEstructura.getCodigo());
                          mapaTdPlazaAfectacion.put("idEdo", templateFileCreatePlazaEstructura.getEntidadFederativa());
                          mapaTdPlazaAfectacion.put("idZonaEcon", templateFileCreatePlazaEstructura.getZona());
                          mapaTdPlazaAfectacion.put("idGrupoPago", CREACION_ID_GRUPO_PAGO);
                          if(templateFileCreatePlazaEstructura.getTipoMovimiento() != null && (templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase("CONVERSION") || templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase(("CONVERSI”N") ))){
                              mapaTdPlazaAfectacion.put("plafProfAmplia", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                              mapaTdPlazaAfectacion.put("plafProfReduce", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual);
                          }else if(templateFileCreatePlazaEstructura.getTipoMovimiento() != null && (templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase("REUBICACI”N") || templateFileCreatePlazaEstructura.getTipoMovimiento().equalsIgnoreCase(("REUBICACI”N") ))){
                          mapaTdPlazaAfectacion.put("plafProfAmplia", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                          mapaTdPlazaAfectacion.put("plafProfReduce", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual);
                              }
                          mapaTdPlazaAfectacion.put("plafInicio", templateFileCreatePlazaEstructura.getInicioVigencia() != null ? DateUtils.truncate(templateFileCreatePlazaEstructura.getInicioVigencia(), Calendar.DATE) : null);
                          mapaTdPlazaAfectacion.put("plafFinal", templateFileCreatePlazaEstructura.getIsRegularizable() ? formato.parse(CREACION_PLAF_FINAL)  : formato.parse( CREACION_PLAF_FINAL_NO_REGULARIZABLE + anio));
                          mapaTdPlazaAfectacion.put("plafDiasPrima", CREACION_PLAF_DIAS_PRIMA);
                          mapaTdPlazaAfectacion.put("plafDiasAguinaldo", CREACION_PLAF_DIAS_AGUINALDO);
                          mapaTdPlazaAfectacion.put("usuario", usuario);
                          mapaTdPlazaAfectacion.put("plafCiclo", anio);
                          mapaTdPlazaAfectacion.put("fecModifico", new Date());
                          listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != null && !adecuacionSet.contains(anio + adecuacionActual) && 
                    (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0 || 
                     comparator.compare(templateFileCreatePlazaEstructura.getTipo(), "CREACI”N") == 0)) {
                        adecuacionSet.add(anio + adecuacionActual);
                }
                          calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());
                          
                      }
                     Integer anioEntero = c.get(Calendar.YEAR);
                      Iterator it = adecuacionSet.iterator();
                      while(it.hasNext()) {
                          //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                          String adecuacion = (String) it.next();
                          String idProyRegul = (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? CREACION_PREFIX_PLAF_PROY_CONVERSION : CREACION_PREFIX_PLAF_PROY_REUBICACION) + adecuacion.substring(4);
                          TcProyRegularizaPK tcProyRegularizaPK = new TcProyRegularizaPK();
                          tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                          tcProyRegularizaPK.setPrCiclo(anioEntero);
                          
                          TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                          tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                          tcProyRegulariza.setDescProyRegul(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CONVERSION : DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_REUBICACION);
                          tcProyRegulariza.setUsuario(usuario);
                          tcProyRegulariza.setFecModifico(new Date());
                          
                          super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);
                          
                          ////Insertamos registros por adecuaciÛn en TD_OFICIO_AFECTACION
                          
                          Long idOficioAfecta = new Long(anio + StringUtils.leftPad( adecuacion.substring(4), 5, '0'));
                           TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                          tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                          tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);
                           
                           
                          TdOficioAfectacion tdOficioAfectacion = new TdOficioAfectacion();
                          tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                          tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                          tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                          tdOficioAfectacion.setOfacAplicaOficio(CREACION_PREFIX_PLAF_PROY_CONVERSION);
                          tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                          tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                          tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(),  Calendar.DATE) : null );
                          tdOficioAfectacion.setOfacNumAutoriza(null);
                          tdOficioAfectacion.setOfacLeyendaJustif(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? ID_TIPO_MOVIMIENTO_CONVERSION : ID_TIPO_MOVIMIENTO_REUBICACION);
                          tdOficioAfectacion.setOfacTotalSecuencia(false);
                          tdOficioAfectacion.setOfacTotalSecSiaff(false);
                          tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                          tdOficioAfectacion.setOfacTotalReduccion(0.0);
                          tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(), Calendar.DATE) : null);
                          tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                          tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate( hoy.getTime(), Calendar.DATE));
                          tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                          tdOficioAfectacion.setUsuario(usuario);
                          tdOficioAfectacion.setFecModifico(hoy.getTime());
                          tdOficioAfectacion.setOfacTipoAfectaci(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? CREACION_PREFIX_PLAF_PROY_CONVERSION : CREACION_PREFIX_PLAF_PROY_REUBICACION);
                          
                          super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);
                          
                      }
          
            HashMap<String, Object> mapaTnMovtosEmpPla;
          
            
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                TdEmpleado tdEmpleado = null;
                TdPlaza tdPlaza = null;
                TcAtributoPuesto tcAtributoPuesto = null;
                // Consultamos la plaza en TD_PLAZA
                tdPlaza = super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getPlaza());
                tcAtributoPuesto = super.getAtributoPuesto(tdPlaza.getIdPuestoPre());

                if (tdPlaza.getPlazaRfc() != null && tdPlaza.getPlazaRfc().length() > 0) {
                    tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(tdPlaza.getPlazaRfc());
                }
                
                
                customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();
                customTnPlantillaPlazaEstructura.setIdPlaza(templateFileCreatePlazaEstructura.getPlaza());
                if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    mapaTdPlaza = new HashMap<String, Object>();
                    mapaTdPlaza.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                    mapaTdPlaza.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                    if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION)) {
                        mapaTdPlaza.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                    }
                    mapaTdPlaza.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                    mapaTdPlaza.put("idZonaEconPre", templateFileCreatePlazaEstructura.getZona());
                    mapaTdPlaza.put("usuario", usuario);
                    mapaTdPlaza.put("fecModifico", new Date());
                    listaMapasTdPlaza.add(mapaTdPlaza);
                }

            
              mapaTnMovtosEmpPla = new HashMap<String,Object>();
              mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
              Integer idMovtosPersona = null;
              
              // Determina el idMovtosPersona que se va a insertar 
              if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    if (comparator.compare(creacionPlazaMasivaDTO.getTipoProceso(), TIPO_MOVIMIENTO_CONVERSION) == 0) {
                        idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CONVERSION;
                    } else if (comparator.compare(creacionPlazaMasivaDTO.getTipoProceso(), TIPO_MOVIMIENTO_REUBICACION) == 0) {
                        idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_REUBICACION;
                    } 
                }else if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CANCELACION) == 0) {
                        idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CANCELACION;
                    }
              
              mapaTnMovtosEmpPla.put("idMovtoPersona", idMovtosPersona);
              mapaTnMovtosEmpPla.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
              mapaTnMovtosEmpPla.put("idSituacionPlaza", tdPlaza.getIdSitPlaza() );
              mapaTnMovtosEmpPla.put("mepRfc", tdPlaza.getPlazaRfc());
              mapaTnMovtosEmpPla.put("mepPlazaRespaldo", tdPlaza.getPlazaRespaldo() );
              mapaTnMovtosEmpPla.put("idGrupoPago", tdPlaza.getIdGrupoPago() );
              mapaTnMovtosEmpPla.put("idUnidadPre",templateFileCreatePlazaEstructura.getUnidad());
              mapaTnMovtosEmpPla.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
              mapaTnMovtosEmpPla.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
              mapaTnMovtosEmpPla.put("idZonaEcoPre", templateFileCreatePlazaEstructura.getZona());
              mapaTnMovtosEmpPla.put("idRangoPre", tdPlaza.getIdRangoPre());
              mapaTnMovtosEmpPla.put("idUnidadNom", tdPlaza.getIdUnidadNom() );
              mapaTnMovtosEmpPla.put("idPuestoNom", tdPlaza.getIdPuestoNom() );
              mapaTnMovtosEmpPla.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto() );
              mapaTnMovtosEmpPla.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento() );
              mapaTnMovtosEmpPla.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia() );
              mapaTnMovtosEmpPla.put("idEdoNom", tdPlaza.getIdEdoNom() );
              mapaTnMovtosEmpPla.put("idMuniNom", tdPlaza.getIdMuniNom());
              mapaTnMovtosEmpPla.put("idZonaEcoNom", tdPlaza.getIdZonaEcoNom() );
              mapaTnMovtosEmpPla.put("idRangoNom", tdPlaza.getIdRangoNom() );
              mapaTnMovtosEmpPla.put("idZonaDistNom", tdPlaza.getIdZonaDistNom() );
              mapaTnMovtosEmpPla.put("mepImporteHonorario", TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
              mapaTnMovtosEmpPla.put("mepUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepFinCont", formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT));
              mapaTnMovtosEmpPla.put("mepIniLic", null);
              mapaTnMovtosEmpPla.put("mepFinLic", null);
              mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
              mapaTnMovtosEmpPla.put("idTipoPlaza", tdPlaza.getIdTipoPlaza() );
              mapaTnMovtosEmpPla.put("idServPub", tdPlaza.getIdServPub() );
              mapaTnMovtosEmpPla.put("idPtoEstrategico", tdPlaza.getIdPtoEstrategico() );
              mapaTnMovtosEmpPla.put("idInmueble", tdPlaza.getIdInmueble() );
              mapaTnMovtosEmpPla.put("mepEdif", null);
              mapaTnMovtosEmpPla.put("mepPiso", null);
              mapaTnMovtosEmpPla.put("mepAla", null);
              mapaTnMovtosEmpPla.put("mepOfna", null);
              mapaTnMovtosEmpPla.put("mepTelOf1", null);
              mapaTnMovtosEmpPla.put("mepTelOf2", null);
              mapaTnMovtosEmpPla.put("mepConmut", null);
              mapaTnMovtosEmpPla.put("mepExt1", null);
              mapaTnMovtosEmpPla.put("mepExt2", null);
              mapaTnMovtosEmpPla.put("mepRfcUnico", null);
              mapaTnMovtosEmpPla.put("idBancoSar", null);
              mapaTnMovtosEmpPla.put("idTipoPago", null);
              mapaTnMovtosEmpPla.put("mepImssIssste", null);
              mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
              mapaTnMovtosEmpPla.put("mepCurp", tdEmpleado != null ? tdEmpleado.getRfcEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepNombre", tdEmpleado != null ? tdEmpleado.getNombreEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepPrimerApellido", tdEmpleado != null ? tdEmpleado.getPrimerApellido() : null );
              mapaTnMovtosEmpPla.put("mepSegundoApellido", tdEmpleado != null ? tdEmpleado.getSegundoApellido() : null);
              mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
              mapaTnMovtosEmpPla.put("mepClabe", null);
              mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
              mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
              mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
              mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
              mapaTnMovtosEmpPla.put("mepCalleParticular", null);
              mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
              mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
              mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
              mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
              mapaTnMovtosEmpPla.put("mepTelParticular", null);
              mapaTnMovtosEmpPla.put("idEdoCivil", null);
              mapaTnMovtosEmpPla.put("mepEMailOficial", null);
              mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
              mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
              mapaTnMovtosEmpPla.put("idGenero", null);
              mapaTnMovtosEmpPla.put("idNacionalidad", null);
              mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
              mapaTnMovtosEmpPla.put("idNivelEscolar", null);
              mapaTnMovtosEmpPla.put("idProfnCarrera", null);
              mapaTnMovtosEmpPla.put("idInstEducativa", null);
              mapaTnMovtosEmpPla.put("idInstProtcivil", null);
              mapaTnMovtosEmpPla.put("idEspProtcivil", null);
              mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
              mapaTnMovtosEmpPla.put("mepPadreMadre", null);
              mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
              mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
              mapaTnMovtosEmpPla.put("idRusp", null);
              mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
              mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
              mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
              mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
              mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
              mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
              mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
              mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
              mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
              mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
              mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
              mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
              mapaTnMovtosEmpPla.put("mepObserva", null);
              mapaTnMovtosEmpPla.put("mepObservaInternas", null);
              mapaTnMovtosEmpPla.put("mepQnaCancela", null);
              mapaTnMovtosEmpPla.put("mepUsrCancela", null);
              mapaTnMovtosEmpPla.put("mepFechaCancela", null);
              mapaTnMovtosEmpPla.put("usuario", usuario);
              mapaTnMovtosEmpPla.put("fecModifico", new Date());
              listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);

            }

            if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION)) {
                super.persistence().get(CustomTdPlazaDAO.class).updateTdPlaza(listaMapasTdPlaza, usuario);
                } else if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_REUBICACION)) {
                super.persistence().get(CustomTdPlazaDAO.class).updateTdPlazaReubicacion(listaMapasTdPlaza, usuario);
            }

            if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION)) {
                for(CustomTnPlantillaPlazaEstructura templateFileCreatePlazaEstructura : listaTnPlantillaPlazaEstructuraCancelados ){
                    TdPlaza plazaCancelada = super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getIdPlaza());
                    super.persistence().get(TdPlazaDAO.class).delete(plazaCancelada);
                }
            }

            
            // Se insertan los movimientos de conversion / reubicacion
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, usuario);

            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, usuario);
            

            creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.proceso.terminado"));

        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMConversionReubicacion] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMConversionReubicacion] " + 
                                       e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }
    
    /**
     * MÈtodo encargado de actualizar los registros de la carga masiva de ConversiÛn y ReubicaciÛn
     * @param creacionPlazaMasivaDTO
     * @return creacionPlazaMasivaDTO CreacionPlazaMasivaDTO
     */
    public CreacionPlazaMasivaDTO updatePMConversion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        Collator comparator = Collator.getInstance();
        comparator.setStrength(Collator.PRIMARY);
        String nombreArchivoXls=null;
        String usuario = super.identity().get().getUserID();
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        try {
          
          Calendar hoy = Calendar.getInstance();
          hoy.setTime(new Date());
          Calendar c = Calendar.getInstance(); 
          c.setTime(new Date());
          String anio = new Integer( (int) c.get(Calendar.YEAR)).toString();
          creacionPlazaMasivaDTO.setAnio(anio);
          String templateFileXml = super.configuration().getString("plazaMasiva.templates.dir") + File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.plazaMasiva");
          nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + creacionPlazaMasivaDTO.getNombreArchivoErrores(); 
          InputStream inputStreamArchivoXls = new FileInputStream(nombreArchivoXls);
          InputStream inputStreamArchivoXml = new FileInputStream(templateFileXml);
          ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
          List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = parserXls.parseFile(inputStreamArchivoXls, CreacionPlazaMasivaDTO.class);
          creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);                
          String patron = "dd/MM/yyyy";
          String adecuacionActual = null;
          SimpleDateFormat formato = new SimpleDateFormat(patron);
          Calendar calendarOfacFecOficio = Calendar.getInstance();


            List<HashMap<String, Object>> listaMapasTnPlantillaPlazaEstructura = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnPlantillaPlazaEstructura;
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: listTemplateFileCreatePlazaEstructura) {
                mapaTnPlantillaPlazaEstructura = new HashMap<String, Object>();
                mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual", templateFileCreatePlazaEstructura.getAdecuacionCicloActual());
                mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", templateFileCreatePlazaEstructura.getUnidad());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel", templateFileCreatePlazaEstructura.getNivel());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", templateFileCreatePlazaEstructura.getZona());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", templateFileCreatePlazaEstructura.getCodigo());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza", templateFileCreatePlazaEstructura.getPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeCasos", templateFileCreatePlazaEstructura.getCasos());
                mapaTnPlantillaPlazaEstructura.put("ppeTipo", templateFileCreatePlazaEstructura.getTipo());
                mapaTnPlantillaPlazaEstructura.put("ppeEstatus", templateFileCreatePlazaEstructura.getEstatus());
                mapaTnPlantillaPlazaEstructura.put("ppeCancelada", templateFileCreatePlazaEstructura.getCancelada());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoMov", templateFileCreatePlazaEstructura.getTipoMovimiento());
                mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", templateFileCreatePlazaEstructura.getRegularizable());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", templateFileCreatePlazaEstructura.getTipoPersonal());
                mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnPlantillaPlazaEstructura.put("usuario", usuario);
                mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
            }

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, usuario);


            // Se obtienen los que se van a cancelar          
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraCancelados = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaCancelados(usuario );
            
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }
                };
            
            CustomTnPlantillaPlazaEstructura  customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();
            if (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION)) {
            
            // Se obtienen los que se van a crear
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraCreados = super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaCreados(usuario);
            
            Collections.sort(listaTnPlantillaPlazaEstructuraCancelados, comparatorPlaza);
            Collections.sort(listaTnPlantillaPlazaEstructuraCreados, comparatorPlaza);
                  
            // obtengo las plazas que se van a crear         
                List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructuraCreacion = new ArrayList<CreacionPlazaMasivaDTO>();
                for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: listTemplateFileCreatePlazaEstructura) {
                    customTnPlantillaPlazaEstructura.setIdPlaza(templateFileCreatePlazaEstructura.getPlaza());
                    if ((templateFileCreatePlazaEstructura.getTipo() != null && templateFileCreatePlazaEstructura.getTipo().equals(ID_TIPO_CREACION) || templateFileCreatePlazaEstructura.getTipo().equals("CREACI”N")) && 
                    Collections.binarySearch(listaTnPlantillaPlazaEstructuraCreados, customTnPlantillaPlazaEstructura, comparatorPlaza) >= 0) {
                        listTemplateFileCreatePlazaEstructuraCreacion.add(templateFileCreatePlazaEstructura);
                    }
                }

            HashMap<String, Object> mapaTnMovtosEmpPlaCreacion;
            HashMap<String, Object> mapaTdPlazaCreacion;
            List<HashMap<String,Object>> listaMapasTdPlazaCreacion = new ArrayList<HashMap<String,Object>>();
            
            List<HashMap<String,Object>> listaMapasTnMovtosEmpPlaCreacion = new ArrayList<HashMap<String,Object>>();
            Integer anioEntero = c.get(Calendar.YEAR);
                // inicio proceso con las plazas que se van a crear
                 for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: listTemplateFileCreatePlazaEstructuraCreacion) {
                     adecuacionActual = templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                     mapaTdPlazaCreacion = new HashMap<String, Object>();
                     mapaTdPlazaCreacion.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                     mapaTdPlazaCreacion.put("idSitPlaza", TD_PLAZA_ID_SIT_PLAZA_CREACION);
                     mapaTdPlazaCreacion.put("plazaRfc", null);
                     mapaTdPlazaCreacion.put("plazaCiclo", anioEntero);
                     mapaTdPlazaCreacion.put("plazaRespaldo", TD_PLAZA_PLAZA_RESPALDO);
                     mapaTdPlazaCreacion.put("idGrupoPago", TD_PLAZA_ID_GRUPO_PAGO);
                     mapaTdPlazaCreacion.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                     mapaTdPlazaCreacion.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                     mapaTdPlazaCreacion.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTdPlazaCreacion.put("idZonaEconPre", templateFileCreatePlazaEstructura.getZona());
                     mapaTdPlazaCreacion.put("idRangoPre", TD_PLAZA_ID_RANGO_PRE);
                     mapaTdPlazaCreacion.put("idProyAmpliaPre", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                     mapaTdPlazaCreacion.put("idProyReducePre", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual);
                     mapaTdPlazaCreacion.put("idUnidadNom", templateFileCreatePlazaEstructura.getUnidad());
                     mapaTdPlazaCreacion.put("idPuestoNom", templateFileCreatePlazaEstructura.getCodigo());
                     mapaTdPlazaCreacion.put("idEdoNom", templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTdPlazaCreacion.put("idMuniNom", TD_PLAZA_ID_MUNI_NOM);
                     mapaTdPlazaCreacion.put("idZonEcoNom", templateFileCreatePlazaEstructura.getZona());
                     mapaTdPlazaCreacion.put("idRangoNom", TD_PLAZA_ID_RANGO_NOM);
                     mapaTdPlazaCreacion.put("idZonaDistNom", TD_PLAZA_ID_ZONA_DIST_NOM);
                     mapaTdPlazaCreacion.put("importeHonorario", TD_PLAZA_IMPORTE_HONORARIO);
                     mapaTdPlazaCreacion.put("idMovtoPersona", TD_PLAZA_ID_MOVTO_PERSONA);
                     mapaTdPlazaCreacion.put("plazaUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTdPlazaCreacion.put("plazaIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTdPlazaCreacion.put("plazaFinCont", formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto 
                     mapaTdPlazaCreacion.put("plazaIniLic", null);
                     mapaTdPlazaCreacion.put("plazaFinLic", null);
                     mapaTdPlazaCreacion.put("plazaReferencia", TD_PLAZA_PLAZA_REFERENCIA + CREACION_PREFIX_PLAF_PROY_AMPLIA + adecuacionActual);
                     mapaTdPlazaCreacion.put("plazaQnaCaptura", quincenaCaptura);
                     mapaTdPlazaCreacion.put("idTipoPlaza", null);
                     mapaTdPlazaCreacion.put("idServPub", null);
                     mapaTdPlazaCreacion.put("idPtoEstrategico", null);
                     mapaTdPlazaCreacion.put("idNodo", TD_PLAZA_ID_NODO);
                     mapaTdPlazaCreacion.put("idInmueble", null);
                     mapaTdPlazaCreacion.put("plazaEdif", null);
                     mapaTdPlazaCreacion.put("plazaPiso", null);
                     mapaTdPlazaCreacion.put("plazaAla", null);
                     mapaTdPlazaCreacion.put("plazaOfna", null);
                     mapaTdPlazaCreacion.put("plazaTelOf1", null);
                     mapaTdPlazaCreacion.put("plazaTelOf2", null);
                     mapaTdPlazaCreacion.put("plazaConMut", null);
                     mapaTdPlazaCreacion.put("plazaExt1", null);
                     mapaTdPlazaCreacion.put("plazaExt2", null);
                     mapaTdPlazaCreacion.put("usuario", usuario);
                     mapaTdPlazaCreacion.put("fecModifico", new Date());
                     listaMapasTdPlazaCreacion.add(mapaTdPlazaCreacion);
                     
                     TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(templateFileCreatePlazaEstructura.getCodigo());


                     mapaTnMovtosEmpPlaCreacion = new HashMap<String, Object>();
                     mapaTnMovtosEmpPlaCreacion.put("idMovtosEmpPla", null);
                     mapaTnMovtosEmpPlaCreacion.put("idMovtoPersona", TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA);
                     mapaTnMovtosEmpPlaCreacion.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                     mapaTnMovtosEmpPlaCreacion.put("idSituacionPlaza", TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA);
                     mapaTnMovtosEmpPlaCreacion.put("mepRfc", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPlazaRespaldo", null);
                     mapaTnMovtosEmpPlaCreacion.put("idGrupoPago", TN_MOVTOS_EMP_PLA_ID_GRUPO_PAGO);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                     mapaTnMovtosEmpPlaCreacion.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoPre", templateFileCreatePlazaEstructura.getZona());
                     mapaTnMovtosEmpPlaCreacion.put("idRangoPre", TN_MOVTOS_EMP_PLA_ID_RANGO_PRE);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadNom", templateFileCreatePlazaEstructura.getUnidad());
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoNom", templateFileCreatePlazaEstructura.getCodigo());
                     mapaTnMovtosEmpPlaCreacion.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto());
                     mapaTnMovtosEmpPlaCreacion.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento());
                     mapaTnMovtosEmpPlaCreacion.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia());
                     mapaTnMovtosEmpPlaCreacion.put("idEdoNom", templateFileCreatePlazaEstructura.getEntidadFederativa());
                     mapaTnMovtosEmpPlaCreacion.put("idMuniNom", TN_MOVTOS_EMP_PLA_ID_MUNI_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoNom", templateFileCreatePlazaEstructura.getZona());
                     mapaTnMovtosEmpPlaCreacion.put("idRangoNom", TN_MOVTOS_EMP_PLA_ID_RANGO_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaDistNom", TN_MOVTOS_EMP_PLA_ID_ZONA_DIST_NOM);
                     mapaTnMovtosEmpPlaCreacion.put("mepImporteHonorario", TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
                     mapaTnMovtosEmpPlaCreacion.put("mepUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTnMovtosEmpPlaCreacion.put("mepIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
                     mapaTnMovtosEmpPlaCreacion.put("mepFinCont", formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT)); // Formato Corto dd/mm/ YY
                     mapaTnMovtosEmpPlaCreacion.put("mepIniLic", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFinLic", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepQnaCaptura", quincenaCaptura);
                     mapaTnMovtosEmpPlaCreacion.put("idTipoPlaza", null);
                     mapaTnMovtosEmpPlaCreacion.put("idServPub", null);
                     mapaTnMovtosEmpPlaCreacion.put("idPtoEstrategico", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInmueble", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEdif", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPiso", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepAla", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepOfna", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelOf1", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelOf2", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepConmut", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepExt1", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepExt2", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepRfcUnico", null);
                     mapaTnMovtosEmpPlaCreacion.put("idBancoSar", null);
                     mapaTnMovtosEmpPlaCreacion.put("idTipoPago", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepImssIssste", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSistemaReparto", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCurp", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepNombre", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPrimerApellido", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSegundoApellido", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecNacimiento", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepClabe", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepReferenciaOficio", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepIngresoGobFed", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepIngresoDependencia", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCasoMuestra", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCalleParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepColoniaParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveMuniParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveEdoParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCodpostParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTelParticular", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEdoCivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEMailOficial", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEMailPersonal", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCveEdoNac", null);
                     mapaTnMovtosEmpPlaCreacion.put("idGenero", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNacionalidad", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepDiscapacidad", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNivelEscolar", null);
                     mapaTnMovtosEmpPlaCreacion.put("idProfnCarrera", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInstEducativa", null);
                     mapaTnMovtosEmpPlaCreacion.put("idInstProtcivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEspProtcivil", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepEstudiaSiNo", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPadreMadre", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepTerminoCargoSind", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepCompatEmpleo", null);
                     mapaTnMovtosEmpPlaCreacion.put("idRusp", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecNotDecPatr", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecIniDeclPatr", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFecIngSpc", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepSpcAnioAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idUnidadNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idPuestoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idEdoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idMuniNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idZonaEcoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idRangoNomAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNombramientoAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepPlazaAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idNivelPtoAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("idJerarquiaAnt", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepObserva", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepObservaInternas", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepQnaCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepUsrCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("mepFechaCancela", null);
                     mapaTnMovtosEmpPlaCreacion.put("usuario", usuario);
                     mapaTnMovtosEmpPlaCreacion.put("fecModifico", new Date());
                     listaMapasTnMovtosEmpPlaCreacion.add(mapaTnMovtosEmpPlaCreacion);
                }

                // se insertan las plazas nuevas
                super.persistence().get(CustomTdPlazaDAO.class).saveTdPlaza(listaMapasTdPlazaCreacion, usuario);
                super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPlaCreacion, usuario);
                //fin proceso con las plazas que se van a crear
            }
            List<HashMap<String, Object>> listaMapasTdPlazaAfectacion = new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlazaAfectacion;
            Set<String> adecuacionSet = new HashSet<String>();
            HashMap<String, Object> mapaTdPlaza;
            List<HashMap<String, Object>> listaMapasTdPlaza = new ArrayList<HashMap<String, Object>>();
            List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = new ArrayList<HashMap<String, Object>>();
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: listTemplateFileCreatePlazaEstructura) {
                mapaTdPlazaAfectacion = new HashMap<String, Object>();

                adecuacionActual = templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad(adecuacionActual, 5, '0'));
                mapaTdPlazaAfectacion.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                mapaTdPlazaAfectacion.put("idOperacion", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0  ?  OPERACION_CREACION_PLAZA_MASIVA : OPERACION_CANCELACION_PLAZA_MASIVA);
                mapaTdPlazaAfectacion.put("idRegularizable", templateFileCreatePlazaEstructura.getIsRegularizable()?1:9);
                mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                mapaTdPlazaAfectacion.put("idUnidad", templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlazaAfectacion.put("idPuesto", templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlazaAfectacion.put("idEdo", templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlazaAfectacion.put("idZonaEcon", templateFileCreatePlazaEstructura.getZona());
                mapaTdPlazaAfectacion.put("idGrupoPago", CREACION_ID_GRUPO_PAGO);
                mapaTdPlazaAfectacion.put("plafProfAmplia", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                mapaTdPlazaAfectacion.put("plafProfReduce", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_CONVERSION + adecuacionActual);
                mapaTdPlazaAfectacion.put("plafInicio", templateFileCreatePlazaEstructura.getInicioVigencia() != null ? DateUtils.truncate(templateFileCreatePlazaEstructura.getInicioVigencia(), Calendar.DATE) : null);
                mapaTdPlazaAfectacion.put("plafFinal", templateFileCreatePlazaEstructura.getIsRegularizable() ? formato.parse(CREACION_PLAF_FINAL)  : formato.parse( CREACION_PLAF_FINAL_NO_REGULARIZABLE + anio));
                mapaTdPlazaAfectacion.put("plafDiasPrima", CREACION_PLAF_DIAS_PRIMA);
                mapaTdPlazaAfectacion.put("plafDiasAguinaldo", CREACION_PLAF_DIAS_AGUINALDO);
                mapaTdPlazaAfectacion.put("usuario", usuario);
                mapaTdPlazaAfectacion.put("plafCiclo", anio);
                mapaTdPlazaAfectacion.put("fecModifico", new Date());
                listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != null && !adecuacionSet.contains(anio + adecuacionActual) && comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    adecuacionSet.add(anio + adecuacionActual);
                }
                calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());

            }
            Integer anioEntero = c.get(Calendar.YEAR);
            Iterator it = adecuacionSet.iterator();
            while (it.hasNext()) {
                //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                String adecuacion = (String)it.next();
                String idProyRegul = (creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? CREACION_PREFIX_PLAF_PROY_CONVERSION : CREACION_PREFIX_PLAF_PROY_REUBICACION) + adecuacion.substring(4);
                TcProyRegularizaPK tcProyRegularizaPK = new TcProyRegularizaPK();
                tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                tcProyRegularizaPK.setPrCiclo(anioEntero);
              
                TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                tcProyRegulariza.setDescProyRegul(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CONVERSION : DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_REUBICACION);
                tcProyRegulariza.setUsuario(usuario);
                tcProyRegulariza.setFecModifico(new Date());
                          
                super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);
                          
              //Insertamos registros por adecuaciÛn en TD_OFICIO_AFECTACION
              
                Long idOficioAfecta = new Long(anio + StringUtils.leftPad( adecuacion.substring(4), 5, '0'));
                TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);
               
               
                TdOficioAfectacion tdOficioAfectacion = new TdOficioAfectacion();
                tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                tdOficioAfectacion.setOfacAplicaOficio(CREACION_PREFIX_PLAF_PROY_CONVERSION);
                tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(),  Calendar.DATE) : null );
                tdOficioAfectacion.setOfacNumAutoriza(null);
                tdOficioAfectacion.setOfacLeyendaJustif(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? ID_TIPO_MOVIMIENTO_CONVERSION : ID_TIPO_MOVIMIENTO_REUBICACION);
                tdOficioAfectacion.setOfacTotalSecuencia(false);
                tdOficioAfectacion.setOfacTotalSecSiaff(false);
                tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                tdOficioAfectacion.setOfacTotalReduccion(0.0);
                tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(), Calendar.DATE) : null);
                tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate( hoy.getTime(), Calendar.DATE));
                tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                tdOficioAfectacion.setUsuario(usuario);
                tdOficioAfectacion.setFecModifico(hoy.getTime());
                tdOficioAfectacion.setOfacTipoAfectaci(creacionPlazaMasivaDTO.getTipoProceso().equalsIgnoreCase(TIPO_MOVIMIENTO_CONVERSION) ? CREACION_PREFIX_PLAF_PROY_CONVERSION : CREACION_PREFIX_PLAF_PROY_REUBICACION);
              
                super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);

            }

            HashMap<String, Object> mapaTnMovtosEmpPla;


            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: listTemplateFileCreatePlazaEstructura) {
                TdEmpleado tdEmpleado = null;
                TdPlaza tdPlaza = null;
                TcAtributoPuesto tcAtributoPuesto = null;
                // Consultamos la plaza en TD_PLAZA
                tdPlaza = super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getPlaza());
                tcAtributoPuesto = super.getAtributoPuesto(tdPlaza.getIdPuestoPre());

                if (tdPlaza.getPlazaRfc() != null && tdPlaza.getPlazaRfc().length() > 0) {
                    tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(tdPlaza.getPlazaRfc());
                }


                customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();
                customTnPlantillaPlazaEstructura.setIdPlaza(templateFileCreatePlazaEstructura.getPlaza());
                if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    mapaTdPlaza = new HashMap<String, Object>();
                    mapaTdPlaza.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                    mapaTdPlaza.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                    mapaTdPlaza.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                    mapaTdPlaza.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                    mapaTdPlaza.put("idZonaEconPre", templateFileCreatePlazaEstructura.getZona());
                    mapaTdPlaza.put("usuario", usuario);
                    mapaTdPlaza.put("fecModifico", new Date());
                    listaMapasTdPlaza.add(mapaTdPlaza);
                }


                mapaTnMovtosEmpPla = new HashMap<String, Object>();
                mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
                Integer idMovtosPersona = null;

                // Determina el idMovtosPersona que se va a insertar 
                if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CONVERSION;
                } else if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CANCELACION) == 0) {
                    idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CANCELACION;
                }

                mapaTnMovtosEmpPla.put("idMovtoPersona", idMovtosPersona);
                mapaTnMovtosEmpPla.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                mapaTnMovtosEmpPla.put("idSituacionPlaza", tdPlaza.getIdSitPlaza());
                mapaTnMovtosEmpPla.put("mepRfc", tdPlaza.getPlazaRfc());
                mapaTnMovtosEmpPla.put("mepPlazaRespaldo", tdPlaza.getPlazaRespaldo() );
                mapaTnMovtosEmpPla.put("idGrupoPago", tdPlaza.getIdGrupoPago() );
                mapaTnMovtosEmpPla.put("idUnidadPre",templateFileCreatePlazaEstructura.getUnidad());
                mapaTnMovtosEmpPla.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                mapaTnMovtosEmpPla.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnMovtosEmpPla.put("idZonaEcoPre", templateFileCreatePlazaEstructura.getZona());
              mapaTnMovtosEmpPla.put("idRangoPre", tdPlaza.getIdRangoPre());
              mapaTnMovtosEmpPla.put("idUnidadNom", tdPlaza.getIdUnidadNom() );
              mapaTnMovtosEmpPla.put("idPuestoNom", tdPlaza.getIdPuestoNom() );
              mapaTnMovtosEmpPla.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto() );
              mapaTnMovtosEmpPla.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento() );
              mapaTnMovtosEmpPla.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia() );
              mapaTnMovtosEmpPla.put("idEdoNom", tdPlaza.getIdEdoNom() );
              mapaTnMovtosEmpPla.put("idMuniNom", tdPlaza.getIdMuniNom());
              mapaTnMovtosEmpPla.put("idZonaEcoNom", tdPlaza.getIdZonaEcoNom() );
              mapaTnMovtosEmpPla.put("idRangoNom", tdPlaza.getIdRangoNom() );
              mapaTnMovtosEmpPla.put("idZonaDistNom", tdPlaza.getIdZonaDistNom() );
              mapaTnMovtosEmpPla.put("mepImporteHonorario", TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
              mapaTnMovtosEmpPla.put("mepUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepFinCont", formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT));
              mapaTnMovtosEmpPla.put("mepIniLic", null);
              mapaTnMovtosEmpPla.put("mepFinLic", null);
              mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
              mapaTnMovtosEmpPla.put("idTipoPlaza", tdPlaza.getIdTipoPlaza() );
              mapaTnMovtosEmpPla.put("idServPub", tdPlaza.getIdServPub() );
              mapaTnMovtosEmpPla.put("idPtoEstrategico", tdPlaza.getIdPtoEstrategico() );
              mapaTnMovtosEmpPla.put("idInmueble", tdPlaza.getIdInmueble() );
              mapaTnMovtosEmpPla.put("mepEdif", null);
              mapaTnMovtosEmpPla.put("mepPiso", null);
              mapaTnMovtosEmpPla.put("mepAla", null);
              mapaTnMovtosEmpPla.put("mepOfna", null);
              mapaTnMovtosEmpPla.put("mepTelOf1", null);
              mapaTnMovtosEmpPla.put("mepTelOf2", null);
              mapaTnMovtosEmpPla.put("mepConmut", null);
              mapaTnMovtosEmpPla.put("mepExt1", null);
              mapaTnMovtosEmpPla.put("mepExt2", null);
              mapaTnMovtosEmpPla.put("mepRfcUnico", null);
              mapaTnMovtosEmpPla.put("idBancoSar", null);
              mapaTnMovtosEmpPla.put("idTipoPago", null);
              mapaTnMovtosEmpPla.put("mepImssIssste", null);
              mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
              mapaTnMovtosEmpPla.put("mepCurp", tdEmpleado != null ? tdEmpleado.getRfcEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepNombre", tdEmpleado != null ? tdEmpleado.getNombreEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepPrimerApellido", tdEmpleado != null ? tdEmpleado.getPrimerApellido() : null );
              mapaTnMovtosEmpPla.put("mepSegundoApellido", tdEmpleado != null ? tdEmpleado.getSegundoApellido() : null);
              mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
              mapaTnMovtosEmpPla.put("mepClabe", null);
              mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
              mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
              mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
              mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
              mapaTnMovtosEmpPla.put("mepCalleParticular", null);
              mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
              mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
              mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
              mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
              mapaTnMovtosEmpPla.put("mepTelParticular", null);
              mapaTnMovtosEmpPla.put("idEdoCivil", null);
              mapaTnMovtosEmpPla.put("mepEMailOficial", null);
              mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
              mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
              mapaTnMovtosEmpPla.put("idGenero", null);
              mapaTnMovtosEmpPla.put("idNacionalidad", null);
              mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
              mapaTnMovtosEmpPla.put("idNivelEscolar", null);
              mapaTnMovtosEmpPla.put("idProfnCarrera", null);
              mapaTnMovtosEmpPla.put("idInstEducativa", null);
              mapaTnMovtosEmpPla.put("idInstProtcivil", null);
              mapaTnMovtosEmpPla.put("idEspProtcivil", null);
              mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
              mapaTnMovtosEmpPla.put("mepPadreMadre", null);
              mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
              mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
              mapaTnMovtosEmpPla.put("idRusp", null);
              mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
              mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
              mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
              mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
              mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
              mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
              mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
              mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
              mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
              mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
              mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
              mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
              mapaTnMovtosEmpPla.put("mepObserva", null);
              mapaTnMovtosEmpPla.put("mepObservaInternas", null);
              mapaTnMovtosEmpPla.put("mepQnaCancela", null);
              mapaTnMovtosEmpPla.put("mepUsrCancela", null);
              mapaTnMovtosEmpPla.put("mepFechaCancela", null);
              mapaTnMovtosEmpPla.put("usuario", usuario);
              mapaTnMovtosEmpPla.put("fecModifico", new Date());
              listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);
            }

            super.persistence().get(CustomTdPlazaDAO.class).updateTdPlaza(listaMapasTdPlaza, usuario);

            for (CustomTnPlantillaPlazaEstructura templateFileCreatePlazaEstructura: listaTnPlantillaPlazaEstructuraCancelados) {
                TdPlaza plazaCancelada = super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getIdPlaza());
                super.persistence().get(TdPlazaDAO.class).delete(plazaCancelada);
            }


            // Se insertan los movimientos de conversion
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, usuario);
            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, usuario);

            creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.proceso.terminado"));

        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMConversion] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMConversion] " + 
                                       e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }
    
    /**
     * MÈtodo encargado de actualizar los registros de la carga masiva de Reubicacion
     * @param creacionPlazaMasivaDTO
     * @return creacionPlazaMasivaDTO CreacionPlazaMasivaDTO
     */
    public CreacionPlazaMasivaDTO updatePMReubicacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        Collator comparator = Collator.getInstance();
        comparator.setStrength(Collator.PRIMARY);
        String nombreArchivoXls=null;
        String usuario = super.identity().get().getUserID();
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        try {
          Calendar hoy = Calendar.getInstance();
          hoy.setTime(new Date());
          Calendar c = Calendar.getInstance(); 
          c.setTime(new Date());
          String anio = new Integer( (int) c.get(Calendar.YEAR)).toString();
          creacionPlazaMasivaDTO.setAnio(anio);
          String templateFileXml = super.configuration().getString("plazaMasiva.templates.dir") + File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.plazaMasiva");
          nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + creacionPlazaMasivaDTO.getNombreArchivoErrores(); 
          InputStream inputStreamArchivoXls;
          inputStreamArchivoXls = new FileInputStream(nombreArchivoXls);
          InputStream inputStreamArchivoXml = new FileInputStream(templateFileXml);
          ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
          List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = parserXls.parseFile(inputStreamArchivoXls, CreacionPlazaMasivaDTO.class);
          creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);                
          String patron = "dd/MM/yyyy";
          String adecuacionActual = null;
          SimpleDateFormat formato = new SimpleDateFormat(patron);
          Calendar calendarOfacFecOficio = Calendar.getInstance();
            
          List<HashMap<String,Object>> listaMapasTnPlantillaPlazaEstructura = new ArrayList<HashMap<String,Object>>();
                        HashMap<String,Object> mapaTnPlantillaPlazaEstructura;                           
                        for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                            mapaTnPlantillaPlazaEstructura = new HashMap<String,Object>();
                            mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual",templateFileCreatePlazaEstructura.getAdecuacionCicloActual() );
                            mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", templateFileCreatePlazaEstructura.getInicioVigencia() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", templateFileCreatePlazaEstructura.getUnidad() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel",templateFileCreatePlazaEstructura.getNivel() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", templateFileCreatePlazaEstructura.getZona() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", templateFileCreatePlazaEstructura.getCodigo() );
                            mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza",templateFileCreatePlazaEstructura.getPlaza() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCasos",templateFileCreatePlazaEstructura.getCasos() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipo", templateFileCreatePlazaEstructura.getTipo() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEstatus",templateFileCreatePlazaEstructura.getEstatus() );
                            mapaTnPlantillaPlazaEstructura.put("ppeCancelada", templateFileCreatePlazaEstructura.getCancelada() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoMov",templateFileCreatePlazaEstructura.getTipoMovimiento() );
                            mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", templateFileCreatePlazaEstructura.getRegularizable() );
                            mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", templateFileCreatePlazaEstructura.getTipoPersonal() );
                            mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", templateFileCreatePlazaEstructura.getEntidadFederativa() );
                            mapaTnPlantillaPlazaEstructura.put("usuario", usuario);
                            mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                            listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
                        }
                        
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, usuario);                                              
          
            
            CustomTnPlantillaPlazaEstructura  customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();

                 List<HashMap<String,Object>> listaMapasTdPlazaAfectacion = new ArrayList<HashMap<String,Object>>();
                 HashMap<String,Object> mapaTdPlazaAfectacion;  
                 Set<String> adecuacionSet = new HashSet<String>();
                 HashMap<String,Object> mapaTdPlaza;  
                 List<HashMap<String, Object>> listaMapasTdPlaza = new ArrayList<HashMap<String, Object>>();
                 List<HashMap<String,Object>> listaMapasTnMovtosEmpPla = new ArrayList<HashMap<String,Object>>();
                          for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                          mapaTdPlazaAfectacion = new HashMap<String,Object>();
                          
                          adecuacionActual =  templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                          mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad( adecuacionActual, 5, '0'));
                          mapaTdPlazaAfectacion.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                          mapaTdPlazaAfectacion.put("idOperacion", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0  ?  OPERACION_CREACION_PLAZA_MASIVA : OPERACION_CANCELACION_PLAZA_MASIVA);
                          mapaTdPlazaAfectacion.put("idRegularizable", templateFileCreatePlazaEstructura.getIsRegularizable()?1:9);
                          mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                          mapaTdPlazaAfectacion.put("idUnidad", templateFileCreatePlazaEstructura.getUnidad());
                          mapaTdPlazaAfectacion.put("idPuesto", templateFileCreatePlazaEstructura.getCodigo());
                          mapaTdPlazaAfectacion.put("idEdo", templateFileCreatePlazaEstructura.getEntidadFederativa());
                          mapaTdPlazaAfectacion.put("idZonaEcon", templateFileCreatePlazaEstructura.getZona());
                          mapaTdPlazaAfectacion.put("idGrupoPago", CREACION_ID_GRUPO_PAGO);
                          mapaTdPlazaAfectacion.put("plafProfAmplia", comparator.compare(templateFileCreatePlazaEstructura.getTipo(), DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual : CREACION_PLAF_PROY_AMPLIA);
                          mapaTdPlazaAfectacion.put("plafProfReduce", comparator.compare( templateFileCreatePlazaEstructura.getTipo(),DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CREACION) == 0 ? CREACION_PLAF_PROY_REDUCE : CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacionActual);
                          mapaTdPlazaAfectacion.put("plafInicio", templateFileCreatePlazaEstructura.getInicioVigencia() != null ? DateUtils.truncate(templateFileCreatePlazaEstructura.getInicioVigencia(), Calendar.DATE) : null);
                          mapaTdPlazaAfectacion.put("plafFinal", templateFileCreatePlazaEstructura.getIsRegularizable() ? formato.parse(CREACION_PLAF_FINAL)  : formato.parse( CREACION_PLAF_FINAL_NO_REGULARIZABLE + anio));
                          mapaTdPlazaAfectacion.put("plafDiasPrima", CREACION_PLAF_DIAS_PRIMA);
                          mapaTdPlazaAfectacion.put("plafDiasAguinaldo", CREACION_PLAF_DIAS_AGUINALDO);
                          mapaTdPlazaAfectacion.put("usuario", usuario);
                          mapaTdPlazaAfectacion.put("plafCiclo", anio);
                          mapaTdPlazaAfectacion.put("fecModifico", new Date());
                          listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != null && !adecuacionSet.contains(anio + adecuacionActual) && 
                    comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0 ) {
                        adecuacionSet.add(anio + adecuacionActual);
                }
                          calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());
                          
                      }
                     Integer anioEntero = c.get(Calendar.YEAR);
                      Iterator it = adecuacionSet.iterator();
                      while(it.hasNext()) {
                          //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                          String adecuacion = (String) it.next();
                          String idProyRegul = CREACION_PREFIX_PLAF_PROY_REUBICACION + adecuacion.substring(4);
                          TcProyRegularizaPK tcProyRegularizaPK = new TcProyRegularizaPK();
                          tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                          tcProyRegularizaPK.setPrCiclo(anioEntero);
                          
                          TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                          tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                          tcProyRegulariza.setDescProyRegul(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_REUBICACION);
                          tcProyRegulariza.setUsuario(usuario);
                          tcProyRegulariza.setFecModifico(new Date());
                          
                          super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);
                          
                          ////Insertamos registros por adecuaciÛn en TD_OFICIO_AFECTACION
                          
                          Long idOficioAfecta = new Long(anio + StringUtils.leftPad( adecuacion.substring(4), 5, '0'));
                           TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                          tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                          tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);
                           
                           
                          TdOficioAfectacion tdOficioAfectacion = new TdOficioAfectacion();
                          tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                          tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                          tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                          tdOficioAfectacion.setOfacAplicaOficio(CREACION_PREFIX_PLAF_PROY_CONVERSION);
                          tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                          tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                          tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(),  Calendar.DATE) : null );
                          tdOficioAfectacion.setOfacNumAutoriza(null);
                          tdOficioAfectacion.setOfacLeyendaJustif(ID_TIPO_MOVIMIENTO_REUBICACION);
                          tdOficioAfectacion.setOfacTotalSecuencia(false);
                          tdOficioAfectacion.setOfacTotalSecSiaff(false);
                          tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                          tdOficioAfectacion.setOfacTotalReduccion(0.0);
                          tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime() != null ? DateUtils.truncate( calendarOfacFecOficio.getTime(), Calendar.DATE) : null);
                          tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                          tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate( hoy.getTime(), Calendar.DATE));
                          tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                          tdOficioAfectacion.setUsuario(usuario);
                          tdOficioAfectacion.setFecModifico(hoy.getTime());
                          tdOficioAfectacion.setOfacTipoAfectaci(CREACION_PREFIX_PLAF_PROY_REUBICACION);
                          
                          super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);
                          
                      }
          
            HashMap<String, Object> mapaTnMovtosEmpPla;
          
            
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                TdEmpleado tdEmpleado = null;
                TdPlaza tdPlaza = null;
                TcAtributoPuesto tcAtributoPuesto = null;
                // Consultamos la plaza en TD_PLAZA
                tdPlaza = super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getPlaza());
                tcAtributoPuesto = super.getAtributoPuesto(tdPlaza.getIdPuestoPre());

                if (tdPlaza.getPlazaRfc() != null && tdPlaza.getPlazaRfc().length() > 0) {
                    tdEmpleado = super.persistence().get(TdEmpleadoDAO.class).getById(tdPlaza.getPlazaRfc());
                }
                
                customTnPlantillaPlazaEstructura = new CustomTnPlantillaPlazaEstructura();
                customTnPlantillaPlazaEstructura.setIdPlaza(templateFileCreatePlazaEstructura.getPlaza());
                if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    mapaTdPlaza = new HashMap<String, Object>();
                    mapaTdPlaza.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
                    mapaTdPlaza.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                    mapaTdPlaza.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                    mapaTdPlaza.put("idZonaEconPre", templateFileCreatePlazaEstructura.getZona());
                    mapaTdPlaza.put("usuario", usuario);
                    mapaTdPlaza.put("fecModifico", new Date());
                    listaMapasTdPlaza.add(mapaTdPlaza);
                }

            
              mapaTnMovtosEmpPla = new HashMap<String,Object>();
              mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
              Integer idMovtosPersona = null;

                // Determina el idMovtosPersona que se va a insertar 
                if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CREACION) == 0) {
                    idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_REUBICACION;
                } else if (comparator.compare(templateFileCreatePlazaEstructura.getTipo(), ID_TIPO_CANCELACION) == 0) {
                    idMovtosPersona = TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CANCELACION;
                }
              
              mapaTnMovtosEmpPla.put("idMovtoPersona", idMovtosPersona);
              mapaTnMovtosEmpPla.put("idPlaza", templateFileCreatePlazaEstructura.getPlaza());
              mapaTnMovtosEmpPla.put("idSituacionPlaza", tdPlaza.getIdSitPlaza() );
              mapaTnMovtosEmpPla.put("mepRfc", tdPlaza.getPlazaRfc());
              mapaTnMovtosEmpPla.put("mepPlazaRespaldo", tdPlaza.getPlazaRespaldo() );
              mapaTnMovtosEmpPla.put("idGrupoPago", tdPlaza.getIdGrupoPago() );
              mapaTnMovtosEmpPla.put("idUnidadPre",templateFileCreatePlazaEstructura.getUnidad());
              mapaTnMovtosEmpPla.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
              mapaTnMovtosEmpPla.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
              mapaTnMovtosEmpPla.put("idZonaEcoPre", templateFileCreatePlazaEstructura.getZona());
              mapaTnMovtosEmpPla.put("idRangoPre", tdPlaza.getIdRangoPre());
              mapaTnMovtosEmpPla.put("idUnidadNom", tdPlaza.getIdUnidadNom() );
              mapaTnMovtosEmpPla.put("idPuestoNom", tdPlaza.getIdPuestoNom() );
              mapaTnMovtosEmpPla.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto() );
              mapaTnMovtosEmpPla.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento() );
              mapaTnMovtosEmpPla.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia() );
              mapaTnMovtosEmpPla.put("idEdoNom", tdPlaza.getIdEdoNom() );
              mapaTnMovtosEmpPla.put("idMuniNom", tdPlaza.getIdMuniNom());
              mapaTnMovtosEmpPla.put("idZonaEcoNom", tdPlaza.getIdZonaEcoNom() );
              mapaTnMovtosEmpPla.put("idRangoNom", tdPlaza.getIdRangoNom() );
              mapaTnMovtosEmpPla.put("idZonaDistNom", tdPlaza.getIdZonaDistNom() );
              mapaTnMovtosEmpPla.put("mepImporteHonorario", TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
              mapaTnMovtosEmpPla.put("mepUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
              mapaTnMovtosEmpPla.put("mepFinCont", formato.format(TN_MOVTOS_EMP_PLA_MEP_FIN_CONT));
              mapaTnMovtosEmpPla.put("mepIniLic", null);
              mapaTnMovtosEmpPla.put("mepFinLic", null);
              mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
              mapaTnMovtosEmpPla.put("idTipoPlaza", tdPlaza.getIdTipoPlaza() );
              mapaTnMovtosEmpPla.put("idServPub", tdPlaza.getIdServPub() );
              mapaTnMovtosEmpPla.put("idPtoEstrategico", tdPlaza.getIdPtoEstrategico() );
              mapaTnMovtosEmpPla.put("idInmueble", tdPlaza.getIdInmueble() );
              mapaTnMovtosEmpPla.put("mepEdif", null);
              mapaTnMovtosEmpPla.put("mepPiso", null);
              mapaTnMovtosEmpPla.put("mepAla", null);
              mapaTnMovtosEmpPla.put("mepOfna", null);
              mapaTnMovtosEmpPla.put("mepTelOf1", null);
              mapaTnMovtosEmpPla.put("mepTelOf2", null);
              mapaTnMovtosEmpPla.put("mepConmut", null);
              mapaTnMovtosEmpPla.put("mepExt1", null);
              mapaTnMovtosEmpPla.put("mepExt2", null);
              mapaTnMovtosEmpPla.put("mepRfcUnico", null);
              mapaTnMovtosEmpPla.put("idBancoSar", null);
              mapaTnMovtosEmpPla.put("idTipoPago", null);
              mapaTnMovtosEmpPla.put("mepImssIssste", null);
              mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
              mapaTnMovtosEmpPla.put("mepCurp", tdEmpleado != null ? tdEmpleado.getRfcEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepNombre", tdEmpleado != null ? tdEmpleado.getNombreEmpleado() : null);
              mapaTnMovtosEmpPla.put("mepPrimerApellido", tdEmpleado != null ? tdEmpleado.getPrimerApellido() : null );
              mapaTnMovtosEmpPla.put("mepSegundoApellido", tdEmpleado != null ? tdEmpleado.getSegundoApellido() : null);
              mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
              mapaTnMovtosEmpPla.put("mepClabe", null);
              mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
              mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
              mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
              mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
              mapaTnMovtosEmpPla.put("mepCalleParticular", null);
              mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
              mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
              mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
              mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
              mapaTnMovtosEmpPla.put("mepTelParticular", null);
              mapaTnMovtosEmpPla.put("idEdoCivil", null);
              mapaTnMovtosEmpPla.put("mepEMailOficial", null);
              mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
              mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
              mapaTnMovtosEmpPla.put("idGenero", null);
              mapaTnMovtosEmpPla.put("idNacionalidad", null);
              mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
              mapaTnMovtosEmpPla.put("idNivelEscolar", null);
              mapaTnMovtosEmpPla.put("idProfnCarrera", null);
              mapaTnMovtosEmpPla.put("idInstEducativa", null);
              mapaTnMovtosEmpPla.put("idInstProtcivil", null);
              mapaTnMovtosEmpPla.put("idEspProtcivil", null);
              mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
              mapaTnMovtosEmpPla.put("mepPadreMadre", null);
              mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
              mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
              mapaTnMovtosEmpPla.put("idRusp", null);
              mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
              mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
              mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
              mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
              mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
              mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
              mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
              mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
              mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
              mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
              mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
              mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
              mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
              mapaTnMovtosEmpPla.put("mepObserva", null);
              mapaTnMovtosEmpPla.put("mepObservaInternas", null);
              mapaTnMovtosEmpPla.put("mepQnaCancela", null);
              mapaTnMovtosEmpPla.put("mepUsrCancela", null);
              mapaTnMovtosEmpPla.put("mepFechaCancela", null);
              mapaTnMovtosEmpPla.put("usuario", usuario);
              mapaTnMovtosEmpPla.put("fecModifico", new Date());
              listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);

            }

                super.persistence().get(CustomTdPlazaDAO.class).updateTdPlazaReubicacion(listaMapasTdPlaza, usuario);
            
            // Se insertan los movimientos de reubicacion
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, usuario);

            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, usuario);
            

            creacionPlazaMasivaDTO.setMensaje(super.configuration().getString("plazaMasivaEstructura", "carga.plaza.masiva.estructura.creacion.mensaje.proceso.terminado"));
        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMReubicacion] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMReubicacion] " + 
                                       e.toString(), e);
        }
        finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setPlantillaErronea(false);
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
        creacionPlazaMasivaDTO.setAnio(anio);
        boolean archivoValido = false;
        String usuario = super.identity().get().getUserID();
        try {
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");

            InputStream inputStreamXls = 
                creacionPlazaMasivaDTO.getFile().getInputStream();
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO = 
                parserXls.parseFile(inputStreamXls, 
                                    CreacionPlazaMasivaDTO.class);
            if (!(parserXls.getEncabezadoDTO().getA().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.anterior")) && 
                  parserXls.getEncabezadoDTO().getB().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.actual")) && 
                  parserXls.getEncabezadoDTO().getC().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.unidad")) && 
                  parserXls.getEncabezadoDTO().getD().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.nivel")) && 
                  parserXls.getEncabezadoDTO().getE().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.zona")) && 
                  parserXls.getEncabezadoDTO().getF().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.codigo")) && 
                  parserXls.getEncabezadoDTO().getG().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.plaza")) && 
                  parserXls.getEncabezadoDTO().getH().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.casos")) && 
                  parserXls.getEncabezadoDTO().getI().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo")) && 
                  parserXls.getEncabezadoDTO().getJ().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.estatus")) && 
                  parserXls.getEncabezadoDTO().getK().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.cancelada")) && 
                  parserXls.getEncabezadoDTO().getL().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.movimiento")) && 
                  parserXls.getEncabezadoDTO().getM().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.regularizable")) && 
                  parserXls.getEncabezadoDTO().getN().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.personal")) && 
                  parserXls.getEncabezadoDTO().getO().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.entidad")) && 
                  parserXls.getEncabezadoDTO().getP().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.inicio.vigencia")))) {
                creacionPlazaMasivaDTO.setPlantillaErronea(true);
                return creacionPlazaMasivaDTO;
            }

            if (listCreacionPlazaMasivaDTO != null && 
                listCreacionPlazaMasivaDTO.size() == 0) {
                creacionPlazaMasivaDTO.setPlantillaErronea(true);
                return creacionPlazaMasivaDTO;
            }

            creacionPlazaMasivaDTO = 
                    processPMPValidaDatosPlantilla(listCreacionPlazaMasivaDTO, 
                                                   creacionPlazaMasivaDTO);

            creacionPlazaMasivaDTO.setListaErrores(listCreacionPlazaMasivaDTO);
            String patron = "dd/MM/yyyy";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            String tipo = "";
            List<HashMap<String, Object>> listaMapasTnPlantillaPlazaEstructura = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnPlantillaPlazaEstructura;
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 creacionPlazaMasivaDTO.getListaPlazaEstructuraCorrecta()) {
                mapaTnPlantillaPlazaEstructura = new HashMap<String, Object>();
                mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloActual());
                mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", 
                                                   templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", 
                                                   templateFileCreatePlazaEstructura.getUnidad());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel", 
                                                   templateFileCreatePlazaEstructura.getNivel());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", 
                                                   templateFileCreatePlazaEstructura.getZona());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", 
                                                   templateFileCreatePlazaEstructura.getCodigo());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza", 
                                                   templateFileCreatePlazaEstructura.getPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeCasos", 
                                                   templateFileCreatePlazaEstructura.getCasos());
                tipo = 
templateFileCreatePlazaEstructura.getTipo().toUpperCase().equals("CANCELACI”N") || 
templateFileCreatePlazaEstructura.getTipo().toUpperCase().equals("CANCELACION") ? 
"CANCELACION" : templateFileCreatePlazaEstructura.getTipo();
                mapaTnPlantillaPlazaEstructura.put("ppeTipo", tipo);
                mapaTnPlantillaPlazaEstructura.put("ppeEstatus", 
                                                   templateFileCreatePlazaEstructura.getEstatus());
                mapaTnPlantillaPlazaEstructura.put("ppeCancelada", 
                                                   templateFileCreatePlazaEstructura.getCancelada());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoMov", 
                                                   templateFileCreatePlazaEstructura.getTipoMovimiento());
                mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", 
                                                   templateFileCreatePlazaEstructura.getRegularizable());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", 
                                                   templateFileCreatePlazaEstructura.getTipoPersonal());
                mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", 
                                                   templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnPlantillaPlazaEstructura.put("usuario", 
                                                   usuario);
                mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
            }

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, 
                                                                                                              usuario);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByselectTnPlantillaPlazaEstructuraVsPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsPlaza, 
                             comparatorPlaza);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsUnidad = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsUnidad(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorUnidad = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdUnidad().compareTo(o2.getIdUnidad());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsUnidad, 
                             comparatorUnidad);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuesto = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuesto(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuesto = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPuesto().compareTo(o2.getIdPuesto());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuesto, 
                             comparatorPuesto);
                             
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuestoVsPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuestoPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = 
                                o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza, 
                             comparatorPuestoPlaza);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsEstado = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsEstado(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorEstado = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = 
                                o1.getPpeEntidadFederativa().compareTo(o2.getPpeEntidadFederativa());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsEstado, 
                             comparatorEstado);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsZona = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsZona("CANCELACION", 
                                                                                                                     usuario);
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorZona = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaAmpliaVsZona, 
                             comparatorPlaza);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaReduceVsGrupoPago = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaReduceVsGrupoPago(usuario);
            

            List<CustomTnPlantillaPlazaEstructura> listafindByTnPlantillaPlazaEstructura = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructura(usuario);
                
      


            int pos = -1;
            StringBuffer buffer = null;
            archivoValido = true;
            boolean errorValidacion = false;
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {

                buffer = new StringBuffer();
                errorValidacion = false;

                //ValidaciÛn AfectaciÛn Vs Plaza
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPlaza, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos < 0) {

                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                if (customTnPlantillaPlazaEstructura.getIdPlaza() >= 60000 && 
                    customTnPlantillaPlazaEstructura.getIdPlaza() <= 79999) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Unidad
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsUnidad, 
                         customTnPlantillaPlazaEstructura, comparatorUnidad);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }


                //ValidaciÛn AfectaciÛn Vs Puesto
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuesto, 
                         customTnPlantillaPlazaEstructura, comparatorPuesto);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                
                //ValidaciÛn AfectaciÛn Vs Puesto Vs Plaza
                pos = 
                    Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza, 
                         customTnPlantillaPlazaEstructura, 
                         comparatorPuestoPlaza);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.corresponde.plaza"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                

                //ValidaciÛn AfectaciÛn Vs Estado
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsEstado, 
                         customTnPlantillaPlazaEstructura, comparatorEstado);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.estado.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Zona
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsZona, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.zona.economica.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn Afectacion Vs Grupo de Pago de Plaza
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaReduceVsGrupoPago, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.grupo.pago.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                

                if (errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
                }

            }

            creacionPlazaMasivaDTO.setArchivoValido(archivoValido && 
                                                    creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() == 
                                                    0);
            List<CreacionPlazaMasivaDTO> listaErrores = 
                new ArrayList<CreacionPlazaMasivaDTO>();
            // if (!archivoValido) {
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {
                CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVO = 
                    new CreacionPlazaMasivaDTO();
                creacionPlazaMasivaDTOVO.setAdecuacionCicloAnterior(customTnPlantillaPlazaEstructura.getPpeAdecuacionAnterior());
                creacionPlazaMasivaDTOVO.setAdecuacionCicloActual(customTnPlantillaPlazaEstructura.getPpeAdecuacionActual());
                creacionPlazaMasivaDTOVO.setUnidad(customTnPlantillaPlazaEstructura.getIdUnidad());
                creacionPlazaMasivaDTOVO.setNivel(customTnPlantillaPlazaEstructura.getIdNivel());
                creacionPlazaMasivaDTOVO.setZona(customTnPlantillaPlazaEstructura.getIdZona());
                creacionPlazaMasivaDTOVO.setCodigo(customTnPlantillaPlazaEstructura.getIdPuesto());
                creacionPlazaMasivaDTOVO.setPlaza(customTnPlantillaPlazaEstructura.getIdPlaza());
                creacionPlazaMasivaDTOVO.setCasos(customTnPlantillaPlazaEstructura.getPpeCasos());
                creacionPlazaMasivaDTOVO.setTipo(customTnPlantillaPlazaEstructura.getPpeTipo());
                creacionPlazaMasivaDTOVO.setEstatus(customTnPlantillaPlazaEstructura.getPpeEstauts());
                creacionPlazaMasivaDTOVO.setCancelada(customTnPlantillaPlazaEstructura.getPpeCancelada());
                creacionPlazaMasivaDTOVO.setTipoMovimiento(customTnPlantillaPlazaEstructura.getPpeTipoMov());
                creacionPlazaMasivaDTOVO.setRegularizable(customTnPlantillaPlazaEstructura.getPpeRegularizable());
                creacionPlazaMasivaDTOVO.setTipoPersonal(customTnPlantillaPlazaEstructura.getPpeTipoPersonal());
                creacionPlazaMasivaDTOVO.setEntidadFederativa(customTnPlantillaPlazaEstructura.getPpeEntidadFederativa());
                creacionPlazaMasivaDTOVO.setInicioVigencia(customTnPlantillaPlazaEstructura.getPpeInicioVigencia());
                creacionPlazaMasivaDTOVO.setMensaje(customTnPlantillaPlazaEstructura.getMensaje());
                listaErrores.add(creacionPlazaMasivaDTOVO);
            }

            if (creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() > 
                0) {
                listaErrores.addAll(creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta());
            }
            creacionPlazaMasivaDTO.setListaErrores(listaErrores);
            String nameFileXls = 
                creacionPlazaMasivaDTO.getNombreArchivoErrores();
            String nombreArchivoXls = 
                super.configuration().getString("local.temp.dir") + 
                File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.xls.plazaMasiva");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("creacionPlazaMasivaDTO", creacionPlazaMasivaDTO);

            transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                     nombreArchivoXls);
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
        } catch (InvalidFormatException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasivaCancelacion] " + 
                                       e.toString(), e);
        } catch (IOException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasivaCancelacion] " + 
                                       e.toString(), e);
        } finally {
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);

        }
        return creacionPlazaMasivaDTO;
    }

    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaCancelacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        String nombreArchivoXls = null;
        try {
            String usuario = super.identity().get().getUserID();
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date());
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
            Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
            creacionPlazaMasivaDTO.setAnio(anio);
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");
            nombreArchivoXls = 
                    super.configuration().getString("local.temp.dir") + 
                    File.separator + 
                    creacionPlazaMasivaDTO.getNombreArchivoErrores();
            InputStream inputStreamArchivoXls = 
                new FileInputStream(nombreArchivoXls);
            InputStream inputStreamArchivoXml = 
                new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
            List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = 
                parserXls.parseFile(inputStreamArchivoXls, 
                                    CreacionPlazaMasivaDTO.class);
            creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);
            String patron = "dd/MM/yyyy";
            Formatter fmt = new Formatter();
            String adecuacionActual = null;
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            Calendar calendarOfacFecOficio = Calendar.getInstance();
            List<HashMap<String, Object>> listaMapasTdPlazaAfectacion = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlazaAfectacion;
            Set<String> adecuacionSet = new HashSet<String>();

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 listTemplateFileCreatePlazaEstructura) {
                mapaTdPlazaAfectacion = new HashMap<String, Object>();
                mapaTdPlazaAfectacion.put("plafCiclo", anio);
                fmt = new Formatter();
                adecuacionActual =  templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad( adecuacionActual, 5, '0'));
                mapaTdPlazaAfectacion.put("idPlaza", 
                                          templateFileCreatePlazaEstructura.getPlaza());
                mapaTdPlazaAfectacion.put("idOperacion", 
                                          OPERACION_CANCELACION_PLAZA_MASIVA);
                mapaTdPlazaAfectacion.put("idRegularizable", 
                                          templateFileCreatePlazaEstructura.getIsRegularizable() ? 
                                          1 : 9);
                mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                mapaTdPlazaAfectacion.put("idUnidad", 
                                          templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlazaAfectacion.put("idPuesto", 
                                          templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlazaAfectacion.put("idEdo", 
                                          templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlazaAfectacion.put("idZonaEcon", 
                                          templateFileCreatePlazaEstructura.getZona());
                mapaTdPlazaAfectacion.put("idGrupoPago", 
                                          CREACION_ID_GRUPO_PAGO);
                mapaTdPlazaAfectacion.put("plafProfAmplia", 
                                          CREACION_PLAF_PROY_AMPLIA);
                mapaTdPlazaAfectacion.put("plafProfReduce", 
                                          ID_PROY_REGUL_PREFIX_CANCELACION_PLAZA_ESTRUCTURAL_MASIVA + 
                                          adecuacionActual);
                mapaTdPlazaAfectacion.put("plafInicio", 
                                          templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlazaAfectacion.put("plafFinal", 
                                          templateFileCreatePlazaEstructura.getIsRegularizable() ? 
                                          formato.parse(CREACION_PLAF_FINAL) : 
                                          formato.parse(CREACION_PLAF_FINAL_NO_REGULARIZABLE + 
                                                        anio));
                mapaTdPlazaAfectacion.put("plafDiasPrima", 
                                          CREACION_PLAF_DIAS_PRIMA);
                mapaTdPlazaAfectacion.put("plafDiasAguinaldo", 
                                          CREACION_PLAF_DIAS_AGUINALDO);
                mapaTdPlazaAfectacion.put("usuario", usuario);
                mapaTdPlazaAfectacion.put("fecModifico", new Date());
                listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != 
                    null && !adecuacionSet.contains(anio + adecuacionActual)) {
                    adecuacionSet.add(anio + adecuacionActual);
                }

                calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());

            }


            Integer anioEntero = c.get(Calendar.YEAR);
            Iterator it = adecuacionSet.iterator();
            while (it.hasNext()) {

                //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                String adecuacion = (String)it.next();
                String idProyRegul = 
                    ID_PROY_REGUL_PREFIX_CANCELACION_PLAZA_ESTRUCTURAL_MASIVA + 
                    adecuacion.substring(4);
                TcProyRegularizaPK tcProyRegularizaPK = 
                    new TcProyRegularizaPK();
                tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                tcProyRegularizaPK.setPrCiclo(anioEntero);

                TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                tcProyRegulariza.setDescProyRegul(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CANCELACION);
                tcProyRegulariza.setUsuario(usuario);
                tcProyRegulariza.setFecModifico(new Date());

                super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);

                ////Insertamos registros por adecuaciÛn en TD_PLAZA_AFECTACION

                Long idOficioAfecta = new Long(anio + StringUtils.leftPad(adecuacion.substring(4), 5, '0'));
                TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);


                TdOficioAfectacion tdOficioAfectacion = 
                    new TdOficioAfectacion();
                tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                tdOficioAfectacion.setOfacAplicaOficio(ID_PROY_REGUL_PREFIX_CANCELACION_PLAZA_ESTRUCTURAL_MASIVA);
                tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacNumAutoriza(null);
                tdOficioAfectacion.setOfacLeyendaJustif(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_CANCELACION);
                tdOficioAfectacion.setOfacTotalSecuencia(false);
                tdOficioAfectacion.setOfacTotalSecSiaff(false);
                tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                tdOficioAfectacion.setOfacTotalReduccion(0.0);
                tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate(hoy.getTime(), 
                                                                         Calendar.DATE));
                tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                tdOficioAfectacion.setUsuario(usuario);
                tdOficioAfectacion.setFecModifico(hoy.getTime());
                tdOficioAfectacion.setOfacTipoAfectaci(CREACION_PREFIX_PLAF_PROY_CANCELACION);
                super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);

            }

            List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnMovtosEmpPla;

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 listTemplateFileCreatePlazaEstructura) {

                TdPlaza tdPlaza = null;
                tdPlaza = 
                        super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getPlaza());
                if (tdPlaza != null) {
                    super.persistence().get(TdPlazaDAO.class).delete(tdPlaza);
                                   TcAtributoPuesto tcAtributoPuesto = 
                                       super.getAtributoPuesto(tdPlaza.getIdPuestoPre());

                    mapaTnMovtosEmpPla = new HashMap<String, Object>();
                    mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
                    mapaTnMovtosEmpPla.put("idMovtoPersona", 
                                           TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_CANCELACION);
                    mapaTnMovtosEmpPla.put("idPlaza", tdPlaza.getIdPlaza());
                    mapaTnMovtosEmpPla.put("idSituacionPlaza", 
                                           tdPlaza.getIdSitPlaza());
                    mapaTnMovtosEmpPla.put("mepRfc", tdPlaza.getPlazaRfc());
                    mapaTnMovtosEmpPla.put("mepPlazaRespaldo", 
                                           tdPlaza.getPlazaRespaldo());
                    mapaTnMovtosEmpPla.put("idGrupoPago", 
                                           tdPlaza.getIdGrupoPago());
                    mapaTnMovtosEmpPla.put("idUnidadPre", 
                                           tdPlaza.getIdUnidadPre());
                    mapaTnMovtosEmpPla.put("idPuestoPre", 
                                           tdPlaza.getIdPuestoPre());
                    mapaTnMovtosEmpPla.put("idEdoPre", tdPlaza.getIdEdoPre());
                    mapaTnMovtosEmpPla.put("idZonaEcoPre", 
                                           tdPlaza.getIdZonaEcoPre());
                    mapaTnMovtosEmpPla.put("idRangoPre", 
                                           tdPlaza.getIdRangoPre());
                    mapaTnMovtosEmpPla.put("idUnidadNom", 
                                           tdPlaza.getIdUnidadNom());
                    mapaTnMovtosEmpPla.put("idPuestoNom", 
                                           tdPlaza.getIdPuestoNom());
                    mapaTnMovtosEmpPla.put("idNivelPtoNom", 
                                           tcAtributoPuesto.getIdNivelPto());
                    mapaTnMovtosEmpPla.put("idNombramientoNom", 
                                           tcAtributoPuesto.getIdNombramiento());
                    mapaTnMovtosEmpPla.put("idJerarquiaNom", 
                                           tcAtributoPuesto.getIdJerarquia());
                    mapaTnMovtosEmpPla.put("idEdoNom", tdPlaza.getIdEdoNom());
                    mapaTnMovtosEmpPla.put("idMuniNom", 
                                           tdPlaza.getIdMuniNom());
                    mapaTnMovtosEmpPla.put("idZonaEcoNom", 
                                           tdPlaza.getIdZonaEcoNom());
                    mapaTnMovtosEmpPla.put("idRangoNom", 
                                           tdPlaza.getIdRangoNom());
                    mapaTnMovtosEmpPla.put("idZonaDistNom", 
                                           tdPlaza.getIdZonaDistNom());
                    mapaTnMovtosEmpPla.put("mepImporteHonorario", 
                                           TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
                    mapaTnMovtosEmpPla.put("mepUltimoMovto", 
                                           templateFileCreatePlazaEstructura.getInicioVigencia());
                    mapaTnMovtosEmpPla.put("mepIniCont", 
                                           templateFileCreatePlazaEstructura.getInicioVigencia());
                    mapaTnMovtosEmpPla.put("mepFinCont", 
                                           formato.format(templateFileCreatePlazaEstructura.getInicioVigencia()));
                    mapaTnMovtosEmpPla.put("mepIniLic", null);
                    mapaTnMovtosEmpPla.put("mepFinLic", null);
                    mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
                    mapaTnMovtosEmpPla.put("idTipoPlaza", 
                                           tdPlaza.getIdTipoPlaza());
                    mapaTnMovtosEmpPla.put("idServPub", 
                                           tdPlaza.getIdServPub());
                    mapaTnMovtosEmpPla.put("idPtoEstrategico", 
                                           tdPlaza.getIdPtoEstrategico());
                    mapaTnMovtosEmpPla.put("idInmueble", 
                                           tdPlaza.getIdInmueble());
                    mapaTnMovtosEmpPla.put("mepEdif", null);
                    mapaTnMovtosEmpPla.put("mepPiso", null);
                    mapaTnMovtosEmpPla.put("mepAla", null);
                    mapaTnMovtosEmpPla.put("mepOfna", null);
                    mapaTnMovtosEmpPla.put("mepTelOf1", null);
                    mapaTnMovtosEmpPla.put("mepTelOf2", null);
                    mapaTnMovtosEmpPla.put("mepConmut", null);
                    mapaTnMovtosEmpPla.put("mepExt1", null);
                    mapaTnMovtosEmpPla.put("mepExt2", null);
                    mapaTnMovtosEmpPla.put("mepRfcUnico", null);
                    mapaTnMovtosEmpPla.put("idBancoSar", null);
                    mapaTnMovtosEmpPla.put("idTipoPago", null);
                    mapaTnMovtosEmpPla.put("mepImssIssste", null);
                    mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
                    mapaTnMovtosEmpPla.put("mepCurp", null);
                    mapaTnMovtosEmpPla.put("mepNombre", null);
                    mapaTnMovtosEmpPla.put("mepPrimerApellido", null);
                    mapaTnMovtosEmpPla.put("mepSegundoApellido", null);
                    mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
                    mapaTnMovtosEmpPla.put("mepClabe", null);
                    mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
                    mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
                    mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
                    mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
                    mapaTnMovtosEmpPla.put("mepCalleParticular", null);
                    mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
                    mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
                    mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
                    mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
                    mapaTnMovtosEmpPla.put("mepTelParticular", null);
                    mapaTnMovtosEmpPla.put("idEdoCivil", null);
                    mapaTnMovtosEmpPla.put("mepEMailOficial", null);
                    mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
                    mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
                    mapaTnMovtosEmpPla.put("idGenero", null);
                    mapaTnMovtosEmpPla.put("idNacionalidad", null);
                    mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
                    mapaTnMovtosEmpPla.put("idNivelEscolar", null);
                    mapaTnMovtosEmpPla.put("idProfnCarrera", null);
                    mapaTnMovtosEmpPla.put("idInstEducativa", null);
                    mapaTnMovtosEmpPla.put("idInstProtcivil", null);
                    mapaTnMovtosEmpPla.put("idEspProtcivil", null);
                    mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
                    mapaTnMovtosEmpPla.put("mepPadreMadre", null);
                    mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
                    mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
                    mapaTnMovtosEmpPla.put("idRusp", null);
                    mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
                    mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
                    mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
                    mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
                    mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
                    mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
                    mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
                    mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
                    mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
                    mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
                    mapaTnMovtosEmpPla.put("mepObserva", null);
                    mapaTnMovtosEmpPla.put("mepObservaInternas", null);
                    mapaTnMovtosEmpPla.put("mepQnaCancela", null);
                    mapaTnMovtosEmpPla.put("mepUsrCancela", null);
                    mapaTnMovtosEmpPla.put("mepFechaCancela", null);
                    mapaTnMovtosEmpPla.put("usuario", usuario);
                    mapaTnMovtosEmpPla.put("fecModifico", new Date());
                    listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);

                }

            }
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, 
                                                                                      usuario);
            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, 
                                                                                            usuario);
        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMPlazaEstructuraMasivaCancelacion] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMPlazaEstructuraMasivaCancelacion] " + 
                                       e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
        }
        return creacionPlazaMasivaDTO;
    }

    public CreacionPlazaMasivaDTO processPMFilePlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setPlantillaErronea(false);
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
        creacionPlazaMasivaDTO.setAnio(anio);
        boolean archivoValido = false;
        String usuario = super.identity().get().getUserID();
        try {
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");

            InputStream inputStreamXls = 
                creacionPlazaMasivaDTO.getFile().getInputStream();
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO = 
                parserXls.parseFile(inputStreamXls, 
                                    CreacionPlazaMasivaDTO.class);
            if (!(parserXls.getEncabezadoDTO().getA().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.anterior")) && 
                  parserXls.getEncabezadoDTO().getB().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.adecuacion.actual")) && 
                  parserXls.getEncabezadoDTO().getC().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.unidad")) && 
                  parserXls.getEncabezadoDTO().getD().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.nivel")) && 
                  parserXls.getEncabezadoDTO().getE().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.zona")) && 
                  parserXls.getEncabezadoDTO().getF().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.codigo")) && 
                  parserXls.getEncabezadoDTO().getG().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.plaza")) && 
                  parserXls.getEncabezadoDTO().getH().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.casos")) && 
                  parserXls.getEncabezadoDTO().getI().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo")) && 
                  parserXls.getEncabezadoDTO().getJ().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.estatus")) && 
                  parserXls.getEncabezadoDTO().getK().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.cancelada")) && 
                  parserXls.getEncabezadoDTO().getL().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.movimiento")) && 
                  parserXls.getEncabezadoDTO().getM().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.regularizable")) && 
                  parserXls.getEncabezadoDTO().getN().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.tipo.personal")) && 
                  parserXls.getEncabezadoDTO().getO().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.entidad")) && 
                  parserXls.getEncabezadoDTO().getP().equals(super.configuration().getString("plazaMasivaEstructura", 
                                                                                             "jxls.templates.evaluacion.encabezado.inicio.vigencia")))) {
                creacionPlazaMasivaDTO.setPlantillaErronea(true);
                return creacionPlazaMasivaDTO;
            }

            if (listCreacionPlazaMasivaDTO != null && 
                listCreacionPlazaMasivaDTO.size() == 0) {
                creacionPlazaMasivaDTO.setPlantillaErronea(true);
                return creacionPlazaMasivaDTO;
            }

            creacionPlazaMasivaDTO = 
                    processPMPValidaDatosPlantilla(listCreacionPlazaMasivaDTO, 
                                                   creacionPlazaMasivaDTO);

            creacionPlazaMasivaDTO.setListaErrores(listCreacionPlazaMasivaDTO);
            String patron = "dd/MM/yyyy";
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            String tipo = "";
            List<HashMap<String, Object>> listaMapasTnPlantillaPlazaEstructura = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnPlantillaPlazaEstructura;
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 creacionPlazaMasivaDTO.getListaPlazaEstructuraCorrecta()) {
                mapaTnPlantillaPlazaEstructura = new HashMap<String, Object>();
                mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloActual());
                mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", 
                                                   templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", 
                                                   templateFileCreatePlazaEstructura.getUnidad());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel", 
                                                   templateFileCreatePlazaEstructura.getNivel());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", 
                                                   templateFileCreatePlazaEstructura.getZona());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", 
                                                   templateFileCreatePlazaEstructura.getCodigo());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza", 
                                                   templateFileCreatePlazaEstructura.getPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeCasos", 
                                                   templateFileCreatePlazaEstructura.getCasos());
                tipo = 
templateFileCreatePlazaEstructura.getTipo().toUpperCase().equals("TRANSFERENCIA") ? 
"TRANSFERENCIA" : templateFileCreatePlazaEstructura.getTipo();
                mapaTnPlantillaPlazaEstructura.put("ppeTipo", tipo);
                mapaTnPlantillaPlazaEstructura.put("ppeEstatus", 
                                                   templateFileCreatePlazaEstructura.getEstatus());
                mapaTnPlantillaPlazaEstructura.put("ppeCancelada", 
                                                   templateFileCreatePlazaEstructura.getCancelada());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoMov", 
                                                   templateFileCreatePlazaEstructura.getTipoMovimiento());
                mapaTnPlantillaPlazaEstructura.put("ppeRegularizable", 
                                                   templateFileCreatePlazaEstructura.getRegularizable());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoPersonal", 
                                                   templateFileCreatePlazaEstructura.getTipoPersonal());
                mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", 
                                                   templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnPlantillaPlazaEstructura.put("usuario", 
                                                   usuario);
                mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
            }

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, 
                                                                                                              usuario);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByselectTnPlantillaPlazaEstructuraVsPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsPlaza, 
                             comparatorPlaza);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsUnidad = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsUnidad(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorUnidad = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdUnidad().compareTo(o2.getIdUnidad());
                        return regreso;
                    }

                };

            Collections.sort(listaTnPlantillaPlazaEstructuraVsUnidad, 
                             comparatorUnidad);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuesto = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuesto(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuesto = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPuesto().compareTo(o2.getIdPuesto());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuesto, 
                             comparatorPuesto);
                             
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsPuestoVsPlaza(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPuestoPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = 
                                o1.getIdPlaza().compareTo(o2.getIdPlaza()) + o1.getIdPuesto().compareTo(o2.getIdPuesto());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza, 
                             comparatorPuestoPlaza);                              

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaEstructuraVsEstado = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructuraVsEstado(usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorEstado = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = 
                                o1.getPpeEntidadFederativa().compareTo(o2.getPpeEntidadFederativa());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaEstructuraVsEstado, 
                             comparatorEstado);


            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsZona = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsZona("TRANSFERENCIA", 
                                                                                                                     usuario);
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorZona = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaAmpliaVsZona, 
                             comparatorPlaza);

            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaAmpliaVsGrupoPago = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaAmpliaVsGrupoPago(usuario);



            List<CustomTnPlantillaPlazaEstructura> listafindByTnPlantillaPlazaEstructura = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructura(usuario);


            int pos = -1;
            StringBuffer buffer = null;
            archivoValido = true;
            boolean errorValidacion = false;
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {

                buffer = new StringBuffer();
                errorValidacion = false;

                //ValidaciÛn AfectaciÛn Vs Plaza
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPlaza, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos < 0) {

                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                if (customTnPlantillaPlazaEstructura.getIdPlaza() >= 60000 && 
                    customTnPlantillaPlazaEstructura.getIdPlaza() <= 79999) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.plaza.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Unidad
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsUnidad, 
                         customTnPlantillaPlazaEstructura, comparatorUnidad);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }


                //ValidaciÛn AfectaciÛn Vs Puesto
                pos = 
                Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuesto, 
                         customTnPlantillaPlazaEstructura, comparatorPuesto);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                
                
                //ValidaciÛn AfectaciÛn Vs Puesto Vs Plaza
                pos = 
                Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuestoVsPlaza, 
                         customTnPlantillaPlazaEstructura, 
                         comparatorPuestoPlaza);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.corresponde.plaza"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Estado
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsEstado, 
                         customTnPlantillaPlazaEstructura, comparatorEstado);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.estado.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn AfectaciÛn Vs Zona
                pos = 
Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsZona, 
                         customTnPlantillaPlazaEstructura, comparatorZona);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.zona.economica.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                //ValidaciÛn Afectacion Vs Grupo de Pago de Plaza

                pos = 
Collections.binarySearch(listaTnPlantillaPlazaAmpliaVsGrupoPago, 
                         customTnPlantillaPlazaEstructura, comparatorPlaza);
                if (pos >= 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.grupo.pago.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }



                if (errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
                }

            }

            creacionPlazaMasivaDTO.setArchivoValido(archivoValido && 
                                                    creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() == 
                                                    0);
            List<CreacionPlazaMasivaDTO> listaErrores = 
                new ArrayList<CreacionPlazaMasivaDTO>();
            // if (!archivoValido) {
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {
                CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVO = 
                    new CreacionPlazaMasivaDTO();
                creacionPlazaMasivaDTOVO.setAdecuacionCicloAnterior(customTnPlantillaPlazaEstructura.getPpeAdecuacionAnterior());
                creacionPlazaMasivaDTOVO.setAdecuacionCicloActual(customTnPlantillaPlazaEstructura.getPpeAdecuacionActual());
                creacionPlazaMasivaDTOVO.setUnidad(customTnPlantillaPlazaEstructura.getIdUnidad());
                creacionPlazaMasivaDTOVO.setNivel(customTnPlantillaPlazaEstructura.getIdNivel());
                creacionPlazaMasivaDTOVO.setZona(customTnPlantillaPlazaEstructura.getIdZona());
                creacionPlazaMasivaDTOVO.setCodigo(customTnPlantillaPlazaEstructura.getIdPuesto());
                creacionPlazaMasivaDTOVO.setPlaza(customTnPlantillaPlazaEstructura.getIdPlaza());
                creacionPlazaMasivaDTOVO.setCasos(customTnPlantillaPlazaEstructura.getPpeCasos());
                creacionPlazaMasivaDTOVO.setTipo(customTnPlantillaPlazaEstructura.getPpeTipo());
                creacionPlazaMasivaDTOVO.setEstatus(customTnPlantillaPlazaEstructura.getPpeEstauts());
                creacionPlazaMasivaDTOVO.setCancelada(customTnPlantillaPlazaEstructura.getPpeCancelada());
                creacionPlazaMasivaDTOVO.setTipoMovimiento(customTnPlantillaPlazaEstructura.getPpeTipoMov());
                creacionPlazaMasivaDTOVO.setRegularizable(customTnPlantillaPlazaEstructura.getPpeRegularizable());
                creacionPlazaMasivaDTOVO.setTipoPersonal(customTnPlantillaPlazaEstructura.getPpeTipoPersonal());
                creacionPlazaMasivaDTOVO.setEntidadFederativa(customTnPlantillaPlazaEstructura.getPpeEntidadFederativa());
                creacionPlazaMasivaDTOVO.setInicioVigencia(customTnPlantillaPlazaEstructura.getPpeInicioVigencia());
                creacionPlazaMasivaDTOVO.setMensaje(customTnPlantillaPlazaEstructura.getMensaje());
                listaErrores.add(creacionPlazaMasivaDTOVO);
            }

            if (creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta().size() > 
                0) {
                listaErrores.addAll(creacionPlazaMasivaDTO.getListaPlazaEstructuraIncorrecta());
            }
            creacionPlazaMasivaDTO.setListaErrores(listaErrores);
            String nameFileXls = 
                creacionPlazaMasivaDTO.getNombreArchivoErrores();
            String nombreArchivoXls = 
                super.configuration().getString("local.temp.dir") + 
                File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.xls.plazaMasiva");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("creacionPlazaMasivaDTO", creacionPlazaMasivaDTO);

            transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                     nombreArchivoXls);
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);
        } catch (InvalidFormatException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasivaTransferencia] " + 
                                       e.toString(), e);
        } catch (IOException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [processPMFilePlazaEstructuraMasivaTransferencia] " + 
                                       e.toString(), e);
        } finally {
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);

        }
        return creacionPlazaMasivaDTO;
    }

    public CreacionPlazaMasivaDTO updatePMPlazaEstructuraMasivaTransferencia(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        String nombreArchivoXls = null;
        try {
            String usuario = super.identity().get().getUserID();
            Calendar hoy = Calendar.getInstance();
            hoy.setTime(new Date());
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            String anio = new Integer((int)c.get(Calendar.YEAR)).toString();
            creacionPlazaMasivaDTO.setAnio(anio);
            Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.plazaMasiva");
            nombreArchivoXls = 
                    super.configuration().getString("local.temp.dir") + 
                    File.separator + 
                    creacionPlazaMasivaDTO.getNombreArchivoErrores();
            InputStream inputStreamArchivoXls = 
                new FileInputStream(nombreArchivoXls);
            InputStream inputStreamArchivoXml = 
                new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
            List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = 
                parserXls.parseFile(inputStreamArchivoXls, 
                                    CreacionPlazaMasivaDTO.class);
            creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);
            String patron = "dd/MM/yyyy";
            //Formatter fmt = new Formatter();
            String adecuacionActual = null;
            SimpleDateFormat formato = new SimpleDateFormat(patron);
            Calendar calendarOfacFecOficio = Calendar.getInstance();
            List<HashMap<String, Object>> listaMapasTdPlazaAfectacion = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlazaAfectacion;
            Set<String> adecuacionSet = new HashSet<String>();

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 listTemplateFileCreatePlazaEstructura) {
                mapaTdPlazaAfectacion = new HashMap<String, Object>();
                mapaTdPlazaAfectacion.put("plafCiclo", anio);

                adecuacionActual =  templateFileCreatePlazaEstructura.getAdecuacionCicloActual().substring(6);
                mapaTdPlazaAfectacion.put("idOficioAfecta", anio + StringUtils.leftPad( adecuacionActual, 5, '0'));
                mapaTdPlazaAfectacion.put("idPlaza", 
                                          templateFileCreatePlazaEstructura.getPlaza());
                mapaTdPlazaAfectacion.put("idOperacion", 
                                          OPERACION_TRANSFERENCIA_PLAZA_MASIVA);
                mapaTdPlazaAfectacion.put("idRegularizable", 
                                          templateFileCreatePlazaEstructura.getIsRegularizable() ? 
                                          1 : 9);
                mapaTdPlazaAfectacion.put("idJustificacion", ID_JUSTIFICACION);
                mapaTdPlazaAfectacion.put("idUnidad", 
                                          templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlazaAfectacion.put("idPuesto", 
                                          templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlazaAfectacion.put("idEdo", 
                                          templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlazaAfectacion.put("idZonaEcon", 
                                          templateFileCreatePlazaEstructura.getZona());
                mapaTdPlazaAfectacion.put("idGrupoPago", 
                                          CREACION_ID_GRUPO_PAGO);
                mapaTdPlazaAfectacion.put("plafProfAmplia", 
                                          CREACION_PLAF_PROY_AMPLIA);
                mapaTdPlazaAfectacion.put("plafProfReduce", 
                                          ID_PROY_REGUL_PREFIX_TRANSFERENCIA_PLAZA_ESTRUCTURAL_MASIVA + 
                                          adecuacionActual);
                mapaTdPlazaAfectacion.put("plafInicio", 
                                          templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlazaAfectacion.put("plafFinal", 
                                          templateFileCreatePlazaEstructura.getIsRegularizable() ? 
                                          formato.parse(CREACION_PLAF_FINAL) : 
                                          formato.parse(CREACION_PLAF_FINAL_NO_REGULARIZABLE + 
                                                        anio));
                mapaTdPlazaAfectacion.put("plafDiasPrima", 
                                          CREACION_PLAF_DIAS_PRIMA);
                mapaTdPlazaAfectacion.put("plafDiasAguinaldo", 
                                          CREACION_PLAF_DIAS_AGUINALDO);
                mapaTdPlazaAfectacion.put("usuario", usuario);
                mapaTdPlazaAfectacion.put("fecModifico", new Date());
                listaMapasTdPlazaAfectacion.add(mapaTdPlazaAfectacion);
                if (templateFileCreatePlazaEstructura.getAdecuacionCicloActual() != 
                    null && !adecuacionSet.contains(anio + adecuacionActual)) {
                    adecuacionSet.add(anio + adecuacionActual);
                }

                calendarOfacFecOficio.setTime(templateFileCreatePlazaEstructura.getInicioVigencia());

            }


            Integer anioEntero = c.get(Calendar.YEAR);
            Iterator it = adecuacionSet.iterator();
            while (it.hasNext()) {

                //Insertamos registros por adecuaciÛn en TC_PROY_REGULARIZA
                String adecuacion = (String)it.next();
                String idProyRegul = 
                    ID_PROY_REGUL_PREFIX_TRANSFERENCIA_PLAZA_ESTRUCTURAL_MASIVA + 
                    adecuacion.substring(4);
                TcProyRegularizaPK tcProyRegularizaPK = 
                    new TcProyRegularizaPK();
                tcProyRegularizaPK.setIdProyRegul(idProyRegul);
                tcProyRegularizaPK.setPrCiclo(anioEntero);

                TcProyRegulariza tcProyRegulariza = new TcProyRegulariza();
                tcProyRegulariza.setIdentity(tcProyRegularizaPK);
                tcProyRegulariza.setDescProyRegul(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_TRANSFERENCIA);
                tcProyRegulariza.setUsuario(usuario);
                tcProyRegulariza.setFecModifico(new Date());

                super.persistence().get(TcProyRegularizaDAO.class).save(tcProyRegulariza);

                ////Insertamos registros por adecuaciÛn en TD_PLAZA_AFECTACION

                Long idOficioAfecta = new Long(anio + StringUtils.leftPad( adecuacion.substring(4), 5, '0'));
                TdOficioAfectacionPK tdOficioAfectacionPK = new TdOficioAfectacionPK();
                tdOficioAfectacionPK.setOfacCiclo(anioEntero);
                tdOficioAfectacionPK.setIdOficioAfecta(idOficioAfecta);


                TdOficioAfectacion tdOficioAfectacion = 
                    new TdOficioAfectacion();
                tdOficioAfectacion.setIdentity(tdOficioAfectacionPK);
                tdOficioAfectacion.setIdSitAfectaci(ID_SIT_AFECTACION_CREACION);
                tdOficioAfectacion.setIdTipoDocto(ID_TIPO_DOCTO_CREACION);
                tdOficioAfectacion.setOfacAplicaOficio(ID_PROY_REGUL_PREFIX_TRANSFERENCIA_PLAZA_ESTRUCTURAL_MASIVA);
                tdOficioAfectacion.setOfacProyRegulA(idProyRegul);
                tdOficioAfectacion.setOfacProyRegulR(idProyRegul);
                tdOficioAfectacion.setOfacFecOfic(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacNumAutoriza(null);
                tdOficioAfectacion.setOfacLeyendaJustif(DESC_PROY_REGUL_INSERT_TC_PROY_REGULARIZA_TRANSFERENCIA);
                tdOficioAfectacion.setOfacTotalSecuencia(false);
                tdOficioAfectacion.setOfacTotalSecSiaff(false);
                tdOficioAfectacion.setOfacTotalAmpliacion(0.0);
                tdOficioAfectacion.setOfacTotalReduccion(0.0);
                tdOficioAfectacion.setOfacFecAprobacion(calendarOfacFecOficio.getTime());
                tdOficioAfectacion.setOfacUsrAprobacion(usuario);
                tdOficioAfectacion.setOfacFecModAprob(DateUtils.truncate(hoy.getTime(), 
                                                                         Calendar.DATE));
                tdOficioAfectacion.setOfacAplicaOficio(OFAC_APLICA_OFICIO_CREACION);
                tdOficioAfectacion.setUsuario(usuario);
                tdOficioAfectacion.setFecModifico(hoy.getTime());
                tdOficioAfectacion.setOfacTipoAfectaci(CREACION_PREFIX_PLAF_PROY_CANCELACION);
                super.persistence().get(TdOficioAfectacionDAO.class).save(tdOficioAfectacion);

            }

            List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnMovtosEmpPla;

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 listTemplateFileCreatePlazaEstructura) {

                TdPlaza tdPlaza = null;
                tdPlaza = 
                        super.persistence().get(TdPlazaDAO.class).getById(templateFileCreatePlazaEstructura.getPlaza());
                if (tdPlaza != null) {
                    super.persistence().get(TdPlazaDAO.class).delete(tdPlaza);
                    TcAtributoPuesto tcAtributoPuesto = 
                                        super.getAtributoPuesto(tdPlaza.getIdPuestoPre());

                    mapaTnMovtosEmpPla = new HashMap<String, Object>();
                    mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
                    mapaTnMovtosEmpPla.put("idMovtoPersona", 
                                           TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_TRANSFERENCIA);
                    mapaTnMovtosEmpPla.put("idPlaza", tdPlaza.getIdPlaza());
                    mapaTnMovtosEmpPla.put("idSituacionPlaza", 
                                           tdPlaza.getIdSitPlaza());
                    mapaTnMovtosEmpPla.put("mepRfc", tdPlaza.getPlazaRfc());
                    mapaTnMovtosEmpPla.put("mepPlazaRespaldo", 
                                           tdPlaza.getPlazaRespaldo());
                    mapaTnMovtosEmpPla.put("idGrupoPago", 
                                           tdPlaza.getIdGrupoPago());
                    mapaTnMovtosEmpPla.put("idUnidadPre", 
                                           tdPlaza.getIdUnidadPre());
                    mapaTnMovtosEmpPla.put("idPuestoPre", 
                                           tdPlaza.getIdPuestoPre());
                    mapaTnMovtosEmpPla.put("idEdoPre", tdPlaza.getIdEdoPre());
                    mapaTnMovtosEmpPla.put("idZonaEcoPre", 
                                           tdPlaza.getIdZonaEcoPre());
                    mapaTnMovtosEmpPla.put("idRangoPre", 
                                           tdPlaza.getIdRangoPre());
                    mapaTnMovtosEmpPla.put("idUnidadNom", 
                                           tdPlaza.getIdUnidadNom());
                    mapaTnMovtosEmpPla.put("idPuestoNom", 
                                           tdPlaza.getIdPuestoNom());
                    mapaTnMovtosEmpPla.put("idNivelPtoNom", 
                                           tcAtributoPuesto.getIdNivelPto());
                    mapaTnMovtosEmpPla.put("idNombramientoNom", 
                                           tcAtributoPuesto.getIdNombramiento());
                    mapaTnMovtosEmpPla.put("idJerarquiaNom", 
                                           tcAtributoPuesto.getIdJerarquia());
                    mapaTnMovtosEmpPla.put("idEdoNom", tdPlaza.getIdEdoNom());
                    mapaTnMovtosEmpPla.put("idMuniNom", 
                                           tdPlaza.getIdMuniNom());
                    mapaTnMovtosEmpPla.put("idZonaEcoNom", 
                                           tdPlaza.getIdZonaEcoNom());
                    mapaTnMovtosEmpPla.put("idRangoNom", 
                                           tdPlaza.getIdRangoNom());
                    mapaTnMovtosEmpPla.put("idZonaDistNom", 
                                           tdPlaza.getIdZonaDistNom());
                    mapaTnMovtosEmpPla.put("mepImporteHonorario", 
                                           TN_MOVTOS_EMP_PLA_MEP_ULTIMO_MOVTO);
                    mapaTnMovtosEmpPla.put("mepUltimoMovto", 
                                           templateFileCreatePlazaEstructura.getInicioVigencia());
                    mapaTnMovtosEmpPla.put("mepIniCont", 
                                           templateFileCreatePlazaEstructura.getInicioVigencia());
                    mapaTnMovtosEmpPla.put("mepFinCont", 
                                           formato.format(templateFileCreatePlazaEstructura.getInicioVigencia()));
                    mapaTnMovtosEmpPla.put("mepIniLic", null);
                    mapaTnMovtosEmpPla.put("mepFinLic", null);
                    mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
                    mapaTnMovtosEmpPla.put("idTipoPlaza", 
                                           tdPlaza.getIdTipoPlaza());
                    mapaTnMovtosEmpPla.put("idServPub", 
                                           tdPlaza.getIdServPub());
                    mapaTnMovtosEmpPla.put("idPtoEstrategico", 
                                           tdPlaza.getIdPtoEstrategico());
                    mapaTnMovtosEmpPla.put("idInmueble", 
                                           tdPlaza.getIdInmueble());
                    mapaTnMovtosEmpPla.put("mepEdif", null);
                    mapaTnMovtosEmpPla.put("mepPiso", null);
                    mapaTnMovtosEmpPla.put("mepAla", null);
                    mapaTnMovtosEmpPla.put("mepOfna", null);
                    mapaTnMovtosEmpPla.put("mepTelOf1", null);
                    mapaTnMovtosEmpPla.put("mepTelOf2", null);
                    mapaTnMovtosEmpPla.put("mepConmut", null);
                    mapaTnMovtosEmpPla.put("mepExt1", null);
                    mapaTnMovtosEmpPla.put("mepExt2", null);
                    mapaTnMovtosEmpPla.put("mepRfcUnico", null);
                    mapaTnMovtosEmpPla.put("idBancoSar", null);
                    mapaTnMovtosEmpPla.put("idTipoPago", null);
                    mapaTnMovtosEmpPla.put("mepImssIssste", null);
                    mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
                    mapaTnMovtosEmpPla.put("mepCurp", null);
                    mapaTnMovtosEmpPla.put("mepNombre", null);
                    mapaTnMovtosEmpPla.put("mepPrimerApellido", null);
                    mapaTnMovtosEmpPla.put("mepSegundoApellido", null);
                    mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
                    mapaTnMovtosEmpPla.put("mepClabe", null);
                    mapaTnMovtosEmpPla.put("mepReferenciaOficio", null);
                    mapaTnMovtosEmpPla.put("mepIngresoGobFed", null);
                    mapaTnMovtosEmpPla.put("mepIngresoDependencia", null);
                    mapaTnMovtosEmpPla.put("mepCasoMuestra", null);
                    mapaTnMovtosEmpPla.put("mepCalleParticular", null);
                    mapaTnMovtosEmpPla.put("mepColoniaParticular", null);
                    mapaTnMovtosEmpPla.put("mepCveMuniParticular", null);
                    mapaTnMovtosEmpPla.put("mepCveEdoParticular", null);
                    mapaTnMovtosEmpPla.put("mepCodpostParticular", null);
                    mapaTnMovtosEmpPla.put("mepTelParticular", null);
                    mapaTnMovtosEmpPla.put("idEdoCivil", null);
                    mapaTnMovtosEmpPla.put("mepEMailOficial", null);
                    mapaTnMovtosEmpPla.put("mepEMailPersonal", null);
                    mapaTnMovtosEmpPla.put("mepCveEdoNac", null);
                    mapaTnMovtosEmpPla.put("idGenero", null);
                    mapaTnMovtosEmpPla.put("idNacionalidad", null);
                    mapaTnMovtosEmpPla.put("mepDiscapacidad", null);
                    mapaTnMovtosEmpPla.put("idNivelEscolar", null);
                    mapaTnMovtosEmpPla.put("idProfnCarrera", null);
                    mapaTnMovtosEmpPla.put("idInstEducativa", null);
                    mapaTnMovtosEmpPla.put("idInstProtcivil", null);
                    mapaTnMovtosEmpPla.put("idEspProtcivil", null);
                    mapaTnMovtosEmpPla.put("mepEstudiaSiNo", null);
                    mapaTnMovtosEmpPla.put("mepPadreMadre", null);
                    mapaTnMovtosEmpPla.put("mepTerminoCargoSind", null);
                    mapaTnMovtosEmpPla.put("mepCompatEmpleo", null);
                    mapaTnMovtosEmpPla.put("idRusp", null);
                    mapaTnMovtosEmpPla.put("mepFecNotDecPatr", null);
                    mapaTnMovtosEmpPla.put("mepFecIniDeclPatr", null);
                    mapaTnMovtosEmpPla.put("mepFecIngSpc", null);
                    mapaTnMovtosEmpPla.put("mepSpcAnioAnt", null);
                    mapaTnMovtosEmpPla.put("idUnidadNomAnt", null);
                    mapaTnMovtosEmpPla.put("idPuestoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idEdoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idMuniNomAnt", null);
                    mapaTnMovtosEmpPla.put("idZonaEcoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idRangoNomAnt", null);
                    mapaTnMovtosEmpPla.put("idNombramientoAnt", null);
                    mapaTnMovtosEmpPla.put("mepPlazaAnt", null);
                    mapaTnMovtosEmpPla.put("idNivelPtoAnt", null);
                    mapaTnMovtosEmpPla.put("idJerarquiaAnt", null);
                    mapaTnMovtosEmpPla.put("mepObserva", null);
                    mapaTnMovtosEmpPla.put("mepObservaInternas", null);
                    mapaTnMovtosEmpPla.put("mepQnaCancela", null);
                    mapaTnMovtosEmpPla.put("mepUsrCancela", null);
                    mapaTnMovtosEmpPla.put("mepFechaCancela", null);
                    mapaTnMovtosEmpPla.put("usuario", usuario);
                    mapaTnMovtosEmpPla.put("fecModifico", new Date());
                    listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);
                }
            }
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, 
                                                                                      usuario);
            super.persistence().get(CustomTdPlazaAfectacionDAO.class).saveTdPlazaAfectacion(listaMapasTdPlazaAfectacion, 
                                                                                            usuario);

        } catch (FileNotFoundException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMPlazaEstructuraMasivaTransferencia] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
            throw new ServiceException("ServiceException in PlazaEstructuraMasivaBS [updatePMPlazaEstructuraMasivaTransferencia] " + 
                                       e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }
        }
        return creacionPlazaMasivaDTO;
    }
}
