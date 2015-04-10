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


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extra = getIntent().getExtras();
        String nome = extra.getString("nome");
        setContentView(R.layout.activity_confirmaratividade);
    }

    public void cadastraAtividade()
    {
        ArrayList<Atividade> atividades = new ArrayList<Atividade>();
        //Atividade atividade = new Atividade();

    }

}
