package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TnCalculoNominaQnaDTO;
import gob.shcp.sireh.model.nomina.calculo.AsociaPlazaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptosPagNomExtraDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "CalculoNominaExtra")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class CalculoNominaExtraBean extends AbstractBean implements CalculoNominaExtraService {

    public List<PagoDTO> getByPlaza(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        return super.getService(CalculoNominaExtraService.class).getByPlaza(asociaPlazaEmpleadoDTO);
    }

    public void saveOrUpdateEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        super.getService(CalculoNominaExtraService.class).saveOrUpdateEmpleado(asociaPlazaEmpleadoDTO);
    }

    public PagoDTO updateCalculaAgregaEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        return super.getService(CalculoNominaExtraService.class).updateCalculaAgregaEmpleado(asociaPlazaEmpleadoDTO);
    }

    public void deleteEmpleados(String[] ids, java.lang.Integer idNomina) {
        super.getService(CalculoNominaExtraService.class).deleteEmpleados(ids, idNomina);
    }

    public PagoDTO getByPlaza(String idPlaza) {
        return super.getService(CalculoNominaExtraService.class).getByPlaza(idPlaza);
    }

    public PagoDTO getByPlaza(String idPlaza, String rfcEmpleado) {
        return super.getService(CalculoNominaExtraService.class).getByPlaza(idPlaza, rfcEmpleado);
    }
    
    public void getQuincenaCaptura(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO) {
        super.getService(CalculoNominaExtraService.class).getQuincenaCaptura(asociaPlazaEmpleadoDTO);
    }

    public ConceptosPagNomExtraDTO getConceptosNominaExtra(String rfcEmpleado) {
        return super.getService(CalculoNominaExtraService.class).getConceptosNominaExtra(rfcEmpleado);
    }

    public TnCalculoNominaQnaDTO getByIdCalculoNominaQna(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO) {
        return super.getService(CalculoNominaExtraService.class).getByIdCalculoNominaQna(tnCalculoNominaQnaDTO);
    }

    public ConceptosPagNomExtraDTO getDatosPlazaByGpoPagoRfc(Integer idPlaza, String rfcEmpleado) {
        return super.getService(CalculoNominaExtraService.class).getDatosPlazaByGpoPagoRfc(idPlaza, rfcEmpleado);
    }

    public List<String> getConceptosNominaExtraOrd(String rfcEmpleado) {
        return super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraOrd(rfcEmpleado);
    }

    public void saveConceptosNominaExtraOrdinaria(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO) {
        super.getService(CalculoNominaExtraService.class).saveConceptosNominaExtraOrdinaria(tnCalculoNominaQnaDTO);
    }

    public NominaDTO getNominaDTO(Integer idNomina) {
        return super.getService(CalculoNominaExtraService.class).getNominaDTO(idNomina);
    }

    public void updateStatusProcesandoNominaQna(int idQna) {
        super.getService(CalculoNominaExtraService.class).updateStatusProcesandoNominaQna(idQna);
    }

    public List<TcConceptoPagoDTO> getConceptosNominaExtraOrdByTipoConcepto(String tipoConcepto) {
        return super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraOrdByTipoConcepto(tipoConcepto);
    }
    
    public List<TcConceptoPagoDTO> getConceptosNominaExtraSARFOV() {
        return super.getService(CalculoNominaExtraService.class).getConceptosNominaExtraSARFOV();
    }

    public void processNominaAguinaldo(Integer idNomina) {
        super.getService(CalculoNominaExtraService.class).processNominaAguinaldo(idNomina);
    }

    public void processPMCandidatosPerseverancia() {
        super.getService(CalculoNominaExtraService.class).processPMCandidatosPerseverancia();
    }
    
    public List<TnCalculoNominaQnaDTO> getNominasByIdNomina(Integer idNomina){
        return super.getService(CalculoNominaExtraService.class).getNominasByIdNomina(idNomina);
    }
}
