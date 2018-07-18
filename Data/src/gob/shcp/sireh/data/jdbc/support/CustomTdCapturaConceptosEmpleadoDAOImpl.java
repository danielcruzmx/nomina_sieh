package gob.shcp.sireh.data.jdbc.support;

import gob.shcp.fsn.data.support.JdbcDAO;
import gob.shcp.sireh.domain.jdbc.DatosConceptoEmpleado;
import gob.shcp.sireh.domain.jdbc.DatosEmpleadoCpto;

import gob.shcp.sireh.domain.jdbc.MovtoConceptoPago;
import gob.shcp.sireh.domain.jdbc.TnMovtoConceptoPago;

import java.math.BigDecimal;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class CustomTdCapturaConceptosEmpleadoDAOImpl extends JdbcDAO implements CustomTdCapturaConceptosEmpleadoDAO {
    public CustomTdCapturaConceptosEmpleadoDAOImpl() {   }
    
    public DatosEmpleadoCpto buscarDatosEmpleadoCpto(java.lang.String rfcEmpleado, Map<String, Map<String, String>> dimensions, String operationalYear){
        try {
            return super.findByDimensionAndNamedQuery(DatosEmpleadoCpto.class, "Q1_DatosEmpleadoConCpto", operationalYear, dimensions, new Object[]{rfcEmpleado}).get(0);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public DatosConceptoEmpleado buscarDetalleConceptoEmpleado(DatosConceptoEmpleado datosConceptoEmpleado){
        return  super.findByNamedQuery(DatosConceptoEmpleado.class ,"SQLBuscarDetalleConceptoEmpleado", new Object[]{datosConceptoEmpleado.getRfcEmpleado(), datosConceptoEmpleado.getIdTipoCpto(), datosConceptoEmpleado.getIdConcepto()}).get(0);
    }
    
    public DatosConceptoEmpleado buscarDetalleConceptoEmpleadoBis(DatosConceptoEmpleado datosConceptoEmpleado){
        return  super.findByNamedQuery(DatosConceptoEmpleado.class ,"SQLBuscarDetalleConceptoEmpleadoBis", new Object[]{datosConceptoEmpleado.getRfcEmpleado(), datosConceptoEmpleado.getIdTipoCpto(), datosConceptoEmpleado.getIdConcepto()}).get(0);
    }
    
    public DatosConceptoEmpleado detalleConceptoEmpleadoActualizacion(DatosConceptoEmpleado datosConceptoEmpleado){
        DatosConceptoEmpleado retorno = null;
        try{
            retorno = super.findByNamedQuery(DatosConceptoEmpleado.class ,"SQLDetalleConceptoEmpleadoActualizacion", new Object[]{datosConceptoEmpleado.getIdTipoCpto(), datosConceptoEmpleado.getIdConcepto()}).get(0);
        }   catch(Exception e){ e.printStackTrace(); }
        return retorno;
    }
    
    public DatosConceptoEmpleado detalleConceptosTipoO(String idTipoCpto, String idConcepto, String rfcEmpleado){
        return  super.findByNamedQuery(DatosConceptoEmpleado.class ,"detalleConceptosTipoO", new Object[]{idTipoCpto, idConcepto, rfcEmpleado}).get(0);
    }
        
    public void eliminaConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto){
        super.executeByNamedQuery("SQLEliminaConceptoEmpleado", datosEmpleadoCpto.getMcpQnaCancelo(),  datosEmpleadoCpto.getMcpRefCancela(), datosEmpleadoCpto.getUsuario(), datosEmpleadoCpto.getRfcEmpleado(), datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto());
    }
    
    public Map<String, Object> colsultaTcCptsPagoCaptOpcRdbuttons(String idTipoCpto, String idCptoPago){
        Map<String, Object> opciones = null;
        Map<String, Object> valores = null;
        Map<String, Object> opcRdButtons = new HashMap<String, Object>();
        
        String sqlO = super.getQueryDefinition("opcionesRdbtnTcCptoPagoCptra");
        opciones = super.getJdbcTemplate().queryForList(sqlO, new Object[]{idTipoCpto, idCptoPago}).get(0);
        
        String sqlV = super.getQueryDefinition("valoresRdbtnTcCptoPagoCptra");
        valores = super.getJdbcTemplate().queryForList(sqlV, new Object[]{idTipoCpto, idCptoPago}).get(0);
           
        Iterator itOpc = opciones.entrySet().iterator();
        Iterator itVal = valores.entrySet().iterator();
        
        while(itOpc.hasNext() && itVal.hasNext()){
            Map.Entry Opc = (Map.Entry) itOpc.next();
            Map.Entry Val = (Map.Entry) itVal.next();
            if(Opc.getValue() != null){   opcRdButtons. put(Opc.getValue().toString(), Val.getValue());   }
        }
        Map<String, Object> sortedQuincenas = new TreeMap<String, Object>(opcRdButtons);
        return sortedQuincenas;
    }
    
    public void agregarConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto){
        super.executeByNamedQuery("agregarConceptoEmpleado", new Object[]{datosEmpleadoCpto.getRfcEmpleado(), datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto(), datosEmpleadoCpto.getMcpRefCaptura(), datosEmpleadoCpto.getMcpQnaIni(),datosEmpleadoCpto.getMcpHorasDias(), datosEmpleadoCpto.getMcpMonto(), datosEmpleadoCpto.getMcpPorcentaje(), datosEmpleadoCpto.getMcpQnaIni(), datosEmpleadoCpto.getMcpQnaFin(), datosEmpleadoCpto.getMcpQnaADescontar(), datosEmpleadoCpto.getUsuario()});
    }
    
    public void agregarConceptoEmpleadoPAX(DatosEmpleadoCpto datosEmpleadoCpto){
        String concepto = null;
        String idSitCaptura = null;
        Map<String, Object> opcRdButtons = new HashMap<String, Object>();
        DatosEmpleadoCpto datosEmpleadoCptoVar = new DatosEmpleadoCpto();
        opcRdButtons = colsultaTcCptsPagoCaptOpcRdbuttons(datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto()); // Aqui idTipoCpto= 'P' idConcepto= 'AX'
        Iterator itItem = opcRdButtons.entrySet().iterator();
        Iterator itItem2 = opcRdButtons.entrySet().iterator();
        
        // ****** 1 ****** concepto que sera signado.
        while(itItem.hasNext()){
            Map.Entry item = (Map.Entry) itItem.next();
            if(item.getValue().toString().equals(datosEmpleadoCpto.getOpcionRdButton()) ){
                concepto = (String )item.getKey();
            }
        }
        
        // ****** 2 ****** buscar el concepto del tipo PAx y darlo de baja.
        datosEmpleadoCpto.setIdTipoCpto(datosEmpleadoCpto.getIdTipoCpto() + "");
        while(itItem2.hasNext()){
            Map.Entry item2 = (Map.Entry) itItem2.next();
            String conceptoVar = item2.getKey() + "";
            try {  
                idSitCaptura = super.findByNamedQuery(DatosEmpleadoCpto.class ,"conceptoPAxConSituacionCaptura", new Object[]{datosEmpleadoCpto.getIdTipoCpto(), conceptoVar, datosEmpleadoCpto.getRfcEmpleado()}).get(0).getIdSitCaptura();
            } catch (Exception e) {  e.printStackTrace();  idSitCaptura = null;   }
            if((idSitCaptura != null) && (idSitCaptura.equals("V"))){
                datosEmpleadoCpto.setIdConcepto(item2.getKey()+ "");
                datosEmpleadoCpto.setMcpRefCancela(null);
                eliminaConceptoEmpleado(datosEmpleadoCpto);
            }
        }
        
        // ****** 3 ****** incertar el nuevo concepto.
        if(datosEmpleadoCpto.getIdConcepto().equalsIgnoreCase("AX")){
           datosEmpleadoCpto.setMcpPorcentaje(new BigDecimal(0) );
           datosEmpleadoCpto.setMcpQnaADescontar(new Integer(0));
           datosEmpleadoCpto.setMcpHorasDias(new BigDecimal(0));
           super.executeByNamedQuery("agregarConceptoEmpleado", new Object[]{datosEmpleadoCpto.getRfcEmpleado(), datosEmpleadoCpto.getIdTipoCpto(), concepto, datosEmpleadoCpto.getMcpRefCaptura(), datosEmpleadoCpto.getMcpQnaIni(), datosEmpleadoCpto.getMcpHorasDias(), datosEmpleadoCpto.getMcpMonto(), datosEmpleadoCpto.getMcpPorcentaje(), datosEmpleadoCpto.getMcpQnaIni(), datosEmpleadoCpto.getMcpQnaFin(), datosEmpleadoCpto.getMcpQnaADescontar(), datosEmpleadoCpto.getUsuario()});
        }
    }
    
    public void actualizarConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto) {
        super.executeByNamedQuery("SQLEliminaConceptoEmpleadoEnModifica", datosEmpleadoCpto.getMcpQnaCancelo(), 
                                  datosEmpleadoCpto.getMcpRefCancela(), datosEmpleadoCpto.getUsuario(), 
                                  datosEmpleadoCpto.getRfcEmpleado(), datosEmpleadoCpto.getIdTipoCpto(), 
                                  datosEmpleadoCpto.getIdConcepto());
        super.executeByNamedQuery("agregarConceptoEmpleado", 
                                  new Object[] { datosEmpleadoCpto.getRfcEmpleado(), datosEmpleadoCpto.getIdTipoCpto(), 
                                                 datosEmpleadoCpto.getIdConcepto(), 
                                                 datosEmpleadoCpto.getMcpRefCaptura(), 
                                                 datosEmpleadoCpto.getMcpQnaCaptura(), 
                                                 datosEmpleadoCpto.getMcpHorasDias(), datosEmpleadoCpto.getMcpMonto(), 
                                                 datosEmpleadoCpto.getMcpPorcentaje(), 
                                                 datosEmpleadoCpto.getMcpQnaIni(), datosEmpleadoCpto.getMcpQnaFin(), 
                                                 datosEmpleadoCpto.getMcpQnaADescontar(), 
                                                 datosEmpleadoCpto.getUsuario() });
    }
    
    public void adeudoSaveConceptoEmpleado(DatosEmpleadoCpto datosEmpleadoCpto){
        TnMovtoConceptoPago tnMovtoConceptoPago = new TnMovtoConceptoPago();
        tnMovtoConceptoPago = super.findByNamedQuery(TnMovtoConceptoPago.class, "findByFilters", new Object[]{datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto(), datosEmpleadoCpto.getRfcEmpleado()}).get(0); // 'P ' ;  'A5 '
        super.executeByNamedQuery("sqlUpdateAdeudoConceptoEmpleado", datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto(), datosEmpleadoCpto.getRfcEmpleado());
        super.executeByNamedQuery("sqlAddAdeudoConceptoEmpleado", datosEmpleadoCpto.getRfcEmpleado(), tnMovtoConceptoPago.getIdTercero(), datosEmpleadoCpto.getIdTipoCpto(), datosEmpleadoCpto.getIdConcepto(), tnMovtoConceptoPago.getMcpRefCaptura(), tnMovtoConceptoPago.getMcpRefCancela(), tnMovtoConceptoPago.getMcpQnaCaptura(), tnMovtoConceptoPago.getMcpUltQnaProcesa(), tnMovtoConceptoPago.getMcpFecIncidencia(), tnMovtoConceptoPago.getMcpHorasDias(), tnMovtoConceptoPago.getMcpMonto(), tnMovtoConceptoPago.getMcpPorcentaje(), tnMovtoConceptoPago.getMcpQnaIni(), tnMovtoConceptoPago.getMcpQnaFin(), tnMovtoConceptoPago.getMcpQnaAplicadas(), tnMovtoConceptoPago.getMcpQnaADescontar(), tnMovtoConceptoPago.getMcpQnaCancelo(), datosEmpleadoCpto.getMcpMontoAdeudo(), datosEmpleadoCpto.getMcpFecIniAdeudo(), datosEmpleadoCpto.getMcpFecFinAdeudo(), datosEmpleadoCpto.getMcpQnasAdeudo(), datosEmpleadoCpto.getUsuario());
     }
    
    public MovtoConceptoPago detalleConceptoDelEmpleado(String idTipoCpto, String  idConcepto, String rfcEmpleado){
        TnMovtoConceptoPago     tnMovtoConceptoPago     = new TnMovtoConceptoPago();
        DatosConceptoEmpleado   datosConceptoEmpleado   = new DatosConceptoEmpleado();
        MovtoConceptoPago       movtoConceptoPago       = new MovtoConceptoPago();
        MovtoConceptoPago       retorno                 = null;
        
        tnMovtoConceptoPago     = super.findByNamedQuery(TnMovtoConceptoPago.class, "findByFilters", new Object[]{idTipoCpto, idConcepto, rfcEmpleado}).get(0);
        
        datosConceptoEmpleado   = super.findByNamedQuery(DatosConceptoEmpleado.class, "findByFilters2", new Object[]{idTipoCpto, idConcepto, rfcEmpleado}).get(0);
        
        if( (idTipoCpto.equals("P") && idConcepto.equals("A1")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A2")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A3")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A4")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A5")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A6")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A7")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A8")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A9")) ||
            (idTipoCpto.equals("P") && idConcepto.equals("A0")) ){  
            idConcepto = "AX";  
            }
            
       
        movtoConceptoPago.setFecFinAdeudo(tnMovtoConceptoPago.getMcpFecFinAdeudo()==null?new Date():tnMovtoConceptoPago.getMcpFecFinAdeudo());
        movtoConceptoPago.setFecIncidencia(tnMovtoConceptoPago.getMcpFecIncidencia()==null?new Date():tnMovtoConceptoPago.getMcpFecIncidencia());
        movtoConceptoPago.setFecIniAdeudo(tnMovtoConceptoPago.getMcpFecIniAdeudo()==null?new Date():tnMovtoConceptoPago.getMcpFecIniAdeudo());
        movtoConceptoPago.setFecModifico(tnMovtoConceptoPago.getFecModifico()==null?new Date():tnMovtoConceptoPago.getFecModifico());
        movtoConceptoPago.setHorasDias(tnMovtoConceptoPago.getMcpHorasDias() == null? new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpHorasDias()));
        movtoConceptoPago.setIdConcepto(idConcepto);
        movtoConceptoPago.setIdSitCaptura(tnMovtoConceptoPago.getIdSitCaptura()==null?"":tnMovtoConceptoPago.getIdSitCaptura());
        movtoConceptoPago.setIdTercero(tnMovtoConceptoPago.getIdTercero()==null?"":tnMovtoConceptoPago.getIdTercero());
        movtoConceptoPago.setIdTipoCpto(tnMovtoConceptoPago.getIdTipoCpto());
        movtoConceptoPago.setMcpQnaCaptura(tnMovtoConceptoPago.getMcpQnaCaptura()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaCaptura()));
        movtoConceptoPago.setMcpRefCancela(tnMovtoConceptoPago.getMcpRefCancela()==null?"":tnMovtoConceptoPago.getMcpRefCancela());
        movtoConceptoPago.setMcpRefCaptura(tnMovtoConceptoPago.getMcpRefCaptura()==null?"":tnMovtoConceptoPago.getMcpRefCaptura());
        movtoConceptoPago.setMcpRfc(tnMovtoConceptoPago.getMcpRfc()==null?"":tnMovtoConceptoPago.getMcpRfc());
        movtoConceptoPago.setMonto(tnMovtoConceptoPago.getMcpMonto()==null?new Double(0):tnMovtoConceptoPago.getMcpMonto());
        movtoConceptoPago.setMontoAdeudo(tnMovtoConceptoPago.getMcpMontoAdeudo()==null?new Double(0):tnMovtoConceptoPago.getMcpMontoAdeudo());
        movtoConceptoPago.setPorcentaje(tnMovtoConceptoPago.getMcpPorcentaje()==null?new Float(0):tnMovtoConceptoPago.getMcpPorcentaje());
        movtoConceptoPago.setQnasAdeudo(tnMovtoConceptoPago.getMcpQnasAdeudo() == null? new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnasAdeudo()));
        movtoConceptoPago.setQnaAplicadas(tnMovtoConceptoPago.getMcpQnaAplicadas()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaAplicadas()));
        movtoConceptoPago.setQnaADescontar(tnMovtoConceptoPago.getMcpQnaADescontar()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaADescontar()));
        movtoConceptoPago.setQnaCancelo(tnMovtoConceptoPago.getMcpQnaCancelo() == null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaCancelo()));
        movtoConceptoPago.setQnaFin(tnMovtoConceptoPago.getMcpQnaFin()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaFin()));
        movtoConceptoPago.setQnaIni(tnMovtoConceptoPago.getMcpQnaIni()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpQnaIni()));
        movtoConceptoPago.setUltimaQnaProcesa(tnMovtoConceptoPago.getMcpUltQnaProcesa()==null?new BigDecimal(0):new BigDecimal(tnMovtoConceptoPago.getMcpUltQnaProcesa()));
        movtoConceptoPago.setUsuario(tnMovtoConceptoPago.getUsuario()==null?"":tnMovtoConceptoPago.getUsuario());
        movtoConceptoPago.setDescSitCaptura(datosConceptoEmpleado.getDescSitCaptura()==null?"":datosConceptoEmpleado.getDescSitCaptura());
        movtoConceptoPago.setDescConPag(datosConceptoEmpleado.getDescConPag()==null?"":datosConceptoEmpleado.getDescConPag());
        
        try{
            datosConceptoEmpleado = super.findByNamedQuery(DatosConceptoEmpleado.class, "findByFilters3", new Object[]{idTipoCpto, idConcepto}).get(0);
        } catch(Exception e){ 
            e.printStackTrace();
            datosConceptoEmpleado = null;
            retorno = null;
         }
        
        if(datosConceptoEmpleado != null){
            movtoConceptoPago.setTipoCaptura(datosConceptoEmpleado.getCpcTipoCaptura()==null?"":datosConceptoEmpleado.getCpcTipoCaptura());
            movtoConceptoPago.setTipoCalculo(datosConceptoEmpleado.getCpcTipoCalculo()==null?"":datosConceptoEmpleado.getCpcTipoCalculo());
            movtoConceptoPago.setPermanente(datosConceptoEmpleado.getCpcPermanente()==null?"":datosConceptoEmpleado.getCpcPermanente());
            movtoConceptoPago.setSubtipo(datosConceptoEmpleado.getCpcSubtipo()==null?"":datosConceptoEmpleado.getCpcSubtipo());
            retorno = movtoConceptoPago;
        }
        return retorno;
    }
}
