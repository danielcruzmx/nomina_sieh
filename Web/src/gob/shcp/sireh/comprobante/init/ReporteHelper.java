package gob.shcp.sireh.comprobante.init;

import java.io.ByteArrayOutputStream;
import java.io.File;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;


public final class ReporteHelper {
    public static boolean generarPDF(ConfiguracionReporte configuracionReporte) throws Exception{
        boolean generado = true;
        try {
            //final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            JRDataSource jrDataSource = new JRBeanCollectionDataSource(configuracionReporte.getDatos());
            
            File jasperLoad = new File((String) configuracionReporte.getPathJasper() + "comprobante.jasper");
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperLoad);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, configuracionReporte.getParametros(), jrDataSource);
            //JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, jrDataSource);
            
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(configuracionReporte.getSalidaReporte()));
            exporter.exportReport();
            
        } catch(Exception e){ e.printStackTrace(); generado = false; }
        return generado;
    }
}
