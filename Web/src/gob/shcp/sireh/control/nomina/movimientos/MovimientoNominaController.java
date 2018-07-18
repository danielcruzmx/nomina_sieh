package gob.shcp.sireh.control.nomina.movimientos;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;

import gob.shcp.sireh.model.nomina.CambioEmpleadoPensionesDTO;
import gob.shcp.sireh.model.nomina.CancelaPagoDTO;
import gob.shcp.sireh.model.nomina.ConsultaEmpleadoDTO;
import gob.shcp.sireh.model.nomina.CustomTdPensionDTO;
import gob.shcp.sireh.model.TcMovsPersonalDTO;
import gob.shcp.sireh.model.nomina.CambioMovimientosPersonalDTO;
import gob.shcp.sireh.model.nomina.ConsultaPlazaDTO;

import gob.shcp.sireh.model.nomina.TdEmpleadoDTO;
import gob.shcp.sireh.service.nomina.movimientos.MovimientoNominaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovimientoNominaController extends AbstractController implements AnnotatedController {

    /**
     * Metodo encargado de mostrar los movimientos correspondientes a las altas en un combo
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String altas(Model model) {
        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();
        consultaPlazaDTO.setMpTipoMovMenu("ALTAS");
        consultaPlazaDTO.setHeader("Movimientos nómina - Movimientos de personal - Altas y reingresos");
        return consultarPlazas(model, consultaPlazaDTO);
    }

    /**
     * Metodo encargado de consultar los datos del tipo de movimiento seleccionado en el combo
     * @param model Model
     * @param consultaPlazaDTO ConsultaPlazaDTO
     * @return String
     */
    @RequestMapping
    public String consultarPlazas(Model model, ConsultaPlazaDTO consultaPlazaDTO) {
        if (consultaPlazaDTO.getIdMovsPersonal() != null && consultaPlazaDTO.getIdMovsPersonal() != -1) {
            TcMovsPersonalDTO tcMovsPersonalDTO = super.getService(MovimientoNominaService.class).getMovimientoPersonalById(consultaPlazaDTO.getIdMovsPersonal());

            consultaPlazaDTO.setIdGrupoPago(splitAsList(tcMovsPersonalDTO.getMpGrupoPago(), "\\|"));
            consultaPlazaDTO.setIdJerarquia(splitAsList(tcMovsPersonalDTO.getMpJerarquia(), "\\|"));
            // Para las bajas se solicitó x incidencia incluir en el grid las situaciones Preventiva de pago (P) y Licencia (L) 
            if (tcMovsPersonalDTO.getMpTipoMovMenu() != null && tcMovsPersonalDTO.getMpTipoMovMenu().equals("BAJAS")) {
                List<String> listaIdSitPlaBaja = new ArrayList<String>();
                listaIdSitPlaBaja.add("O");
                listaIdSitPlaBaja.add("OR");
                listaIdSitPlaBaja.add("OT");
                listaIdSitPlaBaja.add("OK");
                listaIdSitPlaBaja.add("P");
                listaIdSitPlaBaja.add("L");
                consultaPlazaDTO.setIdSitPlaza(listaIdSitPlaBaja);
            } else {
                consultaPlazaDTO.setIdSitPlaza(splitAsList(tcMovsPersonalDTO.getIdSitPlaAnt(), "\\|"));
            }
            consultaPlazaDTO.setIdNombramiento(splitAsList(tcMovsPersonalDTO.getMpNombramiento(), "\\|"));
        } else {
            consultaPlazaDTO.setIdMovsPersonal(0);
        }
        model.addAttribute(consultaPlazaDTO);
        return super.getViewName("consultaPlaza");
    }

    /**
     * Metodo encargado de actualizar el movimiento realizado en pantalla
     * @param model Model
     * @param cambioMovimientosPersonalDTO CambioMovimientosPersonalDTO
     * @return String
     */
    @RequestMapping
    public String updateMovimientosPersonal(Model model, CambioMovimientosPersonalDTO cambioMovimientosPersonalDTO) {
        super.saveMessage(model, "nomina.cambiodatos.movimientosPersonal.ok");
        super.getService(MovimientoNominaService.class).updateMovimientosPersonal(cambioMovimientosPersonalDTO);
        if (cambioMovimientosPersonalDTO.getAlta() != null && 
            cambioMovimientosPersonalDTO.getAlta() || 
            cambioMovimientosPersonalDTO.getAltaPorReingreso() != null && 
            cambioMovimientosPersonalDTO.getAltaPorReingreso()) {
            return altas(model);
        } else if (cambioMovimientosPersonalDTO.getBaja() != null && cambioMovimientosPersonalDTO.getBaja()) {
            return bajas(model);
        } else if (cambioMovimientosPersonalDTO.getPromocion() != null && cambioMovimientosPersonalDTO.getPromocion()) {
            return promociones(model);
        } else if (cambioMovimientosPersonalDTO.getLicencia() != null && cambioMovimientosPersonalDTO.getLicencia()) {
            return licencias(model);
        } else if (cambioMovimientosPersonalDTO.getProrroga() != null && cambioMovimientosPersonalDTO.getProrroga()) {
            return licencias(model);
        }
        return altas(model);
    }

    /**
     * Metodo encargado de mostrar los movimientos correspondientes a las bajas en un combo
     * @param model Model
     * @return String
     */
    @RequestMapping
    public String bajas(Model model) {
        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();
        consultaPlazaDTO.setMpTipoMovMenu("BAJAS");
        consultaPlazaDTO.setHeader("Movimientos nómina - Movimientos de personal - Bajas");
        return consultarPlazas(model, consultaPlazaDTO);
    }

    /**
     * Metodo encargado de mostrar los movimientos correspondientes a las promociones en un combo
     * @param model
     * @return
     */
    @RequestMapping
    public String promociones(Model model) {
        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();
        consultaPlazaDTO.setMpTipoMovMenu("PROMOCIONES");
        consultaPlazaDTO.setHeader("Movimientos nómina - Movimientos de personal - Promociones");
        return consultarPlazas(model, consultaPlazaDTO);
    }

    /**
     * Metodo encargado de mostrar los movimientos correspondientes a las promociones en un combo
     * @param model
     * @return
     */
    @RequestMapping
    public String licencias(Model model) {
        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();
        consultaPlazaDTO.setMpTipoMovMenu("LICENCIAS");
        consultaPlazaDTO.setHeader("Movimientos nómina - Movimientos de personal - Licencias y preventivas");
        return consultarPlazas(model, consultaPlazaDTO);
    }

    /**
     * Metodo encargado de mostrar los movimientos correspondientes a las promociones en un combo
     * @param model
     * @return
     */
    @RequestMapping
    public String prorrogas(Model model) {
        ConsultaPlazaDTO consultaPlazaDTO = new ConsultaPlazaDTO();
        consultaPlazaDTO.setMpTipoMovMenu("PRORROGAS");
        consultaPlazaDTO.setHeader("Movimientos nómina - Movimientos de personal - Prórrogas");
        return consultarPlazas(model, consultaPlazaDTO);
    }

    @RequestMapping
    public String getPlazaEmpleado(Model model, @RequestParam("idPlaza") Integer idPlaza, @RequestParam("idMovsPersonal") Integer idMovsPersonal) {
        CambioMovimientosPersonalDTO movimientosPersonalDTO = super.getService(MovimientoNominaService.class).getPlazaEmpleadosMovtosPersonal(idPlaza, idMovsPersonal);
        model.addAttribute(movimientosPersonalDTO);
        return super.getViewName("cambioMovimientosPersonal");
    }

    private List<String> splitAsList(String cadena, String separatorSplit) {
        if (cadena == null || cadena.length() == 0)
            return null;
        String arreglo[] = cadena.split(separatorSplit);
        return Arrays.asList(arreglo);
    }
    
    /**
     * Metodo que muestra la pantalla de empleados para modificar sus datos de pension
     * @param model Model
     * @param consultaEmpleadoDTO ConsultaEmpleadoDTO
     * @return String
     */
    @RequestMapping
    public String gestionPension(Model model, ConsultaEmpleadoDTO consultaEmpleadoDTO) {
        if (consultaEmpleadoDTO.isCancel()) {
            consultaEmpleadoDTO = new ConsultaEmpleadoDTO();
        }
        consultaEmpleadoDTO.setUrlOrigen("gestionPension");
        consultaEmpleadoDTO.setUrlDestino("getPensiones");
        model.addAttribute(consultaEmpleadoDTO);
        return super.getViewName("consultarEmpleados");
    }

    /**
     * Metodo que ejecuta la consulta de las pensiones de un trabajador por su rfc
     * @param model Model
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String getPensiones(Model model, @RequestParam("rfcEmpleado")
        String rfcEmpleado, CambioEmpleadoPensionesDTO cambioEmpleadoPensionesDTO) {
        TdEmpleadoDTO empleadoDTO = super.getService(MovimientoNominaService.class).getEmpleado(rfcEmpleado);
        super.transformation().map(empleadoDTO, cambioEmpleadoPensionesDTO);
        cambioEmpleadoPensionesDTO.setRfcEmpleado(rfcEmpleado);
        cambioEmpleadoPensionesDTO.setStatusPension("V");
        model.addAttribute(cambioEmpleadoPensionesDTO);
        return super.getViewName("cambioEmpleadoPensiones");
    }

    /**
     * Metodo encargado de agregar una pension a un empleado por su rfc
     * @param model Model
     * @param rfcEmpleado String
     * @return
     */
    @RequestMapping
    public String addPension(Model model, @RequestParam("rfcEmpleado")
        String rfcEmpleado) {
        return this.getPension(model, 0, rfcEmpleado);
    }

    /**
     * Metodo encargado de consultar los datos de la pension por su idPension y rfcEmpleado
     * @param model Model
     * @param idPension String
     * @param rfcEmpleado String
     * @return String
     */
    @RequestMapping
    public String getPension(Model model, @RequestParam("idPension")
        int idPension, @RequestParam("rfcEmpleado")
        String rfcEmpleado) {
        CustomTdPensionDTO customTdPensionDTO = super.getService(MovimientoNominaService.class).getPension(idPension, rfcEmpleado);
        customTdPensionDTO.setPlaza_rfc(customTdPensionDTO.getRfcPension());
        model.addAttribute(customTdPensionDTO);
        return super.getViewName("cambioPension");
    }

    /**
     * Metodo encargado de actualizar la pension
     * @param model Model
     * @param customTdPensionDTO CustomTdPensionDTO
     * @return String
     */
    @RequestMapping
    public String updatePension(Model model, CustomTdPensionDTO customTdPensionDTO) {
        customTdPensionDTO.setUsuario(super.identity().get().getUserID());
        customTdPensionDTO.setFecModifico(new java.util.Date());
        super.getService(MovimientoNominaService.class).savePension(customTdPensionDTO);
        if (customTdPensionDTO.getIdPension() != null) {
            super.saveMessage(model, "nomina.cambiodatos.pension.ok");
        } else {
            super.saveMessage(model, "nomina.altadatos.pension.ok");
        }
        return getPensiones(model, customTdPensionDTO.getRfcPension(), new CambioEmpleadoPensionesDTO());
    }

    /**
     * Metodo que se encarga de eliminar las pensiones seleccionadas
     * @param model Model
     * @param cambioEmpleadoPensionesDTO CambioEmpleadoPensionesDTO
     * @return String
     */
    @RequestMapping
    public String deletePensiones(Model model, CambioEmpleadoPensionesDTO cambioEmpleadoPensionesDTO) {
        model.addAttribute(cambioEmpleadoPensionesDTO);
        Integer[] ids = new Integer[cambioEmpleadoPensionesDTO.getIdPension().length];

        for (int i = 0; i < cambioEmpleadoPensionesDTO.getIdPension().length; i++) {
            ids[i] = Integer.valueOf(cambioEmpleadoPensionesDTO.getIdPension()[i]);
        }

        super.getService(MovimientoNominaService.class).deletePensiones(ids);
        super.saveMessage(model, "nomina.deletedatos.pension.ok");
        return getPensiones(model, cambioEmpleadoPensionesDTO.getRfcEmpleado(), new CambioEmpleadoPensionesDTO());
    }

    @RequestMapping
    public String cancelaPago(Model model) {
        CancelaPagoDTO cancelaPagoDTO = new CancelaPagoDTO();
        model.addAttribute(cancelaPagoDTO);
        return super.getViewName("cancelaPago");
    }

    @RequestMapping
    public String validaCancelaPago(Model model, CancelaPagoDTO cancelaPagoDTO) {
        CancelaPagoDTO cancelaPagoDTODB = super.getService(MovimientoNominaService.class).getEmpleadoCancelaPago(cancelaPagoDTO);
        if (cancelaPagoDTODB == null) {
            super.saveMessage(model, "movimientoNomina.control.validaCancelPagos.vacio");
            model.addAttribute(cancelaPagoDTO);
        } else {
            super.saveMessage(model, "movimientoNomina.control.validaCancelPagos.ok");
            cancelaPagoDTO.setHpRfc(cancelaPagoDTO.getHpRfc());
            cancelaPagoDTO.setHpFolio(cancelaPagoDTO.getHpFolio());
            cancelaPagoDTO.setHpNetoPago(cancelaPagoDTO.getHpNetoPago());
            cancelaPagoDTO.setHpDifFolio(cancelaPagoDTO.getHpDifFolio());

            cancelaPagoDTO.setDescTipoNomina(cancelaPagoDTODB.getDescTipoNomina());
            cancelaPagoDTO.setPrimerApellido(cancelaPagoDTODB.getPrimerApellido());
            cancelaPagoDTO.setSegundoApellido(cancelaPagoDTODB.getSegundoApellido());
            cancelaPagoDTO.setNombreEmpleado(cancelaPagoDTODB.getNombreEmpleado());
            cancelaPagoDTO.setHpQnaPago(cancelaPagoDTODB.getHpQnaPago());
            cancelaPagoDTO.setIdMotivoCancela(cancelaPagoDTODB.getIdMotivoCancela());
            cancelaPagoDTO.setCpcQnaAplica(cancelaPagoDTODB.getCpcQnaAplica());
            cancelaPagoDTO.setDescSitPago(cancelaPagoDTODB.getDescSitPago());
            cancelaPagoDTO.setIdSitPago(cancelaPagoDTODB.getIdSitPago());

            model.addAttribute(cancelaPagoDTO);
        }
        return super.getViewName("cancelaPago");
    }

    @RequestMapping
    public String corrigeCancelaPago(Model model, CancelaPagoDTO cancelaPagoDTO) {
        if(cancelaPagoDTO.getIdMotivoCancela().toString().equalsIgnoreCase("0") || 
            cancelaPagoDTO.getIdMotivoCancela().toString().equalsIgnoreCase("0") || 
            cancelaPagoDTO.getCpcReferencia().equals("")){
            
            if(cancelaPagoDTO.getIdMotivoCancela().toString().equalsIgnoreCase("0")){
                super.saveError(model, "movimientoNomina.control.corrigeCancelaPago.motivoCancelaPago.error");
            }
            if(cancelaPagoDTO.getIdMotivoCancela().toString().equalsIgnoreCase("0")){
                super.saveError(model, "movimientoNomina.control.corrigeCancelaPago.qnaAplica.error");
            }
            if(cancelaPagoDTO.getCpcReferencia().equals("")){
                super.saveError(model, "movimientoNomina.control.corrigeCancelaPago.referencia.error");
            }
        }
        else {
            super.getService(MovimientoNominaService.class).corrigeEmpleadoCancelaPago(cancelaPagoDTO);
            super.saveMessage(model, "movimientoNomina.control.corrigeCancelaPago.guardar", cancelaPagoDTO.getHpFolio(), cancelaPagoDTO.getHpDifFolio(), cancelaPagoDTO.getHpRfc());
        }
        
        model.addAttribute( new CancelaPagoDTO());
        return super.getViewName("cancelaPago");
    }

    @RequestMapping
    public String bloqueoDeposito(Model model) {
        CancelaPagoDTO cancelaPagoDTO = new CancelaPagoDTO();
        model.addAttribute(cancelaPagoDTO);
        return super.getViewName("bloqueoDeposito");
    }

    @RequestMapping
    public String validaBloqueoDeposito(Model model, CancelaPagoDTO cancelaPagoDTO) {
        CancelaPagoDTO cancelaPagoDTODB = super.getService(MovimientoNominaService.class).getEmpleadoBloqueoDeposito(cancelaPagoDTO);
        if (cancelaPagoDTODB == null) {
            super.saveError(model, "movimientoNomina.control.bloqueoDeposito.error");
        } else {
            super.saveMessage(model, "movimientoNomina.control.bloqueoDeposito.valida.ok");
            cancelaPagoDTO.setHpRfc(cancelaPagoDTO.getHpRfc());
            cancelaPagoDTO.setHpFolio(cancelaPagoDTO.getHpFolio());
            cancelaPagoDTO.setHpNetoPago(cancelaPagoDTO.getHpNetoPago());
            cancelaPagoDTO.setHpDifFolio(cancelaPagoDTO.getHpDifFolio());
            cancelaPagoDTO.setDescTipoNomina(cancelaPagoDTODB.getDescTipoNomina());
            cancelaPagoDTO.setPrimerApellido(cancelaPagoDTODB.getPrimerApellido());
            cancelaPagoDTO.setSegundoApellido(cancelaPagoDTODB.getSegundoApellido());
            cancelaPagoDTO.setNombreEmpleado(cancelaPagoDTODB.getNombreEmpleado());
            cancelaPagoDTO.setHpQnaPago(cancelaPagoDTODB.getHpQnaPago());
            cancelaPagoDTO.setIdMotivoCancela(cancelaPagoDTODB.getIdMotivoCancela());
            cancelaPagoDTO.setCpcQnaAplica(cancelaPagoDTODB.getCpcQnaAplica());
            cancelaPagoDTO.setDescSitPago(cancelaPagoDTODB.getDescSitPago());
            cancelaPagoDTO.setIdSitPago(cancelaPagoDTODB.getIdSitPago());
            cancelaPagoDTO.setHpClabe(cancelaPagoDTODB.getHpClabe());
            cancelaPagoDTO.setHpDepositoSN(cancelaPagoDTODB.getHpDepositoSN());
        }
        model.addAttribute(cancelaPagoDTO);
        return super.getViewName("bloqueoDeposito");
    }

    
    @RequestMapping
        public String corrigeBloqueoDeposito(Model model, CancelaPagoDTO cancelaPagoDTO) {
            /**** valida el comboBox tipo de bloqueo ****/
            if (cancelaPagoDTO.getSeleccionado().equals("-1")) {
                model.addAttribute(cancelaPagoDTO);
                super.saveError(model, "movimientoNomina.control.bloqueoDeposito.seleccione.tipoBloqueo");
                return super.getViewName("bloqueoDeposito");
            }
            
            /* Valida el campo de texto  */
            if(cancelaPagoDTO.getCpcReferencia().equalsIgnoreCase("") || cancelaPagoDTO.getCpcReferencia() == null){
                super.saveError(model, "movimientoNomina.control.bloqueoDeposito.seleccione.referencia");
                model.addAttribute(cancelaPagoDTO);
                return super.getViewName("bloqueoDeposito");
            }
            
            /* valida: Si el pago ya esta en cheque no procede el bloqueo de la cuenta */
            if(cancelaPagoDTO.getHpDepositoSN().equalsIgnoreCase("0") ){
                super.saveError(model, "movimientoNomina.control.bloqueoDeposito.valida.cheque");
                return super.getViewName("bloqueoDeposito");
            }
            
            /* si la opcion de bloqueo seleccionada es cheque, el pago se asigna a aheque */
            if(cancelaPagoDTO.getSeleccionado().equalsIgnoreCase("0")){
                cancelaPagoDTO.setHpClabe(super.configuration().getString("CUENTA_CHEQUE") );
            }
            
            /* Valida: Si la  cuenta ya esta en dgrh, y la opcion seleccionada es dgrh, no procede el movimiento */
            if(cancelaPagoDTO.getHpClabe().equalsIgnoreCase(super.configuration().getString("CUENTA_DGRH") ) ){
                super.saveWarning(model, "movimientoNomina.control.bloqueoDeposito.error.DRGHaDGRH");
                model.addAttribute(cancelaPagoDTO);
                return super.getViewName("bloqueoDeposito");
            }
           
            /* si el pago esta en una cuenta bancaria y la opcion de bloqueo seleccionada es dgrh, 
             * el pago se asigna a la cuenta de la dgrh */
            if(!cancelaPagoDTO.getHpClabe().equalsIgnoreCase(super.configuration().getString("CUENTA_DGRH")) && cancelaPagoDTO.getSeleccionado().equalsIgnoreCase("1")){
                cancelaPagoDTO.setHpClabe(super.configuration().getString("CUENTA_DGRH") );
            }
           
            cancelaPagoDTO.setHpDepositoSN(cancelaPagoDTO.getSeleccionado());
            super.getService(MovimientoNominaService.class).corrigeEmpleadoBloqueoDeposito(cancelaPagoDTO);
            super.saveMessage(model, "movimientoNomina.control.bloqueoDeposito.exito.cambio");
           
            return bloqueoDeposito(model);
        }
}
