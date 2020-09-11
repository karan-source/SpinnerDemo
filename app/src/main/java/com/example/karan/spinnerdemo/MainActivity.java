package com.example.karan.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find View By Id
        sp = findViewById(R.id.sp);
        //Getting data
        String name[] = getResources().getStringArray(R.array.sp_name);
        //Adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
        sp.setAdapter(adapter);
    }
}
