package gob.shcp.sireh.service.clc.consultas;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a consultas de CLC.
 */
@Stateless(name = "ClcRegistra")
@Local( { ClcRegistraService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ClcRegistraBean extends AbstractBean implements ClcRegistraService {
    
    /**
     * Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> consultasRegistraTdCxlc(String cxlcCiclo, String cxlcQnaPago, String idTipoNomina, String cxlcComplemento, String cxlc) {
        return super.getService(ClcRegistraService.class).consultasRegistraTdCxlc(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento, cxlc);
    }
    
    /**
     * Metodo encargado de obtener sec_cxlc
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdSecCxlcDTO>
     */
    public List<TdSecCxlcDTO> consultasRegistraTdSecCxlc(Integer secCxlcCiclo, Integer cxlc) {
        return super.getService(ClcRegistraService.class).consultasRegistraTdSecCxlc(secCxlcCiclo, cxlc);
    }
}
