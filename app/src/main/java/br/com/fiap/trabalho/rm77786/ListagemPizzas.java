package br.com.fiap.trabalho.rm77786;

import java.util.ArrayList;
import java.util.List;


public class ListagemPizzas {

    public static List<Pizza> pizzasListadas() {
        List<Pizza> pizzas = new ArrayList<Pizza>();

        Pizza pizza1 = new Pizza("MARGHERITA SPECIALE", 29.90, R.drawable.pizzanum01, "muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado", "Tomate, Alho poró", 5);
        Pizza pizza2 = new Pizza("MARGHERITA SPECIALE", 29.90, R.drawable.pizzanum01, "muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado", "Tomate, Alho poró", 5);
        Pizza pizza3 = new Pizza("MARGHERITA SPECIALE", 29.90, R.drawable.pizzanum01, "muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado", "Tomate, Alho poró", 5);
        Pizza pizza4 = new Pizza("MARGHERITA SPECIALE", 29.90, R.drawable.pizzanum01, "muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado", "Tomate, Alho poró", 5);
        Pizza pizza5 = new Pizza("MARGHERITA SPECIALE", 29.90, R.drawable.pizzanum01, "muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado", "Tomate, Alho poró", 5);

        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);
        pizzas.add(pizza4);
        pizzas.add(pizza5);

        return pizzas;
    }

}


