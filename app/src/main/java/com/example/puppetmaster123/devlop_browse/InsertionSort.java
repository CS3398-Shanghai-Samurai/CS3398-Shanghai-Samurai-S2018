package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InsertionSort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort);
    }
    public void goToCode(View view){
        Intent intent = new Intent(InsertionSort.this, InsertionCode.class);
        startActivity(intent);
    }
    public void goToE1(View view){
        Intent intent = new Intent(InsertionSort.this, InsertionE1.class);
        startActivity(intent);
    }
    public void goToE2(View view){
        Intent intent = new Intent(InsertionSort.this, InsertionE2.class);
        startActivity(intent);
    }
}
