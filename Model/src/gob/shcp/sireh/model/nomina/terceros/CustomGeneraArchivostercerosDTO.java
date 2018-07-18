package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

public class CustomGeneraArchivostercerosDTO implements java.io.Serializable, Model {

    private String  idTercero;
    private Integer tipoCampo;
    private String  texto;
    private String  encabezado;
    
    public void setIdTercero(String idTercero) {
        this.idTercero = idTercero;
    }

    public String getIdTercero() {
        return idTercero;
    }

    public void setTipoCampo(Integer tipoCampo) {
        this.tipoCampo = tipoCampo;
    }

    public Integer getTipoCampo() {
        return tipoCampo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getEncabezado() {
        return encabezado;
    }
}
