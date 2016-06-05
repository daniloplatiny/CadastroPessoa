package com.example.danilo.cadastropessoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Spinner spnSexo;
    private Spinner spnEstadoCivil;
    private EditText edNome;
    private EditText edIdade;
    private EditText edTelefone ;
    private EditText edCpf ;
    private EditText edRg ;


    // Variaveis de pessoa
    int idade;
    String telefone;
    String cpf;
    String rg;
    String nome;
    String sexo;
    String estadoCivil;


    private ArrayAdapter<String> adpSexo;
    private ArrayAdapter<String> adpEstadoCivil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializa os EditTexts
        edNome = (EditText) findViewById(R.id.editTextNome);
        edIdade = (EditText) findViewById(R.id.editTextIdade);
        edTelefone = (EditText) findViewById(R.id.editTextTeleFone);
        edCpf = (EditText) findViewById(R.id.editTextCpf);
        edRg = (EditText) findViewById(R.id.editTextRg);

        // Inicializa os Spinne
        spnSexo = (Spinner) findViewById(R.id.SpinneSexo);
        spnEstadoCivil = (Spinner) findViewById(R.id.SpinneEstadoCivil);

        ArrayAdapter adpEstadoCivil = ArrayAdapter.createFromResource(this,R.array.SpinneEstadoCivil,android.R.layout.simple_spinner_item);
        spnEstadoCivil.setAdapter(adpEstadoCivil);

        ArrayAdapter adpSexo = ArrayAdapter.createFromResource(this,R.array.Spinnesexo,android.R.layout.simple_spinner_dropdown_item);
        spnSexo.setAdapter(adpSexo);

        // Aplica a Mascara
        final EditText editCpf = (EditText) findViewById(R.id.editTextCpf);
        editCpf.addTextChangedListener(Mask.insert("###.###.###-##", editCpf));

        final EditText editTelefone = (EditText) findViewById(R.id.editTextTeleFone);
        editTelefone.addTextChangedListener(Mask.insert("(##)####-####", editTelefone));

    }


    public void enviar(View v){

        //Le os dados digitados
        nome = edNome.getText().toString();
        idade =(Integer) Integer.parseInt(edIdade.getText().toString());
        telefone = edTelefone.getText().toString();
        cpf = edCpf.getText().toString();
        rg = edRg.getText().toString();
        sexo = spnSexo.getSelectedItem().toString();
        estadoCivil = spnEstadoCivil.getSelectedItem().toString();


        // Valida os dados

        // Se os dados estiver correto chama proxima activy


        //Inicicialicia um objeto pessoa
        Pessoa thisPessoa = createPessoa();

        //Passa para outra activity
        Intent intentPassPessoa = new Intent(this, Resultado.class);
        intentPassPessoa.putExtra("pessoa",thisPessoa);
        startActivity(intentPassPessoa);


    }

    private Pessoa createPessoa(){
        Pessoa pessoa;
        pessoa = new Pessoa(nome, rg, cpf, telefone, idade, sexo, estadoCivil);
        return pessoa;
    }


}

