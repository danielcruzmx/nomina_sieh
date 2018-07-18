package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.calculo.PagoDTO;

import gob.shcp.sireh.model.nomina.calculo.incremento.IncrementoNominaDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IncrementoNominaService extends BusinessService {

    
    void getValoresIniciales(IncrementoNominaDTO incrementoNominaDTO);
}
