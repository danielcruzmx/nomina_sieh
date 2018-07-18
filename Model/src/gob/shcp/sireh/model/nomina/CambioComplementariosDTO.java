package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.springmodules.validation.bean.conf.loader.annotation.handler.MaxLength;
//import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
//import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

/**
 * Model object for transporting CambioComplementariosDTO data.
 */ 
public class CambioComplementariosDTO implements java.io.Serializable, Model {
    private java.lang.String curpEmpleado;
    private java.lang.String rfcEmpleado;
    private java.lang.String primerApellido;
    private java.lang.String segundoApellido;
    private java.lang.String nombreEmpleado;
    private java.lang.String clabeEmpleado;
    
    private java.lang.String idBancoSar;
    private java.util.Date ingresoGobFed;
    private java.util.Date ingresoDependencia;
    private java.util.Date terminoCargoSind;
    @RegExp("[0-9]{11,11}")
    private java.lang.String imssIssste;
    private java.lang.String EMailOficial;
    private java.lang.String EMailPersonal;
    private java.lang.Integer idRusp;
    private java.lang.String sistemaReparto;
    private java.lang.String idTipoPago;
    private java.lang.String idEdoCivil;
    private java.lang.String idNacionalidad;
    private java.lang.String idProfnCarrera;
    private java.lang.Integer idNivelEscolar;
    private java.lang.Integer idInstEducativa;
    private java.lang.Integer idEspProtCivil;
    private java.lang.Integer idInstProtcivil;
    private java.util.Date fecNotDecPatr;
    private java.util.Date fecIniDeclPatr;
    
    private java.util.Date fecIngSpc;
    private java.lang.String casoMuestra;
    private java.lang.String discapacidad;
    private java.lang.String estudiaSiNo;
    private java.lang.String padreMadre;
    private java.lang.String compatEmpleo;  
    private java.lang.String usuario;
    private java.lang.Integer idInmuebleP;
    private java.lang.String plazaTelOfc1;
    private java.lang.String plazaExt1;

    /**
    * Constructor for CambioComplementariosDTO class.
    */    
    public CambioComplementariosDTO() { }
    
    /**
    * Constructor for CambioComplementariosDTO class.
    */
    public CambioComplementariosDTO(java.lang.String curpEmpleado,
                                    java.lang.String rfcEmpleado,
                                    java.lang.String primerApellido,
                                    java.lang.String segundoApellido,
                                    java.lang.String nombreEmpleado,
                                    java.lang.String clabeEmpleado,
                                    java.lang.String idBancoSar,
                                    java.util.Date ingresoGobFed, 
                                    java.util.Date ingresoDependencia, 
                                    java.util.Date terminoCargoSind, 
                                    java.lang.String imssIssste, 
                                    java.lang.String EMailOficial, 
                                    java.lang.String EMailPersonal,
                                    java.lang.Integer idRusp, 
                                    java.lang.String sistemaReparto, 
                                    java.lang.String idTipoPago, 
                                    java.lang.String idEdoCivil, 
                                    java.lang.String idNacionalidad, 
                                    java.lang.String idProfnCarrera, 
                                    java.lang.Integer idNivelEscolar, 
                                    java.lang.Integer idInstEducativa, 
                                    java.lang.Integer idEspProtCivil, 
                                    java.lang.Integer idInstProtcivil, 
                                    java.util.Date fecNotDecPatr, 
                                    java.util.Date fecIniDeclPatr, 
                                    java.util.Date fecIngSpc, 
                                    java.lang.String casoMuestra,
                                    java.lang.String discapacidad,
                                    java.lang.String estudiaSiNo,
                                    java.lang.String padreMadre,
                                    java.lang.String compatEmpleo,
                                    java.lang.String usuario,
                                    java.lang.Integer idInmuebleP,
                                    java.lang.String plazaTelOfc1,
                                    java.lang.String plazaExt1) { 
        this.curpEmpleado = curpEmpleado;
        this.rfcEmpleado = rfcEmpleado;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.clabeEmpleado = clabeEmpleado;
        this.idBancoSar = idBancoSar;
        this.ingresoGobFed = ingresoGobFed;
        this.ingresoDependencia = ingresoDependencia;
        this.terminoCargoSind = terminoCargoSind;
        this.imssIssste = imssIssste;
        this.EMailOficial = EMailOficial;
        this.EMailPersonal = EMailPersonal;
        this.idRusp = idRusp;
        this.sistemaReparto = sistemaReparto;
        this.idTipoPago = idTipoPago;
        this.idEdoCivil = idEdoCivil;
        this.idNacionalidad = idNacionalidad;
        this.idProfnCarrera = idProfnCarrera;
        this.idNivelEscolar = idNivelEscolar;
        this.idInstEducativa = idInstEducativa;
        this.idEspProtCivil = idEspProtCivil;
        this.idInstProtcivil = idInstProtcivil;
        this.fecNotDecPatr = fecNotDecPatr;
        this.fecIniDeclPatr = fecIniDeclPatr;
        this.fecIngSpc = fecIngSpc;
        this.casoMuestra = casoMuestra;
        this.discapacidad = discapacidad;
        this.estudiaSiNo = estudiaSiNo;
        this.padreMadre = padreMadre;
        this.compatEmpleo = compatEmpleo;
        this.usuario = usuario;
        this.idInmuebleP = idInmuebleP;
        this.plazaTelOfc1 = plazaTelOfc1;
        this.plazaExt1 = plazaExt1;
    }

    
    /**
     * Set ingresoGobFed value.
     *
     * @param ingresoGobFed java.util.Date
     */
    public void setIngresoGobFed(Date ingresoGobFed) {
        this.ingresoGobFed = ingresoGobFed;
    }

    /**
     * Get ingresoGobFed value.
     *
     * @return java.util.Date
     */
    public Date getIngresoGobFed() {
        return ingresoGobFed;
    }

    /**
     * Set ingresoDependencia value.
     *
     * @param ingresoDependencia java.util.Date
     */
    public void setIngresoDependencia(Date ingresoDependencia) {
        this.ingresoDependencia = ingresoDependencia;
    }

    /**
     * Get ingresoDependencia value.
     *
     * @return java.util.Date
     */
    public Date getIngresoDependencia() {
        return ingresoDependencia;
    }

    /**
     * Set terminoCargoSind value.
     *
     * @param terminoCargoSind java.util.Date
     */
    public void setTerminoCargoSind(Date terminoCargoSind) {
        this.terminoCargoSind = terminoCargoSind;
    }

    /**
     * Get terminoCargoSind value.
     *
     * @return java.util.Date
     */
    public Date getTerminoCargoSind() {
        return terminoCargoSind;
    }

    /**
     * Set imssIssste value.
     *
     * @param imssIssste java.lang.String
     */
    public void setImssIssste(String imssIssste) {
        this.imssIssste = imssIssste;
    }

    /**
     * Get imssIssste value.
     *
     * @return java.lang.String
     */
    public String getImssIssste() {
        return imssIssste;
    }

    /**
     * Set EMailOficial value.
     *
     * @param eMailOficial java.lang.String
     */
    public void setEMailOficial(String eMailOficial) {
        this.EMailOficial = eMailOficial;
    }

    /**
     * Get EMailOficial value.
     *
     * @return java.lang.String
     */
    public String getEMailOficial() {
        return EMailOficial;
    }

    /**
     * Set EMailPersonal value.
     *
     * @param eMailPersonal java.lang.String
     */
    public void setEMailPersonal(String eMailPersonal) {
        this.EMailPersonal = eMailPersonal;
    }

    /**
     * Get EMailPersonal value.
     *
     * @return java.lang.String
     */
    public String getEMailPersonal() {
        return EMailPersonal;
    }

    /**
     * Set idRusp value.
     *
     * @param idRusp java.lang.Integer
     */
    public void setIdRusp(Integer idRusp) {
        this.idRusp = idRusp;
    }

    /**
     * Get idRusp value.
     *
     * @return java.lang.Integer
     */
    public Integer getIdRusp() {
        return this.idRusp;
    }

    /**
     * Set sistemaReparto value.
     *
     * @param sistemaReparto java.lang.String
     */
    public void setSistemaReparto(String sistemaReparto) {
        this.sistemaReparto = sistemaReparto;
    }

    /**
     * Get sistemaReparto value.
     *
     * @return java.lang.String
     */
    public String getSistemaReparto() {
        return sistemaReparto;
    }

    /**
     * Set idTipoPago value.
     *
     * @param idTipoPago java.lang.String
     */
    public void setIdTipoPago(String idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    /**
     * Get idTipoPago value.
     *
     * @return java.lang.String
     */
    public String getIdTipoPago() {
        return idTipoPago;
    }

    /**
     * Set idEdoCivil value.
     *
     * @param idEdoCivil java.lang.String
     */
    public void setIdEdoCivil(String idEdoCivil) {
        this.idEdoCivil = idEdoCivil;
    }

    /**
     * Get idEdoCivil value.
     *
     * @return java.lang.String
     */
    public String getIdEdoCivil() {
        return idEdoCivil;
    }

    /**
     * Set idNacionalidad value.
     *
     * @param idNacionalidad java.lang.String
     */
    public void setIdNacionalidad(String idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    /**
     * Get idNacionalidad value.
     *
     * @return java.lang.String
     */
    public String getIdNacionalidad() {
        return idNacionalidad;
    }

    /**
     * Set idProfnCarrera value.
     *
     * @param idProfnCarrera java.lang.Float
     */
    public void setIdProfnCarrera(String idProfnCarrera) {
        this.idProfnCarrera = idProfnCarrera;
    }

    /**
     * Get idProfnCarrera value.
     *
     * @return java.lang.Float
     */
    public String getIdProfnCarrera() {
        return idProfnCarrera;
    }

    /**
     * Set idNivelEscolar value.
     *
     * @param idNivelEscolar java.lang.Integer
     */
    public void setIdNivelEscolar(Integer idNivelEscolar) {
        this.idNivelEscolar = idNivelEscolar;
    }

    /**
     * Get idNivelEscolar value.
     *
     * @return java.lang.Integer
     */
    public Integer getIdNivelEscolar() {
        return idNivelEscolar;
    }

    /**
     * Set idInstEducativa value.
     *
     * @param idInstEducativa java.lang.Integer
     */
    public void setIdInstEducativa(Integer idInstEducativa) {
        this.idInstEducativa = idInstEducativa;
    }

    /**
     * Get idInstEducativa value.
     *
     * @return java.lang.Integer
     */
    public Integer getIdInstEducativa() {
        return idInstEducativa;
    }

    /**
     * Set idEspProtCivil value.
     *
     * @param idEspProtCivil java.lang.Integer
     */
    public void setIdEspProtCivil(Integer idEspProtCivil) {
        this.idEspProtCivil = idEspProtCivil;
    }

    /**
     * Get idEspProtCivil value.
     *
     * @return java.lang.Integer
     */
    public Integer getIdEspProtCivil() {
        return idEspProtCivil;
    }

    /**
     * Set idInstProtcivil value.
     *
     * @param idInstProtcivil java.lang.Integer
     */
    public void setIdInstProtcivil(Integer idInstProtcivil) {
        this.idInstProtcivil = idInstProtcivil;
    }
    
    /**
     * Get idInstProtcivil value.
     *
     * @return java.lang.Integer
     */
    public Integer getIdInstProtcivil() {
        return idInstProtcivil;
    }

    /**
     * Set fecNotDecPatr value.
     *
     * @param fecNotDecPatr java.util.Date
     */
    public void setFecNotDecPatr(Date fecNotDecPatr) {
        if(fecNotDecPatr.equals(null) || fecNotDecPatr.equals("")){
            this.fecNotDecPatr = null;
        } else  this.fecNotDecPatr = fecNotDecPatr;
    }

    /**
     * Get fecNotDecPatr value.
     *
     * @return java.util.Date
     */
    public Date getFecNotDecPatr() {
        return fecNotDecPatr;
    }

    /**
     * Set fecIniDeclPatr value.
     *
     * @param fecIniDeclPatr java.util.Date
     */
    public void setFecIniDeclPatr(Date fecIniDeclPatr) {
        if(fecIniDeclPatr.equals(null) || fecIniDeclPatr.equals("")){
            this.fecIniDeclPatr = null;
        } else  this.fecIniDeclPatr = fecIniDeclPatr;
    }

    /**
     * Get fecIniDeclPatr value.
     *
     * @return java.util.Date
     */
    public Date getFecIniDeclPatr() {
        return fecIniDeclPatr;
    }

    /**
     * Set fecIngSpc value.
     *
     * @param fecIngSpc java.util.Date
     */
    public void setFecIngSpc(Date fecIngSpc) {
        this.fecIngSpc = fecIngSpc;
    }
    
    /**
     * Get fecIngSpc value.
     *
     * @return java.util.Date
     */
    public Date getFecIngSpc() {
        return fecIngSpc;
    }

    /**
     * Set casoMuestra value.
     *
     * @param casoMuestra java.lang.String
     */
    public void setCasoMuestra(String casoMuestra) {
        this.casoMuestra = casoMuestra;
    }

    /**
     * Get casoMuestra value.
     *
     * @return java.lang.String
     */
    public String getCasoMuestra() {
        return casoMuestra;
    }

    /**
     * Set discapacidad value.
     *
     * @param discapacidad java.lang.String
     */
    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Get discapacidad value.
     *
     * @return java.lang.String
     */
    public String getDiscapacidad() {
        return discapacidad;
    }

    /**
     * Set estudiaSiNo value.
     *
     * @param estudiaSiNo java.lang.String
     */
    public void setEstudiaSiNo(String estudiaSiNo) {
        this.estudiaSiNo = estudiaSiNo;
    }

    /**
     * Get estudiaSiNo value.
     *
     * @return java.lang.String
     */
    public String getEstudiaSiNo() {
        return estudiaSiNo;
    }

    /**
     * Set padreMadre value.
     *
     * @param padreMadre java.lang.String
     */
    public void setPadreMadre(String padreMadre) {
        this.padreMadre = padreMadre;
    }

    /**
     * Get padreMadre value.
     *
     * @return java.lang.String
     */
    public String getPadreMadre() {
        return padreMadre;
    }

    /**
     * Set compatEmpleo value.
     *
     * @param compatEmpleo java.lang.String
     */
    public void setCompatEmpleo(String compatEmpleo) {
        this.compatEmpleo = compatEmpleo;
    }

    /**
     * Get compatEmpleo value.
     *
     * @return java.lang.String
     */
    public String getCompatEmpleo() {
        return compatEmpleo;
    }

    /**
     * Set usuario value.
     *
     * @param usuario java.lang.String
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Get usuario value.
     *
     * @return java.lang.String
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Set curpEmpleado value.
     *
     * @param curpEmpleado java.lang.String
     */
    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    /**
     * Get curpEmpleado value.
     *
     * @return java.lang.String
     */
    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    /**
     * Set primerApellido value.
     *
     * @param primerApellido java.lang.String
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Get primerApellido value.
     *
     * @return java.lang.String
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Set segundoApellido value.
     *
     * @param segundoApellido java.lang.String
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Get segundoApellido value.
     *
     * @return java.lang.String
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Set nombreEmpleado value.
     *
     * @param nombreEmpleado java.lang.String
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * Get nombreEmpleado value.
     *
     * @return java.lang.String
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Set clabeEmpleado value.
     *
     * @param clabeEmpleado java.lang.String
     */
    public void setClabeEmpleado(String clabeEmpleado) {
        this.clabeEmpleado = clabeEmpleado;
    }

    /**
     * Get clabeEmpleado value.
     *
     * @return java.lang.String
     */
    public String getClabeEmpleado() {
        return clabeEmpleado;
    }

    /**
     * Set rfcEmpleado value.
     *
     * @param rfcEmpleado java.lang.String
     */
    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }
    
    public void setIdBancoSar(String idBancoSar) {
        this.idBancoSar = idBancoSar;
    }

    public String getIdBancoSar() {
        return idBancoSar;
    }
/*        
    @ValidationMethod(forProperty = "idRusp", errorCode = "formato.incorrecto")
     private boolean validateIdRusp() {
        boolean retorno = false;
        if( this.getIdRusp() != null ) {
            Pattern pat = Pattern.compile("[0-9]{1,9999999}");
            Matcher mat = pat.matcher(this.getIdRusp().toString());
            if (mat.matches()) {
                retorno = true;
            } else { retorno = false; }
        } return retorno;  
     }
*/    
    @ValidationMethod(forProperty = "idEdoCivil", errorCode = "unselected.option")
     private boolean validateIdEdoCivil() {
        if(this.getIdEdoCivil().equals("0"))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "sistemaReparto", errorCode = "unselected.option")
     private boolean validateSistemaReparto() {
        if(this.getSistemaReparto().equals("0"))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idNacionalidad", errorCode = "unselected.option")
     private boolean validateIdNacionalidad() {
        if(this.getIdNacionalidad().equals(""))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idInstEducativa", errorCode = "unselected.option")
     private boolean validateIdInstEducativa() {
        if(this.getIdInstEducativa() == -1)
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idNivelEscolar", errorCode = "unselected.option")
     private boolean validateIdNivelEscolar() {
        if(this.getIdNivelEscolar() == -1)
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idProfnCarrera", errorCode = "unselected.option")
     private boolean validateIdProfnCarrera() {
        if(this.getIdProfnCarrera().equalsIgnoreCase("-1"))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idInstProtcivil", errorCode = "unselected.option")
     private boolean validateIdInstProtCivil() {
        if(this.getIdInstProtcivil() == 0)
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idEspProtCivil", errorCode = "unselected.option")
     private boolean validateIdEspProtCivil() {
        if(this.getIdEspProtCivil() == 0)
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "idBancoSar", errorCode = "unselected.option")
     private boolean validateIdBancoSar() {
        if(this.getIdBancoSar().equals("0"))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "ingresoGobFed", errorCode = "unselected.option")
     private boolean validateIngresoGobFed() {
        if(this.getIngresoGobFed().equals(null))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "ingresoDependencia", errorCode = "unselected.option")
     private boolean validateIngresoDependencia() {
        if(this.getIngresoDependencia().equals(null))
            return false;
        else return true;
     }
     
    @ValidationMethod(forProperty = "terminoCargoSind", errorCode = "unselected.option")
     private boolean validateTerminoCargoSindical() {
        if(this.getTerminoCargoSind().equals(null))
            return false;
        else return true;
     }
/*     
    @ValidationMethod(forProperty = "fecNotDecPatr", errorCode = "unselected.option")
     private boolean validateFecNotDecPatr() {
        if(this.getFecNotDecPatr().equals(null))
            return false;
        else return true;
     }
    
    @ValidationMethod(forProperty = "fecIniDeclPatr", errorCode = "unselected.option")
     private boolean validateFecDeclPatr() {
        if(this.getFecIniDeclPatr().equals(null))
            return false;
        else return true;
     }
       
    @ValidationMethod(forProperty = "fecIngSpc", errorCode = "unselected.option")
     private boolean validateFecIngrEPC() {
        if(this.getFecIngSpc().equals(null))
            return false;
        else return true;
     }
 */  
 @ValidationMethod(forProperty = "idInmuebleP", errorCode = "unselected.option")
  private boolean validateIdInmubleP() {
     if(this.getIdInmuebleP().equals(null))
         return false;
     else return true;
  }
    @ValidationMethod(forProperty = "EMailPersonal", errorCode = "formato.incorrecto")
    private boolean validateEmailPersonal() {
        boolean retorno = false;
        if(!this.getEMailPersonal().equals("")){
            Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher mat = pat.matcher(this.getEMailPersonal() );
            if(mat.matches()){
                retorno = true;
            } else{  retorno = false;  }
        } else { retorno = true; }
        return retorno;
    }
    
    @ValidationMethod(forProperty = "EMailOficial", errorCode = "formato.incorrecto")
    private boolean validateEmailOficial() {
        boolean retorno = false;
        if(!this.getEMailOficial().equals("")){
            Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher mat = pat.matcher(this.getEMailOficial() );
            if(mat.matches()){
                retorno = true;
            } else retorno = false;
        } else {  retorno =  true;  }
        return retorno;
    }

    public void setIdInmuebleP(Integer idInmuebleP) {
        this.idInmuebleP = idInmuebleP;
    }

    public Integer getIdInmuebleP() {
        return idInmuebleP;
    }

    public void setPlazaTelOfc1(String plazaTelOfc1) {
        this.plazaTelOfc1 = plazaTelOfc1;
    }

    public String getPlazaTelOfc1() {
        return plazaTelOfc1;
    }

    public void setPlazaExt1(String plazaExt1) {
        this.plazaExt1 = plazaExt1;
    }

    public String getPlazaExt1() {
        return plazaExt1;
    }
}
