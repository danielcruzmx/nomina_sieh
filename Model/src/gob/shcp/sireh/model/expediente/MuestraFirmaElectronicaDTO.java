package gob.shcp.sireh.model.expediente;

import gob.shcp.fsn.model.Model;

import java.util.List;

public class MuestraFirmaElectronicaDTO implements java.io.Serializable, Model {
    
    private Integer idComprobante;
    private String rfcEmpleado;
    private Integer idPaquete;
                                                
    private String[] outData;
    private List<String> contentData;
    private String certificateData;
    private String[] signatureData;
    private List<String> contentSignatureData;
    
    public void setOutData(String[] outData) {
        this.outData = outData;
    }

    public String[] getOutData() {
        return outData;
    }

    public void setContentData(List<String> contentData) {
        this.contentData = contentData;
    }

    public List<String> getContentData() {
        return contentData;
    }

    public void setCertificateData(String certificateData) {
        this.certificateData = certificateData;
    }

    public String getCertificateData() {
        return certificateData;
    }

    public void setSignatureData(String[] signatureData) {
        this.signatureData = signatureData;
    }

    public String[] getSignatureData() {
        return signatureData;
    }

    public void setContentSignatureData(List<String> contentSignatureData) {
        this.contentSignatureData = contentSignatureData;
    }

    public List<String> getContentSignatureData() {
        return contentSignatureData;
    }
    
    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }
}
