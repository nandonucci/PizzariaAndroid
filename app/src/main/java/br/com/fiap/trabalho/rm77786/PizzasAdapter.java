package br.com.fiap.trabalho.rm77786;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class PizzasAdapter extends BaseAdapter {

    private Context context;
    private List<Pizza> pizzas;

    public PizzasAdapter(Context context, List<Pizza> pizzas) {
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public int getCount(){
        return pizzas.size();
    }

    @Override
    public Object getItem(int position){
        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        Pizza pizza = (Pizza) getItem(position);

        View view = layoutInflater.inflate(R.layout.listaspizzas, null);
        ImageView imgPizza = view.findViewById(R.id.imgPizza);
        TextView txtNome = view.findViewById(R.id.txtNome);
        TextView txtPreco = view.findViewById(R.id.txtPreco);

        imgPizza.setImageResource(pizza.getImagem());
        txtNome.setText(pizza.getNome());
        txtPreco.setText("R$" + String.format("%.2f", pizza.getPreco()));

        return view;
    }
}
