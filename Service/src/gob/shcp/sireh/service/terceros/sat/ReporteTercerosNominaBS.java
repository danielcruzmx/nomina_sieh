package gob.shcp.sireh.service.terceros.sat;

import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.QueryTnHistoricoPagoDAO;

import gob.shcp.sireh.data.jdbc.support.CustomTdPlazaDAO;
import gob.shcp.sireh.data.jdbc.support.CustomTdPlazaDAOImpl;
import gob.shcp.sireh.domain.jdbc.CustomOutputFile;

import java.util.ArrayList;
import java.util.List;

public class ReporteTercerosNominaBS extends AbstractService implements ReporteTercerosNominaService {
    /**
     * Obtiene los complementos del historico de pago por unidad
     * @author Martin C.
     * @param unidades String
     * @return String
     */
    public List<String> getTiposNominaHistPagoByUnidad(List<String> unidades){
        List<String> tn = new ArrayList<String>();
        List<CustomOutputFile> tipoNominasListPrueba = null;
        
        if(!unidades.isEmpty()){
            tipoNominasListPrueba = super.persistence().get(CustomTdPlazaDAO.class).findTiposNominaHistPagoByUnidadPruaba(unidades);
        } else {  tn = new ArrayList<String>();  }
        
        for(CustomOutputFile rs : tipoNominasListPrueba){
            tn.add(rs.getRegistro());
        }
        return tn;
    }
    
    /**
     * Obtiene las quincenas de pago del historico de pago
     * @author Martin C.
     * @param qnaEnd String
     * @return String
     */
    public List<String> getQnasPagoFromHistoricoPago(Integer qnaEnd){
        List<String> qp = new ArrayList<String>();
        List<CustomOutputFile> qnasList = super.persistence().get(QueryTnHistoricoPagoDAO.class).getQnasPagoFromHistoricoPago(qnaEnd);
        for(CustomOutputFile rs : qnasList){
            qp.add(rs.getRegistro());
        }
        return qp;
    }
    
    /**
     * Obtiene los Complementos del historico de pago por unidad y quincena
     * @author Martin C.
     * @param  unidades String
     * @param  qnas String
     * @return String
     */
    public List<String> getComplementosByUnidadQnaPago(List<String> quincenas, List<String> unidades, List<String> tipoNomina){
        List<String> com = new ArrayList<String>();
        List<CustomOutputFile> complementosList = super.persistence().get(CustomTdPlazaDAO.class).findComplementosByUnidadQnaPago(quincenas, unidades, tipoNomina);
        for(CustomOutputFile rs : complementosList){
            com.add(rs.getRegistro());
        }
        return com;
    }
}