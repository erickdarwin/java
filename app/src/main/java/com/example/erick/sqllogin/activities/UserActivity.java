package com.example.erick.sqllogin.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Erick on 04/06/2017.
 */

public class UserActivity extends AppCompatActivity {
    private TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textViewName = (TextView)findViewById(R.id.text1);
            String nameFromIntent =getIntent().getStringExtra("EMAIL");
            textViewName.setText("welcome"+ nameFromIntent);
    }
}
