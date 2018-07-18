package gob.shcp.sireh.model.configuracion.movimientos;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;


public class MovimientoConceptoPagoDTO
    implements Serializable, Model {

    @NotBlank
    @NotNull
    private String idTipoConceptoPago;

    private String descConceptoPago;
    private String tipoMantenimiento;

    private String idTipoCpto;
    private String idCptoPago;
    @NotBlank
    private String cpcTipoCaptura;
    @NotBlank
    private String cpcTipoCalculo;
    private String cpcNivelesPto;
    @NotBlank
    private String cpcNombramiento;
    @NotBlank
    private String cpcPermanente;
    @NotBlank
    private String cpcBloque = "N";
    private String cpcMensaje;
    private String cpcSubtipo;

    private List<String> idsNivelesPto = new ArrayList<String>();
    private String[] opciones = new String[10];
    private Double[] valores = new Double[10];

    private String numOpciones = "0";
    private boolean isNew = false;

    public MovimientoConceptoPagoDTO() {
    }

    public void setIdTipoCpto(String idTipoCpto) {
        this.idTipoCpto = idTipoCpto;
    }

    public String getIdTipoCpto() {
        return idTipoCpto;
    }

    public void setIdCptoPago(String idCptoPago) {
        this.idCptoPago = idCptoPago;
    }

    public String getIdCptoPago() {
        return idCptoPago;
    }

    public void setCpcTipoCaptura(String cpcTipoCaptura) {
        this.cpcTipoCaptura = cpcTipoCaptura;
    }

    public String getCpcTipoCaptura() {
        return cpcTipoCaptura;
    }

    public void setCpcTipoCalculo(String cpcTipoCalculo) {
        this.cpcTipoCalculo = cpcTipoCalculo;
    }

    public String getCpcTipoCalculo() {
        return cpcTipoCalculo;
    }

    public void setCpcNombramiento(String cpcNombramiento) {
        this.cpcNombramiento = cpcNombramiento;
    }

    public String getCpcNombramiento() {
        return cpcNombramiento;
    }

    public void setCpcPermanente(String cpcPermanente) {
        this.cpcPermanente = cpcPermanente;
    }

    public String getCpcPermanente() {
        return cpcPermanente;
    }

    public void setCpcMensaje(String cpcMensaje) {
        this.cpcMensaje = cpcMensaje;
    }

    public String getCpcMensaje() {
        return cpcMensaje;
    }

    public void setCpcSubtipo(String cpcSubtipo) {
        this.cpcSubtipo = cpcSubtipo;
    }

    public String getCpcSubtipo() {
        return cpcSubtipo;
    }

    public void setIdTipoConceptoPago(String idTipoConceptoPago) {
        this.idTipoConceptoPago = idTipoConceptoPago;
    }

    public String getIdTipoConceptoPago() {
        return idTipoConceptoPago;
    }

    public void setNumOpciones(String numOpciones) {
        this.numOpciones = numOpciones;
    }

    public String getNumOpciones() {
        return numOpciones;
    }

    public int calculaNumOpciones() {

        int counter = opciones.length;
        for( int i=opciones.length-1; i>=0; i-- ) {
            if( opciones[i] != null && !opciones[i].equals("") ) {
                break;
            } else if( valores[i] != null && valores[i] != 0 ) {
                break;
            }
            counter--;
        }

        return counter;
    }

    public void setIdsNivelesPto(List<String> idsNivelesPto) {
        this.idsNivelesPto = idsNivelesPto;
    }

    public List<String> getIdsNivelesPto() {
        return idsNivelesPto;
    }

    public void setCpcNivelesPto(String cpcNivelesPto) {
        this.cpcNivelesPto = cpcNivelesPto;
    }

    public String getCpcNivelesPto() {
        return cpcNivelesPto;
    }

    public void setDescConceptoPago(String descConceptoPago) {
        this.descConceptoPago = descConceptoPago;
    }

    public String getDescConceptoPago() {
        return descConceptoPago;
    }

    public boolean getBloqueChecked() {
        return cpcBloque.equals("S");
    }

    public void setBloqueChecked(boolean isChecked) {
        this.cpcBloque = isChecked ? "S" : "N";
    }

    public void setCpcOpcion1(String opcion1) {
        if (opcion1 != null) {
            opcion1 = opcion1.trim();
        }
        this.opciones[0] = opcion1;
    }

    public String getCpcOpcion1() {
        return opciones[0];
    }

    public void setCpcOpcion2(String opcion2) {
        if (opcion2 != null) {
            opcion2 = opcion2.trim();
        }
        this.opciones[1] = opcion2;
    }

    public String getCpcOpcion2() {
        return opciones[1];
    }

    public void setCpcOpcion3(String opcion3) {
        if (opcion3 != null) {
            opcion3 = opcion3.trim();
        }
        this.opciones[2] = opcion3;
    }

    public String getCpcOpcion3() {
        return opciones[2];
    }

    public void setCpcOpcion4(String opcion4) {
        if (opcion4 != null) {
            opcion4 = opcion4.trim();
        }
        this.opciones[3] = opcion4;
    }

    public String getCpcOpcion4() {
        return opciones[3];
    }

    public void setCpcOpcion5(String opcion5) {
        if (opcion5 != null) {
            opcion5 = opcion5.trim();
        }
        this.opciones[4] = opcion5;
    }

    public String getCpcOpcion5() {
        return opciones[4];
    }

    public void setCpcOpcion6(String opcion6) {
        if (opcion6 != null) {
            opcion6 = opcion6.trim();
        }
        this.opciones[5] = opcion6;
    }

    public String getCpcOpcion6() {
        return opciones[5];
    }

    public void setCpcOpcion7(String opcion7) {
        if (opcion7 != null) {
            opcion7 = opcion7.trim();
        }
        this.opciones[6] = opcion7;
    }

    public String getCpcOpcion7() {
        return opciones[6];
    }

    public void setCpcOpcion8(String opcion8) {
        if (opcion8 != null) {
            opcion8 = opcion8.trim();
        }
        this.opciones[7] = opcion8;
    }

    public String getCpcOpcion8() {
        return opciones[7];
    }

    public void setCpcOpcion9(String opcion9) {
        if (opcion9 != null) {
            opcion9 = opcion9.trim();
        }
        this.opciones[8] = opcion9;
    }

    public String getCpcOpcion9() {
        return opciones[8];
    }

    public void setCpcOpcion0(String opcion0) {
        if (opcion0 != null) {
            opcion0 = opcion0.trim();
        }
        this.opciones[9] = opcion0;
    }

    public String getCpcOpcion0() {
        return opciones[9];
    }

    public void setCpcValor1(Double valor1) {
        this.valores[0] = valor1;
    }

    public Double getCpcValor1() {
        return valores[0];
    }

    public void setCpcValor2(Double valor2) {
        this.valores[1] = valor2;
    }

    public Double getCpcValor2() {
        return valores[1];
    }

    public void setCpcValor3(Double valor3) {
        this.valores[2] = valor3;
    }

    public Double getCpcValor3() {
        return valores[2];
    }

    public void setCpcValor4(Double valor4) {
        this.valores[3] = valor4;
    }

    public Double getCpcValor4() {
        return valores[3];
    }

    public void setCpcValor5(Double valor5) {
        this.valores[4] = valor5;
    }

    public Double getCpcValor5() {
        return valores[4];
    }

    public void setCpcValor6(Double valor6) {
        this.valores[5] = valor6;
    }

    public Double getCpcValor6() {
        return valores[5];
    }

    public void setCpcValor7(Double valor7) {
        this.valores[6] = valor7;
    }

    public Double getCpcValor7() {
        return valores[6];
    }

    public void setCpcValor8(Double valor8) {
        this.valores[7] = valor8;
    }

    public Double getCpcValor8() {
        return valores[7];
    }

    public void setCpcValor9(Double valor9) {
        this.valores[8] = valor9;
    }

    public Double getCpcValor9() {
        return valores[8];
    }

    public void setCpcValor0(Double valor0) {
        this.valores[9] = valor0;
    }

    public Double getCpcValor0() {
        return valores[9];
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setCpcBloque(String cpcBloque) {
        this.cpcBloque = cpcBloque;
    }

    public String getCpcBloque() {
        return cpcBloque;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean getIsNew() {
        return isNew;
    }
}
