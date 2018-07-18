package gob.shcp.sireh.control.nomina.terceros;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.TcTerceroDTO;
import gob.shcp.sireh.model.nomina.gestion.ConsultaNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.nomina.terceros.ArchivosTimbrePdfDTO;
import gob.shcp.sireh.model.nomina.terceros.CargaArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.IsssterepDTO;
import gob.shcp.sireh.model.nomina.terceros.ResultadoDTO;
import gob.shcp.sireh.model.nomina.terceros.TnComprobantePdfDTO;
import gob.shcp.sireh.model.nomina.terceros.timbradosat.CfdiArchivoDTO;


import gob.shcp.sireh.model.nomina.terceros.timbradosat.ComprobanteFiscalDTO;
import gob.shcp.sireh.service.SirehUtils;

import gob.shcp.sireh.service.nomina.gestion.GestionNominaService;
import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;
import gob.shcp.sireh.service.terceros.TercerosService;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Blob;
import java.sql.SQLException;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;



import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;





import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TercerosNominaController extends AbstractController implements AnnotatedController {

    private static final String formtatoFecha = "dd/MM/yyyy";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formtatoFecha);

    static final int BUFFER = 2048;
    
    private static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    private static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

    @RequestMapping
    public String cargarArchPercep(Model model) {
        CargaArchivoDTO cargaArchivoDTO = new CargaArchivoDTO();
        cargaArchivoDTO.setTipoConcepto("P");
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }

    @RequestMapping
    public String cargarArchDeducc(Model model) {
        CargaArchivoDTO cargaArchivoDTO = new CargaArchivoDTO();
        cargaArchivoDTO.setTipoConcepto("D");
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }
    
    @RequestMapping
    public String cargarArchCptosCtrl(Model model) {
        CargaArchivoDTO cargaArchivoDTO = new CargaArchivoDTO();
        cargaArchivoDTO.setTipoConcepto("C");
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }
    
    @RequestMapping
    public String cargarArchCptosRefCalc(Model model){
        CargaArchivoDTO cargaArchivoDTO = new CargaArchivoDTO();
        cargaArchivoDTO.setTipoConcepto("U");
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }

    @RequestMapping
    public String parserArchivo(Model model, CargaArchivoDTO cargaArchivoDTO) {
        String id = cargaArchivoDTO.getIdTercero();
        
        if (id.equalsIgnoreCase("FO")) {
            //verifica que la quincena sea non        
            if (!super.getService(TercerosNominaService.class).isQuincenaNon()) {
                super.saveError(model, "Este archivo solo debe capturarse en quincenas nones");
                cargaArchivoDTO.setIdTercero(id);
                cargaArchivoDTO.setFileName(cargaArchivoDTO.getFile().getOriginalFilename());
                cargaArchivoDTO.setProcesar(false);
                model.addAttribute(cargaArchivoDTO);
                return super.getViewName("cargarArchivo");
            }
        }

/*     if (cargaArchivoDTO.getFile().getSize() == 0) {
            super.saveError(model, "Proporcione el archivo a procesar");
            cargaArchivoDTO.setIdTercero(id);
            cargaArchivoDTO.setFileName(cargaArchivoDTO.getFile().getOriginalFilename());
            cargaArchivoDTO.setProcesar(false);
            model.addAttribute(cargaArchivoDTO);
            return super.getViewName("cargarArchivo");
        }
*/
        //obtener la descripcion de tercero
        TcTerceroDTO tcTerceroDTO = super.getService(TercerosNominaService.class).getByIdTercero(id);
        if (id.equalsIgnoreCase("O")) {
            String[] array = tcTerceroDTO.getDescTercero().split(" ");
            tcTerceroDTO.setDescTercero(array[1]);
        }
        cargaArchivoDTO.setIdTercero(id);
        String nomFile = cargaArchivoDTO.getFile().getOriginalFilename();
        cargaArchivoDTO.setDescTercero(tcTerceroDTO.getDescTercero());
        cargaArchivoDTO.setFileName(nomFile);
        List<DatosArchivoDTO> lista = null;

        if (super.getService(TercerosNominaService.class).existsFileXML(cargaArchivoDTO.getDescTercero())) {
            lista = super.getService(TercerosNominaService.class).parseFile(cargaArchivoDTO);
            if (lista == null) {
                super.saveError(model, "nomina.tercero.cargaArchivo.errorParser");
                cargaArchivoDTO.setProcesar(false);
                return super.getViewName("cargarArchivo");
            } else if (lista.size() == 0) {
                super.saveError(model, "nomina.tercero.cargaArchivo.errorParser");
                cargaArchivoDTO.setProcesar(false);
                return super.getViewName("cargarArchivo");
            } else {
                cargaArchivoDTO.setProcesar(true);
                cargaArchivoDTO.setTotalRegFlatFile(lista.size());
            }
        } else {
            super.saveWarning(model, "nomina.tercero.cargaArchivo.archivoXML");
            cargaArchivoDTO.setProcesar(false);
            return super.getViewName("cargarArchivo");
        }

        List<DatosArchivoDTO> listaResult = new ArrayList<DatosArchivoDTO>();
        int index = 1;
        for (DatosArchivoDTO dto: lista) {
            dto.setIdTercero(id);
            listaResult.add(dto);
            if (index == 5)
                break;
            index++;
        }
        cargaArchivoDTO.setLista(listaResult);
        cargaArchivoDTO.setIdTercero(id);
        cargaArchivoDTO.setFileName(nomFile);
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }

    @RequestMapping
    public String procesarArchivo(Model model, CargaArchivoDTO cargaArchivoDTO) {
        String id = cargaArchivoDTO.getIdTercero();
        TcTerceroDTO tcTerceroDTO = super.getService(TercerosNominaService.class).getByIdTercero(id);
        
        if (id.equalsIgnoreCase(super.configuration().getString("terceros", "ASEG_DIVERSAS"))) {
            String[] array = tcTerceroDTO.getDescTercero().split(" ");
            tcTerceroDTO.setDescTercero(array[1]);
        }
        //obtener la descripcion de tercero
        cargaArchivoDTO.setIdTercero(id);
        cargaArchivoDTO.setDescTercero(tcTerceroDTO.getDescTercero());
        ResultadoDTO resultadoDTO = null;

        /** El archivo de carga es FONACOT**/
        if (id.equalsIgnoreCase(super.configuration().getString("terceros", "CVE_FONACOT"))) {
            try {
                resultadoDTO = 
                        super.getService(TercerosNominaService.class).insertMovtoConceptoPagoFonacot(cargaArchivoDTO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        } /** archivo de carga de control de asistencia **/
        else if(id.equalsIgnoreCase("FI")) {
            resultadoDTO = super.getService(TercerosNominaService.class).insertMovtoCptoPagoCtrAsistencia(cargaArchivoDTO);
        } /** archivo de carga de otros terceros **/
        else { 
            try {
                resultadoDTO = super.getService(TercerosNominaService.class).insertMovtoConceptoPago(cargaArchivoDTO);
            } catch (Exception e) {
                cargaArchivoDTO.setError(e.getMessage());
                e.printStackTrace();
              }
        }

        if (resultadoDTO.isResult()) {
            super.saveMessage(model, "nomina.tercero.cargaArchivo.ok");
            cargaArchivoDTO.setProcesar(false);
            cargaArchivoDTO.setResultado(resultadoDTO);
        } else {
            super.saveError(model, "nomina.tercero.cargaArchivo.error");
        }
        cargaArchivoDTO.setIdTercero(id);
        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }

    @RequestMapping
    public String page(Model model, CargaArchivoDTO cargaArchivoDTO) {
        String[] array = cargaArchivoDTO.getFileName().split("\\,");
        String nomFile = array[1];
        String id = cargaArchivoDTO.getIdTercero() + " ";
        TcTerceroDTO tcTerceroDTO = super.getService(TercerosNominaService.class).getByIdTercero(id);
        cargaArchivoDTO.setIdTercero(id);
        cargaArchivoDTO.setDescTercero(tcTerceroDTO.getDescTercero());
        List<DatosArchivoDTO> lista = super.getService(TercerosNominaService.class).parseFile(cargaArchivoDTO);
        cargaArchivoDTO.setProcesar(true);
        cargaArchivoDTO.setLista(lista);
        cargaArchivoDTO.setIdTercero(id);

        model.addAttribute(cargaArchivoDTO);
        return super.getViewName("cargarArchivo");
    }

    /**
     * Metodo encargado de buscar  en Historico de Pagos las nominas para generar archivos de terceros.
     * @author Roberto Muñoz.
     * @param model Model
     * @param 
     */
    @RequestMapping
    public String initGeneraArchivoTerceros(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("generaArchivo");
    }

    /**
     * Metodo encargado de buscar  en Historico de Pagos las nominas para generar archivos de terceros.
     * @author Roberto Muñoz.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String generacionArchivoTerceros(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getLlaveTercero() == null || 
            generaArchivosTercerosDTO.getLlaveTercero().equals("0") || 
            generaArchivosTercerosDTO.getHpQnaPago() == null ||
            generaArchivosTercerosDTO.getHpQnaPagoFin() == null) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("generaArchivo");
        }

        generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistorico");
        String datosi = generaArchivosTercerosDTO.getLlaveTercero();
        String tempi[];
        tempi = datosi.split("°");
        generaArchivosTercerosDTO.setIdTercero(tempi[0].trim());
        generaArchivosTercerosDTO.setDescTercero(tempi[1].trim());
        generaArchivosTercerosDTO.setDatTipoCpto(tempi[2].trim());
        generaArchivosTercerosDTO.setDatConcepto(tempi[3].trim());

        if (generaArchivosTercerosDTO.getEstadoPago().equals("C")) {
            generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistoricoCancel");
        } else {
            generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistorico");
            if (generaArchivosTercerosDTO.getDatTipoCpto().equals("M")) {
                generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasMovtos");
            }
        }

        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("generaArchivo");
    }

    @RequestMapping
    public String initGeneraTercero(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        model.addAttribute(generaArchivosTercerosDTO);
        generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistorico");
        String datosi = generaArchivosTercerosDTO.getLlaveTercero();
        String tempi[];
        tempi = datosi.split("°");
        generaArchivosTercerosDTO.setIdTercero(tempi[0].trim());
        generaArchivosTercerosDTO.setDescTercero(tempi[1].trim());
        generaArchivosTercerosDTO.setDatTipoCpto(tempi[2].trim());
        generaArchivosTercerosDTO.setDatConcepto(tempi[3].trim());

        if (generaArchivosTercerosDTO.getEstadoPago().equals("C")) {
            generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistoricoCancel");
        } else {
            generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasHistorico");
            if (generaArchivosTercerosDTO.getDatTipoCpto().equals("M")) {
                generaArchivosTercerosDTO.setBeanlista("sumaConsecutivosNominaQnasMovtos");
            }
        }
        return super.getViewName("generaArchivo");
    }

    /**
     * Método para obtener la informacion de nómina para armar el archivo de terceros
     * @Author Roberto Muñoz
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String generaTercero(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        if (generaArchivosTercerosDTO.getSeleccionConsecNomina() == null) {
            super.saveWarning(model, "warn.empty.chkolist");
            return super.getViewName("generaArchivo");
        }
        String primero = "SI";
        StringBuffer consecs = new StringBuffer();
        String[] consec = generaArchivosTercerosDTO.getSeleccionConsecNomina();

        if (consec.length > 0) {
            consecs.append("(");
            for (String seleccionado: consec) {
                if (primero == "NO") {
                    consecs.append(",");
                }
                primero = "NO";
                consecs.append(seleccionado);
            }
            consecs.append(")");
            generaArchivosTercerosDTO.setHpConsecNomina(consecs.toString());
        }

        List<Map<Integer, Object>> datos = 
            super.getService(TercerosService.class).getDatosTerceros(generaArchivosTercerosDTO);

        if (datos.isEmpty()) {
            super.saveWarning(model, "warn.empty.chkolist");
            return super.getViewName("generaArchivo");
        }
        //generaArchivosTercerosDTO.setMuestraRegistros(true);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        DecimalFormat enteros = new DecimalFormat("###############");
        DecimalFormat decimales = new DecimalFormat("##############0.00");
        String consecutivo = " ";
        String conceptos = " ";
        String desctercero = " ";
        String tipoarchivo = "CSV";
        String delimitador = ",";
        String titulos = "CT";
        String encabezados = "CE";
        String cifras = "CC";
        String alias = " ";
        Integer longitud = 0;
        Object campo = " ";
        Integer registro = 0;
        Integer columnas = 0;
        StringBuilder strCsv = new StringBuilder();

        if (generaArchivosTercerosDTO.getDescTercero() != null) {
            desctercero = generaArchivosTercerosDTO.getDescTercero().toString();
        }
        desctercero = desctercero.replaceAll(",", "/");

        if (generaArchivosTercerosDTO.getHpConsecNomina() != null) {
            consecutivo = generaArchivosTercerosDTO.getHpConsecNomina().toString();
        }
        consecutivo = consecutivo.replaceAll(",", "/");

        if (generaArchivosTercerosDTO.getDatConcepto() != null) {
            conceptos = generaArchivosTercerosDTO.getDatConcepto().toString();
        }
        conceptos = conceptos.replaceAll(",", "/");

        String[] cveconcep = null;
        String[] tipototal = null;
        double[] totalcol = null;
        double[] sumacol = null;
        Integer[] totalreg = null;
        String[] totalcolesp = null;
        String[] totalcolt = null;
        String swti = "TI";
        String swvarimp = "NO";
        String cveconcpaso = "";
        Integer renpie = 0;
        Integer conloc = 0;
        Integer colloc = 0;
        double impvarcc = 0.00;
        double impvarcp = 0.00;
        String tipoimp = "";
        String detallepie = "";
        String salidapie = "";
        String tipoproc="Entero ";
        if (generaArchivosTercerosDTO.getEstadoPago().equals("C")) {
            tipoproc = "Cancelados ";
        }
        for (Map row: datos) {
            registro = registro + 1;
            if (registro == 1) {
                columnas = row.size();
                cveconcep = new String[10000];
                tipototal = new String[10000];
                sumacol = new double[10000];
                totalreg = new Integer[10000];
                totalcol = new double[columnas + 1];
                totalcolesp = new String[columnas + 1];
                totalcolt = new String[columnas + 1];
            }

            conloc = 0;
            colloc = 0;
            for (int columna = 1; columna <= row.size(); columna++) {
                colloc = columna;
                campo = row.get(columna);
                if (campo == null || campo.toString().equals("null") || campo.toString().length() < 1) {
                    campo = " ";
                }
                // ARMA ENCABEZADOS Y CARACTERISTICAS DE ARCHIVO  (REGISTRO = 1)
                if (registro == 1) {
                    if (columna == 1) {
                        if (campo.toString().length() > 32) {
                            encabezados = campo.toString().substring(31, 33);
                        }
                        if (campo.toString().length() > 34) {
                            titulos = campo.toString().substring(33, 35);
                        }

                        if (campo.toString().length() > 36) {
                            cifras = campo.toString().substring(35, 37);
                        }

                        // INCLUYE LOS TITULOS DEL ARCHIVO
                        if (titulos.equals("CT")) {
                            strCsv.append("SECRETARIA DE HACIENDA Y CREDITO PUBLICO ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                            strCsv.append("OFICIALIA MAYOR ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                            strCsv.append("DIRECCION GENERAL DE RECURSOS HUMANOS ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                            strCsv.append("     ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                            strCsv.append("Información de ");
                            strCsv.append(tipoproc);
                            strCsv.append(". Tercero : ");
                            strCsv.append(desctercero);
                            strCsv.append(". Concepto:  ");
                            strCsv.append(generaArchivosTercerosDTO.getDatTipoCpto());
                            strCsv.append("-");
                            strCsv.append(conceptos);
                            strCsv.append(". Quincena : ");
                            strCsv.append(generaArchivosTercerosDTO.getHpQnaPago());
                            strCsv.append(" a ");
                            strCsv.append(generaArchivosTercerosDTO.getHpQnaPagoFin());
                            strCsv.append(". Consecutivo de nómina: ");
                            strCsv.append(consecutivo);
                            strCsv.append("  ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                            strCsv.append("     ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                        }
                        if (campo.toString().length() > 26) {
                            delimitador = campo.toString().substring(0, 1);
                            tipoarchivo = campo.toString().substring(24, 27);
                        }
                        if (delimitador.equals("F")) {
                            delimitador = "";
                        }
                    } else {
                        if (columna > 1) {
                            if (campo != null && Integer.parseInt(campo.toString().substring(1, 4)) < 990) {
                                longitud = Integer.parseInt(campo.toString().substring(1, 4));
                                if (campo.toString().substring(4, 5).equals("#")) {
                                    String aux = alias;
                                } else {
                                    alias = campo.toString().substring(4);
                                    String aux = alias;
                                    for (int ii = alias.length(); ii < longitud; ii++) {
                                        aux = aux + " ";
                                    }
                                    alias = aux.replaceAll("_", " ");
                                    alias = alias.replaceAll(",", " ");
                                    if (encabezados.equals("CE")) {
                                        strCsv.append(alias);
                                        strCsv.append(delimitador);
                                    }
                                    String aux2 = "";
                                    for (int iii = 1; iii <= longitud; iii++) {
                                        aux2 = " " + aux2;
                                    }
                                    totalcolesp[columna] = aux2;
                                }

                            }
                        }
                    }
                }

                // ARMA DETALLE (REGISTRO MAYORES A 1)
                if (registro > 1 && columna > 1) {
                    if (campo.toString().substring(1, 2).equals("#") && detallepie == "") {
                        detallepie = campo.toString().substring(1);
                    }

                    if (campo.toString().substring(1, 2).equals("#") == false) {
                        if (campo.toString().substring(0, 1).equals("T") || 
                            campo.toString().substring(0, 1).equals("F") || 
                            campo.toString().substring(0, 1).equals("S")) {
                            alias = campo.toString().substring(2).replaceAll("_", " ");
                        } else {
                            alias = campo.toString().substring(1).replaceAll("_", " ");
                        }

                        if (campo.toString().substring(0, 1).equals("S")) {
                            cveconcpaso = campo.toString().substring(2);
                        }
                        if (campo.toString().substring(0, 1).equals("A")) {
                            cveconcpaso = campo.toString().substring(1);
                        }
                        alias = alias.replaceAll(",", " ");
                        if (campo.toString().substring(0, 1).equals("T")) {
                            if (impvarcp > 0) {
                                swvarimp = "SI";
                            }
                            impvarcp = impvarcp + Double.parseDouble(alias);
                            impvarcc = Double.parseDouble(alias);
                            totalcol[columna] = totalcol[columna] + impvarcc;
                            totalcolt[columna] = "TI";
                            tipoimp = "TI";
                            for (int ibp = 0; ibp < alias.length(); ibp++) {
                                if (alias.substring(ibp, ibp + 1).equals(".")) {
                                    totalcolt[columna] = "TD";
                                    tipoimp = "TD";
                                    swti = "TD";
                                    ibp = 999;
                                }
                            }
                        }
                        strCsv.append(alias);
                        strCsv.append(delimitador);
                    }
                }
            }

            if (strCsv.length() > 0) {
                if (cveconcpaso.equals("") == false) {
                    for (int in2 = 0; in2 < 10000; in2++) {
                        if (cveconcpaso.equals(cveconcep[in2])) {
                            sumacol[in2] = sumacol[in2] + impvarcp;
                            totalreg[in2] = totalreg[in2] + 1;
                            in2 = 10000;
                        } else {
                            if (cveconcep[in2] == null) {
                                cveconcep[in2] = cveconcpaso;
                                tipototal[in2] = tipoimp;
                                sumacol[in2] = impvarcp;
                                totalreg[in2] = 1;
                                in2 = 10000;
                            }
                        }
                    }

                }
                cveconcpaso = "";
                impvarcc = 0;
                impvarcp = 0;
                strCsv.append(" ");
                strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
            }
        }

        if (cifras.equals("CC") || cifras.equals("CP")) {
            String auxval = "";
            if (cifras.equals("CC") || (cifras.equals("CP") && swvarimp == "SI")) {
                for (int it = 0; it <= columnas; it++) {
                    if (totalcol[it] > 0.00 || totalcolt[it] == "TD" || totalcolt[it] == "TI") {
                        String resultado = decimales.format(totalcol[it]);
                        if (totalcolt[it] == "TD") {
                            auxval = resultado;
                        } else {
                            auxval = String.valueOf((int)totalcol[it]);
                        }
                        Integer longaux = auxval.length();
                        if (delimitador.equals("")) {
                            for (int imc = longaux; imc < totalcolesp[it].length(); imc++) {
                                auxval = "0" + auxval;
                            }
                            strCsv.append(auxval);
                        } else {
                            strCsv.append(auxval);
                        }
                        strCsv.append(delimitador);
                    } else {
                        if (it == 1) {
                            it = it;
                        } else {
                            if (it > 1 && totalcolesp[it] != null) {
                                strCsv.append(totalcolesp[it]);
                                strCsv.append(delimitador);
                            }
                        }
                    }
                }
                strCsv.append(" ");
                strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
            }
            if (cifras.equals("CP")) {
                //********************* ARMA PIE DE ARCHIVO CON BASE A PARAMETROS CAPTURADOS *********************
                salidapie = "";
                for (int itt = 0; itt < 10000; itt++) {
                    if (cveconcep[itt] != null) {
                        Integer enterpas = detallepie.length();
                        if (detallepie.length() < 4) {
                            detallepie = detallepie + "XXXX";
                        }
                        salidapie = "";
                        for (int itp = 0; itp < detallepie.length(); itp++) {
                            if (detallepie.substring(itp, itp + 1).equals("#")) {
                                // <<<<<<<<<<<<<<<<<< incluye los caracteres fijos>>>>>>>>>>>>
                                if (detallepie.substring(itp + 1, itp + 3).equals("FI")) {
                                    for (int iac = itp + 3; iac < detallepie.length(); iac++) {
                                        if (detallepie.substring(iac, iac + 1).equals("#")) {
                                            iac = 10000;
                                        } else {
                                            salidapie = salidapie + detallepie.substring(iac, iac + 1);
                                        }
                                    }

                                }
                                // <<<<<<<<<<<<<<<<<< incluye los espacios>>>>>>>>>>>>
                                if (detallepie.substring(itp + 1, itp + 3).equals("ES")) {
                                    String numstr = detallepie.substring(itp + 3, itp + 6);
                                    Integer numesp = 0;
                                    if (detallepie.substring(itp + 3, itp + 6).matches("[0-9]*")) {
                                        numesp = Integer.parseInt(detallepie.substring(itp + 3, itp + 6));
                                        for (int ines = 0; ines < numesp; ines++) {
                                            salidapie = salidapie + " ";
                                        }
                                    }
                                }
                                // <<<<<<<<<<<<<<<<<< incluye el campo de corte >>>>>>>>>>>>>>
                                if (detallepie.substring(itp + 1, itp + 3).equals("CO")) {
                                    salidapie = salidapie + cveconcep[itt];
                                }

                                // <<<<<<<<<<<<<<<<<< incluye el total de registros>>>>>>>>>>>>
                                if (detallepie.substring(itp + 1, itp + 3).equals("RG")) {
                                    if (detallepie.substring(itp + 3, itp + 6).matches("[0-9]*")) {
                                        auxval = String.valueOf((int)totalreg[itt]);
                                        Integer numesp = Integer.parseInt(detallepie.substring(itp + 3, itp + 6));
                                        for (int inrg = auxval.length(); inrg < numesp; inrg++) {
                                            auxval = "0" + auxval;
                                        }
                                        salidapie = salidapie + auxval;
                                    }
                                }
                                // <<<<<<<<<<<<<<<<<< incluye la suma total del importe>>>>>>>>>>>>                                                            
                                if (detallepie.substring(itp + 1, itp + 3).equals("ST")) {

                                    if (swti == "TD") {
                                        auxval = auxval = decimales.format(sumacol[itt]);
                                        ;
                                    } else {
                                        auxval = String.valueOf((int)sumacol[itt]);
                                    }

                                    if (detallepie.substring(itp + 3, itp + 6).matches("[0-9]*")) {
                                        Integer numesp = Integer.parseInt(detallepie.substring(itp + 3, itp + 6));
                                        for (int inrg = auxval.length(); inrg < numesp; inrg++) {
                                            auxval = "0" + auxval;
                                        }
                                        salidapie = salidapie + auxval;
                                    }
                                }
                            }
                        }
                        if (salidapie != "") {
                            strCsv.append(salidapie);
                            strCsv.append("  ");
                            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
                        }
                    } else {
                        itt = 10001;
                    }
                }
            }
            strCsv.append("  ");
            strCsv.replace(strCsv.length() - 1, strCsv.length(), "\n");
        }

        tipoproc="Entero_de_";
        if (generaArchivosTercerosDTO.getEstadoPago().equals("C")) {
            tipoproc = "Cancelados_de_";
        }
        generaArchivosTercerosDTO.setMuestraRegistros(false);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", 
                           "attachment; filename=\"" + tipoproc + "Tercero_" + generaArchivosTercerosDTO.getDescTercero() + 
                           "_Concepto_" + generaArchivosTercerosDTO.getDatTipoCpto() + 
                           generaArchivosTercerosDTO.getDatConcepto() + "_Qna_" + 
                           generaArchivosTercerosDTO.getHpQnaPago()   + "_a_" +
                           generaArchivosTercerosDTO.getHpQnaPagoFin() + "_Consecutivo_" + consecutivo + "." + 
                           tipoarchivo + "\"");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;

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
     * Metodo inicial para reporte de archivos serica
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param sericaDTO SericaDTO
     */
    @RequestMapping
    public String serica(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("serica"); //Va el nombre de la JSP o del Servlet 
    }

    /**
     * Metodo inicial para reporte de archivos serica
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param sericaDTO SericaDTO
     */
    @RequestMapping
    public String generaSerica(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getHpQnaPago() == null || generaArchivosTercerosDTO.getHpQnaPago().equals("") || 
            generaArchivosTercerosDTO.getTipoQna() == null || generaArchivosTercerosDTO.getTipoQna().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("serica");
        }
        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        generaArchivosTercerosDTO.setMuestraRegistros(true);
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("serica"); //Va el nombre de la JSP o del Servlet 
    }

    @RequestMapping
    public String generaArchivoSerica(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                      HttpServletResponse response) throws IOException {
        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        List<String> datos = super.getService(TercerosService.class).getDatosSericaEnc(generaArchivosTercerosDTO);

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }


        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "Tercero_" + "Serica.txt");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;

    }

    @RequestMapping
    public String isssteFiliacion(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("isssteFiliacion");
    }

    /**
     * Metodo encargado de buscar  en Historico de Pagos las nominas para generar archivos de terceros.
     * @author Roberto Muñoz.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String generaIssste(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getHpQnaPago() == null || generaArchivosTercerosDTO.getHpQnaPago().equals("") || 
            generaArchivosTercerosDTO.getTipoQna() == null || generaArchivosTercerosDTO.getTipoQna().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("isssteFiliacion");
        }

        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("e")) {
            generaArchivosTercerosDTO.setBeanlista("isssteFiliacionEnteros");
        }
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("c")) {
            generaArchivosTercerosDTO.setBeanlista("isssteFiliacionCancelados");
        }
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("d")) {
            generaArchivosTercerosDTO.setBeanlista("isssteFiliacionDevoluciones");
        }

        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        generaArchivosTercerosDTO.setMuestraRegistros(true);
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("isssteFiliacion");
    }

    /**
     * Metodo encargado de buscar  en Historico de Pagos las nominas para generar 
     * el archivos del tercero Prestaciones Issste.
     * @author MCS
     * @param model Model
     */
    @RequestMapping
    public String initGeneraArchivoTercerosPrestIssste(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("generaArchivoPrestIssste");
    }

    /**
     * Metodo encargado de buscar  en Historico de Pagos las nominas para generar archivos de terceros.
     * @author MCS
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String generacionArchivoTerceroPrestIssste(Model model, 
                                                      GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getHpQnaPago() == null || generaArchivosTercerosDTO.getHpQnaPago().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc.generacionArchivo.qnaNomina");
            return super.getViewName("generaArchivoPrestIssste");
        } else if (generaArchivosTercerosDTO.getTipoQna() == null || 
                   generaArchivosTercerosDTO.getTipoQna().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc.generacionArchivo.tipoQna");
            return super.getViewName("generaArchivoPrestIssste");
        } else if (generaArchivosTercerosDTO.getTipoEntero() == null || 
                   generaArchivosTercerosDTO.getTipoEntero().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc.generacionArchivo.tipoEntero");
            return super.getViewName("generaArchivoPrestIssste");
        }

        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("e")) {
            generaArchivosTercerosDTO.setBeanlista("issstePrestacionesEnteros");
        }
        if (generaArchivosTercerosDTO.getTipoEntero() != null && 
            generaArchivosTercerosDTO.getTipoEntero().equals("c")) {
            generaArchivosTercerosDTO.setBeanlista("issstePrestacionesCancelados");
        }

        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("generaArchivoPrestIssste");
    }


    /**
     * Método para obtener la informacion de nómina para armar el archivo de terceros prestacion Issste
     * @Author MCS
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String generaTerceroPrestIssste(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                           HttpServletResponse response) throws IOException {

        if (generaArchivosTercerosDTO.getSeleccionConsecNomina() == null) {
            super.saveWarning(model, "warn.empty.chkolist");
            return super.getViewName("generaArchivoPrestIssste");
        }
        String primero = "SI";
        StringBuffer consecs = new StringBuffer();
        String[] consec = generaArchivosTercerosDTO.getSeleccionConsecNomina();

        if (consec.length > 0) {

            for (String seleccionado: consec) {
                if (primero == "NO") {
                    consecs.append(",");
                }
                primero = "NO";
                consecs.append(seleccionado);
            }

            generaArchivosTercerosDTO.setHpConsecNomina(consecs.toString());

        }
        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        List<String> datos = super.getService(TercerosService.class).getDatosIssstePrest(generaArchivosTercerosDTO);

        if (datos.isEmpty()) {
            super.saveWarning(model, "warn.empty.chkolist");
            return super.getViewName("generaArchivoPrestIssste");
        }

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }

        generaArchivosTercerosDTO.setMuestraRegistros(false);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "Tercero_" + "Issste_Prestaciones.dat");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }

    @RequestMapping
    public String generarArchivoIssste(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                       HttpServletResponse response) throws IOException {
        if (generaArchivosTercerosDTO.getSeleccionConsecNomina() == null) {
            super.saveWarning(model, "warn.empty.chkolist");
            return isssteFiliacion(model);
        }
        String primero = "SI";
        StringBuffer consecs = new StringBuffer();
        String[] consec = generaArchivosTercerosDTO.getSeleccionConsecNomina();

        if (consec.length > 0) {

            for (String seleccionado: consec) {
                if (primero == "NO") {
                    consecs.append(",");
                }
                primero = "NO";
                consecs.append(seleccionado);
            }

            generaArchivosTercerosDTO.setHpConsecNomina(consecs.toString());
        }
        generaArchivosTercerosDTO.setHpIniPago(simpleDateFormat.format(SirehUtils.getQuincenaCapturaAsDate(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                           'I')));
        List<String> datos = 
            super.getService(TercerosService.class).getDatosIsssteFiliacion(generaArchivosTercerosDTO);

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }


        generaArchivosTercerosDTO.setMuestraRegistros(false);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "Tercero_" + "Issste_Filiacion.dat");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }

    /**
     * Metodo inicial para reporte de archivos issste
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param isssterepDTO IsssterepDTO
     */
    @RequestMapping
    public String isssterep(Model model, IsssterepDTO isssterepDTO) {
        if (isssterepDTO.isLimpiar()) {
            isssterepDTO = new IsssterepDTO();
        }
        if (isssterepDTO.isAceptar()) {
            isssterepDTO.setQnaww(Integer.parseInt(isssterepDTO.getQnaIni().toString().substring(4, 6)));
        }
        // despues de String va el nombre del elemento .Do del menu es el nombre del metodo del controlador definido en el menu-config
        model.addAttribute(isssterepDTO);
        return super.getViewName("isssterep"); //Va el nombre de la JSP o del Servlet 
    }

    

    /**
     * Metodo inicial para reporte de archivos Sat Timbrado
     * @author Equipo de Desarrollo.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String generasatTimbrado(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.getHpQnaPago() == null || generaArchivosTercerosDTO.getHpQnaPago().equals("")) {
            generaArchivosTercerosDTO.setMuestraRegistros(false);
            super.saveWarning(model, "warn.empty.selecc");
            return super.getViewName("satTimbrado");
        }
        generaArchivosTercerosDTO.setMuestraRegistros(true);
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("satTimbrado"); 
    }

    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author Oscar S.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return String
     * @deprecated
     */
    @RequestMapping
    public String processSatTimbrado(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) throws IOException {
        List<String> items = super.getService(TercerosService.class).processSatTimbrado(generaArchivosTercerosDTO);
        logger.debug("-----------------> fileGeneratorSatTimbrado -> items: " + items.size());

        String fileName = "SAT_Timbrado_QNA.txt";
        String fileNameRandom = UUID.randomUUID().toString();
        String nameFileDat = fileNameRandom + ".txt";
        generaArchivosTercerosDTO.setTxtFileName(nameFileDat);

        for (String item: items) {
            StringBuilder result = new StringBuilder();
            result.append(item);
            
            // Escribir en archivo
            writeToFile(result.toString(), nameFileDat);
        }
        generaArchivosTercerosDTO.setMuestraRegistros(true);
        
        super.saveMessage(model, "clc.terceros.file.ok");
        
        testMemmory();
        
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("satTimbrado");
    }
    
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author Oscar S.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return String
     * @deprecated
     */
    @RequestMapping
    public String processSatTimbradoV2(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) throws IOException {
        generaArchivosTercerosDTO = super.getService(TercerosService.class).processSatTimbradoV2(generaArchivosTercerosDTO);

        generaArchivosTercerosDTO.setMuestraRegistros(true);
        
        super.saveMessage(model, "clc.terceros.file.ok");
        NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNomina(Integer.valueOf(generaArchivosTercerosDTO.getHpConsecNomina()));
        if (nominaDTO != null && nominaDTO.getNomArchAnexo20() != null) {
            super.saveMessage(model, "clc.terceros.file.anexo20");
        }
        testMemmory();
        generaArchivosTercerosDTO.setHpConcecNominaHidden(generaArchivosTercerosDTO.getHpConsecNomina());
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("satTimbrado");
    }
    
    /**
     * Metodo encargado de escribir en archivo temporal
     * @author Oscar S.
     * @param text String
     * @param nameFileDat String
     */
    public void writeToFile(String text, String nameFileDat) {
        try {
            String rutaArchivo = super.configuration().getString("local.temp.dir");
            File file = new File(rutaArchivo + File.separator + nameFileDat);
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(text);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
        }
    }
    
    /**
     * Metodo encargado de descargar el archivo generado SAT Timbrado por quincena, con base el objeto generaArchivosTercerosDTO en formato ZIP.
     * @author Oscar S.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @param response HttpServletResponse
     * @return String
     *
    @RequestMapping
    public String downloadTxtFileSatTimbrado(Model model, 
                                             GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                             HttpServletResponse response) {
        FileInputStream fs = null;
        File f = null;
        
        try {
            String nombreArchivoConRuta = super.configuration().getString("local.temp.dir") + File.separator + generaArchivosTercerosDTO.getTxtFileName();
            f = new File(nombreArchivoConRuta);
            if (f.exists()) {
                fs = new FileInputStream(f);
                byte[] bytes = IOUtils.toByteArray(fs);

                // INICIO PROCESO DE GUARDAR EL ARCHIVO GENERADO EN LA TABLA TN_NOMINA
                if(generaArchivosTercerosDTO.getHpConcecNominaHidden() != null && !generaArchivosTercerosDTO.getHpConcecNominaHidden().equals("")){
                    NominaDTO nominaDTO = super.getService(GestionNominaService.class).getNomina(Integer.valueOf(generaArchivosTercerosDTO.getHpConcecNominaHidden()));
                    if (nominaDTO != null && nominaDTO.getNomArchAnexo20() == null) {
                        nominaDTO.setNomArchCreacion(bytes);
                        nominaDTO.setNomFecCreacion(new java.util.Date());
                        super.getService(GestionNominaService.class).updateNominaArchivoSat(nominaDTO, super.identity().get().getUserID());
                    }
                }
                // FIN PROCESO DE GUARDAR EN LA TABLA TN_NOMINA

                response.setContentType("application/zip");
                response.setContentLength(bytes.length);
                response.setHeader("Content-Disposition", "attachment; filename=SAT_Timbrado_QNA.zip");

                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            } else {
                super.saveError(model, "clc.terceros.file.error");
                return satTimbrado(model, generaArchivosTercerosDTO);
            }
        } catch (FileNotFoundException e) {
            super.saveError(model, "clc.terceros.file.error");
        } catch (IOException e) {
            super.saveError(model, "clc.terceros.file.error");
        } finally {
            try {
                if (fs != null) {
                    fs.close();
                }
            } catch (IOException e) {
                super.saveError(model, "clc.terceros.file.error");
            }
        }
        return null;
    }*/
         
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @param response HttpServletResponse
     * @return String
     * @deprecated
     */
    @RequestMapping
    public String generaArchivoSatTimbrado(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        List<String> datos = super.getService(TercerosService.class).processSatTimbrado(generaArchivosTercerosDTO);
        logger.debug("-----------------> generaArchivoSatTimbrado -> datos: " + datos.size());
        
        testMemmory();
        
        String result = concatenateStrings(datos);
        logger.debug("-----------------> concatenateStrings -> result: " + result.length());
        
        byte[] bytes = result.getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "SatTimbrado_" + "SatTimbrado.txt");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }
    
    public void testMemmory() {
        long kb = 1024;  
        long heapSize = Runtime.getRuntime().totalMemory();    
        long maxHeapSize = Runtime.getRuntime().maxMemory();  
        logger.debug("Heap Size (KB): " + heapSize/1024);  
        logger.debug("Max Heap Size (KB): " + maxHeapSize/1024);  
    }
    
    public static String concatenateStrings(List<String> items) {
        if (items == null) {
            return null;
        }
        if (items.size() == 0) {
            return "";
        }
        
        /*int expectedSize = 0;
        for (String item: items) {
            expectedSize += item.length();
        }*/
        //StringBuffer result = new StringBuffer(expectedSize);
        StringBuilder result = new StringBuilder(items.size());
        for (String item: items) {
            result.append(item).append("\r\n");
        }
        return result.toString();
    }

    /**
     * Metodo inicial para reporte de archivos Sat cancelado
     * @author Equipo de Desarrollo.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String satcancela(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        generaArchivosTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        return super.getViewName("satcancela"); //Va el nombre de la JSP o del Servlet 
    }

    @RequestMapping
    public String generaArchivosatcancela(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                          HttpServletResponse response) throws IOException {
        List<String> datos = 
            super.getService(TercerosService.class).getDatosSatTimbradoCanc(generaArchivosTercerosDTO);

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }

        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + "SatCancela_" + "SatCancela.txt");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("satTimbrado");
    }

    @RequestMapping
    public String fonacot(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();

        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("genArchFonacot");
    }

    @RequestMapping
    public String generarArchivoFonacot(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                        HttpServletResponse response) throws IOException {

        if (generaArchivosTercerosDTO.getCiclo() == null || generaArchivosTercerosDTO.getMes() == null) {
            super.saveWarning(model, "warn.empty.selecc.generacionArchivo.ciclo.mes");
            return super.getViewName("genArchFonacot");
        }
        int iMes = Integer.parseInt(generaArchivosTercerosDTO.getMes());
        String sMes = "0";

        generaArchivosTercerosDTO.setQnaIni(generaArchivosTercerosDTO.getCiclo() + ((iMes * 2) - 1));
        generaArchivosTercerosDTO.setQnaFin(generaArchivosTercerosDTO.getCiclo() + (iMes * 2));

        if (iMes < 10) {
            sMes = "0" + iMes;
        } else {
            sMes = iMes + "";
        }

        List<String> datos = super.getService(TercerosService.class).getDatosTerceroFonacot(generaArchivosTercerosDTO);

        if (datos.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return super.getViewName("genArchFonacot");
        }

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }

        //generaArchivosTercerosDTO.setMuestraRegistros(false);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", 
                           "attachment; filename=\"" + "Tercero_fonacot_envio " + generaArchivosTercerosDTO.getCiclo() + 
                           sMes + ".csv");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }

    @RequestMapping
    public String validarArchivoFonacot(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                        HttpServletResponse response) throws IOException {

        if (generaArchivosTercerosDTO.getCiclo() == null || generaArchivosTercerosDTO.getMes() == null) {
            super.saveWarning(model, "warn.empty.selecc.generacionArchivo.ciclo.mes");
            return super.getViewName("genArchFonacot");
        }

        int iMes = Integer.parseInt(generaArchivosTercerosDTO.getMes());
        String sMes = "0";
        
        if (iMes < 10) {
            sMes = "0" + iMes;
        } else {
            sMes = iMes + "";
        }
        
        generaArchivosTercerosDTO.setQnaIni(generaArchivosTercerosDTO.getCiclo() + (iMes < 10 ? "0" : "") + ((iMes * 2) - 1));
        generaArchivosTercerosDTO.setQnaFin(generaArchivosTercerosDTO.getCiclo() + (iMes < 10 ? "0" : "") + (iMes * 2));
        logger.debug(generaArchivosTercerosDTO.getQnaIni() + " - " + generaArchivosTercerosDTO.getQnaFin());
        
        List<String> datos = super.getService(TercerosService.class).validaTerceroFonacot(generaArchivosTercerosDTO);

        if (datos.isEmpty()) {
            super.saveWarning(model, "warn.empty.list");
            return super.getViewName("genArchFonacot");
        }

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }

        //generaArchivosTercerosDTO.setMuestraRegistros(false);
        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", 
                           "attachment; filename=\"" + "Tercero_fonacot_valida " + generaArchivosTercerosDTO.getCiclo() + 
                           sMes + ".csv");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }
    
    /**
     * Metodo inicial para generar archivo de padron FONCACOT
     * @author Ricardo León E.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
	@RequestMapping
     public String padronFonacot(Model model) {
         GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();

         model.addAttribute(generaArchivosTercerosDTO);
         return super.getViewName("padronFonacot");
     }

    /**
     * Genera archivo de padron FONCACOT
     * @author Ricardo León E.
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
     @RequestMapping
     public String generaPadronFonacot(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                         HttpServletResponse response) throws IOException {

         String quincena = generaArchivosTercerosDTO.getQnaPago();
         Integer ciclo = Integer.parseInt(quincena.substring(0, 4));
         if (generaArchivosTercerosDTO.getQnaPago() == null) {
             // super.saveWarning(model, "warn.empty.selecc.generacionArchivo.ciclo.mes");
             return super.getViewName("padronFonacot");
         }

         generaArchivosTercerosDTO.setQnaPago(generaArchivosTercerosDTO.getQnaPago());

         List<String> datos = super.getService(TercerosService.class).getPadronFonacot(ciclo, quincena);
         StringBuilder strCsv = new StringBuilder();


         for (String renglon: datos) {
             strCsv.append(renglon).append("\r\n");
         }

         generaArchivosTercerosDTO.setMuestraRegistros(true);
         byte[] bytes = strCsv.toString().getBytes();
         response.setContentType("text/csv");
         response.setContentLength(bytes.length);
         response.setHeader("Content-Disposition", 
                            "attachment; filename=\"" + "ArchivoPadronFonacot" +  quincena +  ".txt");
         OutputStream out = response.getOutputStream();
         out.write(bytes, 0, bytes.length);

         return null;
     }

    /**
     * Metodo inicial para reporte de archivos isssteSIPE
     * @author
     * @param model Model
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    @RequestMapping
    public String isssteSIPE(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        if (generaArchivosTercerosDTO.isCancel()) {
            generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        }
        generaArchivosTercerosDTO.setQnaCapturaIRequired(Boolean.TRUE);
        model.addAttribute(generaArchivosTercerosDTO);
        return super.getViewName("isssteSIPE"); //Va el nombre de la JSP o del Servlet 
    }
         @RequestMapping
         public String generaArchivoisssteSIPE(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, 
                                               HttpServletResponse response) throws IOException {
             List<String> datos = 
                 super.getService(TercerosService.class).processisssteSIPE(generaArchivosTercerosDTO);

             StringBuilder strCsv = new StringBuilder();
             for (String renglon: datos) {
                 strCsv.append(renglon).append("\r\n");
             }

             byte[] bytes = strCsv.toString().getBytes();
             response.setContentType("text/csv");
             response.setContentLength(bytes.length);
             if (generaArchivosTercerosDTO.getTipoArc() == 0){
                 response.setHeader("Content-Disposition", "attachment; filename=\"" + "SIPEaltas_" + "SIPEaltas.txt");
             } else if(generaArchivosTercerosDTO.getTipoArc() == 1) {
                        response.setHeader("Content-Disposition", "attachment; filename=\"" + "SIPEbajas_" + "SIPEbajas.txt");
             } else { response.setHeader("Content-Disposition", "attachment; filename=\"" + "SIPEcambios_" + "SIPEcambios.txt");
                    }
//             response.setHeader("Content-Disposition", "attachment; filename=\"" + "SatCancela_" + "SatCancela.txt");
             OutputStream out = response.getOutputStream();
             out.write(bytes, 0, bytes.length);

             return null;

         }

    /**
     * Metodo inicial para reporte de archivos serica cancelados
     * @author
     * @param model Model
     */
    @RequestMapping
    public String sericaC(Model model) {
        GeneraArchivosTercerosDTO generaArchivosTercerosDTO = new GeneraArchivosTercerosDTO();
        model.addAttribute(generaArchivosTercerosDTO);
        generaArchivosTercerosDTO.setQnaCapturaRequired(Boolean.TRUE);
        return super.getViewName("sericaC"); //Va el nombre de la JSP o del Servlet 
    }

    @RequestMapping
    public String generaSericaC(Model model, GeneraArchivosTercerosDTO generaArchivosTercerosDTO, HttpServletResponse response) throws IOException {
        List<String> datos = super.getService(TercerosService.class).getDatosSericaC(generaArchivosTercerosDTO);

        StringBuilder strCsv = new StringBuilder();
        for (String renglon: datos) {
            strCsv.append(renglon).append("\r\n");
        }

        byte[] bytes = strCsv.toString().getBytes();
        response.setContentType("text/csv");
        response.setContentLength(bytes.length);
        response.setHeader("Content-Disposition", 
                           "attachment; filename=\"" + "SericaCancelado_" + "SericaCancelado.txt");
        OutputStream out = response.getOutputStream();
        out.write(bytes, 0, bytes.length);

        return null;
    }
    
    /**
     * CFDI POR UNIDAD
     * @author MARTIN C.
     */
    @RequestMapping
    public String comprobanteFiscalUnidad(Model model, ComprobanteFiscalDTO comprobanteFiscalDTO){
        if(comprobanteFiscalDTO.isLimpiar()){
            comprobanteFiscalDTO = new ComprobanteFiscalDTO();
        }
        
        if(comprobanteFiscalDTO.getUnidad() != null || comprobanteFiscalDTO.getTipoNomina() != null || comprobanteFiscalDTO.getQnaPago() != null || comprobanteFiscalDTO.getComplemento() != null){
            /*
            if(comprobanteFiscalDTO.getUnidad().equals("0")){
                super.saveError(model, "El campo unidad es obligatorio, seleccione una opcion de la lista");
            }*/
            if(comprobanteFiscalDTO.getTipoNomina().equals("0")){
                super.saveError(model, "El campo tipo de nomina es obligatorio, seleccione una opcion de la lista");
            }
            if(comprobanteFiscalDTO.getQnaPago() == 0){
                super.saveError(model, "El campo quincena de pago es obligatorio, seleccione una opcion de la lista");
            }
            if(comprobanteFiscalDTO.getComplemento() == -1){
                    super.saveError(model, "El campo complemento es obligatorio, proporcione un complemento");
            }
            else if(comprobanteFiscalDTO.getComplemento().equals("")){
                super.saveError(model, "El campo complemento es obligatorio, proporcione un complemento");
            }
            
            //if(comprobanteFiscalDTO.getQnaPago() != 0 && comprobanteFiscalDTO.getComplemento() != null && !comprobanteFiscalDTO.getTipoNomina().equals("0")  && !comprobanteFiscalDTO.getUnidad().equals("0")){
            if(comprobanteFiscalDTO.getQnaPago() != 0 && comprobanteFiscalDTO.getComplemento() != null && !comprobanteFiscalDTO.getTipoNomina().equals("0")){
                //expedienteDTO.setUniCiclo(super.security().getOperationYear());
                comprobanteFiscalDTO.setQnaCaptura(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
                comprobanteFiscalDTO.setUrlOrigen("comprobanteFiscalUnidad");
                comprobanteFiscalDTO.setUrlDestino("comprobanteFiscalUnidad");
                comprobanteFiscalDTO.setMuestraRegistros(true);
                if(comprobanteFiscalDTO.getUnidad().equals("0")){
                    comprobanteFiscalDTO.setBeanName("searchComprobanteFiscalUnidadOrderByUnidad");
                } else { comprobanteFiscalDTO.setBeanName("searchComprobanteFiscalUnidad"); }
            }
            
        }
        model.addAttribute(comprobanteFiscalDTO);
        return super.getViewName("comprobanteFiscalUnidad");
    }
    
    /**
     * CFDI POR EMPLEADO
     * @author MARTIN C.
     */
    @RequestMapping
    public String comprobanteFiscalEmpleado(Model model, ComprobanteFiscalDTO comprobanteFiscalDTO){
        if(comprobanteFiscalDTO.isLimpiar()){
            comprobanteFiscalDTO = new ComprobanteFiscalDTO();
        }
        if(comprobanteFiscalDTO.getRfcEmpleado() != null && comprobanteFiscalDTO.getQnaIniEmpl() != null && comprobanteFiscalDTO.getQnaFinEmpl() != null){
            if(comprobanteFiscalDTO.getRfcEmpleado().equals("")){
                super.saveError(model, "El campo rfc es obligatorio; Proporcione un rfc");
            }
            if(comprobanteFiscalDTO.getQnaIniEmpl() == 0){
                super.saveError(model, "El campo quincena inicial es obligatorio; Seleccione una quincena de la lista desplegable");
            }
            if(comprobanteFiscalDTO.getQnaFinEmpl() == 0){
                super.saveError(model, "El campo quincena final es obligatorio; Seleccione una quincena de la lista desplegable");
            }
            
            if(!comprobanteFiscalDTO.getRfcEmpleado().equals("") && comprobanteFiscalDTO.getQnaIniEmpl() != 0 && comprobanteFiscalDTO.getQnaFinEmpl() != 0){
                comprobanteFiscalDTO.setMuestraRegistros(true);
                comprobanteFiscalDTO.setUrlOrigen("comprobanteFiscalEmpleado");
                comprobanteFiscalDTO.setUrlDestino("comprobanteFiscalEmpleado");
                comprobanteFiscalDTO.setBeanName("searchComprobanteFiscalEmpleado");
                
            }
        }
        comprobanteFiscalDTO.setQnaCaptura(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
        model.addAttribute(comprobanteFiscalDTO);
        return super.getViewName("comprobanteFiscalEmpleado");
    }
    
    

    /**
     * Descarga de Archivos PFD por unidad
     * @author Gualberto G.
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String cfdiArchivoUnidad(Model model, CfdiArchivoDTO cfdiArchivoDTO) {
        if(cfdiArchivoDTO.isLimpiar()){
            cfdiArchivoDTO = new CfdiArchivoDTO();
        }
        cfdiArchivoDTO.setQnaCaptura(SirehUtils.getQuincenaCapturaAsInteger(new Date()));
        cfdiArchivoDTO.setBeanName("busquedaCfdiArchivoUnidad");
        cfdiArchivoDTO.setUrlOrigen("comprobanteFiscalUnidad");
        cfdiArchivoDTO.setUrlDestino("comprobanteFiscalUnidad");
        if(cfdiArchivoDTO.isBuscar() && cfdiArchivoDTO.getQnaPago() != null && cfdiArchivoDTO.getHpConsecNomina() != null && cfdiArchivoDTO.getTipoNomina() != null &&
         !cfdiArchivoDTO.getTipoNomina().equals("")){
            cfdiArchivoDTO.setMuestraRegistros(true);            
        }
        model.addAttribute(cfdiArchivoDTO);
        return super.getViewName("cfdiArchivoUnidad");
    }

    @RequestMapping
    public String getArchivosUnidadPdf(Model model, 
                                       CfdiArchivoDTO cfdiArchivoDTO, 
                                       HttpServletRequest request, 
                                       HttpServletResponse response) {

        List<InputStream> reportesPDF = new ArrayList<InputStream>();
        List<Integer> listFolios = new ArrayList<Integer>();
        String[] arrComprobantes = cfdiArchivoDTO.getIdGrupo();
        
        try {
            for (int i = 0; i < arrComprobantes.length; i++) {
                String[] reg = arrComprobantes[i].split("\\-");
                String rfcEmpleado = reg[0];
                Integer cnFolio = new Integer(reg[1]);
                Integer cnDfifFolio = new Integer(reg[2]);
                listFolios.add(cnFolio);
            }
            List<TnComprobantePdfDTO> listaTnComprobantePdfDTO = super.getService(TercerosNominaService.class).findTnComprobantePdfById(listFolios, 9);
            for(TnComprobantePdfDTO tnComprobantePdfDTO : listaTnComprobantePdfDTO){
                reportesPDF.add( tnComprobantePdfDTO.getCnArchivoPdfBlob().getBinaryStream() );
            }
            String URLFinalPDF = super.configuration().getString("local.temp.dir") + File.separator + UUID.randomUUID().toString() + ".pdf";
            OutputStream out = new FileOutputStream(new File(URLFinalPDF));

            doMergePDF(reportesPDF, out, URLFinalPDF, response);

        } catch (SQLException e) {

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (DocumentException e) {

        }
        return null;
    }
    
    /**
     * Unir todos PFD generados en uno solo.
     * @author Martin C.
     * @param model Model
     * @param comprobanteFiscalDTO ComprobanteFiscalDTO
     * @param request HttpServletRequest
     * @param response HttpServletResponse
     * @return String
    */
    public static void doMergePDF(List<InputStream> list, OutputStream outputStream, String url, HttpServletResponse response) throws DocumentException, IOException {
        byte[] bytesPdf;
        //crear un nuevo documento PDF
        Document document = new Document();
        //crear un escritor del PDF
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();
        //para cada PDF en la lista, leer su contenido por página e ir agregando cada página en el PDF de la variable document
        for (InputStream in : list) {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //importa la pagina desde el pdf origen
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //Agrega a la pagina al pdf destino
                cb.addTemplate(page, 0, 0);
            }
        }
        //cerrar streams para liberar recursos
        //y cualquier bloqueo de archivo
        outputStream.flush();
        document.close();
        outputStream.close();
        
        // Descarga archivo pdf
        File pdfFile = new File(url);
        
        if (pdfFile.exists()) {
            FileInputStream fis = new FileInputStream(pdfFile);
            bytesPdf = IOUtils.toByteArray(fis);
            response.setContentType("application/pdf");
            response.setContentLength(bytesPdf.length);
            response.setHeader("Content-Disposition", "attachment; filename=" + "finalPDF" + ".pdf");
            OutputStream out = response.getOutputStream();
            out.write(bytesPdf, 0, bytesPdf.length);
        }
    }
    @RequestMapping
    public String listarNominasCarga(Model model, 
                                     ConsultaNominaDTO consultaNominaDTO) {
        if (consultaNominaDTO.isCancel()) {
            consultaNominaDTO = new ConsultaNominaDTO();
        }
        consultaNominaDTO.setUrlOrigen("listarNominasCarga");
        consultaNominaDTO.setUrlDestino("listarNominasCarga");
        consultaNominaDTO.setBeanName("listarNominasCarga");

        model.addAttribute(consultaNominaDTO);
        return super.getViewName("listarNominasCarga");

    }


    @RequestMapping
    public String cargarArchivosPdf(Model model, @RequestParam("idQna") Integer id) {
        if (model.asMap().get("nominaDTO") == null) {
            final NominaDTO nominaDTO = 
                super.getService(GestionNominaService.class).getNomina(id);
            nominaDTO.setTipoMantenimiento("M");
            ArchivosTimbrePdfDTO archivosTimbrePdfDTO = new ArchivosTimbrePdfDTO();
            super.transformation().map(nominaDTO, archivosTimbrePdfDTO);
            model.addAttribute(archivosTimbrePdfDTO);
        }
        return super.getViewName("cargarArchivosPdf");
    }
    
    @RequestMapping
    public String updateArchivosPdf(Model model, ArchivosTimbrePdfDTO archivosTimbrePdfDTO) {

        super.getService(TercerosNominaService.class).processSatTnComprobantesPdf(archivosTimbrePdfDTO);
        super.saveMessage(model, "nomina.tercero.cargaArchivo.ok");
        return super.getViewName("cargarArchivosPdf");
    }
    
}