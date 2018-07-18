package gob.shcp.sireh.model.rusp;

import gob.shcp.fsn.model.Model;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class DatosBasicosDTO implements java.io.Serializable, Model {

    private boolean delete;
    private java.lang.String rfcEmpleado;
    private java.lang.String rfcUnico;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String curpEmpleado;
    private java.lang.Integer lengua;
    private java.lang.String tipo;
    private java.lang.String nombreHijo;
    private String[] idHijos;
    private Integer[] idLengua;
    private boolean addlengua;
    private boolean dellengua;
    private boolean addcurp;
    private boolean delcurp;
    private boolean cancurp;
    private boolean canlengua1;
    private boolean cancurp1;
    private boolean grabalengua;
    private boolean grabacurp;

    /**
     * Constructor for DatosBasicosDTO class.
     */
    public DatosBasicosDTO() {}


    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setLengua(Integer lengua) {
        this.lengua = lengua;
    }

    public Integer getLengua() {
        return lengua;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

/*    @ValidationMethod(forProperty="idLengua", errorCode="error.delete.unselected")
    private boolean validateIdLengua() {
        if(this.isDelete()) {
            return (this.getIdLengua() != null && this.getIdLengua().length > 0);
        }
        return true;
    }

    @ValidationMethod(forProperty="idHijos", errorCode="error.delete.unselected")
    private boolean validateIdHijos() {
        if(this.isDelete()) {
            return (this.getIdHijos() != null && this.getIdHijos().length > 0);
        }
        return true;
    }
*/
    public void setIdHijos(String[] idHijos) {
        this.idHijos = idHijos;
    }

    public String[] getIdHijos() {
        return idHijos;
    }

    public void setIdLengua(Integer[] idLengua) {
        this.idLengua = idLengua;
    }

    public Integer[] getIdLengua() {
        return idLengua;
    }

    public void setRfcUnico(String rfcUnico) {
        this.rfcUnico = rfcUnico;
    }

    public String getRfcUnico() {
        return rfcUnico;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setAddlengua(boolean addlengua) {
        this.addlengua = addlengua;
    }

    public boolean isAddlengua() {
        return addlengua;
    }

    public void setDellengua(boolean dellengua) {
        this.dellengua = dellengua;
    }

    public boolean isDellengua() {
        return dellengua;
    }

    public void setAddcurp(boolean addcurp) {
        this.addcurp = addcurp;
    }

    public boolean isAddcurp() {
        return addcurp;
    }

    public void setDelcurp(boolean delcurp) {
        this.delcurp = delcurp;
    }

    public boolean isDelcurp() {
        return delcurp;
    }

    public void setCancurp(boolean cancurp) {
        this.cancurp = cancurp;
    }

    public boolean isCancurp() {
        return cancurp;
    }

    public void setGrabalengua(boolean grabalengua) {
        this.grabalengua = grabalengua;
    }

    public boolean isGrabalengua() {
        return grabalengua;
    }

    public void setGrabacurp(boolean grabacurp) {
        this.grabacurp = grabacurp;
    }

    public boolean isGrabacurp() {
        return grabacurp;
    }

    public void setCanlengua1(boolean canlengua1) {
        this.canlengua1 = canlengua1;
    }

    public boolean isCanlengua1() {
        return canlengua1;
    }

    public void setCancurp1(boolean cancurp1) {
        this.cancurp1 = cancurp1;
    }

    public boolean isCancurp1() {
        return cancurp1;
    }
}
