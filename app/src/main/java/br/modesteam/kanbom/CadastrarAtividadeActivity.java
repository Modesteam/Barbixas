package br.modesteam.kanbom;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ricardo on 10/04/15.
 */

public class CadastrarAtividadeActivity extends ActionBarActivity {
    EditText txNome, txDescricao, txDatafinal;
    RadioButton rbToDo, rbDoing, rbDone;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastraratividade);

        txNome = (EditText) findViewById(R.id.txNome);
        txDescricao = (EditText) findViewById(R.id.txDescricao);
        txDatafinal = (EditText) findViewById(R.id.txDataFinal);
        rbToDo = (RadioButton) findViewById(R.id.rbToDo);
        rbDoing = (RadioButton) findViewById(R.id.rbDoing);
        rbDone = (RadioButton) findViewById(R.id.rbDone);


    }

    public void cadastraAtividade()
    {
        String nome, descricao, datafinal, status;
        nome = txNome.getText().toString();
        descricao = txDescricao.getText().toString();
        datafinal = txDatafinal.getText().toString();
        if(rbToDo.isChecked())
            status = "ToDo";
        if(rbDoing.isChecked())
            status = "Doing";
        if(rbDone.isChecked())
            status = "Done";


        Intent intent = new Intent();
        intent.setClass(this, ConfirmarAtividadeActivity.class);
        intent.putExtra("nome", txNome.getText().toString());
        startActivity(intent);




    }

}
