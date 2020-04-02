package br.com.adesao.adesoviagens.util;

public class DiasUtil {
    public static String devolverDiaExtenso(int dias) {

        return dias > 1 ? String.format("%s dias",dias) : String.format("%d dia",dias);
    }
}
