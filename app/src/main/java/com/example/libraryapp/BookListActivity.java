package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class BookListActivity extends AppCompatActivity {

    ListView listView;
    SearchView searchView;
    ArrayAdapter<String> adapter;

    String[] books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchView);

        String category = getIntent().getStringExtra("category");

        if(category.equals("java")){
            books = new String[]{"Java Basics", "Advanced Java"};
        } else {
            books = new String[]{"DB Basics", "SQL Guide"};
        }

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, books);

        listView.setAdapter(adapter);

        // Search
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { return false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        // Click to open PDF
        listView.setOnItemClickListener((parent, view, position, id) -> {

            Intent i = new Intent(BookListActivity.this, PDFActivity.class);

            if(category.equals("java")){
                i.putExtra("file", "java_book.pdf");
            } else {
                i.putExtra("file", "db_book.pdf");
            }

            startActivity(i);
        });
    }
}