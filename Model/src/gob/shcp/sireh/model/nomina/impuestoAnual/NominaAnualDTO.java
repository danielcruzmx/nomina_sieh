package gob.shcp.sireh.model.nomina.impuestoAnual;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

public class NominaAnualDTO implements Serializable, Model {
    private Long idNomina;
    private String idEdoNom;
    private Integer nomQnaCaptura;
    private String nomNumComplem = "0";
    private String idTipoNomina;
    private String descNomina;
    private String nomLeyenda;
    private String nomReglaCalculo;
    private String nomFuenteDatos;
    private Date nomIniPago;
    private Date nomFinPago;
    private Date nomFecPago;
    private Date nomFecDeposito;
    private String idGrupoPagoNom;
    private Date nomFecApertura;
    private Date nomFecCierre;
    private String nomCerrada = "N";

    private int idNextComplemento;
    private String tipoMantenimiento;
    private List<Integer> listadoQuincenas;

    private String nomDescTipoNomina;
    private String nomDescGrupoPago;
    private String nomDescEdoNomina;
    
    // Aguinaldo    
    private java.lang.Integer nomDiasPagar;
    private java.lang.String nomAplicarExentos;
    private java.lang.String nomVigente;
    private java.lang.String nomGratifAgui;
    private java.lang.String nomCompletarPeriodo;
    
    // Timbrado
    private java.util.Date nomFecCreacion;
    private byte[] nomArchCreacion;
    private FileContent nomArchCreacionFile;
    
    private java.util.Date nomFecAnexo20;
    private byte[] nomArchAnexo20;
    private FileContent nomArchAnexo20File;
    
    private java.util.Date nomFecTimbrado;
    private byte[] nomArchTimbrado;
    private FileContent nomArchTimbradoFile;
    
    private java.lang.String nomRefTimbrado;
    private java.util.Date nomFecCancSireh;
    private byte[] nomArchCanc;
    private FileContent nomArchCancFile;
    private java.util.Date nomFecCancSat;
    private java.lang.String nomRefSat;
    private java.util.Date nomFecCancA20;
    
    private Integer     ciclo;
    private Integer     casos;
    private Integer     trabajadores;
    private Integer     pencionados;
    private Double      percepciones;
    private Double      deducciones;
    private Double      percepcionesGravables;
    private Double      percepcionesExcedentes;
    private Double      deduccionesGravables;
    private Double      deduccionesExcedentes;
    
    private String      percepcionesLabel;
    private String      deduccionesLabel;
    private String      percepcionesGravablesLabel;
    private String      percepcionesExcedentesLabel;
    private String      deduccionesGravablesLabel;
    private String      deduccionesExcedentesLabel;
    
    public NominaAnualDTO(){}

    public void setIdNomina(Long idNomina) {
        this.idNomina = idNomina;
    }

    public Long getIdNomina() {
        return idNomina;
    }

    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
    }

    public void setNomQnaCaptura(Integer nomQnaCaptura) {
        this.nomQnaCaptura = nomQnaCaptura;
    }

    public Integer getNomQnaCaptura() {
        return nomQnaCaptura;
    }

    public void setNomNumComplem(String nomNumComplem) {
        this.nomNumComplem = nomNumComplem;
    }

    public String getNomNumComplem() {
        return nomNumComplem;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setDescNomina(String descNomina) {
        this.descNomina = descNomina;
    }

    public String getDescNomina() {
        return descNomina;
    }

    public void setNomLeyenda(String nomLeyenda) {
        this.nomLeyenda = nomLeyenda;
    }

    public String getNomLeyenda() {
        return nomLeyenda;
    }

    public void setNomReglaCalculo(String nomReglaCalculo) {
        this.nomReglaCalculo = nomReglaCalculo;
    }

    public String getNomReglaCalculo() {
        return nomReglaCalculo;
    }

    public void setNomFuenteDatos(String nomFuenteDatos) {
        this.nomFuenteDatos = nomFuenteDatos;
    }

    public String getNomFuenteDatos() {
        return nomFuenteDatos;
    }

    public void setNomIniPago(Date nomIniPago) {
        this.nomIniPago = nomIniPago;
    }

    public Date getNomIniPago() {
        return nomIniPago;
    }

    public void setNomFinPago(Date nomFinPago) {
        this.nomFinPago = nomFinPago;
    }

    public Date getNomFinPago() {
        return nomFinPago;
    }

    public void setNomFecPago(Date nomFecPago) {
        this.nomFecPago = nomFecPago;
    }

    public Date getNomFecPago() {
        return nomFecPago;
    }

    public void setNomFecDeposito(Date nomFecDeposito) {
        this.nomFecDeposito = nomFecDeposito;
    }

    public Date getNomFecDeposito() {
        return nomFecDeposito;
    }

    public void setIdGrupoPagoNom(String idGrupoPagoNom) {
        this.idGrupoPagoNom = idGrupoPagoNom;
    }

    public String getIdGrupoPagoNom() {
        return idGrupoPagoNom;
    }

    public void setNomFecApertura(Date nomFecApertura) {
        this.nomFecApertura = nomFecApertura;
    }

    public Date getNomFecApertura() {
        return nomFecApertura;
    }

    public void setNomFecCierre(Date nomFecCierre) {
        this.nomFecCierre = nomFecCierre;
    }

    public Date getNomFecCierre() {
        return nomFecCierre;
    }

    public void setNomCerrada(String nomCerrada) {
        this.nomCerrada = nomCerrada;
    }

    public String getNomCerrada() {
        return nomCerrada;
    }

    public void setIdNextComplemento(int idNextComplemento) {
        this.idNextComplemento = idNextComplemento;
    }

    public int getIdNextComplemento() {
        return idNextComplemento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setListadoQuincenas(List<Integer> listadoQuincenas) {
        this.listadoQuincenas = listadoQuincenas;
    }

    public List<Integer> getListadoQuincenas() {
        return listadoQuincenas;
    }

    public void setNomDescTipoNomina(String nomDescTipoNomina) {
        this.nomDescTipoNomina = nomDescTipoNomina;
    }

    public String getNomDescTipoNomina() {
        return nomDescTipoNomina;
    }

    public void setNomDescGrupoPago(String nomDescGrupoPago) {
        this.nomDescGrupoPago = nomDescGrupoPago;
    }

    public String getNomDescGrupoPago() {
        return nomDescGrupoPago;
    }

    public void setNomDescEdoNomina(String nomDescEdoNomina) {
        this.nomDescEdoNomina = nomDescEdoNomina;
    }

    public String getNomDescEdoNomina() {
        return nomDescEdoNomina;
    }

    public void setNomDiasPagar(Integer nomDiasPagar) {
        this.nomDiasPagar = nomDiasPagar;
    }

    public Integer getNomDiasPagar() {
        return nomDiasPagar;
    }

    public void setNomAplicarExentos(String nomAplicarExentos) {
        this.nomAplicarExentos = nomAplicarExentos;
    }

    public String getNomAplicarExentos() {
        return nomAplicarExentos;
    }

    public void setNomVigente(String nomVigente) {
        this.nomVigente = nomVigente;
    }

    public String getNomVigente() {
        return nomVigente;
    }

    public void setNomGratifAgui(String nomGratifAgui) {
        this.nomGratifAgui = nomGratifAgui;
    }

    public String getNomGratifAgui() {
        return nomGratifAgui;
    }

    public void setNomCompletarPeriodo(String nomCompletarPeriodo) {
        this.nomCompletarPeriodo = nomCompletarPeriodo;
    }

    public String getNomCompletarPeriodo() {
        return nomCompletarPeriodo;
    }

    public void setNomFecCreacion(Date nomFecCreacion) {
        this.nomFecCreacion = nomFecCreacion;
    }

    public Date getNomFecCreacion() {
        return nomFecCreacion;
    }

    public void setNomArchCreacion(byte[] nomArchCreacion) {
        this.nomArchCreacion = nomArchCreacion;
    }

    public byte[] getNomArchCreacion() {
        return nomArchCreacion;
    }

    public void setNomArchCreacionFile(FileContent nomArchCreacionFile) {
        this.nomArchCreacionFile = nomArchCreacionFile;
    }

    public FileContent getNomArchCreacionFile() {
        return nomArchCreacionFile;
    }

    public void setNomFecAnexo20(Date nomFecAnexo20) {
        this.nomFecAnexo20 = nomFecAnexo20;
    }

    public Date getNomFecAnexo20() {
        return nomFecAnexo20;
    }

    public void setNomArchAnexo20(byte[] nomArchAnexo20) {
        this.nomArchAnexo20 = nomArchAnexo20;
    }

    public byte[] getNomArchAnexo20() {
        return nomArchAnexo20;
    }

    public void setNomArchAnexo20File(FileContent nomArchAnexo20File) {
        this.nomArchAnexo20File = nomArchAnexo20File;
    }

    public FileContent getNomArchAnexo20File() {
        return nomArchAnexo20File;
    }

    public void setNomFecTimbrado(Date nomFecTimbrado) {
        this.nomFecTimbrado = nomFecTimbrado;
    }

    public Date getNomFecTimbrado() {
        return nomFecTimbrado;
    }

    public void setNomArchTimbrado(byte[] nomArchTimbrado) {
        this.nomArchTimbrado = nomArchTimbrado;
    }

    public byte[] getNomArchTimbrado() {
        return nomArchTimbrado;
    }

    public void setNomArchTimbradoFile(FileContent nomArchTimbradoFile) {
        this.nomArchTimbradoFile = nomArchTimbradoFile;
    }

    public FileContent getNomArchTimbradoFile() {
        return nomArchTimbradoFile;
    }

    public void setNomRefTimbrado(String nomRefTimbrado) {
        this.nomRefTimbrado = nomRefTimbrado;
    }

    public String getNomRefTimbrado() {
        return nomRefTimbrado;
    }

    public void setNomFecCancSireh(Date nomFecCancSireh) {
        this.nomFecCancSireh = nomFecCancSireh;
    }

    public Date getNomFecCancSireh() {
        return nomFecCancSireh;
    }

    public void setNomArchCanc(byte[] nomArchCanc) {
        this.nomArchCanc = nomArchCanc;
    }

    public byte[] getNomArchCanc() {
        return nomArchCanc;
    }

    public void setNomArchCancFile(FileContent nomArchCancFile) {
        this.nomArchCancFile = nomArchCancFile;
    }

    public FileContent getNomArchCancFile() {
        return nomArchCancFile;
    }

    public void setNomFecCancSat(Date nomFecCancSat) {
        this.nomFecCancSat = nomFecCancSat;
    }

    public Date getNomFecCancSat() {
        return nomFecCancSat;
    }

    public void setNomRefSat(String nomRefSat) {
        this.nomRefSat = nomRefSat;
    }

    public String getNomRefSat() {
        return nomRefSat;
    }

    public void setNomFecCancA20(Date nomFecCancA20) {
        this.nomFecCancA20 = nomFecCancA20;
    }

    public Date getNomFecCancA20() {
        return nomFecCancA20;
    }

    public void setCasos(Integer casos) {
        this.casos = casos;
    }

    public Integer getCasos() {
        return casos;
    }

    public void setTrabajadores(Integer trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Integer getTrabajadores() {
        return trabajadores;
    }

    public void setPencionados(Integer pencionados) {
        this.pencionados = pencionados;
    }

    public Integer getPencionados() {
        return pencionados;
    }

    public void setPercepciones(Double percepciones) {
        this.percepciones = percepciones;
    }

    public Double getPercepciones() {
        return percepciones;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setPercepcionesExcedentes(Double percepcionesExcedentes) {
        this.percepcionesExcedentes = percepcionesExcedentes;
    }

    public Double getPercepcionesExcedentes() {
        return percepcionesExcedentes;
    }

    public void setDeduccionesGravables(Double deduccionesGravables) {
        this.deduccionesGravables = deduccionesGravables;
    }

    public Double getDeduccionesGravables() {
        return deduccionesGravables;
    }

    public void setDeduccionesExcedentes(Double deduccionesExcedentes) {
        this.deduccionesExcedentes = deduccionesExcedentes;
    }

    public Double getDeduccionesExcedentes() {
        return deduccionesExcedentes;
    }

    public void setPercepcionesGravable(Double percepcionesGravables) {
        this.percepcionesGravables = percepcionesGravables;
    }

    public Double getPercepcionesGravables() {
        return percepcionesGravables;
    }

    public void setCiclo(Integer ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getCiclo() {
        return ciclo;
    }

    public void setPercepcionesGravables(Double percepcionesGravables) {
        this.percepcionesGravables = percepcionesGravables;
    }

    public void setPercepcionesLabel(String percepcionesLabel) {
        this.percepcionesLabel = percepcionesLabel;
    }

    public String getPercepcionesLabel() {
        return percepcionesLabel;
    }

    public void setDeduccionesLabel(String deduccionesLabel) {
        this.deduccionesLabel = deduccionesLabel;
    }

    public String getDeduccionesLabel() {
        return deduccionesLabel;
    }

    public void setPercepcionesGravablesLabel(String percepcionesGravablesLabel) {
        this.percepcionesGravablesLabel = percepcionesGravablesLabel;
    }

    public String getPercepcionesGravablesLabel() {
        return percepcionesGravablesLabel;
    }

    public void setPercepcionesExcedentesLabel(String percepcionesExcedentesLabel) {
        this.percepcionesExcedentesLabel = percepcionesExcedentesLabel;
    }

    public String getPercepcionesExcedentesLabel() {
        return percepcionesExcedentesLabel;
    }

    public void setDeduccionesGravablesLabel(String deduccionesGravablesLabel) {
        this.deduccionesGravablesLabel = deduccionesGravablesLabel;
    }

    public String getDeduccionesGravablesLabel() {
        return deduccionesGravablesLabel;
    }

    public void setDeduccionesExcedentesLabel(String deduccionesExcedentesLabel) {
        this.deduccionesExcedentesLabel = deduccionesExcedentesLabel;
    }

    public String getDeduccionesExcedentesLabel() {
        return deduccionesExcedentesLabel;
    }
}
