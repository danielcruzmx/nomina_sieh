package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.sql.Date;

public class CustomTnMovtosEmpPla extends TnMovtosEmpPla implements Domain, 
                                                                    Serializable {
    private String descMovsPersonal;
    private String descNombramiento;
    private String descGrupoPago;
    private String descTipoServPub;
    private String contrato;
    private String labelContrato;
    private String sdohon;

    //    private Integer idZonaEcoNom;
    //    private String  mepObserva;
    //    private String  mepObservaInternas;

    //Datos
    private String movPersonal;
    private Integer idPlaza;
    private String idPuestoNom;
    private Integer idRangoNom;
    private String nombramiento;
    private String mepRfc;
    private String mepCurp;
    private String nombreEmp;
    private Integer mepQnaCaptura;
    private Date mepIniCont;
    private Date mepFinCont;
    private Double mepImporteHonorario;
    private String usuario;
    private Date fecModifico;
    private String idUnidadNom;
    private Integer idZonaEcoNom;
    private String grupoPago;
    private String servPub;
    private Integer idMovtosEmpPla;
    private String mepObserva;
    private String mepObservaInternas;
    private String sitmov;

    public void setDescMovsPersonal(String descMovsPersonal) {
        this.descMovsPersonal = descMovsPersonal;
    }

    public String getDescMovsPersonal() {
        return descMovsPersonal;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setDescTipoServPub(String descTipoServPub) {
        this.descTipoServPub = descTipoServPub;
    }

    public String getDescTipoServPub() {
        return descTipoServPub;
    }

    public void setMovPersonal(String movPersonal) {
        this.movPersonal = movPersonal;
    }

    public String getMovPersonal() {
        return movPersonal;
    }

    public Integer get_idPlaza() {
        return idPlaza;
    }

    public String get_idPuestoNom() {
        return idPuestoNom;
    }

    public Integer get_idRangoNom() {
        return idRangoNom;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    public String get_mepRfc() {
        return mepRfc;
    }

    public String get_mepCurp() {
        return mepCurp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public Integer get_mepQnaCaptura() {
        return mepQnaCaptura;
    }

    public Date get_mepIniCont() {
        return mepIniCont;
    }

    public Date get_mepFinCont() {
        return mepFinCont;
    }

    public Double get_mepImporteHonorario() {
        return mepImporteHonorario;
    }

    public String get_usuario() {
        return usuario;
    }

    public Date get_fecModifico() {
        return fecModifico;
    }

    public String get_idUnidadNom() {
        return idUnidadNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setServPub(String servPub) {
        this.servPub = servPub;
    }

    public String getServPub() {
        return servPub;
    }

    public Integer get_idMovtosEmpPla() {
        return idMovtosEmpPla;
    }

    public void setMepObserva(String mepObserva) {
        this.mepObserva = mepObserva;
    }

    public String getMepObserva() {
        return mepObserva;
    }

    public void setMepObservaInternas(String mepObservaInternas) {
        this.mepObservaInternas = mepObservaInternas;
    }

    public String getMepObservaInternas() {
        return mepObservaInternas;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setSdohon(String sdohon) {
        this.sdohon = sdohon;
    }

    public String getSdohon() {
        return sdohon;
    }

    public void setLabelContrato(String labelContrato) {
        this.labelContrato = labelContrato;
    }

    public String getLabelContrato() {
        return labelContrato;
    }

    public void setSitmov(String sitmov) {
        this.sitmov = sitmov;
    }

    public String getSitmov() {
        return sitmov;
    }
}
