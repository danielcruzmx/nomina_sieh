package gob.shcp.sireh.model.sat.config;

import gob.shcp.sireh.model.sat.config.ConfiguracionReporte;

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
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;


public final class ReporteHelper {
    public static boolean generarPDF(ConfiguracionReporte configuracionReporte) throws Exception{
        boolean generado = true;
        try {
            JRDataSource jrDataSource = new JRBeanCollectionDataSource(configuracionReporte.getDatos());
            
            File jasperLoad = new File((String) configuracionReporte.getPathJasper() + configuracionReporte.getJasperReportFile());
            
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperLoad);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, configuracionReporte.getParametros(), jrDataSource);
            
            JRPdfExporter exporter = new JRPdfExporter();
            /*
            exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY, Boolean.TRUE);
            exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED, Boolean.TRUE);
            exporter.setParameter(JRPdfExporterParameter.USER_PASSWORD, "user_pwd");
            exporter.setParameter(JRPdfExporterParameter.OWNER_PASSWORD, "owner_pwd");
            */
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(configuracionReporte.getSalidaReporte()));
            exporter.exportReport();
            
        } catch(Exception e){ e.printStackTrace(); generado = false; }
        return generado;
    }
}
