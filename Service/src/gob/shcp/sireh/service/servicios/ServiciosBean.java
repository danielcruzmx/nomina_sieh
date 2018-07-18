package gob.shcp.sireh.service.servicios;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.nomina.TnMovtosEmpPlaDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;

import gob.shcp.sireh.model.servicios.TablaDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "Servicios")
@Local( { ServiciosService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ServiciosBean extends AbstractBean implements ServiciosService {

    public TdPlazaDTO getByIdTdPlaza(Integer isPlaza){
        return super.getService(ServiciosService.class).getByIdTdPlaza(isPlaza);
    }
    
    public String FindByRfc(String rfc){
        return super.getService(ServiciosService.class).FindByRfc(rfc);
    }
    
    public void salvarRegistroTdPlaza(TdPlazaDTO antesTdPlazaDTO, TdPlazaDTO despuesTdPlazaDTO, TablaDTO tablaDTO, String ip){
        super.getService(ServiciosService.class).salvarRegistroTdPlaza(antesTdPlazaDTO, despuesTdPlazaDTO, tablaDTO, ip);
    }
    
    public TnMovtosEmpPlaDTO getByIdTnMovtosEmpPlaza(Integer idMovtosEmpPla){
        return super.getService(ServiciosService.class).getByIdTnMovtosEmpPlaza(idMovtosEmpPla);
    }
    
    public void salvarRegistroTnMovtosEmpPlaza(TnMovtosEmpPlaDTO antes, TnMovtosEmpPlaDTO despues, TablaDTO tablaDTO, String ip){
        super.getService(ServiciosService.class).salvarRegistroTnMovtosEmpPlaza(antes, despues, tablaDTO, ip);
    }
    
    public TdEmpleadoDTO getByIdTdEmpleadoDTO(String rfcEmpleado){
        return super.getService(ServiciosService.class).getByIdTdEmpleadoDTO(rfcEmpleado);
    }
    public void salvarRegistroTdEmpleado(TdEmpleadoDTO antes, TdEmpleadoDTO despues, TablaDTO tablaDTO, String ip){
        super.getService(ServiciosService.class).salvarRegistroTdEmpleado(antes, despues, tablaDTO, ip);
    }
    
}
