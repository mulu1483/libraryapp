package com.example.libraryapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.material.appbar.MaterialToolbar;

public class PDFActivity extends AppCompatActivity {

    PDFView pdfView;

    MaterialToolbar toolbar;

    TextView pageNumber;

           //handler
           Handler handler =
                   new Handler(Looper.getMainLooper());

    Runnable hideIndicator = () ->
            pageNumber.setVisibility(TextView.GONE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pdfactivity);
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

        pdfView = findViewById(R.id.pdfView);
        pageNumber = findViewById(R.id.pageNumber);

        String file =
                getIntent().getStringExtra("file");

        // Back Arrow

        toolbar.setNavigationOnClickListener(
                v -> finish());

        // Set Book Title

        if (file != null) {

                  //Java
            if (file.equals("Java chapter 1.pdf")) {

                toolbar.setTitle(
                        "Introduction of OOP");

            }

            else if (file.equals("Java chapter 2 section 1.pdf")) {

                toolbar.setTitle(
                        "Overview of Java");
            }

            else if (file.equals("Java chapter 2 section 2.pdf")) {

                toolbar.setTitle(
                        "Control Statement");
            }
            else if (file.equals("Java chapter 2 section 3.pdf")) {

                toolbar.setTitle(
                        "Object & Class");
            }
            else if (file.equals("Java chapter 2 section 4.pdf")) {

                toolbar.setTitle(
                        "Arrays");
            }

            else if (file.equals("Java chapter 3.pdf")) {
                toolbar.setTitle(
                        "Object Orientation");
            }
                  else if (file.equals("Java chapter 4.pdf")) {
                    toolbar.setTitle(
                            "Exception Handling");
            }
            else if (file.equals("OOP-NOTES-final.pdf")) {
                toolbar.setTitle(
                        "OOP-NOTES-final");
            }

                       //Database
            else if (file.equals("FDB System Lecture Note All in One.pdf")) {
                toolbar.setTitle(
                        "Fundamental of Database");
            }
            else if (file.equals("ADB-Chapter 1-- Data File and Configure SQL.pdf")) {
                toolbar.setTitle(
                        "Data File & Configure SQL");
            }
            else if (file.equals("ADB-Chapter 2-- Transaction  Processing Concepts.pdf")) {
                toolbar.setTitle(
                        "Transaction");
            }
            else if (file.equals("ADB-Chapter 3-- Concurrency Control Techniques.pdf")) {
                toolbar.setTitle(
                        "Concurrency Control Techniques");
            }
            else if (file.equals("ADB-Chapter 4-- Database Security and Authorization.pdf")) {
                toolbar.setTitle(
                        "Database Security & Authorization");
            }
            else if (file.equals("ADB-Chapter 5-- Designing SQL Server Indexes.pdf")) {
                toolbar.setTitle(
                        "Designing SQL Server Indexes");
            }
            else if (file.equals("ADB-Chapter 6-- Backup and Restore Database.pdf")) {
                toolbar.setTitle(
                        "Backup and Restore Database");
            }
                           //SAD

            else if (file.equals("sad.pdf")) {
                toolbar.setTitle(
                        "SAD Book");
            }
            else if (file.equals("SAD-1.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 1");
            }
            else if (file.equals("SAD-2.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 2");
            }
            else if (file.equals("SAD-3.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 3");
            }
            else if (file.equals("SAD-4.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 4");
            }
            else if (file.equals("SAD-5.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 5");
            }
            else if (file.equals("SAD-6.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 6");
            }
            else if (file.equals("SAD-7.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 7");
            }
            else if (file.equals("SAD-8.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 8");
            }
            else if (file.equals("SAD-9.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 9");
            }
            else if (file.equals("SAD-10.pdf")) {
                toolbar.setTitle(
                        "SAD Chapter 10");
            }

                              // C++
            else if (file.equals("C++ Lecture All in One.pdf")) {
                toolbar.setTitle(
                        "C++ Lecture Note");
            }
            else if (file.equals("c++ fandamental of programimg 1.pdf")) {
                toolbar.setTitle(
                        "c++ fundamental of programing 1");
            }
            else if (file.equals("c++ fandamental of programimg 2.pdf")) {
                toolbar.setTitle(
                        "c++ fundamental of programing 2");
            }
            else if (file.equals("c++ structure and file managment.pdf")) {
                toolbar.setTitle(
                        "c++ structure and file management");
            }
            else if (file.equals("C++ complete reference.pdf")) {
                toolbar.setTitle(
                        "C++ complete reference");
            }
            else if (file.equals("C++ function.pdf")) {
                toolbar.setTitle(
                        "C++ function");
            }
            else if (file.equals("c++ array.pdf")) {
                toolbar.setTitle(
                        "c++ array");
            }
            else if (file.equals("c++ pointer.pdf")) {
                toolbar.setTitle(
                        "c++ pointer");
            }
                         //Networking
            else if (file.equals("lecturenote 1.pdf")) {
                toolbar.setTitle(
                        "Data Communication Basic");
            }
            else if (file.equals("lecturenote 2 IT.pdf")) {
                toolbar.setTitle(
                        "Introduction to CN");
            }
            else if (file.equals("lecturenote 3 IT.pdf")) {
                toolbar.setTitle(
                        "Data Communication & CN");
            }
            else if (file.equals("lecturenote 4.pdf")) {
                toolbar.setTitle(
                        "Network Protocols");
            }
            else if (file.equals("lecturenote 5.pdf")) {
                toolbar.setTitle(
                        "OSI Reference Model");
            }
            else if (file.equals("lecturenote 6a pdf.pdf")) {
                toolbar.setTitle(
                        "IP Addressing & Subnetting");
            }
            else if (file.equals("lecturenote 6b.pdf")) {
                toolbar.setTitle(
                        "Practice Question");
            }
            else if (file.equals("lecturenote 7.pdf")) {
                toolbar.setTitle(
                        "Data Security & Integrity");
            }
            else if (file.equals("network.pdf")) {
                toolbar.setTitle(
                        "Networking Book");
            }
                         // Internet Programing
            else if (file.equals("IP Chapter 1.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 1");
            }
            else if (file.equals("IP Chapter 2.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 2");
            }
            else if (file.equals("IP Chapter 3.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 3");
            }
            else if (file.equals("IP Chapter 4.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 4 HTML");
            }
            else if (file.equals("IP Chapter 4-Lab.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 4 HTML Lab");
            }
            else if (file.equals("IP Chapter 5.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 5 CSS");
            }
            else if (file.equals("IP Chapter 6.pdf")) {
                toolbar.setTitle(
                        "IP Chapter 6 Javascript");
            }
            else if (file.equals("MC 1-4.pdf")) {
                toolbar.setTitle(
                        "Mobile Computing Ch 1-4");
            }
            else if (file.equals("MC 5-10.pdf")) {
                toolbar.setTitle(
                        "Android Programing");
            }
            else if (file.equals("E-Health 1-5.pdf")) {
                toolbar.setTitle(
                        "E-health ");
            }
            else if (file.equals("CM module full Last.pdf")) {
                toolbar.setTitle(
                        "Computer Maintenance module Full");
            }
            else if (file.equals("All chapters HI.pdf")) {
                toolbar.setTitle(
                        "Fundamental of HI Note Full");
            }

            else {

                toolbar.setTitle(
                        " ");

            }

        }

        try {

            pdfView.fromAsset(file)

                    .enableSwipe(true)

                    .swipeHorizontal(false)

                    .enableDoubletap(true)

                    .onPageChange((page,totalPages)->{

                        pageNumber.setVisibility(TextView.VISIBLE);

                        pageNumber.setText(
                                (page + 1)
                                        + "/"
                                        + totalPages
                        );

                        float percent =
                                totalPages > 1
                                        ? (float) page /
                                        (totalPages - 1)
                                        : 0f;

                        int pdfHeight =
                                pdfView.getHeight();

                        int indicatorHeight =
                                pageNumber.getHeight();

                        float targetY =
                                percent *
                                        (pdfHeight
                                                - indicatorHeight
                                                - 20);

                        pageNumber.animate()
                                .y(targetY)
                                .setDuration(250)
                                .start();

                        handler.removeCallbacks(
                                hideIndicator);

                        handler.postDelayed(
                                hideIndicator,
                                6000);

                    })

                    .load();
        }

        catch (Exception e) {

            Toast.makeText(
                    this,
                    "PDF not found",
                    Toast.LENGTH_LONG
            ).show();

        }

    }

}