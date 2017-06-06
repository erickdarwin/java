package com.example.erick.sqllogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by Erick on 05/06/2017.
 */

public class About extends AppCompatActivity{

    protected void onCrete(Bundle s){



        Bundle j = this.getIntent().getExtras();
        j.getString("kk");
    }


}
