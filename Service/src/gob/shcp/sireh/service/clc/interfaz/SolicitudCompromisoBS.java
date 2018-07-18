package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.sireh.data.jdbc.QueryTdCxlcDAO;
import gob.shcp.sireh.data.jdbc.TcBeneficiarioSicopDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdSecCxlcDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;

import gob.shcp.sireh.domain.jdbc.CustomTdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicop;
import gob.shcp.sireh.domain.jdbc.TcBeneficiarioSicopPK;
import gob.shcp.sireh.domain.jdbc.TdCxlc;

import gob.shcp.sireh.model.TcTipoNominaDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudCompromisoDTO;

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
 * Business Service encargado de atender solicitudes correspondientes al Modulo Solicitud Compromiso.
 */
public class SolicitudCompromisoBS extends AbstractSirehService implements SolicitudCompromisoService {

    private static final String SEPARATOR = ",";
    private static final String NEW_LINE = "\r\n";
    
    // HEADER
    private static final String RAMO_EMISOR = "6";
    private static final String RAMO_CREADOR = "6";
    private static final String RAMO_RECEPTOR = "6";
    private static final String UNIDAD_EMISORA = "711";
    private static final String UNIDAD_CREADORA = "711";
    private static final String UNIDAD_RECEPTORA = "711";
    private static final String TIPO_MOVTO = "O";
    private static final String ID_CATASTRAL = "NO APLICA";
    private static final String TIPO_PROC = "0";
    private static final String ESQUEMA_PRECIOS = "0";
    private static final String TIPO_CONTRATACION = "0";
    private static final String BIEN_EXPROP = "0";
    private static final String POBLACION_OBJ = "0";
    private static final String PRG_ASOC = "0";
    private static final String TTRANS = "1";
    private static final String CONV_MOD = "N";
    
    private static final String ETIQUETA_COMPRANET_178 = "N";
    private static final String JUSTIFICA_COMPRANET_416 = "NOMINA";
    private static final String IVA_MON_ORIG_414 = "0";
    private static final String IMP_CONT_SIVA_413 = "0";
    private static final String IMP_CONV_MOD_415 = "0";


    
    // BODY
    private static final String ID = "1";
    private static final String EVENTO = "000";
    private static final String RAMO = "6";
    private static final String CAU = "0000000000";
    private static final String OFIN = "000";
    private static final String AUX_1 = "00000";
    private static final String AUX_2 = "00000";
    private static final String AUX_3 = "0000000000";
    private static final String SUFICIENCIA = "";
    private static final String SOLICITUD = "";
    private static final String PROGRAMA = "00000000000";
         
    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de compromiso con base en el objeto solicitudCompromisoDTO.
     * @author Oscar S.
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return solicitudCompromisoDTO SolicitudCompromisoDTO
     */
    public SolicitudCompromisoDTO updateGenSolCompManual(SolicitudCompromisoDTO solicitudCompromisoDTO) throws IOException {
        StringBuffer csvContent = new StringBuffer();
        StringBuffer csvContentFinal = new StringBuffer();
        DecimalFormat formateador = new DecimalFormat("##.000000");
        DecimalFormat formateador2Decimales = new DecimalFormat("##.00");
        
        // Paso 1) Obtener datos del beneficiario
        TcBeneficiarioSicopPK benePk = new TcBeneficiarioSicopPK();
        benePk.setBsCtaBancaria(solicitudCompromisoDTO.getBsCtaBancaria());
        benePk.setBsLeyenda(solicitudCompromisoDTO.getBsLeyenda());
        benePk.setBsTipoPago(solicitudCompromisoDTO.getBsTipoPago());
        benePk.setIdBeneSicop(solicitudCompromisoDTO.getIdBeneSicop());
        TcBeneficiarioSicop beneficiarioSicop = super.persistence().get(TcBeneficiarioSicopDAO.class).getById(benePk);
         
        // Paso 2) Obtener el maximo compromiso
        List<TdCxlc> tdCxlcCompromisoList = super.persistence().get(QueryTdCxlcDAO.class).getMaxCxlcCompromiso(solicitudCompromisoDTO.getCxlcCiclo());
        TdCxlc tdCxlcCompromiso = tdCxlcCompromisoList.get(0);
        Long cxlcCompromiso = tdCxlcCompromiso.getCxlcCompromiso();

        // Paso 3) Obtener el detalle de cxlc a comprometer
        //List<Integer> secCxlcList = new ArrayList<Integer>();
        Set<Integer> secCxlcList = new HashSet<Integer>();
        for (int numeroSecCxlc : solicitudCompromisoDTO.getCxlcGrupo()) {
            secCxlcList.add(numeroSecCxlc);
        }
        List<CustomTdSecCxlc> cxlcComprometer = super.persistence().get(CustomTdSecCxlcDAO.class).getDetalleCxlcSolicitudCompromiso(solicitudCompromisoDTO.getCxlcCiclo(), secCxlcList);
        
        // Obtener el complemento actual
        List<TdCxlc> tdCxlcCompromisoList2 = super.persistence().get(CustomTdSecCxlcDAO.class).getCxlcCompromisoComplementoActual(solicitudCompromisoDTO.getCxlcCiclo(), secCxlcList);
        TdCxlc tdCxlcCompromiso2 = tdCxlcCompromisoList2.get(0);
        int cxlcComplementoActual = tdCxlcCompromiso2.getCxlcComplemento();
        
        // Paso 4) Obtener el Monto Total
        Double montoTotal = 0.00;
        for (CustomTdSecCxlc secCxlc : cxlcComprometer) {
            montoTotal += secCxlc.getMonto();
        }
        
        // Paso 5) Escribir el HEADER del documento      
        csvContent.append("H").append(SEPARATOR); // 1. Identifica el registro encabezado
        csvContent.append(super.dateToString(solicitudCompromisoDTO.getFechaApli())).append(SEPARATOR); // 2. Fecha con la que se realizara el registro de la transacción, la cual cambiara al aplicar el movimiento
        csvContent.append(super.dateToString(solicitudCompromisoDTO.getFechaExp())).append(SEPARATOR); // 3. Fecha con la que se elabora la transacción, distinta a la fecha que se registra
        
        csvContent.append(RAMO_EMISOR).append(SEPARATOR); // 4. Clave del Ramo emisor
        csvContent.append(RAMO_CREADOR).append(SEPARATOR); // 5. Clave del Ramo creador
        csvContent.append(RAMO_RECEPTOR).append(SEPARATOR); // 6. Clave del Ramo receptor
        
        csvContent.append(UNIDAD_EMISORA).append(SEPARATOR); // 7. Clave de la Unidad emisora
        csvContent.append(UNIDAD_CREADORA).append(SEPARATOR); // 8. Clave de la Unidad creadora
        csvContent.append(UNIDAD_RECEPTORA).append(SEPARATOR); // 9. Clave de la Unidad receptora
        
        csvContent.append(TIPO_MOVTO).append(SEPARATOR); // 10. Tipo de movimiento
        csvContent.append(beneficiarioSicop.getBsOrigenPpto()).append(SEPARATOR); // 11. Origen del presupuesto
        csvContent.append(beneficiarioSicop.getBsTipoErog()).append(SEPARATOR); // 12. Tipo de solicitud
        csvContent.append(beneficiarioSicop.getBsTipoOper()).append(SEPARATOR); // 13. Tipo Operación
        csvContent.append(solicitudCompromisoDTO.getDoctoRef()).append(SEPARATOR); // 14. Número de contrato, pedido, Organismo, Entidad, Persona o Fideicomiso
        csvContent.append(solicitudCompromisoDTO.getConcepto()).append(SEPARATOR); // 15. Concepto del compromiso
        csvContent.append(solicitudCompromisoDTO.getIdBeneSicop()).append(SEPARATOR); // 16. Clave del Beneficiario
        csvContent.append(beneficiarioSicop.getBsRfc()).append(SEPARATOR); // 17. RFC del Beneficiario
        csvContent.append(ID_CATASTRAL).append(SEPARATOR); // 18. Identificación Catastral
        csvContent.append(TIPO_PROC).append(SEPARATOR); // 19. Tipo de procedimiento. Con base a los lineamientos de operación del PCOM
        csvContent.append(ESQUEMA_PRECIOS).append(SEPARATOR); // 20. Esquema de precios. Con base a los lineamientos de operación del PCOM
        csvContent.append(TIPO_CONTRATACION).append(SEPARATOR); // 21. Clave de Contratación.  Con base a los lineamientos de operación del PCOM
        
        csvContent.append(super.dateToString(solicitudCompromisoDTO.getFechaIni())).append(SEPARATOR); // 22. Fecha Inicial del Compromiso
        csvContent.append(super.dateToString(solicitudCompromisoDTO.getFechaFin())).append(SEPARATOR); // 23. Fecha Final de la Vigencia del Contrato
        csvContent.append(super.dateToString(solicitudCompromisoDTO.getFechaComp())).append(SEPARATOR); // 24. Fecha de la Firma del Compromiso
        csvContent.append(solicitudCompromisoDTO.getTemporalidad()).append(SEPARATOR); // 25. Temporalidad del contrato. . Con base a los lineamientos de operación del PCOM
        csvContent.append(solicitudCompromisoDTO.getTemporalidad() != null && solicitudCompromisoDTO.getTemporalidad().equals("SI") ? solicitudCompromisoDTO.getAprobPla() : "0").append(SEPARATOR); // 26. Número de aprobación de plurianual. . Con base a los lineamientos de operación del PCOM
        csvContent.append("").append(SEPARATOR); // 27. Acto Administrativo Jurídico. Con base a los lineamientos de operación del PCOM
        csvContent.append(formateador2Decimales.format(montoTotal)).append(SEPARATOR); // 28. Monto total en moneda origen
        csvContent.append(beneficiarioSicop.getBsTipoMoneda()).append(SEPARATOR); // 29. Tipo de moneda
        
         // 30. Tipo de cambio
         if (beneficiarioSicop.getBsTipoMoneda().equals("MXN")) {
             csvContent.append(formateador.format(1)).append(SEPARATOR);
         } else {
             csvContent.append(formateador.format(solicitudCompromisoDTO.getTipoCambio())).append(SEPARATOR);
         }
        
        csvContent.append(formateador2Decimales.format(montoTotal)).append(SEPARATOR); // 31. Monto del ejercicio vigente. Con base a los lineamientos de operación del PCOM
        csvContent.append("0.00").append(SEPARATOR); // 32. Monto total mínimo. Con base a los lineamientos de operación del PCOM
        csvContent.append(formateador2Decimales.format(montoTotal)).append(SEPARATOR); // 33. Monto total máximo. Con base a los lineamientos de operación del PCOM
        csvContent.append(CONV_MOD).append(SEPARATOR); // 34. Convenio modificatorio
        csvContent.append("").append(SEPARATOR); // 35. Número de plazas (Requerido para el Tipo de Erogación 8 Nomina)
        csvContent.append("").append(SEPARATOR); // 36. Variación número de plaza (Requerido para el Tipo de Erogación 8 Nomina)
        csvContent.append(BIEN_EXPROP).append(SEPARATOR); // 37. Bien expropiado
        csvContent.append(POBLACION_OBJ).append(SEPARATOR); // 38. Población Objetivo
        csvContent.append(PRG_ASOC).append(SEPARATOR); // 39. Programa Asociado
        csvContent.append(solicitudCompromisoDTO.getMes()).append(SEPARATOR); // 40. Mes
        csvContent.append(cxlcCompromiso).append(SEPARATOR); // 41. Número de Control Interno del Ramo
        csvContent.append(TTRANS).append(SEPARATOR); // 42. Tipo Transaccion
        csvContent.append(ETIQUETA_COMPRANET_178).append(SEPARATOR); // 43. Apl. COMPRANET (ETIQUETA_COMPRANET_178)
        csvContent.append(JUSTIFICA_COMPRANET_416).append(SEPARATOR); // 44. Just. COMPRANET (JUSTIFICA_COMPRANET_416) 
        csvContent.append(IVA_MON_ORIG_414).append(SEPARATOR); // 45. IVA mon. orig. (IVA_MON_ORIG_414)
        csvContent.append(IMP_CONT_SIVA_413).append(SEPARATOR); // 46. Imp. Cont. sin IVA (IMP_CONT_SIVA_413)
        csvContent.append(IMP_CONV_MOD_415).append(SEPARATOR); // 47. Imp. Conv.  Mod. (IMP_CONV_MOD_415)
        
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
            csvContent.append(secCxlc.getIdUnidad() != null && secCxlc.getIdUnidad().equals("G00") ? "00" : "10").append(SEPARATOR); // Control Opera
            csvContent.append(secCxlc.getIdActInstiEsp()).append(SEPARATOR);
            csvContent.append(OFIN).append(SEPARATOR);
            csvContent.append(AUX_1).append(SEPARATOR);
            csvContent.append(AUX_2).append(SEPARATOR);
            csvContent.append(AUX_3).append(SEPARATOR);
            
            csvContent.append(SUFICIENCIA).append(SEPARATOR);
            csvContent.append(SOLICITUD).append(SEPARATOR);
            
            csvContent.append(solicitudCompromisoDTO.getMes().equals("1") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("2") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("3") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("4") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("5") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("6") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("7") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("8") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("9") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("10") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("11") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(solicitudCompromisoDTO.getMes().equals("12") ? secCxlc.getMonto().toString() : "0.00").append(SEPARATOR);
            csvContent.append(secCxlc.getMonto());
            
            if (filas == contador) {
                csvContent.append("");
            } else {
                csvContent.append(NEW_LINE);
            }
        }
        
        // Paso 7) Generar el nombre del archivo 
        csvContentFinal.append(new String(csvContent.toString().getBytes(), "UTF-8"));
        
        byte[] bytes = csvContentFinal.toString().getBytes();
        String fileName = generateFileName(solicitudCompromisoDTO.getIdTipoNomina(), 
                                           solicitudCompromisoDTO.getCxlcQnaPagoMultiple(), 
                                           cxlcComplementoActual,
                                           String.valueOf(cxlcCompromiso));
        //solicitudCompromisoDTO.setFileName(fileName + ".zip");
        solicitudCompromisoDTO.setFileName(fileName + ".csv");
        
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
        solicitudCompromisoDTO.setCsvFileName(nameFileDat);
        solicitudCompromisoDTO.setCsvFilePath(rutaArchivo);
        
        //solicitudCompromisoDTO.setZipFileName(zipFileDat);
        //solicitudCompromisoDTO.setZipFilePath(rutaArchivo);
        
        // Paso 10) Update tabla TD_CXLC
        super.persistence().get(CustomTdCxlcDAO.class).updateCxlcComprometer(solicitudCompromisoDTO.getCxlcCiclo(), cxlcCompromiso, secCxlcList,  super.security().getUserName());
        
        return solicitudCompromisoDTO;
    }
    
    /**
     * Metodo encargado de obtener las nominas validas para el Usuario comodin.
     * @author Oscar S.
     * @return nominasValidasBenefComodin List<TcTipoNominaDTO>
     */
    public List<TcTipoNominaDTO> getNominasValidasBenefComodin(){
        return super.transformation().map(super.persistence().get(CustomTdCxlcDAO.class).getNominasValidasBenefComodin(), TcTipoNominaDTO.class);
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

        fileName.append("SOL-COMP").append(" ");
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
