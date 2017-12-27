package com.example.adarshkumar.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String course="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] states = {"Bachelor of Computer Applications","Bachelor of Science","Bachelor of Arts","Bachelor of Commerce"};

        final ArrayList arrayList = new ArrayList(Arrays.asList(states));

        ListView listView = (ListView) findViewById(R.id.courseList);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), " "+ arrayList.get(position), Toast.LENGTH_SHORT).show();
                course=""+arrayList.get(position);
                Intent intent = new Intent(MainActivity.this, Semester.class);

                intent.putExtra("coursetitle",course);
                startActivity(intent);
            }
        });

    }
}
