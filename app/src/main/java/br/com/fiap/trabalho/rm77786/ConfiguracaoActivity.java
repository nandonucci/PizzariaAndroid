package br.com.fiap.trabalho.rm77786;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConfiguracaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);
    }

    public void btnGravar(View view) {

        EditText edtText = findViewById(R.id.edtConfigSplash);
        int tempo = Integer.parseInt(edtText.getText().toString());

        tempo *= 1000;

        if(tempo < 3000 || tempo > 30000){

            Toast.makeText(this, R.string.tempo_invalido, Toast.LENGTH_SHORT).show();

        } else {
            SharedPreferences.Editor editor = getSharedPreferences("userPrefs", MODE_PRIVATE).edit();
            editor.putInt("splTime", tempo);
            editor.apply();
            Toast.makeText(this, R.string.tempo_alterado, Toast.LENGTH_SHORT).show();
        }
    }
}
