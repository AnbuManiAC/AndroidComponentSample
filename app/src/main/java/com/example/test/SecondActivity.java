package com.example.test;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("msg","Activity 2 - created");
        View button = findViewById(R.id.buttonGoBack);
        button.setOnClickListener(view -> finish());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg","Activity 2 - started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg","Activity 2 - stopped");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg","Activity 2 - paused");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("msg","Activity 2 - restarted");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg","Activity 2 - resumed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg","Activity 2 - destroyed");

    }
}
