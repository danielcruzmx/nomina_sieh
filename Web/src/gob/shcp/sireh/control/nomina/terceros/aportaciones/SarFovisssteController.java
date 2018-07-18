package gob.shcp.sireh.control.nomina.terceros.aportaciones;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.TcTerceroDTO;
import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;
import gob.shcp.sireh.model.nomina.terceros.aportaciones.ArchivoIntSARTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.aportaciones.CargaPlantillaSARTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.aportaciones.ProcesaPeriodoSARTercerosDTO;

import gob.shcp.sireh.service.nomina.terceros.TercerosNominaService;
import gob.shcp.sireh.service.nomina.terceros.aportaciones.SarFovisssteService;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SarFovisssteController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de inicializar la forma para el proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param model Model
     * @param procesaPeriodoSARTercerosDTO ProcesaPeriodoSARTercerosDTO
     * @return String
     */
    @RequestMapping
    public String consultaPeriodoSAR(Model model, ProcesaPeriodoSARTercerosDTO procesaPeriodoSARTercerosDTO) {
        if (procesaPeriodoSARTercerosDTO.isCancel()) {
            procesaPeriodoSARTercerosDTO = new ProcesaPeriodoSARTercerosDTO();
        }
        // Bean Name pagedList
        procesaPeriodoSARTercerosDTO.setBeanName("consultaPeriodoSAR-FOV");

        // Navegacion
        procesaPeriodoSARTercerosDTO.setUrlOrigen("consultaPeriodoSAR");
        procesaPeriodoSARTercerosDTO.setUrlDestino("procesaPeriodoSAR");
        
        // Obtener bimestres validos
        ArrayList<EtiquetaClaveValorEntero> bimestresValores = getBimestreValores();
        // Combo bimestres
        procesaPeriodoSARTercerosDTO.setBimestresValores(bimestresValores);
        
        if (procesaPeriodoSARTercerosDTO.isMuestraRegistros()) {
            if (procesaPeriodoSARTercerosDTO.getCiclo() == null || procesaPeriodoSARTercerosDTO.getCiclo().equals("")) {
                super.saveError(model, "nomina.tercero.sarfovissste.error.ciclo");
                procesaPeriodoSARTercerosDTO.setMuestraRegistros(false);
            } else if (procesaPeriodoSARTercerosDTO.getBimestre() == null || procesaPeriodoSARTercerosDTO.getBimestre() == 0) {
                super.saveError(model, "nomina.tercero.sarfovissste.error.bimestre");
                procesaPeriodoSARTercerosDTO.setMuestraRegistros(false);
            } else {
            
                Integer ciclo = procesaPeriodoSARTercerosDTO.getCiclo();
                Integer bimestre = procesaPeriodoSARTercerosDTO.getBimestre();
                List<Integer> quincenas = new ArrayList<Integer>();
                
                if (bimestre == 1) {
                    quincenas.add(new Integer(ciclo + "01"));
                    quincenas.add(new Integer(ciclo + "02"));
                    quincenas.add(new Integer(ciclo + "03"));
                    quincenas.add(new Integer(ciclo + "04"));
                } else if (bimestre == 2) {
                    quincenas.add(new Integer(ciclo + "05"));
                    quincenas.add(new Integer(ciclo + "06"));
                    quincenas.add(new Integer(ciclo + "07"));
                    quincenas.add(new Integer(ciclo + "08"));
                } else if (bimestre == 3) {
                    quincenas.add(new Integer(ciclo + "09"));
                    quincenas.add(new Integer(ciclo + "10"));
                    quincenas.add(new Integer(ciclo + "11"));
                    quincenas.add(new Integer(ciclo + "12"));
                } else if (bimestre == 4) {
                    quincenas.add(new Integer(ciclo + "13"));
                    quincenas.add(new Integer(ciclo + "14"));
                    quincenas.add(new Integer(ciclo + "15"));
                    quincenas.add(new Integer(ciclo + "16"));
                } else if (bimestre == 5) {
                    quincenas.add(new Integer(ciclo + "17"));
                    quincenas.add(new Integer(ciclo + "18"));
                    quincenas.add(new Integer(ciclo + "19"));
                    quincenas.add(new Integer(ciclo + "20"));
                } else {
                    quincenas.add(new Integer(ciclo + "21"));
                    quincenas.add(new Integer(ciclo + "22"));
                    quincenas.add(new Integer(ciclo + "23"));
                    quincenas.add(new Integer(ciclo + "24"));
                }
                procesaPeriodoSARTercerosDTO.setQuincenas(quincenas);
            }
        }
        
        model.addAttribute(procesaPeriodoSARTercerosDTO);
        return super.getViewName("consultaPeriodoSAR");
    }
    
    /**
     * Metodo encargado de realizar la busqueda de nominas para el proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param model Model
     * @param procesaPeriodoSARTercerosDTO ProcesaPeriodoSARTercerosDTO
     * @return String
     */
    @RequestMapping
    public String procesaPeriodoSAR(Model model, ProcesaPeriodoSARTercerosDTO procesaPeriodoSARTercerosDTO) {
        try {
            Integer bimestre = procesaPeriodoSARTercerosDTO.getBimestre();
            Integer[] nominas = procesaPeriodoSARTercerosDTO.getIdGrupo();                        
            StringBuffer sb = new StringBuffer();
            
            for(Integer n : nominas){                
                sb.append(n).append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length()-1, sb.length());
            }
            logger.info("procesaPeriodoSAR -> nominas: " + sb.toString());
            
            super.getService(SarFovisssteService.class).procesaSARFOV("(" + sb.toString() + ")", bimestre);
            //super.getService(SarFovisssteService.class).procesaSARFOV(sb.toString(), bimestre);
            
            super.saveMessage(model, "nomina.tercero.sarfovissste.ok");
        } catch (Exception e) {
            super.saveError(model, "nomina.tercero.sarfovissste.error");
        }
        
        // Bean Name pagedList
        procesaPeriodoSARTercerosDTO.setBeanName("consultaPeriodoSAR-FOV");

        // Navegacion
        procesaPeriodoSARTercerosDTO.setUrlOrigen("consultaPeriodoSAR");
        procesaPeriodoSARTercerosDTO.setUrlDestino("procesaPeriodoSAR");
        
        // Obtener bimestres validos
        ArrayList<EtiquetaClaveValorEntero> bimestresValores = getBimestreValores();
        // Combo bimestres
        procesaPeriodoSARTercerosDTO.setBimestresValores(bimestresValores);
        
        model.addAttribute(procesaPeriodoSARTercerosDTO);
        return super.getViewName("consultaPeriodoSAR");
    }
    
    @RequestMapping
    public void getBimestreCallback(@RequestParam("ciclo") Integer ciclo, HttpServletResponse response) {
        StringBuffer sb = new StringBuffer();
        PrintWriter out = null;
        
        sb.append("<option value=''>SELECCIONE...</option>");
        try {
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
            out = response.getWriter();
        } catch (IOException e) {
            logger.debug("Exception: " + e.toString());
        }
        out.print(sb.toString());
    }
    
    /**
     * Metodo encargado de generar la lista de bimestres.
     * @author Oscar S.
     * @return bimestreValores ArrayList<EtiquetaClaveValorEntero>
     */
    private ArrayList<EtiquetaClaveValorEntero> getBimestreValores() {
        // Obtener bimestres validos
        ArrayList<EtiquetaClaveValorEntero> bimestreValores = new ArrayList<EtiquetaClaveValorEntero>();
        
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(1), "1er bimestre"));
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(2), "2do bimestre"));
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(3), "3er bimestre"));
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(4), "4to bimestre"));
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(5), "5to bimestre"));
        bimestreValores.add(new EtiquetaClaveValorEntero(new Integer(6), "6to bimestre"));
        
        return bimestreValores;
    }
    
    /**
     * Metodo encargado de recibir parametros para la carga de plantillas del proceso SAR-FOVISSSTE.
     * @author Martin Cano.
     * @param model Model
     * @param cargaPlantillaSARTercerosDTO CargaPlantillaSARTercerosDTO
     * @return String
     */
    @RequestMapping
    public String cargaPlantilla(Model model, CargaPlantillaSARTercerosDTO cargaPlantillaSARTercerosDTO) {
        if (cargaPlantillaSARTercerosDTO.isCancel()) {
            cargaPlantillaSARTercerosDTO = new CargaPlantillaSARTercerosDTO();
        }
        
        if ((cargaPlantillaSARTercerosDTO.getFile() != null) && (cargaPlantillaSARTercerosDTO.getIdTercero() != null)) {
            String parser = "-";
            Integer registros = null;
            String version = null;
            String id = cargaPlantillaSARTercerosDTO.getIdTercero();
            TcTerceroDTO tcTerceroDTO = super.getService(TercerosNominaService.class).getByIdTercero(id);
            
            if (id.equalsIgnoreCase("O")) {
                String[] array = tcTerceroDTO.getDescTercero().split(" ");
                cargaPlantillaSARTercerosDTO.setDescTercero(array[1]);
            }
            cargaPlantillaSARTercerosDTO.setIdTercero(id);
            cargaPlantillaSARTercerosDTO.setDescTercero(tcTerceroDTO.getDescTercero());

            String[] tmp = (super.getService(SarFovisssteService.class).procesarArchivo(cargaPlantillaSARTercerosDTO)).split(parser);
            registros = Integer.parseInt(tmp[0]);
            version = tmp[1];

            if (registros > 0) {
                super.saveMessage(model, "El archivo se proceso con exito, Registros: " + registros + "; Version: " + version);
                cargaPlantillaSARTercerosDTO = new CargaPlantillaSARTercerosDTO();
            } else {
                super.saveError(model, "El procesamiento del archivo tuvo problemas, verifique el archivo o la plantilla");
            }
        }
        model.addAttribute(cargaPlantillaSARTercerosDTO);
        return super.getViewName("cargaPlantilla");
    }
    
    /**
     * Metodo encargado de procesar plantillas del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param model Model
     * @param cargaPlantillaSARTercerosDTO CargaPlantillaSARTercerosDTO
     * @return String
     */
    @RequestMapping
    public String procesaPlantilla(Model model, CargaPlantillaSARTercerosDTO cargaPlantillaSARTercerosDTO) {
        model.addAttribute(cargaPlantillaSARTercerosDTO);
        return super.getViewName("cargaPlantilla");
    }
    
    /**
     * Metodo encargado de recibir parametros para generar el archivo de intercambio del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param model Model
     * @param archivoIntSARTercerosDTO ArchivoIntSARTercerosDTO
     * @return String
     */
    @RequestMapping
    public String consultaArchivoInt(Model model, ArchivoIntSARTercerosDTO archivoIntSARTercerosDTO) {
        if (archivoIntSARTercerosDTO.isCancel()) {    archivoIntSARTercerosDTO = new ArchivoIntSARTercerosDTO();   }
        
        // Obtener bimestres validos
        ArrayList<EtiquetaClaveValorEntero> bimestresValores = getBimestreValores();
        // Combo bimestres
        archivoIntSARTercerosDTO.setBimestresValores(bimestresValores);
        
        model.addAttribute(archivoIntSARTercerosDTO);
        return super.getViewName("consultaArchivoInt");
    }
    
    /**
     * Metodo encargado de generar el archivo de intercambio del proceso SAR-FOVISSSTE.
     * @author Oscar S.
     * @param model Model
     * @param archivoIntSARTercerosDTO ArchivoIntSARTercerosDTO
     * @param response HttpServletResponse
     * @return String
     */
    @RequestMapping
    public void generaArchivoInt(Model model, ArchivoIntSARTercerosDTO archivoIntSARTercerosDTO, HttpServletResponse response) {
        String fileName = null;

        try {
            if (archivoIntSARTercerosDTO.getTipoArchivo().equals("")) {
                super.saveError(model, "nomina.tercero.sarfovissste.archivoInt.error.tipoArchivo");
            } else {
                // Llamada a PKG_MOVTOS_SAR
                List<String> datos = super.getService(SarFovisssteService.class).generaArchivoIntercambio(archivoIntSARTercerosDTO.getTipoArchivo());
                StringBuilder strCsv = new StringBuilder();

                for (String renglon: datos) {
                    strCsv.append(renglon).append("\r\n");
                }

                // Tipo de archivo
                if (archivoIntSARTercerosDTO.getTipoArchivo().equals("1")) {
                    fileName = "Altas.txt";
                } else if (archivoIntSARTercerosDTO.getTipoArchivo().equals("2")) {
                    fileName = "Bajas.txt";
                } else if (archivoIntSARTercerosDTO.getTipoArchivo().equals("3")) {
                    fileName = "Cambios.txt";
                } else if (archivoIntSARTercerosDTO.getTipoArchivo().equals("4")) {
                    fileName = "Anexo.txt";
                } else if (archivoIntSARTercerosDTO.getTipoArchivo().equals("5")) {
                    fileName = "Detalle.csv";
                }

                //super.saveMessage(model, "nomina.tercero.sarfovissste.archivoInt.ok");
                // Se libera el archivo generado en el response
                byte[] bytes = strCsv.toString().getBytes();
                response.setContentType("text/plain");
                response.setContentLength(bytes.length);
                //response.setHeader("Content-Disposition", "attachment; filename=\"" + "SAR-FOVISSSTE_INTERCAMBIO_" + fileName.toUpperCase() + ".txt");
                response.setHeader("Content-Disposition", "attachment; filename=\"" + "SAR-FOVISSSTE_INTERCAMBIO_" + fileName.toUpperCase());
                OutputStream out = response.getOutputStream();
                out.write(bytes, 0, bytes.length);
            }
        } catch (Exception e) {
            super.saveError(model, "nomina.tercero.sarfovissste.archivoInt.error");
        }
    }
}