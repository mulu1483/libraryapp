package com.example.libraryapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class BookListActivity extends AppCompatActivity {

    ListView listView;
    SearchView searchView;
    MaterialToolbar toolbar;

    ArrayAdapter<String> adapter;

    String[] books;
    String[] pdfFiles;

    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book_list);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        // ================= Initialize =================

        listView = findViewById(R.id.listView);

        searchView = findViewById(R.id.searchView);

        category = getIntent().getStringExtra("category");

        // ================= JAVA =================

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

            pdfFiles = new String[]{

                    "Java chapter 1.pdf",
                    "Java chapter 2 section 1.pdf",
                    "Java chapter 2 section 2.pdf",
                    "Java chapter 2 section 3.pdf",
                    "Java chapter 2 section 4.pdf",
                    "Java chapter 3.pdf",
                    "Java chapter 4.pdf",
                    "OOP-NOTES-final.pdf"
            };
        }

        // ================= DATABASE =================

        else if (category.equals("database")) {

            toolbar.setTitle("Database");

            books = new String[]{

                    "🛢️ Fundamental of Database",
                    "🛢️ ADB Chapter 1 : Data File & Configure\n" + "                                   " +
                            "SQL",
                    "🛢️ ADB Chapter 2 : Transaction",
                    "🛢️ ADB Chapter 3 : Concurrency Control\n       " + "                           " +
                            "Techniques",
                    "🛢️ ADB Chapter 4 : Database Security & \n       " + "                           " +
                            "Authorization",
                    "🛢️ ADB Chapter 5 : Designing SQL Server\n       " + "                           " +
                            "Indexes",
                    "🛢️ ADB Chapter 6 : Backup & Restore\n"+"                                  " +
                            "Database"
            };

            pdfFiles = new String[]{

                    "FDB System Lecture Note All in One.pdf",
                    "ADB-Chapter 1-- Data File and Configure SQL.pdf",
                    "ADB-Chapter 2-- Transaction  Processing Concepts.pdf",
                    "ADB-Chapter 3-- Concurrency Control Techniques.pdf",
                    "ADB-Chapter 4-- Database Security and Authorization.pdf",
                    "ADB-Chapter 5-- Designing SQL Server Indexes.pdf",
                    "ADB-Chapter 6-- Backup and Restore Database.pdf"
            };
        }

        // ================= SAD =================

        else if (category.equals("sad")) {

            toolbar.setTitle("System Analysis & Design");

            books = new String[]{

                    "📊 SAD Book",
                    "📊 SAD Chapter 1",
                    "📊 SAD Chapter 2",
                    "📊 SAD Chapter 3",
                    "📊 SAD Chapter 4",
                    "📊 SAD Chapter 5",
                    "📊 SAD Chapter 6",
                    "📊 SAD Chapter 7",
                    "📊 SAD Chapter 8",
                    "📊 SAD Chapter 9",
                    "📊 SAD Chapter 10"
            };

            pdfFiles = new String[]{

                    "sad.pdf",
                    "SAD-1.pdf",
                    "SAD-2.pdf",
                    "SAD-3.pdf",
                    "SAD-4.pdf",
                    "SAD-5.pdf",
                    "SAD-6.pdf",
                    "SAD-7.pdf",
                    "SAD-8.pdf",
                    "SAD-9.pdf",
                    "SAD-10.pdf"
            };
        }

        // ================= C++ =================

        else if (category.equals("cpp")) {

            toolbar.setTitle("Fundamental of Programing");

            books = new String[]{

                    "🧭 C++ Lecture All in One",
                    "🧭 Fundamental of Programing 1",
                    "🧭 Fundamental of Programing 2",
                    "🧭 C++ Structure and File Management",
                    "🧭 C++ Complete Reference",
                    "🧭 C++ Function",
                    "🧭 C++ Array",
                    "🧭 C++ Pointer"
            };

            pdfFiles = new String[]{

                    "C++ Lecture All in One.pdf",
                    "c++ fandamental of programimg 1.pdf",
                    "c++ fandamental of programing 2.pdf",
                    "c++ structure and file managment.pdf",
                    "C++ complete reference.pdf",
                    "C++ function.pdf",
                    "c++ array.pdf",
                    "c++ pointer.pdf"
            };
        }

        // ================= NETWORK =================

        else if (category.equals("network")) {

            toolbar.setTitle("Networking");

            books = new String[]{

                    "🌐 Chapter 1: Data Communication Basic",
                    "🌐 Chapter 2: Introduction to Computer\n" +"                         " +
                            "Network",
                    "🌐 Chapter 3: Data Communication &\n" + "                         " +
                            "Computer Networking",
                    "🌐 Chapter 4: Network Protocols",
                    "🌐 Chapter 5: OSI Reference Model",
                    "🌐 Chapter 6: Introduction to IP Addressing\n" + "                         " +
                            "& Subnetting",
                    "🌐 Chapter 6: Practice Questions",
                    "🌐 Chapter 7: Data Security & Integrity",
                    "🌐 Networking Book"
            };

            pdfFiles = new String[]{

                    "lecturenote 1.pdf",
                    "lecturenote 2 IT.pdf",
                    "lecturenote 3 IT.pdf",
                    "lecturenote 4.pdf",
                    "lecturenote 5.pdf",
                    "lecturenote 6a pdf.pdf",
                    "lecturenote 6b.pdf",
                    "lecturenote 7.pdf",
                    "network.pdf"
            };
        }

        // ================= IP =================

        else if (category.equals("ip")) {

            toolbar.setTitle("Internet Programing 1");

            books = new String[]{

                    "📡 IP Chapter 1",
                    "📡 IP Chapter 2",
                    "📡 IP Chapter 3",
                    "📡 IP Chapter 4 HTML",
                    "📡 IP Chapter 4 HTML Lab",
                    "📡 IP Chapter 5 CSS",
                    "📡 IP Chapter 6 Javascript"
            };

            pdfFiles = new String[]{

                    "IP Chapter 1.pdf",
                    "IP Chapter 2.pdf",
                    "IP Chapter 3.pdf",
                    "IP Chapter 4.pdf",
                    "IP Chapter 4-Lab.pdf",
                    "IP Chapter 5.pdf",
                    "IP Chapter 6.pdf"
            };
        }
        else if (category.equals("M-Computing")) {

            toolbar.setTitle("Mobile Computing");

            books = new String[]{

                    "\uD83D\uDCF3 Chapter 1-4: Mobile Computing",
                    "\uD83D\uDCF3 Chapter 5-10: Android Programing"
            };

            pdfFiles = new String[]{

                    "MC 1-4.pdf",
                    "MC 5-10.pdf"
            };
        }
        else if (category.equals("E-Health")) {

            toolbar.setTitle("E-Health");

            books = new String[]{

                    "\uD83C\uDFE5 Chapter 1-5: E-Health"
            };

            pdfFiles = new String[]{

                    "E-Health 1-5.pdf"
            };
        }
        else if (category.equals("C-Maintenance")) {
            toolbar.setTitle("Computer Maintenance");
            books = new String[]{

                    "\uD83D\uDEE0\uFE0F Computer Maintenance Full"
            };

            pdfFiles = new String[]{

                    "CM module full Last.pdf"
            };
        }
        else{
            toolbar.setTitle("Fundamental of HI");
            books = new String[]{

                    "\uD83D\uDCCA Fundamental of HI"
            };

            pdfFiles = new String[]{

                    "All chapters HI.pdf"
            };
        }

        // ================= Adapter =================

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                books
        );

        listView.setAdapter(adapter);

        // ================= SEARCH FILTER =================

        searchView.setOnQueryTextListener(
                new SearchView.OnQueryTextListener() {

                    @Override
                    public boolean onQueryTextSubmit(String query) {

                        adapter.getFilter().filter(query);

                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {

                        adapter.getFilter().filter(newText);

                        return false;
                    }
                });

        // ================= OPEN PDF =================

        listView.setOnItemClickListener((parent, view, position, id) -> {

            String selectedBook =
                    adapter.getItem(position);

            Intent intent =
                    new Intent(
                            BookListActivity.this,
                            PDFActivity.class
                    );

            // Find correct PDF after filtering

            for (int i = 0; i < books.length; i++) {

                if (books[i].equals(selectedBook)) {

                    intent.putExtra(
                            "file",
                            pdfFiles[i]
                    );

                    break;
                }
            }

            startActivity(intent);
        });

        // ================= BACK BUTTON =================

        toolbar.setNavigationOnClickListener(v -> finish());
        // ================= MENU CLICK =================

    }
}