package com.example.analoganddigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {
    DigitalClock digital_clock1;
    AnalogClock analog_clock1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        digital_clock1 = findViewById(R.id.digital_clock);
        analog_clock1 = findViewById(R.id.analog_clock1);
    }
}