package com.example.puppetmaster123.devlop_browse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        BrowseFragment bf = new BrowseFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, bf).commit();
    }
}
