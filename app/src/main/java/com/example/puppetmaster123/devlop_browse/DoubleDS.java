package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DoubleDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_ds);
    }
    public void goToCode(View v)
    {
        Intent intent = new Intent(DoubleDS.this, DoubleCode.class);
        startActivity(intent);
    }
}
