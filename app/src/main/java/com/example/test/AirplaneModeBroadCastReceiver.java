package com.example.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isAirPlaneModeEnabled = intent.getBooleanExtra("state",false);
        if(isAirPlaneModeEnabled){
            Toast.makeText(context, "Aeroplane mode enabled", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(context, "Aeroplane mode disabled", Toast.LENGTH_LONG).show();
        }

    }
}
