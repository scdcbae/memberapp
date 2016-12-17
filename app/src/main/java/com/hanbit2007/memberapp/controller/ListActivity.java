package com.hanbit2007.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit2007.memberapp.R;
import com.hanbit2007.memberapp.domain.Memberbean;
import com.hanbit2007.memberapp.service.MemberService;
import com.hanbit2007.memberapp.service.MemberServiceImpl;

import java.util.List;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{

    Button btDetail, btFind;

    MemberService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btDetail = (Button) findViewById(R.id.btDetail);
        btFind = (Button) findViewById(R.id.btFind);

        btDetail.setOnClickListener(this);
        btFind.setOnClickListener(this);

        service = new MemberServiceImpl(this.getApplicationContext());
        List<Memberbean> list = service.list();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btDetail:
                this.startActivity(new Intent(ListActivity.this, DetailActivity.class));
                break;
            case R.id.btFind:
                this.startActivity(new Intent(ListActivity.this, FindActivity.class));
                break;
        }
    }
}
