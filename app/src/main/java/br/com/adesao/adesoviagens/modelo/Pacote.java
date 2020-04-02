package br.com.adesao.adesoviagens.modelo;

import java.math.BigDecimal;

public class Pacote {

    private  String local;
    private  String imagem;
    private  int dias;
    private  BigDecimal preco;

    public Pacote() {
    }

    public Pacote(String local, String imagem, int dias, BigDecimal preco) {
        this.local = local;
        this.imagem = imagem;
        this.dias = dias;
        this.preco = preco;
    }

    public String getLocal() {
        return local;
    }

    public String getImagem() {
        return imagem;
    }

    public int getDias() {
        return dias;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
