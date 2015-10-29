package com.example.katzir.testproject2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class CategoriesActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String[] strings = {"1","2","3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(),android.R.layout.simple_list_item_1,strings);
        getListView().setAdapter(adapter);
    }
}
