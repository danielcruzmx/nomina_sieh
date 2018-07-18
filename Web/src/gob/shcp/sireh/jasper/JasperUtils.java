package gob.shcp.sireh.jasper;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.jasperreports.engine.JRDefaultScriptlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Clase encargada de comparar fechas en reportes
 * @author
 */
public class JasperUtils extends JRDefaultScriptlet {
    protected final Log logger = LogFactory.getLog(getClass());
    
    public String comparaFechas(String ingresoSHCP) {

        ingresoSHCP = ingresoSHCP.toUpperCase().replace("\\s+", "\\s");
        String nuevaFecha = "";
        String[] campos = ingresoSHCP.toUpperCase().split("\\s+");
        
        for (int i = 0; i < campos.length; i++) {
            nuevaFecha += campos[i] + " ";
        }
        logger.debug("Nueva fecha->" + nuevaFecha.trim());

        Map<String, String> meses = new HashMap<String, String>();
        meses.put("01", "ENERO");
        meses.put("02", "FEBRERO");
        meses.put("03", "MARZO");
        meses.put("04", "ABRIL");
        meses.put("05", "MAYO");
        meses.put("06", "JUNIO");
        meses.put("07", "JULIO");
        meses.put("08", "AGOSTO");
        meses.put("09", "SEPTIEMBRE");
        meses.put("10", "OCTUBRE");
        meses.put("11", "NOVIEMBRE");
        meses.put("12", "DICIEMBRE");

        String retorno = null;
        Date hoy = new Date();
        Date ingrSHCP = null;
        
        String[] splitFecha = nuevaFecha.trim().split(" ");

        Iterator<Map.Entry<String, String>> it = meses.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            if (e.getValue().equalsIgnoreCase(splitFecha[1])) {
                splitFecha[1] = e.getKey();
            }
        }

        ingresoSHCP = splitFecha[0] + "/" + splitFecha[1] + "/" + splitFecha[2];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        try {
            ingrSHCP = sdf.parse(ingresoSHCP);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Calendar calendar1 = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar();

        calendar1.setTimeInMillis(hoy.getTime());
        calendar2.setTimeInMillis(ingrSHCP.getTime());

        calendar1.add(Calendar.DATE, -365);

        int d = calendar2.compareTo(calendar1);

        if (d >= 0) {
            retorno = "SI ( )  NO(X)";
        } // > 0
        else {
            retorno = "SI (X)  NO( )";
        } // < 0

        return retorno;
    }
}
