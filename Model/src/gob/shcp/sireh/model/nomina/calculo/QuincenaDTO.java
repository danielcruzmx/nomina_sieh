package gob.shcp.sireh.model.nomina.calculo;

import gob.shcp.fsn.model.Model;

import java.io.Serializable;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class QuincenaDTO implements Serializable, Model {

    private int quincena;
    private int numero;
    private int anio;
    private int mes;
    private java.util.Date fechaInicial;
    private java.util.Date fechaFinal;
    private int diasQuincena;
    private boolean esPar;

    public QuincenaDTO(int quincena) {
        this.quincena = quincena;
        this.anio = Integer.parseInt(String.valueOf(this.quincena).substring(0, 4));
        this.numero = Integer.parseInt(String.valueOf(this.quincena).substring(4, 6));
        if ((this.numero % 2) == 0)
            this.esPar = true;
        else
            this.esPar = false;
        this.mes = (int)Math.floor((this.numero + 1) / 2);
        this.fechaInicial = qnaAFechaIni();
        this.fechaFinal = qnaAFechaFin();
        long diff = this.fechaFinal.getTime() - this.fechaInicial.getTime();
        this.diasQuincena = (int)(diff / (24 * 60 * 60 * 1000) + 1);
    }

    public QuincenaDTO(java.util.Date fecha) {
        int dia;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        this.anio = Integer.parseInt(dateFormat.format(fecha));
        dateFormat = new SimpleDateFormat("MM");
        this.mes = Integer.parseInt(dateFormat.format(fecha));
        dateFormat = new SimpleDateFormat("dd");
        dia = Integer.parseInt(dateFormat.format(fecha));
        if (dia <= 15) {
            this.numero = this.mes * 2 - 1;
            this.esPar = false;
        } else {
            this.numero = this.mes * 2;
            this.esPar = true;
        }
        this.fechaInicial = fecha;
        this.fechaFinal = qnaAFechaFin();
        long diff = this.fechaFinal.getTime() - this.fechaInicial.getTime();
        this.diasQuincena = (int)(diff / (24 * 60 * 60 * 1000) + 1);
        this.quincena = Integer.parseInt(integerFormat(this.anio, "0000") + integerFormat(this.numero, "00"));
    }

    private String integerFormat(int i, String formato) {
        DecimalFormat df = new DecimalFormat(formato);
        String s = df.format(i);
        return s;
    }

    public int diferenciaQuincenas(QuincenaDTO qna) {
        int ret = 0;
        int anios = qna.anio - this.anio;
        int qnas = anios * 24;
        ret = (qnas + qna.numero) - this.numero;
        if (ret < 0)
            ret = ret * (-1);
        return ret;
    }

    public QuincenaDTO sumaQuincenas(int ctas) {
        int totalQnas = this.numero + ctas;
        int anios = 0;
        int nAnios = 0;
        int nQna = 0;
        if (totalQnas <= 0)
            totalQnas = -24;
        anios = (int)Math.floor((totalQnas - 1) / 24);
        nAnios = this.anio + anios;
        nQna = (this.numero + ctas) - (anios * 24);
        QuincenaDTO oQna = new QuincenaDTO(Integer.parseInt(integerFormat(nAnios, "0000") + integerFormat(nQna, "00")));
        return oQna;
    }

    public List<QuincenaDTO> listaDesde(QuincenaDTO qnaDesde) {
        int dif = 0;
        int q = 0;
        List<QuincenaDTO> lQnas = new ArrayList<QuincenaDTO>();
        dif = this.diferenciaQuincenas(qnaDesde);
        lQnas.add(qnaDesde);
        for (q = 1; q <= dif; q++) {
            QuincenaDTO qna = qnaDesde.sumaQuincenas(q);
            lQnas.add(qna);
        }
        return lQnas;
    }

    /*public List<Quincena> listaHasta(Quincena qnaHasta){
        int dif = 0;
        int q = 0 ;
        List<Quincena> lQnas = new ArrayList<Quincena>();
        dif = this.diferenciaQuincenas(qnaHasta);
        for(q=1 ; q<=dif ; q++){
            Quincena qna = this.sumaQuincenas(q);
            lQnas.add(qna);
        }
        return lQnas;
    }*/

    private java.util.Date qnaAFechaIni() {
        int dia;
        java.util.Date fecha;
        if ((this.numero % 2) == 0)
            dia = 16;
        else
            dia = 1;
        GregorianCalendar diag = new GregorianCalendar(this.anio, this.mes - 1, dia);
        fecha = diag.getTime();
        return fecha;
    }

    private java.util.Date qnaAFechaFin() {
        //GregorianCalendar cal = (GregorianCalendar)GregorianCalendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar(this.anio, this.mes - 1, 1);
        java.util.Date fecha;
        if ((this.numero % 2) == 0) {
            int max = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            GregorianCalendar diag = new GregorianCalendar(this.anio, this.mes - 1, max);
            fecha = diag.getTime();
        } else {
            GregorianCalendar diag = new GregorianCalendar(this.anio, this.mes - 1, 15);
            fecha = diag.getTime();
        }
        return fecha;
    }

    public int getQuincena() {
        return quincena;
    }

    public void setQuincena(int quincena) {
        this.quincena = quincena;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public java.util.Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(java.util.Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public java.util.Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(java.util.Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
