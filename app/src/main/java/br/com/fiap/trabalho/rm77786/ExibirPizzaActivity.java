package br.com.fiap.trabalho.rm77786;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ExibirPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_pizza);

        Intent intent = getIntent();
        int posicao = intent.getIntExtra("posicao", -1);
        Pizza pizza = ListagemPizzas.pizzasListadas().get(posicao);

        ImageView imgPizza = findViewById(R.id.exibirPizzaGrande);
        imgPizza.setImageResource(pizza.getImagem());

        TextView nomePizza = findViewById(R.id.nomePizza);
        nomePizza.setText(pizza.getNome());

        TextView precoPizza = findViewById(R.id.precoPizza);
        precoPizza.setText(String.valueOf(pizza.getPreco()));

        TextView ingredientesPizza = findViewById(R.id.ingredientesPizza);
        ingredientesPizza.setText(pizza.getIngredientes());

        TextView alergiaPizza = findViewById(R.id.alergiaPizza);
        alergiaPizza.setText(pizza.getIngredAlergia());

        TextView caloriasPizza = findViewById(R.id.caloriasPizza);
        caloriasPizza.setText(String.valueOf(pizza.getCalorias()));

        RatingBar pontuacaoPizza = findViewById(R.id.pontuacaoPizza);
        pontuacaoPizza.setMax(5);
        pontuacaoPizza.setNumStars(5);
        pontuacaoPizza.setRating(pizza.getPontuacao());
    }


    //Grava o log da Activity
    @Override
    protected void onStart() {
        super.onStart();
        GravaLog.gravaLog(this);
    }
}
