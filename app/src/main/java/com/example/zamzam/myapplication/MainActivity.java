package com.example.zamzam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> candy_list = new ArrayList<String>();

        candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");
        candy_list.add("tropical wave");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.text_view_candy,
                R.id.text_view_candy,
                candy_list);


        ListView listView = (ListView)this.findViewById(R.id.list_view);

        listView.setAdapter(adapter);





    }
}
