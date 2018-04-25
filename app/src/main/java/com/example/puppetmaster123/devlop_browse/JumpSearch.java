package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JumpSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_search);
    }
    public void goToCode(View v)
    {
        Intent intent = new Intent(JumpSearch.this, JumpCode.class);
        startActivity(intent);
    }
    public void goToE1(View v)
    {
        Intent intent = new Intent(JumpSearch.this, JumpE1.class);
        startActivity(intent);
    }
}
