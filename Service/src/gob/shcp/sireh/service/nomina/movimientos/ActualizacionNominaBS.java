package gob.shcp.sireh.service.nomina.movimientos;

import gob.shcp.sireh.data.jdbc.QueryTdEmpleadoDAO;
import gob.shcp.sireh.data.jdbc.QueryTnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.TnMovtoConceptoPagoDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdCapturaConceptosEmpleadoDAO;
import gob.shcp.sireh.domain.jdbc.CustomTdEmpleadoPlazaPuesto;
import gob.shcp.sireh.domain.jdbc.DatosConceptoEmpleado;
import gob.shcp.sireh.domain.jdbc.DatosEmpleadoCpto;
import gob.shcp.sireh.domain.jdbc.MovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;
import gob.shcp.sireh.model.SelectIntegerStringDTO;

import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.TnMovtoConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.actualizacion.ActualizaErarioFedDTO;
import gob.shcp.sireh.model.nomina.actualizacion.GestionFonacDTO;


import gob.shcp.sireh.model.nomina.conceptos.DatosConceptoEmpleadoDTO;
import gob.shcp.sireh.model.nomina.conceptos.DatosEmpleadoCptoDTO;
import gob.shcp.sireh.model.nomina.conceptos.MovtoConceptoPagoDTO;
import gob.shcp.sireh.service.AbstractSirehService;

import gob.shcp.sireh.service.SirehUtils;


import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class ActualizacionNominaBS extends AbstractSirehService implements ActualizacionNominaService {
    public ActualizacionNominaBS() {  }
    
    public DatosEmpleadoCptoDTO buscarDatosEmpleadoCpto(java.lang.String rfcEmpleado){
        DatosEmpleadoCpto datosEmpleadoCpto = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).buscarDatosEmpleadoCpto(rfcEmpleado, super.security().getDimensions(),super.security().getOperationYear());
        DatosEmpleadoCptoDTO conceptosGeneralesDTO = super.transformation().map(datosEmpleadoCpto, DatosEmpleadoCptoDTO.class);
        return conceptosGeneralesDTO;
    }
  
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleado (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO) {
        DatosConceptoEmpleado datosConceptoEmpleado = super.transformation().map(datosConceptoEmpleadoDTO, DatosConceptoEmpleado.class);
        datosConceptoEmpleado = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).buscarDetalleConceptoEmpleado(datosConceptoEmpleado);
        return super.transformation().map(datosConceptoEmpleado, DatosConceptoEmpleadoDTO.class);
    }
    
    public DatosConceptoEmpleadoDTO buscarDetalleConceptoEmpleadoBis (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO) {
        DatosConceptoEmpleado datosConceptoEmpleado = super.transformation().map(datosConceptoEmpleadoDTO, DatosConceptoEmpleado.class);
        datosConceptoEmpleado = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).buscarDetalleConceptoEmpleadoBis(datosConceptoEmpleado);
        return super.transformation().map(datosConceptoEmpleado, DatosConceptoEmpleadoDTO.class);
    }
    
    public DatosConceptoEmpleadoDTO detalleConceptoEmpleadoActualizacion (DatosConceptoEmpleadoDTO datosConceptoEmpleadoDTO) {
        DatosConceptoEmpleadoDTO retorno = null;
        DatosConceptoEmpleado datosConceptoEmpleado = super.transformation().map(datosConceptoEmpleadoDTO, DatosConceptoEmpleado.class);
        datosConceptoEmpleado = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).detalleConceptoEmpleadoActualizacion(datosConceptoEmpleado);
        retorno = super.transformation().map(datosConceptoEmpleado, DatosConceptoEmpleadoDTO.class);
        return retorno;
    }
        
    public DatosConceptoEmpleadoDTO detalleConceptosTipoO(String idTipoCpto, String idConcepto, String rfcEmpleado){
        DatosConceptoEmpleado datosConceptoEmpleado = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).detalleConceptosTipoO(idTipoCpto, idConcepto, rfcEmpleado);
        return super.transformation().map(datosConceptoEmpleado, DatosConceptoEmpleadoDTO.class);
    }
        
    public void eliminaConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        datosEmpleadoCptoDTO.setMcpQnaCancelo(super.getQuincenaCaptura().intValue());
        datosEmpleadoCptoDTO.setUsuario(super.identity().get().getUserID());
        DatosEmpleadoCpto datosEmpleadoCpto = super.transformation().map(datosEmpleadoCptoDTO, DatosEmpleadoCpto.class);
        super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).eliminaConceptoEmpleado(datosEmpleadoCpto);
    }
    
    public Map<String, Object> colsultaTcCptsPagoCaptOpcRdbuttons(String idTipoCpto, String idCptoPago){
       return super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).colsultaTcCptsPagoCaptOpcRdbuttons(idTipoCpto, idCptoPago);
    }
    
    public List<Integer> getQnaInicial(){
        List<Integer> quincenaCaptura = new ArrayList<Integer>();
        quincenaCaptura.add(Integer.valueOf(super.getQuincenaCaptura().getQuincena()) );
        quincenaCaptura.add(Integer.valueOf(super.getQuincenaCaptura().getAnio()) );
        return quincenaCaptura;
    }
    
    public void agregarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        DatosEmpleadoCpto datosEmpleadoCpto = super.transformation().map(datosEmpleadoCptoDTO, DatosEmpleadoCpto.class);
        super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).agregarConceptoEmpleado(datosEmpleadoCpto);
    }
    
    
    public void agregarConceptoEmpleadoPAX(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){ 
        //datosEmpleadoCptoDTO.setQnaCancelo(new Integer(super.getQuincenaCaptura().getAnio() + "" +  super.getQuincenaCaptura().getQincena()));
        DatosEmpleadoCpto datosEmpleadoCpto = super.transformation().map(datosEmpleadoCptoDTO, DatosEmpleadoCpto.class);
        super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).agregarConceptoEmpleadoPAX(datosEmpleadoCpto);
    }
    
    public void actualizarConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        DatosEmpleadoCpto datosEmpleadoCpto = super.transformation().map(datosEmpleadoCptoDTO, DatosEmpleadoCpto.class);
        datosEmpleadoCpto.setMcpQnaCaptura(  new BigDecimal(super.getQuincenaCaptura().getAnio() + "" + super.getQuincenaCaptura().getQuincena()) );
        datosEmpleadoCpto.setMcpQnaIni(new Integer(super.getQuincenaCaptura().getAnio() + "" + super.getQuincenaCaptura().getQuincena()) );
        super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).actualizarConceptoEmpleado(datosEmpleadoCpto);
    }
    
    public void adeudoSaveConceptoEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        DatosEmpleadoCpto datosEmpleadoCpto = super.transformation().map(datosEmpleadoCptoDTO, DatosEmpleadoCpto.class);
        super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).adeudoSaveConceptoEmpleado(datosEmpleadoCpto);
    }
    
    public MovtoConceptoPagoDTO detalleConceptoDelEmpleado(DatosEmpleadoCptoDTO datosEmpleadoCptoDTO){
        MovtoConceptoPagoDTO retorno = null;
        MovtoConceptoPago datosEmpleadoCpto = super.persistence().get(CustomTdCapturaConceptosEmpleadoDAO.class).detalleConceptoDelEmpleado(datosEmpleadoCptoDTO.getIdTipoCpto(), datosEmpleadoCptoDTO.getIdConcepto(), datosEmpleadoCptoDTO.getRfcEmpleado());
        retorno = super.transformation().map(datosEmpleadoCpto, MovtoConceptoPagoDTO.class);
        return retorno;
    }

    public GestionFonacDTO getFonac(String rfcEmpleado) {

        Integer quincenaCaptura = super.getQuincenaCaptura().intValue();
        Integer qnaCaptura = Integer.valueOf(super.getQuincenaCaptura().getQuincena());
        Integer anioCaptura = Integer.valueOf(super.getQuincenaCaptura().getAnio());

        //Verifica que el empleado este activo
        List<CustomTdEmpleadoPlazaPuesto> listaEmpleadoPlazaPuesto = super.persistence().get(QueryTdEmpleadoDAO.class).getEmpleadoPlazaPuestoById(rfcEmpleado);
        // Obtengo el concepto si existe para el empleado en cuestion
        TnMovtoConceptoPago movtoConceptoPagoVigente = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findByIdTipoCptoMcpRfc("U", "F", "FE", "V", rfcEmpleado);
        GestionFonacDTO gestionFonacDTO = null;
        if (listaEmpleadoPlazaPuesto != null && !listaEmpleadoPlazaPuesto.isEmpty()) {
            CustomTdEmpleadoPlazaPuesto empleadoPlazaPuesto = listaEmpleadoPlazaPuesto.get(0);
            gestionFonacDTO = super.transformation().map(empleadoPlazaPuesto, GestionFonacDTO.class);
            gestionFonacDTO.setAltaEneabled(Boolean.FALSE);
        }else{
            gestionFonacDTO = new GestionFonacDTO();
            gestionFonacDTO.setMensaje("- El empleado NO se encuentra activo - ");
            return gestionFonacDTO;
        }

        TnMovtoConceptoPagoDTO movtoConceptoPagoVigenteDTO = super.transformation().map(movtoConceptoPagoVigente, TnMovtoConceptoPagoDTO.class);
        // Si no lo tiene vigente, entonces podemos habilitar el alta
        if (movtoConceptoPagoVigente == null) {
            // Si estamos en la quincena 2, vamos a permitir la alta siempre y cuando no tenga en el año anterior

            if (qnaCaptura.intValue() == 2) {
                Integer qnaLimiteInferior = Integer.valueOf("" + (anioCaptura - 1) + 14);
                Integer qnaLimiteSuperior = Integer.valueOf("" + anioCaptura + "02");
                List<TnMovtoConceptoPago> listaMovtoConceptoPago = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findByIdTipoCptoMcpRfcQnaCaptura("U", "F", "FE", "V", "B", rfcEmpleado, qnaLimiteInferior, qnaLimiteSuperior);
                if (listaMovtoConceptoPago == null || listaMovtoConceptoPago.isEmpty()) {
                    gestionFonacDTO.setAltaEneabled(Boolean.TRUE);
                }else{
                    gestionFonacDTO.setMensaje("- El empleado tuvo el concepto el año anterior - ");
                }
            }

            // Si estamos en la quincena 14, siempre vamos a permitir la alta
            if (qnaCaptura.intValue() == 14) {
                gestionFonacDTO.setAltaEneabled(Boolean.TRUE);
            }
        } else {
            movtoConceptoPagoVigenteDTO.setIdConcepto(movtoConceptoPagoVigenteDTO.getIdConcepto() != null ? movtoConceptoPagoVigenteDTO.getIdConcepto() : null);
            gestionFonacDTO.setFecIniAdeudo(movtoConceptoPagoVigenteDTO.getMcpFecFinAdeudo());
            gestionFonacDTO.setFecFinAdeudo(movtoConceptoPagoVigenteDTO.getMcpFecFinAdeudo());
        }
        gestionFonacDTO.setHasFonac(movtoConceptoPagoVigente != null);
        gestionFonacDTO.setMovtoConceptoPagoDTO(movtoConceptoPagoVigenteDTO);

        if (qnaCaptura <= 13) {
            gestionFonacDTO.setListaQnasAdeudo(generaListaQuincenas(quincenaCaptura, Integer.parseInt("" + anioCaptura + "" + 13)));
        } else {
            gestionFonacDTO.setListaQnasAdeudo(generaListaQuincenas(quincenaCaptura, Integer.parseInt("" + (anioCaptura + 1) + "" + 13)));
        }

        return gestionFonacDTO;
    }

    public List<SelectIntegerStringDTO> generaListaQuincenas(Integer quincenaOrigen, Integer quincenaDestino) {

        List<SelectIntegerStringDTO> listaQuincenas = new ArrayList<SelectIntegerStringDTO>();

        Integer qnaOrigen = Integer.parseInt(quincenaOrigen.toString().substring(4));
        Integer qnaDestino = Integer.parseInt(quincenaDestino.toString().substring(4));
        Integer anioOrigen = Integer.parseInt(quincenaOrigen.toString().substring(0, 4));
        Integer anioDestino = Integer.parseInt(quincenaDestino.toString().substring(0, 4));
        
        listaQuincenas.add(new SelectIntegerStringDTO(0, "SELECCIONE"));
        do {

            listaQuincenas.add(new SelectIntegerStringDTO(Integer.parseInt("" + anioOrigen + "" + (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)), 
                                                "" + anioOrigen + "" + (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)));
            qnaOrigen++;
            if (qnaOrigen == 29) {
                qnaOrigen = 1;
                anioOrigen++;
            }
        } while (qnaOrigen < qnaDestino || anioOrigen < anioDestino);
        listaQuincenas.add(new SelectIntegerStringDTO(Integer.parseInt("" + anioOrigen + "" + (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)), 
                                            "" + anioOrigen + "" + (qnaOrigen.toString().length() < 2 ? "" + 0 + qnaOrigen : "" + qnaOrigen)));

        return listaQuincenas;
    }

    public void updateFonac(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, Boolean hasFonac) {
        
        TnMovtoConceptoPago movtoConceptoPago = new TnMovtoConceptoPago();
        TnMovtoConceptoPago movtoConceptoPagoBase = null;
        QnaCapturaDTO qnaCapturaDTO = super.getQuincenaCaptura();
        Integer quincena = Integer.valueOf(qnaCapturaDTO.getQuincena()) ;
        Integer quincenaCaptura = qnaCapturaDTO.intValue();
        // Se obtiene el movtoConceptoPagoBase de la base de datos
        if(movtoConceptoPagoDTO.getIdMovtoConceptoPago() != null){
            movtoConceptoPagoBase = super.persistence().get(TnMovtoConceptoPagoDAO.class).getById(movtoConceptoPagoDTO.getIdMovtoConceptoPago());        
        }else{
            movtoConceptoPagoBase = new TnMovtoConceptoPago();
        }
        SirehUtils.copyProperties(movtoConceptoPago, movtoConceptoPagoBase);
        if (movtoConceptoPagoDTO.getIdMovtoConceptoPago() == null || (movtoConceptoPagoDTO.getIdSitCaptura() != null && movtoConceptoPagoDTO.getIdSitCaptura().equals("V") && hasFonac != null && hasFonac)){
            // Se trata de un alta o una actualización
             
            // Se trata de un alta
            if(movtoConceptoPagoDTO.getIdMovtoConceptoPago() == null){
                movtoConceptoPago.setMcpRfc(movtoConceptoPagoDTO.getMcpRfc());
                movtoConceptoPago.setIdTercero("H");
                movtoConceptoPago.setIdTipoCpto("U");
            }
            
             movtoConceptoPago.setIdSitCaptura(movtoConceptoPago.getIdSitCaptura() != null ? movtoConceptoPago.getIdSitCaptura() : "V");
             movtoConceptoPago.setMcpRefCaptura(movtoConceptoPagoDTO.getMcpRefCaptura());
             movtoConceptoPago.setMcpUltQnaProcesa(Integer.valueOf(0));
             movtoConceptoPago.setMcpFecIncidencia(new java.util.Date());
             movtoConceptoPago.setMcpHorasDias(Integer.valueOf(0));
             movtoConceptoPago.setMcpMonto(Double.valueOf(0));
             movtoConceptoPago.setMcpPorcentaje(Float.valueOf(0));
             movtoConceptoPago.setMcpQnaIni(quincenaCaptura);
             movtoConceptoPago.setMcpQnaFin(quincenaCaptura);
            movtoConceptoPago.setMcpQnaAplicadas(movtoConceptoPagoDTO.getMcpQnaADescontar());
            movtoConceptoPago.setMcpMontoAdeudo(movtoConceptoPagoDTO.getMcpMontoAdeudo());
            movtoConceptoPago.setMcpQnasAdeudo(movtoConceptoPagoDTO.getMcpQnasAdeudo());
            movtoConceptoPago.setMcpFecIniAdeudo(movtoConceptoPagoDTO.getMcpFecIniAdeudo());
            movtoConceptoPago.setMcpFecFinAdeudo(movtoConceptoPagoDTO.getMcpFecFinAdeudo());


            if (quincena.intValue() == 2) {
                movtoConceptoPago.setIdConcepto("FE");
            } else if (quincena.intValue() == 14) {
                movtoConceptoPago.setIdConcepto("F");
            }
        } else {
            // Se trata de una baja
            movtoConceptoPago.setIdSitCaptura("B");
            movtoConceptoPago.setMcpRefCancela(movtoConceptoPagoDTO.getMcpRefCaptura());
            movtoConceptoPago.setMcpQnaCancelo(quincenaCaptura);
        }

        movtoConceptoPago.setFecModifico(new Date());
        movtoConceptoPago.setMcpQnaCaptura(quincenaCaptura );
        movtoConceptoPago.setUsuario(super.identity().get().getUserID());
        
        if( !(movtoConceptoPagoDTO.getIdMovtoConceptoPago() != null && movtoConceptoPago.getIdSitCaptura().equals("V") && movtoConceptoPago.isEquivalente(movtoConceptoPagoBase)) ){
            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPago);
        }
    }


    public ActualizaErarioFedDTO getErarioFed(String rfcEmpleado) {
        List<CustomTdEmpleadoPlazaPuesto> listaEmpleadoPlazaPuesto = super.persistence().get(QueryTdEmpleadoDAO.class).getEmpleadoPlazaPuestoById(rfcEmpleado);
        
        TnMovtoConceptoPago movtoConceptoPagoVigente = super.persistence().get(QueryTnMovtoConceptoPagoDAO.class).findByIdTipoCptoMcpRfc("U", 
                                                                                              "26", 
                                                                                              null, 
                                                                                              "V", 
                                                                                              rfcEmpleado);
        
        if(listaEmpleadoPlazaPuesto != null && !listaEmpleadoPlazaPuesto.isEmpty()){
            CustomTdEmpleadoPlazaPuesto empleadoPlazaPuesto = listaEmpleadoPlazaPuesto.get(0);
            ActualizaErarioFedDTO actualizaErarioFedDTO = super.transformation().map(empleadoPlazaPuesto, ActualizaErarioFedDTO.class);
            TnMovtoConceptoPagoDTO movtoConceptoPagoDTO = super.transformation().map(movtoConceptoPagoVigente, TnMovtoConceptoPagoDTO.class);
            
            boolean hasU26 = movtoConceptoPagoDTO != null && movtoConceptoPagoDTO.getIdSitCaptura().equals("V") ? true : false;
            boolean hasPuestoErario = empleadoPlazaPuesto != null && empleadoPlazaPuesto.getApErarioFederal().equals("S") ? true : false;
            
            actualizaErarioFedDTO.setHasErario(hasU26 ^ hasPuestoErario);
            actualizaErarioFedDTO.setMovtoConceptoPagoDTO(movtoConceptoPagoDTO);
            return actualizaErarioFedDTO;
        }
            return new ActualizaErarioFedDTO();

    }

    /**
     * Metodo que actualiza la informacion del erario federal de un empleado en la tabla TN_MOVTO_CONCEPTO_PAGO 
     * @author Gualberto G.
     * @param movtoConceptoPagoDTO
     * @param rfcEmpleado
     * @param hasErario
     */
    public void updateErarioFed(TnMovtoConceptoPagoDTO movtoConceptoPagoDTO, String rfcEmpleado, Boolean hasErario) {

        List<CustomTdEmpleadoPlazaPuesto> listaEmpleadoPlazaPuesto = super.persistence().get(QueryTdEmpleadoDAO.class).getEmpleadoPlazaPuestoById(rfcEmpleado);
        TnMovtoConceptoPago movtoConceptoPagoBase = null;
        if (movtoConceptoPagoDTO.getIdMovtoConceptoPago() != null) {
            movtoConceptoPagoBase = super.persistence().get(TnMovtoConceptoPagoDAO.class).getById(movtoConceptoPagoDTO.getIdMovtoConceptoPago());
        } else {
            movtoConceptoPagoBase = new TnMovtoConceptoPago();
        }


        boolean hasU26Base = 
            movtoConceptoPagoBase != null && movtoConceptoPagoBase.getIdSitCaptura() != 
            null && movtoConceptoPagoBase.getIdSitCaptura().equals("V") ? 
            true : false;
        boolean hasPuestoErarioBase = 
            listaEmpleadoPlazaPuesto != null && !listaEmpleadoPlazaPuesto.isEmpty() && 
            listaEmpleadoPlazaPuesto.get(0).getApErarioFederal() != null && 
            listaEmpleadoPlazaPuesto.get(0).getApErarioFederal().equals("S") ? 
            true : false;

        boolean hasU26Update = hasErario ^ hasPuestoErarioBase;

        if (hasU26Base != hasU26Update) {
            if (!hasU26Base) {
                // Es un vigente, lo vamos a insertar
                movtoConceptoPagoBase.setIdMovtoConceptoPago(null);
                movtoConceptoPagoBase.setIdTercero("H");
                movtoConceptoPagoBase.setIdSitCaptura("V");
                movtoConceptoPagoBase.setIdTipoCpto("U");
                movtoConceptoPagoBase.setIdConcepto("26");
                movtoConceptoPagoBase.setMcpRfc(rfcEmpleado);
                movtoConceptoPagoBase.setMcpRefCaptura(movtoConceptoPagoDTO.getMcpRefCaptura());
                movtoConceptoPagoBase.setMcpUltQnaProcesa(Integer.valueOf(0));
                movtoConceptoPagoBase.setMcpFecIncidencia(new java.util.Date());
                movtoConceptoPagoBase.setMcpHorasDias(Integer.valueOf(0));
                movtoConceptoPagoBase.setMcpMonto(Double.valueOf(0));
                movtoConceptoPagoBase.setMcpPorcentaje(Float.valueOf(0));
            } else {
                // Es una baja, lo vamos a actualizar
                movtoConceptoPagoBase.setIdSitCaptura("B");
                movtoConceptoPagoBase.setMcpRefCancela(movtoConceptoPagoDTO.getMcpRefCaptura());
            }
            movtoConceptoPagoBase.setFecModifico(new Date());
            movtoConceptoPagoBase.setUsuario(super.identity().get().getUserID());
            movtoConceptoPagoBase.setMcpQnaCaptura(super.getQuincenaCaptura().intValue());
            super.persistence().get(TnMovtoConceptoPagoDAO.class).save(movtoConceptoPagoBase);
        }
    }

}
