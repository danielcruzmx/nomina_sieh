package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.util.FileContent;

import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.util.Date;


public class ArchivosTimbrePdfDTO implements Model{
    private Long idNomina;
    private String idEdoNom;

    private Integer nomQnaCaptura;
    private String nomNumComplem = "0";
    private String idTipoNomina;
    private String descNomina;
    private String nomLeyenda;
    private String nomReglaCalculo;
    private String nomFuenteDatos;
    private String idGrupoPagoNom;
    private String nomCerrada = "N";
    
    public ArchivosTimbrePdfDTO() {
    }
    
    
    private byte[] nomArchPdfs;
    private FileContent nomArchPdfsFile;


    public void setNomArchPdfs(byte[] nomArchPdfs) {
        this.nomArchPdfs = nomArchPdfs;
    }

    public byte[] getNomArchPdfs() {
        return nomArchPdfs;
    }

    public void setNomArchPdfsFile(FileContent nomArchPdfsFile) {
        this.nomArchPdfsFile = nomArchPdfsFile;
    }

    public FileContent getNomArchPdfsFile() {
        return nomArchPdfsFile;
    }

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

    public void setIdGrupoPagoNom(String idGrupoPagoNom) {
        this.idGrupoPagoNom = idGrupoPagoNom;
    }

    public String getIdGrupoPagoNom() {
        return idGrupoPagoNom;
    }

    public void setNomCerrada(String nomCerrada) {
        this.nomCerrada = nomCerrada;
    }

    public String getNomCerrada() {
        return nomCerrada;
    }
}
