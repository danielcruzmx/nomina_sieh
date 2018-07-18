package gob.shcp.sireh.service.oficinaVirtual;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.QueryExpedienteDAO;
import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTnComprobante;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.oficinaVirtual.tramites.PeriodoVacacional;
import gob.shcp.sireh.model.ItemDTO;
import gob.shcp.sireh.model.expediente.CustomTnComprobanteDTO;
import gob.shcp.sireh.model.expediente.ExpedienteDTO;
import gob.shcp.sireh.model.oficinaVirtual.PeriodoVacacionalDTO;

import java.util.ArrayList;
import java.util.List;

public class TramitesBS extends AbstractService implements TramitesService{
    
    /**
     * Consulta los datos perosonales del trabajador
     * @author Martin C.
     * @param rfc String
     * @return periodoVacacionalDTO
     */
    public PeriodoVacacionalDTO getDatosUsuario(String rfc){
        List<PeriodoVacacional> listaPeriodoVacacional = super.persistence().get(QueryTdEmpleadoDAO.class).getDatosUsuario(rfc);
        if(listaPeriodoVacacional != null && listaPeriodoVacacional.size() > 0){
            return  super.transformation().map(listaPeriodoVacacional.get(0), PeriodoVacacionalDTO.class);
        }
        else {  return new PeriodoVacacionalDTO();  }
    }
    
    /**
     * Consulta los estatus de la Solicitud Individual de Vacaciones
     * @author Martin C.
     * @return ArrayList
     */
    public List<ItemDTO> getStatatusVacaciciones(){
        List<Item>            listaEstatus = new ArrayList<Item>();
        List<ItemDTO>         arrayList = null;
        
        listaEstatus = super.persistence().get(QueryTdEmpleadoDAO.class).getVacacionesEstatus();
        
        if(listaEstatus != null && listaEstatus.size() > 0){
            arrayList = super.transformation().map(listaEstatus, ItemDTO.class);
        }
        else {   arrayList =  new ArrayList<ItemDTO>();    }
        
        return arrayList;
    }
    
}
