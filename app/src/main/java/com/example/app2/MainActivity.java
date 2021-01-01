package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);


        Intent i = getIntent() ;

        if(i.getAction().equals("com.example.rohit")){
            String s = i.getStringExtra("rohit");
            textView.setText(s);

        }else{
            Toast.makeText(getApplicationContext(), "didnt", Toast.LENGTH_SHORT).show();
        }
    }
}