package gob.shcp.sireh.service.nomina.terceros.enteros;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.SelectStringDTO;
import gob.shcp.sireh.model.TnHistoricoPagoDTO;
import gob.shcp.sireh.model.nomina.terceros.CargaArchivoDTO;
import gob.shcp.sireh.model.nomina.terceros.DatosArchivoDTO;

import gob.shcp.sireh.model.nomina.terceros.enteros.EnterosDTO;

import gob.shcp.sireh.model.nomina.terceros.enteros.GenerarEnteroDTO;

import java.util.List;

import javax.ejb.Local;


@Local
public interface EnterosNominaService  extends BusinessService {
    public List<TnHistoricoPagoDTO>  getComplemetoOR(String qna,String tipoNomina) ;
    public List<TnHistoricoPagoDTO>  getComplemetoEX(String qna,String tipoNomina) ;
    public GenerarEnteroDTO  procesoEnteros(String qna,String[] complementos,String tercero) ;
    public void  createFileTxt(GenerarEnteroDTO generarEnteroDTO) ;
    public void  createFileExcel(GenerarEnteroDTO generarEnteroDTO) ;
    

}