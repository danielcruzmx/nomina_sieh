package gob.shcp.sireh.model.clc;

public class EtiquetaClaveValorEntero {
    private Integer clave;
    private String valor;

    public EtiquetaClaveValorEntero(Integer clave, String valor) {
        this.setClave(clave);
        this.setValor(valor);
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
