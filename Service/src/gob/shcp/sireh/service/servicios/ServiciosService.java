package gob.shcp.sireh.service.servicios;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.TnMovtosEmpPlaDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import gob.shcp.sireh.model.servicios.TablaDTO;

import javax.ejb.Local;

@Local
public interface ServiciosService extends BusinessService {
    public TdPlazaDTO getByIdTdPlaza(Integer idPlaza);
    public String FindByRfc(String rfc);
    public void salvarRegistroTdPlaza(TdPlazaDTO antesTdPlazaDTO, TdPlazaDTO despuesTdPlazaDTO, TablaDTO tablaDTO, String ip);
    
    public TnMovtosEmpPlaDTO getByIdTnMovtosEmpPlaza(Integer idMovtosEmpPla);
    public void salvarRegistroTnMovtosEmpPlaza(TnMovtosEmpPlaDTO antes, TnMovtosEmpPlaDTO despues, TablaDTO tablaDTO, String ip);

    public TdEmpleadoDTO getByIdTdEmpleadoDTO(String rfcEmpleado);
    public void salvarRegistroTdEmpleado(TdEmpleadoDTO antes, TdEmpleadoDTO despues, TablaDTO tablaDTO, String ip);
}
