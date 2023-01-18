package com.example.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lesson3_1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private ArrayList<String>nameList = new ArrayList<>();
private RecyclerView res_pizza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

res_pizza = findViewById(R.id.recycler_view);
loadData();
foodAdapter adapter = new foodAdapter(nameList);
binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("Маргарита");
        nameList.add("Маринара");
        nameList.add("Наполетана");
        nameList.add("Тонно");
        nameList.add("Пеперони");
        nameList.add("Пармиджана");
        nameList.add("Кальцоне");
        nameList.add("Четыре сыра");
        nameList.add("Четыре мясо");
        nameList.add("Четыре мясо");
        nameList.add("Четыре мясо");
        nameList.add("Четыре мясо");
        nameList.add("Четыре мясо");
        nameList.add("gkhg");
    }

}