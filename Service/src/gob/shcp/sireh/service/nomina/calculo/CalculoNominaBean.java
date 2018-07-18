package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TcGrupoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.GeneracionCecobanDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;
import gob.shcp.sireh.model.plaza.FinContratoDTO;

import java.math.BigDecimal;

import java.util.List;

import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "CalculoNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class CalculoNominaBean extends AbstractBean implements CalculoNominaService {

    public NominaDTO getNominaById(int idQna) {
        return super.getService(CalculoNominaService.class).getNominaById(idQna);
    }
    
    public NominaDTO getNominaByIdExtraordinaria(int idQna) {
        return super.getService(CalculoNominaService.class).getNominaByIdExtraordinaria(idQna);
    }
    
    public NominaDTO getNominaByIdIncentivo(int idQna) {
        return super.getService(CalculoNominaService.class).getNominaByIdIncentivo(idQna);
    }

    public PagoDTO getByRFC(String rfc) {
        return super.getService(CalculoNominaService.class).getByRFC(rfc);
    }

    public PagoDTO calcByRFC(String rfc) {
        return super.getService(CalculoNominaService.class).calcByRFC(rfc);
    }

    public PagoDTO getByPlaza(String idPlaza) {
        return super.getService(CalculoNominaService.class).getByPlaza(idPlaza);
    }

    public PagoDTO calcByPlaza(String idPlaza) {
        return super.getService(CalculoNominaService.class).calcByPlaza(idPlaza);
    }

    public List<PagoDTO> calcByGpoPago(String idGrupoPago, int idNomina, String nomFuenteDatos, String operationalYear, Map<String, Map<String, String>> dimensiones) {
        return super.getService(CalculoNominaService.class).calcByGpoPago(idGrupoPago, idNomina, nomFuenteDatos, operationalYear, dimensiones);
    }

    public TcGrupoPagoDTO getGrupoPago(String idGrupoPago) {
        return super.getService(CalculoNominaService.class).getGrupoPago(idGrupoPago);
    }

    public List<String> getRFCsCasosMuestra(String idGrupoPago, int idQna) {
        return super.getService(CalculoNominaService.class).getRFCsCasosMuestra(idGrupoPago, idQna);
    }

    public List<TcConceptoPagoDTO> getDescripcionesConceptosPago() {
        return super.getService(CalculoNominaService.class).getDescripcionesConceptosPago();
    }

    public void updateAndSetCasosMuestra(List<String> casosMuestra) {
        super.getService(CalculoNominaService.class).updateAndSetCasosMuestra(casosMuestra);
    }

    public void updateAndUnsetCasosMuestra(List<String> casosMuestra) {
        super.getService(CalculoNominaService.class).updateAndUnsetCasosMuestra(casosMuestra);
    }

    public GeneracionCecobanDTO preparaGeneracionCecoban() {
        return super.getService(CalculoNominaService.class).preparaGeneracionCecoban();
    }

    public GeneracionCecobanDTO generarArchivoCecoban(GeneracionCecobanDTO generacionCecobanDTO) {
        return super.getService(CalculoNominaService.class).generarArchivoCecoban(generacionCecobanDTO);
    }

    public void saveNominaCompleta(List<PagoDTO> listaPagos, int idQna, String username) {
        super.getService(CalculoNominaService.class).saveNominaCompleta(listaPagos, idQna, username);
    }

    public void saveNominaRFC(PagoDTO pago, int idQna, int idPlaza, String idRfc, String user) {
        super.getService(CalculoNominaService.class).saveNominaRFC(pago, idQna, idPlaza, idRfc, user);
    }
    
    /**
     * Metodo encargado de actualizar el status a Procesando en la nomina seleccionada.
     * @author Oscar S.
     * @param idQna int
     */
    public void updateStatusProcesandoNominaQna(int idQna) {
        super.getService(CalculoNominaService.class).updateStatusProcesandoNominaQna(idQna);
    }
    
    /**
     * Metodo encargado de ejecutar consultas relacionadas al calculo de nomina por grupo de pago.
     * @author Oscar S.
     * @param listaPagos List<PagoDTO>
     * @param idQna int
     * @param user String
     */
    public void saveNominaCompletaGpoPago(List<PagoDTO> listaPagos, int idQna, String user) {
        super.getService(CalculoNominaService.class).saveNominaCompletaGpoPago(listaPagos, idQna, user);
    }

    public Integer getQuincenaCapturaasInteger() {
        return super.getService(CalculoNominaService.class).getQuincenaCapturaasInteger();
    }

    public void cierreNomina(int idQna) {
        super.getService(CalculoNominaService.class).cierreNomina(idQna);
    }

    public Boolean validaCierreNomina(int idQna) {
        return super.getService(CalculoNominaService.class).validaCierreNomina(idQna);
    }

    public void obtienePeriodoLaboradoIS(String letra,
                                         String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, Integer qnaFin,
                                         String tabAnt, String tabNvo,
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, BigDecimal transporteAnt,
                                         BigDecimal compensacionNva, BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva) {
        super.getService(CalculoNominaService.class).obtienePeriodoLaboradoIS(letra,
                                                                              fecIni, fecFin, qnaProceso, qnaIni, qnaFin,
                                                                              tabAnt, tabNvo,
                                                                              compensacionAnt, despensaAnt, previsionAnt, serviciosAnt, transporteAnt,
                                                                              compensacionNva, despensaNva, previsionNva, serviciosNva, transporteNva);
    }

    public void obtienePeriodoLaboradomIS(String letra,
                                         String fecIni, String fecFin, Integer qnaProceso, Integer qnaIni, Integer qnaFin,
                                         String tabAnt, String tabNvo,
                                         BigDecimal compensacionAnt, BigDecimal despensaAnt, BigDecimal previsionAnt, BigDecimal serviciosAnt, BigDecimal transporteAnt,
                                         BigDecimal compensacionNva, BigDecimal despensaNva, BigDecimal previsionNva, BigDecimal serviciosNva, BigDecimal transporteNva) {
        super.getService(CalculoNominaService.class).obtienePeriodoLaboradomIS(letra,
                                                                              fecIni, fecFin, qnaProceso, qnaIni, qnaFin,
                                                                              tabAnt, tabNvo,
                                                                              compensacionAnt, despensaAnt, previsionAnt, serviciosAnt, transporteAnt,
                                                                              compensacionNva, despensaNva, previsionNva, serviciosNva, transporteNva);
    }
    
    public List<FinContratoDTO> finContrato(String qnaFinContrato){
        return super.getService(CalculoNominaService.class).finContrato(qnaFinContrato);
    }
}
