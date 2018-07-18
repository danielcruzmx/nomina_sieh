package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TcGrupoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.GeneracionCecobanDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.plaza.FinContratoDTO;

import java.math.BigDecimal;

import java.util.List;

import java.util.Map;

import javax.ejb.Local;

@Local
public interface CalculoNominaService extends BusinessService {

    public NominaDTO getNominaById(int idQna);
    
    public NominaDTO getNominaByIdExtraordinaria(int idQna);
    
    public NominaDTO getNominaByIdIncentivo(int idQna);

    public PagoDTO getByRFC(String rfc);

    public PagoDTO calcByRFC(String rfc);

    public PagoDTO getByPlaza(String idPlaza);

    public PagoDTO calcByPlaza(String idPlaza);

    public List<PagoDTO> calcByGpoPago(String idGrupoPago, int idNomina, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones);

    public TcGrupoPagoDTO getGrupoPago(String idGrupoPago);

    public List<String> getRFCsCasosMuestra(String idGrupoPago, int idQna);

    public void updateAndSetCasosMuestra(List<String> casosMuestra);

    public void updateAndUnsetCasosMuestra(List<String> casosMuestra);

    public List<TcConceptoPagoDTO> getDescripcionesConceptosPago();

    public GeneracionCecobanDTO preparaGeneracionCecoban();

    GeneracionCecobanDTO generarArchivoCecoban(GeneracionCecobanDTO generacionCecobanDTO);

    public void saveNominaCompleta(List<PagoDTO> listaPagos, int idQna, String user);

    public void saveNominaRFC(PagoDTO pago, int idQna, int idPlaza, String idRfc, String user);
    
    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @author Oscar S.
     * @param idQna in
     */
    public void updateStatusProcesandoNominaQna(int idQna);
    
    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author Oscar S.
     * @param listaPagos List<PagoDTO>
     * @param idQna int
     * @param user String
     */
    public void saveNominaCompletaGpoPago(List<PagoDTO> listaPagos, int idQna, String user);
    
    public Integer getQuincenaCapturaasInteger();
    
    public void cierreNomina(int idQna);
    
    public Boolean validaCierreNomina(int idQna);
    
    public void obtienePeriodoLaboradoIS(String letra,
                                         String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, Integer qnaFin,
                                         String tabAnt, String tabNvo,
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, BigDecimal transporteAnt,
                                         BigDecimal compensacionNva, BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva);
                                         
           public void obtienePeriodoLaboradomIS(String letra,
                                                                              String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, Integer qnaFin,
                                                                              String tabAnt, String tabNvo,
                                                                              BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, BigDecimal transporteAnt,
                                                                              BigDecimal compensacionNva, BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva);

    public List<FinContratoDTO> finContrato(String qnaFinContrato);
}
