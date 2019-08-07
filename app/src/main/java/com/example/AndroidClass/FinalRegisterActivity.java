package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FinalRegisterActivity extends AppCompatActivity {



    TextView tvtFname,tvtLname,tvtEmail,tvtMobile;

    String strFname,strLname,strEmail,strMobile;

    Button btnSave,btnEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_register);

        tvtFname=findViewById(R.id.TvtFname);
        tvtLname=findViewById(R.id.TvtLname);
        tvtEmail=findViewById(R.id.TvtEmail);
        tvtMobile=findViewById(R.id.TvtMobile);
        btnSave=findViewById(R.id.btnSave);
        btnEdit=findViewById(R.id.btnEdit);



        strFname=getIntent().getStringExtra("FirstName");
        tvtFname.setText(strFname);

        strLname=getIntent().getStringExtra("LastName");
        tvtLname.setText(strLname);

        strEmail=getIntent().getStringExtra("Email");
        tvtEmail.setText(strEmail);

        strMobile=getIntent().getStringExtra("Mobile");
        tvtMobile.setText(strMobile);




        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PreferenceManager.getDefaultSharedPreferences(FinalRegisterActivity.this).edit().putString("FirstName",strFname).apply();
                PreferenceManager.getDefaultSharedPreferences(FinalRegisterActivity.this).edit().putString("LastName",strLname).apply();
                PreferenceManager.getDefaultSharedPreferences(FinalRegisterActivity.this).edit().putString("Email",strEmail).apply();
                PreferenceManager.getDefaultSharedPreferences(FinalRegisterActivity.this).edit().putString("Mobile",strMobile).apply();
                Toast.makeText(FinalRegisterActivity.this,"اطلاعات با موفقیت ذخیره شد",Toast.LENGTH_LONG).show();
            }
        });



    btnEdit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intentEdit=new Intent(getApplicationContext(),RegisterActivity.class);
            intentEdit.putExtra("FirstName",strFname);
            intentEdit.putExtra("LastName",strLname);
            intentEdit.putExtra("Email",strEmail);
            intentEdit.putExtra("Mobile",strMobile);
            startActivity(intentEdit);
        }
    });



    }


}
