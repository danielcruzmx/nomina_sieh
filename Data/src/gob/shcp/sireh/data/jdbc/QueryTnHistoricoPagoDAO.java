package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;

import gob.shcp.sireh.domain.jdbc.Cfdi;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomPrestacionesTriOutputFile;
import gob.shcp.sireh.domain.jdbc.CustomTdCecoban;
import gob.shcp.sireh.domain.jdbc.FinContrato;
import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;

import java.util.Date;
import java.util.List;

public interface QueryTnHistoricoPagoDAO extends TnHistoricoPagoDAO {
    @FindByNamedQuery(name = "historicoPagoByRfcFecha", value = TnHistoricoPago.class)
    List<TnHistoricoPago> findByRfcFecha(String id_cpto_pago1, String id_cpto_pago2, String rfc_empleado, String idSitPago, Date hpIniPago, Date hpFinPago);

    @FindByNamedQuery(name = "spArchivoCecoban", value = CustomTdCecoban.class)
    List<CustomTdCecoban> findBySpArchivoCecoban(String pQuincena, String pComplemento, String pTipo, String pFechaPr, String pFechaPa, Integer pNumArch, Integer pInicioSecuencia, Date pFechaJuliano, Integer pMaximo);

    @FindByNamedQuery(name = "selectComplHisEnterosOR", value = TnHistoricoPago.class)
    List<TnHistoricoPago> findComplOR(String tipoNomina, String qna);

    @FindByNamedQuery(name = "selectComplHisEnterosEX", value = TnHistoricoPago.class)
    List<TnHistoricoPago> findComplEX(String tipoNomina, String qna);

    @FindByNamedQuery(name = "spSerica", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpSerica(Integer pQuincenaPago, String fechaIni, String pNomina, String consecutivo, Integer pConsecutivoNomina);

    @FindByNamedQuery(name = "spSericaExtra", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpSericaExtra(Integer pQuincenaPago, String fechaIni, String pNomina, String consecutivo, Integer pConsecutivoNomina);

    @FindByNamedQuery(name = "spIsssteEntero", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpIsssteEntero(Integer pHpQnaPago, String pFecha, String hpConsecNomina, Integer pOperador);

    @FindByNamedQuery(name = "spIsssteCancelado", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpIsssteCancelado(Integer pHpQnaPago, String pFecha, String hpConsecNomina, Integer pOperador);

    @FindByNamedQuery(name = "spIsssteDevoluciones", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpIsssteDevoluciones(Integer pHpQnaPago, String pFecha, String hpConsecNomina, Integer pOperador);

    @FindByNamedQuery(name = "spIssstePrestacionesEntero", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpPIsssteEntero(Integer pHpQnaPago, String pFecha, String hpConsecNomina, Integer pOperador);

    @FindByNamedQuery(name = "spIssstePrestacionesCancelado", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpPIsssteCancelado(Integer pHpQnaPago, String pFecha, String hpConsecNomina, Integer pOperador);

    @FindByNamedQuery(name = "spSatTimbrado", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpSatTimbrado(Integer pQuincenaPago, Integer pConsecutivoNomina);

    @FindByNamedQuery(name = "spSatTimbradoCanc", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpSatTimbradoCanc(Integer pQuincenaPago);
    
    @FindByNamedQuery(name = "spisssteSIPEaltas", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpisssteSIPEaltas(Integer pQuincenaPago);

    @FindByNamedQuery(name = "spisssteSIPEbajas", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpisssteSIPEbajas(Integer pQuincenaPago);

    @FindByNamedQuery(name = "spisssteSIPEcambios", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpisssteSIPEcambios(Integer pQuincenaPago);


    //******************************************************************************************************

    @FindByNamedQuery(name = "terceroFonacotEntero", value = CustomOutputFile.class)
    List<CustomOutputFile> getDatosTerceroFonacot(Integer ciclo, Integer mes);

    @FindByNamedQuery(name = "terceroFonacotValida", value = CustomOutputFile.class)
    List<CustomOutputFile> validaTerceroFonacot(Integer ciclo, Integer mes);

    @FindByNamedQuery(name = "spTerceroFonacot", value = CustomOutputFile.class)
    void exeSpTerceroFonacot(Integer qnaIni, Integer qnaFin, Integer cilco, Integer mes);
    
    @FindByNamedQuery(name = "finContratos", value = FinContrato.class)
    List<FinContrato> finContratos(Date qnaFin);
    
    @FindByNamedQuery(name = "spSericaC", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpSericaC(Integer pQuincenaPago);

    @FindByNamedQuery(name = "movimientosPlantilla", value = CustomOutputFile.class)
    List<CustomOutputFile> findByPlantilla(String idGrupoPago);

    @FindByNamedQuery(name = "movimientosA", value = CustomOutputFile.class)
    List<CustomOutputFile> findByMovimientosA(String qIni, String qFin, String Unidad);
    
    @FindByNamedQuery(name = "movimientosB", value = CustomOutputFile.class)
    List<CustomOutputFile> findByMovimientosB(String qIni, String qFin, String Unidad);    
    
    @FindByNamedQuery(name = "movimientosM", value = CustomOutputFile.class)
    List<CustomOutputFile> findByMovimientosM(String qIni, String qFin, String Unidad);
    
    @FindByNamedQuery(name = "periodoLaborado", value = CustomOutputFile.class)
    List<CustomOutputFile> findByPeriodoLaborado(Integer ciclo);
    
    @FindByNamedQuery(name = "padronSeguros", value = CustomOutputFile.class)
    List<CustomOutputFile> findByPadronSeguros(String qIni);

    @FindByNamedQuery(name = "credencializacionM", value = CustomOutputFile.class)
    List<CustomOutputFile> findByCredencializacionM(String qIni);

    @FindByNamedQuery(name = "credencializacionR", value = CustomOutputFile.class)
    List<CustomOutputFile> findByCredencializacionR(String rfc);

    @FindByNamedQuery(name = "credencializacionB", value = CustomOutputFile.class)
    List<CustomOutputFile> findByCredencializacionB(String qIni);
    
    @FindByNamedQuery(name = "constanciasF", value = String.class)
    List<String> constanciasF(String rfc);

    @FindByNamedQuery(name = "cxlcPrestacionesTrimestrales", value = CustomPrestacionesTriOutputFile.class)
    List<CustomPrestacionesTriOutputFile> generaExcelTrimestre(Integer qnaIni, Integer qnaFin);
    
    @FindByNamedQuery(name = "defNomEjercicio", value = CustomOutputFile.class)
    List<CustomOutputFile> defNomEjercicio(String ciclo);

    @FindByNamedQuery(name = "terceros-fonac-getEmisionChequesFonac-numNomina", value = TnHistoricoPago.class)
    List<TnHistoricoPago> getEmisionChequesFonac(String cicloEmision, String cicloRemesa, String remesa);

    @FindByNamedQuery(name = "terceros-fonac-getEmisionChequesFonacFile-numNomina", value = CustomOutputFile.class)
    List<CustomOutputFile> getEmisionChequesFonacFile(String nomina);
    
    @FindByNamedQuery(name = "terceros-fonac-getChequesFonac-numNomina", value = TnHistoricoPago.class)
    List<TnHistoricoPago> getChequesFonac(String cicloEmision, String cicloRemesa, String remTnHistoricoPagoesa);
    
    @FindByNamedQuery(name = "terceros-fonac-getChequesFonacFile-numNomina", value = CustomOutputFile.class)
    List<CustomOutputFile> getChequesFonacFile(String nomina);
    
    @FindByNamedQuery(name = "terceros-fonac-getLiquidacionFonacFile-numNomina", value = CustomOutputFile.class)
    List<CustomOutputFile> getliquidaCifrasFonac(String nomina);

    @FindByNamedQuery(name = "terceros-fonac-getFonacFile-numNomina", value = CustomOutputFile.class)
    List<CustomOutputFile> getCifrasFonac(String nomina);

    @FindByNamedQuery(name = "spGnpImp", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpGnpImp(String pQnaIni, String pQnaFin);

    @FindByNamedQuery(name = "spGnpMov", value = CustomOutputFile.class)
    List<CustomOutputFile> findBySpGnpMov(String pQnaIni, String pQnaFin);

    @FindByNamedQuery(name = "funcDirectorio", value = CustomOutputFile.class)
    List<CustomOutputFile> generaPensionIssste(String qnaCaptura);

    @FindByNamedQuery(name = "terceros-fonac-getFonac-consulta", value = CustomOutputFile.class)
    List<CustomOutputFile> getAportacionesFonac(String rfcUnico, String qnaInicio, String qnaFinal, String registro, String tipo);
    
    @FindByNamedQuery(name = "reporte-terceros-sat-cfdi-cancelados-qnas", value = CustomOutputFile.class)
    List<CustomOutputFile> getQnasPagoFromHistoricoPago(Integer qnaEnd);
    
    @FindByNamedQuery(name = "findDatos_cfdi", value = Cfdi.class)
    List<Cfdi> findDatos(String rfcEmpleado, String cnFolio, String cnDifFolio);
    
    @FindByNamedQuery(name = "generar-folios-porquincena", value = CustomOutputFile.class)
    List<CustomOutputFile> findFoliosPorQuincena(Integer idNomina, Integer cnPaquete);
}
