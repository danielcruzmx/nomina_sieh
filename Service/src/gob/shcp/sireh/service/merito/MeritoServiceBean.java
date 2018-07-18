package gob.shcp.sireh.service.merito;

import gob.shcp.fsn.service.AbstractBean;

import gob.shcp.sireh.model.merito.MeritoManualDTO;
import gob.shcp.sireh.model.merito.NotaDeMeritoDTO;
import gob.shcp.sireh.model.merito.PagoMeritoDTO;
import gob.shcp.sireh.model.merito.ProcesoNmDTO;
import gob.shcp.sireh.model.merito.ResumenMeritoDTO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;


/**
 * Bean encargado de atender solicitudes correspondientes a Notas de Mérito
 */
@Stateless(name = "Merito")
@Local( { MeritoService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class MeritoServiceBean extends AbstractBean implements MeritoService {

    /** 
     * Metodo para obtener el número Máximo de Remesa por ciclo y causal.
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO getMaximoRemesaPorCicloYCausal(NotaDeMeritoDTO notaDeMeritoDTO) {
        return super.getService(MeritoService.class).getMaximoRemesaPorCicloYCausal(notaDeMeritoDTO);
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de puntualidad generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFilePuntuality(NotaDeMeritoDTO notaDeMeritoDTO) {
        return super.getService(MeritoService.class).updateNMFilePuntuality(notaDeMeritoDTO);
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de capacitación generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFileTraining(NotaDeMeritoDTO notaDeMeritoDTO) {
        return super.getService(MeritoService.class).updateNMFileTraining(notaDeMeritoDTO);
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico por causal de evaluación de desempeño generando una remesa
     * @author Victor Pérez.
     * @param notaDeMeritoDTO NotaDeMeritoDTO
     * @return notaDeMeritoDTO NotaDeMeritoDTO
     */
    public NotaDeMeritoDTO updateNMFileTestPerformance(NotaDeMeritoDTO notaDeMeritoDTO) {
        return super.getService(MeritoService.class).updateNMFileTestPerformance(notaDeMeritoDTO);
    }

    /** 
     * Metodo para ingresar las notas de mérito en la tabla de Histórico en forma manual a una remesa
     * @author Victor Pérez.
     * @param meritoManualDTO MeritoManualDTO
     * @return meritoManualDTO MeritoManualDTO
     */
    public MeritoManualDTO updateManually(MeritoManualDTO meritoManualDTO) {
        return super.getService(MeritoService.class).updateManually(meritoManualDTO);
    }

    /** 
     * Metodo para generar el archivo de pago que se va hacia Nómina
     * @author Victor Pérez.
     * @param pagoMeritoDTO PagoMeritoDTO
     * @return pagoMeritoDTO PagoMeritoDTO
     */
    public PagoMeritoDTO generarArchivoPago(PagoMeritoDTO pagoMeritoDTO) {
        return super.getService(MeritoService.class).generarArchivoPago(pagoMeritoDTO);
    }

    /** 
     * Metodo para validar el ingreso de una nota de mérito de forma manual de cualquier tipo de causal
     * @author Victor Pérez.
     * @param meritoManualDTO MeritoManualDTO
     * @return meritoManualDTO MeritoManualDTO
     */
    public MeritoManualDTO validProcessManually(MeritoManualDTO meritoManualDTO) {
        return super.getService(MeritoService.class).validProcessManually(meritoManualDTO);
    }

    /** 
     * Metodo para obtener la información del Empleado que se muestra en el detalle de 
     * @author Victor Pérez.
     * @param resumenMeritoDTO ResumenMeritoDTO
     * @return resumenMeritoDTO ResumenMeritoDTO
     */
    public ResumenMeritoDTO getEmpleadoInfoResumenMerito(ResumenMeritoDTO resumenMeritoDTO) {
        return super.getService(MeritoService.class).getEmpleadoInfoResumenMerito(resumenMeritoDTO);
    }

    /** 
     * Metodo para llama a la función PKG_Notas_Merito.NM_CALCULO_CONSE que realiza el ingreso en la tabla de resumén realizando el cálculo de la consecutividad
     * @author Victor Pérez.
     * @param procesoNmDTO ProcesoNmDTO
     * @return procesoNmDTO ProcesoNmDTO
     */
    public ProcesoNmDTO updateProcesoNM(ProcesoNmDTO procesoNmDTO, String usuario) {
        return super.getService(MeritoService.class).updateProcesoNM(procesoNmDTO, usuario);
    }

    /** 
     * Metodo para obtener la información del Empleado y la gráfica de Mérito en el ResumenMeritoDTO
     * @author Victor Pérez.
     * @param resumenMeritoDTO ResumenMeritoDTO
     * @return resumenMeritoDTO ResumenMeritoDTO
     */
    public ResumenMeritoDTO getEmpleadoInfoResumenGraficaMerito(ResumenMeritoDTO resumenMeritoDTO) {
        return super.getService(MeritoService.class).getEmpleadoInfoResumenGraficaMerito(resumenMeritoDTO);
    }
}
