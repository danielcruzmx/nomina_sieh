package gob.shcp.sireh.service.terceros;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.clc.EtiquetaClaveValorEntero;
import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;
import gob.shcp.sireh.model.nomina.terceros.GnpDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;


import java.util.List;
import java.util.Map;

import javax.ejb.Local;

@Local
public interface TercerosService extends BusinessService {

    /**
     * Servicio para obtener la informacion de nómina para armar el archivo de terceros
     * @author Roberto Muñoz
     * @param generaArchivosTercerosDTO
     * @return Lista, Datos del archivo
     */
    public List<Map<Integer, Object>> getDatosTerceros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosIsssteFiliacion(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosIssstePrest(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosSericaEnc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String> processSatTimbrado(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author Oscar S.
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    public GeneraArchivosTercerosDTO processSatTimbradoV2(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosSatTimbradoCanc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> validaTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    /**
     * Metodo encargado de generar el archivo de issste SIPE
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String> processisssteSIPE(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public List<String> getDatosSericaC(GeneraArchivosTercerosDTO generaArchivosTercerosDTO);

    public Integer getNumRegistrosPadronFonac();

    public Integer getNumRegistrosAfectadosPadronFonac();

    public void bajaPadronFonac(PadronFonacDTO padronFonacDTO);

    public void padronFonacOrdinario(PadronFonacDTO padronFonacDTO);

    public void padronFonacExtraOrdinario(PadronFonacDTO padronFonacDTO);

    public List<String> getEmisionChequesFonac(PadronFonacDTO padronFonacDTO);

    public List<String> getliquidaCifrasFonac(PadronFonacDTO padronFonacDTO);

    public List<String> getChequesFonac(PadronFonacDTO padronFonacDTO);

    public List<String> getCifrasFonac(PadronFonacDTO padronFonacDTO);
    
    public List<String> getDatosGnpImp(GnpDTO gnpDTO);
    
    public List<String> getDatosGnpMov(GnpDTO gnpDTO);
  
    /**
     * Metodo encargado de generar el archivo para PENSIONISSSTE
     * @author Ricardo León E.
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String> generaPensionIssste(String qnaCaptura);

    /**
     * Metodo encargado de generar el archivo de aportaciones de FONAC
     * @author
     * @param padronFonacDTO PadronFonacDTO
     * @return listaString List<String>
     */
    public List<String> getAportacionesFonac(PadronFonacDTO padronFonacDTO);

    /**
     * Genera archivo de padron FONACOT
     * @author Ricardo León E.
     * @param quincena, ciclo
     * @return listaString List<String>;
     */
    public List<String> getPadronFonacot(Integer ciclo, String quincena);

    /**
     * Genera archivo de pago Ordinaria del Seguro Institucioonal
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getSegInstOrdinario(String quincena);

    /**
     * Genera archivo de pago Extraordinaria del Seguro Institucioonal
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getSegInstExtraordinario(String quincena);

    /**
     * Genera archivo de pago Anticipado del Seguro Institucioonal
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getSegInstAnticipado(String quincena);

}
