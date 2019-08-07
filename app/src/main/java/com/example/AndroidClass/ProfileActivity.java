package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tvtFname,tvtLname,tvtEmail,tvtMobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvtFname=findViewById(R.id.TvtFnameProfile);
        tvtLname=findViewById(R.id.TvtLnameProfle);
        tvtEmail=findViewById(R.id.TvtEmailProfile);
        tvtMobile=findViewById(R.id.TvtMobileProfile);

        tvtFname.setText(PreferenceManager.getDefaultSharedPreferences(ProfileActivity.this).getString("FirstName","میهمان"));
        tvtLname.setText(PreferenceManager.getDefaultSharedPreferences(ProfileActivity.this).getString("LastName","میهمان"));
        tvtEmail.setText(PreferenceManager.getDefaultSharedPreferences(ProfileActivity.this).getString("Email","میهمان"));
        tvtMobile.setText(PreferenceManager.getDefaultSharedPreferences(ProfileActivity.this).getString("Mobile","میهمان"));






    }
}
