package com.example.android.thingseeproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

public class PlantsActivity extends AppCompatActivity {

    TextView txtImpact, txtTemp, txtLux, txtEnergy;
    SensorValue sensorValue = new SensorValue();
    private final String SHARE_PREFERENCES_NAME = "Don't worry";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);

        SharedPreferences mPrefs = getSharedPreferences(SHARE_PREFERENCES_NAME,Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPrefs.getString("MyObject", "");
        sensorValue = gson.fromJson(json, SensorValue.class);

        txtEnergy = (TextView) findViewById(R.id.TextViewBattery);
        txtImpact = (TextView) findViewById(R.id.putImpact);
        txtLux = (TextView) findViewById(R.id.putLux);
        txtTemp = (TextView) findViewById(R.id.putTemp);
        txtEnergy.setText("" + sensorValue.getEnergy()+"%");
        txtLux.setText("" + sensorValue.getLux());
        txtImpact.setText("" + sensorValue.getImpact());
        txtTemp.setText("" + sensorValue.getTemp());
    }

    public void LocationButton(View v) {
        Intent intent = new Intent(PlantsActivity.this, MapsActivity.class);
        startActivity(intent);
    }
}
