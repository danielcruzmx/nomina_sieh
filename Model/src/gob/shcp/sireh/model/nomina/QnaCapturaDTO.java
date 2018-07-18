package gob.shcp.sireh.model.nomina;

import gob.shcp.fsn.model.Model;

import gob.shcp.fsn.service.ServiceException;

import java.util.Calendar;
import java.util.Date;

public class QnaCapturaDTO  implements java.io.Serializable, Model {

    private String anio;
    private String quincena;
    
    
    public QnaCapturaDTO() {
    }

    public QnaCapturaDTO(int anio, int quincena) {
        this.anio = checkAnio(anio);
        this.quincena = checkQuncena(quincena);
    }
    
    
    
    private String checkQuncena(int quincena){
        if(quincena <1 || quincena>24 )
            throw new ServiceException("el parametro debe ser un valor entero entre 1 y 24");
        if (quincena<10) return "0"+quincena;
        else return String.valueOf(quincena);
    }
    
    private String checkAnio(int anio){
        if(anio <1900 || anio >9999 )
            throw new ServiceException("el parametro debe ser un valor entero entre 1900 y 9999");
        else return String.valueOf(anio);
    }
    
    private int getQincenaInt(){
        return Integer.valueOf(quincena);
    }
    
    private int getAnioInt(){
        return Integer.valueOf(anio);
    }
    
    public QnaCapturaDTO(String qnaCaptura){
        anio=checkAnio(Integer.valueOf(qnaCaptura.substring(0,4)));
        quincena=checkQuncena(Integer.valueOf(qnaCaptura.substring(4)));
    }

    public void setAnio(String anio) {
        this.anio = checkAnio(Integer.valueOf(anio));
    }

    public String getAnio() {
        return anio;
    }

    public void setQuincena(String qincena) {
        this.quincena = checkQuncena(Integer.valueOf(qincena));
    }

    public String getQuincena() {
        return quincena;
    }
    

/*
    public int getQuincenaVencida() {
        return quincena == 1 ? 24 : quincena-1;
    }
*/

    public Date getInicioQuincena() {
        int diaIni = getQincenaInt() % 2 == 1? 1: 16;
        int mesIni = (int)Math.ceil(getQincenaInt()/2.0) -1;
        
        Calendar calendar = Calendar.getInstance();
        calendar.set( getAnioInt(), mesIni, diaIni, 12, 0, 0 );
        
        return calendar.getTime();
    }
        
    public Date getFinQuincena() {
        int diaFin = 15;
    
        int mesFin = (int)Math.ceil(getQincenaInt()/2.0) -1;
        
        Calendar calendar = Calendar.getInstance();
        calendar.set( getAnioInt(), mesFin, diaFin, 12, 0, 0 );
        if( getQincenaInt() % 2 == 0 ) {
            calendar.set( Calendar.DAY_OF_MONTH, 1 );
            calendar.add( Calendar.MONTH, 1 );
            calendar.add( Calendar.DAY_OF_MONTH, -1 );
        }
        
        return calendar.getTime();
    }
/*
        private Integer getQuincenaAsInt(Date fecha) {
            Calendar c = Calendar.getInstance();
            c.setTime(fecha);
            int dia = c.get(Calendar.DATE);
            int qna = (c.get(Calendar.MONTH)+1)*2;
            qna = (dia < 16)?qna-1:qna;
            return qna;
        }

        private Integer getQuincenaVencidaAsInt(Date fecha) {
            Calendar c = Calendar.getInstance();
            c.setTime(fecha);
            int dia = c.get(Calendar.DATE);
            int qna = (c.get(Calendar.MONTH)+1)*2;
            qna = (dia < 16)?qna-1:qna;
            return qna == 1 ? 24 : qna-1;
        }

       

        public static QnaCapturaDTO toQuincena(String qna){
            return new QnaCapturaDTO(qna);
        }
*/
        @Override
        public String toString() {
                return anio+quincena;
        }

        public int intValue(){
            return new Integer(this.toString()).intValue();
        }

    public String format(String pattern) {
        String strQna=quincena.toString();
        return pattern.replace("YYYY",this.anio.toString()).replace("QQ",strQna);
    }
}
