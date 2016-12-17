package com.hanbit2007.memberapp.service;

import android.content.Context;
import android.util.Log;

import com.hanbit2007.memberapp.dao.MemberDAO;
import com.hanbit2007.memberapp.domain.Memberbean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2007 on 2016-12-17.
 */

public class MemberServiceImpl implements  MemberService{
    MemberDAO dao;
    public MemberServiceImpl(Context applicationContext) {
        dao = new MemberDAO(applicationContext);
    }



    @Override
    public Memberbean detail(String id) {
        Memberbean member = new Memberbean();
        member = dao.detail(id);
        Log.d("서비스 넘어온 id:", member.getName());
        return member;
    }

    @Override
    public List<Memberbean> find(String keyword) {
        Log.d("서비스 find에 넘어온 이름:", keyword);
        List<Memberbean> list = new ArrayList<Memberbean>();
        list = dao.list();
        Log.d("find list 갯수:", String.valueOf(list.size()));
        return list;
    }

    @Override
    public void join(Memberbean param) {
        Log.d("서비스 join id:", param.getId());
        dao.join(param);
    }

    @Override
    public List<Memberbean> list() {
        List<Memberbean> list = new ArrayList<Memberbean>();
        list = dao.list();
        Log.d("list 갯수:", String.valueOf(list.size()));
        return list;
    }

    @Override
    public boolean login(Memberbean param) {
        boolean flag = false;
        flag = dao.login(param);
        Log.d("로그인 결과:", String.valueOf(flag));
        return flag;
    }

    @Override
    public void update(Memberbean param) {
        Log.d("서비스 넘어온 id:", param.getId());
        dao.update(param);
    }

    @Override
    public void delete(String id) {
        Log.d("서비스 넘어온 id:", id);
        dao.delete(id);
    }

    @Override
    public int count() {
        int count = 0;
        count = dao.count();
        Log.d("서비스 count:", String.valueOf(count));
        return count;
    }
}
