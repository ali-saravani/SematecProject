package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class WorkWithExplicitIntent extends AppCompatActivity {


    Button btnDial;
    String strPhoneNumber;
    EditText EdtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_with_explicit_intent);

        btnDial=findViewById(R.id.BtnDial);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EdtPhoneNumber=findViewById(R.id.EdtPhoneNumber);
                strPhoneNumber=EdtPhoneNumber.getText().toString();
                Uri u=Uri.parse("tel:" + strPhoneNumber);
                Intent intent=new Intent(Intent.ACTION_DIAL,u);
                startActivity(intent);


            }
        });


    }



}
