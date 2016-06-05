package com.example.danilo.cadastropessoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView txtNome ;
    TextView txtIdade ;
    TextView txtTelefone ;
    TextView txtRG ;
    TextView txtCPF ;
    TextView txtSexo ;
    TextView txtEstadoCivil ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Pega a intent
        Intent intent = getIntent();
        Pessoa pessoa = (Pessoa) intent.getSerializableExtra("pessoa");

        txtNome = (TextView) findViewById(R.id.respostaNome);
        txtIdade = (TextView) findViewById(R.id.respostaIdade);
        txtTelefone = (TextView) findViewById(R.id.respostaTelefone);
        txtRG = (TextView) findViewById(R.id.respostaRG);
        txtCPF = (TextView) findViewById(R.id.respostaCpf);
        txtSexo = (TextView) findViewById(R.id.respostaSexo);
        txtEstadoCivil = (TextView) findViewById(R.id.respostaEstadoCivil);


        txtNome.setText(pessoa.getNome());
        txtIdade.setText(Integer.toString(pessoa.getIdade()));
        txtTelefone.setText(pessoa.getTelefone());
        txtCPF.setText(pessoa.getCpf());
        txtRG.setText(pessoa.getrG());
        txtSexo.setText(pessoa.getSexo());
        txtEstadoCivil.setText(pessoa.getEstadoCivil());



    }
}
