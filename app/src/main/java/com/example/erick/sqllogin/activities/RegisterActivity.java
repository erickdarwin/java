package com.example.erick.sqllogin.activities;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.BundleCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.erick.sqllogin.helper.InputValidation;
import com.example.erick.sqllogin.model.User;
import com.example.erick.sqllogin.sql.DatabaseHelper;

/**
 * Created by Erick on 04/06/2017.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private final AppCompatActivity activity = RegisterActivity.this;
    private NestedScrollView nestedScrollView;

    private TextInputLayout textInputLayoutName;
    private  TextInputLayout textInputLayoutEmail;
    private  TextInputLayout textInputLayoutPassword;
    private  TextInputLayout textInputLayoutConfirmPassword;

    private TextInputEditText textInputEditTextName;
    private TextInputEditText textInputEditTextEmail;
    private TextInputEditText textInputEditTextPassword;
    private TextInputEditText textInputEditTextConfirmPasword;

    private AppCompatButton appCompatButtonRegister;
    private AppCompatTextView appCompatTextViewLoginLink;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;
    private User user;


@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);
    getSupportActionBar().hide();


    initViews();
    initListeners();
    initObjects();
}
private void initViews(){
    nestedScrollView =(NestedScrollView)findViewById(R.id.nestedScrollView);

    textInputLayoutName = (TextInputLayout) findViewById(R.id.textInputLayoutName);
    textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textInputLayoutEmail);
    textInputLayoutPassword = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
    textInputLayoutConfirmPassword = (TextInputLayout) findViewById(R.id.textInputLayoutConfimPassword);

    textInputEditTextName = (TextInputEditText)findViewById(R.id.textInputEditTextName);
    textInputEditTextEmail= (TextInputEditText)findViewById(R.id.textInputEditTextEmail);
    textInputEditTextPassword = (TextInputEditText)findViewById(R.id.textInputEditTextPasswprd);
    textInputEditTextConfirmPasword = (TextInputEditText)findViewById(R.id.textInputEditTextConfirmPassword);
appCompatButtonRegister=(AppCompatButton)findViewById(R.id.appCompatButtonRegister);
 appCompatTextViewLoginLink =(AppCompatTextView)findViewById(R.id.appCompatTextViewLoginLink);

}

private  void  initListeners(){

    appCompatButtonRegister.setOnClickListener(this);
    appCompatTextViewLoginLink.setOnClickListener(this);

}


private void initObjects(){

    inputValidation =new InputValidation(activity);
    databaseHelper =new DatabaseHelper(activity);
    user =new User();

}

@Override
    public  void  onClick(View view){
    switch (view.getId()){
        case R.id.appCompatButtonRegister:
            postDataSQLite();
            break;
        case R.id.appCompatTextViewLoginLink:
            finish();
            break;
    }
}
private void postDataSQLite(){

}
}

