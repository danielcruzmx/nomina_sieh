package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

public class RuspBajaDTO implements java.io.Serializable, Model {
    private String rbQnaPago;
    private String rbCiclo;
    private String beanlista;
    private boolean muestraReporte;
    private boolean muestraRegistros;
    private boolean cancel;
    private boolean Validacion;
    
    private String leyenda = "Si se localiza información con los parámetros capturados, seleccione la nómina a procesar y active el botón de generar";
    private String leyendag = "Proceso de generación de archivo, al finalizar revise su carperta de descargas";    
    

    public void setRbQnaPago(String rbQnaPago) {
        this.rbQnaPago = rbQnaPago;
    }

    public String getRbQnaPago() {
        return rbQnaPago;
    }

    public void setRbCiclo(String rbCiclo) {
        this.rbCiclo = rbCiclo;
    }

    public String getRbCiclo() {
        return rbCiclo;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setBeanlista(String beanlista) {
        this.beanlista = beanlista;
    }

    public String getBeanlista() {
        return beanlista;
    }

    public void setMuestraRegistros(boolean muestraRegistros) {
        this.muestraRegistros = muestraRegistros;
    }

    public boolean isMuestraRegistros() {
        return muestraRegistros;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setValidacion(boolean validacion) {
        this.Validacion = validacion;
    }

    public boolean isValidacion() {
        return Validacion;
    }
}
