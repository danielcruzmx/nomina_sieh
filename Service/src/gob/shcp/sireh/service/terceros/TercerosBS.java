package gob.shcp.sireh.service.terceros;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.fsn.service.ServiceException;
import gob.shcp.sireh.data.jdbc.QueryGeneraTercerosDAO;
import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnMovtoConceptoPagoDAO;

import gob.shcp.sireh.data.jdbc.support.CustomArmaArchivoTercerosDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.PadronFonac;
import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.GnpDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;
import gob.shcp.sireh.service.SirehUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

import java.io.IOException;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**
 * Business Service encargado de atender solicitudes de generacion de terceros 
 */
public class TercerosBS extends AbstractService implements TercerosService {

    private static final int BUFFER = 2048;


    /**
     * Servicio para obtener la informacion de nómina para armar el archivo de terceros
     * @author Roberto Muñoz
     * @param generaArchivosTercerosDTO
     * @return Lista, Datos del archivo
     */
    public List<Map<Integer, Object>> getDatosTerceros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        String datosi = generaArchivosTercerosDTO.getLlaveTercero();
        String tempi[];
        tempi = datosi.split("°");
        generaArchivosTercerosDTO.setIdTercero(tempi[0].trim());
        generaArchivosTercerosDTO.setDescTercero(tempi[1].trim());
        generaArchivosTercerosDTO.setDatTipoCpto(tempi[2].trim());
        generaArchivosTercerosDTO.setDatConcepto(tempi[3].trim());
        String idTercero      = generaArchivosTercerosDTO.getIdTercero();
        String datTipoCpto    = generaArchivosTercerosDTO.getDatTipoCpto();
        String datConcepto    = generaArchivosTercerosDTO.getDatConcepto();
        Integer hpQnaPago     = generaArchivosTercerosDTO.getHpQnaPago();
        Integer hpQnaPagoFin  = generaArchivosTercerosDTO.getHpQnaPagoFin();
        String hpConsecNomina = generaArchivosTercerosDTO.getHpConsecNomina();
        String agrupaVerEmp   = generaArchivosTercerosDTO.getAgrupaVerEmp();
        String estadoPago     = generaArchivosTercerosDTO.getEstadoPago();
        logger.debug("------------->" + idTercero + "-" + datTipoCpto + "-" + datConcepto + "-" + hpQnaPago + "-" + hpQnaPagoFin + "-" + hpConsecNomina + "-" + agrupaVerEmp);

        try {
            return super.persistence().get(CustomArmaArchivoTercerosDAO.class).getDatosTerceros(idTercero, datTipoCpto, 
                                                                                                datConcepto, 
                                                                                                hpQnaPago, hpQnaPagoFin, 
                                                                                                hpConsecNomina, 
                                                                                                agrupaVerEmp, 
                                                                                                estadoPago);
        } catch (Exception e) {
            // TODO
            e.printStackTrace();
            throw new ServiceException("Hay inconstencias en los datos capturados en el registro de terceros. Revise e intente de nuevo.");
            //return new ArrayList<Map<Integer, Object>>();
        }
    }
    


    public List<String> getDatosSericaEnc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> lista = null;
        // TipoQna == 0 En quincena, Invocamos la nomina Ordinaria
        if(generaArchivosTercerosDTO.getTipoQna() != null && generaArchivosTercerosDTO.getTipoQna().intValue() == 0){    
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSerica(generaArchivosTercerosDTO.getHpQnaPago(), generaArchivosTercerosDTO.getHpIniPago(), "O", "1", Integer.valueOf(generaArchivosTercerosDTO.getHpConsecNomina()) );
        }
        // TipoQna == 1 En NO quincena, Invocamos la nomina ExtraOrdinaria
        else if(generaArchivosTercerosDTO.getTipoQna() != null && generaArchivosTercerosDTO.getTipoQna().intValue() == 1){
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSericaExtra(generaArchivosTercerosDTO.getHpQnaPago(), generaArchivosTercerosDTO.getHpIniPago(), "E", "1", Integer.valueOf(generaArchivosTercerosDTO.getHpConsecNomina()) );
        }
        List<String> listaString = new ArrayList<String>();
                for (CustomOutputFile row: lista) {
                    listaString.add(row.getRegistro());
                }
                return listaString;
        
    }

    public List<String> getDatosIsssteFiliacion(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();

        if (generaArchivosTercerosDTO.getTipoEntero().equalsIgnoreCase("e")) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpIsssteEntero(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                generaArchivosTercerosDTO.getHpIniPago(), 
                                                                                                generaArchivosTercerosDTO.getHpConsecNomina(), 
                                                                                                generaArchivosTercerosDTO.getTipoQna());
        } else if (generaArchivosTercerosDTO.getTipoEntero().equalsIgnoreCase("c")) {
            lista = 
                    super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpIsssteCancelado(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                   generaArchivosTercerosDTO.getHpIniPago(), 
                                                                                                   generaArchivosTercerosDTO.getHpConsecNomina(), 
                                                                                                   generaArchivosTercerosDTO.getTipoQna());
        } else if (generaArchivosTercerosDTO.getTipoEntero().equalsIgnoreCase("d")) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpIsssteDevoluciones(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                      generaArchivosTercerosDTO.getHpIniPago(), 
                                                                                                      generaArchivosTercerosDTO.getHpConsecNomina(), 
                                                                                                      generaArchivosTercerosDTO.getTipoQna());
        } else {
            lista = null;
        }

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    public List<String> getDatosIssstePrest(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();

        if (generaArchivosTercerosDTO.getTipoEntero().equalsIgnoreCase("e")) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpPIsssteEntero(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                 generaArchivosTercerosDTO.getHpIniPago(), 
                                                                                                 generaArchivosTercerosDTO.getHpConsecNomina(), 
                                                                                                 generaArchivosTercerosDTO.getTipoQna());
        } else if (generaArchivosTercerosDTO.getTipoEntero().equalsIgnoreCase("c")) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpPIsssteCancelado(generaArchivosTercerosDTO.getHpQnaPago(), 
                                                                                                    generaArchivosTercerosDTO.getHpIniPago(), 
                                                                                                    generaArchivosTercerosDTO.getHpConsecNomina(), 
                                                                                                    generaArchivosTercerosDTO.getTipoQna());
        } else {
            lista = null;
        }

        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else
            listaString = null;
        return listaString;
    }
    
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String> processSatTimbrado(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        if (generaArchivosTercerosDTO.getHpConsecNomina() != null && !generaArchivosTercerosDTO.getHpConsecNomina().equals("0")) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSatTimbrado(generaArchivosTercerosDTO.getHpQnaPago(), Integer.valueOf(generaArchivosTercerosDTO.getHpConsecNomina()));
        }
        logger.debug("-----------------> processSatTimbrado -> lista: " + lista.size());
        
        List<String> listaString = new ArrayList<String>();
        for (CustomOutputFile row: lista) {
            listaString.add(row.getRegistro());
        }
        logger.debug("-----------------> processSatTimbrado -> listaString: " + listaString.size());
        return listaString;
    }
    
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author Oscar S.
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    public GeneraArchivosTercerosDTO processSatTimbradoV2(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        
        if (generaArchivosTercerosDTO.getHpConsecNomina() != null && !generaArchivosTercerosDTO.getHpConsecNomina().equals("0")) {
            items = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSatTimbrado(generaArchivosTercerosDTO.getHpQnaPago(), Integer.valueOf(generaArchivosTercerosDTO.getHpConsecNomina()));
        }
        logger.debug("-----------------> processSatTimbradoV2 -> items: " + items.size());
        
        String fileName = "SAT_Timbrado_QNA.txt";
        String fileNameRandom = UUID.randomUUID().toString();
        String nameFileDat =  fileNameRandom + ".txt";
        generaArchivosTercerosDTO.setTxtFileName(nameFileDat);
        
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File(super.configuration().getString("local.temp.dir") + File.separator + nameFileDat), true));
            
            for (CustomOutputFile item : items) {
                // Escribir en archivo                
                bw.write(new StringBuilder().append(item.getRegistro()).toString());
                bw.newLine();
            }
        } catch (Exception e) {
            logger.debug("Exception: " + e);
        } finally {
           try {
               bw.close();
           } catch (Exception e) {
               logger.debug("Exception: " + e);
           }
       }
       
       //Envía a zipear el archivo
        Map<String, String> map = new HashMap<String, String>();
        map.put(super.configuration().getString("local.temp.dir") + File.separator + nameFileDat, "SAT_Timbrado_QNA.txt");
        zipFile(map, super.configuration().getString("local.temp.dir") + File.separator + fileNameRandom + ".zip");
        generaArchivosTercerosDTO.setTxtFileName(fileNameRandom + ".zip");
        return generaArchivosTercerosDTO;
    }
    
    public void zipFile(Map<String,String> filesMap, String zipFile) {

        try {
            BufferedInputStream origen = null;
            FileOutputStream dest = 
                new FileOutputStream(zipFile);
            ZipOutputStream out = 
                new ZipOutputStream(new BufferedOutputStream(dest));
            //out.setMethod(ZipOutputStream.DEFLATED);
            byte data[] = new byte[BUFFER];
            // get a list of files from current directory


             for(Map.Entry<String, String> entry : filesMap.entrySet()){
                
                FileInputStream fi = new FileInputStream(entry.getKey());
                origen = new BufferedInputStream(fi, BUFFER);
                ZipEntry zipEntry = new ZipEntry(entry.getValue());
                out.putNextEntry(zipEntry);
                int count;
                while ((count = origen.read(data, 0, BUFFER)) != -1) {
                    out.write(data, 0, count);
                }
                origen.close();
            }
            out.close();
        } catch (FileNotFoundException e) {
            // TODO
        } catch (IOException e) {
            // TODO
        }
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
            logger.debug("Exception: " + e);
        }
    }

    public List<String> getDatosSatTimbradoCanc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> lista = null;
        if (generaArchivosTercerosDTO.getHpQnaPago() != null && generaArchivosTercerosDTO.getHpQnaPago() != 0) {
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSatTimbradoCanc(generaArchivosTercerosDTO.getHpQnaPago());
        }
        
        List<String> listaString = new ArrayList<String>();
        for (CustomOutputFile row: lista) {
            listaString.add(row.getRegistro());
        }
        return listaString;
    }
    
    public List<String> getDatosTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
       
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).exeSpTerceroFonacot(
        new Integer(generaArchivosTercerosDTO.getQnaIni()),
        new Integer(generaArchivosTercerosDTO.getQnaFin()),
        new Integer(generaArchivosTercerosDTO.getCiclo()),
        new Integer(generaArchivosTercerosDTO.getMes()) );
       
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getDatosTerceroFonacot(  
        new Integer(generaArchivosTercerosDTO.getCiclo()),
        new Integer(generaArchivosTercerosDTO.getMes()));
        
        listaString.add("No_FONACOT, RFC, NOMBRE, No_CREDITO, RETENCION_MENSUAL, CLAVE_EMPLEADO, PLAZO, CUOTAS_PAGADAS, RETENCION_REAL, INCIDENCIA, FECHA_INI_BAJA, FECHA_FIN   REUBICADO");                                                                                        
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                
                listaString.add(row.getRegistro());
            }
        } else {  listaString = null;  }
        return listaString;
    }
    
    public List<String> validaTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).exeSpTerceroFonacot(
        new Integer(generaArchivosTercerosDTO.getQnaIni()),
        new Integer(generaArchivosTercerosDTO.getQnaFin()),
        new Integer(generaArchivosTercerosDTO.getCiclo()),
        new Integer(generaArchivosTercerosDTO.getMes()) );
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).validaTerceroFonacot(
        new Integer(generaArchivosTercerosDTO.getCiclo()),
        new Integer(generaArchivosTercerosDTO.getMes()) );
        
        listaString.add("No_FONACOT, RFC, NOMBRE, No_CREDITO, RETENCION_MENSUAL, CLAVE_EMPLEADO, PLAZO, CUOTAS_PAGADAS, RETENCION_REAL, INCIDENCIA, FECHA_INI_BAJA, FECHA_FIN   REUBICADO");                                                                       
        
        if (lista != null) {
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else {  listaString = null;  }
        return listaString;
    }
    /**
     * Metodo encargado de generar el archivo de ISSSTE SIPE
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String> processisssteSIPE(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
    if (generaArchivosTercerosDTO.getTipoArc() == 0) {
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpisssteSIPEaltas(Integer.valueOf(generaArchivosTercerosDTO.getQnaIni()));
    } else if (generaArchivosTercerosDTO.getTipoArc() == 1) {
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpisssteSIPEbajas(Integer.valueOf(generaArchivosTercerosDTO.getQnaIni())); 
    } else if (generaArchivosTercerosDTO.getTipoArc() == 2) {
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpisssteSIPEcambios(Integer.valueOf(generaArchivosTercerosDTO.getQnaIni()));
    } else {
        lista = null;
    }

    if (lista != null) {
        for (CustomOutputFile row: lista) {
            listaString.add(row.getRegistro());
        }
    }
    return listaString;
    }
    
    public List<String> getDatosSericaC(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
       List<CustomOutputFile> lista = null;
       if(generaArchivosTercerosDTO.getHpQnaPago() != null && generaArchivosTercerosDTO.getHpQnaPago() != 0){    
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpSericaC(generaArchivosTercerosDTO.getHpQnaPago());
       }
       List<String> listaString = new ArrayList<String>();
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        return listaString;
    }
    
    public Integer getNumRegistrosPadronFonac(){
       return super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).getNumRegistrosPadronFonac().get(0).getMcpQnaAplicadas();
    }
    
    public Integer getNumRegistrosAfectadosPadronFonac(){
       return super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).getNumRegistrosAfectadosPadronFonac().get(0).getMcpQnaAplicadas();
    }

    public void bajaPadronFonac(PadronFonacDTO padronFonacDTO){
        PadronFonac padronFonac = super.transformation().map(padronFonacDTO, PadronFonac.class);
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).bajaPadronFonac(padronFonac);
    }
    
    public void padronFonacOrdinario(PadronFonacDTO padronFonacDTO){
        padronFonacDTO.setUsuario(super.security().getUserName());
        PadronFonac padronFonac = super.transformation().map(padronFonacDTO, PadronFonac.class);
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).padronFonacOrdinario(padronFonac);
    }
    
    public void padronFonacExtraOrdinario(PadronFonacDTO padronFonacDTO){
        padronFonacDTO.setUsuario(super.security().getUserName());
        PadronFonac padronFonac = super.transformation().map(padronFonacDTO, PadronFonac.class);
        super.persistence().get(CustomArmaArchivoTercerosDAO.class).padronFonacExtraOrdinario(padronFonac);
    }
    
    public List<String> getEmisionChequesFonac(PadronFonacDTO padronFonacDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        List<String> auxListaString = new ArrayList<String>();
        StringBuilder sb = null;
        List<TnHistoricoPago> nomina;
        String [] subStrings;
        StringBuilder importeLetras;
        
        nomina = super.persistence().get(QueryTnHistoricoPagoDAO.class).getEmisionChequesFonac(padronFonacDTO.getCicloEmision(),padronFonacDTO.getCicloRemesa(),padronFonacDTO.getRemesa()); 
        
        if(nomina != null && nomina.size() > 0){
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getEmisionChequesFonacFile(nomina.get(0).getIdTipoNomina());
            if (lista != null && lista.size() > 0){
                for (CustomOutputFile row: lista) {
                    listaString.add(row.getRegistro());
                }
            
                for(String string : listaString) {
                    subStrings = string.split(",");
                    importeLetras = new StringBuilder();
                    importeLetras.append(SirehUtils.convertirLetras(new BigDecimal(subStrings[0].replaceAll(",", "") ).intValue()).toUpperCase() );
                    importeLetras.append(" PESOS ");
                    String subSubString = subStrings[0].replaceAll(",", "");
                    String [] aSubSubString = subSubString.split("\\.");
                    if(aSubSubString.length > 1){
                        subSubString = aSubSubString[1];
                    } else {  subSubString = "00";  }
                    
                    importeLetras.append(subSubString);
                    importeLetras.append("/100");
                    importeLetras.append(" M.N.");
                    sb = new StringBuilder();
                    sb.append(subStrings[0]);
                    sb.append(",");
                    sb.append(importeLetras);
                    sb.append(",");
                    sb.append(subStrings[1]);
                    sb.append(",");
                    sb.append(subStrings[2]);
                    auxListaString.add(sb.toString());
                }
                listaString = auxListaString;
            } else
                listaString = null;
        }
         return listaString;
    }
 
    public List<String> getliquidaCifrasFonac(PadronFonacDTO padronFonacDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        List<TnHistoricoPago> nomina;
        
        nomina = super.persistence().get(QueryTnHistoricoPagoDAO.class).getEmisionChequesFonac(padronFonacDTO.getCicloEmision(),padronFonacDTO.getCicloRemesa(),padronFonacDTO.getRemesa()); 
        
        if(nomina != null && nomina.size() > 0){
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getliquidaCifrasFonac(nomina.get(0).getIdTipoNomina());
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
            } else{  listaString = null; }
         return listaString;
    } 

    public List<String> getChequesFonac(PadronFonacDTO padronFonacDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        List<String> auxListaString = new ArrayList<String>();
        StringBuilder sb = null;
        List<TnHistoricoPago> nomina;
        String [] subStrings;
        StringBuilder importeLetras;
        
        nomina = super.persistence().get(QueryTnHistoricoPagoDAO.class).getChequesFonac(padronFonacDTO.getCicloEmision(),padronFonacDTO.getCicloRemesa(),padronFonacDTO.getRemesa()); 
        
        if(nomina != null && nomina.size() > 0){
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getChequesFonacFile(nomina.get(0).getIdTipoNomina());
            if (lista != null && lista.size() > 0) {
                for (CustomOutputFile row: lista) {
                    listaString.add(row.getRegistro());
                }
            
                for(String string : listaString) {
                    subStrings = string.split(",");
                    importeLetras = new StringBuilder();
                    importeLetras.append(SirehUtils.convertirLetras(new BigDecimal(subStrings[0].replaceAll(",", "") ).intValue()).toUpperCase() );
                    importeLetras.append(" PESOS ");
                    String subSubString = subStrings[0].replaceAll(",", "");
                    String [] aSubSubString = subSubString.split("\\.");
                    if(aSubSubString.length > 1){
                        subSubString = aSubSubString[1];
                    } else {  subSubString = "00";  }
                    
                    importeLetras.append(subSubString);
                    importeLetras.append("/100");
                    importeLetras.append(" M.N.");
                    sb = new StringBuilder();
                    sb.append(subStrings[0]);
                    sb.append(",");
                    sb.append(importeLetras);
                    sb.append(",");
                    sb.append(subStrings[1]);
                    sb.append(",");
                    sb.append(subStrings[2]);
                    auxListaString.add(sb.toString());
                }
                listaString = auxListaString;
            } else
                listaString = null;
        }
         return listaString;
    }
 
    public List<String> getCifrasFonac(PadronFonacDTO padronFonacDTO){
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<String> listaString = new ArrayList<String>();
        List<TnHistoricoPago> nomina;
        
        nomina = super.persistence().get(QueryTnHistoricoPagoDAO.class).getChequesFonac(padronFonacDTO.getCicloEmision(),padronFonacDTO.getCicloRemesa(),padronFonacDTO.getRemesa()); 
        
        if(nomina != null && nomina.size() > 0){
            lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getCifrasFonac(nomina.get(0).getIdTipoNomina());
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
            } else{  listaString = null; }
         return listaString;
    } 
 
    public List<String> getDatosGnpImp(GnpDTO gnpDTO) {
        List<CustomOutputFile> lista = null;
        if(gnpDTO.getQnaIni() != null && gnpDTO.getQnaFin() != null){    
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpGnpImp(gnpDTO.getQnaIni(), gnpDTO.getQnaFin());
        }

        List<String> listaString = new ArrayList<String>();
                for (CustomOutputFile row: lista) {
                    listaString.add(row.getRegistro());
                }
                return listaString;       
    }

    public List<String> getDatosGnpMov(GnpDTO gnpDTO) {
        List<CustomOutputFile> lista = null;
        if(gnpDTO.getQnaIni() != null && gnpDTO.getQnaFin() != null){    
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).findBySpGnpMov(gnpDTO.getQnaIni(), gnpDTO.getQnaFin());
        }

        List<String> listaString = new ArrayList<String>();
                for (CustomOutputFile row: lista) {
                    listaString.add(row.getRegistro());
                }
                return listaString;       
    }


    /**
     * Metodo encargado de generar archivo para PENSIONISSSTE.
     * @author Ricardo León E..
     * @param qnaCaptura String
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> generaPensionIssste(String qnaCaptura) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();

        items = super.persistence().get(QueryTnHistoricoPagoDAO.class).generaPensionIssste(qnaCaptura);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
                listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /**
     * Metodo encargado de generar archivo de aportaciones de FONAC.
     * @author Ricardo León E..
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> getAportacionesFonac(PadronFonacDTO padronFonacDTO){
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> lista = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        //List<TnHistoricoPago> nomina;
        
        lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getAportacionesFonac(padronFonacDTO.getRfcUnico(), padronFonacDTO.getQnaInicio(), padronFonacDTO.getQnaFinal(), padronFonacDTO.getRegistro(), padronFonacDTO.getTipo()); 
        
        if(lista != null){
            //lista = super.persistence().get(QueryTnHistoricoPagoDAO.class).getAportacionesFonac(padronFonacDTO.getQnaInicio(),padronFonacDTO.getQnaFinal(),padronFonacDTO.getRfcUnico(),padronFonacDTO.getRegistro(),padronFonacDTO.getTipo());
            for (CustomOutputFile row: lista) {
                listaString.add(row.getRegistro());
            }
        } else{  listaString = null; }
        return listaString;
    } 

     /**
     * Metodo que genera archivo de padron para FONACOT
     * @author Ricardo León E.
     * @param quincena, ciclo
     * @return listaString List<String>;
     */
    public List<String> getPadronFonacot(Integer ciclo, String quincena) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryGeneraTercerosDAO.class).getPadronFonacot(ciclo, quincena);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /**
    * Metodo que genera archivo de pago del Seguro Institucional de la nómina ordinaria
    * @author Ricardo León E.
    * @param quincena
    * @return listaString List<String>;
    */
    public List<String> getSegInstOrdinario(String quincena) {
       List<String> listaString = new ArrayList<String>();
       List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
       List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
       
       items = super.persistence().get(QueryGeneraTercerosDAO.class).getSegInstOrdinario(quincena);
       
       if (items != null) {
           for (CustomOutputFile row: items) {
              listaString.add(row.getRegistro());
           }
       }
       return listaString;
    }

    /**
    * Metodo que genera archivo de pago del Seguro Institucional de la nómina extraordinaria
    * @author Ricardo León E.
    * @param quincena
    * @return listaString List<String>;
    */
    public List<String> getSegInstExtraordinario(String quincena) {
       List<String> listaString = new ArrayList<String>();
       List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
       List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
       
       items = super.persistence().get(QueryGeneraTercerosDAO.class).getSegInstExtraordinario(quincena);
       
       if (items != null) {
           for (CustomOutputFile row: items) {
              listaString.add(row.getRegistro());
           }
       }
       return listaString;
    }

    /**
    * Metodo que genera archivo de pago del Seguro Institucional de la nómina extraordinaria
    * @author Ricardo León E.
    * @param quincena
    * @return listaString List<String>;
    */
    public List<String> getSegInstAnticipado(String quincena) {
       List<String> listaString = new ArrayList<String>();
       List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
       List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
       
       items = super.persistence().get(QueryGeneraTercerosDAO.class).getSegInstAnticipado(quincena);
       
       if (items != null) {
           for (CustomOutputFile row: items) {
              listaString.add(row.getRegistro());
           }
       }
       return listaString;
    }

}