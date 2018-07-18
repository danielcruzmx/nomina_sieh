package gob.shcp.sireh.control.configuracion.movimiento;

import gob.shcp.fsn.control.AbstractController;
import gob.shcp.fsn.control.support.AnnotatedController;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoConceptoPagoDTO;
import gob.shcp.sireh.service.configuracion.movimiento.ConceptoPagoService;
import gob.shcp.sireh.service.configuracion.movimiento.MovimientoConceptosPagoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MovimientoConceptosPagoController
    extends AbstractController
    implements AnnotatedController {

    private static final String consultaViewName = "listaConceptosPago";
    private static final String mantenimientoViewName = "modificacionConceptoPago";

    @RequestMapping
    public String consultaConceptosPago() {
        return super.getViewName( this.consultaViewName );
    }

    @RequestMapping
    public String altaConceptosPago( Model model ) {
        MovimientoConceptoPagoDTO movimientoConceptoPagoDTO = new MovimientoConceptoPagoDTO();
        movimientoConceptoPagoDTO.setIdTipoConceptoPago( "" );
        movimientoConceptoPagoDTO.setTipoMantenimiento( "A" );
        model.addAttribute( movimientoConceptoPagoDTO );
        return super.getViewName( this.mantenimientoViewName );
    }

    @RequestMapping
    public String modificacionConceptosPago( Model model, @RequestParam("id") String id ) {
        String idTipoCpto = "";
        String idCptoPago = "";
        if( id.indexOf( "-" ) != -1 ) {
            String[] tokens = id.split("-");
            if( tokens.length == 2 ) {
                idTipoCpto = tokens[0];
                idCptoPago = tokens[1];
            } else {
                super.throwServiceException( "configuracion.movimientos.concepto.idConceptoPago.error", id );
            }
        } else {
            super.throwServiceException( "configuracion.movimientos.concepto.idConceptoPago.error", id );
        }

        final MovimientoConceptoPagoDTO movimientoConceptoPagoDTO = 
            super.getService(MovimientoConceptosPagoService.class)
                 .getMovimientoConceptosPago( idTipoCpto, idCptoPago );

        movimientoConceptoPagoDTO.setIdTipoConceptoPago( id );
        movimientoConceptoPagoDTO.setTipoMantenimiento( "M" );
        movimientoConceptoPagoDTO.setNumOpciones( ""+movimientoConceptoPagoDTO.calculaNumOpciones() );
        movimientoConceptoPagoDTO.setDescConceptoPago( super.getService(ConceptoPagoService.class)
            .getConceptoPago(idTipoCpto, idCptoPago)
            .getDescConPag() );

        String nivelesPto = movimientoConceptoPagoDTO.getCpcNivelesPto();
        if ( nivelesPto != null && !nivelesPto.equals("") ) {
            movimientoConceptoPagoDTO.setIdsNivelesPto( new ArrayList<String>( Arrays.asList(nivelesPto.replace(".", ",").split(",")) ) );
        }

        model.addAttribute( movimientoConceptoPagoDTO );
        return super.getViewName( this.mantenimientoViewName );
    }

    @RequestMapping
    public String insertConceptosPago( Model model, MovimientoConceptoPagoDTO movimientoConceptoPagoDTO ) {
        return updateConceptosPago( model, true, movimientoConceptoPagoDTO );
    }

    @RequestMapping
    public String updateConceptosPago( Model model, @RequestParam("isNew") boolean isNew,
                                                    MovimientoConceptoPagoDTO movimientoConceptoPagoDTO ) {
        String idTipoConceptoPago = movimientoConceptoPagoDTO.getIdTipoConceptoPago();
        if( idTipoConceptoPago.indexOf( "-" ) != -1 ) {
            String[] ids = idTipoConceptoPago.split( "-" );
            if( ids.length == 2 ) {
                movimientoConceptoPagoDTO.setIdTipoCpto( ids[0] );
                movimientoConceptoPagoDTO.setIdCptoPago( ids[1] );
            } else {
                super.throwServiceException( "configuracion.movimientos.concepto.idConceptoPago.error", idTipoConceptoPago );
            }
        } else {
            super.throwServiceException( "configuracion.movimientos.concepto.idConceptoPago.error", idTipoConceptoPago );
        }
        
        List<String> listaIds = movimientoConceptoPagoDTO.getIdsNivelesPto();
        if( listaIds != null && listaIds.size() != 0 ) {
            movimientoConceptoPagoDTO.setCpcNivelesPto( getStringSepareDelim( listaIds, "." ) );
        }
        
        movimientoConceptoPagoDTO.setIsNew( isNew );
        super.getService(MovimientoConceptosPagoService.class)
             .updateMovimientoConceptosPago( movimientoConceptoPagoDTO,
                                             super.identity().get().getUserID(), isNew );

        super.saveMessage( model, "configuracion.movimientos.concepto.update.ok",
            new Object[]{ movimientoConceptoPagoDTO.getIdTipoCpto()+"-"+movimientoConceptoPagoDTO.getIdCptoPago() } );
        
        return consultaConceptosPago();
    }

    @RequestMapping
    public String cancelarConceptosPago() {
        return consultaConceptosPago();
    }

    private String getStringSepareDelim( List<String> lista, String delim ) {
        StringBuffer buffer = new StringBuffer();
        for (String s: lista) {
            buffer.append(s + delim);
        }
        buffer.delete(buffer.length() - delim.length(), buffer.length());
        return buffer.toString();
    }

}
