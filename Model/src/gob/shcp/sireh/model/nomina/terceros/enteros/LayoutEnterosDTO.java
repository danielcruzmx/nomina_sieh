package gob.shcp.sireh.model.nomina.terceros.enteros;

import java.util.List;


public class LayoutEnterosDTO {
    
    private List<AtributosLayoutDTO> encabezado;
    private List<AtributosLayoutDTO> record;
    private List<AtributosLayoutDTO> control;


    public void setEncabezado(List<AtributosLayoutDTO> encabezado) {
        this.encabezado = encabezado;
    }

    public List<AtributosLayoutDTO> getEncabezado() {
        return encabezado;
    }

    public void setRecord(List<AtributosLayoutDTO> record) {
        this.record = record;
    }

    public List<AtributosLayoutDTO> getRecord() {
        return record;
    }

    public void setControl(List<AtributosLayoutDTO> control) {
        this.control = control;
    }

    public List<AtributosLayoutDTO> getControl() {
        return control;
    }
}
