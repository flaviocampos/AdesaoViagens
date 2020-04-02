package br.com.adesao.adesoviagens.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import br.com.adesao.adesoviagens.R;
import br.com.adesao.adesoviagens.adapter.ListaPacoteAdapter;
import br.com.adesao.adesoviagens.dao.PacoteDAO;
import br.com.adesao.adesoviagens.modelo.Pacote;

public class MainActivity extends AppCompatActivity {

    public static final String PACOTES = "Pacotes 09";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(PACOTES);

        configurarAdapter();
       // Intent intent = new Intent(this, ResumoPacoteActivity.class);
       // startActivity(intent);
    }

    private void configurarAdapter() {
        List<Pacote> pcts = new PacoteDAO().lista();
        ListView listaPacotes = findViewById(R.id.lstPrincipalPacotes);
        listaPacotes.setAdapter(new ListaPacoteAdapter(pcts,this));
    }
}
