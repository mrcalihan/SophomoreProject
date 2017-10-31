package com.example.natal.speakit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;
EditText name, email, age, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.et_name);
        email = (EditText) findViewById(R.id.et_email);
        age = (EditText) findViewById(R.id.et_age);
        password = (EditText) findViewById(R.id.et_pass);



        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mPreferences.edit();

        checkSharedPreferences();


    }
    public void onReg(View view) {
        String str_name = name.getText().toString();
        String st_email = email.getText().toString();
        String str_age = age.getText().toString();
        String str_password = password.getText().toString();
        String type = "register";

        

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, st_email, str_age, str_password);

    }

    public void onLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
