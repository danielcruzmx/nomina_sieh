package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.ConceptoPago;
import gob.shcp.sireh.domain.jdbc.HistoricoPago;
import gob.shcp.sireh.domain.jdbc.Pago;
import gob.shcp.sireh.domain.jdbc.TdPension;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomCalculoDAO extends DataService {
    public Map<String, Object> getNominaById(int idQna);

    public Map<String, Object> getNominaByIdExtraordinaria(int idQna);

    public Map<String, Object> getNominaByIdIncentivo(int idQna);

    public Map<String, Object> getDatosNominaById(int idQna);

    public Pago getPagoByPlaza(String idPlaza);

    public Pago getPagoByPlaza(String idPlaza, String rfcEmpleado);

    public Pago getPagoByRFC(String rfc, Map<String, Map<String, String>> dimensions, String operationalYear);

    public List<Pago> getPagosByGpoPago(String operationalYear, Map<String, Map<String, String>> dimensions, String nomFuenteDatos, String idGrupoPago);

    public List<Pago> getPagosByRFCs(List<String> listaRFCs);

    public List<Pago> getPagosNoOrdinarioByGpoPago(String idGrupoPago, Date fechaInicial, Date fechaFinal);

    /**
     * Casos muestra
     * @author 
     * @param idGrupoPago String
     * @param idQna int
     */
    public List<String> getRFCsCasosMuestra(String idGrupoPago, int idQna);

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List<String>
     */
    public void updateAndSetCasosMuestra(List<String> casosMuestra);

    /**
     * Casos muestra
     * @author 
     * @param casosMuestra List<String>
     */
    public void updateAndUnsetCasosMuestra(List<String> casosMuestra);

    public void updateStatusNominaQna(int idQna);

    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @author Oscar S.
     * @param idQna int
     */
    public void deleteCalculoNominaQna(int idQna);

    public void saveCalculoNominaQna(List<HashMap<String, Object>> listaMapasPago, String usuario);

    public void updateCalculoNominaQna(HashMap<String, Object> mapaPago);

    public int postInsercionNomina(int idQna, int idPlaza, String idRfc);
    
    public int postInsercionNominaDinamico(String procedure, int[] types, String[] params, String[] args);

    public void cierreNomina(int idQna);

    public List<HistoricoPago> getHistoricoPagoByRfc(String rfc, Date fechaMovimiento, List<Integer> listIdNominas);

    public List<ConceptoPago> getConceptosByRfc(String rfc, Map<String, Map<String, String>> dimensions, 
                                                String operationalYear);

    public List<TdPension> getPensionesByRfc(String rfc, Map<String, Map<String, String>> dimensions, 
                                             String operationalYear);

    public Integer getQuincenaVigente();

    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @author Oscar S.
     */
    void updateStatusProcesandoNominaQna(int idQna);

    public void updateStatusSinProcesoNominaQna(int idQna);

    public void generarNominaValesFinAnio(String fecIni, String fecFin, Integer qnaProceso, BigDecimal monto);

    public void generarNominaValesDiaHacendario(String fecIni, String fecFin, Integer qnaProceso, BigDecimal monto);

    void generarNominaAguinaldo(Integer idNomina);

    void generarNominaPerseverancia(String fecIni, String fecFin, Integer qnaProceso);
    
    void generarNominaFonac(Integer idNomina, Integer qnaIni, Integer qnaFin, Integer qnaNom, String rfc, String usuario, String fecha);

    void obtienePeriodoLaboradoIS(String letra, String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, 
                                  Integer qnaFin, String tabAnt, String tabNvo, BigDecimal compensacionAnt, 
                                  BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, 
                                  BigDecimal transporteAnt, BigDecimal compensacionNva, BigDecimal despensaNva, 
                                  BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva);

    void obtienePeriodoLaboradomIS(String letra, String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, 
                                   Integer qnaFin, String tabAnt, String tabNvo, BigDecimal compensacionAnt, 
                                   BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, 
                                   BigDecimal transporteAnt, BigDecimal compensacionNva, BigDecimal despensaNva, 
                                   BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva);

								  /**
     * Metodo encargado de procesar faltas y licencias para el incentivo.
     * @author Oscar S.
     * @param idNomina Integer
     */
    public void previoIncentivo(Integer idNomina);
}
