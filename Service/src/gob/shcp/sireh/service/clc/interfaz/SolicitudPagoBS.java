package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.sireh.data.jdbc.QueryTdCxlcDAO;
import gob.shcp.sireh.data.jdbc.TcBeneficiarioSicopDAO;
import gob.shcp.sireh.data.jdbc.TdCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdSecCxlcDAO;

import gob.shcp.sireh.domain.jdbc.CustomTdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicop;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicopPK;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdCxlcPK;

import gob.shcp.sireh.model.clc.interfaz.SolicitudPagoDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.DecimalFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Business Service encargado de atender solicitudes correspondientes al Modulo Solicitud Pago.
 */
public class SolicitudPagoBS extends AbstractSirehService implements SolicitudPagoService {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\r\n";
    
    // HEADER
    private static final String RAMO_EMISOR = "6";
    private static final String RAMO_CREADOR = "6";
    private static final String RAMO_RECEPTOR = "6";
    private static final String UNIDAD_EMISORA = "711";
    private static final String UNIDAD_CREADORA = "711";
    private static final String UNIDAD_RECEPTORA = "711";
    private static final String TIPO_MOVTO = "N";
    private static final String ORIGEN_PPTO = "7";
    private static final String TIPO_SOL = "5";
    private static final String TIPO_DOC = "NOM";
    private static final String NOTAS_REVERSO = "";
    private static final String TIPO_NOMINA = "10";
    private static final String AMF = "";
    private static final String RET_ISR = "0";
    private static final String RET_IVA = "0";
    private static final String RET_5 = "0";
    private static final String RET_2 = "0";
    private static final String OTRAS_RET = "0";
    private static final String PENALIZACIONES = "0";
    private static final String OTRAS_CONTRIBUCIONES = "0";
    private static final String IVA_DESGLOSADO = "0";
    private static final String IVA_ANTICIPADO = "0";
    private static final String FOLIO_DC = "0";
    private static final String TIPO_DESTINO = "NA";
    
    // BODY
    private static final String ID = "1";
    private static final String EVENTO = "000";
    private static final String RAMO = "6";
    private static final String CAU = "0000000000";
    private static final String CONTROL_OPERACION = "10";
    private static final String OFIN = "000";
    private static final String AUX_1 = "00000";
    private static final String AUX_2 = "00000";
    private static final String AUX_3 = "0000000000";
    private static final String RETENCION_IMPUESTO = "0.00";
    private static final String RETENCION_IVA = "0.00";
    private static final String CINCO_MILLAR = "0.00";
    private static final String DOS_MILLAR = "0.00";
    private static final String OTRAS_RETENCIONES = "0.00";
    private static final String PENALIZACION = "0.00";
    private static final String CONTRIBUCIONES = "0.00";
    private static final String PROGRAMA = "00000000000";
    
    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de pago con base en el objeto solicitudPagoDTO.
     * @author Oscar S.
     * @param solicitudPagoDTO SolicitudPagoDTO
     * @return solicitudPagoDTO SolicitudPagoDTO
     */
    public SolicitudPagoDTO updateGenSolPagoManual(SolicitudPagoDTO solicitudPagoDTO) throws IOException {
        StringBuffer csvContent = new StringBuffer();
        DecimalFormat formateador = new DecimalFormat("##.000000");
        
        // Paso 1) Obtener datos del beneficiario
        TcBeneficiarioSicopPK benePk = new TcBeneficiarioSicopPK();
        benePk.setBsCtaBancaria(solicitudPagoDTO.getBsCtaBancaria());
        benePk.setBsLeyenda(solicitudPagoDTO.getBsLeyenda());
        benePk.setBsTipoPago(solicitudPagoDTO.getBsTipoPago());
        benePk.setIdBeneSicop(solicitudPagoDTO.getIdBeneSicop());
        TcBeneficiarioSicop beneficiarioSicop = super.persistence().get(TcBeneficiarioSicopDAO.class).getById(benePk);
        
        // Paso 2) Obtener el maximo devengado
        List<TdCxlc> tdCxlcDevengadoList = super.persistence().get(QueryTdCxlcDAO.class).getMaxCxlcDevengado(solicitudPagoDTO.getCxlcCiclo());
        TdCxlc tdCxlcDevengado = tdCxlcDevengadoList.get(0);
        Long cxlcDevengado = tdCxlcDevengado.getCxlcDevengado();
        
        // Paso 3) Obtener el detalle de cxlc a pagar
        //List<Integer> secCxlcList = new ArrayList<Integer>();
        Set<Integer> secCxlcList = new HashSet<Integer>();
        Set<String> secCompromisoList = new HashSet<String>();
        
        for (String numeroSecCxlc : solicitudPagoDTO.getCxlcGrupo()) {
            String[] pivot = numeroSecCxlc.split("\\|");
            // Cxlc
            secCxlcList.add(new Integer(pivot[0]));
            // Compromiso
            secCompromisoList.add(String.valueOf(pivot[1]));
            
            // Paso 11) Update tabla TD_CXLC
            TdCxlc tdCxlc = super.persistence().get(TdCxlcDAO.class).getById(new TdCxlcPK(new Integer(pivot[0]), solicitudPagoDTO.getCxlcCiclo()));
            tdCxlc.setCxlcCiclo(solicitudPagoDTO.getCxlcCiclo());
            tdCxlc.setCxlc(new Integer(pivot[0]));
            tdCxlc.setCxlcDevengado(cxlcDevengado);
            tdCxlc.setUsuario(super.security().getUserName());
            tdCxlc.setFecModifico(new Date());
            super.persistence().get(TdCxlcDAO.class).save(tdCxlc);
        }
        
        // Obtener clc involucradas
        List<TdCxlc> cxlcInvolucradas = super.persistence().get(CustomTdCxlcDAO.class).getCxlcInvolucradasSolicitudPagoList(solicitudPagoDTO.getCxlcCiclo(), secCompromisoList);
        for (TdCxlc cxlcInvolucrada : cxlcInvolucradas) {
            // Cxlc
            secCxlcList.add(cxlcInvolucrada.getCxlc());
            
            // Paso 11) Update tabla TD_CXLC
            TdCxlc tdCxlc = super.persistence().get(TdCxlcDAO.class).getById(new TdCxlcPK(cxlcInvolucrada.getCxlc(), solicitudPagoDTO.getCxlcCiclo()));
            tdCxlc.setCxlcCiclo(solicitudPagoDTO.getCxlcCiclo());
            tdCxlc.setCxlc(cxlcInvolucrada.getCxlc());
            tdCxlc.setCxlcDevengado(cxlcDevengado);
            tdCxlc.setUsuario(super.security().getUserName());
            tdCxlc.setFecModifico(new Date());
            super.persistence().get(TdCxlcDAO.class).save(tdCxlc);
        }
        
        // Obtener el complemento actual
        List<TdCxlc> tdCxlcCompromisoList2 = super.persistence().get(CustomTdSecCxlcDAO.class).getCxlcCompromisoComplementoActual(solicitudPagoDTO.getCxlcCiclo(), secCxlcList);
        TdCxlc tdCxlcCompromiso2 = tdCxlcCompromisoList2.get(0);
        int cxlcComplementoActual = tdCxlcCompromiso2.getCxlcComplemento();
        
        // Obtener clc a solicitar
        List<CustomTdSecCxlc> cxlcComprometer = super.persistence().get(CustomTdSecCxlcDAO.class).getDetalleCxlcSolicitudPago(solicitudPagoDTO.getCxlcCiclo(), secCxlcList);
        
        // Paso 4) Obtener el Monto Total
        Double montoTotal = 0.00;
        for (CustomTdSecCxlc secCxlc : cxlcComprometer) {
            montoTotal += secCxlc.getMonto();
        }
        
        // Paso 5) Escribir el HEADER del documento      
        csvContent.append("H").append(SEPARATOR); // Identifica el registro encabezado
        csvContent.append(super.dateToString(solicitudPagoDTO.getFechaApli())).append(SEPARATOR); // Fecha con la que se realizara el registro de la transacción, la cual cambiara al aplicar el movimiento
        csvContent.append(super.dateToString(solicitudPagoDTO.getFechaExp())).append(SEPARATOR); // Fecha con la que se elabora la transacción, distinta a la fecha que se registra
        
        csvContent.append(RAMO_EMISOR).append(SEPARATOR); // Clave del Ramo emisor
        csvContent.append(RAMO_CREADOR).append(SEPARATOR); // Clave del Ramo creador
        csvContent.append(RAMO_RECEPTOR).append(SEPARATOR); // Clave del Ramo receptor
        
        csvContent.append(UNIDAD_EMISORA).append(SEPARATOR); // Clave de la Unidad emisora
        csvContent.append(UNIDAD_CREADORA).append(SEPARATOR); // Clave de la Unidad creadora
        csvContent.append(UNIDAD_RECEPTORA).append(SEPARATOR); // Clave de la Unidad receptora
        
        csvContent.append(TIPO_MOVTO).append(SEPARATOR); // Tipo de movimiento
        csvContent.append(ORIGEN_PPTO).append(SEPARATOR); // Origen del presupuesto
        csvContent.append(TIPO_SOL).append(SEPARATOR); // Tipo de solicitud
        csvContent.append(beneficiarioSicop.getBsTipoMoneda()).append(SEPARATOR); // Tipo de moneda
        // Tipo de cambio
        if (beneficiarioSicop.getBsTipoMoneda().equals("MXN")) {
            csvContent.append(formateador.format(1)).append(SEPARATOR);
        } else {
            csvContent.append(formateador.format(solicitudPagoDTO.getTipoCambio())).append(SEPARATOR);
        }
        csvContent.append(TIPO_DOC).append(SEPARATOR); // Tipo docto
        
        csvContent.append(solicitudPagoDTO.getConcepto()).append(SEPARATOR); // Concepto del compromiso
        csvContent.append(NOTAS_REVERSO).append(SEPARATOR); // Notas Reverso
        csvContent.append(solicitudPagoDTO.getQnaPago()).append(SEPARATOR); // Periodo de pago
        csvContent.append(TIPO_NOMINA).append(SEPARATOR); // Tipo nomina
        csvContent.append(AMF).append(SEPARATOR); // AMF
        csvContent.append(cxlcDevengado).append(SEPARATOR); // Número de solicitud
        
        csvContent.append(RET_ISR).append(SEPARATOR); // Retención de impuesto
        csvContent.append(RET_IVA).append(SEPARATOR); // Retención de IVA
        csvContent.append(RET_5).append(SEPARATOR); // Retención 5 al mil
        csvContent.append(RET_2).append(SEPARATOR); // Retención 2 al mil
        csvContent.append(OTRAS_RET).append(SEPARATOR); // Otras retenciones
        csvContent.append(PENALIZACIONES).append(SEPARATOR); // Penalizaciones
        csvContent.append(OTRAS_CONTRIBUCIONES).append(SEPARATOR); // Otras contribuciones
        csvContent.append(IVA_DESGLOSADO).append(SEPARATOR); // Iva Desglosado
        csvContent.append(IVA_ANTICIPADO).append(SEPARATOR); // Iva Anticipado
        csvContent.append(FOLIO_DC).append(SEPARATOR); // Folio DC
        
        csvContent.append(TIPO_DESTINO); // Tipo Destino
        csvContent.append(NEW_LINE);
        
        // Paso 6) Escribir el BODY del documento
        int filas =  cxlcComprometer.size();
        int contador = 0;
         
        for (CustomTdSecCxlc secCxlc : cxlcComprometer) {
            contador ++;
            
            csvContent.append(ID).append(SEPARATOR); // ID
            csvContent.append(EVENTO).append(SEPARATOR); // EVENTO
            csvContent.append(RAMO).append(SEPARATOR); // RA
            
            csvContent.append(secCxlc.getIdUnidad()).append(SEPARATOR); // UR
            csvContent.append(secCxlc.getSecCxlcCiclo()).append(SEPARATOR); // A
            
            csvContent.append(secCxlc.getIdFuncion().substring(0, 1)).append(SEPARATOR); // FINALIDAD
            csvContent.append(secCxlc.getIdFuncion().substring(1, 2)).append(SEPARATOR); // F
            csvContent.append(secCxlc.getIdFuncion().substring(2, 4)).append(SEPARATOR); // SF
            
            csvContent.append(secCxlc.getIdUnidadEjecuto()).append(SEPARATOR); // RG
            csvContent.append(secCxlc.getIdActInsti()).append(SEPARATOR); // AI
            csvContent.append(secCxlc.getIdActPriorita()).append(SEPARATOR); // PP
            
            csvContent.append(secCxlc.getIdPartida().substring(0, 1)).append(SEPARATOR); // CA
            csvContent.append(secCxlc.getIdPartida().substring(1, 2)).append(SEPARATOR); // CO
            csvContent.append(secCxlc.getIdPartida().substring(2, 3)).append(SEPARATOR); // PARG
            csvContent.append(secCxlc.getIdPartida().substring(3, 5)).append(SEPARATOR); // PA
            
            csvContent.append(secCxlc.getIdTipoGasto()).append(SEPARATOR); // TG
            csvContent.append(secCxlc.getIdFuenteFinan()).append(SEPARATOR); // FF
            csvContent.append(super.rellenaCeros(secCxlc.getIdEdo(), 2)).append(SEPARATOR); // Entidad Federativa
            csvContent.append(PROGRAMA).append(SEPARATOR); // Clave de cartera
            
            csvContent.append(CAU).append(SEPARATOR);
            csvContent.append(secCxlc.getIdUnidad() != null && secCxlc.getIdUnidad().equals("G00") ? "00" : "10").append(SEPARATOR); // Control Opera (Se modifica alineada a la sol compromiso
            csvContent.append(secCxlc.getIdActInstiEsp()).append(SEPARATOR);
            csvContent.append(OFIN).append(SEPARATOR);
            csvContent.append(AUX_1).append(SEPARATOR);
            csvContent.append(AUX_2).append(SEPARATOR);
            csvContent.append(AUX_3).append(SEPARATOR);
            
            csvContent.append(secCxlc.getSecCompromiso()).append(SEPARATOR); // Numero Compromiso
            csvContent.append(secCxlc.getMonto()).append(SEPARATOR); // Monto
            csvContent.append(solicitudPagoDTO.getMes()).append(SEPARATOR); // Mes
            csvContent.append(secCxlc.getSecTipoCpto()).append(SEPARATOR); // Tipo de concepto
            csvContent.append(secCxlc.getSecCptoMovto()).append(SEPARATOR); // Concepto Movimiento
            
            csvContent.append(RETENCION_IMPUESTO).append(SEPARATOR); // Retención Impuesto
            csvContent.append(RETENCION_IVA).append(SEPARATOR); // Retención IVA
            csvContent.append(CINCO_MILLAR).append(SEPARATOR); // 5 al mil
            csvContent.append(DOS_MILLAR).append(SEPARATOR); // 2 al mil
            csvContent.append(OTRAS_RETENCIONES).append(SEPARATOR); // Otras Retenciones
            csvContent.append(PENALIZACION).append(SEPARATOR); // Penalización
            csvContent.append(CONTRIBUCIONES).append(SEPARATOR); // Contribuciones
             
            csvContent.append(cxlcDevengado); // Número de solicitud
            
            if (filas == contador) {
                csvContent.append("");
            } else {
                csvContent.append(NEW_LINE);
            }
        }
        
        // Paso 7) Generar el nombre del archivo 
        byte[] bytes = csvContent.toString().getBytes();
        /*String fileName = generateFileName(solicitudPagoDTO.getIdTipoNomina(), 
                                           solicitudPagoDTO.getCxlcQnaPago(), 
                                           String.valueOf(cxlcCompromiso));*/
        String fileName = generateFileName(solicitudPagoDTO.getIdTipoNomina(), 
                                           solicitudPagoDTO.getCxlcQnaPagoMultiple(), 
                                           cxlcComplementoActual,
                                           String.valueOf(cxlcDevengado));
                                           
        //solicitudPagoDTO.setFileName(fileName + ".zip");
        solicitudPagoDTO.setFileName(fileName + ".csv");
        
        String fileNameRandom = UUID.randomUUID().toString();
        String nameFileDat =  fileNameRandom + ".csv";
        //String zipFileDat =  fileNameRandom + ".zip";
        
        // Paso 8) Colocar el archivo CSV en el directorio temporal
        String rutaArchivo = super.configuration().getString("local.temp.dir");
        File file = new File(rutaArchivo + File.separator + nameFileDat);
        FileOutputStream fos = new FileOutputStream(file);
        
        fos.write(bytes);
        fos.close();
        
        // Paso 9) Colocar el archivo ZIP en el directorio temporal        
        //final File f = new File(rutaArchivo + File.separator + zipFileDat);
        //final ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
        
        //ZipEntry e = new ZipEntry(fileName + ".csv");
        //out.putNextEntry(e);
        
        //out.write(bytes, 0, bytes.length);
        //out.closeEntry();
        //out.close();
        
        // Paso 9) Nombre y PATH del archivo generado
        solicitudPagoDTO.setCsvFileName(nameFileDat);
        solicitudPagoDTO.setCsvFilePath(rutaArchivo);
        
        //solicitudPagoDTO.setZipFileName(zipFileDat);
        //solicitudPagoDTO.setZipFilePath(rutaArchivo);
        
        return solicitudPagoDTO;
    }
    
    /**
     * Metodo encargado de generar el nombre de archivo.
     * @author Oscar S.
     * @param nomina String
     * @param quincena String
     * @param compromiso String
     * @return fileName String
     */
    private String generateFileName(String nomina, String quincena, Integer complemento, String compromiso) {
        StringBuffer fileName = new StringBuffer();
        
        fileName.append("SOL-PAGO").append(" ");
        fileName.append(nomina).append("-");
        
        String[] temp = quincena.split(",");
        for (int i = 0; i < temp.length; i++) {
            fileName.append(generaQuincena(new Integer(temp[i]))).append("-");
        }
        
        fileName.append("C").append(complemento).append("-");
        fileName.append(compromiso);
        
        return fileName.toString();
    }
    
    /**
     * Metodo encargado de generar el string para la quincena
     * @author Oscar S.
     * @param quincena Integer
     * @return qna String
     */
    private String generaQuincena(Integer quincena) {
        StringBuffer qna = new StringBuffer();
        
        qna.append("Q");
        qna.append(String.valueOf(quincena).substring(4, 6));
        qna.append(String.valueOf(quincena).substring(2, 4));
        
        return qna.toString();
    }
}
