package com.example.aula_01.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ReceptorActivity extends AppCompatActivity {
    String nome;
    String sobrenome;
    String idade;

    TextView nome2;
    TextView sobrenome2;
    TextView idade2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent receptor = getIntent();
        Bundle umBundle = receptor.getExtras();

        nome2 = (TextView) findViewById(R.id.textView_nome2);
        sobrenome2 = (TextView) findViewById(R.id.textView_sobrenome2);
        idade2 = (TextView) findViewById(R.id.textView_idade2);

        nome = umBundle.getString("nome");
        sobrenome = umBundle.getString("sobrenome");
        idade = umBundle.getString("idade");

        nome2.setText(nome);
        sobrenome2.setText(sobrenome);
        idade2.setText(idade);




    }

    public void botaoPressionado(View view) {

        Toast.makeText(this,"A torrada queimada",Toast.LENGTH_SHORT).show();
        Intent senderActivity = new Intent(this,SenderActivity.class);
        startActivity(senderActivity);

    }
}
