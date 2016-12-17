package com.hanbit2007.memberapp.service;

import com.hanbit2007.memberapp.domain.Memberbean;

import java.util.List;

/**
 * Created by hb2007 on 2016-12-17.
 */

public interface MemberService {
    public Memberbean detail(String id);
    public List<Memberbean> find(String keyword);
    public void join(Memberbean param);
    public List<Memberbean> list();
    public boolean login(Memberbean param);
    public void update(Memberbean param);
    public void delete(String id);
    public int count();
}
