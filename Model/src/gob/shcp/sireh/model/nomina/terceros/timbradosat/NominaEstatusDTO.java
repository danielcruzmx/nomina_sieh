package gob.shcp.sireh.model.nomina.terceros.timbradosat;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

public class NominaEstatusDTO  implements Serializable, Model {

    
        public NominaEstatusDTO() {
        }
    
    private Integer[] idGrupo;
    
    private Integer quincena;
    private String tipoNomina;
    private List<String> listIdTipoNomina;
    private String grupoPago;
    private String idEdoNom;
    private Long idNomina;
    private Integer nomQnaCaptura;
    private String nomNumComplem;;
    private String idTipoNomina;
    private String descNomina;
    private Date nomIniPago;
    private Date nomFinPago;
    private Date nomFecPago;
    private Date nomFecDeposito;
    private String idGrupoPagoNom;
    private String nomDescTipoNomina;
    private String nomDescGrupoPago;
    private Date nomFecApertura;
    private Date nomFecCierre;
    private java.lang.String nomRefTimbrado;
    private java.lang.Integer cnPaquete;

    // Configuracion inicial
    private String beanName;
    
    // Navegacion
    private String urlOrigen;
    private String urlDestino;
    
    // Control
    private boolean cancel;
    private boolean update;
    
    
    
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }



    public Integer getQuincena() {
        return quincena;
    }

    public void setQuincena(Integer quincena) {
        this.quincena = quincena;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public void setGrupoPago(String grupoPago) {
        this.grupoPago = grupoPago;
    }

    public String getGrupoPago() {
        return grupoPago;
    }

    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
    }

    public void setIdGrupo(Integer[] idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer[] getIdGrupo() {
        return idGrupo;
    }

    public void setListIdTipoNomina(List<String> listIdTipoNomina) {
        this.listIdTipoNomina = listIdTipoNomina;
    }

    public List<String> getListIdTipoNomina() {
        return listIdTipoNomina;
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

    public void setDescNomina(String descNomina) {
        this.descNomina = descNomina;
    }

    public String getDescNomina() {
        return descNomina;
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

    public void setNomRefTimbrado(String nomRefTimbrado) {
        this.nomRefTimbrado = nomRefTimbrado;
    }

    public String getNomRefTimbrado() {
        return nomRefTimbrado;
    }

    public void setCnPaquete(Integer cnPaquete) {
        this.cnPaquete = cnPaquete;
    }

    public Integer getCnPaquete() {
        return cnPaquete;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isUpdate() {
        return update;
    }
    
}
