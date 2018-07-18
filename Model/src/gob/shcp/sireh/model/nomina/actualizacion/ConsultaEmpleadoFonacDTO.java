package gob.shcp.sireh.model.nomina.actualizacion;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;

import java.util.Date;
import java.util.List;

public class ConsultaEmpleadoFonacDTO extends ConsultaEmpleadoDTO implements java.io.Serializable, Model {


    private java.lang.String idSitPlazaFilter;
    private java.util.List listaIdJerarquiasFilter;
    

    public ConsultaEmpleadoFonacDTO() {
    }

    public void setIdSitPlazaFilter(String idSitPlazaFilter) {
        this.idSitPlazaFilter = idSitPlazaFilter;
    }

    public String getIdSitPlazaFilter() {
        return idSitPlazaFilter;
    }

    public void setListaIdJerarquiasFilter(List listaIdJerarquiasFilter) {
        this.listaIdJerarquiasFilter = listaIdJerarquiasFilter;
    }

    public List getListaIdJerarquiasFilter() {
        return listaIdJerarquiasFilter;
    }
}
