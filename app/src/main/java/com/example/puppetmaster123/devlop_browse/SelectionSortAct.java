package com.example.puppetmaster123.devlop_browse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectionSortAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sort);
    }
    public void goToCode(View view){
        Intent intent = new Intent(SelectionSortAct.this, SelectionCode.class);
        startActivity(intent);
    }
}
