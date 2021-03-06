package com.example.katzir.testproject2;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MassageActivity extends AppCompatActivity {
    ListView list;
    String[] web;
    Integer[] imageId = {
            R.mipmap.image1,
            R.mipmap.image2,
            R.mipmap.image3,
            R.mipmap.image4,
            R.mipmap.image5,
            R.mipmap.image6,
            R.mipmap.image7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);
        // get the intent from which this activity is called.
        Intent intent = getIntent();

        // fetch value from key-value pair and make it visible on TextView.
        String item = intent.getStringExtra("selected-item");
        try{
            String json = getHTML("http://ebay.edy.co.il/search.php?string="+item+"&max_results=3");
        }
        catch(Exception e){}
        CustomList adapter = new
                CustomList(MassageActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }

    public String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }
}
