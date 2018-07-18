package gob.shcp.sireh.domain.jdbc.rusp;

import gob.shcp.fsn.data.Domain;

import java.io.Serializable;


public class Rusp implements Domain, Serializable {
    private String  ciclo;
    private Integer iCiclo;
    private String  quincena;
    private Integer iQuincena;
    private Integer  quincenaAnterior;
    private String  cicloQna;
    private String  iCicloQna;
    private String  fecha;
    private String  email;
    private String  listNominas;
    private Integer numRegistros;
    private String escenario;
    
    private String[] seleccionConsecNomina;
    private String   beanlista;
    
    private boolean generaArchivo;
    private boolean muestraNominas;
    private boolean muestraReporte;
    private boolean limpiar;
    private boolean procesar;
    private String usuario;
    
    public Rusp() {
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setQuincena(String quincena) {
        this.quincena = quincena;
    }

    public String getQuincena() {
        return quincena;
    }

    public void setCicloQna(String cicloQna) {
        this.cicloQna = cicloQna;
    }

    public String getCicloQna() {
        return cicloQna;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setListNominas(String listNominas) {
        this.listNominas = listNominas;
    }

    public String getListNominas() {
        return listNominas;
    }

    public void setSeleccionConsecNomina(String[] seleccionConsecNomina) {
        this.seleccionConsecNomina = seleccionConsecNomina;
    }

    public String[] getSeleccionConsecNomina() {
        return seleccionConsecNomina;
    }

    public void setBeanlista(String beanlista) {
        this.beanlista = beanlista;
    }

    public String getBeanlista() {
        return beanlista;
    }

    public void setGeneraArchivo(boolean generaArchivo) {
        this.generaArchivo = generaArchivo;
    }

    public boolean isGeneraArchivo() {
        return generaArchivo;
    }

    public void setMuestraNominas(boolean muestraNominas) {
        this.muestraNominas = muestraNominas;
    }

    public boolean isMuestraNominas() {
        return muestraNominas;
    }

    public void setLimpiar(boolean limpiar) {
        this.limpiar = limpiar;
    }

    public boolean isLimpiar() {
        return limpiar;
    }

    public void setIdentity(Serializable id) {
    }

    public Serializable getIdentity() {
        return null;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setNumRegistros(Integer numRegistros) {
        this.numRegistros = numRegistros;
    }

    public Integer getNumRegistros() {
        return numRegistros;
    }

    public void setMuestraReporte(boolean muestraReporte) {
        this.muestraReporte = muestraReporte;
    }

    public boolean isMuestraReporte() {
        return muestraReporte;
    }

    public void setProcesar(boolean procesar) {
        this.procesar = procesar;
    }

    public boolean isProcesar() {
        return procesar;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setICiclo(Integer iCiclo) {
        this.iCiclo = iCiclo;
    }

    public Integer getICiclo() {
        return iCiclo;
    }

    public void setIQuincena(Integer iQuincena) {
        this.iQuincena = iQuincena;
    }

    public Integer getIQuincena() {
        return iQuincena;
    }

    public void setQuincenaAnterior(Integer quincenaAnterior) {
        this.quincenaAnterior = quincenaAnterior;
    }

    public Integer getQuincenaAnterior() {
        return quincenaAnterior;
    }

    public void setICicloQna(String iCicloQna) {
        this.iCicloQna = iCicloQna;
    }

    public String getICicloQna() {
        return iCicloQna;
    }
}
