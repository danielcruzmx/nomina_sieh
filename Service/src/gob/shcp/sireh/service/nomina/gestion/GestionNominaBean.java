package gob.shcp.sireh.service.nomina.gestion;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


@Stateless(name="GestionNomina")
@Local({GestionNominaService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class GestionNominaBean 
    extends AbstractBean
    implements GestionNominaService {

    public NominaDTO getNomina(Integer id) {
        return super.getService(GestionNominaService.class)
            .getNomina(id);
    }
    
    public QnaCapturaDTO getQuincenaVigente() {
        return super.getService(GestionNominaService.class)
            .getQuincenaVigente();
    }
    
    public List<Integer> getListadoNominas( int numQuincenas ) {
        return super.getService(GestionNominaService.class)
            .getListadoNominas( numQuincenas );
    }

    public int getNextComplemento( NominaDTO nominaDTO ) {
        return super.getService(GestionNominaService.class)
             .getNextComplemento(nominaDTO);
    }
    
    public Long insertNomina( NominaDTO nominaDTO, String usuario ) {
        return super.getService(GestionNominaService.class)
                .insertNomina( nominaDTO, usuario );
    }
    
    public Long updateNomina( NominaDTO nominaDTO, String usuario ) {
        return super.getService(GestionNominaService.class)
                .updateNomina( nominaDTO,usuario );
    }
    
    public Long updateNominaCompleta( NominaDTO nominaDTO ){
        return super.getService(GestionNominaService.class).updateNominaCompleta( nominaDTO);
    }
    
    public synchronized void processAcumuConcentrPercepcDeduc(Integer idNomina){
        super.getService(GestionNominaService.class).processAcumuConcentrPercepcDeduc(idNomina);
    }
    
//    public void updateNominaArchivoSat(NominaDTO nominaDTO, String usuario) {
//        super.getService(GestionNominaService.class).updateNominaArchivoSat(nominaDTO, usuario);
//    }

    public NominaDTO getNominaById(Integer id) {
        return super.getService(GestionNominaService.class).getNominaById(id);
    }
    
    
}
