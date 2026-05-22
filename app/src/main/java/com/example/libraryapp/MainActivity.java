package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    CardView javaCard, dbCard, sadCard, cppCard, networkCard, ipCard, mcCard, eCard, cmCard, fhiCard;
    EditText searchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ================= Toolbar =================
        MaterialToolbar toolbar =
                findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        // Make menu icon white

        toolbar.post(() -> {

            if (toolbar.getOverflowIcon() != null) {

                toolbar.getOverflowIcon().setTint(

                        getResources().getColor(
                                android.R.color.white
                        )

                );

            }

        });

        // 🎬 Animation
        toolbar.startAnimation(
                AnimationUtils.loadAnimation(
                        this,
                        android.R.anim.slide_in_left
                )
        );

        // ================= Cards =================
        javaCard = findViewById(R.id.javaCard);
        dbCard = findViewById(R.id.dbCard);
        sadCard = findViewById(R.id.sadCard);
        cppCard = findViewById(R.id.cppCard);
        networkCard = findViewById(R.id.networkCard);
        ipCard = findViewById(R.id.ipCard);
        mcCard = findViewById(R.id.mcCard);
        eCard = findViewById(R.id.eCard);
        cmCard = findViewById(R.id.cmCard);
        fhiCard = findViewById(R.id.fhiCard);

        // ================= Search Bar =================
        searchBar = findViewById(R.id.searchBar);

        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterCards(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // ================= Click Events =================
        javaCard.setOnClickListener(v -> open("java"));
        dbCard.setOnClickListener(v -> open("database"));
        sadCard.setOnClickListener(v -> open("sad"));
        cppCard.setOnClickListener(v -> open("cpp"));
        networkCard.setOnClickListener(v -> open("network"));
        ipCard.setOnClickListener(v -> open("ip"));
        mcCard.setOnClickListener(v -> open("M-Computing"));
        eCard.setOnClickListener(v -> open("E-Health"));
        cmCard.setOnClickListener(v -> open("C-Maintenance"));
        fhiCard.setOnClickListener(v -> open("Fundamental of HI"));

    }

    // ================= OPEN ACTIVITY =================
    private void open(String category) {
        Intent intent = new Intent(MainActivity.this, BookListActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }

    // ================= REAL SEARCH FILTER =================
    private void filterCards(String text) {

        String query = text.toLowerCase().trim();

        javaCard.setVisibility(
                "java".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        dbCard.setVisibility(
                "database".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        sadCard.setVisibility(
                "sad".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        cppCard.setVisibility(
                "cpp".contains(query) || "c++".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        networkCard.setVisibility(
                "network".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        ipCard.setVisibility(
                "ip".contains(query) ? CardView.VISIBLE : CardView.GONE
        );

        mcCard.setVisibility(
                "M-Computing".contains(query) ? CardView.VISIBLE : CardView.GONE
        );
        eCard.setVisibility(
                "E-Health".contains(query) ? CardView.VISIBLE : CardView.GONE
        );
        cmCard.setVisibility(
                "C-Maintenance".contains(query) ? CardView.VISIBLE : CardView.GONE
        );
        fhiCard.setVisibility(
                "Fundamental of HI".contains(query) ? CardView.VISIBLE : CardView.GONE
        );
    }

    // ================= MENU =================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "About");
        menu.add(0, 2, 1, "Share");
        menu.add(0, 3, 2, "Exit");
        return true;
    }

    // ================= MENU ACTIONS =================
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == 1) {

            new AlertDialog.Builder(this)
                    .setTitle("About App")
                    .setMessage("PDF Application\n\n" +
                            "Version : 1.0\n\n" +
                                    "This application helps students " +
                                    "to read PDF books and lecture notes.\n\n" +
                                    "Features:\n" +
                                    "• PDF Viewer\n" +
                                    "• Search Chapters\n" +
                                    "• Multiple Courses\n" +
                                    "• Easy Navigation\n\n" +
                                    "Developed By: " +
                                    "Muluken.A\n" + "Email: muluken851@gmail.com")
                    .setPositiveButton("OK", null)
                    .show();

            return true;
        }

        else if (item.getItemId() == 2) {

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");

            shareIntent.putExtra(Intent.EXTRA_TEXT,
                    "Download our PdApp from Play store");

            startActivity(Intent.createChooser(shareIntent, "Share via"));

            return true;
        }

        else if (item.getItemId() == 3) {

            finish();
            Toast.makeText(this, "App Closed", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}