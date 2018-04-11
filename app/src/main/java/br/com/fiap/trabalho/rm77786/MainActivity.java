package br.com.fiap.trabalho.rm77786;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
////        Intent intent = new Intent(this, AcessoActivity.class);
////        startActivity(intent);
//
//    }

    ListView lstPizza;
    List<Pizza> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPizza = findViewById(R.id.lstPizzas);

        pizzas = ListagemPizzas.pizzasListadas();

        PizzasAdapter adapter = new PizzasAdapter(this, pizzas);

        lstPizza.setAdapter(adapter);

        lstPizza.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, pizzas.get(i).getIngredAlergia(), Toast.LENGTH_SHORT).show();
            }
        });
    }



}
