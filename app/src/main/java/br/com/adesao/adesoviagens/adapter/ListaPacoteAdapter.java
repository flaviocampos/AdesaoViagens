package br.com.adesao.adesoviagens.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;

import br.com.adesao.adesoviagens.R;
import br.com.adesao.adesoviagens.modelo.Pacote;
import br.com.adesao.adesoviagens.util.DiasUtil;
import br.com.adesao.adesoviagens.util.MoedaUtil;
import br.com.adesao.adesoviagens.util.ResourceUtil;

public class ListaPacoteAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private final Context context;


    public ListaPacoteAdapter(List<Pacote> pacotes, Context context) {
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Pacote getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.item_pacote, parent, false);

        Pacote pacote = pacotes.get(position);

        mostralocal(viewCriada, pacote);
        mostraImagem(viewCriada, pacote);
        mostraDias(viewCriada, pacote);
        mostraPreco(viewCriada, pacote);

        return viewCriada;
    }

    private void mostraPreco(View viewCriada, Pacote pacote) {
        TextView preco = viewCriada.findViewById(R.id.txtItemPacoteValor);
        String moedaBrasileira = MoedaUtil.formataParaBrasileira(pacote.getPreco());
        preco.setText(moedaBrasileira);
    }


    private void mostraDias(View viewCriada, Pacote pacote) {
        TextView dias = viewCriada.findViewById(R.id.txtResumoDias);
        dias.setText(DiasUtil.devolverDiaExtenso(pacote.getDias()));
    }


    private void mostraImagem(View viewCriada, Pacote pacote) {
        ImageView imagem = viewCriada.findViewById(R.id.imgItemPacoteLocal);
        Drawable drawableIMG = ResourceUtil.devolveDrawable(context, pacote.getImagem());
        imagem.setImageDrawable(drawableIMG);
    }


    private void mostralocal(View viewCriada, Pacote pacote) {
        TextView local = viewCriada.findViewById(R.id.txtItemPacoteCidade);
        local.setText(pacote.getLocal());
    }
}
