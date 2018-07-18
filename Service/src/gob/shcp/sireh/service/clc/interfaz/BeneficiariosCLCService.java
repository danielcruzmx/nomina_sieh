package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.interfaz.DetalleBeneficiarioDTO;

import javax.ejb.Local;

@Local
public interface BeneficiariosCLCService extends BusinessService {
    
    /**
     * Metodo encargado de armar la llave y consultar Beneficiarios 1 a 1 de CLC.
     * @author Josue L. Torres.
     * @param bsCtaBancaria String
     * @param bsLeyenda String
     * @param bsTipoPago String
     * @param idBeneSicop String
     * @return detalleBeneficiarioDTO DetalleBeneficiarioDTO
     */
    DetalleBeneficiarioDTO getBeneficiario(String bsCtaBancaria, String bsLeyenda, String bsTipoPago, String idBeneSicop);
    
    /**
    * Metodo encargado de actualizar Beneficiarios.
    * @author Josue L. Torres.
    * @param detalleBeneficiarioDTO DetalleBeneficiarioDTO
    */
    void updateBeneficiario(DetalleBeneficiarioDTO detalleBeneficiarioDTO);
}
