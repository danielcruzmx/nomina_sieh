package gob.shcp.sireh.service.plaza.gestion;

import gob.shcp.fsn.service.BusinessService;
import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaLineaDTO;

import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface PlazaGestionService extends BusinessService {

    /**
     * Metodo encargado de obtener los datos de la Plaza con base en su id.
     * @author Roberto Muñoz.
     * @param idPlaza Integer
     * @return consultaLineaDTO ConsultaLineaDTO
     */
    ConsultaLineaDTO getEmpleadoPlaza(Integer idPlaza);
    
    /**
     * Metodo encargado de obtener los datos del POT.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pot(ReportePlazaDTO reportePlazaDTO);

    /**
     * Metodo encargado de obtener los datos del PNT.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntdirectorio(ReportePlazaDTO reportePlazaDTO);

    public List<String> pntestructura(ReportePlazaDTO reportePlazaDTO);

    public List<String> pntremuneracion(ReportePlazaDTO reportePlazaDTO);

    public List<String> pntestadistico(ReportePlazaDTO reportePlazaDTO);

    public List<String> pntfuncion(ReportePlazaDTO reportePlazaDTO);
    
    public List<String> pntinmueble(ReportePlazaDTO reportePlazaDTO);
    
    public List<String> pntaltas(ReportePlazaDTO reportePlazaDTO);
    
    public List<String> pntbajas(ReportePlazaDTO reportePlazaDTO);

    public List<String> pntcontratacionhonorarios(ReportePlazaDTO reportePlazaDTO);

     /**
      * Metodo encargado de generar el archivo 
      * @author
      * @param reportePlazaDTO ReportePlazaDTO
      * @return listaString List<String>
      */
     public List<String> getConsultaPlazasVigentes(ReportePlazaDTO reportePlazaDTO);
    
}

