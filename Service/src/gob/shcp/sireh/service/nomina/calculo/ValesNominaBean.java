package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.calculo.vales.ValesNominaDTO;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "ValesNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class ValesNominaBean extends AbstractBean implements ValesNominaService {

    public void getValoresIniciales(ValesNominaDTO valesNominaDTO) {
        super.getService(ValesNominaService.class).getValoresIniciales(valesNominaDTO);
    }

    public void updateNominaVales(ValesNominaDTO valesNominaDTO) {
        super.getService(ValesNominaService.class).updateNominaVales(valesNominaDTO);
    }
}
