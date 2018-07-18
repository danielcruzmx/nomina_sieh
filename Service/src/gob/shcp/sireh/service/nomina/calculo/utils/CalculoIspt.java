package gob.shcp.sireh.service.nomina.calculo.utils;

import gob.shcp.sireh.domain.jdbc.TcIspt;

import java.util.List;

public class CalculoIspt {
    private static List<TcIspt> tablaIspt = null;
    private static List<TcIspt> tablaBrutos = null;

    public CalculoIspt() {
        super();
    }

    public void setTablaIspt(List<TcIspt> tabla) {
        this.tablaIspt = tabla;
    }

    public void setTablaBrutos(List<TcIspt> tabla) {
        this.tablaBrutos = tabla;
    }

    public static Double isr(Double baseGravable) {
        Double ispt = 0.0;
        for (TcIspt next: tablaIspt) {
            if (baseGravable >= next.getIsptLimInf1() && baseGravable <= next.getIsptLimSuperior()) {
                ispt = (baseGravable - next.getIsptLimInf1()) * (next.getIsptExcedente() / 100.0) + next.getIsptCuotaFija();
                break;
            }
        }
        return ispt;
    }

    public static Double bruto(Double base) {
        Double ispt = 0.0;
        for (TcIspt next: tablaBrutos) {
            if (base >= next.getIsptLimInf1() && base <= next.getIsptLimSuperior()) {
                ispt = (base - next.getIsptCuotaFija()) / next.getIsptSueldoBruto2();
                break;
            }
        }
        return ispt;
    }

    public static Double redondear(Double base) {
        Double valor = 0.0;
        valor = Math.rint(base * 100) / 100;
        return valor;
    }
}
