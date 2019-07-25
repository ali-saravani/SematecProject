package com.example.AndroidClass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AndroidLifeCycle","App created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AndroidLifeCycle","App started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AndroidLifeCycle","App resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AndroidLifeCycle","App paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AndroidLifeCycle","App stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AndroidLifeCycle","App destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AndroidLifeCycle","App restarted");
    }
}
