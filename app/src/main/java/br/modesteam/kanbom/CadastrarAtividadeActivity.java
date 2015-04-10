package br.modesteam.kanbom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by ricardo on 10/04/15.
 */
public class CadastrarAtividadeActivity extends ActionBarActivity {
    ArrayList<Atividade> atividades = new ArrayList<Atividade>();
    Atividade atividade = new Atividade();

    atividade.setNome("A");


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastraratividade);
    }

}
