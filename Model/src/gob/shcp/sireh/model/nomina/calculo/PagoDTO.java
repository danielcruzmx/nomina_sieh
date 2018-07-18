package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.TdPensionDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PagoDTO implements Serializable, Model {
    protected final Log logger = LogFactory.getLog(getClass());
    
    private String rfcEmpleado;
    private Integer idPlaza;
    private String idUnidadNomb;
    private String descUnidadNomb;
    private String idGrupoPago;
    private String descGrupoPago;
    private String descTipoNomina;
    private String idNivelPto;
    private String idNivelPtoPre;
    private String idNombramiento;
    private String descNombramiento;
    private String idJerarquia;
    private String descJerarquia;
    private double tabSueldo;
    private double tabCompensacion;
    private String erario;
    private double impHonorario;
    private double tabSueldoPre;
    private String cotiza;
    private double incentivo;
    private int quincenaMovimiento;
    private int movimiento;
    private java.util.Date fecUltimoMovto;
    private java.util.Date fecFinPago;
    
    private double acumuladoSdoBase;
    private double acumuladoSdoBasePatron;
    private double acumuladoGravable;
    private double acumuladoGravablePrima;
    private double acumuladoGravableA;
    private double acumuladoGravableB;
    private double acumuladoGravableC;
    private double liquido = 0d;
    private String liquidoString;
    private double sdoBase;
    private double sdoBasePatron;
    private double gravable;
    private double factor;
    private int quincena;
    private int numQuincena;
    private Integer quincenaAnterior;
    private Integer quincenaPosterior;
    
    private boolean pension;
    private boolean retroactivo;
    
    private List<ConceptoPagoDTO> conceptos;
    private List<TdPensionDTO> pensiones;
    private List<TnConceptoPagadoDTO> conceptosPagados;
    private List<TnConceptoPagadoDTO> conceptosRetroactivo;
    
    // Otros
    private String curpEmpleado;
    private String nssEmpleado;
    private String numPension;
    private String distribucion;
    private String[] casosMuestra;
    private String casoMuestraOld;
    private boolean esCasoMuestra = false;
    private String nombreEmpleado;
    private String primerApellido;
    private String segundoApellido;
    private String idPuestoNom;
    private String descPuestoNom;
    private Integer idZonaDistNom;
    private String descTipoPago;
    private Integer idZonaEcoNom;
    private int idQna;
    private String status;
    private int numAnio;
    private String viewName;
    private NominaDTO nominaDTO;
    private boolean rfcNoEncontrado = false;
    private boolean busquedaPorPlaza = false;
    private String baseUrl;
    private String idTipoNomina;
    private List<String> listIdTipoNomina;
    
    private String beanName;
    private String urlOrigen;
    private String urlDestino;
    private boolean cancel;
    private int quincenaProceso;
    
    // Aguinaldo
    private String agVigente;
    
    // Aguinaldo - busqueda
    private java.lang.Integer nomDiasPagar;
    private java.lang.String nomAplicarExentos;
    private java.lang.String nomVigente;
    private java.lang.String nomGratifAgui;
    private java.lang.String nomCompletarPeriodo;
    private String idEdoNom;
    
    // Nomina Extraordinarias
    private String conceptoSelected;
    private String jsonDataString;
    private String tipoExtraordinaria;
    private String descPerseverancia = "PERSEVERANCIA Y LEALTAD";
    
    public PagoDTO() {
        this.conceptosPagados = new ArrayList<TnConceptoPagadoDTO>();
        this.acumuladoSdoBase = 0.0;
        this.acumuladoGravable = 0.0;
        this.acumuladoGravablePrima = 0.0;
        this.acumuladoGravableA = 0.0;
        this.acumuladoGravableB = 0.0;
        this.acumuladoGravableC = 0.0;
        this.acumuladoSdoBasePatron = 0.0;
        this.erario = "S";
    }
    
    public Double sueldoBase(Double tope) {
        if (this.acumuladoSdoBase > tope)
            return tope;
        return this.acumuladoSdoBase;
    }
    
    public Double sueldoBasePatron(Double tope) {
        if (this.acumuladoSdoBasePatron > tope)
            return tope;
        return this.acumuladoSdoBasePatron;
    }
    
    public void setAgregaConcepto(Integer prioridad, String tipo, String cpto, Double monto) {
        TnConceptoPagadoDTO c = new TnConceptoPagadoDTO();
        Integer numero = this.idConcepto(tipo, cpto);
        if(cpto.contains("62")){
            c.setCpNumConcepto(prioridad);
        } else {
            c.setCpNumConcepto(numero);
        }
        c.setCpFolio(prioridad);
        c.setCpDifFolio(9);
        c.setIdTipoCpto(tipo);
        c.setIdCptoPago(cpto);
        c.setCpMonto(monto);
        this.conceptosPagados.add(c);
    }
    
    public void setAgregaConceptoRetroactivo(Integer prioridad, String tipo, String cpto, Double monto) {
        TnConceptoPagadoDTO c = new TnConceptoPagadoDTO();
        c.setCpFolio(prioridad);
        c.setIdTipoCpto(tipo);
        c.setIdCptoPago(cpto);
        c.setCpMonto(monto);
        this.conceptosRetroactivo.add(c);
    }
    
    public boolean tieneConcepto(String tipo, String cpto) {
        boolean ret = false;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = true;
                break;
            }
        }
        return ret;
    }
    
    public boolean tieneConceptoRetroactivo(String tipo, String cpto) {
        boolean ret = false;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (TnConceptoPagadoDTO c: conceptosRetroactivo) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdCptoPago().trim();
            if (codigo.equals(tipoCpto)) {
                ret = true;
                break;
            }
        }
        return ret;
    }
    
    public Double montoConceptoRetroactivo(String tipo, String cpto) {
        Double ret = 0.0;
        if (conceptosRetroactivo != null) {
            String tipoCpto = tipo.trim() + cpto.trim();
            for (TnConceptoPagadoDTO c: conceptosRetroactivo) {
                String codigo = c.getIdTipoCpto().trim() + c.getIdCptoPago().trim();
                if (codigo.equals(tipoCpto)) {
                    ret = c.getCpMonto();
                    break;
                }
            }
        }
        return ret;
    }
    
    public Double acumulaMontoConceptoRetroactivo(String tipoCpto, Double monto) {
        Double ret = 0.0;
        for (TnConceptoPagadoDTO c: conceptosRetroactivo) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdCptoPago().trim();
            if (codigo.equals(tipoCpto)) {
                c.setCpMonto(c.getCpMonto() + monto);
            }
        }
        return ret;
    }
    
    
    public boolean notieneQuinquenio() {
        boolean ret = true;
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals("PA1") || codigo.equals("PA2") || codigo.equals("PA3") || codigo.equals("PA4") || codigo.equals("PA5")) {
                ret = false;
                break;
            }
        }
        return ret;
    }
    
    public Double montoConcepto(String tipo, String cpto) {
        Double ret = 0.0;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = c.getMonto();
                break;
            }
        }
        return ret;
    }
    
    public Integer idConcepto(String tipo, String cpto) {
        Integer ret = -1;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = c.getIdMovtoConceptoPago();
                break;
            }
        }
        return ret;
    }
    
    public Double adeudoConcepto(String tipo, String cpto) {
        Double ret = 0.0;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                if (c.getMontoAdeudo() == null)
                    ret = 0.0;
                else
                    ret = c.getMontoAdeudo();
                break;
            }
        }
        return ret;
    }
    
    public Float porcentajeConcepto(String tipo, String cpto) {
        Float ret = 0.00f;
        String tipoCpto = tipo.trim() + cpto.trim();
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = c.getPorcentaje();
                break;
            }
        }
        return ret;
    }
    
    public void calculaPensiones(String tipo, String clave) {
        for (TdPensionDTO p: this.getPensiones()) {
            this.setAgregaConcepto(p.getNumPension(), tipo, clave, p.calculaMonto(this.getConceptosPagados()));
        }
    }
    
    public void asignaIncidencia(String tipo, String clave, Double monto, Double hasta) {
        String tipoCpto = "U" + clave.trim();
        Integer id = 0;
        Double limite = montoIncidencias("UFA");
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto) && (limite < hasta)) {
                id = c.getIdMovtoConceptoPago();
                this.setAgregaConcepto(id, tipo, clave, monto);
                this.setAcumuladoGravable(monto / 2.0 * (-1));
                limite = limite + (monto * (-1));
            }
        }
    }
    
    public Double montoIncidencias(String tipoCpto) {
        Double ret = 0.0;
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = ret + c.getMonto();
            }
        }
        return ret;
    }
    
    public Double acumulaIncidencias(String tipoCpto) {
        Double ret = 0.0;
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = ret + c.getMonto();
            }
        }
        return ret;
    }
    
    public Double acumulaLicencias(String tipoCpto) {
        Double ret = 0.0;
        for (ConceptoPagoDTO c: conceptos) {
            String codigo = c.getIdTipoCpto().trim() + c.getIdConcepto().trim();
            if (codigo.equals(tipoCpto)) {
                ret = ret + c.getMonto();
            }
        }
        return ret;
    }
    
    public void calculaLiquido() {
        Double percepciones = 0.0;
        Double deducciones = 0.0;
        for (TnConceptoPagadoDTO cp: conceptosPagados) {
            if (cp.getIdTipoCpto().contains("P"))
                percepciones += redondear(cp.getCpMonto());
            if (cp.getIdTipoCpto().contains("D"))
                deducciones += redondear(cp.getCpMonto());
        }
        
        liquido = redondear(percepciones) - redondear(deducciones);
        liquido = redondear(liquido);
        liquidoString = String.valueOf(liquido);
    }
    
    public static Double redondear(Double base) {
        Double valor = 0.0;
        valor = Math.rint(base * 100) / 100;
        return valor;
    }
    
    public void setAcumuladoSdoBase(double acumuladoSdoBase) {
        this.acumuladoSdoBase = this.acumuladoSdoBase + acumuladoSdoBase;
        this.setSdoBase(this.acumuladoSdoBase);
    }
    
    public void setAcumuladoSdoBasePatron(double acumuladoSdoBasePatron) {
        this.acumuladoSdoBasePatron = this.acumuladoSdoBasePatron + acumuladoSdoBasePatron;
        this.setSdoBasePatron(this.acumuladoSdoBasePatron);
    }
    
    public void setGravableFaltas() {
            // Dummy
    }
    
    public void setAcumuladoGravable(double acumuladoGravable) {
        this.acumuladoGravable = this.acumuladoGravable + acumuladoGravable;
        this.setGravable(this.acumuladoGravable);
    }
    
     public void setAcumuladoGravablePrima(double acumuladoGravablePrima) {
        this.acumuladoGravablePrima = this.acumuladoGravablePrima + acumuladoGravablePrima;
     }

    public void setAcumuladoGravableA(double acumuladoGravable) {
       this.acumuladoGravableA = this.acumuladoGravableA + acumuladoGravable;
    }

    public void setAcumuladoGravableB(double acumuladoGravable) {
       this.acumuladoGravableB = this.acumuladoGravableB + acumuladoGravable;
    }

    public void setAcumuladoGravableC(double acumuladoGravable) {
       this.acumuladoGravableC = this.acumuladoGravableC + acumuladoGravable;
    }
    
    public void setRfcEmpleado(String rfcEmpleado) {
        this.rfcEmpleado = rfcEmpleado;
    }

    public String getRfcEmpleado() {
        return rfcEmpleado;
    }

    public void setIdPlaza(Integer idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Integer getIdPlaza() {
        return idPlaza;
    }

    public void setIdUnidadNomb(String idUnidadNomb) {
        this.idUnidadNomb = idUnidadNomb;
    }

    public String getIdUnidadNomb() {
        return idUnidadNomb;
    }

    public void setIdGrupoPago(String idGrupoPago) {
        this.idGrupoPago = idGrupoPago;
    }

    public String getIdGrupoPago() {
        return idGrupoPago;
    }

    public void setIdNivelPto(String idNivelPto) {
        this.idNivelPto = idNivelPto;
    }

    public String getIdNivelPto() {
        return idNivelPto;
    }

    public void setIdNombramiento(String idNombramiento) {
        this.idNombramiento = idNombramiento;
    }

    public String getIdNombramiento() {
        return idNombramiento;
    }

    public void setIdJerarquia(String idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public String getIdJerarquia() {
        return idJerarquia;
    }

    public void setTabSueldo(double tabSueldo) {
        this.tabSueldo = tabSueldo;
    }

    public double getTabSueldo() {
        return tabSueldo;
    }

    public void setTabCompensacion(double tabCompensacion) {
        this.tabCompensacion = tabCompensacion;
    }

    public double getTabCompensacion() {
        return tabCompensacion;
    }

    public void setConceptos(List<ConceptoPagoDTO> conceptos) {
        this.conceptos = conceptos;
    }

    public List<ConceptoPagoDTO> getConceptos() {
        return conceptos;
    }
    
    public void setPensiones(List<TdPensionDTO> pensiones) {
        this.setPension(!pensiones.isEmpty());
        this.pensiones = pensiones;
    }

    public List<TdPensionDTO> getPensiones() {
        return pensiones;
    }

    public void setConceptosPagados(List<TnConceptoPagadoDTO> conceptosPagados) {
        this.conceptosPagados = conceptosPagados;
    }

    public List<TnConceptoPagadoDTO> getConceptosPagados() {
        return conceptosPagados;
    }

    public double getAcumuladoSdoBase() {
        return acumuladoSdoBase;
    }

    public double getAcumuladoGravable() {
        return acumuladoGravable;
    }

    public double getAcumuladoGravablePrima() {
        return acumuladoGravablePrima;
    }

    public double getAcumuladoGravableA() {
        return acumuladoGravableA;
    }

    public double getAcumuladoGravableB() {
        return acumuladoGravableB;
    }

    public double getAcumuladoGravableC() {
        return acumuladoGravableC;
    }
    
    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public double getLiquido() {
        return ((int)(this.liquido * 100)) / 100d;
    }

    public void setErario(String erario) {
        this.erario = erario;
    }

    public String getErario() {
        return erario;
    }

    public void setSdoBase(double sdoBase) {
        this.sdoBase = sdoBase;
    }

    public double getSdoBase() {
        return sdoBase;
    }

    public void setGravable(double gravable) {
        this.gravable = gravable;
    }

    public double getGravable() {
        return gravable;
    }

    public void setDescGrupoPago(String descGrupoPago) {
        this.descGrupoPago = descGrupoPago;
    }

    public String getDescGrupoPago() {
        return descGrupoPago;
    }

    public void setDescNombramiento(String descNombramiento) {
        this.descNombramiento = descNombramiento;
    }

    public String getDescNombramiento() {
        return descNombramiento;
    }

    public void setDescJerarquia(String descJerarquia) {
        this.descJerarquia = descJerarquia;
    }

    public String getDescJerarquia() {
        return descJerarquia;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
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

    public void setIdPuestoNom(String idPuestoNom) {
        this.idPuestoNom = idPuestoNom;
    }

    public String getIdPuestoNom() {
        return idPuestoNom;
    }

    public void setIdZonaDistNom(Integer idZonaDistNom) {
        this.idZonaDistNom = idZonaDistNom;
    }

    public Integer getIdZonaDistNom() {
        return idZonaDistNom;
    }

    public void setDescTipoPago(String descTipoPago) {
        this.descTipoPago = descTipoPago;
    }

    public String getDescTipoPago() {
        return descTipoPago;
    }

    public void setCasosMuestra(String[] casosMuestra) {
        this.casosMuestra = casosMuestra;
    }

    public void setCasoMuestraOld(String casoMuestraOld) {
        this.casoMuestraOld = casoMuestraOld;
    }

    public String[] getCasosMuestra() {
        return casosMuestra;
    }

    public String getCasoMuestraOld() {
        return casoMuestraOld;
    }

    public void setEsCasoMuestra(boolean esCasoMuestra) {
        this.esCasoMuestra = esCasoMuestra;
    }

    public boolean getEsCasoMuestra() {
        return esCasoMuestra;
    }

    public String getCasoMuestra() {
        return esCasoMuestra ? "S" : "";
    }

    public void setIdQna(int idQna) {
        this.idQna = idQna;
    }

    public int getIdQna() {
        return idQna;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setNumQuincena(int numQuincena) {
        this.numQuincena = numQuincena;
    }

    public int getNumQuincena() {
        return numQuincena;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setNumAnio(int numAnio) {
        this.numAnio = numAnio;
    }

    public int getNumAnio() {
        return numAnio;
    }

    public void setRfcNoEncontrado(boolean rfcNoEncontrado) {
        this.rfcNoEncontrado = rfcNoEncontrado;
    }

    public boolean getRfcNoEncontrado() {
        return rfcNoEncontrado;
    }

    public void setCurpEmpleado(String curpEmpleado) {
        this.curpEmpleado = curpEmpleado;
    }

    public String getCurpEmpleado() {
        return curpEmpleado;
    }

    public void setNssEmpleado(String nssEmpleado) {
        this.nssEmpleado = nssEmpleado;
    }

    public String getNssEmpleado() {
        return nssEmpleado;
    }

    public void setNumPension(String numPension) {
        this.numPension = numPension;
    }

    public String getNumPension() {
        return numPension;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDescUnidadNomb(String descUnidadNomb) {
        this.descUnidadNomb = descUnidadNomb;
    }

    public String getDescUnidadNomb() {
        return descUnidadNomb;
    }

    public void setDescPuestoNom(String descPuestoNom) {
        this.descPuestoNom = descPuestoNom;
    }

    public String getDescPuestoNom() {
        return descPuestoNom;
    }

    public void setBusquedaPorPlaza(boolean busquedaPorPlaza) {
        this.busquedaPorPlaza = busquedaPorPlaza;
    }

    public boolean getBusquedaPorPlaza() {
        return busquedaPorPlaza;
    }

    public void setIdZonaEcoNom(Integer idZonaEcoNom) {
        this.idZonaEcoNom = idZonaEcoNom;
    }

    public Integer getIdZonaEcoNom() {
        return idZonaEcoNom;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
    
    public void setImpHonorario(double impHonorario) {
        this.impHonorario = impHonorario;
    }

    public double getImpHonorario() {
        return impHonorario;
    }

    public void setTabSueldoPre(double tabSueldoPre) {
        this.tabSueldoPre = tabSueldoPre;
    }
    
     
    public double getTabSueldoPre() {
        double importeHonorario = getImpHonorario();
        if (importeHonorario > tabSueldoPre)
            return tabSueldoPre;
        else
            return importeHonorario;
    }

    public void setCotiza(String cotiza) {
        this.cotiza = cotiza;
    }

    public String getCotiza() {
        return cotiza;
    }

    public double get_liquido() {
        return liquido;
    }
    
    public void setQuincena(int quincena) {
        this.quincena = quincena;
        String sQna = String.valueOf(this.quincena);
        setNumQuincena(Integer.parseInt(sQna.substring(4, 6)));
        
        if (this.quincenaMovimiento == quincena) {
            /* preguntar si son nuevos ingresos para obtener el factor de calculo */
            /* otro movimiento obliga a ir al historico de pagos y hacer otro proceso */

            if (this.movimiento == 111 || this.movimiento == 112 || this.movimiento == 221 || this.movimiento == 225 || 
                this.movimiento == 113 || this.movimiento == 503 || this.movimiento == 513 || this.movimiento == 502) {
                setRetroactivo(true);

                obtFactor();

                if(getFactor()==1)setRetroactivo(false);
                else setRetroactivo(true);
            } else {
                setFactor(1.0);
                setRetroactivo(false);
            }
        } else {
            setRetroactivo(false);
            setFactor(1.0);
        }
    }
    
    public void obtFactor() {
        QuincenaDTO qnaActual = new QuincenaDTO(this.quincena);
        QuincenaDTO qnaIni = new QuincenaDTO(this.fecUltimoMovto);
        setFactor((double)(qnaActual.diferenciaQuincenas(qnaIni) + 1));
    }

    public int getQuincena() {
        return quincena;
    }

    public void setPension(boolean pension) {
        this.pension = pension;
    }

    public boolean isPension() {
        return pension;
    }

    public boolean isEsCasoMuestra() {
        return esCasoMuestra;
    }

    public void setNominaDTO(NominaDTO nominaDTO) {
        this.nominaDTO = nominaDTO;
    }

    public NominaDTO getNominaDTO() {
        return nominaDTO;
    }

    public boolean isRfcNoEncontrado() {
        return rfcNoEncontrado;
    }

    public boolean isBusquedaPorPlaza() {
        return busquedaPorPlaza;
    }
    
    public void setIdNivelPtoPre(String idNivelPtoPre) {
        this.idNivelPtoPre = idNivelPtoPre;
    }

    public String getIdNivelPtoPre() {
        return idNivelPtoPre;
    }
    
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setQuincenaMovimiento(int quincenaMovimiento) {
        this.quincenaMovimiento = quincenaMovimiento;
    }

    public int getQuincenaMovimiento() {
        return quincenaMovimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setFecUltimoMovto(Date fecUltimoMovto) {
        this.fecUltimoMovto = fecUltimoMovto;
    }

    public Date getFecUltimoMovto() {
        return fecUltimoMovto;
    }

    public double getAcumuladoSdoBasePatron() {
        return acumuladoSdoBasePatron;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }

    public void setRetroactivo(boolean retroactivo) {
        this.retroactivo = retroactivo;
    }

    public boolean isRetroactivo() {
        return retroactivo;
    }

    public void setConceptosReatroactivo(List<TnConceptoPagadoDTO> conceptosReatroactivo) {
        this.conceptosRetroactivo = conceptosReatroactivo;
    }

    public List<TnConceptoPagadoDTO> getConceptosReatroactivo() {
        return conceptosRetroactivo;
    }
    
    public void setSdoBasePatron(double sdoBasePatron) {
        this.sdoBasePatron = sdoBasePatron;
    }

    public double getSdoBasePatron() {
        return sdoBasePatron;
    }

    public void setConceptoSelected(String conceptoSelected) {
        this.conceptoSelected = conceptoSelected;
    }

    public String getConceptoSelected() {
        return conceptoSelected;
    }
    
    public String getJsonDataString() {
        return jsonDataString;
    }

    public void setJsonDataString(String jsonDataString) {
        this.jsonDataString = jsonDataString;
    }
    
    public String getIdTipoNomina() {
        return idTipoNomina;
    }

    public void setIdTipoNomina(String idTipoNomina) {
        this.idTipoNomina = idTipoNomina;
    }

    public void setFecFinPago(Date fecFinPago) {
        this.fecFinPago = fecFinPago;
    }

    public Date getFecFinPago() {
        return fecFinPago;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
    
    public void setQuincenaProceso(int quincenaProceso) {
        this.quincenaProceso = quincenaProceso;
    }

    public int getQuincenaProceso() {
        return quincenaProceso;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getUrlDestino() {
        return urlDestino;
    }
    
    public String getDescTipoNomina() {
        return descTipoNomina;
    }

    public void setDescTipoNomina(String descTipoNomina) {
        this.descTipoNomina = descTipoNomina;
    }
    
    public Integer getQuincenaAnterior() {
        return quincenaAnterior;
    }

    public void setQuincenaAnterior(Integer quincenaAnterior) {
        this.quincenaAnterior = quincenaAnterior;
    }
    
    public Integer getQuincenaPosterior() {
        return quincenaPosterior;
    }

    public void setQuincenaPosterior(Integer quincenaPosterior) {
        this.quincenaPosterior = quincenaPosterior;
    }

    public String getLiquidoString() {
        return liquidoString;
    }

    public void setLiquidoString(String liquidoString) {
        this.liquidoString = liquidoString;
    }

    public void setAgVigente(String agVigente) {
        this.agVigente = agVigente;
    }

    public String getAgVigente() {
        return agVigente;
    }

    public String getTipoExtraordinaria() {
        return tipoExtraordinaria;
    }

    public void setTipoExtraordinaria(String tipoExtraordinaria) {
        this.tipoExtraordinaria = tipoExtraordinaria;
    }

    public String getDescPerseverancia() {
        return descPerseverancia;
    }

    public void setDescPerseverancia(String descPerseverancia) {
        this.descPerseverancia = descPerseverancia;
    }
    
    public void setConceptosRetroactivo(List<TnConceptoPagadoDTO> conceptosRetroactivo) {
        this.conceptosRetroactivo = conceptosRetroactivo;
    }

    public List<TnConceptoPagadoDTO> getConceptosRetroactivo() {
        return conceptosRetroactivo;
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

    public void setUrlOrigen(String urlOrigen) {
        this.urlOrigen = urlOrigen;
    }

    public String getUrlOrigen() {
        return urlOrigen;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isCancel() {
        return cancel;
    }
    
    public void setIdEdoNom(String idEdoNom) {
        this.idEdoNom = idEdoNom;
    }

    public String getIdEdoNom() {
        return idEdoNom;
    }

    public void setListIdTipoNomina(List<String> listIdTipoNomina) {
        this.listIdTipoNomina = listIdTipoNomina;
    }

    public List<String> getListIdTipoNomina() {
        return listIdTipoNomina;
    }
}
