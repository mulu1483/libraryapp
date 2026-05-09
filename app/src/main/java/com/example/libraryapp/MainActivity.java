package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

     CardView javaCard, dbCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        javaCard = findViewById(R.id.javaCard);
        dbCard = findViewById(R.id.dbCard);

        javaCard.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, BookListActivity.class);
            i.putExtra("category", "java");
            startActivity(i);
        });

        dbCard.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, BookListActivity.class);
            i.putExtra("category", "db");
            startActivity(i);
        });
    }
}