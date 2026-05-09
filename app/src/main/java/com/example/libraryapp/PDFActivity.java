package com.example.libraryapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

public class PDFActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfactivity);

        pdfView = findViewById(R.id.pdfView);

        String file = getIntent().getStringExtra("file");

        pdfView.fromAsset(file)
                .enableSwipe(true)
                .load();
    }
}