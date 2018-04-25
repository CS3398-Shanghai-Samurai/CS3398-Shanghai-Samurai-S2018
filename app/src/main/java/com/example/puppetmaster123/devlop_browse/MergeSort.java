package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MergeSort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge_sort);
    }
    public void goToCode(View view){
        Intent intent = new Intent(MergeSort.this, MergeCode.class);
        startActivity(intent);
    }
    public void goToE1(View view){
        Intent intent = new Intent(MergeSort.this, MergeE1.class);
        startActivity(intent);
    }
}
