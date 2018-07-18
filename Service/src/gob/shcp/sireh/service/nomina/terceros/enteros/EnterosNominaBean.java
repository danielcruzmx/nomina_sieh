package gob.shcp.sireh.service.nomina.terceros.enteros;


import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.domain.jdbc.TnHistoricoPago;
import gob.shcp.sireh.model.SelectStringDTO;

import gob.shcp.sireh.model.TnHistoricoPagoDTO;

import gob.shcp.sireh.model.nomina.terceros.enteros.EnterosDTO;

import gob.shcp.sireh.model.nomina.terceros.enteros.GenerarEnteroDTO;

import java.util.Collections;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name="EnterosNomina")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value=TransactionAttributeType.SUPPORTS)
public class EnterosNominaBean extends AbstractBean implements EnterosNominaService {
    public EnterosNominaBean() {
    }

    public List<TnHistoricoPagoDTO> getComplemetoOR(String qna,String tipoNomina) {
        return  super.getService(EnterosNominaService.class).getComplemetoOR(qna,tipoNomina);
    }

    public List<TnHistoricoPagoDTO> getComplemetoEX(String qna,  String tipoNomina) {
        return  super.getService(EnterosNominaService.class).getComplemetoEX(qna,tipoNomina);
    }

    public GenerarEnteroDTO procesoEnteros(String qna,String[] complementos,String tercero){
        return  super.getService(EnterosNominaService.class).procesoEnteros(qna,  complementos,tercero);
    }

    public void createFileTxt(GenerarEnteroDTO generarEnteroDTO) {
          super.getService(EnterosNominaService.class).createFileTxt(generarEnteroDTO);
    }

    public void createFileExcel(GenerarEnteroDTO generarEnteroDTO) {
          super.getService(EnterosNominaService.class).createFileTxt(generarEnteroDTO);
    }
}
