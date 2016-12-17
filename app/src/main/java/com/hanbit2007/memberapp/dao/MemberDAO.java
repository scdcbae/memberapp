package com.hanbit2007.memberapp.dao;

import android.content.Context;
import android.util.Log;

import com.hanbit2007.memberapp.domain.Memberbean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2007 on 2016-12-17.
 */

public class MemberDAO {
    public MemberDAO(Context applicationContext) {

    }

    public Memberbean detail(String id){
        Memberbean member = new Memberbean();
        return member;
    }
    public List<Memberbean> find(String keyword){
        List<Memberbean> list = new ArrayList<Memberbean>();
        return list;
    }
    public void join(Memberbean param){}
    public List<Memberbean> list(){
        List<Memberbean> list = new ArrayList<Memberbean>();
        return list;
    }
    public boolean login(Memberbean param){
        Log.d("DAO에 넘어온 ID:", param.getId());
        boolean flag = true;
        Log.d("로그인 결과:", String.valueOf(flag));
        return flag;
    }
    public void update(Memberbean param){}
    public void delete(String id){}
    public int count(){
        int count = 0;
        return count;
    }
}
