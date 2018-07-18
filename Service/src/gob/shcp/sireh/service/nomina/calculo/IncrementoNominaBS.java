package gob.shcp.sireh.service.nomina.calculo;

import gob.shcp.fsn.springmodules.rules.drools54.AbstractStatelessRulesService;

import gob.shcp.sireh.data.jdbc.TnRegControlDAO;
import gob.shcp.sireh.data.jdbc.support.CustomCalculoDAO;
import gob.shcp.sireh.data.jdbc.support.QueryTcIsptDAO;

import gob.shcp.sireh.domain.jdbc.ConceptoPago;
import gob.shcp.sireh.domain.jdbc.HistoricoPago;
import gob.shcp.sireh.domain.jdbc.Pago;
import gob.shcp.sireh.domain.jdbc.TcIspt;
import gob.shcp.sireh.domain.jdbc.TdPension;

import gob.shcp.sireh.domain.jdbc.TnRegControl;
import gob.shcp.sireh.model.TnConceptoPagadoDTO;
import gob.shcp.sireh.model.nomina.QnaCapturaDTO;
import gob.shcp.sireh.model.nomina.TdPensionDTO;
import gob.shcp.sireh.model.nomina.calculo.ConceptoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.HistoricoPagoDTO;
import gob.shcp.sireh.model.nomina.calculo.PagoDTO;
import gob.shcp.sireh.model.nomina.calculo.QuincenaDTO;
import gob.shcp.sireh.model.nomina.calculo.incremento.IncrementoNominaDTO;
import gob.shcp.sireh.model.nomina.gestion.NominaDTO;

import gob.shcp.sireh.service.SirehUtils;
import gob.shcp.sireh.service.nomina.calculo.utils.CalculoIspt;

import java.math.BigDecimal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.command.Command;
import org.drools.command.CommandFactory;

public class IncrementoNominaBS extends AbstractStatelessRulesService implements IncrementoNominaService {

    private QnaCapturaDTO quincenaVigente;
    private long lastUpdated;

    public Object execute(Object fact) {
        return null;
    }
    /**
     * Metodo encargado de obtener la Quincena de Captura.
     * @author Gualberto G.
     * @return quincenaVigente QnaCapturaDTO
     */
    public QnaCapturaDTO getQuincenaCaptura() {
        if(lastUpdated==0 || (System.currentTimeMillis() - super.configuration().getNumber("UPDATE_QNA").longValue())> lastUpdated){
            List<TnRegControl> listaRegControl = super.persistence().get(TnRegControlDAO.class).findByRcVigente(super.configuration().getString("pensiones", "RC_VIGENTE_S"));
            String qnaCapturaS = listaRegControl.get(0).getRcQnaCaptura().toString();
            QnaCapturaDTO qnaCaptura = new QnaCapturaDTO(qnaCapturaS);
            quincenaVigente = qnaCaptura;
            lastUpdated=System.currentTimeMillis();
        }
        return quincenaVigente;
    }

    public void getValoresIniciales(IncrementoNominaDTO incrementoNominaDTO) {
        QnaCapturaDTO qnaCapturaDTO = getQuincenaCaptura();

        Integer year = SirehUtils.getCurrentYear();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 1);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.YEAR, year);
        incrementoNominaDTO.setFecIni(cal.getTime());
        incrementoNominaDTO.setQnaProceso(qnaCapturaDTO.intValue());
        incrementoNominaDTO.setFecFin(qnaCapturaDTO.getInicioQuincena());

        Integer limiteInferior = qnaCapturaDTO.intValue();
        limiteInferior = limiteInferior - SirehUtils.getCurrentYear() * 100;
        
        incrementoNominaDTO.setFilterQnaInferior(limiteInferior - 2);
        incrementoNominaDTO.setFilterQnaSuperior(24);
        
        Integer qunaIni = year * 100 + 1;
        
        incrementoNominaDTO.setQnaIni(qunaIni);
        incrementoNominaDTO.setQnaFin(qnaCapturaDTO.intValue());
        
        Calendar calTabAnt = Calendar.getInstance();
        calTabAnt.set(Calendar.DATE, 31);
        calTabAnt.set(Calendar.MONTH, Calendar.DECEMBER);
        calTabAnt.set(Calendar.YEAR, year - 1);
        
        incrementoNominaDTO.setTabAnt(calTabAnt.getTime());
        
        Calendar calTabNvo = Calendar.getInstance();
        calTabNvo.set(Calendar.DATE, 1);
        calTabNvo.set(Calendar.MONTH, Calendar.JANUARY);
        calTabNvo.set(Calendar.YEAR, 2099);
        incrementoNominaDTO.setTabNvo(calTabNvo.getTime());
        
        incrementoNominaDTO.setCompensacionAnt(BigDecimal.valueOf(1100) );
        incrementoNominaDTO.setDespensaAnt(BigDecimal.valueOf(265));
        incrementoNominaDTO.setPrevisionAnt(BigDecimal.valueOf(265));
        incrementoNominaDTO.setServiciosAnt(BigDecimal.valueOf(265));
        incrementoNominaDTO.setTransporteAnt(BigDecimal.valueOf(0));
        
        incrementoNominaDTO.setCompensacionNva(BigDecimal.valueOf(1200));
        incrementoNominaDTO.setDespensaNva(BigDecimal.valueOf(365));
        incrementoNominaDTO.setPrevisionNva(BigDecimal.valueOf(365));
        incrementoNominaDTO.setServiciosNva(BigDecimal.valueOf(335));
        incrementoNominaDTO.setTransporteNva(BigDecimal.valueOf(100));

    }

   
}
