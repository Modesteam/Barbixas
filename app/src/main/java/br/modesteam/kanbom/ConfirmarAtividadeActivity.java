package br.modesteam.kanbom;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

/**
 * Created by ricardo on 10/04/15.
 */
public class ConfirmarAtividadeActivity  extends ActionBarActivity {

    EditText teste;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_confirmaratividade);

        String nome = extras.getString("nome");
        String descricao = extras.getString("descricao");
        String dataFinal = extras.getString("dataFinal");
        String status = extras.getString("status");
        teste = (EditText) findViewById(R.id.id);
        teste.setText("OIIIIIIII" + nome);

    }

    public void cadastraAtividade()
    {
        ArrayList<Atividade> atividades = new ArrayList<Atividade>();
        //Atividade atividade = new Atividade();

    }

}
