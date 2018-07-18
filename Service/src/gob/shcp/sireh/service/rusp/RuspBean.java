package gob.shcp.sireh.service.rusp;

import gob.shcp.fsn.service.AbstractBean;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.rusp.CustomEmpleadoPlazaRuspDTO;


import gob.shcp.sireh.model.rusp.DatosBasicos1DTO;
import gob.shcp.sireh.model.rusp.DatosBasicosDTO;

import java.util.List;

import gob.shcp.sireh.model.rusp.RuspDTO;

import gob.shcp.sireh.model.rusp.TdRuspHijoDTO;
import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import java.util.List;


import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.antlr.runtime.misc.IntArray;


@Stateless(name = "Rusp")
@Local( { RuspService.class })
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.SUPPORTS)
public class RuspBean extends AbstractBean implements RuspService {

    /**
     * Metodo que obtiene los datos del empleado-plaza relacionados con el módulo de RUSP
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public CustomEmpleadoPlazaRuspDTO getDatosEmpleadoPlazaRusp(Integer idPlaza, Integer ciclo) {
        return super.getService(RuspService.class).getDatosEmpleadoPlazaRusp(idPlaza, ciclo);
    }

    /**
     * Metodo que obtiene los datos de la plaza
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public TdPlazaDTO getPlaza(Integer idPlaza) {
        return super.getService(RuspService.class).getPlaza(idPlaza);
    }

    /**
     * Metodo que obtiene los datos del empleado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return tdEmpleadoDTO TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        return super.getService(RuspService.class).getEmpleado(rfcEmpleado);
    }

    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el padron de obligados.
     * @author Oscar S.
     * @param tdPlazaDTO TdPlazaDTO
     */
    public void savePadronObligados(TdPlazaDTO tdPlazaDTO) {
        super.getService(RuspService.class).savePadronObligados(tdPlazaDTO);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Metodo encargado de actualizar datos del empleado relacionados con el padron del tipo discapacidad.
     * @author Oscar S.
     * @param tdEmpleadoDTO TdEmpleadoDTO
     */
    public void saveTipoDiscapacidad(TdEmpleadoDTO tdEmpleadoDTO) {
        super.getService(RuspService.class).saveTipoDiscapacidad(tdEmpleadoDTO);
    }

    /******************************************************************************************************************************************************************************/

    /******************************************************************************************************************************************************************************/
     /**
      * RUSP - Metodo que genera archivos de bajas
      * @author Ricardo Leon
      * @param quincena
      * @return ListaString List<String>;
      */
     public List<String> getBajasRusp(String quincena) {
         return super.getService(RuspService.class).getBajasRusp(quincena);
     }
  
    /**
     * RUSP - Metodo que genera archivos de bajas del ciclo
     * @author Ricardo Leon
     * @param ciclo
     * @return ListaString List<String>;
     */
    public List<String> getBajasCicloRusp(String ciclo) {
        return super.getService(RuspService.class).getBajasCicloRusp(ciclo);
    }

     /**
      * RUSP - Metodo que genera archivos de bajas que no existen en la quincena anterior
      * @author Ricardo Leon
      * @param quincena
      * @return ListaString List<String>;
      */
     public List<String> getBajasRuspNqna(String quincena) {
         return super.getService(RuspService.class).getBajasRuspNqna(quincena);
     }

    /**
     * RUSP - Metodo que genera archivos de datos personales
     * @author Ricardo Leon
     * @param quincena
     * @return ListaString List<String>;
     */
    public List<String> getDatosPersonalesRusp(String quincena) {
        return super.getService(RuspService.class).getDatosPersonalesRusp(quincena);
    }

    /**
     * Proceso - Informacion basica Rusp en base a la quincena
     * @author Ricardo León E.
     * @param quincena
     * @return ListaString List<String>;
     */
     public List<String> getInfoBasicaRusp(String quincena){
        return super.getService(RuspService.class).getInfoBasicaRusp(quincena);
     }

    /**
     * Proceso - Informacion basica Rusp : Obtiene la informacion basica del RUSP en base a las nominas seleccionadas
     * @author Martin C.
     * @param ciclo Integer
     * @return List
     */
     public Integer getRegsRuspInfoBasica(Integer ciclo){
        return super.getService(RuspService.class).getRegsRuspInfoBasica(ciclo);
     }

    /**
     * Rusp - Proceso - Baja RUSP _  numRegistros : Obtiene el numero de registros que seran afectados.
     * @author Martin C.
     * @param ciclo Integer
     * @return Integer
     */
     public Integer getNumReg_pBajas(Integer ciclo){
        return super.getService(RuspService.class).getNumReg_pBajas(ciclo);
     }

    public void saveNivelesResp(TdPlazaDTO tdPlazaDTO) {
    }
    
    /**
     * Proceso Bajs: Actualiza los registros del rusp
     * @author  Martin C.
     * @param   ruspDTO RuspDTO
     */
    public void procesarBajasRusp(RuspDTO ruspDTO){
        super.getService(RuspService.class).procesarBajasRusp(ruspDTO);
    }
    
    /**
     * Proceso Informacion Basica: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarInformacionBasicaRusp(RuspDTO ruspDTO){
        super.getService(RuspService.class).procesarInformacionBasicaRusp(ruspDTO);
    }
    /**
     * Proceso Informacion Basica: Cuenta número de registros existententes
     * @author  Cesar B.
     * @param   ciclo Integer
     */
    public Integer getNumReg_pInfoBasic(Integer ciclo){
        return super.getService(RuspService.class).getNumReg_pInfoBasic(ciclo);
    }
    /**
     * Proceso Datos Personales: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarDatosPersonalesRusp(RuspDTO ruspDTO){
        super.getService(RuspService.class).procesarDatosPersonalesRusp(ruspDTO);
    }
    /**
     * Proceso Datos Personales: Cuenta número de registros existententes
     * @author  Cesar B.
     * @param   ciclo Integer
     */
    public Integer getNumReg_pDatosPer(Integer ciclo){
        return super.getService(RuspService.class).getNumReg_pDatosPer(ciclo);
    }

    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
/* public CambioEmpleadoPensionesDTO getEmpleadoPensiones(String rfcEmpleado) {
     return super.getService(RuspService.class).getEmpleadoPensiones(rfcEmpleado);
 }*/
 
 public DatosBasicos1DTO getCurpHijos(String curpHijo, String rfcEmpleado){
     return super.getService(RuspService.class).getCurpHijos(curpHijo, rfcEmpleado);
 }

 public void saveCurpHijos(DatosBasicos1DTO datosBasicos1DTO, String usuario) {
     super.getService(RuspService.class).saveCurpHijos(datosBasicos1DTO, usuario);
 }

 public void deleteCurpHijos(List<DatosBasicosDTO> listaDatosBasicos) {
     super.getService(RuspService.class).deleteCurpHijos(listaDatosBasicos);
 }   

    public void deleteLengua(List<DatosBasicosDTO> listaDatosBasicos) {
        super.getService(RuspService.class).deleteLengua(listaDatosBasicos);
    }   

    public void saveLengua(DatosBasicos1DTO datosBasicos1DTO, String usuario) {
        super.getService(RuspService.class).saveLengua(datosBasicos1DTO, usuario);
    }

}
