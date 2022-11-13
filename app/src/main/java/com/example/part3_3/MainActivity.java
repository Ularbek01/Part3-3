package com.example.part3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);
        names = new ArrayList<>();
        names.add("Tobey Maguire");
        names.add("Tom Holland");
        names.add("Jackie Chan");
        names.add("Will Smith");
        names.add("Leonardo Dicaprio");
        names.add("Johny Depp");
        names.add("Robert Downey");
        names.add("Brad Pitt");
        names.add("Dwayne Johnson");
        names.add("Emma Stone");
        names.add("Vin Diesel");
        NameAdapter nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);
    }
}