package com.example.libraryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class BookListActivity extends AppCompatActivity {

    ListView listView;
    SearchView searchView;
    MaterialToolbar toolbar;

    ArrayAdapter<String> adapter;

    String[] books;

    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        // ================= Initialize =================

        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchView);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setOverflowIcon(getDrawable(R.drawable.ic_menu));

        category = getIntent().getStringExtra("category");

        // ================= Toolbar Title =================

        if (category.equals("java")) {

            toolbar.setTitle("Java");

            books = new String[]{

                    "☕ Chapter 1 : Introduction to OOP",
                    "☕ Chapter 2 : Overview of Java",
                    "☕ Chapter 3 : Control Statements in Java",
                    "☕ Chapter 4 : Objects & Classes",
                    "☕ Chapter 5 : Java Arrays",
                    "☕ Chapter 6 : Object Orientation",
                    "☕ Chapter 7 : Exception Handling",
                    "☕ OOP_Notes_Final"

            };

        } else if (category.equals("database")) {

            toolbar.setTitle("Database Chapters");

            books = new String[]{
                    "\uD83D\uDEE2\uFE0F Fundamental of Database",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 1 : Data File & Configure\n" + "                                   " +
                            "SQL",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 2 : Transaction",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 3 : Concurrency Control\n       " + "                           " +
                            "Techniques",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 4 : Database Security & \n       " + "                           " +
                            "Authorization",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 5 : Designing SQL Server\n       " + "                           " +
                            "Indexes",
                    "\uD83D\uDEE2\uFE0F ADB Chapter 6 : Backup & Restore\n"+"                                  " +
                            "Database"
            };

        } else if (category.equals("sad")) {

            toolbar.setTitle("System Analysis & Design");

            books = new String[]{

                    "\uD83D\uDCCA SAD Book",
                    "\uD83D\uDCCA SAD Chapter 1",
                    "\uD83D\uDCCA SAD Chapter 2",
                    "\uD83D\uDCCA SAD Chapter 3",
                    "\uD83D\uDCCA SAD Chapter 4",
                    "\uD83D\uDCCA SAD Chapter 5",
                    "\uD83D\uDCCA SAD Chapter 6",
                    "\uD83D\uDCCA SAD Chapter 7",
                    "\uD83D\uDCCA SAD Chapter 8",
                    "\uD83D\uDCCA SAD Chapter 9",
                    "\uD83D\uDCCA SAD Chapter 10"
            };
        } else if (category.equals("cpp")) {

            toolbar.setTitle("Fundamental of Programing");

            books = new String[]{
                    "\uD83E\uDDED C++ Lecture All in one",
                    "\uD83E\uDDED Fundamental of Programing 1",
                    "\uD83E\uDDED Fundamental of Programing 2",
                    "\uD83E\uDDED C++ Structure and File Management",
                    "\uD83E\uDDED C++ Complete reference",
                    "\uD83E\uDDED C++ Function",
                    "\uD83E\uDDED C++ Array",
                    "\uD83E\uDDED C++ Pointer"


            };
        } else if (category.equals("network")) {

            toolbar.setTitle("Networking");

            books = new String[]{

                    "\uD83C\uDF10 Chapter 1: Data Communication Basic",
                    "\uD83C\uDF10 Chapter 2: Introduction to Computer\n" +"                         " +
                            "Network",
                    "\uD83C\uDF10 Chapter 3: Data Communication &\n" + "                         " +
                            "Computer Networking",
                    "\uD83C\uDF10 Chapter 4: Network Protocols",
                    "\uD83C\uDF10 Chapter 5: OSI Reference Model",
                    "\uD83C\uDF10 Chapter 6: Introduction to IP Addressing\n" + "                         " +
                            "& Subnetting",
                    "\uD83C\uDF10 Chapter 6: Practice Questions",
                    "\uD83C\uDF10 Chapter 7: Data Security & Integrity",
                    "\uD83C\uDF10 Networking Book"

            };
        } else {

            toolbar.setTitle("Internet Programing 1");

            books = new String[]{

                    "\uD83D\uDCE1 IP Chapter 1",
                    "\uD83D\uDCE1 IP Chapter 2",
                    "\uD83D\uDCE1 IP Chapter 3",
                    "\uD83D\uDCE1 IP Chapter 4 HTML",
                    "\uD83D\uDCE1 IP Chapter 4 HTML Lab",
                    "\uD83D\uDCE1 IP Chapter 5 CSS",
                    "\uD83D\uDCE1 IP Chapter 6 Javascript"
            };

        }

        // ================= Adapter =================

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                books
        );

        listView.setAdapter(adapter);

        // ================= Search =================

        searchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {

                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {

                        adapter.getFilter().filter(newText);

                        return true;
                    }
                });

        // ================= Back Arrow =================

        toolbar.setNavigationOnClickListener(v -> {

            finish();

        });

        // ================= Menu Click =================

        toolbar.setOnMenuItemClickListener(item -> {

            // ================= ABOUT =================

            if (item.getItemId() == R.id.about) {

                androidx.appcompat.app.AlertDialog.Builder builder =
                        new androidx.appcompat.app.AlertDialog.Builder(this);

                builder.setTitle("About App");

                builder.setMessage(
                        "PDF Application\n\n" +
                                "Version : 1.0\n\n" +
                                "This application helps students " +
                                "to read PDF books and lecture notes.\n\n" +
                                "Features:\n" +
                                "• PDF Viewer\n" +
                                "• Search Chapters\n" +
                                "• Multiple Courses\n" +
                                "• Easy Navigation\n\n" +
                                "Developed By: " +
                                "Muluken.A"
                );

                builder.setIcon(R.drawable.ic_launcher_foreground);

                builder.setPositiveButton("OK",
                        (dialog, which) -> dialog.dismiss());

                builder.show();
            }

            // ================= SHARE =================

            else if (item.getItemId() == R.id.share) {

                Intent shareIntent = new Intent(Intent.ACTION_SEND);

                shareIntent.setType("text/plain");

                shareIntent.putExtra(Intent.EXTRA_TEXT,
                        "Download our Library App");

                startActivity(Intent.createChooser(
                        shareIntent,
                        "Share"));
            }

            // ================= EXIT =================

            else if (item.getItemId() == R.id.exit) {

                finishAffinity();
            }

            return true;
        });

        // ================= Open PDF =================

        listView.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent =
                    new Intent(BookListActivity.this,
                            PDFActivity.class);

            // Java PDFs

            if (category.equals("java")) {

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "Java chapter 1.pdf");
                        break;

                    case 1:
                        intent.putExtra("file",
                                "Java chapter 2 section 1.pdf");
                        break;

                    case 2:
                        intent.putExtra("file",
                                "Java chapter 2 section 2.pdf");
                        break;

                    case 3:
                        intent.putExtra("file",
                                "Java chapter 2 section 3.pdf");
                        break;
                    case 4:
                        intent.putExtra("file",
                                "Java chapter 2 section 4.pdf");
                        break;
                    case 5:
                        intent.putExtra("file",
                                "Java chapter 3.pdf");
                        break;
                    case 6:
                        intent.putExtra("file",
                                "Java chapter 4.pdf");
                        break;
                    case 7:
                        intent.putExtra("file",
                                "OOP-NOTES-final.pdf");
                        break;
                }
            }

            //Data Base pdf
            else if (category.equals("database")) {

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "FDB System Lecture Note All in One.pdf");
                        break;

                    case 1:
                        intent.putExtra("file",
                                "ADB-Chapter 1-- Data File and Configure SQL.pdf");
                        break;

                    case 2:
                        intent.putExtra("file",
                                "ADB-Chapter 2-- Transaction  Processing Concepts.pdf");
                        break;

                    case 3:
                        intent.putExtra("file",
                                "ADB-Chapter 3-- Concurrency Control Techniques.pdf");
                        break;
                    case 4:
                        intent.putExtra("file",
                                "ADB-Chapter 4-- Database Security and Authorization.pdf");
                        break;
                    case 5:
                        intent.putExtra("file",
                                "ADB-Chapter 5-- Designing SQL Server Indexes.pdf");
                        break;
                    case 6:
                        intent.putExtra("file",
                                "ADB-Chapter 6-- Backup and Restore Database.pdf");
                        break;
                    case 7:
                        intent.putExtra("file",
                                "db_book.pdf");
                        break;

                }
            }

            //system analysis & planing pdf
            else if (category.equals("sad")) {

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "sad.pdf");
                        break;
                    case 1:
                        intent.putExtra("file",
                                "SAD-1.pdf");
                        break;

                    case 2:
                        intent.putExtra("file",
                                "SAD-2.pdf");
                        break;

                    case 3:
                        intent.putExtra("file",
                                "SAD-3.pdf");
                        break;

                    case 4:
                        intent.putExtra("file",
                                "SAD-4.pdf");
                        break;

                    case 5:
                        intent.putExtra("file",
                                "SAD-5.pdf");
                        break;

                    case 6:
                        intent.putExtra("file",
                                "SAD-6.pdf");
                        break;

                    case 7:
                        intent.putExtra("file",
                                "SAD-7.pdf");
                        break;

                    case 8:
                        intent.putExtra("file",
                                "SAD-8.pdf");
                        break;

                    case 9:
                        intent.putExtra("file",
                                "SAD-9.pdf");
                        break;

                    case 10:
                        intent.putExtra("file",
                                "SAD-10.pdf");
                        break;

                }
            }

            //C++ pdf
            else if (category.equals("cpp")) {

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "C++ Lecture All in One.pdf");
                        break;

                    case 1:
                        intent.putExtra("file",
                                "c++ fandamental of programimg 1.pdf");
                        break;
                    case 2:
                        intent.putExtra("file",
                                "c++ fandamental of programing 2.pdf");
                        break;
                    case 3:
                        intent.putExtra("file",
                                "c++ structure and file managment.pdf");
                        break;
                    case 4:
                        intent.putExtra("file",
                                "C++ function.pdf");
                        break;
                    case 5:
                        intent.putExtra("file",
                                "c++ array.pdf");
                        break;
                    case 6:
                        intent.putExtra("file",
                                "c++ pointer.pdf");
                        break;
                    case 7:
                        intent.putExtra("file",
                                "C++ complete reference.pdf");
                        break;
                }
            }

            //Networking pdf
            else if (category.equals("network")) {

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "lecturenote 1.pdf");
                        break;

                    case 1:
                        intent.putExtra("file",
                                "lecturenote 2 IT.pdf");
                        break;

                    case 2:
                        intent.putExtra("file",
                                "lecturenote 3 IT.pdf");
                        break;

                    case 3:
                        intent.putExtra("file",
                                "lecturenote 4.pdf");
                        break;
                    case 4:
                        intent.putExtra("file",
                                "lecturenote 5.pdf");
                        break;
                    case 5:
                        intent.putExtra("file",
                                "lecturenote 6a pdf.pdf");
                        break;
                    case 6:
                        intent.putExtra("file",
                                "lecturenote 6b.pdf");
                        break;
                    case 7:
                        intent.putExtra("file",
                                "lecturenote 7.pdf");
                        break;
                    case 8:
                        intent.putExtra("file",
                                "network.pdf");
                        break;
                }
            }
            //Internet Programing pdf
            else{

                switch (position) {

                    case 0:
                        intent.putExtra("file",
                                "IP Chapter 1.pdf");
                        break;

                    case 1:
                        intent.putExtra("file",
                                "IP Chapter 2.pdf");
                        break;

                    case 2:
                        intent.putExtra("file",
                                "IP Chapter 3.pdf");
                        break;

                    case 3:
                        intent.putExtra("file",
                                "IP Chapter 4.pdf");
                        break;
                    case 4:
                        intent.putExtra("file",
                                "IP Chapter 4-Lab.pdf");
                        break;
                    case 5:
                        intent.putExtra("file",
                                "IP Chapter 5.pdf");
                        break;
                    case 6:
                        intent.putExtra("file",
                                "IP Chapter 6.pdf");
                        break;
                }
            }

            startActivity(intent);
        });
    }
}