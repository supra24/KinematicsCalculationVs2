package com.example.damian.kinematicscalculationvs2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.damian.kinematicscalculationvs2.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

        Button bKinematicsReverse = (Button) findViewById(R.id.kinematicsReverse);
        kinematicsReverse(bKinematicsReverse);
//
        Button bKinematicsSimple = (Button) findViewById(R.id.kinematicsSimple);
        kinematicsSimple(bKinematicsSimple);

    }

    private void kinematicsReverse(Button button) {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), KinematicsReverse.class);
                startActivity(intent);
            }
        });
    }

    private void kinematicsSimple(Button button) {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), KinematicsSimple.class);
                startActivity(intent);
            }
        });
    }
}
