package com.example.katzir.testproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;

    private Categories categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        categories=new Categories();
        ExpandableListViewAdapter expandableListViewAdapter = new ExpandableListViewAdapter(getApplicationContext(), categories.parentHeaderInformation, categories.allChildItems);

        expandableListView.setAdapter(expandableListViewAdapter);
    }


}
