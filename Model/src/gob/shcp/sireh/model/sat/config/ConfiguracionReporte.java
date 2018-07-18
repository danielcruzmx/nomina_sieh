package gob.shcp.sireh.model.sat.config;

import gob.shcp.sireh.model.CfdiDTO;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

public class ConfiguracionReporte implements Serializable {
    private String pathJasper;
    private Map<String, Object> parametros;
    private List<CfdiDTO> datos;
    private String nombreReporte;
    private String salidaReporte;
    private String jasperReportFile;

    public void setPathJasper(String pathJasper) {
        this.pathJasper = pathJasper;
    }

    public String getPathJasper() {
        return pathJasper;
    }

    public void setParametros(Map<String, Object> parametros) {
        this.parametros = parametros;
    }

    public Map<String, Object> getParametros() {
        return parametros;
    }

    public void setDatos(List<CfdiDTO> datos) {
        this.datos = datos;
    }

    public List<CfdiDTO> getDatos() {
        return datos;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setSalidaReporte(String salidaReporte) {
        this.salidaReporte = salidaReporte;
    }

    public String getSalidaReporte() {
        return salidaReporte;
    }

    public void setJasperReportFile(String jasperReportFile) {
        this.jasperReportFile = jasperReportFile;
    }

    public String getJasperReportFile() {
        return jasperReportFile;
    }
}
