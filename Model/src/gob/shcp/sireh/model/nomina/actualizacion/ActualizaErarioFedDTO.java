package gob.shcp.sireh.model.nomina.actualizacion;

import gob.shcp.fsn.model.Model;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;



public class ActualizaErarioFedDTO implements java.io.Serializable, Model{

    private java.lang.String rfcEmpleado;
    private java.lang.String nombreEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String idPuestoNom;
    private java.lang.String idNivelPto;
    private java.lang.Integer idPlaza;
    private TnMovtoConceptoPagoDTO movtoConceptoPagoDTO;
    private java.lang.Boolean hasErario;
    

    public ActualizaErarioFedDTO() {
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
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

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setMovtoConceptoPagoDTO(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO) {
        this.movtoConceptoPagoDTO = movtoConceptoPagoDTO;
    }

    public TnMovtoConceptoPagoDTO getMovtoConceptoPagoDTO() {
        return movtoConceptoPagoDTO;
    }

    public void setHasErario(Boolean hasErario) {
        this.hasErario = hasErario;
    }

    public Boolean getHasErario() {
        return hasErario;
    }
}
