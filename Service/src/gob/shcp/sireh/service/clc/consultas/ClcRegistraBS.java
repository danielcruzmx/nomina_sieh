package gob.shcp.sireh.service.clc.consultas;

import gob.shcp.sireh.data.jdbc.support.CustomTdCxlcDAO;

import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;
import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;

import gob.shcp.sireh.service.AbstractSirehService;

import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes a consultas de CLC.
 */
public class ClcRegistraBS extends AbstractSirehService implements ClcRegistraService  {

    /**
     * Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @param cxlc Integer
     * @return tdCxlc List<TdCxlcDTO>
     */
    public List<TdCxlcDTO> consultasRegistraTdCxlc(String cxlcCiclo, String cxlcQnaPago, String idTipoNomina, String cxlcComplemento, String cxlc) {
        List<TdCxlc> tdCxlc = super.persistence().get(CustomTdCxlcDAO.class).consultasRegistraTdCxlc(cxlcCiclo, cxlcQnaPago, idTipoNomina, cxlcComplemento, cxlc);
        
        return super.transformation().map(tdCxlc, TdCxlcDTO.class);
    }
    
    /**
     * Metodo encargado de obtener sec_cxlc
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param cxlc Integer
     * @return tdSecCxlc List<TdSecCxlcDTO>
     */
    public List<TdSecCxlcDTO> consultasRegistraTdSecCxlc(Integer secCxlcCiclo, Integer cxlc) {
        List<TdSecCxlc> tdSecCxlc =  super.persistence().get(CustomTdCxlcDAO.class).consultasRegistraTdSecCxlc(secCxlcCiclo, cxlc);
        
        return super.transformation().map(tdSecCxlc, TdSecCxlcDTO.class);
    }
}
