package com.example.exampleapp;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String msg = "The WiFi interface is ";
        WifiManager wifi = (WifiManager)getSystemService(Context.WIFI_SERVICE);
        if (wifi.isWifiEnabled()){
            msg += "enabled";
        }
        else {
            msg += "disabled";
        }
        Log.d("EXAMPLE", msg);
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
