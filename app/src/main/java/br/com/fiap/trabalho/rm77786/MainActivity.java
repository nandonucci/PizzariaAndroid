package br.com.fiap.trabalho.rm77786;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lstPizza;
    List<Pizza> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //ActionBar
//        Toolbar toolbar = findViewById(R.id.tlbMain);
//        toolbar.setSubtitle(R.string.eu_um_subtitulo);
//        toolbar.setLogo(R.mipmap.ic_launcher_round);
//        setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Listagem das pizzas
        lstPizza = findViewById(R.id.lstPizzas);
        pizzas = ListagemPizzas.pizzasListadas();
        PizzasAdapter adapter = new PizzasAdapter(this, pizzas);
        lstPizza.setAdapter(adapter);

        final Intent intent = new Intent(this, ExibirPizzaActivity.class);

        lstPizza.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent.putExtra("posicao", i);
                startActivity(intent);
            }
        });
    }

    //Grava o log da Activity
    @Override
    protected void onStart() {
        super.onStart();
        GravaLog.gravaLog(this);
    }

    public void teste(View view) {

        Intent intent = new Intent(this, ConfiguracaoActivity.class);
        startActivity(intent);

    }
}
