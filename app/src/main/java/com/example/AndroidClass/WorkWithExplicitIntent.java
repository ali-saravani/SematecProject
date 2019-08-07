package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class WorkWithExplicitIntent extends AppCompatActivity {


    String strPhoneNumber;
    EditText EdtPhoneNumber;
    TextView txtRegister,txtProfile,txtDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_with_explicit_intent);

        txtRegister=findViewById(R.id.txtRegister);
        txtProfile=findViewById(R.id.txtProfile);
        txtDial=findViewById(R.id.txtdial);




        txtDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkWithExplicitIntent.this,ExplicitIntentDial.class));
            }
        });

        txtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WorkWithExplicitIntent.this,ProfileActivity.class));
            }
        });

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });

    }



}
