package com.example.lesson3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class foodAdapter  extends RecyclerView.Adapter<pizza_ViewHolder> {
    private ArrayList<String> foodList ;

    public foodAdapter(ArrayList<String> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public pizza_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new pizza_ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pizza,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull pizza_ViewHolder holder, int position) {
holder.bind(foodList.get(position));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
