package com.hanbit2007.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit2007.memberapp.R;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener{

    Button btSubmit, btCancel;
    EditText etId, etPass, etName, etTel, etAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);

        etId = (EditText) findViewById(R.id.etID);
        etPass = (EditText) findViewById(R.id.etPass);
        etName = (EditText) findViewById(R.id.etName);
        etTel = (EditText) findViewById(R.id.etTel);
        etAddr = (EditText) findViewById(R.id.etAddr);

        btSubmit.setOnClickListener(this);
        btCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sId, sPass, sName, sTel, sAddr;

        sId = String.valueOf(etId.getText());
        sPass = String.valueOf(etPass.getText());
        sName = String.valueOf(etName.getText());
        sTel = String.valueOf(etTel.getText());
        sAddr = String.valueOf(etAddr.getText());

        switch(v.getId()){
            case R.id.btSubmit: break;
            case R.id.btCancel:
                this.startActivity(new Intent(JoinActivity.this, ListActivity.class));
                break;
        }
    }
}
