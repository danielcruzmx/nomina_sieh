package gob.shcp.sireh.model.servicios;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.TnMovtosEmpPlaDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import java.util.Date;


public class TablaDTO implements java.io.Serializable, Model{
    
    private boolean buscar;
    private boolean salvar;
    
    // TD_PLAZA Pk
    private Integer idPlaza;
    
    // TN_MOVTOS_EMP_PLA Pk
    private Integer idMovtosEmpPla;
    
    // TD_EMPLEADO Pk
    private String rfcEmpleado;
    
    private String nombre;
    
    private String motivoModifica;
    
    private TdEmpleadoDTO tdEmpleadoDTO;
    private TdPlazaDTO tdPlazaDTO;
    private TnMovtosEmpPlaDTO tnMovtosEmpPlaDTO;
    
    // TD_PLAZA - Fechas
    private Date plazaIniCont;
    private Date plazaFinCont;
    private Date plazaIniLic;
    private Date plazaFinLic;
    private Date plazaUltimoMovto;
    
    // TN_MOVTO_EMP_PLA
    private Date mepUltimoMovto;
    private Date mepIniCont;
    private Date mepFinCont;
    private Date mepIniLic;
    private Date mepFinLic;
    private Date mepFecNacimiento;
    private Date mepIngresoGobFed;
    private Date mepIngresoDependencia;
    private Date mepTerminoCargoSind;
    private Date mepFecNotDecPatr;
    private Date mepFecIniDeclPatr;
    private Date mepFecIngSpc;
    private Date mepFechaCancela;
    private String ciclo;
    
    // TD_EMPLEADO
    private Date fecUltimoMovto;
    private Date fecNacimiento;
    private Date IngresoGobFed;
    private Date ingresoDependencia;
    private Date terminoCargoSind;
    private Date fecNotDecPatr;
    private Date fecIniDeclPatr;
    private Date fecIngSpc;
    private Date fecModifico;

    public void setBuscar(boolean buscar) {
        this.buscar = buscar;
    }

    public boolean isBuscar() {
        return buscar;
    }

    public void setSalvar(boolean salvar) {
        this.salvar = salvar;
    }

    public boolean isSalvar() {
        return salvar;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTdEmpleadoDTO(TdEmpleadoDTO tdEmpleadoDTO) {
        this.tdEmpleadoDTO = tdEmpleadoDTO;
    }

    public TdEmpleadoDTO getTdEmpleadoDTO() {
        return tdEmpleadoDTO;
    }

    public void setTdPlazaDTO(TdPlazaDTO tdPlazaDTO) {
        this.tdPlazaDTO = tdPlazaDTO;
    }

    public TdPlazaDTO getTdPlazaDTO() {
        return tdPlazaDTO;
    }

    public void setTnMovtosEmpPlaDTO(TnMovtosEmpPlaDTO tnMovtosEmpPlaDTO) {
        this.tnMovtosEmpPlaDTO = tnMovtosEmpPlaDTO;
    }

    public TnMovtosEmpPlaDTO getTnMovtosEmpPlaDTO() {
        return tnMovtosEmpPlaDTO;
    }

    public void setPlazaIniCont(Date plazaIniCont) {
        this.plazaIniCont = plazaIniCont;
    }

    public Date getPlazaIniCont() {
        return plazaIniCont;
    }

    public void setPlazaFinCont(Date plazaFinCont) {
        this.plazaFinCont = plazaFinCont;
    }

    public Date getPlazaFinCont() {
        return plazaFinCont;
    }

    public void setPlazaIniLic(Date plazaIniLic) {
        this.plazaIniLic = plazaIniLic;
    }

    public Date getPlazaIniLic() {
        return plazaIniLic;
    }

    public void setPlazaFinLic(Date plazaFinLic) {
        this.plazaFinLic = plazaFinLic;
    }

    public Date getPlazaFinLic() {
        return plazaFinLic;
    }

    public void setPlazaUltimoMovto(Date plazaUltimoMovto) {
        this.plazaUltimoMovto = plazaUltimoMovto;
    }

    public Date getPlazaUltimoMovto() {
        return plazaUltimoMovto;
    }

    public void setMotivoModifica(String motivoModifica) {
        this.motivoModifica = motivoModifica;
    }

    public String getMotivoModifica() {
        return motivoModifica;
    }

    public void setMepUltimoMovto(Date mepUltimoMovto) {
        this.mepUltimoMovto = mepUltimoMovto;
    }

    public Date getMepUltimoMovto() {
        return mepUltimoMovto;
    }

    public void setMepIniCont(Date mepIniCont) {
        this.mepIniCont = mepIniCont;
    }

    public Date getMepIniCont() {
        return mepIniCont;
    }

    public void setMepFinCont(Date mepFinCont) {
        this.mepFinCont = mepFinCont;
    }

    public Date getMepFinCont() {
        return mepFinCont;
    }

    public void setMepIniLic(Date mepIniLic) {
        this.mepIniLic = mepIniLic;
    }

    public Date getMepIniLic() {
        return mepIniLic;
    }

    public void setMepFinLic(Date mepFinLic) {
        this.mepFinLic = mepFinLic;
    }

    public Date getMepFinLic() {
        return mepFinLic;
    }

    public void setMepFecNacimiento(Date mepFecNacimiento) {
        this.mepFecNacimiento = mepFecNacimiento;
    }

    public Date getMepFecNacimiento() {
        return mepFecNacimiento;
    }

    public void setMepIngresoGobFed(Date mepIngresoGobFed) {
        this.mepIngresoGobFed = mepIngresoGobFed;
    }

    public Date getMepIngresoGobFed() {
        return mepIngresoGobFed;
    }

    public void setMepIngresoDependencia(Date mepIngresoDependencia) {
        this.mepIngresoDependencia = mepIngresoDependencia;
    }

    public Date getMepIngresoDependencia() {
        return mepIngresoDependencia;
    }

    public void setMepTerminoCargoSind(Date mepTerminoCargoSind) {
        this.mepTerminoCargoSind = mepTerminoCargoSind;
    }

    public Date getMepTerminoCargoSind() {
        return mepTerminoCargoSind;
    }

    public void setMepFecNotDecPatr(Date mepFecNotDecPatr) {
        this.mepFecNotDecPatr = mepFecNotDecPatr;
    }

    public Date getMepFecNotDecPatr() {
        return mepFecNotDecPatr;
    }

    public void setMepFecIniDeclPatr(Date mepFecIniDeclPatr) {
        this.mepFecIniDeclPatr = mepFecIniDeclPatr;
    }

    public Date getMepFecIniDeclPatr() {
        return mepFecIniDeclPatr;
    }

    public void setMepFecIngSpc(Date mepFecIngSpc) {
        this.mepFecIngSpc = mepFecIngSpc;
    }

    public Date getMepFecIngSpc() {
        return mepFecIngSpc;
    }

    public void setMepFechaCancela(Date mepFechaCancela) {
        this.mepFechaCancela = mepFechaCancela;
    }

    public Date getMepFechaCancela() {
        return mepFechaCancela;
    }

    public void setIdMovtosEmpPla(Integer idMovtosEmpPla) {
        this.idMovtosEmpPla = idMovtosEmpPla;
    }

    public Integer getIdMovtosEmpPla() {
        return idMovtosEmpPla;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setFecUltimoMovto(Date fecUltimoMovto) {
        this.fecUltimoMovto = fecUltimoMovto;
    }

    public Date getFecUltimoMovto() {
        return fecUltimoMovto;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setIngresoGobFed(Date ingresoGobFed) {
        this.IngresoGobFed = ingresoGobFed;
    }

    public Date getIngresoGobFed() {
        return IngresoGobFed;
    }

    public void setIngresoDependencia(Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    public Date getIngresoDependencia() {
        return ingresoDependencia;
    }

    public void setTerminoCargoSind(Date terminoCargoSind) {
        this.terminoCargoSind = terminoCargoSind;
    }

    public Date getTerminoCargoSind() {
        return terminoCargoSind;
    }

    public void setFecNotDecPatr(Date fecNotDecPatr) {
        this.fecNotDecPatr = fecNotDecPatr;
    }

    public Date getFecNotDecPatr() {
        return fecNotDecPatr;
    }

    public void setFecIniDeclPatr(Date fecIniDeclPatr) {
        this.fecIniDeclPatr = fecIniDeclPatr;
    }

    public Date getFecIniDeclPatr() {
        return fecIniDeclPatr;
    }

    public void setFecIngSpc(Date fecIngSpc) {
        this.fecIngSpc = fecIngSpc;
    }

    public Date getFecIngSpc() {
        return fecIngSpc;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }
}
