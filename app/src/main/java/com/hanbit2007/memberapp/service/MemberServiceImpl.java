package com.hanbit2007.memberapp.service;

import com.hanbit2007.memberapp.domain.Memberbean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2007 on 2016-12-17.
 */

public class MemberServiceImpl implements  MemberService{
    @Override
    public Memberbean detail(String id) {
        Memberbean member = new Memberbean();
        return member;
    }

    @Override
    public List<Memberbean> find(String keyword) {
        List<Memberbean> list = new ArrayList<Memberbean>();
        return list;
    }

    @Override
    public void join(Memberbean param) {

    }

    @Override
    public List<Memberbean> list() {
        List<Memberbean> list = new ArrayList<Memberbean>();
        return list;
    }

    @Override
    public boolean login(Memberbean param) {
        boolean flag = false;
        return flag;
    }

    @Override
    public void update(Memberbean param) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int count() {
        int count = 0;
        return count;
    }
}
