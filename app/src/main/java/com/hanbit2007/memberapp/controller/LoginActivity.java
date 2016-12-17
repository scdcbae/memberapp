package com.hanbit2007.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit2007.memberapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etLoginId, etLoginPass;
    Button btLogin_login;
    String sLoginId, sLoginPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoginId = (EditText) findViewById(R.id.etLoginid);
        etLoginPass = (EditText) findViewById(R.id.etLoginpass);
        btLogin_login = (Button) findViewById(R.id.btLogin_login);

        btLogin_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        sLoginId = String.valueOf(etLoginId.getText());
        sLoginPass = String.valueOf(etLoginPass.getText());

        switch(v.getId()){
            case R.id.btLogin_login:
                this.startActivity(new Intent(LoginActivity.this, ListActivity.class));
                break;
        }

    }
}
