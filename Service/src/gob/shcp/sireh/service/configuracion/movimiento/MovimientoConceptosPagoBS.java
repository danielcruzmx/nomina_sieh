package gob.shcp.sireh.service.configuracion.movimiento;

import gob.shcp.fsn.service.AbstractService;
import gob.shcp.sireh.data.jdbc.TcConceptoPagoCapturaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomConceptoPagoCapturaDAO;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCaptura;
import gob.shcp.sireh.domain.jdbc.TcConceptoPagoCapturaPK;
import gob.shcp.sireh.model.configuracion.movimientos.MovimientoConceptoPagoDTO;

import java.lang.reflect.Method;

import java.util.Date;


public class MovimientoConceptosPagoBS
    extends AbstractService
    implements MovimientoConceptosPagoService{

    public MovimientoConceptoPagoDTO getMovimientoConceptosPago( String idTipoCpto, String idCptoPago ) {
        TcConceptoPagoCaptura tcCptoPagoCaptura = null;
        try {
            tcCptoPagoCaptura = super.persistence().get(CustomConceptoPagoCapturaDAO.class)
                .getConceptoPago( new TcConceptoPagoCapturaPK(idCptoPago,idTipoCpto) );
        } catch( Exception e ) {
            super.throwServiceException(e,"configuracion.movimientos.concepto.get.error");
        }
        
        return super.transformation().map(tcCptoPagoCaptura,MovimientoConceptoPagoDTO.class );
    }

    public void updateMovimientoConceptosPago( MovimientoConceptoPagoDTO movimientoConceptoPagoDTO, String usuario, boolean isNew ) {
        TcConceptoPagoCaptura tcConceptoPagoCaptura = transformToTcConceptoPagoCaptura( movimientoConceptoPagoDTO );
        try {
            tcConceptoPagoCaptura.setUsuario( usuario );
            tcConceptoPagoCaptura.setFecModifico( new Date() );
            if( isNew ) {
                super.persistence().get(CustomConceptoPagoCapturaDAO.class)
                    .save( tcConceptoPagoCaptura );
            } else {
                super.persistence().get(CustomConceptoPagoCapturaDAO.class)
                    .update( tcConceptoPagoCaptura );
            }
        } catch( Exception e ) {
            super.throwServiceException(e,"configuracion.movimientos.concepto.update.error");
        }
    }

    private TcConceptoPagoCaptura transformToTcConceptoPagoCaptura( MovimientoConceptoPagoDTO movimientoConceptoPagoDTO ) {
        TcConceptoPagoCaptura tcConceptoPagoCaptura = new TcConceptoPagoCaptura();
        tcConceptoPagoCaptura.setIdTipoCpto( movimientoConceptoPagoDTO.getIdTipoCpto() );
        tcConceptoPagoCaptura.setIdCptoPago( movimientoConceptoPagoDTO.getIdCptoPago() );
        tcConceptoPagoCaptura.setCpcTipoCaptura( movimientoConceptoPagoDTO.getCpcTipoCaptura() );
        tcConceptoPagoCaptura.setCpcTipoCalculo( movimientoConceptoPagoDTO.getCpcTipoCalculo() );
        tcConceptoPagoCaptura.setCpcNivelesPto( movimientoConceptoPagoDTO.getCpcNivelesPto() );
        tcConceptoPagoCaptura.setCpcNombramiento( movimientoConceptoPagoDTO.getCpcNombramiento() );
        tcConceptoPagoCaptura.setCpcPermanente( movimientoConceptoPagoDTO.getCpcPermanente() );
        tcConceptoPagoCaptura.setCpcBloque( movimientoConceptoPagoDTO.getCpcBloque() );
        tcConceptoPagoCaptura.setCpcMensaje( movimientoConceptoPagoDTO.getCpcMensaje() );
        tcConceptoPagoCaptura.setCpcSubtipo( movimientoConceptoPagoDTO.getCpcSubtipo() );

        String numOpciones = movimientoConceptoPagoDTO.getNumOpciones();
        Integer numOpc = null;

        try {
            numOpc = Integer.parseInt( numOpciones );
            String methodSetterName = "setCpcOpcion";
            String methodGetterName = "getCpcOpcion";
            Method methodIn;
            Method methodOut;
            String opcionN;
            int postFix;
            int i=1;
            for( ; i<=numOpc; i++ ) {
                if( i == 10 ) {
                    postFix = 0;
                } else {
                    postFix = i;
                }
                methodIn = tcConceptoPagoCaptura.getClass().getMethod( methodSetterName+postFix, String.class );
                methodOut = movimientoConceptoPagoDTO.getClass().getMethod( methodGetterName+postFix );
                opcionN = (String)methodOut.invoke( movimientoConceptoPagoDTO );
                if( opcionN != null ) {
                    methodIn.invoke( tcConceptoPagoCaptura, opcionN );
                } else {
                    methodIn.invoke( tcConceptoPagoCaptura, "" );
                }
                if( postFix == 0 ) {
                    i++;
                    break;
                }
            }
            for( ; i<=10; i++ ) {
                if( i == 10 ) {
                    postFix = 0;
                } else {
                    postFix = i;
                }
                methodIn = tcConceptoPagoCaptura.getClass().getMethod( methodSetterName+postFix, String.class );
                methodIn.invoke( tcConceptoPagoCaptura, "" );
                if( postFix == 0 ) {
                    break;
                }
            }
        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        }

        try {
            String methodSetterName = "setCpcValor";
            String methodGetterName = "getCpcValor";
            Method methodIn;
            Method methodOut;
            Object valorN;
            int postFix;
            int i=1;
            for( ; i<=numOpc; i++ ) {
                if( i == 10 ) {
                    postFix = 0;
                } else {
                    postFix = i;
                }
                methodIn = tcConceptoPagoCaptura.getClass().getMethod( methodSetterName+postFix, Double.class );
                methodOut = movimientoConceptoPagoDTO.getClass().getMethod( methodGetterName+postFix );
                valorN = methodOut.invoke( movimientoConceptoPagoDTO );
                if( valorN != null ) {
                    methodIn.invoke( tcConceptoPagoCaptura, (Double)valorN );
                } else {
                    methodIn.invoke( tcConceptoPagoCaptura, 0d );
                }
                if( postFix == 0 ) {
                    i++;
                    break;
                }
            }
            for( ; i<=10; i++ ) {
                if( i == 10 ) {
                    postFix = 0;
                } else {
                    postFix = i;
                }
                methodIn = tcConceptoPagoCaptura.getClass().getMethod( methodSetterName+postFix, Double.class );
                methodIn.invoke( tcConceptoPagoCaptura, 0d );
                if( postFix == 0 ) {
                    break;
                }
            }
        } catch ( Exception e ) {
            e.printStackTrace();
            return null;
        }

        return tcConceptoPagoCaptura;
    }
    
    
}
