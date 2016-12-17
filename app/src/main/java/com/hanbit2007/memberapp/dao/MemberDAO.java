package com.hanbit2007.memberapp.dao;

import com.hanbit2007.memberapp.domain.Memberbean;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

/**
 * Created by hb2007 on 2016-12-17.
 */

public class MemberDAO {
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
        boolean flag = false;
        return flag;
    }
    public void update(Memberbean param){}
    public void delete(String id){}
    public int count(){
        int count = 0;
        return count;
    }
}
