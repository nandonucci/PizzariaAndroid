package br.com.fiap.trabalho.rm77786;

import java.util.ArrayList;
import java.util.List;


public class ListagemPizzas {

    public static List<Pizza> pizzasListadas() {
        List<Pizza> pizzas = new ArrayList<Pizza>();

        //Informações Pizza 01
        Pizza pizza1 = new Pizza(
                "MARGHERITA SPECIALE",
                29.99,
                R.drawable.pizzanum01,
                "Muzzarela de búfala, decorada com tomate em rodelas, folhas de manjericão e parmesão ralado",
                "Tomate, Alho poró",
                2000,
                5);

        //Informações Pizza 02
        Pizza pizza2 = new Pizza(
                "CASTELÕES",
                31.99,
                R.drawable.pizzanum02,
                "Calabreza fatiada ( pre-assada em forno a lenha) acebolada, coberta com muzzarela especial",
                "Muzzarela especial",
                1670,
                4);

        //Informações Pizza 03
        Pizza pizza3 = new Pizza(
                "QUATRO FORMAGGIO",
                45.99,
                R.drawable.pizzanum03,
                "Combinação harmoniosa de catupiry, muzzarela especial, provolone e parmesão ralado (opcional com gorgonzola)",
                "Muzzarela especial",
                2300,
                3);

        //Informações Pizza 04
        Pizza pizza4 = new Pizza(
                "SICILIANA",
                39.90, R.drawable.pizzanum04,
                "Champignon paris laminado combinado com bacon crocante cobertos com catupiry original",
                "Champignon paris",
                1000,
                4);

        //Informações Pizza 05
        Pizza pizza5 = new Pizza(
                "CATUPIRYE",
                19.90, R.drawable.pizzanum05,
                "Molho de tomate fresco com generosa porção de catupiry original",
                "Tomate",
                800,
                2);

        pizzas.add(pizza1);
        pizzas.add(pizza2);
        pizzas.add(pizza3);
        pizzas.add(pizza4);
        pizzas.add(pizza5);

        return pizzas;
    }

}


