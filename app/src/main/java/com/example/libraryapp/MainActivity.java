package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    // ================= CardViews =================

    CardView javaCard,
            dbCard,
            sadCard,
            cppCard,
            networkCard,
            ipCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ================= Initialize Views =================

        javaCard = findViewById(R.id.javaCard);

        dbCard = findViewById(R.id.dbCard);

        sadCard = findViewById(R.id.sadCard);

        cppCard = findViewById(R.id.cppCard);

        networkCard = findViewById(R.id.networkCard);

        ipCard = findViewById(R.id.ipCard);

        // ================= Java Card =================

        javaCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "java");

            startActivity(intent);
        });

        // ================= Database Card =================

        dbCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "database");

            startActivity(intent);
        });

        // ================= SAD Card =================

        sadCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "sad");

            startActivity(intent);
        });

        // ================= C++ Card =================

        cppCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "cpp");

            startActivity(intent);
        });

        // ================= Networking Card =================

        networkCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "network");

            startActivity(intent);
        });

        // ================= IP Card =================

        ipCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(MainActivity.this,
                            BookListActivity.class);

            intent.putExtra("category", "ip");

            startActivity(intent);
        });
    }
}