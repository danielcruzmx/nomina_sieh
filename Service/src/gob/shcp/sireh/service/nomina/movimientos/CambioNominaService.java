package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.CambioBancariosDTO;
import gob.shcp.sireh.model.nomina.CambioComplementariosDTO;
import gob.shcp.sireh.model.nomina.CambioDomicilioDTO;
import gob.shcp.sireh.model.nomina.CambioNombreCurpDTO;
import gob.shcp.sireh.model.nomina.CambioRfcDTO;

import javax.ejb.Local;

@Local
public interface CambioNominaService extends BusinessService {

    void updateEmpleadoPlazaRfc(CambioRfcDTO cambioRfc, String usuario);
    CambioRfcDTO getEmpleadoPlaza(String rfcEmpleado);
    
    CambioNombreCurpDTO getEmpleadoCambioNombreCurp(String rfcEmpleado);
    void updateEmpleadoNombreCurp(CambioNombreCurpDTO cambioNombreCurpDTO, String usuario);

    CambioBancariosDTO getEmpleadoCambioBancarios(String rfcEmpleado);
    void updateEmpleadoBancarios(CambioBancariosDTO cambioBancariosDTO, String usuario);
    
    CambioDomicilioDTO getEmpleadoCambioDomicilio(String rfcEmpleado);
    void updateEmpleadoCambioDomicilio(CambioDomicilioDTO cambioDomicilioDTO, String usuario);
    
    CambioComplementariosDTO getEmpleadoCambioComplementarios(String rfcEmpleado);
    void updateEmpleadoCambioComplementarios(CambioComplementariosDTO cambioComplementariosDTO, String usuario);
    
}
