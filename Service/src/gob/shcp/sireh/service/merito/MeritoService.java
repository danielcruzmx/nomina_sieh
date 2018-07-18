package gob.shcp.sireh.service.merito;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.merito.MeritoManualDTO;
import gob.shcp.sireh.model.merito.NotaDeMeritoDTO;
import gob.shcp.sireh.model.merito.PagoMeritoDTO;
import gob.shcp.sireh.model.merito.ProcesoNmDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;

import javax.ejb.Local;

@Local
public interface MeritoService extends BusinessService {
    NotaDeMeritoDTO updateNMFilePuntuality(NotaDeMeritoDTO notaDeMeritoDTO);

    NotaDeMeritoDTO updateNMFileTraining(NotaDeMeritoDTO notaDeMeritoDTO);

    NotaDeMeritoDTO updateNMFileTestPerformance(NotaDeMeritoDTO notaDeMeritoDTO);

    NotaDeMeritoDTO getMaximoRemesaPorCicloYCausal(NotaDeMeritoDTO notaDeMeritoDTO);

    MeritoManualDTO updateManually(MeritoManualDTO meritoManualDTO);

    PagoMeritoDTO generarArchivoPago(PagoMeritoDTO pagoMeritoDTO);

    MeritoManualDTO validProcessManually(MeritoManualDTO meritoManualDTO);

    ResumenMeritoDTO getEmpleadoInfoResumenMerito(ResumenMeritoDTO resumenMeritoDTO);

    ResumenMeritoDTO getEmpleadoInfoResumenGraficaMerito(ResumenMeritoDTO resumenMeritoDTO);

    ProcesoNmDTO updateProcesoNM(ProcesoNmDTO procesoNmDTO, String usuario);
}
