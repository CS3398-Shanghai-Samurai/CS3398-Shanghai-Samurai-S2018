package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VectorDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_ds);
    }
    public void goToCode(View v)
    {
        Intent intent = new Intent(VectorDS.this, VectorCode.class);
        startActivity(intent);
    }
}
