package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TcConceptoPagoDTO;
import gob.shcp.sireh.model.TnCalculoNominaQnaDTO;
import gob.shcp.sireh.model.TnNominaDTO;
import gob.shcp.sireh.model.nomina.calculo.AsociaPlazaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptosPagNomExtraDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface CalculoNominaExtraService extends BusinessService {

    public List<PagoDTO> getByPlaza(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO);

    public void saveOrUpdateEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO);

    public PagoDTO updateCalculaAgregaEmpleado(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO);

    public void deleteEmpleados(String[] ids, java.lang.Integer idNomina);

    public PagoDTO getByPlaza(String idPlaza);

    public PagoDTO getByPlaza(String idPlaza, String rfcEmpleado);
    
    public void getQuincenaCaptura(AsociaPlazaEmpleadoDTO asociaPlazaEmpleadoDTO);

    public ConceptosPagNomExtraDTO getConceptosNominaExtra(String rfcEmpleado);

    public TnCalculoNominaQnaDTO getByIdCalculoNominaQna(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO);

    public ConceptosPagNomExtraDTO getDatosPlazaByGpoPagoRfc(Integer idPlaza, String rfcEmpleado);

    public List<String> getConceptosNominaExtraOrd(String rfcEmpleado);

    public void saveConceptosNominaExtraOrdinaria(TnCalculoNominaQnaDTO tnCalculoNominaQnaDTO);

    public NominaDTO getNominaDTO(java.lang.Integer idNomina);

    public void updateStatusProcesandoNominaQna(int idQna);
	
    public List<TcConceptoPagoDTO> getConceptosNominaExtraOrdByTipoConcepto(String tipoConcepto);
    
    public List<TcConceptoPagoDTO> getConceptosNominaExtraSARFOV();
    
    public void processNominaAguinaldo(Integer idNomina);
    
    public void processPMCandidatosPerseverancia();
    
    public List<TnCalculoNominaQnaDTO> getNominasByIdNomina(Integer idNomina);
}
