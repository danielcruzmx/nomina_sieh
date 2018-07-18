package gob.shcp.sireh.model;

import gob.shcp.fsn.model.Model;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CfdiDTO implements Model, java.io.Serializable {
    
    /***** Nodo Comprobante *****/
    private String compVersion;
    private String compFolio;
    private String compFecha;
    private String compSubTotal;
    private String compTotal;
    private String compDescuento;
    private String compLugarExpedicion;
    private String compContadores;
    private String compFormaPago;
    private String compNoCertificado;
    private String compCertificado;
    private String compMoneda;
    private String compMetodoPago;
    private String compTipoComprobante;
    private String compCadenaOriginal;
    private String compSelloDigital;
    private String compCodeQr;
    private String nominaPdf;
    
    /***** Nodo Comprobante - Emisor *****/
    private String emisorNombre;
    private String emisorRfc;
    private String emisorRegimen;
    
    /***** Nodo Comprobante - Receptor *****/
    private String receptorRfc;
    private String receptorNombre;
    private String receptorUsoCFDI;
    
    /***** Nodo Comprobante - Conceptos - Concepto *****/
    private String conceptosConceptoCantidad;
    private String conceptosConceptoUnidad;
    private String conceptosConceptoDescripcion;
    private String conceptosConceptoValorUnitario;
    private String conceptosConceptoImporte;
    
    private String conceptosConceptoClaveProdServ;
    private String conceptosConceptoClaveUnidad;
        
    /***** Nodo Comprobante - Complemento - Nomina *****/
    private String compNomVersion;
    private String compNomTipoNomina;
    private String compNomFechaPago;
    private String compNomFechaInicialPago;
    private String compNomFechaFinalPago;
    private String compNomNumDiasPagados;
    private String compNomTotalPercepciones;
    private String compNomTotalDeducciones;
    
    private String compNomTotalOtrosPagos;
    
    /***** Nodo Comprobante - Complemento - Nomina - Emisor *****/
    private String complNomEmiRegistroPatronal;
    private String complNomEmiEntidadSNCFOrigenRecurso;
    
    /***** Nodo comprobante - Complemento - Nomina - Receptor *****/
    private String complNomRecCurp;
    private String complNomRecNumSeguridadSocial;
    private String complNomRecFechaInicioRelLaboral;
    private String complNomRecAntigüedad;
    private String complNomRecTipoContrato;
    private String complNomRecTipoJornada;
    private String complNomRecTipoRegimen;
    private String complNomRecNumEmpleado;
    private String complNomRecPuesto;
    private String complNomRecRiesgoPuesto;
    private String complNomRecPeriodicidadPago;
    private String complNomRecCuentaBancaria;
    private String complNomRecSalarioDiarioIntegrado;
    private String complNomRecClaveEntFed;
    
    private String complNomRecDepartamento;
    private String complNomRecBanco;
    
    /***** Nodo comprobante - Complemento - Nomina - Percepciones *****/
    private String complNomPercsTotalSueldos;
    private String complNomPercsTotalGravado;
    private String complNomPercsTotalExento;
    
    /***** Nodo comprobante - Complemento - Nomina - Deducciones *****/
    private String complNomDeducsTotalOtrasDeducciones;
    private String complNomDeducsTotalImpuestosRetenidos;
    
    /***** Nodo Comprobantes - Complemento - Nomina - Percepciones *****/
    private List<PercepcionesDeduccionesDTO> percepciones;
    
    /***** Nodo Comprobantes - Complemento - Nomina - Deducciones *****/
    private List<PercepcionesDeduccionesDTO> deducciones;
    
    /***** Timbre Fiscal Digital *****/
    private String timbreFiscalDigitalVersion;
    private String timbreFiscalDigitalUuid;
    private String timbreFiscalDigitalFechaTimbrado;
    private String timbreFiscalDigitalSelloCFD;
    private String timbreFiscalDigitalNoCertificadoSAT;
    private String timbreFiscalDigitalSelloSAT;
    
     // Consultados a la base de datos
     private String unidad;
     private String descUnidad;
     private String puesto;
     private String descPuesto;
     private String ciclo;
     private String qnaPago;
     private String plaza;
     private String nivel;
     private String cadenaOriginal;
     private String cnConsecNomina;
     private String pcp;
     private String nomLeyenda;
     private String descNombramiento;

    public void setCompVersion(String compVersion) {
        this.compVersion = compVersion;
    }

    public String getCompVersion() {
        return compVersion;
    }
//2017-05-18T14:39:53
    public void setCompFolio(String compFolio) {
        String[] stringArr = compFolio.split("_");
        this.compFolio = stringArr[0];
    }

    public String getCompFolio() {
        return compFolio;
    }
    public void setCompSubTotal(String compSubTotal) {
        this.compSubTotal = compSubTotal;
    }

    public String getCompSubTotal() {
        return compSubTotal;
    }

    public void setCompTotal(String compTotal) {
        this.compTotal = compTotal;
    }

    public String getCompTotal() {
        return compTotal;
    }

    public void setCompDescuento(String compDescuento) {
        this.compDescuento = compDescuento;
    }

    public String getCompDescuento() {
        return compDescuento;
    }

    public void setCompLugarExpedicion(String compLugarExpedicion) {
        this.compLugarExpedicion = compLugarExpedicion;
    }

    public String getCompLugarExpedicion() {
        return compLugarExpedicion;
    }

    public void setCompContadores(String compContadores) {
        this.compContadores = compContadores;
    }

    public String getCompContadores() {
        return compContadores;
    }

    public void setCompFormaPago(String compFormaPago) {
        this.compFormaPago = compFormaPago;
    }

    public String getCompFormaPago() {
        return compFormaPago;
    }

    public void setCompNoCertificado(String compNoCertificado) {
        this.compNoCertificado = compNoCertificado;
    }

    public String getCompNoCertificado() {
        return compNoCertificado;
    }

    public void setCompCertificado(String compCertificado) {
        this.compCertificado = compCertificado;
    }

    public String getCompCertificado() {
        return compCertificado;
    }

    public void setCompMoneda(String compMoneda) {
        this.compMoneda = compMoneda;
    }

    public String getCompMoneda() {
        return compMoneda;
    }

    public void setCompMetodoPago(String compMetodoPago) {
        this.compMetodoPago = compMetodoPago;
    }

    public String getCompMetodoPago() {
        return compMetodoPago;
    }

    public void setCompTipoComprobante(String compTipoComprobante) {
        this.compTipoComprobante = compTipoComprobante;
    }

    public String getCompTipoComprobante() {
        return compTipoComprobante;
    }

    public void setCompCadenaOriginal(String compCadenaOriginal) {
        this.compCadenaOriginal = compCadenaOriginal;
    }

    public String getCompCadenaOriginal() {
        return this.compCadenaOriginal;
    }

    public void setCompSelloDigital(String compSelloDigital) {
        this.compSelloDigital = compSelloDigital;
    }

    public String getCompSelloDigital() {
        return compSelloDigital;
    }

    public void setCompCodeQr(String compCodeQr) {
        this.compCodeQr = compCodeQr;
    }

    public String getCompCodeQr() {
        return compCodeQr;
    }

    public void setEmisorNombre(String emisorNombre) {
        this.emisorNombre = emisorNombre;
    }

    public String getEmisorNombre() {
        return emisorNombre;
    }

    public void setEmisorRfc(String emisorRfc) {
        this.emisorRfc = emisorRfc;
    }

    public String getEmisorRfc() {
        return emisorRfc;
    }

    public void setEmisorRegimen(String emisorRegimen) {
        this.emisorRegimen = emisorRegimen;
    }

    public String getEmisorRegimen() {
        return emisorRegimen;
    }

    public void setReceptorRfc(String receptorRfc) {
        this.receptorRfc = receptorRfc;
    }

    public String getReceptorRfc() {
        return receptorRfc;
    }

    public void setReceptorNombre(String receptorNombre) {
        this.receptorNombre = receptorNombre;
    }

    public String getReceptorNombre() {
        return receptorNombre;
    }

    public void setConceptosConceptoCantidad(String conceptosConceptoCantidad) {
        this.conceptosConceptoCantidad = conceptosConceptoCantidad;
    }

    public String getConceptosConceptoCantidad() {
        return conceptosConceptoCantidad;
    }

    public void setConceptosConceptoUnidad(String conceptosConceptoUnidad) {
        this.conceptosConceptoUnidad = conceptosConceptoUnidad;
    }

    public String getConceptosConceptoUnidad() {
        return conceptosConceptoUnidad;
    }

    public void setConceptosConceptoDescripcion(String conceptosConceptoDescripcion) {
        this.conceptosConceptoDescripcion = conceptosConceptoDescripcion;
    }

    public String getConceptosConceptoDescripcion() {
        return conceptosConceptoDescripcion;
    }

    public void setConceptosConceptoValorUnitario(String conceptosConceptoValorUnitario) {
        this.conceptosConceptoValorUnitario = conceptosConceptoValorUnitario;
    }

    public String getConceptosConceptoValorUnitario() {
        return conceptosConceptoValorUnitario;
    }

    public void setConceptosConceptoImporte(String conceptosConceptoImporte) {
        this.conceptosConceptoImporte = conceptosConceptoImporte;
    }

    public String getConceptosConceptoImporte() {
        return conceptosConceptoImporte;
    }

    public void setCompNomVersion(String compNomVersion) {
        this.compNomVersion = compNomVersion;
    }

    public String getCompNomVersion() {
        return compNomVersion;
    }

    public void setCompNomTipoNomina(String compNomTipoNomina) {
        this.compNomTipoNomina = compNomTipoNomina;
    }

    public String getCompNomTipoNomina() {
        return compNomTipoNomina;
    }

    public void setCompNomFechaPago(String compNomFechaPago) {
        this.compNomFechaPago = compNomFechaPago;
    }

    public String getCompNomFechaPago() {
        return compNomFechaPago;
    }

    public void setCompNomFechaInicialPago(String compNomFechaInicialPago) {
        this.compNomFechaInicialPago = compNomFechaInicialPago;
    }

    public String getCompNomFechaInicialPago() {
        return compNomFechaInicialPago;
    }

    public void setCompNomFechaFinalPago(String compNomFechaFinalPago) {
        this.compNomFechaFinalPago = compNomFechaFinalPago;
    }

    public String getCompNomFechaFinalPago() {
        return compNomFechaFinalPago;
    }

    public void setCompNomNumDiasPagados(String compNomNumDiasPagados) {
        this.compNomNumDiasPagados = compNomNumDiasPagados;
    }

    public String getCompNomNumDiasPagados() {
        return compNomNumDiasPagados;
    }

    public void setCompNomTotalPercepciones(String compNomTotalPercepciones) {
        this.compNomTotalPercepciones = compNomTotalPercepciones;
    }

    public String getCompNomTotalPercepciones() {
        return compNomTotalPercepciones;
    }

    public void setCompNomTotalDeducciones(String compNomTotalDeducciones) {
        this.compNomTotalDeducciones = compNomTotalDeducciones;
    }

    public String getCompNomTotalDeducciones() {
        return compNomTotalDeducciones;
    }

    public void setComplNomEmiRegistroPatronal(String complNomEmiRegistroPatronal) {
        this.complNomEmiRegistroPatronal = complNomEmiRegistroPatronal;
    }

    public String getComplNomEmiRegistroPatronal() {
        return complNomEmiRegistroPatronal;
    }

    public void setComplNomEmiEntidadSNCFOrigenRecurso(String complNomEmiEntidadSNCFOrigenRecurso) {
        this.complNomEmiEntidadSNCFOrigenRecurso = complNomEmiEntidadSNCFOrigenRecurso;
    }

    public String getComplNomEmiEntidadSNCFOrigenRecurso() {
        return complNomEmiEntidadSNCFOrigenRecurso;
    }

    public void setComplNomRecCurp(String complNomRecCurp) {
        this.complNomRecCurp = complNomRecCurp;
    }

    public String getComplNomRecCurp() {
        return complNomRecCurp;
    }

    public void setComplNomRecNumSeguridadSocial(String complNomRecNumSeguridadSocial) {
        this.complNomRecNumSeguridadSocial = complNomRecNumSeguridadSocial;
    }

    public String getComplNomRecNumSeguridadSocial() {
        return complNomRecNumSeguridadSocial;
    }

    public void setComplNomRecFechaInicioRelLaboral(String complNomRecFechaInicioRelLaboral) {
        this.complNomRecFechaInicioRelLaboral = complNomRecFechaInicioRelLaboral;
    }

    public String getComplNomRecFechaInicioRelLaboral() {
        return complNomRecFechaInicioRelLaboral;
    }

    public void setComplNomRecAntigüedad(String complNomRecAntigüedad) {
        this.complNomRecAntigüedad = complNomRecAntigüedad;
    }

    public String getComplNomRecAntigüedad() {
        return complNomRecAntigüedad;
    }

    public void setComplNomRecTipoContrato(String complNomRecTipoContrato) {
        this.complNomRecTipoContrato = complNomRecTipoContrato;
    }

    public String getComplNomRecTipoContrato() {
        return complNomRecTipoContrato;
    }

    public void setComplNomRecTipoJornada(String complNomRecTipoJornada) {
        this.complNomRecTipoJornada = complNomRecTipoJornada;
    }

    public String getComplNomRecTipoJornada() {
        return complNomRecTipoJornada;
    }

    public void setComplNomRecTipoRegimen(String complNomRecTipoRegimen) {
        this.complNomRecTipoRegimen = complNomRecTipoRegimen;
    }

    public String getComplNomRecTipoRegimen() {
        return complNomRecTipoRegimen;
    }

    public void setComplNomRecNumEmpleado(String complNomRecNumEmpleado) {
        this.complNomRecNumEmpleado = complNomRecNumEmpleado;
    }

    public String getComplNomRecNumEmpleado() {
        return complNomRecNumEmpleado;
    }

    public void setComplNomRecPuesto(String complNomRecPuesto) {
        this.complNomRecPuesto = complNomRecPuesto;
    }

    public String getComplNomRecPuesto() {
        return complNomRecPuesto;
    }

    public void setComplNomRecRiesgoPuesto(String complNomRecRiesgoPuesto) {
        this.complNomRecRiesgoPuesto = complNomRecRiesgoPuesto;
    }

    public String getComplNomRecRiesgoPuesto() {
        return complNomRecRiesgoPuesto;
    }

    public void setComplNomRecPeriodicidadPago(String complNomRecPeriodicidadPago) {
        this.complNomRecPeriodicidadPago = complNomRecPeriodicidadPago;
    }

    public String getComplNomRecPeriodicidadPago() {
        return complNomRecPeriodicidadPago;
    }

    public void setComplNomRecCuentaBancaria(String complNomRecCuentaBancaria) {
        this.complNomRecCuentaBancaria = complNomRecCuentaBancaria;
    }

    public String getComplNomRecCuentaBancaria() {
        return complNomRecCuentaBancaria;
    }

    public void setComplNomRecSalarioDiarioIntegrado(String complNomRecSalarioDiarioIntegrado) {
        this.complNomRecSalarioDiarioIntegrado = complNomRecSalarioDiarioIntegrado;
    }

    public String getComplNomRecSalarioDiarioIntegrado() {
        return complNomRecSalarioDiarioIntegrado;
    }

    public void setComplNomRecClaveEntFed(String complNomRecClaveEntFed) {
        this.complNomRecClaveEntFed = complNomRecClaveEntFed;
    }

    public String getComplNomRecClaveEntFed() {
        return complNomRecClaveEntFed;
    }

    public void setComplNomPercsTotalSueldos(String complNomPercsTotalSueldos) {
        this.complNomPercsTotalSueldos = complNomPercsTotalSueldos;
    }

    public String getComplNomPercsTotalSueldos() {
        return complNomPercsTotalSueldos;
    }

    public void setComplNomPercsTotalGravado(String complNomPercsTotalGravado) {
        this.complNomPercsTotalGravado = complNomPercsTotalGravado;
    }

    public String getComplNomPercsTotalGravado() {
        return complNomPercsTotalGravado;
    }

    public void setComplNomPercsTotalExento(String complNomPercsTotalExento) {
        this.complNomPercsTotalExento = complNomPercsTotalExento;
    }

    public String getComplNomPercsTotalExento() {
        return complNomPercsTotalExento;
    }

    public void setComplNomDeducsTotalOtrasDeducciones(String complNomDeducsTotalOtrasDeducciones) {
        this.complNomDeducsTotalOtrasDeducciones = complNomDeducsTotalOtrasDeducciones;
    }

    public String getComplNomDeducsTotalOtrasDeducciones() {
        return complNomDeducsTotalOtrasDeducciones;
    }

    public void setComplNomDeducsTotalImpuestosRetenidos(String complNomDeducsTotalImpuestosRetenidos) {
        this.complNomDeducsTotalImpuestosRetenidos = complNomDeducsTotalImpuestosRetenidos;
    }

    public String getComplNomDeducsTotalImpuestosRetenidos() {
        return complNomDeducsTotalImpuestosRetenidos;
    }

    public void setPercepciones(List<PercepcionesDeduccionesDTO> percepciones) {
        this.percepciones = percepciones;
    }

    public List<PercepcionesDeduccionesDTO> getPercepciones() {
        return percepciones;
    }

    public void setDeducciones(List<PercepcionesDeduccionesDTO> deducciones) {
        this.deducciones = deducciones;
    }

    public List<PercepcionesDeduccionesDTO> getDeducciones() {
        return deducciones;
    }

    public void setTimbreFiscalDigitalVersion(String timbreFiscalDigitalVersion) {
        this.timbreFiscalDigitalVersion = timbreFiscalDigitalVersion;
    }

    public String getTimbreFiscalDigitalVersion() {
        return timbreFiscalDigitalVersion;
    }

    public void setTimbreFiscalDigitalUuid(String timbreFiscalDigitalUuid) {
        this.timbreFiscalDigitalUuid = timbreFiscalDigitalUuid;
    }

    public String getTimbreFiscalDigitalUuid() {
        return timbreFiscalDigitalUuid;
    }

    public void setTimbreFiscalDigitalFechaTimbrado(String timbreFiscalDigitalFechaTimbrado) {
        String[] stringArr = timbreFiscalDigitalFechaTimbrado.split("T");
        this.timbreFiscalDigitalFechaTimbrado = stringArr[0] + " " + stringArr[1];
    }

    public String getTimbreFiscalDigitalFechaTimbrado() {
        return timbreFiscalDigitalFechaTimbrado;
    }

    public void setTimbreFiscalDigitalSelloCFD(String timbreFiscalDigitalSelloCFD) {
        this.timbreFiscalDigitalSelloCFD = timbreFiscalDigitalSelloCFD;
    }

    public String getTimbreFiscalDigitalSelloCFD() {
        return timbreFiscalDigitalSelloCFD;
    }

    public void setTimbreFiscalDigitalNoCertificadoSAT(String timbreFiscalDigitalNoCertificadoSAT) {
        this.timbreFiscalDigitalNoCertificadoSAT = timbreFiscalDigitalNoCertificadoSAT;
    }

    public String getTimbreFiscalDigitalNoCertificadoSAT() {
        return timbreFiscalDigitalNoCertificadoSAT;
    }

    public void setTimbreFiscalDigitalSelloSAT(String timbreFiscalDigitalSelloSAT) {
        this.timbreFiscalDigitalSelloSAT = timbreFiscalDigitalSelloSAT;
    }

    public String getTimbreFiscalDigitalSelloSAT() {
        return timbreFiscalDigitalSelloSAT;
    }

    public void setCompFecha(String compFecha) {
        String fechaSalida = null;
        String[] auxFechaEntrada = compFecha.split("T");
        compFecha = auxFechaEntrada[0] + " " + auxFechaEntrada[1];
    
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("es", "MX")); 
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
    
        try {
            Date date = formatoEntrada.parse(compFecha);
            fechaSalida = formatoSalida.format(date);
        } catch (Exception e) {  e.printStackTrace();  }
        this.compFecha = fechaSalida.toUpperCase(new Locale("es", "MX"));
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setDescUnidad(String descUnidad) {
        this.descUnidad = descUnidad;
    }

    public String getDescUnidad() {
        return descUnidad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setDescPuesto(String descPuesto) {
        this.descPuesto = descPuesto;
    }

    public String getDescPuesto() {
        return descPuesto;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setQnaPago(String qnaPago) {
        this.qnaPago = qnaPago;
    }

    public String getQnaPago() {
        return qnaPago;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setCadenaOriginal(String cadenaOriginal) {
        this.cadenaOriginal = cadenaOriginal;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public void setReceptorUsoCFDI(String receptorUsoCFDI) {
        this.receptorUsoCFDI = receptorUsoCFDI;
    }

    public String getReceptorUsoCFDI() {
        return receptorUsoCFDI;
    }

    public void setConceptosConceptoClaveProdServ(String conceptosConceptoClaveProdServ) {
        this.conceptosConceptoClaveProdServ = conceptosConceptoClaveProdServ;
    }

    public String getConceptosConceptoClaveProdServ() {
        return conceptosConceptoClaveProdServ;
    }

    public void setConceptosConceptoClaveUnidad(String conceptosConceptoClaveUnidad) {
        this.conceptosConceptoClaveUnidad = conceptosConceptoClaveUnidad;
    }

    public String getConceptosConceptoClaveUnidad() {
        return conceptosConceptoClaveUnidad;
    }

    public void setCompNomTotalOtrosPagos(String compNomTotalOtrosPagos) {
        this.compNomTotalOtrosPagos = compNomTotalOtrosPagos;
    }

    public String getCompNomTotalOtrosPagos() {
        return compNomTotalOtrosPagos;
    }

    public void setComplNomRecDepartamento(String complNomRecDepartamento) {
        this.complNomRecDepartamento = complNomRecDepartamento;
    }

    public String getComplNomRecDepartamento() {
        return complNomRecDepartamento;
    }

    public void setComplNomRecBanco(String complNomRecBanco) {
        this.complNomRecBanco = complNomRecBanco;
    }

    public String getComplNomRecBanco() {
        return complNomRecBanco;
    }

    public String get_compCadenaOriginal() {
        return compCadenaOriginal;
    }

    public void setCnConsecNomina(String cnConsecNomina) {
        this.cnConsecNomina = cnConsecNomina;
    }

    public String getCnConsecNomina() {
        return cnConsecNomina;
    }

    public void setNominaPdf(String nominaPdf) {
        this.nominaPdf = nominaPdf;
    }

    public String getNominaPdf() {
        return nominaPdf;
    }

    public void setPcp(String pcp) {
        this.pcp = pcp;
    }

    public String getPcp() {
        return pcp;
    }

    public void setNomLeyenda(String nomLeyenda) {
        this.nomLeyenda = nomLeyenda;
    }

    public String getNomLeyenda() {
        return nomLeyenda;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }
}
