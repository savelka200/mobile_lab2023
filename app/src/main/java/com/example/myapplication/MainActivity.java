package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    private ImageButton dislike, like;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        like = (ImageButton) findViewById(R.id.like);
        dislike = (ImageButton) findViewById(R.id.dislike);
        textView = findViewById(R.id.textView);
    }

    public void dislike(View view) {
        counter--;
        textView.setText(Integer.toString(counter));
        counter = Integer.parseInt(textView.getText().toString());
    }

    public void like(View view) {
        counter++;
        textView.setText(Integer.toString(counter));
        counter = Integer.parseInt(textView.getText().toString());
    }
}