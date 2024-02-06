package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickListner {
    private List<Items> itemsList;
    private MyCustomAdapter myCustomAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        itemsList = new ArrayList<>();
        myCustomAdapter = new MyCustomAdapter(itemsList);
        Items item1 = new Items("Electricity Bill","Your electricity bill is due",R.drawable.img);
        Items item2 = new Items("Invoice","Your order invoice of trimmer is in the following PDF",R.drawable.img);
        Items item3 = new Items("LinkdIn job alerts","30+ job offers matches your requirement",R.drawable.img);
        Items item4 = new Items("Course era","A course on AI is available with certificates",R.drawable.img);
//        Items item1 = new Items("Electricity Bill","Your electricity bill is due",R.drawable.img);
//        Items item1 = new Items("Electricity Bill","Your electricity bill is due",R.drawable.img);
//        Items item1 = new Items("Electricity Bill","Your electricity bill is due",R.drawable.img);
//        Items item1 = new Items("Electricity Bill","Your electricity bill is due",R.drawable.img);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myCustomAdapter);

        myCustomAdapter.setClickListner(this);

    }

    @Override
    public void onClick(View v, int position) {
        Toast.makeText(getApplicationContext(),"You clicked: "+itemsList.get(position).getSubject(),Toast.LENGTH_SHORT).show();
    }
}