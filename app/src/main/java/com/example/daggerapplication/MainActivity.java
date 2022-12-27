package com.example.daggerapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        injection();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "result = " + user.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void injection() {
        ((MyApplication)getApplication()).getMyComponent().inject(this);
    }
}