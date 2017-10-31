package com.example.natal.speakit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Blue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
        final Button button = (Button) findViewById(R.id.button3);



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);

                if (!(button.getText().equals("Next"))){
                    editText.setText("Azul");
                }
                else{
                    if (button.getText().equals("Next")){
                        if (editText.getText().equals("Red")) {
                            editText.setText("Rojo");
                        }
                    }
                }


                button.setText("Next");
            }
        });
    }
}

