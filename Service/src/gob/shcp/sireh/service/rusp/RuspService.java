package gob.shcp.sireh.service.rusp;

import gob.shcp.fsn.service.BusinessService;

import gob.shcp.sireh.model.expediente.CurricPubDTO;
import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.rusp.CustomEmpleadoPlazaRuspDTO;

import gob.shcp.sireh.model.rusp.DatosBasicos1DTO;
import gob.shcp.sireh.model.rusp.DatosBasicosDTO;
import gob.shcp.sireh.model.rusp.RuspDTO;

import gob.shcp.sireh.model.rusp.TdRuspHijoDTO;

import java.util.List;

import javax.ejb.Local;

import org.antlr.runtime.misc.IntArray;


@Local
public interface RuspService extends BusinessService {

    /**
     * Metodo que obtiene los datos del empleado-plaza relacionados con el módulo de RUSP
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    CustomEmpleadoPlazaRuspDTO getDatosEmpleadoPlazaRusp(Integer idPlaza, Integer ciclo);

    /**
     * Metodo que obtiene los datos de la plaza
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    TdPlazaDTO getPlaza(Integer idPlaza);
    
    /**
     * Metodo que obtiene los datos del empleado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return tdEmpleadoDTO TdEmpleadoDTO
     */
    TdEmpleadoDTO getEmpleado(String rfcEmpleado);
    
    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el padron de obligados.
     * @author Oscar S.
     * @param tdPlazaDTO TdPlazaDTO
     */
    void savePadronObligados(TdPlazaDTO tdPlazaDTO);

    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Metodo encargado de actualizar datos del empleado relacionados con el padron del tipo discapacidad.
     * @author Oscar S.
     * @param tdEmpleadoDTO TdEmpleadoDTO
     */
    void saveTipoDiscapacidad(TdEmpleadoDTO tdEmpleadoDTO);

    /******************************************************************************************************************************************************************************/

     /**
      * Genera archivo de bajas de RUSP
      * @author Ricardo L.
      * @param quincena
      * @return listaString List<String>;
      */
     public List<String> getBajasRusp(String quincena);

     /**
      * Genera archivo de bajas del ciclo de RUSP
      * @author Ricardo L.
      * @param ciclo
      * @return listaString List<String>;
      */
     public List<String> getBajasCicloRusp(String ciclo);

     /**
      * Genera archivo de bajas que no existen en la quincena RUSP
      * @author Ricardo L.
      * @param quincena
      * @return listaString List<String>;
      */

     public List<String> getBajasRuspNqna(String quincena);

     /**
      * Genera archivo de datos personales de RUSP
      * @author Ricardo L.
      * @param quincena
      * @return listaString List<String>;
      */

     public List<String> getDatosPersonalesRusp(String quincena);
    
     /**
      * Genera archivo de información básica de RUSP
      * @author Ricardo L.
      * @param quincena
      * @return listaString List<String>;
      */

     public List<String> getInfoBasicaRusp(String quincena);


    /******************************************************************************************************************************************************************************/
     
    /**
     * Proceso - Informacion basica Rusp : Obtiene la informacion basica del RUSP en base a las nominas seleccionadas
     * @author Martin C.
     * @param ciclo Integer
     * @return List
     */
     public Integer getRegsRuspInfoBasica(Integer ciclo);
    
    /**
     * Rusp - Proceso - Baja RUSP _  numRegistros : Obtiene el numero de registros que seran afectados.
     * @author Martin C.
     * @param ciclo Integer
     * @return Integer
     */
     public Integer getNumReg_pBajas(Integer ciclo);

    public void saveNivelesResp(TdPlazaDTO tdPlazaDTO);
    
    /**
     * Proceso Bajs: Actualiza los registros del rusp
     * @author  Martin C.
     * @param   ruspDTO RuspDTO
     */
    public void procesarBajasRusp(RuspDTO ruspDTO);

    /**
     * Proceso Informacion Basica: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarInformacionBasicaRusp(RuspDTO ruspDTO);
    /**
     * Proceso Informacion Basica: Cuenta número de registros existententes
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public Integer getNumReg_pInfoBasic(Integer ciclo);
    /**
     * Proceso Datos Personales: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarDatosPersonalesRusp(RuspDTO ruspDTO);
    /**
     * Proceso Datos Personales: Cuenta número de registros existententes
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public Integer getNumReg_pDatosPer(Integer ciclo);
    
    //DatosBasicosDTO getEmpleadoPensiones(String curpHijo, String rfcEmpleado);  */
    
    DatosBasicos1DTO getCurpHijos(String curpHijo, String rfcEmpleado);
    
    public void saveCurpHijos(DatosBasicos1DTO datosBasicos1DTO, String usuario);
    
    public void deleteCurpHijos(List<DatosBasicosDTO> listaDatosBasicos);

    public void deleteLengua(List<DatosBasicosDTO> listaDatosBasicos);

    public void saveLengua(DatosBasicos1DTO datosBasicos1DTO, String usuario);

}

    