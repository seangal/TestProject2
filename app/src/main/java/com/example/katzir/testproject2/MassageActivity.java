package com.example.katzir.testproject2;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MassageActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Search Results");
        setContentView(R.layout.activity_massage);
        textView = (TextView) findViewById(R.id.textView);
        // get the intent from which this activity is called.
        Intent intent = getIntent();

        // fetch value from key-value pair and make it visible on TextView.
        String item = intent.getStringExtra("selected-item");



    }

}
