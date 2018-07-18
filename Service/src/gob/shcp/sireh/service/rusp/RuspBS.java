package gob.shcp.sireh.service.rusp;

import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.rusp.CustomTdRuspInfoBasicaDAO;
import gob.shcp.sireh.data.jdbc.rusp.CustomTdRuspInfoBasicaDAOImpl;
import gob.shcp.sireh.data.jdbc.rusp.QueryDatosEmpleadoPlazaRuspDAO;

import gob.shcp.sireh.data.jdbc.rusp.QueryTdRuspHijoDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.data.jdbc.rusp.QueryTdRuspInfoBasicaDAO;
import gob.shcp.sireh.data.jdbc.rusp.TdRuspHijoDAO;
import gob.shcp.sireh.data.jdbc.rusp.TdRuspLenguaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.domain.jdbc.rusp.CustomEmpleadoPlazaRusp;

import gob.shcp.sireh.domain.jdbc.rusp.Rusp;
import gob.shcp.sireh.domain.jdbc.rusp.TdRuspHijo;
import gob.shcp.sireh.domain.jdbc.rusp.TdRuspHijoPK;
import gob.shcp.sireh.domain.jdbc.rusp.TdRuspInfoBasica;
import gob.shcp.sireh.domain.jdbc.rusp.TdRuspLengua;
import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.model.plaza.TdPlazaDTO;
import gob.shcp.sireh.model.rusp.CustomEmpleadoPlazaRuspDTO;

import gob.shcp.sireh.model.rusp.DatosBasicos1DTO;
import gob.shcp.sireh.model.rusp.DatosBasicosDTO;
import gob.shcp.sireh.model.rusp.TdRuspBajaDTO;
import gob.shcp.sireh.model.rusp.RuspDTO;
import gob.shcp.sireh.model.rusp.TdRuspHijoDTO;
import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.antlr.runtime.misc.IntArray;

/**
 * Business Service encargado de atender solicitudes del Módulo de RUSP.
 */
public class RuspBS extends AbstractSirehService implements RuspService {

    /**
     * Metodo que obtiene los datos del empleado-plaza relacionados con el módulo de RUSP
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public CustomEmpleadoPlazaRuspDTO getDatosEmpleadoPlazaRusp(Integer idPlaza, Integer ciclo) {
        // Obtener datos del empleado-plaza
        List<CustomEmpleadoPlazaRusp> listaDatosEmpleadoPlazaRusp = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getDatosEmpleadoPlazaRusp(idPlaza, ciclo);
        CustomEmpleadoPlazaRuspDTO customEmpleadoPlazaRuspDTO = null;

        if (listaDatosEmpleadoPlazaRusp != null && !listaDatosEmpleadoPlazaRusp.isEmpty()) {
            CustomEmpleadoPlazaRusp customEmpleadoPlazaRusp = listaDatosEmpleadoPlazaRusp.get(0);
            customEmpleadoPlazaRuspDTO = super.transformation().map(customEmpleadoPlazaRusp, CustomEmpleadoPlazaRuspDTO.class);
        }
        return customEmpleadoPlazaRuspDTO;
    }

    /**
     * Metodo que obtiene los datos del empleado
     * @author Oscar S.
     * @param rfcEmpleado String
     * @return tdEmpleadoDTO TdEmpleadoDTO
     */
    public TdEmpleadoDTO getEmpleado(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        return super.transformation().map(empleado, TdEmpleadoDTO.class);
    }

    /**
     * Metodo que obtiene los datos de la plaza
     * @author Oscar S.
     * @param idPlaza Integer
     * @return tdPlazaDTO TdPlazaDTO
     */
    public TdPlazaDTO getPlaza(Integer idPlaza) {
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(idPlaza);
        return super.transformation().map(plaza, TdPlazaDTO.class);
    }

    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el padron de obligados.
     * @author Oscar S.
     * @param tdPlazaDTO TdPlazaDTO
     */
    public void savePadronObligados(TdPlazaDTO tdPlazaDTO) {
        // Paso 1) Datos del Empleado
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(tdPlazaDTO.getPlazaRfc());

        // Paso 2) Transformar objeto
        TdPlaza tdPlaza = super.transformation().map(tdPlazaDTO, TdPlaza.class);

        // Paso 3) Obtener Movimiento de Personal - 539
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_MODIFICA_PADRON_OBLIGADOS");
        tdPlaza.setIdMovtoPersona(idMovtoPersona);

        // Paso 4) Obtener quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        tdPlaza.setPlazaQnaCaptura(mepQnaCaptura);

        // Paso 5) Actualizar plaza
        super.persistence().get(TdPlazaDAO.class).save(tdPlaza);

        // Paso 6) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, tdPlaza, idMovtoPersona, mepQnaCaptura, tdPlazaDTO.getUsuario(), new Date(), super.getAtributoPuesto(tdPlazaDTO.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Metodo encargado de actualizar datos del empleado relacionados con el padron del tipo discapacidad.
     * @author Oscar S.
     * @param tdEmpleadoDTO TdEmpleadoDTO
     */
    public void saveTipoDiscapacidad(TdEmpleadoDTO tdEmpleadoDTO) {
        // Paso 1) Datos del Empleado
        TdEmpleado tdEmpleado = super.transformation().map(tdEmpleadoDTO, TdEmpleado.class);

        // Paso 2) Transformar objeto
        TdPlaza tdPlaza = super.persistence().get(TdPlazaDAO.class).getById(tdEmpleadoDTO.getIdPlazaVigente());

        // Paso 3) Obtener Movimiento de Personal - 540
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_MODIFICA_PADRON_TIPO_DISCAPACIDAD");
        tdPlaza.setIdMovtoPersona(idMovtoPersona);

        // Paso 4) Obtener quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        tdPlaza.setPlazaQnaCaptura(mepQnaCaptura);

        // Paso 5) Actualizar empleado
        super.persistence().get(TdEmpleadoDAO.class).save(tdEmpleado);

        // Paso 6) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(tdEmpleado, tdPlaza, idMovtoPersona, mepQnaCaptura, tdEmpleadoDTO.getUsuario(), new Date(), super.getAtributoPuesto(tdPlaza.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }

    /******************************************************************************************************************************************************************************/

    /**
     * RUSP - Metodo encargado de actualizar datos de la plaza relacionados con el nivel de responsabilidad.
     * @author Oscar S.
     * @param tdPlazaDTO TdPlazaDTO
     */
    public void saveNivelesResp(TdPlazaDTO tdPlazaDTO) {
        // Paso 1) Datos del Empleado
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(tdPlazaDTO.getPlazaRfc());

        // Paso 2) Transformar objeto
        TdPlaza tdPlaza = super.transformation().map(tdPlazaDTO, TdPlaza.class);

        // Paso 3) Obtener Movimiento de Personal - 541
        Integer idMovtoPersona = super.getMovimientoPersonal("PLAZAS_MODIFICA_PADRON_NIVELES_RESPONSABILIDAD");
        tdPlaza.setIdMovtoPersona(idMovtoPersona);

        // Paso 4) Obtener quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        tdPlaza.setPlazaQnaCaptura(mepQnaCaptura);

        // Paso 5) Actualizar plaza
        super.persistence().get(TdPlazaDAO.class).save(tdPlaza);

        // Paso 6) Insert TN_MVTOS_EMP_PLA
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, tdPlaza, idMovtoPersona, mepQnaCaptura, tdPlazaDTO.getUsuario(), new Date(), super.getAtributoPuesto(tdPlazaDTO.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }


    /**
     * Metodo que genera archivo bajas RUSP
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getBajasRusp(String quincena) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getBajasRusp(quincena);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /**
     * Metodo que genera archivo bajas ciclo RUSP
     * @author Ricardo León E.
     * @param ciclo
     * @return listaString List<String>;
     */
    public List<String> getBajasCicloRusp(String ciclo) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getBajasCicloRusp(ciclo);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /**
     * Metodo que genera archivo bajas RUSP que no existen en la quincena anterior
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getBajasRuspNqna(String quincena) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getBajasRuspNqna(quincena);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }


    /**
     * Metodo que genera archivo datos personales RUSP
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getDatosPersonalesRusp(String quincena) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getDatosPersonalesRusp(quincena);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /**
     * Metodo que genera archivo de la infomación básica de RUSP
     * @author Ricardo León E.
     * @param quincena
     * @return listaString List<String>;
     */
    public List<String> getInfoBasicaRusp(String quincena) {
        List<String> listaString = new ArrayList<String>();
        List<CustomOutputFile> items = new ArrayList<CustomOutputFile>();
        List<CustomOutputFile> itemsHeader = new ArrayList<CustomOutputFile>();
        
        items = super.persistence().get(QueryDatosEmpleadoPlazaRuspDAO.class).getInfoBasicaRusp(quincena);
        
        if (items != null) {
            for (CustomOutputFile row: items) {
               listaString.add(row.getRegistro());
            }
        }
        return listaString;
    }

    /******************************************************************************************************************************************************************************/
     
    /**
     * Proceso - Informacion basica Rusp : Obtiene la informacion basica del RUSP en base a las nominas seleccionadas
     * @author Martin C.
     * @param ciclo Integer
     * @return List
     */
     public Integer getRegsRuspInfoBasica(Integer ciclo){
         return super.persistence().get(QueryTdRuspInfoBasicaDAO.class).numRegPInfoBasic(ciclo).get(0).getNumRegistros();
     }
     
     
    /**
     * Rusp - Proceso - Baja RUSP _  numRegistros : Obtiene el numero de registros que seran afectados.
     * @author Martin C.
     * @param ciclo Integer
     * @return Integer
     */
     public Integer getNumReg_pBajas(Integer ciclo){
        return super.persistence().get(QueryTdRuspInfoBasicaDAO.class).numRegPBajas(ciclo).get(0).getNumRegistros();
     }
    
    /**
     * Proceso Bajs: Actualiza los registros del rusp
     * @author  Martin C.
     * @param   ruspDTO RuspDTO
     */
    public void procesarBajasRusp(RuspDTO ruspDTO){
        Rusp rusp = super.transformation().map(ruspDTO, Rusp.class);
        String usuario = super.security().getUserName();
        rusp.setUsuario(usuario);
        super.persistence().get(CustomTdRuspInfoBasicaDAO.class).procesarBajasRusp(rusp);
    }
    
    /**
     * Proceso Informacion Basica: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarInformacionBasicaRusp(RuspDTO ruspDTO){
        Rusp rusp = super.transformation().map(ruspDTO, Rusp.class);
        String usuario = super.security().getUserName();
        rusp.setUsuario(usuario);
        
        rusp.setICiclo(new Integer(rusp.getCiclo()));
        
        super.persistence().get(CustomTdRuspInfoBasicaDAO.class).procesarInformacionBasicaRusp(rusp);        
        
    }
    /**
     * Proceso Informacion Basica: Cuenta registros de la tabla de información Básica
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public Integer getNumReg_pInfoBasic(Integer ciclo){
        return super.persistence().get(QueryTdRuspInfoBasicaDAO.class).numRegPInfoBasic(ciclo).get(0).getNumRegistros();
    }
    /**
     * Proceso Datos Personales: Actualiza los registros del rusp
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public void procesarDatosPersonalesRusp(RuspDTO ruspDTO){
        Rusp rusp = super.transformation().map(ruspDTO, Rusp.class);
        String usuario = super.security().getUserName();
        rusp.setUsuario(usuario);
        rusp.setIQuincena(new Integer(rusp.getQuincena()));
        rusp.setICiclo(new Integer(rusp.getCiclo()));
        super.persistence().get(CustomTdRuspInfoBasicaDAO.class).procesarDatosPersonalesRusp(rusp);
    }
    /**
     * Proceso Datos personales: Cuenta registros de la tabla de información Básica
     * @author  Cesar B.
     * @param   ruspDTO RuspDTO
     */
    public Integer getNumReg_pDatosPer(Integer ciclo){
        return super.persistence().get(QueryTdRuspInfoBasicaDAO.class).numRegPDatosPer(ciclo).get(0).getNumRegistros();
    }

    /**
     * Metodo encargado de consultar los datos de CURPS por su idHijos y rfc
     * @param idHijos String
     * @param rfcEmpleado String
     * @return CustomTdRuspHijosDTO
     */
    public DatosBasicos1DTO getCurpHijos(String curpHijo, String rfcEmpleado) {

          TdRuspHijo hijo = super.persistence().get(TdRuspHijoDAO.class).getById(new TdRuspHijoPK(curpHijo, rfcEmpleado));
          DatosBasicos1DTO datosBasicos1DTO = super.transformation().map(hijo, DatosBasicos1DTO.class);
          datosBasicos1DTO.setNombreEmpleado(hijo.getTrhNombre());
          datosBasicos1DTO.setPrimerApellido(hijo.getTrhPrimer());
          datosBasicos1DTO.setSegundoApellido(hijo.getTrhSegundo());
          datosBasicos1DTO.setCurpEmpleado(hijo.getTrhCurp());
          return datosBasicos1DTO; 
//return null;
    }

    /**
     * Metodo encargado de actualizar o agregar una CURP
     * @param hijosDTO TdRuspHijoDTO
     */
    public void saveCurpHijos(DatosBasicos1DTO datosBasicos1DTO, String usuario) {
        
        TdRuspHijo hijo = new TdRuspHijo();
        hijo.setTrhRfc(datosBasicos1DTO.getRfcEmpleado());
        hijo.setTrhRfcUnico(datosBasicos1DTO.getRfcUnico());
        hijo.setTrhNombre(datosBasicos1DTO.getNombreEmpleado());
        hijo.setTrhPrimer(datosBasicos1DTO.getPrimerApellido());
        hijo.setTrhSegundo(datosBasicos1DTO.getSegundoApellido());
        hijo.setTrhCurp(datosBasicos1DTO.getCurpEmpleado());
        hijo.setFecModifico(new Date());
        hijo.setUsuario(usuario);
        
        super.persistence().get(TdRuspHijoDAO.class).save(hijo);
    }

    /**
     * Metodo encargado de eliminar las pensiones CURPS seleccionadas
     * @param ids Integer[]
     */
    public void deleteCurpHijos(List<DatosBasicosDTO> listaDatosBasicos) {
    
        for (DatosBasicosDTO item : listaDatosBasicos) {
        
            String rfcEmpleado = item.getRfcEmpleado();
            String curpHijo = item.getCurpEmpleado();
            
            TdRuspHijo tdRuspHijo = new TdRuspHijo();
            tdRuspHijo.setTrhRfc(rfcEmpleado);
            tdRuspHijo.setTrhCurp(curpHijo);
            super.persistence().get(TdRuspHijoDAO.class).delete(tdRuspHijo);
        
        }
    }

    /**
     * Metodo encargado de eliminar las lenguas seleccionadas
     * @param ids Integer[]
     */
    public void deleteLengua(List<DatosBasicosDTO> listaDatosBasicos) {
    
        for (DatosBasicosDTO item : listaDatosBasicos) {
        
            String rfcEmpleado = item.getRfcEmpleado();
            Integer lengua = item.getLengua();
            
            TdRuspLengua tdRuspLengua = new TdRuspLengua();
            tdRuspLengua.setTrlRfc(rfcEmpleado);
            tdRuspLengua.setTrlLengua(lengua);
            super.persistence().get(TdRuspLenguaDAO.class).delete(tdRuspLengua);
        
        }
    }

    /**
     * Metodo encargado de actualizar o agregar una CURP
     * @param lenguaDTO TdRuspLenguaDTO
     */
    public void saveLengua(DatosBasicos1DTO datosBasicos1DTO, String usuario) {
        
        TdRuspLengua lengua = new TdRuspLengua();
        lengua.setTrlRfc(datosBasicos1DTO.getRfcEmpleado());
        lengua.setTrlRfcUnico(datosBasicos1DTO.getRfcUnico());
        lengua.setTrlLengua(datosBasicos1DTO.getLengua());
        lengua.setTrlTipo(datosBasicos1DTO.getTipo().equalsIgnoreCase("0") ? "M" : "A");
        lengua.setFecModifico(new Date());
        lengua.setUsuario(usuario);
        
        super.persistence().get(TdRuspLenguaDAO.class).save(lengua);
    }

}

