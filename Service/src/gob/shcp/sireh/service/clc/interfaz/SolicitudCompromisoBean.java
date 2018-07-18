package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.TcTipoNominaDTO;
import gob.shcp.sireh.model.clc.interfaz.SolicitudCompromisoDTO;

import java.io.IOException;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes al modulo Solicitud Compromiso.
 */
@Stateless(name="SolicitudCompromiso")
@Local({SolicitudCompromisoService.class})
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class SolicitudCompromisoBean extends AbstractBean implements SolicitudCompromisoService {

    /**
     * Metodo encargado de generar el archivo correspondiente a la Solicitud de compromiso con base en el objeto solicitudCompromisoDTO.
     * @author Oscar S.
     * @param solicitudCompromisoDTO SolicitudCompromisoDTO
     * @return solicitudCompromisoDTO SolicitudCompromisoDTO
     */
    public SolicitudCompromisoDTO updateGenSolCompManual(SolicitudCompromisoDTO solicitudCompromisoDTO) throws IOException {
        return super.getService(SolicitudCompromisoService.class).updateGenSolCompManual(solicitudCompromisoDTO);
    }
    
    /**
     * Metodo encargado de obtener las nominas validas para el Usuario comodin.
     * @author Oscar S.
     * @return nominasValidasBenefComodin List<TcTipoNominaDTO>
     */
    public List<TcTipoNominaDTO> getNominasValidasBenefComodin(){
        return super.getService(SolicitudCompromisoService.class).getNominasValidasBenefComodin();
    }
}
