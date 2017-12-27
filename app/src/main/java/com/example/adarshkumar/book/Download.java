package com.example.adarshkumar.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Download extends AppCompatActivity {

    String downloadFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    downloadFile=getIntent().getStringExtra("downloadLink");

        Toast.makeText(this,""+downloadFile,Toast.LENGTH_LONG).show();

    }
}
