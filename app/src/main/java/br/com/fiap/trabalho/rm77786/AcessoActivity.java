package br.com.fiap.trabalho.rm77786;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AcessoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acesso);

    }

    public void acessarConta(View view) {

        EditText edtUsuario = findViewById(R.id.edtUsuario);
        EditText edtSenha = findViewById(R.id.edtSenha);

        if (edtUsuario.getText().toString().toUpperCase().equals("FIAP") && edtSenha.getText().toString().toUpperCase().equals("FIAP") ){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, R.string.verifique_seus_dados, Toast.LENGTH_SHORT).show();
        }

    }
}
