package com.example.moblaba1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();


    }
    private void init(){
        String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия"};
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);
        AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) { case 0:
                    Intent intent = new Intent(MainActivity.this, Argentina.class);
                    startActivity(intent);
                    break;

                    case 1:
                        Intent intents = new Intent(MainActivity.this, Brazil.class);
                        startActivity(intents);
                        break;
                    case 2:
                        Intent intentss = new Intent(MainActivity.this, Chili.class);
                        startActivity(intentss);

                    case 3:
                        Intent intentsss = new Intent(MainActivity.this, Columb.class);
                        startActivity(intentsss);
                        break;



                }
                Toast.makeText(getApplicationContext(), "Вы выбрали " +
                        adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(itemclick);



    }};