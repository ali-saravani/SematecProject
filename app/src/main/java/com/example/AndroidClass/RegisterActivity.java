package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    EditText EdtPFName,EdtPLNmae,EdtPEmail,EdtPmobile;
    Button btnPreview,btnBack;

    String strFname,strLname,strEmail,strPhone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EdtPFName=findViewById(R.id.EdtPFName);
        EdtPLNmae=findViewById(R.id.EdtPLName);
        EdtPEmail=findViewById(R.id.EdtPEmail);
        EdtPmobile=findViewById(R.id.EdtPMobile);
        btnPreview=findViewById(R.id.BtnPreview);
        btnBack=findViewById(R.id.BtnBack);

        EdtPFName.setText(getIntent().getStringExtra("FirstName"));
        EdtPLNmae.setText(getIntent().getStringExtra("LastName"));
        EdtPEmail.setText(getIntent().getStringExtra("Email"));
        EdtPmobile.setText(getIntent().getStringExtra("Mobile"));



        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        btnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                strFname=EdtPFName.getText().toString();
                strLname=EdtPLNmae.getText().toString();
                strEmail=EdtPEmail.getText().toString();
                strPhone=EdtPmobile.getText().toString();
                Intent intent=new Intent(getApplicationContext(),FinalRegisterActivity.class);
                intent.putExtra("FirstName",strFname);
                intent.putExtra("LastName",strLname);
                intent.putExtra("Email",strEmail);
                intent.putExtra("Mobile",strPhone);
                startActivity(intent);

            }    });
}
}
