package gob.shcp.sireh.service.clc.consultas;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.TdCxlcDTO;
import gob.shcp.sireh.model.TdSecCxlcDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface ClcRegistraService extends BusinessService {

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
    List<TdCxlcDTO> consultasRegistraTdCxlc(String cxlcCiclo, String cxlcQnaPago, String idTipoNomina, String cxlcComplemento, String cxlc);
    
    /**
     * Metodo encargado de obtener sec_cxlc
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdSecCxlcDTO>
     */
    List<TdSecCxlcDTO> consultasRegistraTdSecCxlc(Integer secCxlcCiclo, Integer cxlc);
}
