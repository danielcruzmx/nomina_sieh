package gob.shcp.sireh.model.nomina.gestion;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.util.FileContent;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class NominaDTO implements Serializable, Model {
    public static final String[] nominasSinValidacion = new String[]{ "VA"};
    private Long idNomina;
    @NotBlank
    @NotNull
    private String idEdoNom;
    @NotNull
    private Integer nomQnaCaptura;
    @NotBlank
    @NotNull
    private String nomNumComplem = "0";
    @NotBlank
    @NotNull
    private String idTipoNomina;
    private String descNomina;
    private String nomLeyenda;
    private String nomReglaCalculo;
    @NotBlank
    @NotNull
    private String nomFuenteDatos;
    @NotNull
    private Date nomIniPago;
    @NotNull
    private Date nomFinPago;
    @NotNull
    private Date nomFecPago;
    @NotNull
    private Date nomFecDeposito;
    @NotBlank
    @NotNull
    private String idGrupoPagoNom;
    @NotNull
    private Date nomFecApertura;
    @NotNull
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
    private java.lang.String nomIdPaqueteSat;
    private java.lang.Integer cnPaquete;
    private java.lang.String nomUriblobCanc;
    
    private java.lang.String nomUriblobTimb;    
    //Fonac
     private java.math.BigDecimal nomGobFed1;
     private java.math.BigDecimal nomGobFed2;
     private java.math.BigDecimal nomGobFed3;
     private java.math.BigDecimal nomGobFed4;
     
    private java.math.BigDecimal nomFacRen1;
    private java.math.BigDecimal nomFacRen2;
    
    private java.math.BigDecimal nomImpSin1;
    private java.math.BigDecimal nomImpSin2;
    
    private java.lang.Integer nomCicloFon;
    private java.lang.String nomRemesa;
    private java.util.Date fecModifico;
    private java.lang.String usuario;
    
    private boolean mantenimientoNominaInsertNomina;
    private boolean mantenimientoNominaUpdateNomina;
    
    public NominaDTO() {
    }

    public void setIdNomina(Long idNomina) {
        this.idNomina = idNomina;
    }

    public Long getIdNomina() {
        return idNomina;
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

    public void setIdGrupoPagoNom(String idGrupoPagoNom) {
        this.idGrupoPagoNom = idGrupoPagoNom;
    }

    public String getIdGrupoPagoNom() {
        return idGrupoPagoNom;
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

    @ValidationMethod(forProperty = "nomIniPago", errorCode = "error.select.unspecified")
    public boolean validateNomIniPago() {
        if( (this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomIniPago != null && nomFinPago != null && nomFecPago != null && nomFecDeposito != null && nomIniPago.before(nomFinPago) && nomIniPago.before(nomFecPago) && nomIniPago.before(nomFecDeposito);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomFinPago", errorCode = "error.select.unspecified")
    public boolean validateNomFinPago() {
        if(this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomIniPago != null && nomFinPago != null && nomIniPago.before(nomFinPago);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomFecPago", errorCode = "error.select.unspecified")
    public boolean validateNomFecPago() {
        if(this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomIniPago != null && nomFecPago != null && nomIniPago.before(nomFecPago);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomFecDeposito", errorCode = "error.select.unspecified")
    public boolean validateNomFecDeposito() {
        if(this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomIniPago != null && nomFecDeposito != null && nomIniPago.before(nomFecDeposito);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomFecApertura", errorCode = "error.select.unspecified")
    public boolean validateNomFecApertura() {
        if(this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomFecApertura != null && nomFecCierre != null && nomFecApertura.before(nomFecCierre);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomFecCierre", errorCode = "error.select.unspecified")
    public boolean validateNomFecCierre() {
        if(this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() && (this.getIdTipoNomina() != null && !ArrayUtils.contains(nominasSinValidacion, idTipoNomina)) ){
            return nomFecApertura != null && nomFecCierre != null && nomFecApertura.before(nomFecCierre);
        }
        return true;
    }

    @ValidationMethod(forProperty = "nomGobFed1", errorCode = "not.null")
    public boolean validateNomGobFed1() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomGobFed1() != null && (this.getNomGobFed1().compareTo(BigDecimal.ZERO) == 0 || (this.getNomGobFed1().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomGobFed1().compareTo(BigDecimal.valueOf(10000)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomGobFed2", errorCode = "not.null")
    public boolean validateNomGobFed2() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomGobFed2() != null && (this.getNomGobFed2().compareTo(BigDecimal.ZERO) == 0 || (this.getNomGobFed2().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomGobFed2().compareTo(BigDecimal.valueOf(10000)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomGobFed3", errorCode = "not.null")
    public boolean validateNomGobFed3() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomGobFed3() != null && (this.getNomGobFed3().compareTo(BigDecimal.ZERO) == 0 || (this.getNomGobFed3().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomGobFed3().compareTo(BigDecimal.valueOf(10000)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomGobFed4", errorCode = "not.null")
    public boolean validateNomGobFed4() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomGobFed4() != null && (this.getNomGobFed4().compareTo(BigDecimal.ZERO) == 0 || (this.getNomGobFed4().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomGobFed4().compareTo(BigDecimal.valueOf(10000)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomFacRen1", errorCode = "not.null")
    public boolean validateNomFacRen1() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomFacRen1() != null && (this.getNomFacRen1().compareTo(BigDecimal.ZERO) == 0 || (this.getNomFacRen1().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomFacRen1().compareTo(BigDecimal.valueOf(100.0)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomFacRen2", errorCode = "not.null")
    public boolean validateNomFacRen2() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomFacRen2() != null && (this.getNomFacRen2().compareTo(BigDecimal.ZERO) == 0 || (this.getNomFacRen2().compareTo(BigDecimal.valueOf(0.000001)) != -1  && this.getNomFacRen2().compareTo(BigDecimal.valueOf(100.0)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomImpSin1", errorCode = "not.null")
    public boolean validateNomImpSin1() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomImpSin1() != null && (this.getNomImpSin1().compareTo(BigDecimal.ZERO) == 0 || (this.getNomImpSin1().compareTo(BigDecimal.valueOf(0.01)) != -1  && this.getNomImpSin1().compareTo(BigDecimal.valueOf(100000.0)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomImpSin2", errorCode = "not.null")
    public boolean validateNomImpSin2() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomImpSin2() != null && (this.getNomImpSin2().compareTo(BigDecimal.ZERO) == 0 || (this.getNomImpSin2().compareTo(BigDecimal.valueOf(0.01)) != -1  && this.getNomImpSin2().compareTo(BigDecimal.valueOf(100000.0)) == -1));
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomCicloFon", errorCode = "not.null")
    public boolean validateNomCicloFon() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomCicloFon() != null;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "nomRemesa", errorCode = "not.null")
    public boolean validateNomRemesa() {
        if ((this.isMantenimientoNominaInsertNomina() || this.isMantenimientoNominaUpdateNomina() ) && this.getIdTipoNomina() != null && (this.getIdTipoNomina().equals("FO") || (this.getIdTipoNomina().equals("FE")))) {
            return this.getNomRemesa() != null && this.getNomRemesa().length() > 0;
        }
        return true;
    }
    
    public void setIdNextComplemento(int idNextComplemento) {
        this.idNextComplemento = idNextComplemento;
    }

    public int getIdNextComplemento() {
        return idNextComplemento;
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

    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
    }

    public void setDescNomina(String descNomina) {
        this.descNomina = descNomina;
    }

    public String getDescNomina() {
        return descNomina;
    }

    public String getNomDescEdoNomina() {
        return nomDescEdoNomina;
    }

    public void setNomDescEdoNomina(String nomDescEdoNomina) {
        this.nomDescEdoNomina = nomDescEdoNomina;
    }

    public Integer getNomDiasPagar() {
        return nomDiasPagar;
    }

    public void setNomDiasPagar(Integer nomDiasPagar) {
        this.nomDiasPagar = nomDiasPagar;
    }

    public String getNomAplicarExentos() {
        return nomAplicarExentos;
    }

    public void setNomAplicarExentos(String nomAplicarExentos) {
        this.nomAplicarExentos = nomAplicarExentos;
    }

    public String getNomVigente() {
        return nomVigente;
    }

    public void setNomVigente(String nomVigente) {
        this.nomVigente = nomVigente;
    }

    public String getNomGratifAgui() {
        return nomGratifAgui;
    }

    public void setNomGratifAgui(String nomGratifAgui) {
        this.nomGratifAgui = nomGratifAgui;
    }

    public String getNomCompletarPeriodo() {
        return nomCompletarPeriodo;
    }

    public void setNomCompletarPeriodo(String nomCompletarPeriodo) {
        this.nomCompletarPeriodo = nomCompletarPeriodo;
    }
    
    public void setNomFecCreacion(Date nomFecCreacion) {
        this.nomFecCreacion = nomFecCreacion;
    }

    public Date getNomFecCreacion() {
        return nomFecCreacion;
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

    public void setNomArchCreacionFile(FileContent nomArchCreacionFile) {
        this.nomArchCreacionFile = nomArchCreacionFile;
    }

    public FileContent getNomArchCreacionFile() {
        return nomArchCreacionFile;
    }

    public void setNomArchAnexo20File(FileContent nomArchAnexo20File) {
        this.nomArchAnexo20File = nomArchAnexo20File;
    }

    public FileContent getNomArchAnexo20File() {
        return nomArchAnexo20File;
    }

    public void setNomArchTimbradoFile(FileContent nomArchTimbradoFile) {
        this.nomArchTimbradoFile = nomArchTimbradoFile;
    }

    public FileContent getNomArchTimbradoFile() {
        return nomArchTimbradoFile;
    }

    public void setNomArchCancFile(FileContent nomArchCancFile) {
        this.nomArchCancFile = nomArchCancFile;
    }

    public FileContent getNomArchCancFile() {
        return nomArchCancFile;
    }

    public void setNomArchCreacion(byte[] nomArchCreacion) {
        this.nomArchCreacion = nomArchCreacion;
    }

    public byte[] getNomArchCreacion() {
        return nomArchCreacion;
    }


    public void setNomGobFed1(BigDecimal nomGobFed1) {
        this.nomGobFed1 = nomGobFed1;
    }

    public BigDecimal getNomGobFed1() {
        return nomGobFed1;
    }

    public void setNomGobFed2(BigDecimal nomGobFed2) {
        this.nomGobFed2 = nomGobFed2;
    }

    public BigDecimal getNomGobFed2() {
        return nomGobFed2;
    }

    public void setNomGobFed3(BigDecimal nomGobFed3) {
        this.nomGobFed3 = nomGobFed3;
    }

    public BigDecimal getNomGobFed3() {
        return nomGobFed3;
    }

    public void setNomGobFed4(BigDecimal nomGobFed4) {
        this.nomGobFed4 = nomGobFed4;
    }

    public BigDecimal getNomGobFed4() {
        return nomGobFed4;
    }

    public void setNomFacRen1(BigDecimal nomFacRen1) {
        this.nomFacRen1 = nomFacRen1;
    }

    public BigDecimal getNomFacRen1() {
        return nomFacRen1;
    }

    public void setNomFacRen2(BigDecimal nomFacRen2) {
        this.nomFacRen2 = nomFacRen2;
    }

    public BigDecimal getNomFacRen2() {
        return nomFacRen2;
    }

    public void setNomImpSin1(BigDecimal nomImpSin1) {
        this.nomImpSin1 = nomImpSin1;
    }

    public BigDecimal getNomImpSin1() {
        return nomImpSin1;
    }

    public void setNomImpSin2(BigDecimal nomImpSin2) {
        this.nomImpSin2 = nomImpSin2;
    }

    public BigDecimal getNomImpSin2() {
        return nomImpSin2;
    }

    public void setNomCicloFon(Integer nomCicloFon) {
        this.nomCicloFon = nomCicloFon;
    }

    public Integer getNomCicloFon() {
        return nomCicloFon;
    }

    public void setNomRemesa(String nomRemesa) {
        this.nomRemesa = nomRemesa;
    }

    public String getNomRemesa() {
        return nomRemesa;
    }

    public void setMantenimientoNominaInsertNomina(boolean mantenimientoNominaInsertNomina) {
        this.mantenimientoNominaInsertNomina = mantenimientoNominaInsertNomina;
    }

    public boolean isMantenimientoNominaInsertNomina() {
        return mantenimientoNominaInsertNomina;
    }

    public void setMantenimientoNominaUpdateNomina(boolean mantenimientoNominaUpdateNomina) {
        this.mantenimientoNominaUpdateNomina = mantenimientoNominaUpdateNomina;
    }

    public boolean isMantenimientoNominaUpdateNomina() {
        return mantenimientoNominaUpdateNomina;
    }

    public void setNomIdPaqueteSat(String nomIdPaqueteSat) {
        this.nomIdPaqueteSat = nomIdPaqueteSat;
    }

    public String getNomIdPaqueteSat() {
        return nomIdPaqueteSat;
    }

    public void setFecModifico(Date fecModifico) {
        this.fecModifico = fecModifico;
    }

    public Date getFecModifico() {
        return fecModifico;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setCnPaquete(Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }

    public Integer getCnPaquete() {
        return cnPaquete;
    }

    public void setNomUriblobCanc(String nomUriblobCanc) {
        this.nomUriblobCanc = nomUriblobCanc;
    }

    public String getNomUriblobCanc() {
        return nomUriblobCanc;
    }

    public void setNomUriblobTimb(String nomUriblobTimb) {
        this.nomUriblobTimb = nomUriblobTimb;
    }

    public String getNomUriblobTimb() {
        return nomUriblobTimb;
    }
}
