package br.com.adesao.adesoviagens.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

import br.com.adesao.adesoviagens.R;
import br.com.adesao.adesoviagens.modelo.Pacote;
import br.com.adesao.adesoviagens.util.DiasUtil;
import br.com.adesao.adesoviagens.util.MoedaUtil;
import br.com.adesao.adesoviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        Pacote pacoteSaoPaulo = new Pacote("Sāo Paulo", "sao_paulo_sp", 2, new BigDecimal("241.99"));

        TextView local = findViewById(R.id.txtResumoLocal);
        local.setText(pacoteSaoPaulo.getLocal());

        ImageView imgLocal = findViewById(R.id.imgResumoLocal);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacoteSaoPaulo.getImagem());

        TextView dias = findViewById(R.id.txtResumoDias);
        dias.setText(DiasUtil.devolverDiaExtenso(pacoteSaoPaulo.getDias()));

        TextView preco = findViewById(R.id.txtResumoPreco);
        preco.setText(MoedaUtil.formataParaBrasileira(pacoteSaoPaulo.getPreco()).toString());

    }
}
