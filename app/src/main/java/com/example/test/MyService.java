package com.example.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("msg","Service is running");

        String dataString  = intent.getStringExtra("EXTRA_DATA");
        if(dataString!=null)
            Log.d("msg", dataString);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("msg", "Service destroyed");
    }
}