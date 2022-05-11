package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View buttonStart = findViewById(R.id.buttonStart);
        TextView textView =(TextView) findViewById(R.id.textView);

        buttonStart.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MyService.class);
            startService(intent);
            textView.setText("Service started");
        });

        View buttonStop = findViewById(R.id.buttonStop);
        buttonStop.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MyService.class);
            stopService(intent);
            textView.setText("Service stopped");
        });

        View buttonSend = findViewById(R.id.buttonSendData);
        buttonSend.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MyService.class);
            View textInput = findViewById(R.id.textInput);
            String data = textInput.toString();
            intent.putExtra("EXTRA_DATA", data);
            startService(intent);
        });
    }
}