package com.example.puppetmaster123.devlop_browse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class AllAlgorithms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_algorithms);

        ArrayList<String> key = getIntent().getStringArrayListExtra("key");

        AllFragment af = new AllFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, af).commit();
    }
}
