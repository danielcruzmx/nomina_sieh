package gob.shcp.sireh.service.terceros;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.terceros.GeneraArchivosTercerosDTO;

import gob.shcp.sireh.model.nomina.terceros.GnpDTO;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;



import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "Terceros")
@Local( { TercerosService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class TercerosBean extends AbstractBean implements TercerosService {

    /**
     * Servicio para obtener la informacion de nómina para armar el archivo de terceros
     * @author Roberto Muñoz
     * @param generaArchivosTercerosDTO
     * @return Lista, Datos del archivo
     */
    public List<Map<Integer, Object>> getDatosTerceros(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosTerceros(generaArchivosTercerosDTO);
    }

    public List<String> getDatosIsssteFiliacion(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosIsssteFiliacion(generaArchivosTercerosDTO);
    }

    public List<String> getDatosIssstePrest(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosIssstePrest(generaArchivosTercerosDTO);
    }

    public List<String> getDatosSericaEnc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosSericaEnc(generaArchivosTercerosDTO);
    }
    
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String>  processSatTimbrado(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).processSatTimbrado(generaArchivosTercerosDTO);
    }
    
    /**
     * Metodo encargado de generar el reporte de Timbrado por quincena
     * @author Oscar S.
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     */
    public GeneraArchivosTercerosDTO processSatTimbradoV2(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).processSatTimbradoV2(generaArchivosTercerosDTO);
    }

    public List<String> getDatosSatTimbradoCanc(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosSatTimbradoCanc(generaArchivosTercerosDTO);
    }

    public List<String> getDatosTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosTerceroFonacot(generaArchivosTercerosDTO);
    }

    public List<String> validaTerceroFonacot(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).validaTerceroFonacot(generaArchivosTercerosDTO);
    }
    /**
     * Metodo encargado de generar el reporte de ISSSTE SIPE
     * @author
     * @param generaArchivosTercerosDTO GeneraArchivosTercerosDTO
     * @return listaString List<String>
     */
    public List<String>  processisssteSIPE(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).processisssteSIPE(generaArchivosTercerosDTO);
    }
    
    public List<String> getDatosSericaC(GeneraArchivosTercerosDTO generaArchivosTercerosDTO) {
        return super.getService(TercerosService.class).getDatosSericaC(generaArchivosTercerosDTO);
   }

    public Integer getNumRegistrosPadronFonac(){
        return super.getService(TercerosService.class).getNumRegistrosPadronFonac();
    }
    
    public Integer getNumRegistrosAfectadosPadronFonac(){
        return super.getService(TercerosService.class).getNumRegistrosAfectadosPadronFonac();
    }
    
    public void bajaPadronFonac(PadronFonacDTO padronFonacDTO){
        super.getService(TercerosService.class).bajaPadronFonac(padronFonacDTO);
    }
    
    public void padronFonacOrdinario(PadronFonacDTO padronFonacDTO){
        super.getService(TercerosService.class).padronFonacOrdinario(padronFonacDTO);
    }
    
    public void padronFonacExtraOrdinario(PadronFonacDTO padronFonacDTO){
        super.getService(TercerosService.class).padronFonacExtraOrdinario(padronFonacDTO);
    }
    
    public List<String> getEmisionChequesFonac(PadronFonacDTO padronFonacDTO){
        return super.getService(TercerosService.class).getEmisionChequesFonac(padronFonacDTO);
    }
    
    public List<String> getliquidaCifrasFonac(PadronFonacDTO padronFonacDTO){
        return super.getService(TercerosService.class).getliquidaCifrasFonac(padronFonacDTO);
    }
    public List<String> getChequesFonac(PadronFonacDTO padronFonacDTO){
        return super.getService(TercerosService.class).getChequesFonac(padronFonacDTO);
    }
    
    public List<String> getCifrasFonac(PadronFonacDTO padronFonacDTO){
        return super.getService(TercerosService.class).getCifrasFonac(padronFonacDTO);
    }

    public List<String> getDatosGnpImp(GnpDTO gnpDTO) {
        return super.getService(TercerosService.class).getDatosGnpImp(gnpDTO);
        }

    public List<String> getDatosGnpMov(GnpDTO gnpDTO) {
        return super.getService(TercerosService.class).getDatosGnpMov(gnpDTO);
        }

    /**
     * @author Ricardo León E.
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> generaPensionIssste(String qnaCaptura) {
        return super.getService(TercerosService.class).generaPensionIssste(qnaCaptura);
    }
    
    /**
     * @author Ricardo León E.
     * @param tipoArchivo String
     * @return listaString List<String>
     */
    public List<String> getAportacionesFonac(PadronFonacDTO padronFonacDTO){
        return super.getService(TercerosService.class).getAportacionesFonac(padronFonacDTO);
    }
	
     /**
      * FONACOT - Metodo que genera archivos de padron de empleados
      * @author Ricardo Leon
      * @param quincena, ciclo
      * @return ListaString List<String>;
      */
     public List<String> getPadronFonacot(Integer ciclo, String quincena) {
         return super.getService(TercerosService.class).getPadronFonacot(ciclo, quincena);
     }
	
    /**
     * Seguro Institucional - Metodo que genera archivo de pago nómina ordinaria
     * @author Ricardo Leon
     * @param quincena
     * @return ListaString List<String>;
     */
    public List<String> getSegInstOrdinario(String quincena) {
        return super.getService(TercerosService.class).getSegInstOrdinario(quincena);
    }

    /**
     * Seguro Institucional - Metodo que genera archivo de pago nómina ordinaria
     * @author Ricardo Leon
     * @param quincena
     * @return ListaString List<String>;
     */
    public List<String> getSegInstExtraordinario(String quincena) {
        return super.getService(TercerosService.class).getSegInstExtraordinario(quincena);
    }

    /**
     * Seguro Institucional - Metodo que genera archivo de pago anticipado
     * @author Ricardo Leon
     * @param quincena
     * @return ListaString List<String>;
     */
    public List<String> getSegInstAnticipado(String quincena) {
        return super.getService(TercerosService.class).getSegInstAnticipado(quincena);
    }

}

