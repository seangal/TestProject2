package com.example.katzir.testproject2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoriesActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String[] strings = {"adi","sean","renan","jonatan"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getListView().getContext(), android.R.layout.simple_list_item_1, strings);
        getListView().setAdapter(adapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String text = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(CategoriesActivity.this, MassageActivity.class);
                intent.putExtra("selected-item", text);
                startActivity(intent);

            }
        });
    }
}
