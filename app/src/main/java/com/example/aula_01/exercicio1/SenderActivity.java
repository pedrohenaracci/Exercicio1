package com.example.aula_01.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {
    Button botao_mandar;
    EditText nome;
    EditText sobrenome;
    EditText idade;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        botao_mandar = (Button)findViewById(R.id.botao_mandar);
        nome = (EditText) findViewById(R.id.editText_nome);
        sobrenome = (EditText)findViewById(R.id.editText_sobrenome);
        idade = (EditText) findViewById(R.id.editText_idade);
    }

    public void botaoPressionado(View view) {
        Toast.makeText(this,"Ta pronta a torrada",Toast.LENGTH_SHORT);
        Intent receptorActivity = new Intent(this,ReceptorActivity.class);

        Bundle umBundle = new Bundle();
        umBundle.putString("nome",nome.getText().toString());
        umBundle.putString("sobrenome", sobrenome.getText().toString());
        umBundle.putString("idade",idade.getText().toString());
        receptorActivity.putExtras(umBundle);
        startActivity(receptorActivity);
    }
}

