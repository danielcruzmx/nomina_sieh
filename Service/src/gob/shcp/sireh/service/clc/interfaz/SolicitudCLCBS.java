package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.sireh.data.jdbc.TcBeneficiarioSicopDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdSecCxlcDAO;

import gob.shcp.sireh.domain.jdbc.CustomTdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicop;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicopPK;
import gob.shcp.sireh.domain.jdbc.TdCxlc;

import gob.shcp.sireh.model.clc.interfaz.SolicitudCLCDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.DecimalFormat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Business Service encargado de atender solicitudes correspondientes al Modulo Solicitud CLC.
 */
public class SolicitudCLCBS extends AbstractSirehService implements SolicitudCLCService {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\r\n";
    
    // HEADER
    private static final String RAMO_EMISOR = "6";
    private static final String RAMO_CREADOR = "6";
    private static final String RAMO_RECEPTOR = "6";
    private static final String UNIDAD_EMISORA = "711";
    private static final String UNIDAD_CREADORA = "711";
    private static final String TIPO_MOVTO = "N";
    private static final String ORIGEN_PPTO = "7";
    private static final String TIPO_SOL = "5";
    private static final String RFC = "SAT970701NN3";
    private static final String TIPO_DOCTO = "NOM";
    
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
    private static final String IMPORTE = "0.00";
    private static final String TIPO_NOM = "10";
    private static final String PROGRAMA = "00000000000";
    
    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de CLC con base en el objeto solicitudCLCDTO.
     * @author Oscar S.
     * @param solicitudCLCDTO SolicitudCLCDTO
     * @return solicitudCLCDTO SolicitudCLCDTO
     */
    public SolicitudCLCDTO genSolCLCManual(SolicitudCLCDTO solicitudCLCDTO) throws IOException {
        StringBuffer csvContent = new StringBuffer();
        DecimalFormat formateador = new DecimalFormat("##.000000");
        
        // Paso 1) Obtener datos del beneficiario
        TcBeneficiarioSicopPK benePk = new TcBeneficiarioSicopPK();
        benePk.setBsCtaBancaria(solicitudCLCDTO.getBsCtaBancaria());
        benePk.setBsLeyenda(solicitudCLCDTO.getBsLeyenda());
        benePk.setBsTipoPago(solicitudCLCDTO.getBsTipoPago());
        benePk.setIdBeneSicop(solicitudCLCDTO.getIdBeneSicop());
        TcBeneficiarioSicop beneficiarioSicop = super.persistence().get(TcBeneficiarioSicopDAO.class).getById(benePk);
        
        // Paso 2) Obtener el detalle de cxlc a comprometer
        //List<Integer> secCxlcList = new ArrayList<Integer>();
        Set<Integer> secCxlcList = new HashSet<Integer>();
        for (int numeroSecCxlc : solicitudCLCDTO.getCxlcGrupo()) {
            secCxlcList.add(numeroSecCxlc);
        }
        List<CustomTdSecCxlc> cxlcComprometer = super.persistence().get(CustomTdSecCxlcDAO.class).getDetalleCxlcSolicitudCLC(solicitudCLCDTO.getCxlcCiclo(), secCxlcList);
        
        // Paso 3) Obtener el compromiso y complemento actual
        List<TdCxlc> tdCxlcCompromisoList = super.persistence().get(CustomTdSecCxlcDAO.class).getCxlcCompromisoComplementoActual(solicitudCLCDTO.getCxlcCiclo(), secCxlcList);
        TdCxlc tdCxlcCompromiso = tdCxlcCompromisoList.get(0);
        Long cxlcCompromisoActual = tdCxlcCompromiso.getCxlcCompromiso();
        int cxlcComplementoActual = tdCxlcCompromiso.getCxlcComplemento();
        
        // Paso 4) Obtener el Monto Total
        Double montoTotal = 0.00;
        for (CustomTdSecCxlc secCxlc : cxlcComprometer) {
            montoTotal += secCxlc.getMonto();
        }
        
        // Paso 5) Escribir el HEADER del documento      
        csvContent.append("H").append(SEPARATOR); // Identifica el registro encabezado
        csvContent.append(super.dateToString(solicitudCLCDTO.getFechaExp())).append(SEPARATOR); // Fecha con la que se elabora la transacción, distinta a la fecha que se registra
        csvContent.append(super.dateToString(solicitudCLCDTO.getFechaApli())).append(SEPARATOR); // Fecha con la que se realizara el registro de la transacción, la cual cambiara al aplicar el movimiento
         
        csvContent.append(RAMO_EMISOR).append(SEPARATOR); // Clave del Ramo emisor
        csvContent.append(RAMO_CREADOR).append(SEPARATOR); // Clave del Ramo creador
        csvContent.append(RAMO_RECEPTOR).append(SEPARATOR); // Clave del Ramo receptor
        csvContent.append(UNIDAD_EMISORA).append(SEPARATOR); // Clave de la Unidad emisora
        csvContent.append(UNIDAD_CREADORA).append(SEPARATOR); // Clave de la Unidad creadora
        csvContent.append(UNIDAD_CREADORA.equals("711") ? "710" : UNIDAD_CREADORA).append(SEPARATOR); // Clave de la Unidad receptora
        
        csvContent.append(TIPO_MOVTO).append(SEPARATOR); // Tipo de movimiento
        csvContent.append(ORIGEN_PPTO).append(SEPARATOR); // Origen del presupuesto
        
        csvContent.append(TIPO_SOL).append(SEPARATOR); // Tipo de solicitud
        csvContent.append(beneficiarioSicop.getBsTipoMoneda()).append(SEPARATOR); // Tipo de moneda
        // Tipo de cambio
        if (beneficiarioSicop.getBsTipoMoneda().equals("MXN")) {
            csvContent.append(formateador.format(1)).append(SEPARATOR);
        } else {
            csvContent.append(formateador.format(solicitudCLCDTO.getTipoCambio())).append(SEPARATOR);
        }
        csvContent.append(beneficiarioSicop.getBsTipoPago()).append(SEPARATOR); // Tipo de pago
        
        csvContent.append(beneficiarioSicop.getBsLeyenda()).append(SEPARATOR); // Clave leyenda
        csvContent.append(solicitudCLCDTO.getIdBeneSicop()).append(SEPARATOR); // Clave del Beneficiario
        csvContent.append(solicitudCLCDTO.getBsCtaBancaria()).append(SEPARATOR); // Cuenta bancaria
        csvContent.append(RFC).append(SEPARATOR); // RFC
        csvContent.append(TIPO_DOCTO).append(SEPARATOR); // Tipo docto
        
        if (beneficiarioSicop.getBsTipoMoneda().equals("MXN")) {
            csvContent.append("").append(SEPARATOR); // Fecha referencia
            csvContent.append("").append(SEPARATOR); // Referencia 1
        } else {
            csvContent.append(super.dateToString(solicitudCLCDTO.getFechaRef())).append(SEPARATOR); // Fecha referencia
            csvContent.append(solicitudCLCDTO.getReferencia()).append(SEPARATOR); // Referencia 1
        }
        csvContent.append(beneficiarioSicop.getBs_ref_2() != null ? beneficiarioSicop.getBs_ref_2() : "").append(SEPARATOR); // Referencia 2
        csvContent.append(solicitudCLCDTO.getConcepto()).append(SEPARATOR); // Concepto
        
        csvContent.append(secCxlcList.iterator().next()); // Numero CXLC
        
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
            
            csvContent.append(secCxlc.getIdTipoGasto()).append(SEPARATOR); // Tipo gasto
            csvContent.append(secCxlc.getIdFuenteFinan()).append(SEPARATOR); // Fuente financiamiento
            csvContent.append(super.rellenaCeros(secCxlc.getIdEdo(), 2)).append(SEPARATOR); // Clave estado
            csvContent.append(PROGRAMA).append(SEPARATOR); // Programa
            
            csvContent.append(CAU).append(SEPARATOR);
            csvContent.append(secCxlc.getIdUnidad() != null && secCxlc.getIdUnidad().equals("G00") ? "00" : "10").append(SEPARATOR); // Control Opera (Se modifica alineada a la sol compromiso
            csvContent.append(secCxlc.getIdActInstiEsp()).append(SEPARATOR);
            csvContent.append(OFIN).append(SEPARATOR);
            csvContent.append(AUX_1).append(SEPARATOR);
            csvContent.append(AUX_2).append(SEPARATOR);
            csvContent.append(AUX_3).append(SEPARATOR);
            
            csvContent.append(secCxlc.getMonto()).append(SEPARATOR); // Monto
            csvContent.append(solicitudCLCDTO.getMes()).append(SEPARATOR); // Mes
            csvContent.append(IMPORTE).append(SEPARATOR);
            csvContent.append(secCxlc.getSecCompromiso()).append(SEPARATOR); // Numero Compromiso
            csvContent.append(solicitudCLCDTO.getQnaPago()).append(SEPARATOR); // Quincena de aplicacion
            csvContent.append(TIPO_NOM).append(SEPARATOR);
            
            csvContent.append(secCxlc.getSecTipoCpto()).append(SEPARATOR); // Tipo de concepto
            csvContent.append(secCxlc.getSecCptoMovto()).append(SEPARATOR); // Concepto Movimiento
            csvContent.append(secCxlc.getSecDevengado()).append(SEPARATOR); // Número solicitud pago
            
            csvContent.append(secCxlc.getDevengado()); // Devengado
            
            if (filas == contador) {
                csvContent.append("");
            } else {
                csvContent.append(NEW_LINE);
            }
        }
        
        // Paso 7) Generar el nombre del archivo 
        byte[] bytes = csvContent.toString().getBytes();
        /*String fileName = generateFileName(TIPO_NOM, 
                                           solicitudCLCDTO.getCxlcQnaPago(), 
                                           cxlcComplementoActual,
                                           String.valueOf(cxlcCompromisoActual));*/
        String fileName = generateFileName(solicitudCLCDTO.getIdTipoNomina(),
                                           solicitudCLCDTO.getCxlcQnaPagoMultiple(), 
                                           cxlcComplementoActual);
        //solicitudCLCDTO.setFileName(fileName + ".zip");
        solicitudCLCDTO.setFileName(fileName + ".csv");
        
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
        solicitudCLCDTO.setCsvFileName(nameFileDat);
        solicitudCLCDTO.setCsvFilePath(rutaArchivo);
        
        //solicitudCLCDTO.setZipFileName(zipFileDat);
        //solicitudCLCDTO.setZipFilePath(rutaArchivo);
        
        return solicitudCLCDTO;
    }
    
    /**
     * Metodo encargado de generar el nombre de archivo.
     * @author Oscar S.
     * @param nomina String
     * @param quincena String
     * @return fileName String
     */
    private String generateFileName(String nomina, String quincena, Integer complemento) {
        StringBuffer fileName = new StringBuffer();
        
        fileName.append("SOL-CLC").append(" ");
        fileName.append(nomina).append("-");
        
        String[] temp = quincena.split(",");
        for (int i = 0; i < temp.length; i++) {
            fileName.append(generaQuincena(new Integer(temp[i]))).append("-");
        }
        
        fileName.append("C").append(complemento);
        
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
