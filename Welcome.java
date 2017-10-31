package com.example.natal.speakit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;



import static android.R.id.button2;
import static com.example.natal.speakit.R.layout.activity_choose;
import static com.example.natal.speakit.R.layout.activity_welcome;

public class Welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_welcome);
    }
public void onLesson(View view) {
    Intent intent = new Intent(this, Choose.class);
    startActivity(intent);


}


}


