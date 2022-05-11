package com.example.test;

import androidx.annotation.LongDef;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver receiver = new AirplaneModeBroadCastReceiver();
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("msg","Activity 1 - created");

        View button = findViewById(R.id.buttonOpenActivity);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg","Activity 1 - started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg","Activity 1 - resumed");
        intentFilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("msg","Activity 1 - state saved");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("msg","Activity 1 - Restoring state");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg","Activity 1 - paused");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg","Activity 1 - stopped");
        unregisterReceiver(receiver);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("msg","Activity 1 - restarted");
    }

    @Override
    protected void onDestroy() {
        Log.d("msg","Activity 1 - destroyed");
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        Log.d("msg","Activity 1 - backPressed");
        super.onBackPressed();

    }
}