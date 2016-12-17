package com.hanbit2007.memberapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit2007.memberapp.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etKeyword;
    Button btFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        etKeyword = (EditText) findViewById(R.id.etKeyword);
        btFind = (Button) findViewById(R.id.btFind);

        btFind.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btFind: break;
        }
    }
}
