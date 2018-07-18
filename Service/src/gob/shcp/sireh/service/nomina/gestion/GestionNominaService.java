package gob.shcp.sireh.service.nomina.gestion;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.util.List;

import javax.ejb.Local;


@Local
public interface GestionNominaService extends BusinessService{
    
    public NominaDTO getNomina( Integer id );
    public NominaDTO getNominaById( Integer id );
    public QnaCapturaDTO getQuincenaVigente();
    public List<Integer> getListadoNominas( int numQuincenas );
    public int getNextComplemento( NominaDTO nominaDTO );
    public Long insertNomina( NominaDTO nominaDTO, String usuario );
    public Long updateNomina( NominaDTO nominaDTO, String usuario );
    public Long updateNominaCompleta( NominaDTO nominaDTO );
    public void processAcumuConcentrPercepcDeduc(Integer idNomina);
    
    
    
//    public void updateNominaArchivoSat(NominaDTO nominaDTO, String usuario);
    
}
