package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;

import gob.shcp.sireh.model.nomina.calculo.incremento.IncrementoNominaDTO;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "IncrementoNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class IncrementoNominaBean extends AbstractBean implements IncrementoNominaService {


    public void getValoresIniciales(IncrementoNominaDTO incrementoNominaDTO) {
        super.getService(IncrementoNominaService.class).getValoresIniciales(incrementoNominaDTO);
    }
}
