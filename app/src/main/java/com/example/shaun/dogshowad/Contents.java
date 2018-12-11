package com.example.shaun.dogshowad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Contents extends Activity {

    private static final String TAG = "COMP255";

    Button createEvent;
    Button selectEvent;
    Button viewPastEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        createEvent = findViewById(R.id.createEvents);
        selectEvent = findViewById(R.id.selectEvent);
        viewPastEvents = findViewById(R.id.viewPastEvents);

        createEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AddContestant.class);
                startActivity(intent);
                Log.d(TAG, "Starting the CreateEvent Activity!");
            }
        });
    }
}
