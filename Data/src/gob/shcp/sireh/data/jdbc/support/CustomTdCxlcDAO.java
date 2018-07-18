package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.service.data.DataService;

import gob.shcp.sireh.domain.jdbc.TcTipoNomina;
import gob.shcp.sireh.domain.jdbc.TdCxlc;
import gob.shcp.sireh.domain.jdbc.TdSecCxlc;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

public interface CustomTdCxlcDAO extends DataService {
    
    /**
     * Procesa Ordinaria - Metodo encargado de ejecutar el stored procedure para Procesar CLC Ordinarias.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @param usuario String
     * @return Integer
     */
    Integer executeSPClcOrdinaria(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento, String usuario);
    
    /**
     * Procesa - Metodo encargado de verificar si existen errores en las clc.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @return existeError Integer
     */
    Integer executeSPExisteError(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento);
    
    /**
     * Procesa Terceros - Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago List<Integer>
     * @param idTipoNomina String
     * @param secGuiaContableEjer List<Integer>
     * @return listaCxlc List<TdCxlc>
     */
    List<TdCxlc> consultaTdCxlcProcesoTerceros(Integer cxlcCiclo, List<Integer> cxlcQnaPago, String idTipoNomina, List<Integer> secGuiaContableEjer);
    
    /**
     * Procesa Terceros - Metodo encargado de obtener el monto total de las cxlc seleccionadas con base en el objeto clcTercerosDTO.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcTerceros List<BigDecimal>
     * @param tipoNominaTerceros String
     */
    List<BigDecimal> calculaMontoTotalTerceros(Integer ciclo, List<Integer> cxlcTerceros, String tipoNominaTerceros);
    
    /**
    * Procesa Terceros - Metodo encargado de obtener la(s) guia(s) contable(s) con base en le idTipoNomina.
    * @author Oscar S.
    * @param idTipoNomina String
    * @return listaGuiaContable List<String>
    */
    List<String> guiaContableByTipoNominaTerceros(String idTipoNomina);
    
    /**
    * Procesa Terceros - Metodo encargado de verificar si existe un clc procesada.
    * @author Oscar S.
    * @param cxlcCiclo Integer
    * @param cxlcQnaPago Integer
    * @param idTipoNomina String
    * @param cxlcComplemento Integer
    * @return listaCxlc List<TdCxlc>
    */
    List<TdCxlc> existeCLCProcesadaTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String idTipoNomina, Integer cxlcComplemento);
    
    /**
     * Procesa Terceros - Metodo encargado de obtener el numero de clc terceros con base en las clc seleccionadas.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param tipoNominaTerceros String
     * @param cxlcTerceros List<Integer>
     * @return clcTerceros Integer
     */
    List<Integer> getClcTerceros(Integer cxlcCiclo, Integer cxlcQnaPago, String tipoNominaTerceros, List<Integer> cxlcTerceros);
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para Procesar CLC Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlcCadena String
     * @param qnaPago Integer
     * @param tipoNominaTeceros String
     * @param complemento String
     * @param reproceso String
     * @param usuario String
     * @return Integer
     */
    Integer executeSPClcTerceros(Integer ciclo, String cxlcCadena, Integer qnaPago, String tipoNominaTeceros, Integer complemento, String reproceso, String usuario);
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para procesar la cancelación de CLC de Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param cxlc Integer
     * @param usuario String
     * @return Integer
     */
    Integer executeSPClcTercerosCancelados(Integer ciclo, Integer cxlc, String usuario);
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Interfaz SICOP Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso List<Integer>
     * @return cxlcComprometidas List<TdCxlc>
     */
    List<TdCxlc> getCxlcComprometidasList(Integer cxlcCiclo, List<Integer> cxlcCompromiso);
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las cxlc involucradas con base en el ciclo y numero de sec_compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param secCompromiso Set<String> 
     * @return cxlcInvolucradas List<TdCxlc>
     */
    List<TdCxlc> getCxlcInvolucradasSolicitudPagoList(Integer cxlcCiclo, Set<String> secCompromiso);
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de verificar si el numero de compromiso ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secCompromiso String
     * @return tdSecCxlc List<TdSecCxlc>
     */
    List<TdSecCxlc> existeCompromiso(Integer secCxlcCiclo, String secCompromiso);
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de verificar si el numero de devengado ya hasido registrado.
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param secDevengado Long
     * @return tdSecCxlc List<TdSecCxlc>
     */
    List<TdSecCxlc> existeDevengado(Integer secCxlcCiclo, Long secDevengado);
    
    /**
     * Interfaz SICOP - Solicitud de compromiso - Metodo encargado de actualizar las cxlc involucradas con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcInvolucradas List<Integer>
     * @param usuario String
     */
    void updateCxlcCompromiso(Integer cxlcCiclo, String cxlcCompromiso, List<Integer> cxlcInvolucradas, String usuario, Integer secQnaApli);
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las cxlc comprometidas con base en el ciclo y numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado List<Integer>
     * @return cxlcComprometidas List<TdCxlc>
     */
    List<TdCxlc> getCxlcSolicitudPagoList(Integer cxlcCiclo, List<Integer> cxlcDevengado);
    
    /**
     * Interfaz SICOP - Solicitud de pago - Metodo encargado de actualizar las cxlc involucradas con base en un nuevo devengado.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcDevengado Long
     * @param usuario String
     * @param cxlcInvolucradas List<Integer>
     */ 
    void updateCxlcSolicitudPago(Integer cxlcCiclo, Long cxlcDevengado, List<Integer> cxlcInvolucradas, String usuario);
    
    /**
     * Interfaz SICOP - Metodo encargado de actualizar cxlc.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcSIAFF Integer
     * @param cxlc Integer
     * @param usuario String
     */
    void updateRegistraCLC(Integer cxlcCiclo, Integer cxlcSIAFF, Integer cxlc, String usuario);
    
    /**
     * Interfaz SICOP - Metodo encargado de actualizar las cxlc a comprometer con base en un nuevo numero de compromiso.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcCompromiso String
     * @param cxlcComprometer List<Integer>
     * @param usuario String
     */
    void updateCxlcComprometer(Integer cxlcCiclo, Long cxlcCompromiso, Set<Integer> cxlcComprometer, String usuario);
    
    /**
     * Interfaz SICOP - Metodo encargado de obtener las nominas validas para el Usuario comodin.
     * @author Oscar S.
     * @return nominasValidasBenefComodin List<TcTipoNomina>
     */
    List<TcTipoNomina> getNominasValidasBenefComodin();
    
    /**
     * Herramientas - Concilia CLC - Metodo encargado de actualizar el listado de cxlc a conciliar.
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcConciliacionSicop Integer
     * @return cxlcConciliar List<Integer>
     * @param usuario String
     */
    void updateCxlcConciliar(Integer cxlcCiclo, Integer cxlcConciliacionSicop, List<Integer> cxlcConciliar, String usuario);
    
    /**
     * Herramientas - Borra CLC - Metodo encargado de ejecutar el stored procedure para borrar CLC.
     * @author Oscar S.
     * @param cicloUnidad Integer
     * @param quincenaPago Integer
     * @param tipoNomina String
     * @param complemento String
     * @param situacion String
     * @return Integer
     */
    Integer executeSPBorraCLC(Integer cicloUnidad, Integer quincenaPago, String tipoNomina, String complemento, String situacion);
    
    /**
     * Consultas Registro Cxlc - Metodo encargado de obtener cxlc
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @param cxlcQnaPago Integer
     * @param idTipoNomina String
     * @param cxlcComplemento Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdCxlc>
     */
    List<TdCxlc> consultasRegistraTdCxlc(String cxlcCiclo, String cxlcQnaPago, String idTipoNomina, String cxlcComplemento, String cxlc);
    
    /**
     * Consultas Registro Cxlc - Metodo encargado de obtener sec_cxlc
     * @author Oscar S.
     * @param secCxlcCiclo Integer
     * @param cxlc Integer
     * @return listaCxlc List<TdSecCxlc>
     */
    List<TdSecCxlc> consultasRegistraTdSecCxlc(Integer secCxlcCiclo, Integer cxlc);
    
    /**
     * Procesa Terceros - Metodo encargado de ejecutar el stored procedure para Ajustar CLC Terceros.
     * @author Oscar S.
     * @param ciclo Integer
     * @param signo String
     * @param importeAjuste double
     * @param clcAjuste Integer
     * @param clcCompensada Integer
     * @param usuario String
     * @return Integer
     */
    Integer executeSPClcTercerosAjustes(Integer ciclo, String signo, double importeAjuste, Integer clcAjuste, Integer clcCompensada, String usuario);
    
    /**
     * Procesa Manuales - Metodo encargado de obtener el numero de maxicmo de clc en el rnago de las 5000
     * @author Oscar S.
     * @param cxlcCiclo Integer
     * @return Integer
     */
    List<TdCxlc> getMaxCxlcManuales(Integer cxlcCiclo);

    List<String> getListaUnidades(Integer ciclo);

    List<String> getListaEstados(String unidad, Integer ciclo);
    
    /**
     * Procesa Patronales - Metodo encargado de ejecutar el stored procedure para Procesar CLC Patronales.
     * @author Oscar S.
     * @param ciclo Integer
     * @param nominasCadena String
     * @param qnaPago Integer
     * @param tipoNominaPatronales String
     * @param complemento Integer
     * @param estado Integer
     * @param reproceso String
     * @param usuario String
     * @return Integer
     */
    Integer executeSPClcPatronales(Integer ciclo, String nominasCadena, Integer qnaPago, String tipoNominaPatronales, Integer complemento, Integer estado, String reproceso, String usuario);
    
    /**
     * Procesa Patronales - Metodo encargado de obtener la clc a reprocesar.
     * @author Oscar S.
     * @param ciclo Integer
     * @param qnaPago Integer
     * @param tipoNomina String
     * @param complemento Integer
     * @return List<TdCxlc>
     */
    List<TdCxlc> getClcPatronalReproceso(Integer ciclo, Integer qnaPago, String tipoNomina, Integer complemento);
}
