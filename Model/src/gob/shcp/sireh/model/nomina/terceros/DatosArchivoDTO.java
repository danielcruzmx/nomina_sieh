package gob.shcp.sireh.model.nomina.terceros;

import gob.shcp.fsn.model.Model;

import java.util.Date;
import java.util.List;


public class DatosArchivoDTO  implements java.io.Serializable, Model{ 

    private String rfc;
    private String curp;
    private Double importe;
    private String tipoMovimiento;
    private String referencia;
    private String concepto;
    private String tipoConcepto;
    private String idTercero;
    private String qna;
    private String qnaFin;
    private String numQuincenas;
    private Date dia;
    private String registro;
    private Double porcentaje;
    private String fechaIncidencia;
    private List lista;
    
    
    
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getIdTercero() {
		return idTercero;
	}
	public void setIdTercero(String idTercero) {
		this.idTercero = idTercero;
	}
        public void setQna(String qna) {
        this.qna = qna;
        }
        public String getQna() {
            return qna;
        }
	public String getQnaFin() {
		return qnaFin;
	}
	public void setQnaFin(String qnaFin) {
		this.qnaFin = qnaFin;
	}
	public String getNumQuincenas() {
		return numQuincenas;
	}
	public void setNumQuincenas(String numQuincenas) {
		this.numQuincenas = numQuincenas;
	}
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public List getLista() {
        return lista;
    }

    public void setTipoConcepto(String tipoConcepto) {
        this.tipoConcepto = tipoConcepto;
    }

    public String getTipoConcepto() {
        return tipoConcepto;
    }

    public void setFechaIncidencia(String fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
    }

    public String getFechaIncidencia() {
        return fechaIncidencia;
    }
    
}

