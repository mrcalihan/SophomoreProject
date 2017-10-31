package com.example.natal.speakit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity  {

    final String TAG = "LoginActivity";
    EditText etEmail, etPass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.txtEmail);
        etPass = (EditText) findViewById(R.id.txtPass);
        login = (Button) findViewById(R.id.btn_login);

    }
public void onLogin(View view) {
    String email = etEmail.getText().toString();
    String password = etPass.getText().toString();
    String type = "login";

    BackgroundWorker backgroundWorker = new BackgroundWorker(this);
    backgroundWorker.execute(type ,"",email,"", password);
    startActivity(new Intent(this, Welcome.class));
    setContentView(R.layout.activity_welcome);
}
public void openReg(View view) {
    startActivity(new Intent(this, Register.class));
}




}