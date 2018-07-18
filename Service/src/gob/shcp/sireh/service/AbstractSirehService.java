package gob.shcp.sireh.service;

import gob.shcp.fsn.model.Model;
import gob.shcp.fsn.service.AbstractService;

import gob.shcp.sireh.data.jdbc.TcAtributoPuestoDAO;
import gob.shcp.sireh.data.jdbc.TcTabuladorDAO;
import gob.shcp.sireh.data.jdbc.TnRegControlDAO;

import gob.shcp.sireh.domain.jdbc.TcAtributoPuesto;
import gob.shcp.sireh.domain.jdbc.TcAtributoPuestoPK;
import gob.shcp.sireh.domain.jdbc.TcTabulador;
import gob.shcp.sireh.domain.jdbc.TcTabuladorPK;
import gob.shcp.sireh.domain.jdbc.TnRegControl;

import gob.shcp.sireh.model.nomina.QnaCapturaDTO;

import gob.shcp.sireh.service.parser.Parser;
import gob.shcp.sireh.service.parser.ParserService;

import java.io.InputStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Map;

public abstract class AbstractSirehService extends AbstractService implements ParserService {

    private QnaCapturaDTO quincenaVigente;
    private long lastUpdated;

    public String getApFin() {
        return super.configuration().getString("AP_FIN");
    }

    public Integer getHerramientaAuxiliar() {
        return super.configuration().getNumber("HERRAMIENTA_AUXILIAR").intValue();
    }

    /**
     * Metodo encargado de obtener el Movimiento de Personal con base en su id.
     * @author Oscar S.
     * @param  idMovtoPersona String
     * @return Integer
     */
    public Integer getMovimientoPersonal(String idMovtoPersona) {
        return super.configuration().getNumber("movCode", idMovtoPersona).intValue();
    }

    /**
     * Metodo encargado de obtener la Quincena de Captura.
     * @author Gualberto G.
     * @return quincenaVigente QnaCapturaDTO
     */
    public QnaCapturaDTO getQuincenaCaptura() {
        if (lastUpdated == 0 || (System.currentTimeMillis() - super.configuration().getNumber("UPDATE_QNA").longValue()) > lastUpdated) {
            List<TnRegControl> listaRegControl = super.persistence().get(TnRegControlDAO.class).findByRcVigente(super.configuration().getString("pensiones", "RC_VIGENTE_S"));
            String qnaCapturaS = listaRegControl.get(0).getRcQnaCaptura().toString();
            QnaCapturaDTO qnaCaptura = new QnaCapturaDTO(qnaCapturaS);
            quincenaVigente = qnaCaptura;
            lastUpdated = System.currentTimeMillis();
        }
        return quincenaVigente;
    }

    /**
     * Metodo encargado de obtener AtributoPuesto.
     * @author Oscar S.
     * @return tcAtributoPuesto TcAtributoPuesto
     */
    public TcAtributoPuesto getAtributoPuesto(String puesto) {
        TcAtributoPuesto tcAtributoPuesto = null;
        TcAtributoPuestoPK tcAtributoPuestoPK = new TcAtributoPuestoPK();

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date ap_fin = new Date();
        try {
            ap_fin = formatoDelTexto.parse(getApFin());
            tcAtributoPuestoPK.setApFin(ap_fin);
            tcAtributoPuestoPK.setIdAtributoPuesto(puesto);
            tcAtributoPuesto = super.persistence().get(TcAtributoPuestoDAO.class).getById(tcAtributoPuestoPK);
        } catch (Exception e) {
            super.throwServiceException(e.getCause(), "sireh.error.atributopuesto");
        }
        return tcAtributoPuesto;
    }

    /**
     * Metodo encargado de rellenar cadenas con ceros a la izquierda de acuerdo al numero de posiciones deseado.
     * @author Oscar S.
     * @return String
     */
    public String rellenaCeros(int numero, int posiciones) {
        Formatter fmt = new Formatter();
        fmt.format("%0" + posiciones + "d", numero);
        return fmt.toString();
    }

    /**
     * Metodo encargado de convertir objetos de tipo Date a String.
     * @author Oscar S.
     * @return dateConverte String
     */
    public String dateToString(Date dateToConvert) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date ap_fin = new Date();
        String dateConverted = "";
        try {
            dateConverted = df.format(dateToConvert);
        } catch (Exception e) {
        }
        return dateConverted;
    }
    
    public String dateToString(Date dateToConvert, String formato) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        String dateToStr = "";
            dateToStr = simpleDateFormat.format(dateToConvert);
        return dateToStr;
    }

    /**
     * Metodo encargado de obtener TcTabulador.
     * @author Oscar S.
     * @return tcTabulador TcTabulador
     */
    public TcTabulador getTabulador(TcAtributoPuesto tcAtributoPuesto, Integer rango, Integer zonaEconomica) {
        TcTabulador tabulador = null;
        try {
            TcTabuladorPK tcTabuladorPK = new TcTabuladorPK();
            tcTabuladorPK.setIdNivelPto(tcAtributoPuesto.getIdNivelPto());
            tcTabuladorPK.setIdRango(rango);
            tcTabuladorPK.setIdZonaEcon(zonaEconomica);
            tcTabuladorPK.setTabFin(tcAtributoPuesto.getApFin());
            tabulador = super.persistence().get(TcTabuladorDAO.class).getById(tcTabuladorPK);
        } catch (Exception e) {
            super.throwServiceException(e.getCause(), "sireh.error.tabulador");
        }
        return tabulador;
    }

    /**
     * Metodo encargado de obtener la suma del Sueldo + Compensacion con base en el Tabulador TC_ATRIBUTO_PUESTO.
     * @author Oscar S.
     * @param  idPuesto String
     * @param  idZonaEco Integer
     * @return Double
     */
    public Double getSumaSueldoCompensacion(String idPuesto, Integer idZonaEco) {
        // TcAtributoPuesto
        TcAtributoPuesto tcAtributoPuesto = getAtributoPuesto(idPuesto);

        // TcTabulador
        TcTabulador tcTabulador = getTabulador(tcAtributoPuesto, getHerramientaAuxiliar(), idZonaEco);

        // La suma de dobles se redondea siempre a dos decimales.
        return (int)Math.round((tcTabulador.getTabSueldo() + tcTabulador.getTabCompensacion()) * 100) / 100d;
    }

    public <T extends Model> List<T> parseFile(Parser parser, InputStream data, final Class<T> modelClass) {
        return parser.parseFile(data, modelClass);
    }

    public <T extends Model> List<T> parseLines(Parser parser, InputStream data, int begin, int fin, final Class<T> modelClass) {
        return parser.parseLines(data, begin, fin, modelClass);
    }

    public <T extends Model> List<T> parseFrom(Parser parser, InputStream data, int begin, final Class<T> modelClass) {
        return parser.ParseFrom(data, begin, modelClass);
    }

    public <T extends Model> List<T> parseFile(Parser parser, InputStream data, final Class<T> modelClass, Map errors) {
        return parser.parseFile(data, modelClass, errors);
    }

    public <T extends Model> List<T> parseLines(Parser parser, InputStream data, int begin, int fin, final Class<T> modelClass, Map errors) {
        return parser.parseLines(data, begin, fin, modelClass, errors);
    }

    public <T extends Model> List<T> parseFrom(Parser parser, InputStream data, int begin, final Class<T> modelClass, Map errors) {
        return parser.parseFrom(data, begin, modelClass, errors);
    }
}
