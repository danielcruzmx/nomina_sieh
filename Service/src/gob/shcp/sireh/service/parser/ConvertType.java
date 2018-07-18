package gob.shcp.sireh.service.parser;

import com.blackbear.flatworm.ConversionOption;
import com.blackbear.flatworm.Util;
import com.blackbear.flatworm.errors.FlatwormConversionException;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertType {

    /**
     * Formatea el monto con punto decimal
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public Double convertDecimal(String str, HashMap options) throws FlatwormConversionException {
        try {
            int decimalPlaces = 0;
            ConversionOption conv = (ConversionOption)options.get("decimal-places");

            String decimalPlacesOption = null;
            if (null != conv)
                decimalPlacesOption = conv.getValue();

            boolean decimalImplied = "true".equals(Util.getValue(options, "decimal-implied"));

            if (decimalPlacesOption != null)
                decimalPlaces = Integer.parseInt(decimalPlacesOption);

            if (str.length() == 0)
                return new Double(0.0D);

            if (decimalImplied)
                return new Double(Double.parseDouble(str) / Math.pow(10D, decimalPlaces));
            else
                return Double.parseDouble(str) / 100;

        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    public Double convertDecimalIssste(String str, HashMap options) throws FlatwormConversionException {
        try {
            int decimalPlaces = 0;
            ConversionOption conv = (ConversionOption)options.get("decimal-places");

            String decimalPlacesOption = null;
            if (null != conv)
                decimalPlacesOption = conv.getValue();

            boolean decimalImplied = "true".equals(Util.getValue(options, "decimal-implied"));

            if (decimalPlacesOption != null)
                decimalPlaces = Integer.parseInt(decimalPlacesOption);

            if (str.length() == 0)
                return new Double(0.0D);

            if (decimalImplied)
                return new Double(Double.parseDouble(str) / Math.pow(10D, decimalPlaces));
            else
                return Double.parseDouble(str) / 100;

        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    /**
     * valida RFC en formato AAAA999999
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertRFC(String str, HashMap options) throws FlatwormConversionException {
        try {
            Pattern pat = Pattern.compile("[A-Z]{4}[0-9]{6}");
            Matcher mat = pat.matcher(str.substring(0, 10));
            if (mat.matches()) {

            } else {
                throw new FlatwormConversionException(str);
            }
            return str;
        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    /**
     * valida que los tipo de movimientos sean letras
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertTipoMov(String str, HashMap options) throws FlatwormConversionException {
        try {
            if (str.equalsIgnoreCase("A") || str.equalsIgnoreCase("B") || str.equalsIgnoreCase("M"))
                return str;
            else
                throw new FlatwormConversionException(str);

        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    /**
     * valida que los tipo de movimientos para el issstesean numericos
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertTipoMovIssste(String str, HashMap options) throws FlatwormConversionException {
        try {
            if (str.equalsIgnoreCase("1") || str.equalsIgnoreCase("2") || str.equalsIgnoreCase("3"))
                return str;
            else
                throw new FlatwormConversionException(str);

        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    /**
     * valida que el concepto para fovissste, si es 99999999 el cpto es 64 de lo contrario es 68
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertCharCptoFovi(String str, HashMap options) throws FlatwormConversionException {
        String cpto = "";
        Pattern pat = Pattern.compile("[9]{8}");
        Matcher mat = pat.matcher(str);
        if (mat.matches()) {
            cpto = "64";
        } else {
            cpto = "68";
        }
        return cpto;
    }

    /**
     * 
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public Double convertDecimalFovi(String str, HashMap options) throws FlatwormConversionException {
        try {
            int decimalPlaces = 0;
            ConversionOption conv = (ConversionOption)options.get("decimal-places");

            String decimalPlacesOption = null;
            if (null != conv)
                decimalPlacesOption = conv.getValue();

            boolean decimalImplied = "true".equals(Util.getValue(options, "decimal-implied"));

            if (decimalPlacesOption != null)
                decimalPlaces = Integer.parseInt(decimalPlacesOption);

            if (str.length() == 0)
                return new Double(0.0D);

            if (decimalImplied)
                return new Double(Double.parseDouble(str) / Math.pow(10D, decimalPlaces));
            else {
                Pattern pat = Pattern.compile("[9]{8}");
                Matcher mat = pat.matcher(str);
                if (mat.matches()) {
                    str = "0";
                } else {
                    pat = Pattern.compile("[0]{8}");
                    mat = pat.matcher(str);
                    if (mat.matches()) {
                        str = "850";
                    }
                }
                return Double.parseDouble(str) / 100;
            }
        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
    }

    /**
     * da formato al numero de quincena  a  YYYYDD
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertQna(String str, HashMap options) throws FlatwormConversionException {
        Calendar c = new GregorianCalendar();
        String anio = Integer.toString(c.get(Calendar.YEAR));
        String auxi = "";
        String dia = "";

        try {
            if (str.length() == 6) {
                auxi = str.substring(0, 4);
                if (auxi.equalsIgnoreCase(anio)) {
                } else {
                    auxi = str.substring(2, 6);
                    if (auxi.equalsIgnoreCase(anio)) {
                        dia = str.substring(0, 2);
                        str = anio + dia;
                    }
                }
            } else if (str.length() == 2) {
                str = anio + str;
            } else {
                throw new FlatwormConversionException(str);
            }
        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
        return str;
    }

    /**
     * da formato al numero de quincena  a  YYYYDD
     * @param str
     * @param options
     * @return
     * @throws FlatwormConversionException
     */
    public String convertQnaFin(String str, HashMap options) throws FlatwormConversionException {
        String dia = "";
        String anio = "";

        try {
            dia = str.substring(0, 2);
            anio = str.substring(2, 6);
            str = anio + dia;

        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
        return str;
    }

    public String convertMLLength(String str, HashMap options) throws FlatwormConversionException {
        try {
            if (str.length() <= 157 || str.length() >= 154)
                return str;
        } catch (NumberFormatException ex) {
            throw new FlatwormConversionException(str);
        }
        return str;
    }
    
     /**
      * valida la fecha de incidencia, en los conceptos de control de asistencia.
      * yyyyMMdd ó ddMMyyyy
      * @autor Martin C.
      * @param 
      * @param 
      * @return String
      * @throws FlatwormConversionException
      */
     public String convertFechaIncidencia(String str, HashMap options) throws FlatwormConversionException {
         String yyyyMMdd = str.substring(0, 4) + str.substring(4, 6) + str.substring(6, 8);
         String ddMMyyyy = str.substring(0, 2) + str.substring(2, 4) + str.substring(4, 8);
         String fecha = null;
         
         try {
             SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyyMMdd");
             formatoFecha.setLenient(false);
             formatoFecha.parse(yyyyMMdd);
             fecha = yyyyMMdd;
         }
         catch(Exception e) {
                 try{
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("ddMMyyyy");
                    formatoFecha.setLenient(false);
                    formatoFecha.parse(ddMMyyyy);
                    fecha = ddMMyyyy;
                }
                catch(Exception ex){
                    fecha = "99999999";
                }
        }
        return fecha;
     }
     
}
