package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.HashMap;
import java.util.Map;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;

import org.springmodules.validation.bean.conf.loader.annotation.handler.RegExp;
import org.springmodules.validation.bean.conf.loader.annotation.handler.ValidationMethod;

/**
 * Model object for transporting CambioNombreCurp data.
 */
public class CambioNombreCurpDTO implements java.io.Serializable, Model {

    private java.lang.String rfcEmpleado;
    
    private java.lang.String primerApellido;
    
    private java.lang.String segundoApellido;
    
    @NotBlank
    @NotNull
    private java.lang.String nombreEmpleado;
    
    @NotBlank
    @NotNull
    private java.lang.String idGenero;
    
    @NotNull
    private Integer idEdoNac;
    
    @RegExp("[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]")
    @NotBlank
    @NotNull
    private java.lang.String curpEmpleado;
    
    @NotNull
    private java.util.Date fecNacimiento;

    private boolean curpVerificado;
    private boolean verificar;

    /**
     * Constructor for CambioNombreCurpDTO class.
     */
    public CambioNombreCurpDTO() {
    }

    /**
     * Constructor for CambioNombreCurpDTO class.
     *
     * @param rfcEmpleado java.lang.String
     * @param primerApellido java.lang.String
     * @param segundoApellido java.lang.String
     * @param nombreEmpleado java.lang.String
     * @param idGenero java.lang.String
     * @param idEdoNac Integer
     * @param curpEmpleado java.lang.String
     * @param fecNacimiento java.util.Date
     */
    public CambioNombreCurpDTO(java.lang.String rfcEmpleado, 
                               java.lang.String primerApellido, 
                               java.lang.String segundoApellido, 
                               java.lang.String nombreEmpleado, 
                               java.lang.String idGenero, Integer idEdoNac, 
                               java.lang.String curpEmpleado, 
                               java.util.Date fecNacimiento) {

        this.rfcEmpleado = rfcEmpleado;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreEmpleado = nombreEmpleado;
        this.idGenero = idGenero;
        this.idEdoNac = idEdoNac;
        this.curpEmpleado = curpEmpleado;
        this.fecNacimiento = fecNacimiento;
    }

    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
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

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setIdGenero(String idGenero) {
        this.idGenero = idGenero;
    }

    public String getIdGenero() {
        return idGenero;
    }

    public void setIdEdoNac(Integer idEdoNac) {
        this.idEdoNac = idEdoNac;
    }

    public Integer getIdEdoNac() {
        return idEdoNac;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public boolean isCurpVerificado() {
        return curpVerificado;
    }

    public void setCurpVerificado(boolean curpVerificado) {
        this.curpVerificado = curpVerificado;
    }

    public boolean isVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }
    
    @ValidationMethod(forProperty = "primerApellido", errorCode = "primerApellido.invalido", applyIf = "verificar=true")
    private boolean validatePrimerApellido() {
        if( curpEmpleado == null || curpEmpleado.length() == 0 || this.getNombreEmpleado() == null || this.getNombreEmpleado().length() == 0) {
            return false;
        }
        setCurpVerificado(true);
        
        if(this.getPrimerApellido() == null || this.getPrimerApellido().equals("")){
            return true;
        }
        
        String curpIngresado = getCurpEmpleado();
        String consonanteVocal = curpIngresado.substring(0, 2);
        String consonanteVocalIngresado = generaCurpPrimerApellido();
        
        return consonanteVocal.equals(consonanteVocalIngresado) ? true: false;
    }
    
    @ValidationMethod(forProperty = "segundoApellido", errorCode = "segundoApellido.invalido", applyIf = "verificar=true")
    private boolean validateSegundoApellido() {
        if( curpEmpleado == null || curpEmpleado.length() == 0 || this.getSegundoApellido() == null || this.getSegundoApellido().length() == 0) {
            return false;
        }
        setCurpVerificado(true);
        
        if (this.getSegundoApellido() == null || this.getSegundoApellido().equals("")) {
            return true;
        }
        
        String curpIngresado = getCurpEmpleado();
        String consonanteVocal = curpIngresado.substring(2, 3);
        
        String consonanteVocalIngresado = generaCurpSegundoApellido();
        
        return consonanteVocal.equals(consonanteVocalIngresado) ? true: false;
    }
    
    @ValidationMethod(forProperty = "nombreEmpleado", errorCode = "nombreEmpleado.invalido", applyIf = "verificar=true")
    private boolean validateNombreEmpleado() {
        if( curpEmpleado == null || curpEmpleado.length() == 0 || this.getNombreEmpleado() == null || this.getNombreEmpleado().length() == 0) {
            return false;
        }
        setCurpVerificado(true);
        
        if (this.getNombreEmpleado() == null || this.getNombreEmpleado().equals("")) {
            return true;
        }
        
        String curpIngresado = getCurpEmpleado();
        String consonanteVocal = curpIngresado.substring(3, 4);
        
        String consonanteVocalIngresado = generaCurpNombreEmpleado();
        
        return consonanteVocal.equals(consonanteVocalIngresado) ? true: false;
    }
    
    @ValidationMethod(forProperty = "fecNacimiento", errorCode = "fecha.invalida", applyIf = "verificar=true")
    private boolean validateFechaNacimiento() {
        if( fecNacimiento == null || curpEmpleado == null || curpEmpleado.length() == 0 ) {
            return false;
        }
        setCurpVerificado(true);
        String curpIngresado = getCurpEmpleado();
        Date fechaIngresada = getFecNacimiento();
        
        // Obtener fecha con base en el curp ingresado
        String anioNacimiento = curpIngresado.substring(4, 6);
        String mesNacimiento = curpIngresado.substring(6, 8);
        String diaNacimiento = curpIngresado.substring(8, 10);
        
        // Obtener fecha ingresada
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(false);
        String strFecNacimiento = df.format(fechaIngresada);

        String anioIngresado = strFecNacimiento.substring(2, 4);
        String mesIngresado = strFecNacimiento.substring(5, 7);
        String diaIngresado = strFecNacimiento.substring(8, 10);
        
        if (!anioIngresado.equals(anioNacimiento)) {
            return false;
        }
        if (!mesIngresado.equals(mesNacimiento)) {
            return false;
        }
        if (!diaIngresado.equals(diaNacimiento)) {
            return false;
        }
        return true;
    }
    
    @ValidationMethod(forProperty = "idGenero", errorCode = "genero.invalido", applyIf = "verificar=true")
    private boolean validateGenero() {
        if( idGenero == null || idGenero.length() == 0 || curpEmpleado == null || curpEmpleado.length() == 0 ) {
            return false;
        }
        setCurpVerificado(true);
        String curpIngresado = getCurpEmpleado().toUpperCase();
        String generoIngresado = getIdGenero().toUpperCase();
        String generoCurp = curpIngresado.substring(10, 11);
        String generoIngresadoCustom = generoIngresado.equals("M") ? "H" : "M";
        return generoCurp.equals(generoIngresadoCustom) ? true: false;
    }
    
    @ValidationMethod(forProperty = "idEdoNac", errorCode = "entidad.invalida", applyIf = "verificar=true")
    private boolean validateEntidadFederativa() {
        setCurpVerificado(true);
        String curpIngresado = getCurpEmpleado();
        String edoNacCurp = null;
        if( curpIngresado == null || curpIngresado.length() < 13 ) {
            return false;
        }
        edoNacCurp = curpIngresado.toUpperCase().substring(11, 13);
        
        Map entidades = new HashMap();
        entidades.put(1, "AS"); entidades.put(2, "BC"); entidades.put(3,"BS"); entidades.put(4,"CC");
        entidades.put(5,"CL");  entidades.put(6,"CM"); entidades.put(7,"CS"); entidades.put(8,"CH");
        entidades.put(9,"DF");  entidades.put(10,"DG"); entidades.put(11,"GT"); entidades.put(12,"GR");
        entidades.put(13,"HG"); entidades.put(14,"JC"); entidades.put(15,"MC"); entidades.put(16,"MN"); 
        entidades.put(17,"MS"); entidades.put(18,"NT"); entidades.put(19,"NL"); entidades.put(20,"OC"); 
        entidades.put(21,"PL"); entidades.put(22,"QT"); entidades.put(23,"QR"); entidades.put(24,"SP");
        entidades.put(25,"SL"); entidades.put(26,"SR"); entidades.put(27,"TC"); entidades.put(28,"TS");
        entidades.put(29,"TL"); entidades.put(30,"VZ"); entidades.put(31,"YN"); entidades.put(32,"ZS");
        entidades.put(33,"NE");
        entidades.put(34,"");
        
        String edoNacIngresado = (String)entidades.get(getIdEdoNac());
        
        return edoNacCurp.equals(edoNacIngresado) ? true: false;
    }
        
    /*@ValidationMethod(forProperty = "idEdoNac", errorCode = "entidad.vacio", applyIf = "verificar=true")
    public boolean validateEntidadFederativa() {
        return this.getIdEdoNac() != 0;
    }*/
    
    /*@ValidationMethod(forProperty = "idEdoNac", errorCode = "entidad.invalida", applyIf = "verificar=true")
    private boolean validateEntidadFederativa() {
        setCurpVerificado(true);
        String curpIngresado = getCurpEmpleado();
        String edoNacIngresado = getIdEdoNac().toString().toUpperCase();
        String edoNacCurp = curpIngresado.toUpperCase().substring(11, 13);
        
        return edoNacCurp.equals(edoNacIngresado) ? true: false;
    }*/
    
    /*
    @ValidationMethod(forProperty = "idEdoNac", errorCode = "entidad.invalida", applyIf = "verificar=true")
    private boolean validateEntidadFederativa() {
        setCurpVerificado(true);
        String curpIngresado = getCurpEmpleado();
        String edoNacIngresado = getIdEdoNac().toUpperCase().trim();
        
        String edoNacCurp = curpIngresado.toUpperCase().substring(11, 13);
        
        return edoNacCurp.equals(edoNacIngresado.substring(5, 7)) ? true: false;
    }*/
    
    private String generaCurpPrimerApellido() {
        int indicev = 0, indicec = 0, indicem = 0, indicen = 0, i = 0;

        // OBTIENE INICIAL, PRIMERA VOCAL INTERNA Y PRIMERA CONSONANTE DEL PRIMER APELLIDO
        String app = getPrimerApellido().toUpperCase();
        char appi = app.charAt(0);
        for (i = 1; i <= app.length() - 1; i++) {
            char app1 = app.charAt(i);
            String app2 = String.valueOf(app1);

            if (app2.equals("A") | app2.equals("E") | app2.equals("I") | 
                app2.equals("O") | app2.equals("U")) {
                indicev = i;
                break;
            }
        }

        char apps = app.charAt(indicev);
        return String.valueOf(appi) + String.valueOf(apps);
    }
    
    private String generaCurpSegundoApellido() {
        int indicev = 0, indicec = 0, indicem = 0, indicen = 0, i = 0;

        // OBTIENE INICIAL Y PRIMERA CONSONANTE DEL SEGUNDO APELLIDO
        String apm = getSegundoApellido().toUpperCase();
        char apmi = apm.charAt(0);

        return String.valueOf(apmi);
    }
    
    private String generaCurpNombreEmpleado() {
        int indicev = 0, indicec = 0, indicem = 0, indicen = 0, i = 0;

        // OBTIENE INICIAL  DEL NOMBRE DE PILA
        String nom = getNombreEmpleado().toUpperCase();
        
        String[] arrayNombre = nom.split(" ");
        if (arrayNombre != null && arrayNombre.length > 1 && (arrayNombre[0].equalsIgnoreCase("JUAN")  || arrayNombre[0].equalsIgnoreCase("MARIA")) ){
            nom = arrayNombre[1];
        }
        
        char nomi = nom.charAt(0);
        return String.valueOf(nomi);
    }
}
