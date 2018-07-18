package gob.shcp.sireh.data.jdbc;

import gob.shcp.fsn.data.annotation.FindByNamedQuery;
import gob.shcp.sireh.domain.jdbc.CustomTdEmpleadoMerito;
import gob.shcp.sireh.domain.jdbc.CustomTdEmpleadoPlazaPuesto;
import gob.shcp.sireh.domain.jdbc.CustomTnConceptoPagadoXML;
import gob.shcp.sireh.domain.jdbc.CustomTnHistoricoPagoXML;
import gob.shcp.sireh.domain.jdbc.Item;
import gob.shcp.sireh.domain.jdbc.TdEmpleado;
import gob.shcp.sireh.domain.jdbc.oficinaVirtual.tramites.PeriodoVacacional;


import java.util.List;


public interface QueryTdEmpleadoDAO extends TdEmpleadoDAO{
    
    @FindByNamedQuery(name="empleadoPlazaPuestoById", value=CustomTdEmpleadoPlazaPuesto.class)
    List<CustomTdEmpleadoPlazaPuesto> getEmpleadoPlazaPuestoById(String rfc_empleado);
 
    @FindByNamedQuery(name="empleadoByIdRfcYRfcUnico", value=CustomTdEmpleadoMerito.class)
    List<CustomTdEmpleadoMerito> findEmpleadoByIdRfcYRfcUnico( Integer hp_qna_pago, String tn_nmp_op );
    
    
    @FindByNamedQuery(name="empleadoByRfcResumenMerito", value=CustomTdEmpleadoMerito.class)
    List<CustomTdEmpleadoMerito> findEmpleadoByRfcResumenMerito(String rfc_empleado);
    
    @FindByNamedQuery(name="tcUltimoPagoPuntualidadResumenMerito", value=CustomTdEmpleadoMerito.class)
    List<CustomTdEmpleadoMerito> findEmpleadoUltimoPagoPuntualidadResumenMerito(String td_nmr_rfc);
    
    @FindByNamedQuery(name="tcUltimoPagoConsecutividadResumenMerito", value=CustomTdEmpleadoMerito.class)
    List<CustomTdEmpleadoMerito> findEmpleadoUltimoPagoConsecutividadResumenMerito(String td_nmr_rfc);
    
    @FindByNamedQuery(name="empleadoByRfc", value=TdEmpleado.class)
    List<TdEmpleado> findEmpleadoByRfc(String rfc);
    
    @FindByNamedQuery(name="empleadoByIdRfcYRfcUnicoEmpleado", value=CustomTdEmpleadoMerito.class)
    List<CustomTdEmpleadoMerito> findEmpleadoByIdRfcYRfcUnicoEmpleado(String rfc_unico, Integer hp_qna_pago);
    
    @FindByNamedQuery(name="datosSolicIndivVacaciones", value=PeriodoVacacional.class)
    List<PeriodoVacacional> getDatosUsuario(String rfc);
    
    @FindByNamedQuery(name="tcVacacionesEstatusPaginador", value=Item.class)
    List<Item> getVacacionesEstatus();
    
}
