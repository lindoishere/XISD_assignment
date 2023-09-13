package com.example.xisd_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ComponentType object = (ComponentType)findViewById(R.id.IdOfTheComponent);
        Button  viewMenu=(Button)findViewById(R.id.btnMenu);
    }
}