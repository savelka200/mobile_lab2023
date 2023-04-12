package com.example.smarthome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.smarthome.ui.notifications.home.HomeFragment;

public class Vxod extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autorization);
    }

    public void auto(View view) {
      Intent intent = new Intent( Vxod.this, MainActivity.class);
     startActivity(intent);
    }

}
