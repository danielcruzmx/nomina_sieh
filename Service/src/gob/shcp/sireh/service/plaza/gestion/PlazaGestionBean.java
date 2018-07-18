package gob.shcp.sireh.service.plaza.gestion;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.nomina.terceros.enteros.fonac.PadronFonacDTO;
import gob.shcp.sireh.model.plaza.gestion.ConsultaLineaDTO;

import gob.shcp.sireh.model.plaza.reporte.ReportePlazaDTO;

import gob.shcp.sireh.service.terceros.TercerosService;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Bean encargado de atender solicitudes correspondientes a Consulta de Plazas.
 */
@Stateless(name = "PlazaGestion")
@Local( { PlazaGestionService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class PlazaGestionBean extends AbstractBean implements PlazaGestionService {

    /**
     * Metodo encargado de obtener los datos de la Plaza con base en su id.
     * @author Roberto Muñoz.
     * @param idPlaza Integer
     * @return consultaLineaDTO ConsultaLineaDTO
     */
    public ConsultaLineaDTO getEmpleadoPlaza(Integer idPlaza) {
        return super.getService(PlazaGestionService.class).getEmpleadoPlaza(idPlaza);
    }

    /**
     * Metodo encargado de obtener los datos del POT.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pot(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pot(reportePlazaDTO);
    }

    /**
     * Metodo encargado de obtener los datos del PNT.
     * @author Cesar B.
     * @param reportePlazaDTO ReportePlazaDTO
     * @return List
     */
    public List<String> pntestructura(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntestructura(reportePlazaDTO);
    }

    public List<String> pntdirectorio(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntdirectorio(reportePlazaDTO);
    }

    public List<String> pntremuneracion(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntremuneracion(reportePlazaDTO);
    }

    public List<String> pntfuncion(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntfuncion(reportePlazaDTO);
    }

    public List<String> pntestadistico(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntestadistico(reportePlazaDTO);
    }

    public List<String> pntinmueble(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntinmueble(reportePlazaDTO);
    }

    public List<String> pntaltas(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntaltas(reportePlazaDTO);
    }

    public List<String> pntbajas(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntbajas(reportePlazaDTO);
    }

    public List<String> pntcontratacionhonorarios(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).pntcontratacionhonorarios(reportePlazaDTO);
    }

    /**
     * @author Ricardo León E.
     * @param tipoArchivo String
     * @param uniCiclo String
     * @return listaString List<String>
     */
    public List<String> getConsultaPlazasVigentes(ReportePlazaDTO reportePlazaDTO) {
        return super.getService(PlazaGestionService.class).getConsultaPlazasVigentes(reportePlazaDTO);
    }

}
