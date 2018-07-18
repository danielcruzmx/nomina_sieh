package gob.shcp.sireh.service.plaza.honorarios.masivos;

import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.data.jdbc.QueryTdPlazaDAO;

import gob.shcp.sireh.data.jdbc.QueryTnPlantillaPlazaEstructuraDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnPlantillaPlazaEstructuraDAO;
import gob.shcp.sireh.domain.jdbc.CustomTnPlantillaPlazaEstructura;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.AltaMasivaDTO;
import gob.shcp.sireh.model.plaza.estructura.masivos.CreacionPlazaMasivaDTO;


import gob.shcp.sireh.model.plaza.estructura.masivos.PlazaHonorarioMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.CambioAdscripcionMasivoDTO;
import gob.shcp.sireh.model.plaza.honorarios.ProrrogaMasivaDTO;
import gob.shcp.sireh.model.plaza.eventual.ReduccionContratoMasivaDTO;
import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.parser.support.ParserXls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jxls.transformer.XLSTransformer;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class PlazaHonorarioMasivaBS extends AbstractSirehService implements PlazaHonorarioMasivaService{

    public static final Integer OPERACION_CREACION_PLAZA_MASIVA = 32;
    public static final Integer ID_JUSTIFICACION = 99;
    public static final String CREACION_ID_GRUPO_PAGO = "E";
    public static final String CREACION_PLAF_PROY_REDUCE_EVENTUAL = "000000";

    public static final String CREACION_PREFIX_PLAF_PROY_AMPLIA_EVENTUAL = "000000";
    public static final String CREACION_PLAF_FINAL = "01/01/2099";
    public static final Integer CREACION_PLAF_DIAS_PRIMA = 10;
    public static final Integer CREACION_PLAF_DIAS_AGUINALDO = 40;
    public static final String TD_PLAZA_ID_SIT_PLAZA_CONGELADA = "C";
    public static final Integer TD_PLAZA_PLAZA_RESPALDO = 0;
    public static final String TD_PLAZA_ID_GRUPO_PAGO = "H";
    public static final Integer TD_PLAZA_ID_RANGO_PRE = 0;
    public static final Integer TD_PLAZA_ID_MUNI_NOM = 0;
    public static final Integer TD_PLAZA_ID_RANGO_NOM = 0;
    public static final Integer TD_PLAZA_ID_ZONA_DIST_NOM = 9000;
    public static final String TD_PLAZA_ID_TIPO_PLAZA_EVENTUAL = "X";
    public static final Integer TD_PLAZA_IMPORTE_HONORARIO = 0;
    public static final String TD_PLAZA_ID_PUESTO_NOM = "HONORAR";
    public static final Integer TD_PLAZA_ID_MOVTO_PERSONA = 521;
	public static final Integer TD_PLAZA_ID_MOVTO_PERSONA_ALTA = 112;
    public static final Date TN_MOVTOS_EMP_PLA_MEP_FIN_CONT = new Date();
    public static final String TD_PLAZA_PLAZA_REFERENCIA = "CREACION DE PLAZA MASIVA";
    public static final String TD_PLAZA_ID_NODO = "000";
	public static final String TD_PLAZA_ID_PTO_ESTRATEGICO = "0";
	public static final String TD_PLAZA_ID_SIT_PLAZA_OCUPADA = "O";
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA = 521;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_ALTA = 112;
    public static final String TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA_CONGELADA = "C";
    public static final String TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA_OCUPADA = "O";
    public static final String TN_MOVTOS_EMP_PLA_ID_PUESTO_NOM = "HONORAR";
    public static final String TN_MOVTOS_EMP_PLA_ID_GRUPO_PAGO = "H";
    public static final Integer TN_MOVTOS_EMP_PLA_ID_RANGO_PRE = 0;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_MUNI_NOM = 0;
    public static final Integer TN_MOVTOS_EMP_PLA_ID_RANGO_NOM = 0;

    public static final Integer TN_MOVTOS_EMP_PLA_MEP_IMPORTE_HONORARIO = 0;
    public static final String  TN_MOVTOS_EMP_PLA_MEP_OBSERVA_BAJA = "MOVIMIENTO DE BAJA MASIVA";
    public static final String  TN_MOVTOS_EMP_PLA_MEP_OBSERVA_ALTA = "MOVIMIENTO DE ALTA MASIVA";
    public static final String  TN_MOVTOS_EMP_PLA_MEP_REFERENCIA_OFICIO_ALTA = "ALTA MASIVA";
    public static final String  TN_MOVTOS_EMP_PLA_MEP_REFERENCIA_OFICIO_BAJA = "BAJA MASIVA";
    
    
    public static final String EXPRESION_REGULAR_VALIDACION_ANTERIOR = 
        "[0-9]{1,10}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ACTUAL = 
        "[0-9]{1,10}$";
    public static final String EXPRESION_REGULAR_VALIDACION_UNIDAD = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_NIVEL = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,4}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ZONA = 
        "[0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_CODIGO = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9 _]{1,7}$";
    public static final String EXPRESION_REGULAR_VALIDACION_PLAZAS = 
        "[0-9]{1,6}$";
    public static final String EXPRESION_REGULAR_VALIDACION_CASOS = 
        "-?[0-9]{1,3}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ESTATUS = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}";
    public static final String EXPRESION_REGULAR_VALIDACION_CANCELADA = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_MOVIMIENTO = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_REGULARIZABLE = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9\\s]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_PERSONAL = 
        "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9\\s]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_ENTIDAD = 
        "[0-9]{1,50}$";
    public static final String EXPRESION_REGULAR_VALIDACION_VIGENCIA = 
        "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)";
    public static final String EXPRESION_REGULAR_VALIDACION_TIPO_SERV_PUB = 
    "[A-Za-z·ÈÌÛ˙¡…Õ”⁄0-9]{1,5}$";
    public static final String EXPRESION_REGULAR_VALIDACION_PLAZA_IMP_HONO = 
    "[0-9]{1,14}.[0-9]{1,2}$";


    public void processCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        int anio = (int) quincenaCaptura / 100;
        cambioAdscripcionMasivoDTO.setAnio(anio);
        cambioAdscripcionMasivoDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        cambioAdscripcionMasivoDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        cambioAdscripcionMasivoDTO.setDiasRetroactividad(super.configuration().getNumber("movimientosMasivos", "DIAS_RETROACTIVIDAD").intValue());
    }

    public void updateNMCambioAdscripcion(CambioAdscripcionMasivoDTO cambioAdscripcionMasivoDTO){
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        String usuario = super.security().getUserName();
        Integer idMovtoPersona = super.configuration().getNumber("movCode", "CAMBIO_DE_ADSCRIPCION").intValue();
        cambioAdscripcionMasivoDTO.getFechaInicioMovimiento();
        List<String> listaIdUnidadNom = cambioAdscripcionMasivoDTO.getIdUnidadNomFilter() != null && !cambioAdscripcionMasivoDTO.getIdUnidadNomFilter().isEmpty()
                            ? cambioAdscripcionMasivoDTO.getIdUnidadNomFilter() : getUnidadesDimension();

        List<TdPlaza> listaPlazasAProcesar = null;
        // Lista con un elemento con plaza con id = 0 para cuando no existen excluidas el query ignore esta condicion
        List<String> listaDummy = new ArrayList<String>() ;
        listaDummy.add("0");
        
        listaPlazasAProcesar = super.persistence().get(CustomTdPlazaDAO.class).findBajasPlazasByUnidad(TD_PLAZA_ID_GRUPO_PAGO, listaIdUnidadNom, null, cambioAdscripcionMasivoDTO.getIdPlaza() != null && cambioAdscripcionMasivoDTO.getIdPlaza().length > 0 ? Arrays.asList(cambioAdscripcionMasivoDTO.getIdPlaza()) : listaDummy );
        TdEmpleado empleado = null;
        List<TdPlazaDTO> listaResultados = cambioAdscripcionMasivoDTO.getListaResultados();
        for(TdPlaza plaza : listaPlazasAProcesar){
            empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc()); 

            TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, idMovtoPersona, quincenaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoNom()));
            tnMovtosEmpPla.setMepUltimoMovto(cambioAdscripcionMasivoDTO.getFechaInicioMovimiento());
            tnMovtosEmpPla.setIdUnidadPre(cambioAdscripcionMasivoDTO.getIdUnidadDestino());
            tnMovtosEmpPla.setIdUnidadNom(cambioAdscripcionMasivoDTO.getIdUnidadDestino());
            tnMovtosEmpPla.setMepObserva(cambioAdscripcionMasivoDTO.getMepObserva());
            plaza.setIdUnidadPre(cambioAdscripcionMasivoDTO.getIdUnidadDestino());
            plaza.setIdUnidadNom(cambioAdscripcionMasivoDTO.getIdUnidadDestino());
            plaza.setPlazaUltimoMovto(cambioAdscripcionMasivoDTO.getFechaInicioMovimiento());
            plaza.setPlazaQnaCaptura(quincenaCaptura);
            plaza.setUsuario(usuario);
            plaza.setFecModifico(new Date());
            
            super.persistence().get(TdPlazaDAO.class).save(plaza);
            super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
            listaResultados.add(super.transformation().map(plaza, TdPlazaDTO.class));
        }
        
        // EXPORTA A EXCEL
        try {
            String nameFileXls = cambioAdscripcionMasivoDTO.getNombreArchivoResultados();
            String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.xls.exportXlsMasivos");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("exportXlsMasivosDTO", cambioAdscripcionMasivoDTO);
            transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
            cambioAdscripcionMasivoDTO.setNombreArchivoResultados(nameFileXls);
        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateCambioAdscripcion] " + 
                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateCambioAdscripcion] " + 
                                        e.toString(), e);
        }
    }


    public void processBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO) {
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        int anio = (int) quincenaCaptura / 100;
        plazaHonorarioMasivaDTO.setAnio(anio);
        plazaHonorarioMasivaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        plazaHonorarioMasivaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        plazaHonorarioMasivaDTO.setDiasRetroactividad(super.configuration().getNumber("movimientosMasivos", "DIAS_RETROACTIVIDAD").intValue());
    }

    public PlazaHonorarioMasivaDTO updateNMBaja(PlazaHonorarioMasivaDTO plazaHonorarioMasivaDTO) {
        try {
            String usuario = super.security().getUserName();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            
            Integer quincenaCaptura = super.getQuincenaCaptura() != null ? super.getQuincenaCaptura().intValue() : null;
            
            Date fechaFinCont = formatoFecha.parse(plazaHonorarioMasivaDTO.getPlazaFinContString());
            
            List<String> listaIdUnidadNom = plazaHonorarioMasivaDTO.getIdUnidadNomFilter() != null && !plazaHonorarioMasivaDTO.getIdUnidadNomFilter().isEmpty()
                            ? plazaHonorarioMasivaDTO.getIdUnidadNomFilter() : getUnidadesDimension();

            List<TdPlaza> listaPlazasAProcesar = null;
            List<String> listaDummy = new ArrayList<String>();
            listaDummy.add("0");
            if(plazaHonorarioMasivaDTO.getPlazaFinContStringHidden().length() > 0 ){
                listaPlazasAProcesar = super.persistence().get(CustomTdPlazaDAO.class).findBajasPlazasByUnidad(TD_PLAZA_ID_GRUPO_PAGO, listaIdUnidadNom, fechaFinCont, plazaHonorarioMasivaDTO.getIdPlaza() != null && plazaHonorarioMasivaDTO.getIdPlaza().length > 0 ? Arrays.asList(plazaHonorarioMasivaDTO.getIdPlaza()) : listaDummy);
            }
            
            List<TdPlazaDTO> listaResultados = plazaHonorarioMasivaDTO.getListaResultados();
            List<HashMap<String,Object>> listaMapaTnMovtosEmpPla = new ArrayList<HashMap<String,Object>>();
            HashMap<String, Object> mapaTnMovtosEmpPla;
            List<HashMap<String,Object>> listaMapaTdPlaza = new ArrayList<HashMap<String,Object>>();
            HashMap<String, Object> mapaTdPlaza;
            for(TdPlaza plaza : listaPlazasAProcesar){
                TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());

                mapaTnMovtosEmpPla = new HashMap<String, Object>();
                mapaTnMovtosEmpPla.put("idMovtoPersona", super.getMovimientoPersonal("BAJA_POR_TERMINO_DE_CONTRATO"));
                mapaTnMovtosEmpPla.put("idPlaza", plaza.getIdPlaza());
                mapaTnMovtosEmpPla.put("idSituacionPlaza", TD_PLAZA_ID_SIT_PLAZA_CONGELADA);
                mapaTnMovtosEmpPla.put("mepRfc", plaza.getPlazaRfc());
                mapaTnMovtosEmpPla.put("idGrupoPago", plaza.getIdGrupoPago());
                mapaTnMovtosEmpPla.put("idUnidadPre", plaza.getIdUnidadPre());
                mapaTnMovtosEmpPla.put("idPuestoPre", plaza.getIdPuestoPre());
                mapaTnMovtosEmpPla.put("idEdoPre", plaza.getIdEdoPre());
                mapaTnMovtosEmpPla.put("idZonaEcoPre", plaza.getIdZonaEcoPre());
                mapaTnMovtosEmpPla.put("idRangoPre", plaza.getIdRangoPre());
                mapaTnMovtosEmpPla.put("idUnidadNom", plaza.getIdUnidadNom());
                mapaTnMovtosEmpPla.put("idPuestoNom", plaza.getIdPuestoNom());

                if (plaza.getIdPuestoNom() != null) {
                    TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(plaza.getIdPuestoNom());
                    mapaTnMovtosEmpPla.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto());
                    mapaTnMovtosEmpPla.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento());
                    mapaTnMovtosEmpPla.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia());
                }

                mapaTnMovtosEmpPla.put("idEdoNom", plaza.getIdEdoNom());
                mapaTnMovtosEmpPla.put("idMuniNom", plaza.getIdMuniNom());
                mapaTnMovtosEmpPla.put("idZonaEcoNom", plaza.getIdZonaEcoNom());
                mapaTnMovtosEmpPla.put("idRangoNom", plaza.getIdRangoNom());
                mapaTnMovtosEmpPla.put("idZonaDistNom", plaza.getIdZonaDistNom());
                mapaTnMovtosEmpPla.put("mepImporteHonorario", plaza.getPlazaImpHono());
                mapaTnMovtosEmpPla.put("mepUltimoMovto", plazaHonorarioMasivaDTO.getFechaBaja());
                mapaTnMovtosEmpPla.put("mepIniCont", plazaHonorarioMasivaDTO.getFechaBaja());
                mapaTnMovtosEmpPla.put("mepFinCont", plazaHonorarioMasivaDTO.getFechaBaja());
                mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
                mapaTnMovtosEmpPla.put("idTipoPlaza", plaza.getIdTipoPlaza());
                mapaTnMovtosEmpPla.put("idServPub", plaza.getIdServPub());
                mapaTnMovtosEmpPla.put("idInmueble", plaza.getIdInmueble());
                mapaTnMovtosEmpPla.put("mepObserva", plazaHonorarioMasivaDTO.getMepObserva());

                if (empleado != null) {
                    mapaTnMovtosEmpPla.put("mepImssIssste", empleado.getImssIssste());
                    mapaTnMovtosEmpPla.put("mepCurp", empleado.getCurpEmpleado());
                    mapaTnMovtosEmpPla.put("mepNombre", empleado.getNombreEmpleado());
                    mapaTnMovtosEmpPla.put("mepPrimerApellido", empleado.getPrimerApellido());
                    mapaTnMovtosEmpPla.put("mepSegundoApellido", empleado.getSegundoApellido());
                    mapaTnMovtosEmpPla.put("mepClabe", empleado.getClabeEmpleado());
                    mapaTnMovtosEmpPla.put("mepReferenciaOficio", TN_MOVTOS_EMP_PLA_MEP_REFERENCIA_OFICIO_BAJA);
                    mapaTnMovtosEmpPla.put("mepIngresoGobFed", empleado.getIngresoGobFed());
                    mapaTnMovtosEmpPla.put("mepIngresoDependencia", empleado.getIngresoDependencia());
                    mapaTnMovtosEmpPla.put("usuario", usuario);
                    mapaTnMovtosEmpPla.put("fecModifico", new Date());
                }

                    mapaTdPlaza = new HashMap<String, Object>();
                    mapaTdPlaza.put("idSitPlaza", "C");
                    mapaTdPlaza.put("plazaRfc", null);
                    mapaTdPlaza.put("idMovtoPersona", super.getMovimientoPersonal("BAJA_POR_TERMINO_DE_CONTRATO"));
                    mapaTdPlaza.put("plazaUltimoMovto", plazaHonorarioMasivaDTO.getFechaBaja());
                    mapaTdPlaza.put("plazaIniCont", plazaHonorarioMasivaDTO.getFechaBaja());
                    mapaTdPlaza.put("plazaQnaCaptura", quincenaCaptura);
                    mapaTdPlaza.put("usuario", usuario);
                    mapaTdPlaza.put("fecModifico", new Date());
                    mapaTdPlaza.put("idPlaza", plaza.getIdPlaza());
                    
                    // SE AGREGAN LOS REGISTROS DE tdPlaza y TnMovtosEmpPla a guardar y actualizar respectivamente
                    listaMapaTdPlaza.add(mapaTdPlaza);
                    listaMapaTnMovtosEmpPla.add(mapaTnMovtosEmpPla);
                    listaResultados.add(super.transformation().map(plaza, TdPlazaDTO.class));
                }
                
                // se envÌa a la base de datos
                 super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapaTnMovtosEmpPla, usuario);
                 super.persistence().get(CustomTdPlazaDAO.class).updateTdPlazaMasivaBajaHonorarios(listaMapaTdPlaza);
                
            // EXPORTA A EXCEL
             plazaHonorarioMasivaDTO.setListaResultados(listaResultados);
             String nameFileXls = plazaHonorarioMasivaDTO.getNombreArchivoResultados();
             String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
             String nombreArchivoPlantillaXls = super.configuration().getString("plazaMasiva.templates.dir") + 
                 File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.xls.exportXlsMasivos");
             XLSTransformer transformer = new XLSTransformer();
             Map beans = new HashMap();
             beans.put("exportXlsMasivosDTO", plazaHonorarioMasivaDTO);
           
                transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                         nombreArchivoXls);
            
            plazaHonorarioMasivaDTO.setNombreArchivoResultados(nameFileXls);

                
        } catch (ServiceException e) {
            throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateBaja] " + 
                                       e.toString(), e);
        } catch (ParseException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateBaja] " + 
                                        e.toString(), e);
        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateBaja] " + 
                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateBaja] " + 
                                        e.toString(), e);
        }

        return plazaHonorarioMasivaDTO;
    }

    private void validarEncabezadosCreacion(ParserXls parserXls, CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        boolean errorValidacionEncabezados = false;
        StringBuffer buffer = new StringBuffer(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.validacion.encabezados"));
        if (parserXls.getEncabezadoDTO().getA() == null || !parserXls.getEncabezadoDTO().getA().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.unidad"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.unidad"));
        }
        if (parserXls.getEncabezadoDTO().getB() == null || parserXls.getEncabezadoDTO().getB().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.puesto.homologado"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.pto.homolgado"));
        }
        if (parserXls.getEncabezadoDTO().getC() == null || parserXls.getEncabezadoDTO().getC().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.nivel"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.nivel"));
        }
        if (parserXls.getEncabezadoDTO().getD() == null || parserXls.getEncabezadoDTO().getD().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.inicio.vigencia"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.vigencia"));
        }
        if (parserXls.getEncabezadoDTO().getE() == null || parserXls.getEncabezadoDTO().getE().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.fin.vigencia"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.fin.vigencia"));
        }
        if (parserXls.getEncabezadoDTO().getF() == null || parserXls.getEncabezadoDTO().getF().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.tipo.servidor"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.tipo.serv.pub"));
        }
        if (parserXls.getEncabezadoDTO().getG().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.zona"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.zona"));
        }
        if (parserXls.getEncabezadoDTO().getH().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.entidad"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.entidad"));
        }
        if (parserXls.getEncabezadoDTO().getI().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.importe"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.importe"));
        }
        if (parserXls.getEncabezadoDTO().getJ() == null || !parserXls.getEncabezadoDTO().getJ().equals(super.configuration().getString("plazaMasivaEstructura", "jxls.templates.evaluacion.encabezado.inmueble"))) {
            errorValidacionEncabezados = true;
            buffer.append(super.configuration().getString("plazaMasivaEstructura", "validacion.datos.inmueble"));
        }
        if (errorValidacionEncabezados) {
            creacionPlazaMasivaDTO.setPlantillaErronea(true);
            creacionPlazaMasivaDTO.setMensaje(buffer.toString());
        }
    }


    public CreacionPlazaMasivaDTO validarPMFileCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        creacionPlazaMasivaDTO.setPlantillaErronea(false);
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        int anioInt =  (int) quincenaCaptura / 100;
        String usuario = super.identity().get().getUserID();
        String anio = new Integer(anioInt).toString();
        creacionPlazaMasivaDTO.setAnio(anio);
        boolean archivoValido = false;

        try {
            creacionPlazaMasivaDTO.setListaPlazaEstructuraCorrecta(new ArrayList<CreacionPlazaMasivaDTO>());
            creacionPlazaMasivaDTO.setListaPlazaEstructuraIncorrecta(new ArrayList<CreacionPlazaMasivaDTO>());
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.xml.plazaHonorariosMasiva");

            InputStream inputStreamXls = 
                creacionPlazaMasivaDTO.getFile().getInputStream();
            InputStream inputStreamXml = new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamXml);
            List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO = 
                parserXls.parseFile(inputStreamXls, 
                                    CreacionPlazaMasivaDTO.class);

            // Se validan los encabezados
            validarEncabezadosCreacion(parserXls, creacionPlazaMasivaDTO);
            if (creacionPlazaMasivaDTO.getPlantillaErronea()) {
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

            List<HashMap<String, Object>> listaMapasTnPlantillaPlazaEstructura = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTnPlantillaPlazaEstructura;
            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura: 
                 creacionPlazaMasivaDTO.getListaPlazaEstructuraCorrecta()) { // listCreacionPlazaMasivaDTO
                mapaTnPlantillaPlazaEstructura = new HashMap<String, Object>();
                mapaTnPlantillaPlazaEstructura.put("idPpeSec", null);
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloAnterior", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloAnterior());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionCicloActual", 
                                                   templateFileCreatePlazaEstructura.getAdecuacionCicloActual());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdUnidad", 
                                                   templateFileCreatePlazaEstructura.getUnidad());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPuesto", 
                                                   templateFileCreatePlazaEstructura.getCodigo());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdNivel", 
                                                   templateFileCreatePlazaEstructura.getNivel());
                mapaTnPlantillaPlazaEstructura.put("ppeInicioVigencia", 
                                                   templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeFinVigencia", 
                                                   templateFileCreatePlazaEstructura.getFinVigencia());
                mapaTnPlantillaPlazaEstructura.put("ppeTipoServPub", 
                                                   templateFileCreatePlazaEstructura.getTipoServidor());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdZona", 
                                                   templateFileCreatePlazaEstructura.getZona());
                mapaTnPlantillaPlazaEstructura.put("ppeAdecuacionIdPlaza", 
                                                   templateFileCreatePlazaEstructura.getPlaza());
                mapaTnPlantillaPlazaEstructura.put("ppeCasos", 
                                                   templateFileCreatePlazaEstructura.getCasos());
                mapaTnPlantillaPlazaEstructura.put("ppeEntidadFederativa", 
                                                   templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTnPlantillaPlazaEstructura.put("ppeImpHono", 
                                                   templateFileCreatePlazaEstructura.getImporte());
                mapaTnPlantillaPlazaEstructura.put("ppeInmueble", 
                                                   templateFileCreatePlazaEstructura.getIdInmueble());
                mapaTnPlantillaPlazaEstructura.put("usuario", 
                                                   usuario);
                mapaTnPlantillaPlazaEstructura.put("fecModifico", new Date());
                listaMapasTnPlantillaPlazaEstructura.add(mapaTnPlantillaPlazaEstructura);
            }

            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).saveTnPlantillaPlazaEstructura(listaMapasTnPlantillaPlazaEstructura, 
                                                                                                              usuario);

            Comparator<CustomTnPlantillaPlazaEstructura> comparatorPlaza = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdPlaza().compareTo(o2.getIdPlaza());
                        return regreso;
                    }
                };



            // Consulto las unidades inner join archivo
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

            // Consulto puesto inner join archivo
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
            
            
            // Consulto la zona inner join archivo                 
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaVsZonaCat = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsZonaCat(usuario);
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorZona = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdZona().compareTo(o2.getIdZona());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaVsZonaCat, 
                             comparatorZona);
                             
            // Consulto idServPub inner join archivo                 
            List<CustomTnPlantillaPlazaEstructura> listaTnPlantillaPlazaVsTipoServPub = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaVsTipoServPub(usuario);
            Comparator<CustomTnPlantillaPlazaEstructura> comparatorTipoServPub = 
                new Comparator<CustomTnPlantillaPlazaEstructura>() {

                    public int compare(CustomTnPlantillaPlazaEstructura o1, 
                                       CustomTnPlantillaPlazaEstructura o2) {
                        int regreso = 0;
                        regreso = o1.getIdServPub().compareTo(o2.getIdServPub());
                        return regreso;
                    }

                };
            Collections.sort(listaTnPlantillaPlazaVsTipoServPub, comparatorTipoServPub);                             

            List<CustomTnPlantillaPlazaEstructura> listafindByTnPlantillaPlazaEstructura = 
                super.persistence().get(QueryTnPlantillaPlazaEstructuraDAO.class).findByTnPlantillaPlazaEstructura(usuario);

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



                //ValidaciÛn Vs Unidad
                pos = 
    Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsUnidad,
                         customTnPlantillaPlazaEstructura, comparatorUnidad);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.unidad.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }


                //ValidaciÛn Vs Puesto
                pos = 
    Collections.binarySearch(listaTnPlantillaPlazaEstructuraVsPuesto,
                         customTnPlantillaPlazaEstructura, comparatorPuesto);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.puesto.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }
                


                //ValidaciÛn  Vs Zona
                pos = 
    Collections.binarySearch(listaTnPlantillaPlazaVsZonaCat,
                         customTnPlantillaPlazaEstructura, comparatorZona);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.zona.economica.erronea"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                if (errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
                }


                //ValidaciÛn  Vs Servidor Publico
                pos = Collections.binarySearch(listaTnPlantillaPlazaVsTipoServPub, customTnPlantillaPlazaEstructura, comparatorTipoServPub);
                if (pos < 0) {
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "carga.plaza.masiva.estructura.creacion.mensaje.tipo.servidor.publico.no.valida"));
                    errorValidacion = true;
                    archivoValido = false;
                }

                if (errorValidacion) {
                    customTnPlantillaPlazaEstructura.setMensaje(buffer.toString());
                    archivoValido = archivoValido && errorValidacion;
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
            // if (!archivoValido) {
            for (CustomTnPlantillaPlazaEstructura customTnPlantillaPlazaEstructura: 
                 listafindByTnPlantillaPlazaEstructura) {
                CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVO = 
                    new CreacionPlazaMasivaDTO();
                creacionPlazaMasivaDTOVO.setUnidad(customTnPlantillaPlazaEstructura.getIdUnidad());
                creacionPlazaMasivaDTOVO.setCodigo(customTnPlantillaPlazaEstructura.getIdPuesto());
                creacionPlazaMasivaDTOVO.setNivel(customTnPlantillaPlazaEstructura.getIdNivel());
                creacionPlazaMasivaDTOVO.setInicioVigencia(customTnPlantillaPlazaEstructura.getPpeInicioVigencia());
                creacionPlazaMasivaDTOVO.setFinVigencia(customTnPlantillaPlazaEstructura.getPpeFinVigencia());
                creacionPlazaMasivaDTOVO.setTipoServidor(customTnPlantillaPlazaEstructura.getIdServPub());
                creacionPlazaMasivaDTOVO.setZona(customTnPlantillaPlazaEstructura.getIdZona());
                creacionPlazaMasivaDTOVO.setEntidadFederativa(customTnPlantillaPlazaEstructura.getPpeEntidadFederativa());
                creacionPlazaMasivaDTOVO.setImporte(customTnPlantillaPlazaEstructura.getPpeImpHono() );
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
                                                "jxls.templates.xls.plazaHonorariosMasiva");
            
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("creacionPlazaMasivaDTO", creacionPlazaMasivaDTO);
            creacionPlazaMasivaDTO.setNombreArchivoErrores(nameFileXls);

                transformer.transformXLS(nombreArchivoPlantillaXls, beans, 
                                         nombreArchivoXls);

        } catch (FileNotFoundException e) {
            throw new ServiceException("Exception in PlazaHonorarioMasivaBS [processPMFilePlazaEstructuraMasiva] " + e.toString(), e);
        } catch (InvalidFormatException e) {
            throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [processPMFilePlazaEstructuraMasiva] " + e.toString(), e);
        } catch (IOException e) {
            throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [processPMFilePlazaEstructuraMasiva] " + e.toString(), e);
        } catch (ServiceException e) {
            throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [processPMFilePlazaEstructuraMasiva] " + e.toString(), e);
        } finally {
            super.persistence().get(CustomTnPlantillaPlazaEstructuraDAO.class).deleteTnPlantillaPlazaEstructura(usuario);
        }
        return creacionPlazaMasivaDTO;
    }
    
    public CreacionPlazaMasivaDTO processPMPValidaDatosPlantilla(List<CreacionPlazaMasivaDTO> listCreacionPlazaMasivaDTO, 
                                                                 CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        List<CreacionPlazaMasivaDTO> listaPlazaEstructuraIncorrecta = 
            new ArrayList<CreacionPlazaMasivaDTO>();
        List<CreacionPlazaMasivaDTO> listaPlazaEstructuraCorrecta = 
            new ArrayList<CreacionPlazaMasivaDTO>();
        try {
            Pattern pat = null;
            Matcher mat = null;
            Calendar f = Calendar.getInstance();
            
            Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
            int anio =  (int) quincenaCaptura / 100;
            Boolean errorValidacionDatos = false;
            for (CreacionPlazaMasivaDTO creacionPlazaMasivaDTOVo: 
                 listCreacionPlazaMasivaDTO) {
                errorValidacionDatos = false;
                StringBuffer buffer = 
                    new StringBuffer(super.configuration().getString("plazaMasivaEstructura", 
                                                                     "validacion.datos.validacion.datos"));

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
                
                if (creacionPlazaMasivaDTOVo.getFinVigencia() == null) {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.vigencia"));
                    listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                }

                if (creacionPlazaMasivaDTOVo.getFinVigencia() != null) {
                    f.setTime(creacionPlazaMasivaDTOVo.getFinVigencia());
                    if (f.get(Calendar.YEAR) != anio) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.vigencia"));
                        listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                    }
                }

                // validacion tipo servidor publico
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_TIPO_SERV_PUB);
                if (creacionPlazaMasivaDTOVo.getTipoServidor() != null) {
                    mat = pat.matcher(creacionPlazaMasivaDTOVo.getTipoServidor());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.tipo.serv.pub"));
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.tipo.serv.pub"));
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
                
                // ValidaciÛn importe
                pat = Pattern.compile(EXPRESION_REGULAR_VALIDACION_PLAZA_IMP_HONO);
                if (creacionPlazaMasivaDTOVo.getImporte() != null) {
                    mat = 
                pat.matcher(creacionPlazaMasivaDTOVo.getImporte().toString());
                    if (mat != null && !mat.matches()) {
                        errorValidacionDatos = true;
                        buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                      "validacion.datos.importe"));
                        listaPlazaEstructuraIncorrecta.add(creacionPlazaMasivaDTOVo);
                    }
                } else {
                    errorValidacionDatos = true;
                    buffer.append(super.configuration().getString("plazaMasivaEstructura", 
                                                                  "validacion.datos.importe"));
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

        } catch (Exception e) {
            throw new ServiceException("Exception in PlazaHonorarioMasivaBS [processPMFilePlazaEstructuraMasiva] " + 
                                       e.toString(), e);
        }
        return creacionPlazaMasivaDTO;
    }

    public CreacionPlazaMasivaDTO updateNMCreacion(CreacionPlazaMasivaDTO creacionPlazaMasivaDTO) {
        String nombreArchivoXls = null;
        try {
            String usuario = super.identity().get().getUserID();
            Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
            int anioInt =  (int) quincenaCaptura / 100;
            
            String anio = new Integer(anioInt).toString();
            creacionPlazaMasivaDTO.setAnio(anio);
            String templateFileXml = 
                super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + 
                super.configuration().getString("plazaMasivaEstructura", 
                                                "jxls.templates.xml.plazaHonorariosMasiva");
            nombreArchivoXls = 
                    super.configuration().getString("local.temp.dir") + 
                    File.separator + 
                    creacionPlazaMasivaDTO.getNombreArchivoErrores();
            InputStream inputStreamArchivoXls = 
                new FileInputStream(nombreArchivoXls);
            InputStream inputStreamArchivoXml = 
                new FileInputStream(templateFileXml);
            ParserXls parserXls = new ParserXls(inputStreamArchivoXml);
            List<CreacionPlazaMasivaDTO> listTemplateFileCreatePlazaEstructura = parserXls.parseFile(inputStreamArchivoXls, 
                                    CreacionPlazaMasivaDTO.class);
            creacionPlazaMasivaDTO.setListaErrores(listTemplateFileCreatePlazaEstructura);

            Formatter fmt = new Formatter();

            List<HashMap<String, Object>> listaMapasTdPlaza = 
                new ArrayList<HashMap<String, Object>>();
            List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = 
                new ArrayList<HashMap<String, Object>>();
            HashMap<String, Object> mapaTdPlaza;
            HashMap<String, Object> mapaTnMovtosEmpPla;

            List<TdPlaza> plazas = super.persistence().get(QueryTdPlazaDAO.class).getMaxIdPlazaHonorarios();
            Integer idPlaza = null;
            if(plazas != null && !plazas.isEmpty() ){
                idPlaza = plazas.get(0).getIdPlaza();
            }

            for (CreacionPlazaMasivaDTO templateFileCreatePlazaEstructura : listTemplateFileCreatePlazaEstructura) {
                fmt = new Formatter();
//                adecuacionActual = 
//                        fmt.format("%04d", new Integer(templateFileCreatePlazaEstructura.getAdecuacionCicloActual())).toString();
                mapaTdPlaza = new HashMap<String, Object>();
                mapaTdPlaza.put("idPlaza", idPlaza);
                mapaTdPlaza.put("idSitPlaza", TD_PLAZA_ID_SIT_PLAZA_CONGELADA);  
                mapaTdPlaza.put("plazaRfc", null);
                mapaTdPlaza.put("plazaCiclo", anioInt);
                mapaTdPlaza.put("plazaRespaldo", TD_PLAZA_PLAZA_RESPALDO);
                mapaTdPlaza.put("idGrupoPago", TD_PLAZA_ID_GRUPO_PAGO);
                mapaTdPlaza.put("idUnidadPre", templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlaza.put("idPuestoPre", templateFileCreatePlazaEstructura.getCodigo());
                mapaTdPlaza.put("idEdoPre", templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlaza.put("idZonaEconPre", templateFileCreatePlazaEstructura.getZona());
                mapaTdPlaza.put("idRangoPre", TD_PLAZA_ID_RANGO_PRE);
                mapaTdPlaza.put("idProyReducePre", CREACION_PLAF_PROY_REDUCE_EVENTUAL);
                mapaTdPlaza.put("idProyAmpliaPre", CREACION_PREFIX_PLAF_PROY_AMPLIA_EVENTUAL);
                mapaTdPlaza.put("idUnidadNom", templateFileCreatePlazaEstructura.getUnidad());
                mapaTdPlaza.put("idPuestoNom", TD_PLAZA_ID_PUESTO_NOM);
                mapaTdPlaza.put("idEdoNom", templateFileCreatePlazaEstructura.getEntidadFederativa());
                mapaTdPlaza.put("idMuniNom", TD_PLAZA_ID_MUNI_NOM);
                mapaTdPlaza.put("idZonEcoNom", templateFileCreatePlazaEstructura.getZona());
                mapaTdPlaza.put("idRangoNom", TD_PLAZA_ID_RANGO_NOM);
                mapaTdPlaza.put("idZonaDistNom", TD_PLAZA_ID_ZONA_DIST_NOM);
                mapaTdPlaza.put("importeHonorario", templateFileCreatePlazaEstructura.getImporte());
                mapaTdPlaza.put("idMovtoPersona", TD_PLAZA_ID_MOVTO_PERSONA);
                mapaTdPlaza.put("plazaUltimoMovto", templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlaza.put("plazaIniCont", templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTdPlaza.put("plazaFinCont", templateFileCreatePlazaEstructura.getFinVigencia() );
                mapaTdPlaza.put("plazaIniLic", null);
                mapaTdPlaza.put("plazaFinLic", null);
                mapaTdPlaza.put("plazaReferencia", TD_PLAZA_PLAZA_REFERENCIA);
                mapaTdPlaza.put("plazaQnaCaptura", super.getQuincenaCaptura().intValue());
                mapaTdPlaza.put("idTipoPlaza", TD_PLAZA_ID_TIPO_PLAZA_EVENTUAL);
                mapaTdPlaza.put("idServPub", templateFileCreatePlazaEstructura.getTipoServidor());
                mapaTdPlaza.put("idPtoEstrategico", TD_PLAZA_ID_PTO_ESTRATEGICO);
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
                mapaTnMovtosEmpPla.put("idMovtoPersona", TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA);
                mapaTnMovtosEmpPla.put("idPlaza", idPlaza++);
                mapaTnMovtosEmpPla.put("idSituacionPlaza", 
                                       TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA_CONGELADA);
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
                                       TN_MOVTOS_EMP_PLA_ID_PUESTO_NOM);
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
                                       TD_PLAZA_ID_ZONA_DIST_NOM);
                mapaTnMovtosEmpPla.put("mepImporteHonorario", 
                                       templateFileCreatePlazaEstructura.getImporte() );
                mapaTnMovtosEmpPla.put("mepUltimoMovto", 
                                       templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnMovtosEmpPla.put("mepIniCont", 
                                       templateFileCreatePlazaEstructura.getInicioVigencia());
                mapaTnMovtosEmpPla.put("mepFinCont", templateFileCreatePlazaEstructura.getFinVigencia()); // Formato Corto dd/mm/ YY
                mapaTnMovtosEmpPla.put("mepIniLic", null);
                mapaTnMovtosEmpPla.put("mepFinLic", null);
                mapaTnMovtosEmpPla.put("mepQnaCaptura", 
                                       super.getQuincenaCaptura().intValue());
                mapaTnMovtosEmpPla.put("idTipoPlaza", TD_PLAZA_ID_TIPO_PLAZA_EVENTUAL);
                mapaTnMovtosEmpPla.put("idServPub", templateFileCreatePlazaEstructura.getTipoServidor());
                mapaTnMovtosEmpPla.put("idPtoEstrategico", TD_PLAZA_ID_PTO_ESTRATEGICO);
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
                mapaTnMovtosEmpPla.put("mepObserva", creacionPlazaMasivaDTO.getMepObserva());
                mapaTnMovtosEmpPla.put("mepObservaInternas", null);
                mapaTnMovtosEmpPla.put("mepQnaCancela", null);
                mapaTnMovtosEmpPla.put("mepUsrCancela", null);
                mapaTnMovtosEmpPla.put("mepFechaCancela", null);
                mapaTnMovtosEmpPla.put("usuario", usuario);
                mapaTnMovtosEmpPla.put("fecModifico", new Date());
                listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);
            }

            super.persistence().get(CustomTdPlazaDAO.class).saveTdPlaza(listaMapasTdPlaza, usuario);
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, usuario);

        } catch (FileNotFoundException e) {
            throw new ServiceException("Exception in PlazaHonorarioMasivaBS [updatePMPlazaEstructuraMasiva] " + e.toString(), e);
        } catch (ServiceException e) {
            throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updatePMPlazaEstructuraMasiva] " + e.toString(), e);
        } finally {
            if (nombreArchivoXls != null) {
                File archivoXls = new File(nombreArchivoXls);
                archivoXls.delete();
            }

        }
        return creacionPlazaMasivaDTO;
    }

    public void processAlta(AltaMasivaDTO altaMasivaDTO) {
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        int anio = (int) quincenaCaptura / 100;
        altaMasivaDTO.setAnio(anio);
        altaMasivaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        altaMasivaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        altaMasivaDTO.setDiasRetroactividad(super.configuration().getNumber("movimientosMasivos", "DIAS_RETROACTIVIDAD").intValue());
    }

    public AltaMasivaDTO updateNMAlta(AltaMasivaDTO altaMasivaDTO) {
        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        int anio = (int) quincenaCaptura / 100;
        altaMasivaDTO.setAnio(anio);
        altaMasivaDTO.setInicioQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'I'));
        altaMasivaDTO.setFinQuincenaCaptura(SirehUtils.getQuincenaCapturaAsDate(quincenaCaptura, 'F'));
        Integer startPlazaEventual = 60000;
        
        String usuario = super.security().getUserName();
        
        Calendar calPlazaAnterior = Calendar.getInstance();
        Calendar calPlaza = Calendar.getInstance();
        
        
        // Obtiene la m·xima plaza de honorarios
        List<TdPlaza> listaMaxPlazaHonorarios = super.persistence().get(QueryTdPlazaDAO.class).getMaxIdPlazaHonorarios();
        HashMap<String, Object> mapaTnMovtosEmpPla;
        HashMap<String, Object> mapaTdPlaza;
        List<HashMap<String, Object>> listaMapasTnMovtosEmpPla = new ArrayList<HashMap<String, Object>>();
        List<HashMap<String, Object>> listaMapasTdPlaza = new ArrayList<HashMap<String, Object>>();
        List<HashMap<String, Object>> listaMapasTdPlazaUpdate = new ArrayList<HashMap<String, Object>>();
        
        List<TdPlazaDTO> listaResultados = altaMasivaDTO.getListaResultados();
        if(listaMaxPlazaHonorarios != null && !listaMaxPlazaHonorarios.isEmpty()){
            TdPlaza maxPlazaHonorarios = listaMaxPlazaHonorarios.get(0);

            TdPlaza plazaMaximaCompleta = super.persistence().get(TdPlazaDAO.class).getById(maxPlazaHonorarios.getIdPlaza() - 1);

            calPlaza.setTime(plazaMaximaCompleta.getPlazaFinCont());
            Integer secuenciaPlaza = null;
            if (anio == (int)calPlaza.get(Calendar.YEAR)) {
                secuenciaPlaza = plazaMaximaCompleta.getIdPlaza() + 1;
                // La plaza m·xima eventual fue dado de alta este aÒo
            } else {
                // La plaza m·xima fue el aÒo pasado, es una plaza nueva
                if ((int)(plazaMaximaCompleta.getIdPlaza() / 1000) == 69) {

                    secuenciaPlaza = startPlazaEventual;

                } else {
                    secuenciaPlaza = 
                            (((int)(plazaMaximaCompleta.getIdPlaza() / 1000)) + 1) * 1000;
                }
            }
            
            List<String> listaIdUnidadNom = altaMasivaDTO.getIdUnidadNomFilter() != null && !altaMasivaDTO.getIdUnidadNomFilter().isEmpty()
                            ? altaMasivaDTO.getIdUnidadNomFilter() : getUnidadesDimension();
            List<TnMovtosEmpPla> listaTnMovtosEmpPlaAProcesar = null;
            // Lista con un elemento con plaza con id = 0 para cuando no existen excluidas el query ignore esta condicion
            List<String> listaDummy = new ArrayList<String>() ;
            listaDummy.add("0");


            // Obtengo los TnMovtosEmpla que vienen el en grid
             if(listaIdUnidadNom != null && !listaIdUnidadNom.isEmpty()){
            listaTnMovtosEmpPlaAProcesar = super.persistence().get(CustomTnMovtosEmpPlaDAO.class).findBajasPlazasByUnidadFinContQna("H", altaMasivaDTO.getUsuario(), altaMasivaDTO.getQnaCaptura() , altaMasivaDTO.getPlazaFinContStringHidden(), listaIdUnidadNom, altaMasivaDTO.getIdPlaza() != null && altaMasivaDTO.getIdPlaza().length > 0 ? Arrays.asList(altaMasivaDTO.getIdPlaza()) : listaDummy);
             }
                 
                 // Obtengo lista de plazas que vienen en el grid menos las excluidas
                 List<Long> listaIdMovtosEmpPla = getListaIdMovtosEmpPla(listaTnMovtosEmpPlaAProcesar);
                 
            
                // Validaciones
                List<TnMovtosEmpPla>  listFindValidaAltaEventualMasivoVsUnidad = super.persistence().get(CustomTnMovtosEmpPlaDAO.class).findValidaAltaEventualMasivoVsUnidad(listaIdMovtosEmpPla);
                List<TnMovtosEmpPla>  listFindValidaAltaEventualMasivoVsPuesto = super.persistence().get(CustomTnMovtosEmpPlaDAO.class).findValidaAltaEventualMasivoVsPuesto(listaIdMovtosEmpPla );
                List<TnMovtosEmpPla>  listFindValidaAltaEventualMasivoVsZonaEconomica = super.persistence().get(CustomTnMovtosEmpPlaDAO.class).findValidaAltaEventualMasivoVsZonaEconomica(listaIdMovtosEmpPla );
                List<TnMovtosEmpPla>  listFindValidaAltaEventualMasivoVsEstado = super.persistence().get(CustomTnMovtosEmpPlaDAO.class).findValidaAltaEventualMasivoVsEstado(listaIdMovtosEmpPla);


            StringBuffer mensajeValidaciones = new StringBuffer();
            if(listFindValidaAltaEventualMasivoVsUnidad != null && !listFindValidaAltaEventualMasivoVsUnidad.isEmpty()){
                for(TnMovtosEmpPla element : listFindValidaAltaEventualMasivoVsUnidad ){
                    mensajeValidaciones.append("\rLa plaza " + element.getIdPlaza() + " tiene una unidad no v·lida " + element.getIdUnidadNom() + ". " ) ;
                }
            }
            if(listFindValidaAltaEventualMasivoVsPuesto != null && !listFindValidaAltaEventualMasivoVsPuesto.isEmpty() ){
                for(TnMovtosEmpPla element : listFindValidaAltaEventualMasivoVsPuesto){
                    mensajeValidaciones.append("\rLa plaza " + element.getIdPlaza() + " tiene un puesto no v·lido " + element.getIdPuestoNom() + ". ") ;
                }
            }
            
            if(listFindValidaAltaEventualMasivoVsZonaEconomica != null && !listFindValidaAltaEventualMasivoVsZonaEconomica.isEmpty()){
                for(TnMovtosEmpPla element : listFindValidaAltaEventualMasivoVsZonaEconomica){
                    mensajeValidaciones.append("\rLa plaza " + element.getIdPlaza() + " tiene una zona econÛmica no v·lida " + element.getIdZonaEcoNom() + ". " ) ;
                }
            }
            
            if(listFindValidaAltaEventualMasivoVsEstado != null && !listFindValidaAltaEventualMasivoVsEstado.isEmpty()){
                for(TnMovtosEmpPla element : listFindValidaAltaEventualMasivoVsEstado ){
                    mensajeValidaciones.append("\rLa plaza " + element.getIdPlaza() + " tiene una estado no v·lido" + ". " ) ;
                }
            }
            
            if(mensajeValidaciones.length() > 0){
                throw new ServiceException(mensajeValidaciones.toString() );
            }

                 
            TdPlazaDTO tdPlazaDTO = null;
                // Define si la plaza fue dada de baja el anio anterior
                boolean isPlazaAnioAnterior;
                for(TnMovtosEmpPla tnMovtosEmpPla : listaTnMovtosEmpPlaAProcesar){
                    isPlazaAnioAnterior = false;

                    

                        TdEmpleado tdEmpleadoConsulta = this.persistence().get(TdEmpleadoDAO.class).getById( tnMovtosEmpPla.getMepRfc() );
                        
                        if(tnMovtosEmpPla.getMepFinCont() != null){
                            calPlazaAnterior.setTime(tnMovtosEmpPla.getMepFinCont());
                            if( (int)calPlazaAnterior.get(Calendar.YEAR) < anio){
                                isPlazaAnioAnterior = true;
                            }
                        }
                        
                        mapaTdPlaza = new HashMap<String, Object>();
                        mapaTdPlaza.put("idPlaza", isPlazaAnioAnterior ? secuenciaPlaza  : tnMovtosEmpPla.getIdPlaza());
                        mapaTdPlaza.put("idSitPlaza", TD_PLAZA_ID_SIT_PLAZA_OCUPADA);  
                        mapaTdPlaza.put("plazaRfc", tdEmpleadoConsulta.getRfcEmpleado());
                        mapaTdPlaza.put("plazaCiclo", anio);
                        mapaTdPlaza.put("plazaRespaldo", TD_PLAZA_PLAZA_RESPALDO);
                        mapaTdPlaza.put("idGrupoPago", TD_PLAZA_ID_GRUPO_PAGO);
                        mapaTdPlaza.put("idUnidadPre", tnMovtosEmpPla.getIdUnidadPre());
                        mapaTdPlaza.put("idPuestoPre", tnMovtosEmpPla.getIdPuestoPre());
                        mapaTdPlaza.put("idEdoPre", tnMovtosEmpPla.getIdEdoPre());
                        mapaTdPlaza.put("idZonaEconPre", tnMovtosEmpPla.getIdZonaEcoPre());
                        mapaTdPlaza.put("idRangoPre", TD_PLAZA_ID_RANGO_PRE);
                        mapaTdPlaza.put("idProyReducePre", CREACION_PLAF_PROY_REDUCE_EVENTUAL);
                        mapaTdPlaza.put("idProyAmpliaPre", CREACION_PREFIX_PLAF_PROY_AMPLIA_EVENTUAL);
                        mapaTdPlaza.put("idUnidadNom", tnMovtosEmpPla.getIdUnidadNom());
                        mapaTdPlaza.put("idPuestoNom", tnMovtosEmpPla.getIdPuestoNom());
                        mapaTdPlaza.put("idEdoNom", tnMovtosEmpPla.getIdEdoNom());
                        mapaTdPlaza.put("idMuniNom", tnMovtosEmpPla.getIdMuniNom());
                        mapaTdPlaza.put("idZonEcoNom",tnMovtosEmpPla.getIdZonaEcoNom());
                        mapaTdPlaza.put("idRangoNom", TD_PLAZA_ID_RANGO_NOM);
                        mapaTdPlaza.put("idZonaDistNom", TD_PLAZA_ID_ZONA_DIST_NOM);
                        
                        mapaTdPlaza.put("importeHonorario", tnMovtosEmpPla.getMepImporteHonorario());
                        mapaTdPlaza.put("idMovtoPersona", TD_PLAZA_ID_MOVTO_PERSONA_ALTA);
                        mapaTdPlaza.put("plazaUltimoMovto", altaMasivaDTO.getFechaInicioVigencia());
                        mapaTdPlaza.put("plazaIniCont", altaMasivaDTO.getFechaInicioVigencia());
                        mapaTdPlaza.put("plazaFinCont", altaMasivaDTO.getFechaTerminoVigencia() );
                        mapaTdPlaza.put("plazaIniLic", null);
                        mapaTdPlaza.put("plazaFinLic", null);
                        mapaTdPlaza.put("plazaReferencia", TD_PLAZA_PLAZA_REFERENCIA);
                        mapaTdPlaza.put("plazaQnaCaptura",quincenaCaptura);
                        mapaTdPlaza.put("idTipoPlaza", TD_PLAZA_ID_TIPO_PLAZA_EVENTUAL);
                        mapaTdPlaza.put("idServPub", tnMovtosEmpPla.getIdServPub());
                        mapaTdPlaza.put("idPtoEstrategico", TD_PLAZA_ID_PTO_ESTRATEGICO);
                        mapaTdPlaza.put("idNodo", TD_PLAZA_ID_NODO);
                        mapaTdPlaza.put("idInmueble", tnMovtosEmpPla.getIdInmueble());
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
                        if(isPlazaAnioAnterior){
                            listaMapasTdPlaza.add(mapaTdPlaza);
                        }else{
                            listaMapasTdPlazaUpdate.add(mapaTdPlaza);
                        }

                // Datos a enviar al archivo de excel
                tdPlazaDTO = new TdPlazaDTO();
                tdPlazaDTO.setIdPlaza(isPlazaAnioAnterior ? secuenciaPlaza : tnMovtosEmpPla.getIdPlaza());
                tdPlazaDTO.setIdPuestoNom(tnMovtosEmpPla.getIdPuestoNom());
                tdPlazaDTO.setIdZonaEcoNom(tnMovtosEmpPla.getIdZonaEcoNom());
                tdPlazaDTO.setIdUnidadNom(tnMovtosEmpPla.getIdUnidadNom());
                tdPlazaDTO.setIdSitPlaza(TD_PLAZA_ID_SIT_PLAZA_OCUPADA);
                tdPlazaDTO.setPlazaIniCont(altaMasivaDTO.getFechaInicioVigencia());
                tdPlazaDTO.setPlazaFinCont(altaMasivaDTO.getFechaTerminoVigencia());
                listaResultados.add(tdPlazaDTO);


                mapaTnMovtosEmpPla = new HashMap<String, Object>();
                        mapaTnMovtosEmpPla.put("idMovtosEmpPla", null);
                        mapaTnMovtosEmpPla.put("idMovtoPersona", TN_MOVTOS_EMP_PLA_ID_MOVTOS_EMP_PLA_ALTA);
                        mapaTnMovtosEmpPla.put("idPlaza", isPlazaAnioAnterior ? secuenciaPlaza  : tnMovtosEmpPla.getIdPlaza());
                        mapaTnMovtosEmpPla.put("idSituacionPlaza", 
                                               TN_MOVTOS_EMP_PLA_ID_SITUACION_PLAZA_OCUPADA);
                        mapaTnMovtosEmpPla.put("mepRfc", tdEmpleadoConsulta.getRfcEmpleado() );
                        mapaTnMovtosEmpPla.put("mepPlazaRespaldo", null);
                        mapaTnMovtosEmpPla.put("idGrupoPago", 
                                               tnMovtosEmpPla.getIdGrupoPago() );
                        mapaTnMovtosEmpPla.put("idUnidadPre", tnMovtosEmpPla.getIdUnidadPre());
                                               
                        mapaTnMovtosEmpPla.put("idPuestoPre", 
                                               tnMovtosEmpPla.getIdPuestoPre());
                        mapaTnMovtosEmpPla.put("idEdoPre", 
                                               tnMovtosEmpPla.getIdEdoPre());
                        mapaTnMovtosEmpPla.put("idZonaEcoPre", 
                                               tnMovtosEmpPla.getIdZonaEcoPre());
                        mapaTnMovtosEmpPla.put("idRangoPre", 
                                               tnMovtosEmpPla.getIdRangoPre());
                        mapaTnMovtosEmpPla.put("idUnidadNom", 
                                               tnMovtosEmpPla.getIdUnidadNom());
                        mapaTnMovtosEmpPla.put("idPuestoNom", 
                                               tnMovtosEmpPla.getIdPuestoNom());
                        
                        if (tnMovtosEmpPla.getIdPuestoNom() != null) {     
                            TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(tnMovtosEmpPla.getIdPuestoNom());
                            mapaTnMovtosEmpPla.put("idNivelPtoNom", tcAtributoPuesto.getIdNivelPto());
                            mapaTnMovtosEmpPla.put("idNombramientoNom", tcAtributoPuesto.getIdNombramiento());
                            mapaTnMovtosEmpPla.put("idJerarquiaNom", tcAtributoPuesto.getIdJerarquia());
                        }

                        mapaTnMovtosEmpPla.put("idEdoNom", 
                                               tnMovtosEmpPla.getIdEdoNom() );
                        mapaTnMovtosEmpPla.put("idMuniNom", 
                                               tnMovtosEmpPla.getIdMuniNom() );
                        mapaTnMovtosEmpPla.put("idZonaEcoNom", 
                                               tnMovtosEmpPla.getIdZonaEcoNom()  );
                        mapaTnMovtosEmpPla.put("idRangoNom", 
                                               TN_MOVTOS_EMP_PLA_ID_RANGO_NOM);
                        mapaTnMovtosEmpPla.put("idZonaDistNom", 
                                               TD_PLAZA_ID_ZONA_DIST_NOM);
                        mapaTnMovtosEmpPla.put("mepImporteHonorario", 
                                               tnMovtosEmpPla.getMepImporteHonorario());
                        mapaTnMovtosEmpPla.put("mepUltimoMovto", 
                                               altaMasivaDTO.getFechaInicioVigencia());
                        mapaTnMovtosEmpPla.put("mepIniCont", 
                                               altaMasivaDTO.getFechaInicioVigencia() );
                        mapaTnMovtosEmpPla.put("mepFinCont", altaMasivaDTO.getFechaTerminoVigencia() ); // Formato Corto dd/mm/ YY
                        mapaTnMovtosEmpPla.put("mepIniLic", null);
                        mapaTnMovtosEmpPla.put("mepFinLic", null);
                        mapaTnMovtosEmpPla.put("mepQnaCaptura", quincenaCaptura);
                        mapaTnMovtosEmpPla.put("idTipoPlaza", tnMovtosEmpPla.getIdTipoPlaza());
                        mapaTnMovtosEmpPla.put("idServPub", tnMovtosEmpPla.getIdServPub());
                        mapaTnMovtosEmpPla.put("idPtoEstrategico", null);
                        mapaTnMovtosEmpPla.put("idInmueble", tnMovtosEmpPla.getIdInmueble());
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
                        mapaTnMovtosEmpPla.put("mepImssIssste", tdEmpleadoConsulta.getImssIssste());
                        mapaTnMovtosEmpPla.put("mepSistemaReparto", null);
                        mapaTnMovtosEmpPla.put("mepCurp", tdEmpleadoConsulta.getCurpEmpleado());
                        mapaTnMovtosEmpPla.put("mepNombre", tdEmpleadoConsulta.getNombreEmpleado());
                        mapaTnMovtosEmpPla.put("mepPrimerApellido", tdEmpleadoConsulta.getPrimerApellido());
                        mapaTnMovtosEmpPla.put("mepSegundoApellido", tdEmpleadoConsulta.getSegundoApellido());
                        mapaTnMovtosEmpPla.put("mepFecNacimiento", null);
                        mapaTnMovtosEmpPla.put("mepClabe", tdEmpleadoConsulta.getClabeEmpleado());
                        mapaTnMovtosEmpPla.put("mepReferenciaOficio", TN_MOVTOS_EMP_PLA_MEP_REFERENCIA_OFICIO_ALTA);
                        mapaTnMovtosEmpPla.put("mepIngresoGobFed", tdEmpleadoConsulta.getIngresoGobFed());
                        mapaTnMovtosEmpPla.put("mepIngresoDependencia", tdEmpleadoConsulta.getIngresoDependencia());
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
                        mapaTnMovtosEmpPla.put("mepObserva", altaMasivaDTO.getMepObserva());
                        mapaTnMovtosEmpPla.put("mepObservaInternas", null);
                        mapaTnMovtosEmpPla.put("mepQnaCancela", null);
                        mapaTnMovtosEmpPla.put("mepUsrCancela", null);
                        mapaTnMovtosEmpPla.put("mepFechaCancela", null);
                        mapaTnMovtosEmpPla.put("usuario", usuario);
                        mapaTnMovtosEmpPla.put("fecModifico", new Date());
                        listaMapasTnMovtosEmpPla.add(mapaTnMovtosEmpPla);


                    // Se actualiza el empleado con la nueva plaza
                    
                    tdEmpleadoConsulta.setIdPlazaVigente(isPlazaAnioAnterior ? secuenciaPlaza++  : tnMovtosEmpPla.getIdPlaza());
                    tdEmpleadoConsulta.setIdUltimoMovto(TD_PLAZA_ID_MOVTO_PERSONA_ALTA);
                    tdEmpleadoConsulta.setFecUltimoMovto(altaMasivaDTO.getFechaInicioVigencia());
                    tdEmpleadoConsulta.setEmpQnaCaptura(quincenaCaptura);
                    tdEmpleadoConsulta.setUsuario(usuario);
                    tdEmpleadoConsulta.setFecUltimoMovto(new Date());
                    
                    if (isPlazaAnioAnterior) {
                        TdPlaza plazaDelete = new TdPlaza();
                        plazaDelete.setIdPlaza(Integer.valueOf(tnMovtosEmpPla.getIdPlaza()));
                        super.persistence().get(TdPlazaDAO.class).delete(plazaDelete);
                    }
                    super.persistence().get(TdEmpleadoDAO.class).save(tdEmpleadoConsulta);
                }
            if (listaMapasTdPlaza.size() > 0) {
                super.persistence().get(CustomTdPlazaDAO.class).saveTdPlaza(listaMapasTdPlaza, usuario);
            }
            if (listaMapasTdPlazaUpdate.size() > 0) {
                super.persistence().get(CustomTdPlazaDAO.class).updateTdPlazaCompleta(listaMapasTdPlazaUpdate, usuario);
            }
            super.persistence().get(CustomTnMovtosEmpPlaDAO.class).saveTnMovtosEmpPla(listaMapasTnMovtosEmpPla, usuario);
            
        }
        
        // EXPORTA A EXCEL
         altaMasivaDTO.setListaResultados(listaResultados);
         String nameFileXls = altaMasivaDTO.getNombreArchivoResultados();
         String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
         String nombreArchivoPlantillaXls = super.configuration().getString("plazaMasiva.templates.dir") + 
             File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.xls.exportXlsMasivos");
         XLSTransformer transformer = new XLSTransformer();
         Map beans = new HashMap();
         beans.put("exportXlsMasivosDTO", altaMasivaDTO);


        try {
            transformer.transformXLS(nombreArchivoPlantillaXls, beans,
                                     nombreArchivoXls);
        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateAlta] " + 
                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaHonorarioMasivaBS [updateAlta] " + 
                                        e.toString(), e);
        }
        return altaMasivaDTO;

    }
    
    private List<String> getUnidadesDimension() {
        List<String> dimensiones = 
            super.security().getDimensionPrimaryLevel("SIREHUNIDAD");
        return dimensiones;
    }

    /**
     * Devuelve una lista de elementos de tipo Long correspondiente a los Id de las plazas
     * @param lista
     * @return List<Long>
     */
    private List<Long> getListaIdMovtosEmpPla(List<TnMovtosEmpPla> lista) {
        List<Long> listaIdMovtosEmpPla = new ArrayList<Long>();
        if (lista != null && !lista.isEmpty()) {
            for (TnMovtosEmpPla element: lista) {
                listaIdMovtosEmpPla.add(element.getIdMovtosEmpPla());
            }
        }
        return listaIdMovtosEmpPla;
    }


    public ProrrogaMasivaDTO updateNMProrroga(ProrrogaMasivaDTO prorrogaMasivaDTO) {
        
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            String usuario = super.security().getUserName();
            Date fechaFinCont = null;
            
            // Obttiene las unidades 
            try {
                fechaFinCont = formatoFecha.parse(prorrogaMasivaDTO.getPlazaFinContString());
            } catch (ParseException e) {
                // TODO
            }
            
            // Lista de unidades 
            List<String> listaIdUnidadNom = prorrogaMasivaDTO.getIdUnidadNomFilter() != null && !prorrogaMasivaDTO.getIdUnidadNomFilter().isEmpty()
                            ? prorrogaMasivaDTO.getIdUnidadNomFilter() : getUnidadesDimension();

            // Lista de plazas en el grid
            List<TdPlaza> listaPlazasAProcesar = null;
            // Lista con un elemento con plaza con id = 0 para cuando no existen excluidas el query ignore esta condicion
            List<String> listaDummy = new ArrayList<String>() ;
            listaDummy.add("0");
            
            listaPlazasAProcesar = super.persistence().get(CustomTdPlazaDAO.class).findBajasPlazasByUnidad(TD_PLAZA_ID_GRUPO_PAGO, listaIdUnidadNom, fechaFinCont, prorrogaMasivaDTO.getIdPlaza() != null && prorrogaMasivaDTO.getIdPlaza().length > 0 ? Arrays.asList(prorrogaMasivaDTO.getIdPlaza()) : listaDummy);

            List<TdPlazaDTO> listaResultados = prorrogaMasivaDTO.getListaResultados();
            for(TdPlaza plaza : listaPlazasAProcesar){
                    TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());

                    TnMovtosEmpPla tnMovtosEmpPla = new TnMovtosEmpPla();
                    tnMovtosEmpPla.setIdMovtoPersona( super.getMovimientoPersonal("PRORROGA_DE_CONTRATO_HONORARIO"));
                    tnMovtosEmpPla.setIdPlaza(plaza.getIdPlaza());
                    tnMovtosEmpPla.setIdSituacionPlaza(plaza.getIdSitPlaza());
                    tnMovtosEmpPla.setMepRfc(plaza.getPlazaRfc());
                    tnMovtosEmpPla.setIdGrupoPago(plaza.getIdGrupoPago());
                    tnMovtosEmpPla.setIdUnidadPre(plaza.getIdUnidadPre());
                    tnMovtosEmpPla.setIdPuestoPre(plaza.getIdPuestoPre());
                    tnMovtosEmpPla.setIdEdoPre(plaza.getIdEdoPre());
                    tnMovtosEmpPla.setIdZonaEcoPre(plaza.getIdZonaEcoPre());
                    tnMovtosEmpPla.setIdRangoPre(plaza.getIdRangoPre());
                    
                    tnMovtosEmpPla.setIdUnidadNom(plaza.getIdUnidadNom());
                    tnMovtosEmpPla.setIdPuestoNom(plaza.getIdPuestoNom());
                    

                    if (plaza.getIdPuestoPre() != null) {     
                        TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(plaza.getIdPuestoPre());
                        tnMovtosEmpPla.setIdNivelPtoNom(tcAtributoPuesto.getIdNivelPto());
                        tnMovtosEmpPla.setIdNombramientoNom(tcAtributoPuesto.getIdNombramiento());
                        tnMovtosEmpPla.setIdJerarquiaNom(tcAtributoPuesto.getIdJerarquia());
                    }
                    
                    tnMovtosEmpPla.setIdEdoNom(plaza.getIdEdoNom() );
                    tnMovtosEmpPla.setIdMuniNom(plaza.getIdMuniNom());

                    tnMovtosEmpPla.setIdZonaEcoNom(plaza.getIdZonaEcoNom());
                    tnMovtosEmpPla.setIdRangoNom(plaza.getIdRangoNom() );
                    tnMovtosEmpPla.setIdZonaDistNom(plaza.getIdZonaDistNom());
                    tnMovtosEmpPla.setMepImporteHonorario(plaza.getPlazaImpHono() );
                    tnMovtosEmpPla.setMepUltimoMovto(plaza.getPlazaUltimoMovto());
                    tnMovtosEmpPla.setMepIniCont(plaza.getPlazaIniCont());
                    tnMovtosEmpPla.setMepFinCont(prorrogaMasivaDTO.getFechaTerminoVigencia());
                    tnMovtosEmpPla.setMepQnaCaptura(super.getQuincenaCaptura() != null ? super.getQuincenaCaptura().intValue() : null);
                    tnMovtosEmpPla.setIdTipoPlaza(plaza.getIdTipoPlaza());
                    tnMovtosEmpPla.setIdServPub(plaza.getIdServPub());
                    tnMovtosEmpPla.setIdInmueble(plaza.getIdInmueble());
                    tnMovtosEmpPla.setMepObserva(prorrogaMasivaDTO.getMepObserva());
                    tnMovtosEmpPla.setUsuario(usuario);
                    tnMovtosEmpPla.setFecModifico(new Date());
                    
                    if(empleado != null){
                        tnMovtosEmpPla.setMepImssIssste(empleado.getImssIssste());
                        tnMovtosEmpPla.setMepCurp(empleado.getCurpEmpleado());
                        tnMovtosEmpPla.setMepNombre(empleado.getNombreEmpleado());
                        tnMovtosEmpPla.setMepPrimerApellido(empleado.getPrimerApellido());
                        tnMovtosEmpPla.setMepSegundoApellido(empleado.getSegundoApellido());
                        tnMovtosEmpPla.setMepClabe(empleado.getClabeEmpleado());
                        tnMovtosEmpPla.setMepReferenciaOficio(null);
                        tnMovtosEmpPla.setMepIngresoGobFed(empleado.getIngresoGobFed());
                        tnMovtosEmpPla.setMepIngresoDependencia(empleado.getIngresoDependencia());
                    }

                    super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);    
                    
                    // Se actualiza la plaza
                    plaza.setIdMovtoPersona(super.getMovimientoPersonal("PRORROGA_DE_CONTRATO_HONORARIO"));
					plaza.setPlazaQnaCaptura(super.getQuincenaCaptura() != null ? super.getQuincenaCaptura().intValue() : null);
                    plaza.setPlazaFinCont(prorrogaMasivaDTO.getFechaTerminoVigencia());
                    plaza.setUsuario(usuario);
                    plaza.setFecModifico(new Date());
                    
                    super.persistence().get(TdPlazaDAO.class).save(plaza);
                listaResultados.add(super.transformation().map(plaza, TdPlazaDTO.class));

            // Se actualiza el empleado
            empleado.setIdUltimoMovto(super.getMovimientoPersonal("PRORROGA_DE_CONTRATO_HONORARIO"));
            empleado.setEmpQnaCaptura(super.getQuincenaCaptura().intValue());
            empleado.setUsuario(usuario);
            empleado.setFecModifico(new Date());
            super.persistence().get(TdEmpleadoDAO.class).save(empleado);

        }
        // EXPORTA A EXCEL
        try {
            prorrogaMasivaDTO.setListaResultados(listaResultados);
            String nameFileXls = prorrogaMasivaDTO.getNombreArchivoResultados();
            String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.xls.exportXlsMasivos");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("exportXlsMasivosDTO", prorrogaMasivaDTO);
            transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
            prorrogaMasivaDTO.setNombreArchivoResultados(nameFileXls);
        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaEventualMasivaBS [updateProrroga] " + 
                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaEventualMasivaBS [updateProrroga] " + 
                                        e.toString(), e);
        }
                 return prorrogaMasivaDTO;
    }

    
    public ReduccionContratoMasivaDTO updateNMReduccion(ReduccionContratoMasivaDTO reduccionContratoMasivaDTO) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        String usuario = super.security().getUserName();
        Date fechaFinCont = null;
        
        // Obttiene las unidades 
        try {
            fechaFinCont = formatoFecha.parse(reduccionContratoMasivaDTO.getPlazaFinContString());
        } catch (ParseException e) {
            // TODO
        }
        
        // Lista de unidades 
        List<String> listaIdUnidadNom = reduccionContratoMasivaDTO.getIdUnidadNomFilter() != null && !reduccionContratoMasivaDTO.getIdUnidadNomFilter().isEmpty()
                            ? reduccionContratoMasivaDTO.getIdUnidadNomFilter() : getUnidadesDimension();

        // Lista de plazas en el grid
        List<TdPlaza> listaPlazasAProcesar = null;


        List<String> listaDummy = new ArrayList<String>();
        listaDummy.add("0");
        listaPlazasAProcesar = super.persistence().get(CustomTdPlazaDAO.class).findBajasPlazasByUnidad(TD_PLAZA_ID_GRUPO_PAGO, listaIdUnidadNom, fechaFinCont, reduccionContratoMasivaDTO.getIdPlaza() != null && reduccionContratoMasivaDTO.getIdPlaza().length > 0 ? Arrays.asList(reduccionContratoMasivaDTO.getIdPlaza()) : listaDummy);
        
        List<TdPlazaDTO> listaResultados = reduccionContratoMasivaDTO.getListaResultados();
        for(TdPlaza plaza : listaPlazasAProcesar){

            TdEmpleado empleado = 
                super.persistence().get(TdEmpleadoDAO.class).getById(plaza.getPlazaRfc());

            TnMovtosEmpPla tnMovtosEmpPla = new TnMovtosEmpPla();
                tnMovtosEmpPla.setIdMovtoPersona(super.getMovimientoPersonal("CONTRATO_EVENTUAL_MODIFICA_FECHA_DE_TERMINO"));
                tnMovtosEmpPla.setIdPlaza(plaza.getIdPlaza());
                tnMovtosEmpPla.setIdSituacionPlaza(plaza.getIdSitPlaza());
                tnMovtosEmpPla.setMepRfc(plaza.getPlazaRfc());
                tnMovtosEmpPla.setIdGrupoPago(plaza.getIdGrupoPago());
                tnMovtosEmpPla.setIdUnidadPre(plaza.getIdUnidadPre());
                tnMovtosEmpPla.setIdPuestoPre(plaza.getIdPuestoPre());
                tnMovtosEmpPla.setIdEdoPre(plaza.getIdEdoPre());
                tnMovtosEmpPla.setIdZonaEcoPre(plaza.getIdZonaEcoPre());
                tnMovtosEmpPla.setIdRangoPre(plaza.getIdRangoPre());
                
                tnMovtosEmpPla.setIdUnidadNom(plaza.getIdUnidadNom());
                tnMovtosEmpPla.setIdPuestoNom(plaza.getIdPuestoNom());
                

                if (plaza.getIdPuestoPre() != null) {     
                    TcAtributoPuesto tcAtributoPuesto = super.getAtributoPuesto(plaza.getIdPuestoPre());
                    tnMovtosEmpPla.setIdNivelPtoNom(tcAtributoPuesto.getIdNivelPto());
                    tnMovtosEmpPla.setIdNombramientoNom(tcAtributoPuesto.getIdNombramiento());
                    tnMovtosEmpPla.setIdJerarquiaNom(tcAtributoPuesto.getIdJerarquia());
                }
                
                tnMovtosEmpPla.setIdEdoNom(plaza.getIdEdoNom() );
                tnMovtosEmpPla.setIdMuniNom(plaza.getIdMuniNom());

                tnMovtosEmpPla.setIdZonaEcoNom(plaza.getIdZonaEcoNom());
                tnMovtosEmpPla.setIdRangoNom(plaza.getIdRangoNom() );
                tnMovtosEmpPla.setIdZonaDistNom(plaza.getIdZonaDistNom());
                tnMovtosEmpPla.setMepImporteHonorario(plaza.getPlazaImpHono() );
                tnMovtosEmpPla.setMepUltimoMovto(plaza.getPlazaUltimoMovto());
                tnMovtosEmpPla.setMepIniCont(plaza.getPlazaIniCont() );
                tnMovtosEmpPla.setMepFinCont(reduccionContratoMasivaDTO.getFechaTerminoVigencia());
                tnMovtosEmpPla.setMepQnaCaptura(super.getQuincenaCaptura() != null ? super.getQuincenaCaptura().intValue() : null);
                tnMovtosEmpPla.setIdTipoPlaza(plaza.getIdTipoPlaza());
                tnMovtosEmpPla.setIdServPub(plaza.getIdServPub());
                tnMovtosEmpPla.setIdInmueble(plaza.getIdInmueble());
                tnMovtosEmpPla.setMepObserva(reduccionContratoMasivaDTO.getMepObserva());
                tnMovtosEmpPla.setUsuario(usuario);
                tnMovtosEmpPla.setFecModifico(new Date());
                
                if(empleado != null){
                    tnMovtosEmpPla.setMepImssIssste(empleado.getImssIssste());
                    tnMovtosEmpPla.setMepCurp(empleado.getCurpEmpleado());
                    tnMovtosEmpPla.setMepNombre(empleado.getNombreEmpleado());
                    tnMovtosEmpPla.setMepPrimerApellido(empleado.getPrimerApellido());
                    tnMovtosEmpPla.setMepSegundoApellido(empleado.getSegundoApellido());
                    tnMovtosEmpPla.setMepClabe(empleado.getClabeEmpleado());
                    tnMovtosEmpPla.setMepReferenciaOficio(null);
                    tnMovtosEmpPla.setMepIngresoGobFed(empleado.getIngresoGobFed());
                    tnMovtosEmpPla.setMepIngresoDependencia(empleado.getIngresoDependencia());
                }

                super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);    
                
                // Se actualiza la plaza
                plaza.setIdMovtoPersona(super.getMovimientoPersonal("CONTRATO_EVENTUAL_MODIFICA_FECHA_DE_TERMINO"));
                plaza.setPlazaQnaCaptura(super.getQuincenaCaptura() != null ? super.getQuincenaCaptura().intValue() : null);
                plaza.setPlazaFinCont(reduccionContratoMasivaDTO.getFechaTerminoVigencia());
                plaza.setUsuario(usuario);
                plaza.setFecModifico(new Date());
                
                super.persistence().get(TdPlazaDAO.class).save(plaza);
                listaResultados.add(super.transformation().map(plaza, TdPlazaDTO.class));
                
                // Se acrualiza el empleado
                 empleado.setIdUltimoMovto(super.getMovimientoPersonal("CONTRATO_EVENTUAL_MODIFICA_FECHA_DE_TERMINO"));
                 empleado.setEmpQnaCaptura(super.getQuincenaCaptura().intValue());
                 empleado.setUsuario(usuario);
                 empleado.setFecModifico(new Date());
                 super.persistence().get(TdEmpleadoDAO.class).save(empleado);
            }

        // EXPORTA A EXCEL
        try {
            reduccionContratoMasivaDTO.setListaResultados(listaResultados);
            String nameFileXls = reduccionContratoMasivaDTO.getNombreArchivoResultados();
            String nombreArchivoXls = super.configuration().getString("local.temp.dir") + File.separator + nameFileXls;
            String nombreArchivoPlantillaXls = super.configuration().getString("plazaMasiva.templates.dir") + 
                File.separator + super.configuration().getString("plazaMasivaEstructura", "jxls.templates.xls.exportXlsMasivos");
            XLSTransformer transformer = new XLSTransformer();
            Map beans = new HashMap();
            beans.put("exportXlsMasivosDTO", reduccionContratoMasivaDTO);
            transformer.transformXLS(nombreArchivoPlantillaXls, beans, nombreArchivoXls);
            reduccionContratoMasivaDTO.setNombreArchivoResultados(nameFileXls);
        } catch (InvalidFormatException e) {
             throw new ServiceException("ServiceException in PlazaEventualMasivaBS [updateProrroga] " + 
                                        e.toString(), e);
        } catch (IOException e) {
             throw new ServiceException("ServiceException in PlazaEventualMasivaBS [updateProrroga] " + 
                                        e.toString(), e);
        }
             return reduccionContratoMasivaDTO;
    }
}
