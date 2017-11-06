package com.loftscool.mooneytracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ItemsAdaptor extends RecyclerView.Adapter<ItemsAdaptor.ItemViewHolder> {
    private List<Item> items = new ArrayList<>();

    public ItemsAdaptor() {
        items.add(new Item("Молоко",35));
        items.add(new Item("Зубная счетка",1500));
        items.add(new Item("Сковородка с антипригарным покрытием",2000));
        items.add(new Item("Iphone X",90000));
        items.add(new Item("Вода",30));
        items.add(new Item("Хлеб",25));
        items.add(new Item("Хлеб",25));
        items.add(new Item("Вода",30));
        items.add(new Item("Хлеб",25));
        items.add(new Item("Хлеб",25));
        items.add(new Item("Вода",30));
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ItemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.price.setText(String.valueOf(items.get(position).getPrice()));
        holder.name.setText(items.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    static class ItemViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView price;
        public ItemViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.item_name);
            price = itemView.findViewById(R.id.item_price);


        }
    }
}

