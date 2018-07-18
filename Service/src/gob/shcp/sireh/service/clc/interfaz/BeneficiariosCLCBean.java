package gob.shcp.sireh.service.clc.interfaz;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.clc.interfaz.DetalleBeneficiarioDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "BeneficiariosCLC")
@Local( { BeneficiariosCLCService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class BeneficiariosCLCBean extends AbstractBean implements BeneficiariosCLCService {

    /**
     * Metodo encargado de armar la llave y consultar Beneficiarios 1 a 1 de CLC.
     * @author Josue L. Torres.
     * @param bsCtaBancaria String
     * @param bsLeyenda String
     * @param bsTipoPago String
     * @param idBeneSicop String
     * @return detalleBeneficiarioDTO DetalleBeneficiarioDTO
     */
    public DetalleBeneficiarioDTO getBeneficiario(String bsCtaBancaria, String bsLeyenda, String bsTipoPago, String idBeneSicop) {
        return super.getService(BeneficiariosCLCService.class).getBeneficiario(bsCtaBancaria, bsLeyenda, bsTipoPago, idBeneSicop);
    }
    
    /**
    * Metodo encargado de actualizar Beneficiarios.
    * @author Josue L. Torres.
    * @param detalleBeneficiarioDTO DetalleBeneficiarioDTO
    */
    public void updateBeneficiario(DetalleBeneficiarioDTO detalleBeneficiarioDTO) {
        super.getService(BeneficiariosCLCService.class).updateBeneficiario(detalleBeneficiarioDTO);
    }
}
