package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.CustomTdSecCxlc;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface CustomTdSecCxlcDAO extends DataService {

    /**
     * Metodo encargado de obtener las cxlc a comprometer con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc List<Integer>
     * @return cxlcComprometer List<TdSecCxlc>
     */
    List<CustomTdSecCxlc> getDetalleCxlcSolicitudCompromiso(Integer secCxlcCiclo, Set<Integer> secCxlc);
    
    /**
     * Metodo encargado de obtener las cxlc a pagar con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc Set<Integer>
     * @return cxlcComprometer List<CustomTdSecCxlc>
     */
    List<CustomTdSecCxlc> getDetalleCxlcSolicitudPago(Integer secCxlcCiclo, Set<Integer> secCxlc);
    
    /**
     * Metodo encargado de obtener las cxlc con base en el ciclo y lista de cxlc.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCxlc List<Integer>
     * @return cxlcComprometer List<CustomTdSecCxlc>
     */
    List<CustomTdSecCxlc> getDetalleCxlcSolicitudCLC(Integer secCxlcCiclo, Set<Integer> secCxlc);
    
    /**
     * Interfaz SICOP - Solicitud de CLC - Metodo encargado de obtener el compromiso y complemento actual
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlc List<Integer>
     * @return tdCxlc List<TdCxlc>
     */
    List<TdCxlc> getCxlcCompromisoComplementoActual(Integer cxlcCiclo, Set<Integer> cxlc);
    
    /**
     * Procesa Manual - Metodo encargado de obtener el numero maximo de sec_cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return tdSecCxlc List<TdSecCxlc>
     */
    List<TdSecCxlc> getMaxSecCxlcManuales(Integer cxlcCiclo);
    
    /**
     * Procesa Manual - Metodo encargado de obtener la sec_cxlc con base a parametros obtenidos del archivo de cxlc manual.
     * @author Oscar S.
     * @param ciclo Integer
     * @param unidad String
     * @param partida String
     * @param estado String
     * @return tdSecCxlc List<TdSecCxlc>
     */
    List<TdSecCxlc> getSecCxlcManualArchivo(Integer ciclo, String unidad, String partida, String estado);
}
