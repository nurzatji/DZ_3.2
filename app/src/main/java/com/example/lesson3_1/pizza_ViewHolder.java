package com.example.lesson3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class pizza_ViewHolder extends RecyclerView.ViewHolder {
   private TextView textView;
    public pizza_ViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.item_pizza);
    }
    public  void  bind(String food){
        textView.setText(food);
    }
}
