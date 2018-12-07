package com.example.shaun.dogshowad;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CreateEvent extends Activity {

    Button createEventButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        createEventButton = findViewById(R.id.createEventButton);
    }
}
