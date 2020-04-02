package br.com.adesao.adesoviagens.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.adesao.adesoviagens.modelo.Pacote;

public class PacoteDAO {

    public List<Pacote> lista() {

        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal(490.15)),
                new Pacote("Foz do Iguaçu", "foz_do_iguacu_pr", 7, new BigDecimal(721.65)),
                new Pacote("Recife", "recife_pe", 8, new BigDecimal(510.45)),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 5, new BigDecimal(234.56)),
                new Pacote("Salvador", "salvador_ba", 7, new BigDecimal(927.45)),
                new Pacote("Sāo Paulo", "sao_paulo_sp", 1, new BigDecimal(174.45))
        ));
        return pacotes;
    }
}
