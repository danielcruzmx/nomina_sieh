package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.nomina.calculo.vales.ValesNominaDTO;

import javax.ejb.Local;

@Local
public interface ValesNominaService extends BusinessService{
    void getValoresIniciales(ValesNominaDTO valesNominaDTO);
    
    void updateNominaVales(ValesNominaDTO valesNominaDTO);
}
