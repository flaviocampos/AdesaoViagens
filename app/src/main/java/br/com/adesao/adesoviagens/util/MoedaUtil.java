package br.com.adesao.adesoviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static String formataParaBrasileira(BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String moedaBrasileira = formatoBrasileiro.format(valor).replace("R$", "R$ ");
        return moedaBrasileira;
    }
}
