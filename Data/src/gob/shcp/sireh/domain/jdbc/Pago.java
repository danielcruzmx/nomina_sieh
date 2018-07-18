package gob.shcp.sireh.domain.jdbc;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pago implements Domain, Serializable {

    private String rfcEmpleado;
    private Integer idPlaza;
    private String idUnidadNomb;
    private String descUnidadNomb;
    private String idGrupoPago;
    private String descGrupoPago;
    private String idNivelPto;
    private String idNivelPtoPre;
    private String idNombramiento;
    private String descNombramiento;
    private String idJerarquia;
    private String descJerarquia;
    private double tabSueldo;
    private double tabCompensacion;
    private String erario;
    private double impHonorario;
    private double tabSueldoPre;
    private String cotiza;
    private double incentivo;
    private int quincenaMovimiento;
    private int movimiento;
    private java.util.Date fecUltimoMovto;
    private java.util.Date fecFinPago;

    private double acumuladoSdoBase;
    private double acumuladoSdoBasePatron;
    private double acumuladoGravable;
    private double liquido;
    private double sdoBase;
    private double sdoBasePatron;
    private double gravable;
    private double factor;
    private int quincena;
    private int numQuincena;

    private boolean pension;
    private boolean retroactivo;

    private List<ConceptoPago> conceptos = new ArrayList<ConceptoPago>();
    private List<TdPension> pensiones = new ArrayList<TdPension>();
    private List<TnConceptoPagado> conceptosPagados = 
        new ArrayList<TnConceptoPagado>();
    //private List<Pago> pagosAnteriores;
    private List<TnConceptoPagado> conceptosReatroactivo = 
        new ArrayList<TnConceptoPagado>();

    // Otros
    private String curpEmpleado;
    private String nssEmpleado;
    private String numPension;
    private String compatEmpleo;
    private String mensaje;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String idPuestoNom;
    private String descPuestoNom;
    private Integer idZonaDistNom;
    private String descTipoPago;
    private Integer idZonaEcoNom;

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public Pago() {
        //this.conceptosPagados = new ArrayList<TnConceptoPagado>();
        this.acumuladoSdoBase = 0.0;
        this.acumuladoGravable = 0.0;
        this.acumuladoSdoBasePatron = 0.0;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNomb(String idUnidadNomb) {
        this.idUnidadNomb = idUnidadNomb;
    }

    public String getIdUnidadNomb() {
        return idUnidadNomb;
    }

    public void setDescUnidadNomb(String descUnidadNomb) {
        this.descUnidadNomb = descUnidadNomb;
    }

    public String getDescUnidadNomb() {
        return descUnidadNomb;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdNivelPtoPre(String idNivelPtoPre) {
        this.idNivelPtoPre = idNivelPtoPre;
    }

    public String getIdNivelPtoPre() {
        return idNivelPtoPre;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setTabSueldo(double tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public double getTabSueldo() {
        return tabSueldo;
    }

    public void setTabCompensacion(double tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public double getTabCompensacion() {
        return tabCompensacion;
    }

    public void setErario(String erario) {
        this.erario = erario;
    }

    public String getErario() {
        return erario;
    }

    public void setImpHonorario(double impHonorario) {
        this.impHonorario = impHonorario;
    }

    public double getImpHonorario() {
        return impHonorario;
    }

    public void setTabSueldoPre(double tabSueldoPre) {
        this.tabSueldoPre = tabSueldoPre;
    }

    public double getTabSueldoPre() {
        return tabSueldoPre;
    }

    public void setCotiza(String cotiza) {
        this.cotiza = cotiza;
    }

    public String getCotiza() {
        return cotiza;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setQuincenaMovimiento(int quincenaMovimiento) {
        this.quincenaMovimiento = quincenaMovimiento;
    }

    public int getQuincenaMovimiento() {
        return quincenaMovimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setFecUltimoMovto(Date fecUltimoMovto) {
        this.fecUltimoMovto = fecUltimoMovto;
    }

    public Date getFecUltimoMovto() {
        return fecUltimoMovto;
    }

    public void setAcumuladoSdoBase(double acumuladoSdoBase) {
        this.acumuladoSdoBase = acumuladoSdoBase;
    }

    public double getAcumuladoSdoBase() {
        return acumuladoSdoBase;
    }

    public void setAcumuladoSdoBasePatron(double acumuladoSdoBasePatron) {
        this.acumuladoSdoBasePatron = acumuladoSdoBasePatron;
    }

    public double getAcumuladoSdoBasePatron() {
        return acumuladoSdoBasePatron;
    }

    public void setAcumuladoGravable(double acumuladoGravable) {
        this.acumuladoGravable = acumuladoGravable;
    }

    public double getAcumuladoGravable() {
        return acumuladoGravable;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public double getLiquido() {
        return liquido;
    }

    public void setSdoBase(double sdoBase) {
        this.sdoBase = sdoBase;
    }

    public double getSdoBase() {
        return sdoBase;
    }

    public void setSdoBasePatron(double sdoBasePatron) {
        this.sdoBasePatron = sdoBasePatron;
    }

    public double getSdoBasePatron() {
        return sdoBasePatron;
    }

    public void setGravable(double gravable) {
        this.gravable = gravable;
    }

    public double getGravable() {
        return gravable;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    public void setQuincena(int quincena) {
        this.quincena = quincena;
        String sQna = String.valueOf(this.quincena);
        setNumQuincena(Integer.parseInt(sQna.substring(4, 6)));
        if (this.quincenaMovimiento == quincena) {
            setRetroactivo(true);
            /* preguntar si son nuevos ingresos para obtener el factor de calculo */
            /* otro movimiento obliga a ir al historico de pagos y hacer otro proceso */
            if (this.movimiento == 111 || this.movimiento == 112)
                obtFactor();
            else
                setFactor(1.0);
        } else {
            setRetroactivo(false);
            setFactor(1.0);
        }
    }

    // TODO: Metodo Modificado

    public void obtFactor() {
        Quincena qnaActual = new Quincena(this.quincena);
        Quincena qnaIni = new Quincena(this.fecUltimoMovto);
        setFactor((double)(qnaActual.diferenciaQuincenas(qnaIni) + 1));
    }

    public int getQuincena() {
        return quincena;
    }

    public void setNumQuincena(int numQuincena) {
        this.numQuincena = numQuincena;
    }

    public int getNumQuincena() {
        return numQuincena;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public boolean isPension() {
        return pension;
    }

    public void setRetroactivo(boolean retroactivo) {
        this.retroactivo = retroactivo;
    }

    public boolean isRetroactivo() {
        return retroactivo;
    }

    public void setConceptos(List<ConceptoPago> conceptos) {
        this.conceptos = conceptos;
    }

    public List<ConceptoPago> getConceptos() {
        return conceptos;
    }

    public void setPensiones(List<TdPension> pensiones) {
        this.pensiones = pensiones;
    }

    public List<TdPension> getPensiones() {
        return pensiones;
    }

    public void setConceptosPagados(List<TnConceptoPagado> conceptosPagados) {
        this.conceptosPagados = conceptosPagados;
    }

    public List<TnConceptoPagado> getConceptosPagados() {
        return conceptosPagados;
    }

    public void setConceptosReatroactivo(List<TnConceptoPagado> conceptosReatroactivo) {
        this.conceptosReatroactivo = conceptosReatroactivo;
    }

    public List<TnConceptoPagado> getConceptosReatroactivo() {
        return conceptosReatroactivo;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setNssEmpleado(String nssEmpleado) {
        this.nssEmpleado = nssEmpleado;
    }

    public String getNssEmpleado() {
        return nssEmpleado;
    }

    public void setNumPension(String numPension) {
        this.numPension = numPension;
    }

    public String getNumPension() {
        return numPension;
    }

    public void setCompatEmpleo(String compatEmpleo) {
        this.compatEmpleo = compatEmpleo;
    }

    public String getCompatEmpleo() {
        return compatEmpleo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
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

    public void setDescPuestoNom(String descPuestoNom) {
        this.descPuestoNom = descPuestoNom;
    }

    public String getDescPuestoNom() {
        return descPuestoNom;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setDescTipoPago(String descTipoPago) {
        this.descTipoPago = descTipoPago;
    }

    public String getDescTipoPago() {
        return descTipoPago;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setFecFinPago(Date fecFinPago) {
        this.fecFinPago = fecFinPago;
    }

    public Date getFecFinPago() {
        return fecFinPago;
    }
}
