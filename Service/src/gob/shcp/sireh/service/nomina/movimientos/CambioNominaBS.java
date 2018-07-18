package gob.shcp.sireh.service.nomina.movimientos;


import gob.shcp.sireh.data.jdbc.QueryTnMovtoConceptoPagoDAO;

import gob.shcp.sireh.data.jdbc.TcBancoDAO;
import gob.shcp.sireh.data.jdbc.TdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.TdPensionDAO;
import gob.shcp.sireh.data.jdbc.TdPlazaDAO;
import gob.shcp.sireh.data.jdbc.TnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnMovtosEmpPlaDAO;
import gob.shcp.sireh.data.jdbc.TnRegControlDAO;


import gob.shcp.sireh.domain.jdbc.TcBanco;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.TdPension;
import gob.shcp.sireh.domain.jdbc.TdPlaza;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtosEmpPla;
import gob.shcp.sireh.domain.jdbc.TnRegControl;

import gob.shcp.sireh.model.nomina.CambioBancariosDTO;
import gob.shcp.sireh.model.nomina.CambioComplementariosDTO;
import gob.shcp.sireh.model.nomina.CambioDomicilioDTO;
import gob.shcp.sireh.model.nomina.CambioNombreCurpDTO;
import gob.shcp.sireh.model.nomina.CambioRfcDTO;

import gob.shcp.sireh.service.AbstractSirehService;
import gob.shcp.sireh.service.SirehUtils;

import java.util.Date;
import java.util.List;

/**
 * Business Service encargado de atender solicitudes correspondientes a Cambios de datos.
 */
public class CambioNominaBS extends AbstractSirehService implements CambioNominaService {
    
    /**
     * Metodo encargado de actualizar rfc del Empleado con base en el objeto cambioRfcDTO.
     * @param cambioRfcDTO CambioRfcDTO
     * @param usuario String
     */
    public void updateEmpleadoPlazaRfc(CambioRfcDTO cambioRfcDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioRfcDTO.getRfcEmpleado());
        TdEmpleado empleadoNuevo = new TdEmpleado();
        SirehUtils.copyProperties(empleadoNuevo, empleado);
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(empleado.getIdPlazaVigente());
        
        // Paso 3) Insert registro TD_EMPLEADO
        empleadoNuevo.setRfcEmpleado(cambioRfcDTO.getRfcNuevo());
        empleadoNuevo.setRfcUnico(cambioRfcDTO.getRfcNuevo());
        empleadoNuevo.setUsuario(usuario);
        empleadoNuevo.setFecModifico(new Date());
        super.persistence().get(TdEmpleadoDAO.class).save(empleadoNuevo);
         
        // Paso 4) Update Empleados con RFC_NUEVO
        List<TdEmpleado> listaEmpleados = super.persistence().get(TdEmpleadoDAO.class).findByRfcUnico(cambioRfcDTO.getRfcEmpleado());
        for (TdEmpleado empleadoUnico: listaEmpleados) {
            empleadoUnico.setRfcUnico(cambioRfcDTO.getRfcNuevo());
            empleadoUnico.setIdUltimoMovto(super.getMovimientoPersonal("CAMBIO_DE_RFC"));
            empleadoUnico.setUsuario(usuario);
            empleadoUnico.setFecModifico(new Date());
            super.persistence().get(TdEmpleadoDAO.class).save(empleadoUnico);
        }
        
        TnRegControl regControl = super.persistence().get(TnRegControlDAO.class).getByRcVigente("S");
        Integer quincenaCaptura = regControl != null ? regControl.getRcQnaCaptura() : null;

        // Paso 5) Update TD_PLAZA con RFC_NUEVO
        plaza.setPlazaRfc(cambioRfcDTO.getRfcNuevo());
        plaza.setUsuario(usuario);
        plaza.setFecModifico(new Date());
        super.persistence().get(TdPlazaDAO.class).save(plaza);
        
        // Paso 6) Insert TN_MVTOS_EMP_PLA con RFC_NUEVO - 484
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_RFC"), quincenaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre()));
        
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
         
        // Paso 7) Update TD_PENSION con RFC_NUEVO 
        List<TdPension> listaPensiones = super.persistence().get(TdPensionDAO.class).findByRfcPension(empleado.getRfcEmpleado());
        if (listaPensiones != null && !listaPensiones.isEmpty())
            for (TdPension pension : listaPensiones) {
                pension.setRfcPension(cambioRfcDTO.getRfcNuevo());
                pension.setUsuario(usuario);
                pension.setFecModifico(new Date());
                super.persistence().get(TdPensionDAO.class).save(pension);
        }
        
        // Paso 8) Update TN_MVTO_CONCEPTO_PAGO con RFC_NUEVO
        List<TnMovtoConceptoPago> mvtosCPVigentes = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findMovtosConceptoPagoByRfc(cambioRfcDTO.getRfcEmpleado());
        for (TnMovtoConceptoPago movtoConceptoPago : mvtosCPVigentes) {
            movtoConceptoPago.setMcpRfc(cambioRfcDTO.getRfcNuevo());
            movtoConceptoPago.setIdSitCaptura("M");
            movtoConceptoPago.setUsuario(usuario);
            movtoConceptoPago.setFecModifico(new Date());
            
            TnMovtoConceptoPago movtoConceptoPagoNuevo = new TnMovtoConceptoPago();
            SirehUtils.copyProperties(movtoConceptoPagoNuevo, movtoConceptoPago);
            movtoConceptoPagoNuevo.setIdMovtoConceptoPago(null);
            movtoConceptoPagoNuevo.setIdSitCaptura("V");
            movtoConceptoPagoNuevo.setMcpRfc(cambioRfcDTO.getRfcNuevo());
            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPagoNuevo);
            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPago);
        }
    }

    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioRfcDTO getEmpleadoPlaza(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        if ( empleado == null ) {
            return null;
        }
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getByPlazaRfc(rfcEmpleado);
        
        final CambioRfcDTO empleadoDTO = super.transformation().map(empleado, CambioRfcDTO.class);
        empleadoDTO.setIdPlaza( plaza != null ?  plaza.getIdPlaza() : null );
        empleadoDTO.setIdPuestoNom( plaza != null ? plaza.getIdPuestoNom() : null );
        return empleadoDTO;
    }

    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     * @return empleadoDTO CambioNombreCurpDTO
     * @author Oscar S.
     */
    public CambioNombreCurpDTO getEmpleadoCambioNombreCurp(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        final CambioNombreCurpDTO empleadoDTO = super.transformation().map(empleado, CambioNombreCurpDTO.class);
        return empleadoDTO;
    }
    
    /**
     * Metodo encargado de actualizar el CURP del Empleado con base en el objeto cambioNombreCurpDTO.
     * @param cambioNombreCurpDTO CambioNombreCurpDTO
     * @param usuario String
     * @author Oscar S.
     */
    public void updateEmpleadoNombreCurp(CambioNombreCurpDTO cambioNombreCurpDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioNombreCurpDTO.getRfcEmpleado());
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getByPlazaRfc(cambioNombreCurpDTO.getRfcEmpleado());
        
        // Paso 3) Preparar objeto Empleado
        TdEmpleado empleadoNuevo = new TdEmpleado();
        SirehUtils.copyProperties(empleadoNuevo, empleado);
        empleadoNuevo.setUsuario(usuario);
        empleadoNuevo.setFecModifico(new Date());
        
        // Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Actualizacion CURP - 480
        if (!empleado.isCurpEmpleadoEquivalente(cambioNombreCurpDTO.getCurpEmpleado())) {
            empleadoNuevo.setCurpEmpleado(cambioNombreCurpDTO.getCurpEmpleado());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("MODIFICACION_DE_LA_CURP"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Apellido Paterno - 481
        if (!empleado.isPrimerApellidoEquivalente(cambioNombreCurpDTO.getPrimerApellido())) {
            empleadoNuevo.setPrimerApellido(cambioNombreCurpDTO.getPrimerApellido());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_APELLIDO_PATERNO"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Apellido Materno - 482
        if (!empleado.isSegundoApellidoEquivalente(cambioNombreCurpDTO.getSegundoApellido())) {
            empleadoNuevo.setSegundoApellido(cambioNombreCurpDTO.getSegundoApellido());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_APELLIDO_MATERNO"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Nombre Empleado - 479
        if (!empleado.isNombreEmpleadoEquivalente(cambioNombreCurpDTO.getNombreEmpleado())) {
            empleadoNuevo.setNombreEmpleado(cambioNombreCurpDTO.getNombreEmpleado());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("MODIFICACION_DE_NOMBRE_DE_PILA"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Estado Nacimiento - 488
        if ( (empleado.getIdEdoNac() != null && cambioNombreCurpDTO.getIdEdoNac() == null) || (empleado.getIdEdoNac() == null && cambioNombreCurpDTO.getIdEdoNac() != null) || empleado.getIdEdoNac().intValue() != cambioNombreCurpDTO.getIdEdoNac().intValue()) {
            empleadoNuevo.setIdEdoNac(cambioNombreCurpDTO.getIdEdoNac());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_ESTADO_DE_NACIMIENTO"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Sexo - 489
        if (!empleado.isIdGeneroEquivalente(cambioNombreCurpDTO.getIdGenero())) {
            empleadoNuevo.setIdGenero(cambioNombreCurpDTO.getIdGenero());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("ACTUALIZACION_DEL_SEXO"), mepQnaCaptura, usuario);
        }
        
        // Actualizacion Fecha Nacimiento - 490
        if (cambioNombreCurpDTO.getFecNacimiento() != null && empleado.getFecNacimiento() == null) {
            empleadoNuevo.setFecNacimiento(cambioNombreCurpDTO.getFecNacimiento());
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_FECHA_DE_NACIMIENTO"), mepQnaCaptura, usuario);
        }
        if (cambioNombreCurpDTO.getFecNacimiento() != null && empleado.getFecNacimiento() != null) {
            Date fecha1 = (Date) cambioNombreCurpDTO.getFecNacimiento();
            Date fecha2 = (Date) empleado.getFecNacimiento();
            
            if (fecha2.before(fecha1) || fecha1.before(fecha2)) {
                empleadoNuevo.setFecNacimiento(cambioNombreCurpDTO.getFecNacimiento());
                updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_FECHA_DE_NACIMIENTO"), mepQnaCaptura, usuario);
            }
        }
    }
    
    /**
     * Metodo encargado de guardar los datos actualizados del Empleado e insertar el movimiento en la tabla TN_MVTOS_EMP_PLA.
     * @param empleadoNuevo TdEmpleado
     * @param empleado TdEmpleado
     * @param plaza TdPlaza
     * @param idMovtoPersona Integer
     * @param mepQnaCaptura Integer
     * @param usuario String
     * @author Oscar S.
     */
    private void updateEmpleadoMovtos(TdEmpleado empleadoNuevo, TdEmpleado empleado, TdPlaza plaza, Integer idMovtoPersona, Integer mepQnaCaptura, String usuario) {
        // Paso 4) Update Empleado
        super.persistence().get(TdEmpleadoDAO.class).save(empleadoNuevo);
        
        // Paso 5) Insert TN_MVTOS_EMP_PLA        
        TnMovtosEmpPla tnMovtosEmpPla = SirehUtils.transformToTnMovtosEmpPla(empleado, plaza, idMovtoPersona, mepQnaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre()));
        super.persistence().get(TnMovtosEmpPlaDAO.class).save(tnMovtosEmpPla);
    }
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioBancariosDTO getEmpleadoCambioBancarios(String rfcEmpleado) {
        String descBancos = null;
        String idBanco = null;
        TdEmpleado empleado = 
            super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        if (empleado.getClabeEmpleado() != null && empleado.getClabeEmpleado().length() > 2) {
            idBanco = empleado.getClabeEmpleado().substring(0, 3);
            TcBanco tcBanco = super.persistence().get(TcBancoDAO.class).getById(idBanco);
            if (tcBanco != null) {
                descBancos = tcBanco.getDescBancos();
            }
        }
        
        final CambioBancariosDTO cambioBancariosDTO = super.transformation().map(empleado, CambioBancariosDTO.class);
        cambioBancariosDTO.setClabeEmpleado1(cambioBancariosDTO.getClabeEmpleado() != null && cambioBancariosDTO.getClabeEmpleado().length() == 18 ? cambioBancariosDTO.getClabeEmpleado().substring(0, 3) : "");
        cambioBancariosDTO.setClabeEmpleado2(cambioBancariosDTO.getClabeEmpleado() != null && cambioBancariosDTO.getClabeEmpleado().length() == 18 ? cambioBancariosDTO.getClabeEmpleado().substring(3) : "");
        cambioBancariosDTO.setDescBancos(descBancos);
        cambioBancariosDTO.setIdBanco(idBanco);
        
        if (empleado.getIdPlazaVigente() != null) {
            TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(empleado.getIdPlazaVigente());
            super.transformation().map(plaza, cambioBancariosDTO);
        }
        return cambioBancariosDTO;
    }
    
    /**
     * Metodo encargado de actualizar los datos bancarios del Empleado con base en el objeto cambioBancariosDTO.
     * @param cambioBancariosDTO CambioBancariosDTO
     * @param usuario String
     */
    public void updateEmpleadoBancarios(CambioBancariosDTO cambioBancariosDTO, String usuario) {
        //1) UPDATE TD_EMPLEADOS, CAMPOS: ID_BANCO_SAR, CLABE_EMPLEADO
        //2) UPDATE TD_PLAZAS 
        //3) INSERTA MOVIMIENTO
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioBancariosDTO.getRfcEmpleado());
        TdEmpleado empleadoNuevo = new TdEmpleado();
        SirehUtils.copyProperties(empleadoNuevo, empleado);
        
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(cambioBancariosDTO.getIdPlazaVigente());
        TdPlaza plazaNueva = new TdPlaza();
        SirehUtils.copyProperties(plazaNueva, plaza);
        
        Boolean actualizaEmpleado = false;
        
        TnRegControl regControl = super.persistence().get(TnRegControlDAO.class).getByRcVigente("S");
        Integer quincenaCaptura = regControl != null ? regControl.getRcQnaCaptura() : null;

        if ((empleado.getIdTipoPago() != null && cambioBancariosDTO.getIdTipoPago() == null) || 
            (empleado.getIdTipoPago() == null && cambioBancariosDTO.getIdTipoPago() != null) || 
            (empleado.getIdTipoPago() != null && !empleado.getIdTipoPago().equals(cambioBancariosDTO.getIdTipoPago()))) {
            empleadoNuevo.setIdTipoPago(cambioBancariosDTO.getIdTipoPago());
            actualizaEmpleado = true;
        }
        if(cambioBancariosDTO.getIdTipoPago() != null && cambioBancariosDTO.getIdTipoPago().equals( "CH")){
            cambioBancariosDTO.setClabeEmpleado2("000000000000000");
        }
        cambioBancariosDTO.setClabeEmpleado(cambioBancariosDTO.getClabeEmpleado1() + cambioBancariosDTO.getClabeEmpleado2());
        if ((cambioBancariosDTO.getClabeEmpleado() != null && empleado.getClabeEmpleado() == null) || 
            (cambioBancariosDTO.getClabeEmpleado() == null && empleado.getClabeEmpleado() != null) || 
            (empleado.getClabeEmpleado() != null && cambioBancariosDTO.getClabeEmpleado() != null && !empleado.getClabeEmpleado().equals(cambioBancariosDTO.getClabeEmpleado()))) {
            empleadoNuevo.setClabeEmpleado(cambioBancariosDTO.getClabeEmpleado());
            actualizaEmpleado = true;
        }
        
        if (plaza.getIdZonaDistNom() != null && cambioBancariosDTO.getIdZonaDistNom() != null && plaza.getIdZonaDistNom().compareTo(cambioBancariosDTO.getIdZonaDistNom()) != 0) {
            plazaNueva.setIdZonaDistNom(cambioBancariosDTO.getIdZonaDistNom());
            super.persistence().get(TnMovtosEmpPlaDAO.class).save(SirehUtils.transformToTnMovtosEmpPla(empleadoNuevo, plazaNueva, super.getMovimientoPersonal("CAMBIO_DE_ZONA_DE_DISTRIBUCION"), quincenaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre())));
            super.persistence().get(TdPlazaDAO.class).save(plazaNueva);
        }
        
        if (actualizaEmpleado) {
            super.persistence().get(TdEmpleadoDAO.class).save(empleadoNuevo);    
            super.persistence().get(TnMovtosEmpPlaDAO.class).save(SirehUtils.transformToTnMovtosEmpPla(empleadoNuevo, plazaNueva, super.getMovimientoPersonal("CAMBIO_DE_CLABE_BANCARIA"), quincenaCaptura, usuario, new Date(), super.getAtributoPuesto(plaza.getIdPuestoPre())));
        }
    }
    
    /**
     * Metodo encargado de obtener los datos del Empleado con base en su RFC.
     * @param rfcEmpleado String
     */
    public CambioDomicilioDTO getEmpleadoCambioDomicilio(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        final CambioDomicilioDTO empleadoDTO = super.transformation().map(empleado, CambioDomicilioDTO.class);
        return empleadoDTO;
    }
    
    /**
     * Metodo encargado de actualizar el domicilio del Empleado con base en el objeto cambioDomicilioDTO.
     * @param cambioDomicilioDTO CambioDomicilioDTO
     * @param usuario String
     */
    public void updateEmpleadoCambioDomicilio(CambioDomicilioDTO cambioDomicilioDTO, String usuario) {
        boolean cambios = false;
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioDomicilioDTO.getRfcEmpleado());
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getByPlazaRfc(cambioDomicilioDTO.getRfcEmpleado());
         
        TdEmpleado empleadoNuevo = empleado;
        empleadoNuevo.setUsuario(usuario);
        empleadoNuevo.setFecModifico(new Date());
        
        empleado.setCalleParticular( empleado.getCalleParticular() == null ? "" : empleado.getCalleParticular() );
        empleado.setColoniaParticular( empleado.getColoniaParticular() == null ? "" : empleado.getColoniaParticular() );
        empleado.setTelParticular( empleado.getTelParticular() == null ? "" : empleado.getTelParticular() );
        empleado.setCodpostParticular( empleado.getCodpostParticular() == null ? "" : empleado.getCodpostParticular() );
        
        if ((empleado.getCalleParticular() == null && cambioDomicilioDTO.getCalleParticular() != null) || !empleado.getCalleParticular().equals(cambioDomicilioDTO.getCalleParticular())) {
            empleadoNuevo.setCalleParticular(cambioDomicilioDTO.getCalleParticular());
            cambios = true;
        }
        
        if ((empleado.getColoniaParticular() == null && cambioDomicilioDTO.getColoniaParticular() != null) || !empleado.getColoniaParticular().equals(cambioDomicilioDTO.getColoniaParticular())) {
            empleadoNuevo.setColoniaParticular(cambioDomicilioDTO.getColoniaParticular());
            cambios = true;
        }
        
        if ((empleado.getTelParticular() == null && cambioDomicilioDTO.getTelParticular() != null) || !empleado.getTelParticular().equals(cambioDomicilioDTO.getTelParticular())) {
            empleadoNuevo.setTelParticular(cambioDomicilioDTO.getTelParticular());
            cambios = true;
        }
        
        if ((empleado.getCodpostParticular() == null && cambioDomicilioDTO.getCodpostParticular() != null) || !empleado.getCodpostParticular().equals(cambioDomicilioDTO.getCodpostParticular())) {
            empleadoNuevo.setCodpostParticular(cambioDomicilioDTO.getCodpostParticular());
            cambios = true;
        }
        
        if ((empleado.getIdEdoParticular() == null && cambioDomicilioDTO.getIdEdoParticular() != null) || !empleado.getIdEdoParticular().equals(cambioDomicilioDTO.getIdEdoParticular())) {
            empleadoNuevo.setIdEdoParticular(cambioDomicilioDTO.getIdEdoParticular());
            cambios = true;
        }
        
        if ((empleado.getIdMuniParticular() == null && cambioDomicilioDTO.getIdMuniParticular() != null) || !empleado.getIdMuniParticular().equals(cambioDomicilioDTO.getIdMuniParticular())) {
            empleadoNuevo.setIdMuniParticular(cambioDomicilioDTO.getIdMuniParticular());
            cambios = true;
        }
        
        // Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Cambio de Domicilio - 491
        if (cambios) {   
            updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("CAMBIO_DE_DOMICILIO"), mepQnaCaptura, usuario);
        }
    }
    
    public CambioComplementariosDTO getEmpleadoCambioComplementarios(String rfcEmpleado) {
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(rfcEmpleado);
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(empleado.getIdPlazaVigente());
               
        final CambioComplementariosDTO complementariosDTO = super.transformation().map(empleado, CambioComplementariosDTO.class);
        
        complementariosDTO.setIdInmuebleP(plaza.getIdInmueble());
        complementariosDTO.setPlazaTelOfc1(plaza.getPlazaTelOf1());
        complementariosDTO.setPlazaExt1(plaza.getPlazaExt1());
 
        
        return complementariosDTO;
    }
    
    public void updateEmpleadoCambioComplementarios(CambioComplementariosDTO cambioComplementariosDTO, String usuario) {
        Boolean cambio = false;
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioComplementariosDTO.getRfcEmpleado());
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getById(empleado.getIdPlazaVigente());
        //List<TdPlaza> lPlaza = super.persistence().get(QueryTdPlazaDAO.class).findPlazaInmueble(cambioComplementariosDTO.getRfcEmpleado());
        //TdPlaza plaza = lPlaza.get(0);
        plaza.setIdInmueble(cambioComplementariosDTO.getIdInmuebleP());
        plaza.setPlazaTelOf1(cambioComplementariosDTO.getPlazaTelOfc1());
        plaza.setPlazaExt1(cambioComplementariosDTO.getPlazaExt1());
        
        TdEmpleado empleadoNuevo = empleado;
        empleadoNuevo.setUsuario(usuario);
        empleadoNuevo.setFecModifico(new Date());
       
        if (empleado.getIngresoGobFed() == null || !(empleado.getIngresoGobFed().equals(cambioComplementariosDTO.getIngresoGobFed()))) {
            empleadoNuevo.setIngresoGobFed(cambioComplementariosDTO.getIngresoGobFed());
            cambio = true;
        }
       
        if (empleado.getIngresoDependencia() == null || !(empleado.getIngresoDependencia().equals(cambioComplementariosDTO.getIngresoDependencia()))) {
            empleadoNuevo.setIngresoDependencia(cambioComplementariosDTO.getIngresoDependencia());
            cambio = true;
        }
        
        if ((empleado.getTerminoCargoSind()) != (cambioComplementariosDTO.getTerminoCargoSind())) {
            empleadoNuevo.setTerminoCargoSind(cambioComplementariosDTO.getTerminoCargoSind());
            cambio = true;
        }
          
        if ((empleado.getImssIssste()) != (cambioComplementariosDTO.getImssIssste())) {
            empleadoNuevo.setImssIssste(cambioComplementariosDTO.getImssIssste());
            cambio = true;
        }
              
        if (empleado.getEMailOficial() != (cambioComplementariosDTO.getEMailOficial())) {
            empleadoNuevo.setEMailOficial(cambioComplementariosDTO.getEMailOficial());
            cambio = true;
        }
         
        if (empleado.getEMailPersonal() != (cambioComplementariosDTO.getEMailPersonal())) {
            empleadoNuevo.setEMailPersonal(cambioComplementariosDTO.getEMailPersonal());
            cambio = true;
        }
                 
        if (empleado.getIdRusp() != cambioComplementariosDTO.getIdRusp()) {
            empleadoNuevo.setIdRusp(cambioComplementariosDTO.getIdRusp());
            cambio = true;
        }
            
        if (empleado.getSistemaReparto() != (cambioComplementariosDTO.getSistemaReparto())) {
            empleadoNuevo.setSistemaReparto(cambioComplementariosDTO.getSistemaReparto());
            cambio = true;
        }
                 
        if (empleado.getIdTipoPago()!= (cambioComplementariosDTO.getIdTipoPago())) {
            empleadoNuevo.setIdTipoPago(cambioComplementariosDTO.getIdTipoPago());
            cambio = true;
        }
       
        if (empleado.getIdEdoCivil() != (cambioComplementariosDTO.getIdEdoCivil())) {
            empleadoNuevo.setIdEdoCivil(cambioComplementariosDTO.getIdEdoCivil());
            cambio = true;
        }
        
        if (empleado.getIdNacionalidad() != (cambioComplementariosDTO.getIdNacionalidad())) {
            empleadoNuevo.setIdNacionalidad(cambioComplementariosDTO.getIdNacionalidad());
            cambio = true;
        }
        
        if (empleado.getIdProfnCarrera() != (cambioComplementariosDTO.getIdProfnCarrera())) {
            empleadoNuevo.setIdProfnCarrera(cambioComplementariosDTO.getIdProfnCarrera());
            cambio = true;
        }
        
        if (empleado.getIdNivelEscolar() != (cambioComplementariosDTO.getIdNivelEscolar())) {
            empleadoNuevo.setIdNivelEscolar(cambioComplementariosDTO.getIdNivelEscolar());
            cambio = true;
        }
        
        if (empleado.getIdInstEducativa() != (cambioComplementariosDTO.getIdInstEducativa())) {
            empleadoNuevo.setIdInstEducativa(cambioComplementariosDTO.getIdInstEducativa());
            cambio = true;
        }
        
        if (empleado.getIdEspProtCivil() != (cambioComplementariosDTO.getIdEspProtCivil())) {
            empleadoNuevo.setIdEspProtCivil(cambioComplementariosDTO.getIdEspProtCivil());
            cambio = true;
        }
        
        if (empleado.getIdInstProtcivil() != (cambioComplementariosDTO.getIdInstProtcivil())) {
            empleadoNuevo.setIdInstProtcivil(cambioComplementariosDTO.getIdInstProtcivil());
            cambio = true;
        }
       
        if (empleado.getFecNotDecPatr() != (cambioComplementariosDTO.getFecNotDecPatr())) {
            empleadoNuevo.setFecNotDecPatr(cambioComplementariosDTO.getFecNotDecPatr());
            cambio = true;
        }
        
        if (empleado.getFecIniDeclPatr() != (cambioComplementariosDTO.getFecIniDeclPatr())) {
            empleadoNuevo.setFecIniDeclPatr(cambioComplementariosDTO.getFecIniDeclPatr());
            cambio = true;
        }
        
        if (empleado.getFecIngSpc()!= (cambioComplementariosDTO.getFecIngSpc())) {
            empleadoNuevo.setFecIngSpc(cambioComplementariosDTO.getFecIngSpc());
            cambio = true;
        }
        
        if (empleado.getCasoMuestra() != (cambioComplementariosDTO.getCasoMuestra())) {
            empleadoNuevo.setCasoMuestra(cambioComplementariosDTO.getCasoMuestra());
            cambio = true;
        }
        
        if (empleado.getDiscapacidad() != (cambioComplementariosDTO.getDiscapacidad())) {
            empleadoNuevo.setDiscapacidad(cambioComplementariosDTO.getDiscapacidad());
            cambio = true;
        }
        
        if (empleado.getEstudiaSiNo() != (cambioComplementariosDTO.getEstudiaSiNo())) {
            empleadoNuevo.setEstudiaSiNo(cambioComplementariosDTO.getEstudiaSiNo());
            cambio = true;
        }
        
        if (empleado.getPadreMadre() != (cambioComplementariosDTO.getPadreMadre())) {
            empleadoNuevo.setPadreMadre(cambioComplementariosDTO.getPadreMadre());
            cambio = true;
        }
        
        if (empleado.getCompatEmpleo() != (cambioComplementariosDTO.getCompatEmpleo())) {
            empleadoNuevo.setCompatEmpleo(cambioComplementariosDTO.getCompatEmpleo());
            cambio = true;
        }
        
        if(empleado.getIdBancoSar() != cambioComplementariosDTO.getIdBancoSar()) {
            empleadoNuevo.setIdBancoSar(cambioComplementariosDTO.getIdBancoSar());
            cambio = true;
        }
        
        if(plaza.getIdInmueble() != cambioComplementariosDTO.getIdInmuebleP()) {
            plaza.setIdInmueble(cambioComplementariosDTO.getIdInmuebleP());
            cambio = true;
        }
        if(plaza.getPlazaTelOf1() != cambioComplementariosDTO.getPlazaTelOfc1()) {
            plaza.setPlazaTelOf1(cambioComplementariosDTO.getPlazaTelOfc1());
            cambio = true;
        }

        if(plaza.getPlazaExt1() != cambioComplementariosDTO.getPlazaExt1()) {
            plaza.setPlazaExt1(cambioComplementariosDTO.getPlazaExt1());
            cambio = true;
        }

        
        if (cambio) {
            super.persistence().get(TdEmpleadoDAO.class).save(empleadoNuevo);
            super.persistence().get(TdPlazaDAO.class).save(plaza);
        }
    }
    
    public void updateEmpleadoContratoHonorarios(CambioNombreCurpDTO cambioNombreCurpDTO, String usuario) {
        // Paso 1) Obtener el Empleado actual        
        TdEmpleado empleado = super.persistence().get(TdEmpleadoDAO.class).getById(cambioNombreCurpDTO.getRfcEmpleado());
        
        // Paso 2) Obtener la Plaza actual
        TdPlaza plaza = super.persistence().get(TdPlazaDAO.class).getByPlazaRfc(cambioNombreCurpDTO.getRfcEmpleado());
        
        // Paso 3) Preparar objeto Empleado
        TdEmpleado empleadoNuevo = new TdEmpleado();
        SirehUtils.copyProperties(empleadoNuevo, empleado);
        empleadoNuevo.setUsuario(usuario);
        empleadoNuevo.setFecModifico(new Date());
        
        // Paso 4) Ontener Quincena de Captura
        Integer mepQnaCaptura = super.getQuincenaCaptura().intValue();
        
        // Paso 5) Actualiza Contrato de Honorarios
        //super.persistence().get(TdContratoHonoDAO.class).save(tnMovtosEmpPla);
        
        // Paso 5) Actualiza Empleado e Inserta Movimiento ContratoHonorarios - 480
        empleadoNuevo.setCurpEmpleado(cambioNombreCurpDTO.getCurpEmpleado());
        //updateEmpleadoMovtos(empleadoNuevo, empleado, plaza, super.getMovimientoPersonal("MODIFICACION_DE_LA_CURP"), mepQnaCaptura, usuario);
    }
}
