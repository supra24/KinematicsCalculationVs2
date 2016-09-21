package com.example.damian.kinematicscalculationvs2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.damian.kinematicscalculationvs2.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

        new Handler().postDelayed(new Thread(){
            @Override
            public void run(){
                Intent activityMenu = new Intent(StartActivity.this,MenuActivity.class);
                StartActivity.this.startActivity(activityMenu);
                StartActivity.this.finish();
                overridePendingTransition(R.anim.activity_start_fadein, R.anim.activity_start_fadeout);
            }
        }, 2000);
    }
}
