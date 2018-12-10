package com.example.shaun.dogshowad;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends Activity {

    //Creating the TAG for our debug messages
    private static final String TAG = "COMP405";

    //Creating our buttons
    Button loginButton;
    EditText userName;
    EditText passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //This code should always happen first because it inflates the screen.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //Initializing the buttons here. We must do it here so that the compiler knows what they are.
        loginButton = (Button) findViewById(R.id.loginButton);
        userName = (EditText) findViewById(R.id.username);
        passWord = (EditText) findViewById(R.id.password);

        //This sets the listener for the button so we can use the login button to login.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("admin") &&
                        passWord.getText().toString().equals("password"))
                {
                    Intent intent  = new Intent(getApplicationContext(), Contents.class);
                    startActivity(intent);
                    Log.d(TAG, "onClick: Button pressed!");
                }
            }
        });
    }


}
