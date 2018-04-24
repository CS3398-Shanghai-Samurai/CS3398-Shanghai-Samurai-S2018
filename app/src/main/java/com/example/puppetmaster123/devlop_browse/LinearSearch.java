package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search);
    }
    public void goToCode(View v)
    {
        Intent intent = new Intent(LinearSearch.this, LinearCode.class);
        startActivity(intent);
    }
    public void goToE1(View v)
    {
        Intent intent = new Intent(LinearSearch.this, LinearE1.class);
        startActivity(intent);
    }
}
